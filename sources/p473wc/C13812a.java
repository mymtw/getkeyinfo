package p473wc;

import android.os.Bundle;
import com.etsy.android.R;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.models.apiv3.listing.Shop;
import com.etsy.android.lib.models.apiv3.listing.User;
import com.etsy.android.lib.session.C8855a;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.util.C11786n;
import kotlin.jvm.internal.C19383o;
import p425q9.C13265p;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: wc.a */
public final class C13812a {

    /* renamed from: a */
    public final C13573c f30423a;

    /* renamed from: b */
    public final C11786n f30424b;

    /* renamed from: c */
    public final C13265p f30425c;

    /* renamed from: d */
    public final C8855a f30426d;

    public C13812a(C13573c cVar, C11786n nVar, C13265p pVar, C8855a aVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(nVar, "resourceProvider");
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(aVar, "customerCentricMessagingEligibility");
        this.f30423a = cVar;
        this.f30424b = nVar;
        this.f30425c = pVar;
        this.f30426d = aVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo46663a(ListingViewState.C10092d dVar, C13597g.C13717r rVar) {
        String str;
        C19383o.m32797g(rVar, "event");
        Shop k = dVar.mo33483k();
        String name = k != null ? k.getName() : null;
        User owner = k != null ? k.getOwner() : null;
        if (!(name == null || owner == null)) {
            String loginName = owner.getLoginName();
            if (rVar.f30233a) {
                str = name + ' ' + dVar.f22238f.f22802e.f22816a.f22658a;
            } else {
                str = "";
            }
            String c = rVar.f30233a ? this.f30424b.mo38059c(R.string.listing_message, dVar.f22239g.getListing().getUrl()) : "";
            if (!this.f30425c.mo45960e()) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("includeListingDetails", rVar.f30233a);
                this.f30423a.mo38043a(new C13597g.C13631e4(EtsyAction.CONTACT_USER, (String) null, bundle, 2));
                return C13574d.C13575a.f29662a;
            }
            this.f30423a.mo38043a(new C13597g.C13700o3(loginName, str, c, owner, this.f30426d.mo30407a()));
        }
        return C13574d.C13575a.f29662a;
    }
}
