package com.dicoding.band;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_PHO = "extra_pho";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DETAIL = "extra_detail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView bandName = findViewById(R.id.band_name);
        TextView bandDetail = findViewById(R.id.band_detail);
        ImageView bandImage = findViewById(R.id.band_image);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        int image = getIntent().getIntExtra(EXTRA_PHO, 0);
        String Bname = name;
        String Bdetail = detail;
        Integer BImage = image;
        bandName.setText(Bname);
        bandDetail.setText(Bdetail);
        bandImage.setImageResource(BImage);

    }
}
