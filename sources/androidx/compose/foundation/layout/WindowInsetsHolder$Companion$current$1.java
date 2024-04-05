package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import androidx.core.view.C2325q;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class WindowInsetsHolder$Companion$current$1 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ C0740i0 $insets;
    public final /* synthetic */ View $view;

    /* renamed from: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1$a */
    public static final class C0671a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ C0740i0 f1443a;

        /* renamed from: b */
        public final /* synthetic */ View f1444b;

        public C0671a(C0740i0 i0Var, View view) {
            this.f1443a = i0Var;
            this.f1444b = view;
        }

        public final void dispose() {
            C0740i0 i0Var = this.f1443a;
            View view = this.f1444b;
            i0Var.getClass();
            C19383o.m32797g(view, "view");
            int i = i0Var.f1525t - 1;
            i0Var.f1525t = i;
            if (i == 0) {
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                C2364y.C2373i.m5274u(view, (C2325q) null);
                C2364y.m5203r(view, (C0753p) null);
                view.removeOnAttachStateChangeListener(i0Var.f1526u);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInsetsHolder$Companion$current$1(C0740i0 i0Var, View view) {
        super(1);
        this.$insets = i0Var;
        this.$view = view;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        C0740i0 i0Var = this.$insets;
        View view = this.$view;
        i0Var.getClass();
        C19383o.m32797g(view, "view");
        if (i0Var.f1525t == 0) {
            C0753p pVar = i0Var.f1526u;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2373i.m5274u(view, pVar);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(i0Var.f1526u);
            if (Build.VERSION.SDK_INT >= 30) {
                C2364y.m5203r(view, i0Var.f1526u);
            }
        }
        i0Var.f1525t++;
        return new C0671a(this.$insets, this.$view);
    }
}
