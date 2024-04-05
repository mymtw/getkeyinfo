package com.google.common.hash;

import com.google.common.base.C15794l;
import com.google.common.primitives.UnsignedInts;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class HashCode {

    /* renamed from: b */
    public static final char[] f36343b = "0123456789abcdef".toCharArray();

    public static final class BytesHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        public final byte[] bytes;

        public BytesHashCode(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }

        public byte[] asBytes() {
            return (byte[]) this.bytes.clone();
        }

        public int asInt() {
            byte[] bArr = this.bytes;
            C15794l.m25620n(bArr.length, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length >= 4);
            byte[] bArr2 = this.bytes;
            return ((bArr2[3] & 255) << 24) | (bArr2[0] & 255) | ((bArr2[1] & 255) << 8) | ((bArr2[2] & 255) << 16);
        }

        public long asLong() {
            byte[] bArr = this.bytes;
            C15794l.m25620n(bArr.length, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", bArr.length >= 8);
            return padToLong();
        }

        public int bits() {
            return this.bytes.length * 8;
        }

        public boolean equalsSameBits(HashCode hashCode) {
            if (this.bytes.length != hashCode.getBytesInternal().length) {
                return false;
            }
            boolean z = true;
            int i = 0;
            while (true) {
                byte[] bArr = this.bytes;
                if (i >= bArr.length) {
                    return z;
                }
                z &= bArr[i] == hashCode.getBytesInternal()[i];
                i++;
            }
        }

        public byte[] getBytesInternal() {
            return this.bytes;
        }

        public long padToLong() {
            long j = (long) (this.bytes[0] & 255);
            for (int i = 1; i < Math.min(this.bytes.length, 8); i++) {
                j |= (((long) this.bytes[i]) & 255) << (i * 8);
            }
            return j;
        }

        public void writeBytesToImpl(byte[] bArr, int i, int i2) {
            System.arraycopy(this.bytes, 0, bArr, i, i2);
        }
    }

    public static final class IntHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        public final int hash;

        public IntHashCode(int i) {
            this.hash = i;
        }

        public byte[] asBytes() {
            int i = this.hash;
            return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
        }

        public int asInt() {
            return this.hash;
        }

        public long asLong() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        public int bits() {
            return 32;
        }

        public boolean equalsSameBits(HashCode hashCode) {
            return this.hash == hashCode.asInt();
        }

        public long padToLong() {
            return UnsignedInts.m26389a(this.hash);
        }

        public void writeBytesToImpl(byte[] bArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                bArr[i + i3] = (byte) (this.hash >> (i3 * 8));
            }
        }
    }

    public static final class LongHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        public final long hash;

        public LongHashCode(long j) {
            this.hash = j;
        }

        public byte[] asBytes() {
            long j = this.hash;
            return new byte[]{(byte) ((int) j), (byte) ((int) (j >> 8)), (byte) ((int) (j >> 16)), (byte) ((int) (j >> 24)), (byte) ((int) (j >> 32)), (byte) ((int) (j >> 40)), (byte) ((int) (j >> 48)), (byte) ((int) (j >> 56))};
        }

        public int asInt() {
            return (int) this.hash;
        }

        public long asLong() {
            return this.hash;
        }

        public int bits() {
            return 64;
        }

        public boolean equalsSameBits(HashCode hashCode) {
            return this.hash == hashCode.asLong();
        }

        public long padToLong() {
            return this.hash;
        }

        public void writeBytesToImpl(byte[] bArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                bArr[i + i3] = (byte) ((int) (this.hash >> (i3 * 8)));
            }
        }
    }

    /* renamed from: a */
    public static int m26270a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return (c - 'a') + 10;
        }
        throw new IllegalArgumentException("Illegal hexadecimal character: " + c);
    }

    public static HashCode fromBytes(byte[] bArr) {
        boolean z = true;
        if (bArr.length < 1) {
            z = false;
        }
        C15794l.m25614h(z, "A HashCode must contain at least 1 byte.");
        return fromBytesNoCopy((byte[]) bArr.clone());
    }

    public static HashCode fromBytesNoCopy(byte[] bArr) {
        return new BytesHashCode(bArr);
    }

    public static HashCode fromInt(int i) {
        return new IntHashCode(i);
    }

    public static HashCode fromLong(long j) {
        return new LongHashCode(j);
    }

    public static HashCode fromString(String str) {
        boolean z = true;
        C15794l.m25612f(str, "input string (%s) must have at least 2 characters", str.length() >= 2);
        if (str.length() % 2 != 0) {
            z = false;
        }
        C15794l.m25612f(str, "input string (%s) must have an even number of characters", z);
        byte[] bArr = new byte[(str.length() / 2)];
        for (int i = 0; i < str.length(); i += 2) {
            bArr[i / 2] = (byte) ((m26270a(str.charAt(i)) << 4) + m26270a(str.charAt(i + 1)));
        }
        return fromBytesNoCopy(bArr);
    }

    public abstract byte[] asBytes();

    public abstract int asInt();

    public abstract long asLong();

    public abstract int bits();

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof HashCode)) {
            return false;
        }
        HashCode hashCode = (HashCode) obj;
        return bits() == hashCode.bits() && equalsSameBits(hashCode);
    }

    public abstract boolean equalsSameBits(HashCode hashCode);

    public byte[] getBytesInternal() {
        return asBytes();
    }

    public final int hashCode() {
        if (bits() >= 32) {
            return asInt();
        }
        byte[] bytesInternal = getBytesInternal();
        byte b = bytesInternal[0] & 255;
        for (int i = 1; i < bytesInternal.length; i++) {
            b |= (bytesInternal[i] & 255) << (i * 8);
        }
        return b;
    }

    public abstract long padToLong();

    public final String toString() {
        byte[] bytesInternal = getBytesInternal();
        StringBuilder sb = new StringBuilder(bytesInternal.length * 2);
        for (byte b : bytesInternal) {
            char[] cArr = f36343b;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    @CanIgnoreReturnValue
    public int writeBytesTo(byte[] bArr, int i, int i2) {
        int[] iArr = {i2, bits() / 8};
        int i3 = iArr[0];
        for (int i4 = 1; i4 < 2; i4++) {
            int i5 = iArr[i4];
            if (i5 < i3) {
                i3 = i5;
            }
        }
        C15794l.m25619m(i, i + i3, bArr.length);
        writeBytesToImpl(bArr, i, i3);
        return i3;
    }

    public abstract void writeBytesToImpl(byte[] bArr, int i, int i2);
}
