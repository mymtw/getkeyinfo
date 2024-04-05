package com.paypal.pyplcheckout.common.instrumentation;

public final class AmplitudeApiKt {
    private static final String AMPLITUDE_URL = "https://api2.amplitude.com/2/httpapi";
    private static final long ATTEMPT_DELAY = 1000;
    private static final int MAX_ATTEMPTS = 3;
    private static final int MAX_PROPERTY_KEYS = 1000;
    private static final int MAX_STRING_LENGTH = 1024;
}
