package com.example.david.nfclabskeleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);
    }


    /**
     *
     * This method is called when the Button is clicked.
     * You should get the current content of the EditText and write it onto the NFC Tag.
     *
     * **/
    public void onClickWriteToTagButton(View view) {

    }
}
