package androidx.compose.p015ui.platform;

import android.graphics.Matrix;
import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.platform.ViewLayer$Companion$getMatrix$1 */
public final class ViewLayer$Companion$getMatrix$1 extends Lambda implements C19861p<View, Matrix, C19394m> {
    public static final ViewLayer$Companion$getMatrix$1 INSTANCE = new ViewLayer$Companion$getMatrix$1();

    public ViewLayer$Companion$getMatrix$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((View) obj, (Matrix) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(View view, Matrix matrix) {
        C19383o.m32797g(view, "view");
        C19383o.m32797g(matrix, "matrix");
        matrix.set(view.getMatrix());
    }
}
