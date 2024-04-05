package com.etsy.android.p327ui.favorites.search.clusters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.cart.viewholders.C9403q;
import com.etsy.android.stylekit.accessibility.views.AccessibilityClassNames;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.search.clusters.ClusterViewHolder */
public final class ClusterViewHolder extends C12086e<ClusterItem> {

    /* renamed from: g */
    public static final /* synthetic */ int f21813g = 0;

    /* renamed from: c */
    public final C19857l<ClusterItem, C19394m> f21814c;

    /* renamed from: d */
    public final C19285c f21815d = C19350d.m32677b(new ClusterViewHolder$image$2(this));

    /* renamed from: e */
    public final C19285c f21816e = C19350d.m32677b(new ClusterViewHolder$name$2(this));

    /* renamed from: f */
    public final C19285c f21817f = C19350d.m32677b(new ClusterViewHolder$imageWidth$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClusterViewHolder(ViewGroup viewGroup, C19857l<? super ClusterItem, C19394m> lVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_cluster, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(lVar, "onClusterSelectedListener");
        this.f21814c = lVar;
    }

    /* renamed from: g */
    public final void mo19450a(ClusterItem clusterItem) {
        if (clusterItem != null) {
            Object value = this.f21816e.getValue();
            C19383o.m32796f(value, "<get-name>(...)");
            ((TextView) value).setText(clusterItem.f21811a);
            Object value2 = this.f21815d.getValue();
            C19383o.m32796f(value2, "<get-image>(...)");
            String str = clusterItem.f21812b;
            C0761x.m1708a0(((Number) this.f21817f.getValue()).intValue(), (ImageView) value2, str);
            View view = this.itemView;
            view.setOnClickListener(new C9403q(1, this, clusterItem));
            ViewsExtensionsKt.m17423b(view, AccessibilityClassNames.BUTTON);
        }
    }
}
