package com.paypal.pyplcheckout.threeds.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ThreeDSTopBanner {
    private final boolean hasExtraFI;

    public ThreeDSTopBanner() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public ThreeDSTopBanner(boolean z) {
        this.hasExtraFI = z;
    }

    public static /* synthetic */ ThreeDSTopBanner copy$default(ThreeDSTopBanner threeDSTopBanner, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = threeDSTopBanner.hasExtraFI;
        }
        return threeDSTopBanner.copy(z);
    }

    public final boolean component1() {
        return this.hasExtraFI;
    }

    public final ThreeDSTopBanner copy(boolean z) {
        return new ThreeDSTopBanner(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThreeDSTopBanner) && this.hasExtraFI == ((ThreeDSTopBanner) obj).hasExtraFI;
    }

    public final boolean getHasExtraFI() {
        return this.hasExtraFI;
    }

    public int hashCode() {
        boolean z = this.hasExtraFI;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.hasExtraFI;
        return "ThreeDSTopBanner(hasExtraFI=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThreeDSTopBanner(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
