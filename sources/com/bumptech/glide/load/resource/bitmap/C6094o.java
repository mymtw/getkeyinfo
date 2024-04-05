package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.C5996b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p036c5.C4410a;
import p185n1.C7369a;

/* renamed from: com.bumptech.glide.load.resource.bitmap.o */
public final class C6094o implements ImageHeaderParser {
    /* renamed from: a */
    public final ImageHeaderParser.ImageType mo16836a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: b */
    public final int mo16837b(ByteBuffer byteBuffer, C5996b bVar) throws IOException {
        AtomicReference<byte[]> atomicReference = C4410a.f9682a;
        return mo16839d(new C4410a.C4411a(byteBuffer), bVar);
    }

    /* renamed from: c */
    public final ImageHeaderParser.ImageType mo16838c(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: d */
    public final int mo16839d(InputStream inputStream, C5996b bVar) throws IOException {
        C7369a aVar = new C7369a(inputStream);
        C7369a.C7372c e = aVar.mo19667e("Orientation");
        int i = 1;
        if (e != null) {
            try {
                i = e.mo19711f(aVar.f16467g);
            } catch (NumberFormatException unused) {
            }
        }
        if (i == 0) {
            return -1;
        }
        return i;
    }
}
