package androidx.compose.p015ui.platform;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.C19499d;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2 */
final class GlobalSnapshotManager$ensureStarted$2 extends Lambda implements C19857l<Object, C19394m> {
    public final /* synthetic */ C19499d<C19394m> $channel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$2(C19499d<C19394m> dVar) {
        super(1);
        this.$channel = dVar;
    }

    public final void invoke(Object obj) {
        C19383o.m32797g(obj, "it");
        this.$channel.mo72199l(C19394m.f43287a);
    }
}
