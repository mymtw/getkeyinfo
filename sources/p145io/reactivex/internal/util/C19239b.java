package p145io.reactivex.internal.util;

/* renamed from: io.reactivex.internal.util.b */
public final class C19239b<T> {

    /* renamed from: a */
    public int f43036a;

    /* renamed from: b */
    public int f43037b;

    /* renamed from: c */
    public int f43038c;

    /* renamed from: d */
    public T[] f43039d;

    public C19239b() {
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
        this.f43036a = numberOfLeadingZeros - 1;
        this.f43038c = (int) (((float) numberOfLeadingZeros) * 0.75f);
        this.f43039d = new Object[numberOfLeadingZeros];
    }

    /* renamed from: a */
    public final void mo71361a(Object obj) {
        T t;
        T t2;
        T[] tArr = this.f43039d;
        int i = this.f43036a;
        int hashCode = obj.hashCode() * -1640531527;
        int i2 = (hashCode ^ (hashCode >>> 16)) & i;
        T t3 = tArr[i2];
        if (t3 != null) {
            if (!t3.equals(obj)) {
                do {
                    i2 = (i2 + 1) & i;
                    t2 = tArr[i2];
                    if (t2 == null) {
                    }
                } while (!t2.equals(obj));
                return;
            }
            return;
        }
        tArr[i2] = obj;
        int i3 = this.f43037b + 1;
        this.f43037b = i3;
        if (i3 >= this.f43038c) {
            T[] tArr2 = this.f43039d;
            int length = tArr2.length;
            int i4 = length << 1;
            int i5 = i4 - 1;
            T[] tArr3 = new Object[i4];
            while (true) {
                int i6 = i3 - 1;
                if (i3 != 0) {
                    do {
                        length--;
                        t = tArr2[length];
                    } while (t == null);
                    int hashCode2 = t.hashCode() * -1640531527;
                    int i7 = (hashCode2 ^ (hashCode2 >>> 16)) & i5;
                    if (tArr3[i7] != null) {
                        do {
                            i7 = (i7 + 1) & i5;
                        } while (tArr3[i7] != null);
                    }
                    tArr3[i7] = tArr2[length];
                    i3 = i6;
                } else {
                    this.f43036a = i5;
                    this.f43038c = (int) (((float) i4) * 0.75f);
                    this.f43039d = tArr3;
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo71362b(int i, int i2, Object[] objArr) {
        int i3;
        Object obj;
        this.f43037b--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int hashCode = obj.hashCode() * -1640531527;
                int i5 = (hashCode ^ (hashCode >>> 16)) & i2;
                if (i <= i3) {
                    if (i >= i5 || i5 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= i5 && i5 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }
}
