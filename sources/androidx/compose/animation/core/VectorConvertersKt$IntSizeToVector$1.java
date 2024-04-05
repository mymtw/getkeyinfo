package androidx.compose.animation.core;

import kotlin.jvm.internal.Lambda;
import p174m0.C7290i;
import p753kq.C19857l;

public final class VectorConvertersKt$IntSizeToVector$1 extends Lambda implements C19857l<C7290i, C0428h> {
    public static final VectorConvertersKt$IntSizeToVector$1 INSTANCE = new VectorConvertersKt$IntSizeToVector$1();

    public VectorConvertersKt$IntSizeToVector$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m34639invokeozmzZPI(((C7290i) obj).f16171a);
    }

    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final C0428h m34639invokeozmzZPI(long j) {
        return new C0428h((float) ((int) (j >> 32)), (float) C7290i.m13995b(j));
    }
}
