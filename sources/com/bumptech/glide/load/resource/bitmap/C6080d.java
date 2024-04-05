package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.C5999e;
import com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener;
import java.io.IOException;
import p150j4.C7114e;
import p150j4.C7115f;

/* renamed from: com.bumptech.glide.load.resource.bitmap.d */
public final class C6080d implements C7115f<ImageDecoder.Source, Bitmap> {

    /* renamed from: a */
    public final C5999e f13078a = new C5999e();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo17023a(Object obj, C7114e eVar) throws IOException {
        ImageDecoder.Source source = (ImageDecoder.Source) obj;
        return true;
    }

    /* renamed from: c */
    public final C6081e mo17024b(ImageDecoder.Source source, int i, int i2, C7114e eVar) throws IOException {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new DefaultOnHeaderDecodedListener(i, i2, eVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            decodeBitmap.getWidth();
            decodeBitmap.getHeight();
        }
        return new C6081e(decodeBitmap, this.f13078a);
    }
}
