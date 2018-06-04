package com.example.anudeep.actionbar;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by anudeep on 25/06/17.
 */

public class DataAdapter extends ArrayAdapter<Datamodel>{

    ArrayList<Datamodel> arrayList;
    Context mcontext;

    static class Viewholder{

        TextView txtname;
        ImageView img_view;

    }





    public DataAdapter(ArrayList<Datamodel> arraylist, Context context) {
        super(context,R.layout.adapter_view,arraylist);

        this.arrayList = arraylist;
        mcontext = context;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Datamodel data = getItem(position);


        View v ;
        Viewholder holder = new Viewholder();


        if(convertView==null)
        {
            LayoutInflater inflate = LayoutInflater.from(getContext());
            convertView = inflate.inflate(R.layout.adapter_view, parent, false);
            holder.txtname = (TextView) convertView.findViewById(R.id.txtname);
            holder.img_view = (ImageView) convertView.findViewById(R.id.imageview);
            convertView.setTag(holder);

        }
        else{
            holder = (Viewholder) convertView.getTag();

        }

        holder.txtname.setText(data.getName());


        return convertView;
    }
}
