package p233s4;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.activity.C0114h;
import com.bumptech.glide.load.engine.C6047p;
import com.bumptech.glide.load.engine.C6051s;
import com.bumptech.glide.load.resource.gif.GifDrawable;

/* renamed from: s4.c */
public abstract class C7817c<T extends Drawable> implements C6051s<T>, C6047p {

    /* renamed from: b */
    public final T f17279b;

    public C7817c(T t) {
        C0114h.m281L(t);
        this.f17279b = t;
    }

    /* renamed from: c */
    public void mo16996c() {
        T t = this.f17279b;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof GifDrawable) {
            ((GifDrawable) t).getFirstFrame().prepareToDraw();
        }
    }

    public final Object get() {
        Drawable.ConstantState constantState = this.f17279b.getConstantState();
        return constantState == null ? this.f17279b : constantState.newDrawable();
    }
}
