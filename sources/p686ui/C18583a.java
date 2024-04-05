package p686ui;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p636oi.C18298b;

/* renamed from: ui.a */
public final class C18583a extends C18298b {

    /* renamed from: o */
    public static final Pattern f41032o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: p */
    public static final Pattern f41033p = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: m */
    public final StringBuilder f41034m = new StringBuilder();

    /* renamed from: n */
    public final ArrayList<String> f41035n = new ArrayList<>();

    /* renamed from: h */
    public static long m31343h(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0;
        String group2 = matcher.group(i + 2);
        group2.getClass();
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + (Long.parseLong(group2) * 60 * 1000) + parseLong;
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0239  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p636oi.C18300d mo69840g(int r23, boolean r24, byte[] r25) {
        /*
            r22 = this;
            r0 = r22
            java.lang.String r1 = "SubripDecoder"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 32
            long[] r3 = new long[r3]
            bj.r r4 = new bj.r
            r5 = r23
            r6 = r25
            r4.<init>(r5, r6)
            r5 = 0
            r6 = r5
        L_0x0018:
            java.lang.String r7 = r4.mo46913d()
            if (r7 == 0) goto L_0x0288
            int r8 = r7.length()
            if (r8 != 0) goto L_0x0025
            goto L_0x0018
        L_0x0025:
            java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0269 }
            java.lang.String r7 = r4.mo46913d()
            if (r7 != 0) goto L_0x0035
            java.lang.String r4 = "Unexpected end"
            android.util.Log.w(r1, r4)
            goto L_0x0288
        L_0x0035:
            java.util.regex.Pattern r8 = f41032o
            java.util.regex.Matcher r8 = r8.matcher(r7)
            boolean r9 = r8.matches()
            if (r9 == 0) goto L_0x0250
            r7 = 1
            long r9 = m31343h(r8, r7)
            int r11 = r3.length
            if (r6 != r11) goto L_0x004f
            int r11 = r6 * 2
            long[] r3 = java.util.Arrays.copyOf(r3, r11)
        L_0x004f:
            int r11 = r6 + 1
            r3[r6] = r9
            r6 = 6
            long r8 = m31343h(r8, r6)
            int r10 = r3.length
            if (r11 != r10) goto L_0x0061
            int r10 = r11 * 2
            long[] r3 = java.util.Arrays.copyOf(r3, r10)
        L_0x0061:
            int r10 = r11 + 1
            r3[r11] = r8
            java.lang.StringBuilder r8 = r0.f41034m
            r8.setLength(r5)
            java.util.ArrayList<java.lang.String> r8 = r0.f41035n
            r8.clear()
            java.lang.String r8 = r4.mo46913d()
        L_0x0073:
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x00cb
            java.lang.StringBuilder r9 = r0.f41034m
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x0088
            java.lang.StringBuilder r9 = r0.f41034m
            java.lang.String r11 = "<br>"
            r9.append(r11)
        L_0x0088:
            java.lang.StringBuilder r9 = r0.f41034m
            java.util.ArrayList<java.lang.String> r11 = r0.f41035n
            java.lang.String r8 = r8.trim()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r8)
            java.util.regex.Pattern r13 = f41033p
            java.util.regex.Matcher r8 = r13.matcher(r8)
            r13 = r5
        L_0x009c:
            boolean r14 = r8.find()
            if (r14 == 0) goto L_0x00bd
            java.lang.String r14 = r8.group()
            r11.add(r14)
            int r15 = r8.start()
            int r15 = r15 - r13
            int r14 = r14.length()
            int r6 = r15 + r14
            java.lang.String r5 = ""
            r12.replace(r15, r6, r5)
            int r13 = r13 + r14
            r5 = 0
            r6 = 6
            goto L_0x009c
        L_0x00bd:
            java.lang.String r5 = r12.toString()
            r9.append(r5)
            java.lang.String r8 = r4.mo46913d()
            r5 = 0
            r6 = 6
            goto L_0x0073
        L_0x00cb:
            java.lang.StringBuilder r5 = r0.f41034m
            java.lang.String r5 = r5.toString()
            android.text.Spanned r5 = android.text.Html.fromHtml(r5)
            r6 = 0
            r8 = 0
        L_0x00d7:
            java.util.ArrayList<java.lang.String> r9 = r0.f41035n
            int r9 = r9.size()
            if (r8 >= r9) goto L_0x00f4
            java.util.ArrayList<java.lang.String> r9 = r0.f41035n
            java.lang.Object r9 = r9.get(r8)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r11 = "\\{\\\\an[1-9]\\}"
            boolean r11 = r9.matches(r11)
            if (r11 == 0) goto L_0x00f1
            r6 = r9
            goto L_0x00f4
        L_0x00f1:
            int r8 = r8 + 1
            goto L_0x00d7
        L_0x00f4:
            oi.a$a r8 = new oi.a$a
            r8.<init>()
            r8.f40164a = r5
            if (r6 != 0) goto L_0x0109
            oi.a r5 = r8.mo69838a()
            r16 = r3
            r20 = r4
            r21 = r10
            goto L_0x0243
        L_0x0109:
            int r5 = r6.hashCode()
            java.lang.String r9 = "{\\an9}"
            java.lang.String r11 = "{\\an8}"
            java.lang.String r12 = "{\\an7}"
            java.lang.String r13 = "{\\an6}"
            java.lang.String r14 = "{\\an5}"
            java.lang.String r15 = "{\\an4}"
            java.lang.String r7 = "{\\an3}"
            java.lang.String r0 = "{\\an2}"
            r16 = r3
            java.lang.String r3 = "{\\an1}"
            r17 = 8
            r18 = 7
            r19 = -1
            r20 = r4
            r4 = 2
            switch(r5) {
                case -685620710: goto L_0x0170;
                case -685620679: goto L_0x0168;
                case -685620648: goto L_0x0160;
                case -685620617: goto L_0x0158;
                case -685620586: goto L_0x014f;
                case -685620555: goto L_0x0147;
                case -685620524: goto L_0x013f;
                case -685620493: goto L_0x0136;
                case -685620462: goto L_0x012e;
                default: goto L_0x012d;
            }
        L_0x012d:
            goto L_0x0178
        L_0x012e:
            boolean r5 = r6.equals(r9)
            if (r5 == 0) goto L_0x0178
            r5 = 5
            goto L_0x017a
        L_0x0136:
            boolean r5 = r6.equals(r11)
            if (r5 == 0) goto L_0x0178
            r5 = r17
            goto L_0x017a
        L_0x013f:
            boolean r5 = r6.equals(r12)
            if (r5 == 0) goto L_0x0178
            r5 = r4
            goto L_0x017a
        L_0x0147:
            boolean r5 = r6.equals(r13)
            if (r5 == 0) goto L_0x0178
            r5 = 4
            goto L_0x017a
        L_0x014f:
            boolean r5 = r6.equals(r14)
            if (r5 == 0) goto L_0x0178
            r5 = r18
            goto L_0x017a
        L_0x0158:
            boolean r5 = r6.equals(r15)
            if (r5 == 0) goto L_0x0178
            r5 = 1
            goto L_0x017a
        L_0x0160:
            boolean r5 = r6.equals(r7)
            if (r5 == 0) goto L_0x0178
            r5 = 3
            goto L_0x017a
        L_0x0168:
            boolean r5 = r6.equals(r0)
            if (r5 == 0) goto L_0x0178
            r5 = 6
            goto L_0x017a
        L_0x0170:
            boolean r5 = r6.equals(r3)
            if (r5 == 0) goto L_0x0178
            r5 = 0
            goto L_0x017a
        L_0x0178:
            r5 = r19
        L_0x017a:
            r21 = r10
            if (r5 == 0) goto L_0x0193
            r10 = 1
            if (r5 == r10) goto L_0x0193
            if (r5 == r4) goto L_0x0193
            r4 = 3
            if (r5 == r4) goto L_0x018f
            r4 = 4
            if (r5 == r4) goto L_0x018f
            r4 = 5
            if (r5 == r4) goto L_0x018f
            r8.f40172i = r10
            goto L_0x0196
        L_0x018f:
            r4 = 2
            r8.f40172i = r4
            goto L_0x0196
        L_0x0193:
            r4 = 0
            r8.f40172i = r4
        L_0x0196:
            int r4 = r6.hashCode()
            switch(r4) {
                case -685620710: goto L_0x01e0;
                case -685620679: goto L_0x01d8;
                case -685620648: goto L_0x01d0;
                case -685620617: goto L_0x01c8;
                case -685620586: goto L_0x01bf;
                case -685620555: goto L_0x01b6;
                case -685620524: goto L_0x01ae;
                case -685620493: goto L_0x01a6;
                case -685620462: goto L_0x019e;
                default: goto L_0x019d;
            }
        L_0x019d:
            goto L_0x01e8
        L_0x019e:
            boolean r0 = r6.equals(r9)
            if (r0 == 0) goto L_0x01e8
            r6 = 5
            goto L_0x01ea
        L_0x01a6:
            boolean r0 = r6.equals(r11)
            if (r0 == 0) goto L_0x01e8
            r6 = 4
            goto L_0x01ea
        L_0x01ae:
            boolean r0 = r6.equals(r12)
            if (r0 == 0) goto L_0x01e8
            r6 = 3
            goto L_0x01ea
        L_0x01b6:
            boolean r0 = r6.equals(r13)
            if (r0 == 0) goto L_0x01e8
            r6 = r17
            goto L_0x01ea
        L_0x01bf:
            boolean r0 = r6.equals(r14)
            if (r0 == 0) goto L_0x01e8
            r6 = r18
            goto L_0x01ea
        L_0x01c8:
            boolean r0 = r6.equals(r15)
            if (r0 == 0) goto L_0x01e8
            r6 = 6
            goto L_0x01ea
        L_0x01d0:
            boolean r0 = r6.equals(r7)
            if (r0 == 0) goto L_0x01e8
            r6 = 2
            goto L_0x01ea
        L_0x01d8:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x01e8
            r6 = 1
            goto L_0x01ea
        L_0x01e0:
            boolean r0 = r6.equals(r3)
            if (r0 == 0) goto L_0x01e8
            r6 = 0
            goto L_0x01ea
        L_0x01e8:
            r6 = r19
        L_0x01ea:
            if (r6 == 0) goto L_0x0205
            r0 = 1
            if (r6 == r0) goto L_0x0205
            r3 = 2
            if (r6 == r3) goto L_0x0203
            r3 = 3
            if (r6 == r3) goto L_0x01fe
            r3 = 4
            if (r6 == r3) goto L_0x01fe
            r3 = 5
            if (r6 == r3) goto L_0x01fe
            r8.f40170g = r0
            goto L_0x0201
        L_0x01fe:
            r0 = 0
            r8.f40170g = r0
        L_0x0201:
            r0 = 2
            goto L_0x0208
        L_0x0203:
            r0 = r3
            goto L_0x0206
        L_0x0205:
            r0 = 2
        L_0x0206:
            r8.f40170g = r0
        L_0x0208:
            int r3 = r8.f40172i
            r4 = 1064011039(0x3f6b851f, float:0.92)
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 1034147594(0x3da3d70a, float:0.08)
            if (r3 == 0) goto L_0x0223
            r7 = 1
            if (r3 == r7) goto L_0x0221
            if (r3 != r0) goto L_0x021b
            r0 = r4
            goto L_0x0224
        L_0x021b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0221:
            r0 = r5
            goto L_0x0224
        L_0x0223:
            r0 = r6
        L_0x0224:
            r8.f40171h = r0
            int r0 = r8.f40170g
            if (r0 == 0) goto L_0x0239
            r3 = 1
            if (r0 == r3) goto L_0x0237
            r3 = 2
            if (r0 != r3) goto L_0x0231
            goto L_0x023a
        L_0x0231:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0237:
            r4 = r5
            goto L_0x023a
        L_0x0239:
            r4 = r6
        L_0x023a:
            r8.f40168e = r4
            r0 = 0
            r8.f40169f = r0
            oi.a r5 = r8.mo69838a()
        L_0x0243:
            r2.add(r5)
            oi.a r0 = p636oi.C18296a.f40146r
            r2.add(r0)
            r3 = r16
            r6 = r21
            goto L_0x0281
        L_0x0250:
            r20 = r4
            java.lang.String r0 = "Skipping invalid timing: "
            int r4 = r7.length()
            if (r4 == 0) goto L_0x025f
            java.lang.String r0 = r0.concat(r7)
            goto L_0x0265
        L_0x025f:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
            r0 = r4
        L_0x0265:
            android.util.Log.w(r1, r0)
            goto L_0x0281
        L_0x0269:
            r20 = r4
            java.lang.String r0 = "Skipping invalid index: "
            int r4 = r7.length()
            if (r4 == 0) goto L_0x0278
            java.lang.String r0 = r0.concat(r7)
            goto L_0x027e
        L_0x0278:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
            r0 = r4
        L_0x027e:
            android.util.Log.w(r1, r0)
        L_0x0281:
            r0 = r22
            r4 = r20
            r5 = 0
            goto L_0x0018
        L_0x0288:
            r0 = r5
            oi.a[] r0 = new p636oi.C18296a[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            oi.a[] r0 = (p636oi.C18296a[]) r0
            long[] r1 = java.util.Arrays.copyOf(r3, r6)
            ui.b r2 = new ui.b
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p686ui.C18583a.mo69840g(int, boolean, byte[]):oi.d");
    }
}
