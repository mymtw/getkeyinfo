package androidx.compose.p015ui.text.android;

import android.graphics.Canvas;
import android.text.Layout;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.android.m */
public final class C1930m {

    /* renamed from: a */
    public final boolean f4351a;

    /* renamed from: b */
    public final Layout f4352b;

    /* renamed from: c */
    public final int f4353c;

    /* renamed from: d */
    public final int f4354d;

    /* renamed from: e */
    public final int f4355e;

    /* renamed from: f */
    public final boolean f4356f;

    /* renamed from: g */
    public final C19285c f4357g;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: android.text.BoringLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: android.text.StaticLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: android.text.BoringLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: android.text.BoringLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: android.text.BoringLayout} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x023d A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1930m(java.lang.CharSequence r24, float r25, androidx.compose.p015ui.text.platform.AndroidTextPaint r26, int r27, android.text.TextUtils.TruncateAt r28, int r29, boolean r30, int r31, int r32, androidx.compose.p015ui.text.android.C1920c r33) {
        /*
            r23 = this;
            r0 = r23
            r15 = r24
            r1 = r25
            r2 = r27
            r14 = r31
            r3 = r33
            r16 = 1
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            java.lang.String r4 = "charSequence"
            kotlin.jvm.internal.C19383o.m32797g(r15, r4)
            java.lang.String r4 = "textPaint"
            r5 = r26
            kotlin.jvm.internal.C19383o.m32797g(r5, r4)
            java.lang.String r4 = "layoutIntrinsics"
            kotlin.jvm.internal.C19383o.m32797g(r3, r4)
            r23.<init>()
            int r4 = r24.length()
            android.text.TextDirectionHeuristic r6 = androidx.compose.p015ui.text.android.C1931n.m4230a(r29)
            android.text.Layout$Alignment r7 = androidx.compose.p015ui.text.android.C1929l.f4349a
            r13 = 1
            if (r2 == 0) goto L_0x0051
            if (r2 == r13) goto L_0x004e
            r7 = 2
            if (r2 == r7) goto L_0x004b
            r7 = 3
            if (r2 == r7) goto L_0x0048
            r7 = 4
            if (r2 == r7) goto L_0x0045
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x0053
        L_0x0045:
            android.text.Layout$Alignment r2 = androidx.compose.p015ui.text.android.C1929l.f4350b
            goto L_0x0053
        L_0x0048:
            android.text.Layout$Alignment r2 = androidx.compose.p015ui.text.android.C1929l.f4349a
            goto L_0x0053
        L_0x004b:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x0053
        L_0x004e:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x0053
        L_0x0051:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x0053:
            r7 = r2
            boolean r2 = r15 instanceof android.text.Spanned
            if (r2 == 0) goto L_0x0066
            r2 = r15
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<androidx.compose.ui.text.android.style.BaselineShiftSpan> r8 = androidx.compose.p015ui.text.android.style.BaselineShiftSpan.class
            r9 = -1
            int r2 = r2.nextSpanTransition(r9, r4, r8)
            if (r2 >= r4) goto L_0x0066
            r2 = r13
            goto L_0x0067
        L_0x0066:
            r2 = 0
        L_0x0067:
            kotlin.c r4 = r3.f4324a
            java.lang.Object r4 = r4.getValue()
            r8 = r4
            android.text.BoringLayout$Metrics r8 = (android.text.BoringLayout.Metrics) r8
            double r10 = (double) r1
            double r12 = java.lang.Math.ceil(r10)
            float r4 = (float) r12
            int r12 = (int) r4
            java.lang.String r4 = "alignment"
            if (r8 == 0) goto L_0x00e9
            kotlin.c r3 = r3.f4326c
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x00e9
            if (r2 != 0) goto L_0x00e9
            r13 = 1
            r0.f4356f = r13
            kotlin.jvm.internal.C19383o.m32797g(r7, r4)
            if (r12 < 0) goto L_0x0097
            r1 = r13
            goto L_0x0098
        L_0x0097:
            r1 = 0
        L_0x0098:
            java.lang.String r2 = "Failed requirement."
            if (r1 == 0) goto L_0x00df
            if (r12 < 0) goto L_0x00a0
            r1 = r13
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            if (r1 == 0) goto L_0x00d5
            if (r28 != 0) goto L_0x00ba
            android.text.BoringLayout r10 = new android.text.BoringLayout
            r6 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r1 = r10
            r2 = r24
            r3 = r26
            r4 = r12
            r5 = r7
            r7 = r9
            r9 = r30
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r15 = 0
            goto L_0x0129
        L_0x00ba:
            android.text.BoringLayout r16 = new android.text.BoringLayout
            r6 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r1 = r16
            r2 = r24
            r3 = r26
            r4 = r12
            r5 = r7
            r7 = r9
            r9 = r30
            r11 = 0
            r10 = r28
            r15 = r11
            r11 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r10 = r16
            goto L_0x0129
        L_0x00d5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00df:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00e9:
            r13 = 1
            r15 = 0
            r0.f4356f = r15
            int r3 = r24.length()
            double r1 = java.lang.Math.ceil(r10)
            float r1 = (float) r1
            int r10 = (int) r1
            kotlin.jvm.internal.C19383o.m32797g(r7, r4)
            androidx.compose.ui.text.android.f r11 = kotlinx.coroutines.C19543e0.f43490c
            androidx.compose.ui.text.android.k r9 = new androidx.compose.ui.text.android.k
            r1 = r9
            r2 = r24
            r4 = r26
            r5 = r12
            r8 = r31
            r12 = r9
            r9 = r28
            r21 = r11
            r11 = 1065353216(0x3f800000, float:1.0)
            r22 = r12
            r12 = 0
            r13 = r32
            r14 = r30
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2 = r21
            r1 = r22
            android.text.StaticLayout r10 = r2.mo7421a(r1)
        L_0x0129:
            r0.f4352b = r10
            int r1 = r10.getLineCount()
            r2 = r31
            int r1 = java.lang.Math.min(r1, r2)
            r0.f4353c = r1
            if (r1 >= r2) goto L_0x013a
            goto L_0x014d
        L_0x013a:
            int r2 = r1 + -1
            int r3 = r10.getEllipsisCount(r2)
            if (r3 > 0) goto L_0x014f
            int r2 = r10.getLineEnd(r2)
            int r3 = r24.length()
            if (r2 == r3) goto L_0x014d
            goto L_0x014f
        L_0x014d:
            r13 = 0
            goto L_0x0150
        L_0x014f:
            r13 = 1
        L_0x0150:
            r0.f4351a = r13
            if (r30 != 0) goto L_0x01ce
            boolean r2 = r0.f4356f
            if (r2 != 0) goto L_0x0160
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L_0x0160
            r13 = 1
            goto L_0x0161
        L_0x0160:
            r13 = 0
        L_0x0161:
            if (r13 == 0) goto L_0x0164
            goto L_0x01ce
        L_0x0164:
            android.text.TextPaint r2 = r10.getPaint()
            java.lang.CharSequence r3 = r10.getText()
            java.lang.String r4 = "paint"
            kotlin.jvm.internal.C19383o.m32796f(r2, r4)
            java.lang.String r4 = "text"
            kotlin.jvm.internal.C19383o.m32796f(r3, r4)
            r4 = 0
            int r5 = r10.getLineStart(r4)
            int r6 = r10.getLineEnd(r4)
            android.graphics.Rect r5 = com.google.android.play.core.assetpacks.C15588c1.m25328h0(r2, r3, r5, r6)
            int r6 = r10.getLineAscent(r4)
            int r7 = r5.top
            if (r7 >= r6) goto L_0x018d
            int r6 = r6 - r7
            goto L_0x0191
        L_0x018d:
            int r6 = r10.getTopPadding()
        L_0x0191:
            r7 = 1
            if (r1 != r7) goto L_0x0195
            goto L_0x01a6
        L_0x0195:
            int r1 = r10.getLineCount()
            int r1 = r1 - r7
            int r5 = r10.getLineStart(r1)
            int r1 = r10.getLineEnd(r1)
            android.graphics.Rect r5 = com.google.android.play.core.assetpacks.C15588c1.m25328h0(r2, r3, r5, r1)
        L_0x01a6:
            int r1 = r10.getLineCount()
            int r1 = r1 - r7
            int r1 = r10.getLineDescent(r1)
            int r2 = r5.bottom
            if (r2 <= r1) goto L_0x01b5
            int r2 = r2 - r1
            goto L_0x01b9
        L_0x01b5:
            int r2 = r10.getBottomPadding()
        L_0x01b9:
            if (r6 != 0) goto L_0x01c0
            if (r2 != 0) goto L_0x01c0
            kotlin.Pair<java.lang.Integer, java.lang.Integer> r1 = androidx.compose.p015ui.text.android.C1931n.f4358a
            goto L_0x01dd
        L_0x01c0:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.<init>(r3, r2)
            goto L_0x01dd
        L_0x01ce:
            r4 = 0
            r7 = 1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r1.<init>(r2, r3)
        L_0x01dd:
            java.lang.CharSequence r2 = r23.mo7427e()
            boolean r2 = r2 instanceof android.text.Spanned
            if (r2 != 0) goto L_0x01e8
            androidx.compose.ui.text.android.style.LineHeightStyleSpan[] r2 = new androidx.compose.p015ui.text.android.style.LineHeightStyleSpan[r4]
            goto L_0x020d
        L_0x01e8:
            java.lang.CharSequence r2 = r23.mo7427e()
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.CharSequence r3 = r23.mo7427e()
            int r3 = r3.length()
            java.lang.Class<androidx.compose.ui.text.android.style.LineHeightStyleSpan> r5 = androidx.compose.p015ui.text.android.style.LineHeightStyleSpan.class
            java.lang.Object[] r2 = r2.getSpans(r4, r3, r5)
            androidx.compose.ui.text.android.style.LineHeightStyleSpan[] r2 = (androidx.compose.p015ui.text.android.style.LineHeightStyleSpan[]) r2
            java.lang.String r3 = "lineHeightStyleSpans"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            int r3 = r2.length
            if (r3 != 0) goto L_0x0208
            r13 = r7
            goto L_0x0209
        L_0x0208:
            r13 = r4
        L_0x0209:
            if (r13 == 0) goto L_0x020d
            androidx.compose.ui.text.android.style.LineHeightStyleSpan[] r2 = new androidx.compose.p015ui.text.android.style.LineHeightStyleSpan[r4]
        L_0x020d:
            int r3 = r2.length
            r5 = r4
            r10 = r5
        L_0x0210:
            if (r10 >= r3) goto L_0x023b
            r6 = r2[r10]
            int r7 = r6.getFirstAscentDiff()
            if (r7 >= 0) goto L_0x0226
            int r7 = r6.getFirstAscentDiff()
            int r7 = java.lang.Math.abs(r7)
            int r4 = java.lang.Math.max(r4, r7)
        L_0x0226:
            int r7 = r6.getLastDescentDiff()
            if (r7 >= 0) goto L_0x0238
            int r5 = r6.getLastDescentDiff()
            int r5 = java.lang.Math.abs(r5)
            int r5 = java.lang.Math.max(r4, r5)
        L_0x0238:
            int r10 = r10 + 1
            goto L_0x0210
        L_0x023b:
            if (r4 != 0) goto L_0x0242
            if (r5 != 0) goto L_0x0242
            kotlin.Pair<java.lang.Integer, java.lang.Integer> r2 = androidx.compose.p015ui.text.android.C1931n.f4358a
            goto L_0x024f
        L_0x0242:
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r2.<init>(r3, r4)
        L_0x024f:
            java.lang.Object r3 = r1.getFirst()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Object r4 = r2.getFirst()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r3 = java.lang.Math.max(r3, r4)
            r0.f4354d = r3
            java.lang.Object r1 = r1.getSecond()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r2 = r2.getSecond()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r1 = java.lang.Math.max(r1, r2)
            r0.f4355e = r1
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE
            androidx.compose.ui.text.android.TextLayout$layoutHelper$2 r2 = new androidx.compose.ui.text.android.TextLayout$layoutHelper$2
            r2.<init>(r0)
            kotlin.c r1 = kotlin.C19350d.m32676a(r1, r2)
            r0.f4357g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.android.C1930m.<init>(java.lang.CharSequence, float, androidx.compose.ui.text.platform.AndroidTextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, androidx.compose.ui.text.android.c):void");
    }

    /* renamed from: d */
    public static float m4224d(C1930m mVar, int i) {
        return ((C1918b) mVar.f4357g.getValue()).mo7416a(i, true, false);
    }

    /* renamed from: a */
    public final float mo7424a(int i) {
        return ((float) this.f4354d) + ((float) this.f4352b.getLineBaseline(i));
    }

    /* renamed from: b */
    public final float mo7425b(int i) {
        return ((float) this.f4354d) + ((float) this.f4352b.getLineBottom(i)) + ((float) (i == this.f4353c + -1 ? this.f4355e : 0));
    }

    /* renamed from: c */
    public final float mo7426c(int i) {
        return ((float) this.f4352b.getLineTop(i)) + ((float) (i == 0 ? 0 : this.f4354d));
    }

    /* renamed from: e */
    public final CharSequence mo7427e() {
        CharSequence text = this.f4352b.getText();
        C19383o.m32796f(text, "layout.text");
        return text;
    }

    /* renamed from: f */
    public final void mo7428f(Canvas canvas) {
        C19383o.m32797g(canvas, "canvas");
        int i = this.f4354d;
        if (i != 0) {
            canvas.translate(0.0f, (float) i);
        }
        this.f4352b.draw(canvas);
        int i2 = this.f4354d;
        if (i2 != 0) {
            canvas.translate(0.0f, ((float) -1) * ((float) i2));
        }
    }
}
