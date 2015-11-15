package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gaby.prueba.R;

import java.util.List;

import models.Lista;

/**
 * Created by ludk on 31/10/15.
 */
public class ListaAdapter extends ArrayAdapter<Lista> {

    private int resource;

    public ListaAdapter(Context context, int resource, List<Lista> objects) {
        super(context, resource, objects);
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView == null)

            convertView = inflater.inflate(this.resource, parent, false);

        Lista item = getItem(position);
        ((TextView)convertView.findViewById(R.id.txtId)).setText(""+item.id);
        ((TextView)convertView.findViewById(R.id.txtUsuario)).setText(item.nombre);
        ((TextView)convertView.findViewById(R.id.txtTitle)).setText(item.operador);
        ((TextView)convertView.findViewById(R.id.txtFavorito)).setText(item.favorito);
        TextView time=((TextView) convertView.findViewById(R.id.txtFavorito));
        time.setText(item.favorito);

        String num = "true";
        if(item.favorito.equals(num)){
            ImageView img=((ImageView) convertView.findViewById(R.id.imageView));
            img.setImageResource(R.drawable.favorite);
        }
        else {

            ImageView img=((ImageView) convertView.findViewById(R.id.imageView));
            img.setImageResource(R.drawable.onfavorite);

        }
        return convertView;

    }
}
