package com.google.android.material.textfield;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.shape.C15401a;
import com.google.android.material.shape.MaterialShapeDrawable;

/* renamed from: com.google.android.material.textfield.g */
public final class C15485g extends MaterialShapeDrawable {

    /* renamed from: b */
    public final Paint f34756b;

    /* renamed from: c */
    public final RectF f34757c;

    /* renamed from: d */
    public int f34758d;

    public C15485g() {
        this((C15401a) null);
    }

    /* renamed from: a */
    public final void mo55107a(float f, float f2, float f3, float f4) {
        RectF rectF = this.f34757c;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
            }
        } else {
            this.f34758d = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
        }
        super.draw(canvas);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.f34758d);
        }
    }

    public final void drawStrokeShape(Canvas canvas) {
        if (this.f34757c.isEmpty()) {
            super.drawStrokeShape(canvas);
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        super.drawStrokeShape(canvas2);
        canvas2.drawRect(this.f34757c, this.f34756b);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15485g(C15401a aVar) {
        super(aVar == null ? new C15401a() : aVar);
        Paint paint = new Paint(1);
        this.f34756b = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f34757c = new RectF();
    }
}
