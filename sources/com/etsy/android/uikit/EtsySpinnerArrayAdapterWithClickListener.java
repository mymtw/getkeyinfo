package com.etsy.android.uikit;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.Country;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cart.viewholders.C9381h0;
import java.util.ArrayList;
import java.util.Map;

public class EtsySpinnerArrayAdapterWithClickListener<T> extends ArrayAdapter<T> {
    public AdapterView.OnItemSelectedListener mAdapterViewOnItemSelectedListener = new C11827a();
    public C11828b mOnItemClickListener = null;

    /* renamed from: com.etsy.android.uikit.EtsySpinnerArrayAdapterWithClickListener$a */
    public class C11827a implements AdapterView.OnItemSelectedListener {
        public C11827a() {
        }

        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C11828b bVar;
            ServerDrivenAction action;
            Object item = EtsySpinnerArrayAdapterWithClickListener.this.getItem(i);
            if (item != null && (bVar = EtsySpinnerArrayAdapterWithClickListener.this.mOnItemClickListener) != null) {
                Country country = (Country) item;
                boolean z = true;
                if (country.getCountryId() != ((C9381h0.C9385d) bVar).f20784b) {
                    C9381h0.C9385d dVar = (C9381h0.C9385d) EtsySpinnerArrayAdapterWithClickListener.this.mOnItemClickListener;
                    dVar.getClass();
                    if (C9381h0.this.f20773g != null && country.getCountryId() != -1) {
                        C9381h0.this.mo31833i(country.getIsoCountryCode());
                        C9381h0 h0Var = C9381h0.this;
                        if (h0Var.f20775i == null || h0Var.f20776j == null) {
                            z = false;
                        }
                        if (!z && (action = dVar.f20783a.getAction(ServerDrivenAction.TYPE_UPDATE_SHIPPING_DESTINATION)) != null) {
                            action.addParam(ResponseConstants.COUNTRY_ID, String.valueOf(country.getCountryId()));
                            C9381h0 h0Var2 = C9381h0.this;
                            h0Var2.f20773g.mo45936d(h0Var2.itemView, action);
                            C8672b bVar2 = C9381h0.this.f20778l;
                            if (bVar2 != null) {
                                bVar2.mo21333d("cart_shipping_estimate_updated", (Map<? extends AnalyticsProperty, Object>) null);
                            }
                        }
                    }
                }
            }
        }

        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.etsy.android.uikit.EtsySpinnerArrayAdapterWithClickListener$b */
    public interface C11828b<T> {
    }

    public EtsySpinnerArrayAdapterWithClickListener(Context context, Spinner spinner) {
        super(context, R.layout.spinner_list_item, R.id.text);
        setDropDownViewResource(R.layout.spinner_list_item_dropdown);
        spinner.setAdapter(this);
        spinner.setOnItemSelectedListener(getOnItemSelectedListener());
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View dropDownView = super.getDropDownView(i, view, viewGroup);
        setText(dropDownView.findViewById(R.id.text), getItem(i));
        return dropDownView;
    }

    public AdapterView.OnItemSelectedListener getOnItemSelectedListener() {
        return this.mAdapterViewOnItemSelectedListener;
    }

    public String getText(T t) {
        return t.toString();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        setText(view2, getItem(i));
        return view2;
    }

    public void setOnItemClickListener(C11828b<T> bVar) {
        this.mOnItemClickListener = bVar;
    }

    public void setText(View view, T t) {
        TextView textView = (TextView) view;
        if (textView != null) {
            textView.setText(getText(t));
        }
    }

    public EtsySpinnerArrayAdapterWithClickListener(Context context, Spinner spinner, int i, int i2) {
        super(context, i, R.id.text);
        setDropDownViewResource(i2);
        spinner.setAdapter(this);
        spinner.setOnItemSelectedListener(getOnItemSelectedListener());
    }

    public EtsySpinnerArrayAdapterWithClickListener(Context context, Spinner spinner, ArrayList<T> arrayList) {
        super(context, R.layout.spinner_list_item, R.id.text);
        setDropDownViewResource(R.layout.spinner_list_item_dropdown);
        addAll(arrayList);
        spinner.setAdapter(this);
        spinner.setOnItemSelectedListener(getOnItemSelectedListener());
    }
}
