package com.myanimate;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout activityMain;
    private ImageView ivMove;
    private TextView tvMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        tvMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueAnimator animator=(ValueAnimator) AnimatorInflater.loadAnimator(MainActivity.this,R.anim.animation);
                animator.start();
            }
        });

    }

    private void initView() {
        activityMain = (RelativeLayout) findViewById(R.id.activity_main);
        ivMove = (ImageView) findViewById(R.id.iv_move);
        tvMove = (TextView) findViewById(R.id.tv_move);
    }
}
