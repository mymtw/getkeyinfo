package p595ji;

import java.util.Arrays;
import java.util.Random;

/* renamed from: ji.m */
public interface C18001m {

    /* renamed from: ji.m$a */
    public static class C18002a implements C18001m {

        /* renamed from: a */
        public final Random f39370a;

        /* renamed from: b */
        public final int[] f39371b;

        /* renamed from: c */
        public final int[] f39372c;

        public C18002a() {
            this(new Random());
        }

        /* renamed from: a */
        public final C18002a mo69566a(int i) {
            int i2 = i + 0;
            int[] iArr = new int[(this.f39371b.length - i2)];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f39371b;
                if (i3 >= iArr2.length) {
                    return new C18002a(iArr, new Random(this.f39370a.nextLong()));
                }
                int i5 = iArr2[i3];
                if (i5 < 0 || i5 >= i) {
                    int i6 = i3 - i4;
                    if (i5 >= 0) {
                        i5 -= i2;
                    }
                    iArr[i6] = i5;
                } else {
                    i4++;
                }
                i3++;
            }
        }

        /* renamed from: b */
        public final int mo69567b(int i) {
            int i2 = this.f39372c[i] - 1;
            if (i2 >= 0) {
                return this.f39371b[i2];
            }
            return -1;
        }

        /* renamed from: c */
        public final int mo69568c(int i) {
            int i2 = this.f39372c[i] + 1;
            int[] iArr = this.f39371b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        /* renamed from: d */
        public final int mo69569d() {
            int[] iArr = this.f39371b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        /* renamed from: e */
        public final C18002a mo69570e() {
            return new C18002a(new Random(this.f39370a.nextLong()));
        }

        /* renamed from: f */
        public final int mo69571f() {
            int[] iArr = this.f39371b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        /* renamed from: g */
        public final C18002a mo69572g(int i) {
            int[] iArr = new int[i];
            int[] iArr2 = new int[i];
            int i2 = 0;
            int i3 = 0;
            while (i3 < i) {
                iArr[i3] = this.f39370a.nextInt(this.f39371b.length + 1);
                int i4 = i3 + 1;
                int nextInt = this.f39370a.nextInt(i4);
                iArr2[i3] = iArr2[nextInt];
                iArr2[nextInt] = i3 + 0;
                i3 = i4;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[(this.f39371b.length + i)];
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int[] iArr4 = this.f39371b;
                if (i2 >= iArr4.length + i) {
                    return new C18002a(iArr3, new Random(this.f39370a.nextLong()));
                }
                if (i5 >= i || i6 != iArr[i5]) {
                    int i7 = i6 + 1;
                    int i8 = iArr4[i6];
                    iArr3[i2] = i8;
                    if (i8 >= 0) {
                        iArr3[i2] = i8 + i;
                    }
                    i6 = i7;
                } else {
                    iArr3[i2] = iArr2[i5];
                    i5++;
                }
                i2++;
            }
        }

        public final int getLength() {
            return this.f39371b.length;
        }

        public C18002a(Random random) {
            this(new int[0], random);
        }

        public C18002a(int[] iArr, Random random) {
            this.f39371b = iArr;
            this.f39370a = random;
            this.f39372c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f39372c[iArr[i]] = i;
            }
        }
    }

    /* renamed from: a */
    C18002a mo69566a(int i);

    /* renamed from: b */
    int mo69567b(int i);

    /* renamed from: c */
    int mo69568c(int i);

    /* renamed from: d */
    int mo69569d();

    /* renamed from: e */
    C18002a mo69570e();

    /* renamed from: f */
    int mo69571f();

    /* renamed from: g */
    C18002a mo69572g(int i);

    int getLength();
}
