package com.etsy.android.p327ui.core.listinggallery;

import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.BaseModelImageCompat;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ShopReview;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.p327ui.core.listinggallery.ListingImageGalleryFragment;
import com.etsy.android.uikit.view.C11951f;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;
import p487ya.C13895a;

/* renamed from: com.etsy.android.ui.core.listinggallery.b */
public final class C9643b extends RecyclerView.Adapter<RecyclerView.C3084b0> {

    /* renamed from: b */
    public final C13895a f21358b;

    /* renamed from: c */
    public final C11951f f21359c;

    /* renamed from: d */
    public final C9644a f21360d;

    /* renamed from: e */
    public int f21361e;

    /* renamed from: f */
    public int f21362f;

    /* renamed from: g */
    public int f21363g;

    /* renamed from: h */
    public final ArrayList f21364h;

    /* renamed from: i */
    public RecyclerView f21365i;

    /* renamed from: com.etsy.android.ui.core.listinggallery.b$a */
    public interface C9644a {
        void onBrowseAllReviewImages();

        void onDragStarted();

        void onDragStopped();

        void onImageDismissed();

        void onVideoStarted();

        void onViewUnsupportedImage(String str);
    }

    public C9643b(FragmentActivity fragmentActivity, C13895a aVar, C11951f fVar, ListingImageGalleryFragment listingImageGalleryFragment) {
        C19383o.m32797g(aVar, "fileSupport");
        C19383o.m32797g(fVar, "eventTracker");
        this.f21358b = aVar;
        this.f21359c = fVar;
        this.f21360d = listingImageGalleryFragment;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) fragmentActivity.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        if (C8914m.f19669c == 0.0f) {
            C8914m.m17348f(fragmentActivity);
        }
        this.f21361e = displayMetrics.widthPixels;
        this.f21362f = displayMetrics.heightPixels;
        this.f21364h = new ArrayList();
    }

    public final Object getItem(int i) {
        if (!(!this.f21364h.isEmpty())) {
            return null;
        }
        ArrayList arrayList = this.f21364h;
        return arrayList.get(i % arrayList.size());
    }

    public final int getItemCount() {
        int size = this.f21364h.size();
        if (size == 0) {
            return 0;
        }
        if (size != 1) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return 1;
    }

    public final int getItemViewType(int i) {
        Object item = getItem(i);
        C19383o.m32794d(item);
        if (item instanceof ListingImageGalleryFragment.C9632b) {
            return 1;
        }
        if (item instanceof BaseModelImageCompat) {
            return 0;
        }
        if (item instanceof ShopReview) {
            return 2;
        }
        throw new IllegalArgumentException("unsupported item type " + item);
    }

    /* renamed from: j */
    public final void mo32344j(int i) {
        this.f21363g = i;
        RecyclerView recyclerView = this.f21365i;
        if (recyclerView != null) {
            RecyclerView.C3084b0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            if (findViewHolderForAdapterPosition instanceof VideoViewHolder) {
                ((VideoViewHolder) findViewHolderForAdapterPosition).mo32338f();
            }
            RecyclerView.C3084b0 findViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(i - 1);
            if (findViewHolderForAdapterPosition2 instanceof VideoViewHolder) {
                ((VideoViewHolder) findViewHolderForAdapterPosition2).mo32337e();
            } else if (findViewHolderForAdapterPosition2 instanceof ImageViewHolder) {
                ((ImageViewHolder) findViewHolderForAdapterPosition2).f21330g.setScale(1.0f, true);
            }
            RecyclerView.C3084b0 findViewHolderForAdapterPosition3 = recyclerView.findViewHolderForAdapterPosition(i + 1);
            if (findViewHolderForAdapterPosition3 instanceof VideoViewHolder) {
                ((VideoViewHolder) findViewHolderForAdapterPosition3).mo32337e();
            } else if (findViewHolderForAdapterPosition3 instanceof ImageViewHolder) {
                ((ImageViewHolder) findViewHolderForAdapterPosition3).f21330g.setScale(1.0f, true);
            }
        }
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C19383o.m32797g(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f21365i = recyclerView;
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C19383o.m32797g(b0Var, "holder");
        Object item = getItem(i);
        C19383o.m32794d(item);
        ((C9679d) b0Var).mo32305a(item);
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        if (i == 0) {
            return new ImageViewHolder(viewGroup, this.f21361e, this.f21362f, this.f21358b, this.f21359c, this.f21360d);
        } else if (i == 1) {
            return new VideoViewHolder(viewGroup, this.f21359c, this.f21360d);
        } else {
            if (i == 2) {
                return new ReviewViewHolder(viewGroup, this.f21359c, this.f21360d);
            }
            throw new IllegalArgumentException(C0015b.m88g("unsupported viewType ", i));
        }
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C19383o.m32797g(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f21365i = null;
    }

    public final void onViewRecycled(RecyclerView.C3084b0 b0Var) {
        C19383o.m32797g(b0Var, "holder");
        super.onViewRecycled(b0Var);
        ((C9679d) b0Var).mo32306b();
    }
}
