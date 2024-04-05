package com.paypal.checkout.order;

import androidx.compose.animation.C0388a;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p650pn.C18417a;

public final class Authorization {
    private final UnitAmount amount;

    /* renamed from: id */
    private final String f37514id;
    @C18417a("seller_protection")
    private final SellerProtection sellerProtection;
    private final String status;

    public Authorization(String str, String str2, UnitAmount unitAmount, SellerProtection sellerProtection2) {
        C19383o.m32797g(str, "id");
        C19383o.m32797g(str2, ResponseConstants.STATUS);
        C19383o.m32797g(unitAmount, ResponseConstants.AMOUNT);
        C19383o.m32797g(sellerProtection2, "sellerProtection");
        this.f37514id = str;
        this.status = str2;
        this.amount = unitAmount;
        this.sellerProtection = sellerProtection2;
    }

    public static /* synthetic */ Authorization copy$default(Authorization authorization, String str, String str2, UnitAmount unitAmount, SellerProtection sellerProtection2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authorization.f37514id;
        }
        if ((i & 2) != 0) {
            str2 = authorization.status;
        }
        if ((i & 4) != 0) {
            unitAmount = authorization.amount;
        }
        if ((i & 8) != 0) {
            sellerProtection2 = authorization.sellerProtection;
        }
        return authorization.copy(str, str2, unitAmount, sellerProtection2);
    }

    public final String component1() {
        return this.f37514id;
    }

    public final String component2() {
        return this.status;
    }

    public final UnitAmount component3() {
        return this.amount;
    }

    public final SellerProtection component4() {
        return this.sellerProtection;
    }

    public final Authorization copy(String str, String str2, UnitAmount unitAmount, SellerProtection sellerProtection2) {
        C19383o.m32797g(str, "id");
        C19383o.m32797g(str2, ResponseConstants.STATUS);
        C19383o.m32797g(unitAmount, ResponseConstants.AMOUNT);
        C19383o.m32797g(sellerProtection2, "sellerProtection");
        return new Authorization(str, str2, unitAmount, sellerProtection2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Authorization)) {
            return false;
        }
        Authorization authorization = (Authorization) obj;
        return C19383o.m32792b(this.f37514id, authorization.f37514id) && C19383o.m32792b(this.status, authorization.status) && C19383o.m32792b(this.amount, authorization.amount) && C19383o.m32792b(this.sellerProtection, authorization.sellerProtection);
    }

    public final UnitAmount getAmount() {
        return this.amount;
    }

    public final String getId() {
        return this.f37514id;
    }

    public final SellerProtection getSellerProtection() {
        return this.sellerProtection;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int e = C0023f.m105e(this.status, this.f37514id.hashCode() * 31, 31);
        return this.sellerProtection.hashCode() + ((this.amount.hashCode() + e) * 31);
    }

    public String toString() {
        String str = this.f37514id;
        String str2 = this.status;
        UnitAmount unitAmount = this.amount;
        SellerProtection sellerProtection2 = this.sellerProtection;
        StringBuilder f = C0388a.m1050f("Authorization(id=", str, ", status=", str2, ", amount=");
        f.append(unitAmount);
        f.append(", sellerProtection=");
        f.append(sellerProtection2);
        f.append(")");
        return f.toString();
    }
}
