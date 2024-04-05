package com.paypal.pyplcheckout.common.instrumentation.amplitude.models;

import java.util.List;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class AmplitudeUploadRequest {
    @C18417a("api_key")
    private final String apiKey;
    @C18417a("events")
    private final List<AmplitudeEvent> events;

    public AmplitudeUploadRequest(String str, List<AmplitudeEvent> list) {
        C19383o.m32797g(str, "apiKey");
        C19383o.m32797g(list, "events");
        this.apiKey = str;
        this.events = list;
    }

    public static /* synthetic */ AmplitudeUploadRequest copy$default(AmplitudeUploadRequest amplitudeUploadRequest, String str, List<AmplitudeEvent> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = amplitudeUploadRequest.apiKey;
        }
        if ((i & 2) != 0) {
            list = amplitudeUploadRequest.events;
        }
        return amplitudeUploadRequest.copy(str, list);
    }

    public final String component1() {
        return this.apiKey;
    }

    public final List<AmplitudeEvent> component2() {
        return this.events;
    }

    public final AmplitudeUploadRequest copy(String str, List<AmplitudeEvent> list) {
        C19383o.m32797g(str, "apiKey");
        C19383o.m32797g(list, "events");
        return new AmplitudeUploadRequest(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AmplitudeUploadRequest)) {
            return false;
        }
        AmplitudeUploadRequest amplitudeUploadRequest = (AmplitudeUploadRequest) obj;
        return C19383o.m32792b(this.apiKey, amplitudeUploadRequest.apiKey) && C19383o.m32792b(this.events, amplitudeUploadRequest.events);
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final List<AmplitudeEvent> getEvents() {
        return this.events;
    }

    public int hashCode() {
        return this.events.hashCode() + (this.apiKey.hashCode() * 31);
    }

    public String toString() {
        String str = this.apiKey;
        List<AmplitudeEvent> list = this.events;
        return "AmplitudeUploadRequest(apiKey=" + str + ", events=" + list + ")";
    }
}
