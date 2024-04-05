package androidx.compose.animation.core;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class VectorConvertersKt$FloatToVector$1 extends Lambda implements C19857l<Float, C0426g> {
    public static final VectorConvertersKt$FloatToVector$1 INSTANCE = new VectorConvertersKt$FloatToVector$1();

    public VectorConvertersKt$FloatToVector$1() {
        super(1);
    }

    public final C0426g invoke(float f) {
        return new C0426g(f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }
}
