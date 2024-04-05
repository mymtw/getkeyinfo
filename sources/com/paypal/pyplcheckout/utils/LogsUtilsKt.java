package com.paypal.pyplcheckout.utils;

import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;

public final class LogsUtilsKt {
    public static final void logCacheError(String str, String str2, Exception exc) {
        String str3 = str;
        String str4 = str2;
        C19383o.m32797g(str3, ResponseConstants.FROM);
        C19383o.m32797g(str4, "field");
        Exception exc2 = exc;
        C19383o.m32797g(exc2, "cause");
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E000, C0048b.m163a(exc.getClass().getSimpleName(), ": ", exc.getMessage()), (String) null, exc2, PEnums.TransitionName.CACHE, (PEnums.StateName) null, C0048b.m164c(str3, " cache error on ", str4, ": ", exc.getClass().getSimpleName()), (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1864, (Object) null);
    }
}
