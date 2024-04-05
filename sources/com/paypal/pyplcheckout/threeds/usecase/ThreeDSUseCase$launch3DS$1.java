package com.paypal.pyplcheckout.threeds.usecase;

import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class ThreeDSUseCase$launch3DS$1 extends Lambda implements C19857l<ContingencyEventsModel, C19394m> {
    public final /* synthetic */ ThreeDSUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreeDSUseCase$launch3DS$1(ThreeDSUseCase threeDSUseCase) {
        super(1);
        this.this$0 = threeDSUseCase;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContingencyEventsModel) obj);
        return C19394m.f43287a;
    }

    public final void invoke(ContingencyEventsModel contingencyEventsModel) {
        this.this$0.events.fire(PayPalEventTypes.CONTINGENCY_EVENT, new Success(contingencyEventsModel));
    }
}
