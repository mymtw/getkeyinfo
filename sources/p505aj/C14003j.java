package p505aj;

import java.util.Arrays;
import p513bj.C14049b0;

/* renamed from: aj.j */
public final class C14003j {

    /* renamed from: a */
    public final boolean f30784a = true;

    /* renamed from: b */
    public final int f30785b = 65536;

    /* renamed from: c */
    public final C13990a[] f30786c = new C13990a[1];

    /* renamed from: d */
    public int f30787d;

    /* renamed from: e */
    public int f30788e;

    /* renamed from: f */
    public int f30789f = 0;

    /* renamed from: g */
    public C13990a[] f30790g = new C13990a[100];

    /* renamed from: a */
    public final synchronized void mo46823a(C13990a[] aVarArr) {
        int i = this.f30789f;
        int length = aVarArr.length + i;
        C13990a[] aVarArr2 = this.f30790g;
        if (length >= aVarArr2.length) {
            this.f30790g = (C13990a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i + aVarArr.length));
        }
        for (C13990a aVar : aVarArr) {
            C13990a[] aVarArr3 = this.f30790g;
            int i2 = this.f30789f;
            this.f30789f = i2 + 1;
            aVarArr3[i2] = aVar;
        }
        this.f30788e -= aVarArr.length;
        notifyAll();
    }

    /* renamed from: b */
    public final synchronized void mo46824b() {
        int i = this.f30787d;
        int i2 = this.f30785b;
        int i3 = C14049b0.f30913a;
        int max = Math.max(0, (((i + i2) - 1) / i2) - this.f30788e);
        int i4 = this.f30789f;
        if (max < i4) {
            Arrays.fill(this.f30790g, max, i4, (Object) null);
            this.f30789f = max;
        }
    }
}
