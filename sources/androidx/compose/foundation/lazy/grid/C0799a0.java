package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0428h;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import p174m0.C7287g;

/* renamed from: androidx.compose.foundation.lazy.grid.a0 */
public final class C0799a0 {

    /* renamed from: a */
    public int f1696a;

    /* renamed from: b */
    public final Animatable<C7287g, C0428h> f1697b;

    /* renamed from: c */
    public long f1698c;

    /* renamed from: d */
    public final ParcelableSnapshotMutableState f1699d = C0761x.m1751w0(Boolean.FALSE, C1351n1.f2948a);

    public C0799a0(int i, long j) {
        this.f1696a = i;
        this.f1697b = new Animatable<>(new C7287g(j), VectorConvertersKt.f1082g, null);
        this.f1698c = j;
    }
}
