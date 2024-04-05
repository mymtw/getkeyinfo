package com.paypal.pyplcheckout.addshipping.model;

import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p010a9.C0048b;

public final class AddressAutoCompletePlaceIdRequest {
    private final String language;
    private final String placeId;
    private final String region;

    public AddressAutoCompletePlaceIdRequest(String str, String str2, String str3) {
        C0048b.m167f(str, "language", str2, "placeId", str3, "region");
        this.language = str;
        this.placeId = str2;
        this.region = str3;
    }

    public static /* synthetic */ AddressAutoCompletePlaceIdRequest copy$default(AddressAutoCompletePlaceIdRequest addressAutoCompletePlaceIdRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressAutoCompletePlaceIdRequest.language;
        }
        if ((i & 2) != 0) {
            str2 = addressAutoCompletePlaceIdRequest.placeId;
        }
        if ((i & 4) != 0) {
            str3 = addressAutoCompletePlaceIdRequest.region;
        }
        return addressAutoCompletePlaceIdRequest.copy(str, str2, str3);
    }

    public final String component1() {
        return this.language;
    }

    public final String component2() {
        return this.placeId;
    }

    public final String component3() {
        return this.region;
    }

    public final AddressAutoCompletePlaceIdRequest copy(String str, String str2, String str3) {
        C19383o.m32797g(str, "language");
        C19383o.m32797g(str2, "placeId");
        C19383o.m32797g(str3, "region");
        return new AddressAutoCompletePlaceIdRequest(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressAutoCompletePlaceIdRequest)) {
            return false;
        }
        AddressAutoCompletePlaceIdRequest addressAutoCompletePlaceIdRequest = (AddressAutoCompletePlaceIdRequest) obj;
        return C19383o.m32792b(this.language, addressAutoCompletePlaceIdRequest.language) && C19383o.m32792b(this.placeId, addressAutoCompletePlaceIdRequest.placeId) && C19383o.m32792b(this.region, addressAutoCompletePlaceIdRequest.region);
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getPlaceId() {
        return this.placeId;
    }

    public final String getRegion() {
        return this.region;
    }

    public int hashCode() {
        return this.region.hashCode() + C0023f.m105e(this.placeId, this.language.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.language;
        String str2 = this.placeId;
        return C0023f.m110k(C0388a.m1050f("AddressAutoCompletePlaceIdRequest(language=", str, ", placeId=", str2, ", region="), this.region, ")");
    }
}
