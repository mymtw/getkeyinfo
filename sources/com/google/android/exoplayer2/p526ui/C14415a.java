package com.google.android.exoplayer2.p526ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.exoplayer2.p526ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p636oi.C18296a;
import p726zi.C18906a;
import p726zi.C18927m;

/* renamed from: com.google.android.exoplayer2.ui.a */
public final class C14415a extends View implements SubtitleView.C14411a {

    /* renamed from: b */
    public final ArrayList f32448b = new ArrayList();

    /* renamed from: c */
    public List<C18296a> f32449c = Collections.emptyList();

    /* renamed from: d */
    public int f32450d = 0;

    /* renamed from: e */
    public float f32451e = 0.0533f;

    /* renamed from: f */
    public C18906a f32452f = C18906a.f42117g;

    /* renamed from: g */
    public float f32453g = 0.08f;

    public C14415a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo48149a(List<C18296a> list, C18906a aVar, float f, int i, float f2) {
        this.f32449c = list;
        this.f32452f = aVar;
        this.f32451e = f;
        this.f32450d = i;
        this.f32453g = f2;
        while (this.f32448b.size() < list.size()) {
            this.f32448b.add(new C18927m(getContext()));
        }
        invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:171:0x044c, code lost:
        if (r2 < r8) goto L_0x045b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0507  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0509  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispatchDraw(android.graphics.Canvas r45) {
        /*
            r44 = this;
            r0 = r44
            java.util.List<oi.a> r1 = r0.f32449c
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x000b
            return
        L_0x000b:
            int r2 = r44.getHeight()
            int r3 = r44.getPaddingLeft()
            int r4 = r44.getPaddingTop()
            int r5 = r44.getWidth()
            int r6 = r44.getPaddingRight()
            int r5 = r5 - r6
            int r6 = r44.getPaddingBottom()
            int r6 = r2 - r6
            if (r6 <= r4) goto L_0x053c
            if (r5 > r3) goto L_0x002c
            goto L_0x053c
        L_0x002c:
            int r7 = r6 - r4
            int r8 = r0.f32450d
            float r9 = r0.f32451e
            float r8 = p726zi.C18928n.m32024b(r8, r9, r2, r7)
            r9 = 0
            int r10 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r10 > 0) goto L_0x003c
            return
        L_0x003c:
            int r10 = r1.size()
            r13 = r45
            r12 = 0
        L_0x0043:
            if (r12 >= r10) goto L_0x053c
            java.lang.Object r14 = r1.get(r12)
            oi.a r14 = (p636oi.C18296a) r14
            int r15 = r14.f40162p
            r16 = 1065353216(0x3f800000, float:1.0)
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 == r11) goto L_0x00cb
            java.lang.CharSequence r15 = r14.f40147a
            android.graphics.Bitmap r11 = r14.f40150d
            android.text.Layout$Alignment r9 = r14.f40149c
            r35 = r1
            int r1 = r14.f40153g
            r17 = r1
            int r1 = r14.f40160n
            r36 = r10
            float r10 = r14.f40161o
            r37 = r13
            float r13 = r14.f40156j
            r38 = r6
            float r6 = r14.f40157k
            r39 = r5
            boolean r5 = r14.f40158l
            r40 = r4
            int r4 = r14.f40159m
            r41 = r3
            int r3 = r14.f40162p
            r42 = r8
            float r8 = r14.f40163q
            r25 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r19 = 0
            r43 = r12
            int r12 = r14.f40152f
            if (r12 != 0) goto L_0x0091
            float r12 = r14.f40151e
            float r12 = r16 - r12
            r22 = r12
            r23 = 0
            goto L_0x009a
        L_0x0091:
            float r12 = r14.f40151e
            float r12 = -r12
            float r12 = r12 - r16
            r22 = r12
            r23 = 1
        L_0x009a:
            int r12 = r14.f40153g
            if (r12 == 0) goto L_0x00a7
            r14 = 2
            if (r12 == r14) goto L_0x00a4
            r24 = r17
            goto L_0x00a9
        L_0x00a4:
            r24 = 0
            goto L_0x00a9
        L_0x00a7:
            r24 = 2
        L_0x00a9:
            oi.a r14 = new oi.a
            r17 = r14
            r18 = r15
            r20 = r9
            r21 = r11
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r26 = r9
            r27 = r1
            r28 = r10
            r29 = r13
            r30 = r6
            r31 = r5
            r32 = r4
            r33 = r3
            r34 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x00dd
        L_0x00cb:
            r35 = r1
            r41 = r3
            r40 = r4
            r39 = r5
            r38 = r6
            r42 = r8
            r36 = r10
            r43 = r12
            r37 = r13
        L_0x00dd:
            int r1 = r14.f40160n
            float r3 = r14.f40161o
            float r1 = p726zi.C18928n.m32024b(r1, r3, r2, r7)
            java.util.ArrayList r3 = r0.f32448b
            r11 = r43
            java.lang.Object r3 = r3.get(r11)
            zi.m r3 = (p726zi.C18927m) r3
            zi.a r4 = r0.f32452f
            float r5 = r0.f32453g
            r3.getClass()
            android.graphics.Bitmap r6 = r14.f40150d
            if (r6 != 0) goto L_0x00fc
            r6 = 1
            goto L_0x00fd
        L_0x00fc:
            r6 = 0
        L_0x00fd:
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r6 == 0) goto L_0x011e
            java.lang.CharSequence r8 = r14.f40147a
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L_0x0115
            r9 = r37
            r15 = r38
            r13 = r39
            r12 = r40
            r10 = r41
            goto L_0x01e5
        L_0x0115:
            boolean r8 = r14.f40158l
            if (r8 == 0) goto L_0x011c
            int r8 = r14.f40159m
            goto L_0x011e
        L_0x011c:
            int r8 = r4.f42120c
        L_0x011e:
            java.lang.CharSequence r9 = r3.f42196i
            java.lang.CharSequence r10 = r14.f40147a
            if (r9 == r10) goto L_0x012f
            if (r9 == 0) goto L_0x012d
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r9 = 0
            goto L_0x0130
        L_0x012f:
            r9 = 1
        L_0x0130:
            if (r9 == 0) goto L_0x0210
            android.text.Layout$Alignment r9 = r3.f42197j
            android.text.Layout$Alignment r10 = r14.f40148b
            boolean r9 = p513bj.C14049b0.m21628a(r9, r10)
            if (r9 == 0) goto L_0x0210
            android.graphics.Bitmap r9 = r3.f42198k
            android.graphics.Bitmap r10 = r14.f40150d
            if (r9 != r10) goto L_0x0210
            float r9 = r3.f42199l
            float r10 = r14.f40151e
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0210
            int r9 = r3.f42200m
            int r10 = r14.f40152f
            if (r9 != r10) goto L_0x0210
            int r9 = r3.f42201n
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r10 = r14.f40153g
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            boolean r9 = p513bj.C14049b0.m21628a(r9, r10)
            if (r9 == 0) goto L_0x0210
            float r9 = r3.f42202o
            float r10 = r14.f40154h
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0210
            int r9 = r3.f42203p
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r10 = r14.f40155i
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            boolean r9 = p513bj.C14049b0.m21628a(r9, r10)
            if (r9 == 0) goto L_0x0210
            float r9 = r3.f42204q
            float r10 = r14.f40156j
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0210
            float r9 = r3.f42205r
            float r10 = r14.f40157k
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0210
            int r9 = r3.f42206s
            int r10 = r4.f42118a
            if (r9 != r10) goto L_0x0210
            int r9 = r3.f42207t
            int r10 = r4.f42119b
            if (r9 != r10) goto L_0x0210
            int r9 = r3.f42208u
            if (r9 != r8) goto L_0x0210
            int r9 = r3.f42210w
            int r10 = r4.f42121d
            if (r9 != r10) goto L_0x0210
            int r9 = r3.f42209v
            int r10 = r4.f42122e
            if (r9 != r10) goto L_0x0210
            android.text.TextPaint r9 = r3.f42193f
            android.graphics.Typeface r9 = r9.getTypeface()
            android.graphics.Typeface r10 = r4.f42123f
            boolean r9 = p513bj.C14049b0.m21628a(r9, r10)
            if (r9 == 0) goto L_0x0210
            float r9 = r3.f42211x
            int r9 = (r9 > r42 ? 1 : (r9 == r42 ? 0 : -1))
            if (r9 != 0) goto L_0x0210
            float r9 = r3.f42212y
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 != 0) goto L_0x0210
            float r9 = r3.f42213z
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x0210
            int r9 = r3.f42178A
            r10 = r41
            if (r9 != r10) goto L_0x0207
            int r9 = r3.f42179B
            r12 = r40
            if (r9 != r12) goto L_0x0200
            int r9 = r3.f42180C
            r13 = r39
            if (r9 != r13) goto L_0x01fb
            int r9 = r3.f42181D
            r15 = r38
            if (r9 != r15) goto L_0x01f8
            r9 = r37
            r3.mo70371a(r9, r6)
        L_0x01e5:
            r26 = r2
            r27 = r7
            r41 = r10
            r43 = r11
            r40 = r12
            r39 = r13
            r38 = r15
            r11 = 0
            r12 = 0
            r13 = r9
            goto L_0x0522
        L_0x01f8:
            r9 = r37
            goto L_0x021a
        L_0x01fb:
            r9 = r37
            r15 = r38
            goto L_0x021a
        L_0x0200:
            r9 = r37
            r15 = r38
            r13 = r39
            goto L_0x021a
        L_0x0207:
            r9 = r37
            r15 = r38
            r13 = r39
            r12 = r40
            goto L_0x021a
        L_0x0210:
            r9 = r37
            r15 = r38
            r13 = r39
            r12 = r40
            r10 = r41
        L_0x021a:
            java.lang.CharSequence r0 = r14.f40147a
            r3.f42196i = r0
            android.text.Layout$Alignment r0 = r14.f40148b
            r3.f42197j = r0
            android.graphics.Bitmap r0 = r14.f40150d
            r3.f42198k = r0
            float r0 = r14.f40151e
            r3.f42199l = r0
            int r0 = r14.f40152f
            r3.f42200m = r0
            int r0 = r14.f40153g
            r3.f42201n = r0
            float r0 = r14.f40154h
            r3.f42202o = r0
            int r0 = r14.f40155i
            r3.f42203p = r0
            float r0 = r14.f40156j
            r3.f42204q = r0
            float r0 = r14.f40157k
            r3.f42205r = r0
            int r0 = r4.f42118a
            r3.f42206s = r0
            int r0 = r4.f42119b
            r3.f42207t = r0
            r3.f42208u = r8
            int r0 = r4.f42121d
            r3.f42210w = r0
            int r0 = r4.f42122e
            r3.f42209v = r0
            android.text.TextPaint r0 = r3.f42193f
            android.graphics.Typeface r4 = r4.f42123f
            r0.setTypeface(r4)
            r0 = r42
            r3.f42211x = r0
            r3.f42212y = r1
            r3.f42213z = r5
            r3.f42178A = r10
            r3.f42179B = r12
            r3.f42180C = r13
            r3.f42181D = r15
            if (r6 == 0) goto L_0x049a
            java.lang.CharSequence r4 = r3.f42196i
            r4.getClass()
            java.lang.CharSequence r4 = r3.f42196i
            boolean r5 = r4 instanceof android.text.SpannableStringBuilder
            if (r5 == 0) goto L_0x027b
            android.text.SpannableStringBuilder r4 = (android.text.SpannableStringBuilder) r4
            goto L_0x0282
        L_0x027b:
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r5 = r3.f42196i
            r4.<init>(r5)
        L_0x0282:
            int r5 = r3.f42180C
            int r8 = r3.f42178A
            int r5 = r5 - r8
            int r8 = r3.f42181D
            int r14 = r3.f42179B
            int r8 = r8 - r14
            android.text.TextPaint r14 = r3.f42193f
            float r1 = r3.f42211x
            r14.setTextSize(r1)
            float r1 = r3.f42211x
            r14 = 1040187392(0x3e000000, float:0.125)
            float r1 = r1 * r14
            r14 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r14
            int r1 = (int) r1
            int r14 = r1 * 2
            r42 = r0
            int r0 = r5 - r14
            r26 = r2
            float r2 = r3.f42204q
            r17 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r18 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r18 == 0) goto L_0x02b0
            float r0 = (float) r0
            float r0 = r0 * r2
            int r0 = (int) r0
        L_0x02b0:
            java.lang.String r2 = "SubtitlePainter"
            if (r0 > 0) goto L_0x02ca
            java.lang.String r0 = "Skipped drawing subtitle cue (insufficient space)"
            android.util.Log.w(r2, r0)
            r27 = r7
            r41 = r10
            r43 = r11
            r40 = r12
            r39 = r13
            r38 = r15
            r11 = 0
            r12 = 0
            r13 = r9
            goto L_0x051f
        L_0x02ca:
            float r9 = r3.f42212y
            r17 = 0
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            r27 = r7
            if (r9 <= 0) goto L_0x02eb
            android.text.style.AbsoluteSizeSpan r9 = new android.text.style.AbsoluteSizeSpan
            float r7 = r3.f42212y
            int r7 = (int) r7
            r9.<init>(r7)
            int r7 = r4.length()
            r41 = r10
            r40 = r12
            r10 = 16711680(0xff0000, float:2.3418052E-38)
            r12 = 0
            r4.setSpan(r9, r12, r7, r10)
            goto L_0x02f0
        L_0x02eb:
            r41 = r10
            r40 = r12
            r12 = 0
        L_0x02f0:
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>(r4)
            int r9 = r3.f42210w
            r10 = 1
            if (r9 != r10) goto L_0x0316
            int r9 = r7.length()
            java.lang.Class<android.text.style.ForegroundColorSpan> r10 = android.text.style.ForegroundColorSpan.class
            java.lang.Object[] r9 = r7.getSpans(r12, r9, r10)
            android.text.style.ForegroundColorSpan[] r9 = (android.text.style.ForegroundColorSpan[]) r9
            int r10 = r9.length
            r12 = 0
        L_0x0308:
            if (r12 >= r10) goto L_0x0316
            r18 = r10
            r10 = r9[r12]
            r7.removeSpan(r10)
            int r12 = r12 + 1
            r10 = r18
            goto L_0x0308
        L_0x0316:
            int r9 = r3.f42207t
            int r9 = android.graphics.Color.alpha(r9)
            if (r9 <= 0) goto L_0x034e
            int r9 = r3.f42210w
            if (r9 == 0) goto L_0x033a
            r10 = 2
            if (r9 != r10) goto L_0x0326
            goto L_0x033a
        L_0x0326:
            android.text.style.BackgroundColorSpan r9 = new android.text.style.BackgroundColorSpan
            int r10 = r3.f42207t
            r9.<init>(r10)
            int r10 = r7.length()
            r39 = r13
            r12 = 16711680(0xff0000, float:2.3418052E-38)
            r13 = 0
            r7.setSpan(r9, r13, r10, r12)
            goto L_0x0350
        L_0x033a:
            r39 = r13
            r12 = 16711680(0xff0000, float:2.3418052E-38)
            r13 = 0
            android.text.style.BackgroundColorSpan r9 = new android.text.style.BackgroundColorSpan
            int r10 = r3.f42207t
            r9.<init>(r10)
            int r10 = r4.length()
            r4.setSpan(r9, r13, r10, r12)
            goto L_0x0350
        L_0x034e:
            r39 = r13
        L_0x0350:
            android.text.Layout$Alignment r9 = r3.f42197j
            if (r9 != 0) goto L_0x0356
            android.text.Layout$Alignment r9 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x0356:
            android.text.StaticLayout r10 = new android.text.StaticLayout
            android.text.TextPaint r12 = r3.f42193f
            float r13 = r3.f42191d
            r38 = r15
            float r15 = r3.f42192e
            r24 = 1
            r17 = r10
            r18 = r4
            r19 = r12
            r20 = r0
            r21 = r9
            r22 = r13
            r23 = r15
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r3.f42182E = r10
            int r10 = r10.getHeight()
            android.text.StaticLayout r12 = r3.f42182E
            int r12 = r12.getLineCount()
            r13 = 0
            r15 = 0
        L_0x0381:
            if (r13 >= r12) goto L_0x039e
            r17 = r12
            android.text.StaticLayout r12 = r3.f42182E
            float r12 = r12.getLineWidth(r13)
            r43 = r11
            double r11 = (double) r12
            double r11 = java.lang.Math.ceil(r11)
            int r11 = (int) r11
            int r15 = java.lang.Math.max(r11, r15)
            int r13 = r13 + 1
            r12 = r17
            r11 = r43
            goto L_0x0381
        L_0x039e:
            r43 = r11
            float r11 = r3.f42204q
            r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 == 0) goto L_0x03ac
            if (r15 >= r0) goto L_0x03ac
            goto L_0x03ad
        L_0x03ac:
            r0 = r15
        L_0x03ad:
            int r0 = r0 + r14
            float r11 = r3.f42202o
            int r13 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r13 == 0) goto L_0x03d9
            float r5 = (float) r5
            float r5 = r5 * r11
            int r5 = java.lang.Math.round(r5)
            int r11 = r3.f42178A
            int r5 = r5 + r11
            int r12 = r3.f42203p
            r13 = 1
            if (r12 == r13) goto L_0x03c8
            r13 = 2
            if (r12 == r13) goto L_0x03c6
            goto L_0x03cd
        L_0x03c6:
            int r5 = r5 - r0
            goto L_0x03cd
        L_0x03c8:
            r13 = 2
            int r5 = r5 * 2
            int r5 = r5 - r0
            int r5 = r5 / r13
        L_0x03cd:
            int r5 = java.lang.Math.max(r5, r11)
            int r0 = r0 + r5
            int r11 = r3.f42180C
            int r0 = java.lang.Math.min(r0, r11)
            goto L_0x03e0
        L_0x03d9:
            r13 = 2
            int r5 = r5 - r0
            int r5 = r5 / r13
            int r11 = r3.f42178A
            int r5 = r5 + r11
            int r0 = r0 + r5
        L_0x03e0:
            int r0 = r0 - r5
            if (r0 > 0) goto L_0x03ee
            java.lang.String r0 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            android.util.Log.w(r2, r0)
            r13 = r45
            r11 = 0
            r12 = 0
            goto L_0x051f
        L_0x03ee:
            float r2 = r3.f42199l
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r11 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x044f
            int r11 = r3.f42200m
            if (r11 != 0) goto L_0x0416
            float r8 = (float) r8
            float r8 = r8 * r2
            int r2 = java.lang.Math.round(r8)
            int r8 = r3.f42179B
            int r2 = r2 + r8
            int r8 = r3.f42201n
            r11 = 2
            if (r8 != r11) goto L_0x040c
            r11 = 0
            r12 = 0
            goto L_0x0440
        L_0x040c:
            r12 = 1
            if (r8 != r12) goto L_0x0413
            int r2 = r2 * 2
            int r2 = r2 - r10
            int r2 = r2 / r11
        L_0x0413:
            r11 = 0
            r12 = 0
            goto L_0x0441
        L_0x0416:
            android.text.StaticLayout r2 = r3.f42182E
            r11 = 0
            int r2 = r2.getLineBottom(r11)
            android.text.StaticLayout r8 = r3.f42182E
            int r8 = r8.getLineTop(r11)
            int r2 = r2 - r8
            float r8 = r3.f42199l
            r12 = 0
            int r13 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r13 < 0) goto L_0x0435
            float r2 = (float) r2
            float r8 = r8 * r2
            int r2 = java.lang.Math.round(r8)
            int r8 = r3.f42179B
            int r2 = r2 + r8
            goto L_0x0441
        L_0x0435:
            float r8 = r8 + r16
            float r2 = (float) r2
            float r8 = r8 * r2
            int r2 = java.lang.Math.round(r8)
            int r8 = r3.f42181D
            int r2 = r2 + r8
        L_0x0440:
            int r2 = r2 - r10
        L_0x0441:
            int r8 = r2 + r10
            int r13 = r3.f42181D
            if (r8 <= r13) goto L_0x044a
            int r2 = r13 - r10
            goto L_0x045a
        L_0x044a:
            int r8 = r3.f42179B
            if (r2 >= r8) goto L_0x045a
            goto L_0x045b
        L_0x044f:
            r11 = 0
            r12 = 0
            int r2 = r3.f42181D
            int r2 = r2 - r10
            float r8 = (float) r8
            float r10 = r3.f42213z
            float r8 = r8 * r10
            int r8 = (int) r8
            int r2 = r2 - r8
        L_0x045a:
            r8 = r2
        L_0x045b:
            android.text.StaticLayout r2 = new android.text.StaticLayout
            android.text.TextPaint r10 = r3.f42193f
            float r13 = r3.f42191d
            float r14 = r3.f42192e
            r15 = 1
            r24 = 1
            r17 = r2
            r18 = r4
            r19 = r10
            r20 = r0
            r21 = r9
            r22 = r13
            r23 = r14
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r3.f42182E = r2
            android.text.StaticLayout r2 = new android.text.StaticLayout
            android.text.TextPaint r4 = r3.f42193f
            float r10 = r3.f42191d
            float r13 = r3.f42192e
            r17 = r2
            r18 = r7
            r19 = r4
            r22 = r10
            r23 = r13
            r24 = r15
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r3.f42183F = r2
            r3.f42184G = r5
            r3.f42185H = r8
            r3.f42186I = r1
            goto L_0x051d
        L_0x049a:
            r42 = r0
            r26 = r2
            r27 = r7
            r41 = r10
            r43 = r11
            r40 = r12
            r39 = r13
            r38 = r15
            r11 = 0
            r12 = 0
            android.graphics.Bitmap r0 = r3.f42198k
            r0.getClass()
            android.graphics.Bitmap r0 = r3.f42198k
            int r1 = r3.f42180C
            int r2 = r3.f42178A
            int r1 = r1 - r2
            int r4 = r3.f42181D
            int r5 = r3.f42179B
            int r4 = r4 - r5
            float r2 = (float) r2
            float r1 = (float) r1
            float r7 = r3.f42202o
            float r7 = r7 * r1
            float r7 = r7 + r2
            float r2 = (float) r5
            float r4 = (float) r4
            float r5 = r3.f42199l
            float r5 = r5 * r4
            float r5 = r5 + r2
            float r2 = r3.f42204q
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            float r2 = r3.f42205r
            r8 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x04df
            float r4 = r4 * r2
            int r0 = java.lang.Math.round(r4)
            goto L_0x04f0
        L_0x04df:
            float r2 = (float) r1
            int r4 = r0.getHeight()
            float r4 = (float) r4
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r4 = r4 / r0
            float r4 = r4 * r2
            int r0 = java.lang.Math.round(r4)
        L_0x04f0:
            int r2 = r3.f42203p
            r4 = 2
            if (r2 != r4) goto L_0x04f7
            float r2 = (float) r1
            goto L_0x04fd
        L_0x04f7:
            r4 = 1
            if (r2 != r4) goto L_0x04fe
            int r2 = r1 / 2
            float r2 = (float) r2
        L_0x04fd:
            float r7 = r7 - r2
        L_0x04fe:
            int r2 = java.lang.Math.round(r7)
            int r4 = r3.f42201n
            r7 = 2
            if (r4 != r7) goto L_0x0509
            float r4 = (float) r0
            goto L_0x050f
        L_0x0509:
            r7 = 1
            if (r4 != r7) goto L_0x0510
            int r4 = r0 / 2
            float r4 = (float) r4
        L_0x050f:
            float r5 = r5 - r4
        L_0x0510:
            int r4 = java.lang.Math.round(r5)
            android.graphics.Rect r5 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r4
            r5.<init>(r2, r4, r1, r0)
            r3.f42187J = r5
        L_0x051d:
            r13 = r45
        L_0x051f:
            r3.mo70371a(r13, r6)
        L_0x0522:
            int r0 = r43 + 1
            r9 = r12
            r2 = r26
            r7 = r27
            r1 = r35
            r10 = r36
            r6 = r38
            r5 = r39
            r4 = r40
            r3 = r41
            r8 = r42
            r12 = r0
            r0 = r44
            goto L_0x0043
        L_0x053c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p526ui.C14415a.dispatchDraw(android.graphics.Canvas):void");
    }
}
