package com.paypal.pyplcheckout.model;

import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import com.paypal.pyplcheckout.pojo.Plan;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

public final class MapItem {
    private final String mapItemFourDigits;
    private final boolean mapItemIsPreferredFundingOption;
    private final boolean mapItemIsSelectedFundingOption;
    private final String mapItemLabel;
    private final String mapItemPlanId;
    private final List<Plan> mapItemPlans;
    private final String mapItemType;

    public MapItem(String str, String str2, String str3, String str4, boolean z, boolean z2, List<Plan> list) {
        C19383o.m32797g(str, "mapItemPlanId");
        C19383o.m32797g(str2, "mapItemType");
        C19383o.m32797g(str3, "mapItemLabel");
        C19383o.m32797g(str4, "mapItemFourDigits");
        C19383o.m32797g(list, "mapItemPlans");
        this.mapItemPlanId = str;
        this.mapItemType = str2;
        this.mapItemLabel = str3;
        this.mapItemFourDigits = str4;
        this.mapItemIsPreferredFundingOption = z;
        this.mapItemIsSelectedFundingOption = z2;
        this.mapItemPlans = list;
    }

    public static /* synthetic */ MapItem copy$default(MapItem mapItem, String str, String str2, String str3, String str4, boolean z, boolean z2, List<Plan> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mapItem.mapItemPlanId;
        }
        if ((i & 2) != 0) {
            str2 = mapItem.mapItemType;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = mapItem.mapItemLabel;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = mapItem.mapItemFourDigits;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = mapItem.mapItemIsPreferredFundingOption;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = mapItem.mapItemIsSelectedFundingOption;
        }
        boolean z4 = z2;
        if ((i & 64) != 0) {
            list = mapItem.mapItemPlans;
        }
        return mapItem.copy(str, str5, str6, str7, z3, z4, list);
    }

    public final String component1() {
        return this.mapItemPlanId;
    }

    public final String component2() {
        return this.mapItemType;
    }

    public final String component3() {
        return this.mapItemLabel;
    }

    public final String component4() {
        return this.mapItemFourDigits;
    }

    public final boolean component5() {
        return this.mapItemIsPreferredFundingOption;
    }

    public final boolean component6() {
        return this.mapItemIsSelectedFundingOption;
    }

    public final List<Plan> component7() {
        return this.mapItemPlans;
    }

    public final MapItem copy(String str, String str2, String str3, String str4, boolean z, boolean z2, List<Plan> list) {
        C19383o.m32797g(str, "mapItemPlanId");
        C19383o.m32797g(str2, "mapItemType");
        C19383o.m32797g(str3, "mapItemLabel");
        C19383o.m32797g(str4, "mapItemFourDigits");
        List<Plan> list2 = list;
        C19383o.m32797g(list2, "mapItemPlans");
        return new MapItem(str, str2, str3, str4, z, z2, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapItem)) {
            return false;
        }
        MapItem mapItem = (MapItem) obj;
        return C19383o.m32792b(this.mapItemPlanId, mapItem.mapItemPlanId) && C19383o.m32792b(this.mapItemType, mapItem.mapItemType) && C19383o.m32792b(this.mapItemLabel, mapItem.mapItemLabel) && C19383o.m32792b(this.mapItemFourDigits, mapItem.mapItemFourDigits) && this.mapItemIsPreferredFundingOption == mapItem.mapItemIsPreferredFundingOption && this.mapItemIsSelectedFundingOption == mapItem.mapItemIsSelectedFundingOption && C19383o.m32792b(this.mapItemPlans, mapItem.mapItemPlans);
    }

    public final String getMapItemFourDigits() {
        return this.mapItemFourDigits;
    }

    public final boolean getMapItemIsPreferredFundingOption() {
        return this.mapItemIsPreferredFundingOption;
    }

    public final boolean getMapItemIsSelectedFundingOption() {
        return this.mapItemIsSelectedFundingOption;
    }

    public final String getMapItemLabel() {
        return this.mapItemLabel;
    }

    public final String getMapItemPlanId() {
        return this.mapItemPlanId;
    }

    public final List<Plan> getMapItemPlans() {
        return this.mapItemPlans;
    }

    public final String getMapItemType() {
        return this.mapItemType;
    }

    public int hashCode() {
        int e = C0023f.m105e(this.mapItemFourDigits, C0023f.m105e(this.mapItemLabel, C0023f.m105e(this.mapItemType, this.mapItemPlanId.hashCode() * 31, 31), 31), 31);
        boolean z = this.mapItemIsPreferredFundingOption;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (e + (z ? 1 : 0)) * 31;
        boolean z3 = this.mapItemIsSelectedFundingOption;
        if (!z3) {
            z2 = z3;
        }
        return this.mapItemPlans.hashCode() + ((i + (z2 ? 1 : 0)) * 31);
    }

    public String toString() {
        String str = this.mapItemPlanId;
        String str2 = this.mapItemType;
        String str3 = this.mapItemLabel;
        String str4 = this.mapItemFourDigits;
        boolean z = this.mapItemIsPreferredFundingOption;
        boolean z2 = this.mapItemIsSelectedFundingOption;
        List<Plan> list = this.mapItemPlans;
        StringBuilder f = C0388a.m1050f("MapItem(mapItemPlanId=", str, ", mapItemType=", str2, ", mapItemLabel=");
        C0391c.m1061h(f, str3, ", mapItemFourDigits=", str4, ", mapItemIsPreferredFundingOption=");
        f.append(z);
        f.append(", mapItemIsSelectedFundingOption=");
        f.append(z2);
        f.append(", mapItemPlans=");
        return C0326j.m865j(f, list, ")");
    }
}
