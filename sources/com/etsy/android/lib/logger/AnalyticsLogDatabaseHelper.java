package com.etsy.android.lib.logger;

import android.app.ActivityManager;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Process;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.core.EtsyApplication;
import java.util.Iterator;

public class AnalyticsLogDatabaseHelper extends SQLiteOpenHelper {
    public static final String CREATE_SQL = "CREATE TABLE IF NOT EXISTS analytics_log (_id integer primary key autoincrement, log text not null);";
    private static final String DATABASE_NAME = "analytics_logs";
    private static final int DATABASE_VERSION = 1;

    /* renamed from: ID */
    public static final String f19040ID = "_id";
    private static final Object INSTANCE_LOCK = new Object();
    public static final String LOG = "log";
    public static final String TABLE = "analytics_log";
    private static AnalyticsLogDatabaseHelper sInstance;

    public AnalyticsLogDatabaseHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, getDBName(), cursorFactory, 1);
    }

    private static String getDBName() {
        boolean z;
        String str;
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) EtsyApplication.get().getSystemService("activity")).getRunningServices(500).iterator();
        int myPid = Process.myPid();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            ActivityManager.RunningServiceInfo next = it.next();
            try {
                if (next.pid == myPid && (str = next.process) != null && str.endsWith(":sync")) {
                    z = true;
                    break;
                }
            } catch (Exception e) {
                C8694h hVar = C8694h.f19097a;
                StringBuilder h = C0072d.m201h("getProcessName Exception: ");
                h.append(e.getMessage());
                hVar.mo21309d(h.toString(), e);
            }
        }
        return z ? "analytics_logs_sync.db" : "analytics_logs.db";
    }

    public static AnalyticsLogDatabaseHelper getInstance() {
        AnalyticsLogDatabaseHelper analyticsLogDatabaseHelper;
        synchronized (INSTANCE_LOCK) {
            if (sInstance == null) {
                sInstance = new AnalyticsLogDatabaseHelper(EtsyApplication.get(), (String) null, (SQLiteDatabase.CursorFactory) null, 1);
            }
            analyticsLogDatabaseHelper = sInstance;
        }
        return analyticsLogDatabaseHelper;
    }

    public static void resetInstance() {
        synchronized (INSTANCE_LOCK) {
            sInstance = null;
        }
    }

    public static void setInstance(AnalyticsLogDatabaseHelper analyticsLogDatabaseHelper) {
        synchronized (INSTANCE_LOCK) {
            sInstance = analyticsLogDatabaseHelper;
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(CREATE_SQL);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
