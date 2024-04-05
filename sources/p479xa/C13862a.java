package p479xa;

import android.view.View;
import com.etsy.android.lib.models.apiv3.ShopCard;
import com.etsy.android.lib.toolbar.AdminToolbarActivity;
import com.etsy.android.lib.toolbar.AdminToolbarNetworkResponse;
import com.etsy.android.p327ui.cardview.viewholders.ReviewCardViewHolder;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.buybox.estimateddelivery.C10253a;
import com.etsy.android.p327ui.listing.p329ui.buybox.estimateddelivery.C10257d;
import com.etsy.android.p327ui.search.shopresults.C10935a;
import com.etsy.android.p327ui.user.purchases.reviewcarousel.C11675c;
import com.etsy.android.p327ui.user.review.C11756y;
import com.etsy.android.p327ui.you.C11806c;
import com.etsy.android.p327ui.you.C11816d;
import com.etsy.android.p327ui.you.C11818f;
import kotlin.jvm.internal.C19383o;
import p466vc.C13597g;

/* renamed from: xa.a */
public final /* synthetic */ class C13862a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f30495b;

    /* renamed from: c */
    public final /* synthetic */ Object f30496c;

    /* renamed from: d */
    public final /* synthetic */ Object f30497d;

    public /* synthetic */ C13862a(int i, Object obj, Object obj2) {
        this.f30495b = i;
        this.f30496c = obj;
        this.f30497d = obj2;
    }

    public final void onClick(View view) {
        switch (this.f30495b) {
            case 0:
                ((AdminToolbarActivity) this.f30496c).lambda$getJSONResponseButton$0((AdminToolbarNetworkResponse) this.f30497d, view);
                return;
            case 1:
                ReviewCardViewHolder reviewCardViewHolder = (ReviewCardViewHolder) this.f30496c;
                C11675c cVar = (C11675c) this.f30497d;
                int i = ReviewCardViewHolder.f20117g;
                C19383o.m32797g(reviewCardViewHolder, "this$0");
                C19383o.m32797g(cVar, "$reviewCarouselItem");
                reviewCardViewHolder.f20119c.mo31328c(new C11756y.C11757a(cVar.f25857a, cVar.f25858b));
                return;
            case 2:
                C10257d dVar = (C10257d) this.f30496c;
                C10423j jVar = (C10423j) this.f30497d;
                int i2 = C10257d.f22540d;
                C19383o.m32797g(dVar, "this$0");
                C19383o.m32797g(jVar, "$uiModel");
                dVar.f22541b.mo38043a(new C13597g.C13627e0(((C10253a) jVar).f22538c));
                return;
            case 3:
                C10935a aVar = (C10935a) this.f30496c;
                ShopCard shopCard = (ShopCard) this.f30497d;
                int i3 = C10935a.f24274i;
                C19383o.m32797g(aVar, "this$0");
                C19383o.m32797g(shopCard, "$shopCard");
                aVar.f24275c.invoke(Long.valueOf(shopCard.getShopId().getIdAsLong()));
                return;
            default:
                C11816d dVar2 = (C11816d) this.f30496c;
                C11806c cVar2 = (C11806c) this.f30497d;
                int i4 = C11818f.f26297d;
                C19383o.m32797g(dVar2, "$listener");
                C19383o.m32797g(cVar2, "$menuOption");
                dVar2.onOptionClick(cVar2);
                return;
        }
    }
}
