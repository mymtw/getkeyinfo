package androidx.compose.foundation;

import android.view.View;
import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.draw.DrawModifierKt;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.semantics.C1909p;
import androidx.compose.p015ui.semantics.C1910q;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1415u;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C19653m1;
import kotlinx.coroutines.flow.C19680v;
import p174m0.C7282b;
import p174m0.C7286f;
import p288y.C8343c;
import p297z.C8412e;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

final class MagnifierKt$magnifier$4 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C19857l<C7282b, C8343c> $magnifierCenter;
    public final /* synthetic */ C19857l<C7286f, C19394m> $onSizeChanged;
    public final /* synthetic */ C1033z $platformMagnifierFactory;
    public final /* synthetic */ C19857l<C7282b, C8343c> $sourceCenter;
    public final /* synthetic */ C0894t $style;
    public final /* synthetic */ float $zoom;

    @C19060c(mo70540c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", mo70541f = "Magnifier.kt", mo70542l = {365}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1 */
    public static final class C05331 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C05331 r1 = new C05331(zVar, tVar3, view, bVar, f3, m1Var2, E04, k1Var2, k1Var, E02, j0Var, E03, cVar);
            r1.L$0 = obj;
            return r1;
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C05331) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: androidx.compose.foundation.y} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r1 = r19
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r1.label
                r3 = 1
                if (r2 == 0) goto L_0x0020
                if (r2 != r3) goto L_0x0018
                java.lang.Object r0 = r1.L$0
                r2 = r0
                androidx.compose.foundation.y r2 = (androidx.compose.foundation.C1032y) r2
                androidx.compose.foundation.layout.C0761x.m1684O0(r20)     // Catch:{ all -> 0x0015 }
                goto L_0x009c
            L_0x0015:
                r0 = move-exception
                goto L_0x00a4
            L_0x0018:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0020:
                androidx.compose.foundation.layout.C0761x.m1684O0(r20)
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.d0 r2 = (kotlinx.coroutines.C19525d0) r2
                androidx.compose.foundation.z r4 = r5
                androidx.compose.foundation.t r5 = r6
                android.view.View r6 = r7
                m0.b r7 = r8
                float r8 = r9
                androidx.compose.foundation.y r4 = r4.mo3706a(r5, r6, r7, r8)
                kotlin.jvm.internal.Ref$LongRef r5 = new kotlin.jvm.internal.Ref$LongRef
                r5.<init>()
                long r6 = r4.mo3708a()
                m0.b r8 = r8
                androidx.compose.runtime.k1<kq.l<m0.f, kotlin.m>> r9 = r11
                kq.l r9 = androidx.compose.foundation.MagnifierKt$magnifier$4.m34666access$invoke$lambda6(r9)
                if (r9 == 0) goto L_0x0058
                long r10 = androidx.compose.foundation.layout.C0761x.m1698V0(r6)
                long r10 = r8.mo3788A(r10)
                m0.f r8 = new m0.f
                r8.<init>(r10)
                r9.invoke(r8)
            L_0x0058:
                r5.element = r6
                kotlinx.coroutines.flow.m1<kotlin.m> r6 = r10
                androidx.compose.foundation.MagnifierKt$magnifier$4$1$1 r7 = new androidx.compose.foundation.MagnifierKt$magnifier$4$1$1
                r8 = 0
                r7.<init>(r4, r8)
                kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 r8 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1
                r8.<init>(r6, r7)
                kotlinx.coroutines.flow.C19669s.m33429a(r8, r2)
                androidx.compose.foundation.MagnifierKt$magnifier$4$1$2 r2 = new androidx.compose.foundation.MagnifierKt$magnifier$4$1$2     // Catch:{ all -> 0x00a2 }
                m0.b r11 = r8     // Catch:{ all -> 0x00a2 }
                androidx.compose.runtime.k1<java.lang.Boolean> r12 = r12     // Catch:{ all -> 0x00a2 }
                androidx.compose.runtime.k1<y.c> r13 = r13     // Catch:{ all -> 0x00a2 }
                androidx.compose.runtime.k1<kq.l<m0.b, y.c>> r14 = r14     // Catch:{ all -> 0x00a2 }
                androidx.compose.runtime.j0<y.c> r15 = r15     // Catch:{ all -> 0x00a2 }
                androidx.compose.runtime.k1<java.lang.Float> r6 = r16     // Catch:{ all -> 0x00a2 }
                androidx.compose.runtime.k1<kq.l<m0.f, kotlin.m>> r7 = r11     // Catch:{ all -> 0x00a2 }
                r9 = r2
                r10 = r4
                r16 = r6
                r17 = r5
                r18 = r7
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00a2 }
                kotlinx.coroutines.flow.q1 r2 = androidx.compose.runtime.C1333i1.m2796b(r2)     // Catch:{ all -> 0x00a2 }
                r1.L$0 = r4     // Catch:{ all -> 0x00a2 }
                r1.label = r3     // Catch:{ all -> 0x00a2 }
                kotlinx.coroutines.flow.internal.m r3 = kotlinx.coroutines.flow.internal.C19637m.f43600b     // Catch:{ all -> 0x00a2 }
                java.lang.Object r2 = r2.collect(r3, r1)     // Catch:{ all -> 0x00a2 }
                if (r2 != r0) goto L_0x0096
                goto L_0x0098
            L_0x0096:
                kotlin.m r2 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x00a2 }
            L_0x0098:
                if (r2 != r0) goto L_0x009b
                return r0
            L_0x009b:
                r2 = r4
            L_0x009c:
                r2.dismiss()
                kotlin.m r0 = kotlin.C19394m.f43287a
                return r0
            L_0x00a2:
                r0 = move-exception
                r2 = r4
            L_0x00a4:
                r2.dismiss()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierKt$magnifier$4.C05331.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagnifierKt$magnifier$4(C19857l<? super C7282b, C8343c> lVar, C19857l<? super C7282b, C8343c> lVar2, float f, C19857l<? super C7286f, C19394m> lVar3, C1033z zVar, C0894t tVar) {
        super(3);
        this.$sourceCenter = lVar;
        this.$magnifierCenter = lVar2;
        this.$zoom = f;
        this.$onSizeChanged = lVar3;
        this.$platformMagnifierFactory = zVar;
        this.$style = tVar;
    }

    /* renamed from: access$invoke$lambda-1  reason: not valid java name */
    public static final long m34660access$invoke$lambda1(C1338j0 j0Var) {
        return ((C8343c) j0Var.getValue()).f18299a;
    }

    /* renamed from: access$invoke$lambda-10  reason: not valid java name */
    public static final boolean m34661access$invoke$lambda10(C1342k1 k1Var) {
        return ((Boolean) k1Var.getValue()).booleanValue();
    }

    /* renamed from: access$invoke$lambda-2  reason: not valid java name */
    public static final void m34662access$invoke$lambda2(C1338j0 j0Var, long j) {
        j0Var.setValue(new C8343c(j));
    }

    /* renamed from: access$invoke$lambda-3  reason: not valid java name */
    public static final C19857l m34663access$invoke$lambda3(C1342k1 k1Var) {
        return (C19857l) k1Var.getValue();
    }

    /* renamed from: access$invoke$lambda-4  reason: not valid java name */
    public static final C19857l m34664access$invoke$lambda4(C1342k1 k1Var) {
        return (C19857l) k1Var.getValue();
    }

    /* renamed from: access$invoke$lambda-5  reason: not valid java name */
    public static final float m34665access$invoke$lambda5(C1342k1 k1Var) {
        return ((Number) k1Var.getValue()).floatValue();
    }

    /* renamed from: access$invoke$lambda-6  reason: not valid java name */
    public static final C19857l m34666access$invoke$lambda6(C1342k1 k1Var) {
        return (C19857l) k1Var.getValue();
    }

    /* renamed from: access$invoke$lambda-8  reason: not valid java name */
    public static final long m34667access$invoke$lambda8(C1342k1 k1Var) {
        return ((C8343c) k1Var.getValue()).f18299a;
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C1302d dVar3 = dVar2;
        C19383o.m32797g(dVar, "$this$composed");
        dVar3.mo5465u(-454877003);
        final View view = (View) dVar3.mo5410J(AndroidCompositionLocals_androidKt.f3991f);
        final C7282b bVar = (C7282b) dVar3.mo5410J(CompositionLocalsKt.f4019e);
        dVar3.mo5465u(-492369756);
        Object v = dVar2.mo5467v();
        Object obj = C1302d.C1303a.f2828a;
        if (v == obj) {
            v = C0761x.m1751w0(new C8343c(C8343c.f18297d), C1351n1.f2948a);
            dVar3.mo5454o(v);
        }
        dVar2.mo5406H();
        final C1338j0 j0Var = (C1338j0) v;
        C1338j0 E0 = C0761x.m1664E0(this.$sourceCenter, dVar3);
        final C1338j0 E02 = C0761x.m1664E0(this.$magnifierCenter, dVar3);
        final C1338j0 E03 = C0761x.m1664E0(Float.valueOf(this.$zoom), dVar3);
        final C1338j0 E04 = C0761x.m1664E0(this.$onSizeChanged, dVar3);
        dVar3.mo5465u(-492369756);
        Object v2 = dVar2.mo5467v();
        if (v2 == obj) {
            v2 = C0761x.m1687Q(new MagnifierKt$magnifier$4$sourceCenterInRoot$2$1(bVar, E0, j0Var));
            dVar3.mo5454o(v2);
        }
        dVar2.mo5406H();
        final C1342k1 k1Var = (C1342k1) v2;
        dVar3.mo5465u(-492369756);
        Object v3 = dVar2.mo5467v();
        if (v3 == obj) {
            v3 = C0761x.m1687Q(new MagnifierKt$magnifier$4$isMagnifierShown$2$1(k1Var));
            dVar3.mo5454o(v3);
        }
        dVar2.mo5406H();
        final C1342k1 k1Var2 = (C1342k1) v3;
        dVar3.mo5465u(-492369756);
        Object v4 = dVar2.mo5467v();
        if (v4 == obj) {
            v4 = C19680v.m33452a(1, 0, BufferOverflow.DROP_OLDEST, 2);
            dVar3.mo5454o(v4);
        }
        dVar2.mo5406H();
        final C19653m1 m1Var = (C19653m1) v4;
        float f = this.$platformMagnifierFactory.mo3707b() ? 0.0f : this.$zoom;
        C0894t tVar = this.$style;
        Object[] objArr = {view, bVar, Float.valueOf(f), tVar, Boolean.valueOf(C19383o.m32792b(tVar, C0894t.f1897h))};
        final C1033z zVar = this.$platformMagnifierFactory;
        C0894t tVar2 = this.$style;
        float f2 = this.$zoom;
        C05331 r0 = r4;
        final C0894t tVar3 = tVar2;
        Object[] objArr2 = objArr;
        final float f3 = f2;
        final C19653m1 m1Var2 = m1Var;
        C05331 r4 = new C05331((C19340c<? super C05331>) null);
        C1415u.m3032f(objArr2, r0, dVar3);
        final C1338j0 j0Var2 = j0Var;
        final C1342k1 k1Var3 = k1Var;
        C1436d a = SemanticsModifierKt.m4174a(DrawModifierKt.m3070a(C15588c1.m25270A0(dVar, new C19857l<C1689j, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C1689j) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C1689j jVar) {
                C19383o.m32797g(jVar, "it");
                MagnifierKt$magnifier$4.m34662access$invoke$lambda2(j0Var2, C0114h.m320t0(jVar));
            }
        }), new C19857l<C8412e, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C8412e) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C8412e eVar) {
                C19383o.m32797g(eVar, "$this$drawBehind");
                m1Var.mo72331a(C19394m.f43287a);
            }
        }), false, new C19857l<C1910q, C19394m>() {
            public final void invoke(C1910q qVar) {
                C19383o.m32797g(qVar, "$this$semantics");
                C1909p<C19846a<C8343c>> pVar = C0885s.f1894a;
                final C1342k1<C8343c> k1Var = k1Var3;
                qVar.mo7342a(pVar, new C19846a<C8343c>() {
                    public /* synthetic */ Object invoke() {
                        return new C8343c(m34668invokeF1C5BW0());
                    }

                    /* renamed from: invoke-F1C5BW0  reason: not valid java name */
                    public final long m34668invokeF1C5BW0() {
                        return MagnifierKt$magnifier$4.m34667access$invoke$lambda8(k1Var);
                    }
                });
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C1910q) obj);
                return C19394m.f43287a;
            }
        });
        dVar2.mo5406H();
        return a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }
}
