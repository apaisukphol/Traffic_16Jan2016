package devlbiz.aps.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Sound Effect
        MediaPlayer introMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.intro_start_horse);
        introMediaPlayer.start();

        //Thread
        Handler objHandler = new Handler();
        objHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(splashScreen.this,MainActivity.class));
                finish();

            }
        },8000); //MiniSecond

    } //Main Method

}  //Main Class
