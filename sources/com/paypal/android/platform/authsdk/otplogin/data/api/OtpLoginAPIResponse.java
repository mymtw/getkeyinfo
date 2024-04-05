package com.paypal.android.platform.authsdk.otplogin.data.api;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;
import p650pn.C18417a;

@Keep
public final class OtpLoginAPIResponse {
    @C18417a("result")
    private final Object result;

    public OtpLoginAPIResponse() {
        this((Object) null, 1, (DefaultConstructorMarker) null);
    }

    public OtpLoginAPIResponse(Object obj) {
        this.result = obj;
    }

    public static /* synthetic */ OtpLoginAPIResponse copy$default(OtpLoginAPIResponse otpLoginAPIResponse, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = otpLoginAPIResponse.result;
        }
        return otpLoginAPIResponse.copy(obj);
    }

    public final Object component1() {
        return this.result;
    }

    public final OtpLoginAPIResponse copy(Object obj) {
        return new OtpLoginAPIResponse(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OtpLoginAPIResponse) && C19383o.m32792b(this.result, ((OtpLoginAPIResponse) obj).result);
    }

    public final Object getResult() {
        return this.result;
    }

    public int hashCode() {
        Object obj = this.result;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return C13983i.m21494m("OtpLoginAPIResponse(result=", this.result, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OtpLoginAPIResponse(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj);
    }
}
