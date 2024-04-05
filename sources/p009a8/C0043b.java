package p009a8;

import androidx.recyclerview.widget.RecyclerView;
import com.cardinalcommerce.dependencies.internal.minidev.json.p062b.C6232i;
import java.math.BigDecimal;

/* renamed from: a8.b */
public abstract class C0043b {

    /* renamed from: r */
    public static boolean[] f102r;

    /* renamed from: s */
    public static boolean[] f103s;

    /* renamed from: t */
    public static boolean[] f104t;

    /* renamed from: u */
    public static boolean[] f105u;

    /* renamed from: v */
    public static boolean[] f106v;

    /* renamed from: a */
    public char f107a;

    /* renamed from: b */
    public String f108b;

    /* renamed from: c */
    public final C0044a f109c = new C0044a();

    /* renamed from: d */
    public Object f110d;

    /* renamed from: e */
    public String f111e;

    /* renamed from: f */
    public int f112f;

    /* renamed from: g */
    public final boolean f113g;

    /* renamed from: h */
    public final boolean f114h;

    /* renamed from: i */
    public final boolean f115i;

    /* renamed from: j */
    public final boolean f116j;

    /* renamed from: k */
    public final boolean f117k;

    /* renamed from: l */
    public final boolean f118l;

    /* renamed from: m */
    public final boolean f119m;

    /* renamed from: n */
    public final boolean f120n;

    /* renamed from: o */
    public final boolean f121o;

    /* renamed from: p */
    public final boolean f122p;

    /* renamed from: q */
    public final boolean f123q;

    /* renamed from: a8.b$a */
    public static class C0044a {

        /* renamed from: a */
        public char[] f124a = new char[15];

        /* renamed from: b */
        public int f125b = -1;

        /* renamed from: a */
        public final void mo85a(char c) {
            int i = this.f125b + 1;
            this.f125b = i;
            char[] cArr = this.f124a;
            if (cArr.length <= i) {
                char[] cArr2 = new char[((cArr.length * 2) + 1)];
                System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                this.f124a = cArr2;
            }
            this.f124a[this.f125b] = c;
        }

        public final String toString() {
            return new String(this.f124a, 0, this.f125b + 1);
        }
    }

    static {
        boolean[] zArr = new boolean[126];
        f102r = zArr;
        boolean[] zArr2 = new boolean[126];
        f103s = zArr2;
        boolean[] zArr3 = new boolean[126];
        f104t = zArr3;
        boolean[] zArr4 = new boolean[126];
        f105u = zArr4;
        boolean[] zArr5 = new boolean[126];
        f106v = zArr5;
        zArr3[26] = true;
        zArr3[58] = true;
        zArr4[26] = true;
        zArr4[125] = true;
        zArr4[44] = true;
        zArr2[26] = true;
        zArr2[93] = true;
        zArr2[44] = true;
        zArr5[26] = true;
        zArr[58] = true;
        zArr[44] = true;
        zArr[26] = true;
        zArr[125] = true;
        zArr[93] = true;
    }

    public C0043b(int i) {
        boolean z = true;
        this.f114h = (i & 4) > 0;
        this.f115i = (i & 2) > 0;
        this.f116j = (i & 1) > 0;
        this.f120n = (i & 8) > 0;
        this.f122p = (i & 16) > 0;
        this.f113g = (i & 32) > 0;
        this.f117k = (i & 64) > 0;
        this.f121o = (i & 128) > 0;
        this.f118l = (i & 768) != 768;
        this.f119m = (i & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) == 0;
        this.f123q = (i & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) <= 0 ? false : z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00da, code lost:
        throw new com.cardinalcommerce.dependencies.internal.minidev.json.p062b.C6232i(r2.f112f, 0, java.lang.Character.valueOf(r2.f107a));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo72a(p039c8.C4450f<?> r3, boolean[] r4) {
        /*
            r2 = this;
        L_0x0000:
            char r0 = r2.f107a
            r1 = 9
            if (r0 == r1) goto L_0x00ea
            r1 = 10
            if (r0 == r1) goto L_0x00ea
            r1 = 1
            switch(r0) {
                case 13: goto L_0x00ea;
                case 32: goto L_0x00ea;
                case 34: goto L_0x00c6;
                case 39: goto L_0x00c6;
                case 45: goto L_0x00db;
                case 78: goto L_0x0093;
                case 91: goto L_0x0088;
                case 93: goto L_0x00cc;
                case 102: goto L_0x0067;
                case 110: goto L_0x0047;
                case 116: goto L_0x0026;
                case 123: goto L_0x001b;
                case 125: goto L_0x00cc;
                default: goto L_0x000e;
            }
        L_0x000e:
            switch(r0) {
                case 48: goto L_0x00db;
                case 49: goto L_0x00db;
                case 50: goto L_0x00db;
                case 51: goto L_0x00db;
                case 52: goto L_0x00db;
                case 53: goto L_0x00db;
                case 54: goto L_0x00db;
                case 55: goto L_0x00db;
                case 56: goto L_0x00db;
                case 57: goto L_0x00db;
                case 58: goto L_0x00cc;
                default: goto L_0x0011;
            }
        L_0x0011:
            r2.mo73b(r4)
            boolean r3 = r2.f115i
            if (r3 == 0) goto L_0x00e0
            java.lang.String r3 = r2.f111e
            return r3
        L_0x001b:
            java.lang.String r4 = r2.f108b
            c8.f r3 = r3.mo14394f(r4)
            java.lang.Object r3 = r2.mo80i(r3)
            return r3
        L_0x0026:
            r2.mo73b(r4)
            java.lang.String r3 = r2.f111e
            java.lang.String r4 = "true"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0036
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        L_0x0036:
            boolean r3 = r2.f115i
            if (r3 == 0) goto L_0x003d
            java.lang.String r3 = r2.f111e
            return r3
        L_0x003d:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r3 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r4 = r2.f112f
            java.lang.String r0 = r2.f111e
            r3.<init>(r4, r1, r0)
            throw r3
        L_0x0047:
            r2.mo73b(r4)
            java.lang.String r3 = r2.f111e
            java.lang.String r4 = "null"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0056
            r3 = 0
            return r3
        L_0x0056:
            boolean r3 = r2.f115i
            if (r3 == 0) goto L_0x005d
            java.lang.String r3 = r2.f111e
            return r3
        L_0x005d:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r3 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r4 = r2.f112f
            java.lang.String r0 = r2.f111e
            r3.<init>(r4, r1, r0)
            throw r3
        L_0x0067:
            r2.mo73b(r4)
            java.lang.String r3 = r2.f111e
            java.lang.String r4 = "false"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0077
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        L_0x0077:
            boolean r3 = r2.f115i
            if (r3 == 0) goto L_0x007e
            java.lang.String r3 = r2.f111e
            return r3
        L_0x007e:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r3 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r4 = r2.f112f
            java.lang.String r0 = r2.f111e
            r3.<init>(r4, r1, r0)
            throw r3
        L_0x0088:
            java.lang.String r4 = r2.f108b
            c8.f r3 = r3.mo14392a(r4)
            java.lang.Object r3 = r2.mo74c(r3)
            return r3
        L_0x0093:
            r2.mo73b(r4)
            boolean r3 = r2.f114h
            if (r3 == 0) goto L_0x00bc
            java.lang.String r3 = r2.f111e
            java.lang.String r4 = "NaN"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00ab
            r3 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            return r3
        L_0x00ab:
            boolean r3 = r2.f115i
            if (r3 == 0) goto L_0x00b2
            java.lang.String r3 = r2.f111e
            return r3
        L_0x00b2:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r3 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r4 = r2.f112f
            java.lang.String r0 = r2.f111e
            r3.<init>(r4, r1, r0)
            throw r3
        L_0x00bc:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r3 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r4 = r2.f112f
            java.lang.String r0 = r2.f111e
            r3.<init>(r4, r1, r0)
            throw r3
        L_0x00c6:
            r2.mo83l()
            java.lang.String r3 = r2.f111e
            return r3
        L_0x00cc:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r3 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r4 = r2.f112f
            r0 = 0
            char r1 = r2.f107a
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r3.<init>(r4, r0, r1)
            throw r3
        L_0x00db:
            java.lang.Object r3 = r2.mo75d(r4)
            return r3
        L_0x00e0:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r3 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r4 = r2.f112f
            java.lang.String r0 = r2.f111e
            r3.<init>(r4, r1, r0)
            throw r3
        L_0x00ea:
            r2.mo81j()
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: p009a8.C0043b.mo72a(c8.f, boolean[]):java.lang.Object");
    }

    /* renamed from: b */
    public abstract void mo73b(boolean[] zArr);

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        if (r5 == ':') goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        if (r5 == ']') goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        if (r5 == '}') goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        if (r4 == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005b, code lost:
        if (r7.f117k == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006b, code lost:
        throw new com.cardinalcommerce.dependencies.internal.minidev.json.p062b.C6232i(r7.f112f, 0, java.lang.Character.valueOf(r7.f107a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006c, code lost:
        mo81j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0073, code lost:
        return r8.mo14391c(r0);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo74c(p039c8.C4450f<T> r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r8.mo14389b()
            char r1 = r7.f107a
            r2 = 91
            if (r1 != r2) goto L_0x00ad
            r7.mo81j()
            char r1 = r7.f107a
            r2 = 44
            r3 = 0
            if (r1 != r2) goto L_0x0027
            boolean r1 = r7.f117k
            if (r1 == 0) goto L_0x0019
            goto L_0x0027
        L_0x0019:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r8 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r0 = r7.f112f
            char r1 = r7.f107a
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r8.<init>(r0, r3, r1)
            throw r8
        L_0x0027:
            r1 = 1
        L_0x0028:
            r4 = r3
        L_0x0029:
            char r5 = r7.f107a
            r6 = 9
            if (r5 == r6) goto L_0x00a8
            r6 = 10
            if (r5 == r6) goto L_0x00a8
            r6 = 13
            if (r5 == r6) goto L_0x00a8
            r6 = 26
            if (r5 == r6) goto L_0x009c
            r6 = 32
            if (r5 == r6) goto L_0x00a8
            if (r5 == r2) goto L_0x0082
            r6 = 58
            if (r5 == r6) goto L_0x0074
            r6 = 93
            if (r5 == r6) goto L_0x0057
            r4 = 125(0x7d, float:1.75E-43)
            if (r5 == r4) goto L_0x0074
            boolean[] r4 = f103s
            java.lang.Object r4 = r7.mo72a(r8, r4)
            r8.mo14390d(r0, r4)
            goto L_0x0028
        L_0x0057:
            if (r4 == 0) goto L_0x006c
            boolean r1 = r7.f117k
            if (r1 == 0) goto L_0x005e
            goto L_0x006c
        L_0x005e:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r8 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r0 = r7.f112f
            char r1 = r7.f107a
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r8.<init>(r0, r3, r1)
            throw r8
        L_0x006c:
            r7.mo81j()
            java.lang.Object r8 = r8.mo14391c(r0)
            return r8
        L_0x0074:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r8 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r0 = r7.f112f
            char r1 = r7.f107a
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r8.<init>(r0, r3, r1)
            throw r8
        L_0x0082:
            if (r4 == 0) goto L_0x0097
            boolean r4 = r7.f117k
            if (r4 == 0) goto L_0x0089
            goto L_0x0097
        L_0x0089:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r8 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r0 = r7.f112f
            char r1 = r7.f107a
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r8.<init>(r0, r3, r1)
            throw r8
        L_0x0097:
            r7.mo81j()
            r4 = r1
            goto L_0x0029
        L_0x009c:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r8 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r0 = r7.f112f
            int r0 = r0 - r1
            r1 = 3
            java.lang.String r2 = "EOF"
            r8.<init>(r0, r1, r2)
            throw r8
        L_0x00a8:
            r7.mo81j()
            goto L_0x0029
        L_0x00ad:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "Internal Error"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p009a8.C0043b.mo74c(c8.f):java.lang.Object");
    }

    /* renamed from: d */
    public abstract Object mo75d(boolean[] zArr);

    /* renamed from: e */
    public final void mo76e() {
        int length = this.f111e.length();
        if (length != 1) {
            if (length != 2) {
                char charAt = this.f111e.charAt(0);
                char charAt2 = this.f111e.charAt(1);
                if (charAt == '-') {
                    char charAt3 = this.f111e.charAt(2);
                    if (charAt2 == '0' && charAt3 >= '0' && charAt3 <= '9') {
                        throw new C6232i(this.f112f, 6, this.f111e);
                    }
                } else if (charAt == '0' && charAt2 >= '0' && charAt2 <= '9') {
                    throw new C6232i(this.f112f, 6, this.f111e);
                }
            } else if (this.f111e.equals("00")) {
                throw new C6232i(this.f112f, 6, this.f111e);
            }
        }
    }

    /* renamed from: f */
    public final Number mo77f() {
        if (!this.f113g) {
            mo76e();
        }
        return !this.f121o ? Float.valueOf(Float.parseFloat(this.f111e)) : this.f111e.length() > 18 ? new BigDecimal(this.f111e) : Double.valueOf(Double.parseDouble(this.f111e));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d0, code lost:
        throw new com.cardinalcommerce.dependencies.internal.minidev.json.p062b.C6232i(r3.f112f, 0, java.lang.Character.valueOf(r3.f107a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return r3.f111e;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo78g(p039c8.C4447c r4) {
        /*
            r3 = this;
        L_0x0000:
            char r0 = r3.f107a
            r1 = 9
            if (r0 == r1) goto L_0x00e7
            r1 = 10
            if (r0 == r1) goto L_0x00e7
            r1 = 1
            switch(r0) {
                case 13: goto L_0x00e7;
                case 32: goto L_0x00e7;
                case 34: goto L_0x00be;
                case 39: goto L_0x00be;
                case 45: goto L_0x00d1;
                case 78: goto L_0x008b;
                case 91: goto L_0x0086;
                case 93: goto L_0x00c2;
                case 102: goto L_0x0065;
                case 110: goto L_0x0044;
                case 116: goto L_0x0021;
                case 123: goto L_0x001c;
                case 125: goto L_0x00c2;
                default: goto L_0x000e;
            }
        L_0x000e:
            switch(r0) {
                case 48: goto L_0x00d1;
                case 49: goto L_0x00d1;
                case 50: goto L_0x00d1;
                case 51: goto L_0x00d1;
                case 52: goto L_0x00d1;
                case 53: goto L_0x00d1;
                case 54: goto L_0x00d1;
                case 55: goto L_0x00d1;
                case 56: goto L_0x00d1;
                case 57: goto L_0x00d1;
                case 58: goto L_0x00c2;
                default: goto L_0x0011;
            }
        L_0x0011:
            boolean[] r4 = f106v
            r3.mo73b(r4)
            boolean r4 = r3.f115i
            if (r4 == 0) goto L_0x00dd
            goto L_0x00da
        L_0x001c:
            java.lang.Object r4 = r3.mo80i(r4)
            return r4
        L_0x0021:
            boolean[] r4 = f106v
            r3.mo73b(r4)
            java.lang.String r4 = r3.f111e
            java.lang.String r0 = "true"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0034
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            goto L_0x00dc
        L_0x0034:
            boolean r4 = r3.f115i
            if (r4 == 0) goto L_0x003a
            goto L_0x00da
        L_0x003a:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r4 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r0 = r3.f112f
            java.lang.String r2 = r3.f111e
            r4.<init>(r0, r1, r2)
            throw r4
        L_0x0044:
            boolean[] r4 = f106v
            r3.mo73b(r4)
            java.lang.String r4 = r3.f111e
            java.lang.String r0 = "null"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0055
            r4 = 0
            return r4
        L_0x0055:
            boolean r4 = r3.f115i
            if (r4 == 0) goto L_0x005b
            goto L_0x00da
        L_0x005b:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r4 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r0 = r3.f112f
            java.lang.String r2 = r3.f111e
            r4.<init>(r0, r1, r2)
            throw r4
        L_0x0065:
            boolean[] r4 = f106v
            r3.mo73b(r4)
            java.lang.String r4 = r3.f111e
            java.lang.String r0 = "false"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0077
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            goto L_0x00dc
        L_0x0077:
            boolean r4 = r3.f115i
            if (r4 == 0) goto L_0x007c
            goto L_0x00da
        L_0x007c:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r4 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r0 = r3.f112f
            java.lang.String r2 = r3.f111e
            r4.<init>(r0, r1, r2)
            throw r4
        L_0x0086:
            java.lang.Object r4 = r3.mo74c(r4)
            return r4
        L_0x008b:
            boolean[] r4 = f106v
            r3.mo73b(r4)
            boolean r4 = r3.f114h
            if (r4 == 0) goto L_0x00b4
            java.lang.String r4 = r3.f111e
            java.lang.String r0 = "NaN"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x00a5
            r4 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L_0x00dc
        L_0x00a5:
            boolean r4 = r3.f115i
            if (r4 == 0) goto L_0x00aa
            goto L_0x00da
        L_0x00aa:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r4 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r0 = r3.f112f
            java.lang.String r2 = r3.f111e
            r4.<init>(r0, r1, r2)
            throw r4
        L_0x00b4:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r4 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r0 = r3.f112f
            java.lang.String r2 = r3.f111e
            r4.<init>(r0, r1, r2)
            throw r4
        L_0x00be:
            r3.mo83l()
            goto L_0x00da
        L_0x00c2:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r4 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r0 = r3.f112f
            r1 = 0
            char r2 = r3.f107a
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r4.<init>(r0, r1, r2)
            throw r4
        L_0x00d1:
            boolean[] r4 = f106v
            java.lang.Object r4 = r3.mo75d(r4)
            r3.f110d = r4
            goto L_0x00dc
        L_0x00da:
            java.lang.String r4 = r3.f111e
        L_0x00dc:
            return r4
        L_0x00dd:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r4 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r0 = r3.f112f
            java.lang.String r2 = r3.f111e
            r4.<init>(r0, r1, r2)
            throw r4
        L_0x00e7:
            r3.mo81j()
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: p009a8.C0043b.mo78g(c8.c):java.lang.Object");
    }

    /* renamed from: h */
    public final void mo79h(boolean[] zArr) {
        while (true) {
            char c = this.f107a;
            if (c == 26) {
                return;
            }
            if (c < 0 || c >= '~' || !zArr[c]) {
                mo82k();
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f7, code lost:
        throw new com.cardinalcommerce.dependencies.internal.minidev.json.p062b.C6232i(r13.f112f, 0, java.lang.Character.valueOf(r13.f107a));
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo80i(p039c8.C4450f<T> r14) {
        /*
            r13 = this;
            char r0 = r13.f107a
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 != r1) goto L_0x0110
            java.lang.Object r0 = r14.mo14395g()
            r2 = 0
            r3 = 1
            r4 = r2
        L_0x000d:
            r13.mo81j()
            char r5 = r13.f107a
            r6 = 9
            if (r5 == r6) goto L_0x000d
            r6 = 10
            if (r5 == r6) goto L_0x000d
            r6 = 13
            if (r5 == r6) goto L_0x000d
            r6 = 32
            if (r5 == r6) goto L_0x000d
            r6 = 44
            if (r5 == r6) goto L_0x00f8
            r7 = 58
            if (r5 == r7) goto L_0x00ea
            r8 = 91
            if (r5 == r8) goto L_0x00ea
            r8 = 93
            if (r5 == r8) goto L_0x00ea
            if (r5 == r1) goto L_0x00ea
            r8 = 125(0x7d, float:1.75E-43)
            if (r5 == r8) goto L_0x00d5
            r4 = 34
            if (r5 == r4) goto L_0x0055
            r4 = 39
            if (r5 != r4) goto L_0x0041
            goto L_0x0055
        L_0x0041:
            boolean[] r4 = f104t
            r13.mo73b(r4)
            boolean r4 = r13.f115i
            if (r4 == 0) goto L_0x004b
            goto L_0x0058
        L_0x004b:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r14 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r0 = r13.f112f
            java.lang.String r1 = r13.f111e
            r14.<init>(r0, r3, r1)
            throw r14
        L_0x0055:
            r13.mo83l()
        L_0x0058:
            java.lang.String r4 = r13.f111e
            r13.mo84m()
            char r5 = r13.f107a
            r9 = 0
            r10 = 3
            r11 = 26
            if (r5 == r7) goto L_0x007a
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r14 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r0 = r13.f112f
            int r0 = r0 - r3
            if (r5 != r11) goto L_0x0070
            r14.<init>(r0, r10, r9)
            throw r14
        L_0x0070:
            char r1 = r13.f107a
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r14.<init>(r0, r2, r1)
            throw r14
        L_0x007a:
            r5 = r13
            a8.d r5 = (p009a8.C0046d) r5
            int r7 = r5.f112f
            int r7 = r7 + r3
            r5.f112f = r7
            int r12 = r5.f126w
            if (r7 >= r12) goto L_0x00c7
            java.lang.String r12 = r5.f127x
            char r7 = r12.charAt(r7)
            r5.f107a = r7
            r13.f108b = r4
            boolean[] r5 = f105u
            java.lang.Object r5 = r13.mo72a(r14, r5)
            r14.mo14393e(r0, r4, r5)
            r13.f108b = r9
            r13.mo84m()
            char r4 = r13.f107a
            if (r4 != r8) goto L_0x00aa
        L_0x00a2:
            r13.mo81j()
            java.lang.Object r14 = r14.mo14391c(r0)
            return r14
        L_0x00aa:
            if (r4 == r11) goto L_0x00be
            if (r4 != r6) goto L_0x00af
            goto L_0x010d
        L_0x00af:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r14 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r0 = r13.f112f
            int r0 = r0 - r3
            char r1 = r13.f107a
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r14.<init>(r0, r3, r1)
            throw r14
        L_0x00be:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r14 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r0 = r13.f112f
            int r0 = r0 - r3
            r14.<init>(r0, r10, r9)
            throw r14
        L_0x00c7:
            r5.f107a = r11
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r14 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r0 = r5.f112f
            int r0 = r0 + -1
            java.lang.String r1 = "EOF"
            r14.<init>(r0, r10, r1)
            throw r14
        L_0x00d5:
            if (r4 == 0) goto L_0x00a2
            boolean r1 = r13.f117k
            if (r1 == 0) goto L_0x00dc
            goto L_0x00a2
        L_0x00dc:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r14 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r0 = r13.f112f
            char r1 = r13.f107a
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r14.<init>(r0, r2, r1)
            throw r14
        L_0x00ea:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r14 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r0 = r13.f112f
            char r1 = r13.f107a
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r14.<init>(r0, r2, r1)
            throw r14
        L_0x00f8:
            if (r4 == 0) goto L_0x010d
            boolean r4 = r13.f117k
            if (r4 == 0) goto L_0x00ff
            goto L_0x010d
        L_0x00ff:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r14 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r0 = r13.f112f
            char r1 = r13.f107a
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r14.<init>(r0, r2, r1)
            throw r14
        L_0x010d:
            r4 = r3
            goto L_0x000d
        L_0x0110:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException
            java.lang.String r0 = "Internal Error"
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p009a8.C0043b.mo80i(c8.f):java.lang.Object");
    }

    /* renamed from: j */
    public abstract void mo81j();

    /* renamed from: k */
    public abstract void mo82k();

    /* renamed from: l */
    public abstract void mo83l();

    /* renamed from: m */
    public final void mo84m() {
        while (true) {
            char c = this.f107a;
            if (c <= ' ' && c != 26) {
                mo82k();
            } else {
                return;
            }
        }
    }
}
