package com.etsy.android.p327ui.listing.p329ui;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.feedback.ReviewUiModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.Reviews;
import com.etsy.android.lib.models.apiv3.listing.ShopHighlight;
import com.etsy.android.lib.models.apiv3.listing.ShopRating;
import com.etsy.android.lib.models.apiv3.listing.Subratings;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.C10521a;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.listing.ui.t */
public final class C10649t {

    /* renamed from: a */
    public long f23408a;

    /* renamed from: b */
    public Reviews f23409b;

    /* renamed from: c */
    public List<ReviewUiModel> f23410c;

    /* renamed from: d */
    public List<ReviewUiModel> f23411d;

    /* renamed from: e */
    public int f23412e;

    /* renamed from: f */
    public int f23413f;

    /* renamed from: g */
    public float f23414g;

    /* renamed from: h */
    public ShopRating f23415h;

    /* renamed from: i */
    public ShopHighlight f23416i;

    /* renamed from: j */
    public Subratings f23417j;

    /* renamed from: k */
    public Reviews.ReviewType f23418k;

    /* renamed from: l */
    public boolean f23419l;

    public C10649t() {
        throw null;
    }

    public C10649t(C10521a aVar) {
        long j = aVar.f23083a;
        Reviews reviews = aVar.f23084b;
        List<ReviewUiModel> list = aVar.f23085c;
        List<ReviewUiModel> list2 = aVar.f23086d;
        int i = aVar.f23087e;
        int i2 = aVar.f23088f;
        float f = aVar.f23089g;
        ShopRating shopRating = aVar.f23090h;
        ShopHighlight shopHighlight = aVar.f23091i;
        Subratings subratings = aVar.f23092j;
        Reviews.ReviewType reviewType = aVar.f23093k;
        boolean z = aVar.f23094l;
        C19383o.m32797g(reviews, ResponseConstants.REVIEWS);
        C19383o.m32797g(list2, "translatedReviews");
        C19383o.m32797g(reviewType, "selectedReviewType");
        this.f23408a = j;
        this.f23409b = reviews;
        this.f23410c = list;
        this.f23411d = list2;
        this.f23412e = i;
        this.f23413f = i2;
        this.f23414g = f;
        this.f23415h = shopRating;
        this.f23416i = shopHighlight;
        this.f23417j = subratings;
        this.f23418k = reviewType;
        this.f23419l = z;
    }

    /* renamed from: a */
    public final C10521a mo34304a() {
        return new C10521a(this.f23408a, this.f23409b, this.f23410c, this.f23411d, this.f23412e, this.f23413f, this.f23414g, this.f23415h, this.f23416i, this.f23417j, this.f23418k, this.f23419l, RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10649t)) {
            return false;
        }
        C10649t tVar = (C10649t) obj;
        return this.f23408a == tVar.f23408a && C19383o.m32792b(this.f23409b, tVar.f23409b) && C19383o.m32792b(this.f23410c, tVar.f23410c) && C19383o.m32792b(this.f23411d, tVar.f23411d) && this.f23412e == tVar.f23412e && this.f23413f == tVar.f23413f && C19383o.m32792b(Float.valueOf(this.f23414g), Float.valueOf(tVar.f23414g)) && C19383o.m32792b(this.f23415h, tVar.f23415h) && C19383o.m32792b(this.f23416i, tVar.f23416i) && C19383o.m32792b(this.f23417j, tVar.f23417j) && this.f23418k == tVar.f23418k && this.f23419l == tVar.f23419l;
    }

    public final int hashCode() {
        int hashCode = (this.f23409b.hashCode() + (Long.hashCode(this.f23408a) * 31)) * 31;
        List<ReviewUiModel> list = this.f23410c;
        int i = 0;
        int c = C0023f.m104c(this.f23414g, C0069a.m170a(this.f23413f, C0069a.m170a(this.f23412e, C13983i.m21488g(this.f23411d, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31), 31), 31), 31);
        ShopRating shopRating = this.f23415h;
        int hashCode2 = (c + (shopRating == null ? 0 : shopRating.hashCode())) * 31;
        ShopHighlight shopHighlight = this.f23416i;
        int hashCode3 = (hashCode2 + (shopHighlight == null ? 0 : shopHighlight.hashCode())) * 31;
        Subratings subratings = this.f23417j;
        if (subratings != null) {
            i = subratings.hashCode();
        }
        int hashCode4 = (this.f23418k.hashCode() + ((hashCode3 + i) * 31)) * 31;
        boolean z = this.f23419l;
        if (z) {
            z = true;
        }
        return hashCode4 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ReviewsPanelBuilder(shopId=");
        h.append(this.f23408a);
        h.append(", reviews=");
        h.append(this.f23409b);
        h.append(", listingReviews=");
        h.append(this.f23410c);
        h.append(", translatedReviews=");
        h.append(this.f23411d);
        h.append(", listingReviewsCount=");
        h.append(this.f23412e);
        h.append(", shopReviewsCount=");
        h.append(this.f23413f);
        h.append(", shopAverageRating=");
        h.append(this.f23414g);
        h.append(", shopRating=");
        h.append(this.f23415h);
        h.append(", shopHighlight=");
        h.append(this.f23416i);
        h.append(", subratings=");
        h.append(this.f23417j);
        h.append(", selectedReviewType=");
        h.append(this.f23418k);
        h.append(", isExpanded=");
        return C0391c.m1058d(h, this.f23419l, ')');
    }
}
