package p138i4;

import android.util.Log;
import androidx.compose.animation.C0472h;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* renamed from: i4.d */
public final class C6991d {

    /* renamed from: a */
    public final byte[] f15507a = new byte[256];

    /* renamed from: b */
    public ByteBuffer f15508b;

    /* renamed from: c */
    public C6990c f15509c;

    /* renamed from: d */
    public int f15510d = 0;

    /* renamed from: a */
    public final boolean mo19165a() {
        return this.f15509c.f15496b != 0;
    }

    /* renamed from: b */
    public final C6990c mo19166b() {
        if (this.f15508b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (mo19165a()) {
            return this.f15509c;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                sb.append((char) mo19167c());
            }
            if (!sb.toString().startsWith("GIF")) {
                this.f15509c.f15496b = 1;
            } else {
                this.f15509c.f15500f = mo19170f();
                this.f15509c.f15501g = mo19170f();
                int c = mo19167c();
                C6990c cVar = this.f15509c;
                cVar.f15502h = (c & 128) != 0;
                cVar.f15503i = (int) Math.pow(2.0d, (double) ((c & 7) + 1));
                this.f15509c.f15504j = mo19167c();
                C6990c cVar2 = this.f15509c;
                mo19167c();
                cVar2.getClass();
                if (this.f15509c.f15502h && !mo19165a()) {
                    C6990c cVar3 = this.f15509c;
                    cVar3.f15495a = mo19169e(cVar3.f15503i);
                    C6990c cVar4 = this.f15509c;
                    cVar4.f15505k = cVar4.f15495a[cVar4.f15504j];
                }
            }
            if (!mo19165a()) {
                boolean z = false;
                while (!z && !mo19165a() && this.f15509c.f15497c <= Integer.MAX_VALUE) {
                    int c2 = mo19167c();
                    if (c2 == 33) {
                        int c3 = mo19167c();
                        if (c3 == 1) {
                            mo19171g();
                        } else if (c3 == 249) {
                            this.f15509c.f15498d = new C6989b();
                            mo19167c();
                            int c4 = mo19167c();
                            C6989b bVar = this.f15509c.f15498d;
                            int i2 = (c4 & 28) >> 2;
                            bVar.f15490g = i2;
                            if (i2 == 0) {
                                bVar.f15490g = 1;
                            }
                            bVar.f15489f = (c4 & 1) != 0;
                            int f = mo19170f();
                            if (f < 2) {
                                f = 10;
                            }
                            C6989b bVar2 = this.f15509c.f15498d;
                            bVar2.f15492i = f * 10;
                            bVar2.f15491h = mo19167c();
                            mo19167c();
                        } else if (c3 == 254) {
                            mo19171g();
                        } else if (c3 != 255) {
                            mo19171g();
                        } else {
                            mo19168d();
                            StringBuilder sb2 = new StringBuilder();
                            for (int i3 = 0; i3 < 11; i3++) {
                                sb2.append((char) this.f15507a[i3]);
                            }
                            if (sb2.toString().equals("NETSCAPE2.0")) {
                                do {
                                    mo19168d();
                                    byte[] bArr = this.f15507a;
                                    if (bArr[0] == 1) {
                                        this.f15509c.f15506l = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
                                    }
                                    if (this.f15510d <= 0) {
                                        break;
                                    }
                                } while (mo19165a());
                            } else {
                                mo19171g();
                            }
                        }
                    } else if (c2 == 44) {
                        C6990c cVar5 = this.f15509c;
                        if (cVar5.f15498d == null) {
                            cVar5.f15498d = new C6989b();
                        }
                        this.f15509c.f15498d.f15484a = mo19170f();
                        this.f15509c.f15498d.f15485b = mo19170f();
                        this.f15509c.f15498d.f15486c = mo19170f();
                        this.f15509c.f15498d.f15487d = mo19170f();
                        int c5 = mo19167c();
                        boolean z2 = (c5 & 128) != 0;
                        int pow = (int) Math.pow(2.0d, (double) ((c5 & 7) + 1));
                        C6989b bVar3 = this.f15509c.f15498d;
                        bVar3.f15488e = (c5 & 64) != 0;
                        if (z2) {
                            bVar3.f15494k = mo19169e(pow);
                        } else {
                            bVar3.f15494k = null;
                        }
                        this.f15509c.f15498d.f15493j = this.f15508b.position();
                        mo19167c();
                        mo19171g();
                        if (!mo19165a()) {
                            C6990c cVar6 = this.f15509c;
                            cVar6.f15497c++;
                            cVar6.f15499e.add(cVar6.f15498d);
                        }
                    } else if (c2 != 59) {
                        this.f15509c.f15496b = 1;
                    } else {
                        z = true;
                    }
                }
                C6990c cVar7 = this.f15509c;
                if (cVar7.f15497c < 0) {
                    cVar7.f15496b = 1;
                }
            }
            return this.f15509c;
        }
    }

    /* renamed from: c */
    public final int mo19167c() {
        try {
            return this.f15508b.get() & 255;
        } catch (Exception unused) {
            this.f15509c.f15496b = 1;
            return 0;
        }
    }

    /* renamed from: d */
    public final void mo19168d() {
        int c = mo19167c();
        this.f15510d = c;
        if (c > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    int i3 = this.f15510d;
                    if (i < i3) {
                        i2 = i3 - i;
                        this.f15508b.get(this.f15507a, i, i2);
                        i += i2;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder g = C0472h.m1244g("Error Reading Block n: ", i, " count: ", i2, " blockSize: ");
                        g.append(this.f15510d);
                        Log.d("GifHeaderParser", g.toString(), e);
                    }
                    this.f15509c.f15496b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public final int[] mo19169e(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f15508b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f15509c.f15496b = 1;
        }
        return iArr;
    }

    /* renamed from: f */
    public final int mo19170f() {
        return this.f15508b.getShort();
    }

    /* renamed from: g */
    public final void mo19171g() {
        int c;
        do {
            c = mo19167c();
            this.f15508b.position(Math.min(this.f15508b.position() + c, this.f15508b.limit()));
        } while (c > 0);
    }
}
