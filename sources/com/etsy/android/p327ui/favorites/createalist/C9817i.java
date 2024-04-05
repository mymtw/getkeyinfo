package com.etsy.android.p327ui.favorites.createalist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.p327ui.favorites.CreateACollectionClickHandler;

/* renamed from: com.etsy.android.ui.favorites.createalist.i */
public final class C9817i {

    /* renamed from: a */
    public View f21715a;

    /* renamed from: a */
    public final void mo32870a(LayoutInflater layoutInflater, ViewGroup viewGroup, SwipeRefreshLayout swipeRefreshLayout, CreateACollectionClickHandler createACollectionClickHandler) {
        View inflate = layoutInflater.inflate(R.layout.header_favorites_create_list, viewGroup, false);
        this.f21715a = inflate;
        Button button = inflate != null ? (Button) inflate.findViewById(R.id.favorites_create_a_list) : null;
        if (button != null) {
            ViewExtensions.m12866j(button, new CreateNewCollectionButton$addButtonAsHeader$1(createACollectionClickHandler));
        }
        View view = this.f21715a;
        if (view != null) {
            view.addOnLayoutChangeListener(new C9797xf28f024f(swipeRefreshLayout));
        }
        viewGroup.addView(this.f21715a);
    }
}
