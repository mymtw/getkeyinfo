package p678ti;

import com.google.common.base.C15781b;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p513bj.C14049b0;
import p513bj.C14075p;
import p513bj.C14077r;
import p636oi.C18298b;

/* renamed from: ti.a */
public final class C18551a extends C18298b {

    /* renamed from: r */
    public static final Pattern f40833r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: m */
    public final boolean f40834m;

    /* renamed from: n */
    public final C18552b f40835n;

    /* renamed from: o */
    public LinkedHashMap f40836o;

    /* renamed from: p */
    public float f40837p = -3.4028235E38f;

    /* renamed from: q */
    public float f40838q = -3.4028235E38f;

    public C18551a(List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            this.f40834m = false;
            this.f40835n = null;
            return;
        }
        this.f40834m = true;
        int i = C14049b0.f30913a;
        String str = new String(list.get(0), C15781b.f35562c);
        C14075p.m21691c(str.startsWith("Format:"));
        C18552b a = C18552b.m31308a(str);
        a.getClass();
        this.f40835n = a;
        mo70065i(new C14077r(list.get(1)));
    }

    /* renamed from: h */
    public static int m31304h(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        ArrayList arrayList3;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() != j) {
                    if (((Long) arrayList.get(size)).longValue() < j) {
                        i = size + 1;
                        break;
                    }
                } else {
                    return size;
                }
            } else {
                i = 0;
                break;
            }
        }
        arrayList.add(i, Long.valueOf(j));
        if (i != 0) {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i - 1));
        }
        arrayList2.add(i, arrayList3);
        return i;
    }

    /* renamed from: j */
    public static long m31305j(String str) {
        Matcher matcher = f40833r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i = C14049b0.f30913a;
        long parseLong = (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(group) * 60 * 60 * 1000000);
        return (Long.parseLong(matcher.group(4)) * NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION) + (Long.parseLong(matcher.group(3)) * 1000000) + parseLong;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:51|52|53|(1:55)|56|57|(1:59)(1:60)|61|(2:63|156)(1:157)|64) */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0219, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x021a, code lost:
        r3.f40166c = r5;
        r5 = Integer.MIN_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x021e, code lost:
        switch(r10) {
            case -1: goto L_0x022b;
            case 0: goto L_0x0221;
            case 1: goto L_0x0226;
            case 2: goto L_0x0224;
            case 3: goto L_0x0222;
            case 4: goto L_0x0226;
            case 5: goto L_0x0224;
            case 6: goto L_0x0222;
            case 7: goto L_0x0226;
            case 8: goto L_0x0224;
            case 9: goto L_0x0222;
            default: goto L_0x0221;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0222, code lost:
        r13 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0224, code lost:
        r13 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0226, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0228, code lost:
        p003a2.C0023f.m112m(30, "Unknown alignment: ", r10, "SsaDecoder");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x022b, code lost:
        r13 = Integer.MIN_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x022c, code lost:
        r3.f40172i = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x022e, code lost:
        switch(r10) {
            case -1: goto L_0x023b;
            case 0: goto L_0x0231;
            case 1: goto L_0x0236;
            case 2: goto L_0x0236;
            case 3: goto L_0x0236;
            case 4: goto L_0x0234;
            case 5: goto L_0x0234;
            case 6: goto L_0x0234;
            case 7: goto L_0x0232;
            case 8: goto L_0x0232;
            case 9: goto L_0x0232;
            default: goto L_0x0231;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0232, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0234, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0236, code lost:
        r5 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0238, code lost:
        p003a2.C0023f.m112m(30, "Unknown alignment: ", r10, "SsaDecoder");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x023b, code lost:
        r3.f40170g = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x023d, code lost:
        if (r12 == null) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0241, code lost:
        if (r11 == -3.4028235E38f) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0245, code lost:
        if (r6 == -3.4028235E38f) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0247, code lost:
        r3.f40171h = r12.x / r6;
        r3.f40168e = r12.y / r11;
        r3.f40169f = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0255, code lost:
        r0 = r3.f40172i;
        r4 = 0.95f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0261, code lost:
        if (r0 == 0) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0263, code lost:
        if (r0 == 1) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0265, code lost:
        if (r0 == 2) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0267, code lost:
        r0 = -3.4028235E38f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x026a, code lost:
        r0 = 0.95f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x026c, code lost:
        r0 = 0.5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x026e, code lost:
        r0 = 0.05f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x026f, code lost:
        r3.f40171h = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0271, code lost:
        if (r5 == 0) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0273, code lost:
        if (r5 == 1) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0275, code lost:
        if (r5 == 2) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0277, code lost:
        r4 = -3.4028235E38f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x027a, code lost:
        r4 = 0.5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x027c, code lost:
        r4 = 0.05f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x027d, code lost:
        r3.f40168e = r4;
        r3.f40169f = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0282, code lost:
        r0 = r3.mo69838a();
        r3 = m31304h(r8, r2, r1);
        r4 = m31304h(r17, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0290, code lost:
        if (r3 >= r4) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0292, code lost:
        ((java.util.List) r1.get(r3)).add(r0);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x010d */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x012b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0119 A[Catch:{ RuntimeException -> 0x012b }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012a  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p636oi.C18300d mo69840g(int r20, boolean r21, byte[] r22) {
        /*
            r19 = this;
            r0 = r19
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            bj.r r3 = new bj.r
            r4 = r20
            r5 = r22
            r3.<init>(r4, r5)
            boolean r4 = r0.f40834m
            if (r4 != 0) goto L_0x001c
            r0.mo70065i(r3)
        L_0x001c:
            boolean r4 = r0.f40834m
            if (r4 == 0) goto L_0x0023
            ti.b r4 = r0.f40835n
            goto L_0x0024
        L_0x0023:
            r4 = 0
        L_0x0024:
            java.lang.String r5 = r3.mo46913d()
            if (r5 == 0) goto L_0x02aa
            java.lang.String r6 = "Format:"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L_0x0037
            ti.b r4 = p678ti.C18552b.m31308a(r5)
            goto L_0x0024
        L_0x0037:
            java.lang.String r6 = "Dialogue:"
            boolean r7 = r5.startsWith(r6)
            if (r7 == 0) goto L_0x029e
            java.lang.String r7 = "SsaDecoder"
            if (r4 != 0) goto L_0x005a
            java.lang.String r6 = "Skipping dialogue line before complete format: "
            int r8 = r5.length()
            if (r8 == 0) goto L_0x0050
            java.lang.String r5 = r6.concat(r5)
            goto L_0x0055
        L_0x0050:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
        L_0x0055:
            android.util.Log.w(r7, r5)
            goto L_0x029e
        L_0x005a:
            boolean r6 = r5.startsWith(r6)
            p513bj.C14075p.m21691c(r6)
            r6 = 9
            java.lang.String r6 = r5.substring(r6)
            int r8 = r4.f40843e
            java.lang.String r9 = ","
            java.lang.String[] r6 = r6.split(r9, r8)
            int r8 = r6.length
            int r9 = r4.f40843e
            if (r8 == r9) goto L_0x008b
            java.lang.String r6 = "Skipping dialogue line with fewer columns than format: "
            int r8 = r5.length()
            if (r8 == 0) goto L_0x0081
            java.lang.String r5 = r6.concat(r5)
            goto L_0x0086
        L_0x0081:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
        L_0x0086:
            android.util.Log.w(r7, r5)
            goto L_0x029e
        L_0x008b:
            int r8 = r4.f40839a
            r8 = r6[r8]
            long r8 = m31305j(r8)
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r13 = "Skipping invalid timing: "
            if (r12 != 0) goto L_0x00b3
            int r6 = r5.length()
            if (r6 == 0) goto L_0x00a9
            java.lang.String r5 = r13.concat(r5)
            goto L_0x00ae
        L_0x00a9:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r13)
        L_0x00ae:
            android.util.Log.w(r7, r5)
            goto L_0x029e
        L_0x00b3:
            int r12 = r4.f40840b
            r12 = r6[r12]
            long r14 = m31305j(r12)
            int r10 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r10 != 0) goto L_0x00d4
            int r6 = r5.length()
            if (r6 == 0) goto L_0x00ca
            java.lang.String r5 = r13.concat(r5)
            goto L_0x00cf
        L_0x00ca:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r13)
        L_0x00cf:
            android.util.Log.w(r7, r5)
            goto L_0x029e
        L_0x00d4:
            java.util.LinkedHashMap r5 = r0.f40836o
            r10 = -1
            if (r5 == 0) goto L_0x00ea
            int r11 = r4.f40841c
            if (r11 == r10) goto L_0x00ea
            r11 = r6[r11]
            java.lang.String r11 = r11.trim()
            java.lang.Object r5 = r5.get(r11)
            ti.c r5 = (p678ti.C18553c) r5
            goto L_0x00eb
        L_0x00ea:
            r5 = 0
        L_0x00eb:
            int r11 = r4.f40842d
            r6 = r6[r11]
            java.util.regex.Pattern r11 = p678ti.C18553c.C18555b.f40861a
            java.util.regex.Matcher r11 = r11.matcher(r6)
            r12 = 0
        L_0x00f6:
            boolean r13 = r11.find()
            r21 = r3
            r3 = 1
            if (r13 == 0) goto L_0x012e
            java.lang.String r3 = r11.group(r3)
            r3.getClass()
            android.graphics.PointF r13 = p678ti.C18553c.C18555b.m31312a(r3)     // Catch:{ RuntimeException -> 0x010d }
            if (r13 == 0) goto L_0x010d
            r12 = r13
        L_0x010d:
            java.util.regex.Pattern r13 = p678ti.C18553c.C18555b.f40864d     // Catch:{ RuntimeException -> 0x012b }
            java.util.regex.Matcher r3 = r13.matcher(r3)     // Catch:{ RuntimeException -> 0x012b }
            boolean r13 = r3.find()     // Catch:{ RuntimeException -> 0x012b }
            if (r13 == 0) goto L_0x0126
            r13 = 1
            java.lang.String r3 = r3.group(r13)     // Catch:{ RuntimeException -> 0x012b }
            r3.getClass()     // Catch:{ RuntimeException -> 0x012b }
            int r3 = p678ti.C18553c.m31309a(r3)     // Catch:{ RuntimeException -> 0x012b }
            goto L_0x0127
        L_0x0126:
            r3 = -1
        L_0x0127:
            r13 = -1
            if (r3 == r13) goto L_0x012b
            r10 = r3
        L_0x012b:
            r3 = r21
            goto L_0x00f6
        L_0x012e:
            ti.c$b r3 = new ti.c$b
            java.util.regex.Pattern r3 = p678ti.C18553c.C18555b.f40861a
            java.util.regex.Matcher r3 = r3.matcher(r6)
            java.lang.String r6 = ""
            java.lang.String r3 = r3.replaceAll(r6)
            java.lang.String r6 = "\n"
            java.lang.String r11 = "\\N"
            java.lang.String r3 = r3.replace(r11, r6)
            java.lang.String r11 = "\\n"
            java.lang.String r3 = r3.replace(r11, r6)
            java.lang.String r6 = "\\h"
            java.lang.String r11 = " "
            java.lang.String r3 = r3.replace(r6, r11)
            float r6 = r0.f40837p
            float r11 = r0.f40838q
            android.text.SpannableString r13 = new android.text.SpannableString
            r13.<init>(r3)
            oi.a$a r3 = new oi.a$a
            r3.<init>()
            r3.f40164a = r13
            r16 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r5 == 0) goto L_0x01f7
            java.lang.Integer r0 = r5.f40846c
            if (r0 == 0) goto L_0x0185
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r20 = r4
            java.lang.Integer r4 = r5.f40846c
            int r4 = r4.intValue()
            r0.<init>(r4)
            int r4 = r13.length()
            r17 = r14
            r14 = 33
            r15 = 0
            r13.setSpan(r0, r15, r4, r14)
            goto L_0x0189
        L_0x0185:
            r20 = r4
            r17 = r14
        L_0x0189:
            float r0 = r5.f40847d
            int r4 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x0199
            int r4 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x0199
            float r0 = r0 / r11
            r3.f40174k = r0
            r0 = 1
            r3.f40173j = r0
        L_0x0199:
            boolean r0 = r5.f40848e
            if (r0 == 0) goto L_0x01b2
            boolean r4 = r5.f40849f
            if (r4 == 0) goto L_0x01b2
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r4 = 3
            r0.<init>(r4)
            int r4 = r13.length()
            r14 = 33
            r15 = 0
            r13.setSpan(r0, r15, r4, r14)
            goto L_0x01d6
        L_0x01b2:
            r14 = 33
            r15 = 0
            if (r0 == 0) goto L_0x01c5
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r4 = 1
            r0.<init>(r4)
            int r4 = r13.length()
            r13.setSpan(r0, r15, r4, r14)
            goto L_0x01d6
        L_0x01c5:
            boolean r0 = r5.f40849f
            if (r0 == 0) goto L_0x01d6
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r4 = 2
            r0.<init>(r4)
            int r4 = r13.length()
            r13.setSpan(r0, r15, r4, r14)
        L_0x01d6:
            boolean r0 = r5.f40850g
            if (r0 == 0) goto L_0x01e6
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            int r4 = r13.length()
            r13.setSpan(r0, r15, r4, r14)
        L_0x01e6:
            boolean r0 = r5.f40851h
            if (r0 == 0) goto L_0x01fb
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            int r4 = r13.length()
            r13.setSpan(r0, r15, r4, r14)
            goto L_0x01fb
        L_0x01f7:
            r20 = r4
            r17 = r14
        L_0x01fb:
            r0 = -1
            if (r10 == r0) goto L_0x01ff
            goto L_0x0205
        L_0x01ff:
            if (r5 == 0) goto L_0x0204
            int r10 = r5.f40845b
            goto L_0x0205
        L_0x0204:
            r10 = r0
        L_0x0205:
            java.lang.String r0 = "Unknown alignment: "
            r4 = 30
            switch(r10) {
                case -1: goto L_0x0219;
                case 0: goto L_0x020c;
                case 1: goto L_0x0213;
                case 2: goto L_0x0210;
                case 3: goto L_0x020d;
                case 4: goto L_0x0213;
                case 5: goto L_0x0210;
                case 6: goto L_0x020d;
                case 7: goto L_0x0213;
                case 8: goto L_0x0210;
                case 9: goto L_0x020d;
                default: goto L_0x020c;
            }
        L_0x020c:
            goto L_0x0216
        L_0x020d:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x021a
        L_0x0210:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x021a
        L_0x0213:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x021a
        L_0x0216:
            p003a2.C0023f.m112m(r4, r0, r10, r7)
        L_0x0219:
            r5 = 0
        L_0x021a:
            r3.f40166c = r5
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            switch(r10) {
                case -1: goto L_0x022b;
                case 0: goto L_0x0221;
                case 1: goto L_0x0226;
                case 2: goto L_0x0224;
                case 3: goto L_0x0222;
                case 4: goto L_0x0226;
                case 5: goto L_0x0224;
                case 6: goto L_0x0222;
                case 7: goto L_0x0226;
                case 8: goto L_0x0224;
                case 9: goto L_0x0222;
                default: goto L_0x0221;
            }
        L_0x0221:
            goto L_0x0228
        L_0x0222:
            r13 = 2
            goto L_0x022c
        L_0x0224:
            r13 = 1
            goto L_0x022c
        L_0x0226:
            r13 = 0
            goto L_0x022c
        L_0x0228:
            p003a2.C0023f.m112m(r4, r0, r10, r7)
        L_0x022b:
            r13 = r5
        L_0x022c:
            r3.f40172i = r13
            switch(r10) {
                case -1: goto L_0x023b;
                case 0: goto L_0x0231;
                case 1: goto L_0x0236;
                case 2: goto L_0x0236;
                case 3: goto L_0x0236;
                case 4: goto L_0x0234;
                case 5: goto L_0x0234;
                case 6: goto L_0x0234;
                case 7: goto L_0x0232;
                case 8: goto L_0x0232;
                case 9: goto L_0x0232;
                default: goto L_0x0231;
            }
        L_0x0231:
            goto L_0x0238
        L_0x0232:
            r5 = 0
            goto L_0x023b
        L_0x0234:
            r5 = 1
            goto L_0x023b
        L_0x0236:
            r5 = 2
            goto L_0x023b
        L_0x0238:
            p003a2.C0023f.m112m(r4, r0, r10, r7)
        L_0x023b:
            r3.f40170g = r5
            if (r12 == 0) goto L_0x0255
            int r0 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0255
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0255
            float r0 = r12.x
            float r0 = r0 / r6
            r3.f40171h = r0
            float r0 = r12.y
            float r0 = r0 / r11
            r3.f40168e = r0
            r0 = 0
            r3.f40169f = r0
            goto L_0x0282
        L_0x0255:
            int r0 = r3.f40172i
            r4 = 1064514355(0x3f733333, float:0.95)
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = 1028443341(0x3d4ccccd, float:0.05)
            r10 = 1
            r11 = 2
            if (r0 == 0) goto L_0x026e
            if (r0 == r10) goto L_0x026c
            if (r0 == r11) goto L_0x026a
            r0 = r16
            goto L_0x026f
        L_0x026a:
            r0 = r4
            goto L_0x026f
        L_0x026c:
            r0 = r6
            goto L_0x026f
        L_0x026e:
            r0 = r7
        L_0x026f:
            r3.f40171h = r0
            if (r5 == 0) goto L_0x027c
            if (r5 == r10) goto L_0x027a
            if (r5 == r11) goto L_0x027d
            r4 = r16
            goto L_0x027d
        L_0x027a:
            r4 = r6
            goto L_0x027d
        L_0x027c:
            r4 = r7
        L_0x027d:
            r3.f40168e = r4
            r0 = 0
            r3.f40169f = r0
        L_0x0282:
            oi.a r0 = r3.mo69838a()
            int r3 = m31304h(r8, r2, r1)
            r4 = r17
            int r4 = m31304h(r4, r2, r1)
        L_0x0290:
            if (r3 >= r4) goto L_0x02a2
            java.lang.Object r5 = r1.get(r3)
            java.util.List r5 = (java.util.List) r5
            r5.add(r0)
            int r3 = r3 + 1
            goto L_0x0290
        L_0x029e:
            r21 = r3
            r20 = r4
        L_0x02a2:
            r0 = r19
            r4 = r20
            r3 = r21
            goto L_0x0024
        L_0x02aa:
            ti.d r0 = new ti.d
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p678ti.C18551a.mo69840g(int, boolean, byte[]):oi.d");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x022b A[Catch:{ RuntimeException -> 0x0275 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0236 A[Catch:{ RuntimeException -> 0x0275 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x023d A[Catch:{ RuntimeException -> 0x0275 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0248 A[Catch:{ RuntimeException -> 0x0275 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x024f A[Catch:{ RuntimeException -> 0x0275 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x025a A[Catch:{ RuntimeException -> 0x0275 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0261 A[Catch:{ RuntimeException -> 0x0275 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x026c A[Catch:{ RuntimeException -> 0x0275 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0288  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70065i(p513bj.C14077r r27) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
        L_0x0004:
            java.lang.String r0 = r27.mo46913d()
            if (r0 == 0) goto L_0x02af
            java.lang.String r3 = "[Script Info]"
            boolean r3 = r3.equalsIgnoreCase(r0)
            r4 = 2
            r5 = 91
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L_0x006e
        L_0x0017:
            java.lang.String r0 = r27.mo46913d()
            if (r0 == 0) goto L_0x0004
            int r3 = r2.f30988c
            int r8 = r2.f30987b
            int r3 = r3 - r8
            if (r3 == 0) goto L_0x002c
            byte[] r3 = r2.f30986a
            byte r3 = r3[r8]
            r3 = r3 & 255(0xff, float:3.57E-43)
            if (r3 == r5) goto L_0x0004
        L_0x002c:
            java.lang.String r3 = ":"
            java.lang.String[] r0 = r0.split(r3)
            int r3 = r0.length
            if (r3 == r4) goto L_0x0036
            goto L_0x0017
        L_0x0036:
            r3 = r0[r7]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = p001a0.C0005b.m56q0(r3)
            r3.getClass()
            java.lang.String r8 = "playresx"
            boolean r8 = r3.equals(r8)
            if (r8 != 0) goto L_0x0061
            java.lang.String r8 = "playresy"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L_0x0054
            goto L_0x0017
        L_0x0054:
            r0 = r0[r6]     // Catch:{ NumberFormatException -> 0x0017 }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x0017 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0017 }
            r1.f40838q = r0     // Catch:{ NumberFormatException -> 0x0017 }
            goto L_0x0017
        L_0x0061:
            r0 = r0[r6]     // Catch:{ NumberFormatException -> 0x0017 }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x0017 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0017 }
            r1.f40837p = r0     // Catch:{ NumberFormatException -> 0x0017 }
            goto L_0x0017
        L_0x006e:
            java.lang.String r3 = "[V4+ Styles]"
            boolean r3 = r3.equalsIgnoreCase(r0)
            java.lang.String r8 = "SsaDecoder"
            if (r3 == 0) goto L_0x0298
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
        L_0x007d:
            r0 = 0
            r25 = r4
            r4 = r0
            r0 = r25
        L_0x0083:
            java.lang.String r9 = r27.mo46913d()
            if (r9 == 0) goto L_0x0294
            int r10 = r2.f30988c
            int r11 = r2.f30987b
            int r10 = r10 - r11
            if (r10 == 0) goto L_0x0098
            byte[] r10 = r2.f30986a
            byte r10 = r10[r11]
            r10 = r10 & 255(0xff, float:3.57E-43)
            if (r10 == r5) goto L_0x0294
        L_0x0098:
            java.lang.String r5 = "Format:"
            boolean r5 = r9.startsWith(r5)
            java.lang.String r10 = ","
            r11 = -1
            r12 = 3
            r13 = 6
            if (r5 == 0) goto L_0x0169
            r4 = 7
            java.lang.String r4 = r9.substring(r4)
            java.lang.String[] r4 = android.text.TextUtils.split(r4, r10)
            r5 = r7
            r15 = r11
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
        L_0x00be:
            int r9 = r4.length
            if (r5 >= r9) goto L_0x0150
            r9 = r4[r5]
            java.lang.String r9 = r9.trim()
            java.lang.String r9 = p001a0.C0005b.m56q0(r9)
            r9.getClass()
            int r10 = r9.hashCode()
            switch(r10) {
                case -1178781136: goto L_0x0126;
                case -1026963764: goto L_0x011b;
                case -192095652: goto L_0x0110;
                case -70925746: goto L_0x0105;
                case 3029637: goto L_0x00fa;
                case 3373707: goto L_0x00ef;
                case 366554320: goto L_0x00e4;
                case 1767875043: goto L_0x00d7;
                default: goto L_0x00d5;
            }
        L_0x00d5:
            goto L_0x0131
        L_0x00d7:
            java.lang.String r10 = "alignment"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00e1
            goto L_0x0131
        L_0x00e1:
            r9 = 7
            goto L_0x0132
        L_0x00e4:
            java.lang.String r10 = "fontsize"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00ed
            goto L_0x0131
        L_0x00ed:
            r9 = r13
            goto L_0x0132
        L_0x00ef:
            java.lang.String r10 = "name"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00f8
            goto L_0x0131
        L_0x00f8:
            r9 = 5
            goto L_0x0132
        L_0x00fa:
            java.lang.String r10 = "bold"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0103
            goto L_0x0131
        L_0x0103:
            r9 = 4
            goto L_0x0132
        L_0x0105:
            java.lang.String r10 = "primarycolour"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x010e
            goto L_0x0131
        L_0x010e:
            r9 = r12
            goto L_0x0132
        L_0x0110:
            java.lang.String r10 = "strikeout"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0119
            goto L_0x0131
        L_0x0119:
            r9 = r0
            goto L_0x0132
        L_0x011b:
            java.lang.String r10 = "underline"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0124
            goto L_0x0131
        L_0x0124:
            r9 = r6
            goto L_0x0132
        L_0x0126:
            java.lang.String r10 = "italic"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x012f
            goto L_0x0131
        L_0x012f:
            r9 = r7
            goto L_0x0132
        L_0x0131:
            r9 = r11
        L_0x0132:
            switch(r9) {
                case 0: goto L_0x014a;
                case 1: goto L_0x0147;
                case 2: goto L_0x0144;
                case 3: goto L_0x0141;
                case 4: goto L_0x013e;
                case 5: goto L_0x013c;
                case 6: goto L_0x0139;
                case 7: goto L_0x0136;
                default: goto L_0x0135;
            }
        L_0x0135:
            goto L_0x014c
        L_0x0136:
            r16 = r5
            goto L_0x014c
        L_0x0139:
            r18 = r5
            goto L_0x014c
        L_0x013c:
            r15 = r5
            goto L_0x014c
        L_0x013e:
            r19 = r5
            goto L_0x014c
        L_0x0141:
            r17 = r5
            goto L_0x014c
        L_0x0144:
            r22 = r5
            goto L_0x014c
        L_0x0147:
            r21 = r5
            goto L_0x014c
        L_0x014a:
            r20 = r5
        L_0x014c:
            int r5 = r5 + 1
            goto L_0x00be
        L_0x0150:
            if (r15 == r11) goto L_0x0164
            ti.c$a r5 = new ti.c$a
            int r4 = r4.length
            r14 = r5
            r23 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r4 = 91
            r25 = r5
            r5 = r4
            r4 = r25
            goto L_0x0083
        L_0x0164:
            r5 = 91
            r4 = r0
            goto L_0x007d
        L_0x0169:
            java.lang.String r5 = "Style:"
            boolean r14 = r9.startsWith(r5)
            if (r14 == 0) goto L_0x028d
            if (r4 != 0) goto L_0x018b
            java.lang.String r0 = "Skipping 'Style:' line before 'Format:' line: "
            int r5 = r9.length()
            if (r5 == 0) goto L_0x0180
            java.lang.String r0 = r0.concat(r9)
            goto L_0x0186
        L_0x0180:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0)
            r0 = r5
        L_0x0186:
            android.util.Log.w(r8, r0)
            goto L_0x028d
        L_0x018b:
            java.lang.String r14 = "'"
            boolean r5 = r9.startsWith(r5)
            p513bj.C14075p.m21691c(r5)
            java.lang.String r5 = r9.substring(r13)
            java.lang.String[] r5 = android.text.TextUtils.split(r5, r10)
            int r10 = r5.length
            int r13 = r4.f40860i
            java.lang.String r15 = "SsaStyle"
            if (r10 == r13) goto L_0x01bf
            java.lang.Object[] r10 = new java.lang.Object[r12]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            r10[r7] = r11
            int r5 = r5.length
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r10[r6] = r5
            r10[r0] = r9
            java.lang.String r0 = "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'"
            java.lang.String r0 = p513bj.C14049b0.m21640m(r0, r10)
            android.util.Log.w(r15, r0)
            goto L_0x0285
        L_0x01bf:
            ti.c r6 = new ti.c     // Catch:{ RuntimeException -> 0x0275 }
            int r0 = r4.f40852a     // Catch:{ RuntimeException -> 0x0275 }
            r0 = r5[r0]     // Catch:{ RuntimeException -> 0x0275 }
            java.lang.String r17 = r0.trim()     // Catch:{ RuntimeException -> 0x0275 }
            int r0 = r4.f40853b     // Catch:{ RuntimeException -> 0x0275 }
            if (r0 == r11) goto L_0x01da
            r0 = r5[r0]     // Catch:{ RuntimeException -> 0x0275 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x0275 }
            int r0 = p678ti.C18553c.m31309a(r0)     // Catch:{ RuntimeException -> 0x0275 }
            r18 = r0
            goto L_0x01dc
        L_0x01da:
            r18 = r11
        L_0x01dc:
            int r0 = r4.f40854c     // Catch:{ RuntimeException -> 0x0275 }
            if (r0 == r11) goto L_0x01eb
            r0 = r5[r0]     // Catch:{ RuntimeException -> 0x0275 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x0275 }
            java.lang.Integer r0 = p678ti.C18553c.m31311c(r0)     // Catch:{ RuntimeException -> 0x0275 }
            goto L_0x01ec
        L_0x01eb:
            r0 = 0
        L_0x01ec:
            r19 = r0
            int r0 = r4.f40855d     // Catch:{ RuntimeException -> 0x0275 }
            r7 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r0 == r11) goto L_0x0225
            r0 = r5[r0]     // Catch:{ RuntimeException -> 0x0275 }
            java.lang.String r10 = r0.trim()     // Catch:{ RuntimeException -> 0x0275 }
            float r0 = java.lang.Float.parseFloat(r10)     // Catch:{ NumberFormatException -> 0x0202 }
            r20 = r0
            goto L_0x0227
        L_0x0202:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ RuntimeException -> 0x0275 }
            int r0 = r0.length()     // Catch:{ RuntimeException -> 0x0275 }
            int r0 = r0 + 29
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0275 }
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x0275 }
            java.lang.String r0 = "Failed to parse font size: '"
            r13.append(r0)     // Catch:{ RuntimeException -> 0x0275 }
            r13.append(r10)     // Catch:{ RuntimeException -> 0x0275 }
            r13.append(r14)     // Catch:{ RuntimeException -> 0x0275 }
            java.lang.String r0 = r13.toString()     // Catch:{ RuntimeException -> 0x0275 }
            p513bj.C14075p.m21700l(r15, r0, r12)     // Catch:{ RuntimeException -> 0x0275 }
        L_0x0225:
            r20 = r7
        L_0x0227:
            int r0 = r4.f40856e     // Catch:{ RuntimeException -> 0x0275 }
            if (r0 == r11) goto L_0x0236
            r0 = r5[r0]     // Catch:{ RuntimeException -> 0x0275 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x0275 }
            boolean r0 = p678ti.C18553c.m31310b(r0)     // Catch:{ RuntimeException -> 0x0275 }
            goto L_0x0237
        L_0x0236:
            r0 = 0
        L_0x0237:
            r21 = r0
            int r0 = r4.f40857f     // Catch:{ RuntimeException -> 0x0275 }
            if (r0 == r11) goto L_0x0248
            r0 = r5[r0]     // Catch:{ RuntimeException -> 0x0275 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x0275 }
            boolean r0 = p678ti.C18553c.m31310b(r0)     // Catch:{ RuntimeException -> 0x0275 }
            goto L_0x0249
        L_0x0248:
            r0 = 0
        L_0x0249:
            r22 = r0
            int r0 = r4.f40858g     // Catch:{ RuntimeException -> 0x0275 }
            if (r0 == r11) goto L_0x025a
            r0 = r5[r0]     // Catch:{ RuntimeException -> 0x0275 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x0275 }
            boolean r0 = p678ti.C18553c.m31310b(r0)     // Catch:{ RuntimeException -> 0x0275 }
            goto L_0x025b
        L_0x025a:
            r0 = 0
        L_0x025b:
            r23 = r0
            int r0 = r4.f40859h     // Catch:{ RuntimeException -> 0x0275 }
            if (r0 == r11) goto L_0x026c
            r0 = r5[r0]     // Catch:{ RuntimeException -> 0x0275 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x0275 }
            boolean r0 = p678ti.C18553c.m31310b(r0)     // Catch:{ RuntimeException -> 0x0275 }
            goto L_0x026d
        L_0x026c:
            r0 = 0
        L_0x026d:
            r24 = r0
            r16 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ RuntimeException -> 0x0275 }
            goto L_0x0286
        L_0x0275:
            r0 = move-exception
            int r5 = r9.length()
            int r5 = r5 + 36
            java.lang.String r6 = "Skipping malformed 'Style:' line: '"
            java.lang.String r5 = p504ai.C13983i.m21492k(r5, r6, r9, r14)
            p513bj.C14075p.m21700l(r15, r5, r0)
        L_0x0285:
            r6 = 0
        L_0x0286:
            if (r6 == 0) goto L_0x028d
            java.lang.String r0 = r6.f40844a
            r3.put(r0, r6)
        L_0x028d:
            r0 = 2
            r5 = 91
            r6 = 1
            r7 = 0
            goto L_0x0083
        L_0x0294:
            r1.f40836o = r3
            goto L_0x0004
        L_0x0298:
            java.lang.String r3 = "[V4 Styles]"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x02a7
            java.lang.String r0 = "[V4 Styles] are not supported"
            android.util.Log.i(r8, r0)
            goto L_0x0004
        L_0x02a7:
            java.lang.String r3 = "[Events]"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0004
        L_0x02af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p678ti.C18551a.mo70065i(bj.r):void");
    }
}
