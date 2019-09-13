package com.example.chenenlin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    Button validate;
    EditText password1;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        password1 = (EditText) findViewById(R.id.password1);
        validate = (Button) findViewById(R.id.validate);
        tv = (TextView) findViewById(R.id.textView);

        validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = password1.getText().toString();

                if(correct_password(password) == 5) {
                    tv.setText("Password is strong enough");
                }
                else{
                    tv.setText("Password is not strong enough");
                }

            }
            });
}

        //validate stage 1
    public static int correct_password(String password) {
        int x = 0 ;

        if(password == null || password.isEmpty()) {
            return 0;
        }
        // its not ''password'
        if(!password.equalsIgnoreCase("password")) {
            x++;
        }
        // length >= 8
        if(password.length() >= 8 ) {
            x++;
        }
        return x;
        //check have special characters
        if(password.indexOf('!') != -1 || password.indexOf('#') != -1
                || password.indexOf('@') != -1 || password.indexOf('%') != -1
                || password.indexOf('$') != -1 || password.indexOf('*') != -1
                || password.indexOf('^') != -1 || password.indexOf('&') != -1 ) {
            x++;
        }

        //check if string is at-least one digit
        if(Pattern.compile("[0-9]").matcher(password).find()){
            x++;
        }

        //check if string has both upper and lower case
        if(Pattern.compile("[a-z]").matcher(password).find() && Pattern.compile("[A-Z]").matcher(password).find()) {
            x++;
        }
        return x;
    }
}
