package com.etsy.android.lib.models.pastpurchase.extensions;

import com.etsy.android.lib.models.pastpurchase.PastPurchaseShop;
import com.etsy.android.lib.models.pastpurchase.PastPurchaseUser;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;

public final class PastPurchaseUserExtensionsKt {
    public static final PastPurchaseShop getMainShop(PastPurchaseUser pastPurchaseUser) {
        C19383o.m32797g(pastPurchaseUser, "<this>");
        if (C19543e0.m33306Y(pastPurchaseUser.getShops())) {
            return pastPurchaseUser.getShops().get(0);
        }
        return null;
    }
}
