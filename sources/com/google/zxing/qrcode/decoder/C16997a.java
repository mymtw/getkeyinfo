package com.google.zxing.qrcode.decoder;

/* renamed from: com.google.zxing.qrcode.decoder.a */
public final class C16997a {

    /* renamed from: d */
    public static final C16997a[] f37371d = m28517a();

    /* renamed from: a */
    public final int f37372a;

    /* renamed from: b */
    public final C16999b[] f37373b;

    /* renamed from: c */
    public final int f37374c;

    /* renamed from: com.google.zxing.qrcode.decoder.a$a */
    public static final class C16998a {

        /* renamed from: a */
        public final int f37375a;

        /* renamed from: b */
        public final int f37376b;

        public C16998a(int i, int i2) {
            this.f37375a = i;
            this.f37376b = i2;
        }
    }

    /* renamed from: com.google.zxing.qrcode.decoder.a$b */
    public static final class C16999b {

        /* renamed from: a */
        public final int f37377a;

        /* renamed from: b */
        public final C16998a[] f37378b;

        public C16999b(int i, C16998a... aVarArr) {
            this.f37377a = i;
            this.f37378b = aVarArr;
        }
    }

    public C16997a(int i, C16999b... bVarArr) {
        this.f37372a = i;
        this.f37373b = bVarArr;
        C16999b bVar = bVarArr[0];
        int i2 = bVar.f37377a;
        int i3 = 0;
        for (C16998a aVar : bVar.f37378b) {
            i3 += (aVar.f37376b + i2) * aVar.f37375a;
        }
        this.f37374c = i3;
    }

    /* renamed from: a */
    public static C16997a[] m28517a() {
        return new C16997a[]{new C16997a(1, new C16999b(7, new C16998a(1, 19)), new C16999b(10, new C16998a(1, 16)), new C16999b(13, new C16998a(1, 13)), new C16999b(17, new C16998a(1, 9))), new C16997a(2, new C16999b(10, new C16998a(1, 34)), new C16999b(16, new C16998a(1, 28)), new C16999b(22, new C16998a(1, 22)), new C16999b(28, new C16998a(1, 16))), new C16997a(3, new C16999b(15, new C16998a(1, 55)), new C16999b(26, new C16998a(1, 44)), new C16999b(18, new C16998a(2, 17)), new C16999b(22, new C16998a(2, 13))), new C16997a(4, new C16999b(20, new C16998a(1, 80)), new C16999b(18, new C16998a(2, 32)), new C16999b(26, new C16998a(2, 24)), new C16999b(16, new C16998a(4, 9))), new C16997a(5, new C16999b(26, new C16998a(1, 108)), new C16999b(24, new C16998a(2, 43)), new C16999b(18, new C16998a(2, 15), new C16998a(2, 16)), new C16999b(22, new C16998a(2, 11), new C16998a(2, 12))), new C16997a(6, new C16999b(18, new C16998a(2, 68)), new C16999b(16, new C16998a(4, 27)), new C16999b(24, new C16998a(4, 19)), new C16999b(28, new C16998a(4, 15))), new C16997a(7, new C16999b(20, new C16998a(2, 78)), new C16999b(18, new C16998a(4, 31)), new C16999b(18, new C16998a(2, 14), new C16998a(4, 15)), new C16999b(26, new C16998a(4, 13), new C16998a(1, 14))), new C16997a(8, new C16999b(24, new C16998a(2, 97)), new C16999b(22, new C16998a(2, 38), new C16998a(2, 39)), new C16999b(22, new C16998a(4, 18), new C16998a(2, 19)), new C16999b(26, new C16998a(4, 14), new C16998a(2, 15))), new C16997a(9, new C16999b(30, new C16998a(2, 116)), new C16999b(22, new C16998a(3, 36), new C16998a(2, 37)), new C16999b(20, new C16998a(4, 16), new C16998a(4, 17)), new C16999b(24, new C16998a(4, 12), new C16998a(4, 13))), new C16997a(10, new C16999b(18, new C16998a(2, 68), new C16998a(2, 69)), new C16999b(26, new C16998a(4, 43), new C16998a(1, 44)), new C16999b(24, new C16998a(6, 19), new C16998a(2, 20)), new C16999b(28, new C16998a(6, 15), new C16998a(2, 16))), new C16997a(11, new C16999b(20, new C16998a(4, 81)), new C16999b(30, new C16998a(1, 50), new C16998a(4, 51)), new C16999b(28, new C16998a(4, 22), new C16998a(4, 23)), new C16999b(24, new C16998a(3, 12), new C16998a(8, 13))), new C16997a(12, new C16999b(24, new C16998a(2, 92), new C16998a(2, 93)), new C16999b(22, new C16998a(6, 36), new C16998a(2, 37)), new C16999b(26, new C16998a(4, 20), new C16998a(6, 21)), new C16999b(28, new C16998a(7, 14), new C16998a(4, 15))), new C16997a(13, new C16999b(26, new C16998a(4, 107)), new C16999b(22, new C16998a(8, 37), new C16998a(1, 38)), new C16999b(24, new C16998a(8, 20), new C16998a(4, 21)), new C16999b(22, new C16998a(12, 11), new C16998a(4, 12))), new C16997a(14, new C16999b(30, new C16998a(3, 115), new C16998a(1, 116)), new C16999b(24, new C16998a(4, 40), new C16998a(5, 41)), new C16999b(20, new C16998a(11, 16), new C16998a(5, 17)), new C16999b(24, new C16998a(11, 12), new C16998a(5, 13))), new C16997a(15, new C16999b(22, new C16998a(5, 87), new C16998a(1, 88)), new C16999b(24, new C16998a(5, 41), new C16998a(5, 42)), new C16999b(30, new C16998a(5, 24), new C16998a(7, 25)), new C16999b(24, new C16998a(11, 12), new C16998a(7, 13))), new C16997a(16, new C16999b(24, new C16998a(5, 98), new C16998a(1, 99)), new C16999b(28, new C16998a(7, 45), new C16998a(3, 46)), new C16999b(24, new C16998a(15, 19), new C16998a(2, 20)), new C16999b(30, new C16998a(3, 15), new C16998a(13, 16))), new C16997a(17, new C16999b(28, new C16998a(1, 107), new C16998a(5, 108)), new C16999b(28, new C16998a(10, 46), new C16998a(1, 47)), new C16999b(28, new C16998a(1, 22), new C16998a(15, 23)), new C16999b(28, new C16998a(2, 14), new C16998a(17, 15))), new C16997a(18, new C16999b(30, new C16998a(5, 120), new C16998a(1, 121)), new C16999b(26, new C16998a(9, 43), new C16998a(4, 44)), new C16999b(28, new C16998a(17, 22), new C16998a(1, 23)), new C16999b(28, new C16998a(2, 14), new C16998a(19, 15))), new C16997a(19, new C16999b(28, new C16998a(3, 113), new C16998a(4, 114)), new C16999b(26, new C16998a(3, 44), new C16998a(11, 45)), new C16999b(26, new C16998a(17, 21), new C16998a(4, 22)), new C16999b(26, new C16998a(9, 13), new C16998a(16, 14))), new C16997a(20, new C16999b(28, new C16998a(3, 107), new C16998a(5, 108)), new C16999b(26, new C16998a(3, 41), new C16998a(13, 42)), new C16999b(30, new C16998a(15, 24), new C16998a(5, 25)), new C16999b(28, new C16998a(15, 15), new C16998a(10, 16))), new C16997a(21, new C16999b(28, new C16998a(4, 116), new C16998a(4, 117)), new C16999b(26, new C16998a(17, 42)), new C16999b(28, new C16998a(17, 22), new C16998a(6, 23)), new C16999b(30, new C16998a(19, 16), new C16998a(6, 17))), new C16997a(22, new C16999b(28, new C16998a(2, 111), new C16998a(7, 112)), new C16999b(28, new C16998a(17, 46)), new C16999b(30, new C16998a(7, 24), new C16998a(16, 25)), new C16999b(24, new C16998a(34, 13))), new C16997a(23, new C16999b(30, new C16998a(4, 121), new C16998a(5, 122)), new C16999b(28, new C16998a(4, 47), new C16998a(14, 48)), new C16999b(30, new C16998a(11, 24), new C16998a(14, 25)), new C16999b(30, new C16998a(16, 15), new C16998a(14, 16))), new C16997a(24, new C16999b(30, new C16998a(6, 117), new C16998a(4, 118)), new C16999b(28, new C16998a(6, 45), new C16998a(14, 46)), new C16999b(30, new C16998a(11, 24), new C16998a(16, 25)), new C16999b(30, new C16998a(30, 16), new C16998a(2, 17))), new C16997a(25, new C16999b(26, new C16998a(8, 106), new C16998a(4, 107)), new C16999b(28, new C16998a(8, 47), new C16998a(13, 48)), new C16999b(30, new C16998a(7, 24), new C16998a(22, 25)), new C16999b(30, new C16998a(22, 15), new C16998a(13, 16))), new C16997a(26, new C16999b(28, new C16998a(10, 114), new C16998a(2, 115)), new C16999b(28, new C16998a(19, 46), new C16998a(4, 47)), new C16999b(28, new C16998a(28, 22), new C16998a(6, 23)), new C16999b(30, new C16998a(33, 16), new C16998a(4, 17))), new C16997a(27, new C16999b(30, new C16998a(8, 122), new C16998a(4, 123)), new C16999b(28, new C16998a(22, 45), new C16998a(3, 46)), new C16999b(30, new C16998a(8, 23), new C16998a(26, 24)), new C16999b(30, new C16998a(12, 15), new C16998a(28, 16))), new C16997a(28, new C16999b(30, new C16998a(3, 117), new C16998a(10, 118)), new C16999b(28, new C16998a(3, 45), new C16998a(23, 46)), new C16999b(30, new C16998a(4, 24), new C16998a(31, 25)), new C16999b(30, new C16998a(11, 15), new C16998a(31, 16))), new C16997a(29, new C16999b(30, new C16998a(7, 116), new C16998a(7, 117)), new C16999b(28, new C16998a(21, 45), new C16998a(7, 46)), new C16999b(30, new C16998a(1, 23), new C16998a(37, 24)), new C16999b(30, new C16998a(19, 15), new C16998a(26, 16))), new C16997a(30, new C16999b(30, new C16998a(5, 115), new C16998a(10, 116)), new C16999b(28, new C16998a(19, 47), new C16998a(10, 48)), new C16999b(30, new C16998a(15, 24), new C16998a(25, 25)), new C16999b(30, new C16998a(23, 15), new C16998a(25, 16))), new C16997a(31, new C16999b(30, new C16998a(13, 115), new C16998a(3, 116)), new C16999b(28, new C16998a(2, 46), new C16998a(29, 47)), new C16999b(30, new C16998a(42, 24), new C16998a(1, 25)), new C16999b(30, new C16998a(23, 15), new C16998a(28, 16))), new C16997a(32, new C16999b(30, new C16998a(17, 115)), new C16999b(28, new C16998a(10, 46), new C16998a(23, 47)), new C16999b(30, new C16998a(10, 24), new C16998a(35, 25)), new C16999b(30, new C16998a(19, 15), new C16998a(35, 16))), new C16997a(33, new C16999b(30, new C16998a(17, 115), new C16998a(1, 116)), new C16999b(28, new C16998a(14, 46), new C16998a(21, 47)), new C16999b(30, new C16998a(29, 24), new C16998a(19, 25)), new C16999b(30, new C16998a(11, 15), new C16998a(46, 16))), new C16997a(34, new C16999b(30, new C16998a(13, 115), new C16998a(6, 116)), new C16999b(28, new C16998a(14, 46), new C16998a(23, 47)), new C16999b(30, new C16998a(44, 24), new C16998a(7, 25)), new C16999b(30, new C16998a(59, 16), new C16998a(1, 17))), new C16997a(35, new C16999b(30, new C16998a(12, 121), new C16998a(7, 122)), new C16999b(28, new C16998a(12, 47), new C16998a(26, 48)), new C16999b(30, new C16998a(39, 24), new C16998a(14, 25)), new C16999b(30, new C16998a(22, 15), new C16998a(41, 16))), new C16997a(36, new C16999b(30, new C16998a(6, 121), new C16998a(14, 122)), new C16999b(28, new C16998a(6, 47), new C16998a(34, 48)), new C16999b(30, new C16998a(46, 24), new C16998a(10, 25)), new C16999b(30, new C16998a(2, 15), new C16998a(64, 16))), new C16997a(37, new C16999b(30, new C16998a(17, 122), new C16998a(4, 123)), new C16999b(28, new C16998a(29, 46), new C16998a(14, 47)), new C16999b(30, new C16998a(49, 24), new C16998a(10, 25)), new C16999b(30, new C16998a(24, 15), new C16998a(46, 16))), new C16997a(38, new C16999b(30, new C16998a(4, 122), new C16998a(18, 123)), new C16999b(28, new C16998a(13, 46), new C16998a(32, 47)), new C16999b(30, new C16998a(48, 24), new C16998a(14, 25)), new C16999b(30, new C16998a(42, 15), new C16998a(32, 16))), new C16997a(39, new C16999b(30, new C16998a(20, 117), new C16998a(4, 118)), new C16999b(28, new C16998a(40, 47), new C16998a(7, 48)), new C16999b(30, new C16998a(43, 24), new C16998a(22, 25)), new C16999b(30, new C16998a(10, 15), new C16998a(67, 16))), new C16997a(40, new C16999b(30, new C16998a(19, 118), new C16998a(6, 119)), new C16999b(28, new C16998a(18, 47), new C16998a(31, 48)), new C16999b(30, new C16998a(34, 24), new C16998a(34, 25)), new C16999b(30, new C16998a(20, 15), new C16998a(61, 16)))};
    }

    /* renamed from: b */
    public static C16997a m28518b(int i) {
        if (i > 0 && i <= 40) {
            return f37371d[i - 1];
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        return String.valueOf(this.f37372a);
    }
}
