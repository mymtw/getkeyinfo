package p717yh;

import java.util.Arrays;
import p513bj.C14075p;

/* renamed from: yh.r */
public final class C18872r {

    /* renamed from: a */
    public final int f42003a;

    /* renamed from: b */
    public boolean f42004b;

    /* renamed from: c */
    public boolean f42005c;

    /* renamed from: d */
    public byte[] f42006d;

    /* renamed from: e */
    public int f42007e;

    public C18872r(int i) {
        this.f42003a = i;
        byte[] bArr = new byte[131];
        this.f42006d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public final void mo70305a(int i, int i2, byte[] bArr) {
        if (this.f42004b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f42006d;
            int length = bArr2.length;
            int i4 = this.f42007e;
            if (length < i4 + i3) {
                this.f42006d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f42006d, this.f42007e, i3);
            this.f42007e += i3;
        }
    }

    /* renamed from: b */
    public final boolean mo70306b(int i) {
        if (!this.f42004b) {
            return false;
        }
        this.f42007e -= i;
        this.f42004b = false;
        this.f42005c = true;
        return true;
    }

    /* renamed from: c */
    public final void mo70307c() {
        this.f42004b = false;
        this.f42005c = false;
    }

    /* renamed from: d */
    public final void mo70308d(int i) {
        boolean z = true;
        C14075p.m21694f(!this.f42004b);
        if (i != this.f42003a) {
            z = false;
        }
        this.f42004b = z;
        if (z) {
            this.f42007e = 3;
            this.f42005c = false;
        }
    }
}
