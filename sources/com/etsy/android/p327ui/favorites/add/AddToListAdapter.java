package com.etsy.android.p327ui.favorites.add;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.Listing;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.CheckableListingCollection;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.stylekit.views.CollageAccessibilityGroup;
import com.etsy.android.uikit.view.ListingFullImageView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p260v0.C8184a;
import p425q9.C13265p;
import p435rb.C13350a;
import p435rb.C13351b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.add.AddToListAdapter */
public final class AddToListAdapter extends RecyclerView.Adapter<RecyclerView.C3084b0> {

    /* renamed from: b */
    public final long f21542b;

    /* renamed from: c */
    public final C8672b f21543c;

    /* renamed from: d */
    public final C13265p f21544d;

    /* renamed from: e */
    public List<? extends CheckableListingCollection> f21545e = EmptyList.INSTANCE;

    /* renamed from: f */
    public final C9759d f21546f;

    /* renamed from: com.etsy.android.ui.favorites.add.AddToListAdapter$ViewType */
    public enum ViewType {
        CREATE_COLLECTION,
        COLLECTION
    }

    /* renamed from: com.etsy.android.ui.favorites.add.AddToListAdapter$a */
    public /* synthetic */ class C9744a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21547a;

        static {
            int[] iArr = new int[ViewType.values().length];
            iArr[ViewType.CREATE_COLLECTION.ordinal()] = 1;
            iArr[ViewType.COLLECTION.ordinal()] = 2;
            f21547a = iArr;
        }
    }

    public AddToListAdapter(long j, C8703p pVar, C13265p pVar2, C19857l lVar) {
        C19383o.m32797g(pVar, "analyticsTracker");
        C19383o.m32797g(pVar2, "session");
        this.f21542b = j;
        this.f21543c = pVar;
        this.f21544d = pVar2;
        this.f21546f = new C9759d(lVar);
    }

    public final int getItemCount() {
        return this.f21545e.size();
    }

    public final int getItemViewType(int i) {
        return i == 0 ? ViewType.CREATE_COLLECTION.ordinal() : ViewType.COLLECTION.ordinal();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C19383o.m32797g(b0Var, "holder");
        if (b0Var instanceof C9771l) {
            C9771l lVar = (C9771l) b0Var;
            View view = lVar.itemView;
            ViewExtensions.m12860d((ImageView) view.findViewById(R.id.checkIcon));
            ViewExtensions.m12869m((ImageView) view.findViewById(R.id.plusIcon));
            ViewExtensions.m12860d((ListingFullImageView) view.findViewById(R.id.listingImage));
            ViewExtensions.m12863g((CardView) view.findViewById(R.id.listingCard));
            ViewExtensions.m12860d((TextView) view.findViewById(R.id.subtitle));
            ((TextView) view.findViewById(R.id.collectionName)).setText(R.string.create_new_collection);
            ViewExtensions.m12866j(view, new CreateNewCollectionItemViewHolder$bind$1$1(lVar));
        } else if (b0Var instanceof C9769j) {
            C9769j jVar = (C9769j) b0Var;
            CheckableListingCollection checkableListingCollection = (CheckableListingCollection) this.f21545e.get(i);
            C19383o.m32797g(checkableListingCollection, Collection.TYPE_COLLECTION);
            View view2 = jVar.itemView;
            if (checkableListingCollection.isTypeFavorites()) {
                Context context = jVar.itemView.getContext();
                Object obj = C8184a.f17966a;
                ((ListingFullImageView) jVar.itemView.findViewById(R.id.listingImage)).setImageDrawable(C8184a.C8187c.m16466b(context, R.drawable.ic_heart_red));
                Context context2 = jVar.itemView.getContext();
                C19383o.m32796f(context2, "itemView.context");
                ((ListingFullImageView) jVar.itemView.findViewById(R.id.listingImage)).setBackgroundColor(C13350a.m21013d(context2, R.attr.clg_color_bg_secondary));
                ((ListingFullImageView) jVar.itemView.findViewById(R.id.listingImage)).setScaleType(ImageView.ScaleType.CENTER);
            } else {
                List<Listing> representativeListings = checkableListingCollection.getRepresentativeListings();
                C19383o.m32796f(representativeListings, "collection.representativeListings");
                if (!representativeListings.isEmpty()) {
                    ((ListingFullImageView) jVar.itemView.findViewById(R.id.listingImage)).setAspectRatio(1.0f);
                    ((ListingFullImageView) jVar.itemView.findViewById(R.id.listingImage)).setImageInfo(checkableListingCollection.getRepresentativeListings().get(0).getListingImage(), 2);
                    ((ListingFullImageView) jVar.itemView.findViewById(R.id.listingImage)).setScaleType(ImageView.ScaleType.CENTER);
                } else {
                    Context context3 = jVar.itemView.getContext();
                    Object obj2 = C8184a.f17966a;
                    ((ListingFullImageView) jVar.itemView.findViewById(R.id.listingImage)).setImageDrawable(C8184a.C8187c.m16466b(context3, R.drawable.ic_heart_grey));
                    Context context4 = jVar.itemView.getContext();
                    C19383o.m32796f(context4, "itemView.context");
                    ((ListingFullImageView) jVar.itemView.findViewById(R.id.listingImage)).setBackgroundColor(C13350a.m21013d(context4, R.attr.clg_color_bg_secondary));
                    ((ListingFullImageView) jVar.itemView.findViewById(R.id.listingImage)).setScaleType(ImageView.ScaleType.CENTER);
                }
            }
            ViewExtensions.m12869m((CardView) jVar.itemView.findViewById(R.id.listingCard));
            ViewExtensions.m12869m((ListingFullImageView) jVar.itemView.findViewById(R.id.listingImage));
            ((TextView) view2.findViewById(R.id.collectionName)).setText(checkableListingCollection.getName());
            Context context5 = jVar.itemView.getContext();
            int icon = checkableListingCollection.getPrivacyLevel().getIcon();
            Object obj3 = C8184a.f17966a;
            Drawable b = C8184a.C8187c.m16466b(context5, icon);
            if (b != null) {
                b.setBounds(0, 0, jVar.itemView.getResources().getDimensionPixelSize(R.dimen.clg_icon_size_smaller), jVar.itemView.getResources().getDimensionPixelSize(R.dimen.clg_icon_size_smaller));
            }
            TextView textView = (TextView) jVar.itemView.findViewById(R.id.subtitle);
            C19383o.m32796f(textView, "itemView.subtitle");
            C13351b.m21020d(textView, b, (Drawable) null, 14);
            ((TextView) jVar.itemView.findViewById(R.id.subtitle)).setText(jVar.itemView.getResources().getQuantityString(R.plurals.item_lowercase_quantity, checkableListingCollection.getListingsCount(), new Object[]{Integer.valueOf(checkableListingCollection.getListingsCount())}));
            ((TextView) jVar.itemView.findViewById(R.id.subtitle)).setContentDescription(jVar.itemView.getContext().getString(checkableListingCollection.getPrivacyLevel().getLabel()) + ' ' + ((TextView) jVar.itemView.findViewById(R.id.subtitle)).getText());
            ViewExtensions.m12869m((TextView) jVar.itemView.findViewById(R.id.subtitle));
            jVar.mo32774e(checkableListingCollection);
            ViewExtensions.m12869m((CollageAccessibilityGroup) view2.findViewById(R.id.listingCollectionAccessibilityGroup));
            ViewExtensions.m12866j(view2, new CollectionViewHolder$bind$1$1(jVar, checkableListingCollection));
        }
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        int i2 = C9744a.f21547a[ViewType.values()[i].ordinal()];
        if (i2 == 1) {
            return new C9771l(C0114h.m305j0(viewGroup, R.layout.list_item_collection_add, false), this.f21543c, new AddToListAdapter$onCreateViewHolder$1(this));
        }
        if (i2 == 2) {
            return new C9769j(C0114h.m305j0(viewGroup, R.layout.list_item_collection_add, false), this.f21542b, this.f21543c, this.f21544d, new AddToListAdapter$onCreateViewHolder$2(this));
        }
        throw new NoWhenBranchMatchedException();
    }
}
