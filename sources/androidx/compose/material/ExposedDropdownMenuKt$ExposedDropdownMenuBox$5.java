package androidx.compose.material;

import android.view.View;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.node.C1754s;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$5 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ C1754s<C1689j> $coordinates;
    public final /* synthetic */ C1338j0<Integer> $menuHeight$delegate;
    public final /* synthetic */ int $verticalMarginInPx;
    public final /* synthetic */ View $view;

    /* renamed from: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$a */
    public static final class C1084a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ C1187g1 f2208a;

        public C1084a(C1187g1 g1Var) {
            this.f2208a = g1Var;
        }

        public final void dispose() {
            C1187g1 g1Var = this.f2208a;
            if (g1Var.f2468d) {
                g1Var.f2466b.getViewTreeObserver().removeOnGlobalLayoutListener(g1Var);
                g1Var.f2468d = false;
            }
            g1Var.f2466b.removeOnAttachStateChangeListener(g1Var);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$5(View view, C1754s<C1689j> sVar, int i, C1338j0<Integer> j0Var) {
        super(1);
        this.$view = view;
        this.$coordinates = sVar;
        this.$verticalMarginInPx = i;
        this.$menuHeight$delegate = j0Var;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        View view = this.$view;
        return new C1084a(new C1187g1(view, new ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$listener$1(view, this.$coordinates, this.$verticalMarginInPx, this.$menuHeight$delegate)));
    }
}
