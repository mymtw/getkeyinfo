package com.etsy.android.p327ui.adapters;

import android.view.View;
import com.etsy.android.lib.models.EtsyCurrency;
import com.etsy.android.p327ui.user.CurrencySelectFragment;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p030bo.app.C3653e7;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.adapters.CurrencyAdapter$onBindListItemViewHolder$1 */
public final class CurrencyAdapter$onBindListItemViewHolder$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ EtsyCurrency $currency;
    public final /* synthetic */ int $position;
    public final /* synthetic */ CurrencyAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CurrencyAdapter$onBindListItemViewHolder$1(CurrencyAdapter currencyAdapter, EtsyCurrency etsyCurrency, int i) {
        super(1);
        this.this$0 = currencyAdapter;
        this.$currency = etsyCurrency;
        this.$position = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        ((CurrencySelectFragment) ((C3653e7) this.this$0.f19994b).f8384c).onCurrencyChanged(this.$currency, this.$position == 0);
    }
}
