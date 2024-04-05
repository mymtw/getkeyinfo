package androidx.compose.animation.core;

import androidx.compose.p015ui.platform.C1851m0;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: androidx.compose.animation.core.y */
public final class C0464y {
    /* renamed from: a */
    public static final Object m1233a(C19857l lVar, ContinuationImpl continuationImpl) {
        C1851m0 m0Var = (C1851m0) continuationImpl.getContext().get(C1851m0.C1852a.f4107b);
        if (m0Var == null) {
            return C18263b.m30871u0(lVar, continuationImpl);
        }
        new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(lVar, (C19340c<? super InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2>) null);
        return m0Var.mo7267m0();
    }
}
