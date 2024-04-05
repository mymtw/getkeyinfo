package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class FirebaseTokenResponse {
    @C18417a("data")
    private final FirebaseObject data;

    public FirebaseTokenResponse(FirebaseObject firebaseObject) {
        this.data = firebaseObject;
    }

    public static /* synthetic */ FirebaseTokenResponse copy$default(FirebaseTokenResponse firebaseTokenResponse, FirebaseObject firebaseObject, int i, Object obj) {
        if ((i & 1) != 0) {
            firebaseObject = firebaseTokenResponse.data;
        }
        return firebaseTokenResponse.copy(firebaseObject);
    }

    public final FirebaseObject component1() {
        return this.data;
    }

    public final FirebaseTokenResponse copy(FirebaseObject firebaseObject) {
        return new FirebaseTokenResponse(firebaseObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FirebaseTokenResponse) && C19383o.m32792b(this.data, ((FirebaseTokenResponse) obj).data);
    }

    public final FirebaseObject getData() {
        return this.data;
    }

    public int hashCode() {
        FirebaseObject firebaseObject = this.data;
        if (firebaseObject == null) {
            return 0;
        }
        return firebaseObject.hashCode();
    }

    public String toString() {
        FirebaseObject firebaseObject = this.data;
        return "FirebaseTokenResponse(data=" + firebaseObject + ")";
    }
}
