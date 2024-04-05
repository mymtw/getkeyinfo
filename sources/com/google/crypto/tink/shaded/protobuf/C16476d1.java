package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.crypto.tink.shaded.protobuf.d1 */
public final class C16476d1 {

    /* renamed from: f */
    public static final C16476d1 f36589f = new C16476d1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f36590a;

    /* renamed from: b */
    public int[] f36591b;

    /* renamed from: c */
    public Object[] f36592c;

    /* renamed from: d */
    public int f36593d;

    /* renamed from: e */
    public boolean f36594e;

    public C16476d1() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int mo58698a() {
        int i;
        int i2 = this.f36593d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f36590a; i4++) {
            int i5 = this.f36591b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = CodedOutputStream.m26583x(i6, ((Long) this.f36592c[i4]).longValue());
            } else if (i7 == 1) {
                ((Long) this.f36592c[i4]).longValue();
                i = CodedOutputStream.m26567h(i6);
            } else if (i7 == 2) {
                i = CodedOutputStream.m26563d(i6, (ByteString) this.f36592c[i4]);
            } else if (i7 == 3) {
                i3 = ((C16476d1) this.f36592c[i4]).mo58698a() + (CodedOutputStream.m26580u(i6) * 2) + i3;
            } else if (i7 == 5) {
                ((Integer) this.f36592c[i4]).intValue();
                i = CodedOutputStream.m26566g(i6);
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
            }
            i3 = i + i3;
        }
        this.f36593d = i3;
        return i3;
    }

    /* renamed from: b */
    public final void mo58699b(int i, Object obj) {
        if (this.f36594e) {
            int i2 = this.f36590a;
            int[] iArr = this.f36591b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f36591b = Arrays.copyOf(iArr, i3);
                this.f36592c = Arrays.copyOf(this.f36592c, i3);
            }
            int[] iArr2 = this.f36591b;
            int i4 = this.f36590a;
            iArr2[i4] = i;
            this.f36592c[i4] = obj;
            this.f36590a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void mo58700c(C16505k kVar) throws IOException {
        if (this.f36590a != 0) {
            kVar.getClass();
            Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
            for (int i = 0; i < this.f36590a; i++) {
                int i2 = this.f36591b[i];
                Object obj = this.f36592c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    kVar.mo58867j(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    kVar.mo58863f(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    kVar.mo58859b(i3, (ByteString) obj);
                } else if (i4 == 3) {
                    kVar.getClass();
                    Writer$FieldOrder writer$FieldOrder2 = Writer$FieldOrder.ASCENDING;
                    kVar.f36650a.mo58502M(i3, 3);
                    ((C16476d1) obj).mo58700c(kVar);
                    kVar.f36650a.mo58502M(i3, 4);
                } else if (i4 == 5) {
                    kVar.mo58862e(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C16476d1)) {
            return false;
        }
        C16476d1 d1Var = (C16476d1) obj;
        int i = this.f36590a;
        if (i == d1Var.f36590a) {
            int[] iArr = this.f36591b;
            int[] iArr2 = d1Var.f36591b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f36592c;
                Object[] objArr2 = d1Var.f36592c;
                int i3 = this.f36590a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = this.f36590a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f36591b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f36592c;
        int i7 = this.f36590a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public C16476d1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f36593d = -1;
        this.f36590a = i;
        this.f36591b = iArr;
        this.f36592c = objArr;
        this.f36594e = z;
    }
}
