package p423pf;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.cardviewelement.IPageLink;
import com.etsy.android.lib.models.cardviewelement.PageDeepLink;
import java.util.HashMap;
import p415of.C13171a;
import p478x9.C13858f;

/* renamed from: pf.e */
public class C13234e extends C13171a<IPageLink> {
    public C13234e(Fragment fragment, C8703p pVar) {
        super(fragment, pVar);
    }

    /* renamed from: d */
    public final void mo45935d(IPageLink iPageLink) {
        HashMap hashMap = new HashMap();
        hashMap.put(PredefinedAnalyticsProperty.PAGE, iPageLink.getEventName());
        if (iPageLink instanceof PageDeepLink) {
            hashMap.put(PredefinedAnalyticsProperty.URL, ((PageDeepLink) iPageLink).getUrl());
        }
        C8703p pVar = this.f28980b;
        pVar.mo21333d(this.f28980b.f19060b + "_tapped_view_all", hashMap);
    }

    /* renamed from: e */
    public void mo31328c(IPageLink iPageLink) {
        Fragment a = mo45889a();
        if ((iPageLink instanceof PageDeepLink) && a != null) {
            mo45935d(iPageLink);
            String url = ((PageDeepLink) iPageLink).getUrl();
            Intent intent = new Intent("android.intent.action.VIEW");
            if (C13858f.m21391a(Uri.parse(url)) != null) {
                intent.setClass(a.requireActivity(), EtsyApplication.get().getDeepLinkRoutingActivity());
            }
            intent.setData(Uri.parse(url));
            a.requireActivity().startActivity(intent);
        }
    }
}
