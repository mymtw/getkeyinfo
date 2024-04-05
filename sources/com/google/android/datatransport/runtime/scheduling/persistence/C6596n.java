package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.C6556p;
import com.google.android.datatransport.runtime.scheduling.persistence.C6599q;
import p144ih.C7008a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.n */
public final /* synthetic */ class C6596n implements C6599q.C6600a {

    /* renamed from: b */
    public final /* synthetic */ long f14562b;

    /* renamed from: c */
    public final /* synthetic */ C6556p f14563c;

    public /* synthetic */ C6596n(long j, C6556p pVar) {
        this.f14562b = j;
        this.f14563c = pVar;
    }

    public final Object apply(Object obj) {
        long j = this.f14562b;
        C6556p pVar = this.f14563c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.getBackendName(), String.valueOf(C7008a.m13568a(pVar.getPriority()))}) < 1) {
            contentValues.put("backend_name", pVar.getBackendName());
            contentValues.put("priority", Integer.valueOf(C7008a.m13568a(pVar.getPriority())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }
}
