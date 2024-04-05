package com.paypal.checkout.order;

import androidx.compose.animation.C0388a;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p650pn.C18417a;

public final class Capture {
    private final UnitAmount amount;
    @C18417a("final_capture")
    private final boolean finalCapture;

    /* renamed from: id */
    private final String f37515id;
    @C18417a("seller_protection")
    private final SellerProtection sellerProtection;
    private final String status;

    public Capture(String str, String str2, UnitAmount unitAmount, boolean z, SellerProtection sellerProtection2) {
        C19383o.m32797g(str, "id");
        C19383o.m32797g(str2, ResponseConstants.STATUS);
        C19383o.m32797g(unitAmount, ResponseConstants.AMOUNT);
        C19383o.m32797g(sellerProtection2, "sellerProtection");
        this.f37515id = str;
        this.status = str2;
        this.amount = unitAmount;
        this.finalCapture = z;
        this.sellerProtection = sellerProtection2;
    }

    public static /* synthetic */ Capture copy$default(Capture capture, String str, String str2, UnitAmount unitAmount, boolean z, SellerProtection sellerProtection2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = capture.f37515id;
        }
        if ((i & 2) != 0) {
            str2 = capture.status;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            unitAmount = capture.amount;
        }
        UnitAmount unitAmount2 = unitAmount;
        if ((i & 8) != 0) {
            z = capture.finalCapture;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            sellerProtection2 = capture.sellerProtection;
        }
        return capture.copy(str, str3, unitAmount2, z2, sellerProtection2);
    }

    public final String component1() {
        return this.f37515id;
    }

    public final String component2() {
        return this.status;
    }

    public final UnitAmount component3() {
        return this.amount;
    }

    public final boolean component4() {
        return this.finalCapture;
    }

    public final SellerProtection component5() {
        return this.sellerProtection;
    }

    public final Capture copy(String str, String str2, UnitAmount unitAmount, boolean z, SellerProtection sellerProtection2) {
        C19383o.m32797g(str, "id");
        C19383o.m32797g(str2, ResponseConstants.STATUS);
        C19383o.m32797g(unitAmount, ResponseConstants.AMOUNT);
        C19383o.m32797g(sellerProtection2, "sellerProtection");
        return new Capture(str, str2, unitAmount, z, sellerProtection2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Capture)) {
            return false;
        }
        Capture capture = (Capture) obj;
        return C19383o.m32792b(this.f37515id, capture.f37515id) && C19383o.m32792b(this.status, capture.status) && C19383o.m32792b(this.amount, capture.amount) && this.finalCapture == capture.finalCapture && C19383o.m32792b(this.sellerProtection, capture.sellerProtection);
    }

    public final UnitAmount getAmount() {
        return this.amount;
    }

    public final boolean getFinalCapture() {
        return this.finalCapture;
    }

    public final String getId() {
        return this.f37515id;
    }

    public final SellerProtection getSellerProtection() {
        return this.sellerProtection;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = (this.amount.hashCode() + C0023f.m105e(this.status, this.f37515id.hashCode() * 31, 31)) * 31;
        boolean z = this.finalCapture;
        if (z) {
            z = true;
        }
        return this.sellerProtection.hashCode() + ((hashCode + (z ? 1 : 0)) * 31);
    }

    public String toString() {
        String str = this.f37515id;
        String str2 = this.status;
        UnitAmount unitAmount = this.amount;
        boolean z = this.finalCapture;
        SellerProtection sellerProtection2 = this.sellerProtection;
        StringBuilder f = C0388a.m1050f("Capture(id=", str, ", status=", str2, ", amount=");
        f.append(unitAmount);
        f.append(", finalCapture=");
        f.append(z);
        f.append(", sellerProtection=");
        f.append(sellerProtection2);
        f.append(")");
        return f.toString();
    }
}
