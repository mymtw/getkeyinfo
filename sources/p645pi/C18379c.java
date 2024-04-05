package p645pi;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p003a2.C0023f;
import p513bj.C14075p;
import p513bj.C14076q;
import p513bj.C14077r;
import p636oi.C18296a;
import p645pi.C18383d;

/* renamed from: pi.c */
public final class C18379c extends C18383d {

    /* renamed from: g */
    public final C14077r f40389g = new C14077r();

    /* renamed from: h */
    public final C14076q f40390h = new C14076q();

    /* renamed from: i */
    public int f40391i = -1;

    /* renamed from: j */
    public final int f40392j;

    /* renamed from: k */
    public final C18381b[] f40393k;

    /* renamed from: l */
    public C18381b f40394l;

    /* renamed from: m */
    public List<C18296a> f40395m;

    /* renamed from: n */
    public List<C18296a> f40396n;

    /* renamed from: o */
    public C18382c f40397o;

    /* renamed from: p */
    public int f40398p;

    /* renamed from: pi.c$a */
    public static final class C18380a {

        /* renamed from: c */
        public static final C18378b f40399c = new C18378b();

        /* renamed from: a */
        public final C18296a f40400a;

        /* renamed from: b */
        public final int f40401b;

        public C18380a(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
            C18296a.C18297a aVar = new C18296a.C18297a();
            aVar.f40164a = spannableStringBuilder;
            aVar.f40166c = alignment;
            aVar.f40168e = f;
            aVar.f40169f = 0;
            aVar.f40170g = i;
            aVar.f40171h = f2;
            aVar.f40172i = i2;
            aVar.f40175l = -3.4028235E38f;
            if (z) {
                aVar.f40178o = i3;
                aVar.f40177n = true;
            }
            this.f40400a = aVar.mo69838a();
            this.f40401b = i4;
        }
    }

    /* renamed from: pi.c$b */
    public static final class C18381b {

        /* renamed from: A */
        public static final int[] f40402A = {3, 3, 3, 3, 3, 3, 1};

        /* renamed from: B */
        public static final boolean[] f40403B = {false, false, false, true, true, true, false};

        /* renamed from: C */
        public static final int[] f40404C;

        /* renamed from: D */
        public static final int[] f40405D = {0, 1, 2, 3, 4, 3, 4};

        /* renamed from: E */
        public static final int[] f40406E = {0, 0, 0, 0, 0, 3, 3};

        /* renamed from: F */
        public static final int[] f40407F;

        /* renamed from: w */
        public static final int f40408w = m31076c(2, 2, 2, 0);

        /* renamed from: x */
        public static final int f40409x;

        /* renamed from: y */
        public static final int[] f40410y = {0, 0, 0, 0, 0, 2, 0};

        /* renamed from: z */
        public static final int[] f40411z = {0, 0, 0, 0, 0, 0, 2};

        /* renamed from: a */
        public final ArrayList f40412a = new ArrayList();

        /* renamed from: b */
        public final SpannableStringBuilder f40413b = new SpannableStringBuilder();

        /* renamed from: c */
        public boolean f40414c;

        /* renamed from: d */
        public boolean f40415d;

        /* renamed from: e */
        public int f40416e;

        /* renamed from: f */
        public boolean f40417f;

        /* renamed from: g */
        public int f40418g;

        /* renamed from: h */
        public int f40419h;

        /* renamed from: i */
        public int f40420i;

        /* renamed from: j */
        public int f40421j;

        /* renamed from: k */
        public boolean f40422k;

        /* renamed from: l */
        public int f40423l;

        /* renamed from: m */
        public int f40424m;

        /* renamed from: n */
        public int f40425n;

        /* renamed from: o */
        public int f40426o;

        /* renamed from: p */
        public int f40427p;

        /* renamed from: q */
        public int f40428q;

        /* renamed from: r */
        public int f40429r;

        /* renamed from: s */
        public int f40430s;

        /* renamed from: t */
        public int f40431t;

        /* renamed from: u */
        public int f40432u;

        /* renamed from: v */
        public int f40433v;

        static {
            int c = m31076c(0, 0, 0, 0);
            f40409x = c;
            int c2 = m31076c(0, 0, 0, 3);
            f40404C = new int[]{c, c2, c, c, c2, c, c};
            f40407F = new int[]{c, c, c, c, c, c2, c2};
        }

        public C18381b() {
            mo69924d();
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x002e  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m31076c(int r4, int r5, int r6, int r7) {
            /*
                r0 = 4
                p513bj.C14075p.m21693e(r4, r0)
                p513bj.C14075p.m21693e(r5, r0)
                p513bj.C14075p.m21693e(r6, r0)
                p513bj.C14075p.m21693e(r7, r0)
                r0 = 0
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L_0x0021
                if (r7 == r1) goto L_0x0021
                r3 = 2
                if (r7 == r3) goto L_0x001e
                r3 = 3
                if (r7 == r3) goto L_0x001c
                goto L_0x0021
            L_0x001c:
                r7 = r0
                goto L_0x0022
            L_0x001e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L_0x0022
            L_0x0021:
                r7 = r2
            L_0x0022:
                if (r4 <= r1) goto L_0x0026
                r4 = r2
                goto L_0x0027
            L_0x0026:
                r4 = r0
            L_0x0027:
                if (r5 <= r1) goto L_0x002b
                r5 = r2
                goto L_0x002c
            L_0x002b:
                r5 = r0
            L_0x002c:
                if (r6 <= r1) goto L_0x002f
                r0 = r2
            L_0x002f:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p645pi.C18379c.C18381b.m31076c(int, int, int, int):int");
        }

        /* renamed from: a */
        public final void mo69922a(char c) {
            if (c == 10) {
                this.f40412a.add(mo69923b());
                this.f40413b.clear();
                if (this.f40427p != -1) {
                    this.f40427p = 0;
                }
                if (this.f40428q != -1) {
                    this.f40428q = 0;
                }
                if (this.f40429r != -1) {
                    this.f40429r = 0;
                }
                if (this.f40431t != -1) {
                    this.f40431t = 0;
                }
                while (true) {
                    if ((this.f40422k && this.f40412a.size() >= this.f40421j) || this.f40412a.size() >= 15) {
                        this.f40412a.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f40413b.append(c);
            }
        }

        /* renamed from: b */
        public final SpannableString mo69923b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f40413b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f40427p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f40427p, length, 33);
                }
                if (this.f40428q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f40428q, length, 33);
                }
                if (this.f40429r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f40430s), this.f40429r, length, 33);
                }
                if (this.f40431t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f40432u), this.f40431t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: d */
        public final void mo69924d() {
            this.f40412a.clear();
            this.f40413b.clear();
            this.f40427p = -1;
            this.f40428q = -1;
            this.f40429r = -1;
            this.f40431t = -1;
            this.f40433v = 0;
            this.f40414c = false;
            this.f40415d = false;
            this.f40416e = 4;
            this.f40417f = false;
            this.f40418g = 0;
            this.f40419h = 0;
            this.f40420i = 0;
            this.f40421j = 15;
            this.f40422k = true;
            this.f40423l = 0;
            this.f40424m = 0;
            this.f40425n = 0;
            int i = f40409x;
            this.f40426o = i;
            this.f40430s = f40408w;
            this.f40432u = i;
        }

        /* renamed from: e */
        public final void mo69925e(boolean z, boolean z2) {
            if (this.f40427p != -1) {
                if (!z) {
                    this.f40413b.setSpan(new StyleSpan(2), this.f40427p, this.f40413b.length(), 33);
                    this.f40427p = -1;
                }
            } else if (z) {
                this.f40427p = this.f40413b.length();
            }
            if (this.f40428q != -1) {
                if (!z2) {
                    this.f40413b.setSpan(new UnderlineSpan(), this.f40428q, this.f40413b.length(), 33);
                    this.f40428q = -1;
                }
            } else if (z2) {
                this.f40428q = this.f40413b.length();
            }
        }

        /* renamed from: f */
        public final void mo69926f(int i, int i2) {
            if (!(this.f40429r == -1 || this.f40430s == i)) {
                this.f40413b.setSpan(new ForegroundColorSpan(this.f40430s), this.f40429r, this.f40413b.length(), 33);
            }
            if (i != f40408w) {
                this.f40429r = this.f40413b.length();
                this.f40430s = i;
            }
            if (!(this.f40431t == -1 || this.f40432u == i2)) {
                this.f40413b.setSpan(new BackgroundColorSpan(this.f40432u), this.f40431t, this.f40413b.length(), 33);
            }
            if (i2 != f40409x) {
                this.f40431t = this.f40413b.length();
                this.f40432u = i2;
            }
        }
    }

    /* renamed from: pi.c$c */
    public static final class C18382c {

        /* renamed from: a */
        public final int f40434a;

        /* renamed from: b */
        public final int f40435b;

        /* renamed from: c */
        public final byte[] f40436c;

        /* renamed from: d */
        public int f40437d = 0;

        public C18382c(int i, int i2) {
            this.f40434a = i;
            this.f40435b = i2;
            this.f40436c = new byte[((i2 * 2) - 1)];
        }
    }

    public C18379c(int i, List<byte[]> list) {
        this.f40392j = i == -1 ? 1 : i;
        if (!(list == null || (list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1))) {
        }
        this.f40393k = new C18381b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f40393k[i2] = new C18381b();
        }
        this.f40394l = this.f40393k[0];
    }

    /* renamed from: e */
    public final C18386e mo69906e() {
        List<C18296a> list = this.f40395m;
        this.f40396n = list;
        list.getClass();
        return new C18386e(list);
    }

    /* renamed from: f */
    public final void mo69907f(C18383d.C18384a aVar) {
        ByteBuffer byteBuffer = aVar.f31493d;
        byteBuffer.getClass();
        this.f40389g.mo46933x(byteBuffer.limit(), byteBuffer.array());
        while (true) {
            C14077r rVar = this.f40389g;
            if (rVar.f30988c - rVar.f30987b >= 3) {
                int p = rVar.mo46925p() & 7;
                int i = p & 3;
                boolean z = false;
                boolean z2 = (p & 4) == 4;
                byte p2 = (byte) this.f40389g.mo46925p();
                byte p3 = (byte) this.f40389g.mo46925p();
                if ((i == 2 || i == 3) && z2) {
                    if (i == 3) {
                        mo69919i();
                        int i2 = (p2 & 192) >> 6;
                        int i3 = this.f40391i;
                        if (!(i3 == -1 || i2 == (i3 + 1) % 4)) {
                            mo69921k();
                            Log.w("Cea708Decoder", C0023f.m107h(71, "Sequence number discontinuity. previous=", this.f40391i, " current=", i2));
                        }
                        this.f40391i = i2;
                        byte b = p2 & 63;
                        if (b == 0) {
                            b = 64;
                        }
                        C18382c cVar = new C18382c(i2, b);
                        this.f40397o = cVar;
                        byte[] bArr = cVar.f40436c;
                        int i4 = cVar.f40437d;
                        cVar.f40437d = i4 + 1;
                        bArr[i4] = p3;
                    } else {
                        if (i == 2) {
                            z = true;
                        }
                        C14075p.m21691c(z);
                        C18382c cVar2 = this.f40397o;
                        if (cVar2 == null) {
                            Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.f40436c;
                            int i5 = cVar2.f40437d;
                            int i6 = i5 + 1;
                            bArr2[i5] = p2;
                            cVar2.f40437d = i6 + 1;
                            bArr2[i6] = p3;
                        }
                    }
                    C18382c cVar3 = this.f40397o;
                    if (cVar3.f40437d == (cVar3.f40435b * 2) - 1) {
                        mo69919i();
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void flush() {
        super.flush();
        this.f40395m = null;
        this.f40396n = null;
        this.f40398p = 0;
        this.f40394l = this.f40393k[0];
        mo69921k();
        this.f40397o = null;
    }

    /* renamed from: h */
    public final boolean mo69909h() {
        return this.f40395m != this.f40396n;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03c0, code lost:
        r1 = true;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69919i() {
        /*
            r17 = this;
            r0 = r17
            pi.c$c r1 = r0.f40397o
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            int r2 = r1.f40437d
            int r3 = r1.f40435b
            r4 = 2
            int r3 = r3 * r4
            int r3 = r3 + -1
            java.lang.String r5 = "Cea708Decoder"
            if (r2 == r3) goto L_0x0040
            int r1 = r1.f40434a
            r6 = 115(0x73, float:1.61E-43)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "DtvCcPacket ended prematurely; size is "
            r7.append(r6)
            r7.append(r3)
            java.lang.String r3 = ", but current index is "
            r7.append(r3)
            r7.append(r2)
            java.lang.String r2 = " (sequence number "
            r7.append(r2)
            r7.append(r1)
            java.lang.String r1 = ");"
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            android.util.Log.d(r5, r1)
        L_0x0040:
            bj.q r1 = r0.f40390h
            pi.c$c r2 = r0.f40397o
            byte[] r3 = r2.f40436c
            int r2 = r2.f40437d
            r1.mo46904k(r2, r3)
            bj.q r1 = r0.f40390h
            r2 = 3
            int r1 = r1.mo46901h(r2)
            bj.q r3 = r0.f40390h
            r6 = 5
            int r3 = r3.mo46901h(r6)
            r6 = 44
            r7 = 7
            r8 = 6
            if (r1 != r7) goto L_0x0071
            bj.q r1 = r0.f40390h
            r1.mo46907n(r4)
            bj.q r1 = r0.f40390h
            int r1 = r1.mo46901h(r8)
            if (r1 >= r7) goto L_0x0071
            java.lang.String r9 = "Invalid extended service number: "
            p003a2.C0023f.m112m(r6, r9, r1, r5)
        L_0x0071:
            if (r3 != 0) goto L_0x0092
            if (r1 == 0) goto L_0x05c5
            r2 = 59
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "serviceNumber is non-zero ("
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = ") when blockSize is 0"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.w(r5, r1)
            goto L_0x05c5
        L_0x0092:
            int r3 = r0.f40392j
            if (r1 == r3) goto L_0x0098
            goto L_0x05c5
        L_0x0098:
            r1 = 0
        L_0x0099:
            bj.q r3 = r0.f40390h
            int r3 = r3.mo46895b()
            if (r3 <= 0) goto L_0x05bd
            bj.q r3 = r0.f40390h
            r6 = 8
            int r3 = r3.mo46901h(r6)
            r9 = 23
            r10 = 159(0x9f, float:2.23E-43)
            r11 = 24
            r12 = 127(0x7f, float:1.78E-43)
            r13 = 16
            r14 = 31
            if (r3 == r13) goto L_0x041a
            r15 = 10
            if (r3 > r14) goto L_0x0118
            if (r3 == 0) goto L_0x0591
            if (r3 == r2) goto L_0x0110
            if (r3 == r6) goto L_0x00fd
            switch(r3) {
                case 12: goto L_0x00df;
                case 13: goto L_0x00d8;
                case 14: goto L_0x0591;
                default: goto L_0x00c4;
            }
        L_0x00c4:
            r8 = 17
            if (r3 < r8) goto L_0x00e4
            if (r3 > r9) goto L_0x00e4
            r8 = 55
            java.lang.String r9 = "Currently unsupported COMMAND_EXT1 Command: "
            p003a2.C0023f.m112m(r8, r9, r3, r5)
            bj.q r3 = r0.f40390h
            r3.mo46907n(r6)
            goto L_0x0591
        L_0x00d8:
            pi.c$b r3 = r0.f40394l
            r3.mo69922a(r15)
            goto L_0x0591
        L_0x00df:
            r17.mo69921k()
            goto L_0x0591
        L_0x00e4:
            if (r3 < r11) goto L_0x00f6
            if (r3 > r14) goto L_0x00f6
            r6 = 54
            java.lang.String r8 = "Currently unsupported COMMAND_P16 Command: "
            p003a2.C0023f.m112m(r6, r8, r3, r5)
            bj.q r3 = r0.f40390h
            r3.mo46907n(r13)
            goto L_0x0591
        L_0x00f6:
            java.lang.String r6 = "Invalid C0 command: "
            p003a2.C0023f.m112m(r14, r6, r3, r5)
            goto L_0x0591
        L_0x00fd:
            pi.c$b r3 = r0.f40394l
            android.text.SpannableStringBuilder r6 = r3.f40413b
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x0591
            android.text.SpannableStringBuilder r3 = r3.f40413b
            int r8 = r6 + -1
            r3.delete(r8, r6)
            goto L_0x0591
        L_0x0110:
            java.util.List r3 = r17.mo69920j()
            r0.f40395m = r3
            goto L_0x0591
        L_0x0118:
            if (r3 > r12) goto L_0x012f
            if (r3 != r12) goto L_0x0124
            pi.c$b r1 = r0.f40394l
            r3 = 9835(0x266b, float:1.3782E-41)
            r1.mo69922a(r3)
            goto L_0x012c
        L_0x0124:
            pi.c$b r1 = r0.f40394l
            r3 = r3 & 255(0xff, float:3.57E-43)
            char r3 = (char) r3
            r1.mo69922a(r3)
        L_0x012c:
            r1 = 1
            goto L_0x0591
        L_0x012f:
            if (r3 > r10) goto L_0x0401
            r1 = 4
            switch(r3) {
                case 128: goto L_0x03ed;
                case 129: goto L_0x03ed;
                case 130: goto L_0x03ed;
                case 131: goto L_0x03ed;
                case 132: goto L_0x03ed;
                case 133: goto L_0x03ed;
                case 134: goto L_0x03ed;
                case 135: goto L_0x03ed;
                case 136: goto L_0x03c2;
                case 137: goto L_0x03a9;
                case 138: goto L_0x0392;
                case 139: goto L_0x0378;
                case 140: goto L_0x0361;
                case 141: goto L_0x035b;
                case 142: goto L_0x03c0;
                case 143: goto L_0x0357;
                case 144: goto L_0x031a;
                case 145: goto L_0x02b5;
                case 146: goto L_0x0286;
                case 147: goto L_0x0135;
                case 148: goto L_0x0135;
                case 149: goto L_0x0135;
                case 150: goto L_0x0135;
                case 151: goto L_0x0219;
                case 152: goto L_0x013a;
                case 153: goto L_0x013a;
                case 154: goto L_0x013a;
                case 155: goto L_0x013a;
                case 156: goto L_0x013a;
                case 157: goto L_0x013a;
                case 158: goto L_0x013a;
                case 159: goto L_0x013a;
                default: goto L_0x0135;
            }
        L_0x0135:
            r1 = 1
            java.lang.String r6 = "Invalid C1 command: "
            goto L_0x03fd
        L_0x013a:
            int r3 = r3 + -152
            pi.c$b[] r9 = r0.f40393k
            r9 = r9[r3]
            bj.q r10 = r0.f40390h
            r10.mo46907n(r4)
            bj.q r10 = r0.f40390h
            boolean r10 = r10.mo46900g()
            bj.q r11 = r0.f40390h
            boolean r11 = r11.mo46900g()
            bj.q r12 = r0.f40390h
            r12.mo46900g()
            bj.q r12 = r0.f40390h
            int r12 = r12.mo46901h(r2)
            bj.q r13 = r0.f40390h
            boolean r13 = r13.mo46900g()
            bj.q r14 = r0.f40390h
            int r7 = r14.mo46901h(r7)
            bj.q r14 = r0.f40390h
            int r6 = r14.mo46901h(r6)
            bj.q r14 = r0.f40390h
            int r14 = r14.mo46901h(r1)
            bj.q r15 = r0.f40390h
            int r1 = r15.mo46901h(r1)
            bj.q r15 = r0.f40390h
            r15.mo46907n(r4)
            bj.q r15 = r0.f40390h
            r15.mo46901h(r8)
            bj.q r8 = r0.f40390h
            r8.mo46907n(r4)
            bj.q r8 = r0.f40390h
            int r8 = r8.mo46901h(r2)
            bj.q r15 = r0.f40390h
            int r2 = r15.mo46901h(r2)
            r15 = 1
            r9.f40414c = r15
            r9.f40415d = r10
            r9.f40422k = r11
            r9.f40416e = r12
            r9.f40417f = r13
            r9.f40418g = r7
            r9.f40419h = r6
            r9.f40420i = r14
            int r6 = r9.f40421j
            int r1 = r1 + r15
            if (r6 == r1) goto L_0x01ca
            r9.f40421j = r1
        L_0x01ad:
            if (r11 == 0) goto L_0x01b9
            java.util.ArrayList r1 = r9.f40412a
            int r1 = r1.size()
            int r6 = r9.f40421j
            if (r1 >= r6) goto L_0x01c3
        L_0x01b9:
            java.util.ArrayList r1 = r9.f40412a
            int r1 = r1.size()
            r6 = 15
            if (r1 < r6) goto L_0x01ca
        L_0x01c3:
            java.util.ArrayList r1 = r9.f40412a
            r6 = 0
            r1.remove(r6)
            goto L_0x01ad
        L_0x01ca:
            if (r8 == 0) goto L_0x01ec
            int r1 = r9.f40424m
            if (r1 == r8) goto L_0x01ec
            r9.f40424m = r8
            int r8 = r8 + -1
            int[] r1 = p645pi.C18379c.C18381b.f40404C
            r1 = r1[r8]
            boolean[] r6 = p645pi.C18379c.C18381b.f40403B
            boolean r6 = r6[r8]
            int[] r6 = p645pi.C18379c.C18381b.f40411z
            r6 = r6[r8]
            int[] r6 = p645pi.C18379c.C18381b.f40402A
            r6 = r6[r8]
            int[] r6 = p645pi.C18379c.C18381b.f40410y
            r6 = r6[r8]
            r9.f40426o = r1
            r9.f40423l = r6
        L_0x01ec:
            if (r2 == 0) goto L_0x020b
            int r1 = r9.f40425n
            if (r1 == r2) goto L_0x020b
            r9.f40425n = r2
            int r2 = r2 + -1
            int[] r1 = p645pi.C18379c.C18381b.f40406E
            r1 = r1[r2]
            int[] r1 = p645pi.C18379c.C18381b.f40405D
            r1 = r1[r2]
            r1 = 0
            r9.mo69925e(r1, r1)
            int r1 = p645pi.C18379c.C18381b.f40408w
            int[] r6 = p645pi.C18379c.C18381b.f40407F
            r2 = r6[r2]
            r9.mo69926f(r1, r2)
        L_0x020b:
            int r1 = r0.f40398p
            if (r1 == r3) goto L_0x0325
            r0.f40398p = r3
            pi.c$b[] r1 = r0.f40393k
            r1 = r1[r3]
            r0.f40394l = r1
            goto L_0x0325
        L_0x0219:
            pi.c$b r1 = r0.f40394l
            boolean r1 = r1.f40414c
            if (r1 != 0) goto L_0x0228
            bj.q r1 = r0.f40390h
            r2 = 32
            r1.mo46907n(r2)
            goto L_0x0325
        L_0x0228:
            bj.q r1 = r0.f40390h
            int r1 = r1.mo46901h(r4)
            bj.q r2 = r0.f40390h
            int r2 = r2.mo46901h(r4)
            bj.q r3 = r0.f40390h
            int r3 = r3.mo46901h(r4)
            bj.q r7 = r0.f40390h
            int r7 = r7.mo46901h(r4)
            int r1 = p645pi.C18379c.C18381b.m31076c(r2, r3, r7, r1)
            bj.q r2 = r0.f40390h
            r2.mo46901h(r4)
            bj.q r2 = r0.f40390h
            int r2 = r2.mo46901h(r4)
            bj.q r3 = r0.f40390h
            int r3 = r3.mo46901h(r4)
            bj.q r7 = r0.f40390h
            int r7 = r7.mo46901h(r4)
            r8 = 0
            p645pi.C18379c.C18381b.m31076c(r2, r3, r7, r8)
            bj.q r2 = r0.f40390h
            r2.mo46900g()
            bj.q r2 = r0.f40390h
            r2.mo46900g()
            bj.q r2 = r0.f40390h
            r2.mo46901h(r4)
            bj.q r2 = r0.f40390h
            r2.mo46901h(r4)
            bj.q r2 = r0.f40390h
            int r2 = r2.mo46901h(r4)
            bj.q r3 = r0.f40390h
            r3.mo46907n(r6)
            pi.c$b r3 = r0.f40394l
            r3.f40426o = r1
            r3.f40423l = r2
            goto L_0x0325
        L_0x0286:
            pi.c$b r2 = r0.f40394l
            boolean r2 = r2.f40414c
            if (r2 != 0) goto L_0x0293
            bj.q r1 = r0.f40390h
            r1.mo46907n(r13)
            goto L_0x0325
        L_0x0293:
            bj.q r2 = r0.f40390h
            r2.mo46907n(r1)
            bj.q r2 = r0.f40390h
            int r1 = r2.mo46901h(r1)
            bj.q r2 = r0.f40390h
            r2.mo46907n(r4)
            bj.q r2 = r0.f40390h
            r3 = 6
            r2.mo46901h(r3)
            pi.c$b r2 = r0.f40394l
            int r3 = r2.f40433v
            if (r3 == r1) goto L_0x02b2
            r2.mo69922a(r15)
        L_0x02b2:
            r2.f40433v = r1
            goto L_0x0325
        L_0x02b5:
            pi.c$b r1 = r0.f40394l
            boolean r1 = r1.f40414c
            if (r1 != 0) goto L_0x02c1
            bj.q r1 = r0.f40390h
            r1.mo46907n(r11)
            goto L_0x0325
        L_0x02c1:
            bj.q r1 = r0.f40390h
            int r1 = r1.mo46901h(r4)
            bj.q r2 = r0.f40390h
            int r2 = r2.mo46901h(r4)
            bj.q r3 = r0.f40390h
            int r3 = r3.mo46901h(r4)
            bj.q r6 = r0.f40390h
            int r6 = r6.mo46901h(r4)
            int r1 = p645pi.C18379c.C18381b.m31076c(r2, r3, r6, r1)
            bj.q r2 = r0.f40390h
            int r2 = r2.mo46901h(r4)
            bj.q r3 = r0.f40390h
            int r3 = r3.mo46901h(r4)
            bj.q r6 = r0.f40390h
            int r6 = r6.mo46901h(r4)
            bj.q r7 = r0.f40390h
            int r7 = r7.mo46901h(r4)
            int r2 = p645pi.C18379c.C18381b.m31076c(r3, r6, r7, r2)
            bj.q r3 = r0.f40390h
            r3.mo46907n(r4)
            bj.q r3 = r0.f40390h
            int r3 = r3.mo46901h(r4)
            bj.q r6 = r0.f40390h
            int r6 = r6.mo46901h(r4)
            bj.q r7 = r0.f40390h
            int r7 = r7.mo46901h(r4)
            r8 = 0
            p645pi.C18379c.C18381b.m31076c(r3, r6, r7, r8)
            pi.c$b r3 = r0.f40394l
            r3.mo69926f(r1, r2)
            goto L_0x0325
        L_0x031a:
            pi.c$b r2 = r0.f40394l
            boolean r2 = r2.f40414c
            if (r2 != 0) goto L_0x0329
            bj.q r1 = r0.f40390h
            r1.mo46907n(r13)
        L_0x0325:
            r1 = 3
            r2 = r1
            goto L_0x03c0
        L_0x0329:
            bj.q r2 = r0.f40390h
            r2.mo46901h(r1)
            bj.q r1 = r0.f40390h
            r1.mo46901h(r4)
            bj.q r1 = r0.f40390h
            r1.mo46901h(r4)
            bj.q r1 = r0.f40390h
            boolean r1 = r1.mo46900g()
            bj.q r2 = r0.f40390h
            boolean r2 = r2.mo46900g()
            bj.q r3 = r0.f40390h
            r6 = 3
            r3.mo46901h(r6)
            bj.q r3 = r0.f40390h
            r3.mo46901h(r6)
            pi.c$b r3 = r0.f40394l
            r3.mo69925e(r1, r2)
            r2 = r6
            goto L_0x03c0
        L_0x0357:
            r17.mo69921k()
            goto L_0x03c0
        L_0x035b:
            bj.q r1 = r0.f40390h
            r1.mo46907n(r6)
            goto L_0x03c0
        L_0x0361:
            r1 = 1
        L_0x0362:
            if (r1 > r6) goto L_0x03c0
            bj.q r3 = r0.f40390h
            boolean r3 = r3.mo46900g()
            if (r3 == 0) goto L_0x0375
            pi.c$b[] r3 = r0.f40393k
            int r7 = 8 - r1
            r3 = r3[r7]
            r3.mo69924d()
        L_0x0375:
            int r1 = r1 + 1
            goto L_0x0362
        L_0x0378:
            r1 = 1
        L_0x0379:
            if (r1 > r6) goto L_0x03c0
            bj.q r3 = r0.f40390h
            boolean r3 = r3.mo46900g()
            if (r3 == 0) goto L_0x038f
            pi.c$b[] r3 = r0.f40393k
            int r7 = 8 - r1
            r3 = r3[r7]
            boolean r7 = r3.f40415d
            r7 = r7 ^ 1
            r3.f40415d = r7
        L_0x038f:
            int r1 = r1 + 1
            goto L_0x0379
        L_0x0392:
            r1 = 1
        L_0x0393:
            if (r1 > r6) goto L_0x03c0
            bj.q r3 = r0.f40390h
            boolean r3 = r3.mo46900g()
            if (r3 == 0) goto L_0x03a6
            pi.c$b[] r3 = r0.f40393k
            int r7 = 8 - r1
            r3 = r3[r7]
            r7 = 0
            r3.f40415d = r7
        L_0x03a6:
            int r1 = r1 + 1
            goto L_0x0393
        L_0x03a9:
            r1 = 1
        L_0x03aa:
            if (r1 > r6) goto L_0x03c0
            bj.q r3 = r0.f40390h
            boolean r3 = r3.mo46900g()
            if (r3 == 0) goto L_0x03bd
            pi.c$b[] r3 = r0.f40393k
            int r7 = 8 - r1
            r3 = r3[r7]
            r7 = 1
            r3.f40415d = r7
        L_0x03bd:
            int r1 = r1 + 1
            goto L_0x03aa
        L_0x03c0:
            r1 = 1
            goto L_0x0417
        L_0x03c2:
            r1 = 1
            r3 = r1
        L_0x03c4:
            if (r3 > r6) goto L_0x0417
            bj.q r7 = r0.f40390h
            boolean r7 = r7.mo46900g()
            if (r7 == 0) goto L_0x03ea
            pi.c$b[] r7 = r0.f40393k
            int r8 = 8 - r3
            r7 = r7[r8]
            java.util.ArrayList r8 = r7.f40412a
            r8.clear()
            android.text.SpannableStringBuilder r8 = r7.f40413b
            r8.clear()
            r8 = -1
            r7.f40427p = r8
            r7.f40428q = r8
            r7.f40429r = r8
            r7.f40431t = r8
            r8 = 0
            r7.f40433v = r8
        L_0x03ea:
            int r3 = r3 + 1
            goto L_0x03c4
        L_0x03ed:
            r1 = 1
            int r3 = r3 + -128
            int r6 = r0.f40398p
            if (r6 == r3) goto L_0x0417
            r0.f40398p = r3
            pi.c$b[] r6 = r0.f40393k
            r3 = r6[r3]
            r0.f40394l = r3
            goto L_0x0417
        L_0x03fd:
            p003a2.C0023f.m112m(r14, r6, r3, r5)
            goto L_0x0417
        L_0x0401:
            r6 = 255(0xff, float:3.57E-43)
            r7 = 1
            if (r3 > r6) goto L_0x0410
            pi.c$b r1 = r0.f40394l
            r3 = r3 & 255(0xff, float:3.57E-43)
            char r3 = (char) r3
            r1.mo69922a(r3)
            r1 = r7
            goto L_0x0417
        L_0x0410:
            r6 = 33
            java.lang.String r7 = "Invalid base command: "
            p003a2.C0023f.m112m(r6, r7, r3, r5)
        L_0x0417:
            r7 = 7
            goto L_0x0591
        L_0x041a:
            r3 = 1
            bj.q r7 = r0.f40390h
            int r7 = r7.mo46901h(r6)
            if (r7 > r14) goto L_0x0443
            r3 = 7
            if (r7 > r3) goto L_0x0427
            goto L_0x0440
        L_0x0427:
            r8 = 15
            if (r7 > r8) goto L_0x0431
            bj.q r7 = r0.f40390h
            r7.mo46907n(r6)
            goto L_0x0440
        L_0x0431:
            if (r7 > r9) goto L_0x0439
            bj.q r6 = r0.f40390h
            r6.mo46907n(r13)
            goto L_0x0440
        L_0x0439:
            if (r7 > r14) goto L_0x0440
            bj.q r6 = r0.f40390h
            r6.mo46907n(r11)
        L_0x0440:
            r7 = r3
            goto L_0x0591
        L_0x0443:
            r8 = 7
            r9 = 160(0xa0, float:2.24E-43)
            r11 = 37
            if (r7 > r12) goto L_0x055b
            r1 = 32
            if (r7 == r1) goto L_0x0552
            r1 = 33
            if (r7 == r1) goto L_0x054c
            if (r7 == r11) goto L_0x0544
            r1 = 42
            if (r7 == r1) goto L_0x053c
            r1 = 44
            if (r7 == r1) goto L_0x0534
            r1 = 63
            if (r7 == r1) goto L_0x052c
            r1 = 57
            if (r7 == r1) goto L_0x0524
            r1 = 58
            if (r7 == r1) goto L_0x051c
            r1 = 60
            if (r7 == r1) goto L_0x0514
            r1 = 61
            if (r7 == r1) goto L_0x050c
            switch(r7) {
                case 48: goto L_0x04ac;
                case 49: goto L_0x04a3;
                case 50: goto L_0x049a;
                case 51: goto L_0x0491;
                case 52: goto L_0x0488;
                case 53: goto L_0x047f;
                default: goto L_0x0473;
            }
        L_0x0473:
            switch(r7) {
                case 118: goto L_0x0504;
                case 119: goto L_0x04fc;
                case 120: goto L_0x04f4;
                case 121: goto L_0x04eb;
                case 122: goto L_0x04e2;
                case 123: goto L_0x04d9;
                case 124: goto L_0x04d0;
                case 125: goto L_0x04c7;
                case 126: goto L_0x04be;
                case 127: goto L_0x04b5;
                default: goto L_0x0476;
            }
        L_0x0476:
            r1 = 33
            java.lang.String r6 = "Invalid G2 character: "
            p003a2.C0023f.m112m(r1, r6, r7, r5)
            goto L_0x0559
        L_0x047f:
            pi.c$b r1 = r0.f40394l
            r6 = 8226(0x2022, float:1.1527E-41)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x0488:
            pi.c$b r1 = r0.f40394l
            r6 = 8221(0x201d, float:1.152E-41)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x0491:
            pi.c$b r1 = r0.f40394l
            r6 = 8220(0x201c, float:1.1519E-41)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x049a:
            pi.c$b r1 = r0.f40394l
            r6 = 8217(0x2019, float:1.1514E-41)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x04a3:
            pi.c$b r1 = r0.f40394l
            r6 = 8216(0x2018, float:1.1513E-41)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x04ac:
            pi.c$b r1 = r0.f40394l
            r6 = 9608(0x2588, float:1.3464E-41)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x04b5:
            pi.c$b r1 = r0.f40394l
            r6 = 9484(0x250c, float:1.329E-41)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x04be:
            pi.c$b r1 = r0.f40394l
            r6 = 9496(0x2518, float:1.3307E-41)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x04c7:
            pi.c$b r1 = r0.f40394l
            r6 = 9472(0x2500, float:1.3273E-41)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x04d0:
            pi.c$b r1 = r0.f40394l
            r6 = 9492(0x2514, float:1.3301E-41)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x04d9:
            pi.c$b r1 = r0.f40394l
            r6 = 9488(0x2510, float:1.3296E-41)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x04e2:
            pi.c$b r1 = r0.f40394l
            r6 = 9474(0x2502, float:1.3276E-41)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x04eb:
            pi.c$b r1 = r0.f40394l
            r6 = 8542(0x215e, float:1.197E-41)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x04f4:
            pi.c$b r1 = r0.f40394l
            r6 = 8541(0x215d, float:1.1968E-41)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x04fc:
            pi.c$b r1 = r0.f40394l
            r6 = 8540(0x215c, float:1.1967E-41)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x0504:
            pi.c$b r1 = r0.f40394l
            r6 = 8539(0x215b, float:1.1966E-41)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x050c:
            pi.c$b r1 = r0.f40394l
            r6 = 8480(0x2120, float:1.1883E-41)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x0514:
            pi.c$b r1 = r0.f40394l
            r6 = 339(0x153, float:4.75E-43)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x051c:
            pi.c$b r1 = r0.f40394l
            r6 = 353(0x161, float:4.95E-43)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x0524:
            pi.c$b r1 = r0.f40394l
            r6 = 8482(0x2122, float:1.1886E-41)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x052c:
            pi.c$b r1 = r0.f40394l
            r6 = 376(0x178, float:5.27E-43)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x0534:
            pi.c$b r1 = r0.f40394l
            r6 = 338(0x152, float:4.74E-43)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x053c:
            pi.c$b r1 = r0.f40394l
            r6 = 352(0x160, float:4.93E-43)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x0544:
            pi.c$b r1 = r0.f40394l
            r6 = 8230(0x2026, float:1.1533E-41)
            r1.mo69922a(r6)
            goto L_0x0559
        L_0x054c:
            pi.c$b r1 = r0.f40394l
            r1.mo69922a(r9)
            goto L_0x0559
        L_0x0552:
            pi.c$b r1 = r0.f40394l
            r6 = 32
            r1.mo69922a(r6)
        L_0x0559:
            r1 = r3
            goto L_0x0590
        L_0x055b:
            r12 = 32
            if (r7 > r10) goto L_0x0595
            r3 = 135(0x87, float:1.89E-43)
            if (r7 > r3) goto L_0x0569
            bj.q r3 = r0.f40390h
            r3.mo46907n(r12)
            goto L_0x0590
        L_0x0569:
            r3 = 143(0x8f, float:2.0E-43)
            if (r7 > r3) goto L_0x0575
            bj.q r3 = r0.f40390h
            r6 = 40
            r3.mo46907n(r6)
            goto L_0x0590
        L_0x0575:
            if (r7 > r10) goto L_0x0590
            bj.q r3 = r0.f40390h
            r3.mo46907n(r4)
            bj.q r3 = r0.f40390h
            r7 = 6
            int r3 = r3.mo46901h(r7)
            bj.q r9 = r0.f40390h
            int r3 = r3 * r6
            r9.mo46907n(r3)
            r16 = r8
            r8 = r7
            r7 = r16
            goto L_0x0099
        L_0x0590:
            r7 = r8
        L_0x0591:
            r3 = 6
            r8 = r3
            goto L_0x0099
        L_0x0595:
            r6 = 255(0xff, float:3.57E-43)
            r10 = 6
            if (r7 > r6) goto L_0x05b4
            if (r7 != r9) goto L_0x05a4
            pi.c$b r1 = r0.f40394l
            r6 = 13252(0x33c4, float:1.857E-41)
            r1.mo69922a(r6)
            goto L_0x05b2
        L_0x05a4:
            r1 = 33
            java.lang.String r6 = "Invalid G3 character: "
            p003a2.C0023f.m112m(r1, r6, r7, r5)
            pi.c$b r1 = r0.f40394l
            r6 = 95
            r1.mo69922a(r6)
        L_0x05b2:
            r1 = r3
            goto L_0x05b9
        L_0x05b4:
            java.lang.String r3 = "Invalid extended command: "
            p003a2.C0023f.m112m(r11, r3, r7, r5)
        L_0x05b9:
            r7 = r8
            r8 = r10
            goto L_0x0099
        L_0x05bd:
            if (r1 == 0) goto L_0x05c5
            java.util.List r1 = r17.mo69920j()
            r0.f40395m = r1
        L_0x05c5:
            r1 = 0
            r0.f40397o = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p645pi.C18379c.mo69919i():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e7  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p636oi.C18296a> mo69920j() {
        /*
            r17 = this;
            r0 = r17
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = r2
        L_0x0009:
            r4 = 8
            if (r3 >= r4) goto L_0x0105
            pi.c$b[] r4 = r0.f40393k
            r4 = r4[r3]
            boolean r5 = r4.f40414c
            r6 = 1
            if (r5 == 0) goto L_0x0029
            java.util.ArrayList r5 = r4.f40412a
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0027
            android.text.SpannableStringBuilder r4 = r4.f40413b
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r4 = r2
            goto L_0x002a
        L_0x0029:
            r4 = r6
        L_0x002a:
            if (r4 != 0) goto L_0x0101
            pi.c$b[] r4 = r0.f40393k
            r4 = r4[r3]
            boolean r5 = r4.f40415d
            if (r5 == 0) goto L_0x0101
            boolean r5 = r4.f40414c
            if (r5 == 0) goto L_0x004b
            java.util.ArrayList r5 = r4.f40412a
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0049
            android.text.SpannableStringBuilder r5 = r4.f40413b
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r5 = r2
            goto L_0x004c
        L_0x004b:
            r5 = r6
        L_0x004c:
            if (r5 == 0) goto L_0x0051
            r4 = 0
            goto L_0x00fc
        L_0x0051:
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>()
            r5 = r2
        L_0x0057:
            java.util.ArrayList r8 = r4.f40412a
            int r8 = r8.size()
            if (r5 >= r8) goto L_0x0072
            java.util.ArrayList r8 = r4.f40412a
            java.lang.Object r8 = r8.get(r5)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r7.append(r8)
            r8 = 10
            r7.append(r8)
            int r5 = r5 + 1
            goto L_0x0057
        L_0x0072:
            android.text.SpannableString r5 = r4.mo69923b()
            r7.append(r5)
            int r5 = r4.f40423l
            r8 = 2
            if (r5 == 0) goto L_0x009c
            if (r5 == r6) goto L_0x0099
            if (r5 == r8) goto L_0x0096
            r9 = 3
            if (r5 != r9) goto L_0x0086
            goto L_0x009c
        L_0x0086:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            int r2 = r4.f40423l
            r3 = 43
            java.lang.String r4 = "Unexpected justification value: "
            java.lang.String r2 = android.support.p013v4.media.C0072d.m200g(r3, r4, r2)
            r1.<init>(r2)
            throw r1
        L_0x0096:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x009e
        L_0x0099:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x009e
        L_0x009c:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x009e:
            r9 = r5
            boolean r5 = r4.f40417f
            if (r5 == 0) goto L_0x00ae
            int r5 = r4.f40419h
            float r5 = (float) r5
            r10 = 1120272384(0x42c60000, float:99.0)
            float r5 = r5 / r10
            int r11 = r4.f40418g
            float r11 = (float) r11
            float r11 = r11 / r10
            goto L_0x00bb
        L_0x00ae:
            int r5 = r4.f40419h
            float r5 = (float) r5
            r10 = 1129381888(0x43510000, float:209.0)
            float r5 = r5 / r10
            int r10 = r4.f40418g
            float r10 = (float) r10
            r11 = 1116995584(0x42940000, float:74.0)
            float r11 = r10 / r11
        L_0x00bb:
            r10 = 1063675494(0x3f666666, float:0.9)
            float r5 = r5 * r10
            r12 = 1028443341(0x3d4ccccd, float:0.05)
            float r13 = r5 + r12
            float r11 = r11 * r10
            float r10 = r11 + r12
            int r5 = r4.f40420i
            int r11 = r5 / 3
            if (r11 != 0) goto L_0x00cf
            r11 = r2
            goto L_0x00d4
        L_0x00cf:
            if (r11 != r6) goto L_0x00d3
            r11 = r6
            goto L_0x00d4
        L_0x00d3:
            r11 = r8
        L_0x00d4:
            int r5 = r5 % 3
            if (r5 != 0) goto L_0x00da
            r12 = r2
            goto L_0x00df
        L_0x00da:
            if (r5 != r6) goto L_0x00de
            r12 = r6
            goto L_0x00df
        L_0x00de:
            r12 = r8
        L_0x00df:
            int r14 = r4.f40426o
            int r5 = p645pi.C18379c.C18381b.f40409x
            if (r14 == r5) goto L_0x00e7
            r15 = r6
            goto L_0x00e8
        L_0x00e7:
            r15 = r2
        L_0x00e8:
            pi.c$a r16 = new pi.c$a
            int r4 = r4.f40416e
            r5 = r16
            r6 = r7
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r13
            r11 = r12
            r12 = r15
            r13 = r14
            r14 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r4 = r16
        L_0x00fc:
            if (r4 == 0) goto L_0x0101
            r1.add(r4)
        L_0x0101:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x0105:
            pi.b r3 = p645pi.C18379c.C18380a.f40399c
            java.util.Collections.sort(r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r1.size()
            r3.<init>(r4)
        L_0x0113:
            int r4 = r1.size()
            if (r2 >= r4) goto L_0x0127
            java.lang.Object r4 = r1.get(r2)
            pi.c$a r4 = (p645pi.C18379c.C18380a) r4
            oi.a r4 = r4.f40400a
            r3.add(r4)
            int r2 = r2 + 1
            goto L_0x0113
        L_0x0127:
            java.util.List r1 = java.util.Collections.unmodifiableList(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p645pi.C18379c.mo69920j():java.util.List");
    }

    /* renamed from: k */
    public final void mo69921k() {
        for (int i = 0; i < 8; i++) {
            this.f40393k[i].mo69924d();
        }
    }
}
