package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.C0428h;
import androidx.compose.foundation.C0885s;
import androidx.compose.foundation.C0894t;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.C1016k;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1351n1;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7282b;
import p174m0.C7286f;
import p174m0.C7290i;
import p288y.C8343c;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19862q;

final class SelectionManager_androidKt$selectionMagnifier$1 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ SelectionManager $manager;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionManager_androidKt$selectionMagnifier$1(SelectionManager selectionManager) {
        super(3);
        this.$manager = selectionManager;
    }

    /* renamed from: access$invoke$lambda-1  reason: not valid java name */
    public static final long m34726access$invoke$lambda1(C1338j0 j0Var) {
        return ((C7290i) j0Var.getValue()).f16171a;
    }

    /* renamed from: access$invoke$lambda-2  reason: not valid java name */
    public static final void m34727access$invoke$lambda2(C1338j0 j0Var, long j) {
        j0Var.setValue(new C7290i(j));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(-1914520728);
        final C7282b bVar = (C7282b) dVar2.mo5410J(CompositionLocalsKt.f4019e);
        dVar2.mo5465u(-492369756);
        Object v = dVar2.mo5467v();
        if (v == C1302d.C1303a.f2828a) {
            v = C0761x.m1751w0(new C7290i(0), C1351n1.f2948a);
            dVar2.mo5454o(v);
        }
        dVar2.mo5406H();
        final C1338j0 j0Var = (C1338j0) v;
        final SelectionManager selectionManager = this.$manager;
        C09901 r1 = new C19846a<C8343c>() {
            public /* synthetic */ Object invoke() {
                return new C8343c(m34728invokeF1C5BW0());
            }

            /* renamed from: invoke-F1C5BW0  reason: not valid java name */
            public final long m34728invokeF1C5BW0() {
                SelectionManager selectionManager = selectionManager;
                long r1 = SelectionManager_androidKt$selectionMagnifier$1.m34726access$invoke$lambda1(j0Var);
                C19383o.m32797g(selectionManager, "manager");
                C1011g d = selectionManager.mo4612d();
                if (d == null) {
                    return C8343c.f18297d;
                }
                Handle handle = (Handle) selectionManager.f2079o.getValue();
                int i = handle == null ? -1 : C1016k.C1017a.f2134a[handle.ordinal()];
                if (i == -1) {
                    return C8343c.f18297d;
                }
                if (i == 1) {
                    return C1016k.m2108a(selectionManager, r1, d.f2121a, true);
                }
                if (i == 2) {
                    return C1016k.m2108a(selectionManager, r1, d.f2122b, false);
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("SelectionContainer does not support cursor".toString());
            }
        };
        C09912 r2 = new C19857l<C19846a<? extends C8343c>, C1436d>() {
            public final C1436d invoke(final C19846a<C8343c> aVar) {
                C19383o.m32797g(aVar, "center");
                C0894t tVar = C0894t.f1897h;
                C09921 r1 = new C19857l<C7282b, C8343c>() {
                    public /* synthetic */ Object invoke(Object obj) {
                        return new C8343c(m34729invoketuRUvjQ((C7282b) obj));
                    }

                    /* renamed from: invoke-tuRUvjQ  reason: not valid java name */
                    public final long m34729invoketuRUvjQ(C7282b bVar) {
                        C19383o.m32797g(bVar, "$this$magnifier");
                        return aVar.invoke().f18299a;
                    }
                };
                final C7282b bVar = bVar;
                final C1338j0<C7290i> j0Var = j0Var;
                return C0885s.m1942a(r1, tVar, new C19857l<C7286f, C19394m>() {
                    public /* synthetic */ Object invoke(Object obj) {
                        m34730invokeEaSLcWc(((C7286f) obj).f16163a);
                        return C19394m.f43287a;
                    }

                    /* renamed from: invoke-EaSLcWc  reason: not valid java name */
                    public final void m34730invokeEaSLcWc(long j) {
                        C1338j0<C7290i> j0Var = j0Var;
                        C7282b bVar = bVar;
                        SelectionManager_androidKt$selectionMagnifier$1.m34727access$invoke$lambda2(j0Var, C0761x.m1707a(bVar.mo3791V(C7286f.m13989b(j)), bVar.mo3791V(C7286f.m13988a(j))));
                    }
                });
            }
        };
        C0428h hVar = SelectionMagnifierKt.f2059a;
        C1436d b = ComposedModifierKt.m3049a(dVar, InspectableValueKt.f4032a, new SelectionMagnifierKt$animatedSelectionMagnifier$1(r1, r2));
        dVar2.mo5406H();
        return b;
    }
}
