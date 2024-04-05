package p511ap;

import android.view.View;
import com.paypal.pyplcheckout.addressbook.view.adapters.AddressBookAdapter;

/* renamed from: ap.a */
public final /* synthetic */ class C14039a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ AddressBookAdapter f30897b;

    /* renamed from: c */
    public final /* synthetic */ AddressBookAdapter.AddressBookAdapterClickListener f30898c;

    /* renamed from: d */
    public final /* synthetic */ AddressBookAdapter f30899d;

    /* renamed from: e */
    public final /* synthetic */ AddressBookAdapter.ItemViewHolder f30900e;

    public /* synthetic */ C14039a(AddressBookAdapter addressBookAdapter, AddressBookAdapter.AddressBookAdapterClickListener addressBookAdapterClickListener, AddressBookAdapter addressBookAdapter2, AddressBookAdapter.ItemViewHolder itemViewHolder) {
        this.f30897b = addressBookAdapter;
        this.f30898c = addressBookAdapterClickListener;
        this.f30899d = addressBookAdapter2;
        this.f30900e = itemViewHolder;
    }

    public final void onClick(View view) {
        AddressBookAdapter.ItemViewHolder.m35157_init_$lambda0(this.f30897b, this.f30898c, this.f30899d, this.f30900e, view);
    }
}
