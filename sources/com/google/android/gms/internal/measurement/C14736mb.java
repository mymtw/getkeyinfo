package com.google.android.gms.internal.measurement;

import androidx.compose.foundation.layout.C0761x;
import com.google.android.gms.measurement.internal.C15005j3;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.mb */
public final class C14736mb extends C14685j {

    /* renamed from: d */
    public final Callable<Object> f32957d;

    public C14736mb(C15005j3 j3Var) {
        super("internal.appMetadata");
        this.f32957d = j3Var;
    }

    /* renamed from: b */
    public final C14763p mo50553b(C14598c3 c3Var, List<C14763p> list) {
        try {
            return C0761x.m1726h1(this.f32957d.call());
        } catch (Exception unused) {
            return C14763p.f33033g0;
        }
    }
}
