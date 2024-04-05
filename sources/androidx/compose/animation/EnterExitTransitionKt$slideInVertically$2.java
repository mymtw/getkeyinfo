package androidx.compose.animation;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p174m0.C7287g;
import p174m0.C7290i;
import p753kq.C19857l;

final class EnterExitTransitionKt$slideInVertically$2 extends Lambda implements C19857l<C7290i, C7287g> {
    public final /* synthetic */ C19857l<Integer, Integer> $initialOffsetY;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$slideInVertically$2(C19857l<? super Integer, Integer> lVar) {
        super(1);
        this.$initialOffsetY = lVar;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return new C7287g(m34627invokemHKZG7I(((C7290i) obj).f16171a));
    }

    /* renamed from: invoke-mHKZG7I  reason: not valid java name */
    public final long m34627invokemHKZG7I(long j) {
        return C19421p.m32949o(0, this.$initialOffsetY.invoke(Integer.valueOf(C7290i.m13995b(j))).intValue());
    }
}
