package androidx.compose.p015ui.input.pointer;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.viewinterop.AndroidViewHolder;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.input.pointer.x */
public final class C1653x {
    /* renamed from: a */
    public static final C1436d m3528a(AndroidViewHolder androidViewHolder) {
        C19383o.m32797g(androidViewHolder, "view");
        PointerInteropFilter pointerInteropFilter = new PointerInteropFilter();
        pointerInteropFilter.f3601b = new PointerInteropFilter_androidKt$pointerInteropFilter$3(androidViewHolder);
        C1655z zVar = new C1655z();
        C1655z zVar2 = pointerInteropFilter.f3602c;
        if (zVar2 != null) {
            zVar2.f3689b = null;
        }
        pointerInteropFilter.f3602c = zVar;
        zVar.f3689b = pointerInteropFilter;
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui_release(zVar);
        return pointerInteropFilter;
    }
}
