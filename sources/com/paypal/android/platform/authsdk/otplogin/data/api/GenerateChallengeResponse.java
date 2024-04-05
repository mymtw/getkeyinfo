package com.paypal.android.platform.authsdk.otplogin.data.api;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;
import p650pn.C18417a;

@Keep
public final class GenerateChallengeResponse {
    @C18417a("result")
    private final Object result;

    public GenerateChallengeResponse() {
        this((Object) null, 1, (DefaultConstructorMarker) null);
    }

    public GenerateChallengeResponse(Object obj) {
        this.result = obj;
    }

    public static /* synthetic */ GenerateChallengeResponse copy$default(GenerateChallengeResponse generateChallengeResponse, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = generateChallengeResponse.result;
        }
        return generateChallengeResponse.copy(obj);
    }

    public final Object component1() {
        return this.result;
    }

    public final GenerateChallengeResponse copy(Object obj) {
        return new GenerateChallengeResponse(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenerateChallengeResponse) && C19383o.m32792b(this.result, ((GenerateChallengeResponse) obj).result);
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
        return C13983i.m21494m("GenerateChallengeResponse(result=", this.result, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GenerateChallengeResponse(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj);
    }
}
