package androidx.compose.foundation.lazy.layout;

import androidx.compose.p015ui.layout.C1696m0;
import androidx.compose.p015ui.layout.C1712w;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7280a;
import p753kq.C19861p;

public final class LazyLayoutKt$LazyLayout$2$1 extends Lambda implements C19861p<C1696m0, C7280a, C1712w> {
    public final /* synthetic */ C0839c $itemContentFactory;
    public final /* synthetic */ C19861p<C0843f, C7280a, C1712w> $measurePolicy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$2$1(C0839c cVar, C19861p<? super C0843f, ? super C7280a, ? extends C1712w> pVar) {
        super(2);
        this.$itemContentFactory = cVar;
        this.$measurePolicy = pVar;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m34698invoke0kLqBqw((C1696m0) obj, ((C7280a) obj2).f16152a);
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final C1712w m34698invoke0kLqBqw(C1696m0 m0Var, long j) {
        C19383o.m32797g(m0Var, "$this$null");
        C0839c cVar = this.$itemContentFactory;
        cVar.getClass();
        if (!C19383o.m32792b(m0Var, cVar.f1799d) || !C7280a.m13957b(j, cVar.f1800e)) {
            cVar.f1799d = m0Var;
            cVar.f1800e = j;
            cVar.f1798c.clear();
        }
        return this.$measurePolicy.invoke(new C0844g(this.$itemContentFactory, m0Var), new C7280a(j));
    }
}
