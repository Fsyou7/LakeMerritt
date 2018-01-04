package com.labartbeats.lakemerritt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ItemDetailActivity extends AppCompatActivity {

    private static final String TAG = "ItemDetailActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        int description = getIntent().getIntExtra("description", 0);
        Log.d(TAG, "onCreate: " + getString(description));
        TextView itemDescription = (TextView) findViewById(R.id.text_description);
        itemDescription.setText(getString(description));
    }
}
