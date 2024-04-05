package androidx.compose.foundation.gestures;

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
import p753kq.C19862q;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", mo70541f = "TapGestureDetector.kt", mo70542l = {206}, mo70543m = "invokeSuspend")
public final class TapGestureDetectorKt$detectTapAndPress$2 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19862q<C0612j, C8343c, C19340c<? super C19394m>, Object> $onPress;
    public final /* synthetic */ C19857l<C8343c, C19394m> $onTap;
    public final /* synthetic */ PressGestureScopeImpl $pressScope;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", mo70541f = "TapGestureDetector.kt", mo70542l = {208}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1 */
    public static final class C05841 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C05841 r0 = new C05841(pressGestureScopeImpl, wVar, qVar, lVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C05841) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                final C19525d0 d0Var = (C19525d0) this.L$0;
                PressGestureScopeImpl pressGestureScopeImpl = pressGestureScopeImpl;
                boolean unused = pressGestureScopeImpl.f1337e.mo72639a((Object) null);
                pressGestureScopeImpl.f1335c = false;
                pressGestureScopeImpl.f1336d = false;
                C1652w wVar = wVar;
                final C19862q<C0612j, C8343c, C19340c<? super C19394m>, Object> qVar = qVar;
                final PressGestureScopeImpl pressGestureScopeImpl2 = pressGestureScopeImpl;
                final C19857l<C8343c, C19394m> lVar = lVar;
                C05851 r3 = new C19861p<C1631c, C19340c<? super C19394m>, Object>((C19340c<? super C05851>) null) {
                    private /* synthetic */ Object L$0;
                    public int label;

                    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                        C05851 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public TapGestureDetectorKt$detectTapAndPress$2(PressGestureScopeImpl pressGestureScopeImpl, C19862q<? super C0612j, ? super C8343c, ? super C19340c<? super C19394m>, ? extends Object> qVar, C19857l<? super C8343c, C19394m> lVar, C19340c<? super TapGestureDetectorKt$detectTapAndPress$2> cVar) {
                            super(2, cVar);
                            this.$pressScope = pressGestureScopeImpl;
                            this.$onPress = qVar;
                            this.$onTap = lVar;
                        }

                        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                            TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.$pressScope, this.$onPress, this.$onTap, cVar);
                            tapGestureDetectorKt$detectTapAndPress$2.L$0 = obj;
                            return tapGestureDetectorKt$detectTapAndPress$2;
                        }

                        public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
                            return ((TapGestureDetectorKt$detectTapAndPress$2) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                C0761x.m1684O0(obj);
                                final C1652w wVar = (C1652w) this.L$0;
                                final PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                                final C19862q<C0612j, C8343c, C19340c<? super C19394m>, Object> qVar = this.$onPress;
                                final C19857l<C8343c, C19394m> lVar = this.$onTap;
                                C05841 r3 = new C05841((C19340c<? super C05841>) null);
                                this.label = 1;
                                if (C19697g.m33466d(r3, this) == coroutineSingletons) {
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
