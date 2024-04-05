package androidx.compose.p015ui.text.platform;

import androidx.compose.p015ui.text.C1913a;
import androidx.compose.p015ui.text.C1977g;
import androidx.compose.p015ui.text.C2008j;
import androidx.compose.p015ui.text.C2012n;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.android.C1920c;
import androidx.compose.p015ui.text.font.C1952g;
import java.util.ArrayList;
import java.util.List;
import p174m0.C7282b;

/* renamed from: androidx.compose.ui.text.platform.a */
public final class C2016a implements C1977g {

    /* renamed from: a */
    public final C2023s f4573a;

    /* renamed from: b */
    public final List<C1913a.C1916b<C2012n>> f4574b;

    /* renamed from: c */
    public final List<C1913a.C1916b<C2008j>> f4575c;

    /* renamed from: d */
    public final C1952g.C1953a f4576d;

    /* renamed from: e */
    public final C7282b f4577e;

    /* renamed from: f */
    public final AndroidTextPaint f4578f;

    /* renamed from: g */
    public final CharSequence f4579g;

    /* renamed from: h */
    public final C1920c f4580h;

    /* renamed from: i */
    public final ArrayList f4581i = new ArrayList();

    /* renamed from: j */
    public final int f4582j;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009c, code lost:
        if (r8 == 1) goto L_0x009f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2016a(androidx.compose.p015ui.text.C2023s r37, androidx.compose.p015ui.text.font.C1952g.C1953a r38, p174m0.C7282b r39, java.lang.String r40, java.util.List r41, java.util.List r42) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r2 = r38
            r3 = r39
            r4 = r40
            r5 = r41
            r6 = r42
            java.lang.String r7 = "text"
            kotlin.jvm.internal.C19383o.m32797g(r4, r7)
            java.lang.String r7 = "style"
            kotlin.jvm.internal.C19383o.m32797g(r1, r7)
            java.lang.String r8 = "fontFamilyResolver"
            kotlin.jvm.internal.C19383o.m32797g(r2, r8)
            java.lang.String r8 = "density"
            kotlin.jvm.internal.C19383o.m32797g(r3, r8)
            r36.<init>()
            r0.f4573a = r1
            r0.f4574b = r5
            r0.f4575c = r6
            r0.f4576d = r2
            r0.f4577e = r3
            androidx.compose.ui.text.platform.AndroidTextPaint r2 = new androidx.compose.ui.text.platform.AndroidTextPaint
            float r8 = r39.getDensity()
            r9 = 1
            r2.<init>(r9, r8)
            r0.f4578f = r2
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r0.f4581i = r8
            androidx.compose.ui.text.h r8 = r1.f4600b
            androidx.compose.ui.text.style.f r8 = r8.f4440b
            androidx.compose.ui.text.n r10 = r1.f4599a
            k0.c r10 = r10.f4546k
            r11 = 3
            if (r8 == 0) goto L_0x0050
            int r8 = r8.f4616a
            goto L_0x0051
        L_0x0050:
            r8 = r11
        L_0x0051:
            r12 = 4
            r13 = 0
            if (r8 != r12) goto L_0x0057
            r12 = r9
            goto L_0x0058
        L_0x0057:
            r12 = r13
        L_0x0058:
            r14 = 2
            if (r12 == 0) goto L_0x005c
            goto L_0x009e
        L_0x005c:
            r12 = 5
            if (r8 != r12) goto L_0x0061
            r12 = r9
            goto L_0x0062
        L_0x0061:
            r12 = r13
        L_0x0062:
            if (r12 == 0) goto L_0x0065
            goto L_0x009f
        L_0x0065:
            if (r8 != r9) goto L_0x0069
            r12 = r9
            goto L_0x006a
        L_0x0069:
            r12 = r13
        L_0x006a:
            if (r12 == 0) goto L_0x006e
            r11 = r13
            goto L_0x009f
        L_0x006e:
            if (r8 != r14) goto L_0x0072
            r12 = r9
            goto L_0x0073
        L_0x0072:
            r12 = r13
        L_0x0073:
            if (r12 == 0) goto L_0x0077
            r11 = r9
            goto L_0x009f
        L_0x0077:
            if (r8 != r11) goto L_0x007b
            r8 = r9
            goto L_0x007c
        L_0x007b:
            r8 = r13
        L_0x007c:
            if (r8 == 0) goto L_0x03a3
            if (r10 == 0) goto L_0x0090
            java.util.List<k0.b> r8 = r10.f15951b
            java.lang.Object r8 = r8.get(r13)
            k0.b r8 = (p157k0.C7174b) r8
            k0.d r8 = r8.f15950a
            k0.a r8 = (p157k0.C7173a) r8
            java.util.Locale r8 = r8.f15949a
            if (r8 != 0) goto L_0x0094
        L_0x0090:
            java.util.Locale r8 = java.util.Locale.getDefault()
        L_0x0094:
            int r10 = p032c1.C4361d.f9600a
            int r8 = android.text.TextUtils.getLayoutDirectionFromLocale(r8)
            if (r8 == 0) goto L_0x009e
            if (r8 == r9) goto L_0x009f
        L_0x009e:
            r11 = r14
        L_0x009f:
            r0.f4582j = r11
            androidx.compose.ui.text.platform.AndroidParagraphIntrinsics$resolveTypeface$1 r8 = new androidx.compose.ui.text.platform.AndroidParagraphIntrinsics$resolveTypeface$1
            r8.<init>(r0)
            androidx.compose.ui.text.n r10 = r1.f4599a
            kotlin.jvm.internal.C19383o.m32797g(r10, r7)
            long r14 = r10.f4537b
            long r14 = p174m0.C7292j.m13998b(r14)
            r7 = r10
            r9 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r12 = p174m0.C7293k.m14001a(r14, r9)
            r9 = 8589934592(0x200000000, double:4.243991582E-314)
            if (r12 == 0) goto L_0x00cc
            long r14 = r7.f4537b
            float r12 = r3.mo3793b0(r14)
            r2.setTextSize(r12)
            goto L_0x00e0
        L_0x00cc:
            boolean r12 = p174m0.C7293k.m14001a(r14, r9)
            if (r12 == 0) goto L_0x00e0
            float r12 = r2.getTextSize()
            long r14 = r7.f4537b
            float r14 = p174m0.C7292j.m13999c(r14)
            float r14 = r14 * r12
            r2.setTextSize(r14)
        L_0x00e0:
            boolean r12 = androidx.compose.p015ui.text.input.C1993m.m4354O(r7)
            if (r12 == 0) goto L_0x0111
            androidx.compose.ui.text.font.g r12 = r7.f4541f
            androidx.compose.ui.text.font.m r14 = r7.f4538c
            if (r14 != 0) goto L_0x00ee
            androidx.compose.ui.text.font.m r14 = androidx.compose.p015ui.text.font.C1959m.f4413g
        L_0x00ee:
            androidx.compose.ui.text.font.k r15 = r7.f4539d
            if (r15 == 0) goto L_0x00f5
            int r15 = r15.f4407a
            goto L_0x00f6
        L_0x00f5:
            r15 = r13
        L_0x00f6:
            androidx.compose.ui.text.font.k r13 = new androidx.compose.ui.text.font.k
            r13.<init>(r15)
            androidx.compose.ui.text.font.l r15 = r7.f4540e
            if (r15 == 0) goto L_0x0102
            int r15 = r15.f4408a
            goto L_0x0103
        L_0x0102:
            r15 = 1
        L_0x0103:
            androidx.compose.ui.text.font.l r9 = new androidx.compose.ui.text.font.l
            r9.<init>(r15)
            java.lang.Object r9 = r8.invoke(r12, r14, r13, r9)
            android.graphics.Typeface r9 = (android.graphics.Typeface) r9
            r2.setTypeface(r9)
        L_0x0111:
            k0.c r9 = r7.f4546k
            if (r9 == 0) goto L_0x0126
            k0.c r10 = p157k0.C7175c.C7176a.m13834a()
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r9, r10)
            if (r9 != 0) goto L_0x0126
            androidx.compose.ui.text.platform.extensions.a r9 = androidx.compose.p015ui.text.platform.extensions.C2018a.f4585a
            k0.c r10 = r7.f4546k
            r9.mo7730b(r2, r10)
        L_0x0126:
            long r9 = r7.f4543h
            long r9 = p174m0.C7292j.m13998b(r9)
            r12 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r9 = p174m0.C7293k.m14001a(r9, r12)
            if (r9 == 0) goto L_0x0140
            long r9 = r7.f4543h
            float r9 = p174m0.C7292j.m13999c(r9)
            r2.setLetterSpacing(r9)
        L_0x0140:
            java.lang.String r9 = r7.f4542g
            if (r9 == 0) goto L_0x0151
            java.lang.String r10 = ""
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r9, r10)
            if (r9 != 0) goto L_0x0151
            java.lang.String r9 = r7.f4542g
            r2.setFontFeatureSettings(r9)
        L_0x0151:
            androidx.compose.ui.text.style.g r9 = r7.f4545j
            if (r9 == 0) goto L_0x0175
            androidx.compose.ui.text.style.g r10 = androidx.compose.p015ui.text.style.C2032g.f4617c
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r9, r10)
            if (r9 != 0) goto L_0x0175
            float r9 = r2.getTextScaleX()
            androidx.compose.ui.text.style.g r10 = r7.f4545j
            float r10 = r10.f4618a
            float r9 = r9 * r10
            r2.setTextScaleX(r9)
            float r9 = r2.getTextSkewX()
            androidx.compose.ui.text.style.g r10 = r7.f4545j
            float r10 = r10.f4619b
            float r9 = r9 + r10
            r2.setTextSkewX(r9)
        L_0x0175:
            long r9 = r7.mo7712a()
            r2.m34825setColor8_81llA(r9)
            androidx.compose.ui.text.style.TextDrawStyle r9 = r7.f4536a
            r9.mo7766d()
            long r9 = p288y.C8347f.f18314c
            r12 = 0
            r2.m34824setBrushd16Qtg0(r12, r9)
            androidx.compose.ui.graphics.j0 r9 = r7.f4549n
            r2.setShadow(r9)
            androidx.compose.ui.text.style.e r9 = r7.f4548m
            r2.setTextDecoration(r9)
            long r9 = r7.f4543h
            long r9 = p174m0.C7292j.m13998b(r9)
            r13 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r9 = p174m0.C7293k.m14001a(r9, r13)
            r10 = 0
            if (r9 == 0) goto L_0x01b5
            long r13 = r7.f4543h
            float r9 = p174m0.C7292j.m13999c(r13)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x01af
            r9 = 1
            goto L_0x01b0
        L_0x01af:
            r9 = 0
        L_0x01b0:
            if (r9 != 0) goto L_0x01b5
            long r13 = r7.f4543h
            goto L_0x01b7
        L_0x01b5:
            long r13 = p174m0.C7292j.f16173c
        L_0x01b7:
            r26 = r13
            long r13 = r7.f4547l
            r9 = r11
            long r10 = androidx.compose.p015ui.graphics.C1545s.f3363h
            boolean r10 = androidx.compose.p015ui.graphics.C1545s.m3357c(r13, r10)
            if (r10 == 0) goto L_0x01c7
            long r10 = androidx.compose.p015ui.graphics.C1545s.f3364i
            goto L_0x01c9
        L_0x01c7:
            long r10 = r7.f4547l
        L_0x01c9:
            r31 = r10
            androidx.compose.ui.text.style.a r10 = r7.f4544i
            if (r10 != 0) goto L_0x01d2
            r10 = 0
            r11 = 0
            goto L_0x01e1
        L_0x01d2:
            float r10 = r10.f4603a
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            r11 = 0
            java.lang.Float r13 = java.lang.Float.valueOf(r11)
            boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r10, r13)
        L_0x01e1:
            if (r10 == 0) goto L_0x01e4
            goto L_0x01e6
        L_0x01e4:
            androidx.compose.ui.text.style.a r12 = r7.f4544i
        L_0x01e6:
            r28 = r12
            androidx.compose.ui.text.n r7 = new androidx.compose.ui.text.n
            r16 = r7
            r17 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r29 = 0
            r30 = 0
            r33 = 0
            r34 = 0
            r35 = 13951(0x367f, float:1.955E-41)
            r16.<init>((long) r17, (long) r19, (androidx.compose.p015ui.text.font.C1959m) r21, (androidx.compose.p015ui.text.font.C1957k) r22, (androidx.compose.p015ui.text.font.C1958l) r23, (androidx.compose.p015ui.text.font.C1952g) r24, (java.lang.String) r25, (long) r26, (androidx.compose.p015ui.text.style.C2025a) r28, (androidx.compose.p015ui.text.style.C2032g) r29, (p157k0.C7175c) r30, (long) r31, (androidx.compose.p015ui.text.style.C2030e) r33, (androidx.compose.p015ui.graphics.C1528j0) r34, (int) r35)
            float r10 = r2.getTextSize()
            androidx.compose.ui.text.a$b r12 = new androidx.compose.ui.text.a$b
            int r13 = r40.length()
            r14 = 0
            r12.<init>(r7, r14, r13)
            java.util.List r7 = p568fn.C17782b.m29864d0(r12)
            java.util.ArrayList r5 = kotlin.collections.C19327t.m32650f1(r5, r7)
            boolean r7 = r5.isEmpty()
            if (r7 == 0) goto L_0x0241
            boolean r7 = r42.isEmpty()
            if (r7 == 0) goto L_0x0241
            androidx.compose.ui.text.h r7 = r1.f4600b
            androidx.compose.ui.text.style.h r7 = r7.f4442d
            androidx.compose.ui.text.style.h r12 = androidx.compose.p015ui.text.style.C2033h.f4620c
            boolean r7 = kotlin.jvm.internal.C19383o.m32792b(r7, r12)
            if (r7 == 0) goto L_0x0241
            androidx.compose.ui.text.h r7 = r1.f4600b
            long r12 = r7.f4441c
            boolean r7 = androidx.activity.C0114h.m307l0(r12)
            if (r7 == 0) goto L_0x0241
            goto L_0x0369
        L_0x0241:
            android.text.SpannableString r7 = new android.text.SpannableString
            r7.<init>(r4)
            androidx.compose.ui.text.m r4 = r1.f4601c
            if (r4 == 0) goto L_0x0251
            androidx.compose.ui.text.k r4 = r4.f4535b
            if (r4 == 0) goto L_0x0251
            boolean r4 = r4.f4532a
            goto L_0x0252
        L_0x0251:
            r4 = 1
        L_0x0252:
            if (r4 == 0) goto L_0x0274
            androidx.compose.ui.text.h r4 = r1.f4600b
            androidx.compose.ui.text.style.c r12 = r4.f4444f
            if (r12 != 0) goto L_0x0274
            long r12 = r4.f4441c
            float r4 = androidx.compose.p015ui.text.platform.extensions.C2020c.m4442a(r12, r10, r3)
            boolean r12 = java.lang.Float.isNaN(r4)
            if (r12 != 0) goto L_0x02bb
            androidx.compose.ui.text.android.style.LineHeightSpan r12 = new androidx.compose.ui.text.android.style.LineHeightSpan
            r12.<init>(r4)
            int r4 = r7.length()
            r13 = 0
            androidx.compose.p015ui.text.platform.extensions.C2020c.m4446e(r7, r12, r13, r4)
            goto L_0x02bc
        L_0x0274:
            androidx.compose.ui.text.h r4 = r1.f4600b
            androidx.compose.ui.text.style.c r12 = r4.f4444f
            if (r12 != 0) goto L_0x027c
            androidx.compose.ui.text.style.c r12 = androidx.compose.p015ui.text.style.C2027c.f4605c
        L_0x027c:
            long r13 = r4.f4441c
            java.lang.String r4 = "lineHeightStyle"
            kotlin.jvm.internal.C19383o.m32797g(r12, r4)
            float r17 = androidx.compose.p015ui.text.platform.extensions.C2020c.m4442a(r13, r10, r3)
            boolean r4 = java.lang.Float.isNaN(r17)
            if (r4 != 0) goto L_0x02bb
            androidx.compose.ui.text.android.style.LineHeightStyleSpan r4 = new androidx.compose.ui.text.android.style.LineHeightStyleSpan
            r18 = 0
            int r19 = r7.length()
            int r13 = r12.f4607b
            r14 = r13 & 1
            if (r14 <= 0) goto L_0x029e
            r20 = 1
            goto L_0x02a0
        L_0x029e:
            r20 = 0
        L_0x02a0:
            r13 = r13 & 16
            if (r13 <= 0) goto L_0x02a7
            r21 = 1
            goto L_0x02a9
        L_0x02a7:
            r21 = 0
        L_0x02a9:
            int r12 = r12.f4606a
            r16 = r4
            r22 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22)
            int r12 = r7.length()
            r13 = 0
            androidx.compose.p015ui.text.platform.extensions.C2020c.m4446e(r7, r4, r13, r12)
            goto L_0x02bc
        L_0x02bb:
            r13 = 0
        L_0x02bc:
            androidx.compose.ui.text.h r4 = r1.f4600b
            androidx.compose.ui.text.style.h r4 = r4.f4442d
            if (r4 == 0) goto L_0x035f
            long r14 = r4.f4621a
            long r11 = androidx.activity.C0114h.m302g0(r13)
            boolean r11 = p174m0.C7292j.m13997a(r14, r11)
            if (r11 == 0) goto L_0x02da
            long r11 = r4.f4622b
            long r14 = androidx.activity.C0114h.m302g0(r13)
            boolean r11 = p174m0.C7292j.m13997a(r11, r14)
            if (r11 != 0) goto L_0x035f
        L_0x02da:
            long r11 = r4.f4621a
            boolean r11 = androidx.activity.C0114h.m307l0(r11)
            if (r11 != 0) goto L_0x035f
            long r11 = r4.f4622b
            boolean r11 = androidx.activity.C0114h.m307l0(r11)
            if (r11 == 0) goto L_0x02ec
            goto L_0x035f
        L_0x02ec:
            long r11 = r4.f4621a
            long r11 = p174m0.C7292j.m13998b(r11)
            r13 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r15 = p174m0.C7293k.m14001a(r11, r13)
            if (r15 == 0) goto L_0x0304
            long r11 = r4.f4621a
            float r11 = r3.mo3793b0(r11)
            goto L_0x0318
        L_0x0304:
            r13 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r11 = p174m0.C7293k.m14001a(r11, r13)
            if (r11 == 0) goto L_0x0317
            long r11 = r4.f4621a
            float r11 = p174m0.C7292j.m13999c(r11)
            float r11 = r11 * r10
            goto L_0x0318
        L_0x0317:
            r11 = 0
        L_0x0318:
            long r12 = r4.f4622b
            long r12 = p174m0.C7292j.m13998b(r12)
            r14 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r14 = p174m0.C7293k.m14001a(r12, r14)
            if (r14 == 0) goto L_0x0330
            long r12 = r4.f4622b
            float r10 = r3.mo3793b0(r12)
            goto L_0x0344
        L_0x0330:
            r14 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r12 = p174m0.C7293k.m14001a(r12, r14)
            if (r12 == 0) goto L_0x0343
            long r12 = r4.f4622b
            float r4 = p174m0.C7292j.m13999c(r12)
            float r10 = r10 * r4
            goto L_0x0344
        L_0x0343:
            r10 = 0
        L_0x0344:
            android.text.style.LeadingMarginSpan$Standard r4 = new android.text.style.LeadingMarginSpan$Standard
            double r11 = (double) r11
            double r11 = java.lang.Math.ceil(r11)
            float r11 = (float) r11
            int r11 = (int) r11
            double r12 = (double) r10
            double r12 = java.lang.Math.ceil(r12)
            float r10 = (float) r12
            int r10 = (int) r10
            r4.<init>(r11, r10)
            int r10 = r7.length()
            r11 = 0
            androidx.compose.p015ui.text.platform.extensions.C2020c.m4446e(r7, r4, r11, r10)
        L_0x035f:
            androidx.compose.p015ui.text.platform.extensions.C2020c.m4447f(r7, r1, r5, r3, r8)
            int r1 = r42.size()
            if (r1 > 0) goto L_0x0373
            r4 = r7
        L_0x0369:
            r0.f4579g = r4
            androidx.compose.ui.text.android.c r1 = new androidx.compose.ui.text.android.c
            r1.<init>(r9, r4, r2)
            r0.f4580h = r1
            return
        L_0x0373:
            r1 = 0
            java.lang.Object r1 = r6.get(r1)
            androidx.compose.ui.text.a$b r1 = (androidx.compose.p015ui.text.C1913a.C1916b) r1
            T r1 = r1.f4308a
            androidx.compose.ui.text.j r1 = (androidx.compose.p015ui.text.C2008j) r1
            androidx.compose.ui.text.android.style.PlaceholderSpan r2 = new androidx.compose.ui.text.android.style.PlaceholderSpan
            r1.getClass()
            r1 = 0
            p174m0.C7292j.m13999c(r1)
            androidx.activity.C0114h.m303h0()
            p174m0.C7292j.m13999c(r1)
            androidx.activity.C0114h.m303h0()
            r39.mo3800w0()
            r39.getDensity()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid PlaceholderVerticalAlign"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x03a3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid TextDirection."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.platform.C2016a.<init>(androidx.compose.ui.text.s, androidx.compose.ui.text.font.g$a, m0.b, java.lang.String, java.util.List, java.util.List):void");
    }

    /* renamed from: a */
    public final boolean mo7363a() {
        ArrayList arrayList = this.f4581i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2017b bVar = (C2017b) arrayList.get(i);
            if (bVar.f4583a.getValue() != bVar.f4584b) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final float mo7364b() {
        return ((Number) this.f4580h.f4326c.getValue()).floatValue();
    }

    /* renamed from: c */
    public final float mo7365c() {
        return ((Number) this.f4580h.f4325b.getValue()).floatValue();
    }
}
