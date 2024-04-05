package com.etsy.android.p327ui.nav;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.C0326j;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.util.Breadcrumbs;
import com.usebutton.merchant.C17496l;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import org.json.JSONException;
import org.json.JSONObject;
import p084d9.C6671a;
import p145io.branch.referral.C7032d;
import p145io.reactivex.disposables.Disposable;
import p350fe.C12736j;
import p440s9.C13366a;

/* renamed from: com.etsy.android.ui.nav.NotificationActivity */
public final class NotificationActivity extends FragmentActivity implements C13366a {
    public static final int $stable = 8;
    private static final long BRANCH_FALLBACK_TIMEOUT = 3;
    public static final C10678a Companion = new C10678a();
    public static final String ETSY_DEEP_LINK_PARAM = "deeplink";
    public static final String ETSY_DEFERRED_PARAM = "deferred";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C8672b analyticsTracker;
    public C6671a button;
    public C8618c configMap;
    public C12736j deepLinkRouter;
    private Disposable fallbackRedirectTimer;
    public C8694h log;

    /* renamed from: com.etsy.android.ui.nav.NotificationActivity$a */
    public static final class C10678a {
    }

    /* access modifiers changed from: private */
    /* renamed from: onStart$lambda-0  reason: not valid java name */
    public static final void m35025onStart$lambda0(NotificationActivity notificationActivity, Long l) {
        C19383o.m32797g(notificationActivity, "this$0");
        notificationActivity.getDeepLinkRouter().mo45504b((JSONObject) null, notificationActivity, notificationActivity.getIntent(), notificationActivity.getAnalyticsTracker());
    }

    /* access modifiers changed from: private */
    /* renamed from: onStart$lambda-1  reason: not valid java name */
    public static final void m35026onStart$lambda1(NotificationActivity notificationActivity, Throwable th) {
        C19383o.m32797g(notificationActivity, "this$0");
        notificationActivity.getDeepLinkRouter().mo45504b((JSONObject) null, notificationActivity, notificationActivity.getIntent(), notificationActivity.getAnalyticsTracker());
    }

    /* access modifiers changed from: private */
    /* renamed from: onStart$lambda-2  reason: not valid java name */
    public static final void m35027onStart$lambda2(NotificationActivity notificationActivity, JSONObject jSONObject, C7032d dVar) {
        C19383o.m32797g(notificationActivity, "this$0");
        Disposable disposable = notificationActivity.fallbackRedirectTimer;
        if (disposable != null) {
            C19383o.m32794d(disposable);
            disposable.dispose();
        }
        if (dVar == null) {
            notificationActivity.getDeepLinkRouter().mo45504b(jSONObject, notificationActivity, notificationActivity.getIntent(), notificationActivity.getAnalyticsTracker());
            return;
        }
        notificationActivity.getDeepLinkRouter().mo45504b((JSONObject) null, notificationActivity, notificationActivity.getIntent(), notificationActivity.getAnalyticsTracker());
        if (C0326j.m869n(BuildTarget.Companion)) {
            Toast.makeText(notificationActivity.getApplicationContext(), dVar.f15642a, 0).show();
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C8672b getAnalyticsTracker() {
        C8672b bVar = this.analyticsTracker;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("analyticsTracker");
        throw null;
    }

    public final C6671a getButton() {
        C6671a aVar = this.button;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("button");
        throw null;
    }

    public final C8618c getConfigMap() {
        C8618c cVar = this.configMap;
        if (cVar != null) {
            return cVar;
        }
        C19383o.m32805o("configMap");
        throw null;
    }

    public final C12736j getDeepLinkRouter() {
        C12736j jVar = this.deepLinkRouter;
        if (jVar != null) {
            return jVar;
        }
        C19383o.m32805o("deepLinkRouter");
        throw null;
    }

    public final C8694h getLog() {
        C8694h hVar = this.log;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o(AnalyticsLogDatabaseHelper.LOG);
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6671a button2 = getButton();
        Intent intent = getIntent();
        C19383o.m32796f(intent, "intent");
        button2.getClass();
        C17496l.m29342c(button2.f14724a, intent);
        Intent intent2 = getIntent();
        Uri referrer = getReferrer();
        C8672b analyticsTracker2 = getAnalyticsTracker();
        C19383o.m32797g(analyticsTracker2, "analyticsTracker");
        if (intent2 != null) {
            String stringExtra = intent2.getStringExtra("branch_data");
            if (stringExtra != null) {
                try {
                    JSONObject jSONObject = new JSONObject(stringExtra);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String string = jSONObject.getString("+url");
                    PredefinedAnalyticsProperty predefinedAnalyticsProperty = PredefinedAnalyticsProperty.UTM_SOURCE;
                    String optString = jSONObject.optString(predefinedAnalyticsProperty.toString());
                    PredefinedAnalyticsProperty predefinedAnalyticsProperty2 = PredefinedAnalyticsProperty.UTM_MEDIUM;
                    String optString2 = jSONObject.optString(predefinedAnalyticsProperty2.toString());
                    PredefinedAnalyticsProperty predefinedAnalyticsProperty3 = PredefinedAnalyticsProperty.UTM_CAMPAIGN;
                    String optString3 = jSONObject.optString(predefinedAnalyticsProperty3.toString());
                    PredefinedAnalyticsProperty predefinedAnalyticsProperty4 = PredefinedAnalyticsProperty.LOC;
                    C19383o.m32796f(string, "loc");
                    linkedHashMap.put(predefinedAnalyticsProperty4, string);
                    C19383o.m32796f(optString, "utmSource");
                    linkedHashMap.put(predefinedAnalyticsProperty, optString);
                    C19383o.m32796f(optString2, "utmMedium");
                    linkedHashMap.put(predefinedAnalyticsProperty2, optString2);
                    C19383o.m32796f(optString3, "utmCampaign");
                    linkedHashMap.put(predefinedAnalyticsProperty3, optString3);
                    analyticsTracker2.mo21333d("universal_app_link", linkedHashMap);
                    Breadcrumbs.m17292a("branch_deeplink", C19294b0.m32562s0(new Pair(predefinedAnalyticsProperty4.toString(), string), new Pair(predefinedAnalyticsProperty.toString(), optString), new Pair(predefinedAnalyticsProperty2.toString(), optString2), new Pair(predefinedAnalyticsProperty3.toString(), optString3)));
                    return;
                } catch (JSONException unused) {
                }
            }
            if (intent2.getData() != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                PredefinedAnalyticsProperty predefinedAnalyticsProperty5 = PredefinedAnalyticsProperty.LOC;
                linkedHashMap2.put(predefinedAnalyticsProperty5, String.valueOf(intent2.getData()));
                if (referrer != null) {
                    PredefinedAnalyticsProperty predefinedAnalyticsProperty6 = PredefinedAnalyticsProperty.REFERRER;
                    String uri = referrer.toString();
                    C19383o.m32796f(uri, "it.toString()");
                    linkedHashMap2.put(predefinedAnalyticsProperty6, uri);
                }
                analyticsTracker2.mo21333d("universal_app_link", linkedHashMap2);
                Breadcrumbs.m17292a("deeplink", C19294b0.m32563t0(new Pair(predefinedAnalyticsProperty5.toString(), String.valueOf(intent2.getData()))));
            }
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006a, code lost:
        r4 = r1.getData();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStart() {
        /*
            r7 = this;
            super.onStart()
            android.content.Intent r0 = r7.getIntent()
            if (r0 == 0) goto L_0x002a
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r1 = "branch_data"
            java.lang.String r0 = r0.getStringExtra(r1)
            if (r0 == 0) goto L_0x002a
            fe.j r1 = r7.getDeepLinkRouter()     // Catch:{ JSONException -> 0x002a }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002a }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x002a }
            android.content.Intent r0 = r7.getIntent()     // Catch:{ JSONException -> 0x002a }
            com.etsy.android.lib.logger.b r3 = r7.getAnalyticsTracker()     // Catch:{ JSONException -> 0x002a }
            r1.mo45504b(r2, r7, r0, r3)     // Catch:{ JSONException -> 0x002a }
            return
        L_0x002a:
            r0 = 3
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            io.reactivex.internal.operators.single.SingleTimer r0 = p248tp.C8071s.m16252j(r0, r2)
            tp.r r1 = p269vp.C8221a.m16513a()
            io.reactivex.internal.operators.single.SingleObserveOn r0 = r0.mo20657f(r1)
            com.etsy.android.b r1 = new com.etsy.android.b
            r2 = 7
            r1.<init>(r7, r2)
            com.etsy.android.c r2 = new com.etsy.android.c
            r3 = 6
            r2.<init>(r7, r3)
            io.reactivex.internal.observers.ConsumerSingleObserver r0 = r0.mo20658g(r1, r2)
            r7.fallbackRedirectTimer = r0
            cb.b r0 = new cb.b
            fe.j r1 = r7.getDeepLinkRouter()
            com.etsy.android.lib.logger.h r2 = r7.getLog()
            com.etsy.android.lib.logger.b r3 = r7.getAnalyticsTracker()
            r0.<init>(r1, r2, r3)
            android.content.Intent r1 = r7.getIntent()
            com.etsy.android.lib.config.BuildTarget$a r2 = com.etsy.android.lib.config.BuildTarget.Companion
            boolean r2 = androidx.appcompat.widget.C0326j.m869n(r2)
            r3 = 0
            if (r1 == 0) goto L_0x0075
            android.net.Uri r4 = r1.getData()
            if (r4 == 0) goto L_0x0075
            java.lang.String r4 = r4.getScheme()
            goto L_0x0076
        L_0x0075:
            r4 = r3
        L_0x0076:
            r5 = 1
            java.lang.String r6 = "etsybeta"
            boolean r4 = kotlin.text.C19457k.m33019W0(r4, r6, r5)
            if (r4 == 0) goto L_0x0080
            goto L_0x00b5
        L_0x0080:
            if (r1 == 0) goto L_0x008d
            android.net.Uri r2 = r1.getData()
            if (r2 == 0) goto L_0x008d
            java.lang.String r2 = r2.getHost()
            goto L_0x008e
        L_0x008d:
            r2 = r3
        L_0x008e:
            boolean r2 = com.etsy.android.lib.util.C8915n.m17353e(r2)
            if (r2 == 0) goto L_0x00a1
            r2 = 0
            if (r1 == 0) goto L_0x00b5
            java.lang.String r4 = "internal_link_extra"
            boolean r1 = r1.hasExtra(r4)
            if (r1 != r5) goto L_0x00b5
            r2 = r5
            goto L_0x00b5
        L_0x00a1:
            if (r1 == 0) goto L_0x00ae
            android.net.Uri r1 = r1.getData()
            if (r1 == 0) goto L_0x00ae
            java.lang.String r1 = r1.getScheme()
            goto L_0x00af
        L_0x00ae:
            r1 = r3
        L_0x00af:
            java.lang.String r2 = "etsy"
            boolean r2 = kotlin.text.C19457k.m33019W0(r1, r2, r5)
        L_0x00b5:
            if (r2 == 0) goto L_0x00ce
            io.reactivex.disposables.Disposable r1 = r7.fallbackRedirectTimer
            if (r1 == 0) goto L_0x00be
            r1.dispose()
        L_0x00be:
            fe.j r1 = r7.getDeepLinkRouter()
            android.content.Intent r2 = r7.getIntent()
            com.etsy.android.lib.logger.b r4 = r7.getAnalyticsTracker()
            r1.mo45504b(r3, r7, r2, r4)
            goto L_0x00d5
        L_0x00ce:
            be.a r1 = new be.a
            r1.<init>(r7)
            r0.f18655d = r1
        L_0x00d5:
            android.content.Intent r1 = r7.getIntent()
            r0.mo21084a(r7, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.nav.NotificationActivity.onStart():void");
    }

    public void onStop() {
        super.onStop();
        Disposable disposable = this.fallbackRedirectTimer;
        if (disposable != null) {
            C19383o.m32794d(disposable);
            disposable.dispose();
        }
    }

    public final void setAnalyticsTracker(C8672b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.analyticsTracker = bVar;
    }

    public final void setButton(C6671a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.button = aVar;
    }

    public final void setConfigMap(C8618c cVar) {
        C19383o.m32797g(cVar, "<set-?>");
        this.configMap = cVar;
    }

    public final void setDeepLinkRouter(C12736j jVar) {
        C19383o.m32797g(jVar, "<set-?>");
        this.deepLinkRouter = jVar;
    }

    public final void setLog(C8694h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.log = hVar;
    }
}
