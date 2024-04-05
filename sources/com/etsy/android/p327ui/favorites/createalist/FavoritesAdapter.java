package com.etsy.android.p327ui.favorites.createalist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.C0114h;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingCard;
import com.etsy.android.uikit.adapter.C11832c;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.subjects.PublishSubject;

/* renamed from: com.etsy.android.ui.favorites.createalist.FavoritesAdapter */
public final class FavoritesAdapter extends C11832c<ListingCard> {

    /* renamed from: c */
    public final C9816h f21673c;

    /* renamed from: d */
    public final PublishSubject<C9819k> f21674d = new PublishSubject<>();

    /* renamed from: e */
    public final C9823l f21675e = new C9823l(new FavoritesAdapter$clickEventDispatcher$1(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritesAdapter(FragmentActivity fragmentActivity, C9816h hVar) {
        super(fragmentActivity);
        C19383o.m32797g(hVar, "repo");
        this.f21673c = hVar;
    }

    public final int getListItemViewType(int i) {
        return 0;
    }

    public final void onBindListItemViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        ListingCard listingCard = (ListingCard) this.mItems.get(i);
        if (b0Var != null && (b0Var instanceof C9824m)) {
            C9824m mVar = (C9824m) b0Var;
            C19383o.m32796f(listingCard, "item");
            Context context = mVar.itemView.getContext();
            View view = mVar.itemView;
            ImageView imageView = (ImageView) view.findViewById(R.id.favorites_create_list_image);
            C19383o.m32796f(imageView, "favorites_create_list_image");
            imageView.addOnLayoutChangeListener(new FavoriteHolder$bind$lambda2$$inlined$doOnNextLayout$1(view, context, listingCard));
            ImageView imageView2 = (ImageView) view.findViewById(R.id.favorites_create_list_image);
            imageView2.setContentDescription(listingCard.getTitle());
            ViewExtensions.m12869m(imageView2);
            mVar.f21722c.getClass();
            mVar.mo32877e(C9816h.f21712b.contains(listingCard));
            ImageView imageView3 = (ImageView) view.findViewById(R.id.favorites_create_list_image);
            C19383o.m32796f(imageView3, "favorites_create_list_image");
            ViewExtensions.m12867k(imageView3, false, new FavoriteHolder$bind$1$3(mVar, listingCard));
        }
    }

    public final RecyclerView.C3084b0 onCreateListItemViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        int i2 = C9824m.f21720d;
        return new C9824m(C0114h.m305j0(viewGroup, R.layout.list_item_favorites_create_list, false), this.f21675e, this.f21673c);
    }
}
