package com.jihad.konversimatauang;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MasukActivity extends AppCompatActivity {

    @BindView(R.id.logo)
    ImageView logo;
    @BindView(R.id.btnStart)
    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masuk);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnStart)
    public void onViewClicked() {
        Intent intent = new Intent(MasukActivity.this, MainActivity.class);
        startActivity(intent);


    }
}
