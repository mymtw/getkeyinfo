package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import p513bj.C14049b0;

/* renamed from: com.google.android.exoplayer2.audio.j */
public final class C14201j extends C14193c {

    /* renamed from: i */
    public int f31485i;

    /* renamed from: j */
    public int f31486j;

    /* renamed from: k */
    public boolean f31487k;

    /* renamed from: l */
    public int f31488l;

    /* renamed from: m */
    public byte[] f31489m = C14049b0.f30918f;

    /* renamed from: n */
    public int f31490n;

    /* renamed from: o */
    public long f31491o;

    /* renamed from: a */
    public final ByteBuffer mo47176a() {
        int i;
        if (super.isEnded() && (i = this.f31490n) > 0) {
            mo47257i(i).put(this.f31489m, 0, this.f31490n).flip();
            this.f31490n = 0;
        }
        return super.mo47176a();
    }

    /* renamed from: b */
    public final void mo47177b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.f31488l);
            this.f31491o += (long) (min / this.f31436b.f31324d);
            this.f31488l -= min;
            byteBuffer.position(position + min);
            if (this.f31488l <= 0) {
                int i2 = i - min;
                int length = (this.f31490n + i2) - this.f31489m.length;
                ByteBuffer i3 = mo47257i(length);
                int i4 = C14049b0.m21636i(length, 0, this.f31490n);
                i3.put(this.f31489m, 0, i4);
                int i5 = C14049b0.m21636i(length - i4, 0, i2);
                byteBuffer.limit(byteBuffer.position() + i5);
                i3.put(byteBuffer);
                byteBuffer.limit(limit);
                int i6 = i2 - i5;
                int i7 = this.f31490n - i4;
                this.f31490n = i7;
                byte[] bArr = this.f31489m;
                System.arraycopy(bArr, i4, bArr, 0, i7);
                byteBuffer.get(this.f31489m, this.f31490n, i6);
                this.f31490n += i6;
                i3.flip();
            }
        }
    }

    /* renamed from: e */
    public final AudioProcessor.C14178a mo47253e(AudioProcessor.C14178a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f31323c == 2) {
            this.f31487k = true;
            return (this.f31485i == 0 && this.f31486j == 0) ? AudioProcessor.C14178a.f31320e : aVar;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    /* renamed from: f */
    public final void mo47254f() {
        if (this.f31487k) {
            this.f31487k = false;
            int i = this.f31486j;
            int i2 = this.f31436b.f31324d;
            this.f31489m = new byte[(i * i2)];
            this.f31488l = this.f31485i * i2;
        }
        this.f31490n = 0;
    }

    /* renamed from: g */
    public final void mo47255g() {
        if (this.f31487k) {
            int i = this.f31490n;
            if (i > 0) {
                this.f31491o += (long) (i / this.f31436b.f31324d);
            }
            this.f31490n = 0;
        }
    }

    /* renamed from: h */
    public final void mo47256h() {
        this.f31489m = C14049b0.f30918f;
    }

    public final boolean isEnded() {
        return super.isEnded() && this.f31490n == 0;
    }
}
