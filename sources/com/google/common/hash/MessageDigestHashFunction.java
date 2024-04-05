package com.google.common.hash;

import com.google.common.base.C15794l;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

@Immutable
final class MessageDigestHashFunction extends C16268b implements Serializable {
    private final int bytes;
    private final MessageDigest prototype;
    private final boolean supportsClone;
    private final String toString;

    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final String algorithmName;
        private final int bytes;
        private final String toString;

        public SerializedForm(String str, int i, String str2, C16260a aVar) {
            this.algorithmName = str;
            this.bytes = i;
            this.toString = str2;
        }

        private Object readResolve() {
            return new MessageDigestHashFunction(this.algorithmName, this.bytes, this.toString);
        }
    }

    /* renamed from: com.google.common.hash.MessageDigestHashFunction$b */
    public static final class C16261b extends C16267a {

        /* renamed from: b */
        public final MessageDigest f36346b;

        /* renamed from: c */
        public final int f36347c;

        /* renamed from: d */
        public boolean f36348d;

        public C16261b(MessageDigest messageDigest, int i) {
            this.f36346b = messageDigest;
            this.f36347c = i;
        }

        /* renamed from: f */
        public final HashCode mo57800f() {
            C15794l.m25624r(!this.f36348d, "Cannot re-use a Hasher after calling hash() on it");
            this.f36348d = true;
            return this.f36347c == this.f36346b.getDigestLength() ? HashCode.fromBytesNoCopy(this.f36346b.digest()) : HashCode.fromBytesNoCopy(Arrays.copyOf(this.f36346b.digest(), this.f36347c));
        }

        /* renamed from: k */
        public final void mo57801k(byte b) {
            C15794l.m25624r(!this.f36348d, "Cannot re-use a Hasher after calling hash() on it");
            this.f36346b.update(b);
        }

        /* renamed from: m */
        public final void mo57802m(int i, int i2, byte[] bArr) {
            C15794l.m25624r(!this.f36348d, "Cannot re-use a Hasher after calling hash() on it");
            this.f36346b.update(bArr, i, i2);
        }

        /* renamed from: n */
        public final void mo57853n(ByteBuffer byteBuffer) {
            C15794l.m25624r(!this.f36348d, "Cannot re-use a Hasher after calling hash() on it");
            this.f36346b.update(byteBuffer);
        }
    }

    public MessageDigestHashFunction(String str, String str2) {
        boolean z;
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            this.prototype = instance;
            this.bytes = instance.getDigestLength();
            str2.getClass();
            this.toString = str2;
            try {
                instance.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.supportsClone = z;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public int bits() {
        return this.bytes * 8;
    }

    public C16272f newHasher() {
        if (this.supportsClone) {
            try {
                return new C16261b((MessageDigest) this.prototype.clone(), this.bytes);
            } catch (CloneNotSupportedException unused) {
            }
        }
        try {
            return new C16261b(MessageDigest.getInstance(this.prototype.getAlgorithm()), this.bytes);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public String toString() {
        return this.toString;
    }

    public Object writeReplace() {
        return new SerializedForm(this.prototype.getAlgorithm(), this.bytes, this.toString, (C16260a) null);
    }

    public MessageDigestHashFunction(String str, int i, String str2) {
        str2.getClass();
        this.toString = str2;
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            this.prototype = instance;
            int digestLength = instance.getDigestLength();
            boolean z = true;
            C15794l.m25608b(i, digestLength, "bytes (%s) must be >= 4 and < %s", i >= 4 && i <= digestLength);
            this.bytes = i;
            try {
                instance.clone();
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.supportsClone = z;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
