package com.etsy.android.p327ui.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.models.EtsyCurrency;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.user.CurrencySelectFragment;
import com.etsy.android.uikit.adapter.C11829a;
import java.util.Currency;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p030bo.app.C3653e7;
import p441sb.C13367a;

/* renamed from: com.etsy.android.ui.adapters.CurrencyAdapter */
public final class CurrencyAdapter extends C11829a<EtsyCurrency> {

    /* renamed from: b */
    public final CurrencySelectFragment.C11332a f19994b;

    /* renamed from: c */
    public final C8629a f19995c;

    /* renamed from: d */
    public Currency f19996d;

    /* renamed from: com.etsy.android.ui.adapters.CurrencyAdapter$a */
    public static final class C9098a extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public final TextView f19997b;

        public C9098a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.currency_device_msg);
            C19383o.m32796f(findViewById, "rowView.findViewById(R.id.currency_device_msg)");
            this.f19997b = (TextView) findViewById;
        }
    }

    /* renamed from: com.etsy.android.ui.adapters.CurrencyAdapter$b */
    public static final class C9099b extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public final TextView f19998b;

        /* renamed from: c */
        public final TextView f19999c;

        /* renamed from: d */
        public final TextView f20000d;

        public C9099b(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.currency_symbol);
            C19383o.m32796f(findViewById, "rowView.findViewById(R.id.currency_symbol)");
            this.f19998b = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.currency_name);
            C19383o.m32796f(findViewById2, "rowView.findViewById(R.id.currency_name)");
            this.f19999c = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.currency_code);
            C19383o.m32796f(findViewById3, "rowView.findViewById(R.id.currency_code)");
            this.f20000d = (TextView) findViewById3;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CurrencyAdapter(FragmentActivity fragmentActivity, C3653e7 e7Var, C8629a aVar) {
        super(fragmentActivity);
        C19383o.m32797g(fragmentActivity, ResponseConstants.CONTEXT);
        C19383o.m32797g(aVar, "appCurrency");
        this.f19994b = e7Var;
        this.f19995c = aVar;
    }

    public final int getListItemViewType(int i) {
        return 0;
    }

    public final void onBindHeaderViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C19383o.m32795e(b0Var, "null cannot be cast to non-null type com.etsy.android.ui.adapters.CurrencyAdapter.CurrencyHeaderViewHolder");
        TextView textView = ((C9098a) b0Var).f19997b;
        FragmentActivity fragmentActivity = this.mContext;
        Object[] objArr = new Object[1];
        Currency currency = this.f19996d;
        objArr[0] = currency != null ? currency.getCurrencyCode() : null;
        textView.setText(fragmentActivity.getString(R.string.currency_device_notsupported, objArr));
    }

    public final void onBindListItemViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C19383o.m32797g(b0Var, "holder");
        C9099b bVar = (C9099b) b0Var;
        EtsyCurrency etsyCurrency = (EtsyCurrency) getItem(i);
        C19383o.m32794d(etsyCurrency);
        if (C19383o.m32792b(etsyCurrency.getCode(), this.f19995c.mo21246a())) {
            C19388s.m32810A0(bVar.f19998b, new C13367a.C13368a());
            C19388s.m32810A0(bVar.f20000d, new C13367a.C13368a());
            C19388s.m32810A0(bVar.f19999c, new C13367a.C13368a());
        } else {
            C19388s.m32810A0(bVar.f19998b, new C13367a.C13370c());
            C19388s.m32810A0(bVar.f20000d, new C13367a.C13370c());
            C19388s.m32810A0(bVar.f19999c, new C13367a.C13370c());
        }
        bVar.f19999c.setText(etsyCurrency.getName());
        bVar.f19998b.setText(etsyCurrency.getUnit().getCurrencySymbol());
        bVar.f20000d.setText(etsyCurrency.getCode());
        View view = bVar.itemView;
        C19383o.m32796f(view, "viewHolder.itemView");
        ViewExtensions.m12866j(view, new CurrencyAdapter$onBindListItemViewHolder$1(this, etsyCurrency, i));
    }

    public final RecyclerView.C3084b0 onCreateHeaderViewHolder(ViewGroup viewGroup, int i) {
        View inflate = this.mInflater.inflate(R.layout.list_item_currency_header, viewGroup, false);
        C19383o.m32796f(inflate, "mInflater.inflate(R.layo…cy_header, parent, false)");
        return new C9098a(inflate);
    }

    public final RecyclerView.C3084b0 onCreateListItemViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        View inflate = this.mInflater.inflate(R.layout.list_item_currency, viewGroup, false);
        C19383o.m32796f(inflate, "mInflater.inflate(R.layo…_currency, parent, false)");
        return new C9099b(inflate);
    }
}
