package com.etsy.android.lib.util;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.apiv3.Alert;
import com.etsy.android.lib.util.C8902h;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.conversation.details.legacy.LegacyConversationDetailsFragment;
import com.etsy.android.p327ui.home.home.HomeViewModel;
import com.etsy.android.p327ui.search.filters.C10767e;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11012q;
import com.etsy.android.p327ui.shop.BaseShopHomeFragment;
import com.etsy.android.p327ui.util.countries.CountrySelectorFragment;
import com.jakewharton.rxbinding2.widget.C17025m;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.functions.Consumer;
import p428qc.C13286d;

/* renamed from: com.etsy.android.lib.util.i */
public final /* synthetic */ class C8905i implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f19661b;

    /* renamed from: c */
    public final /* synthetic */ Object f19662c;

    public /* synthetic */ C8905i(Object obj, int i) {
        this.f19661b = i;
        this.f19662c = obj;
    }

    public final void accept(Object obj) {
        switch (this.f19661b) {
            case 0:
                Throwable th = (Throwable) obj;
                C8902h.C8903a aVar = ((C8902h.C8904b) this.f19662c).f19660a;
                if (aVar != null) {
                    aVar.mo30490a();
                }
                C8694h hVar = C8694h.f19097a;
                hVar.error(th);
                hVar.mo21310e("Error loading countries");
                return;
            case 1:
                ((C8694h) this.f19662c).error((Throwable) obj);
                return;
            case 2:
                ((BOEActivity) this.f19662c).showAlert((Alert) obj);
                return;
            case 3:
                LegacyConversationDetailsFragment.m34948onCreateView$lambda1((LegacyConversationDetailsFragment) this.f19662c, (C17025m) obj);
                return;
            case 4:
                HomeViewModel homeViewModel = (HomeViewModel) this.f19662c;
                C13286d dVar = (C13286d) obj;
                homeViewModel.getClass();
                if (dVar instanceof C13286d.C13288b) {
                    homeViewModel.mo33216e(false);
                    return;
                } else if (dVar instanceof C13286d.C13289c) {
                    homeViewModel.mo33216e(true);
                    return;
                } else {
                    return;
                }
            case 5:
                C10767e eVar = (C10767e) this.f19662c;
                C11012q qVar = (C11012q) obj;
                C19383o.m32797g(eVar, "this$0");
                if (qVar instanceof C11012q.C11014b) {
                    eVar.f23752q.onNext(((C11012q.C11014b) qVar).f24415a);
                    return;
                } else if (qVar instanceof C11012q.C11013a) {
                    eVar.mo35746j(((C11012q.C11013a) qVar).f24414a);
                    return;
                } else {
                    return;
                }
            case 6:
                ((BaseShopHomeFragment) this.f19662c).lambda$fetchPageData$1((Throwable) obj);
                return;
            default:
                CountrySelectorFragment.m35096initObservers$lambda4((CountrySelectorFragment) this.f19662c, (Throwable) obj);
                return;
        }
    }
}
