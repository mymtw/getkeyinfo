package com.etsy.android.p327ui.cart.viewholders;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cart.viewholders.PaypalLogoImageSpan */
public final class PaypalLogoImageSpan extends ImageSpan {
    public static final int $stable = 8;
    private WeakReference<Drawable> drawableRef;
    private final Resources res;
    private final int verticalOffset;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaypalLogoImageSpan(Context context, Drawable drawable) {
        super(drawable, 1);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32794d(drawable);
        Resources resources = context.getResources();
        C19383o.m32796f(resources, "context.resources");
        this.res = resources;
        this.verticalOffset = resources.getDimensionPixelOffset(R.dimen.msco_paypal_logo_vertical_offset);
    }

    private final Drawable getCachedDrawable() {
        WeakReference<Drawable> weakReference = this.drawableRef;
        Drawable drawable = weakReference != null ? weakReference.get() : null;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = getDrawable();
        this.drawableRef = new WeakReference<>(drawable2);
        return drawable2;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C19383o.m32797g(canvas, "canvas");
        C19383o.m32797g(charSequence, "text");
        C19383o.m32797g(paint, "paint");
        Drawable cachedDrawable = getCachedDrawable();
        if (cachedDrawable != null) {
            canvas.save();
            int i6 = i5 - cachedDrawable.getBounds().bottom;
            if (getVerticalAlignment() == 1) {
                i6 -= paint.getFontMetricsInt().descent;
            }
            canvas.translate(f, (float) (i6 + this.verticalOffset));
            cachedDrawable.draw(canvas);
            canvas.restore();
        }
    }
}
