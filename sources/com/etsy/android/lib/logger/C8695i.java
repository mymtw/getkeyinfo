package com.etsy.android.lib.logger;

import android.util.Log;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.BuildTarget;
import p107f9.C6815a;

/* renamed from: com.etsy.android.lib.logger.i */
public final class C8695i implements C8694h {
    /* renamed from: a */
    public final void mo21306a(String str) {
        if (C0326j.m869n(BuildTarget.Companion)) {
            String a = C6815a.m13204a();
            if (str == null) {
                str = "";
            }
            Log.e(a, str);
        }
    }

    /* renamed from: b */
    public final void mo21307b(String str, Throwable th) {
        if (C0326j.m869n(BuildTarget.Companion)) {
            Log.w(C6815a.m13204a(), str, th);
        }
    }

    /* renamed from: c */
    public final void mo21308c() {
        if (C0326j.m869n(BuildTarget.Companion)) {
            C6815a.m13204a();
        }
    }

    /* renamed from: d */
    public final void mo21309d(String str, Throwable th) {
        if (C0326j.m869n(BuildTarget.Companion)) {
            Log.e(C6815a.m13204a(), str, th);
        }
    }

    /* renamed from: e */
    public final void mo21310e(String str) {
        if (C0326j.m869n(BuildTarget.Companion)) {
            String a = C6815a.m13204a();
            if (str == null) {
                str = "";
            }
            Log.d(a, str);
        }
    }

    public final void error(Throwable th) {
        if (C0326j.m869n(BuildTarget.Companion)) {
            Log.e(C6815a.m13204a(), "", th);
        }
    }

    /* renamed from: f */
    public final void mo21312f(String str) {
        if (C0326j.m869n(BuildTarget.Companion)) {
            String a = C6815a.m13204a();
            if (str == null) {
                str = "";
            }
            Log.i(a, str);
        }
    }

    /* renamed from: g */
    public final void mo21313g(String str) {
        if (C0326j.m869n(BuildTarget.Companion)) {
            String a = C6815a.m13204a();
            if (str == null) {
                str = "";
            }
            Log.w(a, str);
        }
    }

    /* renamed from: h */
    public final void mo21314h(Throwable th) {
        if (C0326j.m869n(BuildTarget.Companion)) {
            Log.w(C6815a.m13204a(), th);
        }
    }
}
