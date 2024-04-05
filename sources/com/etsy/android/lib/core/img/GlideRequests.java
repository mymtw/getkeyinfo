package com.etsy.android.lib.core.img;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.C6127f;
import com.bumptech.glide.request.C6128g;
import java.io.File;
import java.net.URL;
import p273w4.C8239h;
import p273w4.C8242k;
import p455u9.C13447a;
import p455u9.C13448b;

public class GlideRequests extends RequestManager {
    public GlideRequests(Glide glide, C8239h hVar, C8242k kVar, Context context) {
        super(glide, hVar, kVar, context);
    }

    public void setRequestOptions(C6128g gVar) {
        if (gVar instanceof C13447a) {
            super.setRequestOptions(gVar);
        } else {
            super.setRequestOptions(new C13447a().mo16829a(gVar));
        }
    }

    public GlideRequests addDefaultRequestListener(C6127f<Object> fVar) {
        return (GlideRequests) super.addDefaultRequestListener(fVar);
    }

    public synchronized GlideRequests applyDefaultRequestOptions(C6128g gVar) {
        return (GlideRequests) super.applyDefaultRequestOptions(gVar);
    }

    /* renamed from: as */
    public <ResourceType> C13448b<ResourceType> m17024as(Class<ResourceType> cls) {
        return new C13448b<>(this.glide, this, cls, this.context);
    }

    public C13448b<Bitmap> asBitmap() {
        return (C13448b) super.asBitmap();
    }

    public C13448b<Drawable> asDrawable() {
        return (C13448b) super.asDrawable();
    }

    public C13448b<File> asFile() {
        return (C13448b) super.asFile();
    }

    public C13448b<GifDrawable> asGif() {
        return (C13448b) super.asGif();
    }

    public C13448b<File> download(Object obj) {
        return (C13448b) super.download(obj);
    }

    public C13448b<File> downloadOnly() {
        return (C13448b) super.downloadOnly();
    }

    public synchronized GlideRequests setDefaultRequestOptions(C6128g gVar) {
        return (GlideRequests) super.setDefaultRequestOptions(gVar);
    }

    public C13448b<Drawable> load(Bitmap bitmap) {
        return (C13448b) super.load(bitmap);
    }

    public C13448b<Drawable> load(Drawable drawable) {
        return (C13448b) super.load(drawable);
    }

    public C13448b<Drawable> load(String str) {
        return (C13448b) super.load(str);
    }

    public C13448b<Drawable> load(Uri uri) {
        return (C13448b) super.load(uri);
    }

    public C13448b<Drawable> load(File file) {
        return (C13448b) super.load(file);
    }

    public C13448b<Drawable> load(Integer num) {
        return (C13448b) super.load(num);
    }

    @Deprecated
    public C13448b<Drawable> load(URL url) {
        return (C13448b) super.load(url);
    }

    public C13448b<Drawable> load(byte[] bArr) {
        return (C13448b) super.load(bArr);
    }

    public C13448b<Drawable> load(Object obj) {
        return (C13448b) super.load(obj);
    }
}
