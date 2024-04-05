package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.C0073e;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.h4 */
public final class C14664h4 extends C14742n4<Long> {
    public C14664h4(C14716l4 l4Var, String str, Long l) {
        super(l4Var, str, l);
    }

    /* renamed from: a */
    public final Object mo50558a(String str) {
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            this.f32965a.getClass();
            String str2 = this.f32966b;
            Log.e("PhenotypeFlag", C0073e.m210j(new StringBuilder(str.length() + String.valueOf(str2).length() + 25), "Invalid long value for ", str2, ": ", str));
            return null;
        }
    }
}
