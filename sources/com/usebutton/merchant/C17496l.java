package com.usebutton.merchant;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.fasterxml.jackson.core.JsonPointer;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p623mm.C18248b;

/* renamed from: com.usebutton.merchant.l */
public final class C17496l {

    /* renamed from: a */
    public static C17473a0 f38263a = new C17473a0();

    /* renamed from: b */
    public static C17494k f38264b = new C17494k(f38263a);

    /* renamed from: c */
    public static C17503r f38265c = C17503r.f38278c;

    /* renamed from: d */
    public static ExecutorService f38266d = Executors.newSingleThreadExecutor();

    /* renamed from: com.usebutton.merchant.l$a */
    public interface C17497a {
        /* renamed from: a */
        void mo68666a();
    }

    static {
        if (C17503r.f38278c == null) {
            C17503r.f38278c = new C17503r();
        }
    }

    /* renamed from: a */
    public static C17502q m29340a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C17479d0.f38236b == null) {
            C17479d0.f38236b = new C17479d0(applicationContext);
        }
        C17479d0 d0Var = C17479d0.f38236b;
        C17509w b = m29341b(context);
        b.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("com.usebutton.merchant/");
        sb.append("1.4.6");
        sb.append('+');
        sb.append(1);
        sb.append(' ');
        sb.append("(Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(Build.MANUFACTURER);
        sb.append(' ');
        sb.append(Build.MODEL);
        sb.append("; ");
        PackageInfo b2 = b.mo68687b();
        String str = null;
        sb.append(b2 != null ? b2.packageName : null);
        sb.append(JsonPointer.SEPARATOR);
        PackageInfo b3 = b.mo68687b();
        if (b3 != null) {
            str = b3.versionName;
        }
        sb.append(str);
        sb.append('+');
        PackageInfo b4 = b.mo68687b();
        sb.append(b4 != null ? b4.versionCode : -1);
        sb.append("; ");
        sb.append(String.format(Locale.US, "Scale/%.1f; ", new Object[]{Float.valueOf(b.f38291a.getResources().getDisplayMetrics().density)}));
        Locale locale = Locale.getDefault();
        sb.append(locale.getLanguage());
        sb.append('_');
        sb.append(locale.getCountry().toLowerCase());
        sb.append(')');
        String sb2 = sb.toString();
        if (C17507u.f38283e == null) {
            C17507u.f38283e = new C17507u(sb2, d0Var);
        }
        C17507u uVar = C17507u.f38283e;
        if (C17476c.f38233b == null) {
            C17476c.f38233b = new C17476c(uVar);
        }
        C17476c cVar = C17476c.f38233b;
        C18248b a = C18248b.m30778a();
        ExecutorService executorService = f38266d;
        if (C17502q.f38270i == null) {
            C17502q.f38270i = new C17502q(cVar, b, a, d0Var, executorService);
        }
        return C17502q.f38270i;
    }

    /* renamed from: b */
    public static C17509w m29341b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C17509w.f38290d == null) {
            C17509w.f38290d = new C17509w(applicationContext, new C17513z(applicationContext));
        }
        return C17509w.f38290d;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m29342c(android.content.Context r16, android.content.Intent r17) {
        /*
            com.usebutton.merchant.g0 r0 = new com.usebutton.merchant.g0
            com.usebutton.merchant.q r1 = m29340a(r16)
            com.usebutton.merchant.g0$a r2 = new com.usebutton.merchant.g0$a
            r2.<init>()
            r3 = r16
            r0.<init>(r3, r1, r2)
            com.usebutton.merchant.k r2 = f38264b
            com.usebutton.merchant.q r4 = m29340a(r16)
            com.usebutton.merchant.w r3 = m29341b(r16)
            mm.b r5 = p623mm.C18248b.m30778a()
            r2.getClass()
            android.net.Uri r6 = r17.getData()
            if (r6 != 0) goto L_0x0029
            goto L_0x01ab
        L_0x0029:
            java.lang.String r7 = "btn_ref"
            java.lang.String r7 = r6.getQueryParameter(r7)
            r8 = 1
            if (r7 == 0) goto L_0x0040
            boolean r9 = r7.isEmpty()
            if (r9 != 0) goto L_0x0040
            r2.mo68664a(r4, r7)
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.f38261c
            r2.set(r8)
        L_0x0040:
            android.net.Uri r2 = r17.getData()
            r7 = 2
            r9 = 0
            if (r2 != 0) goto L_0x004a
            goto L_0x0138
        L_0x004a:
            java.lang.String r10 = "btn_test_echo"
            java.lang.String r10 = r2.getQueryParameter(r10)
            java.util.List r2 = r2.getPathSegments()
            if (r2 == 0) goto L_0x012b
            int r11 = r2.size()
            if (r11 != r7) goto L_0x012b
            java.lang.Object r11 = r2.get(r9)
            java.lang.String r12 = "action"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x012b
            java.lang.Object r2 = r2.get(r8)
            java.lang.String r2 = (java.lang.String) r2
            r2.getClass()
            int r10 = r2.hashCode()
            java.lang.String r11 = "version"
            java.lang.String r12 = "quit"
            java.lang.String r13 = "get-token"
            java.lang.String r14 = "test-post-install"
            r15 = 3
            switch(r10) {
                case -1094558007: goto L_0x009d;
                case -283966270: goto L_0x0094;
                case 3482191: goto L_0x008b;
                case 351608024: goto L_0x0082;
                default: goto L_0x0081;
            }
        L_0x0081:
            goto L_0x00a6
        L_0x0082:
            boolean r2 = r2.equals(r11)
            if (r2 != 0) goto L_0x0089
            goto L_0x00a6
        L_0x0089:
            r2 = r15
            goto L_0x00a7
        L_0x008b:
            boolean r2 = r2.equals(r12)
            if (r2 != 0) goto L_0x0092
            goto L_0x00a6
        L_0x0092:
            r2 = r7
            goto L_0x00a7
        L_0x0094:
            boolean r2 = r2.equals(r13)
            if (r2 != 0) goto L_0x009b
            goto L_0x00a6
        L_0x009b:
            r2 = r8
            goto L_0x00a7
        L_0x009d:
            boolean r2 = r2.equals(r14)
            if (r2 != 0) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            r2 = r9
            goto L_0x00a7
        L_0x00a6:
            r2 = -1
        L_0x00a7:
            java.lang.String r10 = "action-response"
            java.lang.String r9 = "button-brand-test"
            if (r2 == 0) goto L_0x00fb
            if (r2 == r8) goto L_0x00f7
            if (r2 == r7) goto L_0x00d4
            if (r2 == r15) goto L_0x00b5
            goto L_0x0138
        L_0x00b5:
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            android.net.Uri$Builder r1 = r1.scheme(r9)
            android.net.Uri$Builder r1 = r1.authority(r10)
            android.net.Uri$Builder r1 = r1.appendPath(r11)
            java.lang.String r2 = "1.4.6"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r11, r2)
            android.net.Uri r1 = r1.build()
            r0.mo68661b(r1)
            goto L_0x0138
        L_0x00d4:
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            android.net.Uri$Builder r1 = r1.scheme(r9)
            android.net.Uri$Builder r1 = r1.authority(r10)
            android.net.Uri$Builder r1 = r1.appendPath(r12)
            android.net.Uri r1 = r1.build()
            boolean r0 = r0.mo68661b(r1)
            if (r0 == 0) goto L_0x0138
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            goto L_0x0138
        L_0x00f7:
            r0.mo68660a(r13)
            goto L_0x0138
        L_0x00fb:
            com.usebutton.merchant.c0 r1 = r1.f38274d
            com.usebutton.merchant.d0 r1 = (com.usebutton.merchant.C17479d0) r1
            android.content.SharedPreferences r1 = r1.f38237a
            java.lang.String r2 = "btn_checked_deferred_deep_link"
            r11 = 0
            boolean r1 = r1.getBoolean(r2, r11)
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            android.net.Uri$Builder r2 = r2.scheme(r9)
            android.net.Uri$Builder r2 = r2.authority(r10)
            android.net.Uri$Builder r2 = r2.appendPath(r14)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r9 = "success"
            android.net.Uri$Builder r1 = r2.appendQueryParameter(r9, r1)
            android.net.Uri r1 = r1.build()
            r0.mo68661b(r1)
            goto L_0x0138
        L_0x012b:
            java.lang.String r1 = "true"
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x0138
            java.lang.String r1 = "echo"
            r0.mo68660a(r1)
        L_0x0138:
            android.net.Uri$Builder r0 = r6.buildUpon()
            android.net.Uri$Builder r0 = r0.clearQuery()
            java.util.Set r1 = r6.getQueryParameterNames()
            java.util.Iterator r1 = r1.iterator()
        L_0x0148:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0174
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r9 = "btn_"
            boolean r9 = r2.startsWith(r9)
            if (r9 != 0) goto L_0x016c
            java.lang.String r9 = "from_landing"
            boolean r9 = r9.equalsIgnoreCase(r2)
            if (r9 != 0) goto L_0x016c
            java.lang.String r9 = "from_tracking"
            boolean r9 = r9.equalsIgnoreCase(r2)
            if (r9 == 0) goto L_0x0148
        L_0x016c:
            java.lang.String r9 = r6.getQueryParameter(r2)
            r0.appendQueryParameter(r2, r9)
            goto L_0x0148
        L_0x0174:
            android.net.Uri r0 = r0.build()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r4.mo68677b()
            com.usebutton.merchant.Event r2 = new com.usebutton.merchant.Event
            com.usebutton.merchant.Event$Name r6 = com.usebutton.merchant.Event.Name.DEEPLINK_OPENED
            r2.<init>(r6, r1)
            com.usebutton.merchant.Event$Property r1 = com.usebutton.merchant.Event.Property.URL
            org.json.JSONObject r6 = r2.f38223e     // Catch:{ JSONException -> 0x0193 }
            java.lang.String r9 = r1.propertyName     // Catch:{ JSONException -> 0x0193 }
            r6.put(r9, r0)     // Catch:{ JSONException -> 0x0193 }
            goto L_0x01a8
        L_0x0193:
            r0 = move-exception
            java.lang.String r6 = "Event"
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r9 = 0
            r7[r9] = r1
            com.usebutton.merchant.Event$Name r1 = r2.f38221c
            r7[r8] = r1
            java.lang.String r1 = "Error adding property [%s] to event [%s]"
            java.lang.String r1 = java.lang.String.format(r1, r7)
            android.util.Log.e(r6, r1, r0)
        L_0x01a8:
            r4.mo68679d(r3, r5, r2)
        L_0x01ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usebutton.merchant.C17496l.m29342c(android.content.Context, android.content.Intent):void");
    }
}
