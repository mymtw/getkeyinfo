package com.etsy.android.p327ui.user.inappnotifications;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.text.font.C1948d;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.resource.bitmap.C6085i;
import com.bumptech.glide.load.resource.bitmap.C6105w;
import com.bumptech.glide.request.C6128g;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.core.img.GlideRequests;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard;
import com.etsy.android.lib.models.apiv3.inappnotifications.extensions.InAppNotificationListingCardExtensionKt;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.stylekit.views.FavHeartButton;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p455u9.C13448b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.c */
public final class C11548c extends RecyclerView.Adapter<C11577t> {

    /* renamed from: b */
    public final List<IANListingCard> f25544b;

    /* renamed from: c */
    public final C8672b f25545c;

    /* renamed from: d */
    public final C19857l<C11573r, C19394m> f25546d;

    public C11548c(List<IANListingCard> list, C8672b bVar, C19857l<? super C11573r, C19394m> lVar) {
        C19383o.m32797g(bVar, "analyticsTracker");
        this.f25544b = list;
        this.f25545c = bVar;
        this.f25546d = lVar;
    }

    public final int getItemCount() {
        List<IANListingCard> list = this.f25544b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C11577t tVar = (C11577t) b0Var;
        C19383o.m32797g(tVar, "holder");
        if (C19543e0.m33306Y(this.f25544b)) {
            IANListingCard iANListingCard = this.f25544b.get(i);
            C19383o.m32797g(iANListingCard, ResponseConstants.LISTING);
            View view = tVar.itemView;
            Context context = view.getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            int i2 = (int) (((float) context.getResources().getDisplayMetrics().widthPixels) / (C1948d.m4275g(context) ? 3.32f : 2.32f));
            ImageView imageView = (ImageView) view.findViewById(R.id.in_app_notify_image);
            imageView.getLayoutParams().width = i2;
            imageView.getLayoutParams().height = (int) (((float) i2) * 0.75f);
            GlideRequests B0 = C0114h.m270B0(view.getContext());
            ListingImage img = iANListingCard.getImg();
            C13448b load = B0.load(img != null ? C0761x.m1711b1(img, i2) : null);
            C6128g gVar = new C6128g();
            Context context2 = view.getContext();
            C19383o.m32796f(context2, ResponseConstants.CONTEXT);
            boolean z = true;
            load.mo16829a(gVar.mo17143F(new C6085i(), new C6105w(C19543e0.m33295K(4, context2)))).mo16816M(imageView);
            String title = iANListingCard.getTitle();
            if (title == null) {
                title = iANListingCard.getListingTitle();
            }
            imageView.setContentDescription(title);
            Long listingId = iANListingCard.getListingId();
            if (listingId != null) {
                listingId.longValue();
                ViewExtensions.m12866j(imageView, new ListingViewHolder$bind$1$1$1(tVar, iANListingCard));
            }
            if (InAppNotificationListingCardExtensionKt.unavailableListing(iANListingCard)) {
                imageView.setAlpha(0.5f);
            } else {
                imageView.setAlpha(1.0f);
            }
            view.getContext().getResources();
            FavHeartButton favHeartButton = (FavHeartButton) view.findViewById(R.id.favorite_button);
            String title2 = iANListingCard.getTitle();
            if (title2 == null) {
                title2 = iANListingCard.getListingTitle();
            }
            ViewExtensions.m12869m(favHeartButton);
            C19383o.m32796f(favHeartButton, "");
            ViewExtensions.m12866j(favHeartButton, new ListingViewHolder$bindFavoriteAddToList$1$1(tVar, iANListingCard, favHeartButton));
            if (!iANListingCard.isFavorite() && !iANListingCard.isInCollections()) {
                z = false;
            }
            if (title2 == null) {
                title2 = "";
            }
            favHeartButton.setFav(z, title2, false);
        }
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        return new C11577t(C0114h.m305j0(viewGroup, R.layout.list_item_in_app_notifications_carousel, false), this.f25545c, this.f25546d);
    }
}
