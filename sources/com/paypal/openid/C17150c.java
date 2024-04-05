package com.paypal.openid;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.activity.C0114h;
import com.paypal.openid.AuthorizationException;
import com.paypal.openid.C17156f;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;
import p684to.C18568a;
import p692uo.C18632a;
import p692uo.C18635d;
import p700vo.C18668a;
import p708wo.C18755a;

/* renamed from: com.paypal.openid.c */
public final class C17150c {

    /* renamed from: a */
    public Context f37573a;

    /* renamed from: b */
    public final C18568a f37574b;

    /* renamed from: c */
    public final C18635d f37575c;

    /* renamed from: d */
    public final C18632a f37576d;

    /* renamed from: com.paypal.openid.c$a */
    public interface C17151a {
        /* renamed from: a */
        void mo61660a(C17156f fVar, AuthorizationException authorizationException);
    }

    /* renamed from: com.paypal.openid.c$b */
    public static class C17152b extends AsyncTask<Void, Void, JSONObject> {

        /* renamed from: a */
        public C17154e f37577a;

        /* renamed from: b */
        public ClientAuthentication f37578b;

        /* renamed from: c */
        public final C18668a f37579c;

        /* renamed from: d */
        public C17151a f37580d;

        /* renamed from: e */
        public AuthorizationException f37581e;

        public C17152b(C17154e eVar, C18668a aVar, C17151a aVar2) {
            C0114h hVar = C0114h.f186w;
            this.f37577a = eVar;
            this.f37578b = hVar;
            this.f37579c = aVar;
            this.f37580d = aVar2;
        }

        /* renamed from: a */
        public static void m28611a(HttpURLConnection httpURLConnection) {
            if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("Accept"))) {
                httpURLConnection.setRequestProperty("Accept", "application/json");
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:38:0x011a A[SYNTHETIC, Splitter:B:38:0x011a] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0122 A[SYNTHETIC, Splitter:B:44:0x0122] */
        /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object doInBackground(java.lang.Object[] r10) {
            /*
                r9 = this;
                java.lang.String r0 = "Failed to complete exchange request"
                java.lang.Void[] r10 = (java.lang.Void[]) r10
                java.lang.String r10 = "Response "
                java.lang.String r1 = "user-agent"
                r2 = 3
                r3 = 0
                r4 = 0
                vo.a r5 = r9.f37579c     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                com.paypal.openid.e r6 = r9.f37577a     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                com.paypal.openid.d r6 = r6.f37587a     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                android.net.Uri r6 = r6.f37583b     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                vo.b r5 = (p700vo.C18669b) r5     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                java.net.HttpURLConnection r5 = r5.mo70181a(r6)     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                java.lang.String r6 = "POST"
                r5.setRequestMethod(r6)     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                java.lang.String r6 = "Content-Type"
                java.lang.String r7 = "application/x-www-form-urlencoded"
                r5.setRequestProperty(r6, r7)     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                m28611a(r5)     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                r6 = 1
                r5.setDoOutput(r6)     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                com.paypal.openid.e r6 = r9.f37577a     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                java.util.HashMap r6 = r6.mo62556b()     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                com.paypal.openid.ClientAuthentication r7 = r9.f37578b     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                com.paypal.openid.e r8 = r9.f37577a     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                java.lang.String r8 = r8.f37588b     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                java.util.Map r7 = r7.mo1132g(r8)     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                java.lang.Object r8 = r6.get(r1)     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                if (r8 == 0) goto L_0x004b
                java.lang.Object r8 = r6.get(r1)     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                r7.put(r1, r8)     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
            L_0x004b:
                if (r7 == 0) goto L_0x0071
                java.util.Set r1 = r7.entrySet()     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
            L_0x0055:
                boolean r7 = r1.hasNext()     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                if (r7 == 0) goto L_0x0071
                java.lang.Object r7 = r1.next()     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                java.lang.Object r8 = r7.getKey()     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                java.lang.Object r7 = r7.getValue()     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                r5.setRequestProperty(r8, r7)     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                goto L_0x0055
            L_0x0071:
                com.paypal.openid.ClientAuthentication r1 = r9.f37578b     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                com.paypal.openid.e r7 = r9.f37577a     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                java.lang.String r7 = r7.f37588b     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                java.util.Map r1 = r1.mo1136l(r7)     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                if (r1 == 0) goto L_0x0080
                r6.putAll(r1)     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
            L_0x0080:
                java.lang.String r1 = p708wo.C18756b.m31634b(r6)     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                java.lang.String r6 = "Content-Length"
                int r7 = r1.length()     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                r5.setRequestProperty(r6, r7)     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                java.io.OutputStreamWriter r6 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                java.io.OutputStream r7 = r5.getOutputStream()     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                r6.<init>(r7)     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                r6.write(r1)     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                r6.flush()     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                int r1 = r5.getResponseCode()     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                r6 = 200(0xc8, float:2.8E-43)
                if (r1 < r6) goto L_0x00b5
                int r1 = r5.getResponseCode()     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                r6 = 300(0x12c, float:4.2E-43)
                if (r1 >= r6) goto L_0x00b5
                java.io.InputStream r1 = r5.getInputStream()     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
                goto L_0x00b9
            L_0x00b5:
                java.io.InputStream r1 = r5.getErrorStream()     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00f8, all -> 0x00f4 }
            L_0x00b9:
                java.lang.String r6 = androidx.compose.p015ui.text.input.C1993m.m4363X(r1)     // Catch:{ IOException -> 0x00f2, JSONException -> 0x00f0 }
                android.util.Log.d(r10, r6)     // Catch:{ IOException -> 0x00f2, JSONException -> 0x00f0 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00f2, JSONException -> 0x00f0 }
                r7.<init>()     // Catch:{ IOException -> 0x00f2, JSONException -> 0x00f0 }
                java.lang.String r8 = r5.getResponseMessage()     // Catch:{ IOException -> 0x00f2, JSONException -> 0x00f0 }
                r7.append(r8)     // Catch:{ IOException -> 0x00f2, JSONException -> 0x00f0 }
                java.lang.String r8 = " response message, "
                r7.append(r8)     // Catch:{ IOException -> 0x00f2, JSONException -> 0x00f0 }
                int r5 = r5.getResponseCode()     // Catch:{ IOException -> 0x00f2, JSONException -> 0x00f0 }
                r7.append(r5)     // Catch:{ IOException -> 0x00f2, JSONException -> 0x00f0 }
                java.lang.String r5 = " resposne code"
                r7.append(r5)     // Catch:{ IOException -> 0x00f2, JSONException -> 0x00f0 }
                java.lang.String r5 = r7.toString()     // Catch:{ IOException -> 0x00f2, JSONException -> 0x00f0 }
                android.util.Log.d(r10, r5)     // Catch:{ IOException -> 0x00f2, JSONException -> 0x00f0 }
                org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ IOException -> 0x00f2, JSONException -> 0x00f0 }
                r10.<init>(r6)     // Catch:{ IOException -> 0x00f2, JSONException -> 0x00f0 }
                if (r1 == 0) goto L_0x00ee
                r1.close()     // Catch:{ IOException -> 0x00ee }
            L_0x00ee:
                r4 = r10
                goto L_0x011d
            L_0x00f0:
                r10 = move-exception
                goto L_0x00fa
            L_0x00f2:
                r10 = move-exception
                goto L_0x0107
            L_0x00f4:
                r10 = move-exception
                goto L_0x0120
            L_0x00f6:
                r10 = move-exception
                goto L_0x0106
            L_0x00f8:
                r10 = move-exception
                r1 = r4
            L_0x00fa:
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x011e }
                wo.a r5 = p708wo.C18755a.m31631b()     // Catch:{ all -> 0x011e }
                r5.mo70245c(r2, r10, r0, r3)     // Catch:{ all -> 0x011e }
                com.paypal.openid.AuthorizationException r0 = com.paypal.openid.AuthorizationException.C17146b.f37529c     // Catch:{ all -> 0x011e }
                goto L_0x0112
            L_0x0106:
                r1 = r4
            L_0x0107:
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x011e }
                wo.a r5 = p708wo.C18755a.m31631b()     // Catch:{ all -> 0x011e }
                r5.mo70245c(r2, r10, r0, r3)     // Catch:{ all -> 0x011e }
                com.paypal.openid.AuthorizationException r0 = com.paypal.openid.AuthorizationException.C17146b.f37528b     // Catch:{ all -> 0x011e }
            L_0x0112:
                com.paypal.openid.AuthorizationException r10 = com.paypal.openid.AuthorizationException.fromTemplate(r0, r10)     // Catch:{ all -> 0x011e }
                r9.f37581e = r10     // Catch:{ all -> 0x011e }
                if (r1 == 0) goto L_0x011d
                r1.close()     // Catch:{ IOException -> 0x011d }
            L_0x011d:
                return r4
            L_0x011e:
                r10 = move-exception
                r4 = r1
            L_0x0120:
                if (r4 == 0) goto L_0x0125
                r4.close()     // Catch:{ IOException -> 0x0125 }
            L_0x0125:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.paypal.openid.C17150c.C17152b.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        public final void onPostExecute(Object obj) {
            AuthorizationException authorizationException;
            C17151a aVar;
            JSONObject jSONObject = (JSONObject) obj;
            AuthorizationException authorizationException2 = this.f37581e;
            if (authorizationException2 != null) {
                this.f37580d.mo61660a((C17156f) null, authorizationException2);
                return;
            }
            if (jSONObject.has("error")) {
                try {
                    String string = jSONObject.getString("error");
                    AuthorizationException authorizationException3 = AuthorizationException.C17147c.f37532b.get(string);
                    if (authorizationException3 == null) {
                        authorizationException3 = AuthorizationException.C17147c.f37531a;
                    }
                    String optString = jSONObject.optString(AuthorizationException.PARAM_ERROR_DESCRIPTION, (String) null);
                    String optString2 = jSONObject.optString(AuthorizationException.PARAM_ERROR_URI);
                    authorizationException = AuthorizationException.fromOAuthTemplate(authorizationException3, string, optString, optString2 == null ? null : Uri.parse(optString2));
                } catch (JSONException e) {
                    authorizationException = AuthorizationException.fromTemplate(AuthorizationException.C17146b.f37529c, e);
                }
                aVar = this.f37580d;
            } else {
                try {
                    C17156f.C17157a aVar2 = new C17156f.C17157a(this.f37577a);
                    aVar2.mo62558a(jSONObject);
                    C17156f fVar = new C17156f(aVar2.f37621a, aVar2.f37622b, aVar2.f37623c, aVar2.f37624d, aVar2.f37625e, aVar2.f37626f, aVar2.f37627g, aVar2.f37628h, aVar2.f37629i);
                    C18755a.m31630a("Token exchange with %s completed", this.f37577a.f37587a.f37583b);
                    this.f37580d.mo61660a(fVar, (AuthorizationException) null);
                    return;
                } catch (JSONException e2) {
                    aVar = this.f37580d;
                    authorizationException = AuthorizationException.fromTemplate(AuthorizationException.C17146b.f37529c, e2);
                }
            }
            aVar.mo61660a((C17156f) null, authorizationException);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d8 A[Catch:{ NameNotFoundException -> 0x002b }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dd A[Catch:{ NameNotFoundException -> 0x002b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17150c(android.content.Context r15) {
        /*
            r14 = this;
            to.a r0 = p684to.C18568a.f40872b
            r0.getClass()
            android.content.Intent r1 = p692uo.C18633b.f41148a
            android.content.pm.PackageManager r1 = r15.getPackageManager()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.content.Intent r3 = p692uo.C18633b.f41148a
            r4 = 0
            android.content.pm.ResolveInfo r5 = r1.resolveActivity(r3, r4)
            r6 = 0
            if (r5 == 0) goto L_0x001f
            android.content.pm.ActivityInfo r5 = r5.activityInfo
            java.lang.String r5 = r5.packageName
            goto L_0x0020
        L_0x001f:
            r5 = r6
        L_0x0020:
            r7 = 131136(0x20040, float:1.8376E-40)
            java.util.List r3 = r1.queryIntentActivities(r3, r7)
            java.util.Iterator r3 = r3.iterator()
        L_0x002b:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x00e2
            java.lang.Object r7 = r3.next()
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            android.content.IntentFilter r8 = r7.filter
            r9 = 1
            if (r8 == 0) goto L_0x0088
            java.lang.String r10 = "android.intent.action.VIEW"
            boolean r8 = r8.hasAction(r10)
            if (r8 == 0) goto L_0x0088
            android.content.IntentFilter r8 = r7.filter
            java.lang.String r10 = "android.intent.category.BROWSABLE"
            boolean r8 = r8.hasCategory(r10)
            if (r8 == 0) goto L_0x0088
            android.content.IntentFilter r8 = r7.filter
            java.util.Iterator r8 = r8.schemesIterator()
            if (r8 != 0) goto L_0x0057
            goto L_0x0088
        L_0x0057:
            android.content.IntentFilter r8 = r7.filter
            java.util.Iterator r8 = r8.authoritiesIterator()
            if (r8 == 0) goto L_0x0060
            goto L_0x0088
        L_0x0060:
            android.content.IntentFilter r8 = r7.filter
            java.util.Iterator r8 = r8.schemesIterator()
            r10 = r4
            r11 = r10
        L_0x0068:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x0088
            java.lang.Object r12 = r8.next()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = "http"
            boolean r13 = r13.equals(r12)
            r10 = r10 | r13
            java.lang.String r13 = "https"
            boolean r12 = r13.equals(r12)
            r11 = r11 | r12
            if (r10 == 0) goto L_0x0068
            if (r11 == 0) goto L_0x0068
            r8 = r9
            goto L_0x0089
        L_0x0088:
            r8 = r4
        L_0x0089:
            if (r8 != 0) goto L_0x008c
            goto L_0x002b
        L_0x008c:
            android.content.pm.ActivityInfo r8 = r7.activityInfo     // Catch:{ NameNotFoundException -> 0x002b }
            java.lang.String r8 = r8.packageName     // Catch:{ NameNotFoundException -> 0x002b }
            r10 = 64
            android.content.pm.PackageInfo r8 = r1.getPackageInfo(r8, r10)     // Catch:{ NameNotFoundException -> 0x002b }
            android.content.pm.ActivityInfo r10 = r7.activityInfo     // Catch:{ NameNotFoundException -> 0x002b }
            java.lang.String r10 = r10.packageName     // Catch:{ NameNotFoundException -> 0x002b }
            android.content.Intent r11 = new android.content.Intent     // Catch:{ NameNotFoundException -> 0x002b }
            r11.<init>()     // Catch:{ NameNotFoundException -> 0x002b }
            java.lang.String r12 = "android.support.customtabs.action.CustomTabsService"
            r11.setAction(r12)     // Catch:{ NameNotFoundException -> 0x002b }
            r11.setPackage(r10)     // Catch:{ NameNotFoundException -> 0x002b }
            android.content.pm.ResolveInfo r10 = r1.resolveService(r11, r4)     // Catch:{ NameNotFoundException -> 0x002b }
            if (r10 == 0) goto L_0x00af
            r10 = r9
            goto L_0x00b0
        L_0x00af:
            r10 = r4
        L_0x00b0:
            if (r10 == 0) goto L_0x00c8
            uo.a r10 = new uo.a     // Catch:{ NameNotFoundException -> 0x002b }
            r10.<init>(r8, r9)     // Catch:{ NameNotFoundException -> 0x002b }
            android.content.pm.ActivityInfo r11 = r7.activityInfo     // Catch:{ NameNotFoundException -> 0x002b }
            java.lang.String r11 = r11.packageName     // Catch:{ NameNotFoundException -> 0x002b }
            boolean r11 = r11.equals(r5)     // Catch:{ NameNotFoundException -> 0x002b }
            if (r11 == 0) goto L_0x00c5
            r2.add(r4, r10)     // Catch:{ NameNotFoundException -> 0x002b }
            goto L_0x00c9
        L_0x00c5:
            r2.add(r10)     // Catch:{ NameNotFoundException -> 0x002b }
        L_0x00c8:
            r9 = r4
        L_0x00c9:
            uo.a r10 = new uo.a     // Catch:{ NameNotFoundException -> 0x002b }
            r10.<init>(r8, r4)     // Catch:{ NameNotFoundException -> 0x002b }
            android.content.pm.ActivityInfo r7 = r7.activityInfo     // Catch:{ NameNotFoundException -> 0x002b }
            java.lang.String r7 = r7.packageName     // Catch:{ NameNotFoundException -> 0x002b }
            boolean r7 = r7.equals(r5)     // Catch:{ NameNotFoundException -> 0x002b }
            if (r7 == 0) goto L_0x00dd
            r2.add(r9, r10)     // Catch:{ NameNotFoundException -> 0x002b }
            goto L_0x002b
        L_0x00dd:
            r2.add(r10)     // Catch:{ NameNotFoundException -> 0x002b }
            goto L_0x002b
        L_0x00e2:
            java.util.Iterator r1 = r2.iterator()
            r2 = r6
        L_0x00e7:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0101
            java.lang.Object r3 = r1.next()
            uo.a r3 = (p692uo.C18632a) r3
            java.lang.Boolean r5 = r3.f41147d
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x00fd
            r2 = r3
            goto L_0x0101
        L_0x00fd:
            if (r2 != 0) goto L_0x00e7
            r2 = r3
            goto L_0x00e7
        L_0x0101:
            uo.d r1 = new uo.d
            r1.<init>(r15)
            r14.<init>()
            r14.f37573a = r15
            r14.f37574b = r0
            r14.f37575c = r1
            r14.f37576d = r2
            if (r2 == 0) goto L_0x0152
            java.lang.Boolean r15 = r2.f41147d
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x0152
            java.lang.String r15 = r2.f41144a
            monitor-enter(r1)
            uo.c r0 = r1.f41153d     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x0123
            goto L_0x014d
        L_0x0123:
            uo.c r0 = new uo.c     // Catch:{ all -> 0x014f }
            r0.<init>(r1)     // Catch:{ all -> 0x014f }
            r1.f41153d = r0     // Catch:{ all -> 0x014f }
            java.lang.ref.WeakReference<android.content.Context> r0 = r1.f41150a     // Catch:{ all -> 0x014f }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x014f }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x013c
            uo.c r2 = r1.f41153d     // Catch:{ all -> 0x014f }
            boolean r15 = p156k.C7167d.m13828a(r0, r15, r2)     // Catch:{ all -> 0x014f }
            if (r15 != 0) goto L_0x014d
        L_0x013c:
            java.lang.Object[] r15 = new java.lang.Object[r4]     // Catch:{ all -> 0x014f }
            java.lang.String r0 = "Unable to bind custom tabs service"
            wo.a r2 = p708wo.C18755a.m31631b()     // Catch:{ all -> 0x014f }
            r3 = 4
            r2.mo70245c(r3, r6, r0, r15)     // Catch:{ all -> 0x014f }
            java.util.concurrent.CountDownLatch r15 = r1.f41152c     // Catch:{ all -> 0x014f }
            r15.countDown()     // Catch:{ all -> 0x014f }
        L_0x014d:
            monitor-exit(r1)
            goto L_0x0152
        L_0x014f:
            r15 = move-exception
            monitor-exit(r1)
            throw r15
        L_0x0152:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.openid.C17150c.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public final void mo62552a(C17154e eVar, C17151a aVar) {
        C18755a.m31630a("Initiating code exchange request to %s", eVar.f37587a.f37583b);
        new C17152b(eVar, this.f37574b.f40873a, aVar).execute(new Void[0]);
    }
}
