package com.paypal.pyplcheckout.common.instrumentation;

import com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent;
import java.io.IOException;
import kotlin.jvm.internal.C19383o;

public class AmplitudeApiException extends IOException {
    private final AmplitudeEvent event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AmplitudeApiException(Exception exc, AmplitudeEvent amplitudeEvent) {
        super(exc);
        C19383o.m32797g(exc, "cause");
        C19383o.m32797g(amplitudeEvent, "event");
        this.event = amplitudeEvent;
    }

    public final AmplitudeEvent getEvent() {
        return this.event;
    }
}
