package com.google.common.hash;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.google.common.base.C15781b;
import com.google.common.base.C15794l;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
final class Murmur3_32HashFunction extends C16268b implements Serializable {
    public static final C16271e GOOD_FAST_HASH_32 = new Murmur3_32HashFunction(Hashing.f36344a);
    public static final C16271e MURMUR3_32 = new Murmur3_32HashFunction(0);
    private static final long serialVersionUID = 0;
    private final int seed;

    @CanIgnoreReturnValue
    /* renamed from: com.google.common.hash.Murmur3_32HashFunction$a */
    public static final class C16263a extends C16269c {

        /* renamed from: a */
        public int f36352a;

        /* renamed from: b */
        public long f36353b;

        /* renamed from: c */
        public int f36354c;

        /* renamed from: d */
        public int f36355d = 0;

        /* renamed from: e */
        public boolean f36356e = false;

        public C16263a(int i) {
            this.f36352a = i;
        }

        /* renamed from: a */
        public final C16272f mo57870a(int i) {
            mo57877k(4, (long) i);
            return this;
        }

        /* renamed from: e */
        public final C16272f mo57873e(int i, int i2, byte[] bArr) {
            C15794l.m25619m(i, i + i2, bArr.length);
            int i3 = 0;
            while (true) {
                int i4 = i3 + 4;
                if (i4 > i2) {
                    break;
                }
                mo57877k(4, (long) Murmur3_32HashFunction.m26282c(i3 + i, bArr));
                i3 = i4;
            }
            while (i3 < i2) {
                mo57877k(1, (long) (bArr[i + i3] & 255));
                i3++;
            }
            return this;
        }

        /* renamed from: f */
        public final HashCode mo57800f() {
            C15794l.m25623q(!this.f36356e);
            this.f36356e = true;
            int access$000 = this.f36352a ^ Murmur3_32HashFunction.m26284e((int) this.f36353b);
            this.f36352a = access$000;
            return Murmur3_32HashFunction.m26281b(access$000, this.f36355d);
        }

        /* renamed from: g */
        public final C16272f mo57874g(ByteBuffer byteBuffer) {
            ByteOrder order = byteBuffer.order();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            while (byteBuffer.remaining() >= 4) {
                mo57870a(byteBuffer.getInt());
            }
            while (byteBuffer.hasRemaining()) {
                mo57877k(1, (long) (byteBuffer.get() & 255));
            }
            byteBuffer.order(order);
            return this;
        }

        /* renamed from: h */
        public final C16272f mo57872d(CharSequence charSequence, Charset charset) {
            if (!C15781b.f35562c.equals(charset)) {
                return super.mo57872d(charSequence, charset);
            }
            int length = charSequence.length();
            int i = 0;
            while (true) {
                int i2 = i + 4;
                if (i2 > length) {
                    break;
                }
                char charAt = charSequence.charAt(i);
                char charAt2 = charSequence.charAt(i + 1);
                char charAt3 = charSequence.charAt(i + 2);
                char charAt4 = charSequence.charAt(i + 3);
                if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                    break;
                }
                mo57877k(4, (long) ((charAt2 << 8) | charAt | (charAt3 << 16) | (charAt4 << 24)));
                i = i2;
            }
            while (i < length) {
                char charAt5 = charSequence.charAt(i);
                if (charAt5 < 128) {
                    mo57877k(1, (long) charAt5);
                } else if (charAt5 < 2048) {
                    mo57877k(2, Murmur3_32HashFunction.access$300(charAt5));
                } else if (charAt5 < 55296 || charAt5 > 57343) {
                    mo57877k(3, Murmur3_32HashFunction.access$400(charAt5));
                } else {
                    int codePointAt = Character.codePointAt(charSequence, i);
                    if (codePointAt == charAt5) {
                        mo57889c(charSequence.subSequence(i, length).toString().getBytes(charset));
                        return this;
                    }
                    i++;
                    mo57877k(4, Murmur3_32HashFunction.m26280a(codePointAt));
                }
                i++;
            }
            return this;
        }

        /* renamed from: j */
        public final C16272f mo57876j(char c) {
            mo57877k(2, (long) c);
            return this;
        }

        /* renamed from: k */
        public final void mo57877k(int i, long j) {
            long j2 = this.f36353b;
            long j3 = j & UnsignedInteger.INT_MASK;
            int i2 = this.f36354c;
            long j4 = (j3 << i2) | j2;
            this.f36353b = j4;
            int i3 = (i * 8) + i2;
            this.f36354c = i3;
            this.f36355d += i;
            if (i3 >= 32) {
                this.f36352a = Murmur3_32HashFunction.m26283d(this.f36352a, Murmur3_32HashFunction.m26284e((int) j4));
                this.f36353b >>>= 32;
                this.f36354c -= 32;
            }
        }

        /* renamed from: a */
        public final C16276j m26286a(int i) {
            mo57877k(4, (long) i);
            return this;
        }

        /* renamed from: b */
        public final C16272f mo57871b(long j) {
            mo57877k(4, (long) ((int) j));
            mo57877k(4, j >>> 32);
            return this;
        }
    }

    public Murmur3_32HashFunction(int i) {
        this.seed = i;
    }

    /* renamed from: a */
    public static long m26280a(int i) {
        return ((((long) (i >>> 18)) | 240) & 255) | ((((long) ((i >>> 12) & 63)) | 128) << 8) | ((((long) ((i >>> 6) & 63)) | 128) << 16) | ((((long) (i & 63)) | 128) << 24);
    }

    public static long access$300(char c) {
        return (long) ((((c & RFC1522Codec.SEP) | 128) << 8) | (((c >>> 6) | 960) & 255));
    }

    public static long access$400(char c) {
        return (long) ((((c & RFC1522Codec.SEP) | 128) << 16) | (((c >>> 12) | 480) & 255) | ((((c >>> 6) & 63) | 128) << 8));
    }

    /* renamed from: b */
    public static HashCode m26281b(int i, int i2) {
        int i3 = i ^ i2;
        int i4 = (i3 ^ (i3 >>> 16)) * -2048144789;
        int i5 = (i4 ^ (i4 >>> 13)) * -1028477387;
        return HashCode.fromInt(i5 ^ (i5 >>> 16));
    }

    /* renamed from: c */
    public static int m26282c(int i, byte[] bArr) {
        byte b = bArr[i + 3];
        byte b2 = bArr[i + 2];
        byte b3 = bArr[i + 1];
        return (bArr[i] & 255) | (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    /* renamed from: d */
    public static int m26283d(int i, int i2) {
        return (Integer.rotateLeft(i ^ i2, 13) * 5) - 430675100;
    }

    /* renamed from: e */
    public static int m26284e(int i) {
        return Integer.rotateLeft(i * -862048943, 15) * 461845907;
    }

    public int bits() {
        return 32;
    }

    public boolean equals(@NullableDecl Object obj) {
        return (obj instanceof Murmur3_32HashFunction) && this.seed == ((Murmur3_32HashFunction) obj).seed;
    }

    public HashCode hashBytes(byte[] bArr, int i, int i2) {
        C15794l.m25619m(i, i + i2, bArr.length);
        int i3 = this.seed;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i5 + 4;
            if (i6 > i2) {
                break;
            }
            i3 = m26283d(i3, m26284e(m26282c(i5 + i, bArr)));
            i5 = i6;
        }
        int i7 = i5;
        int i8 = 0;
        while (i7 < i2) {
            i4 ^= (bArr[i + i7] & 255) << i8;
            i7++;
            i8 += 8;
        }
        return m26281b(m26284e(i4) ^ i3, i2);
    }

    public int hashCode() {
        return Murmur3_32HashFunction.class.hashCode() ^ this.seed;
    }

    public HashCode hashInt(int i) {
        return m26281b(m26283d(this.seed, m26284e(i)), 4);
    }

    public HashCode hashLong(long j) {
        return m26281b(m26283d(m26283d(this.seed, m26284e((int) j)), m26284e((int) (j >>> 32))), 8);
    }

    public HashCode hashString(CharSequence charSequence, Charset charset) {
        int i;
        if (!C15781b.f35562c.equals(charset)) {
            return hashBytes(charSequence.toString().getBytes(charset));
        }
        int length = charSequence.length();
        int i2 = this.seed;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i4 + 4;
            if (i6 > length) {
                break;
            }
            char charAt = charSequence.charAt(i4);
            char charAt2 = charSequence.charAt(i4 + 1);
            char charAt3 = charSequence.charAt(i4 + 2);
            char charAt4 = charSequence.charAt(i4 + 3);
            if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                break;
            }
            i2 = m26283d(i2, m26284e((charAt2 << 8) | charAt | (charAt3 << 16) | (charAt4 << 24)));
            i5 = i + 4;
            i4 = i6;
        }
        long j = 0;
        while (i4 < length) {
            char charAt5 = charSequence.charAt(i4);
            if (charAt5 < 128) {
                j |= ((long) charAt5) << i3;
                i3 += 8;
                i++;
            } else if (charAt5 < 2048) {
                j |= ((long) ((((charAt5 & RFC1522Codec.SEP) | 128) << 8) | (((charAt5 >>> 6) | 960) & 255))) << i3;
                i3 += 16;
                i += 2;
            } else if (charAt5 < 55296 || charAt5 > 57343) {
                j |= ((long) ((((charAt5 & RFC1522Codec.SEP) | 128) << 16) | ((((charAt5 >>> 12) | 480) & 255) | ((((charAt5 >>> 6) & 63) | 128) << 8)))) << i3;
                i3 += 24;
                i += 3;
            } else {
                int codePointAt = Character.codePointAt(charSequence, i4);
                if (codePointAt == charAt5) {
                    return hashBytes(charSequence.toString().getBytes(charset));
                }
                i4++;
                j |= m26280a(codePointAt) << i3;
                i += 4;
            }
            if (i3 >= 32) {
                i2 = m26283d(i2, m26284e((int) j));
                j >>>= 32;
                i3 -= 32;
            }
            i4++;
        }
        return m26281b(m26284e((int) j) ^ i2, i);
    }

    public HashCode hashUnencodedChars(CharSequence charSequence) {
        int i = this.seed;
        for (int i2 = 1; i2 < charSequence.length(); i2 += 2) {
            i = m26283d(i, m26284e(charSequence.charAt(i2 - 1) | (charSequence.charAt(i2) << 16)));
        }
        if ((charSequence.length() & 1) == 1) {
            i ^= m26284e(charSequence.charAt(charSequence.length() - 1));
        }
        return m26281b(i, charSequence.length() * 2);
    }

    public C16272f newHasher() {
        return new C16263a(this.seed);
    }

    public String toString() {
        return C0071c.m191c(C0072d.m201h("Hashing.murmur3_32("), this.seed, ")");
    }
}
