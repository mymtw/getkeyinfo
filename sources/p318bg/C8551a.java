package p318bg;

/* renamed from: bg.a */
public final class C8551a {

    /* renamed from: a */
    public int f18620a;

    /* renamed from: b */
    public float[] f18621b;

    /* renamed from: c */
    public int[] f18622c;

    /* renamed from: bg.a$a */
    public static final class C8552a {
        /* renamed from: a */
        public static final int m16952a(int[] iArr) {
            int i = 1;
            if (!(iArr.length == 0)) {
                int i2 = iArr[0];
                int length = iArr.length - 1;
                if (1 <= length) {
                    while (true) {
                        i2 *= iArr[i];
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                return i2;
            }
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
    }

    static {
        new C8552a();
    }

    public C8551a(int[] iArr) {
        this.f18622c = iArr;
        int a = C8552a.m16952a(iArr);
        this.f18620a = a;
        this.f18621b = new float[a];
    }
}
