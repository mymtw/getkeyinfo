package com.etsy.android.uikit.viewholder;

import com.etsy.android.lib.models.apiv3.Promotion;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class SignalNudgeListingCardUiModel$freeShippingPromotion$2 extends Lambda implements C19846a<Promotion> {
    public final /* synthetic */ SignalNudgeListingCardUiModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignalNudgeListingCardUiModel$freeShippingPromotion$2(SignalNudgeListingCardUiModel signalNudgeListingCardUiModel) {
        super(0);
        this.this$0 = signalNudgeListingCardUiModel;
    }

    public final Promotion invoke() {
        boolean z;
        List<Promotion> promotions = this.this$0.listing.getPromotions();
        T t = null;
        if (promotions == null) {
            return null;
        }
        SignalNudgeListingCardUiModel signalNudgeListingCardUiModel = this.this$0;
        Iterator<T> it = promotions.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((Promotion) next).getPromotionId() == signalNudgeListingCardUiModel.listing.getFreeShippingData().getPromotionId()) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                t = next;
                break;
            }
        }
        return (Promotion) t;
    }
}
