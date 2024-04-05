package androidx.compose.p015ui.graphics.vector;

import android.graphics.Path;
import androidx.compose.p015ui.graphics.C1494c0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3 */
public final class VectorComposeKt$Path$2$3 extends Lambda implements C19861p<PathComponent, C1494c0, C19394m> {
    public static final VectorComposeKt$Path$2$3 INSTANCE = new VectorComposeKt$Path$2$3();

    public VectorComposeKt$Path$2$3() {
        super(2);
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        m34772invokepweu1eQ((PathComponent) obj, ((C1494c0) obj2).f3223a);
        return C19394m.f43287a;
    }

    /* renamed from: invoke-pweu1eQ  reason: not valid java name */
    public final void m34772invokepweu1eQ(PathComponent pathComponent, int i) {
        C19383o.m32797g(pathComponent, "$this$set");
        Path path = pathComponent.f3387s.f3296a;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        path.setFillType(z ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
        pathComponent.mo6510c();
    }
}
