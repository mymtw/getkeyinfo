package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.input.pointer.C1631c;
import androidx.compose.p015ui.input.pointer.C1652w;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import p288y.C8343c;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2", mo70541f = "SelectionManager.kt", mo70542l = {619}, mo70543m = "invokeSuspend")
final class SelectionManager$detectNonConsumingTap$2 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19857l<C8343c, C19394m> $onTap;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2$1", mo70541f = "SelectionManager.kt", mo70542l = {620}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2$1 */
    public static final class C09871 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C09871(wVar, lVar, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C09871) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                C1652w wVar = wVar;
                final C19857l<C8343c, C19394m> lVar = lVar;
                C09881 r1 = new C19861p<C1631c, C19340c<? super C19394m>, Object>((C19340c<? super C09881>) null) {
                    private /* synthetic */ Object L$0;
                    public int label;

                    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                        C09881 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public SelectionManager$detectNonConsumingTap$2(C19857l<? super C8343c, C19394m> lVar, C19340c<? super SelectionManager$detectNonConsumingTap$2> cVar) {
                            super(2, cVar);
                            this.$onTap = lVar;
                        }

                        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                            SelectionManager$detectNonConsumingTap$2 selectionManager$detectNonConsumingTap$2 = new SelectionManager$detectNonConsumingTap$2(this.$onTap, cVar);
                            selectionManager$detectNonConsumingTap$2.L$0 = obj;
                            return selectionManager$detectNonConsumingTap$2;
                        }

                        public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
                            return ((SelectionManager$detectNonConsumingTap$2) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                C0761x.m1684O0(obj);
                                final C1652w wVar = (C1652w) this.L$0;
                                final C19857l<C8343c, C19394m> lVar = this.$onTap;
                                C09871 r1 = new C09871((C19340c<? super C09871>) null);
                                this.label = 1;
                                if (C19697g.m33466d(r1, this) == coroutineSingletons) {
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
