package p513bj;

import java.util.Arrays;

/* renamed from: bj.x */
public final class C14085x<V> {

    /* renamed from: a */
    public long[] f31013a = new long[10];

    /* renamed from: b */
    public V[] f31014b = new Object[10];

    /* renamed from: c */
    public int f31015c;

    /* renamed from: d */
    public int f31016d;

    /* renamed from: a */
    public final synchronized void mo46952a(long j, V v) {
        int i = this.f31016d;
        if (i > 0) {
            if (j <= this.f31013a[((this.f31015c + i) - 1) % this.f31014b.length]) {
                mo46953b();
            }
        }
        mo46954c();
        int i2 = this.f31015c;
        int i3 = this.f31016d;
        V[] vArr = this.f31014b;
        int length = (i2 + i3) % vArr.length;
        this.f31013a[length] = j;
        vArr[length] = v;
        this.f31016d = i3 + 1;
    }

    /* renamed from: b */
    public final synchronized void mo46953b() {
        this.f31015c = 0;
        this.f31016d = 0;
        Arrays.fill(this.f31014b, (Object) null);
    }

    /* renamed from: c */
    public final void mo46954c() {
        int length = this.f31014b.length;
        if (this.f31016d >= length) {
            int i = length * 2;
            long[] jArr = new long[i];
            V[] vArr = new Object[i];
            int i2 = this.f31015c;
            int i3 = length - i2;
            System.arraycopy(this.f31013a, i2, jArr, 0, i3);
            System.arraycopy(this.f31014b, this.f31015c, vArr, 0, i3);
            int i4 = this.f31015c;
            if (i4 > 0) {
                System.arraycopy(this.f31013a, 0, jArr, i3, i4);
                System.arraycopy(this.f31014b, 0, vArr, i3, this.f31015c);
            }
            this.f31013a = jArr;
            this.f31014b = vArr;
            this.f31015c = 0;
        }
    }

    /* renamed from: d */
    public final V mo46955d(long j, boolean z) {
        V v = null;
        long j2 = Long.MAX_VALUE;
        while (this.f31016d > 0) {
            long j3 = j - this.f31013a[this.f31015c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            v = mo46956e();
            j2 = j3;
        }
        return v;
    }

    /* renamed from: e */
    public final V mo46956e() {
        C14075p.m21694f(this.f31016d > 0);
        V[] vArr = this.f31014b;
        int i = this.f31015c;
        V v = vArr[i];
        vArr[i] = null;
        this.f31015c = (i + 1) % vArr.length;
        this.f31016d--;
        return v;
    }
}
