package p584hn;

import android.content.Context;
import com.google.firebase.perf.p530v1.NetworkRequestMetric;
import p568fn.C17781a;

/* renamed from: hn.c */
public final class C17832c extends C17834e {

    /* renamed from: c */
    public static final C17781a f38746c = C17781a.m29823d();

    /* renamed from: a */
    public final NetworkRequestMetric f38747a;

    /* renamed from: b */
    public final Context f38748b;

    public C17832c(NetworkRequestMetric networkRequestMetric, Context context) {
        this.f38748b = context;
        this.f38747a = networkRequestMetric;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo69066a() {
        /*
            r9 = this;
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f38747a
            java.lang.String r0 = r0.mo59380X()
            r1 = 1
            if (r0 != 0) goto L_0x000b
            r0 = r1
            goto L_0x0013
        L_0x000b:
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
        L_0x0013:
            r2 = 0
            if (r0 == 0) goto L_0x002f
            fn.a r0 = f38746c
            java.lang.String r1 = "URL is missing:"
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            com.google.firebase.perf.v1.NetworkRequestMetric r3 = r9.f38747a
            java.lang.String r3 = r3.mo59380X()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.mo69018f(r1)
            return r2
        L_0x002f:
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f38747a
            java.lang.String r0 = r0.mo59380X()
            r3 = 0
            if (r0 != 0) goto L_0x0039
            goto L_0x0050
        L_0x0039:
            java.net.URI r0 = java.net.URI.create(r0)     // Catch:{ IllegalArgumentException -> 0x0040, IllegalStateException -> 0x003e }
            goto L_0x0051
        L_0x003e:
            r0 = move-exception
            goto L_0x0041
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            fn.a r4 = f38746c
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r0 = r0.getMessage()
            r5[r2] = r0
            java.lang.String r0 = "getResultUrl throws exception %s"
            r4.mo69019g(r0, r5)
        L_0x0050:
            r0 = r3
        L_0x0051:
            if (r0 != 0) goto L_0x005b
            fn.a r0 = f38746c
            java.lang.String r1 = "URL cannot be parsed"
            r0.mo69018f(r1)
            return r2
        L_0x005b:
            android.content.Context r4 = r9.f38748b
            android.content.res.Resources r5 = r4.getResources()
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r6 = "firebase_performance_whitelisted_domains"
            java.lang.String r7 = "array"
            int r4 = r5.getIdentifier(r6, r7, r4)
            if (r4 != 0) goto L_0x0070
            goto L_0x0098
        L_0x0070:
            fn.a r6 = p568fn.C17781a.m29823d()
            java.lang.String r7 = "Detected domain allowlist, only allowlisted domains will be measured."
            r6.mo69014a(r7)
            java.lang.String[] r6 = com.google.android.play.core.appupdate.C15562d.f35018c
            if (r6 != 0) goto L_0x0083
            java.lang.String[] r4 = r5.getStringArray(r4)
            com.google.android.play.core.appupdate.C15562d.f35018c = r4
        L_0x0083:
            java.lang.String r4 = r0.getHost()
            if (r4 != 0) goto L_0x008a
            goto L_0x0098
        L_0x008a:
            java.lang.String[] r5 = com.google.android.play.core.appupdate.C15562d.f35018c
            int r6 = r5.length
            r7 = r2
        L_0x008e:
            if (r7 >= r6) goto L_0x009d
            r8 = r5[r7]
            boolean r8 = r4.contains(r8)
            if (r8 == 0) goto L_0x009a
        L_0x0098:
            r4 = r1
            goto L_0x009e
        L_0x009a:
            int r7 = r7 + 1
            goto L_0x008e
        L_0x009d:
            r4 = r2
        L_0x009e:
            if (r4 != 0) goto L_0x00b7
            fn.a r1 = f38746c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "URL fails allowlist rule: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.mo69018f(r0)
            return r2
        L_0x00b7:
            java.lang.String r4 = r0.getHost()
            if (r4 == 0) goto L_0x00d1
            java.lang.String r5 = r4.trim()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x00d1
            int r4 = r4.length()
            r5 = 255(0xff, float:3.57E-43)
            if (r4 > r5) goto L_0x00d1
            r4 = r1
            goto L_0x00d2
        L_0x00d1:
            r4 = r2
        L_0x00d2:
            if (r4 != 0) goto L_0x00dc
            fn.a r0 = f38746c
            java.lang.String r1 = "URL host is null or invalid"
            r0.mo69018f(r1)
            return r2
        L_0x00dc:
            java.lang.String r4 = r0.getScheme()
            if (r4 != 0) goto L_0x00e3
            goto L_0x00f4
        L_0x00e3:
            java.lang.String r5 = "http"
            boolean r5 = r5.equalsIgnoreCase(r4)
            if (r5 != 0) goto L_0x00f6
            java.lang.String r5 = "https"
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x00f4
            goto L_0x00f6
        L_0x00f4:
            r4 = r2
            goto L_0x00f7
        L_0x00f6:
            r4 = r1
        L_0x00f7:
            if (r4 != 0) goto L_0x0101
            fn.a r0 = f38746c
            java.lang.String r1 = "URL scheme is null or invalid"
            r0.mo69018f(r1)
            return r2
        L_0x0101:
            java.lang.String r4 = r0.getUserInfo()
            if (r4 != 0) goto L_0x0109
            r4 = r1
            goto L_0x010a
        L_0x0109:
            r4 = r2
        L_0x010a:
            if (r4 != 0) goto L_0x0114
            fn.a r0 = f38746c
            java.lang.String r1 = "URL user info is null"
            r0.mo69018f(r1)
            return r2
        L_0x0114:
            int r0 = r0.getPort()
            r4 = -1
            if (r0 == r4) goto L_0x0120
            if (r0 <= 0) goto L_0x011e
            goto L_0x0120
        L_0x011e:
            r0 = r2
            goto L_0x0121
        L_0x0120:
            r0 = r1
        L_0x0121:
            if (r0 != 0) goto L_0x012b
            fn.a r0 = f38746c
            java.lang.String r1 = "URL port is less than or equal to 0"
            r0.mo69018f(r1)
            return r2
        L_0x012b:
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f38747a
            boolean r0 = r0.mo59382Z()
            if (r0 == 0) goto L_0x0139
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f38747a
            com.google.firebase.perf.v1.NetworkRequestMetric$HttpMethod r3 = r0.mo59372P()
        L_0x0139:
            if (r3 == 0) goto L_0x0141
            com.google.firebase.perf.v1.NetworkRequestMetric$HttpMethod r0 = com.google.firebase.perf.p530v1.NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN
            if (r3 == r0) goto L_0x0141
            r0 = r1
            goto L_0x0142
        L_0x0141:
            r0 = r2
        L_0x0142:
            if (r0 != 0) goto L_0x015d
            fn.a r0 = f38746c
            java.lang.String r1 = "HTTP Method is null or invalid: "
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            com.google.firebase.perf.v1.NetworkRequestMetric r3 = r9.f38747a
            com.google.firebase.perf.v1.NetworkRequestMetric$HttpMethod r3 = r3.mo59372P()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.mo69018f(r1)
            return r2
        L_0x015d:
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f38747a
            boolean r0 = r0.mo59383a0()
            if (r0 == 0) goto L_0x018b
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f38747a
            int r0 = r0.mo59373Q()
            if (r0 <= 0) goto L_0x016f
            r0 = r1
            goto L_0x0170
        L_0x016f:
            r0 = r2
        L_0x0170:
            if (r0 != 0) goto L_0x018b
            fn.a r0 = f38746c
            java.lang.String r1 = "HTTP ResponseCode is a negative value:"
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            com.google.firebase.perf.v1.NetworkRequestMetric r3 = r9.f38747a
            int r3 = r3.mo59373Q()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.mo69018f(r1)
            return r2
        L_0x018b:
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f38747a
            boolean r0 = r0.mo59384b0()
            r3 = 0
            if (r0 == 0) goto L_0x01bd
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f38747a
            long r5 = r0.mo59375S()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x01a1
            r0 = r1
            goto L_0x01a2
        L_0x01a1:
            r0 = r2
        L_0x01a2:
            if (r0 != 0) goto L_0x01bd
            fn.a r0 = f38746c
            java.lang.String r1 = "Request Payload is a negative value:"
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            com.google.firebase.perf.v1.NetworkRequestMetric r3 = r9.f38747a
            long r3 = r3.mo59375S()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.mo69018f(r1)
            return r2
        L_0x01bd:
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f38747a
            boolean r0 = r0.mo59385c0()
            if (r0 == 0) goto L_0x01ed
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f38747a
            long r5 = r0.mo59376T()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x01d1
            r0 = r1
            goto L_0x01d2
        L_0x01d1:
            r0 = r2
        L_0x01d2:
            if (r0 != 0) goto L_0x01ed
            fn.a r0 = f38746c
            java.lang.String r1 = "Response Payload is a negative value:"
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            com.google.firebase.perf.v1.NetworkRequestMetric r3 = r9.f38747a
            long r3 = r3.mo59376T()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.mo69018f(r1)
            return r2
        L_0x01ed:
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f38747a
            boolean r0 = r0.mo59381Y()
            if (r0 == 0) goto L_0x029e
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f38747a
            long r5 = r0.mo59371N()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0201
            goto L_0x029e
        L_0x0201:
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f38747a
            boolean r0 = r0.mo59386d0()
            if (r0 == 0) goto L_0x0231
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f38747a
            long r5 = r0.mo59377U()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0215
            r0 = r1
            goto L_0x0216
        L_0x0215:
            r0 = r2
        L_0x0216:
            if (r0 != 0) goto L_0x0231
            fn.a r0 = f38746c
            java.lang.String r1 = "Time to complete the request is a negative value:"
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            com.google.firebase.perf.v1.NetworkRequestMetric r3 = r9.f38747a
            long r3 = r3.mo59377U()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.mo69018f(r1)
            return r2
        L_0x0231:
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f38747a
            boolean r0 = r0.mo59388f0()
            if (r0 == 0) goto L_0x0261
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f38747a
            long r5 = r0.mo59379W()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0245
            r0 = r1
            goto L_0x0246
        L_0x0245:
            r0 = r2
        L_0x0246:
            if (r0 != 0) goto L_0x0261
            fn.a r0 = f38746c
            java.lang.String r1 = "Time from the start of the request to the start of the response is null or a negative value:"
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            com.google.firebase.perf.v1.NetworkRequestMetric r3 = r9.f38747a
            long r3 = r3.mo59379W()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.mo69018f(r1)
            return r2
        L_0x0261:
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f38747a
            boolean r0 = r0.mo59387e0()
            if (r0 == 0) goto L_0x0285
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f38747a
            long r5 = r0.mo59378V()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0274
            goto L_0x0285
        L_0x0274:
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f38747a
            boolean r0 = r0.mo59383a0()
            if (r0 != 0) goto L_0x0284
            fn.a r0 = f38746c
            java.lang.String r1 = "Did not receive a HTTP Response Code"
            r0.mo69018f(r1)
            return r2
        L_0x0284:
            return r1
        L_0x0285:
            fn.a r0 = f38746c
            java.lang.String r1 = "Time from the start of the request to the end of the response is null, negative or zero:"
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            com.google.firebase.perf.v1.NetworkRequestMetric r3 = r9.f38747a
            long r3 = r3.mo59378V()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.mo69018f(r1)
            return r2
        L_0x029e:
            fn.a r0 = f38746c
            java.lang.String r1 = "Start time of the request is null, or zero, or a negative value:"
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            com.google.firebase.perf.v1.NetworkRequestMetric r3 = r9.f38747a
            long r3 = r3.mo59371N()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.mo69018f(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p584hn.C17832c.mo69066a():boolean");
    }
}
