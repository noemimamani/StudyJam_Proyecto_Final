package com.miramicodigo.prueba_proyecto;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by EQUIPO on 25/05/2017.
 */

public class ListViewAdapter extends BaseAdapter {
    private ArrayList <Item> arrayListItem;
    private Context context;
    private LayoutInflater layoutInflater;


    public ListViewAdapter(Context context, ArrayList<Item> arrayListItem) {
        this.context = context;
        this.arrayListItem = arrayListItem;

    }

    @Override
    public int getCount() {
        return arrayListItem.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayListItem.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View vistaItem = layoutInflater.inflate(R.layout.layout_item,viewGroup,false);
        TextView tvNro = (TextView) vistaItem.findViewById(R.id.tvNro);
        TextView tvFraternidad = (TextView) vistaItem.findViewById(R.id.tvFraternidad);
        TextView tvHora = (TextView) vistaItem.findViewById(R.id.tvHora);

        tvNro.setText(arrayListItem.get(i).getNro());
        tvFraternidad.setText(arrayListItem.get(i).getFraternidad());
        tvHora.setText(arrayListItem.get(i).getHora());

        return vistaItem;
    }
}
