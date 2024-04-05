package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.C6051s;
import java.io.IOException;
import p036c5.C4426l;
import p150j4.C7114e;
import p150j4.C7115f;

/* renamed from: com.bumptech.glide.load.resource.bitmap.z */
public final class C6110z implements C7115f<Bitmap, Bitmap> {

    /* renamed from: com.bumptech.glide.load.resource.bitmap.z$a */
    public static final class C6111a implements C6051s<Bitmap> {

        /* renamed from: b */
        public final Bitmap f13139b;

        public C6111a(Bitmap bitmap) {
            this.f13139b = bitmap;
        }

        /* renamed from: a */
        public final int mo16989a() {
            return C4426l.m10129c(this.f13139b);
        }

        /* renamed from: b */
        public final void mo16990b() {
        }

        /* renamed from: d */
        public final Class<Bitmap> mo16992d() {
            return Bitmap.class;
        }

        public final Object get() {
            return this.f13139b;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo17023a(Object obj, C7114e eVar) throws IOException {
        Bitmap bitmap = (Bitmap) obj;
        return true;
    }

    /* renamed from: b */
    public final C6051s mo17024b(Object obj, int i, int i2, C7114e eVar) throws IOException {
        return new C6111a((Bitmap) obj);
    }
}
