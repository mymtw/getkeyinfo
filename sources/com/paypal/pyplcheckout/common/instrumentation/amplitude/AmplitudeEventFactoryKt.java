package com.paypal.pyplcheckout.common.instrumentation.amplitude;

import com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.models.UserProperties;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;

public final class AmplitudeEventFactoryKt {
    public static final AmplitudeEvent createAmplitudeEvent(String str) {
        C19383o.m32797g(str, "eventType");
        long currentTimeMillis = System.currentTimeMillis();
        String uuid = UUID.randomUUID().toString();
        String uuid2 = UUID.randomUUID().toString();
        long currentTimeMillis2 = System.currentTimeMillis();
        Map p0 = C19294b0.m32559p0();
        String uuid3 = UUID.randomUUID().toString();
        C19383o.m32796f(uuid2, "toString()");
        C19383o.m32796f(uuid3, "toString()");
        return new AmplitudeEvent(str, currentTimeMillis, uuid, uuid2, currentTimeMillis2, "1.0", "Android", "10.0", 23, "Test Co.", "Testers", "Test", "Testphone", UserStateKt.US_COUNTRY, "EN", "Android", p0, (UserProperties) null, uuid3);
    }

    public static /* synthetic */ AmplitudeEvent createAmplitudeEvent$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "test_event";
        }
        return createAmplitudeEvent(str);
    }
}
