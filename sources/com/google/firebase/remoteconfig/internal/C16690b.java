package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;

/* renamed from: com.google.firebase.remoteconfig.internal.b */
public final class C16690b {

    /* renamed from: d */
    public static final Date f36913d = new Date(-1);

    /* renamed from: e */
    public static final Date f36914e = new Date(-1);

    /* renamed from: a */
    public final SharedPreferences f36915a;

    /* renamed from: b */
    public final Object f36916b = new Object();

    /* renamed from: c */
    public final Object f36917c = new Object();

    /* renamed from: com.google.firebase.remoteconfig.internal.b$a */
    public static class C16691a {

        /* renamed from: a */
        public int f36918a;

        /* renamed from: b */
        public Date f36919b;

        public C16691a(Date date, int i) {
            this.f36918a = i;
            this.f36919b = date;
        }
    }

    public C16690b(SharedPreferences sharedPreferences) {
        this.f36915a = sharedPreferences;
    }

    /* renamed from: a */
    public final C16691a mo59445a() {
        C16691a aVar;
        synchronized (this.f36917c) {
            aVar = new C16691a(new Date(this.f36915a.getLong("backoff_end_time_in_millis", -1)), this.f36915a.getInt("num_failed_fetches", 0));
        }
        return aVar;
    }

    /* renamed from: b */
    public final void mo59446b(Date date, int i) {
        synchronized (this.f36917c) {
            this.f36915a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
