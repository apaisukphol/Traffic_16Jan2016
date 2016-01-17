package devlbiz.aps.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by APAI.S on 17/01/2559.
 */
public class MyAdapter extends BaseAdapter {

    //Explicit
    private Context objContext;
    private int[] iconInts;
    private String[] titleString, descriptionStrings;


    public MyAdapter(Context objContext, int[] iconInts, String[] titleString, String[] descriptionStrings) {
        this.objContext = objContext;
        this.iconInts = iconInts;
        this.titleString = titleString;
        this.descriptionStrings = descriptionStrings;
    } // Constructor


    @Override
    public int getCount() {
        return iconInts.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View objView1 = objLayoutInflater.inflate(R.layout.traffic_listview, parent, false);

        //Carry Icon
        ImageView iconImageView = (ImageView) objView1.findViewById(R.id.imvicon);
        iconImageView.setImageResource(iconInts[position]);

        //Carry Title
        TextView titleTextView = (TextView) objView1.findViewById(R.id.txtListTitle);
        titleTextView.setText(titleString[position]);

        //Carry Description
        TextView descriptionTextView = (TextView) objView1.findViewById(R.id.txtListDescrip);
        descriptionTextView.setText(descriptionStrings[position]);


        return objView1;
    }
} //Main Class
