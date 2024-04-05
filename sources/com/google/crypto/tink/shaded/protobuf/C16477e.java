package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C16511n;
import com.google.crypto.tink.shaded.protobuf.C16531v;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.e */
public final class C16477e {

    /* renamed from: com.google.crypto.tink.shaded.protobuf.e$a */
    public static final class C16478a {

        /* renamed from: a */
        public int f36595a;

        /* renamed from: b */
        public long f36596b;

        /* renamed from: c */
        public Object f36597c;

        /* renamed from: d */
        public final C16511n f36598d;

        public C16478a(C16511n nVar) {
            nVar.getClass();
            this.f36598d = nVar;
        }
    }

    /* renamed from: A */
    public static int m26756A(int i, byte[] bArr, int i2, int i3, C16531v.C16535d<?> dVar, C16478a aVar) {
        C16467b0 b0Var = (C16467b0) dVar;
        int J = m26765J(bArr, i2, aVar);
        b0Var.mo58656c(C16497i.m26920c(aVar.f36596b));
        while (J < i3) {
            int H = m26763H(bArr, J, aVar);
            if (i != aVar.f36595a) {
                break;
            }
            J = m26765J(bArr, H, aVar);
            b0Var.mo58656c(C16497i.m26920c(aVar.f36596b));
        }
        return J;
    }

    /* renamed from: B */
    public static int m26757B(byte[] bArr, int i, C16478a aVar) throws InvalidProtocolBufferException {
        int H = m26763H(bArr, i, aVar);
        int i2 = aVar.f36595a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        } else if (i2 == 0) {
            aVar.f36597c = "";
            return H;
        } else {
            aVar.f36597c = new String(bArr, H, i2, C16531v.f36704a);
            return H + i2;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044 A[EDGE_INSN: B:21:0x0044->B:17:0x0044 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* renamed from: C */
    public static int m26758C(int r4, byte[] r5, int r6, int r7, com.google.crypto.tink.shaded.protobuf.C16531v.C16535d<?> r8, com.google.crypto.tink.shaded.protobuf.C16477e.C16478a r9) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            int r6 = m26763H(r5, r6, r9)
            int r0 = r9.f36595a
            if (r0 < 0) goto L_0x0045
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
            r8.add(r1)
            goto L_0x001b
        L_0x0010:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.C16531v.f36704a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
        L_0x001a:
            int r6 = r6 + r0
        L_0x001b:
            if (r6 >= r7) goto L_0x0044
            int r0 = m26763H(r5, r6, r9)
            int r2 = r9.f36595a
            if (r4 == r2) goto L_0x0026
            goto L_0x0044
        L_0x0026:
            int r6 = m26763H(r5, r0, r9)
            int r0 = r9.f36595a
            if (r0 < 0) goto L_0x003f
            if (r0 != 0) goto L_0x0034
            r8.add(r1)
            goto L_0x001b
        L_0x0034:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.C16531v.f36704a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
            goto L_0x001a
        L_0x003f:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r4 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r4
        L_0x0044:
            return r6
        L_0x0045:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r4 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16477e.m26758C(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.v$d, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        r2 = r7 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (com.google.crypto.tink.shaded.protobuf.Utf8.m26668f(r7, r2, r6) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r9.add(new java.lang.String(r6, r7, r0, com.google.crypto.tink.shaded.protobuf.C16531v.f36704a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8();
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059 A[EDGE_INSN: B:28:0x0059->B:23:0x0059 ?: BREAK  , SYNTHETIC] */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m26759D(int r5, byte[] r6, int r7, int r8, com.google.crypto.tink.shaded.protobuf.C16531v.C16535d<?> r9, com.google.crypto.tink.shaded.protobuf.C16477e.C16478a r10) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            int r7 = m26763H(r6, r7, r10)
            int r0 = r10.f36595a
            if (r0 < 0) goto L_0x005f
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
            r9.add(r1)
            goto L_0x0023
        L_0x0010:
            int r2 = r7 + r0
            boolean r3 = com.google.crypto.tink.shaded.protobuf.Utf8.m26668f(r7, r2, r6)
            if (r3 == 0) goto L_0x005a
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.C16531v.f36704a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
        L_0x0022:
            r7 = r2
        L_0x0023:
            if (r7 >= r8) goto L_0x0059
            int r0 = m26763H(r6, r7, r10)
            int r2 = r10.f36595a
            if (r5 == r2) goto L_0x002e
            goto L_0x0059
        L_0x002e:
            int r7 = m26763H(r6, r0, r10)
            int r0 = r10.f36595a
            if (r0 < 0) goto L_0x0054
            if (r0 != 0) goto L_0x003c
            r9.add(r1)
            goto L_0x0023
        L_0x003c:
            int r2 = r7 + r0
            boolean r3 = com.google.crypto.tink.shaded.protobuf.Utf8.m26668f(r7, r2, r6)
            if (r3 == 0) goto L_0x004f
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.C16531v.f36704a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
            goto L_0x0022
        L_0x004f:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
            throw r5
        L_0x0054:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r5
        L_0x0059:
            return r7
        L_0x005a:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
            throw r5
        L_0x005f:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16477e.m26759D(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.v$d, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    /* renamed from: E */
    public static int m26760E(byte[] bArr, int i, C16478a aVar) throws InvalidProtocolBufferException {
        int H = m26763H(bArr, i, aVar);
        int i2 = aVar.f36595a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        } else if (i2 == 0) {
            aVar.f36597c = "";
            return H;
        } else {
            aVar.f36597c = Utf8.f36555a.mo58593a(H, i2, bArr);
            return H + i2;
        }
    }

    /* renamed from: F */
    public static int m26761F(int i, byte[] bArr, int i2, int i3, C16476d1 d1Var, C16478a aVar) throws InvalidProtocolBufferException {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int J = m26765J(bArr, i2, aVar);
                d1Var.mo58699b(i, Long.valueOf(aVar.f36596b));
                return J;
            } else if (i4 == 1) {
                d1Var.mo58699b(i, Long.valueOf(m26776i(i2, bArr)));
                return i2 + 8;
            } else if (i4 == 2) {
                int H = m26763H(bArr, i2, aVar);
                int i5 = aVar.f36595a;
                if (i5 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                } else if (i5 <= bArr.length - H) {
                    if (i5 == 0) {
                        d1Var.mo58699b(i, ByteString.EMPTY);
                    } else {
                        d1Var.mo58699b(i, ByteString.copyFrom(bArr, H, i5));
                    }
                    return H + i5;
                } else {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } else if (i4 == 3) {
                C16476d1 d1Var2 = new C16476d1();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int H2 = m26763H(bArr, i2, aVar);
                    int i8 = aVar.f36595a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = H2;
                        break;
                    }
                    i7 = i8;
                    i2 = m26761F(i8, bArr, H2, i3, d1Var2, aVar);
                }
                if (i2 > i3 || i7 != i6) {
                    throw InvalidProtocolBufferException.parseFailure();
                }
                d1Var.mo58699b(i, d1Var2);
                return i2;
            } else if (i4 == 5) {
                d1Var.mo58699b(i, Integer.valueOf(m26774g(i2, bArr)));
                return i2 + 4;
            } else {
                throw InvalidProtocolBufferException.invalidTag();
            }
        } else {
            throw InvalidProtocolBufferException.invalidTag();
        }
    }

    /* renamed from: G */
    public static int m26762G(int i, byte[] bArr, int i2, C16478a aVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            aVar.f36595a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            aVar.f36595a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            aVar.f36595a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            aVar.f36595a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                aVar.f36595a = i11;
                return i12;
            }
        }
    }

    /* renamed from: H */
    public static int m26763H(byte[] bArr, int i, C16478a aVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m26762G(b, bArr, i2, aVar);
        }
        aVar.f36595a = b;
        return i2;
    }

    /* renamed from: I */
    public static int m26764I(int i, byte[] bArr, int i2, int i3, C16531v.C16535d<?> dVar, C16478a aVar) {
        C16529u uVar = (C16529u) dVar;
        int H = m26763H(bArr, i2, aVar);
        uVar.mo58957c(aVar.f36595a);
        while (H < i3) {
            int H2 = m26763H(bArr, H, aVar);
            if (i != aVar.f36595a) {
                break;
            }
            H = m26763H(bArr, H2, aVar);
            uVar.mo58957c(aVar.f36595a);
        }
        return H;
    }

    /* renamed from: J */
    public static int m26765J(byte[] bArr, int i, C16478a aVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            aVar.f36596b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        aVar.f36596b = j2;
        return i3;
    }

    /* renamed from: K */
    public static int m26766K(int i, byte[] bArr, int i2, int i3, C16531v.C16535d<?> dVar, C16478a aVar) {
        C16467b0 b0Var = (C16467b0) dVar;
        int J = m26765J(bArr, i2, aVar);
        b0Var.mo58656c(aVar.f36596b);
        while (J < i3) {
            int H = m26763H(bArr, J, aVar);
            if (i != aVar.f36595a) {
                break;
            }
            J = m26765J(bArr, H, aVar);
            b0Var.mo58656c(aVar.f36596b);
        }
        return J;
    }

    /* renamed from: L */
    public static int m26767L(int i, byte[] bArr, int i2, int i3, C16478a aVar) throws InvalidProtocolBufferException {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m26765J(bArr, i2, aVar);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m26763H(bArr, i2, aVar) + aVar.f36595a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m26763H(bArr, i2, aVar);
                    i6 = aVar.f36595a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m26767L(i6, bArr, i2, i3, aVar);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw InvalidProtocolBufferException.parseFailure();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw InvalidProtocolBufferException.invalidTag();
            }
        } else {
            throw InvalidProtocolBufferException.invalidTag();
        }
    }

    /* renamed from: a */
    public static int m26768a(int i, byte[] bArr, int i2, int i3, C16531v.C16535d<?> dVar, C16478a aVar) {
        C16481f fVar = (C16481f) dVar;
        int J = m26765J(bArr, i2, aVar);
        fVar.mo58712c(aVar.f36596b != 0);
        while (J < i3) {
            int H = m26763H(bArr, J, aVar);
            if (i != aVar.f36595a) {
                break;
            }
            J = m26765J(bArr, H, aVar);
            fVar.mo58712c(aVar.f36596b != 0);
        }
        return J;
    }

    /* renamed from: b */
    public static int m26769b(byte[] bArr, int i, C16478a aVar) throws InvalidProtocolBufferException {
        int H = m26763H(bArr, i, aVar);
        int i2 = aVar.f36595a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        } else if (i2 > bArr.length - H) {
            throw InvalidProtocolBufferException.truncatedMessage();
        } else if (i2 == 0) {
            aVar.f36597c = ByteString.EMPTY;
            return H;
        } else {
            aVar.f36597c = ByteString.copyFrom(bArr, H, i2);
            return H + i2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004d A[EDGE_INSN: B:30:0x004d->B:22:0x004d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m26770c(int r2, byte[] r3, int r4, int r5, com.google.crypto.tink.shaded.protobuf.C16531v.C16535d<?> r6, com.google.crypto.tink.shaded.protobuf.C16477e.C16478a r7) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            int r4 = m26763H(r3, r4, r7)
            int r0 = r7.f36595a
            if (r0 < 0) goto L_0x0053
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x004e
            if (r0 != 0) goto L_0x0014
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            r6.add(r0)
            goto L_0x001c
        L_0x0014:
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r3, r4, r0)
            r6.add(r1)
        L_0x001b:
            int r4 = r4 + r0
        L_0x001c:
            if (r4 >= r5) goto L_0x004d
            int r0 = m26763H(r3, r4, r7)
            int r1 = r7.f36595a
            if (r2 == r1) goto L_0x0027
            goto L_0x004d
        L_0x0027:
            int r4 = m26763H(r3, r0, r7)
            int r0 = r7.f36595a
            if (r0 < 0) goto L_0x0048
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x0043
            if (r0 != 0) goto L_0x003b
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            r6.add(r0)
            goto L_0x001c
        L_0x003b:
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r3, r4, r0)
            r6.add(r1)
            goto L_0x001b
        L_0x0043:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r2
        L_0x0048:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r2
        L_0x004d:
            return r4
        L_0x004e:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r2
        L_0x0053:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16477e.m26770c(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.v$d, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    /* renamed from: d */
    public static double m26771d(int i, byte[] bArr) {
        return Double.longBitsToDouble(m26776i(i, bArr));
    }

    /* renamed from: e */
    public static int m26772e(int i, byte[] bArr, int i2, int i3, C16531v.C16535d<?> dVar, C16478a aVar) {
        C16507l lVar = (C16507l) dVar;
        lVar.mo58877c(Double.longBitsToDouble(m26776i(i2, bArr)));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int H = m26763H(bArr, i4, aVar);
            if (i != aVar.f36595a) {
                break;
            }
            lVar.mo58877c(Double.longBitsToDouble(m26776i(H, bArr)));
            i4 = H + 8;
        }
        return i4;
    }

    /* renamed from: f */
    public static int m26773f(int i, byte[] bArr, int i2, int i3, Object obj, C16503j0 j0Var, C16478a aVar) throws IOException {
        if (aVar.f36598d.f36675a.get(new C16511n.C16512a(j0Var, i >>> 3)) == null) {
            return m26761F(i, bArr, i2, i3, C16510m0.m27129o(obj), aVar);
        }
        GeneratedMessageLite.C16433c cVar = (GeneratedMessageLite.C16433c) obj;
        C16521r<GeneratedMessageLite.C16434d> rVar = cVar.extensions;
        if (rVar.f36689b) {
            cVar.extensions = rVar.clone();
        }
        throw null;
    }

    /* renamed from: g */
    public static int m26774g(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: h */
    public static int m26775h(int i, byte[] bArr, int i2, int i3, C16531v.C16535d<?> dVar, C16478a aVar) {
        C16529u uVar = (C16529u) dVar;
        uVar.mo58957c(m26774g(i2, bArr));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int H = m26763H(bArr, i4, aVar);
            if (i != aVar.f36595a) {
                break;
            }
            uVar.mo58957c(m26774g(H, bArr));
            i4 = H + 4;
        }
        return i4;
    }

    /* renamed from: i */
    public static long m26776i(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: j */
    public static int m26777j(int i, byte[] bArr, int i2, int i3, C16531v.C16535d<?> dVar, C16478a aVar) {
        C16467b0 b0Var = (C16467b0) dVar;
        b0Var.mo58656c(m26776i(i2, bArr));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int H = m26763H(bArr, i4, aVar);
            if (i != aVar.f36595a) {
                break;
            }
            b0Var.mo58656c(m26776i(H, bArr));
            i4 = H + 8;
        }
        return i4;
    }

    /* renamed from: k */
    public static float m26778k(int i, byte[] bArr) {
        return Float.intBitsToFloat(m26774g(i, bArr));
    }

    /* renamed from: l */
    public static int m26779l(int i, byte[] bArr, int i2, int i3, C16531v.C16535d<?> dVar, C16478a aVar) {
        C16525s sVar = (C16525s) dVar;
        sVar.mo58948c(Float.intBitsToFloat(m26774g(i2, bArr)));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int H = m26763H(bArr, i4, aVar);
            if (i != aVar.f36595a) {
                break;
            }
            sVar.mo58948c(Float.intBitsToFloat(m26774g(H, bArr)));
            i4 = H + 4;
        }
        return i4;
    }

    /* renamed from: m */
    public static int m26780m(C16542x0 x0Var, byte[] bArr, int i, int i2, int i3, C16478a aVar) throws IOException {
        C16510m0 m0Var = (C16510m0) x0Var;
        Object newInstance = m0Var.newInstance();
        int F = m0Var.mo58886F(newInstance, bArr, i, i2, i3, aVar);
        m0Var.mo58900b(newInstance);
        aVar.f36597c = newInstance;
        return F;
    }

    /* renamed from: n */
    public static int m26781n(C16542x0 x0Var, int i, byte[] bArr, int i2, int i3, C16531v.C16535d<?> dVar, C16478a aVar) throws IOException {
        int i4 = (i & -8) | 4;
        int m = m26780m(x0Var, bArr, i2, i3, i4, aVar);
        dVar.add(aVar.f36597c);
        while (m < i3) {
            int H = m26763H(bArr, m, aVar);
            if (i != aVar.f36595a) {
                break;
            }
            m = m26780m(x0Var, bArr, H, i3, i4, aVar);
            dVar.add(aVar.f36597c);
        }
        return m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m26782o(com.google.crypto.tink.shaded.protobuf.C16542x0 r6, byte[] r7, int r8, int r9, com.google.crypto.tink.shaded.protobuf.C16477e.C16478a r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m26762G(r8, r7, r0, r10)
            int r8 = r10.f36595a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.newInstance()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo58906h(r1, r2, r3, r4, r5)
            r6.mo58900b(r9)
            r10.f36597c = r9
            return r8
        L_0x0025:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r6 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16477e.m26782o(com.google.crypto.tink.shaded.protobuf.x0, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    /* renamed from: p */
    public static int m26783p(C16542x0<?> x0Var, int i, byte[] bArr, int i2, int i3, C16531v.C16535d<?> dVar, C16478a aVar) throws IOException {
        int o = m26782o(x0Var, bArr, i2, i3, aVar);
        dVar.add(aVar.f36597c);
        while (o < i3) {
            int H = m26763H(bArr, o, aVar);
            if (i != aVar.f36595a) {
                break;
            }
            o = m26782o(x0Var, bArr, H, i3, aVar);
            dVar.add(aVar.f36597c);
        }
        return o;
    }

    /* renamed from: q */
    public static int m26784q(byte[] bArr, int i, C16531v.C16535d<?> dVar, C16478a aVar) throws IOException {
        C16481f fVar = (C16481f) dVar;
        int H = m26763H(bArr, i, aVar);
        int i2 = aVar.f36595a + H;
        while (H < i2) {
            H = m26765J(bArr, H, aVar);
            fVar.mo58712c(aVar.f36596b != 0);
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: r */
    public static int m26785r(byte[] bArr, int i, C16531v.C16535d<?> dVar, C16478a aVar) throws IOException {
        C16507l lVar = (C16507l) dVar;
        int H = m26763H(bArr, i, aVar);
        int i2 = aVar.f36595a + H;
        while (H < i2) {
            lVar.mo58877c(Double.longBitsToDouble(m26776i(H, bArr)));
            H += 8;
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: s */
    public static int m26786s(byte[] bArr, int i, C16531v.C16535d<?> dVar, C16478a aVar) throws IOException {
        C16529u uVar = (C16529u) dVar;
        int H = m26763H(bArr, i, aVar);
        int i2 = aVar.f36595a + H;
        while (H < i2) {
            uVar.mo58957c(m26774g(H, bArr));
            H += 4;
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: t */
    public static int m26787t(byte[] bArr, int i, C16531v.C16535d<?> dVar, C16478a aVar) throws IOException {
        C16467b0 b0Var = (C16467b0) dVar;
        int H = m26763H(bArr, i, aVar);
        int i2 = aVar.f36595a + H;
        while (H < i2) {
            b0Var.mo58656c(m26776i(H, bArr));
            H += 8;
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: u */
    public static int m26788u(byte[] bArr, int i, C16531v.C16535d<?> dVar, C16478a aVar) throws IOException {
        C16525s sVar = (C16525s) dVar;
        int H = m26763H(bArr, i, aVar);
        int i2 = aVar.f36595a + H;
        while (H < i2) {
            sVar.mo58948c(Float.intBitsToFloat(m26774g(H, bArr)));
            H += 4;
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: v */
    public static int m26789v(byte[] bArr, int i, C16531v.C16535d<?> dVar, C16478a aVar) throws IOException {
        C16529u uVar = (C16529u) dVar;
        int H = m26763H(bArr, i, aVar);
        int i2 = aVar.f36595a + H;
        while (H < i2) {
            H = m26763H(bArr, H, aVar);
            uVar.mo58957c(C16497i.m26919b(aVar.f36595a));
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: w */
    public static int m26790w(byte[] bArr, int i, C16531v.C16535d<?> dVar, C16478a aVar) throws IOException {
        C16467b0 b0Var = (C16467b0) dVar;
        int H = m26763H(bArr, i, aVar);
        int i2 = aVar.f36595a + H;
        while (H < i2) {
            H = m26765J(bArr, H, aVar);
            b0Var.mo58656c(C16497i.m26920c(aVar.f36596b));
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: x */
    public static int m26791x(byte[] bArr, int i, C16531v.C16535d<?> dVar, C16478a aVar) throws IOException {
        C16529u uVar = (C16529u) dVar;
        int H = m26763H(bArr, i, aVar);
        int i2 = aVar.f36595a + H;
        while (H < i2) {
            H = m26763H(bArr, H, aVar);
            uVar.mo58957c(aVar.f36595a);
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: y */
    public static int m26792y(byte[] bArr, int i, C16531v.C16535d<?> dVar, C16478a aVar) throws IOException {
        C16467b0 b0Var = (C16467b0) dVar;
        int H = m26763H(bArr, i, aVar);
        int i2 = aVar.f36595a + H;
        while (H < i2) {
            H = m26765J(bArr, H, aVar);
            b0Var.mo58656c(aVar.f36596b);
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: z */
    public static int m26793z(int i, byte[] bArr, int i2, int i3, C16531v.C16535d<?> dVar, C16478a aVar) {
        C16529u uVar = (C16529u) dVar;
        int H = m26763H(bArr, i2, aVar);
        uVar.mo58957c(C16497i.m26919b(aVar.f36595a));
        while (H < i3) {
            int H2 = m26763H(bArr, H, aVar);
            if (i != aVar.f36595a) {
                break;
            }
            H = m26763H(bArr, H2, aVar);
            uVar.mo58957c(C16497i.m26919b(aVar.f36595a));
        }
        return H;
    }
}
