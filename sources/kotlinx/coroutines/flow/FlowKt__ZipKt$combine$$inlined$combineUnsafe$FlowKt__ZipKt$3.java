package kotlinx.coroutines.flow;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.C19630g;
import p744gq.C19060c;
import p753kq.C19862q;
import p753kq.C19865t;

public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3 implements C19597d<Object> {

    /* renamed from: b */
    public final /* synthetic */ C19597d[] f43553b;

    /* renamed from: c */
    public final /* synthetic */ C19865t f43554c;

    @C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", mo70541f = "Zip.kt", mo70542l = {333, 333}, mo70543m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 */
    public static final class C195692 extends SuspendLambda implements C19862q<C19600e<Object>, Object[], C19340c<? super C19394m>, Object> {
        private /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public final Object invoke(C19600e<Object> eVar, Object[] objArr, C19340c<? super C19394m> cVar) {
            C195692 r0 = new C195692(cVar, tVar);
            r0.L$0 = eVar;
            r0.L$1 = objArr;
            return r0.invokeSuspend(C19394m.f43287a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.flow.e} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r11.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0020
                if (r1 == r3) goto L_0x0018
                if (r1 != r2) goto L_0x0010
                androidx.compose.foundation.layout.C0761x.m1684O0(r12)
                goto L_0x0053
            L_0x0010:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0018:
                java.lang.Object r1 = r11.L$0
                kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.C19600e) r1
                androidx.compose.foundation.layout.C0761x.m1684O0(r12)
                goto L_0x0047
            L_0x0020:
                androidx.compose.foundation.layout.C0761x.m1684O0(r12)
                java.lang.Object r12 = r11.L$0
                r1 = r12
                kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.C19600e) r1
                java.lang.Object r12 = r11.L$1
                java.lang.Object[] r12 = (java.lang.Object[]) r12
                kq.t r4 = r4
                r5 = 0
                r5 = r12[r5]
                r6 = r12[r3]
                r7 = r12[r2]
                r8 = 3
                r8 = r12[r8]
                r9 = 4
                r9 = r12[r9]
                r11.L$0 = r1
                r11.label = r3
                r10 = r11
                java.lang.Object r12 = r4.invoke(r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L_0x0047
                return r0
            L_0x0047:
                r3 = 0
                r11.L$0 = r3
                r11.label = r2
                java.lang.Object r12 = r1.emit(r12, r11)
                if (r12 != r0) goto L_0x0053
                return r0
            L_0x0053:
                kotlin.m r12 = kotlin.C19394m.f43287a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3.C195692.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3(C19597d[] dVarArr, C19865t tVar) {
        this.f43553b = dVarArr;
        this.f43554c = tVar;
    }

    public final Object collect(C19600e eVar, C19340c cVar) {
        C19597d[] dVarArr = this.f43553b;
        FlowKt__ZipKt$nullArrayFactory$1 flowKt__ZipKt$nullArrayFactory$1 = FlowKt__ZipKt$nullArrayFactory$1.INSTANCE;
        final C19865t tVar = this.f43554c;
        Object a = C19630g.m33418a(dVarArr, flowKt__ZipKt$nullArrayFactory$1, new C195692((C19340c) null), eVar, cVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : C19394m.f43287a;
    }
}
