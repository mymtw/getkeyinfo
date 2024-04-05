package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.C6608x;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.u */
public final /* synthetic */ class C6605u implements C6608x.C6609a {
    /* renamed from: a */
    public final void mo18793a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
