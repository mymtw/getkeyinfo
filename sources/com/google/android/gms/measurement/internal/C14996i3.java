package com.google.android.gms.measurement.internal;

import androidx.compose.runtime.C1339j1;
import com.google.android.gms.internal.measurement.C14843v5;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.i3 */
public final /* synthetic */ class C14996i3 implements Callable {

    /* renamed from: b */
    public final /* synthetic */ C15041n3 f33564b;

    /* renamed from: c */
    public final /* synthetic */ String f33565c;

    public /* synthetic */ C14996i3(C15041n3 n3Var, String str) {
        this.f33564b = n3Var;
        this.f33565c = str;
    }

    public final Object call() {
        return new C14843v5(new C1339j1(this.f33564b, this.f33565c, 0));
    }
}
