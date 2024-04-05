package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class FirebaseResponse {
    @C18417a("auth")
    private final FirebaseAuth auth;

    public FirebaseResponse(FirebaseAuth firebaseAuth) {
        this.auth = firebaseAuth;
    }

    public static /* synthetic */ FirebaseResponse copy$default(FirebaseResponse firebaseResponse, FirebaseAuth firebaseAuth, int i, Object obj) {
        if ((i & 1) != 0) {
            firebaseAuth = firebaseResponse.auth;
        }
        return firebaseResponse.copy(firebaseAuth);
    }

    public final FirebaseAuth component1() {
        return this.auth;
    }

    public final FirebaseResponse copy(FirebaseAuth firebaseAuth) {
        return new FirebaseResponse(firebaseAuth);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FirebaseResponse) && C19383o.m32792b(this.auth, ((FirebaseResponse) obj).auth);
    }

    public final FirebaseAuth getAuth() {
        return this.auth;
    }

    public int hashCode() {
        FirebaseAuth firebaseAuth = this.auth;
        if (firebaseAuth == null) {
            return 0;
        }
        return firebaseAuth.hashCode();
    }

    public String toString() {
        FirebaseAuth firebaseAuth = this.auth;
        return "FirebaseResponse(auth=" + firebaseAuth + ")";
    }
}
