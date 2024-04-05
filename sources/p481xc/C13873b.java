package p481xc;

import android.os.Bundle;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: xc.b */
public final class C13873b {

    /* renamed from: a */
    public final C13573c f30534a;

    public C13873b(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f30534a = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo46705a(C13597g.C13645g4 g4Var) {
        C19383o.m32797g(g4Var, "event");
        C13573c cVar = this.f30534a;
        EtsyAction etsyAction = EtsyAction.FAVORITE_SHOP;
        Bundle bundle = new Bundle();
        bundle.putString("shop_id", String.valueOf(g4Var.f30127a));
        bundle.putString(ResponseConstants.SHOP_NAME, g4Var.f30128b);
        C19394m mVar = C19394m.f43287a;
        cVar.mo38043a(new C13597g.C13631e4(etsyAction, (String) null, bundle, 2));
        return C13574d.C13575a.f29662a;
    }
}
