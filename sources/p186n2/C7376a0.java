package p186n2;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: n2.a0 */
public class C7376a0 extends C7442z {

    /* renamed from: H */
    public static boolean f16491H = true;

    /* renamed from: I */
    public static boolean f16492I = true;

    @SuppressLint({"NewApi"})
    /* renamed from: s */
    public void mo19716s(View view, Matrix matrix) {
        if (f16491H) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f16491H = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: t */
    public void mo19717t(View view, Matrix matrix) {
        if (f16492I) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f16492I = false;
            }
        }
    }
}
