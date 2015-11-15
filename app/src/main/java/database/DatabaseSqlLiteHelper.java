package database;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseSqlLiteHelper extends SQLiteOpenHelper {
    public DatabaseSqlLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE posts(id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, operador TEXT, favorito TEXT);");
        db.execSQL("INSERT INTO posts (nombre,operador,favorito) VALUES ('Luna','operador1','false'); ");
        db.execSQL("INSERT INTO posts (nombre,operador,favorito) VALUES ('Encatado','operador2','true');");
        db.execSQL("INSERT INTO posts (nombre,operador,favorito) VALUES ('Sol','operador3','false');");
        db.execSQL("INSERT INTO posts (nombre,operador,favorito) VALUES ('Flores','operador4','true');");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
