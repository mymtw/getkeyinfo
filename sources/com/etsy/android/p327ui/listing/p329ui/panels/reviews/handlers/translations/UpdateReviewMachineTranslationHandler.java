package com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.translations;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.feedback.ReviewUiModel;
import com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto;
import com.etsy.android.lib.models.apiv3.listing.Video;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.C10521a;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C19383o;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.panels.reviews.handlers.translations.UpdateReviewMachineTranslationHandler */
public final class UpdateReviewMachineTranslationHandler {
    /* renamed from: a */
    public static C13574d.C13594c m18509a(ListingViewState.C10092d dVar, C13597g.C13653h5 h5Var) {
        boolean z;
        ListingViewState.C10092d dVar2 = dVar;
        C13597g.C13653h5 h5Var2 = h5Var;
        C19383o.m32797g(h5Var2, "event");
        C10521a aVar = dVar2.f22238f.f22803f.f22847e;
        if (aVar == null) {
            return new C13574d.C13594c(dVar2);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(aVar.f23086d);
        List<ReviewUiModel> list = aVar.f23085c;
        if (list != null) {
            for (ReviewUiModel reviewUiModel : list) {
                Long transactionId = reviewUiModel.getTransactionId();
                long j = h5Var2.f30143a;
                if (transactionId != null && transactionId.longValue() == j) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    arrayList.add(ReviewUiModel.copy$default(reviewUiModel, (Long) null, (String) null, (String) null, (String) null, (Date) null, (Float) null, (String) null, h5Var2.f30144b, h5Var2.f30145c, (String) null, false, (AppreciationPhoto) null, (Video) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Date) null, 4193919, (Object) null));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return C0761x.m1709a1(dVar2, new UpdateReviewMachineTranslationHandler$handle$1$3(arrayList));
    }
}
