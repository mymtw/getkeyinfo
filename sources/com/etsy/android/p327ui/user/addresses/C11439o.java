package com.etsy.android.p327ui.user.addresses;

import android.text.Html;
import android.view.ViewGroup;
import androidx.activity.C0114h;
import androidx.recyclerview.widget.C3167n;
import androidx.recyclerview.widget.C3200w;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.addresses.UserAddressFormat;
import com.etsy.android.lib.util.C8885d0;
import java.util.List;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.addresses.o */
public final class C11439o extends C3200w<AddressItemUI, C11453v> {

    /* renamed from: c */
    public final C19857l<AddressItemUI, C19394m> f25258c;

    /* renamed from: com.etsy.android.ui.user.addresses.o$a */
    public static final class C11440a extends C3167n.C3172e<AddressItemUI> {

        /* renamed from: a */
        public static final C11440a f25259a = new C11440a();

        /* renamed from: a */
        public final boolean mo11900a(Object obj, Object obj2) {
            return C19383o.m32792b((AddressItemUI) obj, (AddressItemUI) obj2);
        }

        /* renamed from: b */
        public final boolean mo11901b(Object obj, Object obj2) {
            return ((AddressItemUI) obj).getUserAddressId() == ((AddressItemUI) obj2).getUserAddressId();
        }
    }

    public C11439o(C19857l<? super AddressItemUI, C19394m> lVar) {
        super(C11440a.f25259a);
        this.f25258c = lVar;
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        String format;
        List<String> uppercaseFields;
        C11453v vVar = (C11453v) b0Var;
        C19383o.m32797g(vVar, "holder");
        String str = null;
        AddressItemUI addressItemUI = i >= 0 && i < getItemCount() ? (AddressItemUI) getItem(i) : null;
        if (addressItemUI != null) {
            C19857l<AddressItemUI, C19394m> lVar = this.f25258c;
            C19383o.m32797g(lVar, "onEditAddress");
            UserAddressFormat formattingInfo = addressItemUI.getFormattingInfo();
            String str2 = "%name\\n%first_line\\n%second_line\\n%city\\n%state %zip\\n%country_name";
            if (C8885d0.m17322f(formattingInfo != null ? formattingInfo.getFormat() : null) && formattingInfo != null) {
                formattingInfo.setFormat(str2);
            }
            if (formattingInfo != null) {
                str = formattingInfo.getLocalInputFormat();
            }
            if (C8885d0.m17322f(str) && formattingInfo != null) {
                formattingInfo.setLocalInputFormat("%name\\n%first_line\\n%second_line\\n%zip %city\\n%state\\n%country_name");
            }
            if ((formattingInfo == null || (uppercaseFields = formattingInfo.getUppercaseFields()) == null || !uppercaseFields.isEmpty()) ? false : true) {
                formattingInfo.setUppercaseFields(C11423k.f25187a);
            }
            if (!(formattingInfo == null || (format = formattingInfo.getFormat()) == null)) {
                str2 = format;
            }
            Pair[] pairArr = new Pair[11];
            String str3 = addressItemUI.getUppercasedPropertiesMap().get("name");
            if (str3 == null) {
                str3 = addressItemUI.getName();
            }
            pairArr[0] = new Pair("%name", str3);
            String str4 = addressItemUI.getUppercasedPropertiesMap().get(ResponseConstants.FIRST_LINE);
            if (str4 == null) {
                str4 = addressItemUI.getFirst_line();
            }
            pairArr[1] = new Pair("%first_line", str4);
            String str5 = addressItemUI.getUppercasedPropertiesMap().get(ResponseConstants.SECOND_LINE);
            if (str5 == null) {
                str5 = addressItemUI.getSecond_line();
            }
            pairArr[2] = new Pair("%second_line", str5);
            String str6 = addressItemUI.getUppercasedPropertiesMap().get("city");
            if (str6 == null) {
                str6 = addressItemUI.getLocality();
            }
            pairArr[3] = new Pair("%city", str6);
            String str7 = addressItemUI.getUppercasedPropertiesMap().get("state");
            if (str7 == null) {
                str7 = addressItemUI.getAdministrative_area();
            }
            pairArr[4] = new Pair("%state", str7);
            String str8 = addressItemUI.getUppercasedPropertiesMap().get(ResponseConstants.ZIP);
            if (str8 == null) {
                str8 = addressItemUI.getPostal_code();
            }
            pairArr[5] = new Pair("%zip", str8);
            String str9 = addressItemUI.getUppercasedPropertiesMap().get("country_name");
            if (str9 == null) {
                str9 = addressItemUI.getCountry_name();
            }
            pairArr[6] = new Pair("%country_name", str9);
            String str10 = addressItemUI.getUppercasedPropertiesMap().get(ResponseConstants.PHONE);
            if (str10 == null && (str10 = addressItemUI.getPhoneNumber()) == null) {
                str10 = "";
            }
            pairArr[7] = new Pair("%phone", str10);
            pairArr[8] = new Pair("\\n", "<br/>");
            pairArr[9] = new Pair("<br/><br/><br/>", "<br/>");
            pairArr[10] = new Pair("<br/><br/>", "<br/>");
            for (int i2 = 0; i2 < 11; i2++) {
                Pair pair = pairArr[i2];
                str2 = C19457k.m33023a1(str2, (String) pair.component1(), (String) pair.component2(), true);
            }
            vVar.f25272c.setText(Html.fromHtml(str2));
            if (addressItemUI.is_default_address()) {
                ViewExtensions.m12869m(vVar.f25273d);
            } else {
                ViewExtensions.m12860d(vVar.f25273d);
            }
            ViewExtensions.m12866j(vVar.f25271b, new AddressListViewHolder$bind$1(lVar, addressItemUI));
        }
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        return new C11453v(C0114h.m305j0(viewGroup, R.layout.layout_address_item, false));
    }
}
