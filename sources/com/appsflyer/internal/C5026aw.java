package com.appsflyer.internal;

import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.appsflyer.AFLogger;
import java.util.List;

/* renamed from: com.appsflyer.internal.aw */
final class C5026aw implements BillingClientStateListener {
    private /* synthetic */ C5022av AFInAppEventType;

    public C5026aw(C5022av avVar) {
        this.AFInAppEventType = avVar;
    }

    public final void onBillingServiceDisconnected() {
    }

    public final void onBillingSetupFinished(BillingResult billingResult) {
        C5022av avVar = this.AFInAppEventType;
        avVar.values.submit(new Runnable(billingResult) {
            private /* synthetic */ BillingResult AFInAppEventType;

            {
                this.AFInAppEventType = r2;
            }

            public final void run() {
                try {
                    if (this.AFInAppEventType.getResponseCode() == 0 && !C5022av.this.AFInAppEventType.AFInAppEventType("ars_history_sent")) {
                        Purchase.PurchasesResult queryPurchases = C5022av.this.valueOf.queryPurchases("subs");
                        List purchasesList = queryPurchases.getPurchasesList();
                        if (queryPurchases.getResponseCode() == 0 && purchasesList != null) {
                            if (!purchasesList.isEmpty()) {
                                C5022av.values(C5022av.this, true, purchasesList);
                                return;
                            }
                        }
                        AFLogger.AppsFlyer2dXConversionCallback("Failed to query purchases history");
                    }
                } catch (Throwable th) {
                    if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                        AFLogger.AppsFlyer2dXConversionCallback("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
                    }
                    AFLogger.AFInAppEventType("Failed to log purchases history", th);
                }
            }
        });
    }
}
