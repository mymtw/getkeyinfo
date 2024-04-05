package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class PastPurchaseUser {
    public static final int $stable = 8;
    private final String loginName;
    private final PastPurchaseUserProfile profile;
    private final List<PastPurchaseShop> shops;

    public PastPurchaseUser() {
        this((String) null, (PastPurchaseUserProfile) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public PastPurchaseUser(@C17402n(name = "login_name") String str, @C17402n(name = "Profile") PastPurchaseUserProfile pastPurchaseUserProfile, @C17402n(name = "Shops") List<PastPurchaseShop> list) {
        this.loginName = str;
        this.profile = pastPurchaseUserProfile;
        this.shops = list;
    }

    public static /* synthetic */ PastPurchaseUser copy$default(PastPurchaseUser pastPurchaseUser, String str, PastPurchaseUserProfile pastPurchaseUserProfile, List<PastPurchaseShop> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pastPurchaseUser.loginName;
        }
        if ((i & 2) != 0) {
            pastPurchaseUserProfile = pastPurchaseUser.profile;
        }
        if ((i & 4) != 0) {
            list = pastPurchaseUser.shops;
        }
        return pastPurchaseUser.copy(str, pastPurchaseUserProfile, list);
    }

    public final String component1() {
        return this.loginName;
    }

    public final PastPurchaseUserProfile component2() {
        return this.profile;
    }

    public final List<PastPurchaseShop> component3() {
        return this.shops;
    }

    public final PastPurchaseUser copy(@C17402n(name = "login_name") String str, @C17402n(name = "Profile") PastPurchaseUserProfile pastPurchaseUserProfile, @C17402n(name = "Shops") List<PastPurchaseShop> list) {
        return new PastPurchaseUser(str, pastPurchaseUserProfile, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PastPurchaseUser)) {
            return false;
        }
        PastPurchaseUser pastPurchaseUser = (PastPurchaseUser) obj;
        return C19383o.m32792b(this.loginName, pastPurchaseUser.loginName) && C19383o.m32792b(this.profile, pastPurchaseUser.profile) && C19383o.m32792b(this.shops, pastPurchaseUser.shops);
    }

    public final String getLoginName() {
        return this.loginName;
    }

    public final PastPurchaseUserProfile getProfile() {
        return this.profile;
    }

    public final List<PastPurchaseShop> getShops() {
        return this.shops;
    }

    public int hashCode() {
        String str = this.loginName;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        PastPurchaseUserProfile pastPurchaseUserProfile = this.profile;
        int hashCode2 = (hashCode + (pastPurchaseUserProfile == null ? 0 : pastPurchaseUserProfile.hashCode())) * 31;
        List<PastPurchaseShop> list = this.shops;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("PastPurchaseUser(loginName=");
        h.append(this.loginName);
        h.append(", profile=");
        h.append(this.profile);
        h.append(", shops=");
        return C0070b.m186i(h, this.shops, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PastPurchaseUser(String str, PastPurchaseUserProfile pastPurchaseUserProfile, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : pastPurchaseUserProfile, (i & 4) != 0 ? null : list);
    }
}
