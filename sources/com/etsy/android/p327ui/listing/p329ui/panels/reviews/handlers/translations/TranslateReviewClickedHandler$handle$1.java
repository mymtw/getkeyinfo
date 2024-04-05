package com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.translations;

import com.etsy.android.uikit.util.MachineTranslationViewState;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.reviews.handlers.translations.TranslateReviewClickedHandler$handle$1 */
public final class TranslateReviewClickedHandler$handle$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ MachineTranslationViewState $machineTranslationState;
    public final /* synthetic */ Long $transactionId;
    public final /* synthetic */ TranslateReviewClickedHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranslateReviewClickedHandler$handle$1(TranslateReviewClickedHandler translateReviewClickedHandler, Long l, MachineTranslationViewState machineTranslationViewState) {
        super(1);
        this.this$0 = translateReviewClickedHandler;
        this.$transactionId = l;
        this.$machineTranslationState = machineTranslationViewState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        this.this$0.mo34127b(this.$transactionId.longValue(), this.$machineTranslationState);
    }
}
