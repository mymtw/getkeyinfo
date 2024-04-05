package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class LazyGridDslKt$items$8 extends Lambda implements C19861p<C0809k, Integer, C0801c> {
    public final /* synthetic */ Object[] $items;
    public final /* synthetic */ C19861p<C0809k, Object, C0801c> $span;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$items$8(C19861p<? super C0809k, Object, C0801c> pVar, Object[] objArr) {
        super(2);
        this.$span = pVar;
        this.$items = objArr;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new C0801c(m34687invoke_orMbw((C0809k) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: invoke-_-orMbw  reason: not valid java name */
    public final long m34687invoke_orMbw(C0809k kVar, int i) {
        C19383o.m32797g(kVar, "$this$null");
        return this.$span.invoke(kVar, this.$items[i]).f1700a;
    }
}
