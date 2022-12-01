package com.example.phonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class NewNumActivity extends AppCompatActivity {
    EditText name, num, group;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_number);
        btn = (Button) findViewById(R.id.plusBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), NumSeeActivity.class);
                name = (EditText)findViewById(R.id.name);
                i.putExtra("contact_name", name.getText().toString());
                num = (EditText) findViewById(R.id.num);
                i.putExtra("contact_num", num.getText().toString());
                group = (EditText) findViewById(R.id.group);
                i.putExtra("contact_group", group.getText().toString());
                startActivity(i);
            }
        });
    }
}
