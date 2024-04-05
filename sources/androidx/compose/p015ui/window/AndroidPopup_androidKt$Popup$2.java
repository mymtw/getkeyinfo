package androidx.compose.p015ui.window;

import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2 */
public final class AndroidPopup_androidKt$Popup$2 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ LayoutDirection $layoutDirection;
    public final /* synthetic */ C19846a<C19394m> $onDismissRequest;
    public final /* synthetic */ PopupLayout $popupLayout;
    public final /* synthetic */ C2093f $properties;
    public final /* synthetic */ String $testTag;

    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$a */
    public static final class C2079a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ PopupLayout f4706a;

        public C2079a(PopupLayout popupLayout) {
            this.f4706a = popupLayout;
        }

        public final void dispose() {
            this.f4706a.disposeComposition();
            this.f4706a.dismiss();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$2(PopupLayout popupLayout, C19846a<C19394m> aVar, C2093f fVar, String str, LayoutDirection layoutDirection) {
        super(1);
        this.$popupLayout = popupLayout;
        this.$onDismissRequest = aVar;
        this.$properties = fVar;
        this.$testTag = str;
        this.$layoutDirection = layoutDirection;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        this.$popupLayout.show();
        this.$popupLayout.updateParameters(this.$onDismissRequest, this.$properties, this.$testTag, this.$layoutDirection);
        return new C2079a(this.$popupLayout);
    }
}
