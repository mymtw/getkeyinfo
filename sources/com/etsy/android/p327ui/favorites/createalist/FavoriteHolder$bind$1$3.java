package com.etsy.android.p327ui.favorites.createalist;

import android.view.View;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.config.EtsyConfigKey;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingCard;
import com.etsy.android.p327ui.favorites.createalist.C9819k;
import java.util.LinkedHashSet;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.createalist.FavoriteHolder$bind$1$3 */
final class FavoriteHolder$bind$1$3 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ ListingCard $favorite;
    public final /* synthetic */ C9824m this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteHolder$bind$1$3(C9824m mVar, ListingCard listingCard) {
        super(1);
        this.this$0 = mVar;
        this.$favorite = listingCard;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C9824m mVar = this.this$0;
        ListingCard listingCard = this.$favorite;
        mVar.f21722c.getClass();
        C19383o.m32797g(listingCard, ResponseConstants.CARD);
        LinkedHashSet<ListingCard> linkedHashSet = C9816h.f21712b;
        boolean z = false;
        if (!linkedHashSet.contains(listingCard)) {
            C8623e eVar = mVar.f21722c.f21714a.f21770a;
            EtsyConfigKey etsyConfigKey = C8592b.f18736H0;
            if (linkedHashSet.size() < eVar.mo21134d(etsyConfigKey)) {
                mVar.mo32877e(true);
                C9816h hVar = mVar.f21722c;
                hVar.getClass();
                if (linkedHashSet.size() < hVar.f21714a.f21770a.mo21134d(etsyConfigKey)) {
                    z = true;
                }
                if (z) {
                    linkedHashSet.add(listingCard);
                    C9816h.f21713c.onNext(linkedHashSet);
                }
                C9823l lVar = mVar.f21721b;
                C9819k.C9821b bVar = new C9819k.C9821b(listingCard);
                lVar.getClass();
                lVar.f21719a.invoke(bVar);
                return;
            }
            C9823l lVar2 = mVar.f21721b;
            C9819k.C9822c cVar = C9819k.C9822c.f21718a;
            lVar2.getClass();
            C19383o.m32797g(cVar, "event");
            lVar2.f21719a.invoke(cVar);
            return;
        }
        mVar.f21722c.getClass();
        linkedHashSet.remove(listingCard);
        C9816h.f21713c.onNext(linkedHashSet);
        mVar.mo32877e(false);
        C9823l lVar3 = mVar.f21721b;
        C9819k.C9820a aVar = new C9819k.C9820a(listingCard);
        lVar3.getClass();
        lVar3.f21719a.invoke(aVar);
    }
}
