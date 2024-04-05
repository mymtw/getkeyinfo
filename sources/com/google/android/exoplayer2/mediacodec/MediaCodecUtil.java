package com.google.android.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import p001a0.C0005b;
import p003a2.C0023f;
import p504ai.C13983i;
import p504ai.C13988n;
import p513bj.C14049b0;

@SuppressLint({"InlinedApi"})
public final class MediaCodecUtil {

    /* renamed from: a */
    public static final Pattern f31669a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    public static final HashMap<C14235b, List<C14246c>> f31670b = new HashMap<>();

    /* renamed from: c */
    public static int f31671c = -1;

    public static class DecoderQueryException extends Exception {
        public DecoderQueryException(Throwable th, C14234a aVar) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$b */
    public static final class C14235b {

        /* renamed from: a */
        public final String f31672a;

        /* renamed from: b */
        public final boolean f31673b;

        /* renamed from: c */
        public final boolean f31674c;

        public C14235b(String str, boolean z, boolean z2) {
            this.f31672a = str;
            this.f31673b = z;
            this.f31674c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C14235b.class) {
                return false;
            }
            C14235b bVar = (C14235b) obj;
            return TextUtils.equals(this.f31672a, bVar.f31672a) && this.f31673b == bVar.f31673b && this.f31674c == bVar.f31674c;
        }

        public final int hashCode() {
            int i = 1231;
            int e = (C0023f.m105e(this.f31672a, 31, 31) + (this.f31673b ? 1231 : 1237)) * 31;
            if (!this.f31674c) {
                i = 1237;
            }
            return e + i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$c */
    public interface C14236c {
        /* renamed from: a */
        MediaCodecInfo mo47376a(int i);

        /* renamed from: b */
        boolean mo47377b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: c */
        boolean mo47378c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: d */
        int mo47379d();

        /* renamed from: e */
        boolean mo47380e();
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$d */
    public static final class C14237d implements C14236c {
        /* renamed from: a */
        public final MediaCodecInfo mo47376a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        /* renamed from: b */
        public final boolean mo47377b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        /* renamed from: c */
        public final boolean mo47378c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        /* renamed from: d */
        public final int mo47379d() {
            return MediaCodecList.getCodecCount();
        }

        /* renamed from: e */
        public final boolean mo47380e() {
            return false;
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$e */
    public static final class C14238e implements C14236c {

        /* renamed from: a */
        public final int f31675a;

        /* renamed from: b */
        public MediaCodecInfo[] f31676b;

        public C14238e(boolean z, boolean z2) {
            this.f31675a = (z || z2) ? 1 : 0;
        }

        /* renamed from: a */
        public final MediaCodecInfo mo47376a(int i) {
            if (this.f31676b == null) {
                this.f31676b = new MediaCodecList(this.f31675a).getCodecInfos();
            }
            return this.f31676b[i];
        }

        /* renamed from: b */
        public final boolean mo47377b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        /* renamed from: c */
        public final boolean mo47378c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        /* renamed from: d */
        public final int mo47379d() {
            if (this.f31676b == null) {
                this.f31676b = new MediaCodecList(this.f31675a).getCodecInfos();
            }
            return this.f31676b.length;
        }

        /* renamed from: e */
        public final boolean mo47380e() {
            return true;
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$f */
    public interface C14239f<T> {
        /* renamed from: e */
        int mo3372e(T t);
    }

    /* renamed from: a */
    public static void m22256a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (C14049b0.f30913a < 26 && C14049b0.f30914b.equals("R9") && arrayList.size() == 1 && ((C14246c) arrayList.get(0)).f31692a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(C14246c.m22313g("OMX.google.raw.decoder", "audio/raw", "audio/raw", (MediaCodecInfo.CodecCapabilities) null, false, true, false, false));
            }
            Collections.sort(arrayList, new C13988n(new C13983i()));
        }
        int i = C14049b0.f30913a;
        if (i < 21 && arrayList.size() > 1) {
            String str2 = ((C14246c) arrayList.get(0)).f31692a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new C13988n(new C0391c()));
            }
        }
        if (i < 30 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((C14246c) arrayList.get(0)).f31692a)) {
            arrayList.add((C14246c) arrayList.remove(0));
        }
    }

    /* renamed from: b */
    public static String m22257b(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (!str2.equals("audio/flac") || !"OMX.lge.flac.decoder".equals(str)) {
                return null;
            }
            return "audio/x-lg-flac";
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x088d, code lost:
        r1 = -1;
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x088f, code lost:
        if (r2 != r1) goto L_0x0899;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0891, code lost:
        p003a2.C0023f.m112m(30, "Unknown AV1 level: ", r11, "MediaCodecUtil");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:?, code lost:
        return new android.util.Pair<>(java.lang.Integer.valueOf(r0), java.lang.Integer.valueOf(r2));
     */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x03fa A[Catch:{ NumberFormatException -> 0x0409 }] */
    /* JADX WARNING: Removed duplicated region for block: B:452:0x0755  */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x075c  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m22258c(com.google.android.exoplayer2.Format r17) {
        /*
            r0 = r17
            java.lang.String r1 = r0.codecs
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            java.lang.String r2 = "\\."
            java.lang.String[] r1 = r1.split(r2)
            java.lang.String r2 = r0.sampleMimeType
            java.lang.String r3 = "video/dolby-vision"
            boolean r2 = r3.equals(r2)
            r3 = 512(0x200, float:7.175E-43)
            r4 = 256(0x100, float:3.59E-43)
            r5 = 128(0x80, float:1.794E-43)
            r6 = 64
            r7 = 32
            java.lang.String r8 = "MediaCodecUtil"
            r9 = 16
            r10 = 8
            r11 = 4
            r12 = 3
            r13 = 2
            r14 = 1
            if (r2 == 0) goto L_0x0268
            java.lang.String r0 = r0.codecs
            int r2 = r1.length
            java.lang.String r15 = "Ignoring malformed Dolby Vision codec string: "
            if (r2 >= r12) goto L_0x004c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0042
            java.lang.String r0 = r15.concat(r0)
            goto L_0x0047
        L_0x0042:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r15)
        L_0x0047:
            android.util.Log.w(r8, r0)
            goto L_0x0260
        L_0x004c:
            java.util.regex.Pattern r2 = f31669a
            r12 = r1[r14]
            java.util.regex.Matcher r2 = r2.matcher(r12)
            boolean r12 = r2.matches()
            if (r12 != 0) goto L_0x0073
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0069
            java.lang.String r0 = r15.concat(r0)
            goto L_0x006e
        L_0x0069:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r15)
        L_0x006e:
            android.util.Log.w(r8, r0)
            goto L_0x0260
        L_0x0073:
            java.lang.String r0 = r2.group(r14)
            if (r0 != 0) goto L_0x007b
            goto L_0x012e
        L_0x007b:
            int r2 = r0.hashCode()
            switch(r2) {
                case 1536: goto L_0x00ec;
                case 1537: goto L_0x00e1;
                case 1538: goto L_0x00d6;
                case 1539: goto L_0x00cb;
                case 1540: goto L_0x00c0;
                case 1541: goto L_0x00b5;
                case 1542: goto L_0x00aa;
                case 1543: goto L_0x009f;
                case 1544: goto L_0x0092;
                case 1545: goto L_0x0084;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x00f7
        L_0x0084:
            java.lang.String r2 = "09"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x008e
            goto L_0x00f7
        L_0x008e:
            r2 = 9
            goto L_0x00f8
        L_0x0092:
            java.lang.String r2 = "08"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x009c
            goto L_0x00f7
        L_0x009c:
            r2 = r10
            goto L_0x00f8
        L_0x009f:
            java.lang.String r2 = "07"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x00a8
            goto L_0x00f7
        L_0x00a8:
            r2 = 7
            goto L_0x00f8
        L_0x00aa:
            java.lang.String r2 = "06"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x00b3
            goto L_0x00f7
        L_0x00b3:
            r2 = 6
            goto L_0x00f8
        L_0x00b5:
            java.lang.String r2 = "05"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x00be
            goto L_0x00f7
        L_0x00be:
            r2 = 5
            goto L_0x00f8
        L_0x00c0:
            java.lang.String r2 = "04"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x00c9
            goto L_0x00f7
        L_0x00c9:
            r2 = r11
            goto L_0x00f8
        L_0x00cb:
            java.lang.String r2 = "03"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x00d4
            goto L_0x00f7
        L_0x00d4:
            r2 = 3
            goto L_0x00f8
        L_0x00d6:
            java.lang.String r2 = "02"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x00df
            goto L_0x00f7
        L_0x00df:
            r2 = r13
            goto L_0x00f8
        L_0x00e1:
            java.lang.String r2 = "01"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x00ea
            goto L_0x00f7
        L_0x00ea:
            r2 = r14
            goto L_0x00f8
        L_0x00ec:
            java.lang.String r2 = "00"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            r2 = 0
            goto L_0x00f8
        L_0x00f7:
            r2 = -1
        L_0x00f8:
            switch(r2) {
                case 0: goto L_0x0129;
                case 1: goto L_0x0124;
                case 2: goto L_0x011f;
                case 3: goto L_0x011a;
                case 4: goto L_0x0115;
                case 5: goto L_0x0110;
                case 6: goto L_0x010b;
                case 7: goto L_0x0106;
                case 8: goto L_0x0101;
                case 9: goto L_0x00fc;
                default: goto L_0x00fb;
            }
        L_0x00fb:
            goto L_0x012e
        L_0x00fc:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L_0x012f
        L_0x0101:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            goto L_0x012f
        L_0x0106:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            goto L_0x012f
        L_0x010b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            goto L_0x012f
        L_0x0110:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x012f
        L_0x0115:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            goto L_0x012f
        L_0x011a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            goto L_0x012f
        L_0x011f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            goto L_0x012f
        L_0x0124:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            goto L_0x012f
        L_0x0129:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            goto L_0x012f
        L_0x012e:
            r2 = 0
        L_0x012f:
            if (r2 != 0) goto L_0x014c
            java.lang.String r1 = "Unknown Dolby Vision profile string: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0142
            java.lang.String r0 = r1.concat(r0)
            goto L_0x0147
        L_0x0142:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x0147:
            android.util.Log.w(r8, r0)
            goto L_0x0260
        L_0x014c:
            r0 = r1[r13]
            if (r0 != 0) goto L_0x0152
            goto L_0x0244
        L_0x0152:
            int r1 = r0.hashCode()
            switch(r1) {
                case 1537: goto L_0x01ed;
                case 1538: goto L_0x01e2;
                case 1539: goto L_0x01d7;
                case 1540: goto L_0x01cc;
                case 1541: goto L_0x01c1;
                case 1542: goto L_0x01b6;
                case 1543: goto L_0x01ab;
                case 1544: goto L_0x01a0;
                case 1545: goto L_0x0193;
                case 1567: goto L_0x0185;
                case 1568: goto L_0x0177;
                case 1569: goto L_0x0169;
                case 1570: goto L_0x015b;
                default: goto L_0x0159;
            }
        L_0x0159:
            goto L_0x01f8
        L_0x015b:
            java.lang.String r1 = "13"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0165
            goto L_0x01f8
        L_0x0165:
            r1 = 12
            goto L_0x01f9
        L_0x0169:
            java.lang.String r1 = "12"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0173
            goto L_0x01f8
        L_0x0173:
            r1 = 11
            goto L_0x01f9
        L_0x0177:
            java.lang.String r1 = "11"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0181
            goto L_0x01f8
        L_0x0181:
            r1 = 10
            goto L_0x01f9
        L_0x0185:
            java.lang.String r1 = "10"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x018f
            goto L_0x01f8
        L_0x018f:
            r1 = 9
            goto L_0x01f9
        L_0x0193:
            java.lang.String r1 = "09"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x019d
            goto L_0x01f8
        L_0x019d:
            r1 = r10
            goto L_0x01f9
        L_0x01a0:
            java.lang.String r1 = "08"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x01a9
            goto L_0x01f8
        L_0x01a9:
            r1 = 7
            goto L_0x01f9
        L_0x01ab:
            java.lang.String r1 = "07"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x01b4
            goto L_0x01f8
        L_0x01b4:
            r1 = 6
            goto L_0x01f9
        L_0x01b6:
            java.lang.String r1 = "06"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x01bf
            goto L_0x01f8
        L_0x01bf:
            r1 = 5
            goto L_0x01f9
        L_0x01c1:
            java.lang.String r1 = "05"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x01ca
            goto L_0x01f8
        L_0x01ca:
            r1 = r11
            goto L_0x01f9
        L_0x01cc:
            java.lang.String r1 = "04"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x01d5
            goto L_0x01f8
        L_0x01d5:
            r1 = 3
            goto L_0x01f9
        L_0x01d7:
            java.lang.String r1 = "03"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x01e0
            goto L_0x01f8
        L_0x01e0:
            r1 = r13
            goto L_0x01f9
        L_0x01e2:
            java.lang.String r1 = "02"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x01eb
            goto L_0x01f8
        L_0x01eb:
            r1 = r14
            goto L_0x01f9
        L_0x01ed:
            java.lang.String r1 = "01"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x01f6
            goto L_0x01f8
        L_0x01f6:
            r1 = 0
            goto L_0x01f9
        L_0x01f8:
            r1 = -1
        L_0x01f9:
            switch(r1) {
                case 0: goto L_0x023f;
                case 1: goto L_0x023a;
                case 2: goto L_0x0235;
                case 3: goto L_0x0230;
                case 4: goto L_0x022b;
                case 5: goto L_0x0226;
                case 6: goto L_0x0221;
                case 7: goto L_0x021c;
                case 8: goto L_0x0217;
                case 9: goto L_0x0212;
                case 10: goto L_0x020b;
                case 11: goto L_0x0204;
                case 12: goto L_0x01fd;
                default: goto L_0x01fc;
            }
        L_0x01fc:
            goto L_0x0244
        L_0x01fd:
            r1 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0245
        L_0x0204:
            r1 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0245
        L_0x020b:
            r1 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0245
        L_0x0212:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            goto L_0x0245
        L_0x0217:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            goto L_0x0245
        L_0x021c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            goto L_0x0245
        L_0x0221:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            goto L_0x0245
        L_0x0226:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            goto L_0x0245
        L_0x022b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            goto L_0x0245
        L_0x0230:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            goto L_0x0245
        L_0x0235:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            goto L_0x0245
        L_0x023a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            goto L_0x0245
        L_0x023f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            goto L_0x0245
        L_0x0244:
            r1 = 0
        L_0x0245:
            if (r1 != 0) goto L_0x0262
            java.lang.String r1 = "Unknown Dolby Vision level string: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0258
            java.lang.String r0 = r1.concat(r0)
            goto L_0x025d
        L_0x0258:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x025d:
            android.util.Log.w(r8, r0)
        L_0x0260:
            r0 = 0
            goto L_0x0267
        L_0x0262:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
        L_0x0267:
            return r0
        L_0x0268:
            r2 = 0
            r2 = r1[r2]
            r2.getClass()
            int r12 = r2.hashCode()
            switch(r12) {
                case 3004662: goto L_0x02b8;
                case 3006243: goto L_0x02ad;
                case 3006244: goto L_0x02a2;
                case 3199032: goto L_0x0297;
                case 3214780: goto L_0x028c;
                case 3356560: goto L_0x0281;
                case 3624515: goto L_0x0276;
                default: goto L_0x0275;
            }
        L_0x0275:
            goto L_0x02c3
        L_0x0276:
            java.lang.String r12 = "vp09"
            boolean r2 = r2.equals(r12)
            if (r2 != 0) goto L_0x027f
            goto L_0x02c3
        L_0x027f:
            r2 = 6
            goto L_0x02c4
        L_0x0281:
            java.lang.String r12 = "mp4a"
            boolean r2 = r2.equals(r12)
            if (r2 != 0) goto L_0x028a
            goto L_0x02c3
        L_0x028a:
            r2 = 5
            goto L_0x02c4
        L_0x028c:
            java.lang.String r12 = "hvc1"
            boolean r2 = r2.equals(r12)
            if (r2 != 0) goto L_0x0295
            goto L_0x02c3
        L_0x0295:
            r2 = r11
            goto L_0x02c4
        L_0x0297:
            java.lang.String r12 = "hev1"
            boolean r2 = r2.equals(r12)
            if (r2 != 0) goto L_0x02a0
            goto L_0x02c3
        L_0x02a0:
            r2 = 3
            goto L_0x02c4
        L_0x02a2:
            java.lang.String r12 = "avc2"
            boolean r2 = r2.equals(r12)
            if (r2 != 0) goto L_0x02ab
            goto L_0x02c3
        L_0x02ab:
            r2 = r13
            goto L_0x02c4
        L_0x02ad:
            java.lang.String r12 = "avc1"
            boolean r2 = r2.equals(r12)
            if (r2 != 0) goto L_0x02b6
            goto L_0x02c3
        L_0x02b6:
            r2 = r14
            goto L_0x02c4
        L_0x02b8:
            java.lang.String r12 = "av01"
            boolean r2 = r2.equals(r12)
            if (r2 != 0) goto L_0x02c1
            goto L_0x02c3
        L_0x02c1:
            r2 = 0
            goto L_0x02c4
        L_0x02c3:
            r2 = -1
        L_0x02c4:
            switch(r2) {
                case 0: goto L_0x07dc;
                case 1: goto L_0x06d8;
                case 2: goto L_0x06d8;
                case 3: goto L_0x0422;
                case 4: goto L_0x0422;
                case 5: goto L_0x0391;
                case 6: goto L_0x02c9;
                default: goto L_0x02c7;
            }
        L_0x02c7:
            r0 = 0
            return r0
        L_0x02c9:
            java.lang.String r0 = r0.codecs
            int r2 = r1.length
            java.lang.String r12 = "Ignoring malformed VP9 codec string: "
            r15 = 3
            if (r2 >= r15) goto L_0x02ea
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x02e0
            java.lang.String r0 = r12.concat(r0)
            goto L_0x02e5
        L_0x02e0:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r12)
        L_0x02e5:
            android.util.Log.w(r8, r0)
            goto L_0x038f
        L_0x02ea:
            r2 = r1[r14]     // Catch:{ NumberFormatException -> 0x0378 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0378 }
            r1 = r1[r13]     // Catch:{ NumberFormatException -> 0x0378 }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0378 }
            if (r2 == 0) goto L_0x0307
            if (r2 == r14) goto L_0x0305
            if (r2 == r13) goto L_0x0303
            r1 = 3
            if (r2 == r1) goto L_0x0301
            r1 = -1
            goto L_0x0308
        L_0x0301:
            r1 = r10
            goto L_0x0308
        L_0x0303:
            r1 = r11
            goto L_0x0308
        L_0x0305:
            r1 = r13
            goto L_0x0308
        L_0x0307:
            r1 = r14
        L_0x0308:
            r12 = -1
            if (r1 != r12) goto L_0x0312
            java.lang.String r0 = "Unknown VP9 profile: "
            p003a2.C0023f.m112m(r7, r0, r2, r8)
            goto L_0x038f
        L_0x0312:
            r2 = 30
            r12 = 10
            if (r0 == r12) goto L_0x035b
            r12 = 11
            if (r0 == r12) goto L_0x0359
            r12 = 20
            if (r0 == r12) goto L_0x0357
            r11 = 21
            if (r0 == r11) goto L_0x0355
            if (r0 == r2) goto L_0x0353
            r9 = 31
            if (r0 == r9) goto L_0x0351
            r7 = 40
            if (r0 == r7) goto L_0x034f
            r6 = 41
            if (r0 == r6) goto L_0x034d
            r5 = 50
            if (r0 == r5) goto L_0x034b
            r4 = 51
            if (r0 == r4) goto L_0x035c
            switch(r0) {
                case 60: goto L_0x0347;
                case 61: goto L_0x0343;
                case 62: goto L_0x0340;
                default: goto L_0x033d;
            }
        L_0x033d:
            r3 = -1
            r4 = -1
            goto L_0x0362
        L_0x0340:
            r3 = 8192(0x2000, float:1.14794E-41)
            goto L_0x035c
        L_0x0343:
            r3 = -1
            r4 = 4096(0x1000, float:5.74E-42)
            goto L_0x0362
        L_0x0347:
            r3 = -1
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0362
        L_0x034b:
            r3 = r4
            goto L_0x035c
        L_0x034d:
            r3 = r5
            goto L_0x035c
        L_0x034f:
            r3 = r6
            goto L_0x035c
        L_0x0351:
            r3 = r7
            goto L_0x035c
        L_0x0353:
            r3 = r9
            goto L_0x035c
        L_0x0355:
            r3 = r10
            goto L_0x035c
        L_0x0357:
            r3 = r11
            goto L_0x035c
        L_0x0359:
            r3 = r13
            goto L_0x035c
        L_0x035b:
            r3 = r14
        L_0x035c:
            r4 = -1
            r16 = r4
            r4 = r3
            r3 = r16
        L_0x0362:
            if (r4 != r3) goto L_0x036a
            java.lang.String r1 = "Unknown VP9 level: "
            p003a2.C0023f.m112m(r2, r1, r0, r8)
            goto L_0x038f
        L_0x036a:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0.<init>(r1, r2)
            goto L_0x0390
        L_0x0378:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0387
            java.lang.String r0 = r12.concat(r0)
            goto L_0x038c
        L_0x0387:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r12)
        L_0x038c:
            android.util.Log.w(r8, r0)
        L_0x038f:
            r0 = 0
        L_0x0390:
            return r0
        L_0x0391:
            java.lang.String r0 = r0.codecs
            int r2 = r1.length
            java.lang.String r3 = "Ignoring malformed MP4A codec string: "
            r4 = 3
            if (r2 == r4) goto L_0x03b2
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x03a8
            java.lang.String r0 = r3.concat(r0)
            goto L_0x03ad
        L_0x03a8:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
        L_0x03ad:
            android.util.Log.w(r8, r0)
            goto L_0x0420
        L_0x03b2:
            r2 = r1[r14]     // Catch:{ NumberFormatException -> 0x0409 }
            int r2 = java.lang.Integer.parseInt(r2, r9)     // Catch:{ NumberFormatException -> 0x0409 }
            java.lang.String r2 = p513bj.C14065m.m21675e(r2)     // Catch:{ NumberFormatException -> 0x0409 }
            java.lang.String r4 = "audio/mp4a-latm"
            boolean r2 = r4.equals(r2)     // Catch:{ NumberFormatException -> 0x0409 }
            if (r2 == 0) goto L_0x0420
            r1 = r1[r13]     // Catch:{ NumberFormatException -> 0x0409 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0409 }
            r2 = 17
            if (r1 == r2) goto L_0x03f5
            r2 = 20
            if (r1 == r2) goto L_0x03f5
            r2 = 23
            if (r1 == r2) goto L_0x03f5
            r2 = 29
            if (r1 == r2) goto L_0x03f5
            r2 = 39
            if (r1 == r2) goto L_0x03f5
            r2 = 42
            if (r1 == r2) goto L_0x03f5
            switch(r1) {
                case 1: goto L_0x03f3;
                case 2: goto L_0x03f1;
                case 3: goto L_0x03ee;
                case 4: goto L_0x03f6;
                case 5: goto L_0x03eb;
                case 6: goto L_0x03e8;
                default: goto L_0x03e5;
            }     // Catch:{ NumberFormatException -> 0x0409 }
        L_0x03e5:
            r1 = -1
            r2 = -1
            goto L_0x03f8
        L_0x03e8:
            r1 = -1
            r2 = 6
            goto L_0x03f8
        L_0x03eb:
            r1 = -1
            r2 = 5
            goto L_0x03f8
        L_0x03ee:
            r1 = -1
            r2 = 3
            goto L_0x03f8
        L_0x03f1:
            r11 = r13
            goto L_0x03f6
        L_0x03f3:
            r11 = r14
            goto L_0x03f6
        L_0x03f5:
            r11 = r2
        L_0x03f6:
            r1 = -1
            r2 = r11
        L_0x03f8:
            if (r2 == r1) goto L_0x0420
            android.util.Pair r1 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x0409 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x0409 }
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0409 }
            r1.<init>(r2, r4)     // Catch:{ NumberFormatException -> 0x0409 }
            goto L_0x0421
        L_0x0409:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0418
            java.lang.String r0 = r3.concat(r0)
            goto L_0x041d
        L_0x0418:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
        L_0x041d:
            android.util.Log.w(r8, r0)
        L_0x0420:
            r1 = 0
        L_0x0421:
            return r1
        L_0x0422:
            java.lang.String r0 = r0.codecs
            int r2 = r1.length
            java.lang.String r12 = "Ignoring malformed HEVC codec string: "
            if (r2 >= r11) goto L_0x0442
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0438
            java.lang.String r0 = r12.concat(r0)
            goto L_0x043d
        L_0x0438:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r12)
        L_0x043d:
            android.util.Log.w(r8, r0)
            goto L_0x06d6
        L_0x0442:
            java.util.regex.Pattern r2 = f31669a
            r15 = r1[r14]
            java.util.regex.Matcher r2 = r2.matcher(r15)
            boolean r15 = r2.matches()
            if (r15 != 0) goto L_0x0469
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x045f
            java.lang.String r0 = r12.concat(r0)
            goto L_0x0464
        L_0x045f:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r12)
        L_0x0464:
            android.util.Log.w(r8, r0)
            goto L_0x06d6
        L_0x0469:
            java.lang.String r0 = r2.group(r14)
            java.lang.String r2 = "1"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0477
            r0 = r14
            goto L_0x0480
        L_0x0477:
            java.lang.String r2 = "2"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x06bd
            r0 = r13
        L_0x0480:
            r2 = 3
            r1 = r1[r2]
            if (r1 != 0) goto L_0x0487
            goto L_0x0695
        L_0x0487:
            int r2 = r1.hashCode()
            switch(r2) {
                case 70821: goto L_0x05d7;
                case 70914: goto L_0x05cc;
                case 70917: goto L_0x05c1;
                case 71007: goto L_0x05b6;
                case 71010: goto L_0x05ab;
                case 74665: goto L_0x05a0;
                case 74758: goto L_0x0595;
                case 74761: goto L_0x058a;
                case 74851: goto L_0x057d;
                case 74854: goto L_0x056f;
                case 2193639: goto L_0x0561;
                case 2193642: goto L_0x0553;
                case 2193732: goto L_0x0545;
                case 2193735: goto L_0x0537;
                case 2193738: goto L_0x0529;
                case 2193825: goto L_0x051b;
                case 2193828: goto L_0x050e;
                case 2193831: goto L_0x0500;
                case 2312803: goto L_0x04f2;
                case 2312806: goto L_0x04e4;
                case 2312896: goto L_0x04d6;
                case 2312899: goto L_0x04c8;
                case 2312902: goto L_0x04ba;
                case 2312989: goto L_0x04ac;
                case 2312992: goto L_0x049e;
                case 2312995: goto L_0x0490;
                default: goto L_0x048e;
            }
        L_0x048e:
            goto L_0x05e2
        L_0x0490:
            java.lang.String r2 = "L186"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x049a
            goto L_0x05e2
        L_0x049a:
            r2 = 25
            goto L_0x05e3
        L_0x049e:
            java.lang.String r2 = "L183"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x04a8
            goto L_0x05e2
        L_0x04a8:
            r2 = 24
            goto L_0x05e3
        L_0x04ac:
            java.lang.String r2 = "L180"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x04b6
            goto L_0x05e2
        L_0x04b6:
            r2 = 23
            goto L_0x05e3
        L_0x04ba:
            java.lang.String r2 = "L156"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x04c4
            goto L_0x05e2
        L_0x04c4:
            r2 = 22
            goto L_0x05e3
        L_0x04c8:
            java.lang.String r2 = "L153"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x04d2
            goto L_0x05e2
        L_0x04d2:
            r2 = 21
            goto L_0x05e3
        L_0x04d6:
            java.lang.String r2 = "L150"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x04e0
            goto L_0x05e2
        L_0x04e0:
            r2 = 20
            goto L_0x05e3
        L_0x04e4:
            java.lang.String r2 = "L123"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x04ee
            goto L_0x05e2
        L_0x04ee:
            r2 = 19
            goto L_0x05e3
        L_0x04f2:
            java.lang.String r2 = "L120"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x04fc
            goto L_0x05e2
        L_0x04fc:
            r2 = 18
            goto L_0x05e3
        L_0x0500:
            java.lang.String r2 = "H186"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x050a
            goto L_0x05e2
        L_0x050a:
            r2 = 17
            goto L_0x05e3
        L_0x050e:
            java.lang.String r2 = "H183"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0518
            goto L_0x05e2
        L_0x0518:
            r2 = r9
            goto L_0x05e3
        L_0x051b:
            java.lang.String r2 = "H180"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0525
            goto L_0x05e2
        L_0x0525:
            r2 = 15
            goto L_0x05e3
        L_0x0529:
            java.lang.String r2 = "H156"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0533
            goto L_0x05e2
        L_0x0533:
            r2 = 14
            goto L_0x05e3
        L_0x0537:
            java.lang.String r2 = "H153"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0541
            goto L_0x05e2
        L_0x0541:
            r2 = 13
            goto L_0x05e3
        L_0x0545:
            java.lang.String r2 = "H150"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x054f
            goto L_0x05e2
        L_0x054f:
            r2 = 12
            goto L_0x05e3
        L_0x0553:
            java.lang.String r2 = "H123"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x055d
            goto L_0x05e2
        L_0x055d:
            r2 = 11
            goto L_0x05e3
        L_0x0561:
            java.lang.String r2 = "H120"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x056b
            goto L_0x05e2
        L_0x056b:
            r2 = 10
            goto L_0x05e3
        L_0x056f:
            java.lang.String r2 = "L93"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0579
            goto L_0x05e2
        L_0x0579:
            r2 = 9
            goto L_0x05e3
        L_0x057d:
            java.lang.String r2 = "L90"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0587
            goto L_0x05e2
        L_0x0587:
            r2 = r10
            goto L_0x05e3
        L_0x058a:
            java.lang.String r2 = "L63"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0593
            goto L_0x05e2
        L_0x0593:
            r2 = 7
            goto L_0x05e3
        L_0x0595:
            java.lang.String r2 = "L60"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x059e
            goto L_0x05e2
        L_0x059e:
            r2 = 6
            goto L_0x05e3
        L_0x05a0:
            java.lang.String r2 = "L30"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x05a9
            goto L_0x05e2
        L_0x05a9:
            r2 = 5
            goto L_0x05e3
        L_0x05ab:
            java.lang.String r2 = "H93"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x05b4
            goto L_0x05e2
        L_0x05b4:
            r2 = r11
            goto L_0x05e3
        L_0x05b6:
            java.lang.String r2 = "H90"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x05bf
            goto L_0x05e2
        L_0x05bf:
            r2 = 3
            goto L_0x05e3
        L_0x05c1:
            java.lang.String r2 = "H63"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x05ca
            goto L_0x05e2
        L_0x05ca:
            r2 = r13
            goto L_0x05e3
        L_0x05cc:
            java.lang.String r2 = "H60"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x05d5
            goto L_0x05e2
        L_0x05d5:
            r2 = r14
            goto L_0x05e3
        L_0x05d7:
            java.lang.String r2 = "H30"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x05e0
            goto L_0x05e2
        L_0x05e0:
            r2 = 0
            goto L_0x05e3
        L_0x05e2:
            r2 = -1
        L_0x05e3:
            switch(r2) {
                case 0: goto L_0x0690;
                case 1: goto L_0x068b;
                case 2: goto L_0x0686;
                case 3: goto L_0x0681;
                case 4: goto L_0x067c;
                case 5: goto L_0x0677;
                case 6: goto L_0x0672;
                case 7: goto L_0x066d;
                case 8: goto L_0x0668;
                case 9: goto L_0x0663;
                case 10: goto L_0x065c;
                case 11: goto L_0x0655;
                case 12: goto L_0x064d;
                case 13: goto L_0x0646;
                case 14: goto L_0x063f;
                case 15: goto L_0x0638;
                case 16: goto L_0x0630;
                case 17: goto L_0x0628;
                case 18: goto L_0x0620;
                case 19: goto L_0x0618;
                case 20: goto L_0x0610;
                case 21: goto L_0x0608;
                case 22: goto L_0x0600;
                case 23: goto L_0x05f8;
                case 24: goto L_0x05f0;
                case 25: goto L_0x05e8;
                default: goto L_0x05e6;
            }
        L_0x05e6:
            goto L_0x0695
        L_0x05e8:
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0696
        L_0x05f0:
            r2 = 4194304(0x400000, float:5.877472E-39)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0696
        L_0x05f8:
            r2 = 1048576(0x100000, float:1.469368E-39)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0696
        L_0x0600:
            r2 = 262144(0x40000, float:3.67342E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0696
        L_0x0608:
            r2 = 65536(0x10000, float:9.18355E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0696
        L_0x0610:
            r2 = 16384(0x4000, float:2.2959E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0696
        L_0x0618:
            r2 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0696
        L_0x0620:
            r2 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0696
        L_0x0628:
            r2 = 33554432(0x2000000, float:9.403955E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0696
        L_0x0630:
            r2 = 8388608(0x800000, float:1.17549435E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0696
        L_0x0638:
            r2 = 2097152(0x200000, float:2.938736E-39)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0696
        L_0x063f:
            r2 = 524288(0x80000, float:7.34684E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0696
        L_0x0646:
            r2 = 131072(0x20000, float:1.83671E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0696
        L_0x064d:
            r2 = 32768(0x8000, float:4.5918E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0696
        L_0x0655:
            r2 = 8192(0x2000, float:1.14794E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0696
        L_0x065c:
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0696
        L_0x0663:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            goto L_0x0696
        L_0x0668:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            goto L_0x0696
        L_0x066d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            goto L_0x0696
        L_0x0672:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            goto L_0x0696
        L_0x0677:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            goto L_0x0696
        L_0x067c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L_0x0696
        L_0x0681:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            goto L_0x0696
        L_0x0686:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x0696
        L_0x068b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            goto L_0x0696
        L_0x0690:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            goto L_0x0696
        L_0x0695:
            r2 = 0
        L_0x0696:
            if (r2 != 0) goto L_0x06b3
            java.lang.String r0 = "Unknown HEVC level string: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            if (r2 == 0) goto L_0x06a9
            java.lang.String r0 = r0.concat(r1)
            goto L_0x06af
        L_0x06a9:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L_0x06af:
            android.util.Log.w(r8, r0)
            goto L_0x06d6
        L_0x06b3:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.<init>(r0, r2)
            goto L_0x06d7
        L_0x06bd:
            java.lang.String r1 = "Unknown HEVC profile string: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x06ce
            java.lang.String r0 = r1.concat(r0)
            goto L_0x06d3
        L_0x06ce:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x06d3:
            android.util.Log.w(r8, r0)
        L_0x06d6:
            r1 = 0
        L_0x06d7:
            return r1
        L_0x06d8:
            java.lang.String r0 = r0.codecs
            int r2 = r1.length
            java.lang.String r12 = "Ignoring malformed AVC codec string: "
            if (r2 >= r13) goto L_0x06f8
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x06ee
            java.lang.String r0 = r12.concat(r0)
            goto L_0x06f3
        L_0x06ee:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r12)
        L_0x06f3:
            android.util.Log.w(r8, r0)
            goto L_0x07da
        L_0x06f8:
            r2 = r1[r14]     // Catch:{ NumberFormatException -> 0x07c3 }
            int r2 = r2.length()     // Catch:{ NumberFormatException -> 0x07c3 }
            r15 = 6
            if (r2 != r15) goto L_0x0717
            r2 = r1[r14]     // Catch:{ NumberFormatException -> 0x07c3 }
            r15 = 0
            java.lang.String r2 = r2.substring(r15, r13)     // Catch:{ NumberFormatException -> 0x07c3 }
            int r2 = java.lang.Integer.parseInt(r2, r9)     // Catch:{ NumberFormatException -> 0x07c3 }
            r1 = r1[r14]     // Catch:{ NumberFormatException -> 0x07c3 }
            java.lang.String r1 = r1.substring(r11)     // Catch:{ NumberFormatException -> 0x07c3 }
            int r0 = java.lang.Integer.parseInt(r1, r9)     // Catch:{ NumberFormatException -> 0x07c3 }
            goto L_0x0727
        L_0x0717:
            int r2 = r1.length     // Catch:{ NumberFormatException -> 0x07c3 }
            r15 = 3
            if (r2 < r15) goto L_0x07ab
            r2 = r1[r14]     // Catch:{ NumberFormatException -> 0x07c3 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x07c3 }
            r1 = r1[r13]     // Catch:{ NumberFormatException -> 0x07c3 }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x07c3 }
        L_0x0727:
            r1 = 66
            if (r2 == r1) goto L_0x0750
            r1 = 77
            if (r2 == r1) goto L_0x0751
            r1 = 88
            if (r2 == r1) goto L_0x074e
            r1 = 100
            if (r2 == r1) goto L_0x074c
            r1 = 110(0x6e, float:1.54E-43)
            if (r2 == r1) goto L_0x074a
            r1 = 122(0x7a, float:1.71E-43)
            if (r2 == r1) goto L_0x0748
            r1 = 244(0xf4, float:3.42E-43)
            if (r2 == r1) goto L_0x0746
            r1 = -1
            r12 = -1
            goto L_0x0753
        L_0x0746:
            r13 = r6
            goto L_0x0751
        L_0x0748:
            r13 = r7
            goto L_0x0751
        L_0x074a:
            r13 = r9
            goto L_0x0751
        L_0x074c:
            r13 = r10
            goto L_0x0751
        L_0x074e:
            r13 = r11
            goto L_0x0751
        L_0x0750:
            r13 = r14
        L_0x0751:
            r1 = -1
            r12 = r13
        L_0x0753:
            if (r12 != r1) goto L_0x075c
            java.lang.String r0 = "Unknown AVC profile: "
            p003a2.C0023f.m112m(r7, r0, r2, r8)
            goto L_0x07da
        L_0x075c:
            switch(r0) {
                case 10: goto L_0x0773;
                case 11: goto L_0x0771;
                case 12: goto L_0x076f;
                case 13: goto L_0x076d;
                default: goto L_0x075f;
            }
        L_0x075f:
            switch(r0) {
                case 20: goto L_0x0779;
                case 21: goto L_0x0777;
                case 22: goto L_0x0775;
                default: goto L_0x0762;
            }
        L_0x0762:
            switch(r0) {
                case 30: goto L_0x077e;
                case 31: goto L_0x0792;
                case 32: goto L_0x077b;
                default: goto L_0x0765;
            }
        L_0x0765:
            switch(r0) {
                case 40: goto L_0x0786;
                case 41: goto L_0x0783;
                case 42: goto L_0x0780;
                default: goto L_0x0768;
            }
        L_0x0768:
            switch(r0) {
                case 50: goto L_0x0790;
                case 51: goto L_0x078c;
                case 52: goto L_0x0789;
                default: goto L_0x076b;
            }
        L_0x076b:
            r3 = -1
            goto L_0x0792
        L_0x076d:
            r3 = r9
            goto L_0x0792
        L_0x076f:
            r3 = r10
            goto L_0x0792
        L_0x0771:
            r3 = r11
            goto L_0x0792
        L_0x0773:
            r3 = r14
            goto L_0x0792
        L_0x0775:
            r3 = r5
            goto L_0x0792
        L_0x0777:
            r3 = r6
            goto L_0x0792
        L_0x0779:
            r3 = r7
            goto L_0x0792
        L_0x077b:
            r3 = 1024(0x400, float:1.435E-42)
            goto L_0x0792
        L_0x077e:
            r3 = r4
            goto L_0x0792
        L_0x0780:
            r3 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0792
        L_0x0783:
            r3 = 4096(0x1000, float:5.74E-42)
            goto L_0x0792
        L_0x0786:
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0792
        L_0x0789:
            r3 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0792
        L_0x078c:
            r3 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0792
        L_0x0790:
            r3 = 16384(0x4000, float:2.2959E-41)
        L_0x0792:
            r1 = -1
            if (r3 != r1) goto L_0x079d
            r1 = 30
            java.lang.String r2 = "Unknown AVC level: "
            p003a2.C0023f.m112m(r1, r2, r0, r8)
            goto L_0x07da
        L_0x079d:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r0.<init>(r1, r2)
            goto L_0x07db
        L_0x07ab:
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x07c3 }
            int r2 = r1.length()     // Catch:{ NumberFormatException -> 0x07c3 }
            if (r2 == 0) goto L_0x07ba
            java.lang.String r1 = r12.concat(r1)     // Catch:{ NumberFormatException -> 0x07c3 }
            goto L_0x07bf
        L_0x07ba:
            java.lang.String r1 = new java.lang.String     // Catch:{ NumberFormatException -> 0x07c3 }
            r1.<init>(r12)     // Catch:{ NumberFormatException -> 0x07c3 }
        L_0x07bf:
            android.util.Log.w(r8, r1)     // Catch:{ NumberFormatException -> 0x07c3 }
            goto L_0x07da
        L_0x07c3:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x07d2
            java.lang.String r0 = r12.concat(r0)
            goto L_0x07d7
        L_0x07d2:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r12)
        L_0x07d7:
            android.util.Log.w(r8, r0)
        L_0x07da:
            r0 = 0
        L_0x07db:
            return r0
        L_0x07dc:
            java.lang.String r2 = r0.codecs
            com.google.android.exoplayer2.video.ColorInfo r0 = r0.colorInfo
            int r9 = r1.length
            java.lang.String r12 = "Ignoring malformed AV1 codec string: "
            if (r9 >= r11) goto L_0x07fe
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x07f4
            java.lang.String r0 = r12.concat(r0)
            goto L_0x07f9
        L_0x07f4:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r12)
        L_0x07f9:
            android.util.Log.w(r8, r0)
            goto L_0x08be
        L_0x07fe:
            r9 = r1[r14]     // Catch:{ NumberFormatException -> 0x08a7 }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x08a7 }
            r11 = r1[r13]     // Catch:{ NumberFormatException -> 0x08a7 }
            r15 = 0
            java.lang.String r11 = r11.substring(r15, r13)     // Catch:{ NumberFormatException -> 0x08a7 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x08a7 }
            r15 = 3
            r1 = r1[r15]     // Catch:{ NumberFormatException -> 0x08a7 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x08a7 }
            if (r9 == 0) goto L_0x081f
            java.lang.String r0 = "Unknown AV1 profile: "
            p003a2.C0023f.m112m(r7, r0, r9, r8)
            goto L_0x08be
        L_0x081f:
            if (r1 == r10) goto L_0x082e
            r2 = 10
            if (r1 == r2) goto L_0x082e
            r0 = 34
            java.lang.String r2 = "Unknown AV1 bit depth: "
            p003a2.C0023f.m112m(r0, r2, r1, r8)
            goto L_0x08be
        L_0x082e:
            if (r1 != r10) goto L_0x0832
            r0 = r14
            goto L_0x0844
        L_0x0832:
            if (r0 == 0) goto L_0x0843
            byte[] r1 = r0.hdrStaticInfo
            if (r1 != 0) goto L_0x0840
            int r0 = r0.colorTransfer
            r1 = 7
            if (r0 == r1) goto L_0x0840
            r1 = 6
            if (r0 != r1) goto L_0x0843
        L_0x0840:
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x0844
        L_0x0843:
            r0 = r13
        L_0x0844:
            switch(r11) {
                case 0: goto L_0x088c;
                case 1: goto L_0x088a;
                case 2: goto L_0x0887;
                case 3: goto L_0x0885;
                case 4: goto L_0x0881;
                case 5: goto L_0x087f;
                case 6: goto L_0x087d;
                case 7: goto L_0x087b;
                case 8: goto L_0x0879;
                case 9: goto L_0x088d;
                case 10: goto L_0x0875;
                case 11: goto L_0x0871;
                case 12: goto L_0x086d;
                case 13: goto L_0x086a;
                case 14: goto L_0x0867;
                case 15: goto L_0x0863;
                case 16: goto L_0x0860;
                case 17: goto L_0x085d;
                case 18: goto L_0x085a;
                case 19: goto L_0x0857;
                case 20: goto L_0x0854;
                case 21: goto L_0x0851;
                case 22: goto L_0x084e;
                case 23: goto L_0x084b;
                default: goto L_0x0847;
            }
        L_0x0847:
            r1 = -1
            r2 = -1
            goto L_0x088f
        L_0x084b:
            r3 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x088d
        L_0x084e:
            r3 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x088d
        L_0x0851:
            r3 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x088d
        L_0x0854:
            r3 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x088d
        L_0x0857:
            r3 = 524288(0x80000, float:7.34684E-40)
            goto L_0x088d
        L_0x085a:
            r3 = 262144(0x40000, float:3.67342E-40)
            goto L_0x088d
        L_0x085d:
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x088d
        L_0x0860:
            r3 = 65536(0x10000, float:9.18355E-41)
            goto L_0x088d
        L_0x0863:
            r3 = 32768(0x8000, float:4.5918E-41)
            goto L_0x088d
        L_0x0867:
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x088d
        L_0x086a:
            r3 = 8192(0x2000, float:1.14794E-41)
            goto L_0x088d
        L_0x086d:
            r1 = -1
            r2 = 4096(0x1000, float:5.74E-42)
            goto L_0x088f
        L_0x0871:
            r1 = -1
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x088f
        L_0x0875:
            r1 = -1
            r2 = 1024(0x400, float:1.435E-42)
            goto L_0x088f
        L_0x0879:
            r3 = r4
            goto L_0x088d
        L_0x087b:
            r3 = r5
            goto L_0x088d
        L_0x087d:
            r3 = r6
            goto L_0x088d
        L_0x087f:
            r3 = r7
            goto L_0x088d
        L_0x0881:
            r1 = -1
            r2 = 16
            goto L_0x088f
        L_0x0885:
            r3 = r10
            goto L_0x088d
        L_0x0887:
            r1 = -1
            r2 = 4
            goto L_0x088f
        L_0x088a:
            r3 = r13
            goto L_0x088d
        L_0x088c:
            r3 = r14
        L_0x088d:
            r1 = -1
            r2 = r3
        L_0x088f:
            if (r2 != r1) goto L_0x0899
            r0 = 30
            java.lang.String r1 = "Unknown AV1 level: "
            p003a2.C0023f.m112m(r0, r1, r11, r8)
            goto L_0x08be
        L_0x0899:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.<init>(r0, r2)
            goto L_0x08bf
        L_0x08a7:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x08b6
            java.lang.String r0 = r12.concat(r0)
            goto L_0x08bb
        L_0x08b6:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r12)
        L_0x08bb:
            android.util.Log.w(r8, r0)
        L_0x08be:
            r1 = 0
        L_0x08bf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.m22258c(com.google.android.exoplayer2.Format):android.util.Pair");
    }

    /* renamed from: d */
    public static synchronized List<C14246c> m22259d(String str, boolean z, boolean z2) throws DecoderQueryException {
        synchronized (MediaCodecUtil.class) {
            C14235b bVar = new C14235b(str, z, z2);
            HashMap<C14235b, List<C14246c>> hashMap = f31670b;
            List<C14246c> list = hashMap.get(bVar);
            if (list != null) {
                return list;
            }
            int i = C14049b0.f30913a;
            ArrayList<C14246c> e = m22260e(bVar, i >= 21 ? new C14238e(z, z2) : new C14237d());
            if (z && e.isEmpty() && 21 <= i && i <= 23) {
                e = m22260e(bVar, new C14237d());
                if (!e.isEmpty()) {
                    String str2 = e.get(0).f31692a;
                    StringBuilder sb = new StringBuilder(str.length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            m22256a(str, e);
            List<C14246c> unmodifiableList = Collections.unmodifiableList(e);
            hashMap.put(bVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0120 A[SYNTHETIC, Splitter:B:67:0x0120] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0151 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.google.android.exoplayer2.mediacodec.C14246c> m22260e(com.google.android.exoplayer2.mediacodec.MediaCodecUtil.C14235b r24, com.google.android.exoplayer2.mediacodec.MediaCodecUtil.C14236c r25) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
        /*
            r1 = r24
            r2 = r25
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0187 }
            r5.<init>()     // Catch:{ Exception -> 0x0187 }
            java.lang.String r14 = r1.f31672a     // Catch:{ Exception -> 0x0187 }
            int r15 = r25.mo47379d()     // Catch:{ Exception -> 0x0187 }
            boolean r13 = r25.mo47380e()     // Catch:{ Exception -> 0x0187 }
            r16 = 0
            r12 = r16
        L_0x001b:
            if (r12 >= r15) goto L_0x0186
            android.media.MediaCodecInfo r0 = r2.mo47376a(r12)     // Catch:{ Exception -> 0x0187 }
            int r6 = p513bj.C14049b0.f30913a     // Catch:{ Exception -> 0x0187 }
            r7 = 29
            if (r6 < r7) goto L_0x002f
            boolean r9 = r0.isAlias()     // Catch:{ Exception -> 0x0187 }
            if (r9 == 0) goto L_0x002f
            r9 = 1
            goto L_0x0031
        L_0x002f:
            r9 = r16
        L_0x0031:
            if (r9 == 0) goto L_0x0034
            goto L_0x006f
        L_0x0034:
            java.lang.String r11 = r0.getName()     // Catch:{ Exception -> 0x0187 }
            boolean r9 = m22261f(r0, r11, r13, r14)     // Catch:{ Exception -> 0x0187 }
            if (r9 != 0) goto L_0x003f
            goto L_0x006f
        L_0x003f:
            java.lang.String r10 = m22257b(r0, r11, r14)     // Catch:{ Exception -> 0x0187 }
            if (r10 != 0) goto L_0x0046
            goto L_0x006f
        L_0x0046:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r0.getCapabilitiesForType(r10)     // Catch:{ Exception -> 0x010f }
            boolean r17 = r2.mo47377b(r4, r10, r9)     // Catch:{ Exception -> 0x010f }
            boolean r18 = r2.mo47378c(r4, r9)     // Catch:{ Exception -> 0x010f }
            boolean r8 = r1.f31674c     // Catch:{ Exception -> 0x010f }
            if (r8 != 0) goto L_0x0058
            if (r18 != 0) goto L_0x006f
        L_0x0058:
            if (r8 == 0) goto L_0x005d
            if (r17 != 0) goto L_0x005d
            goto L_0x006f
        L_0x005d:
            boolean r8 = r2.mo47377b(r3, r10, r9)     // Catch:{ Exception -> 0x010f }
            boolean r17 = r2.mo47378c(r3, r9)     // Catch:{ Exception -> 0x010f }
            boolean r7 = r1.f31673b     // Catch:{ Exception -> 0x010f }
            if (r7 != 0) goto L_0x006b
            if (r17 != 0) goto L_0x006f
        L_0x006b:
            if (r7 == 0) goto L_0x0075
            if (r8 != 0) goto L_0x0075
        L_0x006f:
            r22 = r12
            r23 = r13
            goto L_0x014b
        L_0x0075:
            r7 = 29
            if (r6 < r7) goto L_0x0082
            boolean r7 = r0.isHardwareAccelerated()     // Catch:{ Exception -> 0x010f }
            r19 = r7
            r17 = 1
            goto L_0x008c
        L_0x0082:
            boolean r7 = m22262g(r0)     // Catch:{ Exception -> 0x010f }
            r17 = 1
            r7 = r7 ^ 1
            r19 = r7
        L_0x008c:
            boolean r20 = m22262g(r0)     // Catch:{ Exception -> 0x010f }
            r7 = 29
            if (r6 < r7) goto L_0x0099
            boolean r0 = r0.isVendor()     // Catch:{ Exception -> 0x010f }
            goto L_0x00be
        L_0x0099:
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x010f }
            java.lang.String r0 = p001a0.C0005b.m56q0(r0)     // Catch:{ Exception -> 0x010f }
            java.lang.String r6 = "omx.google."
            boolean r6 = r0.startsWith(r6)     // Catch:{ Exception -> 0x010f }
            if (r6 != 0) goto L_0x00ba
            java.lang.String r6 = "c2.android."
            boolean r6 = r0.startsWith(r6)     // Catch:{ Exception -> 0x010f }
            if (r6 != 0) goto L_0x00ba
            java.lang.String r6 = "c2.google."
            boolean r0 = r0.startsWith(r6)     // Catch:{ Exception -> 0x010f }
            if (r0 != 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            r17 = r16
        L_0x00bc:
            r0 = r17
        L_0x00be:
            if (r13 == 0) goto L_0x00c4
            boolean r6 = r1.f31673b     // Catch:{ Exception -> 0x010f }
            if (r6 == r8) goto L_0x00ca
        L_0x00c4:
            if (r13 != 0) goto L_0x00e6
            boolean r6 = r1.f31673b     // Catch:{ Exception -> 0x010f }
            if (r6 != 0) goto L_0x00e6
        L_0x00ca:
            r17 = 0
            r6 = r11
            r7 = r14
            r8 = r10
            r18 = r10
            r10 = r19
            r21 = r11
            r11 = r20
            r22 = r12
            r12 = r0
            r23 = r13
            r13 = r17
            com.google.android.exoplayer2.mediacodec.c r0 = com.google.android.exoplayer2.mediacodec.C14246c.m22313g(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x010d }
            r5.add(r0)     // Catch:{ Exception -> 0x010d }
            goto L_0x014b
        L_0x00e6:
            r18 = r10
            r21 = r11
            r22 = r12
            r23 = r13
            if (r23 != 0) goto L_0x014b
            if (r8 == 0) goto L_0x014b
            java.lang.String r6 = java.lang.String.valueOf(r21)     // Catch:{ Exception -> 0x010d }
            java.lang.String r7 = ".secure"
            java.lang.String r6 = r6.concat(r7)     // Catch:{ Exception -> 0x010d }
            r13 = 1
            r7 = r14
            r8 = r18
            r10 = r19
            r11 = r20
            r12 = r0
            com.google.android.exoplayer2.mediacodec.c r0 = com.google.android.exoplayer2.mediacodec.C14246c.m22313g(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x010d }
            r5.add(r0)     // Catch:{ Exception -> 0x010d }
            return r5
        L_0x010d:
            r0 = move-exception
            goto L_0x0118
        L_0x010f:
            r0 = move-exception
            r18 = r10
            r21 = r11
            r22 = r12
            r23 = r13
        L_0x0118:
            int r6 = p513bj.C14049b0.f30913a     // Catch:{ Exception -> 0x0187 }
            r7 = 23
            java.lang.String r8 = "MediaCodecUtil"
            if (r6 > r7) goto L_0x0151
            boolean r6 = r5.isEmpty()     // Catch:{ Exception -> 0x0187 }
            if (r6 != 0) goto L_0x0151
            java.lang.String r0 = java.lang.String.valueOf(r21)     // Catch:{ Exception -> 0x0187 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x0187 }
            int r0 = r0 + 46
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0187 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x0187 }
            java.lang.String r0 = "Skipping codec "
            r6.append(r0)     // Catch:{ Exception -> 0x0187 }
            r7 = r21
            r6.append(r7)     // Catch:{ Exception -> 0x0187 }
            java.lang.String r0 = " (failed to query capabilities)"
            r6.append(r0)     // Catch:{ Exception -> 0x0187 }
            java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x0187 }
            android.util.Log.e(r8, r0)     // Catch:{ Exception -> 0x0187 }
        L_0x014b:
            int r12 = r22 + 1
            r13 = r23
            goto L_0x001b
        L_0x0151:
            r7 = r21
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x0187 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x0187 }
            int r1 = r1 + 25
            int r2 = r18.length()     // Catch:{ Exception -> 0x0187 }
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0187 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0187 }
            java.lang.String r1 = "Failed to query codec "
            r2.append(r1)     // Catch:{ Exception -> 0x0187 }
            r2.append(r7)     // Catch:{ Exception -> 0x0187 }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x0187 }
            r1 = r18
            r2.append(r1)     // Catch:{ Exception -> 0x0187 }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x0187 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0187 }
            android.util.Log.e(r8, r1)     // Catch:{ Exception -> 0x0187 }
            throw r0     // Catch:{ Exception -> 0x0187 }
        L_0x0186:
            return r5
        L_0x0187:
            r0 = move-exception
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException r1 = new com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException
            r2 = 0
            r1.<init>(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.m22260e(com.google.android.exoplayer2.mediacodec.MediaCodecUtil$b, com.google.android.exoplayer2.mediacodec.MediaCodecUtil$c):java.util.ArrayList");
    }

    /* renamed from: f */
    public static boolean m22261f(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = C14049b0.f30913a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = C14049b0.f30914b;
            if ("a70".equals(str3) || ("Xiaomi".equals(C14049b0.f30915c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = C14049b0.f30914b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = C14049b0.f30914b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(C14049b0.f30915c))) {
            String str6 = C14049b0.f30914b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(C14049b0.f30915c)) {
            String str7 = C14049b0.f30914b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i > 19 || !C14049b0.f30914b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(str)) {
            return !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str);
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m22262g(MediaCodecInfo mediaCodecInfo) {
        if (C14049b0.f30913a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        String q0 = C0005b.m56q0(mediaCodecInfo.getName());
        if (q0.startsWith("arc.")) {
            return false;
        }
        return q0.startsWith("omx.google.") || q0.startsWith("omx.ffmpeg.") || (q0.startsWith("omx.sec.") && q0.contains(".sw.")) || q0.equals("omx.qcom.video.decoder.hevcswvdec") || q0.startsWith("c2.android.") || q0.startsWith("c2.google.") || (!q0.startsWith("omx.") && !q0.startsWith("c2."));
    }

    /* renamed from: h */
    public static int m22263h() throws DecoderQueryException {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        if (f31671c == -1) {
            int i2 = 0;
            List<C14246c> d = m22259d("video/avc", false, false);
            C14246c cVar = d.isEmpty() ? null : d.get(0);
            if (cVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = cVar.f31695d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = codecProfileLevelArr[i2].level;
                    if (i4 != 1 && i4 != 2) {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case 64:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN:
                                i = 921600;
                                break;
                            case RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE:
                                i = 1310720;
                                break;
                            case RecyclerView.C3084b0.FLAG_MOVED:
                            case RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case PrimitiveArrayBuilder.SMALL_CHUNK_SIZE:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            case 131072:
                            case PrimitiveArrayBuilder.MAX_CHUNK_SIZE:
                            case 524288:
                                i = 35651584;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    i3 = Math.max(i, i3);
                    i2++;
                }
                i2 = Math.max(i3, C14049b0.f30913a >= 21 ? 345600 : 172800);
            }
            f31671c = i2;
        }
        return f31671c;
    }
}
