package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: androidx.datastore.preferences.protobuf.e1 */
public final class C2575e1 {

    /* renamed from: f */
    public static final C2575e1 f5860f = new C2575e1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f5861a;

    /* renamed from: b */
    public int[] f5862b;

    /* renamed from: c */
    public Object[] f5863c;

    /* renamed from: d */
    public int f5864d;

    /* renamed from: e */
    public boolean f5865e;

    public C2575e1() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int mo9641a() {
        int i;
        int i2 = this.f5864d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f5861a; i4++) {
            int i5 = this.f5862b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = CodedOutputStream.m5518x(i6, ((Long) this.f5863c[i4]).longValue());
            } else if (i7 == 1) {
                ((Long) this.f5863c[i4]).longValue();
                i = CodedOutputStream.m5502h(i6);
            } else if (i7 == 2) {
                i = CodedOutputStream.m5498d(i6, (ByteString) this.f5863c[i4]);
            } else if (i7 == 3) {
                i3 = ((C2575e1) this.f5863c[i4]).mo9641a() + (CodedOutputStream.m5515u(i6) * 2) + i3;
            } else if (i7 == 5) {
                ((Integer) this.f5863c[i4]).intValue();
                i = CodedOutputStream.m5501g(i6);
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
            }
            i3 = i + i3;
        }
        this.f5864d = i3;
        return i3;
    }

    /* renamed from: b */
    public final void mo9642b(int i, Object obj) {
        if (this.f5865e) {
            int i2 = this.f5861a;
            int[] iArr = this.f5862b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f5862b = Arrays.copyOf(iArr, i3);
                this.f5863c = Arrays.copyOf(this.f5863c, i3);
            }
            int[] iArr2 = this.f5862b;
            int i4 = this.f5861a;
            iArr2[i4] = i;
            this.f5863c[i4] = obj;
            this.f5861a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void mo9643c(C2601k kVar) throws IOException {
        if (this.f5861a != 0) {
            kVar.getClass();
            Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
            for (int i = 0; i < this.f5861a; i++) {
                int i2 = this.f5862b[i];
                Object obj = this.f5863c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    kVar.mo9807j(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    kVar.mo9803f(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    kVar.mo9799b(i3, (ByteString) obj);
                } else if (i4 == 3) {
                    kVar.getClass();
                    Writer$FieldOrder writer$FieldOrder2 = Writer$FieldOrder.ASCENDING;
                    kVar.f5918a.mo9432R(i3, 3);
                    ((C2575e1) obj).mo9643c(kVar);
                    kVar.f5918a.mo9432R(i3, 4);
                } else if (i4 == 5) {
                    kVar.mo9802e(i3, ((Integer) obj).intValue());
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
        if (obj == null || !(obj instanceof C2575e1)) {
            return false;
        }
        C2575e1 e1Var = (C2575e1) obj;
        int i = this.f5861a;
        if (i == e1Var.f5861a) {
            int[] iArr = this.f5862b;
            int[] iArr2 = e1Var.f5862b;
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
                Object[] objArr = this.f5863c;
                Object[] objArr2 = e1Var.f5863c;
                int i3 = this.f5861a;
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
        int i = this.f5861a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f5862b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f5863c;
        int i7 = this.f5861a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public C2575e1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f5864d = -1;
        this.f5861a = i;
        this.f5862b = iArr;
        this.f5863c = objArr;
        this.f5865e = z;
    }
}
