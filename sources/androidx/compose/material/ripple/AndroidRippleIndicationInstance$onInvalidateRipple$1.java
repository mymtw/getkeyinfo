package androidx.compose.material.ripple;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class AndroidRippleIndicationInstance$onInvalidateRipple$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C1235a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidRippleIndicationInstance$onInvalidateRipple$1(C1235a aVar) {
        super(0);
        this.this$0 = aVar;
    }

    public final void invoke() {
        C1235a aVar = this.this$0;
        aVar.f2583i.setValue(Boolean.valueOf(!((Boolean) aVar.f2583i.getValue()).booleanValue()));
    }
}
