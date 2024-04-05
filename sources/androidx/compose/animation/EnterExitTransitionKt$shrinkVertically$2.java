package androidx.compose.animation;

import androidx.compose.foundation.layout.C0761x;
import kotlin.jvm.internal.Lambda;
import p174m0.C7290i;
import p753kq.C19857l;

final class EnterExitTransitionKt$shrinkVertically$2 extends Lambda implements C19857l<C7290i, C7290i> {
    public final /* synthetic */ C19857l<Integer, Integer> $targetHeight;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$shrinkVertically$2(C19857l<? super Integer, Integer> lVar) {
        super(1);
        this.$targetHeight = lVar;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return new C7290i(m34625invokemzRDjE0(((C7290i) obj).f16171a));
    }

    /* renamed from: invoke-mzRDjE0  reason: not valid java name */
    public final long m34625invokemzRDjE0(long j) {
        return C0761x.m1707a((int) (j >> 32), this.$targetHeight.invoke(Integer.valueOf(C7290i.m13995b(j))).intValue());
    }
}
