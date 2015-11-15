package com.example.gaby.prueba;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import adapter.ListaAdapter;
import database.DatabaseSqlLiteHelper;
import models.Lista;

public class lista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        setListContent();
    }

    private void setListContent() {

        ListaAdapter adapter = new ListaAdapter(this, R.layout.content_pozos, GetPosts());
        ListView list = (ListView)findViewById(R.id.listView);
        list.setAdapter(adapter);

    }

    private List<Lista> GetPosts() {

        List<Lista> posts = new ArrayList<>();

        DatabaseSqlLiteHelper helper = new DatabaseSqlLiteHelper(this, "android", null, 1);

        SQLiteDatabase db = helper.getWritableDatabase();

        Cursor c = db.rawQuery("SELECT * from posts;", null);

        while(c.moveToNext())
        {
            Lista post = new Lista();
            post.id = c.getInt(0);
            post.nombre = c.getString(1);
            post.operador = c.getString(2);
            post.favorito= c.getString(3);
            posts.add(post);
        }

        return posts;

    }


}
