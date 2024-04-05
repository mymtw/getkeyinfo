package com.etsy.android;

import com.braze.C5416d;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.models.Country;
import com.etsy.android.lib.util.C8902h;
import com.etsy.android.lib.util.CrashUtil;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.cart.SavedCartItemsFragment;
import com.etsy.android.p327ui.core.C9613a;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.C10369b;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.C10384d;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.C10385e;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.PaymentMethod;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.ShippingAddress;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.ShippingMethod;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.UiState;
import com.etsy.android.p327ui.shop.BaseShopHomeFragment;
import com.etsy.android.p327ui.shop.C11172k0;
import com.etsy.android.p327ui.user.CurrencySelectFragment;
import com.etsy.android.p327ui.user.profile.UserProfileFragment;
import com.etsy.android.p327ui.util.countries.CountrySelectorFragment;
import com.etsy.android.search.C8971c;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.functions.Consumer;
import p193o.C7507j;
import p514bk.C14088a;

/* renamed from: com.etsy.android.g */
public final /* synthetic */ class C6487g implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f14389b;

    /* renamed from: c */
    public final /* synthetic */ Object f14390c;

    public /* synthetic */ C6487g(Object obj, int i) {
        this.f14389b = i;
        this.f14390c = obj;
    }

    public final void accept(Object obj) {
        boolean z;
        switch (this.f14389b) {
            case 0:
                C6490i iVar = (C6490i) this.f14390c;
                Throwable th = (Throwable) obj;
                iVar.getClass();
                C8694h.f19097a.error(th);
                CrashUtil crashUtil = iVar.f14394a;
                if (crashUtil != null) {
                    crashUtil.mo30457b(th);
                    return;
                }
                return;
            case 1:
                String str = (String) this.f14390c;
                C5416d dVar = (C5416d) obj;
                C19383o.m32797g(str, "$userId");
                LogCatKt.m17045a().mo21310e("Braze: Notifying new userid: " + str);
                return;
            case 2:
                C8902h.C8904b bVar = (C8902h.C8904b) this.f14390c;
                List<Country> list = (List) obj;
                bVar.getClass();
                if (!list.isEmpty()) {
                    synchronized (C8902h.f19658a) {
                        try {
                            C7507j<Country> jVar = C8902h.f19659b;
                            int i = jVar.f16750e;
                            Object[] objArr = jVar.f16749d;
                            z = false;
                            for (int i2 = 0; i2 < i; i2++) {
                                objArr[i2] = null;
                            }
                            jVar.f16750e = 0;
                            jVar.f16747b = false;
                            for (Country country : list) {
                                C8902h.f19659b.mo19994h(country.getCountryId(), country);
                            }
                        } catch (Throwable th2) {
                            while (true) {
                                throw th2;
                                break;
                            }
                        }
                    }
                    if (bVar.f19660a != null) {
                        synchronized (C8902h.f19658a) {
                            if (C8902h.f19659b.mo19995i() > 0) {
                                z = true;
                            }
                        }
                        if (z) {
                            bVar.f19660a.mo30491b(C8902h.m17339a());
                            return;
                        } else {
                            bVar.f19660a.mo30490a();
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    C8902h.C8903a aVar = bVar.f19660a;
                    if (aVar != null) {
                        aVar.mo30490a();
                    }
                    C8694h.f19097a.mo21310e("Error loading countries");
                    return;
                }
            case 3:
                C8971c cVar = (C8971c) this.f14390c;
                C19383o.m32797g(cVar, "this$0");
                cVar.f19791c.mo21310e("Variant: " + ((String) obj));
                return;
            case 4:
                ((BOEActivity) this.f14390c).runAddToCartAnimation((C9613a) obj);
                return;
            case 5:
                ((SavedCartItemsFragment) this.f14390c).lambda$onCreateView$0((String) obj);
                return;
            case 6:
                C10384d dVar2 = (C10384d) this.f14390c;
                C10369b bVar2 = (C10369b) obj;
                dVar2.getClass();
                if (C19383o.m32792b(bVar2, C10369b.C10372c.f22726a)) {
                    C14088a.m21780e(dVar2.f22740d, C10385e.C10386a.f22743a);
                    return;
                } else if (C19383o.m32792b(bVar2, C10369b.C10373d.f22727a)) {
                    C14088a.m21780e(dVar2.f22740d, C10385e.C10389d.f22746a);
                    return;
                } else if (bVar2 instanceof C10369b.C10379j) {
                    UiState value = dVar2.f22739c.getValue();
                    if (value != null && (value instanceof UiState.Summary)) {
                        dVar2.f22739c.setValue(UiState.Summary.copy$default((UiState.Summary) value, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (ShippingMethod) null, ((C10369b.C10379j) bVar2).f22733a, (PaymentMethod) null, (List) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, false, 130943, (Object) null));
                        C14088a.m21780e(dVar2.f22740d, C10385e.C10387b.f22744a);
                        return;
                    }
                    return;
                } else if (C19383o.m32792b(bVar2, C10369b.C10375f.f22729a)) {
                    UiState value2 = dVar2.f22739c.getValue();
                    if (value2 != null && (value2 instanceof UiState.Summary)) {
                        C14088a.m21780e(dVar2.f22740d, C10385e.C10391f.f22748a);
                        return;
                    }
                    return;
                } else if (bVar2 instanceof C10369b.C10380k) {
                    UiState value3 = dVar2.f22739c.getValue();
                    if (value3 != null && (value3 instanceof UiState.Summary)) {
                        dVar2.f22739c.setValue(UiState.Summary.copy$default((UiState.Summary) value3, (String) null, (String) null, (String) null, (String) null, (String) null, 0, ((C10369b.C10380k) bVar2).f22734a, (ShippingAddress) null, (PaymentMethod) null, (List) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, false, 131007, (Object) null));
                        C14088a.m21780e(dVar2.f22740d, C10385e.C10387b.f22744a);
                        return;
                    }
                    return;
                } else if (C19383o.m32792b(bVar2, C10369b.C10374e.f22728a)) {
                    C14088a.m21780e(dVar2.f22740d, C10385e.C10390e.f22747a);
                    return;
                } else if (bVar2 instanceof C10369b.C10378i) {
                    UiState value4 = dVar2.f22739c.getValue();
                    if (value4 != null && (value4 instanceof UiState.Summary)) {
                        dVar2.f22739c.setValue(UiState.Summary.copy$default((UiState.Summary) value4, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (ShippingMethod) null, (ShippingAddress) null, ((C10369b.C10378i) bVar2).f22732a, (List) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, false, 130815, (Object) null));
                        C14088a.m21780e(dVar2.f22740d, C10385e.C10387b.f22744a);
                        return;
                    }
                    return;
                } else if (bVar2 instanceof C10369b.C10376g) {
                    UiState value5 = dVar2.f22739c.getValue();
                    if (value5 != null && (value5 instanceof UiState.Summary)) {
                        C14088a.m21780e(dVar2.f22740d, new C10385e.C10394i("Webview checkout should open here"));
                        C14088a.m21780e(dVar2.f22740d, C10385e.C10386a.f22743a);
                        return;
                    }
                    return;
                } else if (C19383o.m32792b(bVar2, C10369b.C10381l.f22735a)) {
                    C14088a.m21780e(dVar2.f22740d, new C10385e.C10394i("Order submitted"));
                    C14088a.m21780e(dVar2.f22740d, C10385e.C10386a.f22743a);
                    return;
                } else if (C19383o.m32792b(bVar2, C10369b.C10377h.f22731a)) {
                    C14088a.m21780e(dVar2.f22740d, C10385e.C10387b.f22744a);
                    return;
                } else if (bVar2 instanceof C10369b.C10382m) {
                    String str2 = ((C10369b.C10382m) bVar2).f22736a;
                    if (str2 != null) {
                        C14088a.m21780e(dVar2.f22740d, new C10385e.C10388c(str2));
                        return;
                    }
                    return;
                } else if (C19383o.m32792b(bVar2, C10369b.C10371b.f22725a)) {
                    C14088a.m21780e(dVar2.f22740d, new C10385e.C10394i("Webview checkout should open here"));
                    C14088a.m21780e(dVar2.f22740d, C10385e.C10386a.f22743a);
                    return;
                } else if (C19383o.m32792b(bVar2, C10369b.C10370a.f22724a)) {
                    C14088a.m21780e(dVar2.f22740d, new C10385e.C10394i("Webview checkout should open here"));
                    C14088a.m21780e(dVar2.f22740d, C10385e.C10386a.f22743a);
                    return;
                } else {
                    return;
                }
            case 7:
                ((BaseShopHomeFragment) this.f14390c).lambda$fetchPageData$0((C11172k0) obj);
                return;
            case 8:
                ((CurrencySelectFragment) this.f14390c).lambda$onLoadContent$0((Throwable) obj);
                return;
            case 9:
                ((UserProfileFragment) this.f14390c).lambda$fetchPageInfo$3((Throwable) obj);
                return;
            default:
                CountrySelectorFragment.m35095initObservers$lambda3((CountrySelectorFragment) this.f14390c, (Country) obj);
                return;
        }
    }
}
