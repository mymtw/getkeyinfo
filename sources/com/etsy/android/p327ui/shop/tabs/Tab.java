package com.etsy.android.p327ui.shop.tabs;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.R;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.tabs.Tab */
public final class Tab {

    /* renamed from: a */
    public final Type f24780a;

    /* renamed from: b */
    public final boolean f24781b;

    /* renamed from: com.etsy.android.ui.shop.tabs.Tab$Type */
    public enum Type {
        ITEMS(R.string.items_label, R.drawable.clg_icon_core_items_fill_v1),
        REVIEWS(R.string.reviews, R.drawable.clg_icon_core_package_v1),
        ABOUT(R.string.about, R.drawable.clg_icon_core_activity_v1);
        
        private final int iconResId;
        private final int labelResId;

        private Type(int i, int i2) {
            this.labelResId = i;
            this.iconResId = i2;
        }

        public final int getIconResId() {
            return this.iconResId;
        }

        public final int getLabelResId() {
            return this.labelResId;
        }
    }

    public Tab(Type type, boolean z) {
        C19383o.m32797g(type, "tabType");
        this.f24780a = type;
        this.f24781b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tab)) {
            return false;
        }
        Tab tab = (Tab) obj;
        return this.f24780a == tab.f24780a && this.f24781b == tab.f24781b;
    }

    public final int hashCode() {
        int hashCode = this.f24780a.hashCode() * 31;
        boolean z = this.f24781b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Tab(tabType=");
        h.append(this.f24780a);
        h.append(", selected=");
        return C0391c.m1058d(h, this.f24781b, ')');
    }
}
