package androidx.fragment.app.testing;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.C2870k0;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.fragment.app.testing.FragmentScenario$FragmentFactoryHolderViewModel$Companion$getInstance$$inlined$viewModels$1 */
public final class C2788xcdcaaea6 extends Lambda implements C19846a<C2870k0.C2872b> {
    public final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2788xcdcaaea6(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    public final C2870k0.C2872b invoke() {
        return this.$this_viewModels.getDefaultViewModelProviderFactory();
    }
}
