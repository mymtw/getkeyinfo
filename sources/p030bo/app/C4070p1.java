package p030bo.app;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19457k;
import org.json.JSONException;
import p753kq.C19846a;

/* renamed from: bo.app.p1 */
public final class C4070p1 implements C3689g2 {

    /* renamed from: b */
    public static final C4071a f9074b = new C4071a((DefaultConstructorMarker) null);

    /* renamed from: c */
    private static final int f9075c = ((int) TimeUnit.SECONDS.toMillis(15));

    /* renamed from: a */
    private final int f9076a;

    /* renamed from: bo.app.p1$a */
    public static final class C4071a {
        private C4071a() {
        }

        public /* synthetic */ C4071a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final InputStream m9360a(HttpURLConnection httpURLConnection) {
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode / 100 != 2) {
                StringBuilder h = C0069a.m177h("Bad HTTP response code from Braze: [", responseCode, "] to url: ");
                h.append(httpURLConnection.getURL());
                throw new C4036o3(h.toString());
            } else if (C19457k.m33019W0("gzip", httpURLConnection.getContentEncoding(), true)) {
                return new GZIPInputStream(httpURLConnection.getInputStream());
            } else {
                return new BufferedInputStream(httpURLConnection.getInputStream());
            }
        }
    }

    /* renamed from: bo.app.p1$b */
    public static final class C4072b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ JSONException f9077b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4072b(JSONException jSONException) {
            super(0);
            this.f9077b = jSONException;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Unable to parse json response from server. Response: [");
            h.append(this.f9077b);
            h.append(']');
            return h.toString();
        }
    }

    /* renamed from: bo.app.p1$c */
    public static final class C4073c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ URL f9078b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4073c(URL url) {
            super(0);
            this.f9078b = url;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Failed to get result from [");
            h.append(this.f9078b);
            h.append("].");
            return h.toString();
        }
    }

    public C4070p1(int i) {
        this.f9076a = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ca, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        kotlin.reflect.C19421p.m32917E(r2, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ce, code lost:
        throw r14;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlin.Pair<org.json.JSONObject, java.util.Map<java.lang.String, java.lang.String>> mo13326a(p030bo.app.C4179s4 r12, java.util.Map<java.lang.String, java.lang.String> r13, org.json.JSONObject r14) {
        /*
            r11 = this;
            java.lang.String r0 = "requestTarget"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            java.lang.String r0 = "requestHeaders"
            kotlin.jvm.internal.C19383o.m32797g(r13, r0)
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.C19383o.m32797g(r14, r0)
            r0 = 1337(0x539, float:1.874E-42)
            android.net.TrafficStats.setThreadStatsTag(r0)
            java.net.URL r12 = r12.mo14061b()
            r0 = 93
            java.net.HttpURLConnection r13 = r11.m9357a((java.net.URL) r12, (org.json.JSONObject) r14, (java.util.Map<java.lang.String, java.lang.String>) r13)     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            bo.app.p1$a r14 = f9074b     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            java.io.InputStream r14 = r14.m9360a(r13)     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            java.nio.charset.Charset r1 = kotlin.text.C19446a.f43373b     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            r2.<init>(r14, r1)     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            r14 = 8192(0x2000, float:1.14794E-41)
            boolean r1 = r2 instanceof java.io.BufferedReader     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            if (r1 == 0) goto L_0x0034
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            goto L_0x003a
        L_0x0034:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            r1.<init>(r2, r14)     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            r2 = r1
        L_0x003a:
            r14 = 0
            java.lang.String r1 = kotlinx.coroutines.C19543e0.m33313f0(r2)     // Catch:{ all -> 0x00c8 }
            kotlin.reflect.C19421p.m32917E(r2, r14)     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            r14.<init>(r1)     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            java.util.Map r13 = r13.getHeaderFields()     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            java.lang.String r1 = "connection.headerFields"
            kotlin.jvm.internal.C19383o.m32796f(r13, r1)     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            r1.<init>()     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            java.util.Set r13 = r13.entrySet()     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
        L_0x005d:
            boolean r2 = r13.hasNext()     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            if (r2 == 0) goto L_0x0080
            java.lang.Object r2 = r13.next()     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            java.lang.Object r3 = r2.getKey()     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            if (r3 == 0) goto L_0x0071
            r3 = 1
            goto L_0x0072
        L_0x0071:
            r3 = 0
        L_0x0072:
            if (r3 == 0) goto L_0x005d
            java.lang.Object r3 = r2.getKey()     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            java.lang.Object r2 = r2.getValue()     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            r1.put(r3, r2)     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            goto L_0x005d
        L_0x0080:
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            int r2 = r1.size()     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            int r2 = kotlin.reflect.C19421p.m32930T(r2)     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            r13.<init>(r2)     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            java.util.Set r1 = r1.entrySet()     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
        L_0x0095:
            boolean r2 = r1.hasNext()     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            if (r2 == 0) goto L_0x00c2
            java.lang.Object r2 = r1.next()     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            r3 = r2
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            java.lang.Object r3 = r3.getKey()     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            java.lang.Object r2 = r2.getValue()     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            java.lang.String r4 = "it.value"
            kotlin.jvm.internal.C19383o.m32796f(r2, r4)     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            r5 = r2
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 63
            java.lang.String r2 = kotlin.collections.C19327t.m32644Z0(r5, r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            r13.put(r3, r2)     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            goto L_0x0095
        L_0x00c2:
            kotlin.Pair r1 = new kotlin.Pair     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            r1.<init>(r14, r13)     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            return r1
        L_0x00c8:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r14 = move-exception
            kotlin.reflect.C19421p.m32917E(r2, r13)     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
            throw r14     // Catch:{ IOException -> 0x0108, JSONException -> 0x00cf }
        L_0x00cf:
            r13 = move-exception
            com.braze.support.BrazeLogger r14 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.E
            bo.app.p1$b r5 = new bo.app.p1$b
            r5.<init>(r13)
            r13 = 0
            r7 = 6
            r4 = 0
            r6 = 6
            r1 = r14
            r2 = r11
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            bo.app.p1$c r5 = new bo.app.p1$c
            r5.<init>(r12)
            r4 = r13
            r6 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r1 = "Failed to get result from ["
            r14.append(r1)
            r14.append(r12)
            r14.append(r0)
            java.lang.String r12 = r14.toString()
            r13.<init>(r12)
            throw r13
        L_0x0108:
            r13 = move-exception
            bo.app.o3 r14 = new bo.app.o3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed request to ["
            r1.append(r2)
            r1.append(r12)
            java.lang.String r12 = "], with message: ["
            r1.append(r12)
            java.lang.String r12 = r13.getMessage()
            r1.append(r12)
            r1.append(r0)
            java.lang.String r12 = r1.toString()
            r14.<init>(r12, r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C4070p1.mo13326a(bo.app.s4, java.util.Map, org.json.JSONObject):kotlin.Pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0075, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0076, code lost:
        kotlin.reflect.C19421p.m32917E(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0079, code lost:
        throw r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.net.HttpURLConnection m9357a(java.net.URL r3, org.json.JSONObject r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            r2 = this;
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "payload.toString()"
            kotlin.jvm.internal.C19383o.m32796f(r4, r0)
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.lang.String r1 = "forName(charsetName)"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            byte[] r4 = r4.getBytes(r0)
            java.lang.String r0 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.C19383o.m32796f(r4, r0)
            bo.app.p6 r0 = p030bo.app.C4079p6.f9086a
            java.net.HttpURLConnection r3 = r0.mo13882a(r3)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x002b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.setRequestProperty(r1, r0)
            goto L_0x002b
        L_0x0047:
            int r5 = f9075c
            r3.setConnectTimeout(r5)
            int r5 = r2.f9076a
            r3.setReadTimeout(r5)
            r5 = 0
            r3.setUseCaches(r5)
            r3.setInstanceFollowRedirects(r5)
            java.lang.String r5 = "POST"
            r3.setRequestMethod(r5)
            r5 = 1
            r3.setDoOutput(r5)
            int r5 = r4.length
            r3.setFixedLengthStreamingMode(r5)
            java.io.OutputStream r5 = r3.getOutputStream()
            r0 = 0
            r5.write(r4)     // Catch:{ all -> 0x0073 }
            kotlin.m r4 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0073 }
            kotlin.reflect.C19421p.m32917E(r5, r0)
            return r3
        L_0x0073:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r4 = move-exception
            kotlin.reflect.C19421p.m32917E(r5, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C4070p1.m9357a(java.net.URL, org.json.JSONObject, java.util.Map):java.net.HttpURLConnection");
    }
}
