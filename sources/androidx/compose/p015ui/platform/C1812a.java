package androidx.compose.p015ui.platform;

import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.a */
public abstract class C1812a implements C1829f {

    /* renamed from: a */
    public String f4064a;

    /* renamed from: b */
    public final int[] f4065b = new int[2];

    /* renamed from: c */
    public final int[] mo7179c(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.f4065b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    /* renamed from: d */
    public final String mo7180d() {
        String str = this.f4064a;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("text");
        throw null;
    }
}
