package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;
import p650pn.C18417a;

public final class FirebaseAuth {
    @C18417a("sessionToken")
    private final String sessionToken;
    @C18417a("sessionUID")
    private final String sessionUID;

    public FirebaseAuth(String str, String str2) {
        this.sessionUID = str;
        this.sessionToken = str2;
    }

    public static /* synthetic */ FirebaseAuth copy$default(FirebaseAuth firebaseAuth, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = firebaseAuth.sessionUID;
        }
        if ((i & 2) != 0) {
            str2 = firebaseAuth.sessionToken;
        }
        return firebaseAuth.copy(str, str2);
    }

    public final String component1() {
        return this.sessionUID;
    }

    public final String component2() {
        return this.sessionToken;
    }

    public final FirebaseAuth copy(String str, String str2) {
        return new FirebaseAuth(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirebaseAuth)) {
            return false;
        }
        FirebaseAuth firebaseAuth = (FirebaseAuth) obj;
        return C19383o.m32792b(this.sessionUID, firebaseAuth.sessionUID) && C19383o.m32792b(this.sessionToken, firebaseAuth.sessionToken);
    }

    public final String getSessionToken() {
        return this.sessionToken;
    }

    public final String getSessionUID() {
        return this.sessionUID;
    }

    public int hashCode() {
        String str = this.sessionUID;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sessionToken;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return C0048b.m164c("FirebaseAuth(sessionUID=", this.sessionUID, ", sessionToken=", this.sessionToken, ")");
    }
}
