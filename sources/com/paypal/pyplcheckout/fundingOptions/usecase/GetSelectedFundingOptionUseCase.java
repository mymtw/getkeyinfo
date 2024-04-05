package com.paypal.pyplcheckout.fundingOptions.usecase;

import com.paypal.pyplcheckout.addcard.usecase.GetAddCardEnabledUseCase;
import com.paypal.pyplcheckout.addshipping.C17193a;
import com.paypal.pyplcheckout.billingagreements.viewmodel.C17203a;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.fundingOptions.model.SelectedOptionState;
import com.paypal.pyplcheckout.services.Repository;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C19656n1;
import kotlinx.coroutines.flow.C19689x1;

public final class GetSelectedFundingOptionUseCase {
    private final EventListener addCardEventListener = new C17224a(this, 0);
    private final EventListener creditsOfferEventListener = new C17193a(this, 1);
    private final Events events;
    private final EventListener fundingInstrumentEventListener = new C17203a(this, 1);
    /* access modifiers changed from: private */
    public final GetAddCardEnabledUseCase getAddCardEnabledUseCase;
    private final EventListener payLaterEventListener = new C17225b(this, 0);
    /* access modifiers changed from: private */
    public final Repository repository;
    private final C19525d0 scope;
    private final C19285c state$delegate = C19350d.m32677b(new GetSelectedFundingOptionUseCase$state$2(this));

    public GetSelectedFundingOptionUseCase(Events events2, Repository repository2, C19525d0 d0Var, GetAddCardEnabledUseCase getAddCardEnabledUseCase2) {
        C19383o.m32797g(events2, "events");
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(d0Var, "scope");
        C19383o.m32797g(getAddCardEnabledUseCase2, "getAddCardEnabledUseCase");
        this.events = events2;
        this.repository = repository2;
        this.scope = d0Var;
        this.getAddCardEnabledUseCase = getAddCardEnabledUseCase2;
    }

    /* access modifiers changed from: private */
    /* renamed from: addCardEventListener$lambda-0  reason: not valid java name */
    public static final void m35254addCardEventListener$lambda0(GetSelectedFundingOptionUseCase getSelectedFundingOptionUseCase, EventType eventType, ResultData resultData) {
        C19383o.m32797g(getSelectedFundingOptionUseCase, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        C19697g.m33468f(getSelectedFundingOptionUseCase.scope, (CoroutineContext) null, (CoroutineStart) null, new GetSelectedFundingOptionUseCase$addCardEventListener$1$1(getSelectedFundingOptionUseCase, (C19340c<? super GetSelectedFundingOptionUseCase$addCardEventListener$1$1>) null), 3);
    }

    /* access modifiers changed from: private */
    /* renamed from: creditsOfferEventListener$lambda-1  reason: not valid java name */
    public static final void m35255creditsOfferEventListener$lambda1(GetSelectedFundingOptionUseCase getSelectedFundingOptionUseCase, EventType eventType, ResultData resultData) {
        C19383o.m32797g(getSelectedFundingOptionUseCase, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        C19697g.m33468f(getSelectedFundingOptionUseCase.scope, (CoroutineContext) null, (CoroutineStart) null, new GetSelectedFundingOptionUseCase$creditsOfferEventListener$1$1(getSelectedFundingOptionUseCase, (C19340c<? super GetSelectedFundingOptionUseCase$creditsOfferEventListener$1$1>) null), 3);
    }

    /* access modifiers changed from: private */
    /* renamed from: fundingInstrumentEventListener$lambda-3  reason: not valid java name */
    public static final void m35256fundingInstrumentEventListener$lambda3(GetSelectedFundingOptionUseCase getSelectedFundingOptionUseCase, EventType eventType, ResultData resultData) {
        C19383o.m32797g(getSelectedFundingOptionUseCase, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        C19697g.m33468f(getSelectedFundingOptionUseCase.scope, (CoroutineContext) null, (CoroutineStart) null, new C17223xe95d5092(getSelectedFundingOptionUseCase, (C19340c<? super C17223xe95d5092>) null), 3);
    }

    /* access modifiers changed from: private */
    public final C19656n1<SelectedOptionState> getState() {
        return (C19656n1) this.state$delegate.getValue();
    }

    private final void listenToEvents() {
        this.events.listen(PayPalEventTypes.CAROUSEL_ADD_CARD_POSITION_TRIGGERED, this.addCardEventListener);
        this.events.listen(PayPalEventTypes.CAROUSEL_CREDIT_OFFER_POSITION_TRIGGERED, this.creditsOfferEventListener);
        this.events.listen(PayPalEventTypes.CAROUSEL_FUNDING_INSTRUMENT_POSITION_TRIGGERED, this.fundingInstrumentEventListener);
        this.events.listen(PayPalEventTypes.CAROUSEL_PAY_IN_FOUR_POSITION_TRIGGERED, this.payLaterEventListener);
    }

    /* access modifiers changed from: private */
    /* renamed from: payLaterEventListener$lambda-2  reason: not valid java name */
    public static final void m35257payLaterEventListener$lambda2(GetSelectedFundingOptionUseCase getSelectedFundingOptionUseCase, EventType eventType, ResultData resultData) {
        C19383o.m32797g(getSelectedFundingOptionUseCase, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        C19697g.m33468f(getSelectedFundingOptionUseCase.scope, (CoroutineContext) null, (CoroutineStart) null, new GetSelectedFundingOptionUseCase$payLaterEventListener$1$1(getSelectedFundingOptionUseCase, (C19340c<? super GetSelectedFundingOptionUseCase$payLaterEventListener$1$1>) null), 3);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r7.getFundingInstrument();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.paypal.pyplcheckout.fundingOptions.model.SelectedOptionState toSelectedOptionState(com.paypal.pyplcheckout.pojo.FundingOption r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            goto L_0x000a
        L_0x0004:
            com.paypal.pyplcheckout.pojo.FundingInstrument r1 = r7.getFundingInstrument()
            if (r1 != 0) goto L_0x000c
        L_0x000a:
            r1 = r0
            goto L_0x0010
        L_0x000c:
            java.lang.String r1 = r1.getType()
        L_0x0010:
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0015
            r1 = r2
        L_0x0015:
            if (r7 != 0) goto L_0x0019
            r3 = r0
            goto L_0x001d
        L_0x0019:
            java.lang.String r3 = r7.getId()
        L_0x001d:
            if (r3 != 0) goto L_0x0023
            com.paypal.pyplcheckout.fundingOptions.model.SelectedOptionState$None r7 = com.paypal.pyplcheckout.fundingOptions.model.SelectedOptionState.None.INSTANCE
            goto L_0x009d
        L_0x0023:
            java.lang.String r3 = r7.getId()
            com.paypal.pyplcheckout.utils.PaymentTypes r4 = com.paypal.pyplcheckout.utils.PaymentTypes.BALANCE
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "BALANCE.toString()"
            kotlin.jvm.internal.C19383o.m32796f(r4, r5)
            r5 = 1
            boolean r3 = kotlin.text.C19459m.m33036e1(r3, r4, r5)
            if (r3 == 0) goto L_0x004c
            com.paypal.pyplcheckout.fundingOptions.model.SelectedOptionState$PayPalBalance r0 = new com.paypal.pyplcheckout.fundingOptions.model.SelectedOptionState$PayPalBalance
            com.paypal.pyplcheckout.pojo.FundingInstrument r1 = r7.getFundingInstrument()
            java.lang.String r1 = r1.getLabel()
            if (r1 != 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r2 = r1
        L_0x0047:
            r0.<init>(r7, r2)
        L_0x004a:
            r7 = r0
            goto L_0x009d
        L_0x004c:
            com.paypal.pyplcheckout.utils.PaymentTypes r3 = com.paypal.pyplcheckout.utils.PaymentTypes.ADD_CARD
            java.lang.String r4 = r7.getId()
            boolean r3 = r3.equals(r4, r5)
            if (r3 == 0) goto L_0x0064
            com.paypal.pyplcheckout.fundingOptions.model.SelectedOptionState$AddCard r7 = new com.paypal.pyplcheckout.fundingOptions.model.SelectedOptionState$AddCard
            com.paypal.pyplcheckout.addcard.usecase.GetAddCardEnabledUseCase r0 = r6.getAddCardEnabledUseCase
            boolean r0 = r0.invoke()
            r7.<init>(r0)
            goto L_0x009d
        L_0x0064:
            com.paypal.pyplcheckout.utils.PaymentTypes r3 = com.paypal.pyplcheckout.utils.PaymentTypes.PAYPAL_CREDIT
            boolean r3 = r3.equals(r1, r5)
            if (r3 == 0) goto L_0x0072
            com.paypal.pyplcheckout.fundingOptions.model.SelectedOptionState$CreditsOffer r7 = new com.paypal.pyplcheckout.fundingOptions.model.SelectedOptionState$CreditsOffer
            r7.<init>(r0, r5, r0)
            goto L_0x009d
        L_0x0072:
            java.lang.String r0 = "Cryptocurrency"
            boolean r0 = kotlin.text.C19457k.m33019W0(r0, r1, r5)
            if (r0 == 0) goto L_0x0080
            com.paypal.pyplcheckout.fundingOptions.model.SelectedOptionState$Crypto r0 = new com.paypal.pyplcheckout.fundingOptions.model.SelectedOptionState$Crypto
            r0.<init>(r7)
            goto L_0x004a
        L_0x0080:
            com.paypal.pyplcheckout.fundingOptions.model.SelectedOptionState$PaymentSource r0 = new com.paypal.pyplcheckout.fundingOptions.model.SelectedOptionState$PaymentSource
            com.paypal.pyplcheckout.pojo.FundingInstrument r1 = r7.getFundingInstrument()
            java.lang.String r1 = r1.getLabel()
            if (r1 != 0) goto L_0x008d
            r1 = r2
        L_0x008d:
            com.paypal.pyplcheckout.pojo.FundingInstrument r3 = r7.getFundingInstrument()
            java.lang.String r3 = r3.getLastDigits()
            if (r3 != 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r2 = r3
        L_0x0099:
            r0.<init>(r7, r1, r2)
            goto L_0x004a
        L_0x009d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.fundingOptions.usecase.GetSelectedFundingOptionUseCase.toSelectedOptionState(com.paypal.pyplcheckout.pojo.FundingOption):com.paypal.pyplcheckout.fundingOptions.model.SelectedOptionState");
    }

    public final C19689x1<SelectedOptionState> invoke() {
        listenToEvents();
        return getState();
    }
}
