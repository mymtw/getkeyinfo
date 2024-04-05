package com.etsy.android.p327ui.shop.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ShopSection;
import com.etsy.android.p327ui.shop.C11143e1;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.stylekit.adapters.CollageArrayAdapter;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.viewholder.SelectorAdapter */
public final class SelectorAdapter extends CollageArrayAdapter<ShopSection> implements AdapterView.OnItemClickListener {
    public static final int $stable = 8;
    private int selectedPosition = -1;
    private final C11143e1 translationDelegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectorAdapter(Context context, C11143e1 e1Var) {
        super(context, (int) R.layout.clg_select_item, (int) R.id.clg_select_dropdown_item_text);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(e1Var, "translationDelegate");
        this.translationDelegate = e1Var;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        if (view == null) {
            view = C0326j.m859c(viewGroup, R.layout.clg_select_item, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.clg_select_dropdown_item_text);
        ShopSection shopSection = (ShopSection) getItem(i);
        if (shopSection != null) {
            int listingActiveCount = shopSection.getListingActiveCount();
            Resources resources = viewGroup.getResources();
            C11143e1 e1Var = this.translationDelegate;
            String title = shopSection.getTitle();
            C19383o.m32796f(title, "shopSection.title");
            textView.setText(resources.getQuantityString(R.plurals.shop_home_section_selector_num_items, listingActiveCount, new Object[]{((C11192q0) e1Var).mo36861a(title, shopSection.getTitleTranslated()), String.valueOf(listingActiveCount)}));
        } else {
            textView.setText("");
        }
        View findViewById = view.findViewById(R.id.clg_select_dropdown_item_checkmark);
        if (i == this.selectedPosition) {
            findViewById.setVisibility(0);
            setA11yFocus(view);
        } else {
            findViewById.setVisibility(4);
            if (i == 0) {
                setA11yFocus(view);
            }
        }
        return view;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.selectedPosition = i;
    }

    public final void setSelectedItemPosition(int i) {
        this.selectedPosition = i;
    }
}
