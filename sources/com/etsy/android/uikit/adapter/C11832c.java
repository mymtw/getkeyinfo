package com.etsy.android.uikit.adapter;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.uikit.viewholder.C11992g;
import p415of.C13181j;

/* renamed from: com.etsy.android.uikit.adapter.c */
public abstract class C11832c<T> extends C11829a<T> {

    /* renamed from: b */
    public C13181j f26308b;

    public C11832c(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public RecyclerView.C3084b0 onCreateFooterViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.C3084b0 onCreateFooterViewHolder = super.onCreateFooterViewHolder(viewGroup, i);
        return onCreateFooterViewHolder == null ? (i == 502 || i == 503) ? new C11992g(this.mInflater.inflate(R.layout.list_item_loading, viewGroup, false)) : onCreateFooterViewHolder : onCreateFooterViewHolder;
    }

    public final void onPostBindViewHolder(int i) {
        if (this.f26308b != null && i == getItemCount() - this.f26308b.getLoadTriggerPosition()) {
            this.f26308b.onScrolledToLoadTrigger();
        }
    }
}
