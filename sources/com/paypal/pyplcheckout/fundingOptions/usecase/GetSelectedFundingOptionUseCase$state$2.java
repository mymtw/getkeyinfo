package com.paypal.pyplcheckout.fundingOptions.usecase;

import com.paypal.pyplcheckout.fundingOptions.model.SelectedOptionState;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.C19656n1;
import p753kq.C19846a;

public final class GetSelectedFundingOptionUseCase$state$2 extends Lambda implements C19846a<C19656n1<SelectedOptionState>> {
    public final /* synthetic */ GetSelectedFundingOptionUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetSelectedFundingOptionUseCase$state$2(GetSelectedFundingOptionUseCase getSelectedFundingOptionUseCase) {
        super(0);
        this.this$0 = getSelectedFundingOptionUseCase;
    }

    public final C19656n1<SelectedOptionState> invoke() {
        GetSelectedFundingOptionUseCase getSelectedFundingOptionUseCase = this.this$0;
        return C19388s.m32862g(getSelectedFundingOptionUseCase.toSelectedOptionState(getSelectedFundingOptionUseCase.repository.getSelectedFundingOption()));
    }
}
