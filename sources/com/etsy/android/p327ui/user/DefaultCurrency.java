package com.etsy.android.p327ui.user;

import android.content.Context;
import com.etsy.android.R;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.currency.C8637h;
import com.etsy.android.lib.models.EtsyCurrency;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Currency;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.DefaultCurrency */
final class DefaultCurrency extends EtsyCurrency {
    private final Currency deviceCurrency;
    private boolean isSupportedCurrency = true;
    private boolean isValidCurrency;

    public DefaultCurrency(Context context, Map<String, ? extends EtsyCurrency> map, C8637h hVar) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(map, "currencyMap");
        C19383o.m32797g(hVar, "userCurrency");
        Currency b = hVar.mo21253b();
        this.deviceCurrency = b;
        this.mName = context.getString(R.string.currency_device_default);
        if (b != null) {
            C8630b bVar = C8630b.f18964e;
            if (bVar != null) {
                this.mUnit = bVar.mo21248a("0", b.getCurrencyCode());
                this.mNumberPrecision = b.getDefaultFractionDigits();
                if (!map.containsKey(getUnit().getCurrencyCode())) {
                    this.isSupportedCurrency = false;
                    C8630b bVar2 = C8630b.f18964e;
                    if (bVar2 != null) {
                        this.mUnit = bVar2.mo21248a("0", "USD");
                        this.mNumberPrecision = Currency.getInstance(Locale.US).getDefaultFractionDigits();
                        return;
                    }
                    C19383o.m32805o("instance");
                    throw null;
                }
                return;
            }
            C19383o.m32805o("instance");
            throw null;
        }
        this.isSupportedCurrency = false;
        this.isValidCurrency = false;
        C8630b bVar3 = C8630b.f18964e;
        if (bVar3 != null) {
            this.mUnit = bVar3.mo21248a("0", "USD");
            this.mNumberPrecision = Currency.getInstance(Locale.US).getDefaultFractionDigits();
            return;
        }
        C19383o.m32805o("instance");
        throw null;
    }

    public final Currency getDeviceCurrency() {
        return this.deviceCurrency;
    }

    public final boolean isSupportedCurrency() {
        return this.isSupportedCurrency;
    }

    public final boolean isValidCurrency() {
        return this.isValidCurrency;
    }

    public final void setSupportedCurrency(boolean z) {
        this.isSupportedCurrency = z;
    }

    public final void setValidCurrency(boolean z) {
        this.isValidCurrency = z;
    }
}
