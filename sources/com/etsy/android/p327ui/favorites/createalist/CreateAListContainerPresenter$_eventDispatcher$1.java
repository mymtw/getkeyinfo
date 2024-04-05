package com.etsy.android.p327ui.favorites.createalist;

import android.os.Bundle;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.PlatformAnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.UserCollection;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.lib.models.apiv3.listing.ListingCard;
import com.etsy.android.p327ui.favorites.C9833d;
import com.etsy.android.p327ui.favorites.createalist.C9803e;
import java.util.ArrayList;
import java.util.Set;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p356ge.C12788a;
import p356ge.C12790b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.createalist.CreateAListContainerPresenter$_eventDispatcher$1 */
public final class CreateAListContainerPresenter$_eventDispatcher$1 extends Lambda implements C19857l<C9803e, C19394m> {
    public final /* synthetic */ CreateAListContainerPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateAListContainerPresenter$_eventDispatcher$1(CreateAListContainerPresenter createAListContainerPresenter) {
        super(1);
        this.this$0 = createAListContainerPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9803e) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C9803e eVar) {
        C9803e eVar2 = eVar;
        C19383o.m32797g(eVar2, "event");
        if (eVar2 instanceof C9803e.C9809f) {
            this.this$0.mo32796b(((C9803e.C9809f) eVar2).f21699a);
        } else if (eVar2 instanceof C9803e.C9807d) {
            this.this$0.mo32796b(true);
        } else if (eVar2 instanceof C9803e.C9806c) {
            CreateAListContainerPresenter createAListContainerPresenter = this.this$0;
            createAListContainerPresenter.mo32795a(createAListContainerPresenter.f21660f);
        } else if (eVar2 instanceof C9803e.C9808e) {
            this.this$0.f21660f = ((C9803e.C9808e) eVar2).f21698a;
        } else if (eVar2 instanceof C9803e.C9804a) {
            this.this$0.f21656b.getChildFragmentManager().mo10364Q();
        } else if (eVar2 instanceof C9803e.C9805b) {
            CreateAListContainerPresenter createAListContainerPresenter2 = this.this$0;
            C9803e.C9805b bVar = (C9803e.C9805b) eVar2;
            Collection collection = bVar.f21694a;
            Set<ListingCard> set = bVar.f21695b;
            C8672b bVar2 = createAListContainerPresenter2.f21657c;
            Pair[] pairArr = new Pair[6];
            pairArr[0] = new Pair(PredefinedAnalyticsProperty.COLLECTION_KEY, collection.getKey());
            pairArr[1] = new Pair(PredefinedAnalyticsProperty.COLLECTION_NAME, collection.getName());
            pairArr[2] = new Pair(PredefinedAnalyticsProperty.COLLECTION_ID, Long.valueOf(collection.getCollectionId().getIdAsLongDeprecated()));
            pairArr[3] = new Pair(PredefinedAnalyticsProperty.COLLECTION_SLUG, collection.getSlug());
            pairArr[4] = new Pair(PlatformAnalyticsProperty.USER_ID, Long.valueOf(createAListContainerPresenter2.f21659e.mo45958c().getIdAsLongDeprecated()));
            PredefinedAnalyticsProperty predefinedAnalyticsProperty = PredefinedAnalyticsProperty.LISTING_IDS;
            ArrayList arrayList = new ArrayList(C19322o.m32624F0(set));
            for (ListingCard listingId : set) {
                arrayList.add(listingId.getListingId());
            }
            pairArr[5] = new Pair(predefinedAnalyticsProperty, arrayList);
            bVar2.mo21333d("favorites_list_created", C19294b0.m32562s0(pairArr));
            C12788a.m20424c(this.this$0.f21656b.getActivity(), C9833d.m18091a(new C9833d(), C12790b.m20432d(this.this$0.f21656b), this.this$0.f21659e, new UserCollection(bVar.f21694a, (String) null, (String) null, 6, (DefaultConstructorMarker) null), (Bundle) null, (String) null, (String) null, false, false, true, 240));
            this.this$0.mo32795a(false);
        }
    }
}
