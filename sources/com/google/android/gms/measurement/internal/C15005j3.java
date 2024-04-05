package com.google.android.gms.measurement.internal;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.j3 */
public final /* synthetic */ class C15005j3 implements Callable {

    /* renamed from: b */
    public final /* synthetic */ C15041n3 f33594b;

    /* renamed from: c */
    public final /* synthetic */ String f33595c;

    public /* synthetic */ C15005j3(C15041n3 n3Var, String str) {
        this.f33594b = n3Var;
        this.f33595c = str;
    }

    public final Object call() {
        C15041n3 n3Var = this.f33594b;
        String str = this.f33595c;
        C14983h hVar = n3Var.f34048c.f33488d;
        C14973f7.m24287I(hVar);
        C15143z3 C = hVar.mo52053C(str);
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("package_name", str);
        ((C15103u3) n3Var.f33681b).f33878h.mo51969l();
        hashMap.put("gmp_version", 46000L);
        if (C != null) {
            String z = C.mo52401z();
            if (z != null) {
                hashMap.put("app_version", z);
            }
            hashMap.put("app_version_int", Long.valueOf(C.mo52396u()));
            C.f34015a.mo52015a().mo51995g();
            hashMap.put("dynamite_version", Long.valueOf(C.f34034t));
        }
        return hashMap;
    }
}
