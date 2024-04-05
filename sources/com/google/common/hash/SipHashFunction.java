package com.google.common.hash;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.C0087d;
import com.google.common.base.C15794l;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
final class SipHashFunction extends C16268b implements Serializable {
    public static final C16271e SIP_HASH_24 = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;

    /* renamed from: c */
    private final int f36357c;

    /* renamed from: d */
    private final int f36358d;

    /* renamed from: k0 */
    private final long f36359k0;

    /* renamed from: k1 */
    private final long f36360k1;

    /* renamed from: com.google.common.hash.SipHashFunction$a */
    public static final class C16264a extends C16270d {

        /* renamed from: d */
        public final int f36361d;

        /* renamed from: e */
        public final int f36362e;

        /* renamed from: f */
        public long f36363f;

        /* renamed from: g */
        public long f36364g;

        /* renamed from: h */
        public long f36365h;

        /* renamed from: i */
        public long f36366i;

        /* renamed from: j */
        public long f36367j = 0;

        /* renamed from: k */
        public long f36368k = 0;

        public C16264a(int i, int i2, long j, long j2) {
            super(8);
            this.f36361d = i;
            this.f36362e = i2;
            this.f36363f = 8317987319222330741L ^ j;
            this.f36364g = 7237128888997146477L ^ j2;
            this.f36365h = 7816392313619706465L ^ j;
            this.f36366i = 8387220255154660723L ^ j2;
        }

        /* renamed from: k */
        public final HashCode mo57858k() {
            long j = this.f36368k ^ (this.f36367j << 56);
            this.f36368k = j;
            this.f36366i ^= j;
            mo57882q(this.f36361d);
            this.f36363f = j ^ this.f36363f;
            this.f36365h ^= 255;
            mo57882q(this.f36362e);
            return HashCode.fromLong(((this.f36363f ^ this.f36364g) ^ this.f36365h) ^ this.f36366i);
        }

        /* renamed from: n */
        public final void mo57859n(ByteBuffer byteBuffer) {
            this.f36367j += 8;
            long j = byteBuffer.getLong();
            this.f36366i ^= j;
            mo57882q(this.f36361d);
            this.f36363f = j ^ this.f36363f;
        }

        /* renamed from: o */
        public final void mo57860o(ByteBuffer byteBuffer) {
            this.f36367j += (long) byteBuffer.remaining();
            int i = 0;
            while (byteBuffer.hasRemaining()) {
                this.f36368k ^= (((long) byteBuffer.get()) & 255) << i;
                i += 8;
            }
        }

        /* renamed from: q */
        public final void mo57882q(int i) {
            for (int i2 = 0; i2 < i; i2++) {
                long j = this.f36363f;
                long j2 = this.f36364g;
                this.f36363f = j + j2;
                this.f36365h += this.f36366i;
                this.f36364g = Long.rotateLeft(j2, 13);
                long rotateLeft = Long.rotateLeft(this.f36366i, 16);
                long j3 = this.f36364g;
                long j4 = this.f36363f;
                this.f36364g = j3 ^ j4;
                this.f36366i = rotateLeft ^ this.f36365h;
                long rotateLeft2 = Long.rotateLeft(j4, 32);
                long j5 = this.f36365h;
                long j6 = this.f36364g;
                this.f36365h = j5 + j6;
                this.f36363f = rotateLeft2 + this.f36366i;
                this.f36364g = Long.rotateLeft(j6, 17);
                long rotateLeft3 = Long.rotateLeft(this.f36366i, 21);
                long j7 = this.f36364g;
                long j8 = this.f36365h;
                this.f36364g = j7 ^ j8;
                this.f36366i = rotateLeft3 ^ this.f36363f;
                this.f36365h = Long.rotateLeft(j8, 32);
            }
        }
    }

    public SipHashFunction(int i, int i2, long j, long j2) {
        boolean z = true;
        C15794l.m25609c(i, "The number of SipRound iterations (c=%s) during Compression must be positive.", i > 0);
        C15794l.m25609c(i2, "The number of SipRound iterations (d=%s) during Finalization must be positive.", i2 <= 0 ? false : z);
        this.f36357c = i;
        this.f36358d = i2;
        this.f36359k0 = j;
        this.f36360k1 = j2;
    }

    public int bits() {
        return 64;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof SipHashFunction)) {
            return false;
        }
        SipHashFunction sipHashFunction = (SipHashFunction) obj;
        return this.f36357c == sipHashFunction.f36357c && this.f36358d == sipHashFunction.f36358d && this.f36359k0 == sipHashFunction.f36359k0 && this.f36360k1 == sipHashFunction.f36360k1;
    }

    public int hashCode() {
        return (int) ((((long) ((SipHashFunction.class.hashCode() ^ this.f36357c) ^ this.f36358d)) ^ this.f36359k0) ^ this.f36360k1);
    }

    public C16272f newHasher() {
        return new C16264a(this.f36357c, this.f36358d, this.f36359k0, this.f36360k1);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Hashing.sipHash");
        h.append(this.f36357c);
        h.append("");
        h.append(this.f36358d);
        h.append("(");
        h.append(this.f36359k0);
        h.append(", ");
        return C0087d.m236f(h, this.f36360k1, ")");
    }
}
