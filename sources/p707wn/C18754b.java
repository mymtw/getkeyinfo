package p707wn;

/* renamed from: wn.b */
public final class C18754b {

    /* renamed from: a */
    public final C18753a f41536a;

    /* renamed from: b */
    public final int[] f41537b;

    public C18754b(C18753a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f41536a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f41537b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f41537b = new int[]{0};
                return;
            }
            int i2 = length - i;
            int[] iArr2 = new int[i2];
            this.f41537b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final C18754b mo70241a(C18754b bVar) {
        if (!this.f41536a.equals(bVar.f41536a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo70242b()) {
            return bVar;
        } else {
            if (bVar.mo70242b()) {
                return this;
            }
            int[] iArr = this.f41537b;
            int[] iArr2 = bVar.f41537b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = iArr2[i - length] ^ iArr[i];
            }
            return new C18754b(this.f41536a, iArr4);
        }
    }

    /* renamed from: b */
    public final boolean mo70242b() {
        return this.f41537b[0] == 0;
    }

    /* renamed from: c */
    public final C18754b mo70243c(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f41536a.f41532c;
        } else {
            int length = this.f41537b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f41536a.mo70239a(this.f41537b[i3], i2);
            }
            return new C18754b(this.f41536a, iArr);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f41537b.length - 1) * 8);
        int length = this.f41537b.length;
        while (true) {
            length--;
            if (length < 0) {
                return sb.toString();
            }
            int[] iArr = this.f41537b;
            int i = iArr[(iArr.length - 1) - length];
            if (i != 0) {
                if (i < 0) {
                    sb.append(" - ");
                    i = -i;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (length == 0 || i != 1) {
                    C18753a aVar = this.f41536a;
                    if (i != 0) {
                        int i2 = aVar.f41531b[i];
                        if (i2 == 0) {
                            sb.append('1');
                        } else if (i2 == 1) {
                            sb.append('a');
                        } else {
                            sb.append("a^");
                            sb.append(i2);
                        }
                    } else {
                        aVar.getClass();
                        throw new IllegalArgumentException();
                    }
                }
                if (length != 0) {
                    if (length == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(length);
                    }
                }
            }
        }
    }
}
