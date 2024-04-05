package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.C0894t;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.text.C0958l;
import androidx.compose.foundation.text.Handle;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.focus.FocusChangedModifierKt;
import androidx.compose.p015ui.focus.FocusRequesterModifierKt;
import androidx.compose.p015ui.input.key.KeyInputModifierKt;
import androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1412t0;
import androidx.compose.runtime.CompositionLocalKt;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.List;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.Lambda;
import p288y.C8343c;
import p568fn.C17782b;
import p628nj.C18263b;
import p753kq.C19861p;

public final class SelectionContainerKt$SelectionContainer$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $children;
    public final /* synthetic */ SelectionManager $manager;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C1020n $registrarImpl;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$3(C1020n nVar, C1436d dVar, SelectionManager selectionManager, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$registrarImpl = nVar;
        this.$modifier = dVar;
        this.$manager = selectionManager;
        this.$children = pVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1412t0[] t0VarArr = {SelectionRegistrarKt.f2081a.mo5908b(this.$registrarImpl)};
            final C1436d dVar2 = this.$modifier;
            final SelectionManager selectionManager = this.$manager;
            final C19861p<C1302d, Integer, C19394m> pVar = this.$children;
            final int i2 = this.$$dirty;
            CompositionLocalKt.m2530a(t0VarArr, C18263b.m30805A(dVar, 935424596, new C19861p<C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1302d) obj, ((Number) obj2).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C1302d dVar, int i) {
                    if ((i & 11) != 2 || !dVar.mo5442i()) {
                        C1436d dVar2 = dVar2;
                        SelectionManager selectionManager = selectionManager;
                        selectionManager.getClass();
                        C1436d dVar3 = C1436d.C1437a.f3125b;
                        boolean z = true;
                        C1436d a = KeyInputModifierKt.m3421a(FocusableKt.m1305b((C0640j) null, FocusChangedModifierKt.m3096a(FocusRequesterModifierKt.m3105a(C15588c1.m25270A0(selectionManager.mo4611c() ? SuspendingPointerInputFilterKt.m3484b(dVar3, C19394m.f43287a, new SelectionManager$onClearSelectionRequested$1(selectionManager, new SelectionManager$modifier$1(selectionManager), (C19340c<? super SelectionManager$onClearSelectionRequested$1>) null)) : dVar3, new SelectionManager$modifier$2(selectionManager)), selectionManager.f2071g), new SelectionManager$modifier$3(selectionManager)), true), new SelectionManager$modifier$4(selectionManager));
                        if (((Handle) selectionManager.f2079o.getValue()) == null) {
                            z = false;
                        }
                        if (z && C0894t.f1897h.mo4429a()) {
                            dVar3 = ComposedModifierKt.m3049a(dVar3, InspectableValueKt.f4032a, new SelectionManager_androidKt$selectionMagnifier$1(selectionManager));
                        }
                        C1436d i0 = dVar2.mo6148i0(a.mo6148i0(dVar3));
                        final C19861p<C1302d, Integer, C19394m> pVar = pVar;
                        final int i2 = i2;
                        final SelectionManager selectionManager2 = selectionManager;
                        SimpleLayoutKt.m2034a(i0, C18263b.m30805A(dVar, 1375295262, new C19861p<C1302d, Integer, C19394m>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((C1302d) obj, ((Number) obj2).intValue());
                                return C19394m.f43287a;
                            }

                            public final void invoke(C1302d dVar, int i) {
                                C1011g d;
                                C8343c cVar;
                                ResolvedTextDirection resolvedTextDirection;
                                C1302d dVar2 = dVar;
                                if ((i & 11) != 2 || !dVar.mo5442i()) {
                                    pVar.invoke(dVar2, Integer.valueOf((i2 >> 9) & 14));
                                    if (selectionManager2.mo4611c() && (d = selectionManager2.mo4612d()) != null) {
                                        SelectionManager selectionManager = selectionManager2;
                                        List e0 = C17782b.m29865e0(Boolean.TRUE, Boolean.FALSE);
                                        int size = e0.size();
                                        for (int i2 = 0; i2 < size; i2++) {
                                            boolean booleanValue = ((Boolean) e0.get(i2)).booleanValue();
                                            Boolean valueOf = Boolean.valueOf(booleanValue);
                                            dVar2.mo5465u(1157296644);
                                            boolean I = dVar2.mo5408I(valueOf);
                                            Object v = dVar.mo5467v();
                                            if (I || v == C1302d.C1303a.f2828a) {
                                                selectionManager.getClass();
                                                v = new C1015j(selectionManager, booleanValue);
                                                dVar2.mo5454o(v);
                                            }
                                            dVar.mo5406H();
                                            C0958l lVar = (C0958l) v;
                                            if (booleanValue) {
                                                cVar = (C8343c) selectionManager.f2077m.getValue();
                                            } else {
                                                cVar = (C8343c) selectionManager.f2078n.getValue();
                                            }
                                            if (booleanValue) {
                                                resolvedTextDirection = d.f2121a.f2124a;
                                            } else {
                                                resolvedTextDirection = d.f2122b.f2124a;
                                            }
                                            if (cVar != null) {
                                                AndroidSelectionHandles_androidKt.m2008c(cVar.f18299a, booleanValue, resolvedTextDirection, d.f2123c, SuspendingPointerInputFilterKt.m3484b(C1436d.C1437a.f3125b, lVar, new SelectionContainerKt$SelectionContainer$3$1$1$1$1$1(lVar, (C19340c<? super SelectionContainerKt$SelectionContainer$3$1$1$1$1$1>) null)), (C19861p<? super C1302d, ? super Integer, C19394m>) null, dVar, 196608);
                                            }
                                        }
                                        return;
                                    }
                                    return;
                                }
                                dVar.mo5396C();
                            }
                        }), dVar, 48, 0);
                        return;
                    }
                    dVar.mo5396C();
                }
            }), dVar, 56);
            return;
        }
        dVar.mo5396C();
    }
}
