package com.paypal.pyplcheckout.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class Plans {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("soloPlan")
    private final SoloPlan soloPlan;
    @C18417a("splitPlans")
    private final List<SplitPlan> splitPlans;

    public Plans() {
        this((SoloPlan) null, (List) null, (Map) null, 7, (DefaultConstructorMarker) null);
    }

    public Plans(SoloPlan soloPlan2, List<SplitPlan> list, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.soloPlan = soloPlan2;
        this.splitPlans = list;
        this.additionalProperties = map;
    }

    public static /* synthetic */ Plans copy$default(Plans plans, SoloPlan soloPlan2, List<SplitPlan> list, Map<String, Object> map, int i, Object obj) {
        if ((i & 1) != 0) {
            soloPlan2 = plans.soloPlan;
        }
        if ((i & 2) != 0) {
            list = plans.splitPlans;
        }
        if ((i & 4) != 0) {
            map = plans.additionalProperties;
        }
        return plans.copy(soloPlan2, list, map);
    }

    public final SoloPlan component1() {
        return this.soloPlan;
    }

    public final List<SplitPlan> component2() {
        return this.splitPlans;
    }

    public final Map<String, Object> component3() {
        return this.additionalProperties;
    }

    public final Plans copy(SoloPlan soloPlan2, List<SplitPlan> list, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        return new Plans(soloPlan2, list, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Plans)) {
            return false;
        }
        Plans plans = (Plans) obj;
        return C19383o.m32792b(this.soloPlan, plans.soloPlan) && C19383o.m32792b(this.splitPlans, plans.splitPlans) && C19383o.m32792b(this.additionalProperties, plans.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final SoloPlan getSoloPlan() {
        return this.soloPlan;
    }

    public final List<SplitPlan> getSplitPlans() {
        return this.splitPlans;
    }

    public int hashCode() {
        SoloPlan soloPlan2 = this.soloPlan;
        int i = 0;
        int hashCode = (soloPlan2 == null ? 0 : soloPlan2.hashCode()) * 31;
        List<SplitPlan> list = this.splitPlans;
        if (list != null) {
            i = list.hashCode();
        }
        return this.additionalProperties.hashCode() + ((hashCode + i) * 31);
    }

    public String toString() {
        SoloPlan soloPlan2 = this.soloPlan;
        List<SplitPlan> list = this.splitPlans;
        Map<String, Object> map = this.additionalProperties;
        return "Plans(soloPlan=" + soloPlan2 + ", splitPlans=" + list + ", additionalProperties=" + map + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Plans(SoloPlan soloPlan2, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : soloPlan2, (i & 2) != 0 ? null : list, (i & 4) != 0 ? new HashMap() : map);
    }
}
