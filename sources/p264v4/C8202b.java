package p264v4;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.C6051s;
import com.bumptech.glide.load.engine.bitmap_recycle.C5998d;
import com.bumptech.glide.load.resource.bitmap.C6081e;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import kotlin.reflect.C19421p;
import p150j4.C7114e;

/* renamed from: v4.b */
public final class C8202b implements C8203c<Drawable, byte[]> {

    /* renamed from: b */
    public final C5998d f17997b;

    /* renamed from: c */
    public final C8203c<Bitmap, byte[]> f17998c;

    /* renamed from: d */
    public final C8203c<GifDrawable, byte[]> f17999d;

    public C8202b(C5998d dVar, C8201a aVar, C19421p pVar) {
        this.f17997b = dVar;
        this.f17998c = aVar;
        this.f17999d = pVar;
    }

    /* renamed from: k */
    public final C6051s<byte[]> mo4161k(C6051s<Drawable> sVar, C7114e eVar) {
        Drawable drawable = sVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f17998c.mo4161k(C6081e.m12065e(((BitmapDrawable) drawable).getBitmap(), this.f17997b), eVar);
        }
        if (drawable instanceof GifDrawable) {
            return this.f17999d.mo4161k(sVar, eVar);
        }
        return null;
    }
}
