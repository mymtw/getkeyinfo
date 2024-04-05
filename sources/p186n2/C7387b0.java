package p186n2;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: n2.b0 */
public class C7387b0 extends C7376a0 {

    /* renamed from: J */
    public static boolean f16509J = true;

    @SuppressLint({"NewApi"})
    /* renamed from: u */
    public void mo19739u(View view, int i, int i2, int i3, int i4) {
        if (f16509J) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f16509J = false;
            }
        }
    }
}
