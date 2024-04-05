package com.paypal.android.platform.authsdk.authinterface;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;

@Keep
public final class ConfirmEmailResult {
    private final String email;

    public ConfirmEmailResult(String str) {
        C19383o.m32797g(str, "email");
        this.email = str;
    }

    public static /* synthetic */ ConfirmEmailResult copy$default(ConfirmEmailResult confirmEmailResult, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confirmEmailResult.email;
        }
        return confirmEmailResult.copy(str);
    }

    public final String component1() {
        return this.email;
    }

    public final ConfirmEmailResult copy(String str) {
        C19383o.m32797g(str, "email");
        return new ConfirmEmailResult(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConfirmEmailResult) && C19383o.m32792b(this.email, ((ConfirmEmailResult) obj).email);
    }

    public final String getEmail() {
        return this.email;
    }

    public int hashCode() {
        return this.email.hashCode();
    }

    public String toString() {
        return C0048b.m163a("ConfirmEmailResult(email=", this.email, ")");
    }
}
