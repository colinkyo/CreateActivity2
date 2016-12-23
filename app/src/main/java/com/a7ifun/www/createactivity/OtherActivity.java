package com.a7ifun.www.createactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class OtherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        TextView tv=(TextView) findViewById(R.id.tv);

        //获取当前intent 对象
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age",0);
        char sex = intent.getCharExtra("sex",' ');
        tv.setText(age+"");

        Bundle bundle = intent.getExtras();

        String name1 = bundle.getString("name");
        tv.setText(name1+"");
    }
}
