package com.paypal.pyplcheckout.pojo;

import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class PlanType {
    @C18417a("soloPlan")
    private Plan soloPlan;
    @C18417a("splitPlanList")
    private List<Plan> splitPlanList;

    public PlanType() {
        this((Plan) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public PlanType(Plan plan, List<Plan> list) {
        this.soloPlan = plan;
        this.splitPlanList = list;
    }

    public static /* synthetic */ PlanType copy$default(PlanType planType, Plan plan, List<Plan> list, int i, Object obj) {
        if ((i & 1) != 0) {
            plan = planType.soloPlan;
        }
        if ((i & 2) != 0) {
            list = planType.splitPlanList;
        }
        return planType.copy(plan, list);
    }

    public final Plan component1() {
        return this.soloPlan;
    }

    public final List<Plan> component2() {
        return this.splitPlanList;
    }

    public final PlanType copy(Plan plan, List<Plan> list) {
        return new PlanType(plan, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlanType)) {
            return false;
        }
        PlanType planType = (PlanType) obj;
        return C19383o.m32792b(this.soloPlan, planType.soloPlan) && C19383o.m32792b(this.splitPlanList, planType.splitPlanList);
    }

    public final Plan getSoloPlan() {
        return this.soloPlan;
    }

    public final List<Plan> getSplitPlanList() {
        return this.splitPlanList;
    }

    public int hashCode() {
        Plan plan = this.soloPlan;
        int i = 0;
        int hashCode = (plan == null ? 0 : plan.hashCode()) * 31;
        List<Plan> list = this.splitPlanList;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final void setSoloPlan(Plan plan) {
        this.soloPlan = plan;
    }

    public final void setSplitPlanList(List<Plan> list) {
        this.splitPlanList = list;
    }

    public String toString() {
        Plan plan = this.soloPlan;
        List<Plan> list = this.splitPlanList;
        return "PlanType(soloPlan=" + plan + ", splitPlanList=" + list + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlanType(Plan plan, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : plan, (i & 2) != 0 ? null : list);
    }
}
