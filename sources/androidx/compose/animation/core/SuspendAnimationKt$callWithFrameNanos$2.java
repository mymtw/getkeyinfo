package androidx.compose.animation.core;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class SuspendAnimationKt$callWithFrameNanos$2 extends Lambda implements C19857l<Long, Object> {
    public final /* synthetic */ C19857l<Long, Object> $onFrame;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$callWithFrameNanos$2(C19857l<? super Long, Object> lVar) {
        super(1);
        this.$onFrame = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).longValue());
    }

    public final Object invoke(long j) {
        return this.$onFrame.invoke(Long.valueOf(j / 1));
    }
}
