package okhttp3;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;

/* renamed from: okhttp3.d */
public final class C19941d {

    /* renamed from: n */
    public static final C19941d f43998n;

    /* renamed from: o */
    public static final C19943b f43999o = new C19943b();

    /* renamed from: a */
    public final boolean f44000a;

    /* renamed from: b */
    public final boolean f44001b;

    /* renamed from: c */
    public final int f44002c;

    /* renamed from: d */
    public final int f44003d;

    /* renamed from: e */
    public final boolean f44004e;

    /* renamed from: f */
    public final boolean f44005f;

    /* renamed from: g */
    public final boolean f44006g;

    /* renamed from: h */
    public final int f44007h;

    /* renamed from: i */
    public final int f44008i;

    /* renamed from: j */
    public final boolean f44009j;

    /* renamed from: k */
    public final boolean f44010k;

    /* renamed from: l */
    public final boolean f44011l;

    /* renamed from: m */
    public String f44012m;

    /* renamed from: okhttp3.d$a */
    public static final class C19942a {

        /* renamed from: a */
        public boolean f44013a;

        /* renamed from: b */
        public boolean f44014b;

        /* renamed from: c */
        public int f44015c = -1;

        /* renamed from: d */
        public int f44016d = -1;

        /* renamed from: e */
        public int f44017e = -1;

        /* renamed from: f */
        public boolean f44018f;

        /* renamed from: a */
        public final C19941d mo72856a() {
            return new C19941d(this.f44013a, this.f44014b, this.f44015c, -1, false, false, false, this.f44016d, this.f44017e, this.f44018f, false, false, (String) null);
        }
    }

    /* renamed from: okhttp3.d$b */
    public static final class C19943b {
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static okhttp3.C19941d m34097a(okhttp3.C19994o r25) {
            /*
                r0 = r25
                java.lang.String r1 = "headers"
                kotlin.jvm.internal.C19383o.m32797g(r0, r1)
                java.lang.String[] r1 = r0.f44235b
                int r1 = r1.length
                int r1 = r1 / 2
                r4 = 1
                r7 = r4
                r6 = 0
                r8 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L_0x0022:
                if (r6 >= r1) goto L_0x01b2
                java.lang.String r9 = r0.mo72949c(r6)
                java.lang.String r2 = r0.mo72955m(r6)
                java.lang.String r3 = "Cache-Control"
                boolean r3 = kotlin.text.C19457k.m33019W0(r9, r3, r4)
                if (r3 == 0) goto L_0x0039
                if (r8 == 0) goto L_0x0037
                goto L_0x0041
            L_0x0037:
                r8 = r2
                goto L_0x0042
            L_0x0039:
                java.lang.String r3 = "Pragma"
                boolean r3 = kotlin.text.C19457k.m33019W0(r9, r3, r4)
                if (r3 == 0) goto L_0x01a5
            L_0x0041:
                r7 = 0
            L_0x0042:
                r3 = 0
            L_0x0043:
                int r9 = r2.length()
                if (r3 >= r9) goto L_0x01a5
                int r9 = r2.length()
                r4 = r3
            L_0x004e:
                if (r4 >= r9) goto L_0x0062
                char r5 = r2.charAt(r4)
                java.lang.String r0 = "=,;"
                boolean r0 = kotlin.text.C19459m.m33037f1(r0, r5)
                if (r0 == 0) goto L_0x005d
                goto L_0x0066
            L_0x005d:
                int r4 = r4 + 1
                r0 = r25
                goto L_0x004e
            L_0x0062:
                int r4 = r2.length()
            L_0x0066:
                java.lang.String r0 = r2.substring(r3, r4)
                java.lang.String r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.C19383o.m32796f(r0, r3)
                java.lang.CharSequence r0 = kotlin.text.C19459m.m33035H1(r0)
                java.lang.String r0 = r0.toString()
                int r5 = r2.length()
                if (r4 == r5) goto L_0x0106
                char r5 = r2.charAt(r4)
                r9 = 44
                if (r5 == r9) goto L_0x0106
                char r5 = r2.charAt(r4)
                r9 = 59
                if (r5 != r9) goto L_0x008f
                goto L_0x0106
            L_0x008f:
                int r4 = r4 + 1
                byte[] r5 = p735br.C18980c.f42301a
                int r5 = r2.length()
            L_0x0097:
                if (r4 >= r5) goto L_0x00ad
                char r9 = r2.charAt(r4)
                r23 = r1
                r1 = 32
                if (r9 == r1) goto L_0x00a8
                r1 = 9
                if (r9 == r1) goto L_0x00a8
                goto L_0x00b3
            L_0x00a8:
                int r4 = r4 + 1
                r1 = r23
                goto L_0x0097
            L_0x00ad:
                r23 = r1
                int r4 = r2.length()
            L_0x00b3:
                int r1 = r2.length()
                if (r4 >= r1) goto L_0x00d4
                char r1 = r2.charAt(r4)
                r5 = 34
                if (r1 != r5) goto L_0x00d4
                int r4 = r4 + 1
                r1 = 4
                r9 = 0
                int r1 = kotlin.text.C19459m.m33042k1(r2, r5, r4, r9, r1)
                java.lang.String r4 = r2.substring(r4, r1)
                kotlin.jvm.internal.C19383o.m32796f(r4, r3)
                r3 = 1
                int r1 = r1 + r3
                r3 = r1
                goto L_0x010c
            L_0x00d4:
                r9 = 0
                int r1 = r2.length()
                r5 = r4
            L_0x00da:
                if (r5 >= r1) goto L_0x00f1
                char r9 = r2.charAt(r5)
                r24 = r1
                java.lang.String r1 = ",;"
                boolean r1 = kotlin.text.C19459m.m33037f1(r1, r9)
                if (r1 == 0) goto L_0x00eb
                goto L_0x00f5
            L_0x00eb:
                int r5 = r5 + 1
                r1 = r24
                r9 = 0
                goto L_0x00da
            L_0x00f1:
                int r5 = r2.length()
            L_0x00f5:
                java.lang.String r1 = r2.substring(r4, r5)
                kotlin.jvm.internal.C19383o.m32796f(r1, r3)
                java.lang.CharSequence r1 = kotlin.text.C19459m.m33035H1(r1)
                java.lang.String r4 = r1.toString()
                r3 = r5
                goto L_0x010c
            L_0x0106:
                r23 = r1
                int r4 = r4 + 1
                r3 = r4
                r4 = 0
            L_0x010c:
                java.lang.String r1 = "no-cache"
                r5 = 1
                boolean r1 = kotlin.text.C19457k.m33019W0(r1, r0, r5)
                if (r1 == 0) goto L_0x0117
                r10 = r5
                goto L_0x016d
            L_0x0117:
                java.lang.String r1 = "no-store"
                boolean r1 = kotlin.text.C19457k.m33019W0(r1, r0, r5)
                if (r1 == 0) goto L_0x0121
                r11 = r5
                goto L_0x016d
            L_0x0121:
                java.lang.String r1 = "max-age"
                boolean r1 = kotlin.text.C19457k.m33019W0(r1, r0, r5)
                if (r1 == 0) goto L_0x0130
                r1 = -1
                int r12 = p735br.C18980c.m32119w(r1, r4)
                goto L_0x019e
            L_0x0130:
                r1 = -1
                java.lang.String r9 = "s-maxage"
                boolean r9 = kotlin.text.C19457k.m33019W0(r9, r0, r5)
                if (r9 == 0) goto L_0x013f
                int r13 = p735br.C18980c.m32119w(r1, r4)
                goto L_0x019e
            L_0x013f:
                java.lang.String r1 = "private"
                boolean r1 = kotlin.text.C19457k.m33019W0(r1, r0, r5)
                if (r1 == 0) goto L_0x0149
                r14 = r5
                goto L_0x016d
            L_0x0149:
                java.lang.String r1 = "public"
                boolean r1 = kotlin.text.C19457k.m33019W0(r1, r0, r5)
                if (r1 == 0) goto L_0x0153
                r15 = r5
                goto L_0x016d
            L_0x0153:
                java.lang.String r1 = "must-revalidate"
                boolean r1 = kotlin.text.C19457k.m33019W0(r1, r0, r5)
                if (r1 == 0) goto L_0x015e
                r16 = r5
                goto L_0x016d
            L_0x015e:
                java.lang.String r1 = "max-stale"
                boolean r1 = kotlin.text.C19457k.m33019W0(r1, r0, r5)
                if (r1 == 0) goto L_0x016f
                r0 = 2147483647(0x7fffffff, float:NaN)
                int r17 = p735br.C18980c.m32119w(r0, r4)
            L_0x016d:
                r1 = -1
                goto L_0x019e
            L_0x016f:
                java.lang.String r1 = "min-fresh"
                boolean r1 = kotlin.text.C19457k.m33019W0(r1, r0, r5)
                if (r1 == 0) goto L_0x017d
                r1 = -1
                int r18 = p735br.C18980c.m32119w(r1, r4)
                goto L_0x019e
            L_0x017d:
                r1 = -1
                java.lang.String r4 = "only-if-cached"
                boolean r4 = kotlin.text.C19457k.m33019W0(r4, r0, r5)
                if (r4 == 0) goto L_0x0189
                r19 = r5
                goto L_0x019e
            L_0x0189:
                java.lang.String r4 = "no-transform"
                boolean r4 = kotlin.text.C19457k.m33019W0(r4, r0, r5)
                if (r4 == 0) goto L_0x0194
                r20 = r5
                goto L_0x019e
            L_0x0194:
                java.lang.String r4 = "immutable"
                boolean r0 = kotlin.text.C19457k.m33019W0(r4, r0, r5)
                if (r0 == 0) goto L_0x019e
                r21 = r5
            L_0x019e:
                r0 = r25
                r4 = r5
                r1 = r23
                goto L_0x0043
            L_0x01a5:
                r23 = r1
                r5 = r4
                r1 = -1
                int r6 = r6 + 1
                r0 = r25
                r4 = r5
                r1 = r23
                goto L_0x0022
            L_0x01b2:
                if (r7 != 0) goto L_0x01b7
                r22 = 0
                goto L_0x01b9
            L_0x01b7:
                r22 = r8
            L_0x01b9:
                okhttp3.d r0 = new okhttp3.d
                r9 = r0
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C19941d.C19943b.m34097a(okhttp3.o):okhttp3.d");
        }
    }

    static {
        C19942a aVar = new C19942a();
        aVar.f44013a = true;
        aVar.mo72856a();
        C19942a aVar2 = new C19942a();
        aVar2.f44018f = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C19383o.m32797g(timeUnit, "timeUnit");
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        long j = (long) Api.BaseClientBuilder.API_PRIORITY_OTHER;
        long seconds = timeUnit.toSeconds(j);
        if (seconds <= j) {
            i = (int) seconds;
        }
        aVar2.f44016d = i;
        f43998n = aVar2.mo72856a();
    }

    public C19941d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f44000a = z;
        this.f44001b = z2;
        this.f44002c = i;
        this.f44003d = i2;
        this.f44004e = z3;
        this.f44005f = z4;
        this.f44006g = z5;
        this.f44007h = i3;
        this.f44008i = i4;
        this.f44009j = z6;
        this.f44010k = z7;
        this.f44011l = z8;
        this.f44012m = str;
    }

    public final String toString() {
        String str = this.f44012m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f44000a) {
            sb.append("no-cache, ");
        }
        if (this.f44001b) {
            sb.append("no-store, ");
        }
        if (this.f44002c != -1) {
            sb.append("max-age=");
            sb.append(this.f44002c);
            sb.append(", ");
        }
        if (this.f44003d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f44003d);
            sb.append(", ");
        }
        if (this.f44004e) {
            sb.append("private, ");
        }
        if (this.f44005f) {
            sb.append("public, ");
        }
        if (this.f44006g) {
            sb.append("must-revalidate, ");
        }
        if (this.f44007h != -1) {
            sb.append("max-stale=");
            sb.append(this.f44007h);
            sb.append(", ");
        }
        if (this.f44008i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f44008i);
            sb.append(", ");
        }
        if (this.f44009j) {
            sb.append("only-if-cached, ");
        }
        if (this.f44010k) {
            sb.append("no-transform, ");
        }
        if (this.f44011l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f44012m = sb2;
        return sb2;
    }
}
