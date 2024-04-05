package com.paypal.checkout.order.patch;

import androidx.compose.foundation.layout.C0761x;
import androidx.recyclerview.widget.RecyclerView;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.services.ApiErrorException;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import okhttp3.C19928a0;
import okhttp3.C20011u;
import okhttp3.C20018z;
import okhttp3.internal.connection.C19971e;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.checkout.order.patch.PatchOrderAction$patchOrder$2", mo70541f = "PatchOrderAction.kt", mo70542l = {}, mo70543m = "invokeSuspend")
public final class PatchOrderAction$patchOrder$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C20011u $request;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ PatchOrderAction this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PatchOrderAction$patchOrder$2(PatchOrderAction patchOrderAction, C20011u uVar, C19340c<? super PatchOrderAction$patchOrder$2> cVar) {
        super(2, cVar);
        this.this$0 = patchOrderAction;
        this.$request = uVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        PatchOrderAction$patchOrder$2 patchOrderAction$patchOrder$2 = new PatchOrderAction$patchOrder$2(this.this$0, this.$request, cVar);
        patchOrderAction$patchOrder$2.L$0 = obj;
        return patchOrderAction$patchOrder$2;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((PatchOrderAction$patchOrder$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        PatchErrorResponse access$getErrorResponse;
        List<PatchError> details;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            C19525d0 d0Var = (C19525d0) this.L$0;
            C20018z e = ((C19971e) this.this$0.okHttpClient.mo20743a(this.$request)).mo72859e();
            if (e.mo73006d()) {
                return C19394m.f43287a;
            }
            C19928a0 a0Var = e.f44368i;
            String str = null;
            if (!(a0Var == null || (access$getErrorResponse = this.this$0.getErrorResponse(a0Var)) == null || (details = access$getErrorResponse.getDetails()) == null)) {
                str = C19327t.m32644Z0(details, "\n", (String) null, (String) null, (C19857l) null, 62);
            }
            if (str == null) {
                str = "Error response is null";
            }
            PLog.error$default(PEnums.ErrorType.WARNING, PEnums.EventCode.E619, "Error patching order", str, (Throwable) null, PEnums.TransitionName.PATCH_ORDER_EXECUTED, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, RecyclerView.MAX_SCROLL_DURATION, (Object) null);
            throw new ApiErrorException(str);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
