package androidx.compose.material.internal;

import androidx.compose.p015ui.window.C2092e;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ PopupLayout $popupLayout;
    public final /* synthetic */ C2092e $popupPositionProvider;

    /* renamed from: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3$a */
    public static final class C1195a implements C1358r {
        public final void dispose() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3(PopupLayout popupLayout, C2092e eVar) {
        super(1);
        this.$popupLayout = popupLayout;
        this.$popupPositionProvider = eVar;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        PopupLayout popupLayout = this.$popupLayout;
        C2092e eVar = this.$popupPositionProvider;
        popupLayout.getClass();
        C19383o.m32797g(eVar, "<set-?>");
        popupLayout.f2492f = eVar;
        this.$popupLayout.updatePosition();
        return new C1195a();
    }
}
