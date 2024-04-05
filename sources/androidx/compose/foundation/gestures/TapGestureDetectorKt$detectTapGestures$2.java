package androidx.compose.foundation.gestures;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.input.pointer.C1631c;
import androidx.compose.p015ui.input.pointer.C1652w;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p288y.C8343c;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", mo70541f = "TapGestureDetector.kt", mo70542l = {92}, mo70543m = "invokeSuspend")
final class TapGestureDetectorKt$detectTapGestures$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19857l<C8343c, C19394m> $onDoubleTap;
    public final /* synthetic */ C19857l<C8343c, C19394m> $onLongPress;
    public final /* synthetic */ C19862q<C0612j, C8343c, C19340c<? super C19394m>, Object> $onPress;
    public final /* synthetic */ C19857l<C8343c, C19394m> $onTap;
    public final /* synthetic */ C1652w $this_detectTapGestures;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", mo70541f = "TapGestureDetector.kt", mo70542l = {93}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1 */
    public static final class C05871 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C05871 r0 = new C05871(pressGestureScopeImpl, qVar, d0Var, lVar, lVar2, lVar3, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
            return ((C05871) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                final PressGestureScopeImpl pressGestureScopeImpl = pressGestureScopeImpl;
                final C19862q<C0612j, C8343c, C19340c<? super C19394m>, Object> qVar = qVar;
                final C19525d0 d0Var = d0Var;
                final C19857l<C8343c, C19394m> lVar = lVar;
                final C19857l<C8343c, C19394m> lVar2 = lVar2;
                final C19857l<C8343c, C19394m> lVar3 = lVar3;
                C05881 r3 = new C19861p<C1631c, C19340c<? super C19394m>, Object>((C19340c<? super C05881>) null) {
                    public long J$0;
                    private /* synthetic */ Object L$0;
                    public Object L$1;
                    public Object L$2;
                    public Object L$3;
                    public int label;

                    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                        C05881 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public TapGestureDetectorKt$detectTapGestures$2(C1652w wVar, C19862q<? super C0612j, ? super C8343c, ? super C19340c<? super C19394m>, ? extends Object> qVar, C19857l<? super C8343c, C19394m> lVar, C19857l<? super C8343c, C19394m> lVar2, C19857l<? super C8343c, C19394m> lVar3, C19340c<? super TapGestureDetectorKt$detectTapGestures$2> cVar) {
                            super(2, cVar);
                            this.$this_detectTapGestures = wVar;
                            this.$onPress = qVar;
                            this.$onLongPress = lVar;
                            this.$onDoubleTap = lVar2;
                            this.$onTap = lVar3;
                        }

                        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                            TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.$this_detectTapGestures, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, cVar);
                            tapGestureDetectorKt$detectTapGestures$2.L$0 = obj;
                            return tapGestureDetectorKt$detectTapGestures$2;
                        }

                        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
                            return ((TapGestureDetectorKt$detectTapGestures$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                C0761x.m1684O0(obj);
                                final C19525d0 d0Var = (C19525d0) this.L$0;
                                final PressGestureScopeImpl pressGestureScopeImpl = new PressGestureScopeImpl(this.$this_detectTapGestures);
                                C1652w wVar = this.$this_detectTapGestures;
                                final C19862q<C0612j, C8343c, C19340c<? super C19394m>, Object> qVar = this.$onPress;
                                final C19857l<C8343c, C19394m> lVar = this.$onLongPress;
                                final C19857l<C8343c, C19394m> lVar2 = this.$onDoubleTap;
                                final C19857l<C8343c, C19394m> lVar3 = this.$onTap;
                                C05871 r3 = new C05871((C19340c<? super C05871>) null);
                                this.label = 1;
                                if (ForEachGestureKt.m1378b(wVar, r3, this) == coroutineSingletons) {
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
