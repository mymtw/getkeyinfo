package p710xi;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import com.etsy.android.lib.conversation.MessageDraft;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p513bj.C14077r;

/* renamed from: xi.g */
public final class C18777g {

    /* renamed from: a */
    public static final Pattern f41624a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    public static final Pattern f41625b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    public static final Map<String, Integer> f41626c;

    /* renamed from: d */
    public static final Map<String, Integer> f41627d;

    /* renamed from: xi.g$a */
    public static class C18778a {

        /* renamed from: c */
        public static final C18776f f41628c = new C18776f();

        /* renamed from: a */
        public final C18779b f41629a;

        /* renamed from: b */
        public final int f41630b;

        public C18778a(C18779b bVar, int i) {
            this.f41629a = bVar;
            this.f41630b = i;
        }
    }

    /* renamed from: xi.g$b */
    public static final class C18779b {

        /* renamed from: a */
        public final String f41631a;

        /* renamed from: b */
        public final int f41632b;

        /* renamed from: c */
        public final String f41633c;

        /* renamed from: d */
        public final Set<String> f41634d;

        public C18779b(String str, int i, String str2, Set<String> set) {
            this.f41632b = i;
            this.f41631a = str;
            this.f41633c = str2;
            this.f41634d = set;
        }
    }

    /* renamed from: xi.g$c */
    public static final class C18780c implements Comparable<C18780c> {

        /* renamed from: b */
        public final int f41635b;

        /* renamed from: c */
        public final C18774d f41636c;

        public C18780c(int i, C18774d dVar) {
            this.f41635b = i;
            this.f41636c = dVar;
        }

        public final int compareTo(Object obj) {
            return Integer.compare(this.f41635b, ((C18780c) obj).f41635b);
        }
    }

    /* renamed from: xi.g$d */
    public static final class C18781d {

        /* renamed from: a */
        public long f41637a = 0;

        /* renamed from: b */
        public long f41638b = 0;

        /* renamed from: c */
        public CharSequence f41639c;

        /* renamed from: d */
        public int f41640d = 2;

        /* renamed from: e */
        public float f41641e = -3.4028235E38f;

        /* renamed from: f */
        public int f41642f = 1;

        /* renamed from: g */
        public int f41643g = 0;

        /* renamed from: h */
        public float f41644h = -3.4028235E38f;

        /* renamed from: i */
        public int f41645i = Integer.MIN_VALUE;

        /* renamed from: j */
        public float f41646j = 1.0f;

        /* renamed from: k */
        public int f41647k = Integer.MIN_VALUE;

        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0072, code lost:
            if (r7 == 0) goto L_0x0074;
         */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0085  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00b0  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p636oi.C18296a.C18297a mo70259a() {
            /*
                r13 = this;
                float r0 = r13.f41644h
                r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                r3 = 1056964608(0x3f000000, float:0.5)
                r4 = 0
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 5
                r7 = 4
                if (r2 == 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                int r0 = r13.f41640d
                if (r0 == r7) goto L_0x001b
                if (r0 == r6) goto L_0x0019
                r0 = r3
                goto L_0x001c
            L_0x0019:
                r0 = r5
                goto L_0x001c
            L_0x001b:
                r0 = r4
            L_0x001c:
                int r2 = r13.f41645i
                r8 = -2147483648(0xffffffff80000000, float:-0.0)
                r9 = 3
                r10 = 2
                r11 = 1
                if (r2 == r8) goto L_0x0026
                goto L_0x0035
            L_0x0026:
                int r2 = r13.f41640d
                if (r2 == r11) goto L_0x0034
                if (r2 == r9) goto L_0x0032
                if (r2 == r7) goto L_0x0034
                if (r2 == r6) goto L_0x0032
                r2 = r11
                goto L_0x0035
            L_0x0032:
                r2 = r10
                goto L_0x0035
            L_0x0034:
                r2 = 0
            L_0x0035:
                oi.a$a r8 = new oi.a$a
                r8.<init>()
                int r12 = r13.f41640d
                if (r12 == r11) goto L_0x0057
                if (r12 == r10) goto L_0x0054
                if (r12 == r9) goto L_0x0051
                if (r12 == r7) goto L_0x0057
                if (r12 == r6) goto L_0x0051
                r6 = 34
                java.lang.String r7 = "Unknown textAlignment: "
                java.lang.String r9 = "WebvttCueParser"
                p003a2.C0023f.m112m(r6, r7, r12, r9)
                r6 = 0
                goto L_0x0059
            L_0x0051:
                android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L_0x0059
            L_0x0054:
                android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L_0x0059
            L_0x0057:
                android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
            L_0x0059:
                r8.f40166c = r6
                float r6 = r13.f41641e
                int r7 = r13.f41642f
                int r9 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r9 == 0) goto L_0x006e
                if (r7 != 0) goto L_0x006e
                int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r4 < 0) goto L_0x0074
                int r4 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
                if (r4 <= 0) goto L_0x006e
                goto L_0x0074
            L_0x006e:
                if (r9 == 0) goto L_0x0072
                r1 = r6
                goto L_0x0075
            L_0x0072:
                if (r7 != 0) goto L_0x0075
            L_0x0074:
                r1 = r5
            L_0x0075:
                r8.f40168e = r1
                r8.f40169f = r7
                int r1 = r13.f41643g
                r8.f40170g = r1
                r8.f40171h = r0
                r8.f40172i = r2
                float r1 = r13.f41646j
                if (r2 == 0) goto L_0x00a0
                if (r2 == r11) goto L_0x0094
                if (r2 != r10) goto L_0x008a
                goto L_0x00a2
            L_0x008a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = java.lang.String.valueOf(r2)
                r0.<init>(r1)
                throw r0
            L_0x0094:
                int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                r3 = 1073741824(0x40000000, float:2.0)
                if (r2 > 0) goto L_0x009c
                float r0 = r0 * r3
                goto L_0x00a2
            L_0x009c:
                float r5 = r5 - r0
                float r0 = r5 * r3
                goto L_0x00a2
            L_0x00a0:
                float r0 = r5 - r0
            L_0x00a2:
                float r0 = java.lang.Math.min(r1, r0)
                r8.f40175l = r0
                int r0 = r13.f41647k
                r8.f40179p = r0
                java.lang.CharSequence r0 = r13.f41639c
                if (r0 == 0) goto L_0x00b2
                r8.f40164a = r0
            L_0x00b2:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p710xi.C18777g.C18781d.mo70259a():oi.a$a");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put(ResponseConstants.RED, Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put(ResponseConstants.BLUE, Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f41626c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f41627d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0097 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0177  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m31681a(android.text.SpannableStringBuilder r19, p710xi.C18777g.C18779b r20, java.lang.String r21, java.util.List r22, java.util.List r23) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r23
            int r4 = r1.f41632b
            int r5 = r19.length()
            java.lang.String r6 = r1.f41631a
            r6.getClass()
            int r7 = r6.hashCode()
            r9 = 2
            r10 = -1
            if (r7 == 0) goto L_0x0087
            r13 = 105(0x69, float:1.47E-43)
            if (r7 == r13) goto L_0x007c
            r13 = 3314158(0x3291ee, float:4.644125E-39)
            if (r7 == r13) goto L_0x0071
            r13 = 3511770(0x3595da, float:4.921038E-39)
            if (r7 == r13) goto L_0x0066
            r13 = 98
            if (r7 == r13) goto L_0x005b
            r13 = 99
            if (r7 == r13) goto L_0x0050
            r13 = 117(0x75, float:1.64E-43)
            if (r7 == r13) goto L_0x0045
            r13 = 118(0x76, float:1.65E-43)
            if (r7 == r13) goto L_0x003a
            goto L_0x008f
        L_0x003a:
            java.lang.String r7 = "v"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0043
            goto L_0x008f
        L_0x0043:
            r6 = 5
            goto L_0x0092
        L_0x0045:
            java.lang.String r7 = "u"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x004e
            goto L_0x008f
        L_0x004e:
            r6 = 4
            goto L_0x0092
        L_0x0050:
            java.lang.String r7 = "c"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0059
            goto L_0x008f
        L_0x0059:
            r6 = r9
            goto L_0x0092
        L_0x005b:
            java.lang.String r7 = "b"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0064
            goto L_0x008f
        L_0x0064:
            r6 = 1
            goto L_0x0092
        L_0x0066:
            java.lang.String r7 = "ruby"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x006f
            goto L_0x008f
        L_0x006f:
            r6 = 7
            goto L_0x0092
        L_0x0071:
            java.lang.String r7 = "lang"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x007a
            goto L_0x008f
        L_0x007a:
            r6 = 6
            goto L_0x0092
        L_0x007c:
            java.lang.String r7 = "i"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0085
            goto L_0x008f
        L_0x0085:
            r6 = 3
            goto L_0x0092
        L_0x0087:
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0091
        L_0x008f:
            r6 = r10
            goto L_0x0092
        L_0x0091:
            r6 = 0
        L_0x0092:
            r7 = 33
            switch(r6) {
                case 0: goto L_0x016c;
                case 1: goto L_0x0163;
                case 2: goto L_0x011b;
                case 3: goto L_0x0112;
                case 4: goto L_0x0109;
                case 5: goto L_0x016c;
                case 6: goto L_0x016c;
                case 7: goto L_0x0098;
                default: goto L_0x0097;
            }
        L_0x0097:
            return
        L_0x0098:
            int r6 = m31683c(r3, r2, r1)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = r22.size()
            r13.<init>(r14)
            r14 = r22
            r13.addAll(r14)
            xi.f r14 = p710xi.C18777g.C18778a.f41628c
            java.util.Collections.sort(r13, r14)
            int r14 = r1.f41632b
            r15 = 0
            r16 = 0
        L_0x00b4:
            int r11 = r13.size()
            if (r15 >= r11) goto L_0x016c
            java.lang.Object r11 = r13.get(r15)
            xi.g$a r11 = (p710xi.C18777g.C18778a) r11
            xi.g$b r11 = r11.f41629a
            java.lang.String r11 = r11.f41631a
            java.lang.String r8 = "rt"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x00cd
            goto L_0x0105
        L_0x00cd:
            java.lang.Object r8 = r13.get(r15)
            xi.g$a r8 = (p710xi.C18777g.C18778a) r8
            xi.g$b r11 = r8.f41629a
            int r11 = m31683c(r3, r2, r11)
            if (r11 == r10) goto L_0x00dc
            goto L_0x00e1
        L_0x00dc:
            if (r6 == r10) goto L_0x00e0
            r11 = r6
            goto L_0x00e1
        L_0x00e0:
            r11 = 1
        L_0x00e1:
            xi.g$b r10 = r8.f41629a
            int r10 = r10.f41632b
            int r10 = r10 - r16
            int r8 = r8.f41630b
            int r8 = r8 - r16
            java.lang.CharSequence r17 = r0.subSequence(r10, r8)
            r0.delete(r10, r8)
            si.c r8 = new si.c
            java.lang.String r12 = r17.toString()
            r8.<init>(r12, r11)
            r0.setSpan(r8, r14, r10, r7)
            int r8 = r17.length()
            int r16 = r8 + r16
            r14 = r10
        L_0x0105:
            int r15 = r15 + 1
            r10 = -1
            goto L_0x00b4
        L_0x0109:
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r0.setSpan(r6, r4, r5, r7)
            goto L_0x016c
        L_0x0112:
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r9)
            r0.setSpan(r6, r4, r5, r7)
            goto L_0x016c
        L_0x011b:
            java.util.Set<java.lang.String> r6 = r1.f41634d
            java.util.Iterator r6 = r6.iterator()
        L_0x0121:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x016c
            java.lang.Object r8 = r6.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.Map<java.lang.String, java.lang.Integer> r10 = f41626c
            boolean r11 = r10.containsKey(r8)
            if (r11 == 0) goto L_0x0148
            java.lang.Object r8 = r10.get(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            android.text.style.ForegroundColorSpan r10 = new android.text.style.ForegroundColorSpan
            r10.<init>(r8)
            r0.setSpan(r10, r4, r5, r7)
            goto L_0x0121
        L_0x0148:
            java.util.Map<java.lang.String, java.lang.Integer> r10 = f41627d
            boolean r11 = r10.containsKey(r8)
            if (r11 == 0) goto L_0x0121
            java.lang.Object r8 = r10.get(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            android.text.style.BackgroundColorSpan r10 = new android.text.style.BackgroundColorSpan
            r10.<init>(r8)
            r0.setSpan(r10, r4, r5, r7)
            goto L_0x0121
        L_0x0163:
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r8 = 1
            r6.<init>(r8)
            r0.setSpan(r6, r4, r5, r7)
        L_0x016c:
            java.util.ArrayList r1 = m31682b(r3, r2, r1)
            r2 = 0
        L_0x0171:
            int r3 = r1.size()
            if (r2 >= r3) goto L_0x0266
            java.lang.Object r3 = r1.get(r2)
            xi.g$c r3 = (p710xi.C18777g.C18780c) r3
            xi.d r3 = r3.f41636c
            if (r3 != 0) goto L_0x0186
            r6 = -1
            r11 = 3
            r12 = 1
            goto L_0x0262
        L_0x0186:
            int r6 = r3.f41616l
            r8 = -1
            if (r6 != r8) goto L_0x0191
            int r10 = r3.f41617m
            if (r10 != r8) goto L_0x0191
            r8 = -1
            goto L_0x019f
        L_0x0191:
            r8 = 1
            if (r6 != r8) goto L_0x0196
            r6 = r8
            goto L_0x0197
        L_0x0196:
            r6 = 0
        L_0x0197:
            int r10 = r3.f41617m
            if (r10 != r8) goto L_0x019d
            r8 = r9
            goto L_0x019e
        L_0x019d:
            r8 = 0
        L_0x019e:
            r8 = r8 | r6
        L_0x019f:
            r6 = -1
            if (r8 == r6) goto L_0x01c2
            android.text.style.StyleSpan r8 = new android.text.style.StyleSpan
            int r10 = r3.f41616l
            if (r10 != r6) goto L_0x01ae
            int r11 = r3.f41617m
            if (r11 != r6) goto L_0x01ae
            r10 = r6
            goto L_0x01bc
        L_0x01ae:
            r11 = 1
            if (r10 != r11) goto L_0x01b3
            r10 = r11
            goto L_0x01b4
        L_0x01b3:
            r10 = 0
        L_0x01b4:
            int r12 = r3.f41617m
            if (r12 != r11) goto L_0x01ba
            r11 = r9
            goto L_0x01bb
        L_0x01ba:
            r11 = 0
        L_0x01bb:
            r10 = r10 | r11
        L_0x01bc:
            r8.<init>(r10)
            p568fn.C17782b.m29884s(r0, r8, r4, r5)
        L_0x01c2:
            int r8 = r3.f41614j
            r10 = 1
            if (r8 != r10) goto L_0x01ca
            r18 = r10
            goto L_0x01cc
        L_0x01ca:
            r18 = 0
        L_0x01cc:
            if (r18 == 0) goto L_0x01d6
            android.text.style.StrikethroughSpan r8 = new android.text.style.StrikethroughSpan
            r8.<init>()
            r0.setSpan(r8, r4, r5, r7)
        L_0x01d6:
            int r8 = r3.f41615k
            if (r8 != r10) goto L_0x01dc
            r8 = 1
            goto L_0x01dd
        L_0x01dc:
            r8 = 0
        L_0x01dd:
            if (r8 == 0) goto L_0x01e7
            android.text.style.UnderlineSpan r8 = new android.text.style.UnderlineSpan
            r8.<init>()
            r0.setSpan(r8, r4, r5, r7)
        L_0x01e7:
            boolean r8 = r3.f41611g
            if (r8 == 0) goto L_0x0202
            android.text.style.ForegroundColorSpan r8 = new android.text.style.ForegroundColorSpan
            boolean r10 = r3.f41611g
            if (r10 == 0) goto L_0x01fa
            int r10 = r3.f41610f
            r8.<init>(r10)
            p568fn.C17782b.m29884s(r0, r8, r4, r5)
            goto L_0x0202
        L_0x01fa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Font color not defined"
            r0.<init>(r1)
            throw r0
        L_0x0202:
            boolean r8 = r3.f41613i
            if (r8 == 0) goto L_0x021d
            android.text.style.BackgroundColorSpan r8 = new android.text.style.BackgroundColorSpan
            boolean r10 = r3.f41613i
            if (r10 == 0) goto L_0x0215
            int r10 = r3.f41612h
            r8.<init>(r10)
            p568fn.C17782b.m29884s(r0, r8, r4, r5)
            goto L_0x021d
        L_0x0215:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Background color not defined."
            r0.<init>(r1)
            throw r0
        L_0x021d:
            java.lang.String r8 = r3.f41609e
            if (r8 == 0) goto L_0x022b
            android.text.style.TypefaceSpan r8 = new android.text.style.TypefaceSpan
            java.lang.String r10 = r3.f41609e
            r8.<init>(r10)
            p568fn.C17782b.m29884s(r0, r8, r4, r5)
        L_0x022b:
            int r8 = r3.f41618n
            r10 = 0
            r11 = 1
            if (r8 == r11) goto L_0x024b
            if (r8 == r9) goto L_0x0240
            r11 = 3
            if (r8 == r11) goto L_0x0237
            goto L_0x0249
        L_0x0237:
            android.text.style.RelativeSizeSpan r8 = new android.text.style.RelativeSizeSpan
            r8.<init>(r10)
            p568fn.C17782b.m29884s(r0, r8, r4, r5)
            goto L_0x0249
        L_0x0240:
            r11 = 3
            android.text.style.RelativeSizeSpan r8 = new android.text.style.RelativeSizeSpan
            r8.<init>(r10)
            p568fn.C17782b.m29884s(r0, r8, r4, r5)
        L_0x0249:
            r12 = 1
            goto L_0x0256
        L_0x024b:
            r11 = 3
            android.text.style.AbsoluteSizeSpan r8 = new android.text.style.AbsoluteSizeSpan
            int r10 = (int) r10
            r12 = 1
            r8.<init>(r10, r12)
            p568fn.C17782b.m29884s(r0, r8, r4, r5)
        L_0x0256:
            boolean r3 = r3.f41620p
            if (r3 == 0) goto L_0x0262
            si.a r3 = new si.a
            r3.<init>()
            r0.setSpan(r3, r4, r5, r7)
        L_0x0262:
            int r2 = r2 + 1
            goto L_0x0171
        L_0x0266:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p710xi.C18777g.m31681a(android.text.SpannableStringBuilder, xi.g$b, java.lang.String, java.util.List, java.util.List):void");
    }

    /* renamed from: b */
    public static ArrayList m31682b(List list, String str, C18779b bVar) {
        int i;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C18774d dVar = (C18774d) list.get(i2);
            String str2 = bVar.f41631a;
            Set<String> set = bVar.f41634d;
            String str3 = bVar.f41633c;
            if (!dVar.f41605a.isEmpty() || !dVar.f41606b.isEmpty() || !dVar.f41607c.isEmpty() || !dVar.f41608d.isEmpty()) {
                int a = C18774d.m31680a(dVar.f41608d, C18774d.m31680a(dVar.f41606b, C18774d.m31680a(dVar.f41605a, 0, 1073741824, str), 2, str2), 4, str3);
                i = (a == -1 || !set.containsAll(dVar.f41607c)) ? 0 : a + (dVar.f41607c.size() * 4);
            } else {
                i = TextUtils.isEmpty(str2);
            }
            if (i > 0) {
                arrayList.add(new C18780c(i, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public static int m31683c(List<C18774d> list, String str, C18779b bVar) {
        ArrayList b = m31682b(list, str, bVar);
        for (int i = 0; i < b.size(); i++) {
            int i2 = ((C18780c) b.get(i)).f41636c.f41619o;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static C18775e m31684d(String str, Matcher matcher, C14077r rVar, ArrayList arrayList) {
        C18781d dVar = new C18781d();
        try {
            String group = matcher.group(1);
            group.getClass();
            dVar.f41637a = C18783i.m31693c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            dVar.f41638b = C18783i.m31693c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            m31685e(group3, dVar);
            StringBuilder sb = new StringBuilder();
            String d = rVar.mo46913d();
            while (!TextUtils.isEmpty(d)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(d.trim());
                d = rVar.mo46913d();
            }
            dVar.f41639c = m31686f(str, sb.toString(), arrayList);
            return new C18775e(dVar.mo70259a().mo69838a(), dVar.f41637a, dVar.f41638b);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(matcher.group());
            Log.w("WebvttCueParser", valueOf.length() != 0 ? "Skipping cue with bad header: ".concat(valueOf) : new String("Skipping cue with bad header: "));
            return null;
        }
    }

    /* renamed from: e */
    public static void m31685e(String str, C18781d dVar) {
        Matcher matcher = f41625b.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    m31687g(group2, dVar);
                } else if ("align".equals(group)) {
                    char c = 65535;
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 100571:
                            if (group2.equals(ResponseConstants.PROMOTION_END)) {
                                c = 2;
                                break;
                            }
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 109757538:
                            if (group2.equals("start")) {
                                c = 5;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                        case 1:
                            break;
                        case 2:
                            i = 3;
                            break;
                        case 3:
                            i = 4;
                            break;
                        case 4:
                            i = 5;
                            break;
                        case 5:
                            break;
                        default:
                            Log.w("WebvttCueParser", group2.length() != 0 ? "Invalid alignment value: ".concat(group2) : new String("Invalid alignment value: "));
                            break;
                    }
                    i = 2;
                    dVar.f41640d = i;
                    continue;
                } else if ("position".equals(group)) {
                    m31688h(group2, dVar);
                } else if (ResponseConstants.SIZE.equals(group)) {
                    dVar.f41646j = C18783i.m31692b(group2);
                } else if ("vertical".equals(group)) {
                    if (group2.equals("lr")) {
                        i = 2;
                    } else if (!group2.equals("rl")) {
                        Log.w("WebvttCueParser", group2.length() != 0 ? "Invalid 'vertical' value: ".concat(group2) : new String("Invalid 'vertical' value: "));
                        i = Integer.MIN_VALUE;
                    }
                    dVar.f41647k = i;
                } else {
                    StringBuilder sb = new StringBuilder(group.length() + 21 + group2.length());
                    sb.append("Unknown cue setting ");
                    sb.append(group);
                    sb.append(MessageDraft.IMAGE_DELIMITER);
                    sb.append(group2);
                    Log.w("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                String valueOf = String.valueOf(matcher.group());
                Log.w("WebvttCueParser", valueOf.length() != 0 ? "Skipping bad cue setting: ".concat(valueOf) : new String("Skipping bad cue setting: "));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012b  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.SpannedString m31686f(java.lang.String r17, java.lang.String r18, java.util.List<p710xi.C18774d> r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            r7 = r6
        L_0x0017:
            int r8 = r18.length()
            java.lang.String r9 = ""
            if (r7 >= r8) goto L_0x0243
            char r8 = r1.charAt(r7)
            java.lang.String r10 = " "
            r11 = 62
            r12 = 60
            r13 = 38
            r15 = 2
            r14 = -1
            r16 = 1
            if (r8 == r13) goto L_0x01a9
            if (r8 == r12) goto L_0x003a
            r3.append(r8)
            int r7 = r7 + 1
            goto L_0x0240
        L_0x003a:
            int r8 = r7 + 1
            int r12 = r18.length()
            if (r8 < r12) goto L_0x0044
            goto L_0x01a6
        L_0x0044:
            char r12 = r1.charAt(r8)
            r13 = 47
            if (r12 != r13) goto L_0x004f
            r12 = r16
            goto L_0x0050
        L_0x004f:
            r12 = r6
        L_0x0050:
            int r8 = r1.indexOf(r11, r8)
            if (r8 != r14) goto L_0x005b
            int r8 = r18.length()
            goto L_0x005d
        L_0x005b:
            int r8 = r8 + 1
        L_0x005d:
            int r11 = r8 + -2
            char r14 = r1.charAt(r11)
            if (r14 != r13) goto L_0x0068
            r13 = r16
            goto L_0x0069
        L_0x0068:
            r13 = r6
        L_0x0069:
            if (r12 == 0) goto L_0x006d
            r14 = r15
            goto L_0x006f
        L_0x006d:
            r14 = r16
        L_0x006f:
            int r7 = r7 + r14
            if (r13 == 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            int r11 = r8 + -1
        L_0x0075:
            java.lang.String r7 = r1.substring(r7, r11)
            java.lang.String r11 = r7.trim()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0085
            goto L_0x0128
        L_0x0085:
            java.lang.String r11 = r7.trim()
            boolean r14 = r11.isEmpty()
            r14 = r14 ^ 1
            p513bj.C14075p.m21691c(r14)
            int r14 = p513bj.C14049b0.f30913a
            java.lang.String r14 = "[ \\.]"
            java.lang.String[] r11 = r11.split(r14, r15)
            r11 = r11[r6]
            r11.getClass()
            int r14 = r11.hashCode()
            r15 = 98
            if (r14 == r15) goto L_0x0114
            r15 = 99
            if (r14 == r15) goto L_0x0108
            r15 = 105(0x69, float:1.47E-43)
            if (r14 == r15) goto L_0x00fd
            r15 = 3650(0xe42, float:5.115E-42)
            if (r14 == r15) goto L_0x00f2
            r15 = 3314158(0x3291ee, float:4.644125E-39)
            if (r14 == r15) goto L_0x00e7
            r15 = 3511770(0x3595da, float:4.921038E-39)
            if (r14 == r15) goto L_0x00dc
            r15 = 117(0x75, float:1.64E-43)
            if (r14 == r15) goto L_0x00d1
            r15 = 118(0x76, float:1.65E-43)
            if (r14 == r15) goto L_0x00c6
            goto L_0x011c
        L_0x00c6:
            java.lang.String r14 = "v"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00cf
            goto L_0x011c
        L_0x00cf:
            r14 = 4
            goto L_0x011f
        L_0x00d1:
            java.lang.String r14 = "u"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00da
            goto L_0x011c
        L_0x00da:
            r14 = 3
            goto L_0x011f
        L_0x00dc:
            java.lang.String r14 = "ruby"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00e5
            goto L_0x011c
        L_0x00e5:
            r14 = 7
            goto L_0x011f
        L_0x00e7:
            java.lang.String r14 = "lang"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00f0
            goto L_0x011c
        L_0x00f0:
            r14 = 6
            goto L_0x011f
        L_0x00f2:
            java.lang.String r14 = "rt"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00fb
            goto L_0x011c
        L_0x00fb:
            r14 = 5
            goto L_0x011f
        L_0x00fd:
            java.lang.String r14 = "i"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x0106
            goto L_0x011c
        L_0x0106:
            r14 = 2
            goto L_0x011f
        L_0x0108:
            java.lang.String r14 = "c"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x0111
            goto L_0x011c
        L_0x0111:
            r14 = r16
            goto L_0x011f
        L_0x0114:
            java.lang.String r14 = "b"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x011e
        L_0x011c:
            r14 = -1
            goto L_0x011f
        L_0x011e:
            r14 = r6
        L_0x011f:
            switch(r14) {
                case 0: goto L_0x0124;
                case 1: goto L_0x0124;
                case 2: goto L_0x0124;
                case 3: goto L_0x0124;
                case 4: goto L_0x0124;
                case 5: goto L_0x0124;
                case 6: goto L_0x0124;
                case 7: goto L_0x0124;
                default: goto L_0x0122;
            }
        L_0x0122:
            r14 = r6
            goto L_0x0126
        L_0x0124:
            r14 = r16
        L_0x0126:
            if (r14 != 0) goto L_0x012b
        L_0x0128:
            r7 = r8
            goto L_0x0017
        L_0x012b:
            if (r12 == 0) goto L_0x015d
        L_0x012d:
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x0135
            goto L_0x01a6
        L_0x0135:
            java.lang.Object r7 = r4.pop()
            xi.g$b r7 = (p710xi.C18777g.C18779b) r7
            m31681a(r3, r7, r0, r5, r2)
            boolean r9 = r4.isEmpty()
            if (r9 != 0) goto L_0x0151
            xi.g$a r9 = new xi.g$a
            int r10 = r3.length()
            r9.<init>(r7, r10)
            r5.add(r9)
            goto L_0x0154
        L_0x0151:
            r5.clear()
        L_0x0154:
            java.lang.String r7 = r7.f41631a
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x012d
            goto L_0x01a6
        L_0x015d:
            if (r13 != 0) goto L_0x01a6
            int r11 = r3.length()
            java.lang.String r7 = r7.trim()
            boolean r12 = r7.isEmpty()
            r12 = r12 ^ 1
            p513bj.C14075p.m21691c(r12)
            int r10 = r7.indexOf(r10)
            r12 = -1
            if (r10 != r12) goto L_0x0178
            goto L_0x0184
        L_0x0178:
            java.lang.String r9 = r7.substring(r10)
            java.lang.String r9 = r9.trim()
            java.lang.String r7 = r7.substring(r6, r10)
        L_0x0184:
            java.lang.String r10 = "\\."
            java.lang.String[] r7 = r7.split(r10, r12)
            r10 = r7[r6]
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            r13 = r16
        L_0x0193:
            int r14 = r7.length
            if (r13 >= r14) goto L_0x019e
            r14 = r7[r13]
            r12.add(r14)
            int r13 = r13 + 1
            goto L_0x0193
        L_0x019e:
            xi.g$b r7 = new xi.g$b
            r7.<init>(r10, r11, r9, r12)
            r4.push(r7)
        L_0x01a6:
            r7 = r8
            goto L_0x0240
        L_0x01a9:
            r9 = 59
            int r7 = r7 + 1
            int r9 = r1.indexOf(r9, r7)
            r14 = 32
            int r15 = r1.indexOf(r14, r7)
            r6 = -1
            if (r9 != r6) goto L_0x01bc
            r9 = r15
            goto L_0x01c3
        L_0x01bc:
            if (r15 != r6) goto L_0x01bf
            goto L_0x01c3
        L_0x01bf:
            int r9 = java.lang.Math.min(r9, r15)
        L_0x01c3:
            if (r9 == r6) goto L_0x023d
            java.lang.String r7 = r1.substring(r7, r9)
            r7.getClass()
            int r8 = r7.hashCode()
            switch(r8) {
                case 3309: goto L_0x01f6;
                case 3464: goto L_0x01ea;
                case 96708: goto L_0x01df;
                case 3374865: goto L_0x01d4;
                default: goto L_0x01d3;
            }
        L_0x01d3:
            goto L_0x0200
        L_0x01d4:
            java.lang.String r8 = "nbsp"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x01dd
            goto L_0x0200
        L_0x01dd:
            r6 = 3
            goto L_0x0200
        L_0x01df:
            java.lang.String r8 = "amp"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x01e8
            goto L_0x0200
        L_0x01e8:
            r6 = 2
            goto L_0x0200
        L_0x01ea:
            java.lang.String r8 = "lt"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x01f3
            goto L_0x0200
        L_0x01f3:
            r6 = r16
            goto L_0x0200
        L_0x01f6:
            java.lang.String r8 = "gt"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x01ff
            goto L_0x0200
        L_0x01ff:
            r6 = 0
        L_0x0200:
            switch(r6) {
                case 0: goto L_0x0231;
                case 1: goto L_0x022d;
                case 2: goto L_0x0229;
                case 3: goto L_0x0225;
                default: goto L_0x0203;
            }
        L_0x0203:
            int r6 = r7.length()
            int r6 = r6 + 33
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            java.lang.String r6 = "ignoring unsupported entity: '&"
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = ";'"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            java.lang.String r7 = "WebvttCueParser"
            android.util.Log.w(r7, r6)
            goto L_0x0234
        L_0x0225:
            r3.append(r14)
            goto L_0x0234
        L_0x0229:
            r3.append(r13)
            goto L_0x0234
        L_0x022d:
            r3.append(r12)
            goto L_0x0234
        L_0x0231:
            r3.append(r11)
        L_0x0234:
            if (r9 != r15) goto L_0x0239
            r3.append(r10)
        L_0x0239:
            int r9 = r9 + 1
            r7 = r9
            goto L_0x0240
        L_0x023d:
            r3.append(r8)
        L_0x0240:
            r6 = 0
            goto L_0x0017
        L_0x0243:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0253
            java.lang.Object r1 = r4.pop()
            xi.g$b r1 = (p710xi.C18777g.C18779b) r1
            m31681a(r3, r1, r0, r5, r2)
            goto L_0x0243
        L_0x0253:
            xi.g$b r1 = new xi.g$b
            java.util.Set r4 = java.util.Collections.emptySet()
            r5 = 0
            r1.<init>(r9, r5, r9, r4)
            java.util.List r4 = java.util.Collections.emptyList()
            m31681a(r3, r1, r0, r4, r2)
            android.text.SpannedString r0 = android.text.SpannedString.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p710xi.C18777g.m31686f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    /* renamed from: g */
    public static void m31687g(String str, C18781d dVar) {
        int indexOf = str.indexOf(44);
        char c = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            int i = 2;
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals(ResponseConstants.PROMOTION_END)) {
                        c = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    i = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i = 0;
                    break;
                default:
                    Log.w("WebvttCueParser", substring.length() != 0 ? "Invalid anchor value: ".concat(substring) : new String("Invalid anchor value: "));
                    i = Integer.MIN_VALUE;
                    break;
            }
            dVar.f41643g = i;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            dVar.f41641e = C18783i.m31692b(str);
            dVar.f41642f = 0;
            return;
        }
        dVar.f41641e = (float) Integer.parseInt(str);
        dVar.f41642f = 1;
    }

    /* renamed from: h */
    public static void m31688h(String str, C18781d dVar) {
        int indexOf = str.indexOf(44);
        char c = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            int i = 2;
            switch (substring.hashCode()) {
                case -1842484672:
                    if (substring.equals("line-left")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1364013995:
                    if (substring.equals("center")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1276788989:
                    if (substring.equals("line-right")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c = 3;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals(ResponseConstants.PROMOTION_END)) {
                        c = 4;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 5:
                    i = 0;
                    break;
                case 1:
                case 3:
                    i = 1;
                    break;
                case 2:
                case 4:
                    break;
                default:
                    Log.w("WebvttCueParser", substring.length() != 0 ? "Invalid anchor value: ".concat(substring) : new String("Invalid anchor value: "));
                    i = Integer.MIN_VALUE;
                    break;
            }
            dVar.f41645i = i;
            str = str.substring(0, indexOf);
        }
        dVar.f41644h = C18783i.m31692b(str);
    }
}
