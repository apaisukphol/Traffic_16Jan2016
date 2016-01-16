package devlbiz.aps.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    }   //Main Method การทำงานหลัก

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.livTraffic);
        aboutMeButton = (Button) findViewById(R.id.button);

    }

}   //Main Class คลาสหลัก
