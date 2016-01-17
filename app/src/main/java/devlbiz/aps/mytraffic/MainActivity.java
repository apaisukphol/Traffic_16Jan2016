package devlbiz.aps.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Area for define variant
    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //Button Controller
        buttonController();

        //ListView Controller
        listViewController();

    }   //Main Method การทำงานหลัก

    private void listViewController() {

        //1# Declare Value Array
        final int[] iconInts = {R.drawable.traffic_01,
                R.drawable.traffic_02,
                R.drawable.traffic_03,
                R.drawable.traffic_04,
                R.drawable.traffic_05,
                R.drawable.traffic_06,
                R.drawable.traffic_07,
                R.drawable.traffic_08,
                R.drawable.traffic_09,
                R.drawable.traffic_10,
                R.drawable.traffic_11,
                R.drawable.traffic_12,
                R.drawable.traffic_13,
                R.drawable.traffic_14,
                R.drawable.traffic_15,
                R.drawable.traffic_16,
                R.drawable.traffic_17,
                R.drawable.traffic_18,
                R.drawable.traffic_19,
                R.drawable.traffic_20};

        //2# Declare String Array
        final String[] titleStrings = new String[20];
        titleStrings[0] = "หัวข้อหลักที่ 1";
        titleStrings[1] = "หัวข้อหลักที่ 2";
        titleStrings[2] = "หัวข้อหลักที่ 3";
        titleStrings[3] = "หัวข้อหลักที่ 4";
        titleStrings[4] = "หัวข้อหลักที่ 5";
        titleStrings[5] = "หัวข้อหลักที่ 6";
        titleStrings[6] = "หัวข้อหลักที่ 7";
        titleStrings[7] = "หัวข้อหลักที่ 8";
        titleStrings[8] = "หัวข้อหลักที่ 9";
        titleStrings[9] = "หัวข้อหลักที่ 10";
        titleStrings[10] = "หัวข้อหลักที่ 11";
        titleStrings[11] = "หัวข้อหลักที่ 12";
        titleStrings[12] = "หัวข้อหลักที่ 13";
        titleStrings[13] = "หัวข้อหลักที่ 14";
        titleStrings[14] = "หัวข้อหลักที่ 15";
        titleStrings[15] = "หัวข้อหลักที่ 16";
        titleStrings[16] = "หัวข้อหลักที่ 17";
        titleStrings[17] = "หัวข้อหลักที่ 18";
        titleStrings[18] = "หัวข้อหลักที่ 19";
        titleStrings[19] = "หัวข้อหลักที่ 20";

        //#3 Declare XML Array
        String[] descriptionString = getResources().getStringArray(R.array.description);

        //#4 Create ListView
        MyAdapter objMyAdapter = new MyAdapter(getBaseContext(), iconInts, titleStrings, descriptionString);
        trafficListView.setAdapter(objMyAdapter);

        //Active When Click on ListView
        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent objIntent = new Intent(MainActivity.this,DetailActivity.class);

                objIntent.putExtra("Title", titleStrings[position]);

                objIntent.putExtra("Image", iconInts[position]);

                objIntent.putExtra("Index", position);

                startActivity(objIntent);

            } //Event
        });

    } //ListView Controller

    private void buttonController() {

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Sound Effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(),
                        R.raw.effect_btn_shut);
                buttonMediaPlayer.start();

                //Show WebView
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/unU8SdLtd3E"));
                startActivity(objIntent);

            } //Event on Click
        });

    }   //buttonController

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.livTraffic);
        aboutMeButton = (Button) findViewById(R.id.button);

    }

}   //Main Class คลาสหลัก
