package com.example.android.happybirthday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 纳米学位应用
     */
    private TextView mTextView;
    /**
     * 热门电影
     */
    private Button mButton;
    /**
     * 股票雄鹰
     */
    private Button mButton2;
    /**
     * XYZ阅读器
     */
    private Button mButton3;
    /**
     * 最新闻
     */
    private Button mButton4;
    /**
     * 毕业设计
     */
    private Button mButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    private void initView() {
        mTextView = (TextView) findViewById(R.id.textView);
        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(this);
        mButton2 = (Button) findViewById(R.id.button2);
        mButton2.setOnClickListener(this);
        mButton3 = (Button) findViewById(R.id.button3);
        mButton3.setOnClickListener(this);
        mButton4 = (Button) findViewById(R.id.button4);
        mButton4.setOnClickListener(this);
        mButton5 = (Button) findViewById(R.id.button5);
        mButton5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Toast.makeText(this,"启动应用：热门电影",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this,"启动应用：股票雄鹰",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(this,"启动应用：XYZ阅读器",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(this,"启动应用：最新闻",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(this,"启动应用：毕业作品集",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
