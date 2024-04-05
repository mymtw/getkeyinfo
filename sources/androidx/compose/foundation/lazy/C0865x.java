package androidx.compose.foundation.lazy;

import androidx.activity.C0114h;
import androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1;
import androidx.compose.foundation.lazy.layout.C0843f;
import com.google.android.gms.common.api.Api;
import p174m0.C7280a;

/* renamed from: androidx.compose.foundation.lazy.x */
public final class C0865x {

    /* renamed from: a */
    public final C0829l f1869a;

    /* renamed from: b */
    public final C0843f f1870b;

    /* renamed from: c */
    public final C0866y f1871c;

    /* renamed from: d */
    public final long f1872d;

    public C0865x(long j, boolean z, C0829l lVar, C0843f fVar, LazyListKt$rememberLazyListMeasurePolicy$1$1.C0768a aVar) {
        this.f1869a = lVar;
        this.f1870b = fVar;
        this.f1871c = aVar;
        this.f1872d = C0114h.m315r(z ? C7280a.m13963h(j) : Integer.MAX_VALUE, !z ? C7280a.m13962g(j) : Api.BaseClientBuilder.API_PRIORITY_OTHER, 5);
    }

    /* renamed from: a */
    public final C0864w mo4402a(int i) {
        return this.f1871c.mo4213a(i, this.f1869a.mo4201e(i), this.f1870b.mo4386K(i, this.f1872d));
    }
}
