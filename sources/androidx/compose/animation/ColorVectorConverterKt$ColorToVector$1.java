package androidx.compose.animation;

import androidx.compose.animation.core.C0430i;
import androidx.compose.animation.core.C0435k0;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.graphics.colorspace.C1505c;
import androidx.compose.p015ui.graphics.colorspace.ColorSpaces;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19857l;

public final class ColorVectorConverterKt$ColorToVector$1 extends Lambda implements C19857l<C1505c, C0435k0<C1545s, C0430i>> {
    public static final ColorVectorConverterKt$ColorToVector$1 INSTANCE = new ColorVectorConverterKt$ColorToVector$1();

    public ColorVectorConverterKt$ColorToVector$1() {
        super(1);
    }

    public final C0435k0<C1545s, C0430i> invoke(final C1505c cVar) {
        C19383o.m32797g(cVar, "colorSpace");
        return VectorConvertersKt.m1104a(C03821.INSTANCE, new C19857l<C0430i, C1545s>() {
            public /* synthetic */ Object invoke(Object obj) {
                return new C1545s(m34616invokevNxB06k((C0430i) obj));
            }

            /* renamed from: invoke-vNxB06k  reason: not valid java name */
            public final long m34616invokevNxB06k(C0430i iVar) {
                C19383o.m32797g(iVar, "it");
                double d = (double) 3.0f;
                float pow = (float) Math.pow((double) iVar.f1132b, d);
                float pow2 = (float) Math.pow((double) iVar.f1133c, d);
                float pow3 = (float) Math.pow((double) iVar.f1134d, d);
                float[] fArr = ColorVectorConverterKt.f977c;
                float a = ColorVectorConverterKt.m1030a(0, pow, pow2, pow3, fArr);
                float a2 = ColorVectorConverterKt.m1030a(1, pow, pow2, pow3, fArr);
                float a3 = ColorVectorConverterKt.m1030a(2, pow, pow2, pow3, fArr);
                return C1545s.m3355a(C18263b.m30832a(C19388s.m32831L(a, -2.0f, 2.0f), C19388s.m32831L(a2, -2.0f, 2.0f), C19388s.m32831L(a3, -2.0f, 2.0f), C19388s.m32831L(iVar.f1131a, 0.0f, 1.0f), ColorSpaces.f3240q), cVar);
            }
        });
    }
}
