package androidx.compose.p015ui.window;

import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4 */
public final class AndroidPopup_androidKt$Popup$4 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ PopupLayout $popupLayout;
    public final /* synthetic */ C2092e $popupPositionProvider;

    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$a */
    public static final class C2080a implements C1358r {
        public final void dispose() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$4(PopupLayout popupLayout, C2092e eVar) {
        super(1);
        this.$popupLayout = popupLayout;
        this.$popupPositionProvider = eVar;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        this.$popupLayout.setPositionProvider(this.$popupPositionProvider);
        this.$popupLayout.updatePosition();
        return new C2080a();
    }
}
