package com.etsy.android.p327ui.core.review;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.feedback.ReviewUiModel;
import com.etsy.android.lib.models.Receipt;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.EtsyWebKey;
import java.io.Serializable;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19410j;
import kotlin.reflect.C19421p;
import p356ge.C12788a;
import p759nq.C19919a;

/* renamed from: com.etsy.android.ui.core.review.d */
public final /* synthetic */ class C9714d implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f21501b;

    /* renamed from: c */
    public final /* synthetic */ Object f21502c;

    /* renamed from: d */
    public final /* synthetic */ Serializable f21503d;

    public /* synthetic */ C9714d(Object obj, Serializable serializable, int i) {
        this.f21501b = i;
        this.f21502c = obj;
        this.f21503d = serializable;
    }

    public final void onClick(View view) {
        switch (this.f21501b) {
            case 0:
                ListingVideoReviewFragment.m34966setReviewText$lambda6$lambda5$lambda4((ListingVideoReviewFragment) this.f21502c, (ReviewUiModel) this.f21503d, view);
                return;
            default:
                FragmentActivity fragmentActivity = (FragmentActivity) this.f21502c;
                EtsyWebKey.C10700a aVar = new EtsyWebKey.C10700a();
                aVar.f23597a = C19421p.m32935c0(fragmentActivity);
                C19919a aVar2 = aVar.f23598b;
                C19410j<Object>[] jVarArr = EtsyWebKey.C10700a.f23596d;
                aVar2.mo72822a(aVar, jVarArr[0], 16);
                aVar.f23599c = ((Receipt) this.f21503d).getDonationTermsLinkUrl();
                String str = aVar.f23597a;
                if (str != null) {
                    C12788a.m20424c(fragmentActivity, new EtsyWebKey(str, ((Number) aVar.f23598b.getValue(aVar, jVarArr[0])).intValue(), aVar.f23599c, (String) null, 8, (DefaultConstructorMarker) null));
                    return;
                } else {
                    C19383o.m32805o("referrer");
                    throw null;
                }
        }
    }
}
