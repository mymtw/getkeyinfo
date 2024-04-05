package p422pe;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.apiv3.ListingCard;
import java.util.HashSet;
import kotlin.jvm.internal.C19383o;
import p415of.C13173c;
import p415of.C13186o;

/* renamed from: pe.g */
public final class C13228g extends RecyclerView.C3108s {

    /* renamed from: b */
    public boolean f29076b;

    /* renamed from: c */
    public HashSet<String> f29077c = new HashSet<>();

    /* renamed from: d */
    public C13229a f29078d;

    /* renamed from: pe.g$a */
    public interface C13229a {
        void onListingCardShown(ListingCard listingCard);
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C19383o.m32797g(recyclerView, "recyclerView");
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C19383o.m32797g(recyclerView, "recyclerView");
        if (this.f29076b) {
            RecyclerView.C3100o layoutManager = recyclerView.getLayoutManager();
            C19383o.m32795e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            int S0 = gridLayoutManager.mo11282S0();
            int U0 = gridLayoutManager.mo11284U0();
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            C19383o.m32795e(adapter, "null cannot be cast to non-null type com.etsy.android.vespa.BaseViewHolderFactoryRecyclerViewAdapter");
            C13173c cVar = (C13173c) adapter;
            if (S0 != -1 && U0 != -1 && S0 <= U0) {
                while (true) {
                    C13186o oVar = (C13186o) cVar.getItem(S0);
                    if (oVar instanceof ListingCard) {
                        ListingCard listingCard = (ListingCard) oVar;
                        String id = listingCard.getListingId().getId();
                        if (!this.f29077c.contains(id)) {
                            this.f29077c.add(id);
                            C13229a aVar = this.f29078d;
                            if (aVar != null) {
                                aVar.onListingCardShown(listingCard);
                            }
                        }
                    }
                    if (S0 != U0) {
                        S0++;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
