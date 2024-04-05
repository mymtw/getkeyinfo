package com.paypal.pyplcheckout.threeds;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus;
import com.paypal.pyplcheckout.events.model.ContingencyType;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.pojo.CheckoutSession;
import com.paypal.pyplcheckout.pojo.PaymentContingencies;
import com.paypal.pyplcheckout.pojo.ThreeDSContingencyData;
import com.paypal.pyplcheckout.pojo.ThreeDsResolution;
import com.paypal.pyplcheckout.pojo.User;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.threeds.ThreeDsException;
import com.paypal.pyplcheckout.utils.RequestCode;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p753kq.C19857l;

public final class ThreeDSDecisionFlow {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final DebugConfigManager configManager;
    private final Context context;
    private final CoroutineContext coroutineContext;
    /* access modifiers changed from: private */
    public final Events events;
    private final Repository repository;
    private final C19525d0 scope;
    private final ThreeDS20 threeDS20;
    private ThreeDSSource threeDSSource = ThreeDSSource.NONE;
    private final ThreeDsDecisionFlowInfo threeDsDecisionFlowInfo;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isThreeDSFlow(PaymentContingencies paymentContingencies) {
            C19383o.m32797g(paymentContingencies, "paymentContingencies");
            return (paymentContingencies.getThreeDomainSecure() == null && paymentContingencies.getThreeDSContingencyData() == null) ? false : true;
        }
    }

    public ThreeDSDecisionFlow(Events events2, Repository repository2, DebugConfigManager debugConfigManager, Context context2, ThreeDS20 threeDS202, ThreeDsDecisionFlowInfo threeDsDecisionFlowInfo2, CoroutineContext coroutineContext2) {
        C19383o.m32797g(events2, "events");
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(debugConfigManager, "configManager");
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        C19383o.m32797g(threeDS202, "threeDS20");
        C19383o.m32797g(threeDsDecisionFlowInfo2, "threeDsDecisionFlowInfo");
        C19383o.m32797g(coroutineContext2, "coroutineContext");
        this.events = events2;
        this.repository = repository2;
        this.configManager = debugConfigManager;
        this.context = context2;
        this.threeDS20 = threeDS202;
        this.threeDsDecisionFlowInfo = threeDsDecisionFlowInfo2;
        this.coroutineContext = coroutineContext2;
        this.scope = C19697g.m33463a(coroutineContext2);
    }

    private final void checkForUnsupportedContingencyObject() throws ThreeDsException.ThreeDSUnsupportedFlowException {
        PaymentContingencies supportedContingencies = this.repository.getSupportedContingencies();
        if ((supportedContingencies == null ? null : supportedContingencies.getThreeDomainSecure()) != null) {
            throw new ThreeDsException.ThreeDSUnsupportedFlowException(new ThreeDsExceptionData(PEnums.ErrorType.FATAL, PEnums.EventCode.E000, PEnums.TransitionName.THREE_DS_10_CONTINGENCY_ENCOUNTERED, (Exception) null, "unsupported threeDomainSecure flow received", C0326j.m864i("status: ", supportedContingencies.getThreeDomainSecure().getStatus()), (String) null, 72, (DefaultConstructorMarker) null));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        r1 = (r1 = r6.getCart()).getTotal();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.paypal.pyplcheckout.pojo.AmountInput createAmountInput(com.paypal.pyplcheckout.pojo.CheckoutSession r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0005
        L_0x0003:
            r1 = r0
            goto L_0x0017
        L_0x0005:
            com.paypal.pyplcheckout.pojo.Cart r1 = r6.getCart()
            if (r1 != 0) goto L_0x000c
            goto L_0x0003
        L_0x000c:
            com.paypal.pyplcheckout.pojo.Amount r1 = r1.getTotal()
            if (r1 != 0) goto L_0x0013
            goto L_0x0003
        L_0x0013:
            java.lang.String r1 = r1.getCurrencyCode()
        L_0x0017:
            if (r6 != 0) goto L_0x001b
        L_0x0019:
            r2 = r0
            goto L_0x002d
        L_0x001b:
            com.paypal.pyplcheckout.pojo.Cart r2 = r6.getCart()
            if (r2 != 0) goto L_0x0022
            goto L_0x0019
        L_0x0022:
            com.paypal.pyplcheckout.pojo.Amount r2 = r2.getTotal()
            if (r2 != 0) goto L_0x0029
            goto L_0x0019
        L_0x0029:
            java.lang.String r2 = r2.getCurrencyValue()
        L_0x002d:
            if (r6 == 0) goto L_0x005f
            com.paypal.pyplcheckout.pojo.Cart r3 = r6.getCart()
            if (r3 == 0) goto L_0x005f
            com.paypal.pyplcheckout.pojo.Cart r6 = r6.getCart()
            com.paypal.pyplcheckout.pojo.Amount r6 = r6.getTotal()
            if (r6 == 0) goto L_0x005f
            r6 = 0
            r3 = 1
            if (r1 == 0) goto L_0x004c
            boolean r4 = kotlin.text.C19457k.m33020X0(r1)
            if (r4 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r4 = r6
            goto L_0x004d
        L_0x004c:
            r4 = r3
        L_0x004d:
            if (r4 != 0) goto L_0x005f
            if (r2 == 0) goto L_0x0057
            boolean r4 = kotlin.text.C19457k.m33020X0(r2)
            if (r4 == 0) goto L_0x0058
        L_0x0057:
            r6 = r3
        L_0x0058:
            if (r6 != 0) goto L_0x005f
            com.paypal.pyplcheckout.pojo.AmountInput r0 = new com.paypal.pyplcheckout.pojo.AmountInput
            r0.<init>(r1, r2)
        L_0x005f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow.createAmountInput(com.paypal.pyplcheckout.pojo.CheckoutSession):com.paypal.pyplcheckout.pojo.AmountInput");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r0 = r0.getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.paypal.pyplcheckout.pojo.ThreeDSLookupPayload createThreeDSLookupPayload(com.paypal.pyplcheckout.pojo.ThreeDsResolution r18) {
        /*
            r17 = this;
            com.paypal.pyplcheckout.pojo.BillingAddressLookupRequest r9 = new com.paypal.pyplcheckout.pojo.BillingAddressLookupRequest
            com.paypal.pyplcheckout.pojo.User r0 = r17.getUser()
            r10 = 0
            if (r0 != 0) goto L_0x000b
        L_0x0009:
            r0 = r10
            goto L_0x0016
        L_0x000b:
            com.paypal.pyplcheckout.pojo.Name r0 = r0.getName()
            if (r0 != 0) goto L_0x0012
            goto L_0x0009
        L_0x0012:
            java.lang.String r0 = r0.getGivenName()
        L_0x0016:
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x001c
            r2 = r1
            goto L_0x001d
        L_0x001c:
            r2 = r0
        L_0x001d:
            com.paypal.pyplcheckout.pojo.User r0 = r17.getUser()
            if (r0 != 0) goto L_0x0025
        L_0x0023:
            r0 = r10
            goto L_0x0030
        L_0x0025:
            com.paypal.pyplcheckout.pojo.Name r0 = r0.getName()
            if (r0 != 0) goto L_0x002c
            goto L_0x0023
        L_0x002c:
            java.lang.String r0 = r0.getFamilyName()
        L_0x0030:
            if (r0 != 0) goto L_0x0034
            r3 = r1
            goto L_0x0035
        L_0x0034:
            r3 = r0
        L_0x0035:
            if (r18 != 0) goto L_0x0039
        L_0x0037:
            r0 = r10
            goto L_0x004b
        L_0x0039:
            com.paypal.pyplcheckout.pojo.ThreeDSPaymentCardData r0 = r18.getPaymentCard()
            if (r0 != 0) goto L_0x0040
            goto L_0x0037
        L_0x0040:
            com.paypal.pyplcheckout.pojo.BillingAddress r0 = r0.getBillingAddress()
            if (r0 != 0) goto L_0x0047
            goto L_0x0037
        L_0x0047:
            java.lang.String r0 = r0.getLine1()
        L_0x004b:
            if (r0 != 0) goto L_0x004f
            r4 = r1
            goto L_0x0050
        L_0x004f:
            r4 = r0
        L_0x0050:
            if (r18 != 0) goto L_0x0054
        L_0x0052:
            r0 = r10
            goto L_0x0066
        L_0x0054:
            com.paypal.pyplcheckout.pojo.ThreeDSPaymentCardData r0 = r18.getPaymentCard()
            if (r0 != 0) goto L_0x005b
            goto L_0x0052
        L_0x005b:
            com.paypal.pyplcheckout.pojo.BillingAddress r0 = r0.getBillingAddress()
            if (r0 != 0) goto L_0x0062
            goto L_0x0052
        L_0x0062:
            java.lang.String r0 = r0.getLine2()
        L_0x0066:
            if (r0 != 0) goto L_0x006a
            r5 = r1
            goto L_0x006b
        L_0x006a:
            r5 = r0
        L_0x006b:
            if (r18 != 0) goto L_0x006f
        L_0x006d:
            r0 = r10
            goto L_0x0081
        L_0x006f:
            com.paypal.pyplcheckout.pojo.ThreeDSPaymentCardData r0 = r18.getPaymentCard()
            if (r0 != 0) goto L_0x0076
            goto L_0x006d
        L_0x0076:
            com.paypal.pyplcheckout.pojo.BillingAddress r0 = r0.getBillingAddress()
            if (r0 != 0) goto L_0x007d
            goto L_0x006d
        L_0x007d:
            java.lang.String r0 = r0.getCity()
        L_0x0081:
            if (r0 != 0) goto L_0x0085
            r6 = r1
            goto L_0x0086
        L_0x0085:
            r6 = r0
        L_0x0086:
            if (r18 != 0) goto L_0x008a
        L_0x0088:
            r0 = r10
            goto L_0x009c
        L_0x008a:
            com.paypal.pyplcheckout.pojo.ThreeDSPaymentCardData r0 = r18.getPaymentCard()
            if (r0 != 0) goto L_0x0091
            goto L_0x0088
        L_0x0091:
            com.paypal.pyplcheckout.pojo.BillingAddress r0 = r0.getBillingAddress()
            if (r0 != 0) goto L_0x0098
            goto L_0x0088
        L_0x0098:
            java.lang.String r0 = r0.getState()
        L_0x009c:
            if (r0 != 0) goto L_0x00a0
            r7 = r1
            goto L_0x00a1
        L_0x00a0:
            r7 = r0
        L_0x00a1:
            if (r18 != 0) goto L_0x00a5
        L_0x00a3:
            r0 = r10
            goto L_0x00b7
        L_0x00a5:
            com.paypal.pyplcheckout.pojo.ThreeDSPaymentCardData r0 = r18.getPaymentCard()
            if (r0 != 0) goto L_0x00ac
            goto L_0x00a3
        L_0x00ac:
            com.paypal.pyplcheckout.pojo.BillingAddress r0 = r0.getBillingAddress()
            if (r0 != 0) goto L_0x00b3
            goto L_0x00a3
        L_0x00b3:
            java.lang.String r0 = r0.getPostalCode()
        L_0x00b7:
            if (r0 != 0) goto L_0x00bb
            r8 = r1
            goto L_0x00bc
        L_0x00bb:
            r8 = r0
        L_0x00bc:
            if (r18 != 0) goto L_0x00c0
        L_0x00be:
            r0 = r10
            goto L_0x00d2
        L_0x00c0:
            com.paypal.pyplcheckout.pojo.ThreeDSPaymentCardData r0 = r18.getPaymentCard()
            if (r0 != 0) goto L_0x00c7
            goto L_0x00be
        L_0x00c7:
            com.paypal.pyplcheckout.pojo.BillingAddress r0 = r0.getBillingAddress()
            if (r0 != 0) goto L_0x00ce
            goto L_0x00be
        L_0x00ce:
            java.lang.String r0 = r0.getCountry()
        L_0x00d2:
            if (r0 != 0) goto L_0x00d6
            r11 = r1
            goto L_0x00d7
        L_0x00d6:
            r11 = r0
        L_0x00d7:
            r0 = r9
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r18 != 0) goto L_0x00e7
            r0 = r10
            goto L_0x00eb
        L_0x00e7:
            com.paypal.pyplcheckout.pojo.ThreeDSContingencyContext r0 = r18.getContingencyContext()
        L_0x00eb:
            if (r0 == 0) goto L_0x01bf
            com.paypal.pyplcheckout.pojo.ThreeDSContingencyContext r0 = r18.getContingencyContext()
            java.lang.String r0 = r0.getReferenceId()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0102
            boolean r0 = kotlin.text.C19457k.m33020X0(r0)
            if (r0 == 0) goto L_0x0100
            goto L_0x0102
        L_0x0100:
            r0 = r1
            goto L_0x0103
        L_0x0102:
            r0 = r2
        L_0x0103:
            if (r0 != 0) goto L_0x01bf
            com.paypal.pyplcheckout.pojo.ThreeDSPaymentCardData r0 = r18.getPaymentCard()
            if (r0 == 0) goto L_0x01bf
            com.paypal.pyplcheckout.pojo.ThreeDSPaymentCardData r0 = r18.getPaymentCard()
            java.lang.String r0 = r0.getEncryptedNumber()
            if (r0 == 0) goto L_0x011e
            boolean r0 = kotlin.text.C19457k.m33020X0(r0)
            if (r0 == 0) goto L_0x011c
            goto L_0x011e
        L_0x011c:
            r0 = r1
            goto L_0x011f
        L_0x011e:
            r0 = r2
        L_0x011f:
            if (r0 != 0) goto L_0x01bf
            com.paypal.pyplcheckout.pojo.ThreeDSPaymentCardData r0 = r18.getPaymentCard()
            java.lang.String r0 = r0.getExpireMonth()
            if (r0 == 0) goto L_0x0134
            boolean r0 = kotlin.text.C19457k.m33020X0(r0)
            if (r0 == 0) goto L_0x0132
            goto L_0x0134
        L_0x0132:
            r0 = r1
            goto L_0x0135
        L_0x0134:
            r0 = r2
        L_0x0135:
            if (r0 != 0) goto L_0x01bf
            com.paypal.pyplcheckout.pojo.ThreeDSPaymentCardData r0 = r18.getPaymentCard()
            java.lang.String r0 = r0.getExpireYear()
            if (r0 == 0) goto L_0x0147
            boolean r0 = kotlin.text.C19457k.m33020X0(r0)
            if (r0 == 0) goto L_0x0148
        L_0x0147:
            r1 = r2
        L_0x0148:
            if (r1 != 0) goto L_0x01bf
            com.paypal.pyplcheckout.pojo.ThreeDSContingencyContext r0 = r18.getContingencyContext()
            java.lang.String r1 = r0.getReferenceId()
            com.paypal.pyplcheckout.pojo.ThreeDSPaymentCardData r0 = r18.getPaymentCard()
            java.lang.String r3 = r0.getEncryptedNumber()
            com.paypal.pyplcheckout.pojo.ThreeDSPaymentCardData r0 = r18.getPaymentCard()
            java.lang.String r5 = r0.getExpireMonth()
            com.paypal.pyplcheckout.pojo.ThreeDSPaymentCardData r0 = r18.getPaymentCard()
            java.lang.String r6 = r0.getExpireYear()
            com.paypal.pyplcheckout.pojo.ThreeDSContingencyContext r0 = r18.getContingencyContext()
            java.lang.String r0 = r0.getReason()
            if (r0 != 0) goto L_0x0176
            r11 = r10
            goto L_0x0183
        L_0x0176:
            com.paypal.pyplcheckout.pojo.ThreeDSContingencyContext r0 = r18.getContingencyContext()
            java.lang.String r0 = r0.getReason()
            com.paypal.pyplcheckout.pojo.ThreeDSContingencyReasonType r0 = com.paypal.pyplcheckout.pojo.ThreeDSContingencyReasonType.valueOf(r0)
            r11 = r0
        L_0x0183:
            com.paypal.pyplcheckout.pojo.ThreeDSContingencyContext r0 = r18.getContingencyContext()
            java.lang.String r0 = r0.getSource()
            if (r0 != 0) goto L_0x018f
            r12 = r10
            goto L_0x019c
        L_0x018f:
            com.paypal.pyplcheckout.pojo.ThreeDSContingencyContext r0 = r18.getContingencyContext()
            java.lang.String r0 = r0.getSource()
            com.paypal.pyplcheckout.pojo.ThreeDSContingencySourceType r0 = com.paypal.pyplcheckout.pojo.ThreeDSContingencySourceType.valueOf(r0)
            r12 = r0
        L_0x019c:
            com.paypal.pyplcheckout.pojo.ThreeDSPaymentCardData r0 = r18.getPaymentCard()
            java.lang.String r0 = r0.getCardProductClass()
            if (r0 != 0) goto L_0x01a8
            r7 = r10
            goto L_0x01ad
        L_0x01a8:
            com.paypal.pyplcheckout.pojo.FundingInstrumentSubtype r0 = com.paypal.pyplcheckout.pojo.FundingInstrumentSubtype.valueOf(r0)
            r7 = r0
        L_0x01ad:
            com.paypal.pyplcheckout.pojo.ThreeDSLookupPayload r16 = new com.paypal.pyplcheckout.pojo.ThreeDSLookupPayload
            r4 = 0
            r8 = 0
            r10 = 0
            r13 = 0
            r14 = 4744(0x1288, float:6.648E-42)
            r15 = 0
            java.lang.String r2 = "Hermes"
            r0 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r10 = r16
        L_0x01bf:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow.createThreeDSLookupPayload(com.paypal.pyplcheckout.pojo.ThreeDsResolution):com.paypal.pyplcheckout.pojo.ThreeDSLookupPayload");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0178 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object decisioningFlow(android.app.Activity r20, kotlin.coroutines.C19340c<? super kotlin.C19394m> r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$decisioningFlow$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$decisioningFlow$1 r2 = (com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$decisioningFlow$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$decisioningFlow$1 r2 = new com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$decisioningFlow$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r15 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r2.label
            r14 = 3
            r13 = 2
            r16 = 0
            r12 = 0
            r11 = 1
            if (r3 == 0) goto L_0x005a
            if (r3 == r11) goto L_0x004a
            if (r3 == r13) goto L_0x003d
            if (r3 != r14) goto L_0x0035
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            goto L_0x0179
        L_0x0035:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003d:
            java.lang.Object r3 = r2.L$1
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r4 = r2.L$0
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow r4 = (com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            goto L_0x0168
        L_0x004a:
            java.lang.Object r3 = r2.L$1
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r4 = r2.L$0
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow r4 = (com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)     // Catch:{ Exception -> 0x01a2 }
            r5 = r4
            r4 = r1
            r1 = r13
            goto L_0x00f2
        L_0x005a:
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            r19.checkForUnsupportedContingencyObject()
            com.paypal.pyplcheckout.pojo.ThreeDsResolution r1 = r19.getThreeDSResolution()
            if (r1 == 0) goto L_0x01ec
            com.paypal.pyplcheckout.pojo.ThreeDSContingencyContext r1 = r1.getContingencyContext()
            if (r1 == 0) goto L_0x01e0
            java.lang.String r4 = r1.getReferenceId()
            if (r4 == 0) goto L_0x007c
            boolean r3 = kotlin.text.C19457k.m33020X0(r4)
            if (r3 == 0) goto L_0x0079
            goto L_0x007c
        L_0x0079:
            r3 = r16
            goto L_0x007d
        L_0x007c:
            r3 = r11
        L_0x007d:
            if (r3 != 0) goto L_0x01d4
            com.paypal.pyplcheckout.pojo.ThreeDSJwtSpecification r3 = r1.getJwtSpecification()
            java.lang.String r5 = r3.getJwtIssuer()
            if (r5 == 0) goto L_0x0093
            boolean r3 = kotlin.text.C19457k.m33020X0(r5)
            if (r3 == 0) goto L_0x0090
            goto L_0x0093
        L_0x0090:
            r3 = r16
            goto L_0x0094
        L_0x0093:
            r3 = r11
        L_0x0094:
            if (r3 != 0) goto L_0x01c8
            com.paypal.pyplcheckout.pojo.ThreeDSJwtSpecification r1 = r1.getJwtSpecification()
            java.lang.String r6 = r1.getJwtOrgUnitId()
            if (r6 == 0) goto L_0x00aa
            boolean r1 = kotlin.text.C19457k.m33020X0(r6)
            if (r1 == 0) goto L_0x00a7
            goto L_0x00aa
        L_0x00a7:
            r1 = r16
            goto L_0x00ab
        L_0x00aa:
            r1 = r11
        L_0x00ab:
            if (r1 != 0) goto L_0x01bc
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r1 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_JWT_QUERY_STARTED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.ATTEMPTED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r7 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E160
            java.lang.String r8 = "3ds jwt started"
            r0.logDecision(r1, r8, r3, r7)
            com.paypal.pyplcheckout.events.model.ContingencyType r1 = com.paypal.pyplcheckout.events.model.ContingencyType.THREE_DS_V2_CONTINGENCY
            com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus r3 = com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus.THREE_DS_JWT_1_STARTED
            java.lang.String r7 = "first jwt call started"
            r0.emitStatus(r1, r3, r7)
            com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory$Companion r1 = com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory.Companion     // Catch:{ Exception -> 0x01a2 }
            com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory r1 = r1.getThreeDSJwtApiFactory()     // Catch:{ Exception -> 0x01a2 }
            java.lang.Object r1 = r1.create()     // Catch:{ Exception -> 0x01a2 }
            r3 = r1
            com.paypal.pyplcheckout.services.api.ThreeDSJwtApi r3 = (com.paypal.pyplcheckout.services.api.ThreeDSJwtApi) r3     // Catch:{ Exception -> 0x01a2 }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r1 = 0
            r17 = 248(0xf8, float:3.48E-43)
            r18 = 0
            r2.L$0 = r0     // Catch:{ Exception -> 0x01a2 }
            r14 = r20
            r2.L$1 = r14     // Catch:{ Exception -> 0x01a2 }
            r2.label = r11     // Catch:{ Exception -> 0x01a2 }
            r11 = r1
            r1 = r12
            r12 = r2
            r1 = r13
            r13 = r17
            r14 = r18
            java.lang.Object r3 = com.paypal.pyplcheckout.services.api.ThreeDSJwtApi.getThreeDSJwt$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x01a2 }
            if (r3 != r15) goto L_0x00ee
            return r15
        L_0x00ee:
            r5 = r0
            r4 = r3
            r3 = r20
        L_0x00f2:
            com.paypal.pyplcheckout.pojo.ThreeDSInitJWT r4 = (com.paypal.pyplcheckout.pojo.ThreeDSInitJWT) r4     // Catch:{ Exception -> 0x01a2 }
            if (r4 != 0) goto L_0x00f8
            r12 = 0
            goto L_0x00fc
        L_0x00f8:
            java.util.List r12 = r4.getErrors()
        L_0x00fc:
            if (r12 == 0) goto L_0x0108
            boolean r6 = r12.isEmpty()
            if (r6 == 0) goto L_0x0105
            goto L_0x0108
        L_0x0105:
            r11 = r16
            goto L_0x0109
        L_0x0108:
            r11 = 1
        L_0x0109:
            if (r11 == 0) goto L_0x0188
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r6 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_JWT_QUERY_FINISHED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r7 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.SUCCESS
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r8 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E600
            java.lang.String r9 = "3ds jwt finished"
            r5.logDecision(r6, r9, r7, r8)
            if (r4 != 0) goto L_0x011a
        L_0x0118:
            r12 = 0
            goto L_0x0125
        L_0x011a:
            com.paypal.pyplcheckout.pojo.ThreeDSJwt r4 = r4.getData()
            if (r4 != 0) goto L_0x0121
            goto L_0x0118
        L_0x0121:
            java.lang.String r12 = r4.getThreeDSJwt()
        L_0x0125:
            if (r12 == 0) goto L_0x012d
            boolean r4 = kotlin.text.C19457k.m33020X0(r12)
            if (r4 == 0) goto L_0x012f
        L_0x012d:
            r16 = 1
        L_0x012f:
            if (r16 != 0) goto L_0x017c
            com.paypal.pyplcheckout.threeds.ThreeDS20 r4 = r5.threeDS20
            android.content.Context r6 = r5.context
            com.paypal.pyplcheckout.model.DebugConfigManager r7 = r5.configManager
            com.paypal.pyplcheckout.model.CheckoutEnvironment r7 = r7.getCheckoutEnvironment()
            java.lang.String r7 = r7.getEnvironment()
            com.paypal.pyplcheckout.merchantIntegration.RunTimeEnvironment r8 = com.paypal.pyplcheckout.merchantIntegration.RunTimeEnvironment.STAGE
            java.lang.String r8 = r8.toString()
            boolean r7 = kotlin.jvm.internal.C19383o.m32792b(r7, r8)
            r8 = 1
            r4.configure(r6, r8, r7)
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r4 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_DDC_STARTED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r6 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.ATTEMPTED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r7 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E161
            java.lang.String r8 = "device data collection started"
            r5.logDecision(r4, r8, r6, r7)
            com.paypal.pyplcheckout.threeds.ThreeDS20 r4 = r5.threeDS20
            r2.L$0 = r5
            r2.L$1 = r3
            r2.label = r1
            java.lang.Object r1 = r5.init(r4, r12, r2)
            if (r1 != r15) goto L_0x0167
            return r15
        L_0x0167:
            r4 = r5
        L_0x0168:
            java.lang.String r1 = (java.lang.String) r1
            r5 = 0
            r2.L$0 = r5
            r2.L$1 = r5
            r5 = 3
            r2.label = r5
            java.lang.Object r1 = r4.onSetupCompleted(r3, r1, r2)
            if (r1 != r15) goto L_0x0179
            return r15
        L_0x0179:
            kotlin.m r1 = kotlin.C19394m.f43287a
            return r1
        L_0x017c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "jwt is null or blank"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0188:
            com.paypal.pyplcheckout.threeds.ThreeDsException$ThreeDSJwtException r1 = new com.paypal.pyplcheckout.threeds.ThreeDsException$ThreeDSJwtException
            com.paypal.pyplcheckout.threeds.ThreeDsExceptionData r12 = new com.paypal.pyplcheckout.threeds.ThreeDsExceptionData
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.FATAL
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r4 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E611
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_JWT_QUERY_FINISHED
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 104(0x68, float:1.46E-43)
            r11 = 0
            java.lang.String r7 = "jwt response has errors"
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.<init>(r12)
            throw r1
        L_0x01a2:
            com.paypal.pyplcheckout.threeds.ThreeDsException$ThreeDSJwtException r1 = new com.paypal.pyplcheckout.threeds.ThreeDsException$ThreeDSJwtException
            com.paypal.pyplcheckout.threeds.ThreeDsExceptionData r12 = new com.paypal.pyplcheckout.threeds.ThreeDsExceptionData
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.FATAL
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r4 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E611
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_JWT_QUERY_FINISHED
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 104(0x68, float:1.46E-43)
            r11 = 0
            java.lang.String r7 = "jwt api call failed"
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.<init>(r12)
            throw r1
        L_0x01bc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "jwtOrgUnitId is null or blank"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01c8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "jwtIssuer is null or blank"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01d4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "referenceId is null or blank"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01e0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "threeDSContingencyContext is null"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01ec:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "threeDsResolution is null"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow.decisioningFlow(android.app.Activity, kotlin.coroutines.c):java.lang.Object");
    }

    private final void emitStatus(ContingencyType contingencyType, ContingencyProcessingStatus contingencyProcessingStatus, String str) {
        this.events.fire(PayPalEventTypes.CONTINGENCY_EVENT, new Success(new ContingencyEventsModel(contingencyType, contingencyProcessingStatus, (Exception) null, str, this.threeDSSource, 4, (DefaultConstructorMarker) null)));
    }

    public static /* synthetic */ void emitStatus$default(ThreeDSDecisionFlow threeDSDecisionFlow, ContingencyType contingencyType, ContingencyProcessingStatus contingencyProcessingStatus, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        threeDSDecisionFlow.emitStatus(contingencyType, contingencyProcessingStatus, str);
    }

    private final CheckoutSession getCheckoutSession() {
        return this.repository.getCheckoutSession();
    }

    private final String getEcToken() {
        return this.repository.getPaymentToken();
    }

    /* access modifiers changed from: private */
    public final String getPaymentAuthenticationRequest() {
        return this.repository.getPaymentAuthenticationRequest();
    }

    /* access modifiers changed from: private */
    public final String getThreeDSProcessorTraceNumber() {
        return this.repository.getThreeDSProcessorTraceNumber();
    }

    private final ThreeDsResolution getThreeDSResolution() {
        ThreeDSContingencyData threeDSContingencyData;
        PaymentContingencies supportedContingencies = this.repository.getSupportedContingencies();
        if (supportedContingencies == null || (threeDSContingencyData = supportedContingencies.getThreeDSContingencyData()) == null) {
            return null;
        }
        return threeDSContingencyData.getResolution();
    }

    /* access modifiers changed from: private */
    public final String getTransactionId() {
        return this.repository.getTransactionId();
    }

    private final User getUser() {
        return this.repository.getUser();
    }

    /* access modifiers changed from: private */
    public final Object init(ThreeDS20 threeDS202, String str, C19340c<? super String> cVar) {
        return this.threeDsDecisionFlowInfo.init(str, cVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object onSetupCompleted(android.app.Activity r12, java.lang.String r13, kotlin.coroutines.C19340c<? super kotlin.C19394m> r14) {
        /*
            r11 = this;
            boolean r13 = r14 instanceof com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$onSetupCompleted$1
            if (r13 == 0) goto L_0x0013
            r13 = r14
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$onSetupCompleted$1 r13 = (com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$onSetupCompleted$1) r13
            int r0 = r13.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r13.label = r0
            goto L_0x0018
        L_0x0013:
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$onSetupCompleted$1 r13 = new com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$onSetupCompleted$1
            r13.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r13.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r13.label
            r9 = 2
            r10 = 1
            if (r0 == 0) goto L_0x0043
            if (r0 == r10) goto L_0x0033
            if (r0 != r9) goto L_0x002b
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            goto L_0x01aa
        L_0x002b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0033:
            java.lang.Object r12 = r13.L$1
            android.app.Activity r12 = (android.app.Activity) r12
            java.lang.Object r0 = r13.L$0
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow r0 = (com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)     // Catch:{ Exception -> 0x003f }
            goto L_0x0094
        L_0x003f:
            r12 = move-exception
            r4 = r12
            goto L_0x0204
        L_0x0043:
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r14 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_DDC_FINISHED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r0 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.SUCCESS
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r1 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E601
            java.lang.String r2 = "device data collection finished"
            r11.logDecision(r14, r2, r0, r1)
            com.paypal.pyplcheckout.pojo.CheckoutSession r14 = r11.getCheckoutSession()
            com.paypal.pyplcheckout.pojo.AmountInput r2 = r11.createAmountInput(r14)
            if (r2 == 0) goto L_0x022c
            com.paypal.pyplcheckout.pojo.ThreeDsResolution r14 = r11.getThreeDSResolution()
            com.paypal.pyplcheckout.pojo.ThreeDSLookupPayload r1 = r11.createThreeDSLookupPayload(r14)
            if (r1 == 0) goto L_0x0220
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r14 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_LOOKUP_STARTED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r0 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.ATTEMPTED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E162
            java.lang.String r4 = "3ds lookup started"
            r11.logDecision(r14, r4, r0, r3)
            com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory$Companion r14 = com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory.Companion     // Catch:{ Exception -> 0x003f }
            com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory r14 = r14.getThreeDSLookUpApiFactory()     // Catch:{ Exception -> 0x003f }
            java.lang.Object r14 = r14.create()     // Catch:{ Exception -> 0x003f }
            r0 = r14
            com.paypal.pyplcheckout.services.api.ThreeDSLookUpApi r0 = (com.paypal.pyplcheckout.services.api.ThreeDSLookUpApi) r0     // Catch:{ Exception -> 0x003f }
            java.lang.String r3 = r11.getEcToken()     // Catch:{ Exception -> 0x003f }
            r4 = 0
            r6 = 8
            r7 = 0
            r13.L$0 = r11     // Catch:{ Exception -> 0x003f }
            r13.L$1 = r12     // Catch:{ Exception -> 0x003f }
            r13.label = r10     // Catch:{ Exception -> 0x003f }
            r5 = r13
            java.lang.Object r14 = com.paypal.pyplcheckout.services.api.ThreeDSLookUpApi.getThreeDSLookupResponse$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x003f }
            if (r14 != r8) goto L_0x0093
            return r8
        L_0x0093:
            r0 = r11
        L_0x0094:
            com.paypal.pyplcheckout.pojo.ThreeDSLookUpResponse r14 = (com.paypal.pyplcheckout.pojo.ThreeDSLookUpResponse) r14     // Catch:{ Exception -> 0x003f }
            r1 = 0
            if (r14 != 0) goto L_0x009b
            r2 = r1
            goto L_0x009f
        L_0x009b:
            java.util.List r2 = r14.getErrors()
        L_0x009f:
            r3 = 0
            if (r2 == 0) goto L_0x00ab
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            r2 = r3
            goto L_0x00ac
        L_0x00ab:
            r2 = r10
        L_0x00ac:
            if (r2 == 0) goto L_0x01ea
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r2 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_LOOKUP_FINISHED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r4 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.SUCCESS
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E602
            java.lang.String r6 = "3ds lookup finished"
            r0.logDecision(r2, r6, r4, r5)
            if (r14 != 0) goto L_0x00bc
            goto L_0x00c9
        L_0x00bc:
            com.paypal.pyplcheckout.pojo.ThreeDSLookUpResponseData r2 = r14.getData()
            if (r2 != 0) goto L_0x00c3
            goto L_0x00c9
        L_0x00c3:
            com.paypal.pyplcheckout.pojo.ThreeDSLookUp r2 = r2.getThreeDSLookUp()
            if (r2 != 0) goto L_0x00cb
        L_0x00c9:
            r2 = r1
            goto L_0x00cf
        L_0x00cb:
            java.lang.String r2 = r2.getThreeDSStatus()
        L_0x00cf:
            java.lang.String r4 = "SUCCESS"
            boolean r2 = kotlin.text.C19457k.m33019W0(r2, r4, r3)
            if (r2 == 0) goto L_0x00f1
            com.paypal.pyplcheckout.events.Events r12 = r0.events
            com.paypal.pyplcheckout.events.PayPalEventTypes r13 = com.paypal.pyplcheckout.events.PayPalEventTypes.CLEARED_THREE_DS_CONTINGENCIES
            com.paypal.pyplcheckout.events.Success r14 = new com.paypal.pyplcheckout.events.Success
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r14.<init>(r1)
            r12.fire(r13, r14)
            com.paypal.pyplcheckout.events.model.ContingencyType r1 = com.paypal.pyplcheckout.events.model.ContingencyType.THREE_DS_V2_CONTINGENCY
            com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus r2 = com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus.THREE_DS_RESOLVE_SUCCESS
            r3 = 0
            r4 = 4
            r5 = 0
            emitStatus$default(r0, r1, r2, r3, r4, r5)
            goto L_0x01b7
        L_0x00f1:
            if (r14 != 0) goto L_0x00f4
            goto L_0x0101
        L_0x00f4:
            com.paypal.pyplcheckout.pojo.ThreeDSLookUpResponseData r2 = r14.getData()
            if (r2 != 0) goto L_0x00fb
            goto L_0x0101
        L_0x00fb:
            com.paypal.pyplcheckout.pojo.ThreeDSLookUp r2 = r2.getThreeDSLookUp()
            if (r2 != 0) goto L_0x0103
        L_0x0101:
            r2 = r1
            goto L_0x0107
        L_0x0103:
            java.lang.String r2 = r2.getThreeDSVersion()
        L_0x0107:
            if (r2 == 0) goto L_0x0112
            boolean r4 = kotlin.text.C19457k.m33020X0(r2)
            if (r4 == 0) goto L_0x0110
            goto L_0x0112
        L_0x0110:
            r4 = r3
            goto L_0x0113
        L_0x0112:
            r4 = r10
        L_0x0113:
            if (r4 != 0) goto L_0x01de
            if (r14 != 0) goto L_0x0118
            goto L_0x0125
        L_0x0118:
            com.paypal.pyplcheckout.pojo.ThreeDSLookUpResponseData r4 = r14.getData()
            if (r4 != 0) goto L_0x011f
            goto L_0x0125
        L_0x011f:
            com.paypal.pyplcheckout.pojo.ThreeDSLookUp r4 = r4.getThreeDSLookUp()
            if (r4 != 0) goto L_0x0127
        L_0x0125:
            r4 = r1
            goto L_0x012b
        L_0x0127:
            java.lang.String r4 = r4.getTransactionId()
        L_0x012b:
            if (r4 == 0) goto L_0x0136
            boolean r5 = kotlin.text.C19457k.m33020X0(r4)
            if (r5 == 0) goto L_0x0134
            goto L_0x0136
        L_0x0134:
            r5 = r3
            goto L_0x0137
        L_0x0136:
            r5 = r10
        L_0x0137:
            if (r5 != 0) goto L_0x01d2
            if (r14 != 0) goto L_0x013c
            goto L_0x0149
        L_0x013c:
            com.paypal.pyplcheckout.pojo.ThreeDSLookUpResponseData r5 = r14.getData()
            if (r5 != 0) goto L_0x0143
            goto L_0x0149
        L_0x0143:
            com.paypal.pyplcheckout.pojo.ThreeDSLookUp r5 = r5.getThreeDSLookUp()
            if (r5 != 0) goto L_0x014b
        L_0x0149:
            r5 = r1
            goto L_0x014f
        L_0x014b:
            java.lang.String r5 = r5.getThreeDsProcessorTraceNumber()
        L_0x014f:
            if (r5 == 0) goto L_0x015a
            boolean r6 = kotlin.text.C19457k.m33020X0(r5)
            if (r6 == 0) goto L_0x0158
            goto L_0x015a
        L_0x0158:
            r6 = r3
            goto L_0x015b
        L_0x015a:
            r6 = r10
        L_0x015b:
            if (r6 != 0) goto L_0x01c6
            if (r14 != 0) goto L_0x0160
            goto L_0x016d
        L_0x0160:
            com.paypal.pyplcheckout.pojo.ThreeDSLookUpResponseData r6 = r14.getData()
            if (r6 != 0) goto L_0x0167
            goto L_0x016d
        L_0x0167:
            com.paypal.pyplcheckout.pojo.ThreeDSLookUp r6 = r6.getThreeDSLookUp()
            if (r6 != 0) goto L_0x016f
        L_0x016d:
            r6 = r1
            goto L_0x0173
        L_0x016f:
            java.lang.String r6 = r6.getPaymentAuthenticationRequest()
        L_0x0173:
            if (r6 == 0) goto L_0x017d
            boolean r7 = kotlin.text.C19457k.m33020X0(r6)
            if (r7 == 0) goto L_0x017c
            goto L_0x017d
        L_0x017c:
            r10 = r3
        L_0x017d:
            if (r10 != 0) goto L_0x01ba
            com.paypal.pyplcheckout.services.Repository r7 = r0.repository
            r7.setTransactionId(r4)
            com.paypal.pyplcheckout.services.Repository r7 = r0.repository
            r7.setPaymentAuthenticationRequest(r6)
            com.paypal.pyplcheckout.services.Repository r7 = r0.repository
            r7.setThreeDSProcessorTraceNumber(r5)
            java.lang.String r7 = "1"
            boolean r2 = kotlin.text.C19457k.m33025c1(r2, r7, r3)
            if (r2 == 0) goto L_0x01ad
            com.paypal.pyplcheckout.services.Repository r12 = r0.repository
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Stage r2 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Stage.THREE_DS_V1
            r12.setStage(r2)
            r13.L$0 = r1
            r13.L$1 = r1
            r13.label = r9
            java.lang.Object r12 = r0.threeDS10StepUp(r4, r6, r14, r13)
            if (r12 != r8) goto L_0x01aa
            return r8
        L_0x01aa:
            kotlin.m r12 = kotlin.C19394m.f43287a
            return r12
        L_0x01ad:
            com.paypal.pyplcheckout.services.Repository r13 = r0.repository
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Stage r14 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Stage.THREE_DS_V2
            r13.setStage(r14)
            r0.threeDS20StepUp(r5, r6, r12)
        L_0x01b7:
            kotlin.m r12 = kotlin.C19394m.f43287a
            return r12
        L_0x01ba:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "paymentAuthenticationRequest is null or blank"
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x01c6:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "threeDsProcessorTraceNumber is null or blank"
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x01d2:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "transactionId is null or blank"
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x01de:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "version is null or blank"
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x01ea:
            com.paypal.pyplcheckout.threeds.ThreeDsException$ThreeDSLookUpException r12 = new com.paypal.pyplcheckout.threeds.ThreeDsException$ThreeDSLookUpException
            com.paypal.pyplcheckout.threeds.ThreeDsExceptionData r13 = new com.paypal.pyplcheckout.threeds.ThreeDsExceptionData
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r1 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.FATAL
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r2 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E611
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_LOOKUP_FINISHED
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 104(0x68, float:1.46E-43)
            r9 = 0
            java.lang.String r5 = "3ds lookup response has errors"
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r12.<init>(r13)
            throw r12
        L_0x0204:
            com.paypal.pyplcheckout.threeds.ThreeDsException$ThreeDSLookUpException r12 = new com.paypal.pyplcheckout.threeds.ThreeDsException$ThreeDSLookUpException
            com.paypal.pyplcheckout.threeds.ThreeDsExceptionData r13 = new com.paypal.pyplcheckout.threeds.ThreeDsExceptionData
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r1 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.FATAL
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r2 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E609
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_LOOKUP_FINISHED
            java.lang.String r5 = r4.getMessage()
            r6 = 0
            r8 = 32
            r9 = 0
            java.lang.String r7 = "3ds lookup failure"
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r12.<init>(r13)
            throw r12
        L_0x0220:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "threeDSLookupPayload is null"
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x022c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "amount is null"
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow.onSetupCompleted(android.app.Activity, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    public static /* synthetic */ void startThreeDsFlow$default(ThreeDSDecisionFlow threeDSDecisionFlow, Activity activity, ThreeDSSource threeDSSource2, C19857l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            threeDSSource2 = ThreeDSSource.CTA;
        }
        threeDSDecisionFlow.startThreeDsFlow(activity, threeDSSource2, lVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        r4 = (r4 = r2.getThreeDSContingencyData()).getResolution();
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x016e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object threeDS10StepUp(java.lang.String r25, java.lang.String r26, com.paypal.pyplcheckout.pojo.ThreeDSLookUpResponse r27, kotlin.coroutines.C19340c<? super kotlin.C19394m> r28) {
        /*
            r24 = this;
            r1 = r24
            r0 = r27
            r2 = r28
            boolean r3 = r2 instanceof com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$threeDS10StepUp$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$threeDS10StepUp$1 r3 = (com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$threeDS10StepUp$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$threeDS10StepUp$1 r3 = new com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$threeDS10StepUp$1
            r3.<init>(r1, r2)
        L_0x001e:
            r13 = r3
            java.lang.Object r2 = r13.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r13.label
            r14 = 0
            r15 = 1
            r16 = 0
            if (r4 == 0) goto L_0x0054
            if (r4 != r15) goto L_0x004c
            java.lang.Object r0 = r13.L$3
            com.paypal.pyplcheckout.pojo.ThreeDSLookUpResponse r0 = (com.paypal.pyplcheckout.pojo.ThreeDSLookUpResponse) r0
            java.lang.Object r3 = r13.L$2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r13.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r13.L$0
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow r5 = (com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)     // Catch:{ Exception -> 0x0047 }
            r23 = r4
            r4 = r2
            r2 = r23
            goto L_0x016a
        L_0x0047:
            r0 = move-exception
            r17 = r0
            goto L_0x0227
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0054:
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
            com.paypal.pyplcheckout.services.Repository r2 = r1.repository
            com.paypal.pyplcheckout.pojo.PaymentContingencies r2 = r2.getSupportedContingencies()
            if (r2 != 0) goto L_0x0062
        L_0x005f:
            r4 = r16
            goto L_0x0074
        L_0x0062:
            com.paypal.pyplcheckout.pojo.ThreeDSContingencyData r4 = r2.getThreeDSContingencyData()
            if (r4 != 0) goto L_0x0069
            goto L_0x005f
        L_0x0069:
            com.paypal.pyplcheckout.pojo.ThreeDsResolution r4 = r4.getResolution()
            if (r4 != 0) goto L_0x0070
            goto L_0x005f
        L_0x0070:
            com.paypal.pyplcheckout.pojo.ThreeDSPaymentCardData r4 = r4.getPaymentCard()
        L_0x0074:
            if (r2 != 0) goto L_0x0079
        L_0x0076:
            r2 = r16
            goto L_0x008b
        L_0x0079:
            com.paypal.pyplcheckout.pojo.ThreeDSContingencyData r2 = r2.getThreeDSContingencyData()
            if (r2 != 0) goto L_0x0080
            goto L_0x0076
        L_0x0080:
            com.paypal.pyplcheckout.pojo.ThreeDsResolution r2 = r2.getResolution()
            if (r2 != 0) goto L_0x0087
            goto L_0x0076
        L_0x0087:
            com.paypal.pyplcheckout.pojo.ThreeDSContingencyContext r2 = r2.getContingencyContext()
        L_0x008b:
            if (r4 != 0) goto L_0x0090
            r12 = r16
            goto L_0x0095
        L_0x0090:
            java.lang.String r4 = r4.getBankIdentificationNumber()
            r12 = r4
        L_0x0095:
            if (r12 == 0) goto L_0x00a0
            boolean r4 = kotlin.text.C19457k.m33020X0(r12)
            if (r4 == 0) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            r4 = r14
            goto L_0x00a1
        L_0x00a0:
            r4 = r15
        L_0x00a1:
            if (r4 != 0) goto L_0x0275
            if (r2 != 0) goto L_0x00a8
        L_0x00a5:
            r6 = r16
            goto L_0x00b4
        L_0x00a8:
            com.paypal.pyplcheckout.pojo.ThreeDSJwtSpecification r4 = r2.getJwtSpecification()
            if (r4 != 0) goto L_0x00af
            goto L_0x00a5
        L_0x00af:
            java.lang.String r4 = r4.getJwtIssuer()
            r6 = r4
        L_0x00b4:
            if (r6 == 0) goto L_0x00bf
            boolean r4 = kotlin.text.C19457k.m33020X0(r6)
            if (r4 == 0) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            r4 = r14
            goto L_0x00c0
        L_0x00bf:
            r4 = r15
        L_0x00c0:
            if (r4 != 0) goto L_0x0269
            if (r2 != 0) goto L_0x00c7
        L_0x00c4:
            r7 = r16
            goto L_0x00d3
        L_0x00c7:
            com.paypal.pyplcheckout.pojo.ThreeDSJwtSpecification r2 = r2.getJwtSpecification()
            if (r2 != 0) goto L_0x00ce
            goto L_0x00c4
        L_0x00ce:
            java.lang.String r2 = r2.getJwtOrgUnitId()
            r7 = r2
        L_0x00d3:
            if (r7 == 0) goto L_0x00de
            boolean r2 = kotlin.text.C19457k.m33020X0(r7)
            if (r2 == 0) goto L_0x00dc
            goto L_0x00de
        L_0x00dc:
            r2 = r14
            goto L_0x00df
        L_0x00de:
            r2 = r15
        L_0x00df:
            if (r2 != 0) goto L_0x025d
            if (r0 != 0) goto L_0x00e6
        L_0x00e3:
            r9 = r16
            goto L_0x0100
        L_0x00e6:
            com.paypal.pyplcheckout.pojo.ThreeDSLookUpResponseData r2 = r27.getData()
            if (r2 != 0) goto L_0x00ed
            goto L_0x00e3
        L_0x00ed:
            com.paypal.pyplcheckout.pojo.ThreeDSLookUp r2 = r2.getThreeDSLookUp()
            if (r2 != 0) goto L_0x00f4
            goto L_0x00e3
        L_0x00f4:
            com.paypal.pyplcheckout.pojo.GenericURL r2 = r2.getAcsURL()
            if (r2 != 0) goto L_0x00fb
            goto L_0x00e3
        L_0x00fb:
            java.lang.String r2 = r2.getHref()
            r9 = r2
        L_0x0100:
            if (r9 == 0) goto L_0x010b
            boolean r2 = kotlin.text.C19457k.m33020X0(r9)
            if (r2 == 0) goto L_0x0109
            goto L_0x010b
        L_0x0109:
            r2 = r14
            goto L_0x010c
        L_0x010b:
            r2 = r15
        L_0x010c:
            if (r2 != 0) goto L_0x0251
            if (r0 != 0) goto L_0x0113
        L_0x0110:
            r10 = r16
            goto L_0x0126
        L_0x0113:
            com.paypal.pyplcheckout.pojo.ThreeDSLookUpResponseData r2 = r27.getData()
            if (r2 != 0) goto L_0x011a
            goto L_0x0110
        L_0x011a:
            com.paypal.pyplcheckout.pojo.ThreeDSLookUp r2 = r2.getThreeDSLookUp()
            if (r2 != 0) goto L_0x0121
            goto L_0x0110
        L_0x0121:
            java.lang.String r2 = r2.getThreeDsProcessorTraceNumber()
            r10 = r2
        L_0x0126:
            if (r10 == 0) goto L_0x0131
            boolean r2 = kotlin.text.C19457k.m33020X0(r10)
            if (r2 == 0) goto L_0x012f
            goto L_0x0131
        L_0x012f:
            r2 = r14
            goto L_0x0132
        L_0x0131:
            r2 = r15
        L_0x0132:
            if (r2 != 0) goto L_0x0245
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r2 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_JWT_STEP_QUERY_STARTED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r4 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.ATTEMPTED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E160
            java.lang.String r8 = "3ds 1.0 jwt started"
            r1.logDecision(r2, r8, r4, r5)
            com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory$Companion r2 = com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory.Companion     // Catch:{ Exception -> 0x0047 }
            com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory r2 = r2.getThreeDSJwtApiFactory()     // Catch:{ Exception -> 0x0047 }
            java.lang.Object r2 = r2.create()     // Catch:{ Exception -> 0x0047 }
            r4 = r2
            com.paypal.pyplcheckout.services.api.ThreeDSJwtApi r4 = (com.paypal.pyplcheckout.services.api.ThreeDSJwtApi) r4     // Catch:{ Exception -> 0x0047 }
            java.lang.String r8 = "javascript:window.ConsumerVenice.onSubmitClicked();"
            r13.L$0 = r1     // Catch:{ Exception -> 0x0047 }
            r2 = r25
            r13.L$1 = r2     // Catch:{ Exception -> 0x0047 }
            r11 = r26
            r13.L$2 = r11     // Catch:{ Exception -> 0x0047 }
            r13.L$3 = r0     // Catch:{ Exception -> 0x0047 }
            r13.label = r15     // Catch:{ Exception -> 0x0047 }
            r5 = r25
            r11 = r26
            java.lang.Object r4 = r4.getThreeDSJwt(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0047 }
            if (r4 != r3) goto L_0x0167
            return r3
        L_0x0167:
            r3 = r26
            r5 = r1
        L_0x016a:
            com.paypal.pyplcheckout.pojo.ThreeDSInitJWT r4 = (com.paypal.pyplcheckout.pojo.ThreeDSInitJWT) r4     // Catch:{ Exception -> 0x0047 }
            if (r4 != 0) goto L_0x0171
            r6 = r16
            goto L_0x0175
        L_0x0171:
            java.util.List r6 = r4.getErrors()
        L_0x0175:
            if (r6 == 0) goto L_0x0180
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x017e
            goto L_0x0180
        L_0x017e:
            r6 = r14
            goto L_0x0181
        L_0x0180:
            r6 = r15
        L_0x0181:
            if (r6 == 0) goto L_0x020d
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r6 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_JWT_STEP_QUERY_FINISHED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r7 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.SUCCESS
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r8 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E600
            java.lang.String r9 = "3ds 1.0 jwt finished"
            r5.logDecision(r6, r9, r7, r8)
            if (r0 != 0) goto L_0x0193
        L_0x0190:
            r0 = r16
            goto L_0x01ac
        L_0x0193:
            com.paypal.pyplcheckout.pojo.ThreeDSLookUpResponseData r0 = r0.getData()
            if (r0 != 0) goto L_0x019a
            goto L_0x0190
        L_0x019a:
            com.paypal.pyplcheckout.pojo.ThreeDSLookUp r0 = r0.getThreeDSLookUp()
            if (r0 != 0) goto L_0x01a1
            goto L_0x0190
        L_0x01a1:
            com.paypal.pyplcheckout.pojo.GenericURL r0 = r0.getRedirectURL()
            if (r0 != 0) goto L_0x01a8
            goto L_0x0190
        L_0x01a8:
            java.lang.String r0 = r0.getHref()
        L_0x01ac:
            if (r0 == 0) goto L_0x01b7
            boolean r6 = kotlin.text.C19457k.m33020X0(r0)
            if (r6 == 0) goto L_0x01b5
            goto L_0x01b7
        L_0x01b5:
            r6 = r14
            goto L_0x01b8
        L_0x01b7:
            r6 = r15
        L_0x01b8:
            if (r6 != 0) goto L_0x0201
            if (r4 != 0) goto L_0x01bf
        L_0x01bc:
            r4 = r16
            goto L_0x01cb
        L_0x01bf:
            com.paypal.pyplcheckout.pojo.ThreeDSJwt r4 = r4.getData()
            if (r4 != 0) goto L_0x01c6
            goto L_0x01bc
        L_0x01c6:
            java.lang.String r16 = r4.getThreeDSJwt()
            goto L_0x01bc
        L_0x01cb:
            if (r4 == 0) goto L_0x01d3
            boolean r6 = kotlin.text.C19457k.m33020X0(r4)
            if (r6 == 0) goto L_0x01d4
        L_0x01d3:
            r14 = r15
        L_0x01d4:
            if (r14 != 0) goto L_0x01f5
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r6 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_ONE_FLOW_ENTERED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r7 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.SHOWN
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r8 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E158
            java.lang.String r9 = "3ds 1.0 flow"
            r5.logDecision(r6, r9, r7, r8)
            com.paypal.pyplcheckout.pojo.ThreeDsV1Data r6 = new com.paypal.pyplcheckout.pojo.ThreeDsV1Data
            r6.<init>(r4, r0, r2, r3)
            com.paypal.pyplcheckout.events.Events r0 = r5.events
            com.paypal.pyplcheckout.events.PayPalEventTypes r2 = com.paypal.pyplcheckout.events.PayPalEventTypes.START_THREE_DS_V1_FLOW
            com.paypal.pyplcheckout.events.Success r3 = new com.paypal.pyplcheckout.events.Success
            r3.<init>(r6)
            r0.fire(r2, r3)
            kotlin.m r0 = kotlin.C19394m.f43287a
            return r0
        L_0x01f5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "jwt is null or blank"
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0201:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "url is null or blank"
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x020d:
            com.paypal.pyplcheckout.threeds.ThreeDsException$ThreeDSJwtException r0 = new com.paypal.pyplcheckout.threeds.ThreeDsException$ThreeDSJwtException
            com.paypal.pyplcheckout.threeds.ThreeDsExceptionData r12 = new com.paypal.pyplcheckout.threeds.ThreeDsExceptionData
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.FATAL
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r4 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E611
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_JWT_STEP_QUERY_FINISHED
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 104(0x68, float:1.46E-43)
            r11 = 0
            java.lang.String r7 = "jwt response has errors"
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0.<init>(r12)
            throw r0
        L_0x0227:
            com.paypal.pyplcheckout.threeds.ThreeDsException$ThreeDSJwtException r0 = new com.paypal.pyplcheckout.threeds.ThreeDsException$ThreeDSJwtException
            com.paypal.pyplcheckout.threeds.ThreeDsExceptionData r2 = new com.paypal.pyplcheckout.threeds.ThreeDsExceptionData
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r14 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.FATAL
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r15 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E610
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r16 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_JWT_STEP_QUERY_FINISHED
            java.lang.String r18 = r17.getMessage()
            r19 = 0
            r21 = 32
            r22 = 0
            java.lang.String r20 = "3ds 1.0 jwt failure"
            r13 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0.<init>(r2)
            throw r0
        L_0x0245:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "threeDsProcessorTraceNumber is null or blank"
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0251:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "redirectUrl is null or blank"
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x025d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "jwtOrgUnitId is null or blank"
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0269:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "jwtIssuer is null or blank"
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0275:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "cardBin is null or blank"
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow.threeDS10StepUp(java.lang.String, java.lang.String, com.paypal.pyplcheckout.pojo.ThreeDSLookUpResponse, kotlin.coroutines.c):java.lang.Object");
    }

    private final void threeDS20StepUp(String str, String str2, Activity activity) {
        logDecision(PEnums.TransitionName.THREE_DS_TWO_FLOW_ENTERED, "3ds 2.0 flow", PEnums.Outcome.SHOWN, PEnums.EventCode.E159);
        logDecision(PEnums.TransitionName.THREE_DS_CARDINAL_STEP_UP_STARTED, "3ds cardinal step up started", PEnums.Outcome.ATTEMPTED, PEnums.EventCode.E165);
        Intent intent = new Intent(activity, ThreeDS20Activity.class);
        intent.putExtra(ThreeDS20Activity.THREE_DS_20_TRANSACTION_ID, str);
        intent.putExtra(ThreeDS20Activity.THREE_DS_20_PAYMENT_AUTH_REQUEST, str2);
        activity.startActivityForResult(intent, RequestCode.THREE_DS_ACTIVITY.getCode());
    }

    public final void logDecision(PEnums.TransitionName transitionName, String str, PEnums.Outcome outcome, PEnums.EventCode eventCode) {
        C19383o.m32797g(transitionName, "transitionName");
        String str2 = str;
        C19383o.m32797g(str2, "infoMessage");
        PEnums.Outcome outcome2 = outcome;
        C19383o.m32797g(outcome2, "outcome");
        PEnums.EventCode eventCode2 = eventCode;
        C19383o.m32797g(eventCode2, ResponseConstants.CODE);
        PLog pLog = PLog.INSTANCE;
        PLog.decision$default(transitionName, outcome2, eventCode2, PEnums.StateName.THREE_DS, "ThreeDSDecisionFlow", (String) null, str2, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1952, (Object) null);
    }

    public final void logException(Exception exc) {
        Exception exc2 = exc;
        C19383o.m32797g(exc2, "e");
        if (exc2 instanceof ThreeDsException) {
            PLog pLog = PLog.INSTANCE;
            ThreeDsException threeDsException = (ThreeDsException) exc2;
            PEnums.ErrorType errorType = threeDsException.getExtras().getErrorType();
            PEnums.EventCode code = threeDsException.getExtras().getCode();
            String message = threeDsException.getExtras().getMessage();
            String str = message == null ? "" : message;
            Exception exception = threeDsException.getExtras().getException();
            PEnums.StateName stateName = PEnums.StateName.THREE_DS;
            PEnums.TransitionName transitionName = threeDsException.getExtras().getTransitionName();
            String infoMessage = threeDsException.getExtras().getInfoMessage();
            if (infoMessage == null) {
                infoMessage = "threeDSException without info message";
            }
            PLog.error$default(errorType, code, str, (String) null, exception, transitionName, stateName, infoMessage, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1800, (Object) null);
            return;
        }
        PEnums.ErrorType errorType2 = PEnums.ErrorType.FATAL;
        PEnums.EventCode eventCode = PEnums.EventCode.E608;
        String message2 = exc.getMessage();
        if (message2 == null) {
            message2 = "";
        }
        PEnums.TransitionName transitionName2 = PEnums.TransitionName.THREE_DS_GENERIC_EXCEPTION;
        PEnums.StateName stateName2 = PEnums.StateName.THREE_DS;
        String message3 = exc.getMessage();
        if (message3 == null) {
            message3 = "threeDS generic failure";
        }
        PLog.error$default(errorType2, eventCode, message2, (String) null, exc, transitionName2, stateName2, message3, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1800, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object postStepUpFinalize(java.lang.String r26, java.lang.String r27, java.lang.String r28, kotlin.coroutines.C19340c<? super java.lang.Boolean> r29) {
        /*
            r25 = this;
            r0 = r25
            r1 = r29
            boolean r2 = r1 instanceof com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$postStepUpFinalize$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$postStepUpFinalize$1 r2 = (com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$postStepUpFinalize$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$postStepUpFinalize$1 r2 = new com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$postStepUpFinalize$1
            r2.<init>(r0, r1)
        L_0x001c:
            r9 = r2
            java.lang.Object r1 = r9.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r9.label
            r10 = 2
            r11 = 0
            r12 = 1
            r13 = 0
            if (r3 == 0) goto L_0x004c
            if (r3 == r12) goto L_0x003e
            if (r3 != r10) goto L_0x0036
            java.lang.Object r2 = r9.L$0
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow r2 = (com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)     // Catch:{ Exception -> 0x019a }
            goto L_0x0138
        L_0x0036:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003e:
            java.lang.Object r3 = r9.L$1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r9.L$0
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow r4 = (com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)     // Catch:{ Exception -> 0x0204 }
            r14 = r4
            r4 = r3
            goto L_0x0087
        L_0x004c:
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            com.paypal.pyplcheckout.pojo.CheckoutSession r1 = r25.getCheckoutSession()
            com.paypal.pyplcheckout.pojo.AmountInput r7 = r0.createAmountInput(r1)
            if (r7 == 0) goto L_0x022a
            com.paypal.pyplcheckout.pojo.ThreeDsResolution r1 = r25.getThreeDSResolution()
            com.paypal.pyplcheckout.pojo.ThreeDSLookupPayload r5 = r0.createThreeDSLookupPayload(r1)
            if (r5 == 0) goto L_0x021e
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r1 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_AUTHENTICATE_STARTED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.ATTEMPTED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r4 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E163
            java.lang.String r6 = "3ds authenticate call started"
            r0.logDecision(r1, r6, r3, r4)
            com.paypal.pyplcheckout.services.Repository r3 = r0.repository     // Catch:{ Exception -> 0x0204 }
            r9.L$0 = r0     // Catch:{ Exception -> 0x0204 }
            r1 = r26
            r9.L$1 = r1     // Catch:{ Exception -> 0x0204 }
            r9.label = r12     // Catch:{ Exception -> 0x0204 }
            r4 = r28
            r6 = r27
            r8 = r9
            java.lang.Object r3 = r3.threeDSAuthenticate(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0204 }
            if (r3 != r2) goto L_0x0084
            return r2
        L_0x0084:
            r14 = r0
            r4 = r1
            r1 = r3
        L_0x0087:
            com.paypal.pyplcheckout.pojo.ThreeDSAuthenticateResponse r1 = (com.paypal.pyplcheckout.pojo.ThreeDSAuthenticateResponse) r1     // Catch:{ Exception -> 0x0204 }
            if (r1 != 0) goto L_0x008d
            r3 = r13
            goto L_0x0091
        L_0x008d:
            java.util.List r3 = r1.getErrors()
        L_0x0091:
            if (r3 == 0) goto L_0x009c
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            r3 = r11
            goto L_0x009d
        L_0x009c:
            r3 = r12
        L_0x009d:
            if (r3 == 0) goto L_0x01ea
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_AUTHENTICATE_FINISHED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.SUCCESS
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r6 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E603
            java.lang.String r7 = "3ds authenticate call finished"
            r14.logDecision(r3, r7, r5, r6)
            if (r1 != 0) goto L_0x00ae
        L_0x00ac:
            r1 = r13
            goto L_0x00c0
        L_0x00ae:
            com.paypal.pyplcheckout.pojo.ThreeDSAuthenticateData r1 = r1.getData()
            if (r1 != 0) goto L_0x00b5
            goto L_0x00ac
        L_0x00b5:
            com.paypal.pyplcheckout.pojo.ThreeDSAuthenticate r1 = r1.getThreeDSAuthenticate()
            if (r1 != 0) goto L_0x00bc
            goto L_0x00ac
        L_0x00bc:
            com.paypal.pyplcheckout.pojo.ResolveThreeDsContingencyStatus r1 = r1.getThreeDSStatus()
        L_0x00c0:
            if (r1 == 0) goto L_0x01cc
            com.paypal.pyplcheckout.pojo.ResolveThreeDsContingencyStatus r5 = com.paypal.pyplcheckout.pojo.ResolveThreeDsContingencyStatus.FAILURE
            if (r1 == r5) goto L_0x01cc
            com.paypal.pyplcheckout.pojo.ThreeDsResolution r1 = r14.getThreeDSResolution()
            if (r1 != 0) goto L_0x00ce
        L_0x00cc:
            r6 = r13
            goto L_0x00da
        L_0x00ce:
            com.paypal.pyplcheckout.pojo.ThreeDSPaymentCardData r1 = r1.getPaymentCard()
            if (r1 != 0) goto L_0x00d5
            goto L_0x00cc
        L_0x00d5:
            java.lang.String r1 = r1.getId()
            r6 = r1
        L_0x00da:
            if (r6 == 0) goto L_0x00e5
            boolean r1 = kotlin.text.C19457k.m33020X0(r6)
            if (r1 == 0) goto L_0x00e3
            goto L_0x00e5
        L_0x00e3:
            r1 = r11
            goto L_0x00e6
        L_0x00e5:
            r1 = r12
        L_0x00e6:
            if (r1 != 0) goto L_0x01c0
            com.paypal.pyplcheckout.pojo.ThreeDsResolution r1 = r14.getThreeDSResolution()
            if (r1 != 0) goto L_0x00f0
        L_0x00ee:
            r5 = r13
            goto L_0x00fc
        L_0x00f0:
            com.paypal.pyplcheckout.pojo.ThreeDSContingencyContext r1 = r1.getContingencyContext()
            if (r1 != 0) goto L_0x00f7
            goto L_0x00ee
        L_0x00f7:
            java.lang.String r1 = r1.getReferenceId()
            r5 = r1
        L_0x00fc:
            if (r5 == 0) goto L_0x0107
            boolean r1 = kotlin.text.C19457k.m33020X0(r5)
            if (r1 == 0) goto L_0x0105
            goto L_0x0107
        L_0x0105:
            r1 = r11
            goto L_0x0108
        L_0x0107:
            r1 = r12
        L_0x0108:
            if (r1 != 0) goto L_0x01b4
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r1 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_RESOLVE_CONTINGENCY_STARTED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.ATTEMPTED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r7 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E164
            java.lang.String r8 = "3ds resolve contingency call started"
            r14.logDecision(r1, r8, r3, r7)
            com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory$Companion r1 = com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory.Companion     // Catch:{ Exception -> 0x019a }
            com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory r1 = r1.getThreeDSResolveContingencyApiFactory()     // Catch:{ Exception -> 0x019a }
            java.lang.Object r1 = r1.create()     // Catch:{ Exception -> 0x019a }
            r3 = r1
            com.paypal.pyplcheckout.services.api.ThreeDSResolveContingencyApi r3 = (com.paypal.pyplcheckout.services.api.ThreeDSResolveContingencyApi) r3     // Catch:{ Exception -> 0x019a }
            com.paypal.pyplcheckout.pojo.ResolveThreeDsContingencyStatus r7 = com.paypal.pyplcheckout.pojo.ResolveThreeDsContingencyStatus.SUCCESS     // Catch:{ Exception -> 0x019a }
            com.paypal.pyplcheckout.services.Repository r1 = r14.repository     // Catch:{ Exception -> 0x019a }
            java.lang.String r8 = r1.getPaymentToken()     // Catch:{ Exception -> 0x019a }
            r9.L$0 = r14     // Catch:{ Exception -> 0x019a }
            r9.L$1 = r13     // Catch:{ Exception -> 0x019a }
            r9.label = r10     // Catch:{ Exception -> 0x019a }
            java.lang.Object r1 = r3.resolveContingency(r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x019a }
            if (r1 != r2) goto L_0x0137
            return r2
        L_0x0137:
            r2 = r14
        L_0x0138:
            com.paypal.pyplcheckout.pojo.ThreeDSResolveContingencyResponse r1 = (com.paypal.pyplcheckout.pojo.ThreeDSResolveContingencyResponse) r1     // Catch:{ Exception -> 0x019a }
            if (r1 != 0) goto L_0x013e
            r3 = r13
            goto L_0x0142
        L_0x013e:
            java.util.List r3 = r1.getErrors()
        L_0x0142:
            if (r3 == 0) goto L_0x014d
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x014b
            goto L_0x014d
        L_0x014b:
            r3 = r11
            goto L_0x014e
        L_0x014d:
            r3 = r12
        L_0x014e:
            if (r3 == 0) goto L_0x0180
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_RESOLVE_CONTINGENCY_FINISHED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r4 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.SUCCESS
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E604
            java.lang.String r6 = "3ds resolve contingency call finished"
            r2.logDecision(r3, r6, r4, r5)
            if (r1 != 0) goto L_0x015e
            goto L_0x0170
        L_0x015e:
            com.paypal.pyplcheckout.pojo.ThreeDSResolveContingencyData r1 = r1.getData()
            if (r1 != 0) goto L_0x0165
            goto L_0x0170
        L_0x0165:
            com.paypal.pyplcheckout.pojo.CheckoutSession r1 = r1.getResolveThreeDsContingency()
            if (r1 != 0) goto L_0x016c
            goto L_0x0170
        L_0x016c:
            com.paypal.pyplcheckout.pojo.PaymentContingencies r13 = r1.getPaymentContingencies()
        L_0x0170:
            if (r13 == 0) goto L_0x017b
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$Companion r1 = Companion
            boolean r1 = r1.isThreeDSFlow(r13)
            if (r1 != 0) goto L_0x017b
            r11 = r12
        L_0x017b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)
            return r1
        L_0x0180:
            com.paypal.pyplcheckout.threeds.ThreeDsException$ThreeDSResolveContingencyException r1 = new com.paypal.pyplcheckout.threeds.ThreeDsException$ThreeDSResolveContingencyException
            com.paypal.pyplcheckout.threeds.ThreeDsExceptionData r12 = new com.paypal.pyplcheckout.threeds.ThreeDsExceptionData
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.FATAL
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r4 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E611
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_RESOLVE_CONTINGENCY_FINISHED
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 104(0x68, float:1.46E-43)
            r11 = 0
            java.lang.String r7 = "resolve contingency response has errors"
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.<init>(r12)
            throw r1
        L_0x019a:
            com.paypal.pyplcheckout.threeds.ThreeDsException$ThreeDSResolveContingencyException r1 = new com.paypal.pyplcheckout.threeds.ThreeDsException$ThreeDSResolveContingencyException
            com.paypal.pyplcheckout.threeds.ThreeDsExceptionData r12 = new com.paypal.pyplcheckout.threeds.ThreeDsExceptionData
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.FATAL
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r4 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E611
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_RESOLVE_CONTINGENCY_FINISHED
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 104(0x68, float:1.46E-43)
            r11 = 0
            java.lang.String r7 = "resolve contingency api call failed"
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.<init>(r12)
            throw r1
        L_0x01b4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "referenceId is null or blank"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01c0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "creditCardId is null or blank"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01cc:
            com.paypal.pyplcheckout.threeds.ThreeDsException$ThreeDSAuthenticateException r1 = new com.paypal.pyplcheckout.threeds.ThreeDsException$ThreeDSAuthenticateException
            com.paypal.pyplcheckout.threeds.ThreeDsExceptionData r2 = new com.paypal.pyplcheckout.threeds.ThreeDsExceptionData
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r16 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.FATAL
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r17 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E611
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 104(0x68, float:1.46E-43)
            r24 = 0
            java.lang.String r20 = "authenticate response has failure status"
            r15 = r2
            r18 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1.<init>(r2)
            throw r1
        L_0x01ea:
            com.paypal.pyplcheckout.threeds.ThreeDsException$ThreeDSAuthenticateException r1 = new com.paypal.pyplcheckout.threeds.ThreeDsException$ThreeDSAuthenticateException
            com.paypal.pyplcheckout.threeds.ThreeDsExceptionData r12 = new com.paypal.pyplcheckout.threeds.ThreeDsExceptionData
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.FATAL
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r4 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E611
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_AUTHENTICATE_FINISHED
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 104(0x68, float:1.46E-43)
            r11 = 0
            java.lang.String r7 = "authenticate response has errors"
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.<init>(r12)
            throw r1
        L_0x0204:
            com.paypal.pyplcheckout.threeds.ThreeDsException$ThreeDSAuthenticateException r1 = new com.paypal.pyplcheckout.threeds.ThreeDsException$ThreeDSAuthenticateException
            com.paypal.pyplcheckout.threeds.ThreeDsExceptionData r12 = new com.paypal.pyplcheckout.threeds.ThreeDsExceptionData
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.FATAL
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r4 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E611
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_AUTHENTICATE_FINISHED
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 104(0x68, float:1.46E-43)
            r11 = 0
            java.lang.String r7 = "authenticate api failed"
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.<init>(r12)
            throw r1
        L_0x021e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "unable to create threeDSLookupPayload"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x022a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "unable to create amount"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow.postStepUpFinalize(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    public final synchronized void startThreeDsFlow(Activity activity, ThreeDSSource threeDSSource2, C19857l<? super ContingencyEventsModel, C19394m> lVar) {
        C19383o.m32797g(activity, "activity");
        C19383o.m32797g(threeDSSource2, "source");
        C19383o.m32797g(lVar, "onError");
        this.threeDSSource = threeDSSource2;
        C19697g.m33468f(this.scope, (CoroutineContext) null, (CoroutineStart) null, new ThreeDSDecisionFlow$startThreeDsFlow$1(this, activity, lVar, (C19340c<? super ThreeDSDecisionFlow$startThreeDsFlow$1>) null), 3);
    }

    public final void threeDSAuthenticateAndComplete(C19857l<? super ContingencyEventsModel, C19394m> lVar) {
        C19383o.m32797g(lVar, "onError");
        C19697g.m33468f(this.scope, (CoroutineContext) null, (CoroutineStart) null, new ThreeDSDecisionFlow$threeDSAuthenticateAndComplete$1(this, lVar, (C19340c<? super ThreeDSDecisionFlow$threeDSAuthenticateAndComplete$1>) null), 3);
    }
}
