package com.paypal.pyplcheckout.addshipping;

import com.paypal.pyplcheckout.pojo.ValidateAddressQueryParams;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel$validateAddress$1", mo70541f = "AddressAutoCompleteViewModel.kt", mo70542l = {177}, mo70543m = "invokeSuspend")
public final class AddressAutoCompleteViewModel$validateAddress$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ ValidateAddressQueryParams $request;
    public int label;
    public final /* synthetic */ AddressAutoCompleteViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressAutoCompleteViewModel$validateAddress$1(AddressAutoCompleteViewModel addressAutoCompleteViewModel, ValidateAddressQueryParams validateAddressQueryParams, C19340c<? super AddressAutoCompleteViewModel$validateAddress$1> cVar) {
        super(2, cVar);
        this.this$0 = addressAutoCompleteViewModel;
        this.$request = validateAddressQueryParams;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new AddressAutoCompleteViewModel$validateAddress$1(this.this$0, this.$request, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((AddressAutoCompleteViewModel$validateAddress$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c A[Catch:{ IOException -> 0x00ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b A[Catch:{ IOException -> 0x00ae }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r1 = r23
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r1.label
            r3 = 1
            if (r2 == 0) goto L_0x0019
            if (r2 != r3) goto L_0x0011
            androidx.compose.foundation.layout.C0761x.m1684O0(r24)     // Catch:{ IOException -> 0x00ae }
            r2 = r24
            goto L_0x0057
        L_0x0011:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0019:
            androidx.compose.foundation.layout.C0761x.m1684O0(r24)
            com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel r2 = r1.this$0     // Catch:{ IOException -> 0x00ae }
            com.paypal.pyplcheckout.events.Events r2 = r2.events     // Catch:{ IOException -> 0x00ae }
            com.paypal.pyplcheckout.events.PayPalEventTypes r4 = com.paypal.pyplcheckout.events.PayPalEventTypes.VALIDATE_ADDRESS_API_STARTED     // Catch:{ IOException -> 0x00ae }
            com.paypal.pyplcheckout.events.Success r5 = new com.paypal.pyplcheckout.events.Success     // Catch:{ IOException -> 0x00ae }
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x00ae }
            r5.<init>(r6)     // Catch:{ IOException -> 0x00ae }
            r2.fire(r4, r5)     // Catch:{ IOException -> 0x00ae }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r7 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.VALIDATE_ADDRESS_RESPONSE     // Catch:{ IOException -> 0x00ae }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r8 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.ATTEMPTED     // Catch:{ IOException -> 0x00ae }
            r9 = 0
            com.paypal.pyplcheckout.common.instrumentation.PEnums$StateName r10 = com.paypal.pyplcheckout.common.instrumentation.PEnums.StateName.READY     // Catch:{ IOException -> 0x00ae }
            r11 = 0
            r12 = 0
            java.lang.String r13 = "validate address attempted"
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 1972(0x7b4, float:2.763E-42)
            r19 = 0
            com.paypal.pyplcheckout.common.instrumentation.PLog.decision$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ IOException -> 0x00ae }
            com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel r2 = r1.this$0     // Catch:{ IOException -> 0x00ae }
            com.paypal.pyplcheckout.services.Repository r2 = r2.repository     // Catch:{ IOException -> 0x00ae }
            com.paypal.pyplcheckout.pojo.ValidateAddressQueryParams r4 = r1.$request     // Catch:{ IOException -> 0x00ae }
            r1.label = r3     // Catch:{ IOException -> 0x00ae }
            java.lang.Object r2 = r2.validateAddress(r4, r1)     // Catch:{ IOException -> 0x00ae }
            if (r2 != r0) goto L_0x0057
            return r0
        L_0x0057:
            com.paypal.pyplcheckout.pojo.ValidateAddressResponse r2 = (com.paypal.pyplcheckout.pojo.ValidateAddressResponse) r2     // Catch:{ IOException -> 0x00ae }
            java.util.List r0 = r2.getErrors()     // Catch:{ IOException -> 0x00ae }
            r4 = 0
            if (r0 != 0) goto L_0x0061
            goto L_0x0069
        L_0x0061:
            boolean r0 = r0.isEmpty()     // Catch:{ IOException -> 0x00ae }
            r0 = r0 ^ r3
            if (r0 != r3) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r3 = r4
        L_0x006a:
            if (r3 == 0) goto L_0x007b
            com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel r4 = r1.this$0     // Catch:{ IOException -> 0x00ae }
            java.lang.String r5 = "validate address api error"
            java.util.List r6 = r2.getErrors()     // Catch:{ IOException -> 0x00ae }
            r7 = 0
            r8 = 4
            r9 = 0
            com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel.handleValidateAddressFailure$default(r4, r5, r6, r7, r8, r9)     // Catch:{ IOException -> 0x00ae }
            goto L_0x00d0
        L_0x007b:
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r10 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.VALIDATE_ADDRESS_RESPONSE     // Catch:{ IOException -> 0x00ae }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r11 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.SUCCESS     // Catch:{ IOException -> 0x00ae }
            r12 = 0
            com.paypal.pyplcheckout.common.instrumentation.PEnums$StateName r13 = com.paypal.pyplcheckout.common.instrumentation.PEnums.StateName.READY     // Catch:{ IOException -> 0x00ae }
            r14 = 0
            r15 = 0
            com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel r0 = r1.this$0     // Catch:{ IOException -> 0x00ae }
            com.google.gson.i r0 = r0.gson     // Catch:{ IOException -> 0x00ae }
            java.lang.String r16 = r0.mo59463j(r2)     // Catch:{ IOException -> 0x00ae }
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 1972(0x7b4, float:2.763E-42)
            r22 = 0
            com.paypal.pyplcheckout.common.instrumentation.PLog.decision$default(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ IOException -> 0x00ae }
            com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel r0 = r1.this$0     // Catch:{ IOException -> 0x00ae }
            com.paypal.pyplcheckout.events.Events r0 = r0.events     // Catch:{ IOException -> 0x00ae }
            com.paypal.pyplcheckout.events.PayPalEventTypes r3 = com.paypal.pyplcheckout.events.PayPalEventTypes.VALIDATE_ADDRESS_API_FINISHED     // Catch:{ IOException -> 0x00ae }
            com.paypal.pyplcheckout.events.Success r4 = new com.paypal.pyplcheckout.events.Success     // Catch:{ IOException -> 0x00ae }
            r4.<init>(r2)     // Catch:{ IOException -> 0x00ae }
            r0.fire(r3, r4)     // Catch:{ IOException -> 0x00ae }
            goto L_0x00d0
        L_0x00ae:
            r0 = move-exception
            com.paypal.pyplcheckout.pojo.ValidateAddressError r8 = new com.paypal.pyplcheckout.pojo.ValidateAddressError
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "validate address api IOException: "
            java.lang.String r3 = androidx.appcompat.widget.C0326j.m864i(r3, r2)
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel r2 = r1.this$0
            java.lang.String r3 = r8.getMessage()
            java.util.List r4 = p568fn.C17782b.m29864d0(r8)
            r2.handleValidateAddressFailure(r3, r4, r0)
        L_0x00d0:
            kotlin.m r0 = kotlin.C19394m.f43287a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel$validateAddress$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
