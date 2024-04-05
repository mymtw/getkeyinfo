package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.C6599q;
import p306z8.C8477d;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.k */
public final /* synthetic */ class C6593k implements C6599q.C6600a {

    /* renamed from: b */
    public final /* synthetic */ C6599q f14555b;

    /* renamed from: c */
    public final /* synthetic */ long f14556c;

    public /* synthetic */ C6593k(C6599q qVar, long j) {
        this.f14555b = qVar;
        this.f14556c = j;
    }

    public final Object apply(Object obj) {
        C6599q qVar = this.f14555b;
        long j = this.f14556c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        qVar.getClass();
        String[] strArr = {String.valueOf(j)};
        C6599q.m12957j(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new C8477d(qVar));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }
}
