package androidx.compose.p015ui.tooling;

import androidx.compose.runtime.C1302d;
import java.util.Arrays;
import kotlin.C19394m;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.Lambda;
import p165l0.C7211a;
import p628nj.C18263b;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.tooling.ComposeViewAdapter$init$3$1$composable$1 */
public final class ComposeViewAdapter$init$3$1$composable$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ String $className;
    public final /* synthetic */ C1302d $composer;
    public final /* synthetic */ String $methodName;
    public final /* synthetic */ Class<? extends C7211a<?>> $parameterProvider;
    public final /* synthetic */ int $parameterProviderIndex;
    public final /* synthetic */ ComposeViewAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposeViewAdapter$init$3$1$composable$1(String str, String str2, C1302d dVar, Class<? extends C7211a<?>> cls, int i, ComposeViewAdapter composeViewAdapter) {
        super(0);
        this.$className = str;
        this.$methodName = str2;
        this.$composer = dVar;
        this.$parameterProvider = cls;
        this.$parameterProviderIndex = i;
        this.this$0 = composeViewAdapter;
    }

    public final void invoke() {
        Throwable cause;
        try {
            String str = this.$className;
            String str2 = this.$methodName;
            C1302d dVar = this.$composer;
            Object[] V = C18263b.m30827V(this.$parameterProviderIndex, this.$parameterProvider);
            C19382n.m32759m0(str, str2, dVar, Arrays.copyOf(V, V.length));
        } catch (Throwable th) {
            Throwable th2 = th;
            while ((th2 instanceof ReflectiveOperationException) && (cause = th2.getCause()) != null) {
                th2 = cause;
            }
            C2057d access$getDelayedException$p = this.this$0.delayedException;
            access$getDelayedException$p.getClass();
            synchronized (access$getDelayedException$p.f4650b) {
                access$getDelayedException$p.f4649a = th2;
                C19394m mVar = C19394m.f43287a;
                throw th;
            }
        }
    }
}
