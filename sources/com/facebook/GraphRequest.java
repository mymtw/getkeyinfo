package com.facebook;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.text.TextUtils;
import android.util.Pair;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0388a;
import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.cardviewelement.BaseMessage;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.DetailsBottomSheetNavigationKey;
import com.facebook.GraphResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19446a;
import kotlin.text.C19457k;
import org.apache.commons.cli.HelpFormatter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0023f;
import p010a9.C0048b;
import p365hg.C12845c0;
import p365hg.C12865g0;
import p365hg.C12869i0;
import p365hg.C12879l0;
import p453tf.C13418j;
import p453tf.C13425o;
import p453tf.C13426p;
import p453tf.C13436u;
import p453tf.C13439w;

public final class GraphRequest {

    /* renamed from: k */
    public static final String f27220k = GraphRequest.class.getSimpleName();

    /* renamed from: l */
    public static final String f27221l;

    /* renamed from: m */
    public static final Pattern f27222m = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");

    /* renamed from: n */
    public static volatile String f27223n;

    /* renamed from: o */
    public static final C12196c f27224o = new C12196c();

    /* renamed from: a */
    public AccessToken f27225a;

    /* renamed from: b */
    public String f27226b;

    /* renamed from: c */
    public JSONObject f27227c;

    /* renamed from: d */
    public Bundle f27228d;

    /* renamed from: e */
    public Object f27229e;

    /* renamed from: f */
    public String f27230f;

    /* renamed from: g */
    public C12195b f27231g;

    /* renamed from: h */
    public HttpMethod f27232h;

    /* renamed from: i */
    public boolean f27233i;

    /* renamed from: j */
    public boolean f27234j;

    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new GraphRequest$ParcelableResourceWithMimeType$Companion$CREATOR$1();
        public static final C12193a Companion = new C12193a();
        private final String mimeType;
        private final RESOURCE resource;

        /* renamed from: com.facebook.GraphRequest$ParcelableResourceWithMimeType$a */
        public static final class C12193a {
        }

        public /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        public int describeContents() {
            return 1;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final RESOURCE getResource() {
            return this.resource;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19383o.m32797g(parcel, "out");
            parcel.writeString(this.mimeType);
            parcel.writeParcelable(this.resource, i);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource2, String str) {
            this.mimeType = str;
            this.resource = resource2;
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.mimeType = parcel.readString();
            this.resource = parcel.readParcelable(C13418j.m21106b().getClassLoader());
        }
    }

    /* renamed from: com.facebook.GraphRequest$a */
    public static final class C12194a {

        /* renamed from: a */
        public final GraphRequest f27235a;

        /* renamed from: b */
        public final Object f27236b;

        public C12194a(GraphRequest graphRequest, Object obj) {
            this.f27235a = graphRequest;
            this.f27236b = obj;
        }
    }

    /* renamed from: com.facebook.GraphRequest$b */
    public interface C12195b {
        /* renamed from: a */
        void mo39238a(GraphResponse graphResponse);
    }

    /* renamed from: com.facebook.GraphRequest$c */
    public static final class C12196c {
        /* renamed from: a */
        public static final String m20001a(C12196c cVar, Object obj) {
            cVar.getClass();
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (obj instanceof Date) {
                String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                C19383o.m32796f(format, "iso8601DateFormat.format(value)");
                return format;
            }
            throw new IllegalArgumentException("Unsupported parameter type.");
        }

        /* renamed from: b */
        public static HttpURLConnection m20002b(URL url) throws IOException {
            URLConnection openConnection = url.openConnection();
            if (openConnection != null) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                if (GraphRequest.f27223n == null) {
                    GraphRequest.f27223n = C0388a.m1049e(new Object[]{"FBAndroidSDK", "12.3.0"}, 2, "%s.%s", "java.lang.String.format(format, *args)");
                    if (!C12869i0.m20546B((String) null)) {
                        String format = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.f27223n, null}, 2));
                        C19383o.m32796f(format, "java.lang.String.format(locale, format, *args)");
                        GraphRequest.f27223n = format;
                    }
                }
                httpURLConnection.setRequestProperty("User-Agent", GraphRequest.f27223n);
                httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
                httpURLConnection.setChunkedStreamingMode(0);
                return httpURLConnection;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }

        /* renamed from: c */
        public static ArrayList m20003c(C13426p pVar) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            ArrayList arrayList;
            C12879l0.m20600d(pVar);
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = m20015o(pVar);
                exc = null;
            } catch (Exception e) {
                exc = e;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                C12869i0.m20572k(httpURLConnection2);
                throw th;
            }
            if (httpURLConnection != null) {
                try {
                    arrayList = m20004d(httpURLConnection, pVar);
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection2 = httpURLConnection;
                    C12869i0.m20572k(httpURLConnection2);
                    throw th;
                }
            } else {
                GraphResponse.C12203a aVar = GraphResponse.f27243f;
                ArrayList arrayList2 = pVar.f29413d;
                FacebookException facebookException = new FacebookException((Throwable) exc);
                aVar.getClass();
                ArrayList a = GraphResponse.C12203a.m20027a(arrayList2, (HttpURLConnection) null, facebookException);
                m20012l(pVar, a);
                arrayList = a;
            }
            C12869i0.m20572k(httpURLConnection);
            return arrayList;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c2, code lost:
            if ((r5 - r12.getLastRefresh().getTime()) > ((long) 86400000)) goto L_0x00c6;
         */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0083  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00cd  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.ArrayList m20004d(java.net.HttpURLConnection r11, p453tf.C13426p r12) {
            /*
                java.lang.String r0 = "connection"
                kotlin.jvm.internal.C19383o.m32797g(r11, r0)
                java.lang.String r0 = "requests"
                kotlin.jvm.internal.C19383o.m32797g(r12, r0)
                com.facebook.GraphResponse$a r0 = com.facebook.GraphResponse.f27243f
                r0.getClass()
                java.lang.String r0 = "Response <Error>: %s"
                java.lang.String r1 = "Response"
                r2 = 0
                r3 = 1
                r4 = 0
                boolean r5 = p453tf.C13418j.m21112h()     // Catch:{ FacebookException -> 0x0061, Exception -> 0x0049, all -> 0x0046 }
                if (r5 == 0) goto L_0x0039
                int r5 = r11.getResponseCode()     // Catch:{ FacebookException -> 0x0061, Exception -> 0x0049, all -> 0x0046 }
                r6 = 400(0x190, float:5.6E-43)
                if (r5 < r6) goto L_0x0029
                java.io.InputStream r5 = r11.getErrorStream()     // Catch:{ FacebookException -> 0x0061, Exception -> 0x0049, all -> 0x0046 }
                goto L_0x002d
            L_0x0029:
                java.io.InputStream r5 = r11.getInputStream()     // Catch:{ FacebookException -> 0x0061, Exception -> 0x0049, all -> 0x0046 }
            L_0x002d:
                java.util.ArrayList r0 = com.facebook.GraphResponse.C12203a.m20029c(r5, r11, r12)     // Catch:{ FacebookException -> 0x0037, Exception -> 0x0035 }
                goto L_0x0073
            L_0x0032:
                r2 = r5
                goto L_0x00fa
            L_0x0035:
                r6 = move-exception
                goto L_0x004c
            L_0x0037:
                r6 = move-exception
                goto L_0x0064
            L_0x0039:
                java.lang.String r5 = "GraphRequest can't be used when Facebook SDK isn't fully initialized"
                java.lang.String r6 = com.facebook.GraphResponse.f27242e     // Catch:{ FacebookException -> 0x0061, Exception -> 0x0049, all -> 0x0046 }
                android.util.Log.e(r6, r5)     // Catch:{ FacebookException -> 0x0061, Exception -> 0x0049, all -> 0x0046 }
                com.facebook.FacebookException r6 = new com.facebook.FacebookException     // Catch:{ FacebookException -> 0x0061, Exception -> 0x0049, all -> 0x0046 }
                r6.<init>((java.lang.String) r5)     // Catch:{ FacebookException -> 0x0061, Exception -> 0x0049, all -> 0x0046 }
                throw r6     // Catch:{ FacebookException -> 0x0061, Exception -> 0x0049, all -> 0x0046 }
            L_0x0046:
                r11 = move-exception
                goto L_0x00fa
            L_0x0049:
                r5 = move-exception
                r6 = r5
                r5 = r2
            L_0x004c:
                hg.c0$a r7 = p365hg.C12845c0.f28334f     // Catch:{ all -> 0x00f7 }
                com.facebook.LoggingBehavior r8 = com.facebook.LoggingBehavior.REQUESTS     // Catch:{ all -> 0x00f7 }
                java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x00f7 }
                r9[r4] = r6     // Catch:{ all -> 0x00f7 }
                r7.mo45627c(r8, r1, r0, r9)     // Catch:{ all -> 0x00f7 }
                com.facebook.FacebookException r0 = new com.facebook.FacebookException     // Catch:{ all -> 0x00f7 }
                r0.<init>((java.lang.Throwable) r6)     // Catch:{ all -> 0x00f7 }
                java.util.ArrayList r0 = com.facebook.GraphResponse.C12203a.m20027a(r12, r11, r0)     // Catch:{ all -> 0x00f7 }
                goto L_0x0073
            L_0x0061:
                r5 = move-exception
                r6 = r5
                r5 = r2
            L_0x0064:
                hg.c0$a r7 = p365hg.C12845c0.f28334f     // Catch:{ all -> 0x00f7 }
                com.facebook.LoggingBehavior r8 = com.facebook.LoggingBehavior.REQUESTS     // Catch:{ all -> 0x00f7 }
                java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x00f7 }
                r9[r4] = r6     // Catch:{ all -> 0x00f7 }
                r7.mo45627c(r8, r1, r0, r9)     // Catch:{ all -> 0x00f7 }
                java.util.ArrayList r0 = com.facebook.GraphResponse.C12203a.m20027a(r12, r11, r6)     // Catch:{ all -> 0x00f7 }
            L_0x0073:
                p365hg.C12869i0.m20566e(r5)
                p365hg.C12869i0.m20572k(r11)
                int r11 = r12.size()
                int r1 = r0.size()
                if (r11 != r1) goto L_0x00cd
                m20012l(r12, r0)
                tf.c$a r11 = p453tf.C13401c.f29349g
                tf.c r11 = r11.mo46082a()
                com.facebook.AccessToken r12 = r11.f29350a
                if (r12 == 0) goto L_0x00c5
                java.util.Date r1 = new java.util.Date
                r1.<init>()
                long r5 = r1.getTime()
                com.facebook.AccessTokenSource r1 = r12.getSource()
                boolean r1 = r1.canExtendToken()
                if (r1 == 0) goto L_0x00c5
                java.util.Date r1 = r11.f29352c
                long r7 = r1.getTime()
                long r7 = r5 - r7
                r1 = 3600000(0x36ee80, float:5.044674E-39)
                long r9 = (long) r1
                int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r1 <= 0) goto L_0x00c5
                java.util.Date r12 = r12.getLastRefresh()
                long r7 = r12.getTime()
                long r5 = r5 - r7
                r12 = 86400000(0x5265c00, float:7.82218E-36)
                long r7 = (long) r12
                int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r12 <= 0) goto L_0x00c5
                goto L_0x00c6
            L_0x00c5:
                r3 = r4
            L_0x00c6:
                if (r3 != 0) goto L_0x00c9
                goto L_0x00cc
            L_0x00c9:
                r11.mo46078a(r2)
            L_0x00cc:
                return r0
            L_0x00cd:
                com.facebook.FacebookException r12 = new com.facebook.FacebookException
                java.util.Locale r1 = java.util.Locale.US
                r2 = 2
                java.lang.Object[] r5 = new java.lang.Object[r2]
                int r0 = r0.size()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r5[r4] = r0
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r5[r3] = r11
                java.lang.Object[] r11 = java.util.Arrays.copyOf(r5, r2)
                java.lang.String r0 = "Received %d responses while expecting %d"
                java.lang.String r11 = java.lang.String.format(r1, r0, r11)
                java.lang.String r0 = "java.lang.String.format(locale, format, *args)"
                kotlin.jvm.internal.C19383o.m32796f(r11, r0)
                r12.<init>((java.lang.String) r11)
                throw r12
            L_0x00f7:
                r11 = move-exception
                goto L_0x0032
            L_0x00fa:
                p365hg.C12869i0.m20566e(r2)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.C12196c.m20004d(java.net.HttpURLConnection, tf.p):java.util.ArrayList");
        }

        /* renamed from: e */
        public static boolean m20005e(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
        }

        /* renamed from: f */
        public static boolean m20006f(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        /* renamed from: g */
        public static GraphRequest m20007g(AccessToken accessToken, String str, C12195b bVar) {
            return new GraphRequest(accessToken, str, (Bundle) null, (HttpMethod) null, bVar, 32);
        }

        /* renamed from: h */
        public static GraphRequest m20008h(AccessToken accessToken, String str, JSONObject jSONObject, C12195b bVar) {
            GraphRequest graphRequest = new GraphRequest(accessToken, str, (Bundle) null, HttpMethod.POST, bVar, 32);
            graphRequest.f27227c = jSONObject;
            return graphRequest;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m20009i(org.json.JSONObject r7, java.lang.String r8, com.facebook.GraphRequest.C12198e r9) {
            /*
                java.util.regex.Pattern r0 = com.facebook.GraphRequest.f27222m
                java.util.regex.Matcher r0 = r0.matcher(r8)
                boolean r1 = r0.matches()
                r2 = 1
                if (r1 == 0) goto L_0x0017
                java.lang.String r0 = r0.group(r2)
                java.lang.String r1 = "matcher.group(1)"
                kotlin.jvm.internal.C19383o.m32796f(r0, r1)
                goto L_0x0018
            L_0x0017:
                r0 = r8
            L_0x0018:
                java.lang.String r1 = "me/"
                r3 = 0
                boolean r1 = kotlin.text.C19457k.m33025c1(r0, r1, r3)
                if (r1 != 0) goto L_0x002c
                java.lang.String r1 = "/me/"
                boolean r0 = kotlin.text.C19457k.m33025c1(r0, r1, r3)
                if (r0 == 0) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r0 = r3
                goto L_0x002d
            L_0x002c:
                r0 = r2
            L_0x002d:
                if (r0 == 0) goto L_0x0046
                r0 = 6
                java.lang.String r1 = ":"
                int r1 = kotlin.text.C19459m.m33043l1(r8, r1, r3, r3, r0)
                java.lang.String r4 = "?"
                int r8 = kotlin.text.C19459m.m33043l1(r8, r4, r3, r3, r0)
                r0 = 3
                if (r1 <= r0) goto L_0x0046
                r0 = -1
                if (r8 == r0) goto L_0x0044
                if (r1 >= r8) goto L_0x0046
            L_0x0044:
                r8 = r2
                goto L_0x0047
            L_0x0046:
                r8 = r3
            L_0x0047:
                java.util.Iterator r0 = r7.keys()
            L_0x004b:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0076
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r4 = r7.opt(r1)
                if (r8 == 0) goto L_0x0067
                java.lang.String r5 = "image"
                boolean r5 = kotlin.text.C19457k.m33019W0(r1, r5, r2)
                if (r5 == 0) goto L_0x0067
                r5 = r2
                goto L_0x0068
            L_0x0067:
                r5 = r3
            L_0x0068:
                java.lang.String r6 = "key"
                kotlin.jvm.internal.C19383o.m32796f(r1, r6)
                java.lang.String r6 = "value"
                kotlin.jvm.internal.C19383o.m32796f(r4, r6)
                m20010j(r1, r4, r9, r5)
                goto L_0x004b
            L_0x0076:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.C12196c.m20009i(org.json.JSONObject, java.lang.String, com.facebook.GraphRequest$e):void");
        }

        /* renamed from: j */
        public static void m20010j(String str, Object obj, C12198e eVar, boolean z) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) obj;
                if (z) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String e = C0388a.m1049e(new Object[]{str, next}, 2, "%s[%s]", "java.lang.String.format(format, *args)");
                        Object opt = jSONObject.opt(next);
                        C19383o.m32796f(opt, "jsonObject.opt(propertyName)");
                        m20010j(e, opt, eVar, z);
                    }
                } else if (jSONObject.has("id")) {
                    String optString = jSONObject.optString("id");
                    C19383o.m32796f(optString, "jsonObject.optString(\"id\")");
                    m20010j(str, optString, eVar, z);
                } else if (jSONObject.has("url")) {
                    String optString2 = jSONObject.optString("url");
                    C19383o.m32796f(optString2, "jsonObject.optString(\"url\")");
                    m20010j(str, optString2, eVar, z);
                } else if (jSONObject.has("fbsdk:create_object")) {
                    String jSONObject2 = jSONObject.toString();
                    C19383o.m32796f(jSONObject2, "jsonObject.toString()");
                    m20010j(str, jSONObject2, eVar, z);
                }
            } else if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String format = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
                    C19383o.m32796f(format, "java.lang.String.format(locale, format, *args)");
                    Object opt2 = jSONArray.opt(i);
                    C19383o.m32796f(opt2, "jsonArray.opt(i)");
                    m20010j(format, opt2, eVar, z);
                }
            } else if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls)) {
                eVar.mo39239a(str, obj.toString());
            } else if (Date.class.isAssignableFrom(cls)) {
                String format2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                C19383o.m32796f(format2, "iso8601DateFormat.format(date)");
                eVar.mo39239a(str, format2);
            }
        }

        /* JADX WARNING: type inference failed for: r2v1 */
        /* JADX WARNING: type inference failed for: r2v2, types: [boolean] */
        /* JADX WARNING: type inference failed for: r2v10 */
        /* renamed from: k */
        public static void m20011k(C13426p pVar, C12845c0 c0Var, int i, URL url, OutputStream outputStream, boolean z) {
            String c;
            C12845c0 c0Var2 = c0Var;
            C12200g gVar = new C12200g(outputStream, c0Var2, z);
            ? r2 = 1;
            if (i == 1) {
                GraphRequest graphRequest = (GraphRequest) pVar.f29413d.get(0);
                HashMap hashMap = new HashMap();
                for (String next : graphRequest.f27228d.keySet()) {
                    Object obj = graphRequest.f27228d.get(next);
                    if (m20005e(obj)) {
                        C19383o.m32796f(next, "key");
                        hashMap.put(next, new C12194a(graphRequest, obj));
                    }
                }
                if (c0Var2 != null) {
                    c0Var2.mo45622a("  Parameters:\n");
                }
                Bundle bundle = graphRequest.f27228d;
                for (String next2 : bundle.keySet()) {
                    Object obj2 = bundle.get(next2);
                    if (m20006f(obj2)) {
                        C19383o.m32796f(next2, "key");
                        gVar.mo39246g(next2, obj2, graphRequest);
                    }
                }
                if (c0Var2 != null) {
                    c0Var2.mo45622a("  Attachments:\n");
                }
                m20013m(hashMap, gVar);
                JSONObject jSONObject = graphRequest.f27227c;
                if (jSONObject != null) {
                    String path = url.getPath();
                    C19383o.m32796f(path, "url.path");
                    m20009i(jSONObject, path, gVar);
                    return;
                }
                return;
            }
            C13426p pVar2 = pVar;
            Iterator it = pVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    String str = GraphRequest.f27220k;
                    c = C13418j.m21107c();
                    break;
                }
                AccessToken accessToken = ((GraphRequest) it.next()).f27225a;
                if (accessToken != null) {
                    c = accessToken.getApplicationId();
                    break;
                }
            }
            if (!(c.length() == 0)) {
                gVar.mo39239a("batch_app_id", c);
                HashMap hashMap2 = new HashMap();
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = pVar.iterator();
                while (it2.hasNext()) {
                    GraphRequest graphRequest2 = (GraphRequest) it2.next();
                    String str2 = GraphRequest.f27220k;
                    graphRequest2.getClass();
                    JSONObject jSONObject2 = new JSONObject();
                    String h = graphRequest2.mo39230h(C12865g0.m20541b());
                    graphRequest2.mo39224a();
                    Uri parse = Uri.parse(graphRequest2.mo39225b(h, r2));
                    int i2 = 2;
                    Object[] objArr = new Object[2];
                    C19383o.m32796f(parse, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
                    objArr[0] = parse.getPath();
                    objArr[r2] = parse.getQuery();
                    String format = String.format("%s?%s", Arrays.copyOf(objArr, 2));
                    C19383o.m32796f(format, "java.lang.String.format(format, *args)");
                    jSONObject2.put("relative_url", format);
                    jSONObject2.put(ResponseConstants.METHOD, graphRequest2.f27232h);
                    AccessToken accessToken2 = graphRequest2.f27225a;
                    if (accessToken2 != null) {
                        C12845c0.f28334f.mo45628d(accessToken2.getToken());
                    }
                    ArrayList arrayList = new ArrayList();
                    for (String str3 : graphRequest2.f27228d.keySet()) {
                        Object obj3 = graphRequest2.f27228d.get(str3);
                        GraphRequest.f27224o.getClass();
                        if (m20005e(obj3)) {
                            Locale locale = Locale.ROOT;
                            Object[] objArr2 = new Object[i2];
                            objArr2[0] = ResponseConstants.FILE;
                            objArr2[1] = Integer.valueOf(hashMap2.size());
                            String format2 = String.format(locale, "%s%d", Arrays.copyOf(objArr2, i2));
                            C19383o.m32796f(format2, "java.lang.String.format(locale, format, *args)");
                            arrayList.add(format2);
                            hashMap2.put(format2, new C12194a(graphRequest2, obj3));
                            C13426p pVar3 = pVar;
                            i2 = 2;
                        } else {
                            C13426p pVar4 = pVar;
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        jSONObject2.put("attached_files", TextUtils.join(",", arrayList));
                    }
                    JSONObject jSONObject3 = graphRequest2.f27227c;
                    if (jSONObject3 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        C12196c cVar = GraphRequest.f27224o;
                        C13425o oVar = new C13425o(arrayList2);
                        cVar.getClass();
                        m20009i(jSONObject3, format, oVar);
                        jSONObject2.put(DetailsBottomSheetNavigationKey.PARAM_BODY, TextUtils.join("&", arrayList2));
                    }
                    jSONArray.put(jSONObject2);
                    C13426p pVar5 = pVar;
                    r2 = 1;
                }
                OutputStream outputStream2 = gVar.f27239c;
                if (!(outputStream2 instanceof C13439w)) {
                    String jSONArray2 = jSONArray.toString();
                    C19383o.m32796f(jSONArray2, "requestJsonArray.toString()");
                    gVar.mo39239a("batch", jSONArray2);
                } else if (outputStream2 != null) {
                    C13439w wVar = (C13439w) outputStream2;
                    gVar.mo39242c("batch", (String) null, (String) null);
                    gVar.mo39241b("[", new Object[0]);
                    Iterator it3 = pVar.iterator();
                    int i3 = 0;
                    while (it3.hasNext()) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i3);
                        wVar.mo46109a((GraphRequest) it3.next());
                        if (i3 > 0) {
                            gVar.mo39241b(",%s", jSONObject4.toString());
                        } else {
                            gVar.mo39241b("%s", jSONObject4.toString());
                        }
                        i3++;
                    }
                    gVar.mo39241b("]", new Object[0]);
                    C12845c0 c0Var3 = gVar.f27240d;
                    if (c0Var3 != null) {
                        String jSONArray3 = jSONArray.toString();
                        C19383o.m32796f(jSONArray3, "requestJsonArray.toString()");
                        c0Var3.mo45623b(jSONArray3, "    batch");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.RequestOutputStream");
                }
                if (c0Var2 != null) {
                    c0Var2.mo45622a("  Attachments:\n");
                }
                m20013m(hashMap2, gVar);
                return;
            }
            throw new FacebookException("App ID was not specified at the request or Settings.");
        }

        /* renamed from: l */
        public static void m20012l(C13426p pVar, ArrayList arrayList) {
            C19383o.m32797g(pVar, "requests");
            int size = pVar.size();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < size; i++) {
                GraphRequest graphRequest = (GraphRequest) pVar.f29413d.get(i);
                if (graphRequest.f27231g != null) {
                    arrayList2.add(new Pair(graphRequest.f27231g, arrayList.get(i)));
                }
            }
            if (arrayList2.size() > 0) {
                C12245c cVar = new C12245c(arrayList2, pVar);
                Handler handler = pVar.f29411b;
                if (handler != null) {
                    handler.post(cVar);
                } else {
                    cVar.run();
                }
            }
        }

        /* renamed from: m */
        public static void m20013m(HashMap hashMap, C12200g gVar) {
            for (Map.Entry entry : hashMap.entrySet()) {
                C12196c cVar = GraphRequest.f27224o;
                Object obj = ((C12194a) entry.getValue()).f27236b;
                cVar.getClass();
                if (m20005e(obj)) {
                    gVar.mo39246g((String) entry.getKey(), ((C12194a) entry.getValue()).f27236b, ((C12194a) entry.getValue()).f27235a);
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.io.FilterOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.io.FilterOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.FilterOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: tf.v} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.io.FilterOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.io.FilterOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: tf.v} */
        /* JADX WARNING: type inference failed for: r14v7, types: [java.io.OutputStream] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x015a  */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m20014n(java.net.HttpURLConnection r14, p453tf.C13426p r15) throws java.io.IOException, org.json.JSONException {
            /*
                hg.c0 r6 = new hg.c0
                com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.REQUESTS
                r6.<init>(r0)
                int r2 = r15.size()
                java.util.Iterator r0 = r15.iterator()
            L_0x000f:
                boolean r1 = r0.hasNext()
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x0041
                java.lang.Object r1 = r0.next()
                com.facebook.GraphRequest r1 = (com.facebook.GraphRequest) r1
                android.os.Bundle r5 = r1.f27228d
                java.util.Set r5 = r5.keySet()
                java.util.Iterator r5 = r5.iterator()
            L_0x0027:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L_0x000f
                java.lang.Object r7 = r5.next()
                java.lang.String r7 = (java.lang.String) r7
                android.os.Bundle r8 = r1.f27228d
                java.lang.Object r7 = r8.get(r7)
                boolean r7 = m20005e(r7)
                if (r7 == 0) goto L_0x0027
                r5 = r4
                goto L_0x0042
            L_0x0041:
                r5 = r3
            L_0x0042:
                r0 = 0
                if (r2 != r3) goto L_0x0050
                java.util.ArrayList r1 = r15.f29413d
                java.lang.Object r1 = r1.get(r4)
                com.facebook.GraphRequest r1 = (com.facebook.GraphRequest) r1
                com.facebook.HttpMethod r1 = r1.f27232h
                goto L_0x0051
            L_0x0050:
                r1 = r0
            L_0x0051:
                if (r1 == 0) goto L_0x0054
                goto L_0x0056
            L_0x0054:
                com.facebook.HttpMethod r1 = com.facebook.HttpMethod.POST
            L_0x0056:
                java.lang.String r7 = r1.name()
                r14.setRequestMethod(r7)
                java.lang.String r7 = "Content-Type"
                if (r5 == 0) goto L_0x006e
                java.lang.String r8 = "application/x-www-form-urlencoded"
                r14.setRequestProperty(r7, r8)
                java.lang.String r8 = "Content-Encoding"
                java.lang.String r9 = "gzip"
                r14.setRequestProperty(r8, r9)
                goto L_0x0086
            L_0x006e:
                java.lang.Object[] r8 = new java.lang.Object[r3]
                java.lang.String r9 = com.facebook.GraphRequest.f27221l
                r8[r4] = r9
                java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r3)
                java.lang.String r9 = "multipart/form-data; boundary=%s"
                java.lang.String r8 = java.lang.String.format(r9, r8)
                java.lang.String r9 = "java.lang.String.format(format, *args)"
                kotlin.jvm.internal.C19383o.m32796f(r8, r9)
                r14.setRequestProperty(r7, r8)
            L_0x0086:
                java.net.URL r13 = r14.getURL()
                java.lang.String r8 = "Request:\n"
                r6.mo45622a(r8)
                java.lang.String r8 = r15.f29412c
                java.lang.String r9 = "Id"
                r6.mo45623b(r8, r9)
                java.lang.String r8 = "url"
                kotlin.jvm.internal.C19383o.m32796f(r13, r8)
                java.lang.String r8 = "URL"
                r6.mo45623b(r13, r8)
                java.lang.String r8 = r14.getRequestMethod()
                java.lang.String r9 = "connection.requestMethod"
                kotlin.jvm.internal.C19383o.m32796f(r8, r9)
                java.lang.String r9 = "Method"
                r6.mo45623b(r8, r9)
                java.lang.String r8 = "User-Agent"
                java.lang.String r9 = r14.getRequestProperty(r8)
                java.lang.String r10 = "connection.getRequestProperty(\"User-Agent\")"
                kotlin.jvm.internal.C19383o.m32796f(r9, r10)
                r6.mo45623b(r9, r8)
                java.lang.String r8 = r14.getRequestProperty(r7)
                java.lang.String r9 = "connection.getRequestProperty(\"Content-Type\")"
                kotlin.jvm.internal.C19383o.m32796f(r8, r9)
                r6.mo45623b(r8, r7)
                r14.setConnectTimeout(r4)
                r14.setReadTimeout(r4)
                com.facebook.HttpMethod r7 = com.facebook.HttpMethod.POST
                if (r1 != r7) goto L_0x00d4
                r1 = r3
                goto L_0x00d5
            L_0x00d4:
                r1 = r4
            L_0x00d5:
                if (r1 != 0) goto L_0x00db
                r6.mo45624c()
                return
            L_0x00db:
                r14.setDoOutput(r3)
                java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0156 }
                java.io.OutputStream r14 = r14.getOutputStream()     // Catch:{ all -> 0x0156 }
                r1.<init>(r14)     // Catch:{ all -> 0x0156 }
                if (r5 == 0) goto L_0x00f3
                java.util.zip.GZIPOutputStream r14 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x00f0 }
                r14.<init>(r1)     // Catch:{ all -> 0x00f0 }
                r0 = r14
                goto L_0x00f4
            L_0x00f0:
                r14 = move-exception
                goto L_0x0158
            L_0x00f3:
                r0 = r1
            L_0x00f4:
                java.util.ArrayList r14 = r15.f29414e     // Catch:{ all -> 0x0156 }
                java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x0156 }
            L_0x00fa:
                boolean r1 = r14.hasNext()     // Catch:{ all -> 0x0156 }
                if (r1 == 0) goto L_0x010b
                java.lang.Object r1 = r14.next()     // Catch:{ all -> 0x0156 }
                tf.p$a r1 = (p453tf.C13426p.C13427a) r1     // Catch:{ all -> 0x0156 }
                boolean r1 = r1 instanceof p453tf.C13426p.C13428b     // Catch:{ all -> 0x0156 }
                if (r1 == 0) goto L_0x00fa
                goto L_0x0123
            L_0x010b:
                java.util.Iterator r14 = r15.iterator()     // Catch:{ all -> 0x0156 }
            L_0x010f:
                boolean r1 = r14.hasNext()     // Catch:{ all -> 0x0156 }
                if (r1 == 0) goto L_0x0122
                java.lang.Object r1 = r14.next()     // Catch:{ all -> 0x0156 }
                com.facebook.GraphRequest r1 = (com.facebook.GraphRequest) r1     // Catch:{ all -> 0x0156 }
                com.facebook.GraphRequest$b r1 = r1.f27231g     // Catch:{ all -> 0x0156 }
                boolean r1 = r1 instanceof com.facebook.GraphRequest.C12199f     // Catch:{ all -> 0x0156 }
                if (r1 == 0) goto L_0x010f
                goto L_0x0123
            L_0x0122:
                r3 = r4
            L_0x0123:
                if (r3 == 0) goto L_0x0143
                tf.u r14 = new tf.u     // Catch:{ all -> 0x0156 }
                android.os.Handler r1 = r15.f29411b     // Catch:{ all -> 0x0156 }
                r14.<init>(r1)     // Catch:{ all -> 0x0156 }
                r8 = 0
                r7 = r15
                r9 = r2
                r10 = r13
                r11 = r14
                r12 = r5
                m20011k(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0156 }
                int r1 = r14.f29429e     // Catch:{ all -> 0x0156 }
                java.util.HashMap r10 = r14.f29426b     // Catch:{ all -> 0x0156 }
                tf.v r14 = new tf.v     // Catch:{ all -> 0x0156 }
                long r11 = (long) r1     // Catch:{ all -> 0x0156 }
                r7 = r14
                r8 = r0
                r9 = r15
                r7.<init>(r8, r9, r10, r11)     // Catch:{ all -> 0x0156 }
                goto L_0x0144
            L_0x0143:
                r14 = r0
            L_0x0144:
                r0 = r15
                r1 = r6
                r3 = r13
                r4 = r14
                m20011k(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0152 }
                r14.close()
                r6.mo45624c()
                return
            L_0x0152:
                r15 = move-exception
                r1 = r14
                r14 = r15
                goto L_0x0158
            L_0x0156:
                r14 = move-exception
                r1 = r0
            L_0x0158:
                if (r1 == 0) goto L_0x015d
                r1.close()
            L_0x015d:
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.C12196c.m20014n(java.net.HttpURLConnection, tf.p):void");
        }

        /* renamed from: o */
        public static HttpURLConnection m20015o(C13426p pVar) {
            Iterator it = pVar.iterator();
            while (it.hasNext()) {
                GraphRequest graphRequest = (GraphRequest) it.next();
                if (HttpMethod.GET == graphRequest.f27232h && C12869i0.m20546B(graphRequest.f27228d.getString("fields"))) {
                    C12845c0.C12846a aVar = C12845c0.f28334f;
                    LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                    StringBuilder h = C0072d.m201h("GET requests for /");
                    String str = graphRequest.f27226b;
                    if (str == null) {
                        str = "";
                    }
                    aVar.mo45625a(loggingBehavior, 5, "Request", C0023f.m110k(h, str, " should contain an explicit \"fields\" parameter."));
                }
            }
            try {
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = m20002b(pVar.size() == 1 ? new URL(((GraphRequest) pVar.f29413d.get(0)).mo39229g()) : new URL(C12865g0.m20541b()));
                    m20014n(httpURLConnection, pVar);
                    return httpURLConnection;
                } catch (IOException e) {
                    C12869i0.m20572k(httpURLConnection);
                    throw new FacebookException("could not construct request body", (Throwable) e);
                } catch (JSONException e2) {
                    C12869i0.m20572k(httpURLConnection);
                    throw new FacebookException("could not construct request body", (Throwable) e2);
                }
            } catch (MalformedURLException e3) {
                throw new FacebookException("could not construct URL for request", (Throwable) e3);
            }
        }
    }

    /* renamed from: com.facebook.GraphRequest$d */
    public interface C12197d {
        /* renamed from: a */
        void mo30107a(JSONObject jSONObject);
    }

    /* renamed from: com.facebook.GraphRequest$e */
    public interface C12198e {
        /* renamed from: a */
        void mo39239a(String str, String str2);
    }

    /* renamed from: com.facebook.GraphRequest$f */
    public interface C12199f extends C12195b {
        void onProgress();
    }

    /* renamed from: com.facebook.GraphRequest$g */
    public static final class C12200g implements C12198e {

        /* renamed from: a */
        public boolean f27237a = true;

        /* renamed from: b */
        public final boolean f27238b;

        /* renamed from: c */
        public final OutputStream f27239c;

        /* renamed from: d */
        public final C12845c0 f27240d;

        public C12200g(OutputStream outputStream, C12845c0 c0Var, boolean z) {
            this.f27239c = outputStream;
            this.f27240d = c0Var;
            this.f27238b = z;
        }

        /* renamed from: a */
        public final void mo39239a(String str, String str2) {
            C19383o.m32797g(str, "key");
            C19383o.m32797g(str2, "value");
            mo39242c(str, (String) null, (String) null);
            mo39245f("%s", str2);
            mo39247h();
            C12845c0 c0Var = this.f27240d;
            if (c0Var != null) {
                c0Var.mo45623b(str2, "    " + str);
            }
        }

        /* renamed from: b */
        public final void mo39241b(String str, Object... objArr) {
            C19383o.m32797g(objArr, "args");
            if (!this.f27238b) {
                if (this.f27237a) {
                    OutputStream outputStream = this.f27239c;
                    Charset charset = C19446a.f43373b;
                    byte[] bytes = HelpFormatter.DEFAULT_LONG_OPT_PREFIX.getBytes(charset);
                    C19383o.m32796f(bytes, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    OutputStream outputStream2 = this.f27239c;
                    String str2 = GraphRequest.f27221l;
                    if (str2 != null) {
                        byte[] bytes2 = str2.getBytes(charset);
                        C19383o.m32796f(bytes2, "(this as java.lang.String).getBytes(charset)");
                        outputStream2.write(bytes2);
                        OutputStream outputStream3 = this.f27239c;
                        byte[] bytes3 = "\r\n".getBytes(charset);
                        C19383o.m32796f(bytes3, "(this as java.lang.String).getBytes(charset)");
                        outputStream3.write(bytes3);
                        this.f27237a = false;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                OutputStream outputStream4 = this.f27239c;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                byte[] bytes4 = C0388a.m1049e(copyOf, copyOf.length, str, "java.lang.String.format(format, *args)").getBytes(C19446a.f43373b);
                C19383o.m32796f(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                return;
            }
            OutputStream outputStream5 = this.f27239c;
            Locale locale = Locale.US;
            Object[] copyOf2 = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(locale, str, Arrays.copyOf(copyOf2, copyOf2.length));
            C19383o.m32796f(format, "java.lang.String.format(locale, format, *args)");
            String encode = URLEncoder.encode(format, "UTF-8");
            C19383o.m32796f(encode, "URLEncoder.encode(String… format, *args), \"UTF-8\")");
            byte[] bytes5 = encode.getBytes(C19446a.f43373b);
            C19383o.m32796f(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        /* renamed from: c */
        public final void mo39242c(String str, String str2, String str3) {
            if (!this.f27238b) {
                mo39241b("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    mo39241b("; filename=\"%s\"", str2);
                }
                mo39245f("", new Object[0]);
                if (str3 != null) {
                    mo39245f("%s: %s", "Content-Type", str3);
                }
                mo39245f("", new Object[0]);
                return;
            }
            OutputStream outputStream = this.f27239c;
            byte[] bytes = C0388a.m1049e(new Object[]{str}, 1, "%s=", "java.lang.String.format(format, *args)").getBytes(C19446a.f43373b);
            C19383o.m32796f(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        /* renamed from: d */
        public final void mo39243d(Uri uri, String str, String str2) {
            int i;
            long j;
            C19383o.m32797g(str, "key");
            C19383o.m32797g(uri, "contentUri");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            mo39242c(str, str, str2);
            if (this.f27239c instanceof C13436u) {
                int i2 = C12869i0.f28368a;
                Cursor cursor = null;
                try {
                    Cursor query = C13418j.m21106b().getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
                    if (query == null) {
                        j = 0;
                    } else {
                        int columnIndex = query.getColumnIndex("_size");
                        query.moveToFirst();
                        j = query.getLong(columnIndex);
                        query.close();
                    }
                    ((C13436u) this.f27239c).mo46110b(j);
                    i = 0;
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } else {
                i = C12869i0.m20571j(C13418j.m21106b().getContentResolver().openInputStream(uri), this.f27239c) + 0;
            }
            mo39245f("", new Object[0]);
            mo39247h();
            C12845c0 c0Var = this.f27240d;
            if (c0Var != null) {
                String i3 = C0326j.m864i("    ", str);
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                C19383o.m32796f(format, "java.lang.String.format(locale, format, *args)");
                c0Var.mo45623b(format, i3);
            }
        }

        /* renamed from: e */
        public final void mo39244e(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
            int i;
            C19383o.m32797g(str, "key");
            C19383o.m32797g(parcelFileDescriptor, "descriptor");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            mo39242c(str, str, str2);
            OutputStream outputStream = this.f27239c;
            if (outputStream instanceof C13436u) {
                ((C13436u) outputStream).mo46110b(parcelFileDescriptor.getStatSize());
                i = 0;
            } else {
                i = C12869i0.m20571j(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f27239c) + 0;
            }
            mo39245f("", new Object[0]);
            mo39247h();
            C12845c0 c0Var = this.f27240d;
            if (c0Var != null) {
                String i2 = C0326j.m864i("    ", str);
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                C19383o.m32796f(format, "java.lang.String.format(locale, format, *args)");
                c0Var.mo45623b(format, i2);
            }
        }

        /* renamed from: f */
        public final void mo39245f(String str, Object... objArr) {
            mo39241b(str, Arrays.copyOf(objArr, objArr.length));
            if (!this.f27238b) {
                mo39241b("\r\n", new Object[0]);
            }
        }

        /* renamed from: g */
        public final void mo39246g(String str, Object obj, GraphRequest graphRequest) {
            C19383o.m32797g(str, "key");
            OutputStream outputStream = this.f27239c;
            if (outputStream instanceof C13439w) {
                if (outputStream != null) {
                    ((C13439w) outputStream).mo46109a(graphRequest);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.RequestOutputStream");
                }
            }
            C12196c cVar = GraphRequest.f27224o;
            cVar.getClass();
            if (C12196c.m20006f(obj)) {
                mo39239a(str, C12196c.m20001a(cVar, obj));
            } else if (obj instanceof Bitmap) {
                Bitmap bitmap = (Bitmap) obj;
                C19383o.m32797g(bitmap, "bitmap");
                mo39242c(str, str, "image/png");
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f27239c);
                mo39245f("", new Object[0]);
                mo39247h();
                C12845c0 c0Var = this.f27240d;
                if (c0Var != null) {
                    c0Var.mo45623b("<Image>", "    " + str);
                }
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                C19383o.m32797g(bArr, "bytes");
                mo39242c(str, str, "content/unknown");
                this.f27239c.write(bArr);
                mo39245f("", new Object[0]);
                mo39247h();
                C12845c0 c0Var2 = this.f27240d;
                if (c0Var2 != null) {
                    String i = C0326j.m864i("    ", str);
                    String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
                    C19383o.m32796f(format, "java.lang.String.format(locale, format, *args)");
                    c0Var2.mo45623b(format, i);
                }
            } else if (obj instanceof Uri) {
                mo39243d((Uri) obj, str, (String) null);
            } else if (obj instanceof ParcelFileDescriptor) {
                mo39244e(str, (ParcelFileDescriptor) obj, (String) null);
            } else if (obj instanceof ParcelableResourceWithMimeType) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
                Parcelable resource = parcelableResourceWithMimeType.getResource();
                String mimeType = parcelableResourceWithMimeType.getMimeType();
                if (resource instanceof ParcelFileDescriptor) {
                    mo39244e(str, (ParcelFileDescriptor) resource, mimeType);
                } else if (resource instanceof Uri) {
                    mo39243d((Uri) resource, str, mimeType);
                } else {
                    throw new IllegalArgumentException("value is not a supported type.");
                }
            } else {
                throw new IllegalArgumentException("value is not a supported type.");
            }
        }

        /* renamed from: h */
        public final void mo39247h() {
            if (!this.f27238b) {
                mo39245f("--%s", GraphRequest.f27221l);
                return;
            }
            OutputStream outputStream = this.f27239c;
            byte[] bytes = "&".getBytes(C19446a.f43373b);
            C19383o.m32796f(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }
    }

    /* renamed from: com.facebook.GraphRequest$h */
    public static final class C12201h implements C12195b {

        /* renamed from: a */
        public final /* synthetic */ C12195b f27241a;

        public C12201h(C12195b bVar) {
            this.f27241a = bVar;
        }

        /* renamed from: a */
        public final void mo39238a(GraphResponse graphResponse) {
            JSONObject jSONObject = graphResponse.f27246c;
            JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("__debug__") : null;
            JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray(ResponseConstants.MESSAGES) : null;
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    String optString = optJSONObject2 != null ? optJSONObject2.optString("message") : null;
                    String optString2 = optJSONObject2 != null ? optJSONObject2.optString("type") : null;
                    String optString3 = optJSONObject2 != null ? optJSONObject2.optString(ResponseConstants.LINK) : null;
                    if (!(optString == null || optString2 == null)) {
                        LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
                        if (C19383o.m32792b(optString2, BaseMessage.TYPE_WARNING)) {
                            loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                        }
                        if (!C12869i0.m20546B(optString3)) {
                            optString = C0048b.m163a(optString, " Link: ", optString3);
                        }
                        C12845c0.f28334f.mo45626b(loggingBehavior, GraphRequest.f27220k, optString);
                    }
                }
            }
            C12195b bVar = this.f27241a;
            if (bVar != null) {
                bVar.mo39238a(graphResponse);
            }
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        C19383o.m32796f(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < nextInt; i++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "buffer.toString()");
        f27221l = sb2;
    }

    public GraphRequest() {
        this((AccessToken) null, (String) null, (Bundle) null, (HttpMethod) null, (C12195b) null, 63);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod) {
        this(accessToken, str, bundle, httpMethod, (C12195b) null, 48);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, C12195b bVar) {
        this(accessToken, str, bundle, httpMethod, bVar, 32);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, C12195b bVar, int i) {
        accessToken = (i & 1) != 0 ? null : accessToken;
        str = (i & 2) != 0 ? null : str;
        bundle = (i & 4) != 0 ? null : bundle;
        httpMethod = (i & 8) != 0 ? null : httpMethod;
        bVar = (i & 16) != 0 ? null : bVar;
        this.f27225a = accessToken;
        this.f27226b = str;
        this.f27230f = null;
        mo39232j(bVar);
        this.f27232h = httpMethod == null ? HttpMethod.GET : httpMethod;
        if (bundle != null) {
            this.f27228d = new Bundle(bundle);
        } else {
            this.f27228d = new Bundle();
        }
        if (this.f27230f == null) {
            this.f27230f = C13418j.m21109e();
        }
    }

    /* renamed from: f */
    public static String m19990f() {
        String c = C13418j.m21107c();
        C12879l0.m20603g();
        String str = C13418j.f29386f;
        if (C12869i0.m20546B(c) || C12869i0.m20546B(str)) {
            C12869i0.m20551G(f27220k, "Warning: Request without access token missing application ID or client token.");
            return null;
        }
        StringBuilder k = C0073e.m211k(c, "|");
        if (str != null) {
            k.append(str);
            return k.toString();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        if (r4 == false) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0094  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39224a() {
        /*
            r7 = this;
            android.os.Bundle r0 = r7.f27228d
            boolean r1 = r7.f27233i
            java.lang.String r2 = "access_token"
            if (r1 != 0) goto L_0x0053
            java.lang.String r1 = r7.mo39228e()
            r3 = 0
            if (r1 == 0) goto L_0x0016
            java.lang.String r4 = "|"
            boolean r4 = kotlin.text.C19459m.m33036e1(r1, r4, r3)
            goto L_0x0017
        L_0x0016:
            r4 = r3
        L_0x0017:
            r5 = 1
            if (r1 == 0) goto L_0x0026
            java.lang.String r6 = "IG"
            boolean r1 = kotlin.text.C19457k.m33025c1(r1, r6, r3)
            if (r1 == 0) goto L_0x0026
            if (r4 != 0) goto L_0x0026
            r1 = r5
            goto L_0x0027
        L_0x0026:
            r1 = r3
        L_0x0027:
            if (r1 == 0) goto L_0x0030
            boolean r1 = r7.mo39231i()
            if (r1 == 0) goto L_0x0030
            goto L_0x0048
        L_0x0030:
            java.lang.String r1 = p453tf.C13418j.m21110f()
            java.lang.String r6 = "instagram.com"
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r6)
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x003f
            r1 = r5
            goto L_0x0044
        L_0x003f:
            boolean r1 = r7.mo39231i()
            r1 = r1 ^ r5
        L_0x0044:
            if (r1 != 0) goto L_0x0049
            if (r4 != 0) goto L_0x0049
        L_0x0048:
            r3 = r5
        L_0x0049:
            if (r3 == 0) goto L_0x0053
            java.lang.String r1 = m19990f()
            r0.putString(r2, r1)
            goto L_0x005c
        L_0x0053:
            java.lang.String r1 = r7.mo39228e()
            if (r1 == 0) goto L_0x005c
            r0.putString(r2, r1)
        L_0x005c:
            boolean r1 = r0.containsKey(r2)
            if (r1 != 0) goto L_0x0076
            java.lang.String r1 = p453tf.C13418j.f29381a
            p365hg.C12879l0.m20603g()
            java.lang.String r1 = p453tf.C13418j.f29386f
            boolean r1 = p365hg.C12869i0.m20546B(r1)
            if (r1 == 0) goto L_0x0076
            java.lang.String r1 = f27220k
            java.lang.String r2 = "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change."
            android.util.Log.w(r1, r2)
        L_0x0076:
            java.lang.String r1 = "sdk"
            java.lang.String r2 = "android"
            r0.putString(r1, r2)
            java.lang.String r1 = "format"
            java.lang.String r2 = "json"
            r0.putString(r1, r2)
            com.facebook.LoggingBehavior r1 = com.facebook.LoggingBehavior.GRAPH_API_DEBUG_INFO
            boolean r1 = p453tf.C13418j.m21114j(r1)
            java.lang.String r2 = "debug"
            if (r1 == 0) goto L_0x0094
            java.lang.String r1 = "info"
            r0.putString(r2, r1)
            goto L_0x00a1
        L_0x0094:
            com.facebook.LoggingBehavior r1 = com.facebook.LoggingBehavior.GRAPH_API_DEBUG_WARNING
            boolean r1 = p453tf.C13418j.m21114j(r1)
            if (r1 == 0) goto L_0x00a1
            java.lang.String r1 = "warning"
            r0.putString(r2, r1)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.mo39224a():void");
    }

    /* renamed from: b */
    public final String mo39225b(String str, boolean z) {
        if (!z && this.f27232h == HttpMethod.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String next : this.f27228d.keySet()) {
            Object obj = this.f27228d.get(next);
            if (obj == null) {
                obj = "";
            }
            C12196c cVar = f27224o;
            cVar.getClass();
            if (C12196c.m20006f(obj)) {
                buildUpon.appendQueryParameter(next, C12196c.m20001a(cVar, obj).toString());
            } else if (this.f27232h != HttpMethod.GET) {
                String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                C19383o.m32796f(format, "java.lang.String.format(locale, format, *args)");
                throw new IllegalArgumentException(format);
            }
        }
        String builder = buildUpon.toString();
        C19383o.m32796f(builder, "uriBuilder.toString()");
        return builder;
    }

    /* renamed from: c */
    public final GraphResponse mo39226c() {
        f27224o.getClass();
        List l1 = C19318k.m32620l1(new GraphRequest[]{this});
        C19383o.m32797g(l1, "requests");
        ArrayList c = C12196c.m20003c(new C13426p((Collection<GraphRequest>) l1));
        if (c.size() == 1) {
            return (GraphResponse) c.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    /* renamed from: d */
    public final GraphRequestAsyncTask mo39227d() {
        f27224o.getClass();
        List l1 = C19318k.m32620l1(new GraphRequest[]{this});
        C19383o.m32797g(l1, "requests");
        C13426p pVar = new C13426p((Collection<GraphRequest>) l1);
        C12879l0.m20600d(pVar);
        GraphRequestAsyncTask graphRequestAsyncTask = new GraphRequestAsyncTask(pVar);
        graphRequestAsyncTask.executeOnExecutor(C13418j.m21108d(), new Void[0]);
        return graphRequestAsyncTask;
    }

    /* renamed from: e */
    public final String mo39228e() {
        AccessToken accessToken = this.f27225a;
        if (accessToken != null) {
            if (!this.f27228d.containsKey(AccessToken.ACCESS_TOKEN_KEY)) {
                String token = accessToken.getToken();
                C12845c0.f28334f.mo45628d(token);
                return token;
            }
        } else if (!this.f27233i && !this.f27228d.containsKey(AccessToken.ACCESS_TOKEN_KEY)) {
            return m19990f();
        }
        return this.f27228d.getString(AccessToken.ACCESS_TOKEN_KEY);
    }

    /* renamed from: g */
    public final String mo39229g() {
        String str;
        String str2 = this.f27226b;
        if (this.f27232h != HttpMethod.POST || str2 == null || !C19457k.m33018V0(str2, "/videos")) {
            String f = C13418j.m21110f();
            List list = C12865g0.f28360a;
            C19383o.m32797g(f, "subdomain");
            str = C0388a.m1049e(new Object[]{f}, 1, "https://graph.%s", "java.lang.String.format(format, *args)");
        } else {
            List list2 = C12865g0.f28360a;
            str = C0388a.m1049e(new Object[]{C13418j.m21110f()}, 1, "https://graph-video.%s", "java.lang.String.format(format, *args)");
        }
        String h = mo39230h(str);
        mo39224a();
        return mo39225b(h, false);
    }

    /* renamed from: h */
    public final String mo39230h(String str) {
        if (!(C19383o.m32792b(C13418j.m21110f(), "instagram.com") ^ true ? true : !mo39231i())) {
            List list = C12865g0.f28360a;
            str = C0388a.m1049e(new Object[]{C13418j.f29400t}, 1, "https://graph.%s", "java.lang.String.format(format, *args)");
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = f27222m.matcher(this.f27226b).matches() ? this.f27226b : C0388a.m1049e(new Object[]{this.f27230f, this.f27226b}, 2, "%s/%s", "java.lang.String.format(format, *args)");
        return C0388a.m1049e(objArr, 2, "%s/%s", "java.lang.String.format(format, *args)");
    }

    /* renamed from: i */
    public final boolean mo39231i() {
        if (this.f27226b == null) {
            return false;
        }
        StringBuilder h = C0072d.m201h("^/?");
        h.append(C13418j.m21107c());
        h.append("/?.*");
        return this.f27234j || Pattern.matches(h.toString(), this.f27226b) || Pattern.matches("^/?app/?.*", this.f27226b);
    }

    /* renamed from: j */
    public final void mo39232j(C12195b bVar) {
        if (C13418j.m21114j(LoggingBehavior.GRAPH_API_DEBUG_INFO) || C13418j.m21114j(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            this.f27231g = new C12201h(bVar);
        } else {
            this.f27231g = bVar;
        }
    }

    public final String toString() {
        StringBuilder k = C0073e.m211k("{Request: ", " accessToken: ");
        Object obj = this.f27225a;
        if (obj == null) {
            obj = "null";
        }
        k.append(obj);
        k.append(", graphPath: ");
        k.append(this.f27226b);
        k.append(", graphObject: ");
        k.append(this.f27227c);
        k.append(", httpMethod: ");
        k.append(this.f27232h);
        k.append(", parameters: ");
        k.append(this.f27228d);
        k.append("}");
        String sb = k.toString();
        C19383o.m32796f(sb, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return sb;
    }
}
