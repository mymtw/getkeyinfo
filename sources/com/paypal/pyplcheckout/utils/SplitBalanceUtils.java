package com.paypal.pyplcheckout.utils;

import android.text.TextUtils;
import com.paypal.pyplcheckout.pojo.Amount;
import com.paypal.pyplcheckout.pojo.FundingInstrument;
import com.paypal.pyplcheckout.pojo.FundingOption;
import com.paypal.pyplcheckout.pojo.FundingSource;
import com.paypal.pyplcheckout.pojo.Plan;
import com.paypal.pyplcheckout.pojo.PlanType;
import com.paypal.pyplcheckout.pojo.SplitBalanceType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import kotlin.text.C19459m;

public final class SplitBalanceUtils {
    public static final SplitBalanceUtils INSTANCE = new SplitBalanceUtils();
    private static String firstSplitBalanceAmount;
    private static String firstSplitBalanceId;
    private static HashMap<String, PlanType> sFundingOptionsPlanMap = new HashMap<>();
    private static LinkedHashSet<FundingInstrument> sSplitBalanceFundingInstrumentSet = new LinkedHashSet<>();
    private static String secondSplitBalanceAmount;
    private static String secondSplitBalanceId;
    private static SplitBalanceType.Type splitBalanceTypeOfAllFundingOptions = SplitBalanceType.Type.NO_SPLIT_BALANCE;

    private SplitBalanceUtils() {
    }

    public static final void clearSplitBalanceAmountAndId() {
        firstSplitBalanceAmount = null;
        firstSplitBalanceId = null;
        secondSplitBalanceAmount = null;
        secondSplitBalanceId = null;
    }

    public static final void createFundingOptionsPlanMap(List<FundingOption> list) {
        List<Plan> allPlans;
        if (!(list == null || list.isEmpty())) {
            sFundingOptionsPlanMap = new HashMap<>();
            sSplitBalanceFundingInstrumentSet = new LinkedHashSet<>();
            for (FundingOption fundingOption : list) {
                if (fundingOption != null) {
                    String id = fundingOption.getId();
                    if (!(id == null || id.length() == 0) && (allPlans = fundingOption.getAllPlans()) != null && !allPlans.isEmpty()) {
                        PlanType planType = new PlanType((Plan) null, (List) null, 3, (DefaultConstructorMarker) null);
                        ArrayList arrayList = new ArrayList();
                        String id2 = fundingOption.getId();
                        for (Plan plan : allPlans) {
                            List<FundingSource> fundingSources = plan.getFundingSources();
                            if (!(fundingSources == null || fundingSources.isEmpty())) {
                                if (fundingSources.size() == 1) {
                                    planType.setSoloPlan(plan);
                                } else {
                                    if (C19383o.m32792b(plan.isSelected(), Boolean.TRUE)) {
                                        arrayList.add(0, plan);
                                    } else {
                                        arrayList.add(plan);
                                    }
                                    if (fundingSources.size() == 2 && getSplitBalanceTypeOfAllFundingOptions() == SplitBalanceType.Type.NO_SPLIT_BALANCE) {
                                        splitBalanceTypeOfAllFundingOptions = SplitBalanceType.Type.SINGLE_SPLIT_BALANCE;
                                    } else if (fundingSources.size() > 2) {
                                        splitBalanceTypeOfAllFundingOptions = SplitBalanceType.Type.MULTIPLE_SPLIT_BALANCE;
                                    }
                                    for (FundingSource fundingSource : fundingSources) {
                                        FundingInstrument fundingInstrument = fundingSource.getFundingInstrument();
                                        if (fundingInstrument != null) {
                                            String id3 = fundingInstrument.getId();
                                            if (!(id3 == null || id3.length() == 0) && C19459m.m33036e1(fundingInstrument.getId(), "BALANCE", false)) {
                                                fundingInstrument.setAmount(fundingSource.getAmount());
                                                sSplitBalanceFundingInstrumentSet.add(fundingInstrument);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (!sFundingOptionsPlanMap.containsKey(id2)) {
                            planType.setSplitPlanList(arrayList);
                            sFundingOptionsPlanMap.put(id2, planType);
                        }
                    }
                }
            }
        }
    }

    private final boolean equalsIgnoreCaseWithNullCheck(String str, String str2) {
        return (str == null || str2 == null || !C19457k.m33019W0(str, str2, true)) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (kotlin.text.C19459m.m33036e1(r6, r2, false) != false) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.paypal.pyplcheckout.pojo.Plan findPlanMatchingSelectedSplitBalance(com.paypal.pyplcheckout.pojo.FundingOption r6, boolean r7, boolean r8) {
        /*
            r0 = 0
            r1 = 1
            if (r6 != 0) goto L_0x0005
            goto L_0x0019
        L_0x0005:
            java.lang.String r2 = r6.getId()
            if (r2 != 0) goto L_0x000c
            goto L_0x0019
        L_0x000c:
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0014
            r2 = r1
            goto L_0x0015
        L_0x0014:
            r2 = r0
        L_0x0015:
            if (r2 != 0) goto L_0x0019
            r2 = r1
            goto L_0x001a
        L_0x0019:
            r2 = r0
        L_0x001a:
            r3 = 0
            if (r2 != 0) goto L_0x001e
            return r3
        L_0x001e:
            java.lang.String r6 = r6.getId()
            com.paypal.pyplcheckout.utils.PaymentTypes r2 = com.paypal.pyplcheckout.utils.PaymentTypes.PAYPAL_CREDIT
            java.lang.String r2 = r2.toString()
            boolean r2 = kotlin.text.C19457k.m33019W0(r2, r6, r1)
            if (r2 != 0) goto L_0x003f
            com.paypal.pyplcheckout.utils.PaymentTypes r2 = com.paypal.pyplcheckout.utils.PaymentTypes.BALANCE
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "BALANCE.toString()"
            kotlin.jvm.internal.C19383o.m32796f(r2, r4)
            boolean r2 = kotlin.text.C19459m.m33036e1(r6, r2, r0)
            if (r2 == 0) goto L_0x0041
        L_0x003f:
            r7 = r0
            r8 = r7
        L_0x0041:
            java.util.HashMap<java.lang.String, com.paypal.pyplcheckout.pojo.PlanType> r2 = sFundingOptionsPlanMap
            java.lang.Object r6 = r2.get(r6)
            com.paypal.pyplcheckout.pojo.PlanType r6 = (com.paypal.pyplcheckout.pojo.PlanType) r6
            if (r6 != 0) goto L_0x004c
            return r3
        L_0x004c:
            com.paypal.pyplcheckout.pojo.Plan r2 = r6.getSoloPlan()
            com.paypal.pyplcheckout.pojo.SplitBalanceType$Type r4 = splitBalanceTypeOfAllFundingOptions
            com.paypal.pyplcheckout.pojo.SplitBalanceType$Type r5 = com.paypal.pyplcheckout.pojo.SplitBalanceType.Type.NO_SPLIT_BALANCE
            if (r4 != r5) goto L_0x0057
            goto L_0x0085
        L_0x0057:
            java.util.List r4 = r6.getSplitPlanList()
            if (r4 == 0) goto L_0x0063
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0064
        L_0x0063:
            r0 = r1
        L_0x0064:
            if (r0 == 0) goto L_0x0067
            goto L_0x0085
        L_0x0067:
            com.paypal.pyplcheckout.pojo.SplitBalanceType$Type r0 = splitBalanceTypeOfAllFundingOptions
            com.paypal.pyplcheckout.pojo.SplitBalanceType$Type r1 = com.paypal.pyplcheckout.pojo.SplitBalanceType.Type.SINGLE_SPLIT_BALANCE
            if (r0 != r1) goto L_0x0087
            if (r7 == 0) goto L_0x0085
            java.util.List r6 = r6.getSplitPlanList()
            if (r6 != 0) goto L_0x0076
            goto L_0x00d4
        L_0x0076:
            com.paypal.pyplcheckout.utils.SplitBalanceUtils r7 = INSTANCE
            java.lang.String r8 = getFirstSplitBalanceId()
            com.paypal.pyplcheckout.pojo.Plan r6 = r7.getMatchedPlan(r6, r8)
            com.paypal.pyplcheckout.pojo.Plan r3 = com.paypal.pyplcheckout.utils.SplitBalanceUtilsKt.orNull(r6)
            goto L_0x00d4
        L_0x0085:
            r3 = r2
            goto L_0x00d4
        L_0x0087:
            if (r7 == 0) goto L_0x00a5
            if (r8 == 0) goto L_0x00a5
            java.util.List r6 = r6.getSplitPlanList()
            if (r6 != 0) goto L_0x0092
            goto L_0x00d4
        L_0x0092:
            com.paypal.pyplcheckout.utils.SplitBalanceUtils r7 = INSTANCE
            java.lang.String r8 = getFirstSplitBalanceId()
            java.lang.String r0 = getSecondSplitBalanceId()
            com.paypal.pyplcheckout.pojo.Plan r6 = r7.getMatchedPlan(r6, r8, r0)
            com.paypal.pyplcheckout.pojo.Plan r3 = com.paypal.pyplcheckout.utils.SplitBalanceUtilsKt.orNull(r6)
            goto L_0x00d4
        L_0x00a5:
            if (r7 == 0) goto L_0x00bd
            java.util.List r6 = r6.getSplitPlanList()
            if (r6 != 0) goto L_0x00ae
            goto L_0x00d4
        L_0x00ae:
            com.paypal.pyplcheckout.utils.SplitBalanceUtils r7 = INSTANCE
            java.lang.String r8 = getFirstSplitBalanceId()
            com.paypal.pyplcheckout.pojo.Plan r6 = r7.getMatchedPlan(r6, r8)
            com.paypal.pyplcheckout.pojo.Plan r3 = com.paypal.pyplcheckout.utils.SplitBalanceUtilsKt.orNull(r6)
            goto L_0x00d4
        L_0x00bd:
            if (r8 == 0) goto L_0x00d8
            java.util.List r6 = r6.getSplitPlanList()
            if (r6 != 0) goto L_0x00c6
            goto L_0x00d4
        L_0x00c6:
            com.paypal.pyplcheckout.utils.SplitBalanceUtils r7 = INSTANCE
            java.lang.String r8 = getSecondSplitBalanceId()
            com.paypal.pyplcheckout.pojo.Plan r6 = r7.getMatchedPlan(r6, r8)
            com.paypal.pyplcheckout.pojo.Plan r3 = com.paypal.pyplcheckout.utils.SplitBalanceUtilsKt.orNull(r6)
        L_0x00d4:
            if (r3 != 0) goto L_0x00d7
            goto L_0x00d8
        L_0x00d7:
            r2 = r3
        L_0x00d8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.utils.SplitBalanceUtils.findPlanMatchingSelectedSplitBalance(com.paypal.pyplcheckout.pojo.FundingOption, boolean, boolean):com.paypal.pyplcheckout.pojo.Plan");
    }

    public static final void generateSplitBalanceAmountAndId() {
        if (!sSplitBalanceFundingInstrumentSet.isEmpty()) {
            Iterator<FundingInstrument> it = sSplitBalanceFundingInstrumentSet.iterator();
            while (it.hasNext()) {
                FundingInstrument next = it.next();
                Amount amount = next.getAmount();
                if ((amount == null ? null : amount.getCurrencyFormatSymbolISOCurrency()) != null) {
                    String str = firstSplitBalanceAmount;
                    boolean z = false;
                    if (str == null || str.length() == 0) {
                        firstSplitBalanceAmount = amount.getCurrencyFormatSymbolISOCurrency();
                        firstSplitBalanceId = next.getId();
                    } else {
                        secondSplitBalanceAmount = amount.getCurrencyFormatSymbolISOCurrency();
                        secondSplitBalanceId = next.getId();
                    }
                    String str2 = firstSplitBalanceAmount;
                    if (str2 == null || str2.length() == 0) {
                        continue;
                    } else {
                        String str3 = secondSplitBalanceAmount;
                        if (str3 == null || str3.length() == 0) {
                            z = true;
                        }
                        if (!z) {
                            return;
                        }
                    }
                }
            }
        }
    }

    public static final String getFirstSplitBalanceAmount() {
        return firstSplitBalanceAmount;
    }

    public static /* synthetic */ void getFirstSplitBalanceAmount$annotations() {
    }

    public static final String getFirstSplitBalanceId() {
        return firstSplitBalanceId;
    }

    public static /* synthetic */ void getFirstSplitBalanceId$annotations() {
    }

    private final Plan getMatchedPlan(List<Plan> list, String str, String str2) {
        List<FundingSource> fundingSources;
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Plan plan = list.get(i);
            if (!TextUtils.isEmpty(plan.getId()) && (fundingSources = plan.getFundingSources()) != null && !fundingSources.isEmpty() && fundingSources.size() >= 3) {
                int size2 = fundingSources.size();
                int i3 = 0;
                boolean z = false;
                boolean z2 = false;
                while (i3 < size2) {
                    int i4 = i3 + 1;
                    FundingInstrument fundingInstrument = fundingSources.get(i3).getFundingInstrument();
                    if (fundingInstrument != null) {
                        if (C19457k.m33019W0(str, fundingInstrument.getId(), true)) {
                            z = true;
                        }
                        if (C19457k.m33019W0(str2, fundingInstrument.getId(), true)) {
                            z2 = true;
                        }
                    }
                    i3 = i4;
                }
                if (z && z2) {
                    return plan;
                }
            }
            i = i2;
        }
        return null;
    }

    public static final String getSecondSplitBalanceAmount() {
        return secondSplitBalanceAmount;
    }

    public static /* synthetic */ void getSecondSplitBalanceAmount$annotations() {
    }

    public static final String getSecondSplitBalanceId() {
        return secondSplitBalanceId;
    }

    public static /* synthetic */ void getSecondSplitBalanceId$annotations() {
    }

    public static final List<FundingInstrument> getSplitBalanceFundingInstrumentList() {
        return C19327t.m32660p1(sSplitBalanceFundingInstrumentSet);
    }

    public static /* synthetic */ void getSplitBalanceFundingInstrumentList$annotations() {
    }

    public static final SplitBalanceType.Type getSplitBalanceTypeOfAllFundingOptions() {
        return splitBalanceTypeOfAllFundingOptions;
    }

    public static /* synthetic */ void getSplitBalanceTypeOfAllFundingOptions$annotations() {
    }

    public static final boolean isMultipleSplitBalanceVisible() {
        return splitBalanceTypeOfAllFundingOptions == SplitBalanceType.Type.MULTIPLE_SPLIT_BALANCE;
    }

    public static /* synthetic */ void isMultipleSplitBalanceVisible$annotations() {
    }

    public static final boolean isSingleSplitBalanceVisible() {
        return splitBalanceTypeOfAllFundingOptions == SplitBalanceType.Type.SINGLE_SPLIT_BALANCE || splitBalanceTypeOfAllFundingOptions == SplitBalanceType.Type.MULTIPLE_SPLIT_BALANCE;
    }

    public static /* synthetic */ void isSingleSplitBalanceVisible$annotations() {
    }

    public final void clear() {
        sFundingOptionsPlanMap = new HashMap<>();
        sSplitBalanceFundingInstrumentSet = new LinkedHashSet<>();
        splitBalanceTypeOfAllFundingOptions = SplitBalanceType.Type.NO_SPLIT_BALANCE;
        clearSplitBalanceAmountAndId();
    }

    private final Plan getMatchedPlan(List<Plan> list, String str) {
        for (Plan plan : list) {
            String id = plan.getId();
            int i = 0;
            boolean z = true;
            if (!(id == null || id.length() == 0)) {
                List<FundingSource> fundingSources = plan.getFundingSources();
                if (fundingSources != null && !fundingSources.isEmpty()) {
                    z = false;
                }
                if (!z && fundingSources.size() == 2) {
                    int size = fundingSources.size();
                    while (i < size) {
                        int i2 = i + 1;
                        FundingInstrument fundingInstrument = fundingSources.get(i).getFundingInstrument();
                        if (fundingInstrument != null && INSTANCE.equalsIgnoreCaseWithNullCheck(str, fundingInstrument.getId())) {
                            return plan;
                        }
                        i = i2;
                    }
                    continue;
                }
            }
        }
        return null;
    }
}
