package com.etsy.android.p327ui.core.listinggallery;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto;
import com.etsy.android.lib.models.apiv3.listing.ShopReview;
import com.etsy.android.lib.models.apiv3.listing.ShopsReviewsUserCard;
import com.etsy.android.lib.models.apiv3.listing.TransactionReview;
import com.etsy.android.p327ui.core.listinggallery.C9643b;
import com.etsy.android.stylekit.views.ratings.CollageRatingView;
import com.etsy.android.uikit.view.C11951f;
import com.etsy.android.uikit.view.draggable.DraggableViewDelegateWithShrink;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p455u9.C13448b;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.listinggallery.ReviewViewHolder */
public final class ReviewViewHolder extends RecyclerView.C3084b0 implements C9679d {

    /* renamed from: b */
    public final C11951f f21337b;

    /* renamed from: c */
    public final C9643b.C9644a f21338c;

    /* renamed from: d */
    public final View f21339d;

    /* renamed from: e */
    public final ImageView f21340e;

    /* renamed from: f */
    public final View f21341f;

    /* renamed from: g */
    public final CollageRatingView f21342g;

    /* renamed from: h */
    public final ImageView f21343h;

    /* renamed from: i */
    public final TextView f21344i;

    /* renamed from: j */
    public DraggableViewDelegateWithShrink f21345j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReviewViewHolder(ViewGroup viewGroup, C11951f fVar, C9643b.C9644a aVar) {
        super(C0114h.m305j0(viewGroup, R.layout.imageview_loading_review, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(fVar, "eventTracker");
        this.f21337b = fVar;
        this.f21338c = aVar;
        View findViewById = this.itemView.findViewById(R.id.review_layout);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.review_layout)");
        this.f21339d = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.image);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.image)");
        this.f21340e = (ImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.activity_indicator);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.activity_indicator)");
        this.f21341f = findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.rating_view);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.id.rating_view)");
        this.f21342g = (CollageRatingView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.avatar);
        C19383o.m32796f(findViewById5, "itemView.findViewById(R.id.avatar)");
        this.f21343h = (ImageView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.review_text);
        C19383o.m32796f(findViewById6, "itemView.findViewById(R.id.review_text)");
        this.f21344i = (TextView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.browse_review_photos_button);
        C19383o.m32796f(findViewById7, "itemView.findViewById(R.…wse_review_photos_button)");
        ViewExtensions.m12869m(findViewById3);
        ViewExtensions.m12866j((Button) findViewById7, new C19857l<View, C19394m>(this) {
            public final /* synthetic */ ReviewViewHolder this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return C19394m.f43287a;
            }

            public final void invoke(View view) {
                C9643b.C9644a aVar = this.this$0.f21338c;
                if (aVar != null) {
                    aVar.onBrowseAllReviewImages();
                }
            }
        });
        this.itemView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            public final /* synthetic */ ReviewViewHolder this$0;

            {
                this.this$0 = r1;
            }

            public void onViewAttachedToWindow(View view) {
                C19383o.m32797g(view, "p0");
            }

            public void onViewDetachedFromWindow(View view) {
                C19383o.m32797g(view, "p0");
                DraggableViewDelegateWithShrink draggableViewDelegateWithShrink = this.this$0.f21345j;
                if (draggableViewDelegateWithShrink != null) {
                    draggableViewDelegateWithShrink.cleanup();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo32305a(Object obj) {
        if (obj instanceof ShopReview) {
            ShopReview shopReview = (ShopReview) obj;
            AppreciationPhoto appreciationPhoto = shopReview.getAppreciationPhoto();
            if (appreciationPhoto != null) {
                ImageView imageView = this.f21340e;
                C19383o.m32796f(OneShotPreDrawListener.add(imageView, new C9682g(imageView, this, appreciationPhoto)), "View.doOnPreDraw(\n    crossinline action: (view: View) -> Unit\n): OneShotPreDrawListener = OneShotPreDrawListener.add(this) { action(this) }");
            }
            TransactionReview review = shopReview.getReview();
            String str = null;
            Float rating = review != null ? review.getRating() : null;
            if (rating == null || rating.floatValue() <= 0.0f) {
                ViewExtensions.m12860d(this.f21342g);
            } else {
                ViewExtensions.m12869m(this.f21342g);
                this.f21342g.setRating(rating.floatValue());
            }
            TransactionReview review2 = shopReview.getReview();
            String translatedReview = review2 != null ? review2.getTranslatedReview() : null;
            TransactionReview review3 = shopReview.getReview();
            String review4 = review3 != null ? review3.getReview() : null;
            if (!C18263b.m30839d0(translatedReview)) {
                translatedReview = C18263b.m30839d0(review4) ? review4 : "";
            }
            if (C18263b.m30839d0(translatedReview)) {
                ViewExtensions.m12869m(this.f21344i);
                this.f21344i.setText(translatedReview);
            } else {
                ViewExtensions.m12860d(this.f21344i);
            }
            ShopsReviewsUserCard buyerUser = shopReview.getBuyerUser();
            if (buyerUser != null) {
                str = buyerUser.getAvatarUrl();
            }
            if (C18263b.m30839d0(str)) {
                C13448b j0 = C0114h.m270B0(this.itemView.getContext()).load(str).mo17160t(new ColorDrawable(0));
                Context context = this.itemView.getContext();
                C19383o.m32796f(context, "itemView.context");
                int K = C19543e0.m33295K(40, context);
                ((C13448b) j0.mo17158r(K, K)).mo46137e0().mo16816M(this.f21343h);
            } else {
                this.f21343h.setImageResource(R.drawable.clg_icon_avatar_shape_a_fillcolor_v1);
            }
            DraggableViewDelegateWithShrink draggableViewDelegateWithShrink = this.f21345j;
            if (draggableViewDelegateWithShrink != null) {
                draggableViewDelegateWithShrink.cleanup();
            }
            DraggableViewDelegateWithShrink draggableViewDelegateWithShrink2 = new DraggableViewDelegateWithShrink(this.f21339d);
            draggableViewDelegateWithShrink2.setSwipeDownListener(new ReviewViewHolder$bind$1$1(this, draggableViewDelegateWithShrink2));
            draggableViewDelegateWithShrink2.setOnDragStartListener(new ReviewViewHolder$bind$1$2(this));
            draggableViewDelegateWithShrink2.setOnDragEndListener(new ReviewViewHolder$bind$1$3(this));
            this.f21345j = draggableViewDelegateWithShrink2;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public final void mo32306b() {
        DraggableViewDelegateWithShrink draggableViewDelegateWithShrink = this.f21345j;
        if (draggableViewDelegateWithShrink != null) {
            draggableViewDelegateWithShrink.cleanup();
        }
    }
}
