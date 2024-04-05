package p728zk;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.compose.p015ui.text.input.C1993m;

/* renamed from: zk.c */
public final class C18941c extends C18952i<C18947g> {

    /* renamed from: c */
    public int f42230c = 1;

    /* renamed from: d */
    public float f42231d;

    /* renamed from: e */
    public float f42232e;

    /* renamed from: f */
    public float f42233f;

    public C18941c(C18947g gVar) {
        super(gVar);
    }

    /* renamed from: a */
    public final void mo70377a(Canvas canvas, float f) {
        S s = this.f42254a;
        float f2 = (((float) ((C18947g) s).f42249g) / 2.0f) + ((float) ((C18947g) s).f42250h);
        canvas.translate(f2, f2);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        S s2 = this.f42254a;
        this.f42230c = ((C18947g) s2).f42251i == 0 ? 1 : -1;
        this.f42231d = ((float) ((C18947g) s2).f42224a) * f;
        this.f42232e = ((float) ((C18947g) s2).f42225b) * f;
        this.f42233f = ((float) (((C18947g) s2).f42249g - ((C18947g) s2).f42224a)) / 2.0f;
        if ((this.f42255b.isShowing() && ((C18947g) this.f42254a).f42228e == 2) || (this.f42255b.isHiding() && ((C18947g) this.f42254a).f42229f == 1)) {
            this.f42233f = (((1.0f - f) * ((float) ((C18947g) this.f42254a).f42224a)) / 2.0f) + this.f42233f;
        } else if ((this.f42255b.isShowing() && ((C18947g) this.f42254a).f42228e == 1) || (this.f42255b.isHiding() && ((C18947g) this.f42254a).f42229f == 2)) {
            this.f42233f -= ((1.0f - f) * ((float) ((C18947g) this.f42254a).f42224a)) / 2.0f;
        }
    }

    /* renamed from: b */
    public final void mo70378b(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f != f2) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(this.f42231d);
            float f3 = (float) this.f42230c;
            float f4 = f * 360.0f * f3;
            if (f2 < f) {
                f2 += 1.0f;
            }
            float f5 = (f2 - f) * 360.0f * f3;
            float f6 = this.f42233f;
            float f7 = -f6;
            canvas.drawArc(new RectF(f7, f7, f6, f6), f4, f5, false, paint);
            if (this.f42232e > 0.0f && Math.abs(f5) < 360.0f) {
                paint.setStyle(Paint.Style.FILL);
                float f8 = this.f42231d;
                float f9 = this.f42232e;
                canvas.save();
                canvas.rotate(f4);
                float f10 = this.f42233f;
                float f11 = f8 / 2.0f;
                canvas.drawRoundRect(new RectF(f10 - f11, f9, f10 + f11, -f9), f9, f9, paint);
                canvas.restore();
                float f12 = this.f42231d;
                float f13 = this.f42232e;
                canvas.save();
                canvas.rotate(f4 + f5);
                float f14 = this.f42233f;
                float f15 = f12 / 2.0f;
                canvas.drawRoundRect(new RectF(f14 - f15, f13, f14 + f15, -f13), f13, f13, paint);
                canvas.restore();
            }
        }
    }

    /* renamed from: c */
    public final void mo70379c(Canvas canvas, Paint paint) {
        int u = C1993m.m4375u(((C18947g) this.f42254a).f42227d, this.f42255b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(u);
        paint.setStrokeWidth(this.f42231d);
        float f = this.f42233f;
        canvas.drawArc(new RectF(-f, -f, f, f), 0.0f, 360.0f, false, paint);
    }

    /* renamed from: d */
    public final int mo70380d() {
        C18947g gVar = (C18947g) this.f42254a;
        return (gVar.f42250h * 2) + gVar.f42249g;
    }

    /* renamed from: e */
    public final int mo70381e() {
        C18947g gVar = (C18947g) this.f42254a;
        return (gVar.f42250h * 2) + gVar.f42249g;
    }
}
