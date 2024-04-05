package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C14736mb;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.k3 */
public final /* synthetic */ class C15014k3 implements Callable {

    /* renamed from: b */
    public final /* synthetic */ C15041n3 f33626b;

    /* renamed from: c */
    public final /* synthetic */ String f33627c;

    public /* synthetic */ C15014k3(C15041n3 n3Var, String str) {
        this.f33626b = n3Var;
        this.f33627c = str;
    }

    public final Object call() {
        return new C14736mb(new C15005j3(this.f33626b, this.f33627c));
    }
}
