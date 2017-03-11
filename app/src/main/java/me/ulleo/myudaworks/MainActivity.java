package me.ulleo.myudaworks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnMovie, mBtnStoke, mBtnReader, mBtnNews, mBtnFinwork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBtns();

       /* mBtnMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "启动应用：" + getResources().getString(R.string.btn_movie), Toast.LENGTH_SHORT).show();
            }
        });*/
        setBtnOnclickListener();
    }

   private void initBtns() {
        mBtnMovie = (Button) findViewById(R.id.btn_movie);
        mBtnStoke = (Button) findViewById(R.id.btn_stock);
        mBtnReader = (Button) findViewById(R.id.btn_reader);
        mBtnNews = (Button) findViewById(R.id.btn_news);
        mBtnFinwork = (Button) findViewById(R.id.btn_finwork);
    }

    private void setBtnOnclickListener(){
        mBtnMovie.setOnClickListener(this);
        mBtnStoke.setOnClickListener(this);
        mBtnReader.setOnClickListener(this);
        mBtnNews.setOnClickListener(this);
        mBtnFinwork.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //Log.i("onclick", "" + v.getId());
        switch (v.getId()) {
            case R.id.btn_movie:
                Toast.makeText(MainActivity.this, "启动应用：" + getResources().getString(R.string.btn_movie), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_stock:
                Toast.makeText(MainActivity.this, "启动应用：" + getResources().getString(R.string.btn_stock), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_reader:
                Toast.makeText(MainActivity.this, "启动应用：" + getResources().getString(R.string.btn_reader), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_news:
                Toast.makeText(MainActivity.this, "启动应用：" + getResources().getString(R.string.btn_news), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_finwork:
                Toast.makeText(MainActivity.this, "启动应用：" + getResources().getString(R.string.btn_finwork), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
