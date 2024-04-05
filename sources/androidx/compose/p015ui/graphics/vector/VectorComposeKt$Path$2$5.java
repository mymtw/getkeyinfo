package androidx.compose.p015ui.graphics.vector;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5 */
public final class VectorComposeKt$Path$2$5 extends Lambda implements C19861p<PathComponent, Float, C19394m> {
    public static final VectorComposeKt$Path$2$5 INSTANCE = new VectorComposeKt$Path$2$5();

    public VectorComposeKt$Path$2$5() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PathComponent) obj, ((Number) obj2).floatValue());
        return C19394m.f43287a;
    }

    public final void invoke(PathComponent pathComponent, float f) {
        C19383o.m32797g(pathComponent, "$this$set");
        pathComponent.f3371c = f;
        pathComponent.mo6510c();
    }
}
