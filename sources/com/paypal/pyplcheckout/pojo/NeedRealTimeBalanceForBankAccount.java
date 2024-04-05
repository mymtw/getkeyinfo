package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;
import p650pn.C18417a;

public final class NeedRealTimeBalanceForBankAccount {
    @C18417a("encryptedId")
    private final String encryptedId;

    public NeedRealTimeBalanceForBankAccount(String str) {
        this.encryptedId = str;
    }

    public static /* synthetic */ NeedRealTimeBalanceForBankAccount copy$default(NeedRealTimeBalanceForBankAccount needRealTimeBalanceForBankAccount, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = needRealTimeBalanceForBankAccount.encryptedId;
        }
        return needRealTimeBalanceForBankAccount.copy(str);
    }

    public final String component1() {
        return this.encryptedId;
    }

    public final NeedRealTimeBalanceForBankAccount copy(String str) {
        return new NeedRealTimeBalanceForBankAccount(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NeedRealTimeBalanceForBankAccount) && C19383o.m32792b(this.encryptedId, ((NeedRealTimeBalanceForBankAccount) obj).encryptedId);
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
        return C0048b.m163a("NeedRealTimeBalanceForBankAccount(encryptedId=", this.encryptedId, ")");
    }
}
