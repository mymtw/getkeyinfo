package com.etsy.android.onboarding;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2866i0;
import com.etsy.android.util.C12065v;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.flow.C19662p1;
import kotlinx.coroutines.flow.C19671s1;
import kotlinx.coroutines.flow.StateFlowImpl;
import p347fb.C12705a;
import p347fb.C12706b;
import p347fb.C12707c;
import p347fb.C12709e;
import p347fb.C12711f;
import p360hb.C12804a;
import p360hb.C12808b;
import p634np.C18289a;
import p744gq.C19060c;
import p753kq.C19861p;

public final class CategoryQuizViewModel extends C2866i0 {

    /* renamed from: b */
    public final C18289a<C12707c> f19697b;

    /* renamed from: c */
    public final C12706b f19698c = new C12706b(C19388s.m32866i0(this));

    /* renamed from: d */
    public final StateFlowImpl f19699d;

    /* renamed from: e */
    public final C19662p1 f19700e;

    /* renamed from: f */
    public final C19662p1 f19701f;

    @C19060c(mo70540c = "com.etsy.android.onboarding.CategoryQuizViewModel$1", mo70541f = "CategoryQuizViewModel.kt", mo70542l = {35}, mo70543m = "invokeSuspend")
    /* renamed from: com.etsy.android.onboarding.CategoryQuizViewModel$1 */
    public static final class C89291 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;
        public final /* synthetic */ CategoryQuizViewModel this$0;

        /* renamed from: com.etsy.android.onboarding.CategoryQuizViewModel$1$a */
        public static final class C8930a implements C19600e<C12705a> {

            /* renamed from: b */
            public final /* synthetic */ CategoryQuizViewModel f19702b;

            public C8930a(CategoryQuizViewModel categoryQuizViewModel) {
                this.f19702b = categoryQuizViewModel;
            }

            public final Object emit(Object obj, C19340c cVar) {
                Object value;
                C12808b a;
                Object value2;
                C12808b bVar;
                C12709e eVar;
                C12705a aVar = (C12705a) obj;
                if (aVar instanceof C12709e) {
                    StateFlowImpl stateFlowImpl = this.f19702b.f19699d;
                    do {
                        value2 = stateFlowImpl.getValue();
                        bVar = (C12808b) value2;
                        eVar = (C12709e) aVar;
                        bVar.getClass();
                        C19383o.m32797g(eVar, "effect");
                    } while (!stateFlowImpl.mo72337i(value2, C12808b.m20447a(bVar, (C12804a) null, C19327t.m32651g1(bVar.f28294b, eVar), 1)));
                } else {
                    C12707c cVar2 = this.f19702b.f19697b.get();
                    C19388s.m32866i0(this.f19702b);
                    C12808b bVar2 = (C12808b) this.f19702b.f19699d.getValue();
                    cVar2.getClass();
                    C19383o.m32797g(aVar, "event");
                    C19383o.m32797g(bVar2, "state");
                    if (aVar instanceof C12711f) {
                        C12711f fVar = (C12711f) aVar;
                        if (C19383o.m32792b(fVar, C12711f.C12713b.f28008a)) {
                            cVar2.f28001a.getClass();
                            a = C12808b.m20447a(bVar2, C12804a.C12807c.f28292a, (ArrayList) null, 2);
                        } else if (fVar instanceof C12711f.C12712a) {
                            C12711f.C12712a aVar2 = (C12711f.C12712a) fVar;
                            cVar2.f28003c.getClass();
                            a = C12808b.m20447a(bVar2, C12804a.C12805a.f28290a, (ArrayList) null, 2);
                        } else if (fVar instanceof C12711f.C12714c) {
                            C12711f.C12714c cVar3 = (C12711f.C12714c) fVar;
                            cVar2.f28002b.getClass();
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar2 = a;
                    }
                    StateFlowImpl stateFlowImpl2 = this.f19702b.f19699d;
                    do {
                        value = stateFlowImpl2.getValue();
                        C12808b bVar3 = (C12808b) value;
                    } while (!stateFlowImpl2.mo72337i(value, bVar2));
                }
                return C19394m.f43287a;
            }
        }

        {
            this.this$0 = r1;
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C89291(this.this$0, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C89291) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                CategoryQuizViewModel categoryQuizViewModel = this.this$0;
                C19671s1 s1Var = categoryQuizViewModel.f19698c.f26218b;
                C8930a aVar = new C8930a(categoryQuizViewModel);
                this.label = 1;
                if (s1Var.collect(aVar, this) == coroutineSingletons) {
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

    public CategoryQuizViewModel(C18289a<C12707c> aVar) {
        this.f19697b = aVar;
        StateFlowImpl g = C19388s.m32862g(new C12808b(0));
        this.f19699d = g;
        C0761x.m1750w(g);
        this.f19700e = C12065v.m19874b(g, C19388s.m32866i0(this), CategoryQuizViewModel$quizUi$1.INSTANCE);
        this.f19701f = C12065v.m19874b(g, C19388s.m32866i0(this), CategoryQuizViewModel$sideEffects$1.INSTANCE);
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new C89291(this, (C19340c<? super C89291>) null), 3);
    }
}
