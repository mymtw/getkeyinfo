package p743fr;

import androidx.core.internal.view.SupportMenu;

/* renamed from: fr.t */
public final class C19057t {

    /* renamed from: a */
    public int f42553a;

    /* renamed from: b */
    public final int[] f42554b = new int[10];

    /* renamed from: a */
    public final int mo70535a() {
        return (this.f42553a & 128) != 0 ? this.f42554b[7] : SupportMenu.USER_MASK;
    }

    /* renamed from: b */
    public final void mo70536b(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f42554b;
            if (i < iArr.length) {
                this.f42553a = (1 << i) | this.f42553a;
                iArr[i] = i2;
            }
        }
    }
}
