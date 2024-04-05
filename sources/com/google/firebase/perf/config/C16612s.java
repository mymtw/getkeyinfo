package com.google.firebase.perf.config;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import p427qb.C13281a;
import p568fn.C17781a;
import p575gm.C17793c;

/* renamed from: com.google.firebase.perf.config.s */
public final class C16612s {

    /* renamed from: c */
    public static final C17781a f36849c = C17781a.m29823d();

    /* renamed from: d */
    public static C16612s f36850d;

    /* renamed from: a */
    public volatile SharedPreferences f36851a;

    /* renamed from: b */
    public final ExecutorService f36852b;

    public C16612s(ExecutorService executorService) {
        this.f36852b = executorService;
    }

    /* renamed from: a */
    public static Context m27478a() {
        try {
            C17793c.m29919b();
            C17793c b = C17793c.m29919b();
            b.mo69021a();
            return b.f38672a;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final synchronized void mo59260b(Context context) {
        if (this.f36851a == null && context != null) {
            this.f36852b.execute(new C13281a(5, this, context));
        }
    }

    /* renamed from: c */
    public final void mo59261c(long j, String str) {
        if (this.f36851a == null) {
            mo59260b(m27478a());
            if (this.f36851a == null) {
                return;
            }
        }
        this.f36851a.edit().putLong(str, j).apply();
    }

    /* renamed from: d */
    public final void mo59262d(String str, float f) {
        if (this.f36851a == null) {
            mo59260b(m27478a());
            if (this.f36851a == null) {
                return;
            }
        }
        this.f36851a.edit().putFloat(str, f).apply();
    }

    /* renamed from: e */
    public final void mo59263e(String str, String str2) {
        if (this.f36851a == null) {
            mo59260b(m27478a());
            if (this.f36851a == null) {
                return;
            }
        }
        if (str2 == null) {
            this.f36851a.edit().remove(str).apply();
        } else {
            this.f36851a.edit().putString(str, str2).apply();
        }
    }

    /* renamed from: f */
    public final void mo59264f(String str, boolean z) {
        if (this.f36851a == null) {
            mo59260b(m27478a());
            if (this.f36851a == null) {
                return;
            }
        }
        this.f36851a.edit().putBoolean(str, z).apply();
    }
}
