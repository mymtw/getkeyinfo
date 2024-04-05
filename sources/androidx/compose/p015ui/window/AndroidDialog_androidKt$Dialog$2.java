package androidx.compose.p015ui.window;

import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2 */
public final class AndroidDialog_androidKt$Dialog$2 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ DialogWrapper $dialog;
    public final /* synthetic */ LayoutDirection $layoutDirection;
    public final /* synthetic */ C19846a<C19394m> $onDismissRequest;
    public final /* synthetic */ C2089b $properties;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidDialog_androidKt$Dialog$2(DialogWrapper dialogWrapper, C19846a<C19394m> aVar, C2089b bVar, LayoutDirection layoutDirection) {
        super(0);
        this.$dialog = dialogWrapper;
        this.$onDismissRequest = aVar;
        this.$properties = bVar;
        this.$layoutDirection = layoutDirection;
    }

    public final void invoke() {
        this.$dialog.mo7941b(this.$onDismissRequest, this.$properties, this.$layoutDirection);
    }
}
