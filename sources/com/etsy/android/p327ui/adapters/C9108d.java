package com.etsy.android.p327ui.adapters;

import androidx.recyclerview.widget.GridLayoutManager;

/* renamed from: com.etsy.android.ui.adapters.d */
public final class C9108d extends GridLayoutManager.C3075b {

    /* renamed from: d */
    public final /* synthetic */ UserProfileAdapter f20027d;

    public C9108d(UserProfileAdapter userProfileAdapter) {
        this.f20027d = userProfileAdapter;
    }

    /* renamed from: d */
    public final int mo11265d(int i) {
        int listItemViewType = this.f20027d.getListItemViewType(i);
        if (listItemViewType == 501) {
            return this.f20027d.f20006g.f20020e;
        }
        if (listItemViewType == 504) {
            return 1;
        }
        if (listItemViewType != 507) {
            if (listItemViewType == 510) {
                return this.f20027d.f20006g.f20019d;
            }
            if (listItemViewType != 511) {
                return this.f20027d.f20006g.f20016a;
            }
        }
        return this.f20027d.f20006g.f20018c;
    }
}
