package p183n;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: n.d */
public final class C7357d extends Drawable {

    /* renamed from: a */
    public float f16372a;

    /* renamed from: b */
    public final Paint f16373b;

    /* renamed from: c */
    public final RectF f16374c;

    /* renamed from: d */
    public final Rect f16375d;

    /* renamed from: e */
    public float f16376e;

    /* renamed from: f */
    public boolean f16377f = false;

    /* renamed from: g */
    public boolean f16378g = true;

    /* renamed from: h */
    public ColorStateList f16379h;

    /* renamed from: i */
    public PorterDuffColorFilter f16380i;

    /* renamed from: j */
    public ColorStateList f16381j;

    /* renamed from: k */
    public PorterDuff.Mode f16382k = PorterDuff.Mode.SRC_IN;

    public C7357d(float f, ColorStateList colorStateList) {
        this.f16372a = f;
        this.f16373b = new Paint(5);
        mo19635b(colorStateList);
        this.f16374c = new RectF();
        this.f16375d = new Rect();
    }

    /* renamed from: a */
    public final PorterDuffColorFilter mo19634a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: b */
    public final void mo19635b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f16379h = colorStateList;
        this.f16373b.setColor(colorStateList.getColorForState(getState(), this.f16379h.getDefaultColor()));
    }

    /* renamed from: c */
    public final void mo19636c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f16374c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f16375d.set(rect);
        if (this.f16377f) {
            float a = C7358e.m14159a(this.f16376e, this.f16372a, this.f16378g);
            float f = this.f16376e;
            float f2 = this.f16372a;
            if (this.f16378g) {
                f = (float) (((1.0d - C7358e.f16383a) * ((double) f2)) + ((double) f));
            }
            this.f16375d.inset((int) Math.ceil((double) f), (int) Math.ceil((double) a));
            this.f16374c.set(this.f16375d);
        }
    }

    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f16373b;
        if (this.f16380i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f16380i);
            z = true;
        }
        RectF rectF = this.f16374c;
        float f = this.f16372a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f16375d, this.f16372a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f16379h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f16381j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f16379h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p183n.C7357d.isStateful():boolean");
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        mo19636c(rect);
    }

    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f16379h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f16373b.getColor();
        if (z) {
            this.f16373b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f16381j;
        if (colorStateList2 == null || (mode = this.f16382k) == null) {
            return z;
        }
        this.f16380i = mo19634a(colorStateList2, mode);
        return true;
    }

    public final void setAlpha(int i) {
        this.f16373b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f16373b.setColorFilter(colorFilter);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f16381j = colorStateList;
        this.f16380i = mo19634a(colorStateList, this.f16382k);
        invalidateSelf();
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.f16382k = mode;
        this.f16380i = mo19634a(this.f16381j, mode);
        invalidateSelf();
    }
}
