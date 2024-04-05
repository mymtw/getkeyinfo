package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.google.android.play.core.appupdate.C15562d;

public abstract class AssetPackState {
    /* renamed from: h */
    public static C15603g0 m25234h(String str, int i, int i2, long j, long j2, double d, int i3, String str2, String str3) {
        return new C15603g0(str, i, i2, j, j2, (int) Math.rint(100.0d * d), i3, str2, str3);
    }

    /* renamed from: i */
    public static C15603g0 m25235i(Bundle bundle, String str, C15671x0 x0Var, C15581a2 a2Var, C15579a0 a0Var) {
        double doubleValue;
        int i;
        Bundle bundle2 = bundle;
        String str2 = str;
        C15671x0 x0Var2 = x0Var;
        int m = a0Var.mo7682m(bundle2.getInt(C15562d.m25188Z(ResponseConstants.STATUS, str2)), str2);
        int i2 = bundle2.getInt(C15562d.m25188Z("error_code", str2));
        long j = bundle2.getLong(C15562d.m25188Z("bytes_downloaded", str2));
        long j2 = bundle2.getLong(C15562d.m25188Z("total_bytes_to_download", str2));
        synchronized (x0Var) {
            Double d = (Double) x0Var2.f35400a.get(str2);
            doubleValue = d == null ? ShadowDrawableWrapper.COS_45 : d.doubleValue();
        }
        long j3 = bundle2.getLong(C15562d.m25188Z("pack_version", str2));
        long j4 = bundle2.getLong(C15562d.m25188Z("pack_base_version", str2));
        int i3 = 1;
        int i4 = 4;
        if (m == 4) {
            if (!(j4 == 0 || j4 == j3)) {
                i3 = 2;
            }
            i = i3;
        } else {
            i = 1;
            i4 = m;
        }
        return m25234h(str, i4, i2, j, j2, doubleValue, i, bundle2.getString(C15562d.m25188Z("pack_version_tag", str2), String.valueOf(bundle2.getInt("app_version_code"))), a2Var.mo55371a(str2));
    }

    /* renamed from: a */
    public abstract long mo55357a();

    /* renamed from: b */
    public abstract int mo55358b();

    /* renamed from: c */
    public abstract String mo55359c();

    /* renamed from: d */
    public abstract int mo55360d();

    /* renamed from: e */
    public abstract long mo55361e();

    /* renamed from: f */
    public abstract int mo55362f();

    /* renamed from: g */
    public abstract int mo55363g();

    /* renamed from: j */
    public abstract String mo55364j();

    /* renamed from: k */
    public abstract String mo55365k();
}
