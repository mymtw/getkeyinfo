package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* renamed from: com.squareup.picasso.l */
public final class C17450l extends C17425a<ImageView> {

    /* renamed from: m */
    public C17439e f38125m;

    public C17450l(Picasso picasso, ImageView imageView, C17459s sVar, String str, C17439e eVar) {
        super(picasso, imageView, sVar, str);
        this.f38125m = eVar;
    }

    /* renamed from: a */
    public final void mo68583a() {
        this.f38067l = true;
        if (this.f38125m != null) {
            this.f38125m = null;
        }
    }

    /* renamed from: b */
    public final void mo68584b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f38058c.get();
            if (imageView != null) {
                Picasso picasso = this.f38056a;
                Bitmap bitmap2 = bitmap;
                Picasso.LoadedFrom loadedFrom2 = loadedFrom;
                C17456q.m29311a(imageView, picasso.f38042c, bitmap2, loadedFrom2, this.f38059d, picasso.f38050k);
                C17439e eVar = this.f38125m;
                if (eVar != null) {
                    eVar.onSuccess();
                    return;
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    /* renamed from: c */
    public final void mo68585c(Exception exc) {
        ImageView imageView = (ImageView) this.f38058c.get();
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            }
            int i = this.f38062g;
            if (i != 0) {
                imageView.setImageResource(i);
            } else {
                Drawable drawable2 = this.f38063h;
                if (drawable2 != null) {
                    imageView.setImageDrawable(drawable2);
                }
            }
            C17439e eVar = this.f38125m;
            if (eVar != null) {
                eVar.onError(exc);
            }
        }
    }
}
