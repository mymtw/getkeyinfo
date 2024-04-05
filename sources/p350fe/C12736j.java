package p350fe;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.util.C8901g0;
import com.etsy.android.p327ui.home.etsylens.C9970a;
import com.etsy.android.p327ui.nav.NotificationActivity;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HomePagerKey;
import com.etsy.android.util.C12051k;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.appindexing.internal.zzc;
import com.squareup.moshi.C17414y;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import kotlin.text.C19457k;
import org.apache.commons.codec.binary.Hex;
import p306z8.C8474a;
import p346fa.C12703a;
import p356ge.C12788a;
import p363he.C12818b;
import p363he.C12822e;
import p409o9.C13125f;
import p478x9.C13851a;
import p623mm.C18251e;
import p628nj.C18263b;
import p631nm.C18273a;
import p640om.C18321e;

/* renamed from: fe.j */
public final class C12736j {

    /* renamed from: a */
    public final C12703a f28137a;

    /* renamed from: b */
    public final C12726c f28138b;

    /* renamed from: c */
    public final C12741o f28139c;

    /* renamed from: d */
    public final C12734h f28140d;

    /* renamed from: e */
    public final C13851a f28141e;

    /* renamed from: f */
    public final C17414y f28142f;

    /* renamed from: g */
    public final C9970a f28143g;

    public C12736j(C12703a aVar, C12726c cVar, C12741o oVar, C12734h hVar, C13851a aVar2, C17414y yVar, C9970a aVar3) {
        C19383o.m32797g(aVar, "grafana");
        C19383o.m32797g(cVar, "deepLinkErrorLogger");
        C19383o.m32797g(oVar, "routeInspector");
        C19383o.m32797g(hVar, "routeProvider");
        C19383o.m32797g(aVar2, "deepLinkEntityChecker");
        C19383o.m32797g(yVar, "moshi");
        C19383o.m32797g(aVar3, "etsyLensDeeplinkHandler");
        this.f28137a = aVar;
        this.f28138b = cVar;
        this.f28139c = oVar;
        this.f28140d = hVar;
        this.f28141e = aVar2;
        this.f28142f = yVar;
        this.f28143g = aVar3;
    }

    /* renamed from: a */
    public static void m20396a(DeepLinkEntity deepLinkEntity, Uri uri, Activity activity, C8672b bVar, Bundle bundle) {
        long j;
        String str;
        Activity activity2 = activity;
        boolean z = false;
        if (uri != null) {
            try {
                List<String> pathSegments = uri.getPathSegments();
                C19383o.m32796f(pathSegments, "uri.pathSegments");
                String str2 = (String) C19327t.m32641W0(1, pathSegments);
                j = str2 != null ? Long.parseLong(str2) : 0;
            } catch (Exception unused) {
                j = 0;
            }
            String query = uri.getQuery();
            if (query == null) {
                query = "";
            }
            if (j == 0 || C19457k.m33020X0(query)) {
                str = "";
            } else {
                str = JsonPointer.SEPARATOR + j + RFC1522Codec.SEP + query;
            }
            String scheme = uri.getScheme();
            String str3 = scheme == null ? "" : scheme;
            List<String> pathSegments2 = uri.getPathSegments();
            C19383o.m32796f(pathSegments2, "uri.pathSegments");
            String str4 = (String) C19327t.m32641W0(0, pathSegments2);
            String str5 = str4 == null ? "" : str4;
            String authority = uri.getAuthority();
            String str6 = authority == null ? "" : authority;
            String query2 = uri.getQuery();
            C8474a aVar = new C8474a(str3, str5, str6, str, j, query2 == null ? "" : query2);
            boolean b = C19383o.m32792b(aVar.f18493a, "etsy");
            boolean b2 = C19383o.m32792b(aVar.f18495c, "cfg");
            Pair v = C1993m.m4376v(aVar);
            String str7 = (String) v.getFirst();
            String str8 = (String) v.getSecond();
            boolean z2 = C18263b.m30837c0(str8) && C18263b.m30837c0(str7);
            boolean z3 = !C19457k.m33020X0(aVar.f18496d);
            LogCatKt.m17045a().mo21306a(b + " && " + C1993m.m4378x(aVar) + " && " + b2 + " && " + z2 + " k/v: " + str7 + ' ' + str8);
            if (b && b2 && C1993m.m4378x(aVar) && z2 && z3) {
                String str9 = C12051k.f26875i;
                String str10 = aVar.f18496d;
                C19383o.m32797g(str9, "key");
                C19383o.m32797g(str10, "data");
                if (!C19457k.m33020X0(str10)) {
                    Mac instance = Mac.getInstance("HmacSHA256");
                    Charset forName = Charset.forName("UTF-8");
                    C19383o.m32796f(forName, "forName(charsetName)");
                    byte[] bytes = str9.getBytes(forName);
                    C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
                    instance.init(new SecretKeySpec(bytes, "HmacSHA256"));
                    Charset forName2 = Charset.forName("UTF-8");
                    C19383o.m32796f(forName2, "forName(charsetName)");
                    byte[] bytes2 = str10.getBytes(forName2);
                    C19383o.m32796f(bytes2, "this as java.lang.String).getBytes(charset)");
                    char[] encodeHex = Hex.encodeHex(instance.doFinal(bytes2));
                    C19383o.m32796f(encodeHex, "result");
                    String str11 = new String(encodeHex);
                    if (!C19457k.m33020X0(aVar.f18496d) && !C19457k.m33020X0(str11) && !C19457k.m33020X0(aVar.f18494b) && C19383o.m32792b(aVar.f18494b, str11)) {
                        Pair v2 = C1993m.m4376v(aVar);
                        Pair v3 = C1993m.m4376v(aVar);
                        LinkedHashMap linkedHashMap = C13125f.f28856a;
                        C13125f.C13126a.m20791b(v3);
                        String str12 = "Flag: " + ((String) v2.getFirst()) + " set to " + ((String) v2.getSecond());
                        C19383o.m32797g(str12, "message");
                        if (activity2 != null) {
                            C8901g0.m17338d(activity2, str12);
                        }
                        z = true;
                    }
                } else {
                    throw new IllegalArgumentException("Cannot encode nothing".toString());
                }
            }
        }
        if (!z) {
            m20397c(deepLinkEntity, activity2, bVar, "http://schema.org/FailedActionStatus");
        }
        m20398d(activity2, activity.getIntent(), new HomePagerKey(C19421p.m32935c0(activity), bundle, false, 4, (DefaultConstructorMarker) null));
    }

    /* renamed from: c */
    public static void m20397c(DeepLinkEntity deepLinkEntity, Activity activity, C8672b bVar, String str) {
        String stringExtra;
        C18251e eVar;
        Intent intent = activity.getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra("actions.fulfillment.extra.ACTION_TOKEN")) != null) {
            C18273a aVar = new C18273a();
            Preconditions.checkNotNull(stringExtra);
            aVar.f40105f = stringExtra;
            Preconditions.checkNotNull(str);
            aVar.f40004e = str;
            zzc a = aVar.mo69822a();
            synchronized (C18251e.class) {
                Preconditions.checkNotNull(activity);
                WeakReference<C18251e> weakReference = C18251e.f40008a;
                eVar = weakReference == null ? null : weakReference.get();
                if (eVar == null) {
                    eVar = new C18321e(activity.getApplicationContext());
                    C18251e.f40008a = new WeakReference<>(eVar);
                }
            }
            eVar.mo69797a(a);
            if (deepLinkEntity != null) {
                bVar.mo21333d("google_app_action", C19294b0.m32562s0(new Pair(PredefinedAnalyticsProperty.ACTION, deepLinkEntity.getEntityName()), new Pair(PredefinedAnalyticsProperty.TYPE, "deeplink")));
            }
        }
    }

    /* renamed from: d */
    public static void m20398d(Activity activity, Intent intent, C12822e eVar) {
        if (activity instanceof NotificationActivity) {
            activity.finish();
        }
        if (eVar instanceof FragmentNavigationKey) {
            C12788a.m20424c(activity, C12788a.m20422a(activity, (FragmentNavigationKey) eVar, intent));
        } else if (eVar instanceof C12818b) {
            C12788a.m20424c(activity, eVar);
        }
    }

    /* JADX WARNING: type inference failed for: r0v32, types: [he.e] */
    /* JADX WARNING: type inference failed for: r8v85, types: [com.etsy.android.ui.navigation.keys.fragmentkeys.HomePagerKey] */
    /* JADX WARNING: type inference failed for: r8v86, types: [com.etsy.android.ui.navigation.keys.fragmentkeys.LandingPageKey] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0752  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0757  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x075c  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0769  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ea  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45504b(org.json.JSONObject r23, android.app.Activity r24, android.content.Intent r25, com.etsy.android.lib.logger.C8672b r26) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r11 = r26
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            java.lang.String r0 = "analyticsTracker"
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            r5 = 0
            if (r4 == 0) goto L_0x001c
            java.lang.String r0 = r25.getAction()
            goto L_0x001d
        L_0x001c:
            r0 = r5
        L_0x001d:
            java.lang.String r6 = "android.intent.action.SEND"
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r6, r0)
            r6 = 1
            r7 = 0
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = r25.getType()
            if (r0 == 0) goto L_0x0037
            java.lang.String r8 = "image/"
            boolean r0 = kotlin.text.C19457k.m33025c1(r0, r8, r7)
            if (r0 != r6) goto L_0x0037
            r0 = r6
            goto L_0x0038
        L_0x0037:
            r0 = r7
        L_0x0038:
            if (r0 == 0) goto L_0x003c
            r0 = r6
            goto L_0x003d
        L_0x003c:
            r0 = r7
        L_0x003d:
            if (r0 == 0) goto L_0x00ea
            if (r4 == 0) goto L_0x0046
            android.net.Uri r0 = r25.getData()
            goto L_0x0047
        L_0x0046:
            r0 = r5
        L_0x0047:
            if (r0 == 0) goto L_0x004e
            android.net.Uri r0 = r25.getData()
            goto L_0x007a
        L_0x004e:
            if (r4 == 0) goto L_0x005f
            android.content.ClipData r0 = r25.getClipData()
            if (r0 == 0) goto L_0x005f
            int r0 = r0.getItemCount()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0060
        L_0x005f:
            r0 = r5
        L_0x0060:
            int r0 = com.google.android.play.core.assetpacks.C15588c1.m25273C0(r0)
            if (r0 <= 0) goto L_0x0079
            if (r4 == 0) goto L_0x0079
            android.content.ClipData r0 = r25.getClipData()
            if (r0 == 0) goto L_0x0079
            android.content.ClipData$Item r0 = r0.getItemAt(r7)
            if (r0 == 0) goto L_0x0079
            android.net.Uri r0 = r0.getUri()
            goto L_0x007a
        L_0x0079:
            r0 = r5
        L_0x007a:
            java.lang.String r2 = "image_search_opened_from_image_share"
            r11.mo21333d(r2, r5)
            com.etsy.android.ui.home.etsylens.a r2 = r1.f28143g
            java.lang.String r9 = kotlin.reflect.C19421p.m32935c0(r24)
            r2.getClass()
            if (r0 == 0) goto L_0x00a4
            android.app.Application r8 = r2.f21954a     // Catch:{ Exception -> 0x009c }
            android.graphics.Bitmap r0 = p455u9.C13452f.m21227d(r8, r0, r6)     // Catch:{ Exception -> 0x009c }
            android.app.Application r8 = r2.f21954a     // Catch:{ Exception -> 0x009c }
            java.io.File r5 = p455u9.C13452f.m21231h(r8, r0)     // Catch:{ Exception -> 0x009c }
            r0 = 280(0x118, float:3.92E-43)
            androidx.compose.foundation.layout.C0761x.m1668G0(r5, r0)     // Catch:{ Exception -> 0x009c }
            goto L_0x00a4
        L_0x009c:
            r0 = move-exception
            com.etsy.android.lib.logger.h r8 = com.etsy.android.lib.logger.LogCatKt.m17045a()
            r8.error(r0)
        L_0x00a4:
            if (r5 == 0) goto L_0x00ad
            boolean r0 = r5.exists()
            if (r0 != r6) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r6 = r7
        L_0x00ae:
            if (r6 == 0) goto L_0x00d4
            fa.a r0 = r2.f21955b
            java.lang.String r6 = "deeplink.image_search.success"
            r0.mo45474a(r6)
            com.etsy.android.ui.navigation.keys.fragmentkeys.LandingPageKey r0 = new com.etsy.android.ui.navigation.keys.fragmentkeys.LandingPageKey
            com.etsy.android.ui.home.etsylens.EtsyLensLandingPageLink r10 = new com.etsy.android.ui.home.etsylens.EtsyLensLandingPageLink
            android.app.Application r2 = r2.f21954a
            r6 = 2131952168(0x7f130228, float:1.9540771E38)
            java.lang.String r2 = r2.getString(r6)
            java.lang.String r6 = "application.getString(R.…ing.etsy_lens_page_title)"
            kotlin.jvm.internal.C19383o.m32796f(r2, r6)
            r10.<init>(r2, r5)
            r11 = 0
            r12 = 4
            r13 = 0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x00e5
        L_0x00d4:
            fa.a r0 = r2.f21955b
            java.lang.String r2 = "deeplink.image_search.error"
            r0.mo45474a(r2)
            com.etsy.android.ui.navigation.keys.fragmentkeys.HomePagerKey r0 = new com.etsy.android.ui.navigation.keys.fragmentkeys.HomePagerKey
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x00e5:
            m20398d(r3, r4, r0)
            goto L_0x07a7
        L_0x00ea:
            java.lang.String r0 = "external"
            java.lang.String r8 = "notifications"
            java.lang.String r9 = "external_url"
            r16 = 17
            r17 = 16
            r18 = 15
            r19 = 14
            r20 = 13
            r21 = 12
            r10 = 23
            if (r2 == 0) goto L_0x02f2
            java.lang.String r12 = "+clicked_branch_link"
            boolean r12 = r2.optBoolean(r12, r7)
            if (r12 == 0) goto L_0x02f2
            java.lang.String r12 = "$android_deeplink_path"
            java.lang.String r12 = r2.optString(r12)
            java.lang.String r13 = "$canonical_url"
            java.lang.String r14 = "https://www.etsy.com/"
            java.lang.String r13 = r2.optString(r13, r14)
            kotlin.Pair[] r10 = new kotlin.Pair[r10]
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r14 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.LOC
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r15 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.BRANCH_CANONICAL_URL
            java.lang.String r5 = r15.toString()
            java.lang.String r5 = r2.optString(r5)
            kotlin.Pair r6 = new kotlin.Pair
            r6.<init>(r14, r5)
            r10[r7] = r6
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r5 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.REFERRER
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r6 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.BRANCH_REFERRING_LINK
            java.lang.String r7 = r6.toString()
            java.lang.String r7 = r2.optString(r7)
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r5, r7)
            r5 = 1
            r10[r5] = r14
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r5 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.BRANCH_CAMPAIGN
            java.lang.String r7 = r5.toString()
            java.lang.String r7 = r2.optString(r7)
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r5, r7)
            r5 = 2
            r10[r5] = r14
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r5 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.BRANCH_CHANNEL
            java.lang.String r7 = r5.toString()
            java.lang.String r7 = r2.optString(r7)
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r5, r7)
            r5 = 3
            r10[r5] = r14
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r5 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.BRANCH_CREATION_SOURCE
            java.lang.String r7 = r5.toString()
            java.lang.String r7 = r2.optString(r7)
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r5, r7)
            r5 = 4
            r10[r5] = r14
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r5 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.BRANCH_FEATURE
            java.lang.String r7 = r5.toString()
            java.lang.String r7 = r2.optString(r7)
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r5, r7)
            r5 = 5
            r10[r5] = r14
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r5 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.BRANCH_JOURNEY_ID
            java.lang.String r7 = r5.toString()
            java.lang.String r7 = r2.optString(r7)
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r5, r7)
            r5 = 6
            r10[r5] = r14
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r5 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.BRANCH_JOURNEY_NAME
            java.lang.String r7 = r5.toString()
            java.lang.String r7 = r2.optString(r7)
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r5, r7)
            r5 = 7
            r10[r5] = r14
            java.lang.String r5 = r15.toString()
            java.lang.String r5 = r2.optString(r5)
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r15, r5)
            r5 = 8
            r10[r5] = r7
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r5 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.BRANCH_DEEPLINK_PATH
            java.lang.String r7 = r5.toString()
            java.lang.String r7 = r2.optString(r7)
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r5, r7)
            r5 = 9
            r10[r5] = r14
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r5 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.BRANCH_ID
            java.lang.String r7 = r5.toString()
            java.lang.String r7 = r2.optString(r7)
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r5, r7)
            r5 = 10
            r10[r5] = r14
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r5 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.BRANCH_ONE_TIME_USE
            java.lang.String r7 = r5.toString()
            java.lang.String r7 = r2.optString(r7)
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r5, r7)
            r5 = 11
            r10[r5] = r14
            java.lang.String r5 = r6.toString()
            java.lang.String r5 = r2.optString(r5)
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r6, r5)
            r10[r21] = r7
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r5 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.BRANCH_URI_REDIRECT_MODE
            java.lang.String r6 = r5.toString()
            java.lang.String r6 = r2.optString(r6)
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r5, r6)
            r10[r20] = r7
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r5 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.BRANCH_VIEW_ID
            java.lang.String r6 = r5.toString()
            java.lang.String r6 = r2.optString(r6)
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r5, r6)
            r10[r19] = r7
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r5 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.BRANCH_VIEW_NAME
            java.lang.String r6 = r5.toString()
            java.lang.String r6 = r2.optString(r6)
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r5, r6)
            r10[r18] = r7
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r5 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.BRANCH_BRANCH_MATCH_ID
            java.lang.String r6 = r5.toString()
            java.lang.String r6 = r2.optString(r6)
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r5, r6)
            r10[r17] = r7
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r5 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.BRANCH_CLICK_TIMESTAMP
            java.lang.String r6 = r5.toString()
            java.lang.String r6 = r2.optString(r6)
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r5, r6)
            r10[r16] = r7
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r5 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.BRANCH_CLICKED_BRANCH_LINK
            java.lang.String r6 = r5.toString()
            java.lang.String r6 = r2.optString(r6)
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r5, r6)
            r5 = 18
            r10[r5] = r7
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r5 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.BRANCH_IS_FIRST_SESSION
            java.lang.String r6 = r5.toString()
            java.lang.String r6 = r2.optString(r6)
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r5, r6)
            r5 = 19
            r10[r5] = r7
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r5 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.BRANCH_MATCH_GUARANTEED
            java.lang.String r6 = r5.toString()
            java.lang.String r6 = r2.optString(r6)
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r5, r6)
            r5 = 20
            r10[r5] = r7
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r5 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.BRANCH_REFERRER
            java.lang.String r6 = r5.toString()
            java.lang.String r6 = r2.optString(r6)
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r5, r6)
            r5 = 21
            r10[r5] = r7
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r5 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.BRANCH_REFERRER_BROWSER_ID
            java.lang.String r6 = r5.toString()
            java.lang.String r6 = r2.optString(r6)
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r5, r6)
            r5 = 22
            r10[r5] = r7
            java.util.Map r5 = kotlin.collections.C19294b0.m32562s0(r10)
            java.lang.String r6 = "branch_metadata"
            r11.mo21333d(r6, r5)
            boolean r5 = p628nj.C18263b.m30839d0(r12)
            if (r5 == 0) goto L_0x02ec
            r5 = 3
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = "http"
            r10 = 0
            r6[r10] = r7
            java.lang.String r7 = "www.etsy.com"
            r10 = 1
            r6[r10] = r7
            r7 = 2
            r6[r7] = r12
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r6, r5)
            java.lang.String r6 = "%s://%s/%s"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            java.lang.String r6 = "format(format, *args)"
            kotlin.jvm.internal.C19383o.m32796f(r5, r6)
            android.net.Uri r5 = android.net.Uri.parse(r5)
            goto L_0x0351
        L_0x02ec:
            android.net.Uri r5 = android.net.Uri.parse(r13)
            goto L_0x0351
        L_0x02f2:
            if (r4 == 0) goto L_0x02f9
            java.lang.String r5 = r25.getAction()
            goto L_0x02fa
        L_0x02f9:
            r5 = 0
        L_0x02fa:
            java.lang.String r6 = "android.intent.action.VIEW"
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r5, r6)
            if (r6 == 0) goto L_0x0304
            r0 = r9
            goto L_0x030d
        L_0x0304:
            java.lang.String r6 = "com.etsy.android.action.NOTIFICATION"
            boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r5, r6)
            if (r5 == 0) goto L_0x030d
            r0 = r8
        L_0x030d:
            if (r4 == 0) goto L_0x031a
            android.net.Uri r5 = r25.getData()
            if (r5 == 0) goto L_0x031a
            java.lang.String r5 = r5.getHost()
            goto L_0x031b
        L_0x031a:
            r5 = 0
        L_0x031b:
            java.lang.String r6 = "etsy.app.link"
            boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r5, r6)
            if (r5 != 0) goto L_0x032c
            if (r4 == 0) goto L_0x032a
            android.net.Uri r5 = r25.getData()
            goto L_0x0351
        L_0x032a:
            r5 = 0
            goto L_0x0351
        L_0x032c:
            android.net.Uri r5 = r25.getData()
            java.lang.String r6 = "$original_url"
            if (r5 == 0) goto L_0x0339
            java.lang.String r5 = r5.getQueryParameter(r6)
            goto L_0x033a
        L_0x0339:
            r5 = 0
        L_0x033a:
            if (r5 == 0) goto L_0x034d
            android.net.Uri r5 = r25.getData()
            if (r5 == 0) goto L_0x0347
            java.lang.String r5 = r5.getQueryParameter(r6)
            goto L_0x0348
        L_0x0347:
            r5 = 0
        L_0x0348:
            android.net.Uri r5 = android.net.Uri.parse(r5)
            goto L_0x0351
        L_0x034d:
            android.net.Uri r5 = r25.getData()
        L_0x0351:
            r12 = r5
            r5 = r0
            android.content.Context r0 = r24.getApplicationContext()
            com.google.ads.conversiontracking.C12615a.m20298M(r0, r12)
            fa.a r0 = r1.f28137a
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r5, r9)
            java.lang.String r7 = "grafana"
            if (r6 == 0) goto L_0x03cb
            kotlin.jvm.internal.C19383o.m32797g(r0, r7)
            if (r4 == 0) goto L_0x036e
            android.net.Uri r6 = r25.getData()
            goto L_0x036f
        L_0x036e:
            r6 = 0
        L_0x036f:
            if (r6 == 0) goto L_0x03c4
            java.lang.String r7 = r6.getScheme()
            if (r7 == 0) goto L_0x03c4
            java.lang.String r7 = "route."
            java.lang.StringBuilder r7 = android.support.p013v4.media.C0072d.m201h(r7)
            java.lang.String r8 = r6.getScheme()
            kotlin.jvm.internal.C19383o.m32794d(r8)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r0.mo45474a(r7)
            java.lang.String r7 = r6.getScheme()
            java.util.List<java.lang.String> r8 = com.etsy.android.lib.util.C8915n.f19672a
            java.lang.String r8 = "etsy"
            boolean r7 = r8.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x0439
            java.lang.String r7 = "deeplink"
            java.lang.String r7 = r6.getQueryParameter(r7)
            java.lang.String r8 = "1"
            boolean r7 = kotlin.jvm.internal.C19383o.m32792b(r8, r7)
            if (r7 == 0) goto L_0x03b1
            java.lang.String r6 = "deeplink.custom"
            r0.mo45474a(r6)
            goto L_0x0439
        L_0x03b1:
            java.lang.String r7 = "deferred"
            java.lang.String r6 = r6.getQueryParameter(r7)
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r8, r6)
            if (r6 == 0) goto L_0x0439
            java.lang.String r6 = "deeplink.custom.deferred"
            r0.mo45474a(r6)
            goto L_0x0439
        L_0x03c4:
            java.lang.String r6 = "route.unknown"
            r0.mo45474a(r6)
            goto L_0x0439
        L_0x03cb:
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r5, r8)
            if (r6 == 0) goto L_0x0439
            kotlin.jvm.internal.C19383o.m32797g(r0, r7)
            if (r4 == 0) goto L_0x03dd
            android.os.Bundle r6 = r25.getExtras()     // Catch:{ NullPointerException -> 0x03db }
            goto L_0x03de
        L_0x03db:
            r0 = move-exception
            goto L_0x040c
        L_0x03dd:
            r6 = 0
        L_0x03de:
            if (r6 == 0) goto L_0x0404
            java.lang.String r7 = "t"
            java.lang.String r7 = r6.getString(r7)     // Catch:{ NullPointerException -> 0x03db }
            com.etsy.android.lib.util.NotificationType$a r8 = com.etsy.android.lib.util.NotificationType.Companion     // Catch:{ NullPointerException -> 0x03db }
            r8.getClass()     // Catch:{ NullPointerException -> 0x03db }
            com.etsy.android.lib.util.NotificationType r7 = com.etsy.android.lib.util.NotificationType.C8877a.m17313a(r7)     // Catch:{ NullPointerException -> 0x03db }
            ra.e r7 = p434ra.C13343j.m20997a(r7)     // Catch:{ NullPointerException -> 0x03db }
            java.lang.String r8 = "notificationFromType(\n  …e),\n                    )"
            kotlin.jvm.internal.C19383o.m32796f(r7, r8)     // Catch:{ NullPointerException -> 0x03db }
            r7.mo46035i(r11, r6)     // Catch:{ NullPointerException -> 0x03db }
            r7.mo46034h()     // Catch:{ NullPointerException -> 0x03db }
            java.lang.String r6 = "route.notification"
            r0.mo45474a(r6)     // Catch:{ NullPointerException -> 0x03db }
            goto L_0x0439
        L_0x0404:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ NullPointerException -> 0x03db }
            java.lang.String r6 = "Intent or extras was null"
            r0.<init>(r6)     // Catch:{ NullPointerException -> 0x03db }
            throw r0     // Catch:{ NullPointerException -> 0x03db }
        L_0x040c:
            com.etsy.android.lib.config.BuildTarget$a r6 = com.etsy.android.lib.config.BuildTarget.Companion
            boolean r6 = androidx.appcompat.widget.C0326j.m869n(r6)
            if (r6 != 0) goto L_0x0438
            java.lang.String r0 = "Notification Intent extras are null. Source type: "
            java.lang.String r6 = " Intent data: "
            java.lang.StringBuilder r0 = p003a2.C0023f.m111l(r0, r5, r6)
            if (r4 == 0) goto L_0x0423
            java.lang.String r6 = r25.getDataString()
            goto L_0x0424
        L_0x0423:
            r6 = 0
        L_0x0424:
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.etsy.android.lib.util.CrashUtil r6 = com.etsy.android.lib.util.CrashUtil.m17307a()
            java.lang.Throwable r7 = new java.lang.Throwable
            r7.<init>(r0)
            r6.mo30457b(r7)
            goto L_0x0439
        L_0x0438:
            throw r0
        L_0x0439:
            android.os.Bundle r0 = p350fe.C12738l.m20400a(r12, r3)
            fe.o r6 = r1.f28139c
            android.os.Bundle r13 = p350fe.C12738l.m20401b(r12, r6)
            java.lang.String r6 = "referrer_bundle"
            r13.putBundle(r6, r0)
            java.lang.String r0 = "source_type"
            r13.putString(r0, r5)
            if (r12 == 0) goto L_0x07a3
            if (r2 == 0) goto L_0x0484
            com.squareup.moshi.y r0 = r1.f28142f     // Catch:{ Exception -> 0x0464 }
            java.lang.Class<com.etsy.android.lib.deeplinks.BranchParams> r5 = com.etsy.android.lib.deeplinks.BranchParams.class
            com.squareup.moshi.JsonAdapter r0 = r0.mo68556a(r5)     // Catch:{ Exception -> 0x0464 }
            java.lang.String r5 = r23.toString()     // Catch:{ Exception -> 0x0464 }
            java.lang.Object r0 = r0.fromJson((java.lang.String) r5)     // Catch:{ Exception -> 0x0464 }
            com.etsy.android.lib.deeplinks.BranchParams r0 = (com.etsy.android.lib.deeplinks.BranchParams) r0     // Catch:{ Exception -> 0x0464 }
            goto L_0x0485
        L_0x0464:
            fe.c r0 = r1.f28138b
            com.etsy.android.ui.navigation.deeplinks.DeepLinkHandlerException r5 = new com.etsy.android.ui.navigation.deeplinks.DeepLinkHandlerException
            java.lang.String r6 = "unable to parse branch params "
            java.lang.String r6 = android.support.p013v4.media.C0073e.m206f(r6, r12)
            r5.<init>(r6)
            fe.b r6 = new fe.b
            if (r4 == 0) goto L_0x047a
            android.os.Bundle r7 = r25.getExtras()
            goto L_0x047b
        L_0x047a:
            r7 = 0
        L_0x047b:
            r6.<init>(r2, r7, r13)
            r0.getClass()
            p350fe.C12726c.m20394a(r5, r6)
        L_0x0484:
            r0 = 0
        L_0x0485:
            r10 = r0
            x9.a r0 = r1.f28141e
            com.etsy.android.lib.deeplinks.DeepLinkEntity r0 = r0.mo46683a(r12)
            fe.h r5 = r1.f28140d
            r5.getClass()
            java.util.EnumMap r6 = new java.util.EnumMap
            r7 = 53
            kotlin.Pair[] r7 = new kotlin.Pair[r7]
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SIGN_IN_AS
            com.etsy.android.ui.user.auth.g r9 = r5.f28070a
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r8 = 0
            r7[r8] = r14
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SIGN_IN
            com.etsy.android.ui.user.auth.h r9 = r5.f28071b
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r8 = 1
            r7[r8] = r14
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.REGISTER
            com.etsy.android.ui.user.auth.d r9 = r5.f28072c
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r8 = 2
            r7[r8] = r14
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.LISTING
            com.etsy.android.ui.core.h r9 = r5.f28073d
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r8 = 3
            r7[r8] = r14
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.LISTINGS_SIMILAR
            com.etsy.android.ui.home.landingpage.j r9 = r5.f28074e
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r8 = 4
            r7[r8] = r14
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.LISTING_COLLECTION
            com.etsy.android.ui.core.b r9 = r5.f28075f
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r8 = 5
            r7[r8] = r14
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.LISTING_LANDING_PAGE
            com.etsy.android.ui.home.landingpage.i r9 = r5.f28076g
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r8 = 6
            r7[r8] = r14
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.FAVORITES
            com.etsy.android.ui.favorites.n r9 = r5.f28077h
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r8 = 7
            r7[r8] = r14
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.FAVORITE_ITEMS
            com.etsy.android.ui.favorites.n r9 = r5.f28077h
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r8 = 8
            r7[r8] = r14
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.FAVORITE_SHOPS
            com.etsy.android.ui.favorites.n r9 = r5.f28077h
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r8 = 9
            r7[r8] = r14
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.FAVORITE_SEARCHES
            com.etsy.android.ui.favorites.n r9 = r5.f28077h
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r8 = 10
            r7[r8] = r14
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.PEOPLE
            com.etsy.android.ui.favorites.v r9 = r5.f28078i
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r8 = 11
            r7[r8] = r14
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.CLAIM
            uc.a r9 = r5.f28079j
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r7[r21] = r14
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SHOP_FAVORITE
            se.b r9 = r5.f28080k
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r7[r20] = r14
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SHOP
            com.etsy.android.ui.shop.v r9 = r5.f28081l
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r7[r19] = r14
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SHOP_ABOUT
            se.c r9 = r5.f28082m
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r7[r18] = r14
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SHOP_POLICY
            se.c r9 = r5.f28082m
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r7[r17] = r14
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SHOP_REVIEWS
            se.d r9 = r5.f28083n
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r7[r16] = r14
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.TRANSACTION
            com.etsy.android.ui.user.f0 r9 = r5.f28084o
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r8 = 18
            r7[r8] = r14
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.PURCHASES
            com.etsy.android.ui.user.purchases.h r9 = r5.f28085p
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r8 = 19
            r7[r8] = r14
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.HELP
            com.etsy.android.ui.user.purchases.m r9 = r5.f28086q
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r8 = 20
            r7[r8] = r14
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.COMPOSE_REVIEW
            com.etsy.android.ui.user.review.w r9 = r5.f28087r
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r8 = 21
            r7[r8] = r14
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.CREATE_REVIEW
            com.etsy.android.ui.user.review.w r9 = r5.f28087r
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r8 = 22
            r7[r8] = r14
            com.etsy.android.lib.deeplinks.DeepLinkEntity r8 = com.etsy.android.lib.deeplinks.DeepLinkEntity.REVIEW
            com.etsy.android.ui.user.review.w r9 = r5.f28087r
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r8, r9)
            r8 = 23
            r7[r8] = r14
            r8 = 24
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.RECEIPT
            com.etsy.android.ui.user.t r14 = r5.f28088s
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 25
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.ORDER
            com.etsy.android.ui.user.t r14 = r5.f28088s
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 26
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.TRACK_ORDER
            com.etsy.android.ui.user.s r14 = r5.f28089t
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 27
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.ORDER_TRACKING
            com.etsy.android.ui.user.s r14 = r5.f28089t
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 28
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.CONVERSATION_COMPOSE
            ec.a r14 = r5.f28090u
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 29
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.CONVERSATIONS
            dc.a r14 = r5.f28091v
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 30
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.CONVERSATION
            dc.a r14 = r5.f28091v
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 31
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.BROWSE
            com.etsy.android.ui.search.a r14 = r5.f28092w
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 32
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.TAXONOMY_CATEGORY
            com.etsy.android.ui.search.k r14 = r5.f28093x
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 33
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.CATEGORY
            com.etsy.android.ui.search.c r14 = r5.f28094y
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 34
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.UPDATES
            com.etsy.android.ui.user.inappnotifications.x r14 = r5.f28095z
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 35
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.PUSH_NOTIFICATION_SETTINGS
            com.etsy.android.push.e r14 = r5.f28055A
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 36
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.CURRENCY_SETTINGS
            com.etsy.android.ui.user.i r14 = r5.f28056B
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 37
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.CREATE_GIFT_CARD
            com.etsy.android.ui.giftcards.c r14 = r5.f28057C
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 38
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.BUY_GIFT_CARD
            com.etsy.android.ui.giftcards.c r14 = r5.f28057C
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 39
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.CART
            com.etsy.android.ui.cart.g r14 = r5.f28058D
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 40
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.FEATURED
            com.etsy.android.ui.home.editorspicks.i r14 = r5.f28059E
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 41
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.FEATURED_HUB
            rc.a r14 = r5.f28060F
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 42
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.LANDING_PAGE
            tc.a r14 = r5.f28061G
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 43
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.CYBER_WEEK_SALES
            tc.a r14 = r5.f28061G
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 44
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.PROMOTED_OFFERS
            com.etsy.android.ui.cart.b0 r14 = r5.f28062H
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 45
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.VESPA_DEMO_PAGE
            com.etsy.android.ui.j0 r14 = r5.f28063I
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 46
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.VESPA_ARBITRARY_DEMO_PAGE
            com.etsy.android.ui.j0 r14 = r5.f28063I
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 47
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.HOMESCREEN
            qc.b r14 = r5.f28064J
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 48
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SWEEPSTAKES
            qc.g r14 = r5.f28065K
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 49
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.REDEEM_ETSY_COUPON
            qc.a r14 = r5.f28066L
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 50
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SEARCH
            com.etsy.android.ui.search.f r14 = r5.f28067M
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 51
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.MARKET
            com.etsy.android.ui.search.e r14 = r5.f28068N
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r9, r14)
            r7[r8] = r15
            r8 = 52
            com.etsy.android.lib.deeplinks.DeepLinkEntity r9 = com.etsy.android.lib.deeplinks.DeepLinkEntity.MAGIC_LINK
            com.etsy.android.ui.user.auth.c r5 = r5.f28069O
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r9, r5)
            r7[r8] = r14
            java.util.LinkedHashMap r5 = kotlin.collections.C19294b0.m32563t0(r7)
            r6.<init>(r5)
            java.lang.Object r5 = r6.get(r0)
            r14 = r5
            fe.e r14 = (p350fe.C12729e) r14
            fe.f r15 = new fe.f
            java.lang.String r8 = kotlin.reflect.C19421p.m32935c0(r24)
            r5 = r15
            r6 = r26
            r7 = r12
            r9 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            if (r14 == 0) goto L_0x0757
            fe.g r5 = r14.mo30554a(r15)
            goto L_0x0758
        L_0x0757:
            r5 = 0
        L_0x0758:
            boolean r6 = r5 instanceof p350fe.C12731g.C12733b
            if (r6 == 0) goto L_0x0769
            java.lang.String r2 = "http://schema.org/CompletedActionStatus"
            m20397c(r0, r3, r11, r2)
            fe.g$b r5 = (p350fe.C12731g.C12733b) r5
            he.e r0 = r5.f28054a
            m20398d(r3, r4, r0)
            goto L_0x07a7
        L_0x0769:
            boolean r6 = r5 instanceof p350fe.C12731g.C12732a
            if (r6 == 0) goto L_0x079f
            fa.a r6 = r1.f28137a
            java.lang.String r7 = "deep_link_handler.error"
            r6.mo45474a(r7)
            com.etsy.android.lib.logger.h r6 = com.etsy.android.lib.logger.LogCatKt.m17045a()
            fe.g$a r5 = (p350fe.C12731g.C12732a) r5
            java.lang.String r7 = r5.f28053a
            r6.mo21306a(r7)
            fe.c r6 = r1.f28138b
            com.etsy.android.ui.navigation.deeplinks.DeepLinkHandlerException r7 = new com.etsy.android.ui.navigation.deeplinks.DeepLinkHandlerException
            java.lang.String r5 = r5.f28053a
            r7.<init>(r5)
            fe.b r5 = new fe.b
            if (r4 == 0) goto L_0x0791
            android.os.Bundle r4 = r25.getExtras()
            goto L_0x0792
        L_0x0791:
            r4 = 0
        L_0x0792:
            r5.<init>(r2, r4, r13)
            r6.getClass()
            p350fe.C12726c.m20394a(r7, r5)
            m20396a(r0, r12, r3, r11, r13)
            goto L_0x07a7
        L_0x079f:
            m20396a(r0, r12, r3, r11, r13)
            goto L_0x07a7
        L_0x07a3:
            r0 = 0
            m20396a(r0, r12, r3, r11, r13)
        L_0x07a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p350fe.C12736j.mo45504b(org.json.JSONObject, android.app.Activity, android.content.Intent, com.etsy.android.lib.logger.b):void");
    }
}
