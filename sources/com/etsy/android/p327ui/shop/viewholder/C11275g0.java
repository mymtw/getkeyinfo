package com.etsy.android.p327ui.shop.viewholder;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.viewholder.g0 */
public final /* synthetic */ class C11275g0 implements View.OnKeyListener {

    /* renamed from: b */
    public final /* synthetic */ ShopItemsRedesignedSearchViewHolder f24892b;

    public /* synthetic */ C11275g0(ShopItemsRedesignedSearchViewHolder shopItemsRedesignedSearchViewHolder) {
        this.f24892b = shopItemsRedesignedSearchViewHolder;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        ShopItemsRedesignedSearchViewHolder shopItemsRedesignedSearchViewHolder = this.f24892b;
        C19383o.m32797g(shopItemsRedesignedSearchViewHolder, "this$0");
        Editable text = shopItemsRedesignedSearchViewHolder.f24849d.getText();
        if ((text == null || text.length() == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
            return false;
        }
        view.cancelLongPress();
        shopItemsRedesignedSearchViewHolder.mo36963g();
        return true;
    }
}
