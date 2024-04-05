package androidx.compose.p015ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.foundation.layout.C0761x;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;

/* renamed from: androidx.compose.ui.platform.c0 */
public final class C1821c0 implements C1818b0 {

    /* renamed from: a */
    public final int[] f4077a = new int[2];

    /* renamed from: b */
    public final float[] f4078b = C0761x.m1671I();

    /* renamed from: a */
    public final void mo7197a(View view, float[] fArr) {
        C19383o.m32797g(view, "view");
        C19383o.m32797g(fArr, "matrix");
        C0761x.m1666F0(fArr);
        mo7201c(view, fArr);
    }

    /* renamed from: b */
    public final void mo7200b(float[] fArr, float f, float f2) {
        C0761x.m1666F0(this.f4078b);
        C0761x.m1702X0(this.f4078b, f, f2);
        AndroidComposeView_androidKt.m3930a(fArr, this.f4078b);
    }

    /* renamed from: c */
    public final void mo7201c(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            mo7201c((View) parent, fArr);
            mo7200b(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            mo7200b(fArr, (float) view.getLeft(), (float) view.getTop());
        } else {
            int[] iArr = this.f4077a;
            view.getLocationInWindow(iArr);
            mo7200b(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            mo7200b(fArr, (float) iArr[0], (float) iArr[1]);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            C18263b.m30855m0(matrix, this.f4078b);
            AndroidComposeView_androidKt.m3930a(fArr, this.f4078b);
        }
    }
}
