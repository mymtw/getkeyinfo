package com.google.protobuf;

import android.support.p013v4.media.C0069a;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import com.google.protobuf.RopeByteString;
import com.google.protobuf.Utf8;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.google.protobuf.i */
public abstract class C16900i {

    /* renamed from: a */
    public int f37224a = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: com.google.protobuf.i$a */
    public static final class C16901a extends C16900i {

        /* renamed from: b */
        public final byte[] f37225b;

        /* renamed from: c */
        public int f37226c;

        /* renamed from: d */
        public int f37227d;

        /* renamed from: e */
        public int f37228e;

        /* renamed from: f */
        public int f37229f;

        /* renamed from: g */
        public int f37230g = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        public C16901a(byte[] bArr, int i, int i2, boolean z) {
            this.f37225b = bArr;
            this.f37226c = i2 + i;
            this.f37228e = i;
            this.f37229f = i;
        }

        /* renamed from: d */
        public final ByteString mo59934d() throws IOException {
            byte[] bArr;
            int h = mo59938h();
            if (h > 0) {
                int i = this.f37226c;
                int i2 = this.f37228e;
                if (h <= i - i2) {
                    ByteString copyFrom = ByteString.copyFrom(this.f37225b, i2, h);
                    this.f37228e += h;
                    return copyFrom;
                }
            }
            if (h == 0) {
                return ByteString.EMPTY;
            }
            if (h > 0) {
                int i3 = this.f37226c;
                int i4 = this.f37228e;
                if (h <= i3 - i4) {
                    int i5 = h + i4;
                    this.f37228e = i5;
                    bArr = Arrays.copyOfRange(this.f37225b, i4, i5);
                    return ByteString.wrap(bArr);
                }
            }
            if (h > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (h == 0) {
                bArr = C16935v.f37302b;
                return ByteString.wrap(bArr);
            } else {
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        /* renamed from: e */
        public final String mo59935e() throws IOException {
            int h = mo59938h();
            if (h > 0) {
                int i = this.f37226c;
                int i2 = this.f37228e;
                if (h <= i - i2) {
                    String str = new String(this.f37225b, i2, h, C16935v.f37301a);
                    this.f37228e += h;
                    return str;
                }
            }
            if (h == 0) {
                return "";
            }
            if (h < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: f */
        public final String mo59936f() throws IOException {
            int h = mo59938h();
            if (h > 0) {
                int i = this.f37226c;
                int i2 = this.f37228e;
                if (h <= i - i2) {
                    String a = Utf8.f37176a.mo59814a(i2, h, this.f37225b);
                    this.f37228e += h;
                    return a;
                }
            }
            if (h == 0) {
                return "";
            }
            if (h <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: g */
        public final int mo59937g(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int i2 = this.f37228e;
                int i3 = this.f37229f;
                int i4 = (i2 - i3) + i;
                int i5 = this.f37230g;
                if (i4 <= i5) {
                    this.f37230g = i4;
                    int i6 = this.f37226c + this.f37227d;
                    this.f37226c = i6;
                    int i7 = i6 - i3;
                    if (i7 > i4) {
                        int i8 = i7 - i4;
                        this.f37227d = i8;
                        this.f37226c = i6 - i8;
                    } else {
                        this.f37227d = 0;
                    }
                    return i5;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo59938h() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f37228e
                int r1 = r5.f37226c
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f37225b
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f37228e = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo59939i()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f37228e = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C16900i.C16901a.mo59938h():int");
        }

        /* renamed from: i */
        public final long mo59939i() throws IOException {
            long j = 0;
            int i = 0;
            while (i < 64) {
                int i2 = this.f37228e;
                if (i2 != this.f37226c) {
                    byte[] bArr = this.f37225b;
                    this.f37228e = i2 + 1;
                    byte b = bArr[i2];
                    j |= ((long) (b & Byte.MAX_VALUE)) << i;
                    if ((b & 128) == 0) {
                        return j;
                    }
                    i += 7;
                } else {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }
    }

    /* renamed from: com.google.protobuf.i$b */
    public static final class C16902b extends C16900i {

        /* renamed from: b */
        public final InputStream f37231b;

        /* renamed from: c */
        public final byte[] f37232c;

        /* renamed from: d */
        public int f37233d;

        /* renamed from: e */
        public int f37234e;

        /* renamed from: f */
        public int f37235f;

        /* renamed from: g */
        public int f37236g;

        /* renamed from: h */
        public int f37237h = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        public C16902b(RopeByteString.C16849d dVar) {
            Charset charset = C16935v.f37301a;
            this.f37231b = dVar;
            this.f37232c = new byte[RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT];
            this.f37233d = 0;
            this.f37235f = 0;
            this.f37236g = 0;
        }

        /* renamed from: d */
        public final ByteString mo59934d() throws IOException {
            int j = mo59943j();
            int i = this.f37233d;
            int i2 = this.f37235f;
            if (j <= i - i2 && j > 0) {
                ByteString copyFrom = ByteString.copyFrom(this.f37232c, i2, j);
                this.f37235f += j;
                return copyFrom;
            } else if (j == 0) {
                return ByteString.EMPTY;
            } else {
                byte[] h = mo59941h(j);
                if (h != null) {
                    return ByteString.copyFrom(h);
                }
                int i3 = this.f37235f;
                int i4 = this.f37233d;
                int i5 = i4 - i3;
                this.f37236g += i4;
                this.f37235f = 0;
                this.f37233d = 0;
                ArrayList i6 = mo59942i(j - i5);
                byte[] bArr = new byte[j];
                System.arraycopy(this.f37232c, i3, bArr, 0, i5);
                Iterator it = i6.iterator();
                while (it.hasNext()) {
                    byte[] bArr2 = (byte[]) it.next();
                    System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                    i5 += bArr2.length;
                }
                return ByteString.wrap(bArr);
            }
        }

        /* renamed from: e */
        public final String mo59935e() throws IOException {
            int j = mo59943j();
            if (j > 0) {
                int i = this.f37233d;
                int i2 = this.f37235f;
                if (j <= i - i2) {
                    String str = new String(this.f37232c, i2, j, C16935v.f37301a);
                    this.f37235f += j;
                    return str;
                }
            }
            if (j == 0) {
                return "";
            }
            if (j > this.f37233d) {
                return new String(mo59940g(j), C16935v.f37301a);
            }
            mo59946m(j);
            String str2 = new String(this.f37232c, this.f37235f, j, C16935v.f37301a);
            this.f37235f += j;
            return str2;
        }

        /* renamed from: f */
        public final String mo59936f() throws IOException {
            byte[] bArr;
            byte[] bArr2;
            int j = mo59943j();
            int i = this.f37235f;
            int i2 = this.f37233d;
            if (j <= i2 - i && j > 0) {
                bArr = this.f37232c;
                this.f37235f = i + j;
            } else if (j == 0) {
                return "";
            } else {
                if (j <= i2) {
                    mo59946m(j);
                    bArr2 = this.f37232c;
                    this.f37235f = j + 0;
                } else {
                    bArr2 = mo59940g(j);
                }
                bArr = bArr2;
                i = 0;
            }
            return Utf8.f37176a.mo59814a(i, j, bArr);
        }

        /* renamed from: g */
        public final byte[] mo59940g(int i) throws IOException {
            byte[] h = mo59941h(i);
            if (h != null) {
                return h;
            }
            int i2 = this.f37235f;
            int i3 = this.f37233d;
            int i4 = i3 - i2;
            this.f37236g += i3;
            this.f37235f = 0;
            this.f37233d = 0;
            ArrayList i5 = mo59942i(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f37232c, i2, bArr, 0, i4);
            Iterator it = i5.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        /* renamed from: h */
        public final byte[] mo59941h(int i) throws IOException {
            if (i == 0) {
                return C16935v.f37302b;
            }
            if (i >= 0) {
                int i2 = this.f37236g;
                int i3 = this.f37235f;
                int i4 = i2 + i3 + i;
                if (i4 - this.f37224a <= 0) {
                    int i5 = this.f37237h;
                    if (i4 <= i5) {
                        int i6 = this.f37233d - i3;
                        int i7 = i - i6;
                        if (i7 >= 4096 && i7 > this.f37231b.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.f37232c, this.f37235f, bArr, 0, i6);
                        this.f37236g += this.f37233d;
                        this.f37235f = 0;
                        this.f37233d = 0;
                        while (i6 < i) {
                            int read = this.f37231b.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f37236g += read;
                                i6 += read;
                            } else {
                                throw InvalidProtocolBufferException.truncatedMessage();
                            }
                        }
                        return bArr;
                    }
                    mo59947n((i5 - i2) - i3);
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: i */
        public final ArrayList mo59942i(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f37231b.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.f37236g += read;
                        i2 += read;
                    } else {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo59943j() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f37235f
                int r1 = r5.f37233d
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f37232c
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f37235f = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo59944k()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f37235f = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C16900i.C16902b.mo59943j():int");
        }

        /* renamed from: k */
        public final long mo59944k() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                if (this.f37235f == this.f37233d) {
                    mo59946m(1);
                }
                byte[] bArr = this.f37232c;
                int i2 = this.f37235f;
                this.f37235f = i2 + 1;
                byte b = bArr[i2];
                j |= ((long) (b & Byte.MAX_VALUE)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: l */
        public final void mo59945l() {
            int i = this.f37233d + this.f37234e;
            this.f37233d = i;
            int i2 = this.f37236g + i;
            int i3 = this.f37237h;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f37234e = i4;
                this.f37233d = i - i4;
                return;
            }
            this.f37234e = 0;
        }

        /* renamed from: m */
        public final void mo59946m(int i) throws IOException {
            if (mo59948o(i)) {
                return;
            }
            if (i > (this.f37224a - this.f37236g) - this.f37235f) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
            throw new java.lang.IllegalStateException(r7.f37231b.getClass() + "#skip returned invalid result: " + r1 + "\nThe InputStream implementation is buggy.");
         */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo59947n(int r8) throws java.io.IOException {
            /*
                r7 = this;
                int r0 = r7.f37233d
                int r1 = r7.f37235f
                int r2 = r0 - r1
                if (r8 > r2) goto L_0x000f
                if (r8 < 0) goto L_0x000f
                int r1 = r1 + r8
                r7.f37235f = r1
                goto L_0x0092
            L_0x000f:
                if (r8 < 0) goto L_0x009d
                int r2 = r7.f37236g
                int r3 = r2 + r1
                int r4 = r3 + r8
                int r5 = r7.f37237h
                if (r4 > r5) goto L_0x0093
                r7.f37236g = r3
                int r0 = r0 - r1
                r1 = 0
                r7.f37233d = r1
                r7.f37235f = r1
            L_0x0023:
                if (r0 >= r8) goto L_0x006d
                int r1 = r8 - r0
                java.io.InputStream r2 = r7.f37231b     // Catch:{ all -> 0x0063 }
                long r3 = (long) r1     // Catch:{ all -> 0x0063 }
                long r1 = r2.skip(r3)     // Catch:{ all -> 0x0063 }
                r5 = 0
                int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r5 < 0) goto L_0x003e
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 > 0) goto L_0x003e
                if (r5 != 0) goto L_0x003b
                goto L_0x006d
            L_0x003b:
                int r1 = (int) r1     // Catch:{ all -> 0x0063 }
                int r0 = r0 + r1
                goto L_0x0023
            L_0x003e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0063 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
                r3.<init>()     // Catch:{ all -> 0x0063 }
                java.io.InputStream r4 = r7.f37231b     // Catch:{ all -> 0x0063 }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x0063 }
                r3.append(r4)     // Catch:{ all -> 0x0063 }
                java.lang.String r4 = "#skip returned invalid result: "
                r3.append(r4)     // Catch:{ all -> 0x0063 }
                r3.append(r1)     // Catch:{ all -> 0x0063 }
                java.lang.String r1 = "\nThe InputStream implementation is buggy."
                r3.append(r1)     // Catch:{ all -> 0x0063 }
                java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0063 }
                r8.<init>(r1)     // Catch:{ all -> 0x0063 }
                throw r8     // Catch:{ all -> 0x0063 }
            L_0x0063:
                r8 = move-exception
                int r1 = r7.f37236g
                int r1 = r1 + r0
                r7.f37236g = r1
                r7.mo59945l()
                throw r8
            L_0x006d:
                int r1 = r7.f37236g
                int r1 = r1 + r0
                r7.f37236g = r1
                r7.mo59945l()
                if (r0 >= r8) goto L_0x0092
                int r0 = r7.f37233d
                int r1 = r7.f37235f
                int r1 = r0 - r1
                r7.f37235f = r0
                r0 = 1
                r7.mo59946m(r0)
            L_0x0083:
                int r2 = r8 - r1
                int r3 = r7.f37233d
                if (r2 <= r3) goto L_0x0090
                int r1 = r1 + r3
                r7.f37235f = r3
                r7.mo59946m(r0)
                goto L_0x0083
            L_0x0090:
                r7.f37235f = r2
            L_0x0092:
                return
            L_0x0093:
                int r5 = r5 - r2
                int r5 = r5 - r1
                r7.mo59947n(r5)
                com.google.protobuf.InvalidProtocolBufferException r8 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r8
            L_0x009d:
                com.google.protobuf.InvalidProtocolBufferException r8 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C16900i.C16902b.mo59947n(int):void");
        }

        /* renamed from: o */
        public final boolean mo59948o(int i) throws IOException {
            int i2 = this.f37235f;
            int i3 = i2 + i;
            int i4 = this.f37233d;
            if (i3 > i4) {
                int i5 = this.f37224a;
                int i6 = this.f37236g;
                if (i > (i5 - i6) - i2 || i6 + i2 + i > this.f37237h) {
                    return false;
                }
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = this.f37232c;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.f37236g += i2;
                    this.f37233d -= i2;
                    this.f37235f = 0;
                }
                InputStream inputStream = this.f37231b;
                byte[] bArr2 = this.f37232c;
                int i7 = this.f37233d;
                int read = inputStream.read(bArr2, i7, Math.min(bArr2.length - i7, (this.f37224a - this.f37236g) - i7));
                if (read == 0 || read < -1 || read > this.f37232c.length) {
                    throw new IllegalStateException(this.f37231b.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f37233d += read;
                    mo59945l();
                    if (this.f37233d >= i) {
                        return true;
                    }
                    return mo59948o(i);
                }
            } else {
                throw new IllegalStateException(C0069a.m175f("refillBuffer() called when ", i, " bytes were already available in buffer"));
            }
        }
    }

    /* renamed from: com.google.protobuf.i$c */
    public static final class C16903c extends C16900i {

        /* renamed from: b */
        public final ByteBuffer f37238b;

        /* renamed from: c */
        public final long f37239c;

        /* renamed from: d */
        public long f37240d;

        /* renamed from: e */
        public long f37241e;

        public C16903c(ByteBuffer byteBuffer) {
            this.f37238b = byteBuffer;
            long k = C16889f1.f37212c.mo59928k(C16889f1.f37216g, byteBuffer);
            this.f37239c = k;
            this.f37240d = ((long) byteBuffer.limit()) + k;
            this.f37241e = k + ((long) byteBuffer.position());
        }

        /* renamed from: d */
        public final ByteString mo59934d() throws IOException {
            int g = mo59949g();
            if (g > 0) {
                long j = this.f37240d;
                long j2 = this.f37241e;
                if (g <= ((int) (j - j2))) {
                    byte[] bArr = new byte[g];
                    long j3 = (long) g;
                    C16889f1.f37212c.mo59914c(j2, bArr, j3);
                    this.f37241e += j3;
                    return ByteString.wrap(bArr);
                }
            }
            if (g == 0) {
                return ByteString.EMPTY;
            }
            if (g < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: e */
        public final String mo59935e() throws IOException {
            int g = mo59949g();
            if (g > 0) {
                long j = this.f37240d;
                long j2 = this.f37241e;
                if (g <= ((int) (j - j2))) {
                    byte[] bArr = new byte[g];
                    long j3 = (long) g;
                    C16889f1.f37212c.mo59914c(j2, bArr, j3);
                    String str = new String(bArr, C16935v.f37301a);
                    this.f37241e += j3;
                    return str;
                }
            }
            if (g == 0) {
                return "";
            }
            if (g < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: f */
        public final String mo59936f() throws IOException {
            int g = mo59949g();
            if (g > 0) {
                long j = this.f37240d;
                long j2 = this.f37241e;
                if (g <= ((int) (j - j2))) {
                    int i = (int) (j2 - this.f37239c);
                    ByteBuffer byteBuffer = this.f37238b;
                    Utf8.C16853b bVar = Utf8.f37176a;
                    bVar.getClass();
                    String a = byteBuffer.hasArray() ? bVar.mo59814a(byteBuffer.arrayOffset() + i, g, byteBuffer.array()) : byteBuffer.isDirect() ? bVar.mo59815c(byteBuffer, i, g) : Utf8.C16853b.m28005b(byteBuffer, i, g);
                    this.f37241e += (long) g;
                    return a;
                }
            }
            if (g == 0) {
                return "";
            }
            if (g <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
            if (com.google.protobuf.C16889f1.m28149g(r4) < 0) goto L_0x0085;
         */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo59949g() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f37241e
                long r2 = r10.f37240d
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x000a
                goto L_0x0085
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.protobuf.C16889f1.m28149g(r0)
                if (r0 < 0) goto L_0x0017
                r10.f37241e = r4
                return r0
            L_0x0017:
                long r6 = r10.f37240d
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0021
                goto L_0x0085
            L_0x0021:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C16889f1.m28149g(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x002f
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x008b
            L_0x002f:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C16889f1.m28149g(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x003c:
                r6 = r4
                goto L_0x008b
            L_0x003e:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C16889f1.m28149g(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x004e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x008b
            L_0x004e:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C16889f1.m28149g(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C16889f1.m28149g(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C16889f1.m28149g(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C16889f1.m28149g(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C16889f1.m28149g(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C16889f1.m28149g(r4)
                if (r1 >= 0) goto L_0x008b
            L_0x0085:
                long r0 = r10.mo59950h()
                int r0 = (int) r0
                return r0
            L_0x008b:
                r10.f37241e = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C16900i.C16903c.mo59949g():int");
        }

        /* renamed from: h */
        public final long mo59950h() throws IOException {
            long j = 0;
            int i = 0;
            while (i < 64) {
                long j2 = this.f37241e;
                if (j2 != this.f37240d) {
                    this.f37241e = 1 + j2;
                    byte g = C16889f1.m28149g(j2);
                    j |= ((long) (g & Byte.MAX_VALUE)) << i;
                    if ((g & 128) == 0) {
                        return j;
                    }
                    i += 7;
                } else {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }
    }

    /* renamed from: a */
    public static int m28227a(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: b */
    public static long m28228b(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: c */
    public static C16901a m28229c(byte[] bArr, int i, int i2, boolean z) {
        C16901a aVar = new C16901a(bArr, i, i2, z);
        try {
            aVar.mo59937g(i2);
            return aVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: d */
    public abstract ByteString mo59934d() throws IOException;

    /* renamed from: e */
    public abstract String mo59935e() throws IOException;

    /* renamed from: f */
    public abstract String mo59936f() throws IOException;
}
