package com.qualtrics.digital;

import android.util.Log;
import androidx.activity.C0114h;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.Locale;
import p568fn.C17782b;

/* renamed from: com.qualtrics.digital.n */
public final class C17308n {

    /* renamed from: g */
    public static C17308n f37832g;

    /* renamed from: a */
    public C17301h f37833a;

    /* renamed from: b */
    public double f37834b = ShadowDrawableWrapper.COS_45;

    /* renamed from: c */
    public String f37835c;

    /* renamed from: d */
    public String f37836d;

    /* renamed from: e */
    public String f37837e;

    /* renamed from: f */
    public String f37838f;

    /* renamed from: a */
    public final void mo68222a(long j, String str) {
        if (this.f37833a == null) {
            Log.e("Qualtrics", "Service not initialized, report latency network request cannot be performed");
        } else if (C17782b.m29845K(Double.valueOf(this.f37834b))) {
            C17301h hVar = this.f37833a;
            String.format(Locale.US, "si.androidSDK.%s.%s.%s.%s.%s.%s", new Object[]{"1.8", this.f37835c, this.f37836d, this.f37837e, this.f37838f, str});
            hVar.mo68213a(new C17306l()).mo74362G(new C0114h());
        }
    }
}
