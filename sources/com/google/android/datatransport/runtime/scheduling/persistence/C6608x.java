package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0472h;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.x */
public final class C6608x extends SQLiteOpenHelper {

    /* renamed from: d */
    public static final String f14581d;

    /* renamed from: e */
    public static int f14582e = 5;

    /* renamed from: f */
    public static final List<C6609a> f14583f = Arrays.asList(new C6609a[]{new C6603s(), new C6604t(), new C6605u(), new C6606v(), new C6607w()});

    /* renamed from: b */
    public final int f14584b;

    /* renamed from: c */
    public boolean f14585c = false;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.x$a */
    public interface C6609a {
        /* renamed from: a */
        void mo18793a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        StringBuilder h = C0072d.m201h("INSERT INTO global_log_event_state VALUES (");
        h.append(System.currentTimeMillis());
        h.append(")");
        f14581d = h.toString();
    }

    public C6608x(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f14584b = i;
    }

    /* renamed from: a */
    public static void m12977a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<C6609a> list = f14583f;
        if (i2 <= list.size()) {
            while (i < i2) {
                f14583f.get(i).mo18793a(sQLiteDatabase);
                i++;
            }
            return;
        }
        StringBuilder g = C0472h.m1244g("Migration from ", i, " to ", i2, " was requested, but cannot be performed. Only ");
        g.append(list.size());
        g.append(" migrations are provided");
        throw new IllegalArgumentException(g.toString());
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f14585c = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.f14584b;
        if (!this.f14585c) {
            onConfigure(sQLiteDatabase);
        }
        m12977a(sQLiteDatabase, 0, i);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f14585c) {
            onConfigure(sQLiteDatabase);
        }
        m12977a(sQLiteDatabase, 0, i2);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f14585c) {
            onConfigure(sQLiteDatabase);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.f14585c) {
            onConfigure(sQLiteDatabase);
        }
        m12977a(sQLiteDatabase, i, i2);
    }
}
