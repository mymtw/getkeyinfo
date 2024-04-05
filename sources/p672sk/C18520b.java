package p672sk;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.etsy.android.R;
import com.google.android.material.internal.C15367g;
import p610kp.C18161c;

/* renamed from: sk.b */
public final class C18520b {
    /* renamed from: a */
    public static Rect m31248a(int i, Context context, int i2) {
        TypedArray d = C15367g.m24957d(context, (AttributeSet) null, C18161c.f39722z, i, i2, new int[0]);
        int dimensionPixelSize = d.getDimensionPixelSize(2, context.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = d.getDimensionPixelSize(3, context.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = d.getDimensionPixelSize(1, context.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = d.getDimensionPixelSize(0, context.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        d.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            int i3 = dimensionPixelSize3;
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = i3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }
}
