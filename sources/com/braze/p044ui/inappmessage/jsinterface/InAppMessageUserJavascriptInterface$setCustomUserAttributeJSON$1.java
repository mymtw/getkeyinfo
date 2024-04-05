package com.braze.p044ui.inappmessage.jsinterface;

import com.braze.BrazeUser;
import com.braze.support.BrazeLogger;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p753kq.C19857l;

/* renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setCustomUserAttributeJSON$1 */
public final class InAppMessageUserJavascriptInterface$setCustomUserAttributeJSON$1 extends Lambda implements C19857l<BrazeUser, C19394m> {
    public final /* synthetic */ String $jsonStringValue;
    public final /* synthetic */ String $key;
    public final /* synthetic */ InAppMessageUserJavascriptInterface this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppMessageUserJavascriptInterface$setCustomUserAttributeJSON$1(InAppMessageUserJavascriptInterface inAppMessageUserJavascriptInterface, String str, String str2) {
        super(1);
        this.this$0 = inAppMessageUserJavascriptInterface;
        this.$key = str;
        this.$jsonStringValue = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BrazeUser) obj);
        return C19394m.f43287a;
    }

    public final void invoke(BrazeUser brazeUser) {
        C19383o.m32797g(brazeUser, "it");
        InAppMessageUserJavascriptInterface inAppMessageUserJavascriptInterface = this.this$0;
        String str = this.$key;
        String str2 = this.$jsonStringValue;
        inAppMessageUserJavascriptInterface.getClass();
        C19383o.m32797g(str, "key");
        C19383o.m32797g(str2, "jsonStringValue");
        try {
            Object obj = new JSONObject(str2).get("value");
            if (obj instanceof String) {
                brazeUser.mo15736l(str, (String) obj);
            } else if (obj instanceof Boolean) {
                brazeUser.mo15737m(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                brazeUser.mo15734j(((Number) obj).intValue(), str);
            } else if (obj instanceof Double) {
                brazeUser.mo15735k(str, ((Number) obj).doubleValue());
            } else {
                BrazeLogger.m11282d(BrazeLogger.f11932a, inAppMessageUserJavascriptInterface, BrazeLogger.Priority.W, (Throwable) null, new InAppMessageUserJavascriptInterface$setCustomAttribute$1(str, str2), 6);
            }
        } catch (Exception e) {
            InAppMessageUserJavascriptInterface inAppMessageUserJavascriptInterface2 = inAppMessageUserJavascriptInterface;
            BrazeLogger.m11282d(BrazeLogger.f11932a, inAppMessageUserJavascriptInterface2, BrazeLogger.Priority.E, e, new InAppMessageUserJavascriptInterface$setCustomAttribute$2(str, str2), 4);
        }
    }
}
