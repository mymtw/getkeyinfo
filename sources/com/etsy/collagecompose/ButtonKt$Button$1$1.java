package com.etsy.collagecompose;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.input.pointer.C1631c;
import androidx.compose.p015ui.input.pointer.C1652w;
import androidx.compose.runtime.C1338j0;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.collagecompose.ButtonKt$Button$1$1", mo70541f = "Button.kt", mo70542l = {233}, mo70543m = "invokeSuspend")
public final class ButtonKt$Button$1$1 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C1338j0<Boolean> $isPressed;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "com.etsy.collagecompose.ButtonKt$Button$1$1$1", mo70541f = "Button.kt", mo70542l = {234}, mo70543m = "invokeSuspend")
    /* renamed from: com.etsy.collagecompose.ButtonKt$Button$1$1$1 */
    public static final class C121171 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C121171 r0 = new C121171(j0Var, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
            return ((C121171) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                final C1338j0<Boolean> j0Var = j0Var;
                C121181 r1 = new C19861p<C1631c, C19340c<? super C19394m>, Object>((C19340c<? super C121181>) null) {
                    private /* synthetic */ Object L$0;
                    public int label;

                    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                        C121181 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public ButtonKt$Button$1$1(C1338j0<Boolean> j0Var, C19340c<? super ButtonKt$Button$1$1> cVar) {
                            super(2, cVar);
                            this.$isPressed = j0Var;
                        }

                        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                            ButtonKt$Button$1$1 buttonKt$Button$1$1 = new ButtonKt$Button$1$1(this.$isPressed, cVar);
                            buttonKt$Button$1$1.L$0 = obj;
                            return buttonKt$Button$1$1;
                        }

                        public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
                            return ((ButtonKt$Button$1$1) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                C0761x.m1684O0(obj);
                                final C1338j0<Boolean> j0Var = this.$isPressed;
                                C121171 r1 = new C121171((C19340c<? super C121171>) null);
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
