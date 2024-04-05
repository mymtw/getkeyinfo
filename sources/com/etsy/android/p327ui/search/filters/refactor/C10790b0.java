package com.etsy.android.p327ui.search.filters.refactor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem;
import com.etsy.android.stylekit.views.CollageCheckbox;
import com.etsy.android.stylekit.views.CollageContentToggle;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.filters.refactor.b0 */
public final class C10790b0 extends C10862y {

    /* renamed from: b */
    public final C19857l<C10813l, C19394m> f23896b;

    /* renamed from: c */
    public final CollageContentToggle f23897c;

    /* renamed from: d */
    public final ArrayList f23898d;

    /* renamed from: com.etsy.android.ui.search.filters.refactor.b0$a */
    public static final class C10791a implements CollageCheckbox.C9027c {

        /* renamed from: a */
        public final /* synthetic */ C10790b0 f23899a;

        /* renamed from: b */
        public final /* synthetic */ ShippingSelectItem f23900b;

        public C10791a(C10790b0 b0Var, ShippingSelectItem shippingSelectItem) {
            this.f23899a = b0Var;
            this.f23900b = shippingSelectItem;
        }

        /* renamed from: a */
        public final void mo30790a(boolean z, CollageCheckbox collageCheckbox) {
            C19383o.m32797g(collageCheckbox, "selectedButton");
            this.f23899a.f23896b.invoke(new C10813l.C10825l(this.f23900b.f23877a, z));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10790b0(ViewGroup viewGroup, C19857l<? super C10813l, C19394m> lVar) {
        super(C0114h.m305j0(viewGroup, R.layout.search_filters_shipping, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(lVar, "onChange");
        this.f23896b = lVar;
        View findViewById = this.itemView.findViewById(R.id.content_toggle_shipping);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.….content_toggle_shipping)");
        this.f23897c = (CollageContentToggle) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.checkbox_shipping_0);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.checkbox_shipping_0)");
        View findViewById3 = this.itemView.findViewById(R.id.checkbox_shipping_1);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.checkbox_shipping_1)");
        View findViewById4 = this.itemView.findViewById(R.id.checkbox_shipping_2);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.id.checkbox_shipping_2)");
        this.f23898d = C17782b.m29866f0((CollageCheckbox) findViewById2, (CollageCheckbox) findViewById3, (CollageCheckbox) findViewById4);
    }

    /* renamed from: e */
    public final void mo35868e(SearchFiltersUiGroupItem searchFiltersUiGroupItem) {
        if (searchFiltersUiGroupItem instanceof SearchFiltersUiGroupItem.Shipping) {
            this.f23897c.setTitle(searchFiltersUiGroupItem.mo35795d());
            this.f23897c.setDescription(searchFiltersUiGroupItem.mo35794c());
            List<ShippingSelectItem> list = ((SearchFiltersUiGroupItem.Shipping) searchFiltersUiGroupItem).f23825d;
            int max = Math.max(this.f23898d.size(), list.size());
            for (int i = 0; i < max; i++) {
                if (C19327t.m32641W0(i, list) == null) {
                    ViewExtensions.m12860d((CollageCheckbox) this.f23898d.get(i));
                } else {
                    if (C19327t.m32641W0(i, this.f23898d) == null) {
                        Context context = this.itemView.getContext();
                        C19383o.m32796f(context, "itemView.context");
                        CollageCheckbox collageCheckbox = new CollageCheckbox(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                        this.f23898d.add(collageCheckbox);
                        this.f23897c.addView(collageCheckbox);
                    }
                    CollageCheckbox collageCheckbox2 = (CollageCheckbox) this.f23898d.get(i);
                    ShippingSelectItem shippingSelectItem = list.get(i);
                    ViewExtensions.m12869m(collageCheckbox2);
                    collageCheckbox2.setText(shippingSelectItem.f23878b);
                    collageCheckbox2.setChecked(shippingSelectItem.f23879c);
                    collageCheckbox2.setOnCheckedChangeListener(new C10791a(this, shippingSelectItem));
                }
            }
        }
    }
}
