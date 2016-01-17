package devlbiz.aps.mytraffic;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView textViewHeader;
    private ImageView imageViewHeader;
    private TextView listTextDetail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Detail Widget
        bindDetailWidget();

        //Show View
        showView();

      }

    private void showView() {
        //Show Title
        String strTitle = getIntent().getStringExtra("Title");
        textViewHeader.setText(strTitle);

        //Show Image
        int intIcon = getIntent().getIntExtra("Image",0);
        imageViewHeader.setImageResource(intIcon);

        //Show Detail

    } //Show Detail

    private void bindDetailWidget() {
        textViewHeader = (TextView) findViewById(R.id.textView2);
        imageViewHeader = (ImageView) findViewById(R.id.imageView);
        listTextDetail = (TextView) findViewById(R.id.textView3);

    } //Main Class

}
