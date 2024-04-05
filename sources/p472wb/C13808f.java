package p472wb;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.interfaces.IFormattedListingCard;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.uikit.p331ui.favorites.HeartMonitor;
import com.etsy.android.vespa.viewholders.C12086e;
import java.util.HashMap;
import p357gf.C12796e;
import p415of.C13173c;
import p415of.C13182k;
import p415of.C13186o;
import p487ya.C13895a;

/* renamed from: wb.f */
public final class C13808f extends C13173c {

    /* renamed from: i */
    public C13809a f30419i;

    /* renamed from: j */
    public HashMap<String, Integer> f30420j = new HashMap<>();

    /* renamed from: wb.f$a */
    public class C13809a extends GridLayoutManager.C3075b {
        public C13809a() {
        }

        /* renamed from: d */
        public final int mo11265d(int i) {
            if (i >= C13808f.this.mItems.size()) {
                return 1;
            }
            C13808f fVar = C13808f.this;
            return fVar.f28991c.mo33127g(fVar.getItemViewType(i), i);
        }
    }

    public C13808f(Fragment fragment, C8703p pVar, C13182k kVar) {
        super(fragment, pVar, kVar, (C13895a) null, (C8923u) null, (C12796e) null);
        C13809a aVar = new C13809a();
        this.f30419i = aVar;
        aVar.f7012c = true;
        new HeartMonitor(fragment.getLifecycle(), new C13807e(this));
    }

    public final void addFooter(int i) {
        throw new RuntimeException("The ListingStateChangeViewHolderFactoryRecyclerViewAdapter does not support footers. Put the items in the list itself and define them as a mapping in the factory.");
    }

    public final void addHeader(int i) {
        throw new RuntimeException("The ListingStateChangeViewHolderFactoryRecyclerViewAdapter does not support headers. Put the items in the list itself and define them as a mapping in the factory.");
    }

    /* renamed from: b */
    public final void mo31298b(int i) {
        removeItem(i);
    }

    public final void clear() {
        super.clear();
        this.f30420j.clear();
    }

    public final void clearData() {
        super.clearData();
        this.f30420j.clear();
    }

    /* renamed from: i */
    public final void mo31300i(int i) {
        notifyItemChanged(i);
    }

    /* renamed from: m */
    public final GridLayoutManager.C3075b mo45896m() {
        return this.f30419i;
    }

    public final void onViewRecycled(RecyclerView.C3084b0 b0Var) {
        if (b0Var instanceof C12086e) {
            ((C12086e) b0Var).mo31374b();
        }
    }

    /* renamed from: q */
    public final void mo46661q(Bundle bundle) {
        String string = bundle.getString("id");
        if (string != null) {
            boolean b = this.f28995g.f19116n.mo21132b(C8592b.C8595c.f18862f);
            ListingLike listingLike = null;
            if (this.f30420j.size() == 0) {
                for (int i = 0; i < this.mItems.size(); i++) {
                    C13186o oVar = (C13186o) this.mItems.get(i);
                    ListingLike card = oVar instanceof ListingLike ? (ListingLike) oVar : oVar instanceof IFormattedListingCard ? ((IFormattedListingCard) oVar).getCard() : null;
                    if (card != null) {
                        if (card.getListingId().getId().equals(string)) {
                            mo46662r(card, bundle);
                            if (!b) {
                                notifyItemChanged(i);
                            }
                        }
                        this.f30420j.put(card.getListingId().toString(), Integer.valueOf(i));
                    }
                }
            } else if (this.f30420j.containsKey(string)) {
                int intValue = this.f30420j.get(string).intValue();
                C13186o oVar2 = (C13186o) this.mItems.get(intValue);
                if (oVar2 instanceof ListingLike) {
                    listingLike = (ListingLike) oVar2;
                } else if (oVar2 instanceof IFormattedListingCard) {
                    listingLike = ((IFormattedListingCard) oVar2).getCard();
                }
                if (listingLike != null) {
                    mo46662r(listingLike, bundle);
                    if (!b) {
                        notifyItemChanged(intValue);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public final void mo46662r(ListingLike listingLike, Bundle bundle) {
        if (bundle.containsKey(EtsyAction.STATE_FAVORITE)) {
            listingLike.setIsFavorite(bundle.getBoolean(EtsyAction.STATE_FAVORITE));
        }
        if (bundle.containsKey(EtsyAction.STATE_COLLECTIONS)) {
            listingLike.setHasCollections(bundle.getBoolean(EtsyAction.STATE_COLLECTIONS));
        }
    }

    public final void removeItem(int i) {
        super.removeItem(i);
        this.f30420j.clear();
    }
}
