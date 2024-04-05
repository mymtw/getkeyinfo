package com.paypal.pyplcheckout.model;

import com.paypal.pyplcheckout.pojo.FundingInstrument;
import com.paypal.pyplcheckout.pojo.FundingOption;
import com.paypal.pyplcheckout.pojo.Plan;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PrincipalFundingOptionMapMaker {
    private final List<FundingOption> fundingOptionList;
    private final Map<String, MapItem> fundingOptionMap;

    public PrincipalFundingOptionMapMaker(List<FundingOption> list, Map<String, MapItem> map) {
        C19383o.m32797g(list, "fundingOptionList");
        C19383o.m32797g(map, "fundingOptionMap");
        this.fundingOptionList = list;
        this.fundingOptionMap = map;
        populateMap();
    }

    private final synchronized void populateMap() {
        for (FundingOption next : this.fundingOptionList) {
            List<Plan> allPlans = next.getAllPlans();
            String str = null;
            if (allPlans != null) {
                Plan plan = allPlans.get(next.getAllPlans().size() - 1);
                if (plan != null) {
                    str = plan.getId();
                }
            }
            String str2 = str;
            FundingInstrument fundingInstrument = next.getFundingInstrument();
            String type = fundingInstrument.getType();
            String label = fundingInstrument.getLabel();
            String lastDigits = fundingInstrument.getLastDigits();
            Boolean isPreferred = fundingInstrument.isPreferred();
            List<Plan> allPlans2 = next.getAllPlans();
            if (!(str2 == null || type == null || label == null || lastDigits == null || isPreferred == null || allPlans2 == null)) {
                this.fundingOptionMap.put(str2, new MapItem(str2, type, label, lastDigits, isPreferred.booleanValue(), false, allPlans2));
            }
        }
    }

    public final synchronized Map<String, MapItem> getPrincipalMap() {
        return this.fundingOptionMap;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PrincipalFundingOptionMapMaker(List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? new HashMap() : map);
    }
}
