package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.C0073e;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.i4 */
public final class C14677i4 extends C14742n4<Boolean> {
    public C14677i4(C14716l4 l4Var, String str, Boolean bool) {
        super(l4Var, str, bool);
    }

    /* renamed from: a */
    public final Object mo50558a(String str) {
        if (C14841v3.f33121b.matcher(str).matches()) {
            return Boolean.TRUE;
        }
        if (C14841v3.f33122c.matcher(str).matches()) {
            return Boolean.FALSE;
        }
        this.f32965a.getClass();
        String str2 = this.f32966b;
        Log.e("PhenotypeFlag", C0073e.m210j(new StringBuilder(str.length() + String.valueOf(str2).length() + 28), "Invalid boolean value for ", str2, ": ", str));
        return null;
    }
}
