package com.etsy.android.lib.models.pastpurchase.extensions;

import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.models.pastpurchase.PastPurchaseTransaction;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;

public final class PastPurchaseTransactionExtensionsKt {
    public static final EtsyMoney getItemPrice(PastPurchaseTransaction pastPurchaseTransaction, C8630b bVar) {
        C19383o.m32797g(pastPurchaseTransaction, "<this>");
        C19383o.m32797g(bVar, "etsyMoneyFactory");
        return (!C18263b.m30839d0(pastPurchaseTransaction.getPrice()) || !C18263b.m30839d0(pastPurchaseTransaction.getCurrencyCode())) ? bVar.mo21250c() : bVar.mo21248a(pastPurchaseTransaction.getPrice(), pastPurchaseTransaction.getCurrencyCode());
    }
}
