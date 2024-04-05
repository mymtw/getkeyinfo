package p481xc;

import android.content.Intent;
import android.os.Bundle;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;
import p628nj.C18263b;

/* renamed from: xc.f */
public final class C13878f {

    /* renamed from: a */
    public final C13573c f30537a;

    public C13878f(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f30537a = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo46707a(C13597g.C13659i4 i4Var) {
        C19383o.m32797g(i4Var, "event");
        Intent intent = i4Var.f30152b;
        String stringExtra = intent.getStringExtra(EtsyAction.ACTION_TYPE_NAME);
        if (i4Var.f30151a == 311) {
            EtsyAction etsyAction = EtsyAction.FAVORITE;
            if (intent.hasExtra(etsyAction.getType())) {
                this.f30537a.mo38043a(new C13597g.C13654i(i4Var.f30152b.getStringExtra(etsyAction.getType())));
            } else {
                EtsyAction etsyAction2 = EtsyAction.FAVORITE_SHOP;
                String str = null;
                if (C19383o.m32792b(stringExtra, etsyAction2.getType())) {
                    Bundle bundleExtra = intent.getBundleExtra(etsyAction2.getType());
                    String string = bundleExtra != null ? bundleExtra.getString("shop_id") : null;
                    if (bundleExtra != null) {
                        str = bundleExtra.getString(ResponseConstants.SHOP_NAME);
                    }
                    if (C18263b.m30839d0(string) && C18263b.m30839d0(str)) {
                        this.f30537a.mo38043a(new C13597g.C13704p0(Long.parseLong(string), str, true));
                    }
                } else {
                    EtsyAction etsyAction3 = EtsyAction.CONTACT_USER;
                    if (C19383o.m32792b(stringExtra, etsyAction3.getType())) {
                        Bundle bundleExtra2 = intent.getBundleExtra(etsyAction3.getType());
                        this.f30537a.mo38043a(new C13597g.C13717r(bundleExtra2 != null ? bundleExtra2.getBoolean("includeListingDetails") : false));
                    } else {
                        EtsyAction etsyAction4 = EtsyAction.REPORT_LISTING;
                        if (C19383o.m32792b(stringExtra, etsyAction4.getType())) {
                            Bundle bundleExtra3 = intent.getBundleExtra(etsyAction4.getType());
                            String string2 = bundleExtra3 != null ? bundleExtra3.getString("listing_id") : null;
                            if (bundleExtra3 != null) {
                                str = bundleExtra3.getString("url");
                            }
                            if (string2 != null) {
                                this.f30537a.mo38043a(new C13597g.C13602a3(string2, str));
                            }
                        }
                    }
                }
            }
        }
        return C13574d.C13575a.f29662a;
    }
}
