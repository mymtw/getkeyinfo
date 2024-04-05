package com.paypal.pyplcheckout.common.instrumentation.amplitude.logger;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.models.DeviceInfo;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.models.UserProperties;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository;
import com.paypal.pyplcheckout.extensions.ContextExtensionsKt;
import com.paypal.pyplcheckout.network.ConnectivityHandler;
import com.paypal.pyplcheckout.utils.AccessibilityUtilsKt;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import org.json.JSONObject;

public final class AmplitudeService implements AmplitudeLogger {
    private final ConnectivityHandler connectivityHandler;
    private final Context context;
    private final DeviceInfo deviceInfo;
    private final AmplitudeRepository repository;
    private final C19525d0 scope;

    public AmplitudeService(AmplitudeRepository amplitudeRepository, C19525d0 d0Var, Context context2, DeviceInfo deviceInfo2, ConnectivityHandler connectivityHandler2) {
        C19383o.m32797g(amplitudeRepository, "repository");
        C19383o.m32797g(d0Var, "scope");
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        C19383o.m32797g(deviceInfo2, "deviceInfo");
        C19383o.m32797g(connectivityHandler2, "connectivityHandler");
        this.repository = amplitudeRepository;
        this.scope = d0Var;
        this.context = context2;
        this.deviceInfo = deviceInfo2;
        this.connectivityHandler = connectivityHandler2;
    }

    public void clearSession() {
        this.repository.clearUserSession();
    }

    public final ConnectivityHandler getConnectivityHandler() {
        return this.connectivityHandler;
    }

    public final Context getContext() {
        return this.context;
    }

    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public final AmplitudeRepository getRepository() {
        return this.repository;
    }

    public final C19525d0 getScope() {
        return this.scope;
    }

    public void initialize(String str) {
        this.repository.initializeSession(str);
        this.repository.setUserProperties(new UserProperties(AccessibilityUtilsKt.isAccessibilityEnabled(this.context), ContextExtensionsKt.getDisplayDensityName(this.context), this.deviceInfo.getIpCountry(), this.deviceInfo.getDeviceCountry()));
    }

    public void logEvent(String str, JSONObject jSONObject) {
        C19383o.m32797g(str, "transitionName");
        C19383o.m32797g(jSONObject, "event");
        C19697g.m33468f(this.scope, (CoroutineContext) null, (CoroutineStart) null, new AmplitudeService$logEvent$1(this, str, jSONObject, (C19340c<? super AmplitudeService$logEvent$1>) null), 3);
    }

    public final void uploadFailedEvents() {
        if (this.connectivityHandler.isNetworkAvailable()) {
            C19697g.m33468f(this.scope, (CoroutineContext) null, (CoroutineStart) null, new AmplitudeService$uploadFailedEvents$1(this, (C19340c<? super AmplitudeService$uploadFailedEvents$1>) null), 3);
        }
    }
}
