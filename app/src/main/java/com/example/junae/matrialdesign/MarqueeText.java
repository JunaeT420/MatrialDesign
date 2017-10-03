package com.example.junae.matrialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.sunfusheng.marqueeview.MarqueeView;

import java.util.ArrayList;
import java.util.List;

public class MarqueeText extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marquee_text);
        MarqueeView marqueeView= (MarqueeView) findViewById(R.id.marquee);
        List<String> listtext=new ArrayList<>();
        listtext.add("1.  Marquee Text View");
        listtext.add("2.  List Text View");
        listtext.add("3.  Array Text View");
        listtext.add("4.  Integer Text View");
        listtext.add("5.  Fload Text View");
        marqueeView.startWithList(listtext);
        marqueeView.setOnItemClickListener(new MarqueeView.OnItemClickListener() {
            @Override
            public void onItemClick(int position, TextView textView) {
                Toast.makeText(getApplicationContext(),""+textView.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }

}
