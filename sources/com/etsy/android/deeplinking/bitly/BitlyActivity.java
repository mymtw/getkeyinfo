package com.etsy.android.deeplinking.bitly;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.logger.C8694h;
import p096e9.C6759b;
import p440s9.C13366a;

public class BitlyActivity extends FragmentActivity implements C13366a {
    public C6759b bitly;

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01d6, code lost:
        if (r1 != false) goto L_0x01d8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void handleIntent(android.content.Intent r15) {
        /*
            r14 = this;
            e9.b r0 = r14.bitly
            r0.getClass()
            java.lang.String r1 = "intent"
            kotlin.jvm.internal.C19383o.m32797g(r15, r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f14893h
            android.app.Application r2 = r0.f14886a
            java.lang.String r3 = "null cannot be cast to non-null type com.etsy.android.BOEApplication"
            kotlin.jvm.internal.C19383o.m32795e(r2, r3)
            com.etsy.android.BOEApplication r2 = (com.etsy.android.BOEApplication) r2
            com.etsy.android.lib.logger.b r2 = r2.getAnalyticsTracker()
            com.etsy.android.lib.config.e r2 = r2.mo21332b()
            com.etsy.android.lib.config.EtsyConfigKey r3 = com.etsy.android.lib.config.C8592b.f18718A
            boolean r2 = r2.mo21132b(r3)
            r4 = 0
            boolean r1 = r1.compareAndSet(r4, r2)
            r2 = 0
            r5 = 1
            if (r1 == 0) goto L_0x014d
            android.app.Application r1 = r0.f14886a
            java.lang.String r6 = "null cannot be cast to non-null type com.etsy.android.BOEApplication"
            kotlin.jvm.internal.C19383o.m32795e(r1, r6)
            com.etsy.android.BOEApplication r1 = (com.etsy.android.BOEApplication) r1
            com.etsy.android.lib.logger.b r1 = r1.getAnalyticsTracker()
            com.etsy.android.lib.config.e r1 = r1.mo21332b()
            boolean r1 = r1.mo21132b(r3)
            if (r1 == 0) goto L_0x014d
            com.etsy.android.lib.network.Connectivity r1 = r0.f14887b
            boolean r1 = r1.mo29933a()
            if (r1 != 0) goto L_0x0052
            com.etsy.android.lib.logger.h r1 = r0.f14888c
            r1.mo21308c()
            goto L_0x014d
        L_0x0052:
            android.app.Application r1 = r0.f14886a
            android.content.Context r1 = r1.getApplicationContext()
            java.lang.String r3 = r0.f14892g
            java.lang.String r6 = "etsy.me"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.util.List r6 = java.util.Arrays.asList(r6)
            java.lang.String r7 = "etsy"
            java.lang.String[] r7 = new java.lang.String[]{r7}
            java.util.List r7 = java.util.Arrays.asList(r7)
            e9.a r8 = new e9.a
            r8.<init>(r0)
            y3.b r9 = p291y3.C8371b.f18351h
            android.content.SharedPreferences r9 = android.preference.PreferenceManager.getDefaultSharedPreferences(r1)
            java.lang.String r10 = "com.bitly.custom.base.url"
            java.lang.String r9 = r9.getString(r10, r2)
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto L_0x0087
            p291y3.C8371b.f18352i = r9
        L_0x0087:
            y3.b r9 = p291y3.C8371b.f18351h
            r9.f18353a = r3
            android.content.ContentResolver r3 = r1.getContentResolver()
            java.lang.String r10 = "android_id"
            java.lang.String r3 = android.provider.Settings.Secure.getString(r3, r10)
            r9.f18354b = r3
            y3.b r3 = p291y3.C8371b.f18351h
            java.util.ArrayList r3 = r3.f18355c
            r3.addAll(r6)
            y3.b r3 = p291y3.C8371b.f18351h
            java.util.ArrayList r3 = r3.f18356d
            r3.addAll(r7)
            y3.b r3 = p291y3.C8371b.f18351h
            r3.f18357e = r4
            r3.f18358f = r8
            y3.c r6 = new y3.c
            r6.<init>(r1)
            r3.f18359g = r6
            y3.b r3 = p291y3.C8371b.f18351h
            y3.c r6 = r3.f18359g
            java.lang.String r7 = r3.f18353a
            java.lang.String r3 = r3.f18354b
            y3.a r8 = new y3.a
            r8.<init>(r1)
            monitor-enter(r6)
            r6.f18361b = r8     // Catch:{ all -> 0x014a }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x014a }
            android.content.SharedPreferences r10 = r6.f18362c     // Catch:{ all -> 0x014a }
            java.lang.String r11 = "bitly.last.correlation"
            r12 = 0
            long r10 = r10.getLong(r11, r12)     // Catch:{ all -> 0x014a }
            long r8 = r8 - r10
            r10 = 1209600000(0x48190800, double:5.97621805E-315)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x0115
            java.lang.String r1 = "BitlySDK"
            java.lang.String r8 = "Bitly SDK correlator initializing"
            android.util.Log.d(r1, r8)     // Catch:{ all -> 0x014a }
            android.content.Context r1 = r6.f18360a     // Catch:{ all -> 0x014a }
            android.net.Uri r3 = r6.mo20962a(r7, r3)     // Catch:{ all -> 0x014a }
            java.lang.String r7 = p291y3.C8386j.m16727a(r1)     // Catch:{ all -> 0x014a }
            android.webkit.WebView r8 = new android.webkit.WebView     // Catch:{ all -> 0x014a }
            r8.<init>(r1)     // Catch:{ all -> 0x014a }
            p291y3.C8386j.f18388a = r8     // Catch:{ all -> 0x014a }
            y3.h r9 = new y3.h     // Catch:{ all -> 0x014a }
            r9.<init>(r6, r7, r1, r3)     // Catch:{ all -> 0x014a }
            r8.setWebViewClient(r9)     // Catch:{ all -> 0x014a }
            android.webkit.WebView r1 = p291y3.C8386j.f18388a     // Catch:{ all -> 0x014a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x014a }
            r1.loadUrl(r3)     // Catch:{ all -> 0x014a }
            android.content.SharedPreferences r1 = r6.f18362c     // Catch:{ all -> 0x014a }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x014a }
            java.lang.String r3 = "bitly.last.correlation"
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x014a }
            android.content.SharedPreferences$Editor r1 = r1.putLong(r3, r7)     // Catch:{ all -> 0x014a }
            r1.apply()     // Catch:{ all -> 0x014a }
            goto L_0x0130
        L_0x0115:
            java.lang.String r3 = "BitlySDK"
            java.lang.String r7 = "Bitly SDK correlator not run"
            android.util.Log.d(r3, r7)     // Catch:{ all -> 0x014a }
            android.content.SharedPreferences r3 = android.preference.PreferenceManager.getDefaultSharedPreferences(r1)     // Catch:{ all -> 0x014a }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x014a }
            java.lang.String r7 = "bitly.should.check.deeplink"
            android.content.SharedPreferences$Editor r3 = r3.putBoolean(r7, r5)     // Catch:{ all -> 0x014a }
            r3.apply()     // Catch:{ all -> 0x014a }
            p291y3.C8375d.m16722a(r1, r4, r4)     // Catch:{ all -> 0x014a }
        L_0x0130:
            monitor-exit(r6)
            java.lang.String r1 = "BitlySDK"
            java.lang.String r3 = "Bitly SDK initialized with App ID: %s and Device ID: %s"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            y3.b r7 = p291y3.C8371b.f18351h
            java.lang.String r8 = r7.f18353a
            r6[r4] = r8
            java.lang.String r7 = r7.f18354b
            r6[r5] = r7
            java.lang.String r3 = java.lang.String.format(r3, r6)
            android.util.Log.d(r1, r3)
            goto L_0x014d
        L_0x014a:
            r15 = move-exception
            monitor-exit(r6)
            throw r15
        L_0x014d:
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f14893h
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x028c
            y3.b r0 = p291y3.C8371b.f18351h
            java.lang.String r0 = "BitlySDK"
            java.lang.String r1 = "Bitly SDK handling intent"
            android.util.Log.d(r0, r1)
            y3.b r1 = p291y3.C8371b.f18351h
            boolean r1 = r1.f18357e
            if (r1 != 0) goto L_0x0170
            java.lang.String r1 = r15.getAction()
            java.lang.String r3 = "android.intent.action.VIEW"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x017f
        L_0x0170:
            android.net.Uri r1 = r15.getData()
            if (r1 == 0) goto L_0x017f
            android.net.Uri r15 = r15.getData()
            java.lang.String r15 = r15.toString()
            goto L_0x0180
        L_0x017f:
            r15 = r2
        L_0x0180:
            boolean r1 = android.text.TextUtils.isEmpty(r15)
            if (r1 == 0) goto L_0x018d
            java.lang.String r15 = "Bitly SDK no valid link found to process"
            android.util.Log.d(r0, r15)
            goto L_0x028c
        L_0x018d:
            y3.b r1 = p291y3.C8371b.f18351h
            java.util.ArrayList r1 = r1.f18355c
            android.net.Uri r3 = android.net.Uri.parse(r15)
            java.lang.String r3 = r3.getHost()
            boolean r1 = r1.contains(r3)
            if (r1 != 0) goto L_0x01d8
            android.net.Uri r1 = android.net.Uri.parse(r15)
            y3.b r3 = p291y3.C8371b.f18351h
            java.util.ArrayList r3 = r3.f18356d
            java.util.Iterator r3 = r3.iterator()
        L_0x01ab:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x01d5
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r1.getScheme()
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L_0x01d3
            java.lang.String r7 = "://"
            boolean r7 = r6.contains(r7)
            if (r7 == 0) goto L_0x01ab
            java.lang.String r7 = r1.toString()
            boolean r6 = r7.startsWith(r6)
            if (r6 == 0) goto L_0x01ab
        L_0x01d3:
            r1 = r5
            goto L_0x01d6
        L_0x01d5:
            r1 = r4
        L_0x01d6:
            if (r1 == 0) goto L_0x01d9
        L_0x01d8:
            r2 = r15
        L_0x01d9:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x027f
            java.lang.String r1 = "Bitly SDK click call started"
            android.util.Log.d(r0, r1)     // Catch:{ Exception -> 0x0252 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0252 }
            r1.<init>()     // Catch:{ Exception -> 0x0252 }
            java.lang.String r3 = p291y3.C8371b.f18352i     // Catch:{ Exception -> 0x0252 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0252 }
            if (r3 == 0) goto L_0x01f5
            java.lang.String r3 = "https://bit.ly/"
            p291y3.C8371b.f18352i = r3     // Catch:{ Exception -> 0x0252 }
        L_0x01f5:
            java.lang.String r3 = p291y3.C8371b.f18352i     // Catch:{ Exception -> 0x0252 }
            r1.append(r3)     // Catch:{ Exception -> 0x0252 }
            java.lang.String r3 = "api/click"
            r1.append(r3)     // Catch:{ Exception -> 0x0252 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0252 }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x0252 }
            android.net.Uri$Builder r1 = r1.buildUpon()     // Catch:{ Exception -> 0x0252 }
            java.lang.String r3 = "app_id"
            y3.b r5 = p291y3.C8371b.f18351h     // Catch:{ Exception -> 0x0252 }
            java.lang.String r5 = r5.f18353a     // Catch:{ Exception -> 0x0252 }
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r3, r5)     // Catch:{ Exception -> 0x0252 }
            java.lang.String r3 = "device_id"
            y3.b r5 = p291y3.C8371b.f18351h     // Catch:{ Exception -> 0x0252 }
            java.lang.String r5 = r5.f18354b     // Catch:{ Exception -> 0x0252 }
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r3, r5)     // Catch:{ Exception -> 0x0252 }
            java.lang.String r3 = "device_id_type"
            java.lang.String r5 = "android"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r3, r5)     // Catch:{ Exception -> 0x0252 }
            java.lang.String r3 = "link"
            java.lang.String r5 = android.net.Uri.decode(r2)     // Catch:{ Exception -> 0x0252 }
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r3, r5)     // Catch:{ Exception -> 0x0252 }
            android.net.Uri r7 = r1.build()     // Catch:{ Exception -> 0x0252 }
            y3.b r1 = p291y3.C8371b.f18351h     // Catch:{ Exception -> 0x0252 }
            y3.b$a r8 = r1.f18358f     // Catch:{ Exception -> 0x0252 }
            y3.e r1 = new y3.e     // Catch:{ Exception -> 0x0252 }
            r9 = 0
            r6 = r1
            r10 = r15
            r11 = r2
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0252 }
            java.util.concurrent.Executor r3 = android.os.AsyncTask.THREAD_POOL_EXECUTOR     // Catch:{ Exception -> 0x0252 }
            if (r3 == 0) goto L_0x024c
            java.lang.Void[] r4 = new java.lang.Void[r4]     // Catch:{ Exception -> 0x0252 }
            r1.executeOnExecutor(r3, r4)     // Catch:{ Exception -> 0x0252 }
            goto L_0x028c
        L_0x024c:
            java.lang.Void[] r3 = new java.lang.Void[r4]     // Catch:{ Exception -> 0x0252 }
            r1.execute(r3)     // Catch:{ Exception -> 0x0252 }
            goto L_0x028c
        L_0x0252:
            r1 = move-exception
            r8 = r1
            java.lang.String r1 = "Bitly SDK failed to parse link: "
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            java.lang.String r3 = r8.getMessage()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            y3.b r0 = p291y3.C8371b.f18351h
            y3.b$a r0 = r0.f18358f
            if (r0 == 0) goto L_0x028c
            com.google.android.play.core.assetpacks.n0 r1 = new com.google.android.play.core.assetpacks.n0
            java.lang.String r7 = r8.getMessage()
            r11 = 2
            r6 = r1
            r9 = r15
            r10 = r2
            r6.<init>(r7, r8, r9, r10, r11)
            r0.mo18909b(r1)
            goto L_0x028c
        L_0x027f:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r4] = r15
            java.lang.String r15 = "Bitly SDK URL %s is not supported by config"
            java.lang.String r15 = java.lang.String.format(r15, r1)
            android.util.Log.d(r0, r15)
        L_0x028c:
            r14.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.deeplinking.bitly.BitlyActivity.handleIntent(android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT == 26) {
            setRequestedOrientation(-1);
        } else {
            setRequestedOrientation(1);
        }
        C8694h.f19097a.mo21310e("onCreate");
        handleIntent(getIntent());
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C8694h.f19097a.mo21310e("onNewIntent");
        handleIntent(intent);
    }
}
