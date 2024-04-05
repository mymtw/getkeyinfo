package com.paypal.pyplcheckout.addressbook.view.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addshipping.ShippingUtils;
import com.paypal.pyplcheckout.addshipping.model.Country;
import com.paypal.pyplcheckout.addshipping.model.Suggestions;
import com.paypal.pyplcheckout.common.cache.Cache;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import p511ap.C14040b;

public final class ShippingAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    private final ShippingAdapterClickListener addressClickListener;
    private List<Suggestions> addressList;
    private final Context context;
    private final CountryAdapterClickListener countryClickListener;
    private List<Country> countryList;
    private String query;

    public interface CountryAdapterClickListener {
        void onCountrySelected(String str, int i);
    }

    public static final class ItemViewHolder extends RecyclerView.C3084b0 {
        private TextView addressLine1;
        private TextView addressLine2;
        private ImageView check;
        private final ShippingItemViewType type;
        private TextView value;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(View view, ShippingAdapterClickListener shippingAdapterClickListener, CountryAdapterClickListener countryAdapterClickListener, ShippingAdapter shippingAdapter, ShippingItemViewType shippingItemViewType) {
            super(view);
            C19383o.m32797g(view, "view");
            C19383o.m32797g(shippingItemViewType, "type");
            this.type = shippingItemViewType;
            if (shippingItemViewType == ShippingItemViewType.TYPE_ADDRESS) {
                this.addressLine1 = (TextView) view.findViewById(C17165R.C17167id.addressLine1);
                this.addressLine2 = (TextView) view.findViewById(C17165R.C17167id.addressLine2);
            }
            if (shippingItemViewType == ShippingItemViewType.TYPE_COUNTRY) {
                this.value = (TextView) view.findViewById(C17165R.C17167id.valueTv);
                this.check = (ImageView) view.findViewById(C17165R.C17167id.countryCheck);
            }
            view.setOnClickListener(new C14040b(shippingAdapterClickListener, shippingAdapter, this, countryAdapterClickListener));
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-2  reason: not valid java name */
        public static final void m35158_init_$lambda2(ShippingAdapterClickListener shippingAdapterClickListener, ShippingAdapter shippingAdapter, ItemViewHolder itemViewHolder, CountryAdapterClickListener countryAdapterClickListener, View view) {
            List<Country> countryList;
            Country country;
            String code;
            List<Suggestions> addressList;
            Suggestions suggestions;
            C19383o.m32797g(itemViewHolder, "this$0");
            if (shippingAdapterClickListener != null) {
                if (shippingAdapter != null && (addressList = shippingAdapter.getAddressList()) != null && (suggestions = addressList.get(itemViewHolder.getAdapterPosition())) != null) {
                    String placeId = suggestions.getPlaceId();
                    if (placeId == null) {
                        placeId = "";
                    }
                    shippingAdapterClickListener.onAddressSelected(placeId, itemViewHolder.getAdapterPosition());
                }
            } else if (shippingAdapter != null && (countryList = shippingAdapter.getCountryList()) != null && (country = countryList.get(itemViewHolder.getAdapterPosition())) != null && (code = country.getCode()) != null) {
                PLog.click$default(PEnums.TransitionName.SELECTED_COUNTRY_CLICKED, PEnums.Outcome.CLICKED, PEnums.EventCode.E624, PEnums.StateName.ADD_SHIPPING, C0326j.m864i("country: ", code), (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 480, (Object) null);
                if (countryAdapterClickListener != null) {
                    countryAdapterClickListener.onCountrySelected(code, itemViewHolder.getAdapterPosition());
                }
            }
        }

        public final TextView getAddressLine1() {
            return this.addressLine1;
        }

        public final TextView getAddressLine2() {
            return this.addressLine2;
        }

        public final ImageView getCheck() {
            return this.check;
        }

        public final ShippingItemViewType getType() {
            return this.type;
        }

        public final TextView getValue() {
            return this.value;
        }

        public final void setAddressLine1(TextView textView) {
            this.addressLine1 = textView;
        }

        public final void setAddressLine2(TextView textView) {
            this.addressLine2 = textView;
        }

        public final void setCheck(ImageView imageView) {
            this.check = imageView;
        }

        public final void setValue(TextView textView) {
            this.value = textView;
        }
    }

    public interface ShippingAdapterClickListener {
        void onAddressSelected(String str, int i);
    }

    public enum ShippingItemViewType {
        TYPE_ADDRESS(1),
        TYPE_COUNTRY(2),
        TYPE_ADD_MANUALLY(3);
        
        private final int value;

        private ShippingItemViewType(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShippingAdapter(Context context2, List list, List list2, ShippingAdapterClickListener shippingAdapterClickListener, CountryAdapterClickListener countryAdapterClickListener, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context2, list, list2, shippingAdapterClickListener, countryAdapterClickListener, (i & 32) != 0 ? null : str);
    }

    public final List<Suggestions> getAddressList() {
        return this.addressList;
    }

    public final Context getContext() {
        return this.context;
    }

    public final List<Country> getCountryList() {
        return this.countryList;
    }

    public int getItemCount() {
        return this.addressList.isEmpty() ^ true ? this.addressList.size() : this.countryList.size();
    }

    public int getItemViewType(int i) {
        return this.countryList.isEmpty() ^ true ? ShippingItemViewType.TYPE_COUNTRY.getValue() : (!(this.addressList.isEmpty() ^ true) || i != this.addressList.size() + -1) ? ShippingItemViewType.TYPE_ADDRESS.getValue() : ShippingItemViewType.TYPE_ADD_MANUALLY.getValue();
    }

    public final String getQuery() {
        return this.query;
    }

    public final void setAddressList(List<Suggestions> list) {
        C19383o.m32797g(list, "<set-?>");
        this.addressList = list;
    }

    public final void setCountryList(List<Country> list) {
        C19383o.m32797g(list, "<set-?>");
        this.countryList = list;
    }

    public final void setQuery(String str) {
        this.query = str;
    }

    public ShippingAdapter(Context context2, List<Suggestions> list, List<Country> list2, ShippingAdapterClickListener shippingAdapterClickListener, CountryAdapterClickListener countryAdapterClickListener, String str) {
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        C19383o.m32797g(list, "addressList");
        C19383o.m32797g(list2, "countryList");
        this.context = context2;
        this.addressList = list;
        this.countryList = list2;
        this.addressClickListener = shippingAdapterClickListener;
        this.countryClickListener = countryAdapterClickListener;
        this.query = str;
    }

    public void onBindViewHolder(ItemViewHolder itemViewHolder, int i) {
        String str;
        int i2 = i;
        C19383o.m32797g(itemViewHolder, "holder");
        if (!this.addressList.isEmpty()) {
            str = this.addressList.get(i2).getAddressText();
            if (str == null) {
                str = "";
            }
        } else {
            str = this.countryList.get(i2).getName();
        }
        if (itemViewHolder.getType() == ShippingItemViewType.TYPE_COUNTRY) {
            ShippingUtils shippingUtils = ShippingUtils.INSTANCE;
            Resources resources = this.context.getResources();
            C19383o.m32796f(resources, "context.resources");
            String code = this.countryList.get(i2).getCode();
            String packageName = this.context.getPackageName();
            C19383o.m32796f(packageName, "context.packageName");
            int flagDrawableId = shippingUtils.getFlagDrawableId(resources, code, packageName);
            TextView value = itemViewHolder.getValue();
            if (value != null) {
                value.setCompoundDrawablesWithIntrinsicBounds(shippingUtils.getRoundedDrawable(this.context, flagDrawableId), (Drawable) null, (Drawable) null, (Drawable) null);
            }
            ImageView check = itemViewHolder.getCheck();
            if (check != null) {
                check.setVisibility(8);
            }
            String code2 = this.countryList.get(i2).getCode();
            Cache cache = Cache.INSTANCE;
            if (C19457k.m33019W0(code2, cache.getCountryId(this.context), true)) {
                ImageView check2 = itemViewHolder.getCheck();
                if (check2 != null) {
                    check2.setVisibility(0);
                }
                cache.cacheCountryPosition(this.context, i2);
                ShippingUtils.announceAccessibilityEvent$default(shippingUtils, this.context, C0326j.m864i(this.countryList.get(i2).getName(), this.context.getResources().getString(C17165R.string.paypal_checkout_selected)), (View) null, 4, (Object) null);
            }
            TextView value2 = itemViewHolder.getValue();
            if (value2 != null) {
                value2.setText(this.context.getResources().getString(C17165R.string.paypal_checkout_search_screen_name, new Object[]{"  ", str}));
            }
        } else if (itemViewHolder.getType() == ShippingItemViewType.TYPE_ADDRESS) {
            ImageView check3 = itemViewHolder.getCheck();
            if (check3 != null) {
                check3.setVisibility(8);
            }
            TextView addressLine1 = itemViewHolder.getAddressLine1();
            if (addressLine1 != null) {
                CharSequence handleBoldText = ShippingUtils.INSTANCE.handleBoldText(this.query, C19459m.m33032E1(str, ",", str));
                if (handleBoldText == null) {
                    handleBoldText = C19459m.m33032E1(str, ",", str);
                }
                addressLine1.setText(handleBoldText);
            }
            TextView addressLine2 = itemViewHolder.getAddressLine2();
            if (addressLine2 != null) {
                addressLine2.setText(C19459m.m33035H1(C19459m.m33030C1(str, ",", str)).toString());
            }
            TextView value3 = itemViewHolder.getValue();
            if (value3 != null) {
                value3.setText(this.context.getResources().getString(C17165R.string.paypal_checkout_search_screen_name, new Object[]{"", str}));
            }
            ShippingUtils shippingUtils2 = ShippingUtils.INSTANCE;
            Context context2 = this.context;
            String string = context2.getResources().getString(C17165R.string.paypal_checkout_shipping_address_matches);
            C19383o.m32796f(string, "context.resources.getStr…shipping_address_matches)");
            ShippingUtils.announceAccessibilityEvent$default(shippingUtils2, context2, string, (View) null, 4, (Object) null);
        }
    }

    public ItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        ShippingItemViewType shippingItemViewType = ShippingItemViewType.TYPE_ADD_MANUALLY;
        if (i == shippingItemViewType.getValue()) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C17165R.C17169layout.search_list_add_manually, viewGroup, false);
            C19383o.m32796f(inflate, "from(parent.context).inf…  false\n                )");
            return new ItemViewHolder(inflate, this.addressClickListener, (CountryAdapterClickListener) null, this, shippingItemViewType);
        }
        ShippingItemViewType shippingItemViewType2 = ShippingItemViewType.TYPE_ADDRESS;
        if (i == shippingItemViewType2.getValue()) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C17165R.C17169layout.search_list_item_view, viewGroup, false);
            C19383o.m32796f(inflate2, "from(parent.context).inf…lse\n                    )");
            return new ItemViewHolder(inflate2, this.addressClickListener, (CountryAdapterClickListener) null, this, shippingItemViewType2);
        }
        ShippingItemViewType shippingItemViewType3 = ShippingItemViewType.TYPE_COUNTRY;
        if (i == shippingItemViewType3.getValue()) {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(C17165R.C17169layout.search_list_country_view, viewGroup, false);
            C19383o.m32796f(inflate3, "from(parent.context).inf…lse\n                    )");
            return new ItemViewHolder(inflate3, (ShippingAdapterClickListener) null, this.countryClickListener, this, shippingItemViewType3);
        }
        throw new IllegalStateException("Invalid type for the item to display".toString());
    }
}
