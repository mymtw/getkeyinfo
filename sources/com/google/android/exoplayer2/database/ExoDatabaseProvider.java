package com.google.android.exoplayer2.database;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import p513bj.C14075p;

public final class ExoDatabaseProvider extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "exoplayer_internal.db";
    private static final String TAG = "ExoDatabaseProvider";
    private static final int VERSION = 1;

    public ExoDatabaseProvider(Context context) {
        super(context.getApplicationContext(), DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
    }

    private static void wipeDatabase(SQLiteDatabase sQLiteDatabase) {
        String sb;
        Cursor query = sQLiteDatabase.query("sqlite_master", new String[]{"type", "name"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            try {
                String string = query.getString(0);
                String string2 = query.getString(1);
                if (!"sqlite_sequence".equals(string2)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 16 + String.valueOf(string2).length());
                    sb2.append("DROP ");
                    sb2.append(string);
                    sb2.append(" IF EXISTS ");
                    sb2.append(string2);
                    sb = sb2.toString();
                    sQLiteDatabase.execSQL(sb);
                }
            } catch (SQLException e) {
                String valueOf = String.valueOf(sb);
                C14075p.m21698j(TAG, valueOf.length() != 0 ? "Error executing ".concat(valueOf) : new String("Error executing "), e);
            } catch (Throwable th) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        query.close();
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        wipeDatabase(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
