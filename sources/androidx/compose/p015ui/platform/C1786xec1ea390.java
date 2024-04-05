package androidx.compose.p015ui.platform;

import androidx.savedstate.C3265b;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1 */
final class C1786xec1ea390 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C3265b $androidxRegistry;
    public final /* synthetic */ String $key;
    public final /* synthetic */ boolean $registered;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1786xec1ea390(boolean z, C3265b bVar, String str) {
        super(0);
        this.$registered = z;
        this.$androidxRegistry = bVar;
        this.$key = str;
    }

    public final void invoke() {
        if (this.$registered) {
            C3265b bVar = this.$androidxRegistry;
            String str = this.$key;
            bVar.getClass();
            C19383o.m32797g(str, "key");
            bVar.f7584a.mo19127e(str);
        }
    }
}
