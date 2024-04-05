package com.etsy.android.p327ui.shop.viewholder;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ShopSection;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11078r;
import com.etsy.android.p327ui.shop.C11143e1;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.vespa.viewholders.C12086e;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p415of.C13171a;

/* renamed from: com.etsy.android.ui.shop.viewholder.a0 */
public final class C11259a0 extends C12086e<C11192q0> {

    /* renamed from: i */
    public static final /* synthetic */ int f24860i = 0;

    /* renamed from: c */
    public final C11143e1 f24861c;

    /* renamed from: d */
    public final SelectorAdapter f24862d;

    /* renamed from: e */
    public final C11302y f24863e;

    /* renamed from: f */
    public final AutoCompleteTextView f24864f;

    /* renamed from: g */
    public boolean f24865g;

    /* renamed from: h */
    public boolean f24866h;

    /* renamed from: com.etsy.android.ui.shop.viewholder.a0$a */
    public static abstract class C11260a {

        /* renamed from: com.etsy.android.ui.shop.viewholder.a0$a$a */
        public static final class C11261a extends C11260a {

            /* renamed from: a */
            public final ShopSection f24867a;

            public C11261a(ShopSection shopSection) {
                this.f24867a = shopSection;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C11261a) && C19383o.m32792b(this.f24867a, ((C11261a) obj).f24867a);
            }

            public final int hashCode() {
                ShopSection shopSection = this.f24867a;
                if (shopSection == null) {
                    return 0;
                }
                return shopSection.hashCode();
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("ItemClicked(shopSection=");
                h.append(this.f24867a);
                h.append(')');
                return h.toString();
            }
        }

        /* renamed from: com.etsy.android.ui.shop.viewholder.a0$a$b */
        public static final class C11262b extends C11260a {

            /* renamed from: a */
            public static final C11262b f24868a = new C11262b();
        }

        /* renamed from: com.etsy.android.ui.shop.viewholder.a0$a$c */
        public static final class C11263c extends C11260a {

            /* renamed from: a */
            public static final C11263c f24869a = new C11263c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11259a0(ViewGroup viewGroup, C13171a aVar, C11192q0 q0Var) {
        super(C0114h.m305j0(viewGroup, R.layout.shop_home_section_selector, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(aVar, "clickHandler");
        C19383o.m32797g(q0Var, "translationDelegate");
        this.f24861c = q0Var;
        Context context = this.itemView.getContext();
        C19383o.m32796f(context, "itemView.context");
        SelectorAdapter selectorAdapter = new SelectorAdapter(context, q0Var);
        this.f24862d = selectorAdapter;
        View findViewById = this.itemView.findViewById(R.id.shop_home_section_selector_container);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.…ction_selector_container)");
        View findViewById2 = this.itemView.findViewById(R.id.shop_home_section_selector);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.…op_home_section_selector)");
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById2;
        this.f24864f = autoCompleteTextView;
        EditText editText = ((TextInputLayout) findViewById).getEditText();
        if (editText != null) {
            editText.setHint(this.itemView.getContext().getString(R.string.shop_home_section_selector_hint));
        }
        autoCompleteTextView.setAdapter(selectorAdapter);
        autoCompleteTextView.setOnDismissListener(new C11301x(this, aVar));
        this.f24863e = new C11302y(this, aVar);
        autoCompleteTextView.setOnClickListener(new C11078r(1, this, aVar));
        autoCompleteTextView.setOnFocusChangeListener(new C11303z(this, aVar));
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        String str;
        C11192q0 q0Var = (C11192q0) obj;
        C19383o.m32797g(q0Var, "manager");
        this.f24862d.clear();
        List<ShopSection> list = q0Var.f24747g;
        this.f24862d.addAll(list);
        ShopSection shopSection = q0Var.f24746f;
        this.f24862d.setSelectedItemPosition(list.indexOf(shopSection));
        AutoCompleteTextView autoCompleteTextView = this.f24864f;
        if (shopSection != null) {
            C11143e1 e1Var = this.f24861c;
            String title = shopSection.getTitle();
            C19383o.m32796f(title, "currentSection.title");
            str = ((C11192q0) e1Var).mo36861a(title, shopSection.getTitleTranslated());
        } else {
            str = this.itemView.getResources().getString(R.string.shop_home_section_selector_unselected);
            C19383o.m32796f(str, "{\n                itemVi…unselected)\n            }");
        }
        autoCompleteTextView.setText(str, false);
        this.f24864f.setOnItemClickListener(this.f24863e);
    }

    /* renamed from: b */
    public final void mo31374b() {
        this.f24864f.setOnItemClickListener((AdapterView.OnItemClickListener) null);
        this.f24865g = false;
        this.f24866h = false;
    }
}
