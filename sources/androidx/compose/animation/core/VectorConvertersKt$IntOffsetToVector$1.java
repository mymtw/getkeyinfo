package androidx.compose.animation.core;

import kotlin.jvm.internal.Lambda;
import p174m0.C7287g;
import p753kq.C19857l;

public final class VectorConvertersKt$IntOffsetToVector$1 extends Lambda implements C19857l<C7287g, C0428h> {
    public static final VectorConvertersKt$IntOffsetToVector$1 INSTANCE = new VectorConvertersKt$IntOffsetToVector$1();

    public VectorConvertersKt$IntOffsetToVector$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m34637invokegyyYBs(((C7287g) obj).f16166a);
    }

    /* renamed from: invoke--gyyYBs  reason: not valid java name */
    public final C0428h m34637invokegyyYBs(long j) {
        return new C0428h((float) ((int) (j >> 32)), (float) C7287g.m13992b(j));
    }
}
