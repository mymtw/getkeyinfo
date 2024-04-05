package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.C0073e;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.j4 */
public final class C14690j4 extends C14742n4<Double> {
    public C14690j4(C14716l4 l4Var, Double d) {
        super(l4Var, "measurement.test.double_flag", d);
    }

    /* renamed from: a */
    public final Object mo50558a(String str) {
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            this.f32965a.getClass();
            String str2 = this.f32966b;
            Log.e("PhenotypeFlag", C0073e.m210j(new StringBuilder(str.length() + String.valueOf(str2).length() + 27), "Invalid double value for ", str2, ": ", str));
            return null;
        }
    }
}
