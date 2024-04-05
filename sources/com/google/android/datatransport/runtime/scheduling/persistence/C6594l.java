package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.C6556p;
import com.google.android.datatransport.runtime.scheduling.persistence.C6599q;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.l */
public final /* synthetic */ class C6594l implements C6599q.C6600a {

    /* renamed from: b */
    public final /* synthetic */ C6599q f14557b;

    /* renamed from: c */
    public final /* synthetic */ C6556p f14558c;

    public /* synthetic */ C6594l(C6599q qVar, C6556p pVar) {
        this.f14557b = qVar;
        this.f14558c = pVar;
    }

    /* JADX INFO: finally extract failed */
    public final Object apply(Object obj) {
        C6599q qVar = this.f14557b;
        C6556p pVar = this.f14558c;
        qVar.getClass();
        Long g = C6599q.m12955g((SQLiteDatabase) obj, pVar);
        if (g == null) {
            return Boolean.FALSE;
        }
        Cursor rawQuery = qVar.mo18791f().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{g.toString()});
        try {
            Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
            rawQuery.close();
            return valueOf;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
