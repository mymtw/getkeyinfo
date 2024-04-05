package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0428h;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import p174m0.C7287g;

/* renamed from: androidx.compose.foundation.lazy.z */
public final class C0867z {

    /* renamed from: a */
    public int f1873a;

    /* renamed from: b */
    public final Animatable<C7287g, C0428h> f1874b;

    /* renamed from: c */
    public long f1875c;

    /* renamed from: d */
    public final ParcelableSnapshotMutableState f1876d = C0761x.m1751w0(Boolean.FALSE, C1351n1.f2948a);

    public C0867z(int i, long j) {
        this.f1873a = i;
        this.f1874b = new Animatable<>(new C7287g(j), VectorConvertersKt.f1082g, null);
        this.f1875c = j;
    }
}
