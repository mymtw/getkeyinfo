package p254u4;

import com.bumptech.glide.load.resource.gif.GifDrawable;
import p233s4.C7817c;

/* renamed from: u4.c */
public final class C8161c extends C7817c<GifDrawable> {
    public C8161c(GifDrawable gifDrawable) {
        super(gifDrawable);
    }

    /* renamed from: a */
    public final int mo16989a() {
        return ((GifDrawable) this.f17279b).getSize();
    }

    /* renamed from: b */
    public final void mo16990b() {
        ((GifDrawable) this.f17279b).stop();
        ((GifDrawable) this.f17279b).recycle();
    }

    /* renamed from: c */
    public final void mo16996c() {
        ((GifDrawable) this.f17279b).getFirstFrame().prepareToDraw();
    }

    /* renamed from: d */
    public final Class<GifDrawable> mo16992d() {
        return GifDrawable.class;
    }
}
