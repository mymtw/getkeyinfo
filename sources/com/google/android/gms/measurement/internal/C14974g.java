package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.common.util.VisibleForTesting;
import org.apache.commons.lang3.time.DateUtils;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.g */
public final class C14974g extends SQLiteOpenHelper {

    /* renamed from: b */
    public final /* synthetic */ C14983h f33511b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14974g(C14983h hVar, Context context) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f33511b = hVar;
    }

    public final SQLiteDatabase getWritableDatabase() {
        C14983h hVar = this.f33511b;
        C15122w6 w6Var = hVar.f33548f;
        ((C15103u3) hVar.f33681b).getClass();
        if (w6Var.f33961b == 0 || w6Var.f33960a.elapsedRealtime() - w6Var.f33961b >= DateUtils.MILLIS_PER_HOUR) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                C15122w6 w6Var2 = this.f33511b.f33548f;
                w6Var2.f33961b = w6Var2.f33960a.elapsedRealtime();
                ((C15103u3) this.f33511b.f33681b).mo52016b().f33724g.mo52237a("Opening the database failed, dropping and recreating it");
                ((C15103u3) this.f33511b.f33681b).getClass();
                if (!((C15103u3) this.f33511b.f33681b).f33872b.getDatabasePath("google_app_measurement.db").delete()) {
                    ((C15103u3) this.f33511b.f33681b).mo52016b().f33724g.mo52238b("google_app_measurement.db", "Failed to delete corrupted db file");
                }
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    this.f33511b.f33548f.f33961b = 0;
                    return writableDatabase;
                } catch (SQLiteException e) {
                    ((C15103u3) this.f33511b.f33681b).mo52016b().f33724g.mo52238b(e, "Failed to open freshly created database");
                    throw e;
                }
            }
        } else {
            throw new SQLiteException("Database open failed");
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C14992i.m24405b(((C15103u3) this.f33511b.f33681b).mo52016b(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        C14992i.m24404a(((C15103u3) this.f33511b.f33681b).mo52016b(), sQLiteDatabase2, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C14983h.f33539g);
        C14992i.m24404a(((C15103u3) this.f33511b.f33681b).mo52016b(), sQLiteDatabase2, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", (String[]) null);
        C14992i.m24404a(((C15103u3) this.f33511b.f33681b).mo52016b(), sQLiteDatabase2, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C14983h.f33540h);
        C14992i.m24404a(((C15103u3) this.f33511b.f33681b).mo52016b(), sQLiteDatabase2, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C14983h.f33541i);
        C14992i.m24404a(((C15103u3) this.f33511b.f33681b).mo52016b(), sQLiteDatabase2, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C14983h.f33543k);
        C14992i.m24404a(((C15103u3) this.f33511b.f33681b).mo52016b(), sQLiteDatabase2, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", (String[]) null);
        C14992i.m24404a(((C15103u3) this.f33511b.f33681b).mo52016b(), sQLiteDatabase2, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C14983h.f33542j);
        C14992i.m24404a(((C15103u3) this.f33511b.f33681b).mo52016b(), sQLiteDatabase2, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C14983h.f33544l);
        C14992i.m24404a(((C15103u3) this.f33511b.f33681b).mo52016b(), sQLiteDatabase2, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C14983h.f33545m);
        C14992i.m24404a(((C15103u3) this.f33511b.f33681b).mo52016b(), sQLiteDatabase2, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", (String[]) null);
        C14992i.m24404a(((C15103u3) this.f33511b.f33681b).mo52016b(), sQLiteDatabase2, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C14983h.f33546n);
        C14992i.m24404a(((C15103u3) this.f33511b.f33681b).mo52016b(), sQLiteDatabase2, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", (String[]) null);
        C14992i.m24404a(((C15103u3) this.f33511b.f33681b).mo52016b(), sQLiteDatabase2, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", (String[]) null);
        C14992i.m24404a(((C15103u3) this.f33511b.f33681b).mo52016b(), sQLiteDatabase2, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
