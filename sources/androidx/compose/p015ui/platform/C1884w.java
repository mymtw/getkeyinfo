package androidx.compose.p015ui.platform;

import android.view.PointerIcon;
import android.view.View;
import androidx.compose.p015ui.input.pointer.C1629a;
import androidx.compose.p015ui.input.pointer.C1630b;
import androidx.compose.p015ui.input.pointer.C1641m;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.w */
public final class C1884w {

    /* renamed from: a */
    public static final C1884w f4164a = new C1884w();

    /* renamed from: a */
    public final void mo7287a(View view, C1641m mVar) {
        PointerIcon pointerIcon;
        C19383o.m32797g(view, "view");
        if (mVar instanceof C1629a) {
            ((C1629a) mVar).getClass();
            pointerIcon = null;
        } else {
            pointerIcon = mVar instanceof C1630b ? PointerIcon.getSystemIcon(view.getContext(), ((C1630b) mVar).f3624a) : PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        if (!C19383o.m32792b(view.getPointerIcon(), pointerIcon)) {
            view.setPointerIcon(pointerIcon);
        }
    }
}
