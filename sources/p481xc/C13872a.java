package p481xc;

import android.os.Bundle;
import com.etsy.android.lib.deeplinks.EtsyAction;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: xc.a */
public final class C13872a {

    /* renamed from: a */
    public final C13573c f30533a;

    public C13872a(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f30533a = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo46704a(C13597g.C13638f4 f4Var) {
        C19383o.m32797g(f4Var, "event");
        this.f30533a.mo38043a(new C13597g.C13631e4(EtsyAction.FAVORITE, String.valueOf(f4Var.f30118a), (Bundle) null, 4));
        return C13574d.C13575a.f29662a;
    }
}
