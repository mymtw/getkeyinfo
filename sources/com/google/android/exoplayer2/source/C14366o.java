package com.google.android.exoplayer2.source;

import android.media.MediaCodec;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.C14368p;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p505aj.C13990a;
import p505aj.C14003j;
import p513bj.C14049b0;
import p513bj.C14077r;
import p619mh.C18220b;
import p644ph.C18368v;

/* renamed from: com.google.android.exoplayer2.source.o */
public final class C14366o {

    /* renamed from: a */
    public final C14003j f32262a;

    /* renamed from: b */
    public final int f32263b;

    /* renamed from: c */
    public final C14077r f32264c = new C14077r(32);

    /* renamed from: d */
    public C14367a f32265d;

    /* renamed from: e */
    public C14367a f32266e;

    /* renamed from: f */
    public C14367a f32267f;

    /* renamed from: g */
    public long f32268g;

    /* renamed from: com.google.android.exoplayer2.source.o$a */
    public static final class C14367a {

        /* renamed from: a */
        public final long f32269a;

        /* renamed from: b */
        public final long f32270b;

        /* renamed from: c */
        public boolean f32271c;

        /* renamed from: d */
        public C13990a f32272d;

        /* renamed from: e */
        public C14367a f32273e;

        public C14367a(long j, int i) {
            this.f32269a = j;
            this.f32270b = j + ((long) i);
        }
    }

    public C14366o(C14003j jVar) {
        this.f32262a = jVar;
        int i = jVar.f30785b;
        this.f32263b = i;
        C14367a aVar = new C14367a(0, i);
        this.f32265d = aVar;
        this.f32266e = aVar;
        this.f32267f = aVar;
    }

    /* renamed from: d */
    public static C14367a m22728d(C14367a aVar, long j, ByteBuffer byteBuffer, int i) {
        while (j >= aVar.f32270b) {
            aVar = aVar.f32273e;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (aVar.f32270b - j));
            C13990a aVar2 = aVar.f32272d;
            byteBuffer.put(aVar2.f30751a, ((int) (j - aVar.f32269a)) + aVar2.f30752b, min);
            i -= min;
            j += (long) min;
            if (j == aVar.f32270b) {
                aVar = aVar.f32273e;
            }
        }
        return aVar;
    }

    /* renamed from: e */
    public static C14367a m22729e(C14367a aVar, long j, byte[] bArr, int i) {
        while (j >= aVar.f32270b) {
            aVar = aVar.f32273e;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (aVar.f32270b - j));
            C13990a aVar2 = aVar.f32272d;
            System.arraycopy(aVar2.f30751a, ((int) (j - aVar.f32269a)) + aVar2.f30752b, bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == aVar.f32270b) {
                aVar = aVar.f32273e;
            }
        }
        return aVar;
    }

    /* renamed from: f */
    public static C14367a m22730f(C14367a aVar, DecoderInputBuffer decoderInputBuffer, C14368p.C14369a aVar2, C14077r rVar) {
        if (decoderInputBuffer.mo69761h(1073741824)) {
            long j = aVar2.f32309b;
            int i = 1;
            rVar.mo46932w(1);
            C14367a e = m22729e(aVar, j, rVar.f30986a, 1);
            long j2 = j + 1;
            byte b = rVar.f30986a[0];
            boolean z = (b & 128) != 0;
            byte b2 = b & Byte.MAX_VALUE;
            C18220b bVar = decoderInputBuffer.f31492c;
            byte[] bArr = bVar.f39938a;
            if (bArr == null) {
                bVar.f39938a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aVar = m22729e(e, j2, bVar.f39938a, b2);
            long j3 = j2 + ((long) b2);
            if (z) {
                rVar.mo46932w(2);
                aVar = m22729e(aVar, j3, rVar.f30986a, 2);
                j3 += 2;
                i = rVar.mo46930u();
            }
            int[] iArr = bVar.f39941d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = bVar.f39942e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i2 = i * 6;
                rVar.mo46932w(i2);
                aVar = m22729e(aVar, j3, rVar.f30986a, i2);
                j3 += (long) i2;
                rVar.mo46935z(0);
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = rVar.mo46930u();
                    iArr2[i3] = rVar.mo46928s();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = aVar2.f32308a - ((int) (j3 - aVar2.f32309b));
            }
            C18368v.C18369a aVar3 = aVar2.f32310c;
            int i4 = C14049b0.f30913a;
            byte[] bArr2 = aVar3.f40336b;
            byte[] bArr3 = bVar.f39938a;
            int i5 = aVar3.f40335a;
            int i6 = aVar3.f40337c;
            int i7 = aVar3.f40338d;
            bVar.f39943f = i;
            bVar.f39941d = iArr;
            bVar.f39942e = iArr2;
            bVar.f39939b = bArr2;
            bVar.f39938a = bArr3;
            bVar.f39940c = i5;
            bVar.f39944g = i6;
            bVar.f39945h = i7;
            MediaCodec.CryptoInfo cryptoInfo = bVar.f39946i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            if (C14049b0.f30913a >= 24) {
                C18220b.C18221a aVar4 = bVar.f39947j;
                aVar4.getClass();
                aVar4.f39949b.set(i6, i7);
                aVar4.f39948a.setPattern(aVar4.f39949b);
            }
            long j4 = aVar2.f32309b;
            int i8 = (int) (j3 - j4);
            aVar2.f32309b = j4 + ((long) i8);
            aVar2.f32308a -= i8;
        }
        if (decoderInputBuffer.mo69761h(268435456)) {
            rVar.mo46932w(4);
            C14367a e2 = m22729e(aVar, aVar2.f32309b, rVar.f30986a, 4);
            int s = rVar.mo46928s();
            aVar2.f32309b += 4;
            aVar2.f32308a -= 4;
            decoderInputBuffer.mo47271l(s);
            C14367a d = m22728d(e2, aVar2.f32309b, decoderInputBuffer.f31493d, s);
            aVar2.f32309b += (long) s;
            int i9 = aVar2.f32308a - s;
            aVar2.f32308a = i9;
            ByteBuffer byteBuffer = decoderInputBuffer.f31496g;
            if (byteBuffer == null || byteBuffer.capacity() < i9) {
                decoderInputBuffer.f31496g = ByteBuffer.allocate(i9);
            } else {
                decoderInputBuffer.f31496g.clear();
            }
            return m22728d(d, aVar2.f32309b, decoderInputBuffer.f31496g, aVar2.f32308a);
        }
        decoderInputBuffer.mo47271l(aVar2.f32308a);
        return m22728d(aVar, aVar2.f32309b, decoderInputBuffer.f31493d, aVar2.f32308a);
    }

    /* renamed from: a */
    public final void mo47838a(C14367a aVar) {
        if (aVar.f32271c) {
            C14367a aVar2 = this.f32267f;
            int i = (((int) (aVar2.f32269a - aVar.f32269a)) / this.f32263b) + (aVar2.f32271c ? 1 : 0);
            C13990a[] aVarArr = new C13990a[i];
            int i2 = 0;
            while (i2 < i) {
                aVarArr[i2] = aVar.f32272d;
                aVar.f32272d = null;
                C14367a aVar3 = aVar.f32273e;
                aVar.f32273e = null;
                i2++;
                aVar = aVar3;
            }
            this.f32262a.mo46823a(aVarArr);
        }
    }

    /* renamed from: b */
    public final void mo47839b(long j) {
        if (j != -1) {
            while (true) {
                C14367a aVar = this.f32265d;
                if (j >= aVar.f32270b) {
                    C14003j jVar = this.f32262a;
                    C13990a aVar2 = aVar.f32272d;
                    synchronized (jVar) {
                        C13990a[] aVarArr = jVar.f30786c;
                        aVarArr[0] = aVar2;
                        jVar.mo46823a(aVarArr);
                    }
                    C14367a aVar3 = this.f32265d;
                    aVar3.f32272d = null;
                    C14367a aVar4 = aVar3.f32273e;
                    aVar3.f32273e = null;
                    this.f32265d = aVar4;
                } else if (this.f32266e.f32269a < aVar.f32269a) {
                    this.f32266e = aVar;
                    return;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final int mo47840c(int i) {
        C13990a aVar;
        C14367a aVar2 = this.f32267f;
        if (!aVar2.f32271c) {
            C14003j jVar = this.f32262a;
            synchronized (jVar) {
                jVar.f30788e++;
                int i2 = jVar.f30789f;
                if (i2 > 0) {
                    C13990a[] aVarArr = jVar.f30790g;
                    int i3 = i2 - 1;
                    jVar.f30789f = i3;
                    aVar = aVarArr[i3];
                    aVar.getClass();
                    jVar.f30790g[jVar.f30789f] = null;
                } else {
                    aVar = new C13990a(0, new byte[jVar.f30785b]);
                }
            }
            C14367a aVar3 = new C14367a(this.f32267f.f32270b, this.f32263b);
            aVar2.f32272d = aVar;
            aVar2.f32273e = aVar3;
            aVar2.f32271c = true;
        }
        return Math.min(i, (int) (this.f32267f.f32270b - this.f32268g));
    }
}
