package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.apiv3.DeepLink;
import com.etsy.android.lib.models.apiv3.vespa.NavigationalPageHeader;
import com.paypal.pyplcheckout.addressbook.view.fragments.PYPLAddressRecommendationFragment;
import com.paypal.pyplcheckout.pojo.AddressValidation;
import com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cardview.viewholders.o0 */
public final /* synthetic */ class C9203o0 implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f20316b;

    /* renamed from: c */
    public final /* synthetic */ Object f20317c;

    /* renamed from: d */
    public final /* synthetic */ Object f20318d;

    /* renamed from: e */
    public final /* synthetic */ Object f20319e;

    public /* synthetic */ C9203o0(Object obj, int i, Object obj2, Object obj3) {
        this.f20316b = i;
        this.f20317c = obj;
        this.f20318d = obj2;
        this.f20319e = obj3;
    }

    public final void onClick(View view) {
        switch (this.f20316b) {
            case 0:
                C9206p0 p0Var = (C9206p0) this.f20317c;
                String str = (String) this.f20318d;
                NavigationalPageHeader navigationalPageHeader = (NavigationalPageHeader) this.f20319e;
                C19383o.m32797g(p0Var, "this$0");
                C19383o.m32797g(str, "$url");
                C19383o.m32797g(navigationalPageHeader, "$navigationalPage");
                p0Var.f20321c.mo31328c(str);
                DeepLink deepLink = navigationalPageHeader.getDeepLink();
                C19383o.m32794d(deepLink);
                if (deepLink.getEventName() != null) {
                    PredefinedAnalyticsProperty predefinedAnalyticsProperty = PredefinedAnalyticsProperty.PAGE;
                    DeepLink deepLink2 = navigationalPageHeader.getDeepLink();
                    C19383o.m32794d(deepLink2);
                    String eventName = deepLink2.getEventName();
                    C19383o.m32794d(eventName);
                    p0Var.f20322d.mo21333d("category_tapped_breadcrumb", C19294b0.m32562s0(new Pair(PredefinedAnalyticsProperty.URL, str), new Pair(predefinedAnalyticsProperty, eventName)));
                    return;
                }
                return;
            default:
                PYPLAddressRecommendationFragment.m35189setSaveAddressOnClick$lambda3((PYPLAddressRecommendationFragment) this.f20317c, (PortableShippingAddressRequest) this.f20318d, (AddressValidation) this.f20319e, view);
                return;
        }
    }
}
