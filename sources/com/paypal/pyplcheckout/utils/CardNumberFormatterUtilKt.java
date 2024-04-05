package com.paypal.pyplcheckout.utils;

import com.paypal.pyplcheckout.extensions.AnyExtensionsKt;
import com.paypal.pyplcheckout.model.PaymentProcessors;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.text.Regex;

public final class CardNumberFormatterUtilKt {
    private static final Map<Integer, Set<Integer>> whiteSpacePositionsMap = C19294b0.m32562s0(new Pair(14, C19382n.m32704D0(4, 11)), new Pair(15, C19382n.m32704D0(4, 11)), new Pair(16, C19382n.m32704D0(4, 9, 14)), new Pair(19, C19382n.m32704D0(4, 9, 14, 19)));
    private static final Map<Integer, Set<Integer>> whiteSpacePositionsSpanMap = C19294b0.m32562s0(new Pair(14, C19382n.m32704D0(4, 10)), new Pair(15, C19382n.m32704D0(4, 10)), new Pair(16, C19382n.m32704D0(4, 8, 12)), new Pair(19, C19382n.m32704D0(4, 8, 12, 16)));

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentProcessors.values().length];
            iArr[PaymentProcessors.VISA.ordinal()] = 1;
            iArr[PaymentProcessors.DISCOVER.ordinal()] = 2;
            iArr[PaymentProcessors.MASTERCARD.ordinal()] = 3;
            iArr[PaymentProcessors.CHINAUNIONPAY.ordinal()] = 4;
            iArr[PaymentProcessors.NOTFOUND.ordinal()] = 5;
            iArr[PaymentProcessors.DINERSCLUB.ordinal()] = 6;
            iArr[PaymentProcessors.AMEX.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String formatCardNumberString(String str, PaymentProcessors paymentProcessors) {
        List list;
        C19394m mVar;
        int intValue;
        C19383o.m32797g(str, "cardNumber");
        C19383o.m32797g(paymentProcessors, "paymentProcessors");
        EmptyList emptyList = EmptyList.INSTANCE;
        String replace = new Regex("\\s").replace((CharSequence) str, "");
        switch (WhenMappings.$EnumSwitchMapping$0[paymentProcessors.ordinal()]) {
            case 1:
                Set<Integer> set = whiteSpacePositionsMap.get(19);
                C19383o.m32794d(set);
                list = C19327t.m32655k1(C19327t.m32661q1(set));
                mVar = C19394m.f43287a;
                break;
            case 2:
            case 3:
            case 4:
                Set<Integer> set2 = whiteSpacePositionsMap.get(16);
                C19383o.m32794d(set2);
                list = C19327t.m32655k1(C19327t.m32661q1(set2));
                mVar = C19394m.f43287a;
                break;
            case 5:
                Set<Integer> set3 = whiteSpacePositionsMap.get(16);
                C19383o.m32794d(set3);
                list = C19327t.m32655k1(C19327t.m32661q1(set3));
                mVar = C19394m.f43287a;
                break;
            case 6:
                Set<Integer> set4 = whiteSpacePositionsMap.get(14);
                C19383o.m32794d(set4);
                list = C19327t.m32655k1(C19327t.m32661q1(set4));
                mVar = C19394m.f43287a;
                break;
            case 7:
                Set<Integer> set5 = whiteSpacePositionsMap.get(15);
                C19383o.m32794d(set5);
                list = C19327t.m32655k1(C19327t.m32661q1(set5));
                mVar = C19394m.f43287a;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        AnyExtensionsKt.getExhaustive(mVar);
        StringBuilder sb = new StringBuilder(replace);
        Iterator it = list.iterator();
        while (it.hasNext() && sb.length() > (intValue = ((Number) it.next()).intValue())) {
            sb.insert(intValue, " ");
        }
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "formattedStringBuilder.toString()");
        return sb2;
    }

    public static final List<Integer> getWhiteSpaceSpanList(PaymentProcessors paymentProcessors) {
        List list;
        C19383o.m32797g(paymentProcessors, "paymentProcessors");
        switch (WhenMappings.$EnumSwitchMapping$0[paymentProcessors.ordinal()]) {
            case 1:
                Set<Integer> set = whiteSpacePositionsSpanMap.get(19);
                C19383o.m32794d(set);
                list = C19327t.m32655k1(C19327t.m32660p1(set));
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                Set<Integer> set2 = whiteSpacePositionsSpanMap.get(16);
                C19383o.m32794d(set2);
                list = C19327t.m32655k1(C19327t.m32660p1(set2));
                break;
            case 6:
                Set<Integer> set3 = whiteSpacePositionsSpanMap.get(14);
                C19383o.m32794d(set3);
                list = C19327t.m32655k1(C19327t.m32660p1(set3));
                break;
            case 7:
                Set<Integer> set4 = whiteSpacePositionsSpanMap.get(15);
                C19383o.m32794d(set4);
                list = C19327t.m32655k1(C19327t.m32660p1(set4));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return (List) AnyExtensionsKt.getExhaust(list);
    }
}
