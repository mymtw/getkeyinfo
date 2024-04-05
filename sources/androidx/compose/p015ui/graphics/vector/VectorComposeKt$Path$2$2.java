package androidx.compose.p015ui.graphics.vector;

import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2 */
public final class VectorComposeKt$Path$2$2 extends Lambda implements C19861p<PathComponent, List<? extends C1556d>, C19394m> {
    public static final VectorComposeKt$Path$2$2 INSTANCE = new VectorComposeKt$Path$2$2();

    public VectorComposeKt$Path$2$2() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PathComponent) obj, (List<? extends C1556d>) (List) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(PathComponent pathComponent, List<? extends C1556d> list) {
        C19383o.m32797g(pathComponent, "$this$set");
        C19383o.m32797g(list, "it");
        pathComponent.f3372d = list;
        pathComponent.f3382n = true;
        pathComponent.mo6510c();
    }
}
