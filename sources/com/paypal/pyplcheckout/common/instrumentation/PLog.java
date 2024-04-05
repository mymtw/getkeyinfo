package com.paypal.pyplcheckout.common.instrumentation;

import android.util.Log;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.gson.C16708i;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.ExtendedPayPalEventTypes;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.services.BeaverLogger;
import com.paypal.pyplcheckout.services.PYPL_FPTI;
import com.paypal.pyplcheckout.services.api.LogApi;
import com.paypal.pyplcheckout.utils.CheckoutCrashLogger;
import com.paypal.pyplcheckout.utils.CrashLogger;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p010a9.C0048b;

public final class PLog {
    private static final String CAL_EVENT = "androidsdk_checkout_cal";
    private static final int DEBUG = 1000;
    private static final String ERROR_SUFFIX = "_error";
    private static final String FPTI_EVENT = "checkout_fpti";
    public static final PLog INSTANCE = new PLog();
    private static final int RELEASE = 1001;
    private static final String TAG = "PLog";

    private PLog() {
    }

    public static final void click(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName) {
        C19383o.m32797g(outcome, "outcome");
        C19383o.m32797g(eventCode, "eventCode");
        click$default(transitionName, outcome, eventCode, stateName, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 496, (Object) null);
    }

    public static final void click(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str) {
        C19383o.m32797g(outcome, "outcome");
        C19383o.m32797g(eventCode, "eventCode");
        click$default(transitionName, outcome, eventCode, stateName, str, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 480, (Object) null);
    }

    public static final void click(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, String str2) {
        C19383o.m32797g(outcome, "outcome");
        C19383o.m32797g(eventCode, "eventCode");
        click$default(transitionName, outcome, eventCode, stateName, str, str2, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 448, (Object) null);
    }

    public static final void click(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, String str2, String str3) {
        C19383o.m32797g(outcome, "outcome");
        C19383o.m32797g(eventCode, "eventCode");
        click$default(transitionName, outcome, eventCode, stateName, str, str2, str3, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
    }

    public static final void click(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, String str2, String str3, String str4) {
        C19383o.m32797g(outcome, "outcome");
        C19383o.m32797g(eventCode, "eventCode");
        click$default(transitionName, outcome, eventCode, stateName, str, str2, str3, str4, (InstrumentationEvent.InstrumentationEventBuilder) null, 256, (Object) null);
    }

    public static final void click(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, String str2, String str3, String str4, InstrumentationEvent.InstrumentationEventBuilder instrumentationEventBuilder) {
        C19383o.m32797g(outcome, "outcome");
        C19383o.m32797g(eventCode, "eventCode");
        C19383o.m32797g(instrumentationEventBuilder, "instrumentationEventBuilder");
        v$default("InstrumentationTr", "click " + transitionName + " " + outcome + ".toString()", 0, 4, (Object) null);
        instrumentationEventBuilder.eventType(PEnums.EventType.CL).transitionName(transitionName).outcome(outcome).intErrorCode(eventCode.getInternalCodeString()).extErrorCode(eventCode.getExternalCodeString()).stateName(stateName).infoMessage(str).parentName(str2).childName(str3).fieldName(str4);
        INSTANCE.submitInstrumentationEvent(instrumentationEventBuilder.build());
    }

    public static /* synthetic */ void click$default(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, String str2, String str3, String str4, InstrumentationEvent.InstrumentationEventBuilder instrumentationEventBuilder, int i, Object obj) {
        int i2 = i;
        click(transitionName, outcome, eventCode, stateName, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? new InstrumentationEvent.InstrumentationEventBuilder((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 536870911, (DefaultConstructorMarker) null) : instrumentationEventBuilder);
    }

    /* renamed from: d */
    public static final void m28726d(String str, String str2) {
        C19383o.m32797g(str, "tag");
        d$default(str, str2, 0, 4, (Object) null);
    }

    /* renamed from: d */
    public static final void m28727d(String str, String str2, int i) {
        C19383o.m32797g(str, "tag");
        if ((i == 1000 && DebugConfigManager.getInstance().isDebug()) || i == 1001) {
            String i2 = C0326j.m864i("nxo", str);
            if (str2 == null) {
                str2 = "no log";
            }
            Log.d(i2, str2);
        }
    }

    public static /* synthetic */ void d$default(String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 1000;
        }
        m28727d(str, str2, i);
    }

    /* renamed from: dR */
    public static final void m28728dR(String str, String str2) {
        C19383o.m32797g(str, "tag");
        m28727d(str, str2, 1001);
    }

    public static final void decision(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName) {
        C19383o.m32797g(transitionName, "transitionName");
        C19383o.m32797g(outcome, "decisionOutcome");
        PEnums.StateName stateName2 = stateName;
        C19383o.m32797g(stateName2, "stateName");
        decision$default(transitionName, outcome, eventCode, stateName2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
    }

    public static final void decision(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str) {
        C19383o.m32797g(transitionName, "transitionName");
        C19383o.m32797g(outcome, "decisionOutcome");
        PEnums.StateName stateName2 = stateName;
        C19383o.m32797g(stateName2, "stateName");
        decision$default(transitionName, outcome, eventCode, stateName2, str, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2016, (Object) null);
    }

    public static final void decision(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, String str2) {
        C19383o.m32797g(transitionName, "transitionName");
        C19383o.m32797g(outcome, "decisionOutcome");
        PEnums.StateName stateName2 = stateName;
        C19383o.m32797g(stateName2, "stateName");
        decision$default(transitionName, outcome, eventCode, stateName2, str, str2, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1984, (Object) null);
    }

    public static final void decision(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, String str2, String str3) {
        C19383o.m32797g(transitionName, "transitionName");
        C19383o.m32797g(outcome, "decisionOutcome");
        PEnums.StateName stateName2 = stateName;
        C19383o.m32797g(stateName2, "stateName");
        decision$default(transitionName, outcome, eventCode, stateName2, str, str2, str3, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
    }

    public static final void decision(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, String str2, String str3, String str4) {
        C19383o.m32797g(transitionName, "transitionName");
        C19383o.m32797g(outcome, "decisionOutcome");
        PEnums.StateName stateName2 = stateName;
        C19383o.m32797g(stateName2, "stateName");
        decision$default(transitionName, outcome, eventCode, stateName2, str, str2, str3, str4, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1792, (Object) null);
    }

    public static final void decision(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, String str2, String str3, String str4, String str5) {
        C19383o.m32797g(transitionName, "transitionName");
        C19383o.m32797g(outcome, "decisionOutcome");
        PEnums.StateName stateName2 = stateName;
        C19383o.m32797g(stateName2, "stateName");
        decision$default(transitionName, outcome, eventCode, stateName2, str, str2, str3, str4, str5, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1536, (Object) null);
    }

    public static final void decision(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, String str2, String str3, String str4, String str5, String str6) {
        C19383o.m32797g(transitionName, "transitionName");
        C19383o.m32797g(outcome, "decisionOutcome");
        PEnums.StateName stateName2 = stateName;
        C19383o.m32797g(stateName2, "stateName");
        decision$default(transitionName, outcome, eventCode, stateName2, str, str2, str3, str4, str5, str6, (InstrumentationEvent.InstrumentationEventBuilder) null, RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE, (Object) null);
    }

    public static final void decision(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, String str2, String str3, String str4, String str5, String str6, InstrumentationEvent.InstrumentationEventBuilder instrumentationEventBuilder) {
        C19383o.m32797g(transitionName, "transitionName");
        C19383o.m32797g(outcome, "decisionOutcome");
        C19383o.m32797g(stateName, "stateName");
        C19383o.m32797g(instrumentationEventBuilder, "instrumentationEventBuilder");
        String str7 = null;
        v$default("InstrumentationTr", "decision " + transitionName + " " + outcome, 0, 4, (Object) null);
        InstrumentationEvent.InstrumentationEventBuilder intErrorCode = instrumentationEventBuilder.eventType(PEnums.EventType.DE).transitionName(transitionName).outcome(outcome).intErrorCode(eventCode == null ? null : eventCode.getInternalCodeString());
        if (eventCode != null) {
            str7 = eventCode.getExternalCodeString();
        }
        intErrorCode.extErrorCode(str7).stateName(stateName).parentName(str).childName(str2).infoMessage(str3).experimentationExperience(str4).experimentationTreatment(str5).fieldName(str6);
        INSTANCE.submitInstrumentationEvent(instrumentationEventBuilder.build());
    }

    public static final void decision(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.StateName stateName) {
        C19383o.m32797g(transitionName, "transitionName");
        C19383o.m32797g(outcome, "decisionOutcome");
        PEnums.StateName stateName2 = stateName;
        C19383o.m32797g(stateName2, "stateName");
        decision$default(transitionName, outcome, (PEnums.EventCode) null, stateName2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2036, (Object) null);
    }

    public static /* synthetic */ void decision$default(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, String str2, String str3, String str4, String str5, String str6, InstrumentationEvent.InstrumentationEventBuilder instrumentationEventBuilder, int i, Object obj) {
        int i2 = i;
        decision(transitionName, outcome, (i2 & 4) != 0 ? null : eventCode, stateName, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? null : str5, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? null : str6, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? new InstrumentationEvent.InstrumentationEventBuilder((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 536870911, (DefaultConstructorMarker) null) : instrumentationEventBuilder);
    }

    /* renamed from: e */
    public static final void m28729e(String str, String str2) {
        C19383o.m32797g(str, "tag");
        e$default(str, str2, (Throwable) null, 0, 12, (Object) null);
    }

    /* renamed from: e */
    public static final void m28730e(String str, String str2, Throwable th) {
        C19383o.m32797g(str, "tag");
        e$default(str, str2, th, 0, 8, (Object) null);
    }

    /* renamed from: e */
    public static final void m28731e(String str, String str2, Throwable th, int i) {
        C19383o.m32797g(str, "tag");
        if ((i == 1000 && DebugConfigManager.getInstance().isDebug()) || i == 1001) {
            if (th == null) {
                String i2 = C0326j.m864i("nxo", str);
                if (str2 == null) {
                    str2 = "no log";
                }
                Log.e(i2, str2);
                return;
            }
            Log.e("nxo" + str, str2, th);
        }
    }

    public static /* synthetic */ void e$default(String str, String str2, Throwable th, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            th = null;
        }
        if ((i2 & 8) != 0) {
            i = 1000;
        }
        m28731e(str, str2, th, i);
    }

    /* renamed from: eR */
    public static final void m28732eR(String str, String str2) {
        C19383o.m32797g(str, "tag");
        eR$default(str, str2, (Exception) null, 4, (Object) null);
    }

    /* renamed from: eR */
    public static final void m28733eR(String str, String str2, Exception exc) {
        C19383o.m32797g(str, "tag");
        m28731e(str, str2, exc, 1001);
    }

    public static /* synthetic */ void eR$default(String str, String str2, Exception exc, int i, Object obj) {
        if ((i & 4) != 0) {
            exc = null;
        }
        m28733eR(str, str2, exc);
    }

    public static final void error(PEnums.ErrorType errorType, PEnums.EventCode eventCode, String str, PEnums.TransitionName transitionName) {
        C19383o.m32797g(errorType, "errorType");
        C19383o.m32797g(eventCode, ResponseConstants.CODE);
        String str2 = str;
        C19383o.m32797g(str2, "message");
        PEnums.TransitionName transitionName2 = transitionName;
        C19383o.m32797g(transitionName2, "transitionName");
        error$default(errorType, eventCode, str2, (String) null, (Throwable) null, transitionName2, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
    }

    public static final void error(PEnums.ErrorType errorType, PEnums.EventCode eventCode, String str, String str2, PEnums.TransitionName transitionName) {
        C19383o.m32797g(errorType, "errorType");
        C19383o.m32797g(eventCode, ResponseConstants.CODE);
        String str3 = str;
        C19383o.m32797g(str3, "message");
        PEnums.TransitionName transitionName2 = transitionName;
        C19383o.m32797g(transitionName2, "transitionName");
        error$default(errorType, eventCode, str3, str2, (Throwable) null, transitionName2, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, RecyclerView.MAX_SCROLL_DURATION, (Object) null);
    }

    public static final void error(PEnums.ErrorType errorType, PEnums.EventCode eventCode, String str, String str2, Throwable th, PEnums.TransitionName transitionName) {
        C19383o.m32797g(errorType, "errorType");
        C19383o.m32797g(eventCode, ResponseConstants.CODE);
        String str3 = str;
        C19383o.m32797g(str3, "message");
        PEnums.TransitionName transitionName2 = transitionName;
        C19383o.m32797g(transitionName2, "transitionName");
        error$default(errorType, eventCode, str3, str2, th, transitionName2, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1984, (Object) null);
    }

    public static final void error(PEnums.ErrorType errorType, PEnums.EventCode eventCode, String str, String str2, Throwable th, PEnums.TransitionName transitionName, PEnums.StateName stateName) {
        C19383o.m32797g(errorType, "errorType");
        C19383o.m32797g(eventCode, ResponseConstants.CODE);
        String str3 = str;
        C19383o.m32797g(str3, "message");
        PEnums.TransitionName transitionName2 = transitionName;
        C19383o.m32797g(transitionName2, "transitionName");
        error$default(errorType, eventCode, str3, str2, th, transitionName2, stateName, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
    }

    public static final void error(PEnums.ErrorType errorType, PEnums.EventCode eventCode, String str, String str2, Throwable th, PEnums.TransitionName transitionName, PEnums.StateName stateName, String str3) {
        C19383o.m32797g(errorType, "errorType");
        C19383o.m32797g(eventCode, ResponseConstants.CODE);
        String str4 = str;
        C19383o.m32797g(str4, "message");
        PEnums.TransitionName transitionName2 = transitionName;
        C19383o.m32797g(transitionName2, "transitionName");
        error$default(errorType, eventCode, str4, str2, th, transitionName2, stateName, str3, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1792, (Object) null);
    }

    public static final void error(PEnums.ErrorType errorType, PEnums.EventCode eventCode, String str, String str2, Throwable th, PEnums.TransitionName transitionName, PEnums.StateName stateName, String str3, String str4) {
        C19383o.m32797g(errorType, "errorType");
        C19383o.m32797g(eventCode, ResponseConstants.CODE);
        String str5 = str;
        C19383o.m32797g(str5, "message");
        PEnums.TransitionName transitionName2 = transitionName;
        C19383o.m32797g(transitionName2, "transitionName");
        error$default(errorType, eventCode, str5, str2, th, transitionName2, stateName, str3, str4, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1536, (Object) null);
    }

    public static final void error(PEnums.ErrorType errorType, PEnums.EventCode eventCode, String str, String str2, Throwable th, PEnums.TransitionName transitionName, PEnums.StateName stateName, String str3, String str4, String str5) {
        C19383o.m32797g(errorType, "errorType");
        C19383o.m32797g(eventCode, ResponseConstants.CODE);
        String str6 = str;
        C19383o.m32797g(str6, "message");
        PEnums.TransitionName transitionName2 = transitionName;
        C19383o.m32797g(transitionName2, "transitionName");
        error$default(errorType, eventCode, str6, str2, th, transitionName2, stateName, str3, str4, str5, (InstrumentationEvent.InstrumentationEventBuilder) null, RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE, (Object) null);
    }

    public static final void error(PEnums.ErrorType errorType, PEnums.EventCode eventCode, String str, String str2, Throwable th, PEnums.TransitionName transitionName, PEnums.StateName stateName, String str3, String str4, String str5, InstrumentationEvent.InstrumentationEventBuilder instrumentationEventBuilder) {
        String str6;
        CheckoutCrashLogger instance;
        C19383o.m32797g(errorType, "errorType");
        C19383o.m32797g(eventCode, ResponseConstants.CODE);
        C19383o.m32797g(str, "message");
        C19383o.m32797g(transitionName, "transitionName");
        C19383o.m32797g(instrumentationEventBuilder, "instrumentationEventBuilder");
        if (th == null) {
            Log.e("InstrumentationErr", str + " " + str2);
            str6 = null;
        } else {
            Log.e("InstrumentationErr", str + " " + str2, th);
            str6 = C0048b.m163a(INSTANCE.getStackValues(th), " ", str3);
        }
        InstrumentationEvent.InstrumentationEventBuilder extErrorCode = instrumentationEventBuilder.eventType(PEnums.EventType.ERR).errorType(errorType.toString()).intErrorCode(eventCode.getInternalCodeString()).extErrorCode(eventCode.getExternalCodeString());
        InstrumentationEvent.InstrumentationEventBuilder errorDetails = extErrorCode.transitionName(transitionName + ERROR_SUFFIX).stateName(stateName).errorMessage(str).errorDetails(str2);
        if (str6 == null) {
            str6 = str3;
        }
        errorDetails.infoMessage(str6).fieldName(str4).correlationId(str5).build();
        CheckoutCrashLogger instance2 = CrashLogger.getInstance();
        if (instance2 != null) {
            if (str2 == null) {
                str2 = "";
            }
            StringBuilder f = C0388a.m1050f("instrumentation error: ", str, " ", str2, " , ");
            f.append(str3);
            instance2.addBreadcrumb(f.toString());
        }
        if (!(th == null || (instance = CrashLogger.getInstance()) == null)) {
            instance.logException(th);
        }
        INSTANCE.submitInstrumentationEvent(instrumentationEventBuilder.build());
    }

    public static /* synthetic */ void error$default(PEnums.ErrorType errorType, PEnums.EventCode eventCode, String str, String str2, Throwable th, PEnums.TransitionName transitionName, PEnums.StateName stateName, String str3, String str4, String str5, InstrumentationEvent.InstrumentationEventBuilder instrumentationEventBuilder, int i, Object obj) {
        int i2 = i;
        error(errorType, eventCode, str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : th, transitionName, (i2 & 64) != 0 ? null : stateName, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? null : str4, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? null : str5, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? new InstrumentationEvent.InstrumentationEventBuilder((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 536870911, (DefaultConstructorMarker) null) : instrumentationEventBuilder);
    }

    public static final void fallback(PEnums.TransitionName transitionName, PEnums.StateName stateName, String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory) {
        C19383o.m32797g(transitionName, "transitionName");
        C19383o.m32797g(stateName, "stateName");
        C19383o.m32797g(fallbackReason, "fallbackReason");
        PEnums.FallbackCategory fallbackCategory2 = fallbackCategory;
        C19383o.m32797g(fallbackCategory2, "fallbackCategory");
        fallback$default(transitionName, stateName, str, fallbackReason, fallbackCategory2, (PEnums.FallbackDestination) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 480, (Object) null);
    }

    public static final void fallback(PEnums.TransitionName transitionName, PEnums.StateName stateName, String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory, PEnums.FallbackDestination fallbackDestination) {
        C19383o.m32797g(transitionName, "transitionName");
        C19383o.m32797g(stateName, "stateName");
        C19383o.m32797g(fallbackReason, "fallbackReason");
        PEnums.FallbackCategory fallbackCategory2 = fallbackCategory;
        C19383o.m32797g(fallbackCategory2, "fallbackCategory");
        fallback$default(transitionName, stateName, str, fallbackReason, fallbackCategory2, fallbackDestination, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 448, (Object) null);
    }

    public static final void fallback(PEnums.TransitionName transitionName, PEnums.StateName stateName, String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory, PEnums.FallbackDestination fallbackDestination, String str2) {
        C19383o.m32797g(transitionName, "transitionName");
        C19383o.m32797g(stateName, "stateName");
        C19383o.m32797g(fallbackReason, "fallbackReason");
        PEnums.FallbackCategory fallbackCategory2 = fallbackCategory;
        C19383o.m32797g(fallbackCategory2, "fallbackCategory");
        fallback$default(transitionName, stateName, str, fallbackReason, fallbackCategory2, fallbackDestination, str2, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
    }

    public static final void fallback(PEnums.TransitionName transitionName, PEnums.StateName stateName, String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory, PEnums.FallbackDestination fallbackDestination, String str2, String str3) {
        C19383o.m32797g(transitionName, "transitionName");
        C19383o.m32797g(stateName, "stateName");
        C19383o.m32797g(fallbackReason, "fallbackReason");
        PEnums.FallbackCategory fallbackCategory2 = fallbackCategory;
        C19383o.m32797g(fallbackCategory2, "fallbackCategory");
        fallback$default(transitionName, stateName, str, fallbackReason, fallbackCategory2, fallbackDestination, str2, str3, (InstrumentationEvent.InstrumentationEventBuilder) null, 256, (Object) null);
    }

    public static final void fallback(PEnums.TransitionName transitionName, PEnums.StateName stateName, String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory, PEnums.FallbackDestination fallbackDestination, String str2, String str3, InstrumentationEvent.InstrumentationEventBuilder instrumentationEventBuilder) {
        C19383o.m32797g(transitionName, "transitionName");
        C19383o.m32797g(stateName, "stateName");
        C19383o.m32797g(fallbackReason, "fallbackReason");
        C19383o.m32797g(fallbackCategory, "fallbackCategory");
        C19383o.m32797g(instrumentationEventBuilder, "instrumentationEventBuilder");
        v$default("InstrumentationFallback", "fallback " + transitionName + " " + fallbackReason, 0, 4, (Object) null);
        instrumentationEventBuilder.eventType(PEnums.EventType.FALLBACK).transitionName(transitionName).stateName(stateName).fallBackFrom(str).fallBackReason(fallbackReason).fallBackCategory(fallbackCategory).destinationScreen(String.valueOf(fallbackDestination)).infoMessage(str2).errorMessage(str3);
        INSTANCE.submitInstrumentationEvent(instrumentationEventBuilder.build());
        CheckoutCrashLogger instance = CrashLogger.getInstance();
        if (instance != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("instrumentation fallback ");
            sb.append(transitionName);
            sb.append(" ");
            sb.append(fallbackReason);
            sb.append(" from : ");
            C0391c.m1061h(sb, str, " , msg: ", str2, " , errorMsg: ");
            sb.append(str3);
            instance.addBreadcrumb(sb.toString());
        }
    }

    public static /* synthetic */ void fallback$default(PEnums.TransitionName transitionName, PEnums.StateName stateName, String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory, PEnums.FallbackDestination fallbackDestination, String str2, String str3, InstrumentationEvent.InstrumentationEventBuilder instrumentationEventBuilder, int i, Object obj) {
        int i2 = i;
        fallback(transitionName, stateName, str, fallbackReason, fallbackCategory, (i2 & 32) != 0 ? null : fallbackDestination, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? new InstrumentationEvent.InstrumentationEventBuilder((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 536870911, (DefaultConstructorMarker) null) : instrumentationEventBuilder);
    }

    /* renamed from: i */
    public static final void m28734i(String str, String str2) {
        C19383o.m32797g(str, "tag");
        i$default(str, str2, 0, 4, (Object) null);
    }

    /* renamed from: i */
    public static final void m28735i(String str, String str2, int i) {
        C19383o.m32797g(str, "tag");
        if ((i == 1000 && DebugConfigManager.getInstance().isDebug()) || i == 1001) {
            String i2 = C0326j.m864i("nxo", str);
            if (str2 == null) {
                str2 = "no log";
            }
            Log.i(i2, str2);
        }
    }

    public static /* synthetic */ void i$default(String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 1000;
        }
        m28735i(str, str2, i);
    }

    /* renamed from: iR */
    public static final void m28736iR(String str, String str2) {
        C19383o.m32797g(str, "tag");
        m28735i(str, str2, 1001);
    }

    public static final void impression(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName) {
        C19383o.m32797g(transitionName, "transitionName");
        C19383o.m32797g(outcome, "outcome");
        C19383o.m32797g(eventCode, ResponseConstants.CODE);
        C19383o.m32797g(stateName, "stateName");
        impression$default(transitionName, outcome, eventCode, stateName, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 496, (Object) null);
    }

    public static final void impression(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str) {
        C19383o.m32797g(transitionName, "transitionName");
        C19383o.m32797g(outcome, "outcome");
        C19383o.m32797g(eventCode, ResponseConstants.CODE);
        C19383o.m32797g(stateName, "stateName");
        impression$default(transitionName, outcome, eventCode, stateName, str, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 480, (Object) null);
    }

    public static final void impression(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, String str2) {
        C19383o.m32797g(transitionName, "transitionName");
        C19383o.m32797g(outcome, "outcome");
        C19383o.m32797g(eventCode, ResponseConstants.CODE);
        C19383o.m32797g(stateName, "stateName");
        impression$default(transitionName, outcome, eventCode, stateName, str, str2, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 448, (Object) null);
    }

    public static final void impression(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, String str2, String str3) {
        C19383o.m32797g(transitionName, "transitionName");
        C19383o.m32797g(outcome, "outcome");
        C19383o.m32797g(eventCode, ResponseConstants.CODE);
        C19383o.m32797g(stateName, "stateName");
        impression$default(transitionName, outcome, eventCode, stateName, str, str2, str3, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
    }

    public static final void impression(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, String str2, String str3, String str4) {
        C19383o.m32797g(transitionName, "transitionName");
        C19383o.m32797g(outcome, "outcome");
        C19383o.m32797g(eventCode, ResponseConstants.CODE);
        C19383o.m32797g(stateName, "stateName");
        impression$default(transitionName, outcome, eventCode, stateName, str, str2, str3, str4, (InstrumentationEvent.InstrumentationEventBuilder) null, 256, (Object) null);
    }

    public static final void impression(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, String str2, String str3, String str4, InstrumentationEvent.InstrumentationEventBuilder instrumentationEventBuilder) {
        C19383o.m32797g(transitionName, "transitionName");
        C19383o.m32797g(outcome, "outcome");
        C19383o.m32797g(eventCode, ResponseConstants.CODE);
        C19383o.m32797g(stateName, "stateName");
        C19383o.m32797g(instrumentationEventBuilder, "instrumentationEventBuilder");
        instrumentationEventBuilder.eventType(PEnums.EventType.IM).transitionName(transitionName).outcome(outcome).intErrorCode(eventCode.getInternalCodeString()).extErrorCode(eventCode.getExternalCodeString()).stateName(stateName).infoMessage(str).parentName(str2).childName(str3).fieldName(str4);
        INSTANCE.submitInstrumentationEvent(instrumentationEventBuilder.build());
    }

    public static /* synthetic */ void impression$default(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, String str2, String str3, String str4, InstrumentationEvent.InstrumentationEventBuilder instrumentationEventBuilder, int i, Object obj) {
        int i2 = i;
        impression(transitionName, outcome, eventCode, stateName, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? new InstrumentationEvent.InstrumentationEventBuilder((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 536870911, (DefaultConstructorMarker) null) : instrumentationEventBuilder);
    }

    public static final void info(PEnums.LogType logType, String str) {
        C19383o.m32797g(logType, "logType");
        C19383o.m32797g(str, "eventType");
        String str2 = logType == PEnums.LogType.FPTI ? FPTI_EVENT : CAL_EVENT;
        JSONObject fetchPayload = PYPL_FPTI.getInstance().fetchPayload(str);
        if (fetchPayload != null) {
            BeaverLogger.info$default(BeaverLogger.INSTANCE, str2, fetchPayload, (LogApi) null, 4, (Object) null);
        }
    }

    public static final void scroll(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, String str2, String str3, InstrumentationEvent.InstrumentationEventBuilder instrumentationEventBuilder) {
        C19383o.m32797g(transitionName, "transitionName");
        C19383o.m32797g(outcome, "outcome");
        C19383o.m32797g(eventCode, ResponseConstants.CODE);
        C19383o.m32797g(stateName, "stateName");
        C19383o.m32797g(instrumentationEventBuilder, "instrumentationEventBuilder");
        v$default("InstrumentationTr", "scroll " + transitionName + " " + outcome, 0, 4, (Object) null);
        instrumentationEventBuilder.eventType(PEnums.EventType.SC).transitionName(transitionName).intErrorCode(eventCode.getInternalCodeString()).extErrorCode(eventCode.getExternalCodeString()).stateName(stateName).infoMessage(str).parentName(str2).childName(str3);
        INSTANCE.submitInstrumentationEvent(instrumentationEventBuilder.build());
    }

    public static /* synthetic */ void scroll$default(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, String str2, String str3, InstrumentationEvent.InstrumentationEventBuilder instrumentationEventBuilder, int i, Object obj) {
        int i2 = i;
        scroll(transitionName, outcome, eventCode, stateName, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? new InstrumentationEvent.InstrumentationEventBuilder((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 536870911, (DefaultConstructorMarker) null) : instrumentationEventBuilder);
    }

    public static final void status(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, InstrumentationEvent.InstrumentationEventBuilder instrumentationEventBuilder) {
        C19383o.m32797g(outcome, "outcome");
        C19383o.m32797g(stateName, "stateName");
        C19383o.m32797g(instrumentationEventBuilder, "instrumentationEventBuilder");
        InstrumentationEvent.InstrumentationEventBuilder outcome2 = instrumentationEventBuilder.eventType(PEnums.EventType.STATUS).transitionName(transitionName).outcome(outcome);
        String str2 = null;
        InstrumentationEvent.InstrumentationEventBuilder intErrorCode = outcome2.intErrorCode(eventCode == null ? null : eventCode.getInternalCodeString());
        if (eventCode != null) {
            str2 = eventCode.getExternalCodeString();
        }
        intErrorCode.extErrorCode(str2).stateName(stateName).infoMessage(str);
        INSTANCE.submitInstrumentationEvent(instrumentationEventBuilder.build());
    }

    public static /* synthetic */ void status$default(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, InstrumentationEvent.InstrumentationEventBuilder instrumentationEventBuilder, int i, Object obj) {
        status(transitionName, outcome, (i & 4) != 0 ? null : eventCode, stateName, (i & 16) != 0 ? null : str, (i & 32) != 0 ? new InstrumentationEvent.InstrumentationEventBuilder((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 536870911, (DefaultConstructorMarker) null) : instrumentationEventBuilder);
    }

    public static final void transition(PEnums.TransitionName transitionName, PEnums.Outcome outcome) {
        PEnums.TransitionName transitionName2 = transitionName;
        C19383o.m32797g(transitionName2, "transitionName");
        PEnums.Outcome outcome2 = outcome;
        C19383o.m32797g(outcome2, "outcome");
        transition$default(transitionName2, outcome2, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16380, (Object) null);
    }

    public static final void transition(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode) {
        PEnums.TransitionName transitionName2 = transitionName;
        C19383o.m32797g(transitionName2, "transitionName");
        PEnums.Outcome outcome2 = outcome;
        C19383o.m32797g(outcome2, "outcome");
        transition$default(transitionName2, outcome2, eventCode, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16376, (Object) null);
    }

    public static final void transition(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName) {
        PEnums.TransitionName transitionName2 = transitionName;
        C19383o.m32797g(transitionName2, "transitionName");
        PEnums.Outcome outcome2 = outcome;
        C19383o.m32797g(outcome2, "outcome");
        transition$default(transitionName2, outcome2, eventCode, stateName, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16368, (Object) null);
    }

    public static final void transition(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str) {
        PEnums.TransitionName transitionName2 = transitionName;
        C19383o.m32797g(transitionName2, "transitionName");
        PEnums.Outcome outcome2 = outcome;
        C19383o.m32797g(outcome2, "outcome");
        transition$default(transitionName2, outcome2, eventCode, stateName, str, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16352, (Object) null);
    }

    public static final void transition(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, PEnums.FallbackReason fallbackReason) {
        PEnums.TransitionName transitionName2 = transitionName;
        C19383o.m32797g(transitionName2, "transitionName");
        PEnums.Outcome outcome2 = outcome;
        C19383o.m32797g(outcome2, "outcome");
        transition$default(transitionName2, outcome2, eventCode, stateName, str, fallbackReason, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16320, (Object) null);
    }

    public static final void transition(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory) {
        PEnums.TransitionName transitionName2 = transitionName;
        C19383o.m32797g(transitionName2, "transitionName");
        PEnums.Outcome outcome2 = outcome;
        C19383o.m32797g(outcome2, "outcome");
        transition$default(transitionName2, outcome2, eventCode, stateName, str, fallbackReason, fallbackCategory, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16256, (Object) null);
    }

    public static final void transition(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory, String str2) {
        PEnums.TransitionName transitionName2 = transitionName;
        C19383o.m32797g(transitionName2, "transitionName");
        PEnums.Outcome outcome2 = outcome;
        C19383o.m32797g(outcome2, "outcome");
        transition$default(transitionName2, outcome2, eventCode, stateName, str, fallbackReason, fallbackCategory, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16128, (Object) null);
    }

    public static final void transition(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory, String str2, String str3) {
        PEnums.TransitionName transitionName2 = transitionName;
        C19383o.m32797g(transitionName2, "transitionName");
        PEnums.Outcome outcome2 = outcome;
        C19383o.m32797g(outcome2, "outcome");
        transition$default(transitionName2, outcome2, eventCode, stateName, str, fallbackReason, fallbackCategory, str2, str3, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 15872, (Object) null);
    }

    public static final void transition(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory, String str2, String str3, String str4) {
        PEnums.TransitionName transitionName2 = transitionName;
        C19383o.m32797g(transitionName2, "transitionName");
        PEnums.Outcome outcome2 = outcome;
        C19383o.m32797g(outcome2, "outcome");
        transition$default(transitionName2, outcome2, eventCode, stateName, str, fallbackReason, fallbackCategory, str2, str3, str4, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 15360, (Object) null);
    }

    public static final void transition(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory, String str2, String str3, String str4, String str5) {
        PEnums.TransitionName transitionName2 = transitionName;
        C19383o.m32797g(transitionName2, "transitionName");
        PEnums.Outcome outcome2 = outcome;
        C19383o.m32797g(outcome2, "outcome");
        transition$default(transitionName2, outcome2, eventCode, stateName, str, fallbackReason, fallbackCategory, str2, str3, str4, str5, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 14336, (Object) null);
    }

    public static final void transition(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory, String str2, String str3, String str4, String str5, String str6) {
        PEnums.TransitionName transitionName2 = transitionName;
        C19383o.m32797g(transitionName2, "transitionName");
        PEnums.Outcome outcome2 = outcome;
        C19383o.m32797g(outcome2, "outcome");
        transition$default(transitionName2, outcome2, eventCode, stateName, str, fallbackReason, fallbackCategory, str2, str3, str4, str5, str6, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 12288, (Object) null);
    }

    public static final void transition(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory, String str2, String str3, String str4, String str5, String str6, String str7) {
        PEnums.TransitionName transitionName2 = transitionName;
        C19383o.m32797g(transitionName2, "transitionName");
        PEnums.Outcome outcome2 = outcome;
        C19383o.m32797g(outcome2, "outcome");
        transition$default(transitionName2, outcome2, eventCode, stateName, str, fallbackReason, fallbackCategory, str2, str3, str4, str5, str6, str7, (InstrumentationEvent.InstrumentationEventBuilder) null, 8192, (Object) null);
    }

    public static final void transition(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory, String str2, String str3, String str4, String str5, String str6, String str7, InstrumentationEvent.InstrumentationEventBuilder instrumentationEventBuilder) {
        PEnums.TransitionName transitionName2 = transitionName;
        PEnums.Outcome outcome2 = outcome;
        InstrumentationEvent.InstrumentationEventBuilder instrumentationEventBuilder2 = instrumentationEventBuilder;
        C19383o.m32797g(transitionName, "transitionName");
        C19383o.m32797g(outcome, "outcome");
        C19383o.m32797g(instrumentationEventBuilder2, "instrumentationEventBuilder");
        String str8 = null;
        v$default("InstrumentationTr", "transition " + transitionName + " " + outcome, 0, 4, (Object) null);
        InstrumentationEvent.InstrumentationEventBuilder intErrorCode = instrumentationEventBuilder2.eventType(PEnums.EventType.TR).transitionName(transitionName).outcome(outcome).intErrorCode(eventCode == null ? null : eventCode.getInternalCodeString());
        if (eventCode != null) {
            str8 = eventCode.getExternalCodeString();
        }
        PEnums.StateName stateName2 = stateName;
        String str9 = str;
        PEnums.FallbackReason fallbackReason2 = fallbackReason;
        PEnums.FallbackCategory fallbackCategory2 = fallbackCategory;
        intErrorCode.extErrorCode(str8).stateName(stateName).fallBackFrom(str).fallBackReason(fallbackReason).fallBackCategory(fallbackCategory).originScreen(str2).destinationScreen(str3).payloadSent(str4).infoMessage(str5).fieldName(str6).correlationId(str7);
        INSTANCE.submitInstrumentationEvent(instrumentationEventBuilder.build());
        CheckoutCrashLogger instance = CrashLogger.getInstance();
        if (instance != null) {
            instance.addBreadcrumb("instrumentation transition " + transitionName + " " + outcome);
        }
    }

    public static /* synthetic */ void transition$default(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory, String str2, String str3, String str4, String str5, String str6, String str7, InstrumentationEvent.InstrumentationEventBuilder instrumentationEventBuilder, int i, Object obj) {
        int i2 = i;
        String str8 = null;
        PEnums.EventCode eventCode2 = (i2 & 4) != 0 ? null : eventCode;
        PEnums.StateName stateName2 = (i2 & 8) != 0 ? null : stateName;
        String str9 = (i2 & 16) != 0 ? null : str;
        PEnums.FallbackReason fallbackReason2 = (i2 & 32) != 0 ? null : fallbackReason;
        PEnums.FallbackCategory fallbackCategory2 = (i2 & 64) != 0 ? null : fallbackCategory;
        String str10 = (i2 & 128) != 0 ? null : str2;
        String str11 = (i2 & 256) != 0 ? null : str3;
        String str12 = (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? null : str4;
        String str13 = (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? null : str5;
        String str14 = (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? null : str6;
        if ((i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            str8 = str7;
        }
        transition(transitionName, outcome, eventCode2, stateName2, str9, fallbackReason2, fallbackCategory2, str10, str11, str12, str13, str14, str8, (i2 & 8192) != 0 ? new InstrumentationEvent.InstrumentationEventBuilder((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 536870911, (DefaultConstructorMarker) null) : instrumentationEventBuilder);
    }

    /* renamed from: v */
    public static final void m28737v(String str, String str2) {
        C19383o.m32797g(str, "tag");
        v$default(str, str2, 0, 4, (Object) null);
    }

    /* renamed from: v */
    public static final void m28738v(String str, String str2, int i) {
        C19383o.m32797g(str, "tag");
        if (i == 1000) {
            DebugConfigManager.getInstance().isDebug();
        }
    }

    public static /* synthetic */ void v$default(String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 1000;
        }
        m28738v(str, str2, i);
    }

    /* renamed from: vR */
    public static final void m28739vR(String str, String str2) {
        C19383o.m32797g(str, "tag");
        m28738v(str, str2, 1001);
    }

    /* renamed from: w */
    public static final void m28740w(String str, String str2) {
        C19383o.m32797g(str, "tag");
        w$default(str, str2, 0, 4, (Object) null);
    }

    /* renamed from: w */
    public static final void m28741w(String str, String str2, int i) {
        C19383o.m32797g(str, "tag");
        if ((i == 1000 && DebugConfigManager.getInstance().isDebug()) || i == 1001) {
            String i2 = C0326j.m864i("nxo", str);
            if (str2 == null) {
                str2 = "no log";
            }
            Log.w(i2, str2);
        }
    }

    public static /* synthetic */ void w$default(String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 1000;
        }
        m28741w(str, str2, i);
    }

    /* renamed from: wR */
    public static final void m28742wR(String str, String str2) {
        C19383o.m32797g(str, "tag");
        m28741w(str, str2, 1001);
    }

    public final String getStackValues(Throwable th) {
        String methodName;
        String className;
        if (th == null) {
            return "NO_EXCEPTION_DATA";
        }
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = th.getStackTrace();
        C19383o.m32796f(stackTrace, "e.stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) C19318k.m32613e1(stackTrace);
        sb.append(th.getClass().getSimpleName());
        sb.append(": ");
        String str = "NULL_CLASS_NAME";
        if (!(stackTraceElement == null || (className = stackTraceElement.getClassName()) == null)) {
            str = className;
        }
        sb.append(str);
        sb.append("::");
        String str2 = "NULL_EMPTY_NAME";
        if (!(stackTraceElement == null || (methodName = stackTraceElement.getMethodName()) == null)) {
            str2 = methodName;
        }
        sb.append(str2);
        sb.append("::");
        sb.append(stackTraceElement == null ? "NULL_LINE_NUMBER" : Integer.valueOf(stackTraceElement.getLineNumber()));
        sb.append(" msg: ");
        String message = th.getMessage();
        if (message == null) {
            message = "NULL_MESSAGE";
        }
        sb.append(message);
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "builder.toString()");
        return sb2;
    }

    public final String getTAG() {
        return TAG;
    }

    public final void submitInstrumentationEvent(InstrumentationEvent instrumentationEvent) {
        try {
            String j = new C16708i().mo59463j(instrumentationEvent);
            String str = TAG;
            C19383o.m32796f(str, "TAG");
            String str2 = null;
            boolean z = false;
            v$default(str, "instrumenting: " + j, 0, 4, (Object) null);
            JSONObject jSONObject = new JSONObject(j);
            if (instrumentationEvent != null) {
                str2 = instrumentationEvent.getTransition_name();
            }
            if (str2 != null) {
                if (str2.length() > 0) {
                    z = true;
                }
                if (z) {
                    SdkComponent.Companion.getInstance().getAmplitudeManager().getLogger().logEvent(str2, jSONObject);
                    Events.Companion.getInstance().fire(ExtendedPayPalEventTypes.INSTRUMENTATION_SENT, new Success(instrumentationEvent));
                    track(jSONObject);
                }
            }
            str2 = "empty_transition_name";
            SdkComponent.Companion.getInstance().getAmplitudeManager().getLogger().logEvent(str2, jSONObject);
            Events.Companion.getInstance().fire(ExtendedPayPalEventTypes.INSTRUMENTATION_SENT, new Success(instrumentationEvent));
            track(jSONObject);
        } catch (Exception e) {
            String str3 = TAG;
            C19383o.m32796f(str3, "TAG");
            m28733eR(str3, "Unable to send instrumentation", e);
            CheckoutCrashLogger instance = CrashLogger.getInstance();
            if (instance != null) {
                instance.logException(e);
            }
        }
    }

    public final void track(JSONObject jSONObject) {
        C19383o.m32797g(jSONObject, "payload");
        BeaverLogger.track$default(BeaverLogger.INSTANCE, jSONObject, (LogApi) null, 2, (Object) null);
        String str = TAG;
        C19383o.m32796f(str, "TAG");
        d$default(str, "payload sent " + jSONObject, 0, 4, (Object) null);
    }

    public static final void info(String str) {
        C19383o.m32797g(str, "eventType");
        JSONObject fetchPayload = PYPL_FPTI.getInstance().fetchPayload(str);
        if (fetchPayload != null) {
            BeaverLogger.info$default(BeaverLogger.INSTANCE, CAL_EVENT, fetchPayload, (LogApi) null, 4, (Object) null);
        }
    }
}
