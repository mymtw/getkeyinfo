package p645pi;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import androidx.core.internal.view.SupportMenu;
import androidx.core.widget.NestedScrollView;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p513bj.C14049b0;
import p513bj.C14077r;
import p636oi.C18296a;
import p636oi.C18305h;

/* renamed from: pi.a */
public final class C18375a extends C18383d {

    /* renamed from: A */
    public static final int[] f40352A = {-1, -16711936, -16776961, -16711681, SupportMenu.CATEGORY_MASK, -256, -65281};

    /* renamed from: B */
    public static final int[] f40353B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, NestedScrollView.ANIMATED_SCROLL_GAP, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: C */
    public static final int[] f40354C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: D */
    public static final int[] f40355D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: E */
    public static final int[] f40356E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: F */
    public static final boolean[] f40357F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: y */
    public static final int[] f40358y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z */
    public static final int[] f40359z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: g */
    public final C14077r f40360g = new C14077r();

    /* renamed from: h */
    public final int f40361h;

    /* renamed from: i */
    public final int f40362i;

    /* renamed from: j */
    public final int f40363j;

    /* renamed from: k */
    public final long f40364k = 16000000;

    /* renamed from: l */
    public final ArrayList<C18376a> f40365l = new ArrayList<>();

    /* renamed from: m */
    public C18376a f40366m = new C18376a(0, 4);

    /* renamed from: n */
    public List<C18296a> f40367n;

    /* renamed from: o */
    public List<C18296a> f40368o;

    /* renamed from: p */
    public int f40369p;

    /* renamed from: q */
    public int f40370q;

    /* renamed from: r */
    public boolean f40371r;

    /* renamed from: s */
    public boolean f40372s;

    /* renamed from: t */
    public byte f40373t;

    /* renamed from: u */
    public byte f40374u;

    /* renamed from: v */
    public int f40375v = 0;

    /* renamed from: w */
    public boolean f40376w;

    /* renamed from: x */
    public long f40377x;

    /* renamed from: pi.a$a */
    public static final class C18376a {

        /* renamed from: a */
        public final ArrayList f40378a;

        /* renamed from: b */
        public final ArrayList f40379b;

        /* renamed from: c */
        public final StringBuilder f40380c;

        /* renamed from: d */
        public int f40381d = 15;

        /* renamed from: e */
        public int f40382e = 0;

        /* renamed from: f */
        public int f40383f = 0;

        /* renamed from: g */
        public int f40384g;

        /* renamed from: h */
        public int f40385h;

        /* renamed from: pi.a$a$a */
        public static class C18377a {

            /* renamed from: a */
            public final int f40386a;

            /* renamed from: b */
            public final boolean f40387b;

            /* renamed from: c */
            public int f40388c;

            public C18377a(int i, int i2, boolean z) {
                this.f40386a = i;
                this.f40387b = z;
                this.f40388c = i2;
            }
        }

        public C18376a(int i, int i2) {
            ArrayList arrayList = new ArrayList();
            this.f40378a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f40379b = arrayList2;
            StringBuilder sb = new StringBuilder();
            this.f40380c = sb;
            this.f40384g = i;
            arrayList.clear();
            arrayList2.clear();
            sb.setLength(0);
            this.f40385h = i2;
        }

        /* renamed from: a */
        public final void mo69913a(char c) {
            if (this.f40380c.length() < 32) {
                this.f40380c.append(c);
            }
        }

        /* renamed from: b */
        public final void mo69914b() {
            C18377a aVar;
            int i;
            int length = this.f40380c.length();
            if (length > 0) {
                this.f40380c.delete(length - 1, length);
                int size = this.f40378a.size();
                while (true) {
                    size--;
                    if (size >= 0 && (i = (aVar = (C18377a) this.f40378a.get(size)).f40388c) == length) {
                        aVar.f40388c = i - 1;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: c */
        public final C18296a mo69915c(int i) {
            float f;
            int i2 = this.f40382e + this.f40383f;
            int i3 = 32 - i2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.f40379b.size(); i4++) {
                CharSequence charSequence = (CharSequence) this.f40379b.get(i4);
                int i5 = C14049b0.f30913a;
                if (charSequence.length() > i3) {
                    charSequence = charSequence.subSequence(0, i3);
                }
                spannableStringBuilder.append(charSequence);
                spannableStringBuilder.append(10);
            }
            SpannableString d = mo69916d();
            int i6 = C14049b0.f30913a;
            int length = d.length();
            CharSequence charSequence2 = d;
            if (length > i3) {
                charSequence2 = d.subSequence(0, i3);
            }
            spannableStringBuilder.append(charSequence2);
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length2 = i3 - spannableStringBuilder.length();
            int i7 = i2 - length2;
            if (i == Integer.MIN_VALUE) {
                i = (this.f40384g != 2 || (Math.abs(i7) >= 3 && length2 >= 0)) ? (this.f40384g != 2 || i7 <= 0) ? 0 : 2 : 1;
            }
            if (i != 1) {
                if (i == 2) {
                    i2 = 32 - length2;
                }
                f = ((((float) i2) / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i8 = this.f40381d;
            if (i8 > 7) {
                i8 = (i8 - 15) - 2;
            } else if (this.f40384g == 1) {
                i8 -= this.f40385h - 1;
            }
            C18296a.C18297a aVar = new C18296a.C18297a();
            aVar.f40164a = spannableStringBuilder;
            aVar.f40166c = Layout.Alignment.ALIGN_NORMAL;
            aVar.f40168e = (float) i8;
            aVar.f40169f = 1;
            aVar.f40171h = f;
            aVar.f40172i = i;
            return aVar.mo69838a();
        }

        /* renamed from: d */
        public final SpannableString mo69916d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f40380c);
            int length = spannableStringBuilder.length();
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (i5 < this.f40378a.size()) {
                C18377a aVar = (C18377a) this.f40378a.get(i5);
                boolean z2 = aVar.f40387b;
                int i7 = aVar.f40386a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i4 = C18375a.f40352A[i7];
                    }
                    z = z3;
                }
                int i8 = aVar.f40388c;
                i5++;
                if (i8 != (i5 < this.f40378a.size() ? ((C18377a) this.f40378a.get(i5)).f40388c : length)) {
                    if (i != -1 && !z2) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i8, 33);
                        i = -1;
                    } else if (i == -1 && z2) {
                        i = i8;
                    }
                    if (i2 != -1 && !z) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i2, i8, 33);
                        i2 = -1;
                    } else if (i2 == -1 && z) {
                        i2 = i8;
                    }
                    if (i4 != i3) {
                        if (i3 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, i8, 33);
                        }
                        i6 = i8;
                        i3 = i4;
                    }
                }
            }
            if (!(i == -1 || i == length)) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
            }
            if (!(i2 == -1 || i2 == length)) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
            }
            if (!(i6 == length || i3 == -1)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: e */
        public final boolean mo69917e() {
            return this.f40378a.isEmpty() && this.f40379b.isEmpty() && this.f40380c.length() == 0;
        }
    }

    public C18375a(String str, int i) {
        this.f40361h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f40363j = 0;
            this.f40362i = 0;
        } else if (i == 2) {
            this.f40363j = 1;
            this.f40362i = 0;
        } else if (i == 3) {
            this.f40363j = 0;
            this.f40362i = 1;
        } else if (i != 4) {
            Log.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f40363j = 0;
            this.f40362i = 0;
        } else {
            this.f40363j = 1;
            this.f40362i = 1;
        }
        mo69912k(0);
        mo69911j();
        this.f40376w = true;
        this.f40377x = -9223372036854775807L;
    }

    /* renamed from: e */
    public final C18386e mo69906e() {
        List<C18296a> list = this.f40367n;
        this.f40368o = list;
        list.getClass();
        return new C18386e(list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:203:0x0015 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008e  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69907f(p645pi.C18383d.C18384a r14) {
        /*
            r13 = this;
            java.nio.ByteBuffer r14 = r14.f31493d
            r14.getClass()
            bj.r r0 = r13.f40360g
            byte[] r1 = r14.array()
            int r14 = r14.limit()
            r0.mo46933x(r14, r1)
            r14 = 0
            r0 = 1
            r1 = r14
        L_0x0015:
            bj.r r2 = r13.f40360g
            int r3 = r2.f30988c
            int r4 = r2.f30987b
            int r3 = r3 - r4
            int r4 = r13.f40361h
            r5 = 3
            if (r3 < r4) goto L_0x02c0
            r3 = 2
            if (r4 != r3) goto L_0x0026
            r2 = -4
            goto L_0x002b
        L_0x0026:
            int r2 = r2.mo46925p()
            byte r2 = (byte) r2
        L_0x002b:
            bj.r r4 = r13.f40360g
            int r4 = r4.mo46925p()
            bj.r r6 = r13.f40360g
            int r6 = r6.mo46925p()
            r7 = r2 & 2
            if (r7 == 0) goto L_0x003c
            goto L_0x0015
        L_0x003c:
            r7 = r2 & 1
            int r8 = r13.f40362i
            if (r7 == r8) goto L_0x0043
            goto L_0x0015
        L_0x0043:
            r7 = r4 & 127(0x7f, float:1.78E-43)
            byte r7 = (byte) r7
            r8 = r6 & 127(0x7f, float:1.78E-43)
            byte r8 = (byte) r8
            if (r7 != 0) goto L_0x004e
            if (r8 != 0) goto L_0x004e
            goto L_0x0015
        L_0x004e:
            boolean r9 = r13.f40371r
            r2 = r2 & 4
            r10 = 4
            if (r2 != r10) goto L_0x0061
            boolean[] r2 = f40357F
            boolean r4 = r2[r4]
            if (r4 == 0) goto L_0x0061
            boolean r2 = r2[r6]
            if (r2 == 0) goto L_0x0061
            r2 = r0
            goto L_0x0062
        L_0x0061:
            r2 = r14
        L_0x0062:
            r13.f40371r = r2
            r4 = 16
            if (r2 == 0) goto L_0x0088
            r6 = r7 & 240(0xf0, float:3.36E-43)
            if (r6 != r4) goto L_0x006e
            r6 = r0
            goto L_0x006f
        L_0x006e:
            r6 = r14
        L_0x006f:
            if (r6 == 0) goto L_0x0088
            boolean r6 = r13.f40372s
            if (r6 == 0) goto L_0x0081
            byte r6 = r13.f40373t
            if (r6 != r7) goto L_0x0081
            byte r6 = r13.f40374u
            if (r6 != r8) goto L_0x0081
            r13.f40372s = r14
            r6 = r0
            goto L_0x008b
        L_0x0081:
            r13.f40372s = r0
            r13.f40373t = r7
            r13.f40374u = r8
            goto L_0x008a
        L_0x0088:
            r13.f40372s = r14
        L_0x008a:
            r6 = r14
        L_0x008b:
            if (r6 == 0) goto L_0x008e
            goto L_0x0015
        L_0x008e:
            if (r2 != 0) goto L_0x0097
            if (r9 == 0) goto L_0x0015
            r13.mo69911j()
            goto L_0x02bd
        L_0x0097:
            if (r0 > r7) goto L_0x009f
            r2 = 15
            if (r7 > r2) goto L_0x009f
            r2 = r0
            goto L_0x00a0
        L_0x009f:
            r2 = r14
        L_0x00a0:
            r6 = 20
            r9 = 32
            if (r2 == 0) goto L_0x00a9
            r13.f40376w = r14
            goto L_0x00c4
        L_0x00a9:
            r2 = r7 & 247(0xf7, float:3.46E-43)
            if (r2 != r6) goto L_0x00af
            r2 = r0
            goto L_0x00b0
        L_0x00af:
            r2 = r14
        L_0x00b0:
            if (r2 == 0) goto L_0x00c4
            if (r8 == r9) goto L_0x00c2
            r2 = 47
            if (r8 == r2) goto L_0x00c2
            switch(r8) {
                case 37: goto L_0x00c2;
                case 38: goto L_0x00c2;
                case 39: goto L_0x00c2;
                default: goto L_0x00bb;
            }
        L_0x00bb:
            switch(r8) {
                case 41: goto L_0x00c2;
                case 42: goto L_0x00bf;
                case 43: goto L_0x00bf;
                default: goto L_0x00be;
            }
        L_0x00be:
            goto L_0x00c4
        L_0x00bf:
            r13.f40376w = r14
            goto L_0x00c4
        L_0x00c2:
            r13.f40376w = r0
        L_0x00c4:
            boolean r2 = r13.f40376w
            if (r2 != 0) goto L_0x00ca
            goto L_0x0015
        L_0x00ca:
            r2 = r7 & 224(0xe0, float:3.14E-43)
            if (r2 != 0) goto L_0x00d0
            r11 = r0
            goto L_0x00d1
        L_0x00d0:
            r11 = r14
        L_0x00d1:
            if (r11 == 0) goto L_0x00d8
            int r11 = r7 >> 3
            r11 = r11 & r0
            r13.f40375v = r11
        L_0x00d8:
            int r11 = r13.f40375v
            int r12 = r13.f40363j
            if (r11 != r12) goto L_0x00e0
            r11 = r0
            goto L_0x00e1
        L_0x00e0:
            r11 = r14
        L_0x00e1:
            if (r11 != 0) goto L_0x00e5
            goto L_0x0015
        L_0x00e5:
            if (r2 != 0) goto L_0x00e9
            r1 = r0
            goto L_0x00ea
        L_0x00e9:
            r1 = r14
        L_0x00ea:
            if (r1 == 0) goto L_0x029f
            r1 = r7 & 247(0xf7, float:3.46E-43)
            r2 = 17
            if (r1 != r2) goto L_0x00fa
            r11 = r8 & 240(0xf0, float:3.36E-43)
            r12 = 48
            if (r11 != r12) goto L_0x00fa
            r11 = r0
            goto L_0x00fb
        L_0x00fa:
            r11 = r14
        L_0x00fb:
            if (r11 == 0) goto L_0x010b
            pi.a$a r1 = r13.f40366m
            r2 = r8 & 15
            int[] r3 = f40354C
            r2 = r3[r2]
            char r2 = (char) r2
            r1.mo69913a(r2)
            goto L_0x02bd
        L_0x010b:
            r11 = r7 & 246(0xf6, float:3.45E-43)
            r12 = 18
            if (r11 != r12) goto L_0x0117
            r12 = r8 & 224(0xe0, float:3.14E-43)
            if (r12 != r9) goto L_0x0117
            r12 = r0
            goto L_0x0118
        L_0x0117:
            r12 = r14
        L_0x0118:
            if (r12 == 0) goto L_0x0138
            pi.a$a r1 = r13.f40366m
            r1.mo69914b()
            pi.a$a r1 = r13.f40366m
            r2 = r7 & 1
            if (r2 != 0) goto L_0x012c
            r2 = r8 & 31
            int[] r3 = f40355D
            r2 = r3[r2]
            goto L_0x0132
        L_0x012c:
            r2 = r8 & 31
            int[] r3 = f40356E
            r2 = r3[r2]
        L_0x0132:
            char r2 = (char) r2
            r1.mo69913a(r2)
            goto L_0x02bd
        L_0x0138:
            if (r1 != r2) goto L_0x0140
            r2 = r8 & 240(0xf0, float:3.36E-43)
            if (r2 != r9) goto L_0x0140
            r2 = r0
            goto L_0x0141
        L_0x0140:
            r2 = r14
        L_0x0141:
            if (r2 == 0) goto L_0x0167
            pi.a$a r1 = r13.f40366m
            r1.mo69913a(r9)
            r1 = r8 & 1
            if (r1 != r0) goto L_0x014e
            r1 = r0
            goto L_0x014f
        L_0x014e:
            r1 = r14
        L_0x014f:
            int r2 = r8 >> 1
            r2 = r2 & 7
            pi.a$a r3 = r13.f40366m
            java.util.ArrayList r4 = r3.f40378a
            pi.a$a$a r5 = new pi.a$a$a
            java.lang.StringBuilder r3 = r3.f40380c
            int r3 = r3.length()
            r5.<init>(r2, r3, r1)
            r4.add(r5)
            goto L_0x02bd
        L_0x0167:
            r2 = r7 & 240(0xf0, float:3.36E-43)
            if (r2 != r4) goto L_0x0173
            r2 = r8 & 192(0xc0, float:2.69E-43)
            r12 = 64
            if (r2 != r12) goto L_0x0173
            r2 = r0
            goto L_0x0174
        L_0x0173:
            r2 = r14
        L_0x0174:
            if (r2 == 0) goto L_0x01e1
            int[] r1 = f40358y
            r2 = r7 & 7
            r1 = r1[r2]
            r2 = r8 & 32
            if (r2 == 0) goto L_0x0182
            r2 = r0
            goto L_0x0183
        L_0x0182:
            r2 = r14
        L_0x0183:
            if (r2 == 0) goto L_0x0187
            int r1 = r1 + 1
        L_0x0187:
            pi.a$a r2 = r13.f40366m
            int r3 = r2.f40381d
            if (r1 == r3) goto L_0x01ab
            int r3 = r13.f40369p
            if (r3 == r0) goto L_0x01a7
            boolean r2 = r2.mo69917e()
            if (r2 != 0) goto L_0x01a7
            pi.a$a r2 = new pi.a$a
            int r3 = r13.f40369p
            int r5 = r13.f40370q
            r2.<init>(r3, r5)
            r13.f40366m = r2
            java.util.ArrayList<pi.a$a> r3 = r13.f40365l
            r3.add(r2)
        L_0x01a7:
            pi.a$a r2 = r13.f40366m
            r2.f40381d = r1
        L_0x01ab:
            r1 = r8 & 16
            if (r1 != r4) goto L_0x01b1
            r1 = r0
            goto L_0x01b2
        L_0x01b1:
            r1 = r14
        L_0x01b2:
            r2 = r8 & 1
            if (r2 != r0) goto L_0x01b8
            r2 = r0
            goto L_0x01b9
        L_0x01b8:
            r2 = r14
        L_0x01b9:
            int r3 = r8 >> 1
            r3 = r3 & 7
            pi.a$a r4 = r13.f40366m
            if (r1 == 0) goto L_0x01c4
            r5 = 8
            goto L_0x01c5
        L_0x01c4:
            r5 = r3
        L_0x01c5:
            java.util.ArrayList r6 = r4.f40378a
            pi.a$a$a r7 = new pi.a$a$a
            java.lang.StringBuilder r4 = r4.f40380c
            int r4 = r4.length()
            r7.<init>(r5, r4, r2)
            r6.add(r7)
            if (r1 == 0) goto L_0x02bd
            pi.a$a r1 = r13.f40366m
            int[] r2 = f40359z
            r2 = r2[r3]
            r1.f40382e = r2
            goto L_0x02bd
        L_0x01e1:
            r2 = 23
            r4 = 33
            if (r1 != r2) goto L_0x01ef
            if (r8 < r4) goto L_0x01ef
            r1 = 35
            if (r8 > r1) goto L_0x01ef
            r1 = r0
            goto L_0x01f0
        L_0x01ef:
            r1 = r14
        L_0x01f0:
            if (r1 == 0) goto L_0x01fa
            pi.a$a r1 = r13.f40366m
            int r8 = r8 + -32
            r1.f40383f = r8
            goto L_0x02bd
        L_0x01fa:
            if (r11 != r6) goto L_0x0202
            r1 = r8 & 240(0xf0, float:3.36E-43)
            if (r1 != r9) goto L_0x0202
            r1 = r0
            goto L_0x0203
        L_0x0202:
            r1 = r14
        L_0x0203:
            if (r1 == 0) goto L_0x02bd
            if (r8 == r9) goto L_0x029b
            r1 = 41
            if (r8 == r1) goto L_0x0297
            switch(r8) {
                case 37: goto L_0x022a;
                case 38: goto L_0x021f;
                case 39: goto L_0x0214;
                default: goto L_0x020e;
            }
        L_0x020e:
            int r1 = r13.f40369p
            if (r1 != 0) goto L_0x0235
            goto L_0x02bd
        L_0x0214:
            r13.mo69912k(r0)
            r13.f40370q = r10
            pi.a$a r1 = r13.f40366m
            r1.f40385h = r10
            goto L_0x02bd
        L_0x021f:
            r13.mo69912k(r0)
            r13.f40370q = r5
            pi.a$a r1 = r13.f40366m
            r1.f40385h = r5
            goto L_0x02bd
        L_0x022a:
            r13.mo69912k(r0)
            r13.f40370q = r3
            pi.a$a r1 = r13.f40366m
            r1.f40385h = r3
            goto L_0x02bd
        L_0x0235:
            if (r8 == r4) goto L_0x0291
            switch(r8) {
                case 44: goto L_0x0281;
                case 45: goto L_0x024c;
                case 46: goto L_0x0247;
                case 47: goto L_0x023c;
                default: goto L_0x023a;
            }
        L_0x023a:
            goto L_0x02bd
        L_0x023c:
            java.util.List r1 = r13.mo69910i()
            r13.f40367n = r1
            r13.mo69911j()
            goto L_0x02bd
        L_0x0247:
            r13.mo69911j()
            goto L_0x02bd
        L_0x024c:
            if (r1 != r0) goto L_0x02bd
            pi.a$a r1 = r13.f40366m
            boolean r1 = r1.mo69917e()
            if (r1 != 0) goto L_0x02bd
            pi.a$a r1 = r13.f40366m
            java.util.ArrayList r2 = r1.f40379b
            android.text.SpannableString r3 = r1.mo69916d()
            r2.add(r3)
            java.lang.StringBuilder r2 = r1.f40380c
            r2.setLength(r14)
            java.util.ArrayList r2 = r1.f40378a
            r2.clear()
            int r2 = r1.f40385h
            int r3 = r1.f40381d
            int r2 = java.lang.Math.min(r2, r3)
        L_0x0273:
            java.util.ArrayList r3 = r1.f40379b
            int r3 = r3.size()
            if (r3 < r2) goto L_0x02bd
            java.util.ArrayList r3 = r1.f40379b
            r3.remove(r14)
            goto L_0x0273
        L_0x0281:
            java.util.List r1 = java.util.Collections.emptyList()
            r13.f40367n = r1
            int r1 = r13.f40369p
            if (r1 == r0) goto L_0x028d
            if (r1 != r5) goto L_0x02bd
        L_0x028d:
            r13.mo69911j()
            goto L_0x02bd
        L_0x0291:
            pi.a$a r1 = r13.f40366m
            r1.mo69914b()
            goto L_0x02bd
        L_0x0297:
            r13.mo69912k(r5)
            goto L_0x02bd
        L_0x029b:
            r13.mo69912k(r3)
            goto L_0x02bd
        L_0x029f:
            pi.a$a r1 = r13.f40366m
            r2 = r7 & 127(0x7f, float:1.78E-43)
            int r2 = r2 + -32
            int[] r3 = f40353B
            r2 = r3[r2]
            char r2 = (char) r2
            r1.mo69913a(r2)
            r1 = r8 & 224(0xe0, float:3.14E-43)
            if (r1 == 0) goto L_0x02bd
            pi.a$a r1 = r13.f40366m
            r2 = r8 & 127(0x7f, float:1.78E-43)
            int r2 = r2 + -32
            r2 = r3[r2]
            char r2 = (char) r2
            r1.mo69913a(r2)
        L_0x02bd:
            r1 = r0
            goto L_0x0015
        L_0x02c0:
            if (r1 == 0) goto L_0x02d2
            int r14 = r13.f40369p
            if (r14 == r0) goto L_0x02c8
            if (r14 != r5) goto L_0x02d2
        L_0x02c8:
            java.util.List r14 = r13.mo69910i()
            r13.f40367n = r14
            long r0 = r13.f40442e
            r13.f40377x = r0
        L_0x02d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p645pi.C18375a.mo69907f(pi.d$a):void");
    }

    public final void flush() {
        super.flush();
        this.f40367n = null;
        this.f40368o = null;
        mo69912k(0);
        this.f40370q = 4;
        this.f40366m.f40385h = 4;
        mo69911j();
        this.f40371r = false;
        this.f40372s = false;
        this.f40373t = 0;
        this.f40374u = 0;
        this.f40375v = 0;
        this.f40376w = true;
        this.f40377x = -9223372036854775807L;
    }

    /* renamed from: g */
    public final C18305h mo69763b() throws SubtitleDecoderException {
        C18305h pollFirst;
        C18305h g = super.mo69763b();
        if (g != null) {
            return g;
        }
        long j = this.f40364k;
        boolean z = false;
        if (j != -9223372036854775807L) {
            long j2 = this.f40377x;
            if (j2 != -9223372036854775807L && this.f40442e - j2 >= j) {
                z = true;
            }
        }
        if (!z || (pollFirst = this.f40439b.pollFirst()) == null) {
            return null;
        }
        this.f40367n = Collections.emptyList();
        this.f40377x = -9223372036854775807L;
        C18305h hVar = pollFirst;
        hVar.mo69845k(this.f40442e, mo69906e(), Long.MAX_VALUE);
        return pollFirst;
    }

    /* renamed from: h */
    public final boolean mo69909h() {
        return this.f40367n != this.f40368o;
    }

    /* renamed from: i */
    public final List<C18296a> mo69910i() {
        int size = this.f40365l.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            C18296a c = this.f40365l.get(i2).mo69915c(Integer.MIN_VALUE);
            arrayList.add(c);
            if (c != null) {
                i = Math.min(i, c.f40155i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            C18296a aVar = (C18296a) arrayList.get(i3);
            if (aVar != null) {
                if (aVar.f40155i != i) {
                    aVar = this.f40365l.get(i3).mo69915c(i);
                    aVar.getClass();
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    /* renamed from: j */
    public final void mo69911j() {
        C18376a aVar = this.f40366m;
        aVar.f40384g = this.f40369p;
        aVar.f40378a.clear();
        aVar.f40379b.clear();
        aVar.f40380c.setLength(0);
        aVar.f40381d = 15;
        aVar.f40382e = 0;
        aVar.f40383f = 0;
        this.f40365l.clear();
        this.f40365l.add(this.f40366m);
    }

    /* renamed from: k */
    public final void mo69912k(int i) {
        int i2 = this.f40369p;
        if (i2 != i) {
            this.f40369p = i;
            if (i == 3) {
                for (int i3 = 0; i3 < this.f40365l.size(); i3++) {
                    this.f40365l.get(i3).f40384g = i;
                }
                return;
            }
            mo69911j();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f40367n = Collections.emptyList();
            }
        }
    }

    public final void release() {
    }
}
