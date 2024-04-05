package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p193o.C7494b;

/* renamed from: com.google.android.gms.internal.measurement.f4 */
public final class C14638f4 {

    /* renamed from: a */
    public static final C7494b<String, Uri> f32836a = new C7494b<>();

    /* renamed from: a */
    public static synchronized Uri m23568a() {
        Uri orDefault;
        synchronized (C14638f4.class) {
            C7494b<String, Uri> bVar = f32836a;
            orDefault = bVar.getOrDefault("com.google.android.gms.measurement", null);
            if (orDefault == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
                orDefault = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                bVar.put("com.google.android.gms.measurement", orDefault);
            }
        }
        return orDefault;
    }
}
