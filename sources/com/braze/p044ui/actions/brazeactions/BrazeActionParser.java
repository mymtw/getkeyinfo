package com.braze.p044ui.actions.brazeactions;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import androidx.compose.p015ui.text.input.C1993m;
import com.appboy.Constants;
import com.appboy.enums.Channel;
import com.appsflyer.AppsFlyerProperties;
import com.braze.p044ui.actions.brazeactions.steps.AddToCustomAttributeArrayStep;
import com.braze.p044ui.actions.brazeactions.steps.C5627a;
import com.braze.p044ui.actions.brazeactions.steps.C5628b;
import com.braze.p044ui.actions.brazeactions.steps.C5629c;
import com.braze.p044ui.actions.brazeactions.steps.C5630d;
import com.braze.p044ui.actions.brazeactions.steps.C5631e;
import com.braze.p044ui.actions.brazeactions.steps.C5632f;
import com.braze.p044ui.actions.brazeactions.steps.RemoveFromCustomAttributeArrayStep;
import com.braze.p044ui.actions.brazeactions.steps.SetCustomUserAttributeStep;
import com.braze.p044ui.actions.brazeactions.steps.SetEmailSubscriptionStep;
import com.braze.p044ui.actions.brazeactions.steps.SetPushNotificationSubscriptionStep;
import com.braze.p044ui.actions.brazeactions.steps.StepData;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import org.json.JSONObject;

/* renamed from: com.braze.ui.actions.brazeactions.BrazeActionParser */
public final class BrazeActionParser {

    /* renamed from: a */
    public static final BrazeActionParser f12018a = new BrazeActionParser();

    /* renamed from: com.braze.ui.actions.brazeactions.BrazeActionParser$ActionType */
    public enum ActionType {
        CONTAINER("container", C5627a.f12032c),
        LOG_CUSTOM_EVENT("logCustomEvent", C5629c.f12033c),
        SET_CUSTOM_ATTRIBUTE("setCustomUserAttribute", SetCustomUserAttributeStep.f12024c),
        REQUEST_PUSH_PERMISSION("requestPushPermission", C5632f.f12036c),
        ADD_TO_SUBSCRIPTION_GROUP("addToSubscriptionGroup", r1),
        REMOVE_FROM_SUBSCRIPTION_GROUP("removeFromSubscriptionGroup", r1),
        ADD_TO_CUSTOM_ATTRIBUTE_ARRAY("addToCustomAttributeArray", AddToCustomAttributeArrayStep.f12020c),
        REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY("removeFromCustomAttributeArray", RemoveFromCustomAttributeArrayStep.f12023c),
        SET_EMAIL_SUBSCRIPTION("setEmailNotificationSubscriptionType", SetEmailSubscriptionStep.f12025c),
        SET_PUSH_NOTIFICATION_SUBSCRIPTION("setPushNotificationSubscriptionType", SetPushNotificationSubscriptionStep.f12026c),
        OPEN_LINK_IN_WEBVIEW("openLinkInWebview", C5631e.f12035c),
        OPEN_LINK_EXTERNALLY("openLink", C5630d.f12034c),
        INVALID("", C1993m.f4488c);
        
        public static final C5624a Companion = null;
        /* access modifiers changed from: private */
        public static final Map<String, ActionType> map = null;
        private final C5628b impl;
        private final String key;

        /* renamed from: com.braze.ui.actions.brazeactions.BrazeActionParser$ActionType$a */
        public static final class C5624a {
        }

        /* access modifiers changed from: public */
        static {
            int i;
            Companion = new C5624a();
            ActionType[] values = values();
            int T = C19421p.m32930T(values.length);
            if (T < 16) {
                T = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(T);
            int length = values.length;
            while (i < length) {
                ActionType actionType = values[i];
                i++;
                linkedHashMap.put(actionType.getKey(), actionType);
            }
            map = linkedHashMap;
        }

        private ActionType(String str, C5628b bVar) {
            this.key = str;
            this.impl = bVar;
        }

        public static final ActionType fromValue(String str) {
            Companion.getClass();
            Map access$getMap$cp = map;
            if (str == null) {
                str = "";
            }
            Object obj = access$getMap$cp.get(str);
            if (obj == null) {
                obj = INVALID;
            }
            return (ActionType) obj;
        }

        public final C5628b getImpl() {
            return this.impl;
        }

        public final String getKey() {
            return this.key;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ Pair m11388c(Uri uri) {
        JSONObject jSONObject;
        C19383o.m32797g(uri, "<this>");
        String host = uri.getHost();
        String lastPathSegment = uri.getLastPathSegment();
        if (host == null || lastPathSegment == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, uri, (BrazeLogger.Priority) null, (Throwable) null, new BrazeActionParser$getBrazeActionVersionAndJson$1(uri), 7);
            return null;
        }
        try {
            jSONObject = m11389e(lastPathSegment);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, uri, BrazeLogger.Priority.E, e, new BrazeActionParser$getBrazeActionVersionAndJson$json$1(lastPathSegment), 4);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return new Pair(host, jSONObject);
    }

    /* renamed from: e */
    public static /* synthetic */ JSONObject m11389e(String str) {
        byte[] decode = Base64.decode(str, 8);
        C19383o.m32796f(decode, "decode(action, Base64.URL_SAFE)");
        int length = decode.length / 2;
        int[] iArr = new int[length];
        int i = 0;
        int H = C1993m.m4347H(0, decode.length - 1, 2);
        if (H >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 2;
                iArr[i2 / 2] = (decode[i2] & 255) | ((decode[i2 + 1] & 255) << 8);
                if (i2 == H) {
                    break;
                }
                i2 = i3;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (i < length) {
            int i4 = iArr[i];
            i++;
            if (i4 < 0 || i4 > 65535) {
                throw new IllegalArgumentException(C19383o.m32802l(Integer.valueOf(i4), "Invalid Char code: "));
            }
            sb.append((char) i4);
        }
        return new JSONObject(sb.toString());
    }

    /* renamed from: a */
    public final void mo16182a(Context context, Uri uri, Channel channel) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        C19383o.m32797g(channel, AppsFlyerProperties.CHANNEL);
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        BrazeLogger.m11282d(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeActionParser$execute$1(channel, uri), 6);
        try {
            Pair c = m11388c(uri);
            if (c == null) {
                BrazeLogger.m11282d(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, BrazeActionParser$execute$2.INSTANCE, 6);
                return;
            }
            String str = (String) c.component1();
            JSONObject jSONObject = (JSONObject) c.component2();
            if (!C19383o.m32792b(str, "v1")) {
                BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new BrazeActionParser$execute$3(str), 7);
                return;
            }
            mo16184d(context, new StepData(jSONObject, channel));
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeActionParser$execute$5(uri), 6);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, new BrazeActionParser$execute$4(uri), 4);
        }
    }

    /* renamed from: b */
    public final ActionType mo16183b(StepData stepData) {
        ActionType.C5624a aVar = ActionType.Companion;
        String e = JsonUtils.m11314e("type", stepData.f12027a);
        aVar.getClass();
        Map access$getMap$cp = ActionType.map;
        if (e == null) {
            e = "";
        }
        Object obj = access$getMap$cp.get(e);
        if (obj == null) {
            obj = ActionType.INVALID;
        }
        ActionType actionType = (ActionType) obj;
        if (actionType.getImpl().mo7679b(stepData)) {
            return actionType;
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new BrazeActionParser$getActionType$1(actionType, stepData), 7);
        return ActionType.INVALID;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo16184d(Context context, StepData stepData) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        try {
            ActionType b = mo16183b(stepData);
            if (b != ActionType.INVALID) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeActionParser$parse$1(b, stepData), 6);
                b.getImpl().mo7681i(context, stepData);
            }
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, new BrazeActionParser$parse$2(stepData), 4);
        }
    }
}
