package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies;

import android.content.Context;
import android.content.DialogInterface;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.Country;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.cart.bottomsheets.C9264b;
import com.etsy.android.p327ui.cart.bottomsheets.applycoupon.C9257b;
import com.etsy.android.stylekit.views.CollageListItem;
import com.etsy.android.stylekit.views.CollageTextInput;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import p309ad.C8504a;
import p309ad.C8505b;
import p309ad.C8508d;
import p309ad.C8509e;
import p568fn.C17782b;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.d */
public final class C10554d {

    /* renamed from: a */
    public final C8505b f23139a;

    /* renamed from: b */
    public C10557c f23140b = C10557c.C10559b.f23151a;

    /* renamed from: c */
    public BottomSheetDialog f23141c;

    /* renamed from: d */
    public C19861p<? super Country, ? super String, C19394m> f23142d;

    /* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.d$a */
    public static final class C10555a extends RecyclerView.Adapter<C10556b> {

        /* renamed from: b */
        public final List<Country> f23143b;

        /* renamed from: c */
        public final int f23144c = -1;

        /* renamed from: d */
        public final C19857l<Country, C19394m> f23145d;

        public C10555a(List list, C19857l lVar) {
            C19383o.m32797g(list, ResponseConstants.ITEMS);
            this.f23143b = list;
            this.f23145d = lVar;
        }

        public final int getItemCount() {
            return this.f23143b.size();
        }

        public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
            C10556b bVar = (C10556b) b0Var;
            C19383o.m32797g(bVar, "holder");
            Country country = this.f23143b.get(i);
            boolean z = this.f23144c == i;
            C19383o.m32797g(country, "country");
            View view = bVar.itemView;
            C19383o.m32795e(view, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageListItem");
            CollageListItem collageListItem = (CollageListItem) view;
            collageListItem.setText(country.getName());
            if (country.getCountryId() == -1) {
                ((CollageListItem) bVar.itemView).setEnabled(false);
                collageListItem.setOnClickListener((View.OnClickListener) null);
            } else {
                ((CollageListItem) bVar.itemView).setEnabled(true);
                ViewExtensions.m12866j(collageListItem, new CalculateShippingWorkflow$CountryViewHolder$bind$1$1(bVar, country));
            }
            collageListItem.setSelected(z);
        }

        public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
            return new C10556b(viewGroup, this.f23145d);
        }
    }

    /* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.d$b */
    public static final class C10556b extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public final C19857l<Country, C19394m> f23146b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10556b(ViewGroup viewGroup, C19857l<? super Country, C19394m> lVar) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_listing_bottomsheet_country, viewGroup, false));
            C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
            C19383o.m32797g(lVar, "onItemClick");
            this.f23146b = lVar;
        }
    }

    /* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.d$c */
    public static abstract class C10557c {

        /* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.d$c$a */
        public static final class C10558a extends C10557c {

            /* renamed from: a */
            public final Country f23147a;

            /* renamed from: b */
            public final C8509e f23148b;

            /* renamed from: c */
            public final C8508d f23149c;

            /* renamed from: d */
            public final C8504a f23150d;

            public C10558a(Country country, C8509e eVar, C8508d dVar, C0114h hVar) {
                C19383o.m32797g(country, "selectedCountry");
                this.f23147a = country;
                this.f23148b = eVar;
                this.f23149c = dVar;
                this.f23150d = hVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10558a)) {
                    return false;
                }
                C10558a aVar = (C10558a) obj;
                return C19383o.m32792b(this.f23147a, aVar.f23147a) && C19383o.m32792b(this.f23148b, aVar.f23148b) && C19383o.m32792b(this.f23149c, aVar.f23149c) && C19383o.m32792b(this.f23150d, aVar.f23150d);
            }

            public final int hashCode() {
                int hashCode = (this.f23149c.hashCode() + ((this.f23148b.hashCode() + (this.f23147a.hashCode() * 31)) * 31)) * 31;
                C8504a aVar = this.f23150d;
                return hashCode + (aVar == null ? 0 : aVar.hashCode());
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("EnterPostalCode(selectedCountry=");
                h.append(this.f23147a);
                h.append(", postalCodeValidator=");
                h.append(this.f23148b);
                h.append(", postalCodeInputViewSettings=");
                h.append(this.f23149c);
                h.append(", postalCodeFormatter=");
                h.append(this.f23150d);
                h.append(')');
                return h.toString();
            }
        }

        /* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.d$c$b */
        public static final class C10559b extends C10557c {

            /* renamed from: a */
            public static final C10559b f23151a = new C10559b();
        }

        /* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.d$c$c */
        public static final class C10560c extends C10557c {

            /* renamed from: a */
            public final List<Country> f23152a;

            public C10560c(ArrayList arrayList) {
                this.f23152a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C10560c) && C19383o.m32792b(this.f23152a, ((C10560c) obj).f23152a);
            }

            public final int hashCode() {
                return this.f23152a.hashCode();
            }

            public final String toString() {
                return C0070b.m186i(C0072d.m201h("SelectCountry(availableCountries="), this.f23152a, ')');
            }
        }

        /* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.d$c$d */
        public static final class C10561d extends C10557c {

            /* renamed from: a */
            public final Country f23153a;

            /* renamed from: b */
            public final String f23154b;

            public C10561d(Country country, String str) {
                C19383o.m32797g(country, "country");
                this.f23153a = country;
                this.f23154b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10561d)) {
                    return false;
                }
                C10561d dVar = (C10561d) obj;
                return C19383o.m32792b(this.f23153a, dVar.f23153a) && C19383o.m32792b(this.f23154b, dVar.f23154b);
            }

            public final int hashCode() {
                int hashCode = this.f23153a.hashCode() * 31;
                String str = this.f23154b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("SendResult(country=");
                h.append(this.f23153a);
                h.append(", postalCode=");
                return C0391c.m1057c(h, this.f23154b, ')');
            }
        }
    }

    public C10554d(C8505b bVar) {
        this.f23139a = bVar;
    }

    /* renamed from: a */
    public final void mo34145a(CollageTextInput collageTextInput) {
        C15588c1.m25340p0(collageTextInput);
        String obj = C19459m.m33035H1(collageTextInput.getText()).toString();
        C10557c cVar = this.f23140b;
        if (cVar instanceof C10557c.C10558a) {
            mo34147c(new C10557c.C10561d(((C10557c.C10558a) cVar).f23147a, obj));
        }
    }

    /* renamed from: b */
    public final void mo34146b() {
        BottomSheetDialog bottomSheetDialog = this.f23141c;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.setOnShowListener((DialogInterface.OnShowListener) null);
            bottomSheetDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
            bottomSheetDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            if (bottomSheetDialog.isShowing()) {
                bottomSheetDialog.dismiss();
            }
        }
        this.f23141c = null;
        this.f23142d = null;
        this.f23140b = C10557c.C10559b.f23151a;
    }

    /* renamed from: c */
    public final void mo34147c(C10557c cVar) {
        this.f23140b = cVar;
        if (C19383o.m32792b(cVar, C10557c.C10559b.f23151a)) {
            return;
        }
        if (cVar instanceof C10557c.C10560c) {
            List<Country> list = ((C10557c.C10560c) cVar).f23152a;
            BottomSheetDialog bottomSheetDialog = this.f23141c;
            if (bottomSheetDialog != null) {
                bottomSheetDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                bottomSheetDialog.dismiss();
                bottomSheetDialog.setOnDismissListener(new C10551a(this));
                bottomSheetDialog.setContentView((int) R.layout.view_listing_calculate_shipping_country_select_bottom_sheet);
                View findViewById = bottomSheetDialog.findViewById(R.id.title);
                C19383o.m32794d(findViewById);
                ((TextView) findViewById).setText(R.string.listing_screen_select_country_bottom_sheet_title);
                C10555a aVar = new C10555a(list, new CalculateShippingWorkflow$showCountrySheet$1$adapter$1(this));
                View findViewById2 = bottomSheetDialog.findViewById(R.id.recycler_view);
                C19383o.m32794d(findViewById2);
                ((RecyclerView) findViewById2).setAdapter(aVar);
                bottomSheetDialog.show();
            }
        } else if (cVar instanceof C10557c.C10558a) {
            C10557c.C10558a aVar2 = (C10557c.C10558a) cVar;
            C8509e eVar = aVar2.f23148b;
            C8508d dVar = aVar2.f23149c;
            C8504a aVar3 = aVar2.f23150d;
            BottomSheetDialog bottomSheetDialog2 = this.f23141c;
            if (bottomSheetDialog2 != null) {
                bottomSheetDialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
                bottomSheetDialog2.dismiss();
                bottomSheetDialog2.setOnDismissListener(new C9264b(this, 1));
                bottomSheetDialog2.setContentView((int) R.layout.view_listing_calculate_shipping_postal_code_bottom_sheet);
                View findViewById3 = bottomSheetDialog2.findViewById(R.id.btn_apply);
                C19383o.m32794d(findViewById3);
                Button button = (Button) findViewById3;
                View findViewById4 = bottomSheetDialog2.findViewById(R.id.postal_code_input);
                C19383o.m32794d(findViewById4);
                CollageTextInput collageTextInput = (CollageTextInput) findViewById4;
                String string = bottomSheetDialog2.getContext().getString(dVar.mo21047j());
                C19383o.m32796f(string, "context.getString(postal…s.placeholderTextResId())");
                TextView textView = (TextView) bottomSheetDialog2.findViewById(R.id.title);
                if (textView != null) {
                    Context context = bottomSheetDialog2.getContext();
                    Locale locale = Locale.getDefault();
                    C19383o.m32796f(locale, "getDefault()");
                    String lowerCase = string.toLowerCase(locale);
                    C19383o.m32796f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    textView.setText(context.getString(R.string.postal_code_bottom_sheet_title, new Object[]{lowerCase}));
                }
                collageTextInput.setHint(dVar.mo21047j());
                collageTextInput.setInputType(dVar.mo21048l());
                collageTextInput.setFilters(C17782b.m29865e0(new InputFilter.LengthFilter(eVar.mo16e()), new InputFilter.AllCaps()));
                collageTextInput.setTextChangeListener(new CalculateShippingWorkflow$showPostalCodeSheet$1$2(new PostalCodeTextWatcher(collageTextInput, aVar3), button, eVar, collageTextInput));
                collageTextInput.setImeOptions(6);
                collageTextInput.setOnEditorActionListener(new C10552b(eVar, collageTextInput, this));
                button.setEnabled(eVar.mo14c(C19459m.m33035H1(collageTextInput.getText()).toString()));
                ViewExtensions.m12866j(button, new CalculateShippingWorkflow$showPostalCodeSheet$1$4(this, collageTextInput));
                bottomSheetDialog2.setOnShowListener(new C9257b(collageTextInput, 1));
                bottomSheetDialog2.show();
            }
        } else if (cVar instanceof C10557c.C10561d) {
            C10557c.C10561d dVar2 = (C10557c.C10561d) cVar;
            Country country = dVar2.f23153a;
            String str = dVar2.f23154b;
            C19861p<? super Country, ? super String, C19394m> pVar = this.f23142d;
            if (pVar != null) {
                pVar.invoke(country, str);
            }
            mo34146b();
        }
    }
}
