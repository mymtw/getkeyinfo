package com.etsy.android.p327ui.listing.p329ui.listingimages;

import android.view.View;
import androidx.core.view.C2322o0;
import androidx.lifecycle.C2857f;
import androidx.lifecycle.C2887s;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.p327ui.listing.viewholders.ListingImagesViewHolder;
import java.util.Iterator;
import kotlinx.coroutines.C19543e0;

/* renamed from: com.etsy.android.ui.listing.ui.listingimages.ListingVideoStateObserver */
public final class ListingVideoStateObserver implements C2857f {

    /* renamed from: b */
    public final RecyclerView f22902b;

    public ListingVideoStateObserver(RecyclerView recyclerView) {
        this.f22902b = recyclerView;
    }

    public final void onPause(C2887s sVar) {
        RecyclerView.C3084b0 childViewHolder;
        RecyclerView recyclerView = this.f22902b;
        Iterator<View> it = C19543e0.m33298O(recyclerView).iterator();
        do {
            C2322o0 o0Var = (C2322o0) it;
            if (o0Var.hasNext()) {
                childViewHolder = recyclerView.getChildViewHolder((View) o0Var.next());
            } else {
                return;
            }
        } while (!(childViewHolder instanceof ListingImagesViewHolder));
        ((ListingImagesViewHolder) childViewHolder).f23498k.mo38320C();
    }

    public final void onResume(C2887s sVar) {
        RecyclerView.C3084b0 childViewHolder;
        RecyclerView recyclerView = this.f22902b;
        Iterator<View> it = C19543e0.m33298O(recyclerView).iterator();
        do {
            C2322o0 o0Var = (C2322o0) it;
            if (o0Var.hasNext()) {
                childViewHolder = recyclerView.getChildViewHolder((View) o0Var.next());
            } else {
                return;
            }
        } while (!(childViewHolder instanceof ListingImagesViewHolder));
        ((ListingImagesViewHolder) childViewHolder).f23498k.mo38321D();
    }
}
