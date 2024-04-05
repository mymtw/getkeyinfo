package com.bugsnag.android;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.z */
public final class C5938z implements C5935y {

    /* renamed from: b */
    public final C5935y f12717b;

    public C5938z(Context context, C5810n nVar) {
        C19383o.m32798h(context, ResponseConstants.CONTEXT);
        ConnectivityManager connectivityManager = null;
        try {
            Object systemService = context.getSystemService("connectivity");
            connectivityManager = (ConnectivityManager) (!(systemService instanceof ConnectivityManager) ? null : systemService);
        } catch (RuntimeException unused) {
        }
        this.f12717b = connectivityManager == null ? C0114h.f179p : new ConnectivityApi24(connectivityManager, nVar);
    }

    /* renamed from: b */
    public final void mo1127b() {
        try {
            this.f12717b.mo1127b();
            Result.m35480constructorimpl(C19394m.f43287a);
        } catch (Throwable th) {
            Result.m35480constructorimpl(C0761x.m1673J(th));
        }
    }

    /* renamed from: d */
    public final boolean mo1129d() {
        Object obj;
        try {
            obj = Result.m35480constructorimpl(Boolean.valueOf(this.f12717b.mo1129d()));
        } catch (Throwable th) {
            obj = Result.m35480constructorimpl(C0761x.m1673J(th));
        }
        if (Result.m35483exceptionOrNullimpl(obj) != null) {
            obj = Boolean.TRUE;
        }
        return ((Boolean) obj).booleanValue();
    }

    /* renamed from: f */
    public final String mo1131f() {
        Object obj;
        try {
            obj = Result.m35480constructorimpl(this.f12717b.mo1131f());
        } catch (Throwable th) {
            obj = Result.m35480constructorimpl(C0761x.m1673J(th));
        }
        if (Result.m35483exceptionOrNullimpl(obj) != null) {
            obj = "unknown";
        }
        return (String) obj;
    }
}
