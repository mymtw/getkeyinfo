package com.paypal.pyplcheckout.home.view.adapters;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.animation.C0388a;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.pojo.Amount;
import com.paypal.pyplcheckout.pojo.Item;
import java.util.List;
import kotlin.jvm.internal.C19383o;

public final class CartItemsAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    private final List<Item> itemsList;

    public static final class ItemViewHolder extends RecyclerView.C3084b0 {
        private final TextView itemDescriptionTv;
        private final TextView itemNameTv;
        private final TextView itemPriceTv;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(View view) {
            super(view);
            C19383o.m32797g(view, "view");
            View findViewById = view.findViewById(C17165R.C17167id.item_name_tv);
            C19383o.m32796f(findViewById, "view.findViewById(R.id.item_name_tv)");
            this.itemNameTv = (TextView) findViewById;
            View findViewById2 = view.findViewById(C17165R.C17167id.item_price_tv);
            C19383o.m32796f(findViewById2, "view.findViewById(R.id.item_price_tv)");
            this.itemPriceTv = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C17165R.C17167id.item_description_tv);
            C19383o.m32796f(findViewById3, "view.findViewById(R.id.item_description_tv)");
            this.itemDescriptionTv = (TextView) findViewById3;
        }

        public final TextView getItemDescriptionTv() {
            return this.itemDescriptionTv;
        }

        public final TextView getItemNameTv() {
            return this.itemNameTv;
        }

        public final TextView getItemPriceTv() {
            return this.itemPriceTv;
        }
    }

    public CartItemsAdapter(List<Item> list) {
        C19383o.m32797g(list, "itemsList");
        this.itemsList = list;
    }

    public int getItemCount() {
        return this.itemsList.size();
    }

    public void onBindViewHolder(ItemViewHolder itemViewHolder, int i) {
        String str;
        C19383o.m32797g(itemViewHolder, "holder");
        Item item = this.itemsList.get(i);
        itemViewHolder.getItemNameTv().setText(item.getName());
        TextView itemPriceTv = itemViewHolder.getItemPriceTv();
        Amount total = item.getTotal();
        if (total == null) {
            str = null;
        } else {
            str = C0388a.m1049e(new Object[]{item.getQuantity(), total.getCurrencyFormatSymbolISOCurrency()}, 2, "%d x %s", "format(format, *args)");
        }
        itemPriceTv.setText(str);
        String description = item.getDescription();
        if (TextUtils.isEmpty(description)) {
            itemViewHolder.getItemDescriptionTv().setVisibility(8);
            return;
        }
        itemViewHolder.getItemDescriptionTv().setText(description);
        itemViewHolder.getItemDescriptionTv().setVisibility(0);
    }

    public ItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C17165R.C17169layout.paypal_cart_list_item_view, viewGroup, false);
        C19383o.m32796f(inflate, "from(parent.context).inf…rent, false\n            )");
        return new ItemViewHolder(inflate);
    }
}
