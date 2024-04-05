package p302z4;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: z4.f */
public abstract class C8445f<Z> extends C8449j<ImageView, Z> {

    /* renamed from: d */
    public Animatable f18465d;

    public C8445f(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: b */
    public final void mo16750b(Object obj) {
        mo21021e(obj);
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.f18465d = animatable;
            animatable.start();
            return;
        }
        this.f18465d = null;
    }

    /* renamed from: c */
    public final void mo16751c(Drawable drawable) {
        mo21021e((Object) null);
        this.f18465d = null;
        ((ImageView) this.f18466b).setImageDrawable(drawable);
    }

    /* renamed from: d */
    public final void mo16752d(Drawable drawable) {
        super.mo16752d(drawable);
        Animatable animatable = this.f18465d;
        if (animatable != null) {
            animatable.stop();
        }
        mo21021e((Object) null);
        this.f18465d = null;
        ((ImageView) this.f18466b).setImageDrawable(drawable);
    }

    /* renamed from: e */
    public abstract void mo21021e(Z z);

    /* renamed from: i */
    public final void mo16755i(Drawable drawable) {
        mo21021e((Object) null);
        this.f18465d = null;
        ((ImageView) this.f18466b).setImageDrawable(drawable);
    }

    public final void onStart() {
        Animatable animatable = this.f18465d;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void onStop() {
        Animatable animatable = this.f18465d;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
