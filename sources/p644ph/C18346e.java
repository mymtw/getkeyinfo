package p644ph;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p505aj.C13997e;
import p513bj.C14049b0;

/* renamed from: ph.e */
public final class C18346e implements C18350i {

    /* renamed from: a */
    public final byte[] f40291a = new byte[RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT];

    /* renamed from: b */
    public final C13997e f40292b;

    /* renamed from: c */
    public final long f40293c;

    /* renamed from: d */
    public long f40294d;

    /* renamed from: e */
    public byte[] f40295e = new byte[65536];

    /* renamed from: f */
    public int f40296f;

    /* renamed from: g */
    public int f40297g;

    public C18346e(C13997e eVar, long j, long j2) {
        this.f40292b = eVar;
        this.f40294d = j;
        this.f40293c = j2;
    }

    /* renamed from: a */
    public final void mo69871a(int i, int i2, byte[] bArr) throws IOException {
        mo69872c(bArr, i, i2, false);
    }

    /* renamed from: c */
    public final boolean mo69872c(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!mo69880k(i2, z)) {
            return false;
        }
        System.arraycopy(this.f40295e, this.f40296f - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: f */
    public final void mo69873f() {
        this.f40296f = 0;
    }

    /* renamed from: g */
    public final boolean mo69874g(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int i3;
        int i4 = this.f40297g;
        if (i4 == 0) {
            i3 = 0;
        } else {
            i3 = Math.min(i4, i2);
            System.arraycopy(this.f40295e, 0, bArr, i, i3);
            mo69885p(i3);
        }
        int i5 = i3;
        while (i5 < i2 && i5 != -1) {
            i5 = mo69883n(i, z, bArr, i2, i5);
        }
        if (i5 != -1) {
            this.f40294d += (long) i5;
        }
        return i5 != -1;
    }

    public final long getLength() {
        return this.f40293c;
    }

    public final long getPosition() {
        return this.f40294d;
    }

    /* renamed from: h */
    public final long mo69877h() {
        return this.f40294d + ((long) this.f40296f);
    }

    /* renamed from: i */
    public final void mo69878i(int i) throws IOException {
        mo69880k(i, false);
    }

    /* renamed from: j */
    public final void mo69879j(int i) throws IOException {
        int min = Math.min(this.f40297g, i);
        mo69885p(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            i2 = mo69883n(-i2, false, this.f40291a, Math.min(i, this.f40291a.length + i2), i2);
        }
        if (i2 != -1) {
            this.f40294d += (long) i2;
        }
    }

    /* renamed from: k */
    public final boolean mo69880k(int i, boolean z) throws IOException {
        mo69881l(i);
        int i2 = this.f40297g - this.f40296f;
        while (i2 < i) {
            i2 = mo69883n(this.f40296f, z, this.f40295e, i, i2);
            if (i2 == -1) {
                return false;
            }
            this.f40297g = this.f40296f + i2;
        }
        this.f40296f += i;
        return true;
    }

    /* renamed from: l */
    public final void mo69881l(int i) {
        int i2 = this.f40296f + i;
        byte[] bArr = this.f40295e;
        if (i2 > bArr.length) {
            this.f40295e = Arrays.copyOf(this.f40295e, C14049b0.m21636i(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: m */
    public final int mo69882m(int i, int i2, byte[] bArr) throws IOException {
        int i3;
        mo69881l(i2);
        int i4 = this.f40297g;
        int i5 = this.f40296f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            i3 = mo69883n(i5, true, this.f40295e, i2, 0);
            if (i3 == -1) {
                return -1;
            }
            this.f40297g += i3;
        } else {
            i3 = Math.min(i2, i6);
        }
        System.arraycopy(this.f40295e, this.f40296f, bArr, i, i3);
        this.f40296f += i3;
        return i3;
    }

    /* renamed from: n */
    public final int mo69883n(int i, boolean z, byte[] bArr, int i2, int i3) throws IOException {
        if (!Thread.interrupted()) {
            int read = this.f40292b.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    /* renamed from: o */
    public final int mo69884o() throws IOException {
        int min = Math.min(this.f40297g, 1);
        mo69885p(min);
        if (min == 0) {
            byte[] bArr = this.f40291a;
            min = mo69883n(0, true, bArr, Math.min(1, bArr.length), 0);
        }
        if (min != -1) {
            this.f40294d += (long) min;
        }
        return min;
    }

    /* renamed from: p */
    public final void mo69885p(int i) {
        int i2 = this.f40297g - i;
        this.f40297g = i2;
        this.f40296f = 0;
        byte[] bArr = this.f40295e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[(65536 + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f40295e = bArr2;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f40297g;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.f40295e, 0, bArr, i, min);
            mo69885p(min);
            i4 = min;
        }
        if (i4 == 0) {
            i4 = mo69883n(i, true, bArr, i2, 0);
        }
        if (i4 != -1) {
            this.f40294d += (long) i4;
        }
        return i4;
    }

    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        mo69874g(bArr, i, i2, false);
    }
}
