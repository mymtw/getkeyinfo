package androidx.compose.p015ui.window;

import android.support.p013v4.media.C0073e;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1411t;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p174m0.C7282b;
import p174m0.C7290i;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1 */
public final class AndroidPopup_androidKt$Popup$popupLayout$1$1$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ C1342k1<C19861p<C1302d, Integer, C19394m>> $currentContent$delegate;
    public final /* synthetic */ PopupLayout $this_apply;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$popupLayout$1$1$1(PopupLayout popupLayout, C1342k1<? extends C19861p<? super C1302d, ? super Integer, C19394m>> k1Var) {
        super(2);
        this.$this_apply = popupLayout;
        this.$currentContent$delegate = k1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1436d a = SemanticsModifierKt.m4174a(C1436d.C1437a.f3125b, false, C20821.INSTANCE);
            final PopupLayout popupLayout = this.$this_apply;
            C1436d I = C0005b.m15I(C18263b.m30849j0(a, new C19857l<C7290i, C19394m>() {
                public /* synthetic */ Object invoke(Object obj) {
                    m34828invokeozmzZPI(((C7290i) obj).f16171a);
                    return C19394m.f43287a;
                }

                /* renamed from: invoke-ozmzZPI  reason: not valid java name */
                public final void m34828invokeozmzZPI(long j) {
                    popupLayout.m34830setPopupContentSizefhxjrPA(new C7290i(j));
                    popupLayout.updatePosition();
                }
            }), this.$this_apply.getCanCalculatePosition() ? 1.0f : 0.0f);
            final C1342k1<C19861p<C1302d, Integer, C19394m>> k1Var = this.$currentContent$delegate;
            ComposableLambdaImpl A = C18263b.m30805A(dVar, 606497925, new C19861p<C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1302d) obj, ((Number) obj2).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C1302d dVar, int i) {
                    if ((i & 11) != 2 || !dVar.mo5442i()) {
                        C1342k1<C19861p<C1302d, Integer, C19394m>> k1Var = k1Var;
                        C1411t tVar = AndroidPopup_androidKt.f4705a;
                        k1Var.getValue().invoke(dVar, 0);
                        return;
                    }
                    dVar.mo5396C();
                }
            });
            dVar.mo5465u(1406149896);
            AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = AndroidPopup_androidKt$SimpleStack$1.f4709a;
            dVar.mo5465u(-1323940314);
            C7282b bVar = (C7282b) dVar.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) dVar.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) dVar.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a2 = C1700o.m3617a(I);
            if (dVar.mo5446k() instanceof C1299c) {
                dVar.mo5392A();
                if (dVar.mo5436f()) {
                    dVar.mo5450m(aVar);
                } else {
                    dVar.mo5452n();
                }
                dVar.mo5394B();
                Updater.m2571b(dVar, androidPopup_androidKt$SimpleStack$1, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(dVar, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(dVar, layoutDirection, ComposeUiNode.Companion.f3782f);
                a2.invoke(C0073e.m204d(dVar, j1Var, ComposeUiNode.Companion.f3783g, dVar), dVar, 0);
                dVar.mo5465u(2058660585);
                A.invoke(dVar, 6);
                dVar.mo5406H();
                dVar.mo5456p();
                dVar.mo5406H();
                dVar.mo5406H();
                return;
            }
            C0005b.m45j0();
            throw null;
        }
        dVar.mo5396C();
    }
}
