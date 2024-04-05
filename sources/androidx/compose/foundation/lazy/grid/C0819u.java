package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1;
import androidx.compose.foundation.lazy.layout.C0843f;
import androidx.compose.p015ui.layout.C1686i0;
import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;

/* renamed from: androidx.compose.foundation.lazy.grid.u */
public final class C0819u {

    /* renamed from: a */
    public final C0807i f1756a;

    /* renamed from: b */
    public final C0843f f1757b;

    /* renamed from: c */
    public final int f1758c;

    /* renamed from: d */
    public final C0823y f1759d;

    public C0819u(C0807i iVar, C0843f fVar, int i, LazyGridKt$rememberLazyGridMeasurePolicy$1$1.C0789a aVar) {
        C19383o.m32797g(iVar, "itemProvider");
        C19383o.m32797g(fVar, "measureScope");
        this.f1756a = iVar;
        this.f1757b = fVar;
        this.f1758c = i;
        this.f1759d = aVar;
    }

    /* renamed from: a */
    public final C0818t mo4352a(int i, int i2, long j) {
        int i3;
        Object e = this.f1756a.mo4201e(i);
        C1686i0[] K = this.f1757b.mo4386K(i, j);
        if (C7280a.m13961f(j)) {
            i3 = C7280a.m13965j(j);
        } else if (C7280a.m13960e(j)) {
            i3 = C7280a.m13964i(j);
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return this.f1759d.mo4293a(i, e, i3, i2, K);
    }
}
