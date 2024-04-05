package p455u9;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.C6127f;
import com.etsy.android.lib.util.CrashUtil;
import p302z4.C8448i;

/* renamed from: u9.c */
public class C13449c implements C6127f<Drawable> {

    /* renamed from: b */
    public ImageView f29466b;

    public C13449c(ImageView imageView) {
        this.f29466b = imageView;
    }

    /* renamed from: a */
    public void mo38983a(Bitmap bitmap) {
        ImageView imageView = this.f29466b;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
            this.f29466b.setVisibility(0);
        }
    }

    /* renamed from: f */
    public final boolean mo17169f(GlideException glideException, Object obj, C8448i iVar) {
        return true;
    }

    /* renamed from: h */
    public final boolean mo17172h(Object obj, Object obj2, C8448i iVar, DataSource dataSource) {
        Drawable drawable = (Drawable) obj;
        if (drawable instanceof BitmapDrawable) {
            mo38983a(((BitmapDrawable) drawable).getBitmap());
            return true;
        }
        CrashUtil.m17307a().mo30457b(new IllegalStateException("onResourceReady called with a non-Bitmap Drawable"));
        return false;
    }
}
