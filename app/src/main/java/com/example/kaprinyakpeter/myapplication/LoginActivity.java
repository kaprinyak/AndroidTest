package com.example.kaprinyakpeter.myapplication;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

public class LoginActivity extends Activity {

    @Override
    protected void onStart() {
        super.onStart();
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "asd", Toast.LENGTH_SHORT);
        toast.show();
    }
}
