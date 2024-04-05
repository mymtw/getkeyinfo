package com.etsy.android.p327ui.shop.tabs;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.C19394m;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.flow.C19662p1;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.shop.tabs.ShopFragment$onViewCreated$2", mo70541f = "ShopFragment.kt", mo70542l = {164}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.shop.tabs.ShopFragment$onViewCreated$2 */
public final class ShopFragment$onViewCreated$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ ShopFragment this$0;

    @C19060c(mo70540c = "com.etsy.android.ui.shop.tabs.ShopFragment$onViewCreated$2$1", mo70541f = "ShopFragment.kt", mo70542l = {165}, mo70543m = "invokeSuspend")
    /* renamed from: com.etsy.android.ui.shop.tabs.ShopFragment$onViewCreated$2$1 */
    public static final class C112051 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        /* renamed from: com.etsy.android.ui.shop.tabs.ShopFragment$onViewCreated$2$1$a */
        public static final class C11206a implements C19600e<C11224i> {

            /* renamed from: b */
            public final /* synthetic */ ShopFragment f24769b;

            public C11206a(ShopFragment shopFragment) {
                this.f24769b = shopFragment;
            }

            public final Object emit(Object obj, C19340c cVar) {
                Object i = C19697g.m33471i(cVar, this.f24769b.getMainDispatcher(), new ShopFragment$onViewCreated$2$1$1$emit$2(this.f24769b, (C11224i) obj, (C19340c<? super ShopFragment$onViewCreated$2$1$1$emit$2>) null));
                return i == CoroutineSingletons.COROUTINE_SUSPENDED ? i : C19394m.f43287a;
            }
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C112051(shopFragment, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C112051) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                C19662p1 p1Var = shopFragment.getViewModel().f24773e;
                C11206a aVar = new C11206a(shopFragment);
                this.label = 1;
                if (p1Var.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C0761x.m1684O0(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShopFragment$onViewCreated$2(ShopFragment shopFragment, C19340c<? super ShopFragment$onViewCreated$2> cVar) {
        super(2, cVar);
        this.this$0 = shopFragment;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new ShopFragment$onViewCreated$2(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((ShopFragment$onViewCreated$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C2887s viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            C19383o.m32796f(viewLifecycleOwner, "viewLifecycleOwner");
            Lifecycle.State state = Lifecycle.State.CREATED;
            final ShopFragment shopFragment = this.this$0;
            C112051 r3 = new C112051((C19340c<? super C112051>) null);
            this.label = 1;
            if (RepeatOnLifecycleKt.m6783b(viewLifecycleOwner, state, r3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
