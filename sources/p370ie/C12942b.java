package p370ie;

import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.ActivityAnimationMode;
import com.etsy.android.p327ui.user.review.CreateReviewActivity;
import com.etsy.android.p327ui.user.review.ReviewTrackingSource;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p363he.C12818b;
import p363he.C12824f;

/* renamed from: ie.b */
public final class C12942b implements C12818b {

    /* renamed from: b */
    public final String f28503b;

    /* renamed from: c */
    public final EtsyId f28504c;

    /* renamed from: d */
    public final List<EtsyId> f28505d;

    /* renamed from: e */
    public final ReviewTrackingSource f28506e;

    /* renamed from: f */
    public final Integer f28507f;

    /* renamed from: g */
    public final Bundle f28508g;

    public C12942b(String str, EtsyId etsyId, List<EtsyId> list, ReviewTrackingSource reviewTrackingSource, Integer num, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(reviewTrackingSource, "source");
        this.f28503b = str;
        this.f28504c = etsyId;
        this.f28505d = list;
        this.f28506e = reviewTrackingSource;
        this.f28507f = num;
        this.f28508g = bundle;
    }

    public final boolean clearTask() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12942b)) {
            return false;
        }
        C12942b bVar = (C12942b) obj;
        return C19383o.m32792b(this.f28503b, bVar.f28503b) && C19383o.m32792b(this.f28504c, bVar.f28504c) && C19383o.m32792b(this.f28505d, bVar.f28505d) && this.f28506e == bVar.f28506e && C19383o.m32792b(this.f28507f, bVar.f28507f) && C19383o.m32792b(this.f28508g, bVar.f28508g);
    }

    public final ActivityAnimationMode getAnimationMode() {
        return ActivityAnimationMode.SLIDE_BOTTOM;
    }

    public final Class<?> getClazz() {
        return CreateReviewActivity.class;
    }

    public final C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", this.f28503b);
        fVar.f28304a.put(ResponseConstants.TRANSACTION_ID, this.f28504c);
        fVar.f28304a.put("transaction_ids", this.f28505d);
        fVar.f28304a.put("source", this.f28506e);
        Bundle bundle = this.f28508g;
        if (bundle != null) {
            fVar.f28304a.put("referral_args", bundle);
        }
        Integer num = this.f28507f;
        if (num != null) {
            fVar.f28304a.put(ResponseConstants.RATING, num);
        }
        return fVar;
    }

    public final int hashCode() {
        int hashCode = this.f28503b.hashCode() * 31;
        EtsyId etsyId = this.f28504c;
        int i = 0;
        int hashCode2 = (hashCode + (etsyId == null ? 0 : etsyId.hashCode())) * 31;
        List<EtsyId> list = this.f28505d;
        int hashCode3 = (this.f28506e.hashCode() + ((hashCode2 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        Integer num = this.f28507f;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Bundle bundle = this.f28508g;
        if (bundle != null) {
            i = bundle.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CreateReviewNavigationKey(referrer=");
        h.append(this.f28503b);
        h.append(", transactionId=");
        h.append(this.f28504c);
        h.append(", transactionIds=");
        h.append(this.f28505d);
        h.append(", source=");
        h.append(this.f28506e);
        h.append(", rating=");
        h.append(this.f28507f);
        h.append(", referrerBundle=");
        h.append(this.f28508g);
        h.append(')');
        return h.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12942b(String str, EtsyId etsyId, List list, ReviewTrackingSource reviewTrackingSource, Integer num, Bundle bundle, int i) {
        this(str, (i & 2) != 0 ? null : etsyId, (i & 4) != 0 ? null : list, reviewTrackingSource, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : bundle);
    }
}
