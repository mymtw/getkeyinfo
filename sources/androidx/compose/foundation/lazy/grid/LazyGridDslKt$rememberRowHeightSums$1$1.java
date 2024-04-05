package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0759v;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7280a;
import p174m0.C7282b;
import p753kq.C19861p;

final class LazyGridDslKt$rememberRowHeightSums$1$1 extends Lambda implements C19861p<C7282b, C7280a, List<Integer>> {
    public final /* synthetic */ C0759v $contentPadding;
    public final /* synthetic */ C0800b $rows;
    public final /* synthetic */ C0718d.C0729k $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$rememberRowHeightSums$1$1(C0759v vVar, C0800b bVar, C0718d.C0729k kVar) {
        super(2);
        this.$contentPadding = vVar;
        this.$rows = bVar;
        this.$verticalArrangement = kVar;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m34691invoke0kLqBqw((C7282b) obj, ((C7280a) obj2).f16152a);
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final List<Integer> m34691invoke0kLqBqw(C7282b bVar, long j) {
        C19383o.m32797g(bVar, "$this$null");
        if (C7280a.m13962g(j) != Integer.MAX_VALUE) {
            float d = this.$contentPadding.mo4153d();
            C7280a.m13962g(j);
            bVar.mo3791V(this.$contentPadding.mo4150a() + d);
            C0800b bVar2 = this.$rows;
            bVar.mo3791V(this.$verticalArrangement.mo4094a());
            ArrayList q1 = C19327t.m32661q1(bVar2.mo4332a());
            int size = q1.size();
            for (int i = 1; i < size; i++) {
                q1.set(i, Integer.valueOf(((Number) q1.get(i - 1)).intValue() + ((Number) q1.get(i)).intValue()));
            }
            return q1;
        }
        throw new IllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.".toString());
    }
}
