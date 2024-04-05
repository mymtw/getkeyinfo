package retrofit2;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: retrofit2.KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1 */
final class C20077xc95e9eb1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C20089b $this_awaitResponse$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20077xc95e9eb1(C20089b bVar) {
        super(1);
        this.$this_awaitResponse$inlined = bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        this.$this_awaitResponse$inlined.cancel();
    }
}
