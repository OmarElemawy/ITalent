package com.example.italent;

import android.app.ProgressDialog;
import android.content.Intent;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.italent.home.HomeActivity;




public class SingUb extends AppCompatActivity {
    private ProgressDialog pdialog;
    EditText user_signUp,email_signUp,pass_signUp,co_pass_signUp;
    RadioGroup group_radio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_ub);
        co_pass_signUp=findViewById(R.id.co_pass_signUp);
        email_signUp=findViewById(R.id.email_signUp);
        pass_signUp=findViewById(R.id.pass_signUp);
        user_signUp=findViewById(R.id.user_signUp);
        group_radio=findViewById(R.id.group_radio);
        pdialog = new ProgressDialog(this);
    }

    public void signUp(View view) {
        int selectedId = group_radio.getCheckedRadioButtonId();
// find the radiobutton by returned id
        RadioButton  selectedRadioButton = (RadioButton)findViewById(selectedId);

        if (!Patterns.EMAIL_ADDRESS.matcher(email_signUp.getText().toString()).matches()) {
            Toast.makeText(this, "please chick the email form", Toast.LENGTH_SHORT).show();
        } else if (pass_signUp.getText().toString().length() < 8) {
            Toast.makeText(this, "password must be at least 8 characters", Toast.LENGTH_SHORT).show();
        } else if (user_signUp.getText().length() == 0) {
            Toast.makeText(this, "phone must be at least 8 characters", Toast.LENGTH_SHORT).show();
        } else if (!pass_signUp.getText().toString().equals(co_pass_signUp.getText().toString())) {
            Toast.makeText(this, "chick confirm password", Toast.LENGTH_SHORT).show();
        }
        else if (selectedRadioButton.getText().toString().matches("")) {
            Toast.makeText(this, "Please select gender", Toast.LENGTH_SHORT).show();
        }
        else {
            pdialog.setTitle("Registering User");
            pdialog.setCanceledOnTouchOutside(false);
            pdialog.setMessage("Please Wait while Creating the Account");
            pdialog.show();


            Intent intent = new Intent(SingUb.this, HomeActivity.class);
            startActivity(intent);
            finish();
            PrefConfig prefConfig = new PrefConfig(SingUb.this);
            prefConfig.writeLoginStatus(true);
            prefConfig.writeName("");

        }

    }




}
