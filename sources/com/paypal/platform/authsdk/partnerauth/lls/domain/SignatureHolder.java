package com.paypal.platform.authsdk.partnerauth.lls.domain;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p010a9.C0048b;

@Keep
public final class SignatureHolder {
    private final String codeChallenge;
    private final String nonce;

    public SignatureHolder() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public SignatureHolder(String str, String str2) {
        this.nonce = str;
        this.codeChallenge = str2;
    }

    public static /* synthetic */ SignatureHolder copy$default(SignatureHolder signatureHolder, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signatureHolder.nonce;
        }
        if ((i & 2) != 0) {
            str2 = signatureHolder.codeChallenge;
        }
        return signatureHolder.copy(str, str2);
    }

    public final String component1() {
        return this.nonce;
    }

    public final String component2() {
        return this.codeChallenge;
    }

    public final SignatureHolder copy(String str, String str2) {
        return new SignatureHolder(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignatureHolder)) {
            return false;
        }
        SignatureHolder signatureHolder = (SignatureHolder) obj;
        return C19383o.m32792b(this.nonce, signatureHolder.nonce) && C19383o.m32792b(this.codeChallenge, signatureHolder.codeChallenge);
    }

    public final String getCodeChallenge() {
        return this.codeChallenge;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public int hashCode() {
        String str = this.nonce;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.codeChallenge;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return C0048b.m164c("SignatureHolder(nonce=", this.nonce, ", codeChallenge=", this.codeChallenge, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SignatureHolder(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
