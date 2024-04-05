package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import p513bj.C14049b0;

/* renamed from: com.google.android.exoplayer2.audio.h */
public final class C14199h extends C14193c {

    /* renamed from: i */
    public final long f31458i = 150000;

    /* renamed from: j */
    public final long f31459j = 20000;

    /* renamed from: k */
    public final short f31460k = 1024;

    /* renamed from: l */
    public int f31461l;

    /* renamed from: m */
    public boolean f31462m;

    /* renamed from: n */
    public byte[] f31463n;

    /* renamed from: o */
    public byte[] f31464o;

    /* renamed from: p */
    public int f31465p;

    /* renamed from: q */
    public int f31466q;

    /* renamed from: r */
    public int f31467r;

    /* renamed from: s */
    public boolean f31468s;

    /* renamed from: t */
    public long f31469t;

    public C14199h() {
        byte[] bArr = C14049b0.f30918f;
        this.f31463n = bArr;
        this.f31464o = bArr;
    }

    /* renamed from: b */
    public final void mo47177b(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f31441g.hasRemaining()) {
            int i = this.f31465p;
            if (i == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f31463n.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs(byteBuffer.getShort(limit2)) > this.f31460k) {
                            int i2 = this.f31461l;
                            position = ((limit2 / i2) * i2) + i2;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f31465p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    mo47257i(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f31468s = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i == 1) {
                int limit3 = byteBuffer.limit();
                int j = mo47264j(byteBuffer);
                int position2 = j - byteBuffer.position();
                byte[] bArr = this.f31463n;
                int length = bArr.length;
                int i3 = this.f31466q;
                int i4 = length - i3;
                if (j >= limit3 || position2 >= i4) {
                    int min = Math.min(position2, i4);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f31463n, this.f31466q, min);
                    int i5 = this.f31466q + min;
                    this.f31466q = i5;
                    byte[] bArr2 = this.f31463n;
                    if (i5 == bArr2.length) {
                        if (this.f31468s) {
                            mo47265k(this.f31467r, bArr2);
                            this.f31469t += (long) ((this.f31466q - (this.f31467r * 2)) / this.f31461l);
                        } else {
                            this.f31469t += (long) ((i5 - this.f31467r) / this.f31461l);
                        }
                        mo47266l(byteBuffer, this.f31463n, this.f31466q);
                        this.f31466q = 0;
                        this.f31465p = 2;
                    }
                    byteBuffer.limit(limit3);
                } else {
                    mo47265k(i3, bArr);
                    this.f31466q = 0;
                    this.f31465p = 0;
                }
            } else if (i == 2) {
                int limit4 = byteBuffer.limit();
                int j2 = mo47264j(byteBuffer);
                byteBuffer.limit(j2);
                this.f31469t += (long) (byteBuffer.remaining() / this.f31461l);
                mo47266l(byteBuffer, this.f31464o, this.f31467r);
                if (j2 < limit4) {
                    mo47265k(this.f31467r, this.f31464o);
                    this.f31465p = 0;
                    byteBuffer.limit(limit4);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: e */
    public final AudioProcessor.C14178a mo47253e(AudioProcessor.C14178a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f31323c == 2) {
            return this.f31462m ? aVar : AudioProcessor.C14178a.f31320e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    /* renamed from: f */
    public final void mo47254f() {
        if (this.f31462m) {
            AudioProcessor.C14178a aVar = this.f31436b;
            int i = aVar.f31324d;
            this.f31461l = i;
            long j = this.f31458i;
            int i2 = aVar.f31321a;
            int i3 = ((int) ((j * ((long) i2)) / 1000000)) * i;
            if (this.f31463n.length != i3) {
                this.f31463n = new byte[i3];
            }
            int i4 = ((int) ((this.f31459j * ((long) i2)) / 1000000)) * i;
            this.f31467r = i4;
            if (this.f31464o.length != i4) {
                this.f31464o = new byte[i4];
            }
        }
        this.f31465p = 0;
        this.f31469t = 0;
        this.f31466q = 0;
        this.f31468s = false;
    }

    /* renamed from: g */
    public final void mo47255g() {
        int i = this.f31466q;
        if (i > 0) {
            mo47265k(i, this.f31463n);
        }
        if (!this.f31468s) {
            this.f31469t += (long) (this.f31467r / this.f31461l);
        }
    }

    /* renamed from: h */
    public final void mo47256h() {
        this.f31462m = false;
        this.f31467r = 0;
        byte[] bArr = C14049b0.f30918f;
        this.f31463n = bArr;
        this.f31464o = bArr;
    }

    public final boolean isActive() {
        return this.f31462m;
    }

    /* renamed from: j */
    public final int mo47264j(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > this.f31460k) {
                int i = this.f31461l;
                return (position / i) * i;
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: k */
    public final void mo47265k(int i, byte[] bArr) {
        mo47257i(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f31468s = true;
        }
    }

    /* renamed from: l */
    public final void mo47266l(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f31467r);
        int i2 = this.f31467r - min;
        System.arraycopy(bArr, i - i2, this.f31464o, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f31464o, i2, min);
    }
}
