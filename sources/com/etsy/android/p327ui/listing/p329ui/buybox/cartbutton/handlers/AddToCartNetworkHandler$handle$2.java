package com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers;

import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.apiv3.sdl.BasicSectionHeader;
import com.etsy.android.lib.models.apiv3.sdl.ServerDrivenAction;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.bottomsheet.C10207g;
import com.etsy.android.p327ui.user.AddToCartResponse;
import com.etsy.android.p327ui.user.Recommendations;
import com.etsy.android.uikit.viewholder.ListingCardUiModel;
import com.etsy.android.vespa.IVespaListSectionHeader;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19543e0;
import p466vc.C13573c;
import p466vc.C13597g;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.cartbutton.handlers.AddToCartNetworkHandler$handle$2 */
public final class AddToCartNetworkHandler$handle$2 extends Lambda implements C19857l<AddToCartResponse, C19394m> {
    public final /* synthetic */ C13597g.C13626e $event;
    public final /* synthetic */ ListingViewState.C10092d $state;
    public final /* synthetic */ AddToCartNetworkHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddToCartNetworkHandler$handle$2(AddToCartNetworkHandler addToCartNetworkHandler, C13597g.C13626e eVar, ListingViewState.C10092d dVar) {
        super(1);
        this.this$0 = addToCartNetworkHandler;
        this.$event = eVar;
        this.$state = dVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AddToCartResponse) obj);
        return C19394m.f43287a;
    }

    public final void invoke(AddToCartResponse addToCartResponse) {
        C19394m mVar;
        ListingImage listingImage;
        List<ListingCard> list;
        AddToCartResponse addToCartResponse2 = addToCartResponse;
        Integer num = addToCartResponse2.f24990a;
        if (num != null) {
            this.this$0.f22500f.mo31438c(num.intValue());
            mVar = C19394m.f43287a;
        } else {
            mVar = null;
        }
        if (mVar == null) {
            this.this$0.f22500f.mo31437b();
        }
        this.this$0.f22495a.mo38043a(C13597g.C13719r1.f30235a);
        if (this.$event.f30102a) {
            this.this$0.f22495a.mo38043a(C13597g.C13751v5.f30279a);
        } else if (this.$state.f22236d.f22251e) {
            Recommendations recommendations = addToCartResponse2.f24991b;
            boolean z = true;
            if (recommendations == null || (list = recommendations.f25015a) == null || !C19543e0.m33306Y(list)) {
                z = false;
            }
            if (z) {
                C13573c cVar = this.this$0.f22495a;
                List<ListingImage> listingImages = this.$state.f22239g.getListingImages();
                if (listingImages == null || (listingImage = listingImages.get(0)) == null) {
                    listingImage = new ListingImage((String) null, 0, 0, 0, (String) null, (String) null, 0, (Integer) null, (EtsyId) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, 0, 0, (Integer) null, (Integer) null, (Long) null, (String) null, 0, (String) null, (String) null, false, -1, 7, (DefaultConstructorMarker) null);
                }
                AddToCartNetworkHandler addToCartNetworkHandler = this.this$0;
                List<ListingCard> list2 = addToCartResponse2.f24991b.f25015a;
                addToCartNetworkHandler.getClass();
                ArrayList arrayList = new ArrayList();
                BasicSectionHeader basicSectionHeader = r9;
                BasicSectionHeader basicSectionHeader2 = new BasicSectionHeader(addToCartNetworkHandler.f22502h.mo38059c(R.string.add_to_cart_interstitial_section_title, new Object[0]), (String) null, (String) null, (ServerDrivenAction) null, C17782b.m29864d0(IVespaListSectionHeader.Style.EXTRA_PADDING), 14, (DefaultConstructorMarker) null);
                arrayList.add(basicSectionHeader);
                for (ListingCard listingCard : list2) {
                    listingCard.setShouldShowRelatedListings(false);
                    arrayList.add(new ListingCardUiModel(listingCard, true, false, false, 8, (DefaultConstructorMarker) null));
                }
                cVar.mo38043a(new C13597g.C13763x3(new C10207g(listingImage, arrayList)));
            }
        }
    }
}
