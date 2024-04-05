package p694vi;

import android.text.Layout;
import android.util.Log;
import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.DetailsBottomSheetNavigationKey;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p001a0.C0005b;
import p504ai.C13983i;
import p513bj.C14049b0;
import p513bj.C14051c0;
import p513bj.C14075p;
import p636oi.C18298b;
import p636oi.C18300d;

/* renamed from: vi.c */
public final class C18646c extends C18298b {

    /* renamed from: n */
    public static final Pattern f41200n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: o */
    public static final Pattern f41201o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: p */
    public static final Pattern f41202p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: q */
    public static final Pattern f41203q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: r */
    public static final Pattern f41204r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: s */
    public static final Pattern f41205s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: t */
    public static final Pattern f41206t = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: u */
    public static final C18648b f41207u = new C18648b(30.0f, 1, 1);

    /* renamed from: v */
    public static final C18647a f41208v = new C18647a(15);

    /* renamed from: m */
    public final XmlPullParserFactory f41209m;

    /* renamed from: vi.c$a */
    public static final class C18647a {

        /* renamed from: a */
        public final int f41210a;

        public C18647a(int i) {
            this.f41210a = i;
        }
    }

    /* renamed from: vi.c$b */
    public static final class C18648b {

        /* renamed from: a */
        public final float f41211a;

        /* renamed from: b */
        public final int f41212b;

        /* renamed from: c */
        public final int f41213c;

        public C18648b(float f, int i, int i2) {
            this.f41211a = f;
            this.f41212b = i;
            this.f41213c = i2;
        }
    }

    /* renamed from: vi.c$c */
    public static final class C18649c {

        /* renamed from: a */
        public final int f41214a;

        /* renamed from: b */
        public final int f41215b;

        public C18649c(int i, int i2) {
            this.f41214a = i;
            this.f41215b = i2;
        }
    }

    public C18646c() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f41209m = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: h */
    public static C18652f m31458h(C18652f fVar) {
        return fVar == null ? new C18652f() : fVar;
    }

    /* renamed from: i */
    public static boolean m31459i(String str) {
        return str.equals("tt") || str.equals("head") || str.equals(DetailsBottomSheetNavigationKey.PARAM_BODY) || str.equals("div") || str.equals(Constants.APPBOY_PUSH_PRIORITY_KEY) || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals(ResponseConstants.LAYOUT) || str.equals("region") || str.equals(ResponseConstants.METADATA) || str.equals(ResponseConstants.IMAGE) || str.equals("data") || str.equals("information");
    }

    /* renamed from: j */
    public static Layout.Alignment m31460j(String str) {
        String q0 = C0005b.m56q0(str);
        q0.getClass();
        char c = 65535;
        switch (q0.hashCode()) {
            case -1364013995:
                if (q0.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case 100571:
                if (q0.equals(ResponseConstants.PROMOTION_END)) {
                    c = 1;
                    break;
                }
                break;
            case 3317767:
                if (q0.equals("left")) {
                    c = 2;
                    break;
                }
                break;
            case 108511772:
                if (q0.equals("right")) {
                    c = 3;
                    break;
                }
                break;
            case 109757538:
                if (q0.equals("start")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    /* renamed from: k */
    public static C18647a m31461k(XmlPullParser xmlPullParser, C18647a aVar) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f41206t.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return aVar;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt != 0 && parseInt2 != 0) {
                return new C18647a(parseInt2);
            }
            StringBuilder sb = new StringBuilder(47);
            sb.append("Invalid cell resolution ");
            sb.append(parseInt);
            sb.append(" ");
            sb.append(parseInt2);
            throw new SubtitleDecoderException(sb.toString());
        } catch (NumberFormatException unused) {
            Log.w("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return aVar;
        }
    }

    /* renamed from: l */
    public static void m31462l(String str, C18652f fVar) throws SubtitleDecoderException {
        Matcher matcher;
        int i = C14049b0.f30913a;
        String[] split = str.split("\\s+", -1);
        if (split.length == 1) {
            matcher = f41202p.matcher(str);
        } else if (split.length == 2) {
            matcher = f41202p.matcher(split[1]);
            Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            int length = split.length;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Invalid number of entries for fontSize: ");
            sb.append(length);
            sb.append(".");
            throw new SubtitleDecoderException(sb.toString());
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            group.hashCode();
            char c = 65535;
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    fVar.f41248j = 3;
                    break;
                case 1:
                    fVar.f41248j = 2;
                    break;
                case 2:
                    fVar.f41248j = 1;
                    break;
                default:
                    throw new SubtitleDecoderException(C13983i.m21492k(group.length() + 30, "Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            fVar.f41249k = Float.parseFloat(group2);
            return;
        }
        throw new SubtitleDecoderException(C13983i.m21492k(str.length() + 36, "Invalid expression for fontSize: '", str, "'."));
    }

    /* renamed from: m */
    public static C18648b m31463m(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i = C14049b0.f30913a;
            String[] split = attributeValue2.split(" ", -1);
            if (split.length == 2) {
                f = ((float) Integer.parseInt(split[0])) / ((float) Integer.parseInt(split[1]));
            } else {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
        }
        C18648b bVar = f41207u;
        int i2 = bVar.f41212b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = bVar.f41213c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new C18648b(((float) parseInt) * f, i2, i3);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01c0  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m31464n(org.xmlpull.v1.XmlPullParser r19, java.util.HashMap r20, p694vi.C18646c.C18647a r21, p694vi.C18646c.C18649c r22, java.util.HashMap r23, java.util.HashMap r24) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            r0 = r19
            r1 = r20
            r2 = r22
        L_0x0006:
            r19.next()
            java.lang.String r3 = "style"
            boolean r4 = p513bj.C14051c0.m21657c(r0, r3)
            r5 = -1
            r6 = 0
            if (r4 == 0) goto L_0x0053
            java.lang.String r3 = p513bj.C14051c0.m21655a(r0, r3)
            vi.f r4 = new vi.f
            r4.<init>()
            vi.f r4 = m31466p(r0, r4)
            if (r3 == 0) goto L_0x0048
            java.lang.String r3 = r3.trim()
            boolean r7 = r3.isEmpty()
            if (r7 == 0) goto L_0x002f
            java.lang.String[] r3 = new java.lang.String[r6]
            goto L_0x0037
        L_0x002f:
            int r7 = p513bj.C14049b0.f30913a
            java.lang.String r7 = "\\s+"
            java.lang.String[] r3 = r3.split(r7, r5)
        L_0x0037:
            int r5 = r3.length
        L_0x0038:
            if (r6 >= r5) goto L_0x0048
            r7 = r3[r6]
            java.lang.Object r7 = r1.get(r7)
            vi.f r7 = (p694vi.C18652f) r7
            r4.mo70161a(r7)
            int r6 = r6 + 1
            goto L_0x0038
        L_0x0048:
            java.lang.String r3 = r4.f41250l
            if (r3 == 0) goto L_0x004f
            r1.put(r3, r4)
        L_0x004f:
            r6 = r23
            goto L_0x02a5
        L_0x0053:
            java.lang.String r3 = "region"
            boolean r3 = p513bj.C14051c0.m21657c(r0, r3)
            java.lang.String r4 = "id"
            if (r3 == 0) goto L_0x0277
            java.lang.String r8 = p513bj.C14051c0.m21655a(r0, r4)
            if (r8 != 0) goto L_0x0065
            goto L_0x026c
        L_0x0065:
            java.lang.String r3 = "origin"
            java.lang.String r3 = p513bj.C14051c0.m21655a(r0, r3)
            java.lang.String r4 = "TtmlDecoder"
            if (r3 == 0) goto L_0x0267
            java.util.regex.Pattern r7 = f41204r
            java.util.regex.Matcher r9 = r7.matcher(r3)
            java.util.regex.Pattern r10 = f41205s
            java.util.regex.Matcher r11 = r10.matcher(r3)
            boolean r12 = r9.matches()
            java.lang.String r13 = "Ignoring region with malformed origin: "
            java.lang.String r14 = "Ignoring region with missing tts:extent: "
            r15 = 1120403456(0x42c80000, float:100.0)
            r5 = 2
            r6 = 1
            if (r12 == 0) goto L_0x00b7
            java.lang.String r11 = r9.group(r6)     // Catch:{ NumberFormatException -> 0x00a2 }
            r11.getClass()     // Catch:{ NumberFormatException -> 0x00a2 }
            float r11 = java.lang.Float.parseFloat(r11)     // Catch:{ NumberFormatException -> 0x00a2 }
            float r11 = r11 / r15
            java.lang.String r9 = r9.group(r5)     // Catch:{ NumberFormatException -> 0x00a2 }
            r9.getClass()     // Catch:{ NumberFormatException -> 0x00a2 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x00a2 }
            float r9 = r9 / r15
            goto L_0x00f9
        L_0x00a2:
            int r5 = r3.length()
            if (r5 == 0) goto L_0x00ad
            java.lang.String r3 = r13.concat(r3)
            goto L_0x00b2
        L_0x00ad:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r13)
        L_0x00b2:
            android.util.Log.w(r4, r3)
            goto L_0x026c
        L_0x00b7:
            boolean r9 = r11.matches()
            if (r9 == 0) goto L_0x0251
            if (r2 != 0) goto L_0x00d4
            int r5 = r3.length()
            if (r5 == 0) goto L_0x00ca
            java.lang.String r3 = r14.concat(r3)
            goto L_0x00cf
        L_0x00ca:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r14)
        L_0x00cf:
            android.util.Log.w(r4, r3)
            goto L_0x026c
        L_0x00d4:
            java.lang.String r9 = r11.group(r6)     // Catch:{ NumberFormatException -> 0x023d }
            r9.getClass()     // Catch:{ NumberFormatException -> 0x023d }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x023d }
            java.lang.String r11 = r11.group(r5)     // Catch:{ NumberFormatException -> 0x023d }
            r11.getClass()     // Catch:{ NumberFormatException -> 0x023d }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x023d }
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x023d }
            int r12 = r2.f41214a     // Catch:{ NumberFormatException -> 0x023d }
            float r12 = (float) r12     // Catch:{ NumberFormatException -> 0x023d }
            float r9 = r9 / r12
            float r11 = (float) r11     // Catch:{ NumberFormatException -> 0x023d }
            int r12 = r2.f41215b     // Catch:{ NumberFormatException -> 0x023d }
            float r12 = (float) r12
            float r11 = r11 / r12
            r18 = r11
            r11 = r9
            r9 = r18
        L_0x00f9:
            java.lang.String r12 = "extent"
            java.lang.String r12 = p513bj.C14051c0.m21655a(r0, r12)
            if (r12 == 0) goto L_0x0237
            java.util.regex.Matcher r7 = r7.matcher(r12)
            java.util.regex.Matcher r10 = r10.matcher(r12)
            boolean r12 = r7.matches()
            java.lang.String r13 = "Ignoring region with malformed extent: "
            if (r12 == 0) goto L_0x0141
            java.lang.String r10 = r7.group(r6)     // Catch:{ NumberFormatException -> 0x012c }
            r10.getClass()     // Catch:{ NumberFormatException -> 0x012c }
            float r10 = java.lang.Float.parseFloat(r10)     // Catch:{ NumberFormatException -> 0x012c }
            float r10 = r10 / r15
            java.lang.String r7 = r7.group(r5)     // Catch:{ NumberFormatException -> 0x012c }
            r7.getClass()     // Catch:{ NumberFormatException -> 0x012c }
            float r3 = java.lang.Float.parseFloat(r7)     // Catch:{ NumberFormatException -> 0x012c }
            float r3 = r3 / r15
            r14 = r3
            r13 = r10
            goto L_0x0180
        L_0x012c:
            int r5 = r3.length()
            if (r5 == 0) goto L_0x0137
            java.lang.String r3 = r13.concat(r3)
            goto L_0x013c
        L_0x0137:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r13)
        L_0x013c:
            android.util.Log.w(r4, r3)
            goto L_0x026c
        L_0x0141:
            boolean r7 = r10.matches()
            if (r7 == 0) goto L_0x0221
            if (r2 != 0) goto L_0x015e
            int r5 = r3.length()
            if (r5 == 0) goto L_0x0154
            java.lang.String r3 = r14.concat(r3)
            goto L_0x0159
        L_0x0154:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r14)
        L_0x0159:
            android.util.Log.w(r4, r3)
            goto L_0x026c
        L_0x015e:
            java.lang.String r7 = r10.group(r6)     // Catch:{ NumberFormatException -> 0x020d }
            r7.getClass()     // Catch:{ NumberFormatException -> 0x020d }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x020d }
            java.lang.String r10 = r10.group(r5)     // Catch:{ NumberFormatException -> 0x020d }
            r10.getClass()     // Catch:{ NumberFormatException -> 0x020d }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x020d }
            float r7 = (float) r7     // Catch:{ NumberFormatException -> 0x020d }
            int r12 = r2.f41214a     // Catch:{ NumberFormatException -> 0x020d }
            float r12 = (float) r12     // Catch:{ NumberFormatException -> 0x020d }
            float r7 = r7 / r12
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x020d }
            int r3 = r2.f41215b     // Catch:{ NumberFormatException -> 0x020d }
            float r3 = (float) r3
            float r10 = r10 / r3
            r13 = r7
            r14 = r10
        L_0x0180:
            java.lang.String r3 = "displayAlign"
            java.lang.String r3 = p513bj.C14051c0.m21655a(r0, r3)
            if (r3 == 0) goto L_0x01ac
            java.lang.String r3 = p001a0.C0005b.m56q0(r3)
            r3.getClass()
            java.lang.String r4 = "center"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x01a4
            java.lang.String r4 = "after"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x01a0
            goto L_0x01ac
        L_0x01a0:
            float r9 = r9 + r14
            r12 = r5
            r10 = r9
            goto L_0x01ae
        L_0x01a4:
            r3 = 1073741824(0x40000000, float:2.0)
            float r3 = r14 / r3
            float r3 = r3 + r9
            r10 = r3
            r12 = r6
            goto L_0x01ae
        L_0x01ac:
            r10 = r9
            r12 = 0
        L_0x01ae:
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = r21
            int r7 = r4.f41210a
            float r7 = (float) r7
            float r3 = r3 / r7
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r9 = "writingMode"
            java.lang.String r9 = p513bj.C14051c0.m21655a(r0, r9)
            if (r9 == 0) goto L_0x01fe
            java.lang.String r9 = p001a0.C0005b.m56q0(r9)
            r9.getClass()
            int r15 = r9.hashCode()
            switch(r15) {
                case 3694: goto L_0x01e9;
                case 3553396: goto L_0x01dd;
                case 3553576: goto L_0x01d1;
                default: goto L_0x01ce;
            }
        L_0x01ce:
            r16 = -1
            goto L_0x01f4
        L_0x01d1:
            java.lang.String r15 = "tbrl"
            boolean r9 = r9.equals(r15)
            if (r9 != 0) goto L_0x01da
            goto L_0x01ce
        L_0x01da:
            r16 = r5
            goto L_0x01f4
        L_0x01dd:
            java.lang.String r15 = "tblr"
            boolean r9 = r9.equals(r15)
            if (r9 != 0) goto L_0x01e6
            goto L_0x01ce
        L_0x01e6:
            r16 = r6
            goto L_0x01f4
        L_0x01e9:
            java.lang.String r15 = "tb"
            boolean r9 = r9.equals(r15)
            if (r9 != 0) goto L_0x01f2
            goto L_0x01ce
        L_0x01f2:
            r16 = 0
        L_0x01f4:
            switch(r16) {
                case 0: goto L_0x01fb;
                case 1: goto L_0x01fb;
                case 2: goto L_0x01f8;
                default: goto L_0x01f7;
            }
        L_0x01f7:
            goto L_0x01fe
        L_0x01f8:
            r17 = r6
            goto L_0x0200
        L_0x01fb:
            r17 = r5
            goto L_0x0200
        L_0x01fe:
            r17 = r7
        L_0x0200:
            vi.e r5 = new vi.e
            r6 = 0
            r15 = 1
            r7 = r5
            r9 = r11
            r11 = r6
            r16 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x026d
        L_0x020d:
            int r5 = r3.length()
            if (r5 == 0) goto L_0x0218
            java.lang.String r3 = r13.concat(r3)
            goto L_0x021d
        L_0x0218:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r13)
        L_0x021d:
            android.util.Log.w(r4, r3)
            goto L_0x026c
        L_0x0221:
            java.lang.String r5 = "Ignoring region with unsupported extent: "
            int r6 = r3.length()
            if (r6 == 0) goto L_0x022e
            java.lang.String r3 = r5.concat(r3)
            goto L_0x0233
        L_0x022e:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r5)
        L_0x0233:
            android.util.Log.w(r4, r3)
            goto L_0x026c
        L_0x0237:
            java.lang.String r3 = "Ignoring region without an extent"
            android.util.Log.w(r4, r3)
            goto L_0x026c
        L_0x023d:
            int r5 = r3.length()
            if (r5 == 0) goto L_0x0248
            java.lang.String r3 = r13.concat(r3)
            goto L_0x024d
        L_0x0248:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r13)
        L_0x024d:
            android.util.Log.w(r4, r3)
            goto L_0x026c
        L_0x0251:
            java.lang.String r5 = "Ignoring region with unsupported origin: "
            int r6 = r3.length()
            if (r6 == 0) goto L_0x025e
            java.lang.String r3 = r5.concat(r3)
            goto L_0x0263
        L_0x025e:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r5)
        L_0x0263:
            android.util.Log.w(r4, r3)
            goto L_0x026c
        L_0x0267:
            java.lang.String r3 = "Ignoring region without an origin"
            android.util.Log.w(r4, r3)
        L_0x026c:
            r5 = 0
        L_0x026d:
            if (r5 == 0) goto L_0x004f
            java.lang.String r3 = r5.f41229a
            r6 = r23
            r6.put(r3, r5)
            goto L_0x02a5
        L_0x0277:
            r6 = r23
            java.lang.String r3 = "metadata"
            boolean r5 = p513bj.C14051c0.m21657c(r0, r3)
            if (r5 == 0) goto L_0x02a5
        L_0x0281:
            r19.next()
            java.lang.String r5 = "image"
            boolean r5 = p513bj.C14051c0.m21657c(r0, r5)
            if (r5 == 0) goto L_0x029c
            java.lang.String r5 = p513bj.C14051c0.m21655a(r0, r4)
            if (r5 == 0) goto L_0x029c
            java.lang.String r7 = r19.nextText()
            r8 = r24
            r8.put(r5, r7)
            goto L_0x029e
        L_0x029c:
            r8 = r24
        L_0x029e:
            boolean r5 = p513bj.C14051c0.m21656b(r0, r3)
            if (r5 == 0) goto L_0x0281
            goto L_0x02a7
        L_0x02a5:
            r8 = r24
        L_0x02a7:
            java.lang.String r3 = "head"
            boolean r3 = p513bj.C14051c0.m21656b(r0, r3)
            if (r3 == 0) goto L_0x0006
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p694vi.C18646c.m31464n(org.xmlpull.v1.XmlPullParser, java.util.HashMap, vi.c$a, vi.c$c, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p694vi.C18650d m31465o(org.xmlpull.v1.XmlPullParser r19, p694vi.C18650d r20, java.util.HashMap r21, p694vi.C18646c.C18648b r22) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        /*
            r0 = r19
            r11 = r20
            r1 = r22
            int r2 = r19.getAttributeCount()
            r3 = 0
            vi.f r7 = m31466p(r0, r3)
            java.lang.String r8 = ""
            r10 = r3
            r9 = r8
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r10
            r3 = 0
        L_0x0024:
            if (r3 >= r2) goto L_0x00db
            java.lang.String r5 = r0.getAttributeName(r3)
            java.lang.String r6 = r0.getAttributeValue(r3)
            r5.getClass()
            int r18 = r5.hashCode()
            switch(r18) {
                case -934795532: goto L_0x0070;
                case 99841: goto L_0x0065;
                case 100571: goto L_0x005a;
                case 93616297: goto L_0x004f;
                case 109780401: goto L_0x0044;
                case 1292595405: goto L_0x0039;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x007b
        L_0x0039:
            java.lang.String r4 = "backgroundImage"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0042
            goto L_0x007b
        L_0x0042:
            r4 = 5
            goto L_0x007c
        L_0x0044:
            java.lang.String r4 = "style"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x004d
            goto L_0x007b
        L_0x004d:
            r4 = 4
            goto L_0x007c
        L_0x004f:
            java.lang.String r4 = "begin"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0058
            goto L_0x007b
        L_0x0058:
            r4 = 3
            goto L_0x007c
        L_0x005a:
            java.lang.String r4 = "end"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0063
            goto L_0x007b
        L_0x0063:
            r4 = 2
            goto L_0x007c
        L_0x0065:
            java.lang.String r4 = "dur"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x006e
            goto L_0x007b
        L_0x006e:
            r4 = 1
            goto L_0x007c
        L_0x0070:
            java.lang.String r4 = "region"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r4 = 0
            goto L_0x007c
        L_0x007b:
            r4 = -1
        L_0x007c:
            if (r4 == 0) goto L_0x00ce
            r5 = 1
            if (r4 == r5) goto L_0x00c5
            r5 = 2
            if (r4 == r5) goto L_0x00bf
            r5 = 3
            if (r4 == r5) goto L_0x00b9
            r5 = 4
            if (r4 == r5) goto L_0x009c
            r5 = 5
            if (r4 == r5) goto L_0x008e
            goto L_0x00cb
        L_0x008e:
            java.lang.String r4 = "#"
            boolean r4 = r6.startsWith(r4)
            if (r4 == 0) goto L_0x00cb
            r4 = 1
            java.lang.String r10 = r6.substring(r4)
            goto L_0x00cb
        L_0x009c:
            java.lang.String r4 = r6.trim()
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x00aa
            r5 = 0
            java.lang.String[] r4 = new java.lang.String[r5]
            goto L_0x00b4
        L_0x00aa:
            r5 = 0
            int r6 = p513bj.C14049b0.f30913a
            java.lang.String r6 = "\\s+"
            r5 = -1
            java.lang.String[] r4 = r4.split(r6, r5)
        L_0x00b4:
            int r5 = r4.length
            if (r5 <= 0) goto L_0x00cb
            r8 = r4
            goto L_0x00cb
        L_0x00b9:
            long r4 = m31467q(r6, r1)
            r12 = r4
            goto L_0x00cb
        L_0x00bf:
            long r4 = m31467q(r6, r1)
            r14 = r4
            goto L_0x00cb
        L_0x00c5:
            long r4 = m31467q(r6, r1)
            r16 = r4
        L_0x00cb:
            r4 = r21
            goto L_0x00d7
        L_0x00ce:
            r4 = r21
            boolean r5 = r4.containsKey(r6)
            if (r5 == 0) goto L_0x00d7
            r9 = r6
        L_0x00d7:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x00db:
            if (r11 == 0) goto L_0x00f3
            long r1 = r11.f41219d
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00f8
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00ed
            long r12 = r12 + r1
        L_0x00ed:
            int r5 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00f8
            long r14 = r14 + r1
            goto L_0x00f8
        L_0x00f3:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00f8:
            int r1 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x010f
            int r1 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0105
            long r16 = r12 + r16
            r5 = r16
            goto L_0x0110
        L_0x0105:
            if (r11 == 0) goto L_0x010f
            long r1 = r11.f41220e
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x010f
            r5 = r1
            goto L_0x0110
        L_0x010f:
            r5 = r14
        L_0x0110:
            java.lang.String r1 = r19.getName()
            vi.d r14 = new vi.d
            r2 = 0
            r0 = r14
            r3 = r12
            r11 = r20
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p694vi.C18646c.m31465o(org.xmlpull.v1.XmlPullParser, vi.d, java.util.HashMap, vi.c$b):vi.d");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01eb, code lost:
        if (r5.equals("auto") != false) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0423, code lost:
        if (r5.equals("linethrough") == false) goto L_0x041b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01c3  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p694vi.C18652f m31466p(org.xmlpull.v1.XmlPullParser r16, p694vi.C18652f r17) {
        /*
            r1 = r16
            int r2 = r16.getAttributeCount()
            r3 = 0
            r0 = r17
            r4 = r3
        L_0x000a:
            if (r4 >= r2) goto L_0x0488
            java.lang.String r5 = r1.getAttributeValue(r4)
            java.lang.String r6 = r1.getAttributeName(r4)
            r6.getClass()
            int r7 = r6.hashCode()
            r9 = 4
            r10 = 3
            r11 = -1
            r12 = 1
            r13 = 2
            switch(r7) {
                case -1550943582: goto L_0x00d6;
                case -1224696685: goto L_0x00cb;
                case -1065511464: goto L_0x00c0;
                case -879295043: goto L_0x00b5;
                case -734428249: goto L_0x00aa;
                case 3355: goto L_0x009f;
                case 3511770: goto L_0x0094;
                case 94842723: goto L_0x0087;
                case 109403361: goto L_0x0079;
                case 110138194: goto L_0x006b;
                case 365601008: goto L_0x005d;
                case 921125321: goto L_0x004f;
                case 1115953443: goto L_0x0041;
                case 1287124693: goto L_0x0033;
                case 1754920356: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x00e1
        L_0x0025:
            java.lang.String r7 = "multiRowAlign"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x002f
            goto L_0x00e1
        L_0x002f:
            r6 = 14
            goto L_0x00e2
        L_0x0033:
            java.lang.String r7 = "backgroundColor"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x003d
            goto L_0x00e1
        L_0x003d:
            r6 = 13
            goto L_0x00e2
        L_0x0041:
            java.lang.String r7 = "rubyPosition"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x004b
            goto L_0x00e1
        L_0x004b:
            r6 = 12
            goto L_0x00e2
        L_0x004f:
            java.lang.String r7 = "textEmphasis"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0059
            goto L_0x00e1
        L_0x0059:
            r6 = 11
            goto L_0x00e2
        L_0x005d:
            java.lang.String r7 = "fontSize"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0067
            goto L_0x00e1
        L_0x0067:
            r6 = 10
            goto L_0x00e2
        L_0x006b:
            java.lang.String r7 = "textCombine"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0075
            goto L_0x00e1
        L_0x0075:
            r6 = 9
            goto L_0x00e2
        L_0x0079:
            java.lang.String r7 = "shear"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0083
            goto L_0x00e1
        L_0x0083:
            r6 = 8
            goto L_0x00e2
        L_0x0087:
            java.lang.String r7 = "color"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0091
            goto L_0x00e1
        L_0x0091:
            r6 = 7
            goto L_0x00e2
        L_0x0094:
            java.lang.String r7 = "ruby"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x009d
            goto L_0x00e1
        L_0x009d:
            r6 = 6
            goto L_0x00e2
        L_0x009f:
            java.lang.String r7 = "id"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00a8
            goto L_0x00e1
        L_0x00a8:
            r6 = 5
            goto L_0x00e2
        L_0x00aa:
            java.lang.String r7 = "fontWeight"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00b3
            goto L_0x00e1
        L_0x00b3:
            r6 = r9
            goto L_0x00e2
        L_0x00b5:
            java.lang.String r7 = "textDecoration"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00be
            goto L_0x00e1
        L_0x00be:
            r6 = r10
            goto L_0x00e2
        L_0x00c0:
            java.lang.String r7 = "textAlign"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00c9
            goto L_0x00e1
        L_0x00c9:
            r6 = r13
            goto L_0x00e2
        L_0x00cb:
            java.lang.String r7 = "fontFamily"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00d4
            goto L_0x00e1
        L_0x00d4:
            r6 = r12
            goto L_0x00e2
        L_0x00d6:
            java.lang.String r7 = "fontStyle"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00df
            goto L_0x00e1
        L_0x00df:
            r6 = r3
            goto L_0x00e2
        L_0x00e1:
            r6 = r11
        L_0x00e2:
            java.lang.String r7 = "after"
            java.lang.String r14 = "before"
            java.lang.String r15 = "none"
            java.lang.String r8 = "TtmlDecoder"
            switch(r6) {
                case 0: goto L_0x0478;
                case 1: goto L_0x0471;
                case 2: goto L_0x0466;
                case 3: goto L_0x040c;
                case 4: goto L_0x03fe;
                case 5: goto L_0x03ea;
                case 6: goto L_0x0373;
                case 7: goto L_0x034a;
                case 8: goto L_0x02e5;
                case 9: goto L_0x02be;
                case 10: goto L_0x029a;
                case 11: goto L_0x0149;
                case 12: goto L_0x0124;
                case 13: goto L_0x00fb;
                case 14: goto L_0x00ef;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            goto L_0x0484
        L_0x00ef:
            vi.f r0 = m31458h(r0)
            android.text.Layout$Alignment r5 = m31460j(r5)
            r0.f41254p = r5
            goto L_0x0484
        L_0x00fb:
            vi.f r0 = m31458h(r0)
            int r6 = p513bj.C14048b.m21619a(r5, r3)     // Catch:{ IllegalArgumentException -> 0x0109 }
            r0.f41242d = r6     // Catch:{ IllegalArgumentException -> 0x0109 }
            r0.f41243e = r12     // Catch:{ IllegalArgumentException -> 0x0109 }
            goto L_0x0484
        L_0x0109:
            java.lang.String r6 = "Failed parsing background value: "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r7 = r5.length()
            if (r7 == 0) goto L_0x011a
            java.lang.String r5 = r6.concat(r5)
            goto L_0x011f
        L_0x011a:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
        L_0x011f:
            android.util.Log.w(r8, r5)
            goto L_0x0484
        L_0x0124:
            java.lang.String r5 = p001a0.C0005b.m56q0(r5)
            r5.getClass()
            boolean r6 = r5.equals(r14)
            if (r6 != 0) goto L_0x0141
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x0139
            goto L_0x0484
        L_0x0139:
            vi.f r0 = m31458h(r0)
            r0.f41252n = r13
            goto L_0x0484
        L_0x0141:
            vi.f r0 = m31458h(r0)
            r0.f41252n = r12
            goto L_0x0484
        L_0x0149:
            vi.f r0 = m31458h(r0)
            java.util.regex.Pattern r6 = p694vi.C18645b.f41192d
            r6 = 0
            if (r5 != 0) goto L_0x0154
            goto L_0x0296
        L_0x0154:
            java.lang.String r5 = r5.trim()
            java.lang.String r5 = p001a0.C0005b.m56q0(r5)
            boolean r8 = r5.isEmpty()
            if (r8 == 0) goto L_0x0164
            goto L_0x0296
        L_0x0164:
            java.util.regex.Pattern r6 = p694vi.C18645b.f41192d
            java.lang.String[] r5 = android.text.TextUtils.split(r5, r6)
            com.google.common.collect.ImmutableSet r5 = com.google.common.collect.ImmutableSet.copyOf((E[]) r5)
            com.google.common.collect.ImmutableSet<java.lang.String> r6 = p694vi.C18645b.f41196h
            com.google.common.collect.t1 r6 = com.google.common.collect.Sets.m26093c(r6, r5)
            com.google.common.collect.s1 r8 = new com.google.common.collect.s1
            r8.<init>(r6)
            java.lang.String r6 = "outside"
            java.lang.Object r8 = com.google.common.collect.Iterators.m25981d(r6, r8)
            java.lang.String r8 = (java.lang.String) r8
            int r9 = r8.hashCode()
            r13 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            if (r9 == r13) goto L_0x01a5
            r13 = -1106037339(0xffffffffbe1335a5, float:-0.14375933)
            if (r9 == r13) goto L_0x019d
            r6 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r9 == r6) goto L_0x0195
            goto L_0x01ad
        L_0x0195:
            boolean r6 = r8.equals(r7)
            if (r6 == 0) goto L_0x01ad
            r6 = r3
            goto L_0x01ae
        L_0x019d:
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x01ad
            r6 = r12
            goto L_0x01ae
        L_0x01a5:
            boolean r6 = r8.equals(r14)
            if (r6 == 0) goto L_0x01ad
            r6 = 2
            goto L_0x01ae
        L_0x01ad:
            r6 = r11
        L_0x01ae:
            if (r6 == 0) goto L_0x01b6
            if (r6 == r12) goto L_0x01b4
            r6 = r12
            goto L_0x01b7
        L_0x01b4:
            r6 = -2
            goto L_0x01b7
        L_0x01b6:
            r6 = 2
        L_0x01b7:
            com.google.common.collect.ImmutableSet<java.lang.String> r7 = p694vi.C18645b.f41193e
            com.google.common.collect.t1 r7 = com.google.common.collect.Sets.m26093c(r7, r5)
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L_0x01f9
            com.google.common.collect.s1 r5 = new com.google.common.collect.s1
            r5.<init>(r7)
            java.lang.Object r5 = r5.next()
            java.lang.String r5 = (java.lang.String) r5
            int r7 = r5.hashCode()
            r8 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r7 == r8) goto L_0x01e5
            r8 = 3387192(0x33af38, float:4.746467E-39)
            if (r7 == r8) goto L_0x01dd
            goto L_0x01ee
        L_0x01dd:
            boolean r5 = r5.equals(r15)
            if (r5 == 0) goto L_0x01ee
            r12 = r3
            goto L_0x01ef
        L_0x01e5:
            java.lang.String r7 = "auto"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x01ee
            goto L_0x01ef
        L_0x01ee:
            r12 = r11
        L_0x01ef:
            if (r12 == 0) goto L_0x01f2
            goto L_0x01f3
        L_0x01f2:
            r11 = r3
        L_0x01f3:
            vi.b r5 = new vi.b
            r5.<init>(r11, r3, r6)
            goto L_0x0216
        L_0x01f9:
            com.google.common.collect.ImmutableSet<java.lang.String> r7 = p694vi.C18645b.f41195g
            com.google.common.collect.t1 r7 = com.google.common.collect.Sets.m26093c(r7, r5)
            com.google.common.collect.ImmutableSet<java.lang.String> r8 = p694vi.C18645b.f41194f
            com.google.common.collect.t1 r5 = com.google.common.collect.Sets.m26093c(r8, r5)
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x0219
            boolean r8 = r5.isEmpty()
            if (r8 == 0) goto L_0x0219
            vi.b r5 = new vi.b
            r5.<init>(r11, r3, r6)
        L_0x0216:
            r6 = r5
            goto L_0x0296
        L_0x0219:
            com.google.common.collect.s1 r8 = new com.google.common.collect.s1
            r8.<init>(r7)
            java.lang.String r7 = "filled"
            java.lang.Object r8 = com.google.common.collect.Iterators.m25981d(r7, r8)
            java.lang.String r8 = (java.lang.String) r8
            int r9 = r8.hashCode()
            r13 = -1274499742(0xffffffffb408ad62, float:-1.2729063E-7)
            if (r9 == r13) goto L_0x023f
            r7 = 3417674(0x34264a, float:4.789181E-39)
            if (r9 == r7) goto L_0x0235
            goto L_0x0247
        L_0x0235:
            java.lang.String r7 = "open"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0247
            r7 = r3
            goto L_0x0248
        L_0x023f:
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0247
            r7 = r12
            goto L_0x0248
        L_0x0247:
            r7 = r11
        L_0x0248:
            if (r7 == 0) goto L_0x024c
            r7 = r12
            goto L_0x024d
        L_0x024c:
            r7 = 2
        L_0x024d:
            com.google.common.collect.s1 r8 = new com.google.common.collect.s1
            r8.<init>(r5)
            java.lang.String r5 = "circle"
            java.lang.Object r8 = com.google.common.collect.Iterators.m25981d(r5, r8)
            java.lang.String r8 = (java.lang.String) r8
            int r9 = r8.hashCode()
            r13 = -1360216880(0xffffffffaeecbcd0, float:-1.0765577E-10)
            if (r9 == r13) goto L_0x0282
            r5 = -905816648(0xffffffffca0255b8, float:-2135406.0)
            if (r9 == r5) goto L_0x0278
            r5 = 99657(0x18549, float:1.39649E-40)
            if (r9 == r5) goto L_0x026e
            goto L_0x0289
        L_0x026e:
            java.lang.String r5 = "dot"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0289
            r11 = r3
            goto L_0x0289
        L_0x0278:
            java.lang.String r5 = "sesame"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0289
            r11 = r12
            goto L_0x0289
        L_0x0282:
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0289
            r11 = 2
        L_0x0289:
            if (r11 == 0) goto L_0x028f
            if (r11 == r12) goto L_0x0290
            r10 = r12
            goto L_0x0290
        L_0x028f:
            r10 = 2
        L_0x0290:
            vi.b r5 = new vi.b
            r5.<init>(r10, r7, r6)
            goto L_0x0216
        L_0x0296:
            r0.f41256r = r6
            goto L_0x0484
        L_0x029a:
            vi.f r0 = m31458h(r0)     // Catch:{ SubtitleDecoderException -> 0x02a3 }
            m31462l(r5, r0)     // Catch:{ SubtitleDecoderException -> 0x02a3 }
            goto L_0x0484
        L_0x02a3:
            java.lang.String r6 = "Failed parsing fontSize value: "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r7 = r5.length()
            if (r7 == 0) goto L_0x02b4
            java.lang.String r5 = r6.concat(r5)
            goto L_0x02b9
        L_0x02b4:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
        L_0x02b9:
            android.util.Log.w(r8, r5)
            goto L_0x0484
        L_0x02be:
            java.lang.String r5 = p001a0.C0005b.m56q0(r5)
            r5.getClass()
            java.lang.String r6 = "all"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x02dd
            boolean r5 = r5.equals(r15)
            if (r5 != 0) goto L_0x02d5
            goto L_0x0484
        L_0x02d5:
            vi.f r0 = m31458h(r0)
            r0.f41255q = r3
            goto L_0x0484
        L_0x02dd:
            vi.f r0 = m31458h(r0)
            r0.f41255q = r12
            goto L_0x0484
        L_0x02e5:
            vi.f r6 = m31458h(r0)
            java.util.regex.Pattern r0 = f41203q
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r7 = r0.matches()
            r9 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r7 != 0) goto L_0x0313
            java.lang.String r0 = "Invalid value for shear: "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r7 = r5.length()
            if (r7 == 0) goto L_0x0309
            java.lang.String r0 = r0.concat(r5)
            goto L_0x030f
        L_0x0309:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0)
            r0 = r5
        L_0x030f:
            android.util.Log.w(r8, r0)
            goto L_0x0345
        L_0x0313:
            java.lang.String r0 = r0.group(r12)     // Catch:{ NumberFormatException -> 0x032b }
            r0.getClass()     // Catch:{ NumberFormatException -> 0x032b }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x032b }
            r7 = -1027080192(0xffffffffc2c80000, float:-100.0)
            float r0 = java.lang.Math.max(r7, r0)     // Catch:{ NumberFormatException -> 0x032b }
            r7 = 1120403456(0x42c80000, float:100.0)
            float r9 = java.lang.Math.min(r7, r0)     // Catch:{ NumberFormatException -> 0x032b }
            goto L_0x0345
        L_0x032b:
            r0 = move-exception
            java.lang.String r7 = "Failed to parse shear: "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r10 = r5.length()
            if (r10 == 0) goto L_0x033d
            java.lang.String r5 = r7.concat(r5)
            goto L_0x0342
        L_0x033d:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r7)
        L_0x0342:
            p513bj.C14075p.m21700l(r8, r5, r0)
        L_0x0345:
            r6.f41257s = r9
            r0 = r6
            goto L_0x0484
        L_0x034a:
            vi.f r0 = m31458h(r0)
            int r6 = p513bj.C14048b.m21619a(r5, r3)     // Catch:{ IllegalArgumentException -> 0x0358 }
            r0.f41240b = r6     // Catch:{ IllegalArgumentException -> 0x0358 }
            r0.f41241c = r12     // Catch:{ IllegalArgumentException -> 0x0358 }
            goto L_0x0484
        L_0x0358:
            java.lang.String r6 = "Failed parsing color value: "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r7 = r5.length()
            if (r7 == 0) goto L_0x0369
            java.lang.String r5 = r6.concat(r5)
            goto L_0x036e
        L_0x0369:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
        L_0x036e:
            android.util.Log.w(r8, r5)
            goto L_0x0484
        L_0x0373:
            java.lang.String r5 = p001a0.C0005b.m56q0(r5)
            r5.getClass()
            int r6 = r5.hashCode()
            switch(r6) {
                case -618561360: goto L_0x03ba;
                case -410956671: goto L_0x03af;
                case -250518009: goto L_0x03a4;
                case -136074796: goto L_0x0399;
                case 3016401: goto L_0x038e;
                case 3556653: goto L_0x0383;
                default: goto L_0x0381;
            }
        L_0x0381:
            r8 = r11
            goto L_0x03c4
        L_0x0383:
            java.lang.String r6 = "text"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x038c
            goto L_0x0381
        L_0x038c:
            r8 = 5
            goto L_0x03c4
        L_0x038e:
            java.lang.String r6 = "base"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0397
            goto L_0x0381
        L_0x0397:
            r8 = r9
            goto L_0x03c4
        L_0x0399:
            java.lang.String r6 = "textContainer"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x03a2
            goto L_0x0381
        L_0x03a2:
            r8 = r10
            goto L_0x03c4
        L_0x03a4:
            java.lang.String r6 = "delimiter"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x03ad
            goto L_0x0381
        L_0x03ad:
            r8 = 2
            goto L_0x03c4
        L_0x03af:
            java.lang.String r6 = "container"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x03b8
            goto L_0x0381
        L_0x03b8:
            r8 = r12
            goto L_0x03c4
        L_0x03ba:
            java.lang.String r6 = "baseContainer"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x03c3
            goto L_0x0381
        L_0x03c3:
            r8 = r3
        L_0x03c4:
            switch(r8) {
                case 0: goto L_0x03e1;
                case 1: goto L_0x03d9;
                case 2: goto L_0x03d1;
                case 3: goto L_0x03c9;
                case 4: goto L_0x03e1;
                case 5: goto L_0x03c9;
                default: goto L_0x03c7;
            }
        L_0x03c7:
            goto L_0x0484
        L_0x03c9:
            vi.f r0 = m31458h(r0)
            r0.f41251m = r10
            goto L_0x0484
        L_0x03d1:
            vi.f r0 = m31458h(r0)
            r0.f41251m = r9
            goto L_0x0484
        L_0x03d9:
            vi.f r0 = m31458h(r0)
            r0.f41251m = r12
            goto L_0x0484
        L_0x03e1:
            vi.f r0 = m31458h(r0)
            r6 = 2
            r0.f41251m = r6
            goto L_0x0484
        L_0x03ea:
            java.lang.String r6 = r16.getName()
            java.lang.String r7 = "style"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0484
            vi.f r0 = m31458h(r0)
            r0.f41250l = r5
            goto L_0x0484
        L_0x03fe:
            vi.f r0 = m31458h(r0)
            java.lang.String r6 = "bold"
            boolean r5 = r6.equalsIgnoreCase(r5)
            r0.f41246h = r5
            goto L_0x0484
        L_0x040c:
            r6 = r13
            java.lang.String r5 = p001a0.C0005b.m56q0(r5)
            r5.getClass()
            int r7 = r5.hashCode()
            switch(r7) {
                case -1461280213: goto L_0x043c;
                case -1026963764: goto L_0x0431;
                case 913457136: goto L_0x0426;
                case 1679736913: goto L_0x041d;
                default: goto L_0x041b;
            }
        L_0x041b:
            r10 = r11
            goto L_0x0446
        L_0x041d:
            java.lang.String r6 = "linethrough"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0446
            goto L_0x041b
        L_0x0426:
            java.lang.String r7 = "nolinethrough"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x042f
            goto L_0x041b
        L_0x042f:
            r10 = r6
            goto L_0x0446
        L_0x0431:
            java.lang.String r6 = "underline"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x043a
            goto L_0x041b
        L_0x043a:
            r10 = r12
            goto L_0x0446
        L_0x043c:
            java.lang.String r6 = "nounderline"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0445
            goto L_0x041b
        L_0x0445:
            r10 = r3
        L_0x0446:
            switch(r10) {
                case 0: goto L_0x045f;
                case 1: goto L_0x0458;
                case 2: goto L_0x0451;
                case 3: goto L_0x044a;
                default: goto L_0x0449;
            }
        L_0x0449:
            goto L_0x0484
        L_0x044a:
            vi.f r0 = m31458h(r0)
            r0.f41244f = r12
            goto L_0x0484
        L_0x0451:
            vi.f r0 = m31458h(r0)
            r0.f41244f = r3
            goto L_0x0484
        L_0x0458:
            vi.f r0 = m31458h(r0)
            r0.f41245g = r12
            goto L_0x0484
        L_0x045f:
            vi.f r0 = m31458h(r0)
            r0.f41245g = r3
            goto L_0x0484
        L_0x0466:
            vi.f r0 = m31458h(r0)
            android.text.Layout$Alignment r5 = m31460j(r5)
            r0.f41253o = r5
            goto L_0x0484
        L_0x0471:
            vi.f r0 = m31458h(r0)
            r0.f41239a = r5
            goto L_0x0484
        L_0x0478:
            vi.f r0 = m31458h(r0)
            java.lang.String r6 = "italic"
            boolean r5 = r6.equalsIgnoreCase(r5)
            r0.f41247i = r5
        L_0x0484:
            int r4 = r4 + 1
            goto L_0x000a
        L_0x0488:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p694vi.C18646c.m31466p(org.xmlpull.v1.XmlPullParser, vi.f):vi.f");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00aa, code lost:
        if (r13.equals("ms") == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e1, code lost:
        r8 = r8 / r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ef, code lost:
        r8 = r8 * r13;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m31467q(java.lang.String r13, p694vi.C18646c.C18648b r14) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        /*
            java.util.regex.Pattern r0 = f41200n
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L_0x007c
            java.lang.String r13 = r0.group(r7)
            r13.getClass()
            long r7 = java.lang.Long.parseLong(r13)
            r9 = 3600(0xe10, double:1.7786E-320)
            long r7 = r7 * r9
            double r7 = (double) r7
            java.lang.String r13 = r0.group(r6)
            r13.getClass()
            long r9 = java.lang.Long.parseLong(r13)
            r11 = 60
            long r9 = r9 * r11
            double r9 = (double) r9
            double r7 = r7 + r9
            java.lang.String r13 = r0.group(r5)
            r13.getClass()
            long r5 = java.lang.Long.parseLong(r13)
            double r5 = (double) r5
            double r7 = r7 + r5
            java.lang.String r13 = r0.group(r4)
            r4 = 0
            if (r13 == 0) goto L_0x004e
            double r9 = java.lang.Double.parseDouble(r13)
            goto L_0x004f
        L_0x004e:
            r9 = r4
        L_0x004f:
            double r7 = r7 + r9
            r13 = 5
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L_0x0061
            long r9 = java.lang.Long.parseLong(r13)
            float r13 = (float) r9
            float r1 = r14.f41211a
            float r13 = r13 / r1
            double r9 = (double) r13
            goto L_0x0062
        L_0x0061:
            r9 = r4
        L_0x0062:
            double r7 = r7 + r9
            r13 = 6
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L_0x0078
            long r0 = java.lang.Long.parseLong(r13)
            double r0 = (double) r0
            int r13 = r14.f41212b
            double r4 = (double) r13
            double r0 = r0 / r4
            float r13 = r14.f41211a
            double r13 = (double) r13
            double r4 = r0 / r13
        L_0x0078:
            double r7 = r7 + r4
            double r7 = r7 * r2
            long r13 = (long) r7
            return r13
        L_0x007c:
            java.util.regex.Pattern r0 = f41201o
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L_0x00f8
            java.lang.String r13 = r0.group(r7)
            r13.getClass()
            double r8 = java.lang.Double.parseDouble(r13)
            java.lang.String r13 = r0.group(r6)
            r13.getClass()
            r0 = -1
            int r1 = r13.hashCode()
            switch(r1) {
                case 102: goto L_0x00ce;
                case 104: goto L_0x00c3;
                case 109: goto L_0x00b8;
                case 116: goto L_0x00ad;
                case 3494: goto L_0x00a4;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            r4 = r0
            goto L_0x00d8
        L_0x00a4:
            java.lang.String r1 = "ms"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00d8
            goto L_0x00a2
        L_0x00ad:
            java.lang.String r1 = "t"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00b6
            goto L_0x00a2
        L_0x00b6:
            r4 = r5
            goto L_0x00d8
        L_0x00b8:
            java.lang.String r1 = "m"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00c1
            goto L_0x00a2
        L_0x00c1:
            r4 = r6
            goto L_0x00d8
        L_0x00c3:
            java.lang.String r1 = "h"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00cc
            goto L_0x00a2
        L_0x00cc:
            r4 = r7
            goto L_0x00d8
        L_0x00ce:
            java.lang.String r1 = "f"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00d7
            goto L_0x00a2
        L_0x00d7:
            r4 = 0
        L_0x00d8:
            switch(r4) {
                case 0: goto L_0x00f1;
                case 1: goto L_0x00ea;
                case 2: goto L_0x00e7;
                case 3: goto L_0x00e3;
                case 4: goto L_0x00dc;
                default: goto L_0x00db;
            }
        L_0x00db:
            goto L_0x00f5
        L_0x00dc:
            r13 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x00e1:
            double r8 = r8 / r13
            goto L_0x00f5
        L_0x00e3:
            int r13 = r14.f41213c
            double r13 = (double) r13
            goto L_0x00e1
        L_0x00e7:
            r13 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x00ef
        L_0x00ea:
            r13 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x00ef:
            double r8 = r8 * r13
            goto L_0x00f5
        L_0x00f1:
            float r13 = r14.f41211a
            double r13 = (double) r13
            goto L_0x00e1
        L_0x00f5:
            double r8 = r8 * r2
            long r13 = (long) r8
            return r13
        L_0x00f8:
            com.google.android.exoplayer2.text.SubtitleDecoderException r14 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r0 = "Malformed time expression: "
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r1 = r13.length()
            if (r1 == 0) goto L_0x010b
            java.lang.String r13 = r0.concat(r13)
            goto L_0x0110
        L_0x010b:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r0)
        L_0x0110:
            r14.<init>((java.lang.String) r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p694vi.C18646c.m31467q(java.lang.String, vi.c$b):long");
    }

    /* renamed from: r */
    public static C18649c m31468r(XmlPullParser xmlPullParser) {
        String a = C14051c0.m21655a(xmlPullParser, "extent");
        if (a == null) {
            return null;
        }
        Matcher matcher = f41205s.matcher(a);
        if (!matcher.matches()) {
            Log.w("TtmlDecoder", a.length() != 0 ? "Ignoring non-pixel tts extent: ".concat(a) : new String("Ignoring non-pixel tts extent: "));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new C18649c(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            Log.w("TtmlDecoder", a.length() != 0 ? "Ignoring malformed tts extent: ".concat(a) : new String("Ignoring malformed tts extent: "));
            return null;
        }
    }

    /* renamed from: g */
    public final C18300d mo69840g(int i, boolean z, byte[] bArr) throws SubtitleDecoderException {
        C18648b bVar;
        try {
            XmlPullParser newPullParser = this.f41209m.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new C18651e("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C18649c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), (String) null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C18648b bVar2 = f41207u;
            C18647a aVar = f41208v;
            int i2 = 0;
            C18653g gVar = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C18650d dVar = (C18650d) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = m31463m(newPullParser);
                            aVar = m31461k(newPullParser, f41208v);
                            cVar = m31468r(newPullParser);
                        }
                        C18649c cVar2 = cVar;
                        C18648b bVar3 = bVar2;
                        C18647a aVar2 = aVar;
                        if (!m31459i(name)) {
                            String valueOf = String.valueOf(newPullParser.getName());
                            Log.i("TtmlDecoder", valueOf.length() != 0 ? "Ignoring unsupported tag: ".concat(valueOf) : new String("Ignoring unsupported tag: "));
                            i2++;
                            bVar = bVar3;
                        } else if ("head".equals(name)) {
                            bVar = bVar3;
                            m31464n(newPullParser, hashMap, aVar2, cVar2, hashMap2, hashMap3);
                        } else {
                            bVar = bVar3;
                            try {
                                C18650d o = m31465o(newPullParser, dVar, hashMap2, bVar);
                                arrayDeque.push(o);
                                if (dVar != null) {
                                    if (dVar.f41228m == null) {
                                        dVar.f41228m = new ArrayList();
                                    }
                                    dVar.f41228m.add(o);
                                }
                            } catch (SubtitleDecoderException e) {
                                C14075p.m21700l("TtmlDecoder", "Suppressing parser error", e);
                                i2++;
                            }
                        }
                        bVar2 = bVar;
                        cVar = cVar2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        dVar.getClass();
                        C18650d a = C18650d.m31470a(newPullParser.getText());
                        if (dVar.f41228m == null) {
                            dVar.f41228m = new ArrayList();
                        }
                        dVar.f41228m.add(a);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            C18650d dVar2 = (C18650d) arrayDeque.peek();
                            dVar2.getClass();
                            gVar = new C18653g(dVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                newPullParser.next();
            }
            if (gVar != null) {
                return gVar;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (XmlPullParserException e2) {
            throw new SubtitleDecoderException("Unable to decode source", e2);
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        }
    }
}
