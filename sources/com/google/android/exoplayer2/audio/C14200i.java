package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p611lh.C18184s;

/* renamed from: com.google.android.exoplayer2.audio.i */
public final class C14200i implements AudioProcessor {

    /* renamed from: b */
    public int f31470b;

    /* renamed from: c */
    public float f31471c = 1.0f;

    /* renamed from: d */
    public float f31472d = 1.0f;

    /* renamed from: e */
    public AudioProcessor.C14178a f31473e;

    /* renamed from: f */
    public AudioProcessor.C14178a f31474f;

    /* renamed from: g */
    public AudioProcessor.C14178a f31475g;

    /* renamed from: h */
    public AudioProcessor.C14178a f31476h;

    /* renamed from: i */
    public boolean f31477i;

    /* renamed from: j */
    public C18184s f31478j;

    /* renamed from: k */
    public ByteBuffer f31479k;

    /* renamed from: l */
    public ShortBuffer f31480l;

    /* renamed from: m */
    public ByteBuffer f31481m;

    /* renamed from: n */
    public long f31482n;

    /* renamed from: o */
    public long f31483o;

    /* renamed from: p */
    public boolean f31484p;

    public C14200i() {
        AudioProcessor.C14178a aVar = AudioProcessor.C14178a.f31320e;
        this.f31473e = aVar;
        this.f31474f = aVar;
        this.f31475g = aVar;
        this.f31476h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f31319a;
        this.f31479k = byteBuffer;
        this.f31480l = byteBuffer.asShortBuffer();
        this.f31481m = byteBuffer;
        this.f31470b = -1;
    }

    /* renamed from: a */
    public final ByteBuffer mo47176a() {
        int i;
        C18184s sVar = this.f31478j;
        if (sVar != null && (i = sVar.f39812m * sVar.f39801b * 2) > 0) {
            if (this.f31479k.capacity() < i) {
                ByteBuffer order = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                this.f31479k = order;
                this.f31480l = order.asShortBuffer();
            } else {
                this.f31479k.clear();
                this.f31480l.clear();
            }
            ShortBuffer shortBuffer = this.f31480l;
            int min = Math.min(shortBuffer.remaining() / sVar.f39801b, sVar.f39812m);
            shortBuffer.put(sVar.f39811l, 0, sVar.f39801b * min);
            int i2 = sVar.f39812m - min;
            sVar.f39812m = i2;
            short[] sArr = sVar.f39811l;
            int i3 = sVar.f39801b;
            System.arraycopy(sArr, min * i3, sArr, 0, i2 * i3);
            this.f31483o += (long) i;
            this.f31479k.limit(i);
            this.f31481m = this.f31479k;
        }
        ByteBuffer byteBuffer = this.f31481m;
        this.f31481m = AudioProcessor.f31319a;
        return byteBuffer;
    }

    /* renamed from: b */
    public final void mo47177b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C18184s sVar = this.f31478j;
            sVar.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f31482n += (long) remaining;
            int remaining2 = asShortBuffer.remaining();
            int i = sVar.f39801b;
            int i2 = remaining2 / i;
            short[] b = sVar.mo69727b(sVar.f39809j, sVar.f39810k, i2);
            sVar.f39809j = b;
            asShortBuffer.get(b, sVar.f39810k * sVar.f39801b, ((i * i2) * 2) / 2);
            sVar.f39810k += i2;
            sVar.mo69729e();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    /* renamed from: c */
    public final AudioProcessor.C14178a mo47178c(AudioProcessor.C14178a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f31323c == 2) {
            int i = this.f31470b;
            if (i == -1) {
                i = aVar.f31321a;
            }
            this.f31473e = aVar;
            AudioProcessor.C14178a aVar2 = new AudioProcessor.C14178a(i, aVar.f31322b, 2);
            this.f31474f = aVar2;
            this.f31477i = true;
            return aVar2;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    /* renamed from: d */
    public final void mo47179d() {
        int i;
        C18184s sVar = this.f31478j;
        if (sVar != null) {
            int i2 = sVar.f39810k;
            float f = sVar.f39802c;
            float f2 = sVar.f39803d;
            int i3 = sVar.f39812m + ((int) ((((((float) i2) / (f / f2)) + ((float) sVar.f39814o)) / (sVar.f39804e * f2)) + 0.5f));
            sVar.f39809j = sVar.mo69727b(sVar.f39809j, i2, (sVar.f39807h * 2) + i2);
            int i4 = 0;
            while (true) {
                i = sVar.f39807h * 2;
                int i5 = sVar.f39801b;
                if (i4 >= i * i5) {
                    break;
                }
                sVar.f39809j[(i5 * i2) + i4] = 0;
                i4++;
            }
            sVar.f39810k = i + sVar.f39810k;
            sVar.mo69729e();
            if (sVar.f39812m > i3) {
                sVar.f39812m = i3;
            }
            sVar.f39810k = 0;
            sVar.f39817r = 0;
            sVar.f39814o = 0;
        }
        this.f31484p = true;
    }

    public final void flush() {
        if (isActive()) {
            AudioProcessor.C14178a aVar = this.f31473e;
            this.f31475g = aVar;
            AudioProcessor.C14178a aVar2 = this.f31474f;
            this.f31476h = aVar2;
            if (this.f31477i) {
                this.f31478j = new C18184s(aVar.f31321a, aVar.f31322b, this.f31471c, this.f31472d, aVar2.f31321a);
            } else {
                C18184s sVar = this.f31478j;
                if (sVar != null) {
                    sVar.f39810k = 0;
                    sVar.f39812m = 0;
                    sVar.f39814o = 0;
                    sVar.f39815p = 0;
                    sVar.f39816q = 0;
                    sVar.f39817r = 0;
                    sVar.f39818s = 0;
                    sVar.f39819t = 0;
                    sVar.f39820u = 0;
                    sVar.f39821v = 0;
                }
            }
        }
        this.f31481m = AudioProcessor.f31319a;
        this.f31482n = 0;
        this.f31483o = 0;
        this.f31484p = false;
    }

    public final boolean isActive() {
        return this.f31474f.f31321a != -1 && (Math.abs(this.f31471c - 1.0f) >= 1.0E-4f || Math.abs(this.f31472d - 1.0f) >= 1.0E-4f || this.f31474f.f31321a != this.f31473e.f31321a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f31478j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isEnded() {
        /*
            r2 = this;
            boolean r0 = r2.f31484p
            if (r0 == 0) goto L_0x0013
            lh.s r0 = r2.f31478j
            if (r0 == 0) goto L_0x0011
            int r1 = r0.f39812m
            int r0 = r0.f39801b
            int r1 = r1 * r0
            int r1 = r1 * 2
            if (r1 != 0) goto L_0x0013
        L_0x0011:
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C14200i.isEnded():boolean");
    }

    public final void reset() {
        this.f31471c = 1.0f;
        this.f31472d = 1.0f;
        AudioProcessor.C14178a aVar = AudioProcessor.C14178a.f31320e;
        this.f31473e = aVar;
        this.f31474f = aVar;
        this.f31475g = aVar;
        this.f31476h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f31319a;
        this.f31479k = byteBuffer;
        this.f31480l = byteBuffer.asShortBuffer();
        this.f31481m = byteBuffer;
        this.f31470b = -1;
        this.f31477i = false;
        this.f31478j = null;
        this.f31482n = 0;
        this.f31483o = 0;
        this.f31484p = false;
    }
}
