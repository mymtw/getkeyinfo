package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.bitmap_recycle.C5996b;
import p150j4.C7111d;
import p150j4.C7114e;
import p150j4.C7116g;

/* renamed from: com.bumptech.glide.load.resource.bitmap.c */
public final class C6079c implements C7116g<Bitmap> {

    /* renamed from: c */
    public static final C7111d<Integer> f13075c = C7111d.m13779a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: d */
    public static final C7111d<Bitmap.CompressFormat> f13076d = new C7111d<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C7111d.f15815e);

    /* renamed from: b */
    public final C5996b f13077b;

    public C6079c(C5996b bVar) {
        this.f13077b = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:24|41|(0)|45|46) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0069, code lost:
        if (r6 == null) goto L_0x006e;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0091 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064 A[Catch:{ all -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008e A[SYNTHETIC, Splitter:B:43:0x008e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5754a(java.lang.Object r9, java.io.File r10, p150j4.C7114e r11) {
        /*
            r8 = this;
            com.bumptech.glide.load.engine.s r9 = (com.bumptech.glide.load.engine.C6051s) r9
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            j4.d<android.graphics.Bitmap$CompressFormat> r1 = f13076d
            java.lang.Object r1 = r11.mo19443c(r1)
            android.graphics.Bitmap$CompressFormat r1 = (android.graphics.Bitmap.CompressFormat) r1
            if (r1 == 0) goto L_0x0015
            goto L_0x0020
        L_0x0015:
            boolean r1 = r9.hasAlpha()
            if (r1 == 0) goto L_0x001e
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            goto L_0x0020
        L_0x001e:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
        L_0x0020:
            r9.getWidth()
            r9.getHeight()
            int r2 = p036c5.C4421h.f9699b     // Catch:{ all -> 0x0092 }
            long r2 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x0092 }
            j4.d<java.lang.Integer> r4 = f13075c     // Catch:{ all -> 0x0092 }
            java.lang.Object r4 = r11.mo19443c(r4)     // Catch:{ all -> 0x0092 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0092 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0092 }
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x005c }
            r7.<init>(r10)     // Catch:{ IOException -> 0x005c }
            com.bumptech.glide.load.engine.bitmap_recycle.b r10 = r8.f13077b     // Catch:{ IOException -> 0x0057, all -> 0x004c }
            if (r10 == 0) goto L_0x004e
            com.bumptech.glide.load.data.c r10 = new com.bumptech.glide.load.data.c     // Catch:{ IOException -> 0x0057, all -> 0x004c }
            com.bumptech.glide.load.engine.bitmap_recycle.b r6 = r8.f13077b     // Catch:{ IOException -> 0x0057, all -> 0x004c }
            r10.<init>(r7, r6)     // Catch:{ IOException -> 0x0057, all -> 0x004c }
            r6 = r10
            goto L_0x004f
        L_0x004c:
            r9 = move-exception
            goto L_0x008c
        L_0x004e:
            r6 = r7
        L_0x004f:
            r9.compress(r1, r4, r6)     // Catch:{ IOException -> 0x005c }
            r6.close()     // Catch:{ IOException -> 0x005c }
            r5 = 1
            goto L_0x006b
        L_0x0057:
            r10 = move-exception
            r6 = r7
            goto L_0x005d
        L_0x005a:
            r9 = move-exception
            goto L_0x008b
        L_0x005c:
            r10 = move-exception
        L_0x005d:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x005a }
            if (r4 == 0) goto L_0x0069
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r10)     // Catch:{ all -> 0x005a }
        L_0x0069:
            if (r6 == 0) goto L_0x006e
        L_0x006b:
            r6.close()     // Catch:{ IOException -> 0x006e }
        L_0x006e:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch:{ all -> 0x0092 }
            if (r10 == 0) goto L_0x008a
            java.util.Objects.toString(r1)     // Catch:{ all -> 0x0092 }
            p036c5.C4426l.m10129c(r9)     // Catch:{ all -> 0x0092 }
            p036c5.C4421h.m10119a(r2)     // Catch:{ all -> 0x0092 }
            j4.d<android.graphics.Bitmap$CompressFormat> r10 = f13076d     // Catch:{ all -> 0x0092 }
            java.lang.Object r10 = r11.mo19443c(r10)     // Catch:{ all -> 0x0092 }
            java.util.Objects.toString(r10)     // Catch:{ all -> 0x0092 }
            r9.hasAlpha()     // Catch:{ all -> 0x0092 }
        L_0x008a:
            return r5
        L_0x008b:
            r7 = r6
        L_0x008c:
            if (r7 == 0) goto L_0x0091
            r7.close()     // Catch:{ IOException -> 0x0091 }
        L_0x0091:
            throw r9     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C6079c.mo5754a(java.lang.Object, java.io.File, j4.e):boolean");
    }

    /* renamed from: b */
    public final EncodeStrategy mo17027b(C7114e eVar) {
        return EncodeStrategy.TRANSFORMED;
    }
}
