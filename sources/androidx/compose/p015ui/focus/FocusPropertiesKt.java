package androidx.compose.p015ui.focus;

import androidx.compose.p015ui.node.C1750p;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import androidx.compose.p015ui.node.OwnerSnapshotObserver;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p098f0.C6767e;

/* renamed from: androidx.compose.ui.focus.FocusPropertiesKt */
public final class FocusPropertiesKt {

    /* renamed from: a */
    public static final C6767e<C1477k> f3168a = C19543e0.m33309b0(FocusPropertiesKt$ModifierLocalFocusProperties$1.INSTANCE);

    /* renamed from: a */
    public static final void m3104a(FocusModifier focusModifier) {
        OwnerSnapshotObserver snapshotObserver;
        C19383o.m32797g(focusModifier, "<this>");
        LayoutNodeWrapper layoutNodeWrapper = focusModifier.f3161m;
        if (layoutNodeWrapper != null) {
            C1476j jVar = focusModifier.f3159k;
            C19383o.m32797g(jVar, "<this>");
            jVar.f3182a = true;
            C1478l lVar = C1478l.f3194b;
            jVar.mo6214b(lVar);
            jVar.f3184c = lVar;
            jVar.f3185d = lVar;
            jVar.f3186e = lVar;
            jVar.f3187f = lVar;
            jVar.f3188g = lVar;
            jVar.f3189h = lVar;
            jVar.f3190i = lVar;
            C1750p pVar = layoutNodeWrapper.f3850f.f3823h;
            if (!(pVar == null || (snapshotObserver = pVar.getSnapshotObserver()) == null)) {
                snapshotObserver.mo6824b(focusModifier, FocusModifier.f3150q, new FocusPropertiesKt$refreshFocusProperties$1(focusModifier));
            }
            C1476j jVar2 = focusModifier.f3159k;
            C19383o.m32797g(jVar2, "properties");
            if (jVar2.f3182a) {
                C1482p.m3143a(focusModifier);
            } else {
                C1482p.m3146d(focusModifier);
            }
        }
    }
}
