package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.style.C2032g;
import androidx.compose.runtime.saveable.C1375i;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p568fn.C17782b;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$1 */
public final class SaversKt$TextGeometricTransformSaver$1 extends Lambda implements C19861p<C1375i, C2032g, Object> {
    public static final SaversKt$TextGeometricTransformSaver$1 INSTANCE = new SaversKt$TextGeometricTransformSaver$1();

    public SaversKt$TextGeometricTransformSaver$1() {
        super(2);
    }

    public final Object invoke(C1375i iVar, C2032g gVar) {
        C19383o.m32797g(iVar, "$this$Saver");
        C19383o.m32797g(gVar, "it");
        return C17782b.m29888u(Float.valueOf(gVar.f4618a), Float.valueOf(gVar.f4619b));
    }
}
