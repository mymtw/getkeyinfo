package androidx.compose.material;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.input.pointer.C1652w;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.material.ExposedDropdownMenuKt$expandable$1", mo70541f = "ExposedDropdownMenu.kt", mo70542l = {516}, mo70543m = "invokeSuspend")
final class ExposedDropdownMenuKt$expandable$1 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19846a<C19394m> $onExpandedChange;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1", mo70541f = "ExposedDropdownMenu.kt", mo70542l = {517}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1 */
    public static final class C10861 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C10861 r0 = new C10861(aVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
            return ((C10861) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                final C1652w wVar = (C1652w) this.L$0;
                final C19846a<C19394m> aVar = aVar;
                C10871 r1 = new C19861p<C19525d0, C19340c<? super C19394m>, Object>((C19340c<? super C10871>) null) {
                    public int label;

                    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public ExposedDropdownMenuKt$expandable$1(C19846a<C19394m> aVar, C19340c<? super ExposedDropdownMenuKt$expandable$1> cVar) {
                            super(2, cVar);
                            this.$onExpandedChange = aVar;
                        }

                        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                            ExposedDropdownMenuKt$expandable$1 exposedDropdownMenuKt$expandable$1 = new ExposedDropdownMenuKt$expandable$1(this.$onExpandedChange, cVar);
                            exposedDropdownMenuKt$expandable$1.L$0 = obj;
                            return exposedDropdownMenuKt$expandable$1;
                        }

                        public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
                            return ((ExposedDropdownMenuKt$expandable$1) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                C0761x.m1684O0(obj);
                                final C19846a<C19394m> aVar = this.$onExpandedChange;
                                C10861 r1 = new C10861((C19340c<? super C10861>) null);
                                this.label = 1;
                                if (ForEachGestureKt.m1378b((C1652w) this.L$0, r1, this) == coroutineSingletons) {
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
