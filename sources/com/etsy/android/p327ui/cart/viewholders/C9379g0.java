package com.etsy.android.p327ui.cart.viewholders;

import android.content.Context;
import android.widget.Spinner;
import com.etsy.android.lib.models.Country;
import com.etsy.android.uikit.EtsySpinnerArrayAdapterWithClickListener;

/* renamed from: com.etsy.android.ui.cart.viewholders.g0 */
public final class C9379g0 extends EtsySpinnerArrayAdapterWithClickListener<Country> {
    public C9379g0(Context context, Spinner spinner) {
        super(context, spinner);
    }

    public final String getText(Object obj) {
        return ((Country) obj).getDisplayCountry();
    }
}
