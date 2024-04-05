package com.paypal.checkout.order;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import okhttp3.C20011u;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.checkout.order.UpdateOrderStatusAction$updateOrderStatus$2", mo70541f = "UpdateOrderStatusAction.kt", mo70542l = {}, mo70543m = "invokeSuspend")
public final class UpdateOrderStatusAction$updateOrderStatus$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super UpdateOrderStatusResult>, Object> {
    public final /* synthetic */ C20011u $request;
    public int label;
    public final /* synthetic */ UpdateOrderStatusAction this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateOrderStatusAction$updateOrderStatus$2(UpdateOrderStatusAction updateOrderStatusAction, C20011u uVar, C19340c<? super UpdateOrderStatusAction$updateOrderStatus$2> cVar) {
        super(2, cVar);
        this.this$0 = updateOrderStatusAction;
        this.$request = uVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new UpdateOrderStatusAction$updateOrderStatus$2(this.this$0, this.$request, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super UpdateOrderStatusResult> cVar) {
        return ((UpdateOrderStatusAction$updateOrderStatus$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        kotlin.reflect.C19421p.m32917E(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r6.label
            if (r0 != 0) goto L_0x0072
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            com.paypal.checkout.order.UpdateOrderStatusAction r7 = r6.this$0     // Catch:{ Exception -> 0x0053 }
            okhttp3.t r7 = r7.okHttpClient     // Catch:{ Exception -> 0x0053 }
            okhttp3.u r0 = r6.$request     // Catch:{ Exception -> 0x0053 }
            okhttp3.e r7 = r7.mo20743a(r0)     // Catch:{ Exception -> 0x0053 }
            okhttp3.internal.connection.e r7 = (okhttp3.internal.connection.C19971e) r7     // Catch:{ Exception -> 0x0053 }
            okhttp3.z r7 = r7.mo72859e()     // Catch:{ Exception -> 0x0053 }
            boolean r0 = r7.mo73006d()     // Catch:{ Exception -> 0x0053 }
            if (r0 == 0) goto L_0x004a
            okhttp3.a0 r7 = r7.f44368i     // Catch:{ Exception -> 0x0053 }
            r0 = 0
            if (r7 != 0) goto L_0x0027
            goto L_0x003d
        L_0x0027:
            com.paypal.checkout.order.UpdateOrderStatusAction r1 = r6.this$0     // Catch:{ Exception -> 0x0053 }
            java.lang.String r2 = r7.mo72844g()     // Catch:{ all -> 0x0043 }
            com.google.gson.i r1 = r1.gson     // Catch:{ all -> 0x0043 }
            java.lang.Class<com.paypal.checkout.order.OrderResponse> r3 = com.paypal.checkout.order.OrderResponse.class
            java.lang.Object r1 = r1.mo59458e(r3, r2)     // Catch:{ all -> 0x0043 }
            com.paypal.checkout.order.OrderResponse r1 = (com.paypal.checkout.order.OrderResponse) r1     // Catch:{ all -> 0x0043 }
            kotlin.reflect.C19421p.m32917E(r7, r0)     // Catch:{ Exception -> 0x0053 }
            r0 = r1
        L_0x003d:
            com.paypal.checkout.order.UpdateOrderStatusResult$Success r7 = new com.paypal.checkout.order.UpdateOrderStatusResult$Success     // Catch:{ Exception -> 0x0053 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x0053 }
            goto L_0x0071
        L_0x0043:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r1 = move-exception
            kotlin.reflect.C19421p.m32917E(r7, r0)     // Catch:{ Exception -> 0x0053 }
            throw r1     // Catch:{ Exception -> 0x0053 }
        L_0x004a:
            com.paypal.checkout.order.UpdateOrderStatusResult$Error$UpdateOrderStatusError r0 = new com.paypal.checkout.order.UpdateOrderStatusResult$Error$UpdateOrderStatusError     // Catch:{ Exception -> 0x0053 }
            int r7 = r7.f44365f     // Catch:{ Exception -> 0x0053 }
            r0.<init>(r7)     // Catch:{ Exception -> 0x0053 }
            r7 = r0
            goto L_0x0071
        L_0x0053:
            r7 = move-exception
            r2 = r7
            com.paypal.checkout.order.UpdateOrderStatusAction r7 = r6.this$0
            java.lang.String r0 = r7.TAG
            java.lang.String r7 = "TAG"
            kotlin.jvm.internal.C19383o.m32796f(r0, r7)
            java.lang.String r1 = r2.toString()
            r3 = 0
            r4 = 8
            r5 = 0
            com.paypal.pyplcheckout.common.instrumentation.PLog.e$default(r0, r1, r2, r3, r4, r5)
            com.paypal.checkout.order.UpdateOrderStatusResult$Error$UpdateOrderStatusError r7 = new com.paypal.checkout.order.UpdateOrderStatusResult$Error$UpdateOrderStatusError
            r0 = -1
            r7.<init>(r0)
        L_0x0071:
            return r7
        L_0x0072:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.order.UpdateOrderStatusAction$updateOrderStatus$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
