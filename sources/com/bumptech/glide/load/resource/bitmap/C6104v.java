package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.engine.C6051s;
import com.bumptech.glide.load.engine.bitmap_recycle.C5998d;
import java.io.IOException;
import p150j4.C7114e;
import p150j4.C7115f;
import p233s4.C7817c;
import p233s4.C7819e;

/* renamed from: com.bumptech.glide.load.resource.bitmap.v */
public final class C6104v implements C7115f<Uri, Bitmap> {

    /* renamed from: a */
    public final C7819e f13127a;

    /* renamed from: b */
    public final C5998d f13128b;

    public C6104v(C7819e eVar, C5998d dVar) {
        this.f13127a = eVar;
        this.f13128b = dVar;
    }

    /* renamed from: a */
    public final boolean mo17023a(Object obj, C7114e eVar) throws IOException {
        return "android.resource".equals(((Uri) obj).getScheme());
    }

    /* renamed from: b */
    public final C6051s mo17024b(Object obj, int i, int i2, C7114e eVar) throws IOException {
        C6051s c = this.f13127a.mo20347c((Uri) obj);
        if (c == null) {
            return null;
        }
        return C6091m.m12092a(this.f13128b, (Drawable) ((C7817c) c).get(), i, i2);
    }
}
