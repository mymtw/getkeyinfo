package androidx.compose.p015ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;

/* renamed from: androidx.compose.ui.platform.d0 */
public final class C1824d0 implements C1818b0 {

    /* renamed from: a */
    public final Matrix f4084a = new Matrix();

    /* renamed from: b */
    public final int[] f4085b = new int[2];

    /* renamed from: a */
    public void mo7197a(View view, float[] fArr) {
        C19383o.m32797g(view, "view");
        C19383o.m32797g(fArr, "matrix");
        this.f4084a.reset();
        view.transformMatrixToGlobal(this.f4084a);
        ViewParent viewParent = view.getParent();
        while (viewParent instanceof View) {
            view = (View) viewParent;
            viewParent = view.getParent();
        }
        view.getLocationOnScreen(this.f4085b);
        int[] iArr = this.f4085b;
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f4085b;
        this.f4084a.postTranslate((float) (iArr2[0] - i), (float) (iArr2[1] - i2));
        C18263b.m30855m0(this.f4084a, fArr);
    }
}
