package com.etsy.android.p327ui.checkout;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.checkout.C9435b;
import com.etsy.android.p327ui.checkout.PayPalCheckoutViewModel;
import com.etsy.android.util.C12060q;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.checkout.PayPalCheckoutViewModel$confirmPaypalOrder$1", mo70541f = "PayPalCheckoutViewModel.kt", mo70542l = {75}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.checkout.PayPalCheckoutViewModel$confirmPaypalOrder$1 */
final class PayPalCheckoutViewModel$confirmPaypalOrder$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ String $cartId;
    public final /* synthetic */ String $orderId;
    public int label;
    public final /* synthetic */ PayPalCheckoutViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalCheckoutViewModel$confirmPaypalOrder$1(PayPalCheckoutViewModel payPalCheckoutViewModel, String str, String str2, C19340c<? super PayPalCheckoutViewModel$confirmPaypalOrder$1> cVar) {
        super(2, cVar);
        this.this$0 = payPalCheckoutViewModel;
        this.$cartId = str;
        this.$orderId = str2;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new PayPalCheckoutViewModel$confirmPaypalOrder$1(this.this$0, this.$cartId, this.$orderId, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((PayPalCheckoutViewModel$confirmPaypalOrder$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            PayPalCheckoutViewModel payPalCheckoutViewModel = this.this$0;
            Boolean bool = payPalCheckoutViewModel.f20915g ? Boolean.TRUE : null;
            C9434a aVar = payPalCheckoutViewModel.f20910b;
            String str = this.$cartId;
            String str2 = this.$orderId;
            this.label = 1;
            obj = aVar.mo31879a(str, bool, str2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C9435b bVar = (C9435b) obj;
        if (bVar instanceof C9435b.C9437b) {
            C9435b.C9437b bVar2 = (C9435b.C9437b) bVar;
            C12060q.m19870a(this.this$0.f20912d, new PayPalCheckoutViewModel.C9427b.C9432e(new PayPalCheckoutViewModel.C9426a(bVar2.f20929a, bVar2.f20930b)));
        } else if (C19383o.m32792b(bVar, C9435b.C9436a.f20928a)) {
            C12060q.m19870a(this.this$0.f20912d, new PayPalCheckoutViewModel.C9427b.C9430c("Failed to confirm PayPal order"));
        }
        return C19394m.f43287a;
    }
}
