package com.google.protobuf;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.C0087d;
import java.nio.ByteBuffer;

public final class Utf8 {

    /* renamed from: a */
    public static final C16853b f37176a = ((!(C16889f1.f37214e && C16889f1.f37213d) || C16877d.m28067a()) ? new C16854c() : new C16855d());

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i2) {
            super(C0087d.m235e("Unpaired surrogate at index ", i, " of ", i2));
        }
    }

    /* renamed from: com.google.protobuf.Utf8$a */
    public static class C16852a {
        /* renamed from: a */
        public static void m28001a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (!m28004d(b2)) {
                if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m28004d(b3) && !m28004d(b4)) {
                    byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                    cArr[i] = (char) ((b5 >>> 10) + 55232);
                    cArr[i + 1] = (char) ((b5 & 1023) + 56320);
                    return;
                }
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        /* renamed from: b */
        public static void m28002b(byte b, byte b2, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (b < -62 || m28004d(b2)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
        }

        /* renamed from: c */
        public static void m28003c(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (m28004d(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m28004d(b3)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
        }

        /* renamed from: d */
        public static boolean m28004d(byte b) {
            return b > -65;
        }
    }

    /* renamed from: com.google.protobuf.Utf8$b */
    public static abstract class C16853b {
        /* renamed from: b */
        public static String m28005b(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r12 < i3) {
                    byte b = byteBuffer.get(r12);
                    if (!(b >= 0)) {
                        break;
                    }
                    i = r12 + 1;
                    cArr[i4] = (char) b;
                    i4++;
                }
                int i5 = i4;
                while (r12 < i3) {
                    int i6 = r12 + 1;
                    byte b2 = byteBuffer.get(r12);
                    if (b2 >= 0) {
                        int i7 = i5 + 1;
                        cArr[i5] = (char) b2;
                        r12 = i6;
                        while (true) {
                            i5 = i7;
                            if (r12 >= i3) {
                                break;
                            }
                            byte b3 = byteBuffer.get(r12);
                            if (!(b3 >= 0)) {
                                break;
                            }
                            r12++;
                            i7 = i5 + 1;
                            cArr[i5] = (char) b3;
                        }
                    } else {
                        if (!(b2 < -32)) {
                            if (b2 < -16) {
                                if (i6 < i3 - 1) {
                                    int i8 = i6 + 1;
                                    C16852a.m28003c(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                                    r12 = i8 + 1;
                                    i5++;
                                } else {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                            } else if (i6 < i3 - 2) {
                                int i9 = i6 + 1;
                                byte b4 = byteBuffer.get(i6);
                                int i10 = i9 + 1;
                                C16852a.m28001a(b2, b4, byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                                i5 = i5 + 1 + 1;
                                r12 = i10 + 1;
                            } else {
                                throw InvalidProtocolBufferException.invalidUtf8();
                            }
                        } else if (i6 < i3) {
                            C16852a.m28002b(b2, byteBuffer.get(i6), cArr, i5);
                            r12 = i6 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
            if (r3.get(r0) > -65) goto L_0x0059;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x009e, code lost:
            if (r3.get(r0) > -65) goto L_0x00a0;
         */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m28006g(int r18, int r19, int r20, java.nio.ByteBuffer r21) {
            /*
                r0 = r18
                r1 = r19
                r2 = r20
                r3 = r21
                r4 = -1
                r5 = -19
                r6 = -62
                r7 = -16
                r8 = 0
                r9 = -96
                r10 = -32
                r11 = -65
                if (r0 == 0) goto L_0x00a1
                if (r1 < r2) goto L_0x001b
                return r0
            L_0x001b:
                byte r12 = (byte) r0
                if (r12 >= r10) goto L_0x002d
                if (r12 < r6) goto L_0x002c
                int r0 = r1 + 1
                byte r1 = r3.get(r1)
                if (r1 <= r11) goto L_0x0029
                goto L_0x002c
            L_0x0029:
                r1 = r0
                goto L_0x00a1
            L_0x002c:
                return r4
            L_0x002d:
                if (r12 >= r7) goto L_0x005a
                int r0 = r0 >> 8
                int r0 = ~r0
                byte r0 = (byte) r0
                if (r0 != 0) goto L_0x0042
                int r0 = r1 + 1
                byte r1 = r3.get(r1)
                if (r0 < r2) goto L_0x0047
                int r0 = com.google.protobuf.Utf8.m27998d(r12, r1)
                return r0
            L_0x0042:
                r17 = r1
                r1 = r0
                r0 = r17
            L_0x0047:
                if (r1 > r11) goto L_0x0059
                if (r12 != r10) goto L_0x004d
                if (r1 < r9) goto L_0x0059
            L_0x004d:
                if (r12 != r5) goto L_0x0051
                if (r1 >= r9) goto L_0x0059
            L_0x0051:
                int r1 = r0 + 1
                byte r0 = r3.get(r0)
                if (r0 <= r11) goto L_0x00a1
            L_0x0059:
                return r4
            L_0x005a:
                int r13 = r0 >> 8
                int r13 = ~r13
                byte r13 = (byte) r13
                if (r13 != 0) goto L_0x006f
                int r0 = r1 + 1
                byte r13 = r3.get(r1)
                if (r0 < r2) goto L_0x006d
                int r0 = com.google.protobuf.Utf8.m27998d(r12, r13)
                return r0
            L_0x006d:
                r1 = r8
                goto L_0x0077
            L_0x006f:
                int r0 = r0 >> 16
                byte r0 = (byte) r0
                r17 = r1
                r1 = r0
                r0 = r17
            L_0x0077:
                if (r1 != 0) goto L_0x008b
                int r1 = r0 + 1
                byte r0 = r3.get(r0)
                if (r1 < r2) goto L_0x0086
                int r0 = com.google.protobuf.Utf8.m27999e(r12, r13, r0)
                return r0
            L_0x0086:
                r17 = r1
                r1 = r0
                r0 = r17
            L_0x008b:
                if (r13 > r11) goto L_0x00a0
                int r12 = r12 << 28
                int r13 = r13 + 112
                int r13 = r13 + r12
                int r12 = r13 >> 30
                if (r12 != 0) goto L_0x00a0
                if (r1 > r11) goto L_0x00a0
                int r1 = r0 + 1
                byte r0 = r3.get(r0)
                if (r0 <= r11) goto L_0x00a1
            L_0x00a0:
                return r4
            L_0x00a1:
                com.google.protobuf.Utf8$b r0 = com.google.protobuf.Utf8.f37176a
                int r0 = r2 + -7
                r12 = r1
            L_0x00a6:
                if (r12 >= r0) goto L_0x00bb
                long r13 = r3.getLong(r12)
                r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r13 = r13 & r15
                r15 = 0
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 != 0) goto L_0x00bb
                int r12 = r12 + 8
                goto L_0x00a6
            L_0x00bb:
                int r12 = r12 - r1
                int r12 = r12 + r1
            L_0x00bd:
                if (r12 < r2) goto L_0x00c2
                r4 = r8
                goto L_0x012d
            L_0x00c2:
                int r0 = r12 + 1
                byte r1 = r3.get(r12)
                if (r1 >= 0) goto L_0x012e
                if (r1 >= r10) goto L_0x00dc
                if (r0 < r2) goto L_0x00d0
                r4 = r1
                goto L_0x012d
            L_0x00d0:
                if (r1 < r6) goto L_0x012d
                byte r1 = r3.get(r0)
                if (r1 <= r11) goto L_0x00d9
                goto L_0x012d
            L_0x00d9:
                int r0 = r0 + 1
                goto L_0x012e
            L_0x00dc:
                if (r1 >= r7) goto L_0x0102
                int r12 = r2 + -1
                if (r0 < r12) goto L_0x00e8
                int r2 = r2 - r0
                int r4 = com.google.protobuf.Utf8.m27996b(r1, r0, r2, r3)
                goto L_0x012d
            L_0x00e8:
                int r12 = r0 + 1
                byte r0 = r3.get(r0)
                if (r0 > r11) goto L_0x012d
                if (r1 != r10) goto L_0x00f4
                if (r0 < r9) goto L_0x012d
            L_0x00f4:
                if (r1 != r5) goto L_0x00f8
                if (r0 >= r9) goto L_0x012d
            L_0x00f8:
                byte r0 = r3.get(r12)
                if (r0 <= r11) goto L_0x00ff
                goto L_0x012d
            L_0x00ff:
                int r12 = r12 + 1
                goto L_0x00bd
            L_0x0102:
                int r12 = r2 + -2
                if (r0 < r12) goto L_0x010c
                int r2 = r2 - r0
                int r4 = com.google.protobuf.Utf8.m27996b(r1, r0, r2, r3)
                goto L_0x012d
            L_0x010c:
                int r12 = r0 + 1
                byte r0 = r3.get(r0)
                if (r0 > r11) goto L_0x012d
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L_0x012d
                int r0 = r12 + 1
                byte r1 = r3.get(r12)
                if (r1 > r11) goto L_0x012d
                int r12 = r0 + 1
                byte r0 = r3.get(r0)
                if (r0 <= r11) goto L_0x00bd
            L_0x012d:
                return r4
            L_0x012e:
                r12 = r0
                goto L_0x00bd
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.C16853b.m28006g(int, int, int, java.nio.ByteBuffer):int");
        }

        /* renamed from: a */
        public abstract String mo59814a(int i, int i2, byte[] bArr) throws InvalidProtocolBufferException;

        /* renamed from: c */
        public abstract String mo59815c(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException;

        /* renamed from: d */
        public abstract int mo59816d(CharSequence charSequence, byte[] bArr, int i, int i2);

        /* renamed from: e */
        public final int mo59817e(int i, int i2, int i3, ByteBuffer byteBuffer) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? mo59819h(i, i2, i3, byteBuffer) : m28006g(i, i2, i3, byteBuffer);
            }
            int arrayOffset = byteBuffer.arrayOffset();
            return mo59818f(i, i2 + arrayOffset, arrayOffset + i3, byteBuffer.array());
        }

        /* renamed from: f */
        public abstract int mo59818f(int i, int i2, int i3, byte[] bArr);

        /* renamed from: h */
        public abstract int mo59819h(int i, int i2, int i3, ByteBuffer byteBuffer);
    }

    /* renamed from: com.google.protobuf.Utf8$c */
    public static final class C16854c extends C16853b {
        /* renamed from: a */
        public final String mo59814a(int i, int i2, byte[] bArr) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r12 < i3) {
                    byte b = bArr[r12];
                    if (!(b >= 0)) {
                        break;
                    }
                    i = r12 + 1;
                    cArr[i4] = (char) b;
                    i4++;
                }
                int i5 = i4;
                while (r12 < i3) {
                    int i6 = r12 + 1;
                    byte b2 = bArr[r12];
                    if (b2 >= 0) {
                        int i7 = i5 + 1;
                        cArr[i5] = (char) b2;
                        r12 = i6;
                        while (true) {
                            i5 = i7;
                            if (r12 >= i3) {
                                break;
                            }
                            byte b3 = bArr[r12];
                            if (!(b3 >= 0)) {
                                break;
                            }
                            r12++;
                            i7 = i5 + 1;
                            cArr[i5] = (char) b3;
                        }
                    } else {
                        if (!(b2 < -32)) {
                            if (b2 < -16) {
                                if (i6 < i3 - 1) {
                                    int i8 = i6 + 1;
                                    C16852a.m28003c(b2, bArr[i6], bArr[i8], cArr, i5);
                                    r12 = i8 + 1;
                                    i5++;
                                } else {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                            } else if (i6 < i3 - 2) {
                                int i9 = i6 + 1;
                                byte b4 = bArr[i6];
                                int i10 = i9 + 1;
                                C16852a.m28001a(b2, b4, bArr[i9], bArr[i10], cArr, i5);
                                i5 = i5 + 1 + 1;
                                r12 = i10 + 1;
                            } else {
                                throw InvalidProtocolBufferException.invalidUtf8();
                            }
                        } else if (i6 < i3) {
                            C16852a.m28002b(b2, bArr[i6], cArr, i5);
                            r12 = i6 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: c */
        public final String mo59815c(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            return C16853b.m28005b(byteBuffer, i, i2);
        }

        /* renamed from: d */
        public final int mo59816d(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            int i5;
            char charAt;
            int length = charSequence.length();
            int i6 = i2 + i;
            int i7 = 0;
            while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
                bArr[i5] = (byte) charAt;
                i7++;
            }
            if (i7 == length) {
                return i + length;
            }
            int i8 = i + i7;
            while (i7 < length) {
                char charAt2 = charSequence.charAt(i7);
                if (charAt2 < 128 && i8 < i6) {
                    i3 = i8 + 1;
                    bArr[i8] = (byte) charAt2;
                } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                    i8 = i9 + 1;
                    bArr[i9] = (byte) ((charAt2 & RFC1522Codec.SEP) | 128);
                    i7++;
                } else if ((charAt2 < 55296 || 57343 < charAt2) && i8 <= i6 - 3) {
                    int i10 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 12) | 480);
                    int i11 = i10 + 1;
                    bArr[i10] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i3 = i11 + 1;
                    bArr[i11] = (byte) ((charAt2 & RFC1522Codec.SEP) | 128);
                } else if (i8 <= i6 - 4) {
                    int i12 = i7 + 1;
                    if (i12 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i12);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i13 = i8 + 1;
                            bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                            int i14 = i13 + 1;
                            bArr[i13] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i15 = i14 + 1;
                            bArr[i14] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i8 = i15 + 1;
                            bArr[i15] = (byte) ((codePoint & 63) | 128);
                            i7 = i12;
                            i7++;
                        } else {
                            i7 = i12;
                        }
                    }
                    throw new UnpairedSurrogateException(i7 - 1, length);
                } else if (55296 > charAt2 || charAt2 > 57343 || ((i4 = i7 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i4)))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i8);
                } else {
                    throw new UnpairedSurrogateException(i7, length);
                }
                i8 = i3;
                i7++;
            }
            return i8;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
            if (r15[r13] > -65) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0082, code lost:
            if (r15[r13] > -65) goto L_0x0084;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            if (r15[r13] > -65) goto L_0x0022;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo59818f(int r12, int r13, int r14, byte[] r15) {
            /*
                r11 = this;
                r0 = -19
                r1 = -62
                r2 = -16
                r3 = 0
                r4 = -96
                r5 = -32
                r6 = -1
                r7 = -65
                if (r12 == 0) goto L_0x0085
                if (r13 < r14) goto L_0x0013
                return r12
            L_0x0013:
                byte r8 = (byte) r12
                if (r8 >= r5) goto L_0x0023
                if (r8 < r1) goto L_0x0022
                int r12 = r13 + 1
                byte r13 = r15[r13]
                if (r13 <= r7) goto L_0x001f
                goto L_0x0022
            L_0x001f:
                r13 = r12
                goto L_0x0085
            L_0x0022:
                return r6
            L_0x0023:
                if (r8 >= r2) goto L_0x004a
                int r12 = r12 >> 8
                int r12 = ~r12
                byte r12 = (byte) r12
                if (r12 != 0) goto L_0x0039
                int r12 = r13 + 1
                byte r13 = r15[r13]
                if (r12 < r14) goto L_0x0036
                int r12 = com.google.protobuf.Utf8.m27998d(r8, r13)
                return r12
            L_0x0036:
                r10 = r13
                r13 = r12
                r12 = r10
            L_0x0039:
                if (r12 > r7) goto L_0x0049
                if (r8 != r5) goto L_0x003f
                if (r12 < r4) goto L_0x0049
            L_0x003f:
                if (r8 != r0) goto L_0x0043
                if (r12 >= r4) goto L_0x0049
            L_0x0043:
                int r12 = r13 + 1
                byte r13 = r15[r13]
                if (r13 <= r7) goto L_0x001f
            L_0x0049:
                return r6
            L_0x004a:
                int r9 = r12 >> 8
                int r9 = ~r9
                byte r9 = (byte) r9
                if (r9 != 0) goto L_0x005e
                int r12 = r13 + 1
                byte r9 = r15[r13]
                if (r12 < r14) goto L_0x005b
                int r12 = com.google.protobuf.Utf8.m27998d(r8, r9)
                return r12
            L_0x005b:
                r13 = r12
                r12 = r3
                goto L_0x0061
            L_0x005e:
                int r12 = r12 >> 16
                byte r12 = (byte) r12
            L_0x0061:
                if (r12 != 0) goto L_0x0071
                int r12 = r13 + 1
                byte r13 = r15[r13]
                if (r12 < r14) goto L_0x006e
                int r12 = com.google.protobuf.Utf8.m27999e(r8, r9, r13)
                return r12
            L_0x006e:
                r10 = r13
                r13 = r12
                r12 = r10
            L_0x0071:
                if (r9 > r7) goto L_0x0084
                int r8 = r8 << 28
                int r9 = r9 + 112
                int r9 = r9 + r8
                int r8 = r9 >> 30
                if (r8 != 0) goto L_0x0084
                if (r12 > r7) goto L_0x0084
                int r12 = r13 + 1
                byte r13 = r15[r13]
                if (r13 <= r7) goto L_0x001f
            L_0x0084:
                return r6
            L_0x0085:
                if (r13 >= r14) goto L_0x008e
                byte r12 = r15[r13]
                if (r12 < 0) goto L_0x008e
                int r13 = r13 + 1
                goto L_0x0085
            L_0x008e:
                if (r13 < r14) goto L_0x0092
                goto L_0x00ef
            L_0x0092:
                if (r13 < r14) goto L_0x0095
                goto L_0x00ef
            L_0x0095:
                int r12 = r13 + 1
                byte r13 = r15[r13]
                if (r13 >= 0) goto L_0x00f0
                if (r13 >= r5) goto L_0x00aa
                if (r12 < r14) goto L_0x00a1
                r3 = r13
                goto L_0x00ef
            L_0x00a1:
                if (r13 < r1) goto L_0x00ee
                int r13 = r12 + 1
                byte r12 = r15[r12]
                if (r12 <= r7) goto L_0x0092
                goto L_0x00ee
            L_0x00aa:
                if (r13 >= r2) goto L_0x00ca
                int r8 = r14 + -1
                if (r12 < r8) goto L_0x00b5
                int r3 = com.google.protobuf.Utf8.m27995a(r12, r14, r15)
                goto L_0x00ef
            L_0x00b5:
                int r8 = r12 + 1
                byte r12 = r15[r12]
                if (r12 > r7) goto L_0x00ee
                if (r13 != r5) goto L_0x00bf
                if (r12 < r4) goto L_0x00ee
            L_0x00bf:
                if (r13 != r0) goto L_0x00c3
                if (r12 >= r4) goto L_0x00ee
            L_0x00c3:
                int r13 = r8 + 1
                byte r12 = r15[r8]
                if (r12 <= r7) goto L_0x0092
                goto L_0x00ee
            L_0x00ca:
                int r8 = r14 + -2
                if (r12 < r8) goto L_0x00d3
                int r3 = com.google.protobuf.Utf8.m27995a(r12, r14, r15)
                goto L_0x00ef
            L_0x00d3:
                int r8 = r12 + 1
                byte r12 = r15[r12]
                if (r12 > r7) goto L_0x00ee
                int r13 = r13 << 28
                int r12 = r12 + 112
                int r12 = r12 + r13
                int r12 = r12 >> 30
                if (r12 != 0) goto L_0x00ee
                int r12 = r8 + 1
                byte r13 = r15[r8]
                if (r13 > r7) goto L_0x00ee
                int r13 = r12 + 1
                byte r12 = r15[r12]
                if (r12 <= r7) goto L_0x0092
            L_0x00ee:
                r3 = r6
            L_0x00ef:
                return r3
            L_0x00f0:
                r13 = r12
                goto L_0x0092
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.C16854c.mo59818f(int, int, int, byte[]):int");
        }

        /* renamed from: h */
        public final int mo59819h(int i, int i2, int i3, ByteBuffer byteBuffer) {
            return C16853b.m28006g(i, i2, i3, byteBuffer);
        }
    }

    /* renamed from: com.google.protobuf.Utf8$d */
    public static final class C16855d extends C16853b {
        /* renamed from: i */
        public static int m28018i(int i, int i2, long j) {
            if (i2 == 0) {
                C16853b bVar = Utf8.f37176a;
                if (i > -12) {
                    return -1;
                }
                return i;
            } else if (i2 == 1) {
                return Utf8.m27998d(i, C16889f1.m28149g(j));
            } else {
                if (i2 == 2) {
                    return Utf8.m27999e(i, C16889f1.m28149g(j), C16889f1.m28149g(j + 1));
                }
                throw new AssertionError();
            }
        }

        /* renamed from: j */
        public static int m28019j(long j, byte[] bArr, int i, int i2) {
            if (i2 == 0) {
                C16853b bVar = Utf8.f37176a;
                if (i > -12) {
                    return -1;
                }
                return i;
            } else if (i2 == 1) {
                return Utf8.m27998d(i, C16889f1.m28150h(j, bArr));
            } else {
                if (i2 == 2) {
                    return Utf8.m27999e(i, C16889f1.m28150h(j, bArr), C16889f1.m28150h(j + 1, bArr));
                }
                throw new AssertionError();
            }
        }

        /* renamed from: a */
        public final String mo59814a(int i, int i2, byte[] bArr) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r12 < i3) {
                    byte h = C16889f1.m28150h((long) r12, bArr);
                    if (!(h >= 0)) {
                        break;
                    }
                    i = r12 + 1;
                    cArr[i4] = (char) h;
                    i4++;
                }
                int i5 = i4;
                while (r12 < i3) {
                    int i6 = r12 + 1;
                    byte h2 = C16889f1.m28150h((long) r12, bArr);
                    if (h2 >= 0) {
                        int i7 = i5 + 1;
                        cArr[i5] = (char) h2;
                        r12 = i6;
                        while (true) {
                            i5 = i7;
                            if (r12 >= i3) {
                                break;
                            }
                            byte h3 = C16889f1.m28150h((long) r12, bArr);
                            if (!(h3 >= 0)) {
                                break;
                            }
                            r12++;
                            i7 = i5 + 1;
                            cArr[i5] = (char) h3;
                        }
                    } else {
                        if (!(h2 < -32)) {
                            if (h2 < -16) {
                                if (i6 < i3 - 1) {
                                    int i8 = i6 + 1;
                                    C16852a.m28003c(h2, C16889f1.m28150h((long) i6, bArr), C16889f1.m28150h((long) i8, bArr), cArr, i5);
                                    r12 = i8 + 1;
                                    i5++;
                                } else {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                            } else if (i6 < i3 - 2) {
                                int i9 = i6 + 1;
                                byte h4 = C16889f1.m28150h((long) i6, bArr);
                                int i10 = i9 + 1;
                                C16852a.m28001a(h2, h4, C16889f1.m28150h((long) i9, bArr), C16889f1.m28150h((long) i10, bArr), cArr, i5);
                                i5 = i5 + 1 + 1;
                                r12 = i10 + 1;
                            } else {
                                throw InvalidProtocolBufferException.invalidUtf8();
                            }
                        } else if (i6 < i3) {
                            C16852a.m28002b(h2, C16889f1.m28150h((long) i6, bArr), cArr, i5);
                            r12 = i6 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: c */
        public final String mo59815c(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            long j;
            int i3 = i;
            int i4 = i2;
            if ((i3 | i4 | ((byteBuffer.limit() - i3) - i4)) >= 0) {
                long k = C16889f1.f37212c.mo59928k(C16889f1.f37216g, byteBuffer) + ((long) i3);
                long j2 = ((long) i4) + k;
                char[] cArr = new char[i4];
                int i5 = 0;
                while (k < j2) {
                    byte g = C16889f1.m28149g(k);
                    if (!(g >= 0)) {
                        break;
                    }
                    k++;
                    cArr[i5] = (char) g;
                    i5++;
                }
                while (true) {
                    int i6 = i5;
                    while (j < j2) {
                        long j3 = j + 1;
                        byte g2 = C16889f1.m28149g(j);
                        if (g2 >= 0) {
                            cArr[i6] = (char) g2;
                            i6++;
                            j = j3;
                            while (j < j2) {
                                byte g3 = C16889f1.m28149g(j);
                                if (!(g3 >= 0)) {
                                    break;
                                }
                                j++;
                                cArr[i6] = (char) g3;
                                i6++;
                            }
                        } else {
                            if (!(g2 < -32)) {
                                if (g2 < -16) {
                                    if (j3 < j2 - 1) {
                                        long j4 = j3 + 1;
                                        C16852a.m28003c(g2, C16889f1.m28149g(j3), C16889f1.m28149g(j4), cArr, i6);
                                        i6++;
                                        j = j4 + 1;
                                    } else {
                                        throw InvalidProtocolBufferException.invalidUtf8();
                                    }
                                } else if (j3 < j2 - 2) {
                                    long j5 = j3 + 1;
                                    byte g4 = C16889f1.m28149g(j3);
                                    long j6 = j5 + 1;
                                    byte g5 = C16889f1.m28149g(j5);
                                    k = j6 + 1;
                                    C16852a.m28001a(g2, g4, g5, C16889f1.m28149g(j6), cArr, i6);
                                    i5 = i6 + 1 + 1;
                                } else {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                            } else if (j3 < j2) {
                                j = j3 + 1;
                                C16852a.m28002b(g2, C16889f1.m28149g(j3), cArr, i6);
                                i6++;
                            } else {
                                throw InvalidProtocolBufferException.invalidUtf8();
                            }
                        }
                    }
                    return new String(cArr, 0, i6);
                }
            }
            ByteBuffer byteBuffer2 = byteBuffer;
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:38:0x00f3, LOOP_START, PHI: r2 r3 r4 r11 
          PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x002f, B:38:0x00f3] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:10:0x002f, B:38:0x00f3] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v3 long) = (r4v2 long), (r4v4 long) binds: [B:10:0x002f, B:38:0x00f3] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x002f, B:38:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo59816d(java.lang.CharSequence r20, byte[] r21, int r22, int r23) {
            /*
                r19 = this;
                r0 = r20
                r1 = r21
                r2 = r22
                r3 = r23
                long r4 = (long) r2
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r20.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L_0x0135
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L_0x0135
                r2 = 0
            L_0x001a:
                r11 = 1
                r3 = 128(0x80, float:1.794E-43)
                if (r2 >= r8) goto L_0x002f
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x002f
                long r11 = r11 + r4
                byte r3 = (byte) r13
                com.google.protobuf.C16889f1.m28160r(r1, r3, r4)
                int r2 = r2 + 1
                r4 = r11
                goto L_0x001a
            L_0x002f:
                if (r2 != r8) goto L_0x0033
                int r0 = (int) r4
                return r0
            L_0x0033:
                if (r2 >= r8) goto L_0x0133
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x0048
                int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r14 >= 0) goto L_0x0048
                long r14 = r4 + r11
                byte r13 = (byte) r13
                com.google.protobuf.C16889f1.m28160r(r1, r13, r4)
                r4 = r14
                goto L_0x00f3
            L_0x0048:
                r3 = 2048(0x800, float:2.87E-42)
                if (r13 >= r3) goto L_0x0071
                r14 = 2
                long r14 = r6 - r14
                int r3 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r3 > 0) goto L_0x0071
                long r14 = r4 + r11
                int r3 = r13 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                com.google.protobuf.C16889f1.m28160r(r1, r3, r4)
                long r3 = r14 + r11
                r5 = r13 & 63
                r5 = r5 | 128(0x80, float:1.794E-43)
                byte r5 = (byte) r5
                com.google.protobuf.C16889f1.m28160r(r1, r5, r14)
            L_0x0068:
                r5 = 128(0x80, float:1.794E-43)
                r17 = r3
                r3 = r5
                r4 = r17
                goto L_0x00f3
            L_0x0071:
                r3 = 57343(0xdfff, float:8.0355E-41)
                r14 = 55296(0xd800, float:7.7486E-41)
                if (r13 < r14) goto L_0x007b
                if (r3 >= r13) goto L_0x00a6
            L_0x007b:
                r15 = 3
                long r15 = r6 - r15
                int r15 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r15 > 0) goto L_0x00a6
                long r14 = r4 + r11
                int r3 = r13 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                com.google.protobuf.C16889f1.m28160r(r1, r3, r4)
                long r11 = r11 + r14
                int r3 = r13 >>> 6
                r3 = r3 & 63
                r3 = r3 | 128(0x80, float:1.794E-43)
                byte r3 = (byte) r3
                com.google.protobuf.C16889f1.m28160r(r1, r3, r14)
                r3 = 1
                long r3 = r3 + r11
                r5 = r13 & 63
                r5 = r5 | 128(0x80, float:1.794E-43)
                byte r5 = (byte) r5
                com.google.protobuf.C16889f1.m28160r(r1, r5, r11)
                r11 = 1
                goto L_0x0068
            L_0x00a6:
                r11 = 4
                long r11 = r6 - r11
                int r11 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r11 > 0) goto L_0x0100
                int r3 = r2 + 1
                if (r3 == r8) goto L_0x00f8
                char r2 = r0.charAt(r3)
                boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
                if (r11 == 0) goto L_0x00f7
                int r2 = java.lang.Character.toCodePoint(r13, r2)
                r11 = 1
                long r13 = r4 + r11
                int r15 = r2 >>> 18
                r15 = r15 | 240(0xf0, float:3.36E-43)
                byte r15 = (byte) r15
                com.google.protobuf.C16889f1.m28160r(r1, r15, r4)
                long r11 = r11 + r13
                int r4 = r2 >>> 12
                r4 = r4 & 63
                r5 = 128(0x80, float:1.794E-43)
                r4 = r4 | 128(0x80, float:1.794E-43)
                byte r4 = (byte) r4
                com.google.protobuf.C16889f1.m28160r(r1, r4, r13)
                r13 = 1
                long r13 = r13 + r11
                int r4 = r2 >>> 6
                r4 = r4 & 63
                r4 = r4 | r5
                byte r4 = (byte) r4
                com.google.protobuf.C16889f1.m28160r(r1, r4, r11)
                r11 = 1
                long r15 = r13 + r11
                r2 = r2 & 63
                r2 = r2 | r5
                byte r2 = (byte) r2
                com.google.protobuf.C16889f1.m28160r(r1, r2, r13)
                r2 = r3
                r3 = r5
                r4 = r15
            L_0x00f3:
                int r2 = r2 + 1
                goto L_0x0033
            L_0x00f7:
                r2 = r3
            L_0x00f8:
                com.google.protobuf.Utf8$UnpairedSurrogateException r0 = new com.google.protobuf.Utf8$UnpairedSurrogateException
                int r2 = r2 + -1
                r0.<init>(r2, r8)
                throw r0
            L_0x0100:
                if (r14 > r13) goto L_0x0118
                if (r13 > r3) goto L_0x0118
                int r1 = r2 + 1
                if (r1 == r8) goto L_0x0112
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
                if (r0 != 0) goto L_0x0118
            L_0x0112:
                com.google.protobuf.Utf8$UnpairedSurrogateException r0 = new com.google.protobuf.Utf8$UnpairedSurrogateException
                r0.<init>(r2, r8)
                throw r0
            L_0x0118:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r13)
                r1.append(r9)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0133:
                int r0 = (int) r4
                return r0
            L_0x0135:
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r4 = android.support.p013v4.media.C0072d.m201h(r10)
                int r8 = r8 + -1
                char r0 = r0.charAt(r8)
                r4.append(r0)
                r4.append(r9)
                int r0 = r2 + r3
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.C16855d.mo59816d(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
            if (com.google.protobuf.C16889f1.m28150h(r8, r3) > -65) goto L_0x003d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
            if (com.google.protobuf.C16889f1.m28150h(r8, r3) > -65) goto L_0x0069;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo59818f(int r24, int r25, int r26, byte[] r27) {
            /*
                r23 = this;
                r0 = r24
                r1 = r25
                r2 = r26
                r3 = r27
                r4 = r1 | r2
                int r5 = r3.length
                int r5 = r5 - r2
                r4 = r4 | r5
                r5 = 2
                if (r4 < 0) goto L_0x0153
                long r8 = (long) r1
                long r1 = (long) r2
                r4 = -19
                r10 = -62
                r11 = -16
                r12 = 16
                r13 = -96
                r14 = -32
                r15 = -65
                r16 = -1
                r17 = 1
                if (r0 == 0) goto L_0x00b1
                int r19 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r19 < 0) goto L_0x002b
                return r0
            L_0x002b:
                byte r7 = (byte) r0
                if (r7 >= r14) goto L_0x003e
                if (r7 < r10) goto L_0x003d
                long r20 = r8 + r17
                byte r0 = com.google.protobuf.C16889f1.m28150h(r8, r3)
                if (r0 <= r15) goto L_0x0039
                goto L_0x003d
            L_0x0039:
                r8 = r20
                goto L_0x00b1
            L_0x003d:
                return r16
            L_0x003e:
                if (r7 >= r11) goto L_0x006a
                int r0 = r0 >> 8
                int r0 = ~r0
                byte r0 = (byte) r0
                if (r0 != 0) goto L_0x0057
                long r20 = r8 + r17
                byte r0 = com.google.protobuf.C16889f1.m28150h(r8, r3)
                int r8 = (r20 > r1 ? 1 : (r20 == r1 ? 0 : -1))
                if (r8 < 0) goto L_0x0055
                int r0 = com.google.protobuf.Utf8.m27998d(r7, r0)
                return r0
            L_0x0055:
                r8 = r20
            L_0x0057:
                if (r0 > r15) goto L_0x0069
                if (r7 != r14) goto L_0x005d
                if (r0 < r13) goto L_0x0069
            L_0x005d:
                if (r7 != r4) goto L_0x0061
                if (r0 >= r13) goto L_0x0069
            L_0x0061:
                long r20 = r8 + r17
                byte r0 = com.google.protobuf.C16889f1.m28150h(r8, r3)
                if (r0 <= r15) goto L_0x0039
            L_0x0069:
                return r16
            L_0x006a:
                int r6 = r0 >> 8
                int r6 = ~r6
                byte r6 = (byte) r6
                if (r6 != 0) goto L_0x0083
                long r21 = r8 + r17
                byte r6 = com.google.protobuf.C16889f1.m28150h(r8, r3)
                int r0 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
                if (r0 < 0) goto L_0x007f
                int r0 = com.google.protobuf.Utf8.m27998d(r7, r6)
                return r0
            L_0x007f:
                r8 = r21
                r0 = 0
                goto L_0x0085
            L_0x0083:
                int r0 = r0 >> r12
                byte r0 = (byte) r0
            L_0x0085:
                if (r0 != 0) goto L_0x0098
                long r21 = r8 + r17
                byte r0 = com.google.protobuf.C16889f1.m28150h(r8, r3)
                int r8 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
                if (r8 < 0) goto L_0x0096
                int r0 = com.google.protobuf.Utf8.m27999e(r7, r6, r0)
                return r0
            L_0x0096:
                r8 = r21
            L_0x0098:
                if (r6 > r15) goto L_0x00b0
                int r7 = r7 << 28
                int r6 = r6 + 112
                int r6 = r6 + r7
                int r6 = r6 >> 30
                if (r6 != 0) goto L_0x00b0
                if (r0 > r15) goto L_0x00b0
                long r6 = r8 + r17
                byte r0 = com.google.protobuf.C16889f1.m28150h(r8, r3)
                if (r0 <= r15) goto L_0x00ae
                goto L_0x00b0
            L_0x00ae:
                r8 = r6
                goto L_0x00b1
            L_0x00b0:
                return r16
            L_0x00b1:
                long r1 = r1 - r8
                int r0 = (int) r1
                if (r0 >= r12) goto L_0x00b7
                r1 = 0
                goto L_0x00ca
            L_0x00b7:
                r6 = r8
                r1 = 0
            L_0x00b9:
                if (r1 >= r0) goto L_0x00c9
                long r21 = r6 + r17
                byte r2 = com.google.protobuf.C16889f1.m28150h(r6, r3)
                if (r2 >= 0) goto L_0x00c4
                goto L_0x00ca
            L_0x00c4:
                int r1 = r1 + 1
                r6 = r21
                goto L_0x00b9
            L_0x00c9:
                r1 = r0
            L_0x00ca:
                int r0 = r0 - r1
                long r1 = (long) r1
                long r8 = r8 + r1
            L_0x00cd:
                r1 = 0
            L_0x00ce:
                if (r0 <= 0) goto L_0x00df
                long r1 = r8 + r17
                byte r6 = com.google.protobuf.C16889f1.m28150h(r8, r3)
                if (r6 < 0) goto L_0x00dd
                int r0 = r0 + -1
                r8 = r1
                r1 = r6
                goto L_0x00ce
            L_0x00dd:
                r8 = r1
                r1 = r6
            L_0x00df:
                if (r0 != 0) goto L_0x00e4
                r7 = 0
                goto L_0x0152
            L_0x00e4:
                int r0 = r0 + -1
                if (r1 >= r14) goto L_0x00ff
                if (r0 != 0) goto L_0x00ed
                r7 = r1
                goto L_0x0152
            L_0x00ed:
                int r0 = r0 + -1
                if (r1 < r10) goto L_0x00fc
                long r1 = r8 + r17
                byte r6 = com.google.protobuf.C16889f1.m28150h(r8, r3)
                if (r6 <= r15) goto L_0x00fa
                goto L_0x00fc
            L_0x00fa:
                r8 = r1
                goto L_0x00cd
            L_0x00fc:
                r7 = r16
                goto L_0x0152
            L_0x00ff:
                if (r1 >= r11) goto L_0x0123
                if (r0 >= r5) goto L_0x0108
                int r7 = m28019j(r8, r3, r1, r0)
                goto L_0x0152
            L_0x0108:
                int r0 = r0 + -2
                long r6 = r8 + r17
                byte r2 = com.google.protobuf.C16889f1.m28150h(r8, r3)
                if (r2 > r15) goto L_0x00fc
                if (r1 != r14) goto L_0x0116
                if (r2 < r13) goto L_0x00fc
            L_0x0116:
                if (r1 != r4) goto L_0x011a
                if (r2 >= r13) goto L_0x00fc
            L_0x011a:
                long r8 = r6 + r17
                byte r1 = com.google.protobuf.C16889f1.m28150h(r6, r3)
                if (r1 <= r15) goto L_0x00cd
                goto L_0x00fc
            L_0x0123:
                r2 = 3
                if (r0 >= r2) goto L_0x012b
                int r7 = m28019j(r8, r3, r1, r0)
                goto L_0x0152
            L_0x012b:
                int r0 = r0 + -3
                long r6 = r8 + r17
                byte r2 = com.google.protobuf.C16889f1.m28150h(r8, r3)
                if (r2 > r15) goto L_0x00fc
                int r1 = r1 << 28
                int r2 = r2 + 112
                int r2 = r2 + r1
                int r1 = r2 >> 30
                if (r1 != 0) goto L_0x00fc
                long r1 = r6 + r17
                byte r6 = com.google.protobuf.C16889f1.m28150h(r6, r3)
                if (r6 > r15) goto L_0x00fc
                long r6 = r1 + r17
                byte r1 = com.google.protobuf.C16889f1.m28150h(r1, r3)
                if (r1 <= r15) goto L_0x014f
                goto L_0x00fc
            L_0x014f:
                r8 = r6
                goto L_0x00cd
            L_0x0152:
                return r7
            L_0x0153:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                int r3 = r3.length
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r6 = 0
                r4[r6] = r3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
                r3 = 1
                r4[r3] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
                r4[r5] = r1
                java.lang.String r1 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r1 = java.lang.String.format(r1, r4)
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.C16855d.mo59818f(int, int, int, byte[]):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
            if (com.google.protobuf.C16889f1.m28149g(r6) > -65) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
            if (com.google.protobuf.C16889f1.m28149g(r6) > -65) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b5, code lost:
            if (com.google.protobuf.C16889f1.m28149g(r6) > -65) goto L_0x00bb;
         */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo59819h(int r24, int r25, int r26, java.nio.ByteBuffer r27) {
            /*
                r23 = this;
                r0 = r24
                r1 = r25
                r2 = r1 | r26
                int r3 = r27.limit()
                int r3 = r3 - r26
                r2 = r2 | r3
                r5 = 2
                if (r2 < 0) goto L_0x0185
                com.google.protobuf.f1$e r2 = com.google.protobuf.C16889f1.f37212c
                long r6 = com.google.protobuf.C16889f1.f37216g
                r8 = r27
                long r6 = r2.mo59928k(r6, r8)
                long r8 = (long) r1
                long r6 = r6 + r8
                int r1 = r26 - r1
                long r1 = (long) r1
                long r1 = r1 + r6
                r8 = -19
                r9 = -62
                r10 = -16
                r11 = 16
                r12 = -96
                r13 = -32
                r14 = -65
                r15 = 1
                r4 = 8
                r17 = -1
                if (r0 == 0) goto L_0x00bc
                int r18 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r18 < 0) goto L_0x003b
                return r0
            L_0x003b:
                byte r3 = (byte) r0
                if (r3 >= r13) goto L_0x0049
                if (r3 < r9) goto L_0x0048
                long r19 = r6 + r15
                byte r0 = com.google.protobuf.C16889f1.m28149g(r6)
                if (r0 <= r14) goto L_0x00b8
            L_0x0048:
                return r17
            L_0x0049:
                if (r3 >= r10) goto L_0x0074
                int r0 = r0 >> r4
                int r0 = ~r0
                byte r0 = (byte) r0
                if (r0 != 0) goto L_0x0061
                long r19 = r6 + r15
                byte r0 = com.google.protobuf.C16889f1.m28149g(r6)
                int r6 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
                if (r6 < 0) goto L_0x005f
                int r0 = com.google.protobuf.Utf8.m27998d(r3, r0)
                return r0
            L_0x005f:
                r6 = r19
            L_0x0061:
                if (r0 > r14) goto L_0x0073
                if (r3 != r13) goto L_0x0067
                if (r0 < r12) goto L_0x0073
            L_0x0067:
                if (r3 != r8) goto L_0x006b
                if (r0 >= r12) goto L_0x0073
            L_0x006b:
                long r19 = r6 + r15
                byte r0 = com.google.protobuf.C16889f1.m28149g(r6)
                if (r0 <= r14) goto L_0x00b8
            L_0x0073:
                return r17
            L_0x0074:
                int r8 = r0 >> 8
                int r8 = ~r8
                byte r8 = (byte) r8
                if (r8 != 0) goto L_0x008d
                long r19 = r6 + r15
                byte r8 = com.google.protobuf.C16889f1.m28149g(r6)
                int r0 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
                if (r0 < 0) goto L_0x0089
                int r0 = com.google.protobuf.Utf8.m27998d(r3, r8)
                return r0
            L_0x0089:
                r6 = r19
                r0 = 0
                goto L_0x008f
            L_0x008d:
                int r0 = r0 >> r11
                byte r0 = (byte) r0
            L_0x008f:
                if (r0 != 0) goto L_0x00a2
                long r19 = r6 + r15
                byte r0 = com.google.protobuf.C16889f1.m28149g(r6)
                int r6 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
                if (r6 < 0) goto L_0x00a0
                int r0 = com.google.protobuf.Utf8.m27999e(r3, r8, r0)
                return r0
            L_0x00a0:
                r6 = r19
            L_0x00a2:
                if (r8 > r14) goto L_0x00bb
                int r3 = r3 << 28
                int r8 = r8 + 112
                int r8 = r8 + r3
                int r3 = r8 >> 30
                if (r3 != 0) goto L_0x00bb
                if (r0 > r14) goto L_0x00bb
                long r19 = r6 + r15
                byte r0 = com.google.protobuf.C16889f1.m28149g(r6)
                if (r0 <= r14) goto L_0x00b8
                goto L_0x00bb
            L_0x00b8:
                r6 = r19
                goto L_0x00bc
            L_0x00bb:
                return r17
            L_0x00bc:
                long r1 = r1 - r6
                int r0 = (int) r1
                if (r0 >= r11) goto L_0x00c2
                r1 = 0
                goto L_0x00fd
            L_0x00c2:
                int r1 = (int) r6
                r1 = r1 & 7
                int r1 = 8 - r1
                r2 = r1
                r19 = r6
            L_0x00ca:
                if (r2 <= 0) goto L_0x00db
                long r21 = r19 + r15
                byte r3 = com.google.protobuf.C16889f1.m28149g(r19)
                if (r3 >= 0) goto L_0x00d6
                int r1 = r1 - r2
                goto L_0x00fd
            L_0x00d6:
                int r2 = r2 + -1
                r19 = r21
                goto L_0x00ca
            L_0x00db:
                int r1 = r0 - r1
                r2 = r19
            L_0x00df:
                if (r1 < r4) goto L_0x00fb
                com.google.protobuf.f1$e r8 = com.google.protobuf.C16889f1.f37212c
                long r19 = r8.mo59920j(r2)
                r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r19 = r19 & r21
                r21 = 0
                int r8 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
                if (r8 != 0) goto L_0x00fb
                r19 = 8
                long r2 = r2 + r19
                int r1 = r1 + -8
                goto L_0x00df
            L_0x00fb:
                int r1 = r0 - r1
            L_0x00fd:
                long r2 = (long) r1
                long r6 = r6 + r2
                int r0 = r0 - r1
            L_0x0100:
                r1 = 0
            L_0x0101:
                if (r0 <= 0) goto L_0x0112
                long r1 = r6 + r15
                byte r3 = com.google.protobuf.C16889f1.m28149g(r6)
                if (r3 < 0) goto L_0x0110
                int r0 = r0 + -1
                r6 = r1
                r1 = r3
                goto L_0x0101
            L_0x0110:
                r6 = r1
                r1 = r3
            L_0x0112:
                if (r0 != 0) goto L_0x0117
                r4 = 0
                goto L_0x0184
            L_0x0117:
                int r0 = r0 + -1
                if (r1 >= r13) goto L_0x012f
                if (r0 != 0) goto L_0x0120
                r4 = r1
                goto L_0x0184
            L_0x0120:
                int r0 = r0 + -1
                if (r1 < r9) goto L_0x0182
                long r1 = r6 + r15
                byte r3 = com.google.protobuf.C16889f1.m28149g(r6)
                if (r3 <= r14) goto L_0x012d
                goto L_0x0182
            L_0x012d:
                r6 = r1
                goto L_0x0100
            L_0x012f:
                if (r1 >= r10) goto L_0x0155
                if (r0 >= r5) goto L_0x0138
                int r4 = m28018i(r1, r0, r6)
                goto L_0x0184
            L_0x0138:
                int r0 = r0 + -2
                long r2 = r6 + r15
                byte r4 = com.google.protobuf.C16889f1.m28149g(r6)
                if (r4 > r14) goto L_0x0182
                if (r1 != r13) goto L_0x0146
                if (r4 < r12) goto L_0x0182
            L_0x0146:
                r8 = -19
                if (r1 != r8) goto L_0x014c
                if (r4 >= r12) goto L_0x0182
            L_0x014c:
                long r6 = r2 + r15
                byte r1 = com.google.protobuf.C16889f1.m28149g(r2)
                if (r1 <= r14) goto L_0x0100
                goto L_0x0182
            L_0x0155:
                r2 = 3
                r8 = -19
                if (r0 >= r2) goto L_0x015f
                int r4 = m28018i(r1, r0, r6)
                goto L_0x0184
            L_0x015f:
                int r0 = r0 + -3
                long r2 = r6 + r15
                byte r4 = com.google.protobuf.C16889f1.m28149g(r6)
                if (r4 > r14) goto L_0x0182
                int r1 = r1 << 28
                int r4 = r4 + 112
                int r4 = r4 + r1
                int r1 = r4 >> 30
                if (r1 != 0) goto L_0x0182
                long r6 = r2 + r15
                byte r1 = com.google.protobuf.C16889f1.m28149g(r2)
                if (r1 > r14) goto L_0x0182
                long r1 = r6 + r15
                byte r3 = com.google.protobuf.C16889f1.m28149g(r6)
                if (r3 <= r14) goto L_0x012d
            L_0x0182:
                r4 = r17
            L_0x0184:
                return r4
            L_0x0185:
                r8 = r27
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                int r3 = r27.limit()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = 0
                r2[r4] = r3
                r3 = 1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
                r2[r3] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
                r2[r5] = r1
                java.lang.String r1 = "buffer limit=%d, index=%d, limit=%d"
                java.lang.String r1 = java.lang.String.format(r1, r2)
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.C16855d.mo59819h(int, int, int, java.nio.ByteBuffer):int");
        }
    }

    /* renamed from: a */
    public static int m27995a(int i, int i2, byte[] bArr) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                b = -1;
            }
            return b;
        } else if (i3 == 1) {
            return m27998d(b, bArr[i]);
        } else {
            if (i3 == 2) {
                return m27999e(b, bArr[i], bArr[i + 1]);
            }
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    public static int m27996b(int i, int i2, int i3, ByteBuffer byteBuffer) {
        if (i3 != 0) {
            if (i3 == 1) {
                return m27998d(i, byteBuffer.get(i2));
            }
            if (i3 == 2) {
                return m27999e(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
            }
            throw new AssertionError();
        } else if (i > -12) {
            return -1;
        } else {
            return i;
        }
    }

    /* renamed from: c */
    public static int m27997c(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new UnpairedSurrogateException(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder h = C0072d.m201h("UTF-8 length does not fit in int: ");
        h.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(h.toString());
    }

    /* renamed from: d */
    public static int m27998d(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: e */
    public static int m27999e(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: f */
    public static boolean m28000f(int i, int i2, byte[] bArr) {
        return f37176a.mo59818f(0, i, i2, bArr) == 0;
    }
}
