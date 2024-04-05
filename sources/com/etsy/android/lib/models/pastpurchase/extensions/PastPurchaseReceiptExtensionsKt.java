package com.etsy.android.lib.models.pastpurchase.extensions;

import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.models.pastpurchase.PastPurchaseReceipt;
import com.etsy.android.lib.models.pastpurchase.PastPurchaseShipment;
import com.etsy.android.lib.models.pastpurchase.PastPurchaseShippingState;
import java.util.Calendar;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import org.apache.commons.lang3.time.DateUtils;
import p001a0.C0005b;
import p628nj.C18263b;

public final class PastPurchaseReceiptExtensionsKt {
    public static final int daysUntilShipped(PastPurchaseReceipt pastPurchaseReceipt) {
        C19383o.m32797g(pastPurchaseReceipt, "<this>");
        long shipDate = getShipDate(pastPurchaseReceipt);
        if (shipDate <= 0) {
            return 0;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(shipDate * ((long) 1000));
        C0005b.m60s0(instance);
        Calendar instance2 = Calendar.getInstance();
        C19383o.m32796f(instance2, "nowDateCal");
        C0005b.m60s0(instance2);
        return (int) ((instance.getTimeInMillis() - instance2.getTimeInMillis()) / DateUtils.MILLIS_PER_DAY);
    }

    public static final PastPurchaseShipment getFurthestShipment(PastPurchaseReceipt pastPurchaseReceipt) {
        C19383o.m32797g(pastPurchaseReceipt, "<this>");
        PastPurchaseShipment pastPurchaseShipment = null;
        if (C19543e0.m33306Y(pastPurchaseReceipt.getShipments())) {
            for (PastPurchaseShipment next : pastPurchaseReceipt.getShipments()) {
                if (pastPurchaseShipment != null) {
                    if (!(next.getShippingState() == null || pastPurchaseShipment.getShippingState() == null)) {
                        PastPurchaseShippingState shippingState = next.getShippingState();
                        PastPurchaseShippingState shippingState2 = pastPurchaseShipment.getShippingState();
                        C19383o.m32794d(shippingState2);
                        if (shippingState.compareTo(shippingState2) <= 0) {
                        }
                    }
                }
                pastPurchaseShipment = next;
            }
        }
        return pastPurchaseShipment;
    }

    public static final EtsyMoney getGrandTotalPrice(PastPurchaseReceipt pastPurchaseReceipt, C8630b bVar) {
        C19383o.m32797g(pastPurchaseReceipt, "<this>");
        C19383o.m32797g(bVar, "etsyMoneyFactory");
        return (!C18263b.m30839d0(pastPurchaseReceipt.getGrandTotal()) || !C18263b.m30839d0(pastPurchaseReceipt.getCurrencyCode())) ? bVar.mo21250c() : bVar.mo21248a(pastPurchaseReceipt.getGrandTotal(), pastPurchaseReceipt.getCurrencyCode());
    }

    public static final long getShipDate(PastPurchaseReceipt pastPurchaseReceipt) {
        C19383o.m32797g(pastPurchaseReceipt, "<this>");
        if (pastPurchaseReceipt.getWasShipped() && pastPurchaseReceipt.getShippedDate() > 0) {
            return pastPurchaseReceipt.getShippedDate();
        }
        if (pastPurchaseReceipt.getEstimatedShippedDate() > 0) {
            return pastPurchaseReceipt.getEstimatedShippedDate();
        }
        return 0;
    }
}
