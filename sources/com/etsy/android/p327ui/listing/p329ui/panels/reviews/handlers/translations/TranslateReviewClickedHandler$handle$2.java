package com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.translations;

import com.etsy.android.uikit.util.MachineTranslationViewState;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p342ed.C12683b;
import p466vc.C13597g;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.reviews.handlers.translations.TranslateReviewClickedHandler$handle$2 */
public final class TranslateReviewClickedHandler$handle$2 extends Lambda implements C19857l<C12683b.C12687b, C19394m> {
    public final /* synthetic */ MachineTranslationViewState $machineTranslationState;
    public final /* synthetic */ Long $transactionId;
    public final /* synthetic */ TranslateReviewClickedHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranslateReviewClickedHandler$handle$2(TranslateReviewClickedHandler translateReviewClickedHandler, Long l, MachineTranslationViewState machineTranslationViewState) {
        super(1);
        this.this$0 = translateReviewClickedHandler;
        this.$transactionId = l;
        this.$machineTranslationState = machineTranslationViewState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C12683b.C12687b) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C12683b.C12687b bVar) {
        if (bVar instanceof C12683b.C12687b.C12689b) {
            String review = ((C12683b.C12687b.C12689b) bVar).f27964a.getReview();
            if (C18263b.m30837c0(review)) {
                this.this$0.f23113c.mo38043a(new C13597g.C13722r4(this.$transactionId.longValue(), review, this.$machineTranslationState));
                return;
            }
            this.this$0.mo34127b(this.$transactionId.longValue(), this.$machineTranslationState);
        } else if (bVar instanceof C12683b.C12687b.C12688a) {
            this.this$0.mo34127b(this.$transactionId.longValue(), this.$machineTranslationState);
        }
    }
}
