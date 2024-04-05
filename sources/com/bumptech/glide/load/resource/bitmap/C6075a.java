package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.C6051s;
import java.io.IOException;
import p150j4.C7114e;
import p150j4.C7115f;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a */
public final class C6075a<DataType> implements C7115f<DataType, BitmapDrawable> {

    /* renamed from: a */
    public final C7115f<DataType, Bitmap> f13070a;

    /* renamed from: b */
    public final Resources f13071b;

    public C6075a(Resources resources, C7115f<DataType, Bitmap> fVar) {
        this.f13071b = resources;
        this.f13070a = fVar;
    }

    /* renamed from: a */
    public final boolean mo17023a(DataType datatype, C7114e eVar) throws IOException {
        return this.f13070a.mo17023a(datatype, eVar);
    }

    /* renamed from: b */
    public final C6051s<BitmapDrawable> mo17024b(DataType datatype, int i, int i2, C7114e eVar) throws IOException {
        C6051s<Bitmap> b = this.f13070a.mo17024b(datatype, i, i2, eVar);
        Resources resources = this.f13071b;
        if (b == null) {
            return null;
        }
        return new C6102t(resources, b);
    }
}
