package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.C0612j;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.interaction.C0642l;
import androidx.compose.foundation.interaction.C0643m;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.input.pointer.C1652w;
import androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1346m;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import androidx.compose.runtime.C1415u;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import p288y.C8343c;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C19857l<C8343c, C19394m> $onTap;

    @C19060c(mo70540c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", mo70541f = "TextFieldPressGestureFilter.kt", mo70542l = {55}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2 */
    public static final class C09392 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C09392 r0 = new C09392(d0Var, j0Var, jVar3, E0, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
            return ((C09392) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                final C19525d0 d0Var = d0Var;
                final C1338j0<C0643m> j0Var = j0Var;
                final C0640j jVar = jVar3;
                C09401 r1 = new C19862q<C0612j, C8343c, C19340c<? super C19394m>, Object>((C19340c<? super C09401>) null) {
                    public /* synthetic */ long J$0;
                    private /* synthetic */ Object L$0;
                    public int label;

                    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return m34711invoked4ec7I((C0612j) obj, ((C8343c) obj2).f18299a, (C19340c) obj3);
                    }

                    /* renamed from: invoke-d-4ec7I  reason: not valid java name */
                    public final Object m34711invoked4ec7I(C0612j jVar, long j, C19340c<? super C19394m> cVar) {
                        C09401 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1(C19857l<? super C8343c, C19394m> lVar, C0640j jVar) {
                            super(3);
                            this.$onTap = lVar;
                            this.$interactionSource = jVar;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
                        }

                        public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
                            C19383o.m32797g(dVar, "$this$composed");
                            dVar2.mo5465u(-102778667);
                            dVar2.mo5465u(773894976);
                            dVar2.mo5465u(-492369756);
                            Object v = dVar2.mo5467v();
                            C1302d.C1303a.C1304a aVar = C1302d.C1303a.f2828a;
                            if (v == aVar) {
                                C1346m mVar = new C1346m(C1415u.m3034h(EmptyCoroutineContext.INSTANCE, dVar2));
                                dVar2.mo5454o(mVar);
                                v = mVar;
                            }
                            dVar2.mo5406H();
                            final C19525d0 d0Var = ((C1346m) v).f2939b;
                            dVar2.mo5406H();
                            dVar2.mo5465u(-492369756);
                            Object v2 = dVar2.mo5467v();
                            if (v2 == aVar) {
                                v2 = C0761x.m1751w0((Object) null, C1351n1.f2948a);
                                dVar2.mo5454o(v2);
                            }
                            dVar2.mo5406H();
                            final C1338j0 j0Var = (C1338j0) v2;
                            final C1338j0 E0 = C0761x.m1664E0(this.$onTap, dVar2);
                            final C0640j jVar = this.$interactionSource;
                            C1415u.m3028b(jVar, new C19857l<C1360s, C1358r>() {

                                /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$a */
                                public static final class C0938a implements C1358r {

                                    /* renamed from: a */
                                    public final /* synthetic */ C1338j0 f1936a;

                                    /* renamed from: b */
                                    public final /* synthetic */ C0640j f1937b;

                                    public C0938a(C1338j0 j0Var, C0640j jVar) {
                                        this.f1936a = j0Var;
                                        this.f1937b = jVar;
                                    }

                                    public final void dispose() {
                                        C0643m mVar = (C0643m) this.f1936a.getValue();
                                        if (mVar != null) {
                                            C0642l lVar = new C0642l(mVar);
                                            C0640j jVar = this.f1937b;
                                            if (jVar != null) {
                                                jVar.mo3871b(lVar);
                                            }
                                            this.f1936a.setValue(null);
                                        }
                                    }
                                }

                                public final C1358r invoke(C1360s sVar) {
                                    C19383o.m32797g(sVar, "$this$DisposableEffect");
                                    return new C0938a(j0Var, jVar);
                                }
                            }, dVar2);
                            C1436d.C1437a aVar2 = C1436d.C1437a.f3125b;
                            C0640j jVar2 = this.$interactionSource;
                            final C0640j jVar3 = jVar2;
                            C1436d b = SuspendingPointerInputFilterKt.m3484b(aVar2, jVar2, new C09392((C19340c<? super C09392>) null));
                            dVar2.mo5406H();
                            return b;
                        }
                    }
