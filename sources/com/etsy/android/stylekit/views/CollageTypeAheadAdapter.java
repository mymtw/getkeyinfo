package com.etsy.android.stylekit.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.appboy.Constants;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CollageTypeAheadAdapter extends ArrayAdapter<String> implements AdapterView.OnItemClickListener {
    public static final int $stable = 8;
    private final int layoutRes;
    private String typedText;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageTypeAheadAdapter(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? R.layout.clg_select_item : i);
    }

    public final int getLayoutRes() {
        return this.layoutRes;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(this.layoutRes, viewGroup, false);
        }
        ((TextView) view.findViewById(R.id.clg_select_dropdown_item_text)).setText((CharSequence) getItem(i));
        View findViewById = view.findViewById(R.id.clg_select_dropdown_item_checkmark);
        if (C19383o.m32792b(getItem(i), this.typedText)) {
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(4);
        }
        return view;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.typedText = (String) getItem(i);
    }

    public final void onTextChanged(String str) {
        C19383o.m32797g(str, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
        this.typedText = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageTypeAheadAdapter(Context context, int i) {
        super(context, i, R.id.clg_select_dropdown_item_text);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.layoutRes = i;
    }
}
