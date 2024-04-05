package com.paypal.pyplcheckout.shippingmethods.view.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.cardview.viewholders.C9186j;
import com.google.android.material.card.MaterialCardView;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.pojo.Amount;
import com.paypal.pyplcheckout.pojo.ShippingMethodType;
import com.paypal.pyplcheckout.pojo.ShippingMethods;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;
import p570fp.C17784a;

public final class ShippingMethodsAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static int sLastSelectedShippingMethodIndex = -1;
    private final Context context;
    private ShippingMethods selectedShippingMethod;
    private final ShippingMethodsAdapterClickListener shippingMethodsAdapterClickListener;
    /* access modifiers changed from: private */
    public final List<ShippingMethods> shippingMethodsList;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class ItemViewHolder extends RecyclerView.C3084b0 {
        private final TextView shippingMethodPriceTv;
        private final ImageView shippingMethodSelectedCb;
        private final MaterialCardView shippingMethodSelectorCardView;
        private final TextView shippingMethodTv;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(View view, ShippingMethodsAdapterClickListener shippingMethodsAdapterClickListener, ShippingMethodsAdapter shippingMethodsAdapter) {
            super(view);
            C19383o.m32797g(view, "view");
            C19383o.m32797g(shippingMethodsAdapter, "adapter");
            View findViewById = view.findViewById(C17165R.C17167id.shipping_method_tv);
            C19383o.m32796f(findViewById, "view.findViewById(R.id.shipping_method_tv)");
            this.shippingMethodTv = (TextView) findViewById;
            View findViewById2 = view.findViewById(C17165R.C17167id.shipping_price_tv);
            C19383o.m32796f(findViewById2, "view.findViewById(R.id.shipping_price_tv)");
            this.shippingMethodPriceTv = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C17165R.C17167id.shipping_method_selected_cb);
            C19383o.m32796f(findViewById3, "view.findViewById(R.id.s…pping_method_selected_cb)");
            this.shippingMethodSelectedCb = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(C17165R.C17167id.shipping_method__selector_card_view);
            C19383o.m32796f(findViewById4, "view.findViewById(R.id.s…thod__selector_card_view)");
            this.shippingMethodSelectorCardView = (MaterialCardView) findViewById4;
            view.setOnClickListener(new C9186j(shippingMethodsAdapterClickListener, 1, shippingMethodsAdapter, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m35439_init_$lambda0(ShippingMethodsAdapterClickListener shippingMethodsAdapterClickListener, ShippingMethodsAdapter shippingMethodsAdapter, ItemViewHolder itemViewHolder, View view) {
            C19383o.m32797g(shippingMethodsAdapter, "$adapter");
            C19383o.m32797g(itemViewHolder, "this$0");
            if (shippingMethodsAdapterClickListener != null) {
                if (ShippingMethodsAdapter.sLastSelectedShippingMethodIndex != -1) {
                    shippingMethodsAdapter.notifyItemChanged(ShippingMethodsAdapter.sLastSelectedShippingMethodIndex);
                    ShippingMethodsAdapter.sLastSelectedShippingMethodIndex = itemViewHolder.getAdapterPosition();
                    shippingMethodsAdapter.notifyItemChanged(ShippingMethodsAdapter.sLastSelectedShippingMethodIndex);
                }
                shippingMethodsAdapterClickListener.onShippingMethodSelected(itemViewHolder.getAdapterPosition(), new ShippingMethodType(((ShippingMethods) shippingMethodsAdapter.shippingMethodsList.get(itemViewHolder.getAdapterPosition())).getType()));
            }
        }

        public final TextView getShippingMethodPriceTv() {
            return this.shippingMethodPriceTv;
        }

        public final ImageView getShippingMethodSelectedCb() {
            return this.shippingMethodSelectedCb;
        }

        public final MaterialCardView getShippingMethodSelectorCardView() {
            return this.shippingMethodSelectorCardView;
        }

        public final TextView getShippingMethodTv() {
            return this.shippingMethodTv;
        }
    }

    public interface ShippingMethodsAdapterClickListener {
        void onShippingMethodSelected(int i, ShippingMethodType shippingMethodType);
    }

    public ShippingMethodsAdapter(Context context2, List<ShippingMethods> list, ShippingMethodsAdapterClickListener shippingMethodsAdapterClickListener2, ShippingMethods shippingMethods) {
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        C19383o.m32797g(list, "shippingMethodsList");
        this.context = context2;
        this.shippingMethodsList = list;
        this.shippingMethodsAdapterClickListener = shippingMethodsAdapterClickListener2;
        this.selectedShippingMethod = shippingMethods;
    }

    private final void changeFieldsColor(ItemViewHolder itemViewHolder, int i) {
        TextView shippingMethodTv = itemViewHolder.getShippingMethodTv();
        Context context2 = this.context;
        Object obj = C8184a.f17966a;
        shippingMethodTv.setTextColor(C8184a.C8188d.m16468a(context2, i));
        itemViewHolder.getShippingMethodPriceTv().setTextColor(C8184a.C8188d.m16468a(this.context, i));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003d, code lost:
        r11 = r11.getCurrencyFormat();
     */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m35438onBindViewHolder$lambda0(com.paypal.pyplcheckout.shippingmethods.view.adapters.ShippingMethodsAdapter r11, com.paypal.pyplcheckout.shippingmethods.view.adapters.ShippingMethodsAdapter.ItemViewHolder r12, com.paypal.pyplcheckout.pojo.ShippingMethods r13, android.view.View r14, android.view.MotionEvent r15) {
        /*
            java.lang.String r14 = "this$0"
            kotlin.jvm.internal.C19383o.m32797g(r11, r14)
            java.lang.String r14 = "$holder"
            kotlin.jvm.internal.C19383o.m32797g(r12, r14)
            java.lang.String r14 = "$shippingMethod"
            kotlin.jvm.internal.C19383o.m32797g(r13, r14)
            int r14 = r15.getAction()
            if (r14 != 0) goto L_0x0052
            int r14 = com.paypal.pyplcheckout.C17165R.color.add_card_blue
            r11.changeFieldsColor(r12, r14)
            com.google.android.material.card.MaterialCardView r12 = r12.getShippingMethodSelectorCardView()
            android.content.Context r11 = r11.context
            int r14 = com.paypal.pyplcheckout.C17165R.color.blue_200
            java.lang.Object r15 = p260v0.C8184a.f17966a
            int r11 = p260v0.C8184a.C8188d.m16468a(r11, r14)
            r12.setCardBackgroundColor((int) r11)
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r0 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.SHIPPING_OPTION_SELECTED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r1 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.SELECTED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r2 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E101
            com.paypal.pyplcheckout.common.instrumentation.PEnums$StateName r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.StateName.PICK_IT_UP
            com.paypal.pyplcheckout.pojo.Amount r11 = r13.getAmount()
            java.lang.String r12 = ""
            if (r11 != 0) goto L_0x003d
        L_0x003b:
            r4 = r12
            goto L_0x0045
        L_0x003d:
            java.lang.String r11 = r11.getCurrencyFormat()
            if (r11 != 0) goto L_0x0044
            goto L_0x003b
        L_0x0044:
            r4 = r11
        L_0x0045:
            r7 = 0
            r8 = 0
            r9 = 384(0x180, float:5.38E-43)
            r10 = 0
            java.lang.String r5 = "shipping_method_view"
            java.lang.String r6 = "shipping_method_view"
            com.paypal.pyplcheckout.common.instrumentation.PLog.click$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0069
        L_0x0052:
            int r13 = com.paypal.pyplcheckout.C17165R.color.gray_color_700
            r11.changeFieldsColor(r12, r13)
            com.google.android.material.card.MaterialCardView r12 = r12.getShippingMethodSelectorCardView()
            android.content.Context r11 = r11.context
            r13 = 17170445(0x106000d, float:2.461195E-38)
            java.lang.Object r14 = p260v0.C8184a.f17966a
            int r11 = p260v0.C8184a.C8188d.m16468a(r11, r13)
            r12.setCardBackgroundColor((int) r11)
        L_0x0069:
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.shippingmethods.view.adapters.ShippingMethodsAdapter.m35438onBindViewHolder$lambda0(com.paypal.pyplcheckout.shippingmethods.view.adapters.ShippingMethodsAdapter, com.paypal.pyplcheckout.shippingmethods.view.adapters.ShippingMethodsAdapter$ItemViewHolder, com.paypal.pyplcheckout.pojo.ShippingMethods, android.view.View, android.view.MotionEvent):boolean");
    }

    public int getItemCount() {
        return this.shippingMethodsList.size();
    }

    public final void updateSelectedShippingMethod(ShippingMethods shippingMethods) {
        C19383o.m32797g(shippingMethods, "selectedShippingMethod");
        this.selectedShippingMethod = shippingMethods;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void onBindViewHolder(ItemViewHolder itemViewHolder, @SuppressLint({"RecyclerView"}) int i) {
        C19383o.m32797g(itemViewHolder, "holder");
        ShippingMethods shippingMethods = this.shippingMethodsList.get(i);
        ShippingMethods shippingMethods2 = this.selectedShippingMethod;
        String str = null;
        boolean z = true;
        if (!C19383o.m32792b(shippingMethods2 == null ? null : shippingMethods2.getId(), shippingMethods.getId()) || this.shippingMethodsList.size() <= 1) {
            z = false;
        }
        if (z) {
            sLastSelectedShippingMethodIndex = i;
        }
        itemViewHolder.getShippingMethodSelectedCb().setVisibility(z ? 0 : 4);
        if (z) {
            MaterialCardView shippingMethodSelectorCardView = itemViewHolder.getShippingMethodSelectorCardView();
            Context context2 = this.context;
            int i2 = C17165R.color.cardview_border_blue;
            Object obj = C8184a.f17966a;
            shippingMethodSelectorCardView.setStrokeColor(C8184a.C8188d.m16468a(context2, i2));
            itemViewHolder.getShippingMethodSelectorCardView().setCardBackgroundColor(C8184a.C8188d.m16468a(this.context, C17165R.color.blue_100));
        } else {
            changeFieldsColor(itemViewHolder, C17165R.color.gray_color_700);
            MaterialCardView shippingMethodSelectorCardView2 = itemViewHolder.getShippingMethodSelectorCardView();
            Context context3 = this.context;
            Object obj2 = C8184a.f17966a;
            shippingMethodSelectorCardView2.setStrokeColor(C8184a.C8188d.m16468a(context3, 17170445));
            itemViewHolder.getShippingMethodSelectorCardView().setCardBackgroundColor(C8184a.C8188d.m16468a(this.context, 17170445));
        }
        itemViewHolder.getShippingMethodSelectorCardView().setOnTouchListener(new C17784a(this, itemViewHolder, shippingMethods));
        if (TextUtils.isEmpty(shippingMethods.getLabel())) {
            itemViewHolder.getShippingMethodTv().setVisibility(8);
            return;
        }
        itemViewHolder.getShippingMethodTv().setText(shippingMethods.getLabel());
        TextView shippingMethodPriceTv = itemViewHolder.getShippingMethodPriceTv();
        Amount amount = shippingMethods.getAmount();
        if (amount != null) {
            str = amount.getCurrencyFormat();
        }
        shippingMethodPriceTv.setText(str);
        itemViewHolder.getShippingMethodTv().setVisibility(0);
    }

    public ItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C17165R.C17169layout.paypal_shipping_methods_list_item_view, viewGroup, false);
        C19383o.m32796f(inflate, "from(parent.context).inf…rent, false\n            )");
        return new ItemViewHolder(inflate, this.shippingMethodsAdapterClickListener, this);
    }
}
