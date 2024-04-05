package androidx.compose.foundation.lazy.grid;

import androidx.compose.p015ui.semantics.C1894a;
import androidx.compose.p015ui.semantics.C1895b;
import androidx.compose.p015ui.semantics.C1901h;
import androidx.compose.p015ui.semantics.C1902i;
import androidx.compose.p015ui.semantics.C1908o;
import androidx.compose.p015ui.semantics.C1910q;
import androidx.compose.p015ui.semantics.SemanticsProperties;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19410j;
import p753kq.C19857l;
import p753kq.C19861p;

final class LazySemanticsKt$lazyGridSemantics$1$1 extends Lambda implements C19857l<C1910q, C19394m> {
    public final /* synthetic */ C1901h $accessibilityScrollState;
    public final /* synthetic */ C1895b $collectionInfo;
    public final /* synthetic */ C19857l<Object, Integer> $indexForKeyMapping;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ C19861p<Float, Float, Boolean> $scrollByAction;
    public final /* synthetic */ C19857l<Integer, Boolean> $scrollToIndexAction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazySemanticsKt$lazyGridSemantics$1$1(C19857l<Object, Integer> lVar, boolean z, C1901h hVar, C19861p<? super Float, ? super Float, Boolean> pVar, C19857l<? super Integer, Boolean> lVar2, C1895b bVar) {
        super(1);
        this.$indexForKeyMapping = lVar;
        this.$isVertical = z;
        this.$accessibilityScrollState = hVar;
        this.$scrollByAction = pVar;
        this.$scrollToIndexAction = lVar2;
        this.$collectionInfo = bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1910q) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1910q qVar) {
        C19383o.m32797g(qVar, "$this$semantics");
        C19857l<Object, Integer> lVar = this.$indexForKeyMapping;
        C19410j<Object>[] jVarArr = C1908o.f4253a;
        C19383o.m32797g(lVar, "mapping");
        qVar.mo7342a(SemanticsProperties.f4189A, lVar);
        if (this.$isVertical) {
            C1908o.m4203j(qVar, this.$accessibilityScrollState);
        } else {
            C1908o.m4201h(qVar, this.$accessibilityScrollState);
        }
        C19861p<Float, Float, Boolean> pVar = this.$scrollByAction;
        if (pVar != null) {
            C1908o.m4199f(qVar, pVar);
        }
        C19857l<Integer, Boolean> lVar2 = this.$scrollToIndexAction;
        if (lVar2 != null) {
            qVar.mo7342a(C1902i.f4234e, new C1894a((String) null, lVar2));
        }
        C1895b bVar = this.$collectionInfo;
        C19383o.m32797g(bVar, "<set-?>");
        C1908o.f4266n.mo7356a(qVar, C1908o.f4253a[13], bVar);
    }
}
