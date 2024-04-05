package com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.translations;

import com.etsy.android.feedback.ReviewUiModel;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10625r;
import com.etsy.android.p327ui.listing.p329ui.C10649t;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.reviews.handlers.translations.UpdateReviewMachineTranslationHandler$handle$1$3 */
public final class UpdateReviewMachineTranslationHandler$handle$1$3 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ List<ReviewUiModel> $updatedList;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateReviewMachineTranslationHandler$handle$1$3(List<ReviewUiModel> list) {
        super(1);
        this.$updatedList = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final List<ReviewUiModel> list = this.$updatedList;
        gVar.mo33964d(new C19857l<C10625r, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10625r) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10625r rVar) {
                C19383o.m32797g(rVar, "$this$panels");
                final List<ReviewUiModel> list = list;
                rVar.mo34253c(new C19857l<C10649t, C19394m>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((C10649t) obj);
                        return C19394m.f43287a;
                    }

                    public final void invoke(C10649t tVar) {
                        C19383o.m32797g(tVar, "$this$reviewsPanel");
                        List<ReviewUiModel> list = list;
                        C19383o.m32797g(list, "<set-?>");
                        tVar.f23411d = list;
                    }
                });
            }
        });
    }
}
