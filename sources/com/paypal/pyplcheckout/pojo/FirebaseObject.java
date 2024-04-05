package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class FirebaseObject {
    @C18417a("firebase")
    private final FirebaseResponse firebase;

    public FirebaseObject(FirebaseResponse firebaseResponse) {
        this.firebase = firebaseResponse;
    }

    public static /* synthetic */ FirebaseObject copy$default(FirebaseObject firebaseObject, FirebaseResponse firebaseResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            firebaseResponse = firebaseObject.firebase;
        }
        return firebaseObject.copy(firebaseResponse);
    }

    public final FirebaseResponse component1() {
        return this.firebase;
    }

    public final FirebaseObject copy(FirebaseResponse firebaseResponse) {
        return new FirebaseObject(firebaseResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FirebaseObject) && C19383o.m32792b(this.firebase, ((FirebaseObject) obj).firebase);
    }

    public final FirebaseResponse getFirebase() {
        return this.firebase;
    }

    public int hashCode() {
        FirebaseResponse firebaseResponse = this.firebase;
        if (firebaseResponse == null) {
            return 0;
        }
        return firebaseResponse.hashCode();
    }

    public String toString() {
        FirebaseResponse firebaseResponse = this.firebase;
        return "FirebaseObject(firebase=" + firebaseResponse + ")";
    }
}
