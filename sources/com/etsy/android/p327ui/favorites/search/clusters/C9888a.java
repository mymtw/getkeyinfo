package com.etsy.android.p327ui.favorites.search.clusters;

import android.view.ViewGroup;
import androidx.recyclerview.widget.C3167n;
import androidx.recyclerview.widget.C3200w;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.search.clusters.a */
public final class C9888a extends C3200w<ClusterItem, ClusterViewHolder> {

    /* renamed from: c */
    public final C19857l<ClusterItem, C19394m> f21818c;

    /* renamed from: com.etsy.android.ui.favorites.search.clusters.a$a */
    public static final class C9889a extends C3167n.C3172e<ClusterItem> {
        /* renamed from: a */
        public final boolean mo11900a(Object obj, Object obj2) {
            return C19383o.m32792b((ClusterItem) obj, (ClusterItem) obj2);
        }

        /* renamed from: b */
        public final boolean mo11901b(Object obj, Object obj2) {
            return C19383o.m32792b(((ClusterItem) obj).f21811a, ((ClusterItem) obj2).f21811a);
        }
    }

    public C9888a(C19857l<? super ClusterItem, C19394m> lVar) {
        super(new C9889a());
        this.f21818c = lVar;
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        ClusterViewHolder clusterViewHolder = (ClusterViewHolder) b0Var;
        C19383o.m32797g(clusterViewHolder, "holder");
        clusterViewHolder.mo19450a((ClusterItem) getItem(i));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        return new ClusterViewHolder(viewGroup, this.f21818c);
    }
}
