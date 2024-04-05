package com.etsy.android.p327ui.cardview.viewholders;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.Listing;
import com.etsy.android.lib.models.UserCollection;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.p327ui.cardview.clickhandlers.C9129l;
import com.etsy.android.uikit.view.ListingFullImageView;
import com.etsy.android.vespa.viewholders.C12086e;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;
import p435rb.C13351b;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.cardview.viewholders.ListingCollectionViewHolder */
public final class ListingCollectionViewHolder extends C12086e<Collection> {

    /* renamed from: c */
    public final C9129l f20101c;

    /* renamed from: d */
    public final LinearLayout f20102d;

    /* renamed from: e */
    public final TextView f20103e;

    /* renamed from: f */
    public final TextView f20104f;

    public ListingCollectionViewHolder(ViewGroup viewGroup, C9129l lVar) {
        super(C13983i.m21489h(viewGroup, "itemView", R.layout.list_item_collection, viewGroup, false));
        this.f20101c = lVar;
        View f = mo38986f(R.id.image_layout);
        C19383o.m32795e(f, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.f20102d = (LinearLayout) f;
        View f2 = mo38986f(R.id.title);
        C19383o.m32795e(f2, "null cannot be cast to non-null type android.widget.TextView");
        this.f20103e = (TextView) f2;
        View f3 = mo38986f(R.id.subtitle);
        C19383o.m32795e(f3, "null cannot be cast to non-null type android.widget.TextView");
        this.f20104f = (TextView) f3;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        Collection collection = (Collection) obj;
        C19383o.m32797g(collection, Collection.TYPE_COLLECTION);
        mo31382g(new UserCollection(collection, (String) null, (String) null, 6, (DefaultConstructorMarker) null));
    }

    /* renamed from: g */
    public final void mo31382g(UserCollection userCollection) {
        LinearLayout linearLayout = this.f20102d;
        List<Listing> representativeListings = userCollection.getCollection().getRepresentativeListings();
        C19383o.m32796f(representativeListings, "userCollection.collection.representativeListings");
        linearLayout.removeAllViews();
        int integer = this.itemView.getResources().getInteger(R.integer.card_item_list_count);
        int i = 0;
        while (true) {
            ListingImage listingImage = null;
            if (i >= integer) {
                break;
            }
            ListingLike listingLike = (ListingLike) C19327t.m32641W0(i, representativeListings);
            if (listingLike != null) {
                listingImage = listingLike.getListingImage();
            }
            Context context = linearLayout.getContext();
            C19383o.m32796f(context, "imageLayout.context");
            ListingFullImageView listingFullImageView = new ListingFullImageView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            listingFullImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            listingFullImageView.setUseStandardRatio(true);
            listingFullImageView.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (listingImage != null) {
                listingFullImageView.setImageInfo(listingImage);
            } else if (i == integer - 1) {
                listingFullImageView.setBackgroundResource(R.drawable.bg_empty_image);
            } else {
                listingFullImageView.setBackgroundResource(R.drawable.bg_empty_image_right_divider);
            }
            linearLayout.addView(listingFullImageView);
            i++;
        }
        this.f20103e.setText(userCollection.getCollection().getName());
        this.f20104f.setText(this.itemView.getResources().getQuantityString(R.plurals.item_lowercase_quantity, userCollection.getCollection().getListingsCount(), new Object[]{C8885d0.m17318b((double) userCollection.getCollection().getListingsCount())}));
        this.f20104f.setContentDescription(this.itemView.getContext().getString(userCollection.getCollection().getPrivacyLevel().getLabel()) + ' ' + this.f20104f.getText());
        Context context2 = this.itemView.getContext();
        int icon = userCollection.getCollection().getPrivacyLevel().getIcon();
        Object obj = C8184a.f17966a;
        Drawable b = C8184a.C8187c.m16466b(context2, icon);
        if (b != null) {
            b.setBounds(0, 0, this.itemView.getResources().getDimensionPixelSize(R.dimen.clg_icon_size_smaller), this.itemView.getResources().getDimensionPixelSize(R.dimen.clg_icon_size_smaller));
        }
        C13351b.m21020d(this.f20104f, b, (Drawable) null, 14);
        View view = this.itemView;
        C19383o.m32796f(view, "itemView");
        ViewExtensions.m12866j(view, new ListingCollectionViewHolder$bind$1(this, userCollection));
    }
}
