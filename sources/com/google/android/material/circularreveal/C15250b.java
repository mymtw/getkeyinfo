package com.google.android.material.circularreveal;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.circularreveal.CircularRevealWidget;
import kotlin.jvm.internal.C19382n;

/* renamed from: com.google.android.material.circularreveal.b */
public final class C15250b {

    /* renamed from: a */
    public final C15251a f34201a;

    /* renamed from: b */
    public final View f34202b;

    /* renamed from: c */
    public final Paint f34203c;

    /* renamed from: d */
    public CircularRevealWidget.C15248a f34204d;

    /* renamed from: e */
    public Drawable f34205e;

    /* renamed from: com.google.android.material.circularreveal.b$a */
    public interface C15251a {
        void actualDraw(Canvas canvas);

        boolean actualIsOpaque();
    }

    public C15250b(C15251a aVar) {
        this.f34201a = aVar;
        View view = (View) aVar;
        this.f34202b = view;
        view.setWillNotDraw(false);
        new Path();
        new Paint(7);
        Paint paint = new Paint(1);
        this.f34203c = paint;
        paint.setColor(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53729a(android.graphics.Canvas r10) {
        /*
            r9 = this;
            com.google.android.material.circularreveal.CircularRevealWidget$a r0 = r9.f34204d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0017
            float r0 = r0.f34200c
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = r1
            goto L_0x0018
        L_0x0017:
            r0 = r2
        L_0x0018:
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0048
            com.google.android.material.circularreveal.b$a r0 = r9.f34201a
            r0.actualDraw(r10)
            android.graphics.Paint r0 = r9.f34203c
            int r0 = r0.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L_0x002e
            r0 = r2
            goto L_0x002f
        L_0x002e:
            r0 = r1
        L_0x002f:
            if (r0 == 0) goto L_0x0074
            r4 = 0
            r5 = 0
            android.view.View r0 = r9.f34202b
            int r0 = r0.getWidth()
            float r6 = (float) r0
            android.view.View r0 = r9.f34202b
            int r0 = r0.getHeight()
            float r7 = (float) r0
            android.graphics.Paint r8 = r9.f34203c
            r3 = r10
            r3.drawRect(r4, r5, r6, r7, r8)
            goto L_0x0074
        L_0x0048:
            com.google.android.material.circularreveal.b$a r0 = r9.f34201a
            r0.actualDraw(r10)
            android.graphics.Paint r0 = r9.f34203c
            int r0 = r0.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L_0x005b
            r0 = r2
            goto L_0x005c
        L_0x005b:
            r0 = r1
        L_0x005c:
            if (r0 == 0) goto L_0x0074
            r4 = 0
            r5 = 0
            android.view.View r0 = r9.f34202b
            int r0 = r0.getWidth()
            float r6 = (float) r0
            android.view.View r0 = r9.f34202b
            int r0 = r0.getHeight()
            float r7 = (float) r0
            android.graphics.Paint r8 = r9.f34203c
            r3 = r10
            r3.drawRect(r4, r5, r6, r7, r8)
        L_0x0074:
            android.graphics.drawable.Drawable r0 = r9.f34205e
            if (r0 == 0) goto L_0x007d
            com.google.android.material.circularreveal.CircularRevealWidget$a r3 = r9.f34204d
            if (r3 == 0) goto L_0x007d
            r1 = r2
        L_0x007d:
            if (r1 == 0) goto L_0x00a8
            android.graphics.Rect r0 = r0.getBounds()
            com.google.android.material.circularreveal.CircularRevealWidget$a r1 = r9.f34204d
            float r1 = r1.f34198a
            int r2 = r0.width()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r1 = r1 - r2
            com.google.android.material.circularreveal.CircularRevealWidget$a r2 = r9.f34204d
            float r2 = r2.f34199b
            int r0 = r0.height()
            float r0 = (float) r0
            float r0 = r0 / r3
            float r2 = r2 - r0
            r10.translate(r1, r2)
            android.graphics.drawable.Drawable r0 = r9.f34205e
            r0.draw(r10)
            float r0 = -r1
            float r1 = -r2
            r10.translate(r0, r1)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.C15250b.mo53729a(android.graphics.Canvas):void");
    }

    /* renamed from: b */
    public final int mo53730b() {
        return this.f34203c.getColor();
    }

    /* renamed from: c */
    public final CircularRevealWidget.C15248a mo53731c() {
        CircularRevealWidget.C15248a aVar = this.f34204d;
        if (aVar == null) {
            return null;
        }
        CircularRevealWidget.C15248a aVar2 = new CircularRevealWidget.C15248a(aVar);
        if (aVar2.f34200c == Float.MAX_VALUE) {
            aVar2.f34200c = C19382n.m32736X(aVar2.f34198a, aVar2.f34199b, (float) this.f34202b.getWidth(), (float) this.f34202b.getHeight());
        }
        return aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo53732d() {
        /*
            r4 = this;
            com.google.android.material.circularreveal.b$a r0 = r4.f34201a
            boolean r0 = r0.actualIsOpaque()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0024
            com.google.android.material.circularreveal.CircularRevealWidget$a r0 = r4.f34204d
            if (r0 == 0) goto L_0x001f
            float r0 = r0.f34200c
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0019
            r0 = r2
            goto L_0x001a
        L_0x0019:
            r0 = r1
        L_0x001a:
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            r0 = r0 ^ r2
            if (r0 != 0) goto L_0x0024
            r1 = r2
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.C15250b.mo53732d():boolean");
    }

    /* renamed from: e */
    public final void mo53733e(Drawable drawable) {
        this.f34205e = drawable;
        this.f34202b.invalidate();
    }

    /* renamed from: f */
    public final void mo53734f(int i) {
        this.f34203c.setColor(i);
        this.f34202b.invalidate();
    }

    /* renamed from: g */
    public final void mo53735g(CircularRevealWidget.C15248a aVar) {
        if (aVar == null) {
            this.f34204d = null;
        } else {
            CircularRevealWidget.C15248a aVar2 = this.f34204d;
            if (aVar2 == null) {
                this.f34204d = new CircularRevealWidget.C15248a(aVar);
            } else {
                float f = aVar.f34198a;
                float f2 = aVar.f34199b;
                float f3 = aVar.f34200c;
                aVar2.f34198a = f;
                aVar2.f34199b = f2;
                aVar2.f34200c = f3;
            }
            if (aVar.f34200c + 1.0E-4f >= C19382n.m32736X(aVar.f34198a, aVar.f34199b, (float) this.f34202b.getWidth(), (float) this.f34202b.getHeight())) {
                this.f34204d.f34200c = Float.MAX_VALUE;
            }
        }
        this.f34202b.invalidate();
    }
}
