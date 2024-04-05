package androidx.compose.p015ui.text.platform;

import android.graphics.Canvas;
import android.graphics.Path;
import android.support.p013v4.media.C0069a;
import androidx.compose.animation.C0472h;
import androidx.compose.p015ui.graphics.C1491b;
import androidx.compose.p015ui.graphics.C1493c;
import androidx.compose.p015ui.graphics.C1521g;
import androidx.compose.p015ui.graphics.C1528j0;
import androidx.compose.p015ui.graphics.C1537o;
import androidx.compose.p015ui.text.C1935d;
import androidx.compose.p015ui.text.android.C1918b;
import androidx.compose.p015ui.text.android.C1930m;
import androidx.compose.p015ui.text.style.C2030e;
import androidx.compose.p015ui.text.style.ResolvedTextDirection;
import java.util.List;
import kotlin.C19285c;
import p001a0.C0005b;
import p134i0.C6978a;
import p134i0.C6979b;
import p174m0.C7280a;
import p288y.C8343c;
import p288y.C8345d;

/* renamed from: androidx.compose.ui.text.platform.AndroidParagraph */
public final class AndroidParagraph implements C1935d {

    /* renamed from: a */
    public final C2016a f4566a;

    /* renamed from: b */
    public final int f4567b;

    /* renamed from: c */
    public final long f4568c;

    /* renamed from: d */
    public final C1930m f4569d;

    /* renamed from: e */
    public final List<C8345d> f4570e;

    /* renamed from: f */
    public final C19285c f4571f;

    /* renamed from: androidx.compose.ui.text.platform.AndroidParagraph$a */
    public /* synthetic */ class C2015a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4572a;

        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            iArr[ResolvedTextDirection.Ltr.ordinal()] = 1;
            iArr[ResolvedTextDirection.Rtl.ordinal()] = 2;
            f4572a = iArr;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0222, code lost:
        r12 = r12 - ((float) r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0230, code lost:
        r12 = r12 + r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x025b, code lost:
        r13 = new p288y.C8345d(r6, r12, r10, ((float) r9.getHeightPx()) + r12);
     */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x012c A[LOOP:1: B:89:0x012a->B:90:0x012c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AndroidParagraph(androidx.compose.p015ui.text.platform.C2016a r17, int r18, boolean r19, long r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r16.<init>()
            r0.f4566a = r1
            r0.f4567b = r2
            r3 = r20
            r0.f4568c = r3
            int r5 = p174m0.C7280a.m13964i(r20)
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L_0x0021
            int r5 = p174m0.C7280a.m13965j(r20)
            if (r5 != 0) goto L_0x0021
            r5 = r7
            goto L_0x0022
        L_0x0021:
            r5 = r6
        L_0x0022:
            if (r5 == 0) goto L_0x028d
            if (r2 < r7) goto L_0x0028
            r5 = r7
            goto L_0x0029
        L_0x0028:
            r5 = r6
        L_0x0029:
            if (r5 == 0) goto L_0x0281
            androidx.compose.ui.text.s r1 = r1.f4573a
            androidx.compose.ui.text.h r5 = r1.f4600b
            androidx.compose.ui.text.style.d r5 = r5.f4439a
            if (r5 != 0) goto L_0x0034
            goto L_0x003a
        L_0x0034:
            int r8 = r5.f4611a
            if (r8 != r7) goto L_0x003a
            r8 = r7
            goto L_0x003b
        L_0x003a:
            r8 = r6
        L_0x003b:
            r9 = 3
            r10 = 4
            r11 = 2
            if (r8 == 0) goto L_0x0041
            goto L_0x007b
        L_0x0041:
            if (r5 != 0) goto L_0x0044
            goto L_0x004a
        L_0x0044:
            int r8 = r5.f4611a
            if (r8 != r11) goto L_0x004a
            r8 = r7
            goto L_0x004b
        L_0x004a:
            r8 = r6
        L_0x004b:
            if (r8 == 0) goto L_0x004f
            r9 = r10
            goto L_0x007b
        L_0x004f:
            if (r5 != 0) goto L_0x0052
            goto L_0x0058
        L_0x0052:
            int r8 = r5.f4611a
            if (r8 != r9) goto L_0x0058
            r8 = r7
            goto L_0x0059
        L_0x0058:
            r8 = r6
        L_0x0059:
            if (r8 == 0) goto L_0x005d
            r9 = r11
            goto L_0x007b
        L_0x005d:
            r8 = 5
            if (r5 != 0) goto L_0x0061
            goto L_0x0067
        L_0x0061:
            int r9 = r5.f4611a
            if (r9 != r8) goto L_0x0067
            r8 = r7
            goto L_0x0068
        L_0x0067:
            r8 = r6
        L_0x0068:
            if (r8 == 0) goto L_0x006b
            goto L_0x007a
        L_0x006b:
            r8 = 6
            if (r5 != 0) goto L_0x006f
            goto L_0x0075
        L_0x006f:
            int r9 = r5.f4611a
            if (r9 != r8) goto L_0x0075
            r8 = r7
            goto L_0x0076
        L_0x0075:
            r8 = r6
        L_0x0076:
            if (r8 == 0) goto L_0x007a
            r9 = r7
            goto L_0x007b
        L_0x007a:
            r9 = r6
        L_0x007b:
            if (r5 != 0) goto L_0x007e
            goto L_0x0084
        L_0x007e:
            int r5 = r5.f4611a
            if (r5 != r10) goto L_0x0084
            r5 = r7
            goto L_0x0085
        L_0x0084:
            r5 = r6
        L_0x0085:
            r8 = 0
            if (r19 == 0) goto L_0x008b
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.END
            goto L_0x008c
        L_0x008b:
            r10 = r8
        L_0x008c:
            androidx.compose.ui.text.android.m r12 = r0.mo7721u(r9, r5, r10, r2)
            if (r19 == 0) goto L_0x00da
            boolean r13 = r12.f4351a
            if (r13 == 0) goto L_0x00a1
            android.text.Layout r13 = r12.f4352b
            int r14 = r12.f4353c
            int r14 = r14 + -1
            int r13 = r13.getLineBottom(r14)
            goto L_0x00a7
        L_0x00a1:
            android.text.Layout r13 = r12.f4352b
            int r13 = r13.getHeight()
        L_0x00a7:
            int r14 = r12.f4354d
            int r13 = r13 + r14
            int r14 = r12.f4355e
            int r13 = r13 + r14
            int r14 = p174m0.C7280a.m13962g(r20)
            if (r13 <= r14) goto L_0x00da
            if (r2 <= r7) goto L_0x00da
            int r2 = p174m0.C7280a.m13962g(r20)
            int r3 = r12.f4353c
            r4 = r6
        L_0x00bc:
            if (r4 >= r3) goto L_0x00cb
            float r13 = r12.mo7425b(r4)
            float r14 = (float) r2
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x00c8
            goto L_0x00cd
        L_0x00c8:
            int r4 = r4 + 1
            goto L_0x00bc
        L_0x00cb:
            int r4 = r12.f4353c
        L_0x00cd:
            if (r4 <= 0) goto L_0x00d7
            int r2 = r0.f4567b
            if (r4 == r2) goto L_0x00d7
            androidx.compose.ui.text.android.m r12 = r0.mo7721u(r9, r5, r10, r4)
        L_0x00d7:
            r0.f4569d = r12
            goto L_0x00dc
        L_0x00da:
            r0.f4569d = r12
        L_0x00dc:
            androidx.compose.ui.text.platform.a r2 = r0.f4566a
            androidx.compose.ui.text.platform.AndroidTextPaint r2 = r2.f4578f
            androidx.compose.ui.text.n r1 = r1.f4599a
            androidx.compose.ui.text.style.TextDrawStyle r1 = r1.f4536a
            r1.mo7766d()
            float r1 = r16.mo7722v()
            float r3 = r16.getHeight()
            long r3 = androidx.activity.C0114h.m319t(r1, r3)
            r2.m34824setBrushd16Qtg0(r8, r3)
            androidx.compose.ui.text.android.m r1 = r0.f4569d
            java.lang.CharSequence r2 = r1.mo7427e()
            boolean r2 = r2 instanceof android.text.Spanned
            if (r2 != 0) goto L_0x0103
            androidx.compose.ui.text.platform.style.ShaderBrushSpan[] r1 = new androidx.compose.p015ui.text.platform.style.ShaderBrushSpan[r6]
            goto L_0x0128
        L_0x0103:
            java.lang.CharSequence r2 = r1.mo7427e()
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.CharSequence r1 = r1.mo7427e()
            int r1 = r1.length()
            java.lang.Class<androidx.compose.ui.text.platform.style.ShaderBrushSpan> r3 = androidx.compose.p015ui.text.platform.style.ShaderBrushSpan.class
            java.lang.Object[] r1 = r2.getSpans(r6, r1, r3)
            androidx.compose.ui.text.platform.style.ShaderBrushSpan[] r1 = (androidx.compose.p015ui.text.platform.style.ShaderBrushSpan[]) r1
            java.lang.String r2 = "brushSpans"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            int r2 = r1.length
            if (r2 != 0) goto L_0x0123
            r2 = r7
            goto L_0x0124
        L_0x0123:
            r2 = r6
        L_0x0124:
            if (r2 == 0) goto L_0x0128
            androidx.compose.ui.text.platform.style.ShaderBrushSpan[] r1 = new androidx.compose.p015ui.text.platform.style.ShaderBrushSpan[r6]
        L_0x0128:
            int r2 = r1.length
            r3 = r6
        L_0x012a:
            if (r3 >= r2) goto L_0x0145
            r4 = r1[r3]
            float r5 = r16.mo7722v()
            float r9 = r16.getHeight()
            long r9 = androidx.activity.C0114h.m319t(r5, r9)
            y.f r5 = new y.f
            r5.<init>(r9)
            r4.m34827setSizeiaC8Vc4(r5)
            int r3 = r3 + 1
            goto L_0x012a
        L_0x0145:
            androidx.compose.ui.text.platform.a r1 = r0.f4566a
            java.lang.CharSequence r1 = r1.f4579g
            boolean r2 = r1 instanceof android.text.Spanned
            if (r2 != 0) goto L_0x0151
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
            goto L_0x0271
        L_0x0151:
            r2 = r1
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r3 = r1.length()
            java.lang.Class<androidx.compose.ui.text.android.style.PlaceholderSpan> r4 = androidx.compose.p015ui.text.android.style.PlaceholderSpan.class
            java.lang.Object[] r2 = r2.getSpans(r6, r3, r4)
            java.lang.String r3 = "getSpans(0, length, PlaceholderSpan::class.java)"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.length
            r3.<init>(r4)
            int r4 = r2.length
            r5 = r6
        L_0x016b:
            if (r5 >= r4) goto L_0x0270
            r9 = r2[r5]
            androidx.compose.ui.text.android.style.PlaceholderSpan r9 = (androidx.compose.p015ui.text.android.style.PlaceholderSpan) r9
            r10 = r1
            android.text.Spanned r10 = (android.text.Spanned) r10
            int r12 = r10.getSpanStart(r9)
            int r10 = r10.getSpanEnd(r9)
            androidx.compose.ui.text.android.m r13 = r0.f4569d
            android.text.Layout r13 = r13.f4352b
            int r13 = r13.getLineForOffset(r12)
            androidx.compose.ui.text.android.m r14 = r0.f4569d
            android.text.Layout r14 = r14.f4352b
            int r14 = r14.getEllipsisCount(r13)
            if (r14 <= 0) goto L_0x019a
            androidx.compose.ui.text.android.m r14 = r0.f4569d
            android.text.Layout r14 = r14.f4352b
            int r14 = r14.getEllipsisStart(r13)
            if (r10 <= r14) goto L_0x019a
            r14 = r7
            goto L_0x019b
        L_0x019a:
            r14 = r6
        L_0x019b:
            androidx.compose.ui.text.android.m r15 = r0.f4569d
            android.text.Layout r6 = r15.f4352b
            int r6 = r6.getEllipsisStart(r13)
            if (r6 != 0) goto L_0x01ac
            android.text.Layout r6 = r15.f4352b
            int r6 = r6.getLineEnd(r13)
            goto L_0x01b6
        L_0x01ac:
            android.text.Layout r6 = r15.f4352b
            java.lang.CharSequence r6 = r6.getText()
            int r6 = r6.length()
        L_0x01b6:
            if (r10 <= r6) goto L_0x01ba
            r6 = r7
            goto L_0x01bb
        L_0x01ba:
            r6 = 0
        L_0x01bb:
            if (r14 != 0) goto L_0x0267
            if (r6 == 0) goto L_0x01c1
            goto L_0x0267
        L_0x01c1:
            androidx.compose.ui.text.style.ResolvedTextDirection r6 = r0.mo7488q(r12)
            int[] r10 = androidx.compose.p015ui.text.platform.AndroidParagraph.C2015a.f4572a
            int r6 = r6.ordinal()
            r6 = r10[r6]
            if (r6 == r7) goto L_0x01e2
            if (r6 != r11) goto L_0x01dc
            float r6 = r0.mo7484m(r12, r7)
            int r10 = r9.getWidthPx()
            float r10 = (float) r10
            float r6 = r6 - r10
            goto L_0x01e6
        L_0x01dc:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x01e2:
            float r6 = r0.mo7484m(r12, r7)
        L_0x01e6:
            int r10 = r9.getWidthPx()
            float r10 = (float) r10
            float r10 = r10 + r6
            androidx.compose.ui.text.android.m r12 = r0.f4569d
            int r14 = r9.getVerticalAlign()
            switch(r14) {
                case 0: goto L_0x0252;
                case 1: goto L_0x024d;
                case 2: goto L_0x0244;
                case 3: goto L_0x0232;
                case 4: goto L_0x0225;
                case 5: goto L_0x0212;
                case 6: goto L_0x01fd;
                default: goto L_0x01f5;
            }
        L_0x01f5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected verticalAlignment"
            r1.<init>(r2)
            throw r1
        L_0x01fd:
            android.graphics.Paint$FontMetricsInt r14 = r9.getFontMetrics()
            int r15 = r14.ascent
            int r14 = r14.descent
            int r15 = r15 + r14
            int r14 = r9.getHeightPx()
            int r15 = r15 - r14
            int r15 = r15 / r11
            float r14 = (float) r15
            float r12 = r12.mo7424a(r13)
            goto L_0x0230
        L_0x0212:
            android.graphics.Paint$FontMetricsInt r14 = r9.getFontMetrics()
            int r14 = r14.descent
            float r14 = (float) r14
            float r12 = r12.mo7424a(r13)
            float r12 = r12 + r14
            int r13 = r9.getHeightPx()
        L_0x0222:
            float r13 = (float) r13
            float r12 = r12 - r13
            goto L_0x025b
        L_0x0225:
            android.graphics.Paint$FontMetricsInt r14 = r9.getFontMetrics()
            int r14 = r14.ascent
            float r14 = (float) r14
            float r12 = r12.mo7424a(r13)
        L_0x0230:
            float r12 = r12 + r14
            goto L_0x025b
        L_0x0232:
            float r14 = r12.mo7426c(r13)
            float r12 = r12.mo7425b(r13)
            float r12 = r12 + r14
            int r13 = r9.getHeightPx()
            float r13 = (float) r13
            float r12 = r12 - r13
            float r13 = (float) r11
            float r12 = r12 / r13
            goto L_0x025b
        L_0x0244:
            float r12 = r12.mo7425b(r13)
            int r13 = r9.getHeightPx()
            goto L_0x0222
        L_0x024d:
            float r12 = r12.mo7426c(r13)
            goto L_0x025b
        L_0x0252:
            float r12 = r12.mo7424a(r13)
            int r13 = r9.getHeightPx()
            goto L_0x0222
        L_0x025b:
            int r9 = r9.getHeightPx()
            float r9 = (float) r9
            float r9 = r9 + r12
            y.d r13 = new y.d
            r13.<init>(r6, r12, r10, r9)
            goto L_0x0268
        L_0x0267:
            r13 = r8
        L_0x0268:
            r3.add(r13)
            int r5 = r5 + 1
            r6 = 0
            goto L_0x016b
        L_0x0270:
            r1 = r3
        L_0x0271:
            r0.f4570e = r1
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE
            androidx.compose.ui.text.platform.AndroidParagraph$wordBoundary$2 r2 = new androidx.compose.ui.text.platform.AndroidParagraph$wordBoundary$2
            r2.<init>(r0)
            kotlin.c r1 = kotlin.C19350d.m32676a(r1, r2)
            r0.f4571f = r1
            return
        L_0x0281:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "maxLines should be greater than 0"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x028d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.platform.AndroidParagraph.<init>(androidx.compose.ui.text.platform.a, int, boolean, long):void");
    }

    /* renamed from: a */
    public final C8345d mo7471a(int i) {
        float d = C1930m.m4224d(this.f4569d, i);
        float d2 = C1930m.m4224d(this.f4569d, i + 1);
        int lineForOffset = this.f4569d.f4352b.getLineForOffset(i);
        return new C8345d(d, this.f4569d.mo7426c(lineForOffset), d2, this.f4569d.mo7425b(lineForOffset));
    }

    /* renamed from: b */
    public final ResolvedTextDirection mo7472b(int i) {
        return this.f4569d.f4352b.getParagraphDirection(this.f4569d.f4352b.getLineForOffset(i)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    /* renamed from: c */
    public final float mo7473c(int i) {
        return this.f4569d.mo7426c(i);
    }

    /* renamed from: d */
    public final C8345d mo7474d(int i) {
        if (i >= 0 && i <= this.f4566a.f4579g.length()) {
            float d = C1930m.m4224d(this.f4569d, i);
            int lineForOffset = this.f4569d.f4352b.getLineForOffset(i);
            return new C8345d(d, this.f4569d.mo7426c(lineForOffset), d, this.f4569d.mo7425b(lineForOffset));
        }
        StringBuilder h = C0069a.m177h("offset(", i, ") is out of bounds (0,");
        h.append(this.f4566a.f4579g.length());
        throw new AssertionError(h.toString());
    }

    /* renamed from: e */
    public final long mo7475e(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C6978a aVar = (C6978a) this.f4571f.getValue();
        C6979b bVar = aVar.f15465a;
        bVar.mo19145a(i);
        if (aVar.f15465a.mo19149e(bVar.f15469d.preceding(i))) {
            C6979b bVar2 = aVar.f15465a;
            bVar2.mo19145a(i);
            i2 = i;
            while (i2 != -1) {
                if (bVar2.mo19149e(i2) && !bVar2.mo19147c(i2)) {
                    break;
                }
                bVar2.mo19145a(i2);
                i2 = bVar2.f15469d.preceding(i2);
            }
        } else {
            C6979b bVar3 = aVar.f15465a;
            bVar3.mo19145a(i);
            if (bVar3.mo19148d(i)) {
                if (!bVar3.f15469d.isBoundary(i) || bVar3.mo19146b(i)) {
                    i5 = bVar3.f15469d.preceding(i);
                } else {
                    i2 = i;
                }
            } else if (bVar3.mo19146b(i)) {
                i5 = bVar3.f15469d.preceding(i);
            } else {
                i2 = -1;
            }
            i2 = i5;
        }
        if (i2 == -1) {
            i2 = i;
        }
        C6978a aVar2 = (C6978a) this.f4571f.getValue();
        C6979b bVar4 = aVar2.f15465a;
        bVar4.mo19145a(i);
        if (aVar2.f15465a.mo19147c(bVar4.f15469d.following(i))) {
            C6979b bVar5 = aVar2.f15465a;
            bVar5.mo19145a(i);
            i3 = i;
            while (i3 != -1) {
                if (!bVar5.mo19149e(i3) && bVar5.mo19147c(i3)) {
                    break;
                }
                bVar5.mo19145a(i3);
                i3 = bVar5.f15469d.following(i3);
            }
        } else {
            C6979b bVar6 = aVar2.f15465a;
            bVar6.mo19145a(i);
            if (bVar6.mo19146b(i)) {
                if (!bVar6.f15469d.isBoundary(i) || bVar6.mo19148d(i)) {
                    i4 = bVar6.f15469d.following(i);
                } else {
                    i3 = i;
                }
            } else if (bVar6.mo19148d(i)) {
                i4 = bVar6.f15469d.following(i);
            } else {
                i3 = -1;
            }
            i3 = i4;
        }
        if (i3 != -1) {
            i = i3;
        }
        return C0005b.m47l(i2, i);
    }

    /* renamed from: f */
    public final float mo7476f() {
        return this.f4569d.mo7424a(0);
    }

    /* renamed from: g */
    public final int mo7477g(long j) {
        C1930m mVar = this.f4569d;
        int lineForVertical = mVar.f4352b.getLineForVertical(mVar.f4354d + ((int) C8343c.m16643d(j)));
        C1930m mVar2 = this.f4569d;
        return mVar2.f4352b.getOffsetForHorizontal(lineForVertical, C8343c.m16642c(j));
    }

    public final float getHeight() {
        C1930m mVar = this.f4569d;
        return (float) ((mVar.f4351a ? mVar.f4352b.getLineBottom(mVar.f4353c - 1) : mVar.f4352b.getHeight()) + mVar.f4354d + mVar.f4355e);
    }

    /* renamed from: h */
    public final int mo7479h(int i) {
        return this.f4569d.f4352b.getLineStart(i);
    }

    /* renamed from: i */
    public final int mo7480i(int i, boolean z) {
        if (z) {
            C1930m mVar = this.f4569d;
            if (mVar.f4352b.getEllipsisStart(i) == 0) {
                return mVar.f4352b.getLineVisibleEnd(i);
            }
            return mVar.f4352b.getEllipsisStart(i) + mVar.f4352b.getLineStart(i);
        }
        C1930m mVar2 = this.f4569d;
        return mVar2.f4352b.getEllipsisStart(i) == 0 ? mVar2.f4352b.getLineEnd(i) : mVar2.f4352b.getText().length();
    }

    /* renamed from: j */
    public final float mo7481j(int i) {
        return this.f4569d.f4352b.getLineRight(i);
    }

    /* renamed from: k */
    public final int mo7482k(float f) {
        C1930m mVar = this.f4569d;
        return mVar.f4352b.getLineForVertical(mVar.f4354d + ((int) f));
    }

    /* renamed from: l */
    public final C1521g mo7483l(int i, int i2) {
        if (!(i >= 0 && i <= i2) || i2 > this.f4566a.f4579g.length()) {
            StringBuilder g = C0472h.m1244g("Start(", i, ") or End(", i2, ") is out of Range(0..");
            g.append(this.f4566a.f4579g.length());
            g.append("), or start > end!");
            throw new AssertionError(g.toString());
        }
        Path path = new Path();
        C1930m mVar = this.f4569d;
        mVar.getClass();
        mVar.f4352b.getSelectionPath(i, i2, path);
        if (mVar.f4354d != 0 && !path.isEmpty()) {
            path.offset(0.0f, (float) mVar.f4354d);
        }
        return new C1521g(path);
    }

    /* renamed from: m */
    public final float mo7484m(int i, boolean z) {
        return z ? C1930m.m4224d(this.f4569d, i) : ((C1918b) this.f4569d.f4357g.getValue()).mo7416a(i, false, false);
    }

    /* renamed from: n */
    public final float mo7485n(int i) {
        return this.f4569d.f4352b.getLineLeft(i);
    }

    /* renamed from: o */
    public final float mo7486o() {
        int i = this.f4567b;
        C1930m mVar = this.f4569d;
        int i2 = mVar.f4353c;
        return i < i2 ? mVar.mo7424a(i - 1) : mVar.mo7424a(i2 - 1);
    }

    /* renamed from: p */
    public final int mo7487p(int i) {
        return this.f4569d.f4352b.getLineForOffset(i);
    }

    /* renamed from: q */
    public final ResolvedTextDirection mo7488q(int i) {
        return this.f4569d.f4352b.isRtlCharAt(i) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    /* renamed from: r */
    public final float mo7489r(int i) {
        return this.f4569d.mo7425b(i);
    }

    /* renamed from: s */
    public final List<C8345d> mo7490s() {
        return this.f4570e;
    }

    /* renamed from: t */
    public final void mo7491t(C1537o oVar, long j, C1528j0 j0Var, C2030e eVar) {
        AndroidTextPaint androidTextPaint = this.f4566a.f4578f;
        androidTextPaint.m34825setColor8_81llA(j);
        androidTextPaint.setShadow(j0Var);
        androidTextPaint.setTextDecoration(eVar);
        Canvas canvas = C1493c.f3222a;
        Canvas canvas2 = ((C1491b) oVar).f3219a;
        if (this.f4569d.f4351a) {
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, mo7722v(), getHeight());
        }
        this.f4569d.mo7428f(canvas2);
        if (this.f4569d.f4351a) {
            canvas2.restore();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001c, code lost:
        r1 = r1.f4535b;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p015ui.text.android.C1930m mo7721u(int r14, int r15, android.text.TextUtils.TruncateAt r16, int r17) {
        /*
            r13 = this;
            r0 = r13
            androidx.compose.ui.text.platform.a r1 = r0.f4566a
            java.lang.CharSequence r3 = r1.f4579g
            float r4 = r13.mo7722v()
            androidx.compose.ui.text.platform.a r1 = r0.f4566a
            androidx.compose.ui.text.platform.AndroidTextPaint r5 = r1.f4578f
            int r8 = r1.f4582j
            androidx.compose.ui.text.android.c r12 = r1.f4580h
            androidx.compose.ui.text.s r1 = r1.f4573a
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            androidx.compose.ui.text.m r1 = r1.f4601c
            if (r1 == 0) goto L_0x0023
            androidx.compose.ui.text.k r1 = r1.f4535b
            if (r1 == 0) goto L_0x0023
            boolean r1 = r1.f4532a
            goto L_0x0024
        L_0x0023:
            r1 = 1
        L_0x0024:
            r9 = r1
            androidx.compose.ui.text.android.m r1 = new androidx.compose.ui.text.android.m
            r2 = r1
            r6 = r14
            r7 = r16
            r10 = r17
            r11 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.platform.AndroidParagraph.mo7721u(int, int, android.text.TextUtils$TruncateAt, int):androidx.compose.ui.text.android.m");
    }

    /* renamed from: v */
    public final float mo7722v() {
        return (float) C7280a.m13963h(this.f4568c);
    }
}
