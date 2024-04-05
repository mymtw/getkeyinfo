package androidx.compose.material;

import android.view.View;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.node.C1754s;
import androidx.compose.runtime.C1338j0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p753kq.C19857l;

final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$1 extends Lambda implements C19857l<C1689j, C19394m> {
    public final /* synthetic */ C1754s<C1689j> $coordinates;
    public final /* synthetic */ C1338j0<Integer> $menuHeight$delegate;
    public final /* synthetic */ int $verticalMarginInPx;
    public final /* synthetic */ View $view;
    public final /* synthetic */ C1338j0<Integer> $width$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$1(C1754s<C1689j> sVar, View view, int i, C1338j0<Integer> j0Var, C1338j0<Integer> j0Var2) {
        super(1);
        this.$coordinates = sVar;
        this.$view = view;
        this.$verticalMarginInPx = i;
        this.$width$delegate = j0Var;
        this.$menuHeight$delegate = j0Var2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1689j) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1689j jVar) {
        C19383o.m32797g(jVar, "it");
        this.$width$delegate.setValue(Integer.valueOf((int) (jVar.mo6684a() >> 32)));
        this.$coordinates.f3945a = jVar;
        View rootView = this.$view.getRootView();
        C19383o.m32796f(rootView, "view.rootView");
        int i = this.$verticalMarginInPx;
        final C1338j0<Integer> j0Var = this.$menuHeight$delegate;
        C19421p.m32958w(rootView, (C1689j) this.$coordinates.f3945a, i, new C19857l<Integer, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return C19394m.f43287a;
            }

            public final void invoke(int i) {
                j0Var.setValue(Integer.valueOf(i));
            }
        });
    }
}
