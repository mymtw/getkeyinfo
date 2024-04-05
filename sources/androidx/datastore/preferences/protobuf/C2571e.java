package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2611o;
import androidx.datastore.preferences.protobuf.C2631w;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.e */
public final class C2571e {

    /* renamed from: androidx.datastore.preferences.protobuf.e$a */
    public static final class C2572a {

        /* renamed from: a */
        public int f5849a;

        /* renamed from: b */
        public long f5850b;

        /* renamed from: c */
        public Object f5851c;

        /* renamed from: d */
        public final C2611o f5852d;

        public C2572a(C2611o oVar) {
            oVar.getClass();
            this.f5852d = oVar;
        }
    }

    /* renamed from: A */
    public static int m5736A(int i, byte[] bArr, int i2, int i3, C2631w.C2635d<?> dVar, C2572a aVar) {
        C2564c0 c0Var = (C2564c0) dVar;
        int J = m5745J(bArr, i2, aVar);
        c0Var.mo9609c(C2592i.m5902c(aVar.f5850b));
        while (J < i3) {
            int H = m5743H(bArr, J, aVar);
            if (i != aVar.f5849a) {
                break;
            }
            J = m5745J(bArr, H, aVar);
            c0Var.mo9609c(C2592i.m5902c(aVar.f5850b));
        }
        return J;
    }

    /* renamed from: B */
    public static int m5737B(byte[] bArr, int i, C2572a aVar) throws InvalidProtocolBufferException {
        int H = m5743H(bArr, i, aVar);
        int i2 = aVar.f5849a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        } else if (i2 == 0) {
            aVar.f5851c = "";
            return H;
        } else {
            aVar.f5851c = new String(bArr, H, i2, C2631w.f5973a);
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
    public static int m5738C(int r4, byte[] r5, int r6, int r7, androidx.datastore.preferences.protobuf.C2631w.C2635d<?> r8, androidx.datastore.preferences.protobuf.C2571e.C2572a r9) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        /*
            int r6 = m5743H(r5, r6, r9)
            int r0 = r9.f5849a
            if (r0 < 0) goto L_0x0045
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
            r8.add(r1)
            goto L_0x001b
        L_0x0010:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = androidx.datastore.preferences.protobuf.C2631w.f5973a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
        L_0x001a:
            int r6 = r6 + r0
        L_0x001b:
            if (r6 >= r7) goto L_0x0044
            int r0 = m5743H(r5, r6, r9)
            int r2 = r9.f5849a
            if (r4 == r2) goto L_0x0026
            goto L_0x0044
        L_0x0026:
            int r6 = m5743H(r5, r0, r9)
            int r0 = r9.f5849a
            if (r0 < 0) goto L_0x003f
            if (r0 != 0) goto L_0x0034
            r8.add(r1)
            goto L_0x001b
        L_0x0034:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = androidx.datastore.preferences.protobuf.C2631w.f5973a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
            goto L_0x001a
        L_0x003f:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r4
        L_0x0044:
            return r6
        L_0x0045:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2571e.m5738C(int, byte[], int, int, androidx.datastore.preferences.protobuf.w$d, androidx.datastore.preferences.protobuf.e$a):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        r2 = r7 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (androidx.datastore.preferences.protobuf.Utf8.m5645f(r7, r2, r6) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r9.add(new java.lang.String(r6, r7, r0, androidx.datastore.preferences.protobuf.C2631w.f5973a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8();
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059 A[EDGE_INSN: B:28:0x0059->B:23:0x0059 ?: BREAK  , SYNTHETIC] */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m5739D(int r5, byte[] r6, int r7, int r8, androidx.datastore.preferences.protobuf.C2631w.C2635d<?> r9, androidx.datastore.preferences.protobuf.C2571e.C2572a r10) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        /*
            int r7 = m5743H(r6, r7, r10)
            int r0 = r10.f5849a
            if (r0 < 0) goto L_0x005f
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
            r9.add(r1)
            goto L_0x0023
        L_0x0010:
            int r2 = r7 + r0
            boolean r3 = androidx.datastore.preferences.protobuf.Utf8.m5645f(r7, r2, r6)
            if (r3 == 0) goto L_0x005a
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = androidx.datastore.preferences.protobuf.C2631w.f5973a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
        L_0x0022:
            r7 = r2
        L_0x0023:
            if (r7 >= r8) goto L_0x0059
            int r0 = m5743H(r6, r7, r10)
            int r2 = r10.f5849a
            if (r5 == r2) goto L_0x002e
            goto L_0x0059
        L_0x002e:
            int r7 = m5743H(r6, r0, r10)
            int r0 = r10.f5849a
            if (r0 < 0) goto L_0x0054
            if (r0 != 0) goto L_0x003c
            r9.add(r1)
            goto L_0x0023
        L_0x003c:
            int r2 = r7 + r0
            boolean r3 = androidx.datastore.preferences.protobuf.Utf8.m5645f(r7, r2, r6)
            if (r3 == 0) goto L_0x004f
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = androidx.datastore.preferences.protobuf.C2631w.f5973a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
            goto L_0x0022
        L_0x004f:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8()
            throw r5
        L_0x0054:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r5
        L_0x0059:
            return r7
        L_0x005a:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8()
            throw r5
        L_0x005f:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2571e.m5739D(int, byte[], int, int, androidx.datastore.preferences.protobuf.w$d, androidx.datastore.preferences.protobuf.e$a):int");
    }

    /* renamed from: E */
    public static int m5740E(byte[] bArr, int i, C2572a aVar) throws InvalidProtocolBufferException {
        int H = m5743H(bArr, i, aVar);
        int i2 = aVar.f5849a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        } else if (i2 == 0) {
            aVar.f5851c = "";
            return H;
        } else {
            aVar.f5851c = Utf8.f5815a.mo9529a(H, i2, bArr);
            return H + i2;
        }
    }

    /* renamed from: F */
    public static int m5741F(int i, byte[] bArr, int i2, int i3, C2575e1 e1Var, C2572a aVar) throws InvalidProtocolBufferException {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int J = m5745J(bArr, i2, aVar);
                e1Var.mo9642b(i, Long.valueOf(aVar.f5850b));
                return J;
            } else if (i4 == 1) {
                e1Var.mo9642b(i, Long.valueOf(m5756i(i2, bArr)));
                return i2 + 8;
            } else if (i4 == 2) {
                int H = m5743H(bArr, i2, aVar);
                int i5 = aVar.f5849a;
                if (i5 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                } else if (i5 <= bArr.length - H) {
                    if (i5 == 0) {
                        e1Var.mo9642b(i, ByteString.EMPTY);
                    } else {
                        e1Var.mo9642b(i, ByteString.copyFrom(bArr, H, i5));
                    }
                    return H + i5;
                } else {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } else if (i4 == 3) {
                C2575e1 e1Var2 = new C2575e1();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int H2 = m5743H(bArr, i2, aVar);
                    int i8 = aVar.f5849a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = H2;
                        break;
                    }
                    i7 = i8;
                    i2 = m5741F(i8, bArr, H2, i3, e1Var2, aVar);
                }
                if (i2 > i3 || i7 != i6) {
                    throw InvalidProtocolBufferException.parseFailure();
                }
                e1Var.mo9642b(i, e1Var2);
                return i2;
            } else if (i4 == 5) {
                e1Var.mo9642b(i, Integer.valueOf(m5754g(i2, bArr)));
                return i2 + 4;
            } else {
                throw InvalidProtocolBufferException.invalidTag();
            }
        } else {
            throw InvalidProtocolBufferException.invalidTag();
        }
    }

    /* renamed from: G */
    public static int m5742G(int i, byte[] bArr, int i2, C2572a aVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            aVar.f5849a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            aVar.f5849a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            aVar.f5849a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            aVar.f5849a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                aVar.f5849a = i11;
                return i12;
            }
        }
    }

    /* renamed from: H */
    public static int m5743H(byte[] bArr, int i, C2572a aVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m5742G(b, bArr, i2, aVar);
        }
        aVar.f5849a = b;
        return i2;
    }

    /* renamed from: I */
    public static int m5744I(int i, byte[] bArr, int i2, int i3, C2631w.C2635d<?> dVar, C2572a aVar) {
        C2629v vVar = (C2629v) dVar;
        int H = m5743H(bArr, i2, aVar);
        vVar.mo9897c(aVar.f5849a);
        while (H < i3) {
            int H2 = m5743H(bArr, H, aVar);
            if (i != aVar.f5849a) {
                break;
            }
            H = m5743H(bArr, H2, aVar);
            vVar.mo9897c(aVar.f5849a);
        }
        return H;
    }

    /* renamed from: J */
    public static int m5745J(byte[] bArr, int i, C2572a aVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            aVar.f5850b = j;
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
        aVar.f5850b = j2;
        return i3;
    }

    /* renamed from: K */
    public static int m5746K(int i, byte[] bArr, int i2, int i3, C2631w.C2635d<?> dVar, C2572a aVar) {
        C2564c0 c0Var = (C2564c0) dVar;
        int J = m5745J(bArr, i2, aVar);
        c0Var.mo9609c(aVar.f5850b);
        while (J < i3) {
            int H = m5743H(bArr, J, aVar);
            if (i != aVar.f5849a) {
                break;
            }
            J = m5745J(bArr, H, aVar);
            c0Var.mo9609c(aVar.f5850b);
        }
        return J;
    }

    /* renamed from: L */
    public static int m5747L(int i, byte[] bArr, int i2, int i3, C2572a aVar) throws InvalidProtocolBufferException {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m5745J(bArr, i2, aVar);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m5743H(bArr, i2, aVar) + aVar.f5849a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m5743H(bArr, i2, aVar);
                    i6 = aVar.f5849a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m5747L(i6, bArr, i2, i3, aVar);
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
    public static int m5748a(int i, byte[] bArr, int i2, int i3, C2631w.C2635d<?> dVar, C2572a aVar) {
        C2576f fVar = (C2576f) dVar;
        int J = m5745J(bArr, i2, aVar);
        fVar.mo9647c(aVar.f5850b != 0);
        while (J < i3) {
            int H = m5743H(bArr, J, aVar);
            if (i != aVar.f5849a) {
                break;
            }
            J = m5745J(bArr, H, aVar);
            fVar.mo9647c(aVar.f5850b != 0);
        }
        return J;
    }

    /* renamed from: b */
    public static int m5749b(byte[] bArr, int i, C2572a aVar) throws InvalidProtocolBufferException {
        int H = m5743H(bArr, i, aVar);
        int i2 = aVar.f5849a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        } else if (i2 > bArr.length - H) {
            throw InvalidProtocolBufferException.truncatedMessage();
        } else if (i2 == 0) {
            aVar.f5851c = ByteString.EMPTY;
            return H;
        } else {
            aVar.f5851c = ByteString.copyFrom(bArr, H, i2);
            return H + i2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004d A[EDGE_INSN: B:30:0x004d->B:22:0x004d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m5750c(int r2, byte[] r3, int r4, int r5, androidx.datastore.preferences.protobuf.C2631w.C2635d<?> r6, androidx.datastore.preferences.protobuf.C2571e.C2572a r7) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        /*
            int r4 = m5743H(r3, r4, r7)
            int r0 = r7.f5849a
            if (r0 < 0) goto L_0x0053
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x004e
            if (r0 != 0) goto L_0x0014
            androidx.datastore.preferences.protobuf.ByteString r0 = androidx.datastore.preferences.protobuf.ByteString.EMPTY
            r6.add(r0)
            goto L_0x001c
        L_0x0014:
            androidx.datastore.preferences.protobuf.ByteString r1 = androidx.datastore.preferences.protobuf.ByteString.copyFrom(r3, r4, r0)
            r6.add(r1)
        L_0x001b:
            int r4 = r4 + r0
        L_0x001c:
            if (r4 >= r5) goto L_0x004d
            int r0 = m5743H(r3, r4, r7)
            int r1 = r7.f5849a
            if (r2 == r1) goto L_0x0027
            goto L_0x004d
        L_0x0027:
            int r4 = m5743H(r3, r0, r7)
            int r0 = r7.f5849a
            if (r0 < 0) goto L_0x0048
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x0043
            if (r0 != 0) goto L_0x003b
            androidx.datastore.preferences.protobuf.ByteString r0 = androidx.datastore.preferences.protobuf.ByteString.EMPTY
            r6.add(r0)
            goto L_0x001c
        L_0x003b:
            androidx.datastore.preferences.protobuf.ByteString r1 = androidx.datastore.preferences.protobuf.ByteString.copyFrom(r3, r4, r0)
            r6.add(r1)
            goto L_0x001b
        L_0x0043:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r2 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r2
        L_0x0048:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r2 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r2
        L_0x004d:
            return r4
        L_0x004e:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r2 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r2
        L_0x0053:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r2 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2571e.m5750c(int, byte[], int, int, androidx.datastore.preferences.protobuf.w$d, androidx.datastore.preferences.protobuf.e$a):int");
    }

    /* renamed from: d */
    public static double m5751d(int i, byte[] bArr) {
        return Double.longBitsToDouble(m5756i(i, bArr));
    }

    /* renamed from: e */
    public static int m5752e(int i, byte[] bArr, int i2, int i3, C2631w.C2635d<?> dVar, C2572a aVar) {
        C2604l lVar = (C2604l) dVar;
        lVar.mo9817c(Double.longBitsToDouble(m5756i(i2, bArr)));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int H = m5743H(bArr, i4, aVar);
            if (i != aVar.f5849a) {
                break;
            }
            lVar.mo9817c(Double.longBitsToDouble(m5756i(H, bArr)));
            i4 = H + 8;
        }
        return i4;
    }

    /* renamed from: f */
    public static int m5753f(int i, byte[] bArr, int i2, int i3, Object obj, C2602k0 k0Var, C2572a aVar) throws IOException {
        if (aVar.f5852d.f5944a.get(new C2611o.C2612a(k0Var, i >>> 3)) == null) {
            return m5741F(i, bArr, i2, i3, C2609n0.m6172p(obj), aVar);
        }
        GeneratedMessageLite.C2523c cVar = (GeneratedMessageLite.C2523c) obj;
        C2621s<GeneratedMessageLite.C2524d> sVar = cVar.extensions;
        if (sVar.f5958b) {
            cVar.extensions = sVar.clone();
        }
        throw null;
    }

    /* renamed from: g */
    public static int m5754g(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: h */
    public static int m5755h(int i, byte[] bArr, int i2, int i3, C2631w.C2635d<?> dVar, C2572a aVar) {
        C2629v vVar = (C2629v) dVar;
        vVar.mo9897c(m5754g(i2, bArr));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int H = m5743H(bArr, i4, aVar);
            if (i != aVar.f5849a) {
                break;
            }
            vVar.mo9897c(m5754g(H, bArr));
            i4 = H + 4;
        }
        return i4;
    }

    /* renamed from: i */
    public static long m5756i(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: j */
    public static int m5757j(int i, byte[] bArr, int i2, int i3, C2631w.C2635d<?> dVar, C2572a aVar) {
        C2564c0 c0Var = (C2564c0) dVar;
        c0Var.mo9609c(m5756i(i2, bArr));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int H = m5743H(bArr, i4, aVar);
            if (i != aVar.f5849a) {
                break;
            }
            c0Var.mo9609c(m5756i(H, bArr));
            i4 = H + 8;
        }
        return i4;
    }

    /* renamed from: k */
    public static float m5758k(int i, byte[] bArr) {
        return Float.intBitsToFloat(m5754g(i, bArr));
    }

    /* renamed from: l */
    public static int m5759l(int i, byte[] bArr, int i2, int i3, C2631w.C2635d<?> dVar, C2572a aVar) {
        C2625t tVar = (C2625t) dVar;
        tVar.mo9888c(Float.intBitsToFloat(m5754g(i2, bArr)));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int H = m5743H(bArr, i4, aVar);
            if (i != aVar.f5849a) {
                break;
            }
            tVar.mo9888c(Float.intBitsToFloat(m5754g(H, bArr)));
            i4 = H + 4;
        }
        return i4;
    }

    /* renamed from: m */
    public static int m5760m(C2642y0 y0Var, byte[] bArr, int i, int i2, int i3, C2572a aVar) throws IOException {
        C2609n0 n0Var = (C2609n0) y0Var;
        Object newInstance = n0Var.newInstance();
        int G = n0Var.mo9826G(newInstance, bArr, i, i2, i3, aVar);
        n0Var.mo9840b(newInstance);
        aVar.f5851c = newInstance;
        return G;
    }

    /* renamed from: n */
    public static int m5761n(C2642y0 y0Var, int i, byte[] bArr, int i2, int i3, C2631w.C2635d<?> dVar, C2572a aVar) throws IOException {
        int i4 = (i & -8) | 4;
        int m = m5760m(y0Var, bArr, i2, i3, i4, aVar);
        dVar.add(aVar.f5851c);
        while (m < i3) {
            int H = m5743H(bArr, m, aVar);
            if (i != aVar.f5849a) {
                break;
            }
            m = m5760m(y0Var, bArr, H, i3, i4, aVar);
            dVar.add(aVar.f5851c);
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
    public static int m5762o(androidx.datastore.preferences.protobuf.C2642y0 r6, byte[] r7, int r8, int r9, androidx.datastore.preferences.protobuf.C2571e.C2572a r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m5742G(r8, r7, r0, r10)
            int r8 = r10.f5849a
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
            r0.mo9847i(r1, r2, r3, r4, r5)
            r6.mo9840b(r9)
            r10.f5851c = r9
            return r8
        L_0x0025:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r6 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2571e.m5762o(androidx.datastore.preferences.protobuf.y0, byte[], int, int, androidx.datastore.preferences.protobuf.e$a):int");
    }

    /* renamed from: p */
    public static int m5763p(C2642y0<?> y0Var, int i, byte[] bArr, int i2, int i3, C2631w.C2635d<?> dVar, C2572a aVar) throws IOException {
        int o = m5762o(y0Var, bArr, i2, i3, aVar);
        dVar.add(aVar.f5851c);
        while (o < i3) {
            int H = m5743H(bArr, o, aVar);
            if (i != aVar.f5849a) {
                break;
            }
            o = m5762o(y0Var, bArr, H, i3, aVar);
            dVar.add(aVar.f5851c);
        }
        return o;
    }

    /* renamed from: q */
    public static int m5764q(byte[] bArr, int i, C2631w.C2635d<?> dVar, C2572a aVar) throws IOException {
        C2576f fVar = (C2576f) dVar;
        int H = m5743H(bArr, i, aVar);
        int i2 = aVar.f5849a + H;
        while (H < i2) {
            H = m5745J(bArr, H, aVar);
            fVar.mo9647c(aVar.f5850b != 0);
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: r */
    public static int m5765r(byte[] bArr, int i, C2631w.C2635d<?> dVar, C2572a aVar) throws IOException {
        C2604l lVar = (C2604l) dVar;
        int H = m5743H(bArr, i, aVar);
        int i2 = aVar.f5849a + H;
        while (H < i2) {
            lVar.mo9817c(Double.longBitsToDouble(m5756i(H, bArr)));
            H += 8;
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: s */
    public static int m5766s(byte[] bArr, int i, C2631w.C2635d<?> dVar, C2572a aVar) throws IOException {
        C2629v vVar = (C2629v) dVar;
        int H = m5743H(bArr, i, aVar);
        int i2 = aVar.f5849a + H;
        while (H < i2) {
            vVar.mo9897c(m5754g(H, bArr));
            H += 4;
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: t */
    public static int m5767t(byte[] bArr, int i, C2631w.C2635d<?> dVar, C2572a aVar) throws IOException {
        C2564c0 c0Var = (C2564c0) dVar;
        int H = m5743H(bArr, i, aVar);
        int i2 = aVar.f5849a + H;
        while (H < i2) {
            c0Var.mo9609c(m5756i(H, bArr));
            H += 8;
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: u */
    public static int m5768u(byte[] bArr, int i, C2631w.C2635d<?> dVar, C2572a aVar) throws IOException {
        C2625t tVar = (C2625t) dVar;
        int H = m5743H(bArr, i, aVar);
        int i2 = aVar.f5849a + H;
        while (H < i2) {
            tVar.mo9888c(Float.intBitsToFloat(m5754g(H, bArr)));
            H += 4;
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: v */
    public static int m5769v(byte[] bArr, int i, C2631w.C2635d<?> dVar, C2572a aVar) throws IOException {
        C2629v vVar = (C2629v) dVar;
        int H = m5743H(bArr, i, aVar);
        int i2 = aVar.f5849a + H;
        while (H < i2) {
            H = m5743H(bArr, H, aVar);
            vVar.mo9897c(C2592i.m5901b(aVar.f5849a));
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: w */
    public static int m5770w(byte[] bArr, int i, C2631w.C2635d<?> dVar, C2572a aVar) throws IOException {
        C2564c0 c0Var = (C2564c0) dVar;
        int H = m5743H(bArr, i, aVar);
        int i2 = aVar.f5849a + H;
        while (H < i2) {
            H = m5745J(bArr, H, aVar);
            c0Var.mo9609c(C2592i.m5902c(aVar.f5850b));
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: x */
    public static int m5771x(byte[] bArr, int i, C2631w.C2635d<?> dVar, C2572a aVar) throws IOException {
        C2629v vVar = (C2629v) dVar;
        int H = m5743H(bArr, i, aVar);
        int i2 = aVar.f5849a + H;
        while (H < i2) {
            H = m5743H(bArr, H, aVar);
            vVar.mo9897c(aVar.f5849a);
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: y */
    public static int m5772y(byte[] bArr, int i, C2631w.C2635d<?> dVar, C2572a aVar) throws IOException {
        C2564c0 c0Var = (C2564c0) dVar;
        int H = m5743H(bArr, i, aVar);
        int i2 = aVar.f5849a + H;
        while (H < i2) {
            H = m5745J(bArr, H, aVar);
            c0Var.mo9609c(aVar.f5850b);
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: z */
    public static int m5773z(int i, byte[] bArr, int i2, int i3, C2631w.C2635d<?> dVar, C2572a aVar) {
        C2629v vVar = (C2629v) dVar;
        int H = m5743H(bArr, i2, aVar);
        vVar.mo9897c(C2592i.m5901b(aVar.f5849a));
        while (H < i3) {
            int H2 = m5743H(bArr, H, aVar);
            if (i != aVar.f5849a) {
                break;
            }
            H = m5743H(bArr, H2, aVar);
            vVar.mo9897c(C2592i.m5901b(aVar.f5849a));
        }
        return H;
    }
}
