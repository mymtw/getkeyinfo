package androidx.compose.p015ui.semantics;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.semantics.h */
public final class C1901h {

    /* renamed from: a */
    public final C19846a<Float> f4227a;

    /* renamed from: b */
    public final C19846a<Float> f4228b;

    /* renamed from: c */
    public final boolean f4229c;

    public C1901h(C19846a<Float> aVar, C19846a<Float> aVar2, boolean z) {
        this.f4227a = aVar;
        this.f4228b = aVar2;
        this.f4229c = z;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ScrollAxisRange(value=");
        h.append(this.f4227a.invoke().floatValue());
        h.append(", maxValue=");
        h.append(this.f4228b.invoke().floatValue());
        h.append(", reverseScrolling=");
        return C0391c.m1058d(h, this.f4229c, ')');
    }
}
