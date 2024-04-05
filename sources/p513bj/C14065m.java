package p513bj;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001a0.C0005b;
import p611lh.C18162a;

/* renamed from: bj.m */
public final class C14065m {

    /* renamed from: a */
    public static final ArrayList<C14066a> f30951a = new ArrayList<>();

    /* renamed from: b */
    public static final Pattern f30952b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: bj.m$a */
    public static final class C14066a {
    }

    /* renamed from: bj.m$b */
    public static final class C14067b {

        /* renamed from: a */
        public final int f30953a;

        /* renamed from: b */
        public final int f30954b;

        public C14067b(int i, int i2) {
            this.f30953a = i;
            this.f30954b = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009e, code lost:
        r4 = p611lh.C18162a.m30675a((r4 = m21676f(r5)).f30954b);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m21671a(java.lang.String r4, java.lang.String r5) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = -1
            int r2 = r4.hashCode()
            r3 = 1
            switch(r2) {
                case -2123537834: goto L_0x0086;
                case -432837260: goto L_0x007b;
                case -432837259: goto L_0x0070;
                case -53558318: goto L_0x0065;
                case 187078296: goto L_0x005a;
                case 187094639: goto L_0x004f;
                case 1504578661: goto L_0x0044;
                case 1504619009: goto L_0x0039;
                case 1504831518: goto L_0x002b;
                case 1903231877: goto L_0x001d;
                case 1903589369: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0090
        L_0x000f:
            java.lang.String r2 = "audio/g711-mlaw"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0019
            goto L_0x0090
        L_0x0019:
            r1 = 10
            goto L_0x0090
        L_0x001d:
            java.lang.String r2 = "audio/g711-alaw"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0027
            goto L_0x0090
        L_0x0027:
            r1 = 9
            goto L_0x0090
        L_0x002b:
            java.lang.String r2 = "audio/mpeg"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0035
            goto L_0x0090
        L_0x0035:
            r1 = 8
            goto L_0x0090
        L_0x0039:
            java.lang.String r2 = "audio/flac"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0042
            goto L_0x0090
        L_0x0042:
            r1 = 7
            goto L_0x0090
        L_0x0044:
            java.lang.String r2 = "audio/eac3"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x004d
            goto L_0x0090
        L_0x004d:
            r1 = 6
            goto L_0x0090
        L_0x004f:
            java.lang.String r2 = "audio/raw"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0058
            goto L_0x0090
        L_0x0058:
            r1 = 5
            goto L_0x0090
        L_0x005a:
            java.lang.String r2 = "audio/ac3"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0063
            goto L_0x0090
        L_0x0063:
            r1 = 4
            goto L_0x0090
        L_0x0065:
            java.lang.String r2 = "audio/mp4a-latm"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x006e
            goto L_0x0090
        L_0x006e:
            r1 = 3
            goto L_0x0090
        L_0x0070:
            java.lang.String r2 = "audio/mpeg-L2"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0079
            goto L_0x0090
        L_0x0079:
            r1 = 2
            goto L_0x0090
        L_0x007b:
            java.lang.String r2 = "audio/mpeg-L1"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0084
            goto L_0x0090
        L_0x0084:
            r1 = r3
            goto L_0x0090
        L_0x0086:
            java.lang.String r2 = "audio/eac3-joc"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r1 = r0
        L_0x0090:
            switch(r1) {
                case 0: goto L_0x00ac;
                case 1: goto L_0x00ac;
                case 2: goto L_0x00ac;
                case 3: goto L_0x0094;
                case 4: goto L_0x00ac;
                case 5: goto L_0x00ac;
                case 6: goto L_0x00ac;
                case 7: goto L_0x00ac;
                case 8: goto L_0x00ac;
                case 9: goto L_0x00ac;
                case 10: goto L_0x00ac;
                default: goto L_0x0093;
            }
        L_0x0093:
            return r0
        L_0x0094:
            if (r5 != 0) goto L_0x0097
            return r0
        L_0x0097:
            bj.m$b r4 = m21676f(r5)
            if (r4 != 0) goto L_0x009e
            return r0
        L_0x009e:
            int r4 = r4.f30954b
            int r4 = p611lh.C18162a.m30675a(r4)
            if (r4 == 0) goto L_0x00ab
            r5 = 16
            if (r4 == r5) goto L_0x00ab
            r0 = r3
        L_0x00ab:
            return r0
        L_0x00ac:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p513bj.C14065m.m21671a(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: b */
    public static String m21672b(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] H = C14049b0.m21627H(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : H) {
            if (str2.equals(m21674d(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* renamed from: c */
    public static int m21673c(String str, String str2) {
        C14067b f;
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = 8;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (f = m21676f(str2)) == null) {
                    return 0;
                }
                return C18162a.m30675a(f.f30954b);
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case 8:
                return 14;
            default:
                return 0;
        }
    }

    /* renamed from: d */
    public static String m21674d(String str) {
        C14067b f;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String q0 = C0005b.m56q0(str.trim());
        if (q0.startsWith("avc1") || q0.startsWith("avc3")) {
            return "video/avc";
        }
        if (q0.startsWith("hev1") || q0.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (q0.startsWith("dvav") || q0.startsWith("dva1") || q0.startsWith("dvhe") || q0.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (q0.startsWith("av01")) {
            return "video/av01";
        }
        if (q0.startsWith("vp9") || q0.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (q0.startsWith("vp8") || q0.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (q0.startsWith("mp4a")) {
            if (q0.startsWith("mp4a.") && (f = m21676f(q0)) != null) {
                str2 = m21675e(f.f30953a);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (q0.startsWith("mha1")) {
            return "audio/mha1";
        } else {
            if (q0.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (q0.startsWith("ac-3") || q0.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (q0.startsWith("ec-3") || q0.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (q0.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (q0.startsWith("ac-4") || q0.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (q0.startsWith("dtsc") || q0.startsWith("dtse")) {
                return "audio/vnd.dts";
            }
            if (q0.startsWith("dtsh") || q0.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (q0.startsWith("opus")) {
                return "audio/opus";
            }
            if (q0.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (q0.startsWith("flac")) {
                return "audio/flac";
            }
            if (q0.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (q0.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (q0.contains("cea708")) {
                return "application/cea-708";
            }
            if (q0.contains("eia608") || q0.contains("cea608")) {
                return "application/cea-608";
            }
            int size = f30951a.size();
            for (int i = 0; i < size; i++) {
                f30951a.get(i).getClass();
                if (q0.startsWith((String) null)) {
                    break;
                }
            }
            return null;
        }
    }

    /* renamed from: e */
    public static String m21675e(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* renamed from: f */
    public static C14067b m21676f(String str) {
        Matcher matcher = f30952b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        int i = 0;
        try {
            int parseInt = Integer.parseInt(group, 16);
            if (group2 != null) {
                i = Integer.parseInt(group2);
            }
            return new C14067b(parseInt, i);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static String m21677g(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: h */
    public static int m21678h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m21679i(str)) {
            return 1;
        }
        if (m21681k(str)) {
            return 2;
        }
        if (m21680j(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = f30951a.size();
        for (int i = 0; i < size; i++) {
            f30951a.get(i).getClass();
            if (str.equals((Object) null)) {
                return 0;
            }
        }
        return -1;
    }

    /* renamed from: i */
    public static boolean m21679i(String str) {
        return "audio".equals(m21677g(str));
    }

    /* renamed from: j */
    public static boolean m21680j(String str) {
        return "text".equals(m21677g(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* renamed from: k */
    public static boolean m21681k(String str) {
        return "video".equals(m21677g(str));
    }
}
