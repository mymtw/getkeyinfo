package com.etsy.android.p327ui.favorites.search.clusters;

import android.widget.ImageView;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.favorites.search.clusters.ClusterViewHolder$image$2 */
public final class ClusterViewHolder$image$2 extends Lambda implements C19846a<ImageView> {
    public final /* synthetic */ ClusterViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClusterViewHolder$image$2(ClusterViewHolder clusterViewHolder) {
        super(0);
        this.this$0 = clusterViewHolder;
    }

    public final ImageView invoke() {
        return (ImageView) this.this$0.itemView.findViewById(R.id.list_item_cluster_image);
    }
}
