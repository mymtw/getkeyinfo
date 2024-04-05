package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.C6051s;
import com.bumptech.glide.load.resource.bitmap.C6097r;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import p150j4.C7114e;
import p150j4.C7115f;

/* renamed from: com.bumptech.glide.load.resource.bitmap.g */
public final class C6083g implements C7115f<ByteBuffer, Bitmap> {

    /* renamed from: a */
    public final C6088l f13081a;

    public C6083g(C6088l lVar) {
        this.f13081a = lVar;
    }

    /* renamed from: a */
    public final boolean mo17023a(Object obj, C7114e eVar) throws IOException {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        this.f13081a.getClass();
        return true;
    }

    /* renamed from: b */
    public final C6051s mo17024b(Object obj, int i, int i2, C7114e eVar) throws IOException {
        C6088l lVar = this.f13081a;
        List<ImageHeaderParser> list = lVar.f13097d;
        return lVar.mo17036a(new C6097r.C6098a(lVar.f13096c, (ByteBuffer) obj, list), i, i2, eVar, C6088l.f13091k);
    }
}
