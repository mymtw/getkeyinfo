package com.google.ads.conversiontracking;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.util.Locale;
import p003a2.C0023f;

/* renamed from: com.google.ads.conversiontracking.f */
public final class C12617f {

    /* renamed from: a */
    public static final String f27834a = String.format(Locale.US, "CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT, %s INTEGER, %s INTEGER, %s TEXT, %s INTEGER, %s INTEGER,%s INTEGER);", new Object[]{"conversiontracking", "conversion_ping_id", "string_url", "preference_key", "is_repeatable", "parameter_is_null", "preference_name", "record_time", "retry_count", "last_retry_time"});

    /* renamed from: com.google.ads.conversiontracking.f$a */
    public class C12618a extends SQLiteOpenHelper {

        /* renamed from: a */
        public final /* synthetic */ C12617f f27835a;

        public C12618a(C12617f fVar, Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 5);
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(C12617f.f27834a);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            Log.i("GoogleConversionReporter", C0023f.m107h(64, "Database updated from version ", i, " to version ", i2));
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS conversiontracking");
            onCreate(sQLiteDatabase);
        }
    }
}
