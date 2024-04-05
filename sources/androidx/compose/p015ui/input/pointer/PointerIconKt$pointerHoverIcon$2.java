package androidx.compose.p015ui.input.pointer;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p744gq.C19060c;
import p753kq.C19861p;
import p753kq.C19862q;

/* renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2 */
final class PointerIconKt$pointerHoverIcon$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C1641m $icon;
    public final /* synthetic */ boolean $overrideDescendants;

    @C19060c(mo70540c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1", mo70541f = "PointerIcon.kt", mo70542l = {74}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1 */
    public static final class C16181 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C16181 r0 = new C16181(z, nVar, mVar2, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
            return ((C16181) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                final boolean z = z;
                final C1642n nVar = nVar;
                final C1641m mVar = mVar2;
                C16191 r1 = new C19861p<C1631c, C19340c<? super C19394m>, Object>((C19340c<? super C16191>) null) {
                    private /* synthetic */ Object L$0;
                    public int label;

                    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                        C16191 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public PointerIconKt$pointerHoverIcon$2(C1641m mVar, boolean z) {
                            super(3);
                            this.$icon = mVar;
                            this.$overrideDescendants = z;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
                        }

                        public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
                            C1436d dVar3;
                            C19383o.m32797g(dVar, "$this$composed");
                            dVar2.mo5465u(811087536);
                            final C1642n nVar = (C1642n) dVar2.mo5410J(CompositionLocalsKt.f4031q);
                            if (nVar == null) {
                                dVar3 = C1436d.C1437a.f3125b;
                            } else {
                                C1641m mVar = this.$icon;
                                Boolean valueOf = Boolean.valueOf(this.$overrideDescendants);
                                final boolean z = this.$overrideDescendants;
                                final C1641m mVar2 = this.$icon;
                                dVar3 = SuspendingPointerInputFilterKt.m3483a(dVar, mVar, valueOf, new C16181((C19340c<? super C16181>) null));
                            }
                            dVar2.mo5406H();
                            return dVar3;
                        }
                    }
