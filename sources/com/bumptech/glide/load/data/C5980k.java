package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.C5970e;
import com.bumptech.glide.load.engine.bitmap_recycle.C5996b;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.k */
public final class C5980k implements C5970e<InputStream> {

    /* renamed from: a */
    public final RecyclableBufferedInputStream f12793a;

    /* renamed from: com.bumptech.glide.load.data.k$a */
    public static final class C5981a implements C5970e.C5971a<InputStream> {

        /* renamed from: a */
        public final C5996b f12794a;

        public C5981a(C5996b bVar) {
            this.f12794a = bVar;
        }

        /* renamed from: a */
        public final Class<InputStream> mo16846a() {
            return InputStream.class;
        }

        /* renamed from: b */
        public final C5970e mo16847b(Object obj) {
            return new C5980k((InputStream) obj, this.f12794a);
        }
    }

    public C5980k(InputStream inputStream, C5996b bVar) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        this.f12793a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    /* renamed from: a */
    public final Object mo16842a() throws IOException {
        this.f12793a.reset();
        return this.f12793a;
    }

    /* renamed from: b */
    public final void mo16843b() {
        this.f12793a.release();
    }
}
