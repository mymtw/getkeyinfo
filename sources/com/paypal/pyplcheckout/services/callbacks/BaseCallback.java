package com.paypal.pyplcheckout.services.callbacks;

import android.os.Handler;
import android.os.Looper;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p539ab.AbManager;
import com.paypal.pyplcheckout.services.InternalCorrelationIds;
import com.paypal.pyplcheckout.utils.StringExtensionsKt;
import java.io.IOException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C19928a0;
import okhttp3.C19944e;
import okhttp3.C19946f;
import okhttp3.C19997p;
import okhttp3.C20018z;

public abstract class BaseCallback implements C19946f {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "BaseCallback";
    public AbManager abManager;
    private String correlationId;
    public Events events;
    private final Handler mainHandler;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BaseCallback() {
        this((Handler) null, 1, (DefaultConstructorMarker) null);
    }

    public BaseCallback(Handler handler) {
        C19383o.m32797g(handler, "mainHandler");
        this.mainHandler = handler;
    }

    private final PEnums.TransitionName classToTransitionName() {
        return PEnums.TransitionName.CUSTOM_TRANSITION_NAME.setTransitionName(StringExtensionsKt.toSnakeCase(getClass().getSimpleName()));
    }

    private final void handleApiError(Exception exc) {
        handleCorrelationId(this.correlationId);
        if (isNotLogCallback()) {
            PLog pLog = PLog.INSTANCE;
            PEnums.ErrorType errorType = PEnums.ErrorType.FATAL;
            PEnums.EventCode eventCode = PEnums.EventCode.E637;
            String localizedMessage = exc.getLocalizedMessage();
            PEnums.TransitionName classToTransitionName = classToTransitionName();
            String str = this.correlationId;
            C19383o.m32796f(localizedMessage, "localizedMessage");
            PLog.error$default(errorType, eventCode, localizedMessage, (String) null, exc, classToTransitionName, (PEnums.StateName) null, (String) null, (String) null, str, (InstrumentationEvent.InstrumentationEventBuilder) null, 1480, (Object) null);
        }
        onApiError(exc);
    }

    private final void handleApiSuccess(C19928a0 a0Var) {
        String nullIfNullOrEmpty = StringExtensionsKt.nullIfNullOrEmpty(a0Var.mo72844g());
        if (nullIfNullOrEmpty == null) {
            handleApiError(new Exception("null response body"));
            return;
        }
        handleCorrelationId(this.correlationId);
        if (isNotLogCallback()) {
            PLog.transition$default(classToTransitionName(), PEnums.Outcome.SUCCEEDED, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, nullIfNullOrEmpty, (String) null, (String) null, this.correlationId, (InstrumentationEvent.InstrumentationEventBuilder) null, 11772, (Object) null);
        }
        onApiSuccess(nullIfNullOrEmpty);
    }

    public static /* synthetic */ void handleCallbackFailure$default(BaseCallback baseCallback, String str, Exception exc, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                exc = null;
            }
            baseCallback.handleCallbackFailure(str, exc);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleCallbackFailure");
    }

    private final void handleCorrelationId(String str) {
        if (str != null) {
            InternalCorrelationIds correlationIds = DebugConfigManager.getInstance().getCorrelationIds();
            C19383o.m32796f(correlationIds, "getInstance().correlationIds");
            DebugConfigManager.getInstance().setCorrelationIds(onSaveCorrelationId(str, correlationIds));
        }
    }

    private final boolean isNotLogCallback() {
        return !(this instanceof LogCallback);
    }

    public final AbManager getAbManager() {
        AbManager abManager2 = this.abManager;
        if (abManager2 != null) {
            return abManager2;
        }
        C19383o.m32805o("abManager");
        throw null;
    }

    public final String getCorrelationId() {
        return this.correlationId;
    }

    public final Events getEvents() {
        Events events2 = this.events;
        if (events2 != null) {
            return events2;
        }
        C19383o.m32805o("events");
        throw null;
    }

    public final void handleCallbackFailure(String str, Exception exc) {
        String str2;
        if (isNotLogCallback()) {
            PLog pLog = PLog.INSTANCE;
            PEnums.ErrorType errorType = PEnums.ErrorType.FATAL;
            PEnums.EventCode eventCode = PEnums.EventCode.E637;
            if (exc == null || (str2 = exc.getLocalizedMessage()) == null) {
                str2 = "Unknown Callback Failure message";
            }
            PLog.error$default(errorType, eventCode, str2, (String) null, exc, classToTransitionName(), (PEnums.StateName) null, String.valueOf(str), (String) null, this.correlationId, (InstrumentationEvent.InstrumentationEventBuilder) null, 1352, (Object) null);
            return;
        }
    }

    public abstract void onApiError(Exception exc);

    public abstract void onApiSuccess(String str);

    public void onFailure(C19944e eVar, IOException iOException) {
        C19383o.m32797g(eVar, "call");
        C19383o.m32797g(iOException, "exception");
        String str = TAG;
        C19383o.m32796f(str, "TAG");
        C19997p pVar = eVar.mo72860g().f44342b;
        String message = iOException.getMessage();
        PLog.w$default(str, pVar + " failed because: " + message, 0, 4, (Object) null);
        handleApiError(iOException);
    }

    public void onResponse(C19944e eVar, C20018z zVar) {
        C19383o.m32797g(eVar, "call");
        C19383o.m32797g(zVar, ResponseConstants.RESPONSE);
        String str = TAG;
        C19383o.m32796f(str, "TAG");
        C19997p pVar = eVar.mo72860g().f44342b;
        String str2 = null;
        PLog.v$default(str, pVar + " returned with response", 0, 4, (Object) null);
        try {
            this.correlationId = BaseCallbackKt.getCorrelationId(zVar);
            if (!zVar.mo73006d()) {
                C19928a0 a0Var = zVar.f44368i;
                if (a0Var != null) {
                    str2 = a0Var.mo72844g();
                }
                handleApiError(new Exception("api call did not succeed " + str2));
                return;
            }
            C19928a0 a0Var2 = zVar.f44368i;
            if (a0Var2 == null) {
                handleApiError(new Exception("null response body"));
            } else {
                handleApiSuccess(a0Var2);
            }
        } catch (IOException e) {
            handleApiError(e);
        }
    }

    public InternalCorrelationIds onSaveCorrelationId(String str, InternalCorrelationIds internalCorrelationIds) {
        C19383o.m32797g(str, "correlationId");
        C19383o.m32797g(internalCorrelationIds, "internalCorrelationIds");
        return internalCorrelationIds;
    }

    public final void runOnUiThread(Runnable runnable) {
        C19383o.m32797g(runnable, "runnable");
        this.mainHandler.post(runnable);
    }

    public final void setAbManager(AbManager abManager2) {
        C19383o.m32797g(abManager2, "<set-?>");
        this.abManager = abManager2;
    }

    public final void setEvents(Events events2) {
        C19383o.m32797g(events2, "<set-?>");
        this.events = events2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseCallback(Handler handler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
