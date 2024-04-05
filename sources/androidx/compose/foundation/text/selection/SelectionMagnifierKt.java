package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.C0428h;
import androidx.compose.animation.core.C0429h0;
import androidx.compose.animation.core.C0437l0;
import androidx.compose.animation.core.VectorConvertersKt;
import kotlin.reflect.C19421p;
import p288y.C8343c;

public final class SelectionMagnifierKt {

    /* renamed from: a */
    public static final C0428h f2059a = new C0428h(Float.NaN, Float.NaN);

    /* renamed from: b */
    public static final C0437l0 f2060b = VectorConvertersKt.m1104a(SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1.INSTANCE, SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2.INSTANCE);

    /* renamed from: c */
    public static final long f2061c;

    /* renamed from: d */
    public static final C0429h0<C8343c> f2062d;

    static {
        long q = C19421p.m32952q(0.01f, 0.01f);
        f2061c = q;
        f2062d = new C0429h0<>(new C8343c(q), 3);
    }
}
