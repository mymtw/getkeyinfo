package p186n2;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: n2.d0 */
public final class C7392d0 extends C7389c0 {
    /* renamed from: p */
    public final void mo19740p(int i, View view) {
        view.setTransitionVisibility(i);
    }

    /* renamed from: q */
    public final float mo19746q(View view) {
        return view.getTransitionAlpha();
    }

    /* renamed from: r */
    public final void mo19747r(float f, View view) {
        view.setTransitionAlpha(f);
    }

    /* renamed from: s */
    public final void mo19716s(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: t */
    public final void mo19717t(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    /* renamed from: u */
    public final void mo19739u(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }
}
