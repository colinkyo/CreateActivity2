package com.a7ifun.www.createactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    private Button btn;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        Log.i("7yan", "--------------onCreate----------------------");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("7yan", "--------------onStart----------------------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("7yan", "--------------onStop----------------------");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("7yan", "--------------onPause----------------------");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("7yan", "--------------onRestart----------------------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("7yan", "--------------onResume----------------------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("7yan", "--------------onDestroy----------------------");
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.btn:
                intent = new Intent(MainActivity.this, OtherActivity.class);
                break;
            case R.id.btn1:
                intent = new Intent(MainActivity.this, OtherActivity.class);
                intent.putExtra("name","7Yan");
                intent.putExtra("age",32);
                intent.putExtra("sex",'男');
                intent.putExtra("flag",true);
                break;
            case R.id.btn2:
                intent = new Intent(MainActivity.this, OtherActivity.class);
                Bundle bundle =new Bundle();
                bundle.putString("name","严荣辉");
                bundle.putInt("age",32);
                bundle.putDouble("jifen",80.0);
                intent.putExtras(bundle);
                break;
        }

        startActivity(intent);
    }
}
