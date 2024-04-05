package androidx.compose.p015ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.play.core.appupdate.C15562d;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p174m0.C7287g;
import p174m0.C7290i;
import p288y.C8343c;
import p288y.C8345d;

/* renamed from: androidx.compose.ui.graphics.b */
public final class C1491b implements C1537o {

    /* renamed from: a */
    public Canvas f3219a = C1493c.f3222a;

    /* renamed from: b */
    public final Rect f3220b = new Rect();

    /* renamed from: c */
    public final Rect f3221c = new Rect();

    /* renamed from: a */
    public final void mo6250a(C8345d dVar, C1490a0 a0Var) {
        this.f3219a.saveLayer(dVar.f18301a, dVar.f18302b, dVar.f18303c, dVar.f18304d, a0Var.mo6243g(), 31);
    }

    /* renamed from: b */
    public final void mo6251b(float f, float f2) {
        this.f3219a.scale(f, f2);
    }

    /* renamed from: d */
    public final void mo6252d(float f, float f2, float f3, float f4, C1490a0 a0Var) {
        C19383o.m32797g(a0Var, "paint");
        this.f3219a.drawRect(f, f2, f3, f4, a0Var.mo6243g());
    }

    /* renamed from: e */
    public final void mo6253e(float f, float f2, float f3, float f4, C1490a0 a0Var) {
        this.f3219a.drawOval(f, f2, f3, f4, a0Var.mo6243g());
    }

    /* renamed from: f */
    public final void mo6254f(C1604x xVar, long j, long j2, long j3, long j4, C1490a0 a0Var) {
        C1604x xVar2 = xVar;
        C19383o.m32797g(xVar, ResponseConstants.IMAGE);
        Canvas canvas = this.f3219a;
        Bitmap j5 = C15562d.m25197j(xVar);
        Rect rect = this.f3220b;
        int i = C7287g.f16165c;
        int i2 = (int) (j >> 32);
        rect.left = i2;
        rect.top = C7287g.m13992b(j);
        rect.right = i2 + ((int) (j2 >> 32));
        rect.bottom = C7290i.m13995b(j2) + C7287g.m13992b(j);
        C19394m mVar = C19394m.f43287a;
        Rect rect2 = this.f3221c;
        int i3 = (int) (j3 >> 32);
        rect2.left = i3;
        rect2.top = C7287g.m13992b(j3);
        rect2.right = i3 + ((int) (j4 >> 32));
        rect2.bottom = C7290i.m13995b(j4) + C7287g.m13992b(j3);
        canvas.drawBitmap(j5, rect, rect2, a0Var.mo6243g());
    }

    /* renamed from: g */
    public final void mo6255g(C1604x xVar, long j, C1490a0 a0Var) {
        C19383o.m32797g(xVar, ResponseConstants.IMAGE);
        this.f3219a.drawBitmap(C15562d.m25197j(xVar), C8343c.m16642c(j), C8343c.m16643d(j), a0Var.mo6243g());
    }

    /* renamed from: h */
    public final void mo6256h(float f, float f2, float f3, float f4, float f5, float f6, C1490a0 a0Var) {
        this.f3219a.drawArc(f, f2, f3, f4, f5, f6, false, a0Var.mo6243g());
    }

    /* renamed from: i */
    public final void mo6257i(C1490a0 a0Var, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            long j = ((C8343c) arrayList.get(i)).f18299a;
            this.f3219a.drawPoint(C8343c.m16642c(j), C8343c.m16643d(j), a0Var.mo6243g());
        }
    }

    /* renamed from: j */
    public final void mo6258j(float f, float f2, float f3, float f4, int i) {
        this.f3219a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    /* renamed from: k */
    public final void mo6259k(C1492b0 b0Var, int i) {
        C19383o.m32797g(b0Var, ResponseConstants.PATH);
        Canvas canvas = this.f3219a;
        if (b0Var instanceof C1521g) {
            canvas.clipPath(((C1521g) b0Var).f3296a, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: l */
    public final void mo6260l(float f, float f2) {
        this.f3219a.translate(f, f2);
    }

    /* renamed from: m */
    public final void mo6261m() {
        this.f3219a.restore();
    }

    /* renamed from: o */
    public final void mo6262o() {
        C1542q.m3352a(this.f3219a, true);
    }

    /* renamed from: q */
    public final void mo6263q(long j, long j2, C1490a0 a0Var) {
        this.f3219a.drawLine(C8343c.m16642c(j), C8343c.m16643d(j), C8343c.m16642c(j2), C8343c.m16643d(j2), a0Var.mo6243g());
    }

    /* renamed from: r */
    public final void mo6264r() {
        this.f3219a.save();
    }

    /* renamed from: s */
    public final void mo6265s() {
        C1542q.m3352a(this.f3219a, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00de  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6266t(float[] r24) {
        /*
            r23 = this;
            r0 = r24
            r1 = 0
            r2 = r1
        L_0x0004:
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r5 = 4
            r6 = 1
            if (r2 >= r5) goto L_0x0029
            r7 = r1
        L_0x000c:
            if (r7 >= r5) goto L_0x0026
            if (r2 != r7) goto L_0x0012
            r8 = r3
            goto L_0x0013
        L_0x0012:
            r8 = r4
        L_0x0013:
            int r9 = r2 * 4
            int r9 = r9 + r7
            r9 = r0[r9]
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x001e
            r8 = r6
            goto L_0x001f
        L_0x001e:
            r8 = r1
        L_0x001f:
            if (r8 != 0) goto L_0x0023
            r2 = r1
            goto L_0x002a
        L_0x0023:
            int r7 = r7 + 1
            goto L_0x000c
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0029:
            r2 = r6
        L_0x002a:
            if (r2 != 0) goto L_0x00ec
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            r7 = 2
            r8 = r0[r7]
            int r9 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x003a
            r9 = r6
            goto L_0x003b
        L_0x003a:
            r9 = r1
        L_0x003b:
            r10 = 8
            r11 = 6
            if (r9 == 0) goto L_0x008c
            r9 = r0[r11]
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x0048
            r9 = r6
            goto L_0x0049
        L_0x0048:
            r9 = r1
        L_0x0049:
            if (r9 == 0) goto L_0x008c
            r9 = 10
            r9 = r0[r9]
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0055
            r3 = r6
            goto L_0x0056
        L_0x0055:
            r3 = r1
        L_0x0056:
            if (r3 == 0) goto L_0x008c
            r3 = 14
            r3 = r0[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0062
            r3 = r6
            goto L_0x0063
        L_0x0062:
            r3 = r1
        L_0x0063:
            if (r3 == 0) goto L_0x008c
            r3 = r0[r10]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x006d
            r3 = r6
            goto L_0x006e
        L_0x006d:
            r3 = r1
        L_0x006e:
            if (r3 == 0) goto L_0x008c
            r3 = 9
            r3 = r0[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x007a
            r3 = r6
            goto L_0x007b
        L_0x007a:
            r3 = r1
        L_0x007b:
            if (r3 == 0) goto L_0x008c
            r3 = 11
            r3 = r0[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0087
            r3 = r6
            goto L_0x0088
        L_0x0087:
            r3 = r1
        L_0x0088:
            if (r3 == 0) goto L_0x008c
            r3 = r6
            goto L_0x008d
        L_0x008c:
            r3 = r1
        L_0x008d:
            if (r3 == 0) goto L_0x00de
            r3 = r0[r1]
            r4 = r0[r6]
            r9 = 3
            r12 = r0[r9]
            r13 = r0[r5]
            r14 = 5
            r15 = r0[r14]
            r16 = r0[r11]
            r17 = 7
            r18 = r0[r17]
            r19 = r0[r10]
            r20 = 12
            r20 = r0[r20]
            r21 = 13
            r21 = r0[r21]
            r22 = 15
            r22 = r0[r22]
            r0[r1] = r3
            r0[r6] = r13
            r0[r7] = r20
            r0[r9] = r4
            r0[r5] = r15
            r0[r14] = r21
            r0[r11] = r12
            r0[r17] = r18
            r0[r10] = r22
            r2.setValues(r0)
            r0[r1] = r3
            r0[r6] = r4
            r0[r7] = r8
            r0[r9] = r12
            r0[r5] = r13
            r0[r14] = r15
            r0[r11] = r16
            r0[r17] = r18
            r0[r10] = r19
            r0 = r23
            android.graphics.Canvas r1 = r0.f3219a
            r1.concat(r2)
            goto L_0x00ee
        L_0x00de:
            r0 = r23
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Android does not support arbitrary transforms"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00ec:
            r0 = r23
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.C1491b.mo6266t(float[]):void");
    }

    /* renamed from: u */
    public final void mo6267u(C1492b0 b0Var, C1490a0 a0Var) {
        C19383o.m32797g(b0Var, ResponseConstants.PATH);
        Canvas canvas = this.f3219a;
        if (b0Var instanceof C1521g) {
            canvas.drawPath(((C1521g) b0Var).f3296a, a0Var.mo6243g());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: v */
    public final void mo6268v() {
        this.f3219a.rotate(45.0f);
    }

    /* renamed from: w */
    public final void mo6269w(float f, long j, C1490a0 a0Var) {
        this.f3219a.drawCircle(C8343c.m16642c(j), C8343c.m16643d(j), f, a0Var.mo6243g());
    }

    /* renamed from: x */
    public final void mo6270x(float f, float f2, float f3, float f4, float f5, float f6, C1490a0 a0Var) {
        this.f3219a.drawRoundRect(f, f2, f3, f4, f5, f6, a0Var.mo6243g());
    }

    /* renamed from: y */
    public final Canvas mo6271y() {
        return this.f3219a;
    }

    /* renamed from: z */
    public final void mo6272z(Canvas canvas) {
        C19383o.m32797g(canvas, "<set-?>");
        this.f3219a = canvas;
    }
}
