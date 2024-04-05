package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

public final class LazyGridDslKt$itemsIndexed$8 extends Lambda implements C19861p<C0809k, Integer, C0801c> {
    public final /* synthetic */ Object[] $items;
    public final /* synthetic */ C19862q<C0809k, Integer, Object, C0801c> $span;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$itemsIndexed$8(C19862q<? super C0809k, ? super Integer, Object, C0801c> qVar, Object[] objArr) {
        super(2);
        this.$span = qVar;
        this.$items = objArr;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new C0801c(m34689invoke_orMbw((C0809k) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: invoke-_-orMbw  reason: not valid java name */
    public final long m34689invoke_orMbw(C0809k kVar, int i) {
        C19383o.m32797g(kVar, "$this$null");
        return this.$span.invoke(kVar, Integer.valueOf(i), this.$items[i]).f1700a;
    }
}
