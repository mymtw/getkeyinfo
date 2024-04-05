package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.p013v4.media.C0072d;
import android.util.DisplayMetrics;
import androidx.activity.C0114h;
import androidx.compose.animation.C0472h;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.engine.bitmap_recycle.C5996b;
import com.bumptech.glide.load.engine.bitmap_recycle.C5998d;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p036c5.C4426l;
import p150j4.C7111d;
import p150j4.C7114e;

/* renamed from: com.bumptech.glide.load.resource.bitmap.l */
public final class C6088l {

    /* renamed from: f */
    public static final C7111d<DecodeFormat> f13086f = C7111d.m13779a(DecodeFormat.DEFAULT, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g */
    public static final C7111d<PreferredColorSpace> f13087g = new C7111d<>("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, C7111d.f15815e);

    /* renamed from: h */
    public static final C7111d<Boolean> f13088h;

    /* renamed from: i */
    public static final C7111d<Boolean> f13089i;

    /* renamed from: j */
    public static final Set<String> f13090j = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: k */
    public static final C6089a f13091k = new C6089a();

    /* renamed from: l */
    public static final Set<ImageHeaderParser.ImageType> f13092l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));

    /* renamed from: m */
    public static final ArrayDeque f13093m = new ArrayDeque(0);

    /* renamed from: a */
    public final C5998d f13094a;

    /* renamed from: b */
    public final DisplayMetrics f13095b;

    /* renamed from: c */
    public final C5996b f13096c;

    /* renamed from: d */
    public final List<ImageHeaderParser> f13097d;

    /* renamed from: e */
    public final C6096q f13098e = C6096q.m12102a();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.l$a */
    public class C6089a implements C6090b {
        /* renamed from: a */
        public final void mo17038a(Bitmap bitmap, C5998d dVar) {
        }

        /* renamed from: b */
        public final void mo17039b() {
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.l$b */
    public interface C6090b {
        /* renamed from: a */
        void mo17038a(Bitmap bitmap, C5998d dVar) throws IOException;

        /* renamed from: b */
        void mo17039b();
    }

    static {
        DownsampleStrategy.C6066e eVar = DownsampleStrategy.f13049a;
        Boolean bool = Boolean.FALSE;
        f13088h = C7111d.m13779a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f13089i = C7111d.m13779a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        char[] cArr = C4426l.f9710a;
    }

    public C6088l(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, C5998d dVar, C5996b bVar) {
        this.f13097d = list;
        C0114h.m281L(displayMetrics);
        this.f13095b = displayMetrics;
        C0114h.m281L(dVar);
        this.f13094a = dVar;
        C0114h.m281L(bVar);
        this.f13096c = bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0046 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m12082c(com.bumptech.glide.load.resource.bitmap.C6097r r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.C6088l.C6090b r7, com.bumptech.glide.load.engine.bitmap_recycle.C5998d r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L_0x000c
            r7.mo17039b()
            r5.mo17042b()
        L_0x000c:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.resource.bitmap.C6108y.f13138d
            r4.lock()
            android.graphics.Bitmap r5 = r5.mo17041a(r6)     // Catch:{ IllegalArgumentException -> 0x0021 }
            r4.unlock()
            return r5
        L_0x001f:
            r5 = move-exception
            goto L_0x0048
        L_0x0021:
            r4 = move-exception
            java.io.IOException r1 = m12084e(r4, r1, r2, r3, r6)     // Catch:{ all -> 0x001f }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x0032
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x001f }
        L_0x0032:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0047
            r8.mo16924e(r0)     // Catch:{ IOException -> 0x0046 }
            r0 = 0
            r6.inBitmap = r0     // Catch:{ IOException -> 0x0046 }
            android.graphics.Bitmap r5 = m12082c(r5, r6, r7, r8)     // Catch:{ IOException -> 0x0046 }
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.C6108y.f13138d
            r6.unlock()
            return r5
        L_0x0046:
            throw r1     // Catch:{ all -> 0x001f }
        L_0x0047:
            throw r1     // Catch:{ all -> 0x001f }
        L_0x0048:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.C6108y.f13138d
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C6088l.m12082c(com.bumptech.glide.load.resource.bitmap.r, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.l$b, com.bumptech.glide.load.engine.bitmap_recycle.d):android.graphics.Bitmap");
    }

    @TargetApi(19)
    /* renamed from: d */
    public static String m12083d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder h = C0072d.m201h(" (");
        h.append(bitmap.getAllocationByteCount());
        h.append(")");
        String sb = h.toString();
        StringBuilder h2 = C0072d.m201h("[");
        h2.append(bitmap.getWidth());
        h2.append(EtsyDialogFragment.OPT_X_BUTTON);
        h2.append(bitmap.getHeight());
        h2.append("] ");
        h2.append(bitmap.getConfig());
        h2.append(sb);
        return h2.toString();
    }

    /* renamed from: e */
    public static IOException m12084e(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        StringBuilder g = C0472h.m1244g("Exception decoding bitmap, outWidth: ", i, ", outHeight: ", i2, ", outMimeType: ");
        g.append(str);
        g.append(", inBitmap: ");
        g.append(m12083d(options.inBitmap));
        return new IOException(g.toString(), illegalArgumentException);
    }

    /* renamed from: f */
    public static void m12085f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: a */
    public final C6081e mo17036a(C6097r rVar, int i, int i2, C7114e eVar, C6090b bVar) throws IOException {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        C7114e eVar2 = eVar;
        byte[] bArr = (byte[]) this.f13096c.mo16914c(65536, byte[].class);
        synchronized (C6088l.class) {
            arrayDeque = f13093m;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                m12085f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) eVar2.mo19443c(f13086f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) eVar2.mo19443c(f13087g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) eVar2.mo19443c(DownsampleStrategy.f13054f);
        boolean booleanValue = ((Boolean) eVar2.mo19443c(f13088h)).booleanValue();
        C7111d dVar = f13089i;
        try {
            C6081e e = C6081e.m12065e(mo17037b(rVar, options2, downsampleStrategy, decodeFormat, preferredColorSpace, eVar2.mo19443c(dVar) != null && ((Boolean) eVar2.mo19443c(dVar)).booleanValue(), i, i2, booleanValue, bVar), this.f13094a);
            m12085f(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.f13096c.put(bArr);
            return e;
        } catch (Throwable th) {
            m12085f(options2);
            ArrayDeque arrayDeque2 = f13093m;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f13096c.put(bArr);
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:141:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01ae  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo17037b(com.bumptech.glide.load.resource.bitmap.C6097r r28, android.graphics.BitmapFactory.Options r29, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r30, com.bumptech.glide.load.DecodeFormat r31, com.bumptech.glide.load.PreferredColorSpace r32, boolean r33, int r34, int r35, boolean r36, com.bumptech.glide.load.resource.bitmap.C6088l.C6090b r37) throws java.io.IOException {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r3 = r29
            r0 = r30
            r4 = r31
            r5 = r32
            r6 = r37
            int r7 = p036c5.C4421h.f9699b
            long r7 = android.os.SystemClock.elapsedRealtimeNanos()
            com.bumptech.glide.load.engine.bitmap_recycle.d r9 = r1.f13094a
            r10 = 1
            r3.inJustDecodeBounds = r10
            m12082c(r2, r3, r6, r9)
            r9 = 0
            r3.inJustDecodeBounds = r9
            int r11 = r3.outWidth
            int r12 = r3.outHeight
            r13 = -1
            if (r11 == r13) goto L_0x002c
            if (r12 != r13) goto L_0x0029
            goto L_0x002c
        L_0x0029:
            r13 = r33
            goto L_0x002d
        L_0x002c:
            r13 = r9
        L_0x002d:
            int r14 = r28.mo17043c()
            switch(r14) {
                case 3: goto L_0x003c;
                case 4: goto L_0x003c;
                case 5: goto L_0x0039;
                case 6: goto L_0x0039;
                case 7: goto L_0x0036;
                case 8: goto L_0x0036;
                default: goto L_0x0034;
            }
        L_0x0034:
            r10 = 0
            goto L_0x0040
        L_0x0036:
            r10 = 270(0x10e, float:3.78E-43)
            goto L_0x0040
        L_0x0039:
            r10 = 90
            goto L_0x0040
        L_0x003c:
            r16 = 180(0xb4, float:2.52E-43)
            r10 = r16
        L_0x0040:
            switch(r14) {
                case 2: goto L_0x0046;
                case 3: goto L_0x0046;
                case 4: goto L_0x0046;
                case 5: goto L_0x0046;
                case 6: goto L_0x0046;
                case 7: goto L_0x0046;
                case 8: goto L_0x0046;
                default: goto L_0x0043;
            }
        L_0x0043:
            r17 = 0
            goto L_0x0048
        L_0x0046:
            r17 = 1
        L_0x0048:
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r34
            if (r9 != r15) goto L_0x005f
            r9 = 90
            if (r10 == r9) goto L_0x0059
            r9 = 270(0x10e, float:3.78E-43)
            if (r10 != r9) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r9 = 0
            goto L_0x005a
        L_0x0059:
            r9 = 1
        L_0x005a:
            if (r9 == 0) goto L_0x005e
            r9 = r12
            goto L_0x005f
        L_0x005e:
            r9 = r11
        L_0x005f:
            r19 = r14
            r14 = r35
            if (r14 != r15) goto L_0x0076
            r14 = 90
            if (r10 == r14) goto L_0x0070
            r14 = 270(0x10e, float:3.78E-43)
            if (r10 != r14) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            r14 = 0
            goto L_0x0071
        L_0x0070:
            r14 = 1
        L_0x0071:
            if (r14 == 0) goto L_0x0075
            r14 = r11
            goto L_0x0076
        L_0x0075:
            r14 = r12
        L_0x0076:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r15 = r28.mo17044d()
            r20 = r7
            com.bumptech.glide.load.engine.bitmap_recycle.d r7 = r1.f13094a
            java.lang.String r8 = "]"
            java.lang.String r5 = "x"
            java.lang.String r4 = "Downsampler"
            r22 = r13
            if (r11 <= 0) goto L_0x020f
            if (r12 > 0) goto L_0x008c
            goto L_0x020f
        L_0x008c:
            r13 = 90
            if (r10 == r13) goto L_0x0097
            r13 = 270(0x10e, float:3.78E-43)
            if (r10 != r13) goto L_0x0095
            goto L_0x0097
        L_0x0095:
            r10 = 0
            goto L_0x0098
        L_0x0097:
            r10 = 1
        L_0x0098:
            if (r10 == 0) goto L_0x009d
            r13 = r11
            r10 = r12
            goto L_0x009f
        L_0x009d:
            r10 = r11
            r13 = r12
        L_0x009f:
            float r1 = r0.mo17012b(r10, r13, r9, r14)
            r18 = 0
            int r23 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r23 <= 0) goto L_0x01c9
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r5 = r0.mo17011a(r10, r13, r9, r14)
            if (r5 == 0) goto L_0x01c1
            float r8 = (float) r10
            r18 = r12
            float r12 = r1 * r8
            r23 = r11
            double r11 = (double) r12
            r24 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r11 = r11 + r24
            int r11 = (int) r11
            float r12 = (float) r13
            r33 = r4
            float r4 = r1 * r12
            r26 = r7
            double r6 = (double) r4
            double r6 = r6 + r24
            int r4 = (int) r6
            int r6 = r10 / r11
            int r4 = r13 / r4
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r7 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.MEMORY
            if (r5 != r7) goto L_0x00d4
            int r4 = java.lang.Math.max(r6, r4)
            goto L_0x00d8
        L_0x00d4:
            int r4 = java.lang.Math.min(r6, r4)
        L_0x00d8:
            int r4 = java.lang.Integer.highestOneBit(r4)
            r6 = 1
            int r4 = java.lang.Math.max(r6, r4)
            if (r5 != r7) goto L_0x00ee
            float r5 = (float) r4
            r6 = 1065353216(0x3f800000, float:1.0)
            float r1 = r6 / r1
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ee
            int r4 = r4 << 1
        L_0x00ee:
            r3.inSampleSize = r4
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG
            if (r15 != r1) goto L_0x010f
            r1 = 8
            int r5 = java.lang.Math.min(r4, r1)
            float r5 = (float) r5
            float r8 = r8 / r5
            double r6 = (double) r8
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            float r12 = r12 / r5
            double r7 = (double) r12
            double r7 = java.lang.Math.ceil(r7)
            int r5 = (int) r7
            int r4 = r4 / r1
            if (r4 <= 0) goto L_0x0137
            int r6 = r6 / r4
            int r5 = r5 / r4
            goto L_0x0137
        L_0x010f:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG
            if (r15 == r1) goto L_0x014c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A
            if (r15 != r1) goto L_0x0118
            goto L_0x014c
        L_0x0118:
            boolean r1 = r15.isWebp()
            if (r1 == 0) goto L_0x012a
            float r1 = (float) r4
            float r8 = r8 / r1
            int r6 = java.lang.Math.round(r8)
            float r12 = r12 / r1
            int r5 = java.lang.Math.round(r12)
            goto L_0x0137
        L_0x012a:
            int r1 = r10 % r4
            if (r1 != 0) goto L_0x013a
            int r1 = r13 % r4
            if (r1 == 0) goto L_0x0133
            goto L_0x013a
        L_0x0133:
            int r6 = r10 / r4
            int r5 = r13 / r4
        L_0x0137:
            r1 = r37
            goto L_0x015d
        L_0x013a:
            r1 = 1
            r3.inJustDecodeBounds = r1
            r1 = r37
            r4 = r26
            m12082c(r2, r3, r1, r4)
            r4 = 0
            r3.inJustDecodeBounds = r4
            int r6 = r3.outWidth
            int r5 = r3.outHeight
            goto L_0x015d
        L_0x014c:
            r1 = r37
            float r4 = (float) r4
            float r8 = r8 / r4
            double r5 = (double) r8
            double r5 = java.lang.Math.floor(r5)
            int r6 = (int) r5
            float r12 = r12 / r4
            double r4 = (double) r12
            double r4 = java.lang.Math.floor(r4)
            int r5 = (int) r4
        L_0x015d:
            float r0 = r0.mo17012b(r6, r5, r9, r14)
            double r4 = (double) r0
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x016a
            r10 = r4
            goto L_0x016c
        L_0x016a:
            double r10 = r6 / r4
        L_0x016c:
            r12 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r10 = r10 * r12
            long r10 = java.lang.Math.round(r10)
            int r8 = (int) r10
            double r10 = (double) r8
            double r10 = r10 * r4
            double r10 = r10 + r24
            int r10 = (int) r10
            float r11 = (float) r10
            float r8 = (float) r8
            float r11 = r11 / r8
            double r12 = (double) r11
            double r11 = r4 / r12
            double r6 = (double) r10
            double r11 = r11 * r6
            double r11 = r11 + r24
            int r6 = (int) r11
            r3.inTargetDensity = r6
            if (r0 > 0) goto L_0x018c
            goto L_0x0190
        L_0x018c:
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r6 / r4
        L_0x0190:
            r6 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r4 = r4 * r6
            long r4 = java.lang.Math.round(r4)
            int r0 = (int) r4
            r3.inDensity = r0
            int r4 = r3.inTargetDensity
            if (r4 <= 0) goto L_0x01a7
            if (r0 <= 0) goto L_0x01a7
            if (r4 == r0) goto L_0x01a7
            r0 = 1
            goto L_0x01a8
        L_0x01a7:
            r0 = 0
        L_0x01a8:
            if (r0 == 0) goto L_0x01ae
            r4 = 1
            r3.inScaled = r4
            goto L_0x01b3
        L_0x01ae:
            r4 = 0
            r3.inTargetDensity = r4
            r3.inDensity = r4
        L_0x01b3:
            r4 = r33
            r5 = 2
            android.util.Log.isLoggable(r4, r5)
            r5 = r27
            r7 = r18
            r6 = r23
            goto L_0x0240
        L_0x01c1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot round with null rounding"
            r0.<init>(r1)
            throw r0
        L_0x01c9:
            r23 = r11
            r18 = r12
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot scale with factor: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " from: "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = ", source: ["
            r3.append(r0)
            r6 = r23
            r3.append(r6)
            r3.append(r5)
            r7 = r18
            r3.append(r7)
            java.lang.String r0 = "], target: ["
            r3.append(r0)
            r3.append(r9)
            r3.append(r5)
            r3.append(r14)
            r3.append(r8)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x020f:
            r1 = r6
            r6 = r11
            r7 = r12
            r10 = 3
            boolean r0 = android.util.Log.isLoggable(r4, r10)
            if (r0 == 0) goto L_0x023e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = "Unable to determine dimensions for: "
            r0.append(r10)
            r0.append(r15)
            java.lang.String r10 = " with target ["
            r0.append(r10)
            r0.append(r9)
            r0.append(r5)
            r0.append(r14)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r4, r0)
        L_0x023e:
            r5 = r27
        L_0x0240:
            com.bumptech.glide.load.resource.bitmap.q r0 = r5.f13098e
            r10 = r17
            r8 = r22
            boolean r0 = r0.mo17040b(r9, r14, r8, r10)
            if (r0 == 0) goto L_0x0254
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.HARDWARE
            r3.inPreferredConfig = r8
            r8 = 0
            r3.inMutable = r8
            goto L_0x0255
        L_0x0254:
            r8 = 0
        L_0x0255:
            if (r0 == 0) goto L_0x025a
            r10 = r4
        L_0x0258:
            r4 = 1
            goto L_0x029d
        L_0x025a:
            com.bumptech.glide.load.DecodeFormat r0 = com.bumptech.glide.load.DecodeFormat.PREFER_ARGB_8888
            r10 = r4
            r4 = r31
            if (r4 == r0) goto L_0x0298
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = r28.mo17044d()     // Catch:{ IOException -> 0x026a }
            boolean r4 = r0.hasAlpha()     // Catch:{ IOException -> 0x026a }
            goto L_0x0287
        L_0x026a:
            r0 = move-exception
            r11 = 3
            boolean r11 = android.util.Log.isLoggable(r10, r11)
            if (r11 == 0) goto L_0x0286
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Cannot determine whether the image has alpha or not from header, format "
            r11.append(r12)
            r11.append(r4)
            java.lang.String r4 = r11.toString()
            android.util.Log.d(r10, r4, r0)
        L_0x0286:
            r4 = r8
        L_0x0287:
            if (r4 == 0) goto L_0x028c
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            goto L_0x028e
        L_0x028c:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
        L_0x028e:
            r3.inPreferredConfig = r0
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.RGB_565
            if (r0 != r4) goto L_0x0258
            r4 = 1
            r3.inDither = r4
            goto L_0x029d
        L_0x0298:
            r4 = 1
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r3.inPreferredConfig = r0
        L_0x029d:
            int r0 = android.os.Build.VERSION.SDK_INT
            int r11 = r3.inSampleSize
            if (r6 < 0) goto L_0x02a8
            if (r7 < 0) goto L_0x02a8
            if (r36 == 0) goto L_0x02a8
            goto L_0x02e1
        L_0x02a8:
            int r9 = r3.inTargetDensity
            if (r9 <= 0) goto L_0x02b4
            int r12 = r3.inDensity
            if (r12 <= 0) goto L_0x02b4
            if (r9 == r12) goto L_0x02b4
            r12 = r4
            goto L_0x02b5
        L_0x02b4:
            r12 = r8
        L_0x02b5:
            if (r12 == 0) goto L_0x02bd
            float r9 = (float) r9
            int r12 = r3.inDensity
            float r12 = (float) r12
            float r9 = r9 / r12
            goto L_0x02bf
        L_0x02bd:
            r9 = 1065353216(0x3f800000, float:1.0)
        L_0x02bf:
            float r6 = (float) r6
            float r11 = (float) r11
            float r6 = r6 / r11
            double r12 = (double) r6
            double r12 = java.lang.Math.ceil(r12)
            int r6 = (int) r12
            float r7 = (float) r7
            float r7 = r7 / r11
            double r11 = (double) r7
            double r11 = java.lang.Math.ceil(r11)
            int r7 = (int) r11
            float r6 = (float) r6
            float r6 = r6 * r9
            int r6 = java.lang.Math.round(r6)
            float r7 = (float) r7
            float r7 = r7 * r9
            int r14 = java.lang.Math.round(r7)
            r7 = 2
            android.util.Log.isLoggable(r10, r7)
            r9 = r6
        L_0x02e1:
            if (r9 <= 0) goto L_0x02fa
            if (r14 <= 0) goto L_0x02fa
            com.bumptech.glide.load.engine.bitmap_recycle.d r6 = r5.f13094a
            android.graphics.Bitmap$Config r7 = r3.inPreferredConfig
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.HARDWARE
            if (r7 != r11) goto L_0x02ee
            goto L_0x02fa
        L_0x02ee:
            android.graphics.Bitmap$Config r11 = r3.outConfig
            if (r11 != 0) goto L_0x02f3
            goto L_0x02f4
        L_0x02f3:
            r7 = r11
        L_0x02f4:
            android.graphics.Bitmap r6 = r6.mo16923d(r9, r14, r7)
            r3.inBitmap = r6
        L_0x02fa:
            r6 = r32
            if (r6 == 0) goto L_0x0329
            r7 = 28
            if (r0 < r7) goto L_0x0321
            com.bumptech.glide.load.PreferredColorSpace r0 = com.bumptech.glide.load.PreferredColorSpace.DISPLAY_P3
            if (r6 != r0) goto L_0x0312
            android.graphics.ColorSpace r0 = r3.outColorSpace
            if (r0 == 0) goto L_0x0312
            boolean r0 = r0.isWideGamut()
            if (r0 == 0) goto L_0x0312
            r6 = r4
            goto L_0x0313
        L_0x0312:
            r6 = r8
        L_0x0313:
            if (r6 == 0) goto L_0x0318
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L_0x031a
        L_0x0318:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
        L_0x031a:
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r3.inPreferredColorSpace = r0
            goto L_0x0329
        L_0x0321:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r3.inPreferredColorSpace = r0
        L_0x0329:
            com.bumptech.glide.load.engine.bitmap_recycle.d r0 = r5.f13094a
            android.graphics.Bitmap r0 = m12082c(r2, r3, r1, r0)
            com.bumptech.glide.load.engine.bitmap_recycle.d r2 = r5.f13094a
            r1.mo17038a(r0, r2)
            r1 = 2
            boolean r1 = android.util.Log.isLoggable(r10, r1)
            if (r1 == 0) goto L_0x034d
            m12083d(r0)
            android.graphics.Bitmap r1 = r3.inBitmap
            m12083d(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.getName()
            p036c5.C4421h.m10119a(r20)
        L_0x034d:
            r1 = 0
            if (r0 == 0) goto L_0x03f3
            android.util.DisplayMetrics r1 = r5.f13095b
            int r1 = r1.densityDpi
            r0.setDensity(r1)
            com.bumptech.glide.load.engine.bitmap_recycle.d r1 = r5.f13094a
            switch(r19) {
                case 2: goto L_0x035e;
                case 3: goto L_0x035e;
                case 4: goto L_0x035e;
                case 5: goto L_0x035e;
                case 6: goto L_0x035e;
                case 7: goto L_0x035e;
                case 8: goto L_0x035e;
                default: goto L_0x035c;
            }
        L_0x035c:
            r10 = r8
            goto L_0x035f
        L_0x035e:
            r10 = r4
        L_0x035f:
            if (r10 != 0) goto L_0x0364
            r1 = r0
            goto L_0x03e8
        L_0x0364:
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            r3 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r4 = 1119092736(0x42b40000, float:90.0)
            r6 = 1127481344(0x43340000, float:180.0)
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r19) {
                case 2: goto L_0x039c;
                case 3: goto L_0x0398;
                case 4: goto L_0x038f;
                case 5: goto L_0x0386;
                case 6: goto L_0x0382;
                case 7: goto L_0x0379;
                case 8: goto L_0x0375;
                default: goto L_0x0374;
            }
        L_0x0374:
            goto L_0x03a1
        L_0x0375:
            r2.setRotate(r3)
            goto L_0x03a1
        L_0x0379:
            r2.setRotate(r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.postScale(r7, r3)
            goto L_0x03a1
        L_0x0382:
            r2.setRotate(r4)
            goto L_0x03a1
        L_0x0386:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setRotate(r4)
            r2.postScale(r7, r3)
            goto L_0x03a1
        L_0x038f:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setRotate(r6)
            r2.postScale(r7, r3)
            goto L_0x03a1
        L_0x0398:
            r2.setRotate(r6)
            goto L_0x03a1
        L_0x039c:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setScale(r7, r3)
        L_0x03a1:
            android.graphics.RectF r3 = new android.graphics.RectF
            int r4 = r0.getWidth()
            float r4 = (float) r4
            int r6 = r0.getHeight()
            float r6 = (float) r6
            r7 = 0
            r3.<init>(r7, r7, r4, r6)
            r2.mapRect(r3)
            float r4 = r3.width()
            int r4 = java.lang.Math.round(r4)
            float r6 = r3.height()
            int r6 = java.lang.Math.round(r6)
            android.graphics.Bitmap$Config r7 = r0.getConfig()
            if (r7 == 0) goto L_0x03cf
            android.graphics.Bitmap$Config r7 = r0.getConfig()
            goto L_0x03d1
        L_0x03cf:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x03d1:
            android.graphics.Bitmap r1 = r1.mo16926g(r4, r6, r7)
            float r4 = r3.left
            float r4 = -r4
            float r3 = r3.top
            float r3 = -r3
            r2.postTranslate(r4, r3)
            boolean r3 = r0.hasAlpha()
            r1.setHasAlpha(r3)
            com.bumptech.glide.load.resource.bitmap.C6108y.m12136a(r0, r1, r2)
        L_0x03e8:
            boolean r2 = r0.equals(r1)
            if (r2 != 0) goto L_0x03f3
            com.bumptech.glide.load.engine.bitmap_recycle.d r2 = r5.f13094a
            r2.mo16924e(r0)
        L_0x03f3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C6088l.mo17037b(com.bumptech.glide.load.resource.bitmap.r, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.DecodeFormat, com.bumptech.glide.load.PreferredColorSpace, boolean, int, int, boolean, com.bumptech.glide.load.resource.bitmap.l$b):android.graphics.Bitmap");
    }
}
