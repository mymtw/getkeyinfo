package com.etsy.android.p327ui.cardview.viewholders;

import android.content.res.Resources;
import android.support.p013v4.media.session.C0087d;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.core.img.GlideRequests;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.cardview.clickhandlers.C9135p;
import com.etsy.android.p327ui.user.purchases.reviewcarousel.C11675c;
import com.etsy.android.p327ui.user.purchases.reviewcarousel.C11676d;
import com.etsy.android.p327ui.user.review.C11756y;
import com.etsy.android.stylekit.views.ratings.CollageRatingButtons;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import p479xa.C13862a;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.cardview.viewholders.ReviewCardViewHolder */
public final class ReviewCardViewHolder extends RecyclerView.C3084b0 {

    /* renamed from: g */
    public static final /* synthetic */ int f20117g = 0;

    /* renamed from: b */
    public final ViewGroup f20118b;

    /* renamed from: c */
    public final C9135p f20119c;

    /* renamed from: d */
    public final C19285c f20120d = C19350d.m32677b(new ReviewCardViewHolder$titleText$2(this));

    /* renamed from: e */
    public final C19285c f20121e = C19350d.m32677b(new ReviewCardViewHolder$imageView$2(this));

    /* renamed from: f */
    public final C19285c f20122f = C19350d.m32677b(new ReviewCardViewHolder$ratingButtons$2(this));

    /* renamed from: com.etsy.android.ui.cardview.viewholders.ReviewCardViewHolder$a */
    public static final class C9149a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ReviewCardViewHolder f20123b;

        /* renamed from: c */
        public final /* synthetic */ C11675c f20124c;

        public C9149a(ImageView imageView, ReviewCardViewHolder reviewCardViewHolder, C11675c cVar) {
            this.f20123b = reviewCardViewHolder;
            this.f20124c = cVar;
        }

        public final void run() {
            GlideRequests B0 = C0114h.m270B0(this.f20123b.itemView.getContext());
            C11676d dVar = this.f20124c.f25859c;
            int measuredWidth = ((ImageView) this.f20123b.f20121e.getValue()).getMeasuredWidth();
            B0.load((measuredWidth > 75 || !C18263b.m30837c0(dVar.f25863b)) ? (measuredWidth > 300 || !C18263b.m30837c0(dVar.f25864c)) ? (measuredWidth > 600 || !C18263b.m30837c0(dVar.f25865d)) ? dVar.f25862a : dVar.f25865d : dVar.f25864c : dVar.f25863b).mo16816M((ImageView) this.f20123b.f20121e.getValue());
        }
    }

    /* renamed from: com.etsy.android.ui.cardview.viewholders.ReviewCardViewHolder$b */
    public static final class C9150b implements CollageRatingButtons.C9070a {

        /* renamed from: a */
        public final /* synthetic */ ReviewCardViewHolder f20125a;

        /* renamed from: b */
        public final /* synthetic */ C11675c f20126b;

        public C9150b(ReviewCardViewHolder reviewCardViewHolder, C11675c cVar) {
            this.f20125a = reviewCardViewHolder;
            this.f20126b = cVar;
        }

        /* renamed from: a */
        public final void mo31180a(int i, boolean z) {
            C9135p pVar = this.f20125a.f20119c;
            C11675c cVar = this.f20126b;
            pVar.mo31328c(new C11756y.C11758b(cVar.f25857a, cVar.f25858b, i));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReviewCardViewHolder(View view, ViewGroup viewGroup, C9135p pVar) {
        super(view);
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(pVar, "clickHandler");
        this.f20118b = viewGroup;
        this.f20119c = pVar;
    }

    /* renamed from: e */
    public final void mo31389e(C11675c cVar) {
        RecyclerView.Adapter adapter;
        C19383o.m32797g(cVar, "reviewCarouselItem");
        ViewGroup viewGroup = this.f20118b;
        RecyclerView recyclerView = viewGroup instanceof RecyclerView ? (RecyclerView) viewGroup : null;
        if (((recyclerView == null || (adapter = recyclerView.getAdapter()) == null) ? 1 : adapter.getItemCount()) > 1) {
            View view = this.itemView;
            C19383o.m32796f(view, "itemView");
            int b = C0087d.m233b(this.itemView, R.dimen.clg_space_12);
            int b2 = C0087d.m233b(this.itemView, R.dimen.clg_space_20);
            Resources resources = view.getContext().getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            view.getLayoutParams().width = ((((resources.getConfiguration().orientation == 1 ? displayMetrics.widthPixels : displayMetrics.heightPixels) - b2) - b) / 1) - b;
        }
        ((TextView) this.f20120d.getValue()).setText(Html.fromHtml(cVar.f25860d, 63));
        ImageView imageView = (ImageView) this.f20121e.getValue();
        C19383o.m32796f(imageView, "imageView");
        C19383o.m32796f(OneShotPreDrawListener.add(imageView, new C9149a(imageView, this, cVar)), "View.doOnPreDraw(\n    crossinline action: (view: View) -> Unit\n): OneShotPreDrawListener = OneShotPreDrawListener.add(this) { action(this) }");
        this.itemView.setOnClickListener(new C13862a(1, this, cVar));
        ((CollageRatingButtons) this.f20122f.getValue()).setLabelForAccessibility(cVar.f25861e);
        ((CollageRatingButtons) this.f20122f.getValue()).setOnSelectedListener(new C9150b(this, cVar));
    }
}
