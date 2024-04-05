package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import androidx.activity.C0114h;
import com.bumptech.glide.load.C5963a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C5980k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.C5996b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p036c5.C4410a;
import p036c5.C4424j;

/* renamed from: com.bumptech.glide.load.resource.bitmap.r */
public interface C6097r {

    /* renamed from: com.bumptech.glide.load.resource.bitmap.r$a */
    public static final class C6098a implements C6097r {

        /* renamed from: a */
        public final ByteBuffer f13114a;

        /* renamed from: b */
        public final List<ImageHeaderParser> f13115b;

        /* renamed from: c */
        public final C5996b f13116c;

        public C6098a(C5996b bVar, ByteBuffer byteBuffer, List list) {
            this.f13114a = byteBuffer;
            this.f13115b = list;
            this.f13116c = bVar;
        }

        /* renamed from: a */
        public final Bitmap mo17041a(BitmapFactory.Options options) {
            ByteBuffer byteBuffer = this.f13114a;
            AtomicReference<byte[]> atomicReference = C4410a.f9682a;
            return BitmapFactory.decodeStream(new C4410a.C4411a((ByteBuffer) byteBuffer.position(0)), (Rect) null, options);
        }

        /* renamed from: b */
        public final void mo17042b() {
        }

        /* renamed from: c */
        public final int mo17043c() throws IOException {
            List<ImageHeaderParser> list = this.f13115b;
            ByteBuffer byteBuffer = this.f13114a;
            AtomicReference<byte[]> atomicReference = C4410a.f9682a;
            ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(0);
            C5996b bVar = this.f13116c;
            if (byteBuffer2 == null) {
                return -1;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                int b = list.get(i).mo16837b(byteBuffer2, bVar);
                if (b != -1) {
                    return b;
                }
            }
            return -1;
        }

        /* renamed from: d */
        public final ImageHeaderParser.ImageType mo17044d() throws IOException {
            List<ImageHeaderParser> list = this.f13115b;
            ByteBuffer byteBuffer = this.f13114a;
            AtomicReference<byte[]> atomicReference = C4410a.f9682a;
            return C5963a.m11790c(list, (ByteBuffer) byteBuffer.position(0));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.r$b */
    public static final class C6099b implements C6097r {

        /* renamed from: a */
        public final C5980k f13117a;

        /* renamed from: b */
        public final C5996b f13118b;

        /* renamed from: c */
        public final List<ImageHeaderParser> f13119c;

        public C6099b(C5996b bVar, C4424j jVar, List list) {
            C0114h.m281L(bVar);
            this.f13118b = bVar;
            C0114h.m281L(list);
            this.f13119c = list;
            this.f13117a = new C5980k(jVar, bVar);
        }

        /* renamed from: a */
        public final Bitmap mo17041a(BitmapFactory.Options options) throws IOException {
            C5980k kVar = this.f13117a;
            kVar.f12793a.reset();
            return BitmapFactory.decodeStream(kVar.f12793a, (Rect) null, options);
        }

        /* renamed from: b */
        public final void mo17042b() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f13117a.f12793a;
            synchronized (recyclableBufferedInputStream) {
                recyclableBufferedInputStream.f13058d = recyclableBufferedInputStream.f13056b.length;
            }
        }

        /* renamed from: c */
        public final int mo17043c() throws IOException {
            List<ImageHeaderParser> list = this.f13119c;
            C5980k kVar = this.f13117a;
            kVar.f12793a.reset();
            return C5963a.m11788a(this.f13118b, kVar.f12793a, list);
        }

        /* renamed from: d */
        public final ImageHeaderParser.ImageType mo17044d() throws IOException {
            List<ImageHeaderParser> list = this.f13119c;
            C5980k kVar = this.f13117a;
            kVar.f12793a.reset();
            return C5963a.m11789b(this.f13118b, kVar.f12793a, list);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.r$c */
    public static final class C6100c implements C6097r {

        /* renamed from: a */
        public final C5996b f13120a;

        /* renamed from: b */
        public final List<ImageHeaderParser> f13121b;

        /* renamed from: c */
        public final ParcelFileDescriptorRewinder f13122c;

        public C6100c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, C5996b bVar) {
            C0114h.m281L(bVar);
            this.f13120a = bVar;
            C0114h.m281L(list);
            this.f13121b = list;
            this.f13122c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        /* renamed from: a */
        public final Bitmap mo17041a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f13122c.mo16842a().getFileDescriptor(), (Rect) null, options);
        }

        /* renamed from: b */
        public final void mo17042b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x003d A[SYNTHETIC, Splitter:B:19:0x003d] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo17043c() throws java.io.IOException {
            /*
                r10 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r10.f13121b
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r1 = r10.f13122c
                com.bumptech.glide.load.engine.bitmap_recycle.b r2 = r10.f13120a
                int r3 = r0.size()
                r4 = 0
            L_0x000b:
                r5 = -1
                if (r4 >= r3) goto L_0x0044
                java.lang.Object r6 = r0.get(r4)
                com.bumptech.glide.load.ImageHeaderParser r6 = (com.bumptech.glide.load.ImageHeaderParser) r6
                com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r7 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream     // Catch:{ all -> 0x0039 }
                java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ all -> 0x0039 }
                android.os.ParcelFileDescriptor r9 = r1.mo16842a()     // Catch:{ all -> 0x0039 }
                java.io.FileDescriptor r9 = r9.getFileDescriptor()     // Catch:{ all -> 0x0039 }
                r8.<init>(r9)     // Catch:{ all -> 0x0039 }
                r7.<init>(r8, r2)     // Catch:{ all -> 0x0039 }
                int r6 = r6.mo16839d(r7, r2)     // Catch:{ all -> 0x0037 }
                r7.close()     // Catch:{ IOException -> 0x002d }
            L_0x002d:
                r1.mo16842a()
                if (r6 == r5) goto L_0x0034
                r5 = r6
                goto L_0x0044
            L_0x0034:
                int r4 = r4 + 1
                goto L_0x000b
            L_0x0037:
                r0 = move-exception
                goto L_0x003b
            L_0x0039:
                r0 = move-exception
                r7 = 0
            L_0x003b:
                if (r7 == 0) goto L_0x0040
                r7.close()     // Catch:{ IOException -> 0x0040 }
            L_0x0040:
                r1.mo16842a()
                throw r0
            L_0x0044:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C6097r.C6100c.mo17043c():int");
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[SYNTHETIC, Splitter:B:17:0x003d] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bumptech.glide.load.ImageHeaderParser.ImageType mo17044d() throws java.io.IOException {
            /*
                r9 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r9.f13121b
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r1 = r9.f13122c
                com.bumptech.glide.load.engine.bitmap_recycle.b r2 = r9.f13120a
                int r3 = r0.size()
                r4 = 0
            L_0x000b:
                if (r4 >= r3) goto L_0x0044
                java.lang.Object r5 = r0.get(r4)
                com.bumptech.glide.load.ImageHeaderParser r5 = (com.bumptech.glide.load.ImageHeaderParser) r5
                com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r6 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream     // Catch:{ all -> 0x0039 }
                java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ all -> 0x0039 }
                android.os.ParcelFileDescriptor r8 = r1.mo16842a()     // Catch:{ all -> 0x0039 }
                java.io.FileDescriptor r8 = r8.getFileDescriptor()     // Catch:{ all -> 0x0039 }
                r7.<init>(r8)     // Catch:{ all -> 0x0039 }
                r6.<init>(r7, r2)     // Catch:{ all -> 0x0039 }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.mo16838c(r6)     // Catch:{ all -> 0x0037 }
                r6.close()     // Catch:{ IOException -> 0x002c }
            L_0x002c:
                r1.mo16842a()
                com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
                if (r5 == r6) goto L_0x0034
                goto L_0x0046
            L_0x0034:
                int r4 = r4 + 1
                goto L_0x000b
            L_0x0037:
                r0 = move-exception
                goto L_0x003b
            L_0x0039:
                r0 = move-exception
                r6 = 0
            L_0x003b:
                if (r6 == 0) goto L_0x0040
                r6.close()     // Catch:{ IOException -> 0x0040 }
            L_0x0040:
                r1.mo16842a()
                throw r0
            L_0x0044:
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            L_0x0046:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C6097r.C6100c.mo17044d():com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    /* renamed from: a */
    Bitmap mo17041a(BitmapFactory.Options options) throws IOException;

    /* renamed from: b */
    void mo17042b();

    /* renamed from: c */
    int mo17043c() throws IOException;

    /* renamed from: d */
    ImageHeaderParser.ImageType mo17044d() throws IOException;
}
