package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.engine.C6051s;
import java.io.IOException;
import java.io.InputStream;
import p036c5.C4410a;
import p150j4.C7114e;
import p150j4.C7115f;

/* renamed from: com.bumptech.glide.load.resource.bitmap.s */
public final class C6101s implements C7115f<InputStream, Bitmap> {

    /* renamed from: a */
    public final C6080d f13123a = new C6080d();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo17023a(Object obj, C7114e eVar) throws IOException {
        InputStream inputStream = (InputStream) obj;
        return true;
    }

    /* renamed from: b */
    public final C6051s mo17024b(Object obj, int i, int i2, C7114e eVar) throws IOException {
        return this.f13123a.mo17024b(ImageDecoder.createSource(C4410a.m10112b((InputStream) obj)), i, i2, eVar);
    }
}
