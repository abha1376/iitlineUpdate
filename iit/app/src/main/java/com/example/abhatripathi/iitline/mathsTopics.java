package com.example.abhatripathi.iitline;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mathsTopics extends AppCompatActivity {
Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_topics);


        btn1=findViewById(R.id.setTopic);
        btn2=findViewById(R.id.complexTopic);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mathsTopics.this,mathsMainsRecycler.class);
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mathsTopics.this,mathsMainsRecycler.class);
                startActivity(i);
            }
        });
    }
}
