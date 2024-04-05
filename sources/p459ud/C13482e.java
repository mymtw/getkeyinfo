package p459ud;

import com.etsy.android.lib.models.apiv3.sdl.FormattedListingCard;
import com.etsy.android.p327ui.sdl.C10715a;
import p466vc.C13597g;
import p628nj.C18263b;

/* renamed from: ud.e */
public final class C13482e implements C10715a {

    /* renamed from: a */
    public final /* synthetic */ C13483f f29504a;

    public C13482e(C13483f fVar) {
        this.f29504a = fVar;
    }

    /* renamed from: a */
    public final void mo35629a(int i, Object obj) {
        if (obj instanceof FormattedListingCard) {
            FormattedListingCard formattedListingCard = (FormattedListingCard) obj;
            if (C18263b.m30839d0(formattedListingCard.getCardField().getLoggingKey())) {
                this.f29504a.f29506b.mo38043a(new C13597g.C13740u1(i, formattedListingCard.getCardField().getLoggingKey()));
            }
        }
    }
}
