package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.C0428h;
import androidx.compose.foundation.C0885s;
import androidx.compose.foundation.C0894t;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.text.C0965r;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2022r;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1351n1;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import org.apache.commons.lang3.ClassUtils;
import p174m0.C7282b;
import p174m0.C7286f;
import p174m0.C7290i;
import p288y.C8343c;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19862q;
import p764pq.C20053e;
import p764pq.C20057i;

final class TextFieldSelectionManager_androidKt$textFieldMagnifier$1 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ TextFieldSelectionManager $manager;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager_androidKt$textFieldMagnifier$1(TextFieldSelectionManager textFieldSelectionManager) {
        super(3);
        this.$manager = textFieldSelectionManager;
    }

    /* renamed from: access$invoke$lambda-1  reason: not valid java name */
    public static final long m34735access$invoke$lambda1(C1338j0 j0Var) {
        return ((C7290i) j0Var.getValue()).f16171a;
    }

    /* renamed from: access$invoke$lambda-2  reason: not valid java name */
    public static final void m34736access$invoke$lambda2(C1338j0 j0Var, long j) {
        j0Var.setValue(new C7290i(j));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(1980580247);
        final C7282b bVar = (C7282b) dVar2.mo5410J(CompositionLocalsKt.f4019e);
        dVar2.mo5465u(-492369756);
        Object v = dVar2.mo5467v();
        if (v == C1302d.C1303a.f2828a) {
            v = C0761x.m1751w0(new C7290i(0), C1351n1.f2948a);
            dVar2.mo5454o(v);
        }
        dVar2.mo5406H();
        final C1338j0 j0Var = (C1338j0) v;
        final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
        C09971 r1 = new C19846a<C8343c>() {
            public /* synthetic */ Object invoke() {
                return new C8343c(m34737invokeF1C5BW0());
            }

            /* renamed from: invoke-F1C5BW0  reason: not valid java name */
            public final long m34737invokeF1C5BW0() {
                int i;
                C0965r c;
                C2021q qVar;
                C1689j jVar;
                C1689j jVar2;
                TextFieldSelectionManager textFieldSelectionManager = textFieldSelectionManager;
                long r2 = TextFieldSelectionManager_androidKt$textFieldMagnifier$1.m34735access$invoke$lambda1(j0Var);
                C19383o.m32797g(textFieldSelectionManager, "manager");
                if (textFieldSelectionManager.mo4651j().f4448a.f4296b.length() == 0) {
                    return C8343c.f18297d;
                }
                Handle handle = (Handle) textFieldSelectionManager.f2096n.getValue();
                int i2 = handle == null ? -1 : TextFieldSelectionManagerKt.C0996a.f2102a[handle.ordinal()];
                if (i2 == -1) {
                    return C8343c.f18297d;
                }
                if (i2 == 1 || i2 == 2) {
                    long j = textFieldSelectionManager.mo4651j().f4449b;
                    int i3 = C2022r.f4596c;
                    i = (int) (j >> 32);
                } else if (i2 == 3) {
                    i = C2022r.m4464c(textFieldSelectionManager.mo4651j().f4449b);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                int b = textFieldSelectionManager.f2084b.mo7684b(i);
                String str = textFieldSelectionManager.mo4651j().f4448a.f4296b;
                C19383o.m32797g(str, "<this>");
                C20057i iVar = new C20057i(0, str.length() - 1);
                if (iVar instanceof C20053e) {
                    b = ((Number) C19388s.m32837O(Integer.valueOf(b), (C20053e) iVar)).intValue();
                } else if (iVar.isEmpty()) {
                    throw new IllegalArgumentException("Cannot coerce value to an empty range: " + iVar + ClassUtils.PACKAGE_SEPARATOR_CHAR);
                } else if (b < iVar.mo74309c().intValue()) {
                    b = iVar.mo74309c().intValue();
                } else if (b > iVar.mo74311g().intValue()) {
                    b = iVar.mo74311g().intValue();
                }
                TextFieldState textFieldState = textFieldSelectionManager.f2086d;
                if (textFieldState == null || (c = textFieldState.mo4562c()) == null || (qVar = c.f2042a) == null) {
                    return C8343c.f18297d;
                }
                long b2 = qVar.mo7739b(b).mo20927b();
                TextFieldState textFieldState2 = textFieldSelectionManager.f2086d;
                if (textFieldState2 == null || (jVar = textFieldState2.f1949f) == null) {
                    return C8343c.f18297d;
                }
                C0965r c2 = textFieldState2.mo4562c();
                if (c2 == null || (jVar2 = c2.f2043b) == null) {
                    return C8343c.f18297d;
                }
                C8343c cVar = (C8343c) textFieldSelectionManager.f2097o.getValue();
                if (cVar == null) {
                    return C8343c.f18297d;
                }
                float c3 = C8343c.m16642c(jVar2.mo6686m(jVar, cVar.f18299a));
                int f = qVar.mo7744f(b);
                int j2 = qVar.mo7749j(f);
                int e = qVar.mo7742e(f, true);
                boolean z = ((int) (textFieldSelectionManager.mo4651j().f4449b >> 32)) > C2022r.m4464c(textFieldSelectionManager.mo4651j().f4449b);
                float K = C19421p.m32921K(qVar, j2, true, z);
                float K2 = C19421p.m32921K(qVar, e, false, z);
                float L = C19388s.m32831L(c3, Math.min(K, K2), Math.max(K, K2));
                return Math.abs(c3 - L) > ((float) (((int) (r2 >> 32)) / 2)) ? C8343c.f18297d : jVar.mo6686m(jVar2, C19421p.m32952q(L, C8343c.m16643d(b2)));
            }
        };
        C09982 r2 = new C19857l<C19846a<? extends C8343c>, C1436d>() {
            public final C1436d invoke(final C19846a<C8343c> aVar) {
                C19383o.m32797g(aVar, "center");
                C0894t tVar = C0894t.f1897h;
                C09991 r1 = new C19857l<C7282b, C8343c>() {
                    public /* synthetic */ Object invoke(Object obj) {
                        return new C8343c(m34738invoketuRUvjQ((C7282b) obj));
                    }

                    /* renamed from: invoke-tuRUvjQ  reason: not valid java name */
                    public final long m34738invoketuRUvjQ(C7282b bVar) {
                        C19383o.m32797g(bVar, "$this$magnifier");
                        return aVar.invoke().f18299a;
                    }
                };
                final C7282b bVar = bVar;
                final C1338j0<C7290i> j0Var = j0Var;
                return C0885s.m1942a(r1, tVar, new C19857l<C7286f, C19394m>() {
                    public /* synthetic */ Object invoke(Object obj) {
                        m34739invokeEaSLcWc(((C7286f) obj).f16163a);
                        return C19394m.f43287a;
                    }

                    /* renamed from: invoke-EaSLcWc  reason: not valid java name */
                    public final void m34739invokeEaSLcWc(long j) {
                        C1338j0<C7290i> j0Var = j0Var;
                        C7282b bVar = bVar;
                        TextFieldSelectionManager_androidKt$textFieldMagnifier$1.m34736access$invoke$lambda2(j0Var, C0761x.m1707a(bVar.mo3791V(C7286f.m13989b(j)), bVar.mo3791V(C7286f.m13988a(j))));
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
