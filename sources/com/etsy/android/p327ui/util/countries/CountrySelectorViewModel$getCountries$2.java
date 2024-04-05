package com.etsy.android.p327ui.util.countries;

import com.etsy.android.lib.models.Country;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.util.countries.CountrySelectorViewModel$getCountries$2 */
final class CountrySelectorViewModel$getCountries$2 extends Lambda implements C19857l<List<? extends Country>, C19394m> {
    public final /* synthetic */ CountrySelectorViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountrySelectorViewModel$getCountries$2(CountrySelectorViewModel countrySelectorViewModel) {
        super(1);
        this.this$0 = countrySelectorViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<Country>) (List) obj);
        return C19394m.f43287a;
    }

    public final void invoke(List<Country> list) {
        this.this$0.f26231e.onNext(list);
    }
}
