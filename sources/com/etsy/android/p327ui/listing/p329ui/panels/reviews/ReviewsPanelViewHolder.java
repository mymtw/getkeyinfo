package com.etsy.android.p327ui.listing.p329ui.panels.reviews;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.R;
import com.etsy.android.feedback.ReviewUiModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ReviewImage;
import com.etsy.android.lib.models.apiv3.listing.Reviews;
import com.etsy.android.lib.models.apiv3.listing.ShopHighlight;
import com.etsy.android.lib.models.apiv3.listing.Subratings;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.common.listingreview.redesign.C9449c;
import com.etsy.android.p327ui.common.listingreview.redesign.ListingReviewViewRedesign;
import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.stylekit.views.CollageContentToggle;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p001a0.C0005b;
import p466vc.C13573c;
import p466vc.C13597g;
import p496za.C13943a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.reviews.ReviewsPanelViewHolder */
public final class ReviewsPanelViewHolder extends C10424k {

    /* renamed from: b */
    public final C8923u f23070b;

    /* renamed from: c */
    public final C13573c f23071c;

    /* renamed from: d */
    public final C13943a f23072d;

    /* renamed from: e */
    public final C10156h f23073e;

    /* renamed from: f */
    public final C11786n f23074f;

    /* renamed from: g */
    public final CollageContentToggle f23075g;

    /* renamed from: h */
    public final ListingReviewViewRedesign f23076h;

    /* renamed from: i */
    public List<ReviewUiModel> f23077i;

    /* renamed from: j */
    public List<ReviewUiModel> f23078j;

    /* renamed from: k */
    public ShopHighlight f23079k;

    /* renamed from: l */
    public Subratings f23080l;

    /* renamed from: com.etsy.android.ui.listing.ui.panels.reviews.ReviewsPanelViewHolder$a */
    public static final class C10520a implements C9449c {

        /* renamed from: a */
        public final /* synthetic */ ReviewsPanelViewHolder f23081a;

        /* renamed from: b */
        public final /* synthetic */ C10423j f23082b;

        public C10520a(ReviewsPanelViewHolder reviewsPanelViewHolder, C10423j jVar) {
            this.f23081a = reviewsPanelViewHolder;
            this.f23082b = jVar;
        }

        /* renamed from: a */
        public final void mo31929a(ReviewUiModel reviewUiModel) {
            C19383o.m32797g(reviewUiModel, "review");
            ReviewImage M = C0005b.m19M(reviewUiModel, false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(M);
            this.f23081a.f23071c.mo38043a(new C13597g.C13623d3(0, arrayList));
        }

        /* renamed from: b */
        public final void mo31930b() {
            this.f23081a.f23071c.mo38043a(new C13597g.C13633f("listing_screen_video_reviews_carousel_swipe"));
        }

        /* renamed from: c */
        public final void mo31931c(Reviews.ReviewType reviewType) {
            if (reviewType != null) {
                this.f23081a.f23071c.mo38043a(new C13597g.C13737t5(reviewType, (C10521a) this.f23082b));
            }
        }

        /* renamed from: d */
        public final void mo31932d(int i, List<ReviewUiModel> list) {
            C19383o.m32797g(list, ResponseConstants.REVIEWS);
            this.f23081a.f23071c.mo38043a(new C13597g.C13616c3(i, list));
        }

        /* renamed from: e */
        public final void mo31933e(Reviews.ReviewType reviewType) {
            if (reviewType != null) {
                this.f23081a.f23071c.mo38043a(new C13597g.C13730s5(reviewType, (C10521a) this.f23082b));
            }
        }

        /* renamed from: f */
        public final void mo31934f(Reviews.ReviewType reviewType) {
            if (reviewType != null) {
                this.f23081a.f23071c.mo38043a(new C13597g.C13744u5(reviewType, (C10521a) this.f23082b));
            }
        }

        /* renamed from: g */
        public final void mo31935g() {
            this.f23081a.f23071c.mo38043a(new C13597g.C13644g3(Reviews.ReviewType.SHOP, (C10521a) this.f23082b));
        }

        /* renamed from: h */
        public final void mo31936h(int i, Reviews.ReviewType reviewType) {
            if (reviewType != null) {
                this.f23081a.f23071c.mo38043a(new C13597g.C13609b3(i, reviewType));
            }
        }

        public final void onTranslateReviewClicked(ReviewUiModel reviewUiModel) {
            C19383o.m32797g(reviewUiModel, "review");
            this.f23081a.f23071c.mo38043a(new C13597g.C13611b5(reviewUiModel));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReviewsPanelViewHolder(ViewGroup viewGroup, C8923u uVar, C13573c cVar, C13943a aVar, C10156h hVar, C11786n nVar) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_listing_reviews_panel, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(uVar, "translationHelper");
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(aVar, "sharedPreferencesProvider");
        C19383o.m32797g(hVar, "listingViewEligibility");
        C19383o.m32797g(nVar, "resourceProvider");
        this.f23070b = uVar;
        this.f23071c = cVar;
        this.f23072d = aVar;
        this.f23073e = hVar;
        this.f23074f = nVar;
        View findViewById = this.itemView.findViewById(R.id.reviews_panel);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.reviews_panel)");
        CollageContentToggle collageContentToggle = (CollageContentToggle) findViewById;
        this.f23075g = collageContentToggle;
        Context context = this.itemView.getContext();
        C19383o.m32796f(context, "itemView.context");
        ListingReviewViewRedesign listingReviewViewRedesign = new ListingReviewViewRedesign(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        this.f23076h = listingReviewViewRedesign;
        collageContentToggle.addView(listingReviewViewRedesign);
        C0761x.m1669H(new C19857l<Boolean, C19394m>(this) {
            public final /* synthetic */ ReviewsPanelViewHolder this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return C19394m.f43287a;
            }

            public final void invoke(boolean z) {
                this.this$0.f23071c.mo38043a(new C13597g.C13637f3(z));
            }
        }, collageContentToggle);
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10521a) {
            this.f23076h.setReviewsListener(new C10520a(this, jVar));
            C10521a aVar = (C10521a) jVar;
            if (!C19383o.m32792b(this.f23077i, aVar.f23085c) || !C19383o.m32792b(this.f23080l, aVar.f23092j) || !C19383o.m32792b(this.f23079k, aVar.f23091i)) {
                List<ReviewUiModel> list = aVar.f23085c;
                this.f23077i = list;
                this.f23080l = aVar.f23092j;
                ShopHighlight shopHighlight = aVar.f23091i;
                this.f23079k = shopHighlight;
                this.f23076h.initialize(aVar.f23090h, shopHighlight, list, aVar.f23084b.getTotalListingReviewsCount(), aVar.f23084b.getListingReviewImages(), aVar.f23084b.getListingReviewVideos(), this.f23070b, this.f23072d.mo46761a().getBoolean("buyer_videos_alert_shown", false), this.f23073e, this.f23074f);
            }
            if (!this.f23072d.mo46761a().getBoolean("buyer_videos_alert_shown", false)) {
                SharedPreferences.Editor edit = this.f23072d.mo46761a().edit();
                C19383o.m32796f(edit, "editor");
                edit.putBoolean("buyer_videos_alert_shown", true);
                edit.apply();
            }
            if (!C19383o.m32792b(this.f23078j, aVar.f23086d)) {
                List<ReviewUiModel> list2 = aVar.f23086d;
                this.f23078j = list2;
                for (ReviewUiModel updateReview : list2) {
                    this.f23076h.updateReview(updateReview);
                }
            }
            this.f23071c.mo38043a(C13597g.C13689n.f30191a);
            this.f23075g.setExpanded(aVar.f23094l);
            return;
        }
        throw new IllegalStateException();
    }
}
