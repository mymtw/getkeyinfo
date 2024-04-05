package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.C6599q;
import p085dh.C6678e;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.p */
public final /* synthetic */ class C6598p implements C6599q.C6600a {

    /* renamed from: b */
    public final /* synthetic */ long f14567b;

    public /* synthetic */ C6598p(long j) {
        this.f14567b = j;
    }

    public final Object apply(Object obj) {
        long j = this.f14567b;
        Cursor cursor = (Cursor) obj;
        cursor.moveToNext();
        return new C6678e(cursor.getLong(0), j);
    }
}
