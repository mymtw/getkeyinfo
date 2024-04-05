package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.runtime.y */
public final class C1423y {

    /* renamed from: a */
    public int[] f3094a = new int[10];

    /* renamed from: b */
    public int f3095b;

    /* renamed from: a */
    public final int mo6114a() {
        int[] iArr = this.f3094a;
        int i = this.f3095b - 1;
        this.f3095b = i;
        return iArr[i];
    }

    /* renamed from: b */
    public final void mo6115b(int i) {
        int i2 = this.f3095b;
        int[] iArr = this.f3094a;
        if (i2 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            C19383o.m32796f(copyOf, "copyOf(this, newSize)");
            this.f3094a = copyOf;
        }
        int[] iArr2 = this.f3094a;
        int i3 = this.f3095b;
        this.f3095b = i3 + 1;
        iArr2[i3] = i;
    }
}
