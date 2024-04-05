package com.paypal.pyplcheckout.addcard.usecase;

import com.paypal.pyplcheckout.flavorauth.ClearAccessTokenUseCase;
import com.paypal.pyplcheckout.pojo.AddCardError;
import com.paypal.pyplcheckout.pojo.AddCardErrorData;
import com.paypal.pyplcheckout.pojo.AddCardErrorField;
import com.paypal.pyplcheckout.pojo.AddCardResponse;
import com.paypal.pyplcheckout.services.ApiErrorException;
import com.paypal.pyplcheckout.services.Repository;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;

public final class AddCardUseCase {
    private final ClearAccessTokenUseCase clearAccessToken;
    private final Repository repository;

    public AddCardUseCase(Repository repository2, ClearAccessTokenUseCase clearAccessTokenUseCase) {
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(clearAccessTokenUseCase, "clearAccessToken");
        this.repository = repository2;
        this.clearAccessToken = clearAccessTokenUseCase;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069 A[Catch:{ all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b A[Catch:{ all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007c A[Catch:{ all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007e A[Catch:{ all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0084 A[Catch:{ all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008d A[Catch:{ all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008f A[Catch:{ all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0095 A[Catch:{ all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0096 A[Catch:{ all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a9 A[Catch:{ all -> 0x00af }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: authenticateAndRetry-BWLJW6A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m35154authenticateAndRetryBWLJW6A(androidx.appcompat.app.AppCompatActivity r16, com.paypal.pyplcheckout.pojo.Card r17, java.lang.String r18, kotlin.coroutines.C19340c<? super kotlin.Result<com.paypal.pyplcheckout.pojo.FundingInstrument>> r19) {
        /*
            r15 = this;
            r1 = r15
            r0 = r19
            boolean r2 = r0 instanceof com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase$authenticateAndRetry$1
            if (r2 == 0) goto L_0x0016
            r2 = r0
            com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase$authenticateAndRetry$1 r2 = (com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase$authenticateAndRetry$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001b
        L_0x0016:
            com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase$authenticateAndRetry$1 r2 = new com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase$authenticateAndRetry$1
            r2.<init>(r15, r0)
        L_0x001b:
            java.lang.Object r0 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0047
            if (r4 == r6) goto L_0x0036
            if (r4 != r5) goto L_0x002e
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)     // Catch:{ all -> 0x00af }
            goto L_0x00aa
        L_0x002e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0036:
            java.lang.Object r4 = r2.L$2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r2.L$1
            com.paypal.pyplcheckout.pojo.Card r6 = (com.paypal.pyplcheckout.pojo.Card) r6
            java.lang.Object r7 = r2.L$0
            com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase r7 = (com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)     // Catch:{ all -> 0x00af }
            r0 = r6
            goto L_0x0060
        L_0x0047:
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            r2.L$0 = r1     // Catch:{ all -> 0x00af }
            r0 = r17
            r2.L$1 = r0     // Catch:{ all -> 0x00af }
            r4 = r18
            r2.L$2 = r4     // Catch:{ all -> 0x00af }
            r2.label = r6     // Catch:{ all -> 0x00af }
            r6 = r16
            java.lang.Object r6 = r15.performAuthentication(r6, r2)     // Catch:{ all -> 0x00af }
            if (r6 != r3) goto L_0x005f
            return r3
        L_0x005f:
            r7 = r1
        L_0x0060:
            com.paypal.pyplcheckout.services.Repository r6 = r7.repository     // Catch:{ all -> 0x00af }
            com.paypal.pyplcheckout.pojo.User r6 = r6.getUser()     // Catch:{ all -> 0x00af }
            r8 = 0
            if (r6 != 0) goto L_0x006b
            r6 = r8
            goto L_0x006f
        L_0x006b:
            java.lang.String r6 = r6.getFirstName()     // Catch:{ all -> 0x00af }
        L_0x006f:
            java.lang.String r9 = ""
            if (r6 != 0) goto L_0x0074
            r6 = r9
        L_0x0074:
            com.paypal.pyplcheckout.services.Repository r10 = r7.repository     // Catch:{ all -> 0x00af }
            com.paypal.pyplcheckout.pojo.User r10 = r10.getUser()     // Catch:{ all -> 0x00af }
            if (r10 != 0) goto L_0x007e
            r10 = r8
            goto L_0x0082
        L_0x007e:
            java.lang.String r10 = r10.getLastName()     // Catch:{ all -> 0x00af }
        L_0x0082:
            if (r10 != 0) goto L_0x0085
            r10 = r9
        L_0x0085:
            com.paypal.pyplcheckout.services.Repository r11 = r7.repository     // Catch:{ all -> 0x00af }
            com.paypal.pyplcheckout.pojo.User r11 = r11.getUser()     // Catch:{ all -> 0x00af }
            if (r11 != 0) goto L_0x008f
            r11 = r8
            goto L_0x0093
        L_0x008f:
            java.lang.String r11 = r11.getCountry()     // Catch:{ all -> 0x00af }
        L_0x0093:
            if (r11 != 0) goto L_0x0096
            goto L_0x0097
        L_0x0096:
            r9 = r11
        L_0x0097:
            com.paypal.pyplcheckout.pojo.AddCardQueryParams r0 = com.paypal.pyplcheckout.pojo.AddCardKt.createAddCardQueryParams(r6, r10, r0, r4, r9)     // Catch:{ all -> 0x00af }
            r2.L$0 = r8     // Catch:{ all -> 0x00af }
            r2.L$1 = r8     // Catch:{ all -> 0x00af }
            r2.L$2 = r8     // Catch:{ all -> 0x00af }
            r2.label = r5     // Catch:{ all -> 0x00af }
            java.lang.Object r0 = r7.performAddCard(r0, r2)     // Catch:{ all -> 0x00af }
            if (r0 != r3) goto L_0x00aa
            return r3
        L_0x00aa:
            java.lang.Object r0 = kotlin.Result.m35480constructorimpl(r0)     // Catch:{ all -> 0x00af }
            goto L_0x00d6
        L_0x00af:
            r0 = move-exception
            com.paypal.pyplcheckout.common.instrumentation.PLog r2 = com.paypal.pyplcheckout.common.instrumentation.PLog.INSTANCE
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r2 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.FATAL
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E618
            java.lang.String r4 = r0.getMessage()
            if (r4 != 0) goto L_0x00be
            java.lang.String r4 = "add card query error"
        L_0x00be:
            com.paypal.pyplcheckout.common.instrumentation.PEnums$StateName r8 = com.paypal.pyplcheckout.common.instrumentation.PEnums.StateName.NATIVE_ADD_CARD
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r7 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.NATIVE_ADD_CARD_RESPONSE
            r5 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 1928(0x788, float:2.702E-42)
            r14 = 0
            r6 = r0
            com.paypal.pyplcheckout.common.instrumentation.PLog.error$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            kotlin.Result$Failure r0 = androidx.compose.foundation.layout.C0761x.m1673J(r0)
            java.lang.Object r0 = kotlin.Result.m35480constructorimpl(r0)
        L_0x00d6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase.m35154authenticateAndRetryBWLJW6A(androidx.appcompat.app.AppCompatActivity, com.paypal.pyplcheckout.pojo.Card, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    private final void handleResponseErrors(AddCardResponse addCardResponse) throws ApiErrorException {
        List<AddCardErrorField> data;
        List<AddCardError> errors = addCardResponse.getErrors();
        String str = null;
        AddCardError addCardError = errors == null ? null : (AddCardError) C19327t.m32640V0(errors);
        AddCardErrorField addCardErrorField = (addCardError == null || (data = addCardError.getData()) == null) ? null : (AddCardErrorField) C19327t.m32640V0(data);
        if (addCardError != null) {
            if (AddCardUseCaseKt.isThreeDsContingency(addCardError)) {
                AddCardErrorData errorData = addCardError.getErrorData();
                if (errorData != null) {
                    str = errorData.getFundingInstrumentId();
                }
                throw new AddCardContingencyException(str, addCardError);
            } else if (!AddCardUseCaseKt.isAuthenticationError(addCardError)) {
                String message = addCardError.getMessage();
                String field = addCardErrorField == null ? null : addCardErrorField.getField();
                if (addCardErrorField != null) {
                    str = addCardErrorField.getCode();
                }
                throw new ApiErrorException(C0048b.m164c(message, " ", field, " ", str));
            } else {
                Integer statusCode = addCardError.getStatusCode();
                C19383o.m32794d(statusCode);
                throw new AddCardAuthenticationException(statusCode.intValue());
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object performAddCard(com.paypal.pyplcheckout.pojo.AddCardQueryParams r5, kotlin.coroutines.C19340c<? super com.paypal.pyplcheckout.pojo.FundingInstrument> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase$performAddCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase$performAddCard$1 r0 = (com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase$performAddCard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase$performAddCard$1 r0 = new com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase$performAddCard$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.L$0
            com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase r5 = (com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            goto L_0x0044
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            com.paypal.pyplcheckout.services.Repository r6 = r4.repository
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.addCard(r5, r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            r5 = r4
        L_0x0044:
            com.paypal.pyplcheckout.pojo.AddCardResponse r6 = (com.paypal.pyplcheckout.pojo.AddCardResponse) r6
            r5.handleResponseErrors(r6)
            com.paypal.pyplcheckout.pojo.AddCardResponseData r6 = r6.getData()
            r0 = 0
            if (r6 != 0) goto L_0x0051
            goto L_0x005c
        L_0x0051:
            com.paypal.pyplcheckout.pojo.CheckoutSession r6 = r6.getAddCard()
            if (r6 != 0) goto L_0x0058
            goto L_0x005c
        L_0x0058:
            java.util.List r0 = r6.getFundingOptions()
        L_0x005c:
            java.lang.String r6 = "Got empty funding options on AddCard"
            java.util.List r6 = com.paypal.pyplcheckout.extensions.ListExtensionsKt.orThrow(r0, r6)
            com.paypal.pyplcheckout.services.Repository r5 = r5.repository
            r5.setFundingOptions(r6)
            java.lang.Object r5 = kotlin.collections.C19327t.m32638T0(r6)
            com.paypal.pyplcheckout.pojo.FundingOption r5 = (com.paypal.pyplcheckout.pojo.FundingOption) r5
            com.paypal.pyplcheckout.pojo.FundingInstrument r5 = r5.getFundingInstrument()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase.performAddCard(com.paypal.pyplcheckout.pojo.AddCardQueryParams, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object performAuthentication(androidx.appcompat.app.AppCompatActivity r20, kotlin.coroutines.C19340c<? super kotlin.C19394m> r21) throws java.lang.Throwable {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            boolean r2 = r0 instanceof com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase$performAuthentication$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase$performAuthentication$1 r2 = (com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase$performAuthentication$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase$performAuthentication$1 r2 = new com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase$performAuthentication$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x003a
            if (r4 != r5) goto L_0x0032
            java.lang.Object r2 = r2.L$0
            androidx.appcompat.app.AppCompatActivity r2 = (androidx.appcompat.app.AppCompatActivity) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)     // Catch:{ all -> 0x002f }
            goto L_0x0064
        L_0x002f:
            r0 = move-exception
            r4 = r2
            goto L_0x0071
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003a:
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r6 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.UPGRADE_ACCESS_TOKEN_ATTEMPTED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r7 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.ATTEMPTED
            r8 = 0
            com.paypal.pyplcheckout.common.instrumentation.PEnums$StateName r9 = com.paypal.pyplcheckout.common.instrumentation.PEnums.StateName.NATIVE_ADD_CARD
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1972(0x7b4, float:2.763E-42)
            r18 = 0
            java.lang.String r12 = "upgrade access token attempted"
            com.paypal.pyplcheckout.common.instrumentation.PLog.decision$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.paypal.pyplcheckout.services.Repository r0 = r1.repository     // Catch:{ all -> 0x006e }
            r4 = r20
            r2.L$0 = r4     // Catch:{ all -> 0x006c }
            r2.label = r5     // Catch:{ all -> 0x006c }
            java.lang.Object r0 = r0.upgradeAccessToken(r2)     // Catch:{ all -> 0x006c }
            if (r0 != r3) goto L_0x0063
            return r3
        L_0x0063:
            r2 = r4
        L_0x0064:
            com.paypal.pyplcheckout.flavornavigation.ContentRouter r0 = com.paypal.pyplcheckout.flavornavigation.ContentRouter.INSTANCE
            r0.closeNativeAuthFlow$pyplcheckout_externalThreedsRelease(r2)
            kotlin.m r0 = kotlin.C19394m.f43287a
            return r0
        L_0x006c:
            r0 = move-exception
            goto L_0x0071
        L_0x006e:
            r0 = move-exception
            r4 = r20
        L_0x0071:
            com.paypal.pyplcheckout.flavornavigation.ContentRouter r2 = com.paypal.pyplcheckout.flavornavigation.ContentRouter.INSTANCE
            r2.closeNativeAuthFlow$pyplcheckout_externalThreedsRelease(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase.performAuthentication(androidx.appcompat.app.AppCompatActivity, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        r10 = r8;
        r8 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0071, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010e, code lost:
        r2 = com.paypal.pyplcheckout.common.instrumentation.PLog.INSTANCE;
        r11 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.FATAL;
        r12 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E618;
        r2 = r0.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0118, code lost:
        if (r2 == null) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011a, code lost:
        r2 = "add card query error";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011c, code lost:
        com.paypal.pyplcheckout.common.instrumentation.PLog.error$default(r11, r12, r2, (java.lang.String) null, r0, com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.NATIVE_ADD_CARD_RESPONSE, com.paypal.pyplcheckout.common.instrumentation.PEnums.StateName.NATIVE_ADD_CARD, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent.InstrumentationEventBuilder) null, 1928, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return kotlin.Result.m35480constructorimpl(androidx.compose.foundation.layout.C0761x.m1673J(r0));
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:15:0x0053, B:51:0x00f6] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071 A[ExcHandler: all (r0v10 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:51:0x00f6] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0106 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0159 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: invoke-bMdYcbs  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m35155invokebMdYcbs(androidx.appcompat.app.AppCompatActivity r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, kotlin.coroutines.C19340c<? super kotlin.Result<com.paypal.pyplcheckout.pojo.FundingInstrument>> r31) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            r2 = r31
            boolean r3 = r2 instanceof com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase$invoke$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase$invoke$1 r3 = (com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase$invoke$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase$invoke$1 r3 = new com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase$invoke$1
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r3.label
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x0074
            if (r5 == r8) goto L_0x005c
            if (r5 == r7) goto L_0x0043
            if (r5 != r6) goto L_0x003b
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
            kotlin.Result r2 = (kotlin.Result) r2
            java.lang.Object r0 = r2.m35488unboximpl()
            goto L_0x015a
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0043:
            java.lang.Object r0 = r3.L$3
            com.paypal.pyplcheckout.pojo.AddCardQueryParams r0 = (com.paypal.pyplcheckout.pojo.AddCardQueryParams) r0
            java.lang.Object r5 = r3.L$2
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r7 = r3.L$1
            androidx.appcompat.app.AppCompatActivity r7 = (androidx.appcompat.app.AppCompatActivity) r7
            java.lang.Object r8 = r3.L$0
            com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase r8 = (com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase) r8
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)     // Catch:{ AddCardAuthenticationException -> 0x0058, all -> 0x0071 }
            goto L_0x0109
        L_0x0058:
            r10 = r8
            r8 = r7
            goto L_0x0140
        L_0x005c:
            java.lang.Object r0 = r3.L$3
            com.paypal.pyplcheckout.pojo.AddCardQueryParams r0 = (com.paypal.pyplcheckout.pojo.AddCardQueryParams) r0
            java.lang.Object r5 = r3.L$2
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r3.L$1
            androidx.appcompat.app.AppCompatActivity r8 = (androidx.appcompat.app.AppCompatActivity) r8
            java.lang.Object r10 = r3.L$0
            com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase r10 = (com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase) r10
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)     // Catch:{ AddCardAuthenticationException -> 0x0140, all -> 0x0071 }
            goto L_0x00f6
        L_0x0071:
            r0 = move-exception
            goto L_0x010e
        L_0x0074:
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
            com.paypal.pyplcheckout.services.Repository r2 = r1.repository
            com.paypal.pyplcheckout.pojo.User r2 = r2.getUser()
            if (r2 != 0) goto L_0x0081
            r2 = r9
            goto L_0x0085
        L_0x0081:
            java.lang.String r2 = r2.getFirstName()
        L_0x0085:
            java.lang.String r5 = ""
            if (r2 != 0) goto L_0x008b
            r10 = r5
            goto L_0x008c
        L_0x008b:
            r10 = r2
        L_0x008c:
            com.paypal.pyplcheckout.services.Repository r2 = r1.repository
            com.paypal.pyplcheckout.pojo.User r2 = r2.getUser()
            if (r2 != 0) goto L_0x0096
            r2 = r9
            goto L_0x009a
        L_0x0096:
            java.lang.String r2 = r2.getLastName()
        L_0x009a:
            if (r2 != 0) goto L_0x009e
            r11 = r5
            goto L_0x009f
        L_0x009e:
            r11 = r2
        L_0x009f:
            com.paypal.pyplcheckout.model.PaymentProcessors r2 = com.paypal.pyplcheckout.utils.CardValidationUtilKt.paymentProcessorIdentifier(r26)
            com.paypal.pyplcheckout.pojo.CardIssuerType r13 = com.paypal.pyplcheckout.model.PaymentProcessorsKt.getCardIssuerType(r2)
            com.paypal.pyplcheckout.services.Repository r2 = r1.repository
            com.paypal.pyplcheckout.pojo.User r2 = r2.getUser()
            if (r2 != 0) goto L_0x00b2
            r18 = r9
            goto L_0x00b8
        L_0x00b2:
            java.lang.String r2 = r2.getCountry()
            r18 = r2
        L_0x00b8:
            r12 = r26
            r14 = r27
            r15 = r28
            r16 = r29
            r17 = r30
            com.paypal.pyplcheckout.pojo.AddCardQueryParams r2 = com.paypal.pyplcheckout.pojo.AddCardKt.createAddCardQueryParams(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r10 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.NATIVE_ADD_CARD_ATTEMPTED     // Catch:{ AddCardAuthenticationException -> 0x013b, all -> 0x0071 }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r11 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.ATTEMPTED     // Catch:{ AddCardAuthenticationException -> 0x013b, all -> 0x0071 }
            r12 = 0
            com.paypal.pyplcheckout.common.instrumentation.PEnums$StateName r13 = com.paypal.pyplcheckout.common.instrumentation.PEnums.StateName.NATIVE_ADD_CARD     // Catch:{ AddCardAuthenticationException -> 0x013b, all -> 0x0071 }
            r14 = 0
            r15 = 0
            java.lang.String r16 = "native add card attempted"
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 1972(0x7b4, float:2.763E-42)
            r22 = 0
            com.paypal.pyplcheckout.common.instrumentation.PLog.decision$default(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ AddCardAuthenticationException -> 0x013b, all -> 0x0071 }
            r3.L$0 = r1     // Catch:{ AddCardAuthenticationException -> 0x013b, all -> 0x0071 }
            r3.L$1 = r0     // Catch:{ AddCardAuthenticationException -> 0x013b, all -> 0x0071 }
            r5 = r30
            r3.L$2 = r5     // Catch:{ AddCardAuthenticationException -> 0x013d, all -> 0x0071 }
            r3.L$3 = r2     // Catch:{ AddCardAuthenticationException -> 0x013d, all -> 0x0071 }
            r3.label = r8     // Catch:{ AddCardAuthenticationException -> 0x013d, all -> 0x0071 }
            java.lang.Object r8 = r1.performAuthentication(r0, r3)     // Catch:{ AddCardAuthenticationException -> 0x013d, all -> 0x0071 }
            if (r8 != r4) goto L_0x00f3
            return r4
        L_0x00f3:
            r8 = r0
            r10 = r1
            r0 = r2
        L_0x00f6:
            r3.L$0 = r10     // Catch:{ AddCardAuthenticationException -> 0x0140, all -> 0x0071 }
            r3.L$1 = r8     // Catch:{ AddCardAuthenticationException -> 0x0140, all -> 0x0071 }
            r3.L$2 = r5     // Catch:{ AddCardAuthenticationException -> 0x0140, all -> 0x0071 }
            r3.L$3 = r0     // Catch:{ AddCardAuthenticationException -> 0x0140, all -> 0x0071 }
            r3.label = r7     // Catch:{ AddCardAuthenticationException -> 0x0140, all -> 0x0071 }
            java.lang.Object r2 = r10.performAddCard(r0, r3)     // Catch:{ AddCardAuthenticationException -> 0x0140, all -> 0x0071 }
            if (r2 != r4) goto L_0x0107
            return r4
        L_0x0107:
            r7 = r8
            r8 = r10
        L_0x0109:
            java.lang.Object r0 = kotlin.Result.m35480constructorimpl(r2)     // Catch:{ AddCardAuthenticationException -> 0x0058, all -> 0x0071 }
            goto L_0x015a
        L_0x010e:
            com.paypal.pyplcheckout.common.instrumentation.PLog r2 = com.paypal.pyplcheckout.common.instrumentation.PLog.INSTANCE
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r11 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.FATAL
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r12 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E618
            java.lang.String r2 = r0.getMessage()
            if (r2 != 0) goto L_0x011c
            java.lang.String r2 = "add card query error"
        L_0x011c:
            r13 = r2
            com.paypal.pyplcheckout.common.instrumentation.PEnums$StateName r17 = com.paypal.pyplcheckout.common.instrumentation.PEnums.StateName.NATIVE_ADD_CARD
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r16 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.NATIVE_ADD_CARD_RESPONSE
            r14 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 1928(0x788, float:2.702E-42)
            r23 = 0
            r15 = r0
            com.paypal.pyplcheckout.common.instrumentation.PLog.error$default(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            kotlin.Result$Failure r0 = androidx.compose.foundation.layout.C0761x.m1673J(r0)
            java.lang.Object r0 = kotlin.Result.m35480constructorimpl(r0)
            goto L_0x015a
        L_0x013b:
            r5 = r30
        L_0x013d:
            r8 = r0
            r10 = r1
            r0 = r2
        L_0x0140:
            com.paypal.pyplcheckout.flavorauth.ClearAccessTokenUseCase r2 = r10.clearAccessToken
            r2.invoke()
            com.paypal.pyplcheckout.pojo.Card r0 = r0.getCard()
            r3.L$0 = r9
            r3.L$1 = r9
            r3.L$2 = r9
            r3.L$3 = r9
            r3.label = r6
            java.lang.Object r0 = r10.m35154authenticateAndRetryBWLJW6A(r8, r0, r5, r3)
            if (r0 != r4) goto L_0x015a
            return r4
        L_0x015a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase.m35155invokebMdYcbs(androidx.appcompat.app.AppCompatActivity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
