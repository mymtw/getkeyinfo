package com.paypal.pyplcheckout.services.api;

import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.services.callbacks.BaseCallback;
import com.paypal.pyplcheckout.utils.StringExtensionsKt;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20009t;
import okhttp3.C20011u;
import okhttp3.internal.connection.C19971e;

public abstract class BaseApi {
    private final PEnums.TransitionName classToTransitionName() {
        return PEnums.TransitionName.CUSTOM_TRANSITION_NAME.setTransitionName(StringExtensionsKt.toSnakeCase(getClass().getSimpleName()));
    }

    private final C20009t getOkHttpClient() {
        return NetworkObject.INSTANCE.getOkHttpClient();
    }

    private final boolean isNotLogApi() {
        return !(this instanceof LogApi);
    }

    public abstract C20011u createService();

    public void enqueueRequest(BaseCallback baseCallback) {
        BaseCallback baseCallback2 = baseCallback;
        C19383o.m32797g(baseCallback2, "callback");
        if (isNotLogApi()) {
            PLog.transition$default(classToTransitionName(), PEnums.Outcome.ATTEMPTED, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16380, (Object) null);
        }
        ((C19971e) getOkHttpClient().mo20743a(createService())).mo72857S(baseCallback2);
    }
}
