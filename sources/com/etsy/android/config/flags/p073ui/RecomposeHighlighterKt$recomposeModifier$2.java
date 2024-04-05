package com.etsy.android.config.flags.p073ui;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.draw.C1440b;
import androidx.compose.p015ui.draw.C1445g;
import androidx.compose.p015ui.draw.DrawModifierKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1415u;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import p297z.C8410c;
import p628nj.C18263b;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

/* renamed from: com.etsy.android.config.flags.ui.RecomposeHighlighterKt$recomposeModifier$2 */
final class RecomposeHighlighterKt$recomposeModifier$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public static final RecomposeHighlighterKt$recomposeModifier$2 INSTANCE = new RecomposeHighlighterKt$recomposeModifier$2();

    @C19060c(mo70540c = "com.etsy.android.config.flags.ui.RecomposeHighlighterKt$recomposeModifier$2$1", mo70541f = "RecomposeHighlighter.kt", mo70542l = {59}, mo70543m = "invokeSuspend")
    /* renamed from: com.etsy.android.config.flags.ui.RecomposeHighlighterKt$recomposeModifier$2$1 */
    public static final class C63971 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C63971(j0Var, lArr3, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C63971) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                this.label = 1;
                if (C18263b.m30814I(3000, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C0761x.m1684O0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j0Var.setValue(lArr3[0]);
            return C19394m.f43287a;
        }
    }

    public RecomposeHighlighterKt$recomposeModifier$2() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(806410089);
        dVar2.mo5465u(-492369756);
        Object v = dVar2.mo5467v();
        C1302d.C1303a.C1304a aVar = C1302d.C1303a.f2828a;
        Long[] lArr = v;
        if (v == aVar) {
            Long[] lArr2 = {0L};
            dVar2.mo5454o(lArr2);
            lArr = lArr2;
        }
        dVar2.mo5406H();
        final Long[] lArr3 = (Long[]) lArr;
        lArr3[0] = Long.valueOf(lArr3[0].longValue() + 1);
        dVar2.mo5465u(-492369756);
        Object v2 = dVar2.mo5467v();
        if (v2 == aVar) {
            v2 = C0761x.m1751w0(0L, C1351n1.f2948a);
            dVar2.mo5454o(v2);
        }
        dVar2.mo5406H();
        final C1338j0 j0Var = (C1338j0) v2;
        C1415u.m3031e(lArr3[0], new C63971((C19340c<? super C63971>) null), dVar2);
        C1436d b = DrawModifierKt.m3071b(new C19857l<C1440b, C1445g>() {
            public final C1445g invoke(C1440b bVar) {
                C19383o.m32797g(bVar, "$this$drawWithCache");
                final Long[] lArr = lArr3;
                final C1338j0<Long> j0Var = j0Var;
                return bVar.mo6169c(new C19857l<C8410c, C19394m>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((C8410c) obj);
                        return C19394m.f43287a;
                    }

                    /* JADX WARNING: type inference failed for: r2v21, types: [z.h] */
                    /* JADX WARNING: Multi-variable type inference failed */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void invoke(p297z.C8410c r19) {
                        /*
                            r18 = this;
                            r0 = r18
                            r1 = r19
                            java.lang.String r2 = "$this$onDrawWithContent"
                            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
                            r19.mo6911O0()
                            java.lang.Long[] r2 = r1
                            r3 = 0
                            r2 = r2[r3]
                            long r4 = r2.longValue()
                            androidx.compose.runtime.j0<java.lang.Long> r2 = r2
                            java.lang.Object r2 = r2.getValue()
                            java.lang.Number r2 = (java.lang.Number) r2
                            long r6 = r2.longValue()
                            long r4 = r4 - r6
                            long r6 = r19.mo6913b()
                            float r2 = p288y.C8347f.m16655c(r6)
                            r6 = 0
                            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                            r6 = 1
                            if (r2 <= 0) goto L_0x0032
                            r2 = r6
                            goto L_0x0033
                        L_0x0032:
                            r2 = r3
                        L_0x0033:
                            if (r2 == 0) goto L_0x0112
                            r7 = 0
                            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                            if (r2 > 0) goto L_0x003d
                            goto L_0x0112
                        L_0x003d:
                            r7 = 1
                            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                            r9 = 2
                            r10 = 1065353216(0x3f800000, float:1.0)
                            if (r2 != 0) goto L_0x0057
                            long r4 = androidx.compose.p015ui.graphics.C1545s.f3361f
                            androidx.compose.ui.graphics.s r2 = new androidx.compose.ui.graphics.s
                            r2.<init>(r4)
                            java.lang.Float r4 = java.lang.Float.valueOf(r10)
                            kotlin.Pair r5 = new kotlin.Pair
                            r5.<init>(r2, r4)
                            goto L_0x00a6
                        L_0x0057:
                            r11 = 2
                            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                            if (r2 != 0) goto L_0x0073
                            long r4 = androidx.compose.p015ui.graphics.C1545s.f3360e
                            androidx.compose.ui.graphics.s r2 = new androidx.compose.ui.graphics.s
                            r2.<init>(r4)
                            float r4 = (float) r9
                            float r4 = r1.mo3789B0(r4)
                            java.lang.Float r4 = java.lang.Float.valueOf(r4)
                            kotlin.Pair r5 = new kotlin.Pair
                            r5.<init>(r2, r4)
                            goto L_0x00a6
                        L_0x0073:
                            long r11 = androidx.compose.p015ui.graphics.C1545s.f3362g
                            r2 = 1061997773(0x3f4ccccd, float:0.8)
                            long r11 = androidx.compose.p015ui.graphics.C1545s.m3356b(r11, r2)
                            long r13 = androidx.compose.p015ui.graphics.C1545s.f3359d
                            r2 = 1056964608(0x3f000000, float:0.5)
                            long r13 = androidx.compose.p015ui.graphics.C1545s.m3356b(r13, r2)
                            long r7 = r4 - r7
                            float r2 = (float) r7
                            r7 = 1120403456(0x42c80000, float:100.0)
                            float r2 = r2 / r7
                            float r2 = java.lang.Math.min(r10, r2)
                            long r7 = p628nj.C18263b.m30841e0(r11, r2, r13)
                            androidx.compose.ui.graphics.s r2 = new androidx.compose.ui.graphics.s
                            r2.<init>(r7)
                            int r4 = (int) r4
                            float r4 = (float) r4
                            float r4 = r1.mo3789B0(r4)
                            java.lang.Float r4 = java.lang.Float.valueOf(r4)
                            kotlin.Pair r5 = new kotlin.Pair
                            r5.<init>(r2, r4)
                        L_0x00a6:
                            java.lang.Object r2 = r5.component1()
                            androidx.compose.ui.graphics.s r2 = (androidx.compose.p015ui.graphics.C1545s) r2
                            long r7 = r2.f3366a
                            java.lang.Object r2 = r5.component2()
                            java.lang.Number r2 = (java.lang.Number) r2
                            float r11 = r2.floatValue()
                            float r2 = (float) r9
                            float r4 = r11 / r2
                            long r4 = kotlin.reflect.C19421p.m32952q(r4, r4)
                            long r9 = r19.mo6913b()
                            float r9 = p288y.C8347f.m16656d(r9)
                            float r9 = r9 - r11
                            long r12 = r19.mo6913b()
                            float r10 = p288y.C8347f.m16654b(r12)
                            float r10 = r10 - r11
                            long r9 = androidx.activity.C0114h.m319t(r9, r10)
                            float r2 = r2 * r11
                            long r12 = r19.mo6913b()
                            float r12 = p288y.C8347f.m16655c(r12)
                            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
                            if (r2 <= 0) goto L_0x00e3
                            r3 = r6
                        L_0x00e3:
                            if (r3 == 0) goto L_0x00e7
                            long r4 = p288y.C8343c.f18295b
                        L_0x00e7:
                            if (r3 == 0) goto L_0x00ed
                            long r9 = r19.mo6913b()
                        L_0x00ed:
                            r16 = r9
                            if (r3 == 0) goto L_0x00f4
                            z.h r2 = p297z.C8415h.f18433a
                            goto L_0x00ff
                        L_0x00f4:
                            z.i r2 = new z.i
                            r12 = 0
                            r13 = 0
                            r14 = 0
                            r15 = 30
                            r10 = r2
                            r10.<init>(r11, r12, r13, r14, r15)
                        L_0x00ff:
                            r9 = r2
                            androidx.compose.ui.graphics.l0 r2 = new androidx.compose.ui.graphics.l0
                            r2.<init>(r7)
                            r7 = 0
                            r10 = 104(0x68, float:1.46E-43)
                            r1 = r19
                            r3 = r4
                            r5 = r16
                            r8 = r9
                            r9 = r10
                            p297z.C8412e.m16780A0(r1, r2, r3, r5, r7, r8, r9)
                        L_0x0112:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.config.flags.p073ui.RecomposeHighlighterKt$recomposeModifier$2.C63982.C63991.invoke(z.c):void");
                    }
                });
            }
        });
        dVar2.mo5406H();
        return b;
    }
}
