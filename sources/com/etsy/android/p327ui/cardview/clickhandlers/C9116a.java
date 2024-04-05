package com.etsy.android.p327ui.cardview.clickhandlers;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.lib.models.cardviewelement.IPageLink;
import com.etsy.android.lib.models.homescreen.LandingPageInfo;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CollectionKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.DiscoverKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.LandingPageKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.RecentlyViewedKey;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p356ge.C12790b;
import p423pf.C13234e;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.a */
public class C9116a extends C13234e {
    public C9116a(Fragment fragment, C8703p pVar) {
        super(fragment, pVar);
    }

    /* renamed from: e */
    public void mo31328c(IPageLink iPageLink) {
        if (iPageLink instanceof LandingPageInfo) {
            LandingPageInfo landingPageInfo = (LandingPageInfo) iPageLink;
            mo45935d(landingPageInfo);
            String pageType = landingPageInfo.getPageType();
            pageType.getClass();
            char c = 65535;
            switch (pageType.hashCode()) {
                case 109413437:
                    if (pageType.equals("shops")) {
                        c = 0;
                        break;
                    }
                    break;
                case 273184745:
                    if (pageType.equals("discover")) {
                        c = 1;
                        break;
                    }
                    break;
                case 698831502:
                    if (pageType.equals("orloj_recently_viewed_listings")) {
                        c = 2;
                        break;
                    }
                    break;
                case 888588595:
                    if (pageType.equals("recently_viewed_listings")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1346279023:
                    if (pageType.equals("listings")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1853891989:
                    if (pageType.equals("collections")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                C12790b.m20430b(mo45889a(), new LandingPageKey(C12790b.m20432d(mo45889a()), landingPageInfo, (Bundle) null));
            } else if (c == 1) {
                C12790b.m20430b(mo45889a(), new DiscoverKey(C12790b.m20432d(mo45889a()), landingPageInfo));
            } else if (c == 2) {
                landingPageInfo.setLayout(2);
                mo31342f(landingPageInfo);
            } else if (c == 3) {
                landingPageInfo.setLayout(2);
                landingPageInfo.setRequestMethod(1);
                mo31342f(landingPageInfo);
            } else if (c == 4) {
                landingPageInfo.setLayout(2);
                C12790b.m20430b(mo45889a(), new LandingPageKey(C12790b.m20432d(mo45889a()), landingPageInfo, (Bundle) null));
            } else if (c == 5) {
                this.f28980b.mo21333d(landingPageInfo.getEventName(), (Map<? extends AnalyticsProperty, Object>) null);
                String d = C12790b.m20432d(mo45889a());
                String deepLink = landingPageInfo.getDeepLink();
                String str = deepLink != null ? deepLink : null;
                if (str != null) {
                    C12790b.m20430b(mo45889a(), new CollectionKey(d, (Collection) null, (String) null, (String) null, (String) null, str, true, (Bundle) null, 158, (DefaultConstructorMarker) null));
                } else {
                    C19383o.m32805o("deepLink");
                    throw null;
                }
            }
        } else {
            super.mo31328c(iPageLink);
        }
    }

    /* renamed from: f */
    public final void mo31342f(LandingPageInfo landingPageInfo) {
        String d = C12790b.m20432d(mo45889a());
        C19383o.m32797g(landingPageInfo, "pageLink");
        C12790b.m20430b(mo45889a(), new RecentlyViewedKey(d, landingPageInfo, (String) null, 4, (DefaultConstructorMarker) null));
    }
}
