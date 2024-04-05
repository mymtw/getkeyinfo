package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import androidx.room.C3217a;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.persistence.C6599q;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.m */
public final /* synthetic */ class C6595m implements C6599q.C6600a {

    /* renamed from: b */
    public final /* synthetic */ String f14559b;

    /* renamed from: c */
    public final /* synthetic */ LogEventDropped.Reason f14560c;

    /* renamed from: d */
    public final /* synthetic */ long f14561d;

    public /* synthetic */ C6595m(long j, LogEventDropped.Reason reason, String str) {
        this.f14559b = str;
        this.f14560c = reason;
        this.f14561d = j;
    }

    public final Object apply(Object obj) {
        String str = this.f14559b;
        LogEventDropped.Reason reason = this.f14560c;
        long j = this.f14561d;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (!((Boolean) C6599q.m12957j(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())}), new C3217a(3))).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(reason.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())});
        }
        return null;
    }
}
