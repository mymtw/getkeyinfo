package com.etsy.android.p327ui.listing.p329ui.panels.faqs.handlers;

import com.etsy.android.lib.models.apiv3.TranslatedFaq;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p342ed.C12683b;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.faqs.handlers.FetchFaqMachineTranslationHandler$handle$2 */
public final class FetchFaqMachineTranslationHandler$handle$2 extends Lambda implements C19857l<C12683b.C12690c, C19394m> {
    public final /* synthetic */ String $toLangCode;
    public final /* synthetic */ FetchFaqMachineTranslationHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchFaqMachineTranslationHandler$handle$2(FetchFaqMachineTranslationHandler fetchFaqMachineTranslationHandler, String str) {
        super(1);
        this.this$0 = fetchFaqMachineTranslationHandler;
        this.$toLangCode = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C12683b.C12690c) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C12683b.C12690c cVar) {
        if (cVar instanceof C12683b.C12690c.C12692b) {
            FetchFaqMachineTranslationHandler fetchFaqMachineTranslationHandler = this.this$0;
            List<TranslatedFaq> list = ((C12683b.C12690c.C12692b) cVar).f27965a;
            String str = this.$toLangCode;
            fetchFaqMachineTranslationHandler.f23002c.mo38043a(new C13597g.C13662j0(false));
            fetchFaqMachineTranslationHandler.f23002c.mo38043a(new C13597g.C13715q4(list, str));
        } else if (cVar instanceof C12683b.C12690c.C12691a) {
            this.this$0.mo34044b();
        }
    }
}
