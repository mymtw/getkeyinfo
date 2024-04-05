package com.facebook;

import com.facebook.login.LoginFragment;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import org.json.JSONArray;
import org.json.JSONObject;
import p504ai.C13983i;

public final class GraphResponse {

    /* renamed from: e */
    public static final String f27242e = GraphResponse.class.getCanonicalName();

    /* renamed from: f */
    public static final C12203a f27243f = new C12203a();

    /* renamed from: a */
    public final JSONObject f27244a;

    /* renamed from: b */
    public final HttpURLConnection f27245b;

    /* renamed from: c */
    public final JSONObject f27246c;

    /* renamed from: d */
    public final FacebookRequestError f27247d;

    public enum PagingDirection {
        NEXT,
        PREVIOUS
    }

    /* renamed from: com.facebook.GraphResponse$a */
    public static final class C12203a {
        /* renamed from: a */
        public static ArrayList m20027a(List list, HttpURLConnection httpURLConnection, FacebookException facebookException) {
            C19383o.m32797g(list, "requests");
            ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new GraphResponse((GraphRequest) it.next(), httpURLConnection, new FacebookRequestError(httpURLConnection, (Exception) facebookException)));
            }
            return arrayList;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.facebook.GraphResponse m20028b(com.facebook.GraphRequest r8, java.net.HttpURLConnection r9, java.lang.Object r10, java.lang.Object r11) throws org.json.JSONException {
            /*
                boolean r0 = r10 instanceof org.json.JSONObject
                r1 = 0
                if (r0 == 0) goto L_0x00ae
                com.facebook.FacebookRequestError$a r0 = com.facebook.FacebookRequestError.Companion
                org.json.JSONObject r10 = (org.json.JSONObject) r10
                r0.getClass()
                com.facebook.FacebookRequestError r11 = com.facebook.FacebookRequestError.C12189a.m19988a(r10, r11, r9)
                if (r11 == 0) goto L_0x006f
                java.lang.String r10 = com.facebook.GraphResponse.f27242e
                java.lang.String r0 = r11.toString()
                android.util.Log.e(r10, r0)
                int r10 = r11.getErrorCode()
                r0 = 190(0xbe, float:2.66E-43)
                if (r10 != r0) goto L_0x0069
                com.facebook.AccessToken r10 = r8.f27225a
                int r0 = p365hg.C12869i0.f28368a
                r0 = 1
                if (r10 == 0) goto L_0x003b
                com.facebook.AccessToken$c r2 = com.facebook.AccessToken.Companion
                r2.getClass()
                com.facebook.AccessToken r2 = com.facebook.AccessToken.C12174c.m19981d()
                boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r10, r2)
                if (r10 == 0) goto L_0x003b
                r10 = r0
                goto L_0x003c
            L_0x003b:
                r10 = 0
            L_0x003c:
                if (r10 == 0) goto L_0x0069
                int r10 = r11.getSubErrorCode()
                r2 = 493(0x1ed, float:6.91E-43)
                if (r10 == r2) goto L_0x0055
                com.facebook.AccessToken$c r10 = com.facebook.AccessToken.Companion
                r10.getClass()
                tf.c$a r10 = p453tf.C13401c.f29349g
                tf.c r10 = r10.mo46082a()
                r10.mo46081d(r1, r0)
                goto L_0x0069
            L_0x0055:
                com.facebook.AccessToken$c r10 = com.facebook.AccessToken.Companion
                r10.getClass()
                com.facebook.AccessToken r10 = com.facebook.AccessToken.C12174c.m19981d()
                if (r10 == 0) goto L_0x0069
                boolean r10 = r10.isExpired()
                if (r10 != 0) goto L_0x0069
                com.facebook.AccessToken.C12174c.m19980c()
            L_0x0069:
                com.facebook.GraphResponse r10 = new com.facebook.GraphResponse
                r10.<init>(r8, r9, r11)
                return r10
            L_0x006f:
                java.lang.String r11 = "body"
                java.lang.String r0 = "FACEBOOK_NON_JSON_RESULT"
                java.lang.Object r10 = p365hg.C12869i0.m20581t(r11, r0, r10)
                boolean r11 = r10 instanceof org.json.JSONObject
                if (r11 == 0) goto L_0x0087
                com.facebook.GraphResponse r11 = new com.facebook.GraphResponse
                java.lang.String r0 = r10.toString()
                org.json.JSONObject r10 = (org.json.JSONObject) r10
                r11.<init>(r8, r9, r0, r10)
                return r11
            L_0x0087:
                boolean r11 = r10 instanceof org.json.JSONArray
                if (r11 == 0) goto L_0x00a7
                com.facebook.GraphResponse r11 = new com.facebook.GraphResponse
                java.lang.String r0 = r10.toString()
                r6 = r10
                org.json.JSONArray r6 = (org.json.JSONArray) r6
                java.lang.String r10 = "request"
                kotlin.jvm.internal.C19383o.m32797g(r8, r10)
                java.lang.String r10 = "rawResponse"
                kotlin.jvm.internal.C19383o.m32797g(r0, r10)
                r5 = 0
                r7 = 0
                r2 = r11
                r3 = r8
                r4 = r9
                r2.<init>(r3, r4, r5, r6, r7)
                return r11
            L_0x00a7:
                java.lang.Object r10 = org.json.JSONObject.NULL
                java.lang.String r11 = "JSONObject.NULL"
                kotlin.jvm.internal.C19383o.m32796f(r10, r11)
            L_0x00ae:
                java.lang.Object r11 = org.json.JSONObject.NULL
                if (r10 != r11) goto L_0x00bc
                com.facebook.GraphResponse r11 = new com.facebook.GraphResponse
                java.lang.String r10 = r10.toString()
                r11.<init>(r8, r9, r10, r1)
                return r11
            L_0x00bc:
                com.facebook.FacebookException r8 = new com.facebook.FacebookException
                java.lang.String r9 = "Got unexpected object type in response, class: "
                java.lang.StringBuilder r9 = android.support.p013v4.media.C0072d.m201h(r9)
                java.lang.Class r10 = r10.getClass()
                java.lang.String r10 = r10.getSimpleName()
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                r8.<init>((java.lang.String) r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphResponse.C12203a.m20028b(com.facebook.GraphRequest, java.net.HttpURLConnection, java.lang.Object, java.lang.Object):com.facebook.GraphResponse");
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0087  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.ArrayList m20029c(java.io.InputStream r13, java.net.HttpURLConnection r14, p453tf.C13426p r15) throws com.facebook.FacebookException, org.json.JSONException, java.io.IOException {
            /*
                java.lang.String r0 = "requests"
                kotlin.jvm.internal.C19383o.m32797g(r15, r0)
                java.lang.String r13 = p365hg.C12869i0.m20557M(r13)
                hg.c0$a r0 = p365hg.C12845c0.f28334f
                com.facebook.LoggingBehavior r1 = com.facebook.LoggingBehavior.INCLUDE_RAW_RESPONSES
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]
                int r4 = r13.length()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5 = 0
                r3[r5] = r4
                r4 = 1
                r3[r4] = r13
                java.lang.String r6 = "Response"
                java.lang.String r7 = "Response (raw)\n  Size: %d\n  Response:\n%s\n"
                r0.mo45627c(r1, r6, r7, r3)
                org.json.JSONTokener r0 = new org.json.JSONTokener
                r0.<init>(r13)
                java.lang.Object r0 = r0.nextValue()
                java.lang.String r1 = "resultObject"
                kotlin.jvm.internal.C19383o.m32796f(r0, r1)
                int r1 = r15.size()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>(r1)
                if (r1 != r4) goto L_0x0082
                java.lang.Object r7 = r15.get(r5)
                com.facebook.GraphRequest r7 = (com.facebook.GraphRequest) r7
                org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0074, IOException -> 0x0065 }
                r8.<init>()     // Catch:{ JSONException -> 0x0074, IOException -> 0x0065 }
                java.lang.String r9 = "body"
                r8.put(r9, r0)     // Catch:{ JSONException -> 0x0074, IOException -> 0x0065 }
                if (r14 == 0) goto L_0x0055
                int r9 = r14.getResponseCode()     // Catch:{ JSONException -> 0x0074, IOException -> 0x0065 }
                goto L_0x0057
            L_0x0055:
                r9 = 200(0xc8, float:2.8E-43)
            L_0x0057:
                java.lang.String r10 = "code"
                r8.put(r10, r9)     // Catch:{ JSONException -> 0x0074, IOException -> 0x0065 }
                org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0074, IOException -> 0x0065 }
                r9.<init>()     // Catch:{ JSONException -> 0x0074, IOException -> 0x0065 }
                r9.put(r8)     // Catch:{ JSONException -> 0x0074, IOException -> 0x0065 }
                goto L_0x0083
            L_0x0065:
                r8 = move-exception
                com.facebook.GraphResponse r9 = new com.facebook.GraphResponse
                com.facebook.FacebookRequestError r10 = new com.facebook.FacebookRequestError
                r10.<init>((java.net.HttpURLConnection) r14, (java.lang.Exception) r8)
                r9.<init>(r7, r14, r10)
                r3.add(r9)
                goto L_0x0082
            L_0x0074:
                r8 = move-exception
                com.facebook.GraphResponse r9 = new com.facebook.GraphResponse
                com.facebook.FacebookRequestError r10 = new com.facebook.FacebookRequestError
                r10.<init>((java.net.HttpURLConnection) r14, (java.lang.Exception) r8)
                r9.<init>(r7, r14, r10)
                r3.add(r9)
            L_0x0082:
                r9 = r0
            L_0x0083:
                boolean r7 = r9 instanceof org.json.JSONArray
                if (r7 == 0) goto L_0x00f0
                r7 = r9
                org.json.JSONArray r7 = (org.json.JSONArray) r7
                int r8 = r7.length()
                if (r8 != r1) goto L_0x00f0
                int r1 = r7.length()
                r7 = r5
            L_0x0095:
                if (r7 >= r1) goto L_0x00d3
                java.lang.Object r8 = r15.get(r7)
                com.facebook.GraphRequest r8 = (com.facebook.GraphRequest) r8
                r10 = r9
                org.json.JSONArray r10 = (org.json.JSONArray) r10     // Catch:{ JSONException -> 0x00b3, FacebookException -> 0x00b1 }
                java.lang.Object r10 = r10.get(r7)     // Catch:{ JSONException -> 0x00b3, FacebookException -> 0x00b1 }
                java.lang.String r11 = "obj"
                kotlin.jvm.internal.C19383o.m32796f(r10, r11)     // Catch:{ JSONException -> 0x00b3, FacebookException -> 0x00b1 }
                com.facebook.GraphResponse r10 = m20028b(r8, r14, r10, r0)     // Catch:{ JSONException -> 0x00b3, FacebookException -> 0x00b1 }
                r3.add(r10)     // Catch:{ JSONException -> 0x00b3, FacebookException -> 0x00b1 }
                goto L_0x00d0
            L_0x00b1:
                r10 = move-exception
                goto L_0x00b5
            L_0x00b3:
                r10 = move-exception
                goto L_0x00c3
            L_0x00b5:
                com.facebook.GraphResponse r11 = new com.facebook.GraphResponse
                com.facebook.FacebookRequestError r12 = new com.facebook.FacebookRequestError
                r12.<init>((java.net.HttpURLConnection) r14, (java.lang.Exception) r10)
                r11.<init>(r8, r14, r12)
                r3.add(r11)
                goto L_0x00d0
            L_0x00c3:
                com.facebook.GraphResponse r11 = new com.facebook.GraphResponse
                com.facebook.FacebookRequestError r12 = new com.facebook.FacebookRequestError
                r12.<init>((java.net.HttpURLConnection) r14, (java.lang.Exception) r10)
                r11.<init>(r8, r14, r12)
                r3.add(r11)
            L_0x00d0:
                int r7 = r7 + 1
                goto L_0x0095
            L_0x00d3:
                hg.c0$a r14 = p365hg.C12845c0.f28334f
                com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.REQUESTS
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r15 = r15.f29412c
                r1[r5] = r15
                int r13 = r13.length()
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r1[r4] = r13
                r1[r2] = r3
                java.lang.String r13 = "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n"
                r14.mo45627c(r0, r6, r13, r1)
                return r3
            L_0x00f0:
                com.facebook.FacebookException r13 = new com.facebook.FacebookException
                java.lang.String r14 = "Unexpected number of results"
                r13.<init>((java.lang.String) r14)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphResponse.C12203a.m20029c(java.io.InputStream, java.net.HttpURLConnection, tf.p):java.util.ArrayList");
        }
    }

    public GraphResponse(GraphRequest graphRequest, HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        C19383o.m32797g(graphRequest, LoginFragment.EXTRA_REQUEST);
        this.f27245b = httpURLConnection;
        this.f27246c = jSONObject;
        this.f27247d = facebookRequestError;
        this.f27244a = jSONObject;
    }

    public final String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f27245b;
            objArr[0] = Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200);
            str = String.format(locale, "%d", Arrays.copyOf(objArr, 1));
            C19383o.m32796f(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder n = C13983i.m21495n("{Response: ", " responseCode: ", str, ", graphObject: ");
        n.append(this.f27246c);
        n.append(", error: ");
        n.append(this.f27247d);
        n.append("}");
        String sb = n.toString();
        C19383o.m32796f(sb, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return sb;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GraphResponse(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, jSONObject, (JSONArray) null, (FacebookRequestError) null);
        C19383o.m32797g(graphRequest, LoginFragment.EXTRA_REQUEST);
        C19383o.m32797g(str, "rawResponse");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GraphResponse(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, (JSONObject) null, (JSONArray) null, facebookRequestError);
        C19383o.m32797g(graphRequest, LoginFragment.EXTRA_REQUEST);
    }
}
