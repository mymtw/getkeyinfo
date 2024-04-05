package p472wb;

import android.content.res.Resources;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.homescreen.LandingPageLink;
import com.etsy.android.p327ui.util.C11786n;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import kotlin.jvm.internal.C19383o;
import p425q9.C13265p;
import p628nj.C18263b;

/* renamed from: wb.g */
public final class C13810g {
    /* renamed from: a */
    public static LandingPageLink m21365a(C13810g gVar, Resources resources, C11786n nVar, String str, int i) throws RuntimeException {
        String str2;
        if ((i & 1) != 0) {
            resources = null;
        }
        if ((i & 2) != 0) {
            nVar = null;
        }
        C19383o.m32797g(str, "listingId");
        if (resources == null || (str2 = resources.getString(R.string.similar_items)) == null) {
            if (nVar != null) {
                str2 = nVar.mo38059c(R.string.similar_items, new Object[0]);
            } else {
                throw new RuntimeException("Missing required resources for building a landing page link!");
            }
        }
        LandingPageLink landingPageLink = new LandingPageLink();
        landingPageLink.setPageTitle(str2);
        C13265p pVar = C18263b.f40057V;
        if (pVar != null) {
            landingPageLink.setApiPath(pVar.mo45960e() ? "/etsyapps/v3/member/personalization/similar-listings" : "/etsyapps/v3/public/personalization/similar-listings");
            landingPageLink.getParams().put(ResponseConstants.LISTING_IDS, str);
            landingPageLink.getParams().put("prolist", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            landingPageLink.getParams().put("prolist_placement", "bslp");
            if (C18263b.m30839d0((CharSequence) null)) {
                landingPageLink.getParams().put("variant", (Object) null);
            }
            landingPageLink.setEventName("similar_listings");
            landingPageLink.setLayout(2);
            return landingPageLink;
        }
        C19383o.m32805o("session");
        throw null;
    }
}
