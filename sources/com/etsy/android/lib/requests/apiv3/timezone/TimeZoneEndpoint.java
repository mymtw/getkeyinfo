package com.etsy.android.lib.requests.apiv3.timezone;

import p248tp.C8071s;
import p771sr.C20178a;
import p771sr.C20192o;
import retrofit2.C20145v;

public interface TimeZoneEndpoint {
    @C20192o("/etsyapps/v3/member/push/update-timezone")
    C8071s<C20145v<Void>> updateTimeZone(@C20178a TimeZoneUpdateRequest timeZoneUpdateRequest);
}
