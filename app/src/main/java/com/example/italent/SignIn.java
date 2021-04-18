package com.example.italent;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.italent.home.HomeActivity;

import org.json.JSONObject;


public class SignIn extends AppCompatActivity {
      EditText user_signIn,sing_in_pass;

    private ProgressDialog pdialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        user_signIn=findViewById(R.id.user_signIn);
        sing_in_pass=findViewById(R.id.sing_in_pass);
        pdialog = new ProgressDialog(this);

    }

    public void singIn(View view) {
        if (user_signIn.getText().toString() =="") {
            Toast.makeText(this, "please chick the use name ", Toast.LENGTH_SHORT).show();
        }
        else if (sing_in_pass.getText().toString() =="")
        {
            Toast.makeText(this, "please chick the password", Toast.LENGTH_SHORT).show();
        }
        else
        {
            pdialog.setTitle("Registering User");
            pdialog.setCanceledOnTouchOutside(false);
            pdialog.setMessage("Please Wait while Creating the Account");
            pdialog.show();

            Intent intent =new Intent(SignIn.this, HomeActivity.class);
            startActivity(intent);
            finish();
            PrefConfig prefConfig=new PrefConfig(SignIn.this);
            prefConfig.writeLoginStatus(true);
            prefConfig.writeName("");
        }


    }

}
