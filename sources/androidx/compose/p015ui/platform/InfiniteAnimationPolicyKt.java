package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.platform.C1851m0;
import kotlin.coroutines.C19340c;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.platform.InfiniteAnimationPolicyKt */
public final class InfiniteAnimationPolicyKt {
    /* renamed from: a */
    public static final <R> Object m3944a(C19857l<? super Long, ? extends R> lVar, C19340c<? super R> cVar) {
        C1851m0 m0Var = (C1851m0) cVar.getContext().get(C1851m0.C1852a.f4107b);
        if (m0Var == null) {
            return C18263b.m30871u0(lVar, cVar);
        }
        new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(lVar, (C19340c<? super InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2>) null);
        return m0Var.mo7267m0();
    }
}
