package com.etsy.android.p327ui.util.countries;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.models.Country;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.util.countries.CountrySelectorViewModel$setSelectedCountry$2 */
public final class CountrySelectorViewModel$setSelectedCountry$2 extends Lambda implements C19857l<List<? extends Country>, C19394m> {
    public final /* synthetic */ int $countryId;
    public final /* synthetic */ CountrySelectorViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountrySelectorViewModel$setSelectedCountry$2(int i, CountrySelectorViewModel countrySelectorViewModel) {
        super(1);
        this.$countryId = i;
        this.this$0 = countrySelectorViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<Country>) (List) obj);
        return C19394m.f43287a;
    }

    public final void invoke(List<Country> list) {
        C19394m mVar;
        T t;
        boolean z;
        C19383o.m32796f(list, ResponseConstants.COUNTRIES);
        int i = this.$countryId;
        Iterator<T> it = list.iterator();
        while (true) {
            mVar = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((Country) t).getCountryId() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        Country country = (Country) t;
        if (country != null) {
            this.this$0.f26232f.onNext(country);
            mVar = C19394m.f43287a;
        }
        if (mVar == null) {
            C8694h a = LogCatKt.m17045a();
            StringBuilder h = C0072d.m201h("Could not find ");
            h.append(this.$countryId);
            h.append(" in ");
            h.append(list);
            a.mo21313g(h.toString());
        }
    }
}
