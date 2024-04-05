package com.etsy.android.p327ui.user.addresses;

import com.etsy.android.lib.models.Country;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.user.addresses.C11410f0;
import com.etsy.android.p327ui.user.addresses.C11463z;
import java.util.Iterator;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.addresses.AddressListViewModel$loadCountries$2 */
final class AddressListViewModel$loadCountries$2 extends Lambda implements C19857l<?, C19394m> {
    public final /* synthetic */ C11460w this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressListViewModel$loadCountries$2(C11460w wVar) {
        super(1);
        this.this$0 = wVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11463z) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C11463z zVar) {
        T t;
        T t2;
        if (zVar instanceof C11463z.C11466c) {
            C11460w wVar = this.this$0;
            List<Country> list = ((C11463z.C11466c) zVar).f25313a;
            wVar.getClass();
            C19383o.m32797g(list, ResponseConstants.COUNTRIES);
            String country = wVar.f25292d.mo46719c().getCountry();
            Iterator<T> it = list.iterator();
            while (true) {
                t = null;
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (((Country) t2).isUs()) {
                    break;
                }
            }
            Country country2 = (Country) t2;
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next = it2.next();
                if (C19383o.m32792b(((Country) next).getIsoCountryCode(), country)) {
                    t = next;
                    break;
                }
            }
            Country country3 = (Country) t;
            if (country3 != null) {
                country2 = country3;
            }
            if (country2 != null) {
                wVar.f25296h.onNext(new C11410f0.C11413c(country2));
                return;
            }
            return;
        }
        this.this$0.f25296h.onNext(C11410f0.C11411a.f25150a);
    }
}
