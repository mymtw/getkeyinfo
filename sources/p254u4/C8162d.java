package p254u4;

import android.graphics.Bitmap;
import androidx.activity.C0114h;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.load.engine.C6051s;
import com.bumptech.glide.load.resource.bitmap.C6081e;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.security.MessageDigest;
import p150j4.C7117h;

/* renamed from: u4.d */
public final class C8162d implements C7117h<GifDrawable> {

    /* renamed from: b */
    public final C7117h<Bitmap> f17916b;

    public C8162d(C7117h<Bitmap> hVar) {
        C0114h.m281L(hVar);
        this.f17916b = hVar;
    }

    /* renamed from: a */
    public final C6051s mo17034a(GlideContext glideContext, C6051s sVar, int i, int i2) {
        GifDrawable gifDrawable = (GifDrawable) sVar.get();
        C6081e eVar = new C6081e(gifDrawable.getFirstFrame(), Glide.get(glideContext).getBitmapPool());
        C6051s a = this.f17916b.mo17034a(glideContext, eVar, i, i2);
        if (!eVar.equals(a)) {
            eVar.mo16990b();
        }
        gifDrawable.setFrameTransformation(this.f17916b, (Bitmap) a.get());
        return sVar;
    }

    /* renamed from: b */
    public final void mo12991b(MessageDigest messageDigest) {
        this.f17916b.mo12991b(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8162d) {
            return this.f17916b.equals(((C8162d) obj).f17916b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17916b.hashCode();
    }
}
