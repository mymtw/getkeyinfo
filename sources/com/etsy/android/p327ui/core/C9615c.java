package com.etsy.android.p327ui.core;

import android.content.Context;
import androidx.compose.animation.C0472h;
import com.braze.C5416d;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.p327ui.home.tabs.C10053c;
import com.etsy.android.p327ui.listing.fetch.C10137a;
import com.etsy.android.p327ui.listing.p329ui.buybox.freeshipping.C10259b;
import com.etsy.android.p327ui.listing.p329ui.listingimages.handlers.C10434f;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.C10527a;
import com.etsy.android.p327ui.listing.screenshots.C10190a;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10993f;
import com.etsy.android.p327ui.shop.C11139d0;
import com.etsy.android.p327ui.shop.C11305w0;
import com.etsy.android.p327ui.shop.C11309y0;
import com.etsy.android.p327ui.user.purchases.C11651i;
import com.etsy.android.uikit.nav.transactions.TransactionDataRepository;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.subjects.C19254a;
import p350fe.C12741o;
import p402n9.C13092l;
import p466vc.C13573c;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.core.c */
public final class C9615c implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f21307a;

    /* renamed from: b */
    public final C19011a f21308b;

    public /* synthetic */ C9615c(C19011a aVar, int i) {
        this.f21307a = i;
        this.f21308b = aVar;
    }

    public final Object get() {
        switch (this.f21307a) {
            case 0:
                return new C9614b((C12741o) this.f21308b.get());
            case 1:
                return new C10053c((C8618c) this.f21308b.get());
            case 2:
                return new C10137a((C13573c) this.f21308b.get());
            case 3:
                return new C10190a((C13573c) this.f21308b.get());
            case 4:
                return new C10259b((C13573c) this.f21308b.get());
            case 5:
                return new C10434f((C13573c) this.f21308b.get());
            case 6:
                return new C10527a((TransactionDataRepository) this.f21308b.get());
            case 7:
                return new C10993f((Context) this.f21308b.get());
            case 8:
                return new C11139d0((C8623e) this.f21308b.get());
            case 9:
                return new C11309y0((C11305w0) this.f21308b.get());
            case 10:
                return new C11651i((C8618c) this.f21308b.get());
            default:
                C13092l lVar = (C13092l) this.f21308b.get();
                C19383o.m32797g(lVar, "brazeInit");
                C19254a<C5416d> aVar = lVar.f28787h;
                return C0472h.m1241b(aVar, aVar);
        }
    }
}
