package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.compose.foundation.layout.C0710b0;
import androidx.compose.foundation.layout.C0740i0;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1415u;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7282b;
import p753kq.C19862q;
import p772tq.C20203a;

final class WindowInsetsConnection_androidKt$imeNestedScroll$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public static final WindowInsetsConnection_androidKt$imeNestedScroll$2 INSTANCE = new WindowInsetsConnection_androidKt$imeNestedScroll$2();

    public WindowInsetsConnection_androidKt$imeNestedScroll$2() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C0749l lVar;
        C0710b0 b0Var;
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(-369978792);
        WeakHashMap<View, C0740i0> weakHashMap = C0740i0.f1505v;
        C0716c cVar = C0740i0.C0741a.m1619c(dVar2).f1508c;
        float f = C0738h0.f1502a;
        C19383o.m32797g(cVar, "windowInsets");
        dVar2.mo5465u(-1011341039);
        if (Build.VERSION.SDK_INT < 30) {
            C0749l lVar2 = C0749l.f1534b;
            dVar2.mo5406H();
            lVar = lVar2;
        } else {
            C0710b0.f1466a.getClass();
            C19383o.m32797g((LayoutDirection) dVar2.mo5410J(CompositionLocalsKt.f4025k), "layoutDirection");
            if (32 == C20203a.f44772b) {
                b0Var = C0710b0.C0711a.f1468b;
            } else {
                if (32 == C20203a.f44773c) {
                    b0Var = C0710b0.C0711a.f1469c;
                } else {
                    b0Var = C0710b0.C0711a.f1470d;
                }
            }
            View view = (View) dVar2.mo5410J(AndroidCompositionLocals_androidKt.f3991f);
            C7282b bVar = (C7282b) dVar2.mo5410J(CompositionLocalsKt.f4019e);
            Object[] objArr = {cVar, view, b0Var, bVar};
            dVar2.mo5465u(-568225417);
            boolean z = false;
            for (int i2 = 0; i2 < 4; i2++) {
                z |= dVar2.mo5408I(objArr[i2]);
            }
            Object v = dVar2.mo5467v();
            if (z || v == C1302d.C1303a.f2828a) {
                v = new WindowInsetsNestedScrollConnection(cVar, view, b0Var, bVar);
                dVar2.mo5454o(v);
            }
            dVar2.mo5406H();
            WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = (WindowInsetsNestedScrollConnection) v;
            C1415u.m3028b(windowInsetsNestedScrollConnection, new C0669x76e50d25(windowInsetsNestedScrollConnection), dVar2);
            dVar2.mo5406H();
            lVar = windowInsetsNestedScrollConnection;
        }
        C1436d a = NestedScrollModifierKt.m3433a(dVar, lVar, (NestedScrollDispatcher) null);
        dVar2.mo5406H();
        return a;
    }
}
