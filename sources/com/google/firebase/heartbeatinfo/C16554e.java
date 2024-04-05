package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.google.firebase.heartbeatinfo.e */
public final class C16554e {

    /* renamed from: b */
    public static C16554e f36737b;

    /* renamed from: c */
    public static final SimpleDateFormat f36738c = new SimpleDateFormat("dd/MM/yyyy z");

    /* renamed from: a */
    public final SharedPreferences f36739a;

    public C16554e(Context context) {
        this.f36739a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    /* renamed from: a */
    public final synchronized boolean mo59052a(long j, String str) {
        if (this.f36739a.contains(str)) {
            Date date = new Date(this.f36739a.getLong(str, -1));
            Date date2 = new Date(j);
            SimpleDateFormat simpleDateFormat = f36738c;
            if (!(!simpleDateFormat.format(date).equals(simpleDateFormat.format(date2)))) {
                return false;
            }
            this.f36739a.edit().putLong(str, j).apply();
            return true;
        }
        this.f36739a.edit().putLong(str, j).apply();
        return true;
    }
}
