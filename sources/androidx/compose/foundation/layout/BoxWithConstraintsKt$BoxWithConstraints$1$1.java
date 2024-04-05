package androidx.compose.foundation.layout;

import androidx.compose.p015ui.layout.C1696m0;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7280a;
import p628nj.C18263b;
import p753kq.C19861p;
import p753kq.C19862q;

public final class BoxWithConstraintsKt$BoxWithConstraints$1$1 extends Lambda implements C19861p<C1696m0, C7280a, C1712w> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19862q<C0735g, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C1711v $measurePolicy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoxWithConstraintsKt$BoxWithConstraints$1$1(C1711v vVar, C19862q<? super C0735g, ? super C1302d, ? super Integer, C19394m> qVar, int i) {
        super(2);
        this.$measurePolicy = vVar;
        this.$content = qVar;
        this.$$dirty = i;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m34681invoke0kLqBqw((C1696m0) obj, ((C7280a) obj2).f16152a);
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final C1712w m34681invoke0kLqBqw(C1696m0 m0Var, long j) {
        C19383o.m32797g(m0Var, "$this$SubcomposeLayout");
        return this.$measurePolicy.mo3260b(m0Var, m0Var.mo6700T(C19394m.f43287a, C18263b.m30807B(new BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1(this.$content, new C0737h(m0Var, j), this.$$dirty), -1945019079, true)), j);
    }
}
