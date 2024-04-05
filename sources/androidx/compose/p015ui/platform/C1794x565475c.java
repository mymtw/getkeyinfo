package androidx.compose.p015ui.platform;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2 */
public final class C1794x565475c extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ Ref$ObjectRef<C19846a<C19394m>> $disposer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1794x565475c(Ref$ObjectRef<C19846a<C19394m>> ref$ObjectRef) {
        super(0);
        this.$disposer = ref$ObjectRef;
    }

    public final void invoke() {
        ((C19846a) this.$disposer.element).invoke();
    }
}
