package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.exoplayer2.Format;
import p003a2.C0015b;
import p513bj.C14049b0;
import p513bj.C14065m;
import p619mh.C18224e;

/* renamed from: com.google.android.exoplayer2.mediacodec.c */
public final class C14246c {

    /* renamed from: a */
    public final String f31692a;

    /* renamed from: b */
    public final String f31693b;

    /* renamed from: c */
    public final String f31694c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f31695d;

    /* renamed from: e */
    public final boolean f31696e;

    /* renamed from: f */
    public final boolean f31697f;

    /* renamed from: g */
    public final boolean f31698g;

    public C14246c(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        str.getClass();
        this.f31692a = str;
        this.f31693b = str2;
        this.f31694c = str3;
        this.f31695d = codecCapabilities;
        this.f31696e = z;
        this.f31697f = z2;
        this.f31698g = C14065m.m21681k(str2);
    }

    /* renamed from: a */
    public static boolean m22312a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = C14049b0.f30913a;
        Point point = new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i4 = point.x;
        int i5 = point.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i4, i5) : videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006d, code lost:
        if ((p513bj.C14049b0.f30913a >= 21 && r10.isFeatureSupported("secure-playback")) != false) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005c  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.mediacodec.C14246c m22313g(java.lang.String r7, java.lang.String r8, java.lang.String r9, android.media.MediaCodecInfo.CodecCapabilities r10, boolean r11, boolean r12, boolean r13, boolean r14) {
        /*
            com.google.android.exoplayer2.mediacodec.c r11 = new com.google.android.exoplayer2.mediacodec.c
            r12 = 1
            r13 = 0
            if (r10 == 0) goto L_0x0046
            int r0 = p513bj.C14049b0.f30913a
            r1 = 19
            if (r0 < r1) goto L_0x0016
            java.lang.String r1 = "adaptive-playback"
            boolean r1 = r10.isFeatureSupported(r1)
            if (r1 == 0) goto L_0x0016
            r1 = r12
            goto L_0x0017
        L_0x0016:
            r1 = r13
        L_0x0017:
            if (r1 == 0) goto L_0x0046
            r1 = 22
            if (r0 > r1) goto L_0x0041
            java.lang.String r0 = p513bj.C14049b0.f30916d
            java.lang.String r1 = "ODROID-XU3"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x002f
            java.lang.String r1 = "Nexus 10"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0041
        L_0x002f:
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x003f
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0041
        L_0x003f:
            r0 = r12
            goto L_0x0042
        L_0x0041:
            r0 = r13
        L_0x0042:
            if (r0 != 0) goto L_0x0046
            r5 = r12
            goto L_0x0047
        L_0x0046:
            r5 = r13
        L_0x0047:
            r0 = 21
            if (r10 == 0) goto L_0x005a
            int r1 = p513bj.C14049b0.f30913a
            if (r1 < r0) goto L_0x0059
            java.lang.String r1 = "tunneled-playback"
            boolean r1 = r10.isFeatureSupported(r1)
            if (r1 == 0) goto L_0x0059
            r1 = r12
            goto L_0x005a
        L_0x0059:
            r1 = r13
        L_0x005a:
            if (r14 != 0) goto L_0x0072
            if (r10 == 0) goto L_0x0070
            int r14 = p513bj.C14049b0.f30913a
            if (r14 < r0) goto L_0x006c
            java.lang.String r14 = "secure-playback"
            boolean r14 = r10.isFeatureSupported(r14)
            if (r14 == 0) goto L_0x006c
            r14 = r12
            goto L_0x006d
        L_0x006c:
            r14 = r13
        L_0x006d:
            if (r14 == 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r6 = r13
            goto L_0x0073
        L_0x0072:
            r6 = r12
        L_0x0073:
            r0 = r11
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.C14246c.m22313g(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):com.google.android.exoplayer2.mediacodec.c");
    }

    /* renamed from: b */
    public final C18224e mo47399b(Format format, Format format2) {
        boolean z = false;
        int i = !C14049b0.m21628a(format.sampleMimeType, format2.sampleMimeType) ? 8 : 0;
        if (this.f31698g) {
            if (format.rotationDegrees != format2.rotationDegrees) {
                i |= RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
            }
            if (!this.f31696e && !(format.width == format2.width && format.height == format2.height)) {
                i |= RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN;
            }
            if (!C14049b0.m21628a(format.colorInfo, format2.colorInfo)) {
                i |= RecyclerView.C3084b0.FLAG_MOVED;
            }
            String str = this.f31692a;
            if (C14049b0.f30916d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str)) {
                z = true;
            }
            if (z && !format.initializationDataEquals(format2)) {
                i |= 2;
            }
            if (i == 0) {
                return new C18224e(this.f31692a, format, format2, format.initializationDataEquals(format2) ? 3 : 2, 0);
            }
        } else {
            if (format.channelCount != format2.channelCount) {
                i |= RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
            if (format.sampleRate != format2.sampleRate) {
                i |= 8192;
            }
            if (format.pcmEncoding != format2.pcmEncoding) {
                i |= PrimitiveArrayBuilder.SMALL_CHUNK_SIZE;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.f31693b)) {
                Pair<Integer, Integer> c = MediaCodecUtil.m22258c(format);
                Pair<Integer, Integer> c2 = MediaCodecUtil.m22258c(format2);
                if (!(c == null || c2 == null)) {
                    int intValue = ((Integer) c.first).intValue();
                    int intValue2 = ((Integer) c2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C18224e(this.f31692a, format, format2, 3, 0);
                    }
                }
            }
            if (!format.initializationDataEquals(format2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.f31693b)) {
                i |= 2;
            }
            if (i == 0) {
                return new C18224e(this.f31692a, format, format2, 1, 0);
            }
        }
        return new C18224e(this.f31692a, format, format2, 0, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01b2, code lost:
        if (r4 == false) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008c, code lost:
        r7 = r7.getVideoCapabilities();
     */
    /* JADX WARNING: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013c  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo47400c(com.google.android.exoplayer2.Format r13) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
        /*
            r12 = this;
            java.lang.String r0 = r13.codecs
            r1 = 1
            r2 = 0
            r3 = 16
            if (r0 == 0) goto L_0x0138
            java.lang.String r4 = r12.f31693b
            if (r4 != 0) goto L_0x000e
            goto L_0x0138
        L_0x000e:
            java.lang.String r0 = p513bj.C14065m.m21674d(r0)
            if (r0 != 0) goto L_0x0016
            goto L_0x0138
        L_0x0016:
            java.lang.String r4 = r12.f31693b
            boolean r4 = r4.equals(r0)
            java.lang.String r5 = ", "
            if (r4 != 0) goto L_0x0049
            java.lang.String r4 = r13.codecs
            r6 = 13
            int r6 = androidx.compose.animation.C0391c.m1055a(r4, r6)
            int r7 = r0.length()
            int r7 = r7 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r7)
            java.lang.String r7 = "codec.mime "
            r6.append(r7)
            r6.append(r4)
            r6.append(r5)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r12.mo47403f(r0)
            goto L_0x0136
        L_0x0049:
            android.util.Pair r4 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.m22258c(r13)
            if (r4 != 0) goto L_0x0051
            goto L_0x0138
        L_0x0051:
            java.lang.Object r6 = r4.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            boolean r7 = r12.f31698g
            if (r7 != 0) goto L_0x006b
            r7 = 42
            if (r6 == r7) goto L_0x006b
            goto L_0x0138
        L_0x006b:
            android.media.MediaCodecInfo$CodecCapabilities r7 = r12.f31695d
            if (r7 == 0) goto L_0x0073
            android.media.MediaCodecInfo$CodecProfileLevel[] r7 = r7.profileLevels
            if (r7 != 0) goto L_0x0075
        L_0x0073:
            android.media.MediaCodecInfo$CodecProfileLevel[] r7 = new android.media.MediaCodecInfo.CodecProfileLevel[r2]
        L_0x0075:
            int r8 = p513bj.C14049b0.f30913a
            r9 = 23
            if (r8 > r9) goto L_0x00fd
            java.lang.String r8 = r12.f31693b
            java.lang.String r9 = "video/x-vnd.on2.vp9"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x00fd
            int r8 = r7.length
            if (r8 != 0) goto L_0x00fd
            android.media.MediaCodecInfo$CodecCapabilities r7 = r12.f31695d
            if (r7 == 0) goto L_0x00a1
            android.media.MediaCodecInfo$VideoCapabilities r7 = r7.getVideoCapabilities()
            if (r7 == 0) goto L_0x00a1
            android.util.Range r7 = r7.getBitrateRange()
            java.lang.Comparable r7 = r7.getUpper()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            goto L_0x00a2
        L_0x00a1:
            r7 = r2
        L_0x00a2:
            r8 = 180000000(0xaba9500, float:1.7967196E-32)
            if (r7 < r8) goto L_0x00aa
            r7 = 1024(0x400, float:1.435E-42)
            goto L_0x00f0
        L_0x00aa:
            r8 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r7 < r8) goto L_0x00b2
            r7 = 512(0x200, float:7.175E-43)
            goto L_0x00f0
        L_0x00b2:
            r8 = 60000000(0x3938700, float:8.670878E-37)
            if (r7 < r8) goto L_0x00ba
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x00f0
        L_0x00ba:
            r8 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r7 < r8) goto L_0x00c2
            r7 = 128(0x80, float:1.794E-43)
            goto L_0x00f0
        L_0x00c2:
            r8 = 18000000(0x112a880, float:2.6936858E-38)
            if (r7 < r8) goto L_0x00ca
            r7 = 64
            goto L_0x00f0
        L_0x00ca:
            r8 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r7 < r8) goto L_0x00d2
            r7 = 32
            goto L_0x00f0
        L_0x00d2:
            r8 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r7 < r8) goto L_0x00d9
            r7 = r3
            goto L_0x00f0
        L_0x00d9:
            r8 = 3600000(0x36ee80, float:5.044674E-39)
            if (r7 < r8) goto L_0x00e1
            r7 = 8
            goto L_0x00f0
        L_0x00e1:
            r8 = 1800000(0x1b7740, float:2.522337E-39)
            if (r7 < r8) goto L_0x00e8
            r7 = 4
            goto L_0x00f0
        L_0x00e8:
            r8 = 800000(0xc3500, float:1.121039E-39)
            if (r7 < r8) goto L_0x00ef
            r7 = 2
            goto L_0x00f0
        L_0x00ef:
            r7 = r1
        L_0x00f0:
            android.media.MediaCodecInfo$CodecProfileLevel r8 = new android.media.MediaCodecInfo$CodecProfileLevel
            r8.<init>()
            r8.profile = r1
            r8.level = r7
            android.media.MediaCodecInfo$CodecProfileLevel[] r7 = new android.media.MediaCodecInfo.CodecProfileLevel[r1]
            r7[r2] = r8
        L_0x00fd:
            int r8 = r7.length
            r9 = r2
        L_0x00ff:
            if (r9 >= r8) goto L_0x010f
            r10 = r7[r9]
            int r11 = r10.profile
            if (r11 != r6) goto L_0x010c
            int r10 = r10.level
            if (r10 < r4) goto L_0x010c
            goto L_0x0138
        L_0x010c:
            int r9 = r9 + 1
            goto L_0x00ff
        L_0x010f:
            java.lang.String r4 = r13.codecs
            r6 = 22
            int r6 = androidx.compose.animation.C0391c.m1055a(r4, r6)
            int r7 = r0.length()
            int r7 = r7 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r7)
            java.lang.String r7 = "codec.profileLevel, "
            r6.append(r7)
            r6.append(r4)
            r6.append(r5)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r12.mo47403f(r0)
        L_0x0136:
            r0 = r2
            goto L_0x0139
        L_0x0138:
            r0 = r1
        L_0x0139:
            if (r0 != 0) goto L_0x013c
            return r2
        L_0x013c:
            boolean r0 = r12.f31698g
            r4 = 21
            if (r0 == 0) goto L_0x0174
            int r0 = r13.width
            if (r0 <= 0) goto L_0x0173
            int r3 = r13.height
            if (r3 > 0) goto L_0x014b
            goto L_0x0173
        L_0x014b:
            int r5 = p513bj.C14049b0.f30913a
            if (r5 < r4) goto L_0x0157
            float r13 = r13.frameRate
            double r1 = (double) r13
            boolean r13 = r12.mo47402e(r1, r0, r3)
            return r13
        L_0x0157:
            int r0 = r0 * r3
            int r3 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.m22263h()
            if (r0 > r3) goto L_0x015f
            goto L_0x0160
        L_0x015f:
            r1 = r2
        L_0x0160:
            if (r1 != 0) goto L_0x0173
            int r0 = r13.width
            int r13 = r13.height
            r2 = 40
            java.lang.String r3 = "legacyFrameSize, "
            java.lang.String r4 = "x"
            java.lang.String r13 = p003a2.C0023f.m107h(r2, r3, r0, r4, r13)
            r12.mo47403f(r13)
        L_0x0173:
            return r1
        L_0x0174:
            int r0 = p513bj.C14049b0.f30913a
            if (r0 < r4) goto L_0x02a1
            int r4 = r13.sampleRate
            r5 = -1
            if (r4 == r5) goto L_0x01b4
            android.media.MediaCodecInfo$CodecCapabilities r6 = r12.f31695d
            if (r6 != 0) goto L_0x0187
            java.lang.String r4 = "sampleRate.caps"
            r12.mo47403f(r4)
            goto L_0x01af
        L_0x0187:
            android.media.MediaCodecInfo$AudioCapabilities r6 = r6.getAudioCapabilities()
            if (r6 != 0) goto L_0x0193
            java.lang.String r4 = "sampleRate.aCaps"
            r12.mo47403f(r4)
            goto L_0x01af
        L_0x0193:
            boolean r6 = r6.isSampleRateSupported(r4)
            if (r6 != 0) goto L_0x01b1
            r6 = 31
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "sampleRate.support, "
            r7.append(r6)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r12.mo47403f(r4)
        L_0x01af:
            r4 = r2
            goto L_0x01b2
        L_0x01b1:
            r4 = r1
        L_0x01b2:
            if (r4 == 0) goto L_0x02a0
        L_0x01b4:
            int r13 = r13.channelCount
            if (r13 == r5) goto L_0x02a1
            android.media.MediaCodecInfo$CodecCapabilities r4 = r12.f31695d
            if (r4 != 0) goto L_0x01c3
            java.lang.String r13 = "channelCount.caps"
            r12.mo47403f(r13)
            goto L_0x029a
        L_0x01c3:
            android.media.MediaCodecInfo$AudioCapabilities r4 = r4.getAudioCapabilities()
            if (r4 != 0) goto L_0x01d0
            java.lang.String r13 = "channelCount.aCaps"
            r12.mo47403f(r13)
            goto L_0x029a
        L_0x01d0:
            java.lang.String r5 = r12.f31692a
            java.lang.String r6 = r12.f31693b
            int r4 = r4.getMaxInputChannelCount()
            if (r4 > r1) goto L_0x0282
            r7 = 26
            if (r0 < r7) goto L_0x01e2
            if (r4 <= 0) goto L_0x01e2
            goto L_0x0282
        L_0x01e2:
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0282
            java.lang.String r0 = "audio/3gpp"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0282
            java.lang.String r0 = "audio/amr-wb"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0282
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0282
            java.lang.String r0 = "audio/vorbis"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0282
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0282
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0282
            java.lang.String r0 = "audio/flac"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0282
            java.lang.String r0 = "audio/g711-alaw"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0282
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0282
            java.lang.String r0 = "audio/gsm"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x023b
            goto L_0x0282
        L_0x023b:
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0245
            r3 = 6
            goto L_0x0250
        L_0x0245:
            java.lang.String r0 = "audio/eac3"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x024e
            goto L_0x0250
        L_0x024e:
            r3 = 30
        L_0x0250:
            r0 = 59
            int r0 = androidx.compose.animation.C0391c.m1055a(r5, r0)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            java.lang.String r0 = "AssumedMaxChannelAdjustment: "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = ", ["
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = " to "
            r6.append(r0)
            r6.append(r3)
            java.lang.String r0 = "]"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r4 = "MediaCodecInfo"
            android.util.Log.w(r4, r0)
            r4 = r3
        L_0x0282:
            if (r4 >= r13) goto L_0x029c
            r0 = 33
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r0 = "channelCount.support, "
            r3.append(r0)
            r3.append(r13)
            java.lang.String r13 = r3.toString()
            r12.mo47403f(r13)
        L_0x029a:
            r13 = r2
            goto L_0x029d
        L_0x029c:
            r13 = r1
        L_0x029d:
            if (r13 == 0) goto L_0x02a0
            goto L_0x02a1
        L_0x02a0:
            r1 = r2
        L_0x02a1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.C14246c.mo47400c(com.google.android.exoplayer2.Format):boolean");
    }

    /* renamed from: d */
    public final boolean mo47401d(Format format) {
        if (this.f31698g) {
            return this.f31696e;
        }
        Pair<Integer, Integer> c = MediaCodecUtil.m22258c(format);
        return c != null && ((Integer) c.first).intValue() == 42;
    }

    /* renamed from: e */
    public final boolean mo47402e(double d, int i, int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f31695d;
        if (codecCapabilities == null) {
            mo47403f("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            mo47403f("sizeAndRate.vCaps");
            return false;
        }
        if (!m22312a(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f31692a) || !"mcv5a".equals(C14049b0.f30914b)) && m22312a(videoCapabilities, i2, i, d)) {
                    StringBuilder sb = new StringBuilder(69);
                    sb.append("sizeAndRate.rotated, ");
                    sb.append(i);
                    sb.append(EtsyDialogFragment.OPT_X_BUTTON);
                    sb.append(i2);
                    sb.append(EtsyDialogFragment.OPT_X_BUTTON);
                    sb.append(d);
                    String sb2 = sb.toString();
                    String str = this.f31692a;
                    String str2 = this.f31693b;
                    String str3 = C14049b0.f30917e;
                    StringBuilder k = C0015b.m92k(C0391c.m1055a(str3, C0391c.m1055a(str2, C0391c.m1055a(str, C0391c.m1055a(sb2, 25)))), "AssumedSupport [", sb2, "] [", str);
                    C0391c.m1061h(k, ", ", str2, "] [", str3);
                    k.append("]");
                    Log.d("MediaCodecInfo", k.toString());
                }
            }
            StringBuilder sb3 = new StringBuilder(69);
            sb3.append("sizeAndRate.support, ");
            sb3.append(i);
            sb3.append(EtsyDialogFragment.OPT_X_BUTTON);
            sb3.append(i2);
            sb3.append(EtsyDialogFragment.OPT_X_BUTTON);
            sb3.append(d);
            mo47403f(sb3.toString());
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo47403f(String str) {
        String str2 = this.f31692a;
        String str3 = this.f31693b;
        String str4 = C14049b0.f30917e;
        StringBuilder k = C0015b.m92k(C0391c.m1055a(str4, C0391c.m1055a(str3, C0391c.m1055a(str2, C0391c.m1055a(str, 20)))), "NoSupport [", str, "] [", str2);
        C0391c.m1061h(k, ", ", str3, "] [", str4);
        k.append("]");
        Log.d("MediaCodecInfo", k.toString());
    }

    public final String toString() {
        return this.f31692a;
    }
}
