package me.ulleo.myudaworks.adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.List;

import me.ulleo.myudaworks.R;

/**
 * Created by ulleo on 2017/3/11.
 */

public class BtnsAdapter extends ArrayAdapter<String> {

    private int resourceId;
    private Context context;
    private MyClickListener myClickListener;


    public BtnsAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<String> objects,MyClickListener myClickListener) {
        super(context, resource, objects);
        this.resourceId = resource;
        this.context = context;
        this.myClickListener = myClickListener;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        final String str = getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
            viewHolder = new ViewHolder();
            viewHolder.button = (Button) view.findViewById(R.id.btn_item);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.button.setText(str);

        viewHolder.button.setTag(position);

        viewHolder.button.setOnClickListener(myClickListener);
        /*viewHolder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "启动应用:" + str, Toast.LENGTH_SHORT).show();
            }
        });*/

        return view;
    }

    private class ViewHolder {
        Button button;
    }

    public static abstract class MyClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            myOnclick((Integer) v.getTag(), v);
        }

        public abstract void myOnclick(int position, View view);
    }
}
