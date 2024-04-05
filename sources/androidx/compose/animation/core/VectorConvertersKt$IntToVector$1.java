package androidx.compose.animation.core;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class VectorConvertersKt$IntToVector$1 extends Lambda implements C19857l<Integer, C0426g> {
    public static final VectorConvertersKt$IntToVector$1 INSTANCE = new VectorConvertersKt$IntToVector$1();

    public VectorConvertersKt$IntToVector$1() {
        super(1);
    }

    public final C0426g invoke(int i) {
        return new C0426g((float) i);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
