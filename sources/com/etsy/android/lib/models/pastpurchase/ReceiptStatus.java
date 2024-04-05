package com.etsy.android.lib.models.pastpurchase;

import android.content.res.Resources;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.pastpurchase.extensions.PastPurchaseReceiptExtensionsKt;
import java.text.SimpleDateFormat;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;

public final class ReceiptStatus {
    public static final int $stable = 0;

    private final boolean areAllListingsDigitalDownloads(PastPurchaseReceipt pastPurchaseReceipt) {
        boolean z;
        if (!C19543e0.m33306Y(pastPurchaseReceipt.getTransactions())) {
            return false;
        }
        for (PastPurchaseTransaction listing : pastPurchaseReceipt.getTransactions()) {
            PastPurchaseListing listing2 = listing.getListing();
            if (listing2 == null || listing2.isDigital()) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return false;
            }
        }
        return true;
    }

    private final String getDigitalDownloadStatus(Resources resources, PastPurchaseReceipt pastPurchaseReceipt) {
        String string = resources.getString(pastPurchaseReceipt.getWasShipped() ? R.string.delivered : R.string.order_status_in_progress);
        C19383o.m32796f(string, "resources.getString(\n   …s\n            }\n        )");
        return string;
    }

    private final String getShipmentStatus(Resources resources, SimpleDateFormat simpleDateFormat, PastPurchaseReceipt pastPurchaseReceipt) {
        String str;
        C19394m mVar;
        String str2;
        PastPurchaseShipment furthestShipment = PastPurchaseReceiptExtensionsKt.getFurthestShipment(pastPurchaseReceipt);
        if (furthestShipment != null) {
            str = furthestShipment.getMajorTrackingState();
            if (str == null) {
                str = "";
            }
            if (str.length() == 0) {
                PastPurchaseShippingState shippingState = furthestShipment.getShippingState();
                if (shippingState == null) {
                    shippingState = PastPurchaseShippingState.UNKNOWN;
                }
                str = resources.getString(shippingState.getResId());
                C19383o.m32796f(str, "resources.getString(ship…ppingState.UNKNOWN.resId)");
            }
            mVar = C19394m.f43287a;
        } else {
            mVar = null;
            str = null;
        }
        if (mVar == null) {
            if (PastPurchaseReceiptExtensionsKt.daysUntilShipped(pastPurchaseReceipt) > 0) {
                str2 = resources.getString(R.string.ships_on_date, new Object[]{simpleDateFormat.format(Long.valueOf(PastPurchaseReceiptExtensionsKt.getShipDate(pastPurchaseReceipt)))});
                C19383o.m32796f(str2, "{\n                resour…hipDate()))\n            }");
            } else {
                str2 = resources.getString(R.string.shipped);
                C19383o.m32796f(str2, "{\n                resour…ng.shipped)\n            }");
            }
            str = str2;
        }
        if (str != null) {
            return str;
        }
        C19383o.m32805o(ResponseConstants.STATUS);
        throw null;
    }

    public final String getStatus(Resources resources, SimpleDateFormat simpleDateFormat, PastPurchaseReceipt pastPurchaseReceipt) {
        C19383o.m32797g(resources, "resources");
        C19383o.m32797g(simpleDateFormat, "dateFormat");
        C19383o.m32797g(pastPurchaseReceipt, "receipt");
        if (pastPurchaseReceipt.isInPerson()) {
            String string = resources.getString(R.string.ipp_purchased_in_person);
            C19383o.m32796f(string, "{\n            resources.…ased_in_person)\n        }");
            return string;
        } else if (areAllListingsDigitalDownloads(pastPurchaseReceipt)) {
            return getDigitalDownloadStatus(resources, pastPurchaseReceipt);
        } else {
            if (pastPurchaseReceipt.getWasShipped() && pastPurchaseReceipt.getShippedDate() != 0) {
                return getShipmentStatus(resources, simpleDateFormat, pastPurchaseReceipt);
            }
            if (pastPurchaseReceipt.getWasPaid()) {
                String string2 = resources.getString(R.string.paid_status);
                C19383o.m32796f(string2, "{\n            resources.…ng.paid_status)\n        }");
                return string2;
            } else if (pastPurchaseReceipt.getWasPaid() || !pastPurchaseReceipt.isFlaggedForManualFraudReview()) {
                String string3 = resources.getString(R.string.unpaid);
                C19383o.m32796f(string3, "{\n            resources.….string.unpaid)\n        }");
                return string3;
            } else {
                String string4 = resources.getString(R.string.payment_processing);
                C19383o.m32796f(string4, "{\n            // Show pa…ent_processing)\n        }");
                return string4;
            }
        }
    }
}
