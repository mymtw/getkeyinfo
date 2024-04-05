package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.style.C2032g;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$2 */
public final class SaversKt$TextGeometricTransformSaver$2 extends Lambda implements C19857l<Object, C2032g> {
    public static final SaversKt$TextGeometricTransformSaver$2 INSTANCE = new SaversKt$TextGeometricTransformSaver$2();

    public SaversKt$TextGeometricTransformSaver$2() {
        super(1);
    }

    public final C2032g invoke(Object obj) {
        C19383o.m32797g(obj, "it");
        List list = (List) obj;
        return new C2032g(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
    }
}
