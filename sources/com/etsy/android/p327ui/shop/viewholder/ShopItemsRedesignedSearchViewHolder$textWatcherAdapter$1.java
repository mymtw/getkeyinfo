package com.etsy.android.p327ui.shop.viewholder;

import android.text.Editable;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.uikit.text.TextWatcherAdapter;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.viewholder.ShopItemsRedesignedSearchViewHolder$textWatcherAdapter$1 */
public final class ShopItemsRedesignedSearchViewHolder$textWatcherAdapter$1 extends TextWatcherAdapter {
    public final /* synthetic */ ShopItemsRedesignedSearchViewHolder this$0;

    public ShopItemsRedesignedSearchViewHolder$textWatcherAdapter$1(ShopItemsRedesignedSearchViewHolder shopItemsRedesignedSearchViewHolder) {
        this.this$0 = shopItemsRedesignedSearchViewHolder;
    }

    public void afterTextChanged(Editable editable) {
        String str;
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        C11192q0 q0Var = this.this$0.f24850e;
        if (q0Var != null) {
            q0Var.f24744d = str;
            boolean z = true;
            if (str.length() == 0) {
                String str2 = q0Var.f24745e;
                C19383o.m32796f(str2, "it.searchedQuery");
                if (str2.length() <= 0) {
                    z = false;
                }
                if (z) {
                    q0Var.f24745e = "";
                    q0Var.f24744d = "";
                    q0Var.f24748h = q0Var.f24749i.get(0);
                    C11192q0.C11193a aVar = q0Var.f24741a;
                    if (aVar != null) {
                        aVar.didClearSearch();
                    }
                }
            }
        }
    }
}
