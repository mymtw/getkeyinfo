package p728zk;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.p015ui.text.input.C1993m;

/* renamed from: zk.k */
public final class C18954k extends C18952i<C18962q> {

    /* renamed from: c */
    public float f42259c = 300.0f;

    /* renamed from: d */
    public float f42260d;

    /* renamed from: e */
    public float f42261e;

    public C18954k(C18962q qVar) {
        super(qVar);
    }

    /* renamed from: a */
    public final void mo70377a(Canvas canvas, float f) {
        Rect clipBounds = canvas.getClipBounds();
        this.f42259c = (float) clipBounds.width();
        float f2 = (float) ((C18962q) this.f42254a).f42224a;
        canvas.translate((((float) clipBounds.width()) / 2.0f) + ((float) clipBounds.left), Math.max(0.0f, ((float) (clipBounds.height() - ((C18962q) this.f42254a).f42224a)) / 2.0f) + (((float) clipBounds.height()) / 2.0f) + ((float) clipBounds.top));
        if (((C18962q) this.f42254a).f42285i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f42255b.isShowing() && ((C18962q) this.f42254a).f42228e == 1) || (this.f42255b.isHiding() && ((C18962q) this.f42254a).f42229f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f42255b.isShowing() || this.f42255b.isHiding()) {
            canvas.translate(0.0f, ((f - 1.0f) * ((float) ((C18962q) this.f42254a).f42224a)) / 2.0f);
        }
        float f3 = this.f42259c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        S s = this.f42254a;
        this.f42260d = ((float) ((C18962q) s).f42224a) * f;
        this.f42261e = ((float) ((C18962q) s).f42225b) * f;
    }

    /* renamed from: b */
    public final void mo70378b(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f != f2) {
            float f3 = this.f42259c;
            float f4 = (-f3) / 2.0f;
            float f5 = this.f42261e * 2.0f;
            float f6 = f3 - f5;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            paint.setColor(i);
            float f7 = this.f42260d;
            RectF rectF = new RectF((f * f6) + f4, (-f7) / 2.0f, (f6 * f2) + f4 + f5, f7 / 2.0f);
            float f8 = this.f42261e;
            canvas.drawRoundRect(rectF, f8, f8, paint);
        }
    }

    /* renamed from: c */
    public final void mo70379c(Canvas canvas, Paint paint) {
        int u = C1993m.m4375u(((C18962q) this.f42254a).f42227d, this.f42255b.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(u);
        float f = this.f42259c;
        float f2 = this.f42260d;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.f42261e;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }

    /* renamed from: d */
    public final int mo70380d() {
        return ((C18962q) this.f42254a).f42224a;
    }

    /* renamed from: e */
    public final int mo70381e() {
        return -1;
    }
}
