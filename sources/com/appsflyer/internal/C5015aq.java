package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.appsflyer.internal.aq */
public final class C5015aq {
    private static void AFInAppEventParameterName(String str) {
        if (C4986ag.valueOf != null) {
            try {
                AFLogger.valueOf("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                C4986ag.valueOf.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.AFKeystoreWrapper(th.getLocalizedMessage(), th);
            }
        }
    }

    public static void AFInAppEventType(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (C5095j.AFInAppEventParameterName().valueOf != null) {
            try {
                DeepLink valueOf = DeepLink.valueOf(map);
                valueOf.AFInAppEventParameterName.put("is_deferred", false);
                deepLinkResult = new DeepLinkResult(valueOf, (DeepLinkResult.Error) null);
            } catch (JSONException e) {
                AFLogger.AFInAppEventType("[DDL] Error occurred", e);
                deepLinkResult = new DeepLinkResult((DeepLink) null, DeepLinkResult.Error.UNEXPECTED);
            } catch (Throwable th) {
                AFKeystoreWrapper(new DeepLinkResult((DeepLink) null, (DeepLinkResult.Error) null));
                throw th;
            }
            AFKeystoreWrapper(deepLinkResult);
            return;
        }
        AFKeystoreWrapper(map);
    }

    public static void AFKeystoreWrapper(DeepLinkResult deepLinkResult) {
        if (C5095j.AFInAppEventParameterName().valueOf != null) {
            StringBuilder sb = new StringBuilder("[DDL] Calling onDeepLinking with:\n");
            sb.append(deepLinkResult.toString());
            AFLogger.valueOf(sb.toString());
            try {
                C5095j.AFInAppEventParameterName().valueOf.onDeepLinking(deepLinkResult);
            } catch (Throwable th) {
                AFLogger.AFKeystoreWrapper(th.getLocalizedMessage(), th);
            }
        } else {
            AFLogger.valueOf("[DDL] skipping, no callback registered");
        }
    }

    public static void valueOf(String str, DeepLinkResult.Error error) {
        if (C5095j.AFInAppEventParameterName().valueOf != null) {
            AFLogger.valueOf("[DDL] Error occurred: ".concat(String.valueOf(str)));
            AFKeystoreWrapper(new DeepLinkResult((DeepLink) null, error));
            return;
        }
        AFInAppEventParameterName(str);
    }

    private static void AFKeystoreWrapper(Map<String, String> map) {
        if (C4986ag.valueOf != null) {
            try {
                StringBuilder sb = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb.append(map.toString());
                AFLogger.valueOf(sb.toString());
                C4986ag.valueOf.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.AFKeystoreWrapper(th.getLocalizedMessage(), th);
            }
        }
    }
}
