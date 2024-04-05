package com.etsy.android.lib.models.apiv3.listing.extensions;

import com.etsy.android.lib.models.apiv3.CancellationType;
import com.etsy.android.lib.models.apiv3.StructuredShopRefunds;
import com.etsy.android.lib.models.apiv3.listing.NonRefundableItem;
import com.etsy.android.lib.models.apiv3.listing.StructuredPolicyRefunds;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.StringEscapeUtils;

public final class StructuredPolicyRefundsExtensionKt {
    public static final StructuredShopRefunds convertToV2(StructuredPolicyRefunds structuredPolicyRefunds) {
        ArrayList arrayList;
        C19383o.m32797g(structuredPolicyRefunds, "<this>");
        StructuredShopRefunds structuredShopRefunds = new StructuredShopRefunds();
        Boolean acceptsReturns = structuredPolicyRefunds.getAcceptsReturns();
        structuredShopRefunds.setAcceptsReturns(acceptsReturns != null ? acceptsReturns.booleanValue() : false);
        Boolean exchanges = structuredPolicyRefunds.getExchanges();
        structuredShopRefunds.setAcceptsExchanges(exchanges != null ? exchanges.booleanValue() : false);
        structuredShopRefunds.setAcceptsCancellations(structuredPolicyRefunds.getAcceptsCancellations());
        String acceptedSummaryString = structuredPolicyRefunds.getAcceptedSummaryString();
        CancellationType cancellationType = null;
        String unescapeHtml4 = acceptedSummaryString != null ? StringEscapeUtils.unescapeHtml4(acceptedSummaryString) : null;
        String str = "";
        if (unescapeHtml4 == null) {
            unescapeHtml4 = str;
        }
        structuredShopRefunds.setAcceptedSummaryString(unescapeHtml4);
        String notAcceptedSummaryString = structuredPolicyRefunds.getNotAcceptedSummaryString();
        String unescapeHtml42 = notAcceptedSummaryString != null ? StringEscapeUtils.unescapeHtml4(notAcceptedSummaryString) : null;
        if (unescapeHtml42 != null) {
            str = unescapeHtml42;
        }
        structuredShopRefunds.setNotAcceptedSummaryString(str);
        Integer contactSellerWithinDays = structuredPolicyRefunds.getContactSellerWithinDays();
        structuredShopRefunds.setContactWithinDays(contactSellerWithinDays != null ? contactSellerWithinDays.intValue() : 0);
        Integer returnItemsWithinDays = structuredPolicyRefunds.getReturnItemsWithinDays();
        structuredShopRefunds.setReturnWithinDays(returnItemsWithinDays != null ? returnItemsWithinDays.intValue() : 0);
        Integer cancelWithinHours = structuredPolicyRefunds.getCancelWithinHours();
        structuredShopRefunds.setCancelWithinHours(cancelWithinHours != null ? cancelWithinHours.intValue() : 0);
        String cancellationWindowType = structuredPolicyRefunds.getCancellationWindowType();
        if (cancellationWindowType != null) {
            CancellationType[] values = CancellationType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                CancellationType cancellationType2 = values[i];
                if (C19383o.m32792b(cancellationType2.getValue(), cancellationWindowType)) {
                    cancellationType = cancellationType2;
                    break;
                }
                i++;
            }
        }
        structuredShopRefunds.setCancellationType(cancellationType);
        List<NonRefundableItem> nonRefundableItems = structuredPolicyRefunds.getNonRefundableItems();
        if (nonRefundableItems != null) {
            ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(nonRefundableItems));
            for (NonRefundableItem nonRefundableItem : nonRefundableItems) {
                com.etsy.android.lib.models.apiv3.NonRefundableItem nonRefundableItem2 = new com.etsy.android.lib.models.apiv3.NonRefundableItem();
                nonRefundableItem2.setType(StringEscapeUtils.unescapeHtml4(nonRefundableItem.getType()));
                nonRefundableItem2.setName(StringEscapeUtils.unescapeHtml4(nonRefundableItem.getName()));
                Boolean nonRefundable = nonRefundableItem.getNonRefundable();
                nonRefundableItem2.setNonRefundable(nonRefundable != null ? nonRefundable.booleanValue() : false);
                arrayList2.add(nonRefundableItem2);
            }
            arrayList = C19327t.m32661q1(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        structuredShopRefunds.setNonRefundableItems(arrayList);
        return structuredShopRefunds;
    }
}
