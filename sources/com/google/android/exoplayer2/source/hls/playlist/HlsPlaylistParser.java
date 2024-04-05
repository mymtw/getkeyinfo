package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.compose.animation.C0391c;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.hls.playlist.C14338c;
import com.google.android.exoplayer2.upstream.C14433c;
import com.google.common.collect.C16201n0;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.cli.HelpFormatter;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p003a2.C0015b;
import p513bj.C14049b0;
import p513bj.C14075p;
import p513bj.C14087z;
import p594jh.C17912g;
import p620mi.C18231c;
import p701wh.C18687i;

public final class HlsPlaylistParser implements C14433c.C14434a<C18231c> {

    /* renamed from: A */
    public static final Pattern f32018A = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: B */
    public static final Pattern f32019B = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: C */
    public static final Pattern f32020C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: D */
    public static final Pattern f32021D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: E */
    public static final Pattern f32022E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: F */
    public static final Pattern f32023F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: G */
    public static final Pattern f32024G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: H */
    public static final Pattern f32025H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: I */
    public static final Pattern f32026I = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: J */
    public static final Pattern f32027J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: K */
    public static final Pattern f32028K = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: L */
    public static final Pattern f32029L = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: M */
    public static final Pattern f32030M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: N */
    public static final Pattern f32031N = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: O */
    public static final Pattern f32032O = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: P */
    public static final Pattern f32033P = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: Q */
    public static final Pattern f32034Q = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: R */
    public static final Pattern f32035R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: S */
    public static final Pattern f32036S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: T */
    public static final Pattern f32037T = m22555b("AUTOSELECT");

    /* renamed from: U */
    public static final Pattern f32038U = m22555b("DEFAULT");

    /* renamed from: V */
    public static final Pattern f32039V = m22555b("FORCED");

    /* renamed from: W */
    public static final Pattern f32040W = m22555b("INDEPENDENT");

    /* renamed from: X */
    public static final Pattern f32041X = m22555b("GAP");

    /* renamed from: Y */
    public static final Pattern f32042Y = m22555b("PRECISE");

    /* renamed from: Z */
    public static final Pattern f32043Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: a0 */
    public static final Pattern f32044a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: b0 */
    public static final Pattern f32045b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: c */
    public static final Pattern f32046c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d */
    public static final Pattern f32047d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e */
    public static final Pattern f32048e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f */
    public static final Pattern f32049f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g */
    public static final Pattern f32050g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h */
    public static final Pattern f32051h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i */
    public static final Pattern f32052i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j */
    public static final Pattern f32053j = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: k */
    public static final Pattern f32054k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l */
    public static final Pattern f32055l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m */
    public static final Pattern f32056m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n */
    public static final Pattern f32057n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: o */
    public static final Pattern f32058o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p */
    public static final Pattern f32059p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q */
    public static final Pattern f32060q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: r */
    public static final Pattern f32061r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: s */
    public static final Pattern f32062s = m22555b("CAN-SKIP-DATERANGES");

    /* renamed from: t */
    public static final Pattern f32063t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: u */
    public static final Pattern f32064u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: v */
    public static final Pattern f32065v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w */
    public static final Pattern f32066w = m22555b("CAN-BLOCK-RELOAD");

    /* renamed from: x */
    public static final Pattern f32067x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: y */
    public static final Pattern f32068y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: z */
    public static final Pattern f32069z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: a */
    public final C14335b f32070a;

    /* renamed from: b */
    public final C14338c f32071b;

    public static final class DeltaUpdateException extends IOException {
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$a */
    public static class C14330a {

        /* renamed from: a */
        public final BufferedReader f32072a;

        /* renamed from: b */
        public final Queue<String> f32073b;

        /* renamed from: c */
        public String f32074c;

        public C14330a(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
            this.f32073b = arrayDeque;
            this.f32072a = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        /* renamed from: a */
        public final boolean mo47764a() throws IOException {
            String trim;
            if (this.f32074c != null) {
                return true;
            }
            if (!this.f32073b.isEmpty()) {
                String poll = this.f32073b.poll();
                poll.getClass();
                this.f32074c = poll;
                return true;
            }
            do {
                String readLine = this.f32072a.readLine();
                this.f32074c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f32074c = trim;
            } while (trim.isEmpty());
            return true;
        }

        /* renamed from: b */
        public final String mo47765b() throws IOException {
            if (mo47764a()) {
                String str = this.f32074c;
                this.f32074c = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public HlsPlaylistParser(C14335b bVar, C14338c cVar) {
        this.f32070a = bVar;
        this.f32071b = cVar;
    }

    /* renamed from: b */
    public static Pattern m22555b(String str) {
        StringBuilder k = C0015b.m92k(str.length() + 9, str, "=(", "NO", "|");
        k.append("YES");
        k.append(")");
        return Pattern.compile(k.toString());
    }

    /* renamed from: c */
    public static DrmInitData m22556c(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i = 0; i < schemeDataArr.length; i++) {
            schemeDataArr2[i] = schemeDataArr[i].copyWithData((byte[]) null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    /* renamed from: d */
    public static double m22557d(String str, Pattern pattern) throws ParserException {
        return Double.parseDouble(m22566m(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: e */
    public static DrmInitData.SchemeData m22558e(String str, String str2, HashMap hashMap) throws ParserException {
        String l = m22565l(str, f32027J, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, hashMap);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String m = m22566m(str, f32028K, hashMap);
            return new DrmInitData.SchemeData(C17912g.f38900d, "video/mp4", Base64.decode(m.substring(m.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            return new DrmInitData.SchemeData(C17912g.f38900d, "hls", C14049b0.m21652y(str));
        } else {
            if (!"com.microsoft.playready".equals(str2) || !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(l)) {
                return null;
            }
            String m2 = m22566m(str, f32028K, hashMap);
            byte[] decode = Base64.decode(m2.substring(m2.indexOf(44)), 0);
            UUID uuid = C17912g.f38901e;
            return new DrmInitData.SchemeData(uuid, "video/mp4", C18687i.m31541a(uuid, decode));
        }
    }

    /* renamed from: f */
    public static int m22559f(String str, Pattern pattern) throws ParserException {
        return Integer.parseInt(m22566m(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.source.hls.playlist.C14335b m22560g(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.C14330a r36, java.lang.String r37) throws java.io.IOException {
        /*
            r1 = r37
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = 0
            r10 = 0
            r35 = r10
            r10 = r9
            r9 = r35
        L_0x003b:
            boolean r13 = r36.mo47764a()
            java.lang.String r14 = "application/x-mpegURL"
            if (r13 == 0) goto L_0x021e
            java.lang.String r13 = r36.mo47765b()
            java.lang.String r15 = "#EXT"
            boolean r15 = r13.startsWith(r15)
            if (r15 == 0) goto L_0x0052
            r8.add(r13)
        L_0x0052:
            java.lang.String r15 = "#EXT-X-I-FRAME-STREAM-INF"
            boolean r15 = r13.startsWith(r15)
            r16 = r10
            java.lang.String r10 = "#EXT-X-DEFINE"
            boolean r10 = r13.startsWith(r10)
            if (r10 == 0) goto L_0x0072
            java.util.regex.Pattern r10 = f32033P
            java.lang.String r10 = m22566m(r13, r10, r11)
            java.util.regex.Pattern r14 = f32043Z
            java.lang.String r13 = m22566m(r13, r14, r11)
            r11.put(r10, r13)
            goto L_0x00d5
        L_0x0072:
            java.lang.String r10 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r10 = r13.equals(r10)
            if (r10 == 0) goto L_0x007c
            r10 = 1
            goto L_0x00d7
        L_0x007c:
            java.lang.String r10 = "#EXT-X-MEDIA"
            boolean r10 = r13.startsWith(r10)
            if (r10 == 0) goto L_0x0088
            r3.add(r13)
            goto L_0x00d5
        L_0x0088:
            java.lang.String r10 = "#EXT-X-SESSION-KEY"
            boolean r10 = r13.startsWith(r10)
            if (r10 == 0) goto L_0x00ca
            java.util.regex.Pattern r10 = f32026I
            java.lang.String r14 = "identity"
            java.lang.String r10 = m22565l(r13, r10, r14, r11)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r10 = m22558e(r13, r10, r11)
            if (r10 == 0) goto L_0x00d5
            java.util.regex.Pattern r14 = f32025H
            java.lang.String r13 = m22566m(r13, r14, r11)
            java.lang.String r14 = "SAMPLE-AES-CENC"
            boolean r14 = r14.equals(r13)
            if (r14 != 0) goto L_0x00b8
            java.lang.String r14 = "SAMPLE-AES-CTR"
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L_0x00b5
            goto L_0x00b8
        L_0x00b5:
            java.lang.String r13 = "cbcs"
            goto L_0x00ba
        L_0x00b8:
            java.lang.String r13 = "cenc"
        L_0x00ba:
            com.google.android.exoplayer2.drm.DrmInitData r14 = new com.google.android.exoplayer2.drm.DrmInitData
            r15 = 1
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r15 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r15]
            r17 = 0
            r15[r17] = r10
            r14.<init>((java.lang.String) r13, (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r15)
            r12.add(r14)
            goto L_0x00d5
        L_0x00ca:
            java.lang.String r10 = "#EXT-X-STREAM-INF"
            boolean r10 = r13.startsWith(r10)
            if (r10 != 0) goto L_0x00e8
            if (r15 == 0) goto L_0x00d5
            goto L_0x00e8
        L_0x00d5:
            r10 = r16
        L_0x00d7:
            r31 = r3
            r30 = r4
            r29 = r5
            r28 = r6
            r26 = r7
            r27 = r8
            r25 = r12
            r5 = r0
            goto L_0x0205
        L_0x00e8:
            java.lang.String r10 = "CLOSED-CAPTIONS=NONE"
            boolean r10 = r13.contains(r10)
            r9 = r9 | r10
            if (r15 == 0) goto L_0x00f4
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00f5
        L_0x00f4:
            r10 = 0
        L_0x00f5:
            r17 = r9
            java.util.regex.Pattern r9 = f32051h
            int r9 = m22559f(r13, r9)
            r25 = r12
            java.util.regex.Pattern r12 = f32046c
            java.util.regex.Matcher r12 = r12.matcher(r13)
            boolean r18 = r12.find()
            if (r18 == 0) goto L_0x011a
            r26 = r7
            r7 = 1
            java.lang.String r7 = r12.group(r7)
            r7.getClass()
            int r7 = java.lang.Integer.parseInt(r7)
            goto L_0x011d
        L_0x011a:
            r26 = r7
            r7 = -1
        L_0x011d:
            java.util.regex.Pattern r12 = f32053j
            r27 = r8
            r8 = 0
            java.lang.String r12 = m22565l(r13, r12, r8, r11)
            r28 = r6
            java.util.regex.Pattern r6 = f32054k
            java.lang.String r6 = m22565l(r13, r6, r8, r11)
            if (r6 == 0) goto L_0x0150
            int r8 = p513bj.C14049b0.f30913a
            java.lang.String r8 = "x"
            r29 = r5
            r5 = -1
            java.lang.String[] r5 = r6.split(r8, r5)
            r6 = 0
            r6 = r5[r6]
            int r6 = java.lang.Integer.parseInt(r6)
            r8 = 1
            r5 = r5[r8]
            int r5 = java.lang.Integer.parseInt(r5)
            if (r6 <= 0) goto L_0x014d
            if (r5 > 0) goto L_0x0154
        L_0x014d:
            r5 = -1
            r6 = -1
            goto L_0x0154
        L_0x0150:
            r29 = r5
            r6 = -1
            r5 = -1
        L_0x0154:
            java.util.regex.Pattern r8 = f32055l
            r30 = r4
            r4 = 0
            java.lang.String r8 = m22565l(r13, r8, r4, r11)
            if (r8 == 0) goto L_0x0164
            float r8 = java.lang.Float.parseFloat(r8)
            goto L_0x0166
        L_0x0164:
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0166:
            r31 = r3
            java.util.regex.Pattern r3 = f32047d
            java.lang.String r3 = m22565l(r13, r3, r4, r11)
            r32 = r0
            java.util.regex.Pattern r0 = f32048e
            java.lang.String r0 = m22565l(r13, r0, r4, r11)
            r33 = r0
            java.util.regex.Pattern r0 = f32049f
            java.lang.String r0 = m22565l(r13, r0, r4, r11)
            r34 = r0
            java.util.regex.Pattern r0 = f32050g
            java.lang.String r0 = m22565l(r13, r0, r4, r11)
            if (r15 == 0) goto L_0x0193
            java.util.regex.Pattern r4 = f32028K
            java.lang.String r4 = m22566m(r13, r4, r11)
            android.net.Uri r4 = p513bj.C14087z.m21777d(r1, r4)
            goto L_0x01a5
        L_0x0193:
            boolean r4 = r36.mo47764a()
            if (r4 == 0) goto L_0x0216
            java.lang.String r4 = r36.mo47765b()
            java.lang.String r4 = m22567n(r4, r11)
            android.net.Uri r4 = p513bj.C14087z.m21777d(r1, r4)
        L_0x01a5:
            com.google.android.exoplayer2.Format$b r13 = new com.google.android.exoplayer2.Format$b
            r13.<init>()
            int r15 = r2.size()
            r13.mo47145b(r15)
            r13.f31302j = r14
            r13.f31300h = r12
            r13.f31298f = r7
            r13.f31299g = r9
            r13.f31308p = r6
            r13.f31309q = r5
            r13.f31310r = r8
            r13.f31297e = r10
            com.google.android.exoplayer2.Format r20 = r13.mo47144a()
            com.google.android.exoplayer2.source.hls.playlist.b$b r5 = new com.google.android.exoplayer2.source.hls.playlist.b$b
            r18 = r5
            r19 = r4
            r21 = r3
            r22 = r33
            r23 = r34
            r24 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r2.add(r5)
            r5 = r32
            java.lang.Object r6 = r5.get(r4)
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            if (r6 != 0) goto L_0x01eb
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.put(r4, r6)
        L_0x01eb:
            com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo r4 = new com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo
            r18 = r4
            r19 = r7
            r20 = r9
            r21 = r3
            r22 = r33
            r23 = r34
            r24 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r6.add(r4)
            r10 = r16
            r9 = r17
        L_0x0205:
            r0 = r5
            r12 = r25
            r7 = r26
            r8 = r27
            r6 = r28
            r5 = r29
            r4 = r30
            r3 = r31
            goto L_0x003b
        L_0x0216:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "#EXT-X-STREAM-INF must be followed by another line"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x021e:
            r31 = r3
            r30 = r4
            r29 = r5
            r28 = r6
            r26 = r7
            r27 = r8
            r16 = r10
            r25 = r12
            r5 = r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4 = 0
        L_0x023a:
            int r6 = r2.size()
            if (r4 >= r6) goto L_0x02a3
            java.lang.Object r6 = r2.get(r4)
            com.google.android.exoplayer2.source.hls.playlist.b$b r6 = (com.google.android.exoplayer2.source.hls.playlist.C14335b.C14337b) r6
            android.net.Uri r7 = r6.f32115a
            boolean r7 = r0.add(r7)
            if (r7 == 0) goto L_0x02a0
            com.google.android.exoplayer2.Format r7 = r6.f32116b
            com.google.android.exoplayer2.metadata.Metadata r7 = r7.metadata
            if (r7 != 0) goto L_0x0256
            r7 = 1
            goto L_0x0257
        L_0x0256:
            r7 = 0
        L_0x0257:
            p513bj.C14075p.m21694f(r7)
            com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry r7 = new com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry
            android.net.Uri r8 = r6.f32115a
            java.lang.Object r8 = r5.get(r8)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.getClass()
            r10 = 0
            r7.<init>(r10, r10, r8)
            com.google.android.exoplayer2.metadata.Metadata r8 = new com.google.android.exoplayer2.metadata.Metadata
            r10 = 1
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r10 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r10]
            r12 = 0
            r10[r12] = r7
            r8.<init>((com.google.android.exoplayer2.metadata.Metadata.Entry[]) r10)
            com.google.android.exoplayer2.Format r7 = r6.f32116b
            com.google.android.exoplayer2.Format$b r7 = r7.buildUpon()
            r7.f31301i = r8
            com.google.android.exoplayer2.Format r19 = r7.mo47144a()
            com.google.android.exoplayer2.source.hls.playlist.b$b r7 = new com.google.android.exoplayer2.source.hls.playlist.b$b
            android.net.Uri r8 = r6.f32115a
            java.lang.String r10 = r6.f32117c
            java.lang.String r12 = r6.f32118d
            java.lang.String r13 = r6.f32119e
            java.lang.String r6 = r6.f32120f
            r17 = r7
            r18 = r8
            r20 = r10
            r21 = r12
            r22 = r13
            r23 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r3.add(r7)
        L_0x02a0:
            int r4 = r4 + 1
            goto L_0x023a
        L_0x02a3:
            r0 = 0
            r4 = 0
            r5 = 0
            r8 = r5
        L_0x02a7:
            int r5 = r31.size()
            if (r4 >= r5) goto L_0x0536
            r5 = r31
            java.lang.Object r6 = r5.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            java.util.regex.Pattern r7 = f32034Q
            java.lang.String r7 = m22566m(r6, r7, r11)
            java.util.regex.Pattern r10 = f32033P
            java.lang.String r10 = m22566m(r6, r10, r11)
            com.google.android.exoplayer2.Format$b r12 = new com.google.android.exoplayer2.Format$b
            r12.<init>()
            int r13 = r7.length()
            int r13 = r13 + 1
            int r15 = r10.length()
            int r15 = r15 + r13
            java.lang.String r13 = ":"
            java.lang.String r13 = p504ai.C13983i.m21492k(r15, r7, r13, r10)
            r12.f31293a = r13
            r12.f31294b = r10
            r12.f31302j = r14
            java.util.regex.Pattern r13 = f32038U
            boolean r13 = m22562i(r6, r13)
            java.util.regex.Pattern r15 = f32039V
            boolean r15 = m22562i(r6, r15)
            if (r15 == 0) goto L_0x02ed
            r13 = r13 | 2
        L_0x02ed:
            java.util.regex.Pattern r15 = f32037T
            boolean r15 = m22562i(r6, r15)
            if (r15 == 0) goto L_0x02f7
            r13 = r13 | 4
        L_0x02f7:
            r12.f31296d = r13
            java.util.regex.Pattern r13 = f32035R
            r15 = 0
            java.lang.String r13 = m22565l(r6, r13, r15, r11)
            boolean r15 = android.text.TextUtils.isEmpty(r13)
            if (r15 == 0) goto L_0x030a
            r13 = 0
            r31 = r5
            goto L_0x033f
        L_0x030a:
            int r15 = p513bj.C14049b0.f30913a
            java.lang.String r15 = ","
            r31 = r5
            r5 = -1
            java.lang.String[] r5 = r13.split(r15, r5)
            java.lang.String r13 = "public.accessibility.describes-video"
            boolean r13 = p513bj.C14049b0.m21638k(r5, r13)
            if (r13 == 0) goto L_0x0320
            r13 = 512(0x200, float:7.175E-43)
            goto L_0x0321
        L_0x0320:
            r13 = 0
        L_0x0321:
            java.lang.String r15 = "public.accessibility.transcribes-spoken-dialog"
            boolean r15 = p513bj.C14049b0.m21638k(r5, r15)
            if (r15 == 0) goto L_0x032b
            r13 = r13 | 4096(0x1000, float:5.74E-42)
        L_0x032b:
            java.lang.String r15 = "public.accessibility.describes-music-and-sound"
            boolean r15 = p513bj.C14049b0.m21638k(r5, r15)
            if (r15 == 0) goto L_0x0335
            r13 = r13 | 1024(0x400, float:1.435E-42)
        L_0x0335:
            java.lang.String r15 = "public.easy-to-read"
            boolean r5 = p513bj.C14049b0.m21638k(r5, r15)
            if (r5 == 0) goto L_0x033f
            r13 = r13 | 8192(0x2000, float:1.14794E-41)
        L_0x033f:
            r12.f31297e = r13
            java.util.regex.Pattern r5 = f32032O
            r13 = 0
            java.lang.String r5 = m22565l(r6, r5, r13, r11)
            r12.f31295c = r5
            java.util.regex.Pattern r5 = f32028K
            java.lang.String r5 = m22565l(r6, r5, r13, r11)
            if (r5 != 0) goto L_0x0354
            r5 = 0
            goto L_0x0358
        L_0x0354:
            android.net.Uri r5 = p513bj.C14087z.m21777d(r1, r5)
        L_0x0358:
            com.google.android.exoplayer2.metadata.Metadata r13 = new com.google.android.exoplayer2.metadata.Metadata
            r15 = 1
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r15 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r15]
            com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry r1 = new com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry
            r17 = r14
            java.util.List r14 = java.util.Collections.emptyList()
            r1.<init>(r7, r10, r14)
            r14 = 0
            r15[r14] = r1
            r13.<init>((com.google.android.exoplayer2.metadata.Metadata.Entry[]) r15)
            java.util.regex.Pattern r1 = f32030M
            java.lang.String r1 = m22566m(r6, r1, r11)
            int r14 = r1.hashCode()
            r15 = 2
            switch(r14) {
                case -959297733: goto L_0x039e;
                case -333210994: goto L_0x0393;
                case 62628790: goto L_0x0388;
                case 81665115: goto L_0x037d;
                default: goto L_0x037c;
            }
        L_0x037c:
            goto L_0x03a9
        L_0x037d:
            java.lang.String r14 = "VIDEO"
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x0386
            goto L_0x03a9
        L_0x0386:
            r1 = 3
            goto L_0x03aa
        L_0x0388:
            java.lang.String r14 = "AUDIO"
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x0391
            goto L_0x03a9
        L_0x0391:
            r1 = r15
            goto L_0x03aa
        L_0x0393:
            java.lang.String r14 = "CLOSED-CAPTIONS"
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x039c
            goto L_0x03a9
        L_0x039c:
            r1 = 1
            goto L_0x03aa
        L_0x039e:
            java.lang.String r14 = "SUBTITLES"
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x03a7
            goto L_0x03a9
        L_0x03a7:
            r1 = 0
            goto L_0x03aa
        L_0x03a9:
            r1 = -1
        L_0x03aa:
            if (r1 == 0) goto L_0x04d0
            r14 = 1
            if (r1 == r14) goto L_0x048e
            if (r1 == r15) goto L_0x040a
            r6 = 3
            if (r1 == r6) goto L_0x03b5
            goto L_0x03ef
        L_0x03b5:
            r1 = 0
        L_0x03b6:
            int r6 = r2.size()
            if (r1 >= r6) goto L_0x03ce
            java.lang.Object r6 = r2.get(r1)
            com.google.android.exoplayer2.source.hls.playlist.b$b r6 = (com.google.android.exoplayer2.source.hls.playlist.C14335b.C14337b) r6
            java.lang.String r14 = r6.f32117c
            boolean r14 = r7.equals(r14)
            if (r14 == 0) goto L_0x03cb
            goto L_0x03cf
        L_0x03cb:
            int r1 = r1 + 1
            goto L_0x03b6
        L_0x03ce:
            r6 = 0
        L_0x03cf:
            if (r6 == 0) goto L_0x03ed
            com.google.android.exoplayer2.Format r1 = r6.f32116b
            java.lang.String r6 = r1.codecs
            java.lang.String r6 = p513bj.C14049b0.m21644q(r15, r6)
            r12.f31300h = r6
            java.lang.String r6 = p513bj.C14065m.m21674d(r6)
            r12.f31303k = r6
            int r6 = r1.width
            r12.f31308p = r6
            int r6 = r1.height
            r12.f31309q = r6
            float r1 = r1.frameRate
            r12.f31310r = r1
        L_0x03ed:
            if (r5 != 0) goto L_0x03f2
        L_0x03ef:
            r14 = r30
            goto L_0x0402
        L_0x03f2:
            r12.f31301i = r13
            com.google.android.exoplayer2.source.hls.playlist.b$a r1 = new com.google.android.exoplayer2.source.hls.playlist.b$a
            com.google.android.exoplayer2.Format r6 = r12.mo47144a()
            r1.<init>(r5, r6, r10)
            r14 = r30
            r14.add(r1)
        L_0x0402:
            r36 = r8
            r6 = r28
            r8 = r29
            goto L_0x0525
        L_0x040a:
            r14 = r30
            r1 = 0
        L_0x040d:
            int r15 = r2.size()
            if (r1 >= r15) goto L_0x0429
            java.lang.Object r15 = r2.get(r1)
            com.google.android.exoplayer2.source.hls.playlist.b$b r15 = (com.google.android.exoplayer2.source.hls.playlist.C14335b.C14337b) r15
            r36 = r8
            java.lang.String r8 = r15.f32118d
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x0424
            goto L_0x042c
        L_0x0424:
            int r1 = r1 + 1
            r8 = r36
            goto L_0x040d
        L_0x0429:
            r36 = r8
            r15 = 0
        L_0x042c:
            if (r15 == 0) goto L_0x043e
            com.google.android.exoplayer2.Format r1 = r15.f32116b
            java.lang.String r1 = r1.codecs
            r7 = 1
            java.lang.String r1 = p513bj.C14049b0.m21644q(r7, r1)
            r12.f31300h = r1
            java.lang.String r1 = p513bj.C14065m.m21674d(r1)
            goto L_0x043f
        L_0x043e:
            r1 = 0
        L_0x043f:
            java.util.regex.Pattern r7 = f32052i
            r8 = 0
            java.lang.String r6 = m22565l(r6, r7, r8, r11)
            if (r6 == 0) goto L_0x046c
            int r7 = p513bj.C14049b0.f30913a
            java.lang.String r7 = "/"
            r8 = 2
            java.lang.String[] r7 = r6.split(r7, r8)
            r8 = 0
            r7 = r7[r8]
            int r7 = java.lang.Integer.parseInt(r7)
            r12.f31316x = r7
            java.lang.String r7 = "audio/eac3"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x046c
            java.lang.String r7 = "/JOC"
            boolean r6 = r6.endsWith(r7)
            if (r6 == 0) goto L_0x046c
            java.lang.String r1 = "audio/eac3-joc"
        L_0x046c:
            r12.f31303k = r1
            if (r5 == 0) goto L_0x0481
            r12.f31301i = r13
            com.google.android.exoplayer2.source.hls.playlist.b$a r1 = new com.google.android.exoplayer2.source.hls.playlist.b$a
            com.google.android.exoplayer2.Format r6 = r12.mo47144a()
            r1.<init>(r5, r6, r10)
            r8 = r29
            r8.add(r1)
            goto L_0x048a
        L_0x0481:
            r8 = r29
            if (r15 == 0) goto L_0x048a
            com.google.android.exoplayer2.Format r1 = r12.mo47144a()
            goto L_0x04cd
        L_0x048a:
            r6 = r28
            goto L_0x0525
        L_0x048e:
            r36 = r8
            r8 = r29
            r14 = r30
            java.util.regex.Pattern r1 = f32036S
            java.lang.String r1 = m22566m(r6, r1, r11)
            java.lang.String r5 = "CC"
            boolean r5 = r1.startsWith(r5)
            if (r5 == 0) goto L_0x04ae
            r5 = 2
            java.lang.String r1 = r1.substring(r5)
            int r1 = java.lang.Integer.parseInt(r1)
            java.lang.String r5 = "application/cea-608"
            goto L_0x04b9
        L_0x04ae:
            r5 = 7
            java.lang.String r1 = r1.substring(r5)
            int r1 = java.lang.Integer.parseInt(r1)
            java.lang.String r5 = "application/cea-708"
        L_0x04b9:
            if (r0 != 0) goto L_0x04c0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x04c0:
            r12.f31303k = r5
            r12.f31291C = r1
            com.google.android.exoplayer2.Format r1 = r12.mo47144a()
            r0.add(r1)
            r1 = r36
        L_0x04cd:
            r6 = r28
            goto L_0x0527
        L_0x04d0:
            r36 = r8
            r8 = r29
            r14 = r30
            r1 = 0
        L_0x04d7:
            int r6 = r2.size()
            if (r1 >= r6) goto L_0x04ef
            java.lang.Object r6 = r2.get(r1)
            com.google.android.exoplayer2.source.hls.playlist.b$b r6 = (com.google.android.exoplayer2.source.hls.playlist.C14335b.C14337b) r6
            java.lang.String r15 = r6.f32119e
            boolean r15 = r7.equals(r15)
            if (r15 == 0) goto L_0x04ec
            goto L_0x04f0
        L_0x04ec:
            int r1 = r1 + 1
            goto L_0x04d7
        L_0x04ef:
            r6 = 0
        L_0x04f0:
            if (r6 == 0) goto L_0x0502
            com.google.android.exoplayer2.Format r1 = r6.f32116b
            java.lang.String r1 = r1.codecs
            r6 = 3
            java.lang.String r1 = p513bj.C14049b0.m21644q(r6, r1)
            r12.f31300h = r1
            java.lang.String r1 = p513bj.C14065m.m21674d(r1)
            goto L_0x0503
        L_0x0502:
            r1 = 0
        L_0x0503:
            if (r1 != 0) goto L_0x0507
            java.lang.String r1 = "text/vtt"
        L_0x0507:
            r12.f31303k = r1
            r12.f31301i = r13
            if (r5 == 0) goto L_0x051c
            com.google.android.exoplayer2.source.hls.playlist.b$a r1 = new com.google.android.exoplayer2.source.hls.playlist.b$a
            com.google.android.exoplayer2.Format r6 = r12.mo47144a()
            r1.<init>(r5, r6, r10)
            r6 = r28
            r6.add(r1)
            goto L_0x0525
        L_0x051c:
            r6 = r28
            java.lang.String r1 = "HlsPlaylistParser"
            java.lang.String r5 = "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping"
            android.util.Log.w(r1, r5)
        L_0x0525:
            r1 = r36
        L_0x0527:
            int r4 = r4 + 1
            r28 = r6
            r29 = r8
            r30 = r14
            r14 = r17
            r8 = r1
            r1 = r37
            goto L_0x02a7
        L_0x0536:
            r36 = r8
            r6 = r28
            r8 = r29
            r14 = r30
            if (r9 == 0) goto L_0x0544
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x0544:
            r9 = r0
            com.google.android.exoplayer2.source.hls.playlist.b r13 = new com.google.android.exoplayer2.source.hls.playlist.b
            r0 = r13
            r1 = r37
            r2 = r27
            r4 = r14
            r5 = r8
            r7 = r26
            r8 = r36
            r10 = r16
            r12 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.m22560g(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$a, java.lang.String):com.google.android.exoplayer2.source.hls.playlist.b");
    }

    /* renamed from: h */
    public static C14338c m22561h(C14335b bVar, C14338c cVar, C14330a aVar, String str) throws IOException {
        ArrayList arrayList;
        boolean z;
        ArrayList arrayList2;
        String str2;
        HashMap hashMap;
        HashMap hashMap2;
        C14338c cVar2;
        C14335b bVar2;
        String str3;
        HashMap hashMap3;
        HashMap hashMap4;
        ArrayList arrayList3;
        HashMap hashMap5;
        String str4;
        ArrayList arrayList4;
        C14338c.C14339a aVar2;
        C14338c cVar3;
        HashMap hashMap6;
        HashMap hashMap7;
        String str5;
        String str6;
        ArrayList arrayList5;
        ArrayList arrayList6;
        HashMap hashMap8;
        HashMap hashMap9;
        HashMap hashMap10;
        long j;
        DrmInitData drmInitData;
        boolean z2;
        long j2;
        int i;
        int i2;
        C14335b bVar3;
        String str7;
        int i3;
        String str8;
        String str9;
        ArrayList arrayList7;
        String str10;
        int i4;
        HashMap hashMap11;
        C14335b bVar4 = bVar;
        boolean z3 = bVar4.f39974c;
        HashMap hashMap12 = new HashMap();
        HashMap hashMap13 = new HashMap();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        HashMap hashMap14 = new HashMap();
        ArrayList arrayList10 = new ArrayList();
        C14338c.C14343e eVar = new C14338c.C14343e(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str11 = null;
        String str12 = "";
        C14338c cVar4 = cVar;
        C14335b bVar5 = bVar4;
        boolean z4 = z3;
        C14338c.C14343e eVar2 = eVar;
        String str13 = str12;
        DrmInitData drmInitData2 = null;
        DrmInitData drmInitData3 = null;
        C14338c.C14339a aVar3 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        C14338c.C14341c cVar5 = null;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        boolean z5 = false;
        int i5 = 0;
        long j11 = -9223372036854775807L;
        boolean z6 = false;
        int i6 = 0;
        int i7 = 1;
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        boolean z7 = false;
        boolean z8 = false;
        long j14 = -1;
        int i8 = 0;
        boolean z9 = false;
        while (aVar.mo47764a()) {
            String b = aVar.mo47765b();
            if (b.startsWith("#EXT")) {
                arrayList10.add(b);
            }
            if (b.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String m = m22566m(b, f32060q, hashMap12);
                if ("VOD".equals(m)) {
                    i5 = 1;
                } else if ("EVENT".equals(m)) {
                    i5 = 2;
                }
            } else if (b.equals("#EXT-X-I-FRAMES-ONLY")) {
                z9 = true;
            } else if (b.startsWith("#EXT-X-START")) {
                z5 = m22562i(b, f32042Y);
                j11 = (long) (m22557d(b, f32020C) * 1000000.0d);
            } else {
                if (b.startsWith("#EXT-X-SERVER-CONTROL")) {
                    double j15 = m22563j(b, f32061r);
                    long j16 = j15 == -9.223372036854776E18d ? -9223372036854775807L : (long) (j15 * 1000000.0d);
                    boolean i9 = m22562i(b, f32062s);
                    double j17 = m22563j(b, f32064u);
                    long j18 = j17 == -9.223372036854776E18d ? -9223372036854775807L : (long) (j17 * 1000000.0d);
                    double j19 = m22563j(b, f32065v);
                    eVar2 = new C14338c.C14343e(j16, i9, j18, j19 == -9.223372036854776E18d ? -9223372036854775807L : (long) (j19 * 1000000.0d), m22562i(b, f32066w));
                    hashMap2 = hashMap13;
                    arrayList2 = arrayList9;
                    str2 = str12;
                    bVar2 = bVar5;
                    cVar2 = cVar4;
                    hashMap = hashMap14;
                } else if (b.startsWith("#EXT-X-PART-INF")) {
                    arrayList2 = arrayList9;
                    str2 = str12;
                    j13 = (long) (m22557d(b, f32058o) * 1000000.0d);
                    bVar2 = bVar5;
                    hashMap2 = hashMap13;
                    hashMap = hashMap14;
                    cVar2 = cVar4;
                } else if (b.startsWith("#EXT-X-MAP")) {
                    String m2 = m22566m(b, f32028K, hashMap12);
                    String l = m22565l(b, f32022E, str11, hashMap12);
                    if (l != null) {
                        int i10 = C14049b0.f30913a;
                        String[] split = l.split("@", -1);
                        j14 = Long.parseLong(split[0]);
                        if (split.length > 1) {
                            j5 = Long.parseLong(split[1]);
                        }
                    }
                    int i11 = (j14 > -1 ? 1 : (j14 == -1 ? 0 : -1));
                    if (i11 == 0) {
                        j5 = 0;
                    }
                    if (str14 == null || str15 != null) {
                        cVar5 = new C14338c.C14341c(m2, str14, j5, str15, j14);
                        if (i11 != 0) {
                            j5 += j14;
                        }
                        j14 = -1;
                    } else {
                        throw new ParserException("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                    }
                } else if (b.startsWith("#EXT-X-TARGETDURATION")) {
                    j12 = ((long) m22559f(b, f32056m)) * 1000000;
                } else if (b.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                    j4 = Long.parseLong(m22566m(b, f32067x, Collections.emptyMap()));
                    j6 = j4;
                } else if (b.startsWith("#EXT-X-VERSION")) {
                    i7 = m22559f(b, f32059p);
                } else {
                    if (b.startsWith("#EXT-X-DEFINE")) {
                        String l2 = m22565l(b, f32044a0, str11, hashMap12);
                        if (l2 != null) {
                            String str17 = bVar5.f32110l.get(l2);
                            if (str17 != null) {
                                hashMap12.put(l2, str17);
                            }
                        } else {
                            hashMap12.put(m22566m(b, f32033P, hashMap12), m22566m(b, f32043Z, hashMap12));
                        }
                        String str18 = str;
                        hashMap10 = hashMap12;
                        hashMap5 = hashMap13;
                        arrayList5 = arrayList9;
                        str3 = str12;
                        hashMap9 = hashMap14;
                        arrayList3 = arrayList8;
                        aVar2 = aVar3;
                        str4 = str16;
                    } else if (b.startsWith("#EXTINF")) {
                        str13 = m22565l(b, f32069z, str12, hashMap12);
                        j9 = (long) (m22557d(b, f32068y) * 1000000.0d);
                    } else if (b.startsWith("#EXT-X-SKIP")) {
                        int f = m22559f(b, f32063t);
                        C14338c cVar6 = cVar4;
                        C14075p.m21694f(cVar6 != null && arrayList8.isEmpty());
                        int i12 = C14049b0.f30913a;
                        int i13 = (int) (j4 - cVar6.f32127j);
                        int i14 = f + i13;
                        if (i13 < 0 || i14 > cVar6.f32134q.size()) {
                            throw new DeltaUpdateException();
                        }
                        while (i13 < i14) {
                            C14338c.C14341c cVar7 = (C14338c.C14341c) cVar6.f32134q.get(i13);
                            HashMap hashMap15 = hashMap14;
                            if (j4 != cVar6.f32127j) {
                                int i15 = (cVar6.f32126i - i6) + cVar7.f32148e;
                                ArrayList arrayList11 = new ArrayList();
                                long j20 = j8;
                                int i16 = 0;
                                while (i16 < cVar7.f32144n.size()) {
                                    C14338c.C14339a aVar4 = (C14338c.C14339a) cVar7.f32144n.get(i16);
                                    arrayList11.add(new C14338c.C14339a(aVar4.f32145b, aVar4.f32146c, aVar4.f32147d, i15, j20, aVar4.f32150g, aVar4.f32151h, aVar4.f32152i, aVar4.f32153j, aVar4.f32154k, aVar4.f32155l, aVar4.f32139m, aVar4.f32140n));
                                    j20 += aVar4.f32147d;
                                    i16++;
                                    hashMap13 = hashMap13;
                                    i14 = i14;
                                    str12 = str12;
                                    arrayList9 = arrayList9;
                                }
                                arrayList7 = arrayList9;
                                str10 = str12;
                                i4 = i14;
                                hashMap11 = hashMap13;
                                cVar7 = new C14338c.C14341c(cVar7.f32145b, cVar7.f32146c, cVar7.f32143m, cVar7.f32147d, i15, j8, cVar7.f32150g, cVar7.f32151h, cVar7.f32152i, cVar7.f32153j, cVar7.f32154k, cVar7.f32155l, arrayList11);
                            } else {
                                arrayList7 = arrayList9;
                                str10 = str12;
                                i4 = i14;
                                hashMap11 = hashMap13;
                            }
                            arrayList8.add(cVar7);
                            j8 += cVar7.f32147d;
                            long j21 = cVar7.f32154k;
                            if (j21 != -1) {
                                j5 = cVar7.f32153j + j21;
                            }
                            int i17 = cVar7.f32148e;
                            C14338c.C14341c cVar8 = cVar7.f32146c;
                            DrmInitData drmInitData4 = cVar7.f32150g;
                            String str19 = cVar7.f32151h;
                            String str20 = cVar7.f32152i;
                            if (str20 == null || !str20.equals(Long.toHexString(j6))) {
                                str15 = cVar7.f32152i;
                            }
                            j6++;
                            i13++;
                            cVar6 = cVar;
                            i8 = i17;
                            cVar5 = cVar8;
                            drmInitData3 = drmInitData4;
                            str14 = str19;
                            hashMap13 = hashMap11;
                            i14 = i4;
                            hashMap14 = hashMap15;
                            j7 = j8;
                            str12 = str10;
                            arrayList9 = arrayList7;
                            C14335b bVar6 = bVar;
                        }
                        hashMap2 = hashMap13;
                        arrayList2 = arrayList9;
                        str2 = str12;
                        hashMap = hashMap14;
                        bVar2 = bVar;
                        cVar2 = cVar;
                    } else {
                        hashMap5 = hashMap13;
                        ArrayList arrayList12 = arrayList9;
                        str3 = str12;
                        HashMap hashMap16 = hashMap14;
                        if (b.startsWith("#EXT-X-KEY")) {
                            String m3 = m22566m(b, f32025H, hashMap12);
                            String l3 = m22565l(b, f32026I, "identity", hashMap12);
                            if ("NONE".equals(m3)) {
                                treeMap.clear();
                                str9 = null;
                                str8 = null;
                                drmInitData3 = null;
                            } else {
                                str9 = m22565l(b, f32029L, (String) null, hashMap12);
                                if (!"identity".equals(l3)) {
                                    String str21 = str16;
                                    if (str21 == null) {
                                        str16 = ("SAMPLE-AES-CENC".equals(m3) || "SAMPLE-AES-CTR".equals(m3)) ? "cenc" : "cbcs";
                                    } else {
                                        str16 = str21;
                                    }
                                    DrmInitData.SchemeData e = m22558e(b, l3, hashMap12);
                                    if (e != null) {
                                        treeMap.put(l3, e);
                                        drmInitData3 = null;
                                    }
                                } else if ("AES-128".equals(m3)) {
                                    str8 = m22566m(b, f32028K, hashMap12);
                                }
                                str8 = null;
                            }
                            String str22 = str;
                            str15 = str9;
                            str14 = str8;
                            aVar2 = aVar3;
                            hashMap8 = hashMap16;
                            arrayList6 = arrayList8;
                        } else {
                            String str23 = str16;
                            if (b.startsWith("#EXT-X-BYTERANGE")) {
                                String m4 = m22566m(b, f32021D, hashMap12);
                                int i18 = C14049b0.f30913a;
                                String[] split2 = m4.split("@", -1);
                                j14 = Long.parseLong(split2[0]);
                                if (split2.length > 1) {
                                    j5 = Long.parseLong(split2[1]);
                                }
                            } else {
                                if (b.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                    i6 = Integer.parseInt(b.substring(b.indexOf(58) + 1));
                                    bVar3 = bVar;
                                    cVar4 = cVar;
                                    hashMap13 = hashMap5;
                                    str7 = str23;
                                    hashMap14 = hashMap16;
                                    str12 = str3;
                                    arrayList9 = arrayList12;
                                    str11 = null;
                                    z6 = true;
                                } else if (b.equals("#EXT-X-DISCONTINUITY")) {
                                    i8++;
                                } else {
                                    if (b.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                        if (j3 == 0) {
                                            String substring = b.substring(b.indexOf(58) + 1);
                                            Matcher matcher = C14049b0.f30919g.matcher(substring);
                                            if (!matcher.matches()) {
                                                String valueOf = String.valueOf(substring);
                                                throw new ParserException(valueOf.length() != 0 ? "Invalid date/time format: ".concat(valueOf) : new String("Invalid date/time format: "));
                                            }
                                            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                                                i3 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                                                if (HelpFormatter.DEFAULT_OPT_PREFIX.equals(matcher.group(11))) {
                                                    i3 *= -1;
                                                }
                                            } else {
                                                i3 = 0;
                                            }
                                            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                                            gregorianCalendar.clear();
                                            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                                            if (!TextUtils.isEmpty(matcher.group(8))) {
                                                String valueOf2 = String.valueOf(matcher.group(8));
                                                gregorianCalendar.set(14, new BigDecimal(valueOf2.length() != 0 ? "0.".concat(valueOf2) : new String("0.")).movePointRight(3).intValue());
                                            }
                                            long timeInMillis = gregorianCalendar.getTimeInMillis();
                                            if (i3 != 0) {
                                                timeInMillis -= (long) (i3 * 60000);
                                            }
                                            j3 = C17912g.m30087a(timeInMillis) - j8;
                                            str4 = str23;
                                            aVar2 = aVar3;
                                            hashMap8 = hashMap16;
                                            String str24 = str;
                                            arrayList6 = arrayList8;
                                            str16 = str4;
                                        } else {
                                            str4 = str23;
                                            aVar2 = aVar3;
                                            hashMap8 = hashMap16;
                                            String str25 = str;
                                        }
                                    } else if (b.equals("#EXT-X-GAP")) {
                                        bVar3 = bVar;
                                        cVar4 = cVar;
                                        hashMap13 = hashMap5;
                                        str7 = str23;
                                        hashMap14 = hashMap16;
                                        str12 = str3;
                                        arrayList9 = arrayList12;
                                        str11 = null;
                                        z8 = true;
                                    } else if (b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                        bVar3 = bVar;
                                        cVar4 = cVar;
                                        hashMap13 = hashMap5;
                                        str7 = str23;
                                        hashMap14 = hashMap16;
                                        str12 = str3;
                                        arrayList9 = arrayList12;
                                        str11 = null;
                                        z4 = true;
                                    } else if (b.equals("#EXT-X-ENDLIST")) {
                                        bVar3 = bVar;
                                        cVar4 = cVar;
                                        hashMap13 = hashMap5;
                                        str7 = str23;
                                        hashMap14 = hashMap16;
                                        str12 = str3;
                                        arrayList9 = arrayList12;
                                        str11 = null;
                                        z7 = true;
                                    } else if (b.startsWith("#EXT-X-RENDITION-REPORT")) {
                                        str4 = str23;
                                        long k = m22564k(b, f32018A, (j4 + ((long) arrayList8.size())) - (arrayList12.isEmpty() ? 1 : 0));
                                        List list = arrayList12.isEmpty() ? ((C14338c.C14341c) C16201n0.m26211b(arrayList8)).f32144n : arrayList12;
                                        if (j13 != -9223372036854775807L) {
                                            i2 = 1;
                                            i = list.size() - 1;
                                        } else {
                                            i2 = 1;
                                            i = -1;
                                        }
                                        Matcher matcher2 = f32019B.matcher(b);
                                        if (matcher2.find()) {
                                            String group = matcher2.group(i2);
                                            group.getClass();
                                            i = Integer.parseInt(group);
                                        }
                                        Uri parse = Uri.parse(C14087z.m21776c(str, m22566m(b, f32028K, hashMap12)));
                                        C14338c.C14340b bVar7 = new C14338c.C14340b(k, i);
                                        hashMap8 = hashMap16;
                                        hashMap8.put(parse, bVar7);
                                        aVar2 = aVar3;
                                    } else {
                                        str4 = str23;
                                        hashMap8 = hashMap16;
                                        String str26 = str;
                                        if (b.startsWith("#EXT-X-PRELOAD-HINT")) {
                                            aVar2 = aVar3;
                                            if (aVar2 == null && "PART".equals(m22566m(b, f32031N, hashMap12))) {
                                                String m5 = m22566m(b, f32028K, hashMap12);
                                                arrayList6 = arrayList8;
                                                long k2 = m22564k(b, f32023F, -1);
                                                long k3 = m22564k(b, f32024G, -1);
                                                String hexString = str14 == null ? null : str15 != null ? str15 : Long.toHexString(j6);
                                                if (drmInitData3 == null && !treeMap.isEmpty()) {
                                                    DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                    DrmInitData drmInitData5 = new DrmInitData(str4, schemeDataArr);
                                                    if (drmInitData2 == null) {
                                                        drmInitData2 = m22556c(str4, schemeDataArr);
                                                    }
                                                    drmInitData3 = drmInitData5;
                                                }
                                                int i19 = (k2 > -1 ? 1 : (k2 == -1 ? 0 : -1));
                                                if (i19 == 0 || k3 != -1) {
                                                    aVar2 = new C14338c.C14339a(m5, cVar5, 0, i8, j7, drmInitData3, str14, hexString, i19 != 0 ? k2 : 0, k3, false, false, true);
                                                }
                                                str16 = str4;
                                            }
                                        } else {
                                            aVar2 = aVar3;
                                            ArrayList arrayList13 = arrayList8;
                                            if (b.startsWith("#EXT-X-PART")) {
                                                String hexString2 = str14 == null ? null : str15 != null ? str15 : Long.toHexString(j6);
                                                String m6 = m22566m(b, f32028K, hashMap12);
                                                long d = (long) (m22557d(b, f32057n) * 1000000.0d);
                                                boolean i20 = m22562i(b, f32040W) | (z4 && arrayList12.isEmpty());
                                                boolean i21 = m22562i(b, f32041X);
                                                String l4 = m22565l(b, f32022E, (String) null, hashMap12);
                                                if (l4 != null) {
                                                    int i22 = C14049b0.f30913a;
                                                    String[] split3 = l4.split("@", -1);
                                                    j2 = Long.parseLong(split3[0]);
                                                    if (split3.length > 1) {
                                                        j10 = Long.parseLong(split3[1]);
                                                    }
                                                } else {
                                                    j2 = -1;
                                                }
                                                int i23 = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
                                                if (i23 == 0) {
                                                    j10 = 0;
                                                }
                                                if (drmInitData3 == null && !treeMap.isEmpty()) {
                                                    DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                    DrmInitData drmInitData6 = new DrmInitData(str4, schemeDataArr2);
                                                    if (drmInitData2 == null) {
                                                        drmInitData2 = m22556c(str4, schemeDataArr2);
                                                    }
                                                    drmInitData3 = drmInitData6;
                                                }
                                                arrayList5 = arrayList12;
                                                arrayList5.add(new C14338c.C14339a(m6, cVar5, d, i8, j7, drmInitData3, str14, hexString2, j10, j2, i21, i20, false));
                                                j7 += d;
                                                if (i23 != 0) {
                                                    j10 += j2;
                                                }
                                            } else {
                                                arrayList5 = arrayList12;
                                                if (!b.startsWith("#")) {
                                                    String hexString3 = str14 == null ? null : str15 != null ? str15 : Long.toHexString(j6);
                                                    long j22 = j6 + 1;
                                                    String n = m22567n(b, hashMap12);
                                                    C14338c.C14341c cVar9 = (C14338c.C14341c) hashMap5.get(n);
                                                    int i24 = (j14 > -1 ? 1 : (j14 == -1 ? 0 : -1));
                                                    if (i24 == 0) {
                                                        j = 0;
                                                    } else {
                                                        if (z9 && cVar5 == null && cVar9 == null) {
                                                            C14338c.C14341c cVar10 = new C14338c.C14341c(n, (String) null, 0, (String) null, j5);
                                                            hashMap5.put(n, cVar10);
                                                            cVar9 = cVar10;
                                                        }
                                                        j = j5;
                                                    }
                                                    if (drmInitData3 != null || treeMap.isEmpty()) {
                                                        hashMap4 = hashMap12;
                                                        hashMap3 = hashMap8;
                                                        z2 = false;
                                                        drmInitData = drmInitData3;
                                                    } else {
                                                        hashMap4 = hashMap12;
                                                        hashMap3 = hashMap8;
                                                        z2 = false;
                                                        DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                        drmInitData = new DrmInitData(str4, schemeDataArr3);
                                                        if (drmInitData2 == null) {
                                                            drmInitData2 = m22556c(str4, schemeDataArr3);
                                                        }
                                                    }
                                                    arrayList3 = arrayList13;
                                                    arrayList3.add(new C14338c.C14341c(n, cVar5 != null ? cVar5 : cVar9, str13, j9, i8, j8, drmInitData, str14, hexString3, j, j14, z8, arrayList5));
                                                    j8 += j9;
                                                    arrayList4 = new ArrayList();
                                                    if (i24 != 0) {
                                                        j += j14;
                                                    }
                                                    z8 = z2;
                                                    drmInitData3 = drmInitData;
                                                    j6 = j22;
                                                    j9 = 0;
                                                    j14 = -1;
                                                    j5 = j;
                                                    j7 = j8;
                                                    str13 = str3;
                                                    bVar5 = bVar;
                                                    cVar3 = cVar;
                                                    aVar3 = aVar2;
                                                    str16 = str4;
                                                    hashMap6 = hashMap5;
                                                    arrayList8 = arrayList3;
                                                    hashMap12 = hashMap4;
                                                    hashMap7 = hashMap3;
                                                    str5 = str3;
                                                    str6 = null;
                                                    C14335b bVar8 = bVar5;
                                                }
                                            }
                                            hashMap10 = hashMap12;
                                            hashMap9 = hashMap8;
                                            arrayList3 = arrayList13;
                                        }
                                    }
                                    hashMap10 = hashMap12;
                                    hashMap9 = hashMap8;
                                    arrayList3 = arrayList8;
                                    arrayList5 = arrayList12;
                                }
                                bVar5 = bVar3;
                            }
                            str4 = str23;
                            aVar2 = aVar3;
                            hashMap8 = hashMap16;
                            String str242 = str;
                            arrayList6 = arrayList8;
                            str16 = str4;
                        }
                        bVar5 = bVar;
                        cVar3 = cVar;
                        hashMap7 = hashMap8;
                        hashMap6 = hashMap5;
                        arrayList8 = arrayList6;
                        str5 = str3;
                        arrayList4 = arrayList12;
                        str6 = null;
                        aVar3 = aVar2;
                        C14335b bVar82 = bVar5;
                    }
                    arrayList4 = arrayList5;
                    bVar5 = bVar;
                    cVar3 = cVar;
                    aVar3 = aVar2;
                    str16 = str4;
                    hashMap6 = hashMap5;
                    arrayList8 = arrayList3;
                    hashMap12 = hashMap4;
                    hashMap7 = hashMap3;
                    str5 = str3;
                    str6 = null;
                    C14335b bVar822 = bVar5;
                }
                cVar4 = cVar2;
                hashMap13 = hashMap2;
                hashMap14 = hashMap;
                str12 = str2;
                arrayList9 = arrayList2;
                str11 = null;
                bVar5 = bVar2;
                C14335b bVar9 = bVar;
            }
        }
        String str27 = str;
        ArrayList arrayList14 = arrayList9;
        HashMap hashMap17 = hashMap14;
        ArrayList arrayList15 = arrayList8;
        C14338c.C14339a aVar5 = aVar3;
        if (aVar5 != null) {
            arrayList14.add(aVar5);
        }
        if (j3 != 0) {
            arrayList = arrayList14;
            z = true;
        } else {
            z = false;
            arrayList = arrayList14;
        }
        return new C14338c(i5, str, arrayList10, j11, z5, j3, z6, i6, j4, i7, j12, j13, z4, z7, z, drmInitData2, arrayList15, arrayList, eVar2, hashMap17);
    }

    /* renamed from: i */
    public static boolean m22562i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    /* renamed from: j */
    public static double m22563j(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String group = matcher.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    /* renamed from: k */
    public static long m22564k(String str, Pattern pattern, long j) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return j;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    /* renamed from: l */
    public static String m22565l(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : m22567n(str2, map);
    }

    /* renamed from: m */
    public static String m22566m(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String l = m22565l(str, pattern, (String) null, map);
        if (l != null) {
            return l;
        }
        String pattern2 = pattern.pattern();
        StringBuilder sb = new StringBuilder(C0391c.m1055a(str, C0391c.m1055a(pattern2, 19)));
        sb.append("Couldn't match ");
        sb.append(pattern2);
        sb.append(" in ");
        sb.append(str);
        throw new ParserException(sb.toString());
    }

    /* renamed from: n */
    public static String m22567n(String str, Map<String, String> map) {
        Matcher matcher = f32045b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b A[Catch:{ all -> 0x003b }, LOOP:2: B:23:0x0052->B:34:0x006b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0079 A[Catch:{ all -> 0x003b }, LOOP:3: B:40:0x0079->B:94:0x0079, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x010f A[SYNTHETIC, Splitter:B:78:0x010f] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0070 A[EDGE_INSN: B:92:0x0070->B:35:0x0070 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo47763a(android.net.Uri r9, p505aj.C14001h r10) throws java.io.IOException {
        /*
            r8 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r10)
            r0.<init>(r1)
            java.util.ArrayDeque r10 = new java.util.ArrayDeque
            r10.<init>()
            int r1 = r0.read()     // Catch:{ all -> 0x003b }
            r2 = 239(0xef, float:3.35E-43)
            r3 = 0
            if (r1 != r2) goto L_0x002d
            int r1 = r0.read()     // Catch:{ all -> 0x003b }
            r2 = 187(0xbb, float:2.62E-43)
            if (r1 != r2) goto L_0x0077
            int r1 = r0.read()     // Catch:{ all -> 0x003b }
            r2 = 191(0xbf, float:2.68E-43)
            if (r1 == r2) goto L_0x0029
            goto L_0x0077
        L_0x0029:
            int r1 = r0.read()     // Catch:{ all -> 0x003b }
        L_0x002d:
            r2 = -1
            if (r1 == r2) goto L_0x003e
            boolean r4 = java.lang.Character.isWhitespace(r1)     // Catch:{ all -> 0x003b }
            if (r4 == 0) goto L_0x003e
            int r1 = r0.read()     // Catch:{ all -> 0x003b }
            goto L_0x002d
        L_0x003b:
            r9 = move-exception
            goto L_0x0117
        L_0x003e:
            r4 = 7
            r5 = r3
        L_0x0040:
            if (r5 >= r4) goto L_0x0052
            java.lang.String r6 = "#EXTM3U"
            char r6 = r6.charAt(r5)     // Catch:{ all -> 0x003b }
            if (r1 == r6) goto L_0x004b
            goto L_0x0077
        L_0x004b:
            int r1 = r0.read()     // Catch:{ all -> 0x003b }
            int r5 = r5 + 1
            goto L_0x0040
        L_0x0052:
            r4 = 13
            r5 = 10
            r6 = 1
            if (r1 == r2) goto L_0x0070
            boolean r7 = java.lang.Character.isWhitespace(r1)     // Catch:{ all -> 0x003b }
            if (r7 == 0) goto L_0x0070
            int r7 = p513bj.C14049b0.f30913a     // Catch:{ all -> 0x003b }
            if (r1 == r5) goto L_0x0068
            if (r1 != r4) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r7 = r3
            goto L_0x0069
        L_0x0068:
            r7 = r6
        L_0x0069:
            if (r7 != 0) goto L_0x0070
            int r1 = r0.read()     // Catch:{ all -> 0x003b }
            goto L_0x0052
        L_0x0070:
            int r2 = p513bj.C14049b0.f30913a     // Catch:{ all -> 0x003b }
            if (r1 == r5) goto L_0x0076
            if (r1 != r4) goto L_0x0077
        L_0x0076:
            r3 = r6
        L_0x0077:
            if (r3 == 0) goto L_0x010f
        L_0x0079:
            java.lang.String r1 = r0.readLine()     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0102
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x003b }
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x008a
            goto L_0x0079
        L_0x008a:
            java.lang.String r2 = "#EXT-X-STREAM-INF"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x00a3
            r10.add(r1)     // Catch:{ all -> 0x003b }
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$a r1 = new com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$a     // Catch:{ all -> 0x003b }
            r1.<init>(r10, r0)     // Catch:{ all -> 0x003b }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x003b }
            com.google.android.exoplayer2.source.hls.playlist.b r9 = m22560g(r1, r9)     // Catch:{ all -> 0x003b }
            goto L_0x00fc
        L_0x00a3:
            java.lang.String r2 = "#EXT-X-TARGETDURATION"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x003b }
            if (r2 != 0) goto L_0x00e8
            java.lang.String r2 = "#EXT-X-MEDIA-SEQUENCE"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x003b }
            if (r2 != 0) goto L_0x00e8
            java.lang.String r2 = "#EXTINF"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x003b }
            if (r2 != 0) goto L_0x00e8
            java.lang.String r2 = "#EXT-X-KEY"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x003b }
            if (r2 != 0) goto L_0x00e8
            java.lang.String r2 = "#EXT-X-BYTERANGE"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x003b }
            if (r2 != 0) goto L_0x00e8
            java.lang.String r2 = "#EXT-X-DISCONTINUITY"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x003b }
            if (r2 != 0) goto L_0x00e8
            java.lang.String r2 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x003b }
            if (r2 != 0) goto L_0x00e8
            java.lang.String r2 = "#EXT-X-ENDLIST"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x00e4
            goto L_0x00e8
        L_0x00e4:
            r10.add(r1)     // Catch:{ all -> 0x003b }
            goto L_0x0079
        L_0x00e8:
            r10.add(r1)     // Catch:{ all -> 0x003b }
            com.google.android.exoplayer2.source.hls.playlist.b r1 = r8.f32070a     // Catch:{ all -> 0x003b }
            com.google.android.exoplayer2.source.hls.playlist.c r2 = r8.f32071b     // Catch:{ all -> 0x003b }
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$a r3 = new com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$a     // Catch:{ all -> 0x003b }
            r3.<init>(r10, r0)     // Catch:{ all -> 0x003b }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x003b }
            com.google.android.exoplayer2.source.hls.playlist.c r9 = m22561h(r1, r2, r3, r9)     // Catch:{ all -> 0x003b }
        L_0x00fc:
            int r10 = p513bj.C14049b0.f30913a
            r0.close()     // Catch:{ IOException -> 0x0101 }
        L_0x0101:
            return r9
        L_0x0102:
            int r9 = p513bj.C14049b0.f30913a
            r0.close()     // Catch:{ IOException -> 0x0107 }
        L_0x0107:
            com.google.android.exoplayer2.ParserException r9 = new com.google.android.exoplayer2.ParserException
            java.lang.String r10 = "Failed to parse the playlist, could not identify any tags."
            r9.<init>((java.lang.String) r10)
            throw r9
        L_0x010f:
            com.google.android.exoplayer2.source.UnrecognizedInputFormatException r10 = new com.google.android.exoplayer2.source.UnrecognizedInputFormatException     // Catch:{ all -> 0x003b }
            java.lang.String r1 = "Input does not start with the #EXTM3U header."
            r10.<init>(r1, r9)     // Catch:{ all -> 0x003b }
            throw r10     // Catch:{ all -> 0x003b }
        L_0x0117:
            int r10 = p513bj.C14049b0.f30913a
            r0.close()     // Catch:{ IOException -> 0x011c }
        L_0x011c:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.mo47763a(android.net.Uri, aj.h):java.lang.Object");
    }
}
