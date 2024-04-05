package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.C6051s;
import com.bumptech.glide.load.engine.bitmap_recycle.C5996b;
import com.bumptech.glide.load.engine.bitmap_recycle.C5998d;
import com.bumptech.glide.load.resource.bitmap.C6088l;
import com.bumptech.glide.load.resource.bitmap.C6097r;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import p036c5.C4415d;
import p036c5.C4424j;
import p150j4.C7114e;
import p150j4.C7115f;

/* renamed from: com.bumptech.glide.load.resource.bitmap.x */
public final class C6106x implements C7115f<InputStream, Bitmap> {

    /* renamed from: a */
    public final C6088l f13131a;

    /* renamed from: b */
    public final C5996b f13132b;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.x$a */
    public static class C6107a implements C6088l.C6090b {

        /* renamed from: a */
        public final RecyclableBufferedInputStream f13133a;

        /* renamed from: b */
        public final C4415d f13134b;

        public C6107a(RecyclableBufferedInputStream recyclableBufferedInputStream, C4415d dVar) {
            this.f13133a = recyclableBufferedInputStream;
            this.f13134b = dVar;
        }

        /* renamed from: a */
        public final void mo17038a(Bitmap bitmap, C5998d dVar) throws IOException {
            IOException iOException = this.f13134b.f9693c;
            if (iOException != null) {
                if (bitmap != null) {
                    dVar.mo16924e(bitmap);
                }
                throw iOException;
            }
        }

        /* renamed from: b */
        public final void mo17039b() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f13133a;
            synchronized (recyclableBufferedInputStream) {
                recyclableBufferedInputStream.f13058d = recyclableBufferedInputStream.f13056b.length;
            }
        }
    }

    public C6106x(C6088l lVar, C5996b bVar) {
        this.f13131a = lVar;
        this.f13132b = bVar;
    }

    /* renamed from: a */
    public final boolean mo17023a(Object obj, C7114e eVar) throws IOException {
        InputStream inputStream = (InputStream) obj;
        this.f13131a.getClass();
        return true;
    }

    /* renamed from: b */
    public final C6051s mo17024b(Object obj, int i, int i2, C7114e eVar) throws IOException {
        boolean z;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        C4415d dVar;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            z = false;
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
        } else {
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.f13132b);
            z = true;
        }
        ArrayDeque arrayDeque = C4415d.f9691d;
        synchronized (arrayDeque) {
            dVar = (C4415d) arrayDeque.poll();
        }
        if (dVar == null) {
            dVar = new C4415d();
        }
        C4415d dVar2 = dVar;
        dVar2.f9692b = recyclableBufferedInputStream;
        C4424j jVar = new C4424j(dVar2);
        C6107a aVar = new C6107a(recyclableBufferedInputStream, dVar2);
        try {
            C6088l lVar = this.f13131a;
            C6081e a = lVar.mo17036a(new C6097r.C6099b(lVar.f13096c, jVar, lVar.f13097d), i, i2, eVar, aVar);
            dVar2.f9693c = null;
            dVar2.f9692b = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(dVar2);
            }
            if (z) {
                recyclableBufferedInputStream.release();
            }
            return a;
        } catch (Throwable th) {
            dVar2.f9693c = null;
            dVar2.f9692b = null;
            ArrayDeque arrayDeque2 = C4415d.f9691d;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(dVar2);
                if (z) {
                    recyclableBufferedInputStream.release();
                }
                throw th;
            }
        }
    }
}
