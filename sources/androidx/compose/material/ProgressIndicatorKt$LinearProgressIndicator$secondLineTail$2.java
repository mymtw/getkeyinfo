package androidx.compose.material;

import androidx.compose.animation.core.C0414b0;
import androidx.compose.animation.core.C0438m;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2 extends Lambda implements C19857l<C0414b0.C0416b<Float>, C19394m> {
    public static final ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2 INSTANCE = new ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2();

    public ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C0414b0.C0416b<Float>) (C0414b0.C0416b) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C0414b0.C0416b<Float> bVar) {
        C19383o.m32797g(bVar, "$this$keyframes");
        bVar.f1089a = 1800;
        C0414b0.C0415a a = bVar.mo3476a(1267, Float.valueOf(0.0f));
        C0438m mVar = C1193i1.f2479g;
        C19383o.m32797g(mVar, "easing");
        a.f1088b = mVar;
        bVar.mo3476a(1800, Float.valueOf(1.0f));
    }
}
