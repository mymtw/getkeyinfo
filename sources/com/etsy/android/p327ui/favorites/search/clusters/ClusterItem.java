package com.etsy.android.p327ui.favorites.search.clusters;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.favorites.search.clusters.ClusterItem */
public final class ClusterItem {

    /* renamed from: a */
    public final String f21811a;

    /* renamed from: b */
    public final String f21812b;

    public ClusterItem(@C17402n(name = "query") String str, @C17402n(name = "image_url") String str2) {
        this.f21811a = str;
        this.f21812b = str2;
    }

    public final ClusterItem copy(@C17402n(name = "query") String str, @C17402n(name = "image_url") String str2) {
        return new ClusterItem(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClusterItem)) {
            return false;
        }
        ClusterItem clusterItem = (ClusterItem) obj;
        return C19383o.m32792b(this.f21811a, clusterItem.f21811a) && C19383o.m32792b(this.f21812b, clusterItem.f21812b);
    }

    public final int hashCode() {
        String str = this.f21811a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21812b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ClusterItem(query=");
        h.append(this.f21811a);
        h.append(", imageUrl=");
        return C0391c.m1057c(h, this.f21812b, ')');
    }
}
