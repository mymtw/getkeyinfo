package com.etsy.android.p327ui.util.countries;

import com.etsy.android.lib.models.Country;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.util.countries.CountrySelectorFragment$setupAdapter$1$1 */
public /* synthetic */ class CountrySelectorFragment$setupAdapter$1$1 extends FunctionReferenceImpl implements C19857l<Country, C19394m> {
    public CountrySelectorFragment$setupAdapter$1$1(Object obj) {
        super(1, obj, CountrySelectorFragment.class, "countrySelected", "countrySelected(Lcom/etsy/android/lib/models/Country;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Country) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Country country) {
        C19383o.m32797g(country, "p0");
        ((CountrySelectorFragment) this.receiver).countrySelected(country);
    }
}
