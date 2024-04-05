package p357gf;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;

/* renamed from: gf.b */
public final class C12793b {
    /* renamed from: a */
    public static Drawable m20434a(int i, Context context, int i2) {
        Drawable mutate = VectorDrawableCompat.create(context.getResources(), i, context.getTheme()).mutate();
        mutate.setTint(context.getResources().getColor(i2));
        return mutate;
    }
}
