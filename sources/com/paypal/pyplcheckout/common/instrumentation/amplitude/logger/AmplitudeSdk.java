package com.paypal.pyplcheckout.common.instrumentation.amplitude.logger;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.extensions.ContextExtensionsKt;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.utils.AccessibilityUtilsKt;
import com.paypal.pyplcheckout.utils.AmplitudeUtils;
import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import org.json.JSONObject;
import p003a2.C0015b;
import p253u3.C8137d;
import p253u3.C8139f;
import p253u3.C8146k;
import p253u3.C8148m;
import p253u3.C8149n;
import p253u3.C8154r;
import p253u3.C8155s;
import p253u3.C8156t;
import p306z8.C8476c;

public final class AmplitudeSdk implements AmplitudeLogger {
    private final AmplitudeUtils amplitudeUtils;
    private final Context context;
    private final DebugConfigManager debugConfigManager;
    private final int eventUploadThreshold;
    private boolean isInitialized;
    private boolean sendingErrorLog;

    public AmplitudeSdk(DebugConfigManager debugConfigManager2, int i, AmplitudeUtils amplitudeUtils2, Context context2) {
        C19383o.m32797g(debugConfigManager2, "debugConfigManager");
        C19383o.m32797g(amplitudeUtils2, "amplitudeUtils");
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this.debugConfigManager = debugConfigManager2;
        this.eventUploadThreshold = i;
        this.amplitudeUtils = amplitudeUtils2;
        this.context = context2;
    }

    /* access modifiers changed from: private */
    /* renamed from: initialize$lambda-2$lambda-0  reason: not valid java name */
    public static final void m35237initialize$lambda2$lambda0(AmplitudeSdk amplitudeSdk, String str, String str2) {
        AmplitudeSdk amplitudeSdk2 = amplitudeSdk;
        C19383o.m32797g(amplitudeSdk, "this$0");
        if (!amplitudeSdk2.sendingErrorLog) {
            amplitudeSdk2.sendingErrorLog = true;
            PLog.error$default(PEnums.ErrorType.INFO, PEnums.EventCode.E518, C0015b.m90i("Tag: ", str, ", message: ", str2), "Amplitude callback error executed", (Throwable) null, PEnums.TransitionName.AMPLITUDE_CALLBACK_ERROR, PEnums.StateName.NONE, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1936, (Object) null);
        }
    }

    public void clearSession() {
        C8139f client = this.amplitudeUtils.getClient();
        if (client.mo20746a("uploadEvents()")) {
            client.f17817G.post(new C8137d(client));
        }
        setUserId((String) null);
    }

    public final String getUserId() {
        return this.amplitudeUtils.getClient().f17824f;
    }

    public void initialize(String str) {
        C8139f client = this.amplitudeUtils.getClient();
        Context context2 = this.context;
        String returnKeyByEnv = this.amplitudeUtils.returnKeyByEnv();
        synchronized (client) {
            client.mo20749e(context2, returnKeyByEnv);
        }
        boolean isDebug = this.debugConfigManager.isDebug();
        C8149n nVar = C8149n.f17874c;
        nVar.f17875a = isDebug;
        nVar.f17876b = new C8476c(this);
        client.f17839u = this.eventUploadThreshold;
        C8154r rVar = new C8154r();
        rVar.mo20790a(Boolean.valueOf(AccessibilityUtilsKt.isAccessibilityEnabled(this.context)), "is_accessibility_enabled");
        rVar.mo20790a(ContextExtensionsKt.getDisplayDensityName(this.context), "display_density");
        if (!this.isInitialized) {
            if (client.mo20746a("regenerateDeviceId()")) {
                client.mo20753j(new C8148m(client, client));
            }
            this.isInitialized = true;
        }
        if (client.mo20746a("setUserId()")) {
            client.mo20753j(new C8146k(client, client, str));
        }
        if (rVar.f17901a.length() != 0 && client.mo20746a("identify()")) {
            client.mo20751g("$identify", (JSONObject) null, rVar.f17901a, System.currentTimeMillis());
        }
    }

    public void logEvent(String str, JSONObject jSONObject) {
        C19383o.m32797g(str, "eventName");
        C19383o.m32797g(jSONObject, "event");
        C8139f client = this.amplitudeUtils.getClient();
        C8155s sVar = client.f17828j;
        C8155s sVar2 = new C8155s();
        String[] strArr = C8155s.f17904c;
        boolean z = false;
        for (int i = 0; i < 4; i++) {
            sVar2.f17905a.add(strArr[i]);
        }
        sVar.getClass();
        Iterator it = sVar2.f17905a.iterator();
        while (it.hasNext()) {
            sVar.f17905a.add((String) it.next());
        }
        client.f17829k = client.f17828j.mo20791a();
        long currentTimeMillis = System.currentTimeMillis();
        if (C8156t.m16412c(str)) {
            C8149n.f17874c.mo20765a("u3.f", "Argument eventType cannot be null or blank in logEvent()");
        } else {
            z = client.mo20746a("logEvent()");
        }
        if (z) {
            client.mo20751g(str, jSONObject, (JSONObject) null, currentTimeMillis);
        }
    }

    public final void setUserId(String str) {
        C8139f client = this.amplitudeUtils.getClient();
        if (client.mo20746a("setUserId()")) {
            client.mo20753j(new C8146k(client, client, str));
        }
    }
}
