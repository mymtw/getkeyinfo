package com.paypal.android.platform.authsdk.otplogin.domain;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;
import p650pn.C18417a;

@Keep
public final class OtpFailureResponse {
    @C18417a("metadata")
    private Metadata metadata;
    @C18417a("objectType")
    private String objectType;
    @C18417a("result")
    private Result result;

    public OtpFailureResponse() {
        this((Result) null, (Metadata) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public OtpFailureResponse(Result result2, Metadata metadata2, String str) {
        this.result = result2;
        this.metadata = metadata2;
        this.objectType = str;
    }

    public static /* synthetic */ OtpFailureResponse copy$default(OtpFailureResponse otpFailureResponse, Result result2, Metadata metadata2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            result2 = otpFailureResponse.result;
        }
        if ((i & 2) != 0) {
            metadata2 = otpFailureResponse.metadata;
        }
        if ((i & 4) != 0) {
            str = otpFailureResponse.objectType;
        }
        return otpFailureResponse.copy(result2, metadata2, str);
    }

    public final Result component1() {
        return this.result;
    }

    public final Metadata component2() {
        return this.metadata;
    }

    public final String component3() {
        return this.objectType;
    }

    public final OtpFailureResponse copy(Result result2, Metadata metadata2, String str) {
        return new OtpFailureResponse(result2, metadata2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtpFailureResponse)) {
            return false;
        }
        OtpFailureResponse otpFailureResponse = (OtpFailureResponse) obj;
        return C19383o.m32792b(this.result, otpFailureResponse.result) && C19383o.m32792b(this.metadata, otpFailureResponse.metadata) && C19383o.m32792b(this.objectType, otpFailureResponse.objectType);
    }

    public final Metadata getMetadata() {
        return this.metadata;
    }

    public final String getObjectType() {
        return this.objectType;
    }

    public final Result getResult() {
        return this.result;
    }

    public int hashCode() {
        Result result2 = this.result;
        int i = 0;
        int hashCode = (result2 == null ? 0 : result2.hashCode()) * 31;
        Metadata metadata2 = this.metadata;
        int hashCode2 = (hashCode + (metadata2 == null ? 0 : metadata2.hashCode())) * 31;
        String str = this.objectType;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final void setMetadata(Metadata metadata2) {
        this.metadata = metadata2;
    }

    public final void setObjectType(String str) {
        this.objectType = str;
    }

    public final void setResult(Result result2) {
        this.result = result2;
    }

    public String toString() {
        Result result2 = this.result;
        Metadata metadata2 = this.metadata;
        String str = this.objectType;
        StringBuilder sb = new StringBuilder();
        sb.append("OtpFailureResponse(result=");
        sb.append(result2);
        sb.append(", metadata=");
        sb.append(metadata2);
        sb.append(", objectType=");
        return C0023f.m110k(sb, str, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OtpFailureResponse(Result result2, Metadata metadata2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Result((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null) : result2, (i & 2) != 0 ? new Metadata((Integer) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : metadata2, (i & 4) != 0 ? null : str);
    }
}
