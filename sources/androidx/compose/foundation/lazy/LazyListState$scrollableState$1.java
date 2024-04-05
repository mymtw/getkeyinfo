package androidx.compose.foundation.lazy;

import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.lazy.layout.C0836a;
import androidx.compose.foundation.lazy.layout.C0845h;
import androidx.compose.p015ui.layout.C1690j0;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.Lambda;
import p174m0.C7280a;
import p753kq.C19857l;

public final class LazyListState$scrollableState$1 extends Lambda implements C19857l<Float, Float> {
    public final /* synthetic */ LazyListState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListState$scrollableState$1(LazyListState lazyListState) {
        super(1);
        this.this$0 = lazyListState;
    }

    public final Float invoke(float f) {
        int i;
        C0845h.C0846a aVar;
        C0845h.C0846a aVar2;
        LazyListState lazyListState = this.this$0;
        float f2 = -f;
        if ((f2 >= 0.0f || lazyListState.f1617q) && (f2 <= 0.0f || lazyListState.f1616p)) {
            boolean z = true;
            if (Math.abs(lazyListState.f1604d) <= 0.5f) {
                float f3 = lazyListState.f1604d + f2;
                lazyListState.f1604d = f3;
                if (Math.abs(f3) > 0.5f) {
                    float f4 = lazyListState.f1604d;
                    C1690j0 j0Var = (C1690j0) lazyListState.f1611k.getValue();
                    if (j0Var != null) {
                        j0Var.mo6690b();
                    }
                    boolean z2 = lazyListState.f1607g;
                    if (z2) {
                        float f5 = f4 - lazyListState.f1604d;
                        if (z2) {
                            C0852m g = lazyListState.mo4226g();
                            if (!g.mo4244b().isEmpty()) {
                                boolean z3 = f5 < 0.0f;
                                if (z3) {
                                    i = ((C0827j) C19327t.m32645a1(g.mo4244b())).getIndex() + 1;
                                } else {
                                    i = ((C0827j) C19327t.m32638T0(g.mo4244b())).getIndex() - 1;
                                }
                                if (i != lazyListState.f1608h) {
                                    if (i < 0 || i >= g.mo4243a()) {
                                        z = false;
                                    }
                                    if (z) {
                                        if (!(lazyListState.f1610j == z3 || (aVar2 = lazyListState.f1609i) == null)) {
                                            aVar2.cancel();
                                        }
                                        lazyListState.f1610j = z3;
                                        lazyListState.f1608h = i;
                                        C0845h hVar = lazyListState.f1618r;
                                        long j = ((C7280a) lazyListState.f1615o.getValue()).f16152a;
                                        C0845h.C0847b bVar = (C0845h.C0847b) hVar.f1811a.getValue();
                                        if (bVar == null || (aVar = bVar.m34700schedulePrefetch0kLqBqw(i, j)) == null) {
                                            aVar = C0836a.f1792a;
                                        }
                                        lazyListState.f1609i = aVar;
                                    }
                                }
                            }
                        }
                    }
                }
                if (Math.abs(lazyListState.f1604d) > 0.5f) {
                    f2 -= lazyListState.f1604d;
                    lazyListState.f1604d = 0.0f;
                }
            } else {
                StringBuilder h = C0072d.m201h("entered drag with non-zero pending scroll: ");
                h.append(lazyListState.f1604d);
                throw new IllegalStateException(h.toString().toString());
            }
        } else {
            f2 = 0.0f;
        }
        return Float.valueOf(-f2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }
}
