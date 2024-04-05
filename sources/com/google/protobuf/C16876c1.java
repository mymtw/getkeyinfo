package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.protobuf.c1 */
public final class C16876c1 {

    /* renamed from: f */
    public static final C16876c1 f37186f = new C16876c1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f37187a;

    /* renamed from: b */
    public int[] f37188b;

    /* renamed from: c */
    public Object[] f37189c;

    /* renamed from: d */
    public int f37190d;

    /* renamed from: e */
    public boolean f37191e;

    public C16876c1() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int mo59871a() {
        int i;
        int i2 = this.f37190d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f37187a; i4++) {
            int i5 = this.f37188b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = CodedOutputStream.m27899x(i6, ((Long) this.f37189c[i4]).longValue());
            } else if (i7 == 1) {
                ((Long) this.f37189c[i4]).longValue();
                i = CodedOutputStream.m27883h(i6);
            } else if (i7 == 2) {
                i = CodedOutputStream.m27879d(i6, (ByteString) this.f37189c[i4]);
            } else if (i7 == 3) {
                i3 = ((C16876c1) this.f37189c[i4]).mo59871a() + (CodedOutputStream.m27896u(i6) * 2) + i3;
            } else if (i7 == 5) {
                ((Integer) this.f37189c[i4]).intValue();
                i = CodedOutputStream.m27882g(i6);
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
            }
            i3 = i + i3;
        }
        this.f37190d = i3;
        return i3;
    }

    /* renamed from: b */
    public final void mo59872b(int i, Object obj) {
        if (this.f37191e) {
            int i2 = this.f37187a;
            int[] iArr = this.f37188b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f37188b = Arrays.copyOf(iArr, i3);
                this.f37189c = Arrays.copyOf(this.f37189c, i3);
            }
            int[] iArr2 = this.f37188b;
            int i4 = this.f37187a;
            iArr2[i4] = i;
            this.f37189c[i4] = obj;
            this.f37187a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void mo59873c(C16905j jVar) throws IOException {
        if (this.f37187a != 0) {
            jVar.getClass();
            Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
            for (int i = 0; i < this.f37187a; i++) {
                int i2 = this.f37188b[i];
                Object obj = this.f37189c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    jVar.mo59960j(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    jVar.mo59956f(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    jVar.mo59952b(i3, (ByteString) obj);
                } else if (i4 == 3) {
                    jVar.getClass();
                    Writer$FieldOrder writer$FieldOrder2 = Writer$FieldOrder.ASCENDING;
                    jVar.f37242a.mo59726Q(i3, 3);
                    ((C16876c1) obj).mo59873c(jVar);
                    jVar.f37242a.mo59726Q(i3, 4);
                } else if (i4 == 5) {
                    jVar.mo59955e(i3, ((Integer) obj).intValue());
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
        if (obj == null || !(obj instanceof C16876c1)) {
            return false;
        }
        C16876c1 c1Var = (C16876c1) obj;
        int i = this.f37187a;
        if (i == c1Var.f37187a) {
            int[] iArr = this.f37188b;
            int[] iArr2 = c1Var.f37188b;
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
                Object[] objArr = this.f37189c;
                Object[] objArr2 = c1Var.f37189c;
                int i3 = this.f37187a;
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
        int i = this.f37187a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f37188b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f37189c;
        int i7 = this.f37187a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public C16876c1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f37190d = -1;
        this.f37187a = i;
        this.f37188b = iArr;
        this.f37189c = objArr;
        this.f37191e = z;
    }
}
