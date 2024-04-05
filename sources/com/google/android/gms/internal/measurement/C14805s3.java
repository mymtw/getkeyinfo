package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.s3 */
public final class C14805s3 implements C14855w5 {

    /* renamed from: a */
    public static final C14805s3 f33081a = new C14805s3();

    public final boolean zza(int i) {
        char c;
        if (i != 0) {
            c = 2;
            if (i != 1) {
                if (i != 2) {
                    c = 4;
                    if (i != 3) {
                        c = i != 4 ? (char) 0 : 5;
                    }
                } else {
                    c = 3;
                }
            }
        } else {
            c = 1;
        }
        return c != 0;
    }
}
