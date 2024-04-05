package p633no;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* renamed from: no.c */
public final class C18285c {

    /* renamed from: a */
    public static HashMap f40135a = new HashMap();

    static {
        int i = Build.VERSION.SDK_INT;
        f40135a.put("video/avc", i >= 27 ? new int[]{65536, 1, 4, 2, 524288, 8, 16, 32, 64} : new int[]{1, 4, 2, 8, 16, 32, 64});
        f40135a.put("video/x-vnd.on2.vp8", new int[]{1});
        f40135a.put("video/hevc", i >= 29 ? new int[]{1, 2, RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT, 8192} : new int[]{1, 2, RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT});
        f40135a.put("video/x-vnd.on2.vp9", i >= 29 ? new int[]{1, 2, 4, RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT, PrimitiveArrayBuilder.SMALL_CHUNK_SIZE, 8, 8192, 32768} : new int[]{1, 2, 4, RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT, 8, 8192});
        if (i >= 29) {
            f40135a.put("video/av01", new int[]{1, 2, RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT, 8192});
        }
    }

    /* renamed from: a */
    public static MediaCodec m30910a(MediaFormat mediaFormat, Surface surface, boolean z, ArrayList arrayList) throws IllegalStateException, IOException {
        Iterator it = arrayList.iterator();
        MediaCodec mediaCodec = null;
        IOException iOException = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            try {
                MediaCodec mediaCodec2 = (MediaCodec) ((Callable) it.next()).call();
                if (mediaCodec2 != null) {
                    try {
                        mediaCodec2.configure(mediaFormat, surface, (MediaCrypto) null, z ? 1 : 0);
                        mediaCodec = mediaCodec2;
                        break;
                    } catch (Exception e) {
                        MediaCodec mediaCodec3 = mediaCodec2;
                        e = e;
                        mediaCodec = mediaCodec3;
                    }
                } else {
                    mediaCodec = mediaCodec2;
                }
            } catch (Exception e2) {
                e = e2;
                if (mediaCodec != null) {
                    mediaCodec.release();
                    mediaCodec = null;
                }
                if (e instanceof IOException) {
                    iOException = (IOException) e;
                }
            }
        }
        if (mediaCodec != null) {
            return mediaCodec;
        }
        if (iOException != null) {
            throw iOException;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public static ArrayList m30911b(boolean z, String str, MediaFormat mediaFormat) {
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (mediaCodecInfo.isEncoder() == z) {
                try {
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                    if (capabilitiesForType != null && (mediaFormat == null || capabilitiesForType.isFormatSupported(mediaFormat))) {
                        arrayList.add(new C18284b(mediaCodecInfo));
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0 = m30911b(r8, r6.getString("mime"), (android.media.MediaFormat) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r0.isEmpty() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        r7 = m30910a(r6, r7, r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r7 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        throw new com.linkedin.android.litr.exception.TrackTranscoderException(r9, r6, (android.media.MediaCodec) null, (android.media.MediaCodecList) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        if ((r5 instanceof java.io.IOException) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        throw new com.linkedin.android.litr.exception.TrackTranscoderException(r10, r6, (android.media.MediaCodec) null, (android.media.MediaCodecList) null, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        throw new com.linkedin.android.litr.exception.TrackTranscoderException(r11, r6, (android.media.MediaCodec) null, (android.media.MediaCodecList) null, r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0022 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.media.MediaCodec m30912c(android.media.MediaFormat r6, android.view.Surface r7, boolean r8, com.linkedin.android.litr.exception.TrackTranscoderException.Error r9, com.linkedin.android.litr.exception.TrackTranscoderException.Error r10, com.linkedin.android.litr.exception.TrackTranscoderException.Error r11) throws com.linkedin.android.litr.exception.TrackTranscoderException {
        /*
            java.lang.String r0 = "mime"
            r1 = 0
            java.lang.String r2 = r6.getString(r0)     // Catch:{ IOException | IllegalStateException -> 0x0022 }
            java.util.ArrayList r2 = m30911b(r8, r2, r6)     // Catch:{ IOException | IllegalStateException -> 0x0022 }
            boolean r3 = r2.isEmpty()     // Catch:{ IOException | IllegalStateException -> 0x0022 }
            if (r3 != 0) goto L_0x0016
            android.media.MediaCodec r2 = m30910a(r6, r7, r8, r2)     // Catch:{ IOException | IllegalStateException -> 0x0022 }
            goto L_0x0017
        L_0x0016:
            r2 = r1
        L_0x0017:
            if (r2 == 0) goto L_0x001a
            return r2
        L_0x001a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IOException | IllegalStateException -> 0x0022 }
            java.lang.String r3 = "Try fallbackToGetCodecByType"
            r2.<init>(r3)     // Catch:{ IOException | IllegalStateException -> 0x0022 }
            throw r2     // Catch:{ IOException | IllegalStateException -> 0x0022 }
        L_0x0022:
            java.lang.String r0 = r6.getString(r0)     // Catch:{ IOException -> 0x0041, IllegalStateException -> 0x003f }
            java.util.ArrayList r0 = m30911b(r8, r0, r1)     // Catch:{ IOException -> 0x0041, IllegalStateException -> 0x003f }
            boolean r2 = r0.isEmpty()     // Catch:{ IOException -> 0x0041, IllegalStateException -> 0x003f }
            if (r2 != 0) goto L_0x0035
            android.media.MediaCodec r7 = m30910a(r6, r7, r8, r0)     // Catch:{ IOException -> 0x0041, IllegalStateException -> 0x003f }
            goto L_0x0036
        L_0x0035:
            r7 = r1
        L_0x0036:
            if (r7 == 0) goto L_0x0039
            return r7
        L_0x0039:
            com.linkedin.android.litr.exception.TrackTranscoderException r7 = new com.linkedin.android.litr.exception.TrackTranscoderException     // Catch:{ IOException -> 0x0041, IllegalStateException -> 0x003f }
            r7.<init>(r9, r6, r1, r1)     // Catch:{ IOException -> 0x0041, IllegalStateException -> 0x003f }
            throw r7     // Catch:{ IOException -> 0x0041, IllegalStateException -> 0x003f }
        L_0x003f:
            r7 = move-exception
            goto L_0x0042
        L_0x0041:
            r7 = move-exception
        L_0x0042:
            r5 = r7
            boolean r7 = r5 instanceof java.io.IOException
            if (r7 == 0) goto L_0x0053
            com.linkedin.android.litr.exception.TrackTranscoderException r7 = new com.linkedin.android.litr.exception.TrackTranscoderException
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r10
            r2 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            throw r7
        L_0x0053:
            com.linkedin.android.litr.exception.TrackTranscoderException r7 = new com.linkedin.android.litr.exception.TrackTranscoderException
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r11
            r2 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p633no.C18285c.m30912c(android.media.MediaFormat, android.view.Surface, boolean, com.linkedin.android.litr.exception.TrackTranscoderException$Error, com.linkedin.android.litr.exception.TrackTranscoderException$Error, com.linkedin.android.litr.exception.TrackTranscoderException$Error):android.media.MediaCodec");
    }
}
