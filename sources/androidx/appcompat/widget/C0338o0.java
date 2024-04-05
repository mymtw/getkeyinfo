package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.o0 */
public final class C0338o0 extends C0327j0 {

    /* renamed from: a */
    public final WeakReference<Context> f872a;

    public C0338o0(Context context, Resources resources) {
        super(resources);
        this.f872a = new WeakReference<>(context);
    }

    public final Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawableCanonical = getDrawableCanonical(i);
        Context context = this.f872a.get();
        if (!(drawableCanonical == null || context == null)) {
            C0323i0.m848c().mo3070k(i, context, drawableCanonical);
        }
        return drawableCanonical;
    }
}
