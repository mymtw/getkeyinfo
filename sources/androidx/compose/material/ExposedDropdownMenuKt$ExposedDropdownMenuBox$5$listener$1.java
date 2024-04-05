package androidx.compose.material;

import android.view.View;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.node.C1754s;
import androidx.compose.runtime.C1338j0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p753kq.C19846a;
import p753kq.C19857l;

public final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$listener$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C1754s<C1689j> $coordinates;
    public final /* synthetic */ C1338j0<Integer> $menuHeight$delegate;
    public final /* synthetic */ int $verticalMarginInPx;
    public final /* synthetic */ View $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$listener$1(View view, C1754s<C1689j> sVar, int i, C1338j0<Integer> j0Var) {
        super(0);
        this.$view = view;
        this.$coordinates = sVar;
        this.$verticalMarginInPx = i;
        this.$menuHeight$delegate = j0Var;
    }

    public final void invoke() {
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
