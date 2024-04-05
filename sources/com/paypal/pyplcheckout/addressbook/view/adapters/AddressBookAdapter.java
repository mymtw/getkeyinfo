package com.paypal.pyplcheckout.addressbook.view.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.card.MaterialCardView;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.pojo.ShippingAddress;
import com.paypal.pyplcheckout.pojo.ShippingMethodType;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;
import p511ap.C14039a;

public final class AddressBookAdapter extends RecyclerView.Adapter<RecyclerView.C3084b0> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static int lastSelectedShippingAddressIndex = -1;
    private final AddressBookAdapterClickListener addressBookAdapterClickListener;
    private final Context context;
    /* access modifiers changed from: private */
    public boolean doubleTapFlag = true;
    private ShippingAddress selectedShippingAddress;
    private ShippingMethodType selectedShippingMethodType;
    private final List<ShippingAddress> shippingAddressList;
    private final int typeFooter = 2;
    private final int typeItem = 1;

    public interface AddressBookAdapterClickListener {
        void onAddNewShippingAddressClicked();

        void onShippingAddressSelected(int i);
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getLastSelectedShippingAddressIndex() {
            return AddressBookAdapter.lastSelectedShippingAddressIndex;
        }

        public final void setLastSelectedShippingAddressIndex(int i) {
            AddressBookAdapter.lastSelectedShippingAddressIndex = i;
        }
    }

    public static final class ItemViewHolder extends RecyclerView.C3084b0 {
        private final WeakReference<AddressBookAdapterClickListener> adapterClickListenerWeakReference;
        private final WeakReference<AddressBookAdapter> addressBookAdapterWeakReference;
        private final TextView addressBookCityStateZipTv;
        private final TextView addressBookFirstLineTv;
        private final TextView addressBookInvalidTv;
        private final TextView addressBookSecondLineTv;
        private final ImageView addressBookSelectedCb;
        private final TextView addressBookShipToTv;
        private boolean isInvalid;
        private final MaterialCardView listSelectorCardView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(View view, AddressBookAdapterClickListener addressBookAdapterClickListener, AddressBookAdapter addressBookAdapter) {
            super(view);
            C19383o.m32797g(view, "view");
            C19383o.m32797g(addressBookAdapter, "adapter");
            WeakReference<AddressBookAdapterClickListener> weakReference = new WeakReference<>(addressBookAdapterClickListener);
            this.adapterClickListenerWeakReference = weakReference;
            WeakReference<AddressBookAdapter> weakReference2 = new WeakReference<>(addressBookAdapter);
            this.addressBookAdapterWeakReference = weakReference2;
            View findViewById = view.findViewById(C17165R.C17167id.address_book_ship_to_tv);
            C19383o.m32796f(findViewById, "view.findViewById(R.id.address_book_ship_to_tv)");
            this.addressBookShipToTv = (TextView) findViewById;
            View findViewById2 = view.findViewById(C17165R.C17167id.address_book_first_line_tv);
            C19383o.m32796f(findViewById2, "view.findViewById(R.id.address_book_first_line_tv)");
            this.addressBookFirstLineTv = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C17165R.C17167id.address_book_second_line_tv);
            C19383o.m32796f(findViewById3, "view.findViewById(R.id.a…ress_book_second_line_tv)");
            this.addressBookSecondLineTv = (TextView) findViewById3;
            View findViewById4 = view.findViewById(C17165R.C17167id.address_book_city_state_zip_tv);
            C19383o.m32796f(findViewById4, "view.findViewById(R.id.a…s_book_city_state_zip_tv)");
            this.addressBookCityStateZipTv = (TextView) findViewById4;
            View findViewById5 = view.findViewById(C17165R.C17167id.address_book_invalid_tv);
            C19383o.m32796f(findViewById5, "view.findViewById(R.id.address_book_invalid_tv)");
            this.addressBookInvalidTv = (TextView) findViewById5;
            View findViewById6 = view.findViewById(C17165R.C17167id.country_selected_cb);
            C19383o.m32796f(findViewById6, "view.findViewById(R.id.country_selected_cb)");
            this.addressBookSelectedCb = (ImageView) findViewById6;
            View findViewById7 = view.findViewById(C17165R.C17167id.list_selector_card_view);
            C19383o.m32796f(findViewById7, "view.findViewById(R.id.list_selector_card_view)");
            this.listSelectorCardView = (MaterialCardView) findViewById7;
            view.setOnClickListener(new C14039a(addressBookAdapter, weakReference.get(), weakReference2.get(), this));
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m35157_init_$lambda0(AddressBookAdapter addressBookAdapter, AddressBookAdapterClickListener addressBookAdapterClickListener, AddressBookAdapter addressBookAdapter2, ItemViewHolder itemViewHolder, View view) {
            C19383o.m32797g(addressBookAdapter, "$adapter");
            C19383o.m32797g(itemViewHolder, "this$0");
            if (!addressBookAdapter.doubleTapFlag) {
                PLog.click$default(PEnums.TransitionName.ADDRESS_BOOK_MULTI_TAP, PEnums.Outcome.CLICKED, PEnums.EventCode.E638, PEnums.StateName.ADD_SHIPPING, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 496, (Object) null);
                return;
            }
            addressBookAdapter.doubleTapFlag = false;
            PLog.click$default(PEnums.TransitionName.NATIVE_ADD_SHIPPING_CHANGE_TAPPED, PEnums.Outcome.CLICKED, PEnums.EventCode.E624, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 496, (Object) null);
            if (addressBookAdapterClickListener != null) {
                Companion companion = AddressBookAdapter.Companion;
                if (companion.getLastSelectedShippingAddressIndex() != -1) {
                    if (addressBookAdapter2 != null) {
                        addressBookAdapter2.notifyItemChanged(companion.getLastSelectedShippingAddressIndex());
                    }
                    companion.setLastSelectedShippingAddressIndex(itemViewHolder.getAdapterPosition());
                    if (addressBookAdapter2 != null) {
                        addressBookAdapter2.notifyItemChanged(companion.getLastSelectedShippingAddressIndex());
                    }
                }
                if (!itemViewHolder.isInvalid) {
                    addressBookAdapterClickListener.onShippingAddressSelected(itemViewHolder.getAdapterPosition());
                }
            }
        }

        public final TextView getAddressBookCityStateZipTv() {
            return this.addressBookCityStateZipTv;
        }

        public final TextView getAddressBookFirstLineTv() {
            return this.addressBookFirstLineTv;
        }

        public final TextView getAddressBookInvalidTv() {
            return this.addressBookInvalidTv;
        }

        public final TextView getAddressBookSecondLineTv() {
            return this.addressBookSecondLineTv;
        }

        public final ImageView getAddressBookSelectedCb() {
            return this.addressBookSelectedCb;
        }

        public final TextView getAddressBookShipToTv() {
            return this.addressBookShipToTv;
        }

        public final MaterialCardView getListSelectorCardView() {
            return this.listSelectorCardView;
        }

        public final void setInvalid(boolean z) {
            this.isInvalid = z;
        }
    }

    public AddressBookAdapter(Context context2, List<ShippingAddress> list, ShippingAddress shippingAddress, ShippingMethodType shippingMethodType, AddressBookAdapterClickListener addressBookAdapterClickListener2) {
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        C19383o.m32797g(list, "shippingAddressList");
        this.context = context2;
        this.shippingAddressList = list;
        this.selectedShippingAddress = shippingAddress;
        this.selectedShippingMethodType = shippingMethodType;
        this.addressBookAdapterClickListener = addressBookAdapterClickListener2;
    }

    private final void changeFieldsColor(ItemViewHolder itemViewHolder, int i) {
        TextView addressBookShipToTv = itemViewHolder.getAddressBookShipToTv();
        Context context2 = this.context;
        Object obj = C8184a.f17966a;
        addressBookShipToTv.setTextColor(C8184a.C8188d.m16468a(context2, i));
        itemViewHolder.getAddressBookFirstLineTv().setTextColor(C8184a.C8188d.m16468a(this.context, i));
        itemViewHolder.getAddressBookSecondLineTv().setTextColor(C8184a.C8188d.m16468a(this.context, i));
        itemViewHolder.getAddressBookCityStateZipTv().setTextColor(C8184a.C8188d.m16468a(this.context, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    public static final boolean m35156onBindViewHolder$lambda0(AddressBookAdapter addressBookAdapter, RecyclerView.C3084b0 b0Var, View view, MotionEvent motionEvent) {
        C19383o.m32797g(addressBookAdapter, "this$0");
        C19383o.m32797g(b0Var, "$holder");
        if (motionEvent.getAction() == 0) {
            ItemViewHolder itemViewHolder = (ItemViewHolder) b0Var;
            addressBookAdapter.changeFieldsColor(itemViewHolder, C17165R.color.add_card_blue);
            MaterialCardView listSelectorCardView = itemViewHolder.getListSelectorCardView();
            Context context2 = addressBookAdapter.context;
            int i = C17165R.color.blue_200;
            Object obj = C8184a.f17966a;
            listSelectorCardView.setCardBackgroundColor(C8184a.C8188d.m16468a(context2, i));
            return false;
        }
        ItemViewHolder itemViewHolder2 = (ItemViewHolder) b0Var;
        addressBookAdapter.changeFieldsColor(itemViewHolder2, C17165R.color.gray_color_700);
        MaterialCardView listSelectorCardView2 = itemViewHolder2.getListSelectorCardView();
        Context context3 = addressBookAdapter.context;
        Object obj2 = C8184a.f17966a;
        listSelectorCardView2.setCardBackgroundColor(C8184a.C8188d.m16468a(context3, 17170445));
        return false;
    }

    public int getItemCount() {
        return this.shippingAddressList.size();
    }

    public int getItemViewType(int i) {
        return this.typeItem;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013f  */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C3084b0 r12, int r13) {
        /*
            r11 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            boolean r0 = r12 instanceof com.paypal.pyplcheckout.addressbook.view.adapters.AddressBookAdapter.ItemViewHolder
            if (r0 == 0) goto L_0x0199
            java.util.List<com.paypal.pyplcheckout.pojo.ShippingAddress> r0 = r11.shippingAddressList
            java.lang.Object r0 = r0.get(r13)
            com.paypal.pyplcheckout.pojo.ShippingAddress r0 = (com.paypal.pyplcheckout.pojo.ShippingAddress) r0
            r1 = r12
            com.paypal.pyplcheckout.addressbook.view.adapters.AddressBookAdapter$ItemViewHolder r1 = (com.paypal.pyplcheckout.addressbook.view.adapters.AddressBookAdapter.ItemViewHolder) r1
            boolean r2 = r0.isInvalid()
            r1.setInvalid(r2)
            com.paypal.pyplcheckout.pojo.ShippingAddress r2 = r11.selectedShippingAddress
            r3 = 0
            if (r2 != 0) goto L_0x0022
            r2 = r3
            goto L_0x0026
        L_0x0022:
            java.lang.String r2 = r2.getAddressId()
        L_0x0026:
            java.lang.String r4 = r0.getAddressId()
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r2, r4)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003c
            java.util.List<com.paypal.pyplcheckout.pojo.ShippingAddress> r2 = r11.shippingAddressList
            int r2 = r2.size()
            if (r2 <= r4) goto L_0x003c
            r2 = r4
            goto L_0x003d
        L_0x003c:
            r2 = r5
        L_0x003d:
            if (r2 == 0) goto L_0x0041
            lastSelectedShippingAddressIndex = r13
        L_0x0041:
            android.widget.ImageView r13 = r1.getAddressBookSelectedCb()
            if (r2 == 0) goto L_0x0056
            com.paypal.pyplcheckout.pojo.ShippingMethodType$Type r6 = com.paypal.pyplcheckout.pojo.ShippingMethodType.Type.SHIPPING
            com.paypal.pyplcheckout.pojo.ShippingMethodType r7 = r11.selectedShippingMethodType
            if (r7 != 0) goto L_0x004e
            goto L_0x0052
        L_0x004e:
            com.paypal.pyplcheckout.pojo.ShippingMethodType$Type r3 = r7.getShippingMethodType()
        L_0x0052:
            if (r6 != r3) goto L_0x0056
            r3 = r5
            goto L_0x0057
        L_0x0056:
            r3 = 4
        L_0x0057:
            r13.setVisibility(r3)
            com.paypal.pyplcheckout.pojo.Name r13 = r0.getName()
            java.lang.String r13 = r13.getFullName()
            if (r13 == 0) goto L_0x006d
            int r13 = r13.length()
            if (r13 != 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            r13 = r5
            goto L_0x006e
        L_0x006d:
            r13 = r4
        L_0x006e:
            r3 = 8
            if (r13 == 0) goto L_0x007a
            android.widget.TextView r13 = r1.getAddressBookShipToTv()
            r13.setVisibility(r3)
            goto L_0x0090
        L_0x007a:
            android.widget.TextView r13 = r1.getAddressBookShipToTv()
            com.paypal.pyplcheckout.pojo.Name r6 = r0.getName()
            java.lang.String r6 = r6.getFullName()
            r13.setText(r6)
            android.widget.TextView r13 = r1.getAddressBookShipToTv()
            r13.setVisibility(r5)
        L_0x0090:
            java.lang.String r13 = r0.getFullAddress()
            java.lang.String r6 = r0.getLine1()
            java.lang.String r7 = r0.getLine2()
            if (r6 == 0) goto L_0x00a7
            int r8 = r6.length()
            if (r8 != 0) goto L_0x00a5
            goto L_0x00a7
        L_0x00a5:
            r8 = r5
            goto L_0x00a8
        L_0x00a7:
            r8 = r4
        L_0x00a8:
            java.lang.String r9 = "this as java.lang.String…ing(startIndex, endIndex)"
            if (r8 == 0) goto L_0x00b4
            android.widget.TextView r6 = r1.getAddressBookFirstLineTv()
            r6.setVisibility(r3)
            goto L_0x00d3
        L_0x00b4:
            int r8 = r6.length()
            int r8 = r8 + 2
            int r10 = r13.length()
            java.lang.String r13 = r13.substring(r8, r10)
            kotlin.jvm.internal.C19383o.m32796f(r13, r9)
            android.widget.TextView r8 = r1.getAddressBookFirstLineTv()
            r8.setText(r6)
            android.widget.TextView r6 = r1.getAddressBookFirstLineTv()
            r6.setVisibility(r5)
        L_0x00d3:
            if (r7 == 0) goto L_0x00de
            int r6 = r7.length()
            if (r6 != 0) goto L_0x00dc
            goto L_0x00de
        L_0x00dc:
            r6 = r5
            goto L_0x00df
        L_0x00de:
            r6 = r4
        L_0x00df:
            if (r6 == 0) goto L_0x00e9
            android.widget.TextView r6 = r1.getAddressBookSecondLineTv()
            r6.setVisibility(r3)
            goto L_0x0108
        L_0x00e9:
            int r6 = r7.length()
            int r6 = r6 + 2
            int r8 = r13.length()
            java.lang.String r13 = r13.substring(r6, r8)
            kotlin.jvm.internal.C19383o.m32796f(r13, r9)
            android.widget.TextView r6 = r1.getAddressBookSecondLineTv()
            r6.setText(r7)
            android.widget.TextView r6 = r1.getAddressBookSecondLineTv()
            r6.setVisibility(r5)
        L_0x0108:
            if (r13 == 0) goto L_0x0113
            int r6 = r13.length()
            if (r6 != 0) goto L_0x0111
            goto L_0x0113
        L_0x0111:
            r6 = r5
            goto L_0x0114
        L_0x0113:
            r6 = r4
        L_0x0114:
            if (r6 == 0) goto L_0x011e
            android.widget.TextView r13 = r1.getAddressBookCityStateZipTv()
            r13.setVisibility(r3)
            goto L_0x012c
        L_0x011e:
            android.widget.TextView r6 = r1.getAddressBookCityStateZipTv()
            r6.setText(r13)
            android.widget.TextView r13 = r1.getAddressBookCityStateZipTv()
            r13.setVisibility(r5)
        L_0x012c:
            boolean r13 = r0.isInvalid()
            if (r13 == 0) goto L_0x013f
            android.widget.TextView r13 = r1.getAddressBookInvalidTv()
            r13.setVisibility(r5)
            int r13 = com.paypal.pyplcheckout.C17165R.color.gray_color_600
            r11.changeFieldsColor(r1, r13)
            goto L_0x018d
        L_0x013f:
            if (r2 == 0) goto L_0x0162
            com.google.android.material.card.MaterialCardView r13 = r1.getListSelectorCardView()
            android.content.Context r0 = r11.context
            int r2 = com.paypal.pyplcheckout.C17165R.color.cardview_border_blue
            java.lang.Object r3 = p260v0.C8184a.f17966a
            int r0 = p260v0.C8184a.C8188d.m16468a(r0, r2)
            r13.setStrokeColor((int) r0)
            com.google.android.material.card.MaterialCardView r13 = r1.getListSelectorCardView()
            android.content.Context r0 = r11.context
            int r2 = com.paypal.pyplcheckout.C17165R.color.blue_100
            int r0 = p260v0.C8184a.C8188d.m16468a(r0, r2)
            r13.setCardBackgroundColor((int) r0)
            goto L_0x018d
        L_0x0162:
            android.widget.TextView r13 = r1.getAddressBookInvalidTv()
            r13.setVisibility(r3)
            int r13 = com.paypal.pyplcheckout.C17165R.color.gray_color_700
            r11.changeFieldsColor(r1, r13)
            com.google.android.material.card.MaterialCardView r13 = r1.getListSelectorCardView()
            android.content.Context r0 = r11.context
            java.lang.Object r2 = p260v0.C8184a.f17966a
            r2 = 17170445(0x106000d, float:2.461195E-38)
            int r0 = p260v0.C8184a.C8188d.m16468a(r0, r2)
            r13.setStrokeColor((int) r0)
            com.google.android.material.card.MaterialCardView r13 = r1.getListSelectorCardView()
            android.content.Context r0 = r11.context
            int r0 = p260v0.C8184a.C8188d.m16468a(r0, r2)
            r13.setCardBackgroundColor((int) r0)
        L_0x018d:
            com.google.android.material.card.MaterialCardView r13 = r1.getListSelectorCardView()
            com.etsy.android.uikit.adapter.f r0 = new com.etsy.android.uikit.adapter.f
            r0.<init>(r4, r11, r12)
            r13.setOnTouchListener(r0)
        L_0x0199:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.addressbook.view.adapters.AddressBookAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    public final void updateSelectedShippingAddress(ShippingAddress shippingAddress) {
        this.selectedShippingAddress = shippingAddress;
    }

    public ItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        if (i == this.typeItem) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C17165R.C17169layout.address_book_list_item_view, viewGroup, false);
            C19383o.m32796f(inflate, "from(parent.context).inf…, false\n                )");
            return new ItemViewHolder(inflate, this.addressBookAdapterClickListener, this);
        }
        throw new IllegalArgumentException();
    }
}
