package me.ulleo.myudaworks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

import me.ulleo.myudaworks.adapters.BtnsAdapter;

public class MainActivity2 extends AppCompatActivity {

    private ListView mLvBtns;
    private List<String> mStrList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initData();
        initBtns();
        //setBtnOnclickListener();
    }

    private void initData() {
        String[] mStrArray = getResources().getStringArray(R.array.btns_array);
        mStrList = Arrays.asList(mStrArray);
    }

    private void initBtns() {
        mLvBtns = (ListView) findViewById(R.id.lv_btns);
        BtnsAdapter mBtnsAdapter = new BtnsAdapter(MainActivity2.this, R.layout.btn_item, mStrList, new BtnsAdapter.MyClickListener() {
            @Override
            public void myOnclick(int position, View view) {
                //Log.i("onclick", "" + position);
                String str = mStrList.get(position);
                Toast.makeText(MainActivity2.this, "启动应用:" + str, Toast.LENGTH_SHORT).show();
            }
        });
        mLvBtns.setAdapter(mBtnsAdapter);
    }

    /*private void setBtnOnclickListener() {
        mLvBtns.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("onclick", "" + position);
                String str = mStrList.get(position);
                Toast.makeText(MainActivity2.this, "启动应用:" + str, Toast.LENGTH_SHORT).show();
            }
        });
    }*/


}
