package com.appsflyer.internal;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.appsflyer.internal.ax */
final class C5027ax implements PurchasesUpdatedListener {
    private /* synthetic */ C5022av values;

    public C5027ax(C5022av avVar) {
        this.values = avVar;
    }

    public final void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        C5022av avVar = this.values;
        try {
            if (billingResult.getResponseCode() == 0) {
                if (list != null) {
                    if (avVar.valueOf == null) {
                        AFLogger.AppsFlyer2dXConversionCallback("Got Ars billing callback but billing client is missing!");
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Purchase sku : list) {
                        arrayList.add(sku.getSku());
                    }
                    avVar.valueOf.querySkuDetailsAsync(SkuDetailsParams.newBuilder().setType("subs").setSkusList(arrayList).build(), new SkuDetailsResponseListener(list) {
                        private /* synthetic */ List valueOf;

                        {
                            this.valueOf = r2;
                        }

                        public final void onSkuDetailsResponse(BillingResult billingResult, List<SkuDetails> list) {
                            try {
                                if (billingResult.getResponseCode() != 0) {
                                    return;
                                }
                                if (list != null) {
                                    ArrayList arrayList = new ArrayList();
                                    for (SkuDetails sku : list) {
                                        arrayList.add(sku.getSku());
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Purchase purchase : this.valueOf) {
                                        if (arrayList.contains(purchase.getSku())) {
                                            arrayList2.add(purchase);
                                        }
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        C5022av.values(C5022av.this, false, arrayList2);
                                    }
                                }
                            } catch (Throwable th) {
                                if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                                    AFLogger.AppsFlyer2dXConversionCallback("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
                                }
                                AFLogger.AFInAppEventType("Failed to log new purchase", th);
                            }
                        }
                    });
                    return;
                }
            }
            StringBuilder sb = new StringBuilder("Failed to setup Ars Play billing service: ");
            sb.append(billingResult.getResponseCode());
            sb.append(" ");
            sb.append(billingResult.getDebugMessage());
            AFLogger.AppsFlyer2dXConversionCallback(sb.toString());
        } catch (Throwable th) {
            if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                AFLogger.AppsFlyer2dXConversionCallback("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
            }
            AFLogger.AFInAppEventType("Failed to query new purchase details", th);
        }
    }
}
