package com.etsy.android.p327ui.search.shopresults;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.bumptech.glide.C5959e;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.C6085i;
import com.bumptech.glide.load.resource.bitmap.C6105w;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ShopCard;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.vespa.viewholders.C12086e;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p479xa.C13862a;
import p568fn.C17782b;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.shopresults.a */
public final class C10935a extends C12086e<ShopCard> {

    /* renamed from: i */
    public static final /* synthetic */ int f24274i = 0;

    /* renamed from: c */
    public final C19857l<Long, C19394m> f24275c;

    /* renamed from: d */
    public final List<ImageView> f24276d;

    /* renamed from: e */
    public final ImageView f24277e;

    /* renamed from: f */
    public final TextView f24278f;

    /* renamed from: g */
    public final View f24279g;

    /* renamed from: h */
    public final TextView f24280h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10935a(ViewGroup viewGroup, C19857l<? super Long, C19394m> lVar) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_card_shop_search_result, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(lVar, "onShopCardClicked");
        this.f24275c = lVar;
        View findViewById = this.itemView.findViewById(R.id.img_item_1);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.img_item_1)");
        View findViewById2 = this.itemView.findViewById(R.id.img_item_2);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.img_item_2)");
        View findViewById3 = this.itemView.findViewById(R.id.img_item_3);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.img_item_3)");
        this.f24276d = C17782b.m29865e0((ImageView) findViewById, (ImageView) findViewById2, (ImageView) findViewById3);
        View findViewById4 = this.itemView.findViewById(R.id.shop_avatar);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.id.shop_avatar)");
        this.f24277e = (ImageView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.shop_name);
        C19383o.m32796f(findViewById5, "itemView.findViewById(R.id.shop_name)");
        this.f24278f = (TextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.icon_location);
        C19383o.m32796f(findViewById6, "itemView.findViewById(R.id.icon_location)");
        this.f24279g = findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.shop_location);
        C19383o.m32796f(findViewById7, "itemView.findViewById(R.id.shop_location)");
        this.f24280h = (TextView) findViewById7;
    }

    /* renamed from: g */
    public final void mo19450a(ShopCard shopCard) {
        C19383o.m32797g(shopCard, ShopCard.SHOP_CARD);
        this.f24278f.setText(shopCard.getShopName());
        int i = 0;
        for (T next : this.f24276d) {
            int i2 = i + 1;
            ListingImage listingImage = null;
            if (i >= 0) {
                ImageView imageView = (ImageView) next;
                List<? extends ListingLike> cardListings = shopCard.getCardListings();
                C19383o.m32796f(cardListings, "shopCard.cardListings");
                ListingLike listingLike = (ListingLike) C19327t.m32641W0(i, cardListings);
                if (listingLike != null) {
                    listingImage = listingLike.getListingImage();
                }
                if (listingImage != null) {
                    ((C5959e) Glide.with((View) imageView).load(listingImage.get4to3ImageUrlForPixelWidth(imageView.getWidth())).mo17160t(new ColorDrawable(listingImage.getImageColor()))).mo16816M(imageView);
                } else if (i == this.f24276d.size() - 1) {
                    imageView.setBackgroundResource(R.drawable.bg_empty_image);
                } else {
                    imageView.setBackgroundResource(R.drawable.bg_empty_image_right_divider);
                }
                i = i2;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
        String location = shopCard.getLocation();
        if (C18263b.m30837c0(location)) {
            ViewExtensions.m12869m(this.f24279g);
            ViewExtensions.m12869m(this.f24280h);
            this.f24280h.setText(location);
        } else {
            ViewExtensions.m12860d(this.f24279g);
            ViewExtensions.m12860d(this.f24280h);
        }
        ((C5959e) Glide.with((View) this.f24277e).load(shopCard.getAvatarUrl()).mo17142E(new C6085i(), new C6105w(this.f24277e.getContext().getResources().getDimensionPixelOffset(R.dimen.clg_space_4)))).mo16816M(this.f24277e);
        this.itemView.setOnClickListener(new C13862a(3, this, shopCard));
    }
}
