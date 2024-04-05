package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.support.p013v4.media.C0073e;
import com.bumptech.glide.load.engine.C6051s;
import com.bumptech.glide.load.engine.bitmap_recycle.C5998d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p150j4.C7111d;
import p150j4.C7114e;
import p150j4.C7115f;

public final class VideoDecoder<T> implements C7115f<T, Bitmap> {

    /* renamed from: d */
    public static final C7111d<Long> f13062d = new C7111d<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C6068a());

    /* renamed from: e */
    public static final C7111d<Integer> f13063e = new C7111d<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C6069b());

    /* renamed from: f */
    public static final C6072e f13064f = new C6072e();

    /* renamed from: a */
    public final C6073f<T> f13065a;

    /* renamed from: b */
    public final C5998d f13066b;

    /* renamed from: c */
    public final C6072e f13067c;

    public static final class VideoDecoderException extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        public VideoDecoderException() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$a */
    public class C6068a implements C7111d.C7113b<Long> {

        /* renamed from: a */
        public final ByteBuffer f13068a = ByteBuffer.allocate(8);

        /* renamed from: a */
        public final void mo17025a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Long l = (Long) obj;
            messageDigest.update(bArr);
            synchronized (this.f13068a) {
                this.f13068a.position(0);
                messageDigest.update(this.f13068a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$b */
    public class C6069b implements C7111d.C7113b<Integer> {

        /* renamed from: a */
        public final ByteBuffer f13069a = ByteBuffer.allocate(4);

        /* renamed from: a */
        public final void mo17025a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Integer num = (Integer) obj;
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f13069a) {
                    this.f13069a.position(0);
                    messageDigest.update(this.f13069a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$c */
    public static final class C6070c implements C6073f<AssetFileDescriptor> {
        /* renamed from: a */
        public final void mo17026a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$d */
    public static final class C6071d implements C6073f<ByteBuffer> {
        /* renamed from: a */
        public final void mo17026a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(new C6078b0((ByteBuffer) obj));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$e */
    public static class C6072e {
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$f */
    public interface C6073f<T> {
        /* renamed from: a */
        void mo17026a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$g */
    public static final class C6074g implements C6073f<ParcelFileDescriptor> {
        /* renamed from: a */
        public final void mo17026a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        }
    }

    public VideoDecoder(C5998d dVar, C6073f<T> fVar) {
        C6072e eVar = f13064f;
        this.f13066b = dVar;
        this.f13065a = fVar;
        this.f13067c = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m12044c(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r15) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L_0x0060
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L_0x0060
            if (r14 == r0) goto L_0x0060
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$f r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.f13052d
            if (r15 == r0) goto L_0x0060
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch:{ all -> 0x0051 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0051 }
            r1 = 19
            java.lang.String r1 = r9.extractMetadata(r1)     // Catch:{ all -> 0x0051 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0051 }
            r2 = 24
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch:{ all -> 0x0051 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x0051 }
            r3 = 90
            if (r2 == r3) goto L_0x0036
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L_0x0039
        L_0x0036:
            r8 = r1
            r1 = r0
            r0 = r8
        L_0x0039:
            float r13 = r15.mo17012b(r0, r1, r13, r14)     // Catch:{ all -> 0x0051 }
            float r14 = (float) r0     // Catch:{ all -> 0x0051 }
            float r14 = r14 * r13
            int r6 = java.lang.Math.round(r14)     // Catch:{ all -> 0x0051 }
            float r14 = (float) r1     // Catch:{ all -> 0x0051 }
            float r13 = r13 * r14
            int r7 = java.lang.Math.round(r13)     // Catch:{ all -> 0x0051 }
            r2 = r9
            r3 = r10
            r5 = r12
            android.graphics.Bitmap r13 = r2.getScaledFrameAtTime(r3, r5, r6, r7)     // Catch:{ all -> 0x0051 }
            goto L_0x0061
        L_0x0051:
            r13 = move-exception
            r14 = 3
            java.lang.String r15 = "VideoDecoder"
            boolean r14 = android.util.Log.isLoggable(r15, r14)
            if (r14 == 0) goto L_0x0060
            java.lang.String r14 = "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame"
            android.util.Log.d(r15, r14, r13)
        L_0x0060:
            r13 = 0
        L_0x0061:
            if (r13 != 0) goto L_0x0067
            android.graphics.Bitmap r13 = r9.getFrameAtTime(r10, r12)
        L_0x0067:
            if (r13 == 0) goto L_0x006a
            return r13
        L_0x006a:
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$VideoDecoderException r9 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$VideoDecoderException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.VideoDecoder.m12044c(android.media.MediaMetadataRetriever, long, int, int, int, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public final boolean mo17023a(T t, C7114e eVar) {
        return true;
    }

    /* renamed from: b */
    public final C6051s<Bitmap> mo17024b(T t, int i, int i2, C7114e eVar) throws IOException {
        int i3;
        long longValue = ((Long) eVar.mo19443c(f13062d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) eVar.mo19443c(f13063e);
            if (num == null) {
                num = 2;
            }
            DownsampleStrategy downsampleStrategy = (DownsampleStrategy) eVar.mo19443c(DownsampleStrategy.f13054f);
            if (downsampleStrategy == null) {
                downsampleStrategy = DownsampleStrategy.f13053e;
            }
            DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
            this.f13067c.getClass();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                this.f13065a.mo17026a(mediaMetadataRetriever, t);
                Bitmap c = m12044c(mediaMetadataRetriever, longValue, num.intValue(), i, i2, downsampleStrategy2);
                if (i3 < 29) {
                    mediaMetadataRetriever.release();
                }
                return C6081e.m12065e(c, this.f13066b);
            } finally {
                if (Build.VERSION.SDK_INT >= 29) {
                    mediaMetadataRetriever.close();
                } else {
                    mediaMetadataRetriever.release();
                }
            }
        } else {
            throw new IllegalArgumentException(C0073e.m205e("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
    }
}
