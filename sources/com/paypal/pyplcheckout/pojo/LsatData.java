package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class LsatData {
    @C18417a("upgradeLowScopeAccessToken")
    private final Boolean isTokenUpgraded;

    public LsatData(Boolean bool) {
        this.isTokenUpgraded = bool;
    }

    public static /* synthetic */ LsatData copy$default(LsatData lsatData, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = lsatData.isTokenUpgraded;
        }
        return lsatData.copy(bool);
    }

    public final Boolean component1() {
        return this.isTokenUpgraded;
    }

    public final LsatData copy(Boolean bool) {
        return new LsatData(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LsatData) && C19383o.m32792b(this.isTokenUpgraded, ((LsatData) obj).isTokenUpgraded);
    }

    public int hashCode() {
        Boolean bool = this.isTokenUpgraded;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final Boolean isTokenUpgraded() {
        return this.isTokenUpgraded;
    }

    public String toString() {
        Boolean bool = this.isTokenUpgraded;
        return "LsatData(isTokenUpgraded=" + bool + ")";
    }
}
