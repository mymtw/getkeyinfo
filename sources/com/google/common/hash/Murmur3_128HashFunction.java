package com.google.common.hash;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
final class Murmur3_128HashFunction extends C16268b implements Serializable {
    public static final C16271e GOOD_FAST_HASH_128 = new Murmur3_128HashFunction(Hashing.f36344a);
    public static final C16271e MURMUR3_128 = new Murmur3_128HashFunction(0);
    private static final long serialVersionUID = 0;
    private final int seed;

    /* renamed from: com.google.common.hash.Murmur3_128HashFunction$a */
    public static final class C16262a extends C16270d {

        /* renamed from: d */
        public long f36349d;

        /* renamed from: e */
        public long f36350e;

        /* renamed from: f */
        public int f36351f = 0;

        public C16262a(int i) {
            super(16);
            long j = (long) i;
            this.f36349d = j;
            this.f36350e = j;
        }

        /* renamed from: k */
        public final HashCode mo57858k() {
            long j = this.f36349d;
            long j2 = (long) this.f36351f;
            long j3 = j ^ j2;
            long j4 = j2 ^ this.f36350e;
            long j5 = j3 + j4;
            long j6 = j4 + j5;
            long j7 = (j5 ^ (j5 >>> 33)) * -49064778989728563L;
            long j8 = (j7 ^ (j7 >>> 33)) * -4265267296055464877L;
            long j9 = (j6 ^ (j6 >>> 33)) * -49064778989728563L;
            long j10 = (j9 ^ (j9 >>> 33)) * -4265267296055464877L;
            long j11 = j10 ^ (j10 >>> 33);
            long j12 = (j8 ^ (j8 >>> 33)) + j11;
            this.f36349d = j12;
            this.f36350e = j11 + j12;
            return HashCode.fromBytesNoCopy(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f36349d).putLong(this.f36350e).array());
        }

        /* renamed from: n */
        public final void mo57859n(ByteBuffer byteBuffer) {
            long j = byteBuffer.getLong();
            long j2 = byteBuffer.getLong();
            long rotateLeft = (Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L) ^ this.f36349d;
            this.f36349d = rotateLeft;
            long rotateLeft2 = Long.rotateLeft(rotateLeft, 27);
            long j3 = this.f36350e;
            this.f36349d = ((rotateLeft2 + j3) * 5) + 1390208809;
            long rotateLeft3 = (Long.rotateLeft(j2 * 5545529020109919103L, 33) * -8663945395140668459L) ^ j3;
            this.f36350e = rotateLeft3;
            this.f36350e = ((Long.rotateLeft(rotateLeft3, 31) + this.f36349d) * 5) + 944331445;
            this.f36351f += 16;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x004f, code lost:
            r0 = r0 ^ (((long) (r12.get(11) & 255)) << 24);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
            r0 = r0 ^ (((long) (r12.get(10) & 255)) << 16);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
            r0 = r0 ^ (((long) (r12.get(9) & 255)) << 8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0076, code lost:
            r0 = r0 ^ ((long) (r12.get(8) & 255));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
            r2 = r12.getLong() ^ 0;
            r6 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0094, code lost:
            r0 = r0 ^ (((long) (r12.get(5) & 255)) << 40);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a0, code lost:
            r0 = r0 ^ (((long) (r12.get(4) & 255)) << 32);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ad, code lost:
            r0 = r0 ^ (((long) (r12.get(3) & 255)) << 24);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b9, code lost:
            r0 = r0 ^ (((long) (r12.get(2) & 255)) << 16);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c5, code lost:
            r0 = r0 ^ (((long) (r12.get(1) & 255)) << 8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d1, code lost:
            r2 = ((long) (r12.get(0) & 255)) ^ r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00da, code lost:
            r11.f36349d ^= java.lang.Long.rotateLeft(r2 * -8663945395140668459L, 31) * 5545529020109919103L;
            r11.f36350e ^= java.lang.Long.rotateLeft(r6 * 5545529020109919103L, 33) * -8663945395140668459L;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fe, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0034, code lost:
            r0 = r0 ^ (((long) (r12.get(13) & 255)) << 40);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0041, code lost:
            r0 = r0 ^ (((long) (r12.get(12) & 255)) << 32);
         */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo57860o(java.nio.ByteBuffer r12) {
            /*
                r11 = this;
                int r0 = r11.f36351f
                int r1 = r12.remaining()
                int r1 = r1 + r0
                r11.f36351f = r1
                int r0 = r12.remaining()
                r1 = 48
                r2 = 40
                r3 = 32
                r4 = 24
                r5 = 16
                r6 = 0
                r8 = 8
                switch(r0) {
                    case 1: goto L_0x00d0;
                    case 2: goto L_0x00c4;
                    case 3: goto L_0x00b8;
                    case 4: goto L_0x00ac;
                    case 5: goto L_0x009f;
                    case 6: goto L_0x0093;
                    case 7: goto L_0x0087;
                    case 8: goto L_0x007f;
                    case 9: goto L_0x0075;
                    case 10: goto L_0x0068;
                    case 11: goto L_0x005b;
                    case 12: goto L_0x004e;
                    case 13: goto L_0x0040;
                    case 14: goto L_0x0033;
                    case 15: goto L_0x0026;
                    default: goto L_0x001e;
                }
            L_0x001e:
                java.lang.AssertionError r12 = new java.lang.AssertionError
                java.lang.String r0 = "Should never get here."
                r12.<init>(r0)
                throw r12
            L_0x0026:
                r0 = 14
                byte r0 = r12.get(r0)
                r0 = r0 & 255(0xff, float:3.57E-43)
                long r9 = (long) r0
                long r0 = r9 << r1
                long r0 = r0 ^ r6
                goto L_0x0034
            L_0x0033:
                r0 = r6
            L_0x0034:
                r9 = 13
                byte r9 = r12.get(r9)
                r9 = r9 & 255(0xff, float:3.57E-43)
                long r9 = (long) r9
                long r9 = r9 << r2
                long r0 = r0 ^ r9
                goto L_0x0041
            L_0x0040:
                r0 = r6
            L_0x0041:
                r2 = 12
                byte r2 = r12.get(r2)
                r2 = r2 & 255(0xff, float:3.57E-43)
                long r9 = (long) r2
                long r2 = r9 << r3
                long r0 = r0 ^ r2
                goto L_0x004f
            L_0x004e:
                r0 = r6
            L_0x004f:
                r2 = 11
                byte r2 = r12.get(r2)
                r2 = r2 & 255(0xff, float:3.57E-43)
                long r2 = (long) r2
                long r2 = r2 << r4
                long r0 = r0 ^ r2
                goto L_0x005c
            L_0x005b:
                r0 = r6
            L_0x005c:
                r2 = 10
                byte r2 = r12.get(r2)
                r2 = r2 & 255(0xff, float:3.57E-43)
                long r2 = (long) r2
                long r2 = r2 << r5
                long r0 = r0 ^ r2
                goto L_0x0069
            L_0x0068:
                r0 = r6
            L_0x0069:
                r2 = 9
                byte r2 = r12.get(r2)
                r2 = r2 & 255(0xff, float:3.57E-43)
                long r2 = (long) r2
                long r2 = r2 << r8
                long r0 = r0 ^ r2
                goto L_0x0076
            L_0x0075:
                r0 = r6
            L_0x0076:
                byte r2 = r12.get(r8)
                r2 = r2 & 255(0xff, float:3.57E-43)
                long r2 = (long) r2
                long r0 = r0 ^ r2
                goto L_0x0080
            L_0x007f:
                r0 = r6
            L_0x0080:
                long r2 = r12.getLong()
                long r2 = r2 ^ r6
                r6 = r0
                goto L_0x00da
            L_0x0087:
                r0 = 6
                byte r0 = r12.get(r0)
                r0 = r0 & 255(0xff, float:3.57E-43)
                long r9 = (long) r0
                long r0 = r9 << r1
                long r0 = r0 ^ r6
                goto L_0x0094
            L_0x0093:
                r0 = r6
            L_0x0094:
                r9 = 5
                byte r9 = r12.get(r9)
                r9 = r9 & 255(0xff, float:3.57E-43)
                long r9 = (long) r9
                long r9 = r9 << r2
                long r0 = r0 ^ r9
                goto L_0x00a0
            L_0x009f:
                r0 = r6
            L_0x00a0:
                r2 = 4
                byte r2 = r12.get(r2)
                r2 = r2 & 255(0xff, float:3.57E-43)
                long r9 = (long) r2
                long r2 = r9 << r3
                long r0 = r0 ^ r2
                goto L_0x00ad
            L_0x00ac:
                r0 = r6
            L_0x00ad:
                r2 = 3
                byte r2 = r12.get(r2)
                r2 = r2 & 255(0xff, float:3.57E-43)
                long r2 = (long) r2
                long r2 = r2 << r4
                long r0 = r0 ^ r2
                goto L_0x00b9
            L_0x00b8:
                r0 = r6
            L_0x00b9:
                r2 = 2
                byte r2 = r12.get(r2)
                r2 = r2 & 255(0xff, float:3.57E-43)
                long r2 = (long) r2
                long r2 = r2 << r5
                long r0 = r0 ^ r2
                goto L_0x00c5
            L_0x00c4:
                r0 = r6
            L_0x00c5:
                r2 = 1
                byte r2 = r12.get(r2)
                r2 = r2 & 255(0xff, float:3.57E-43)
                long r2 = (long) r2
                long r2 = r2 << r8
                long r0 = r0 ^ r2
                goto L_0x00d1
            L_0x00d0:
                r0 = r6
            L_0x00d1:
                r2 = 0
                byte r12 = r12.get(r2)
                r12 = r12 & 255(0xff, float:3.57E-43)
                long r2 = (long) r12
                long r2 = r2 ^ r0
            L_0x00da:
                long r0 = r11.f36349d
                r4 = -8663945395140668459(0x87c37b91114253d5, double:-2.8811287363897357E-271)
                long r2 = r2 * r4
                r12 = 31
                long r2 = java.lang.Long.rotateLeft(r2, r12)
                r8 = 5545529020109919103(0x4cf5ad432745937f, double:5.573325460219186E62)
                long r2 = r2 * r8
                long r0 = r0 ^ r2
                r11.f36349d = r0
                long r0 = r11.f36350e
                long r6 = r6 * r8
                r12 = 33
                long r2 = java.lang.Long.rotateLeft(r6, r12)
                long r2 = r2 * r4
                long r0 = r0 ^ r2
                r11.f36350e = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.Murmur3_128HashFunction.C16262a.mo57860o(java.nio.ByteBuffer):void");
        }
    }

    public Murmur3_128HashFunction(int i) {
        this.seed = i;
    }

    public int bits() {
        return 128;
    }

    public boolean equals(@NullableDecl Object obj) {
        return (obj instanceof Murmur3_128HashFunction) && this.seed == ((Murmur3_128HashFunction) obj).seed;
    }

    public int hashCode() {
        return Murmur3_128HashFunction.class.hashCode() ^ this.seed;
    }

    public C16272f newHasher() {
        return new C16262a(this.seed);
    }

    public String toString() {
        return C0071c.m191c(C0072d.m201h("Hashing.murmur3_128("), this.seed, ")");
    }
}
