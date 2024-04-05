package com.etsy.android.stylekit.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.adapters.CollageArrayAdapter;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CollageSelectAdapter extends CollageArrayAdapter<CharSequence> implements AdapterView.OnItemClickListener {
    public static final int $stable = 8;
    private final int layoutRes;
    private int selectedPosition;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageSelectAdapter(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? R.layout.clg_select_item : i);
    }

    public final int getLayoutRes() {
        return this.layoutRes;
    }

    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(this.layoutRes, viewGroup, false);
        }
        ((TextView) view.findViewById(R.id.clg_select_dropdown_item_text)).setText((CharSequence) getItem(i));
        View findViewById = view.findViewById(R.id.clg_select_dropdown_item_checkmark);
        if (i == this.selectedPosition) {
            findViewById.setVisibility(0);
            setA11yFocus(view);
        } else {
            findViewById.setVisibility(4);
            if (i == 0) {
                setA11yFocus(view);
            }
        }
        return view;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.selectedPosition = i;
    }

    public final void setSelectedPosition(int i) {
        this.selectedPosition = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageSelectAdapter(Context context, int i) {
        super(context, i, (int) R.id.clg_select_dropdown_item_text);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.layoutRes = i;
        this.selectedPosition = -1;
    }
}
