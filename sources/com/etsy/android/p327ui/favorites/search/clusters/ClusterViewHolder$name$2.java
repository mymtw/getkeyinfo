package com.etsy.android.p327ui.favorites.search.clusters;

import android.widget.TextView;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.favorites.search.clusters.ClusterViewHolder$name$2 */
public final class ClusterViewHolder$name$2 extends Lambda implements C19846a<TextView> {
    public final /* synthetic */ ClusterViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClusterViewHolder$name$2(ClusterViewHolder clusterViewHolder) {
        super(0);
        this.this$0 = clusterViewHolder;
    }

    public final TextView invoke() {
        return (TextView) this.this$0.itemView.findViewById(R.id.list_item_cluster_name);
    }
}
