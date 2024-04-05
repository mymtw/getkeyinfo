package p350fe;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p250u0.C8077a;
import p623mm.C18249c;

/* renamed from: fe.l */
public final class C12738l {
    /* renamed from: a */
    public static Bundle m20400a(Uri uri, Activity activity) {
        C19383o.m32797g(activity, "activity");
        Bundle bundle = new Bundle();
        if (uri != null && C19383o.m32792b(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, uri.getQueryParameter("deeplink"))) {
            if (uri.getQueryParameter("r") != null) {
                bundle.putString(".ref", uri.getQueryParameter("r"));
            }
            if (uri.getQueryParameter("g") != null) {
                bundle.putString("originating_page_guid", uri.getQueryParameter("g"));
            }
            if (uri.getQueryParameter("uaid") != null) {
                bundle.putString("originating_uaid", uri.getQueryParameter("uaid"));
            }
            for (String next : uri.getQueryParameterNames()) {
                if (!C19383o.m32792b(next, "r") && !C19383o.m32792b(next, "g") && !C19383o.m32792b(next, "uaid")) {
                    bundle.putString(next, uri.getQueryParameter(next));
                }
            }
        }
        if (!bundle.containsKey(".ref") && activity.getIntent() != null) {
            int i = C8077a.f17593c;
            Uri referrer = activity.getReferrer();
            if (referrer != null) {
                if (C19383o.m32792b(referrer.getScheme(), "http") || C19383o.m32792b(referrer.getScheme(), "https")) {
                    bundle.putString(".ref", referrer.toString());
                } else if (C19383o.m32792b(referrer.getScheme(), "android-app")) {
                    C18249c cVar = new C18249c(referrer);
                    if (!"android-app".equals(referrer.getScheme())) {
                        throw new IllegalArgumentException("android-app scheme is required.");
                    } else if (!TextUtils.isEmpty(referrer.getAuthority())) {
                        String authority = referrer.getAuthority();
                        C19383o.m32796f(authority, "appUri.packageName");
                        if (!C19383o.m32792b("com.google.appcrawler", authority)) {
                            if (cVar.mo69793a() != null) {
                                bundle.putString(".ref", cVar.mo69793a().toString());
                            }
                            bundle.putString(".ref_package", referrer.getAuthority());
                        }
                    } else {
                        throw new IllegalArgumentException("Package name is empty.");
                    }
                }
            }
        }
        if (!bundle.containsKey(".ref")) {
            Object systemService = activity.getSystemService("activity");
            C19383o.m32795e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RecentTaskInfo> recentTasks = ((ActivityManager) systemService).getRecentTasks(5, 0);
            ComponentName componentName = null;
            Intent intent = recentTasks.size() > 0 ? recentTasks.get(0).baseIntent : null;
            if (intent != null) {
                componentName = intent.getComponent();
            }
            if (componentName != null && !C19383o.m32792b(intent.getComponent(), activity.getComponentName())) {
                bundle.putString(".ref", intent.getDataString());
                ComponentName component = intent.getComponent();
                C19383o.m32794d(component);
                bundle.putString(".ref_package", component.getPackageName());
            }
        }
        if (uri != null) {
            bundle.putString(".loc", uri.toString());
        }
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m20401b(Uri uri, C12741o oVar) {
        EtsyAction etsyAction;
        C19383o.m32797g(oVar, "routeInspector");
        Bundle bundle = new Bundle();
        if (uri != null) {
            String queryParameter = uri.getQueryParameter("app_action");
            EtsyAction.Companion.getClass();
            etsyAction = (EtsyAction) EtsyAction.types.get(queryParameter);
        } else {
            etsyAction = null;
        }
        if (etsyAction != null) {
            bundle.putString(EtsyAction.ACTION_TYPE_NAME, etsyAction.getType());
        }
        HashMap c = C12741o.m20403c(uri);
        if (!c.isEmpty()) {
            Bundle bundle2 = new Bundle();
            for (String str : c.keySet()) {
                bundle2.putString(str, (String) c.get(str));
            }
            bundle.putBundle("url_params", bundle2);
        }
        return bundle;
    }
}
