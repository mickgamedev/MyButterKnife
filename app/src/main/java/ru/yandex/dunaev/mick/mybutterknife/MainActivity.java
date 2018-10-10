package ru.yandex.dunaev.mick.mybutterknife;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.simple_text) TextView simpleText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.simple_button)
    public void OnClick(View view){
        simpleText.setText(R.string.text_button_clicked);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                simpleText.setText("");
            }
        },5000);
    }
}
