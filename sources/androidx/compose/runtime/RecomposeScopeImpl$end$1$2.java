package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p219r.C7729a;
import p219r.C7730b;
import p753kq.C19857l;

final class RecomposeScopeImpl$end$1$2 extends Lambda implements C19857l<C1320f, C19394m> {
    public final /* synthetic */ C7729a $instances;
    public final /* synthetic */ int $token;
    public final /* synthetic */ C1418v0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecomposeScopeImpl$end$1$2(C1418v0 v0Var, int i, C7729a aVar) {
        super(1);
        this.this$0 = v0Var;
        this.$token = i;
        this.$instances = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1320f) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1320f fVar) {
        C7730b<C1354p<?>, Object> bVar;
        C1320f fVar2 = fVar;
        C19383o.m32797g(fVar2, "composition");
        C1418v0 v0Var = this.this$0;
        if (v0Var.f3082e == this.$token && C19383o.m32792b(this.$instances, v0Var.f3083f) && (fVar2 instanceof C1330i)) {
            C7729a aVar = this.$instances;
            int i = this.$token;
            C1418v0 v0Var2 = this.this$0;
            int i2 = aVar.f17141a;
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                Object obj = aVar.f17142b[i3];
                if (obj != null) {
                    int i5 = aVar.f17143c[i3];
                    boolean z = i5 != i;
                    if (z) {
                        C1330i iVar = (C1330i) fVar2;
                        C19383o.m32797g(v0Var2, "scope");
                        iVar.f2897h.mo20228d(obj, v0Var2);
                        C1354p pVar = obj instanceof C1354p ? (C1354p) obj : null;
                        if (pVar != null) {
                            if (!iVar.f2897h.mo20226b(pVar)) {
                                iVar.f2899j.mo20229e(pVar);
                            }
                            C7730b<C1354p<?>, Object> bVar2 = v0Var2.f3084g;
                            if (bVar2 != null) {
                                int a = bVar2.mo20206a(pVar);
                                if (a >= 0) {
                                    int i6 = bVar2.f17146c;
                                    Object[] objArr = bVar2.f17144a;
                                    Object[] objArr2 = bVar2.f17145b;
                                    int i7 = a + 1;
                                    C19318k.m32603U0(objArr, a, objArr, i7, i6);
                                    C19318k.m32603U0(objArr2, a, objArr2, i7, i6);
                                    int i8 = i6 - 1;
                                    bVar = null;
                                    objArr[i8] = null;
                                    objArr2[i8] = null;
                                    bVar2.f17146c = i8;
                                } else {
                                    bVar = null;
                                }
                                if (bVar2.f17146c == 0) {
                                    v0Var2.f3084g = bVar;
                                }
                            }
                        }
                    }
                    if (!z) {
                        if (i4 != i3) {
                            aVar.f17142b[i4] = obj;
                            aVar.f17143c[i4] = i5;
                        }
                        i4++;
                    }
                    i3++;
                    fVar2 = fVar;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                }
            }
            int i9 = aVar.f17141a;
            for (int i10 = i4; i10 < i9; i10++) {
                aVar.f17142b[i10] = null;
            }
            aVar.f17141a = i4;
            if (this.$instances.f17141a == 0) {
                this.this$0.f3083f = null;
            }
        }
    }
}
