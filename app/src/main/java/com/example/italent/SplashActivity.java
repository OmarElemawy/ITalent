package com.example.italent;


import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.italent.home.HomeActivity;

public class SplashActivity extends AppCompatActivity {
    private FrameLayout linearLayout;
    private ImageView image;

    @Override
            protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
          //Remove title bar
          this.requestWindowFeature(Window.FEATURE_NO_TITLE);
          setContentView(R.layout.activity_splash);

        getSupportFragmentManager().beginTransaction().replace(R.id.splash_layout,new SplashFragment()).commit();


                linearLayout=findViewById(R.id.splash_layout);
                Animation animation= AnimationUtils.loadAnimation(this,R.anim.bounce);
                animation.setDuration(1500);
                linearLayout.startAnimation(animation);

                new CountDownTimer(3000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {}
                    @Override
                    public void onFinish() {
                        PrefConfig prefConfig=new PrefConfig(SplashActivity.this);

                        if (!prefConfig.readLoginStatus()) {
                            getSupportFragmentManager().beginTransaction().replace(R.id.splash_layout,new StartFragment()).commit();

                        } else {
                            Intent intent=new Intent(SplashActivity.this, HomeActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    }
                }.start();
      }
 }
