package com.etsy.android.lib.currency;

import com.squareup.moshi.C17401m;
import com.squareup.moshi.C17418z;
import java.util.Currency;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.C19383o;

public final class EtsyMoneyJsonAdapter {
    public static final int $stable = 8;
    private final C8630b factory;

    public EtsyMoneyJsonAdapter(C8630b bVar) {
        C19383o.m32797g(bVar, "factory");
        this.factory = bVar;
    }

    @C17401m
    public final EtsyMoney etsyMoneyFromJson(EtsyMoneyJson etsyMoneyJson) {
        C19383o.m32797g(etsyMoneyJson, "etsyMoneyJson");
        C8630b bVar = this.factory;
        Currency instance = Currency.getInstance(etsyMoneyJson.f18960b);
        C19383o.m32796f(instance, "getInstance(etsyMoneyJson.currencyCode)");
        return bVar.mo21249b(instance, etsyMoneyJson.f18959a, etsyMoneyJson.f18961c);
    }

    @C17418z
    public final EtsyMoneyJson etsyMoneyToJson(EtsyMoney etsyMoney) {
        C19383o.m32797g(etsyMoney, "etsyMoney");
        throw new NotImplementedError("This class is not designed for serializing request data. Create own implementation of Money");
    }
}
