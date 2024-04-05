package p470w9;

import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.p327ui.C9111b0;
import com.etsy.android.p327ui.conversation.details.C9532l;
import com.etsy.android.p327ui.favorites.C9900y;
import com.etsy.android.p327ui.favorites.C9901z;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.C10528b;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.unstructured.handlers.ShippingUnstructuredPoliciesPanelClickedHandler;
import com.etsy.android.p327ui.user.C11684r;
import com.etsy.android.p327ui.user.inappnotifications.C11541a0;
import dagger.internal.C17555d;
import p349fd.C12717a;
import p426qa.C13278d;
import p466vc.C13573c;
import p740eq.C19011a;

/* renamed from: w9.c */
public final class C13795c implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f30358a;

    /* renamed from: b */
    public final C19011a f30359b;

    public /* synthetic */ C13795c(C19011a aVar, int i) {
        this.f30358a = i;
        this.f30359b = aVar;
    }

    public final Object get() {
        switch (this.f30358a) {
            case 0:
                return new C13794b((C13796d) this.f30359b.get());
            case 1:
                return new C9532l((C13278d) this.f30359b.get());
            case 2:
                return new C9901z((C9900y) this.f30359b.get());
            case 3:
                return new C12717a((C13573c) this.f30359b.get());
            case 4:
                return new C10528b((C13573c) this.f30359b.get());
            case 5:
                return new ShippingUnstructuredPoliciesPanelClickedHandler((C13573c) this.f30359b.get());
            case 6:
                return new C11684r((C9111b0) this.f30359b.get());
            default:
                return new C11541a0((C8672b) this.f30359b.get());
        }
    }
}
