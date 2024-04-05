package com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers;

import com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationTranslatedFields;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p342ed.C12683b;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.itemdetailspanel.handlers.FetchContentMachineTranslationHandler$handle$1$2 */
public final class FetchContentMachineTranslationHandler$handle$1$2 extends Lambda implements C19857l<C12683b.C12684a, C19394m> {
    public final /* synthetic */ FetchContentMachineTranslationHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchContentMachineTranslationHandler$handle$1$2(FetchContentMachineTranslationHandler fetchContentMachineTranslationHandler) {
        super(1);
        this.this$0 = fetchContentMachineTranslationHandler;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C12683b.C12684a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C12683b.C12684a aVar) {
        if (aVar instanceof C12683b.C12684a.C12686b) {
            FetchContentMachineTranslationHandler fetchContentMachineTranslationHandler = this.this$0;
            ListingMachineTranslationTranslatedFields listingMachineTranslationTranslatedFields = ((C12683b.C12684a.C12686b) aVar).f27963a;
            fetchContentMachineTranslationHandler.f23052c.mo38043a(new C13597g.C13731t(false));
            fetchContentMachineTranslationHandler.f23052c.mo38043a(new C13597g.C13708p4(listingMachineTranslationTranslatedFields));
        } else if (aVar instanceof C12683b.C12684a.C12685a) {
            this.this$0.mo34078b();
        }
    }
}
