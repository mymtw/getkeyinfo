package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.h2 */
public final class C14986h2 extends SQLiteOpenHelper {

    /* renamed from: b */
    public final /* synthetic */ C14995i2 f33553b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14986h2(C14995i2 i2Var, Context context) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f33553b = i2Var;
    }

    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            ((C15103u3) this.f33553b.f33681b).mo52016b().f33724g.mo52237a("Opening the local database failed, dropping and recreating it");
            ((C15103u3) this.f33553b.f33681b).getClass();
            if (!((C15103u3) this.f33553b.f33681b).f33872b.getDatabasePath("google_app_measurement_local.db").delete()) {
                ((C15103u3) this.f33553b.f33681b).mo52016b().f33724g.mo52238b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                ((C15103u3) this.f33553b.f33681b).mo52016b().f33724g.mo52238b(e2, "Failed to open local database. Events will bypass local storage");
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C14992i.m24405b(((C15103u3) this.f33553b.f33681b).mo52016b(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C14992i.m24404a(((C15103u3) this.f33553b.f33681b).mo52016b(), sQLiteDatabase, ResponseConstants.MESSAGES, "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
