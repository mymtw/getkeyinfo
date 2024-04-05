package com.etsy.android.p327ui.user.inappnotifications;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.inappnotifications.IANShopCard;
import com.etsy.android.lib.models.apiv3.inappnotifications.IANShopRating;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.p327ui.user.inappnotifications.IANShopUiModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.i */
public final class C11556i extends RecyclerView.Adapter<C11583w> {

    /* renamed from: b */
    public final List<IANShopCard> f25592b;

    /* renamed from: c */
    public final C8672b f25593c;

    /* renamed from: d */
    public final C19857l<C11580v, C19394m> f25594d;

    public C11556i(List<IANShopCard> list, C8672b bVar, C19857l<? super C11580v, C19394m> lVar) {
        C19383o.m32797g(list, "shops");
        C19383o.m32797g(bVar, "analyticsTracker");
        this.f25592b = list;
        this.f25593c = bVar;
        this.f25594d = lVar;
    }

    public final int getItemCount() {
        return this.f25592b.size();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C11583w wVar = (C11583w) b0Var;
        C19383o.m32797g(wVar, "holder");
        IANShopCard iANShopCard = this.f25592b.get(i);
        C19383o.m32797g(iANShopCard, ResponseConstants.SHOP);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            String str = null;
            if (i2 >= 4 || i2 >= iANShopCard.getDisplayListings().size()) {
                C11557j jVar = new C11557j(iANShopCard.getUserId(), iANShopCard.getShopId(), iANShopCard.getShopName(), wVar.f25672b);
                String shopName = iANShopCard.getShopName();
                IANShopRating rating = iANShopCard.getRating();
            } else {
                ListingImage img = iANShopCard.getDisplayListings().get(i2).getImg();
                if (img != null) {
                    str = C0761x.m1711b1(img, wVar.f25673c);
                }
                if (str != null) {
                    arrayList.add(str);
                }
                i2++;
            }
        }
        C11557j jVar2 = new C11557j(iANShopCard.getUserId(), iANShopCard.getShopId(), iANShopCard.getShopName(), wVar.f25672b);
        String shopName2 = iANShopCard.getShopName();
        IANShopRating rating2 = iANShopCard.getRating();
        Float rating3 = rating2 != null ? rating2.getRating() : null;
        IANShopRating rating4 = iANShopCard.getRating();
        IANShopUiModel iANShopUiModel = new IANShopUiModel(shopName2, rating3, rating4 != null ? Integer.valueOf(rating4.getRatingCount()) : null, iANShopCard.isFavorite(), iANShopCard.getSellerAvatarUrl(), arrayList, IANShopUiModel.ShopCardType.SCROLLING_SHOP);
        IANShopCardViewHolderBinder iANShopCardViewHolderBinder = new IANShopCardViewHolderBinder();
        View view = wVar.itemView;
        C19383o.m32796f(view, "itemView");
        iANShopCardViewHolderBinder.mo37431a(view, iANShopUiModel, jVar2);
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        return new C11583w(C0114h.m305j0(viewGroup, R.layout.list_item_scrolling_shop, false), this.f25593c, this.f25594d);
    }

    public final void onViewRecycled(RecyclerView.C3084b0 b0Var) {
        C11583w wVar = (C11583w) b0Var;
        C19383o.m32797g(wVar, "holder");
        super.onViewRecycled(wVar);
        C0114h.m272C0(wVar.itemView).clear((View) (ImageView) wVar.itemView.findViewById(R.id.shop_avatar));
    }
}
