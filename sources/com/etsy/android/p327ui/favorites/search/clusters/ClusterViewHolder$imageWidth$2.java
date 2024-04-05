package com.etsy.android.p327ui.favorites.search.clusters;

import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.favorites.search.clusters.ClusterViewHolder$imageWidth$2 */
public final class ClusterViewHolder$imageWidth$2 extends Lambda implements C19846a<Integer> {
    public final /* synthetic */ ClusterViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClusterViewHolder$imageWidth$2(ClusterViewHolder clusterViewHolder) {
        super(0);
        this.this$0 = clusterViewHolder;
    }

    public final Integer invoke() {
        return Integer.valueOf(this.this$0.itemView.getResources().getDimensionPixelSize(R.dimen.cluster_image_size));
    }
}
