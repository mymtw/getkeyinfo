package androidx.compose.p015ui.platform;

import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$ObjectRef;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy */
public interface ViewCompositionStrategy {

    /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed */
    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {

        /* renamed from: a */
        public static final DisposeOnViewTreeLifecycleDestroyed f4049a = new DisposeOnViewTreeLifecycleDestroyed();

        /* renamed from: a */
        public final C19846a<C19394m> mo7143a(AbstractComposeView abstractComposeView) {
            C19383o.m32797g(abstractComposeView, "view");
            if (abstractComposeView.isAttachedToWindow()) {
                C2887s f0 = C15588c1.m25325f0(abstractComposeView);
                if (f0 != null) {
                    Lifecycle lifecycle = f0.getLifecycle();
                    C19383o.m32796f(lifecycle, "lco.lifecycle");
                    return C1840i1.m4041a(abstractComposeView, lifecycle);
                }
                throw new IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
            }
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            C1795xe2c59457 viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1 = new C1795xe2c59457(abstractComposeView, ref$ObjectRef);
            abstractComposeView.addOnAttachStateChangeListener(viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1);
            ref$ObjectRef.element = new C1793x565475b(abstractComposeView, viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1);
            return new C1794x565475c(ref$ObjectRef);
        }
    }

    /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$a */
    public static final class C1789a implements ViewCompositionStrategy {

        /* renamed from: a */
        public final Lifecycle f4050a;

        public C1789a(C2887s sVar) {
            Lifecycle lifecycle = sVar.getLifecycle();
            C19383o.m32796f(lifecycle, "lifecycleOwner.lifecycle");
            this.f4050a = lifecycle;
        }

        /* renamed from: a */
        public final C19846a<C19394m> mo7143a(AbstractComposeView abstractComposeView) {
            C19383o.m32797g(abstractComposeView, "view");
            return C1840i1.m4041a(abstractComposeView, this.f4050a);
        }
    }

    /* renamed from: a */
    C19846a<C19394m> mo7143a(AbstractComposeView abstractComposeView);
}
