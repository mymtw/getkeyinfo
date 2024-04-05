package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

final class LazyGridScopeImpl$item$2$1 extends Lambda implements C19861p<C0809k, Integer, C0801c> {
    public final /* synthetic */ C19857l<C0809k, C0801c> $span;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridScopeImpl$item$2$1(C19857l<? super C0809k, C0801c> lVar) {
        super(2);
        this.$span = lVar;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new C0801c(m34695invoke_orMbw((C0809k) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: invoke-_-orMbw  reason: not valid java name */
    public final long m34695invoke_orMbw(C0809k kVar, int i) {
        C19383o.m32797g(kVar, "$this$null");
        return this.$span.invoke(kVar).f1700a;
    }
}
