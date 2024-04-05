package androidx.compose.p015ui.viewinterop;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1 */
public final class AndroidViewHolder$runUpdate$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ AndroidViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$runUpdate$1(AndroidViewHolder androidViewHolder) {
        super(0);
        this.this$0 = androidViewHolder;
    }

    public final void invoke() {
        if (this.this$0.hasUpdateBlock) {
            SnapshotStateObserver access$getSnapshotObserver$p = this.this$0.snapshotObserver;
            AndroidViewHolder androidViewHolder = this.this$0;
            access$getSnapshotObserver$p.mo5985b(androidViewHolder, androidViewHolder.onCommitAffectingUpdate, this.this$0.getUpdate());
        }
    }
}
