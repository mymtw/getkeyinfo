package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;
import p650pn.C18417a;

public final class NeedConsentForBankAccountInfoRetrieval {
    @C18417a("encryptedId")
    private final String encryptedId;

    public NeedConsentForBankAccountInfoRetrieval(String str) {
        this.encryptedId = str;
    }

    public static /* synthetic */ NeedConsentForBankAccountInfoRetrieval copy$default(NeedConsentForBankAccountInfoRetrieval needConsentForBankAccountInfoRetrieval, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = needConsentForBankAccountInfoRetrieval.encryptedId;
        }
        return needConsentForBankAccountInfoRetrieval.copy(str);
    }

    public final String component1() {
        return this.encryptedId;
    }

    public final NeedConsentForBankAccountInfoRetrieval copy(String str) {
        return new NeedConsentForBankAccountInfoRetrieval(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NeedConsentForBankAccountInfoRetrieval) && C19383o.m32792b(this.encryptedId, ((NeedConsentForBankAccountInfoRetrieval) obj).encryptedId);
    }

    public final String getEncryptedId() {
        return this.encryptedId;
    }

    public int hashCode() {
        String str = this.encryptedId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return C0048b.m163a("NeedConsentForBankAccountInfoRetrieval(encryptedId=", this.encryptedId, ")");
    }
}
