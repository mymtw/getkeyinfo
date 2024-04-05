package com.etsy.android.lib.core.posts;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.p013v4.media.C0070b;
import com.etsy.android.lib.logger.C8694h;

public class PostDatabase extends SQLiteOpenHelper {
    private static final String DB_NAME = "etsy_post_queue";
    private static final int DB_VERSION = 5;
    private static final int DB_VERSION_BECAME_BLOB = 5;
    private static final int DB_VERSION_RUN_AFTER_ADDED = 4;
    private static PostDatabase mInstance;

    private PostDatabase(Context context) {
        super(context, DB_NAME, (SQLiteDatabase.CursorFactory) null, 5);
    }

    public static void clearInstance() {
        PostDatabase postDatabase = mInstance;
        if (postDatabase != null) {
            postDatabase.close();
            mInstance = null;
        }
    }

    public static PostDatabase getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new PostDatabase(context.getApplicationContext());
        }
        return mInstance;
    }

    private void recreateDatabase(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP  TABLE  IF  EXISTS post");
        onCreate(sQLiteDatabase);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE  TABLE post (_id integer primary key autoincrement, post_json text, serialized_post blob,version_code integer not null, run_after_time integer);");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C8694h.f19097a.mo21312f(C0070b.m183e("Upgrading database. Existing contents will be lost. [", i, "]->[", i2, "]"));
        if (i != 5) {
            recreateDatabase(sQLiteDatabase);
        }
    }
}
