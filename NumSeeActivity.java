package com.example.phonebook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NumSeeActivity extends AppCompatActivity {
    private TextView text1, text2, text3;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.num_see);

        Intent intent = getIntent();

        text1 = (TextView) findViewById(R.id.text1);
        String name = intent.getStringExtra("contact_name");
        if(name != null)
            text1.setText(name);

        text2 = (TextView) findViewById(R.id.text2);
        String num = intent.getStringExtra("contact_num");
        if(num != null)
            text2.setText(num);

        text3 = (TextView) findViewById(R.id.text3);
        String group = intent.getStringExtra("contact_group");
        if(group != null)
            text3.setText(group);

        btn = (Button) findViewById(R.id.rtnBtn);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent1);
            }
        });

    }
}
