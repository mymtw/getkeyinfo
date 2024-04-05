package com.etsy.android.uikit.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p371if.C12953a;

/* renamed from: com.etsy.android.uikit.adapter.a */
public abstract class C11829a<T> extends RecyclerView.Adapter<RecyclerView.C3084b0> {
    public static final int VIEW_TYPE_FOOTER = 501;
    public static final int VIEW_TYPE_HEADER = 500;
    public FragmentActivity mContext;
    public final ArrayList<C12953a> mFooters = new ArrayList<>();
    public final ArrayList<C12953a> mHeaders = new ArrayList<>();
    public LayoutInflater mInflater;
    public C11830a<T> mItemRemovedListener;
    public final ArrayList<T> mItems = new ArrayList<>();

    /* renamed from: com.etsy.android.uikit.adapter.a$a */
    public interface C11830a<T> {
        /* renamed from: a */
        void mo38308a();
    }

    public C11829a(FragmentActivity fragmentActivity) {
        this.mContext = fragmentActivity;
        this.mInflater = LayoutInflater.from(fragmentActivity);
    }

    public void addFooter(int i) {
        this.mFooters.add(new C12953a(i));
        notifyItemInserted(getItemCount() - 1);
    }

    public void addHeader(int i) {
        this.mHeaders.add(new C12953a(i));
        notifyItemInserted(this.mHeaders.size() - 1);
    }

    public void addItem(T t) {
        int dataItemCount = getDataItemCount() + this.mHeaders.size();
        this.mItems.add(t);
        notifyItemInserted(dataItemCount);
    }

    public void addItemAtPosition(int i, T t) {
        this.mItems.add(i, t);
        notifyItemInserted(this.mHeaders.size() + i);
    }

    public void addItems(Collection<? extends T> collection) {
        int dataItemCount = getDataItemCount() + this.mHeaders.size();
        this.mItems.addAll(collection);
        notifyItemRangeInserted(dataItemCount, collection.size());
    }

    public void clear() {
        int itemCount = getItemCount();
        this.mHeaders.clear();
        this.mItems.clear();
        this.mFooters.clear();
        notifyItemRangeRemoved(0, itemCount);
    }

    public void clearData() {
        int dataItemCount = getDataItemCount();
        this.mItems.clear();
        notifyItemRangeRemoved(this.mHeaders.size(), dataItemCount);
    }

    public int getDataItemCount() {
        return this.mItems.size();
    }

    public int getDataItemPositionForAdapterPosition(int i) {
        if (i == -1) {
            return -1;
        }
        if (this.mHeaders.size() > 0 && i < this.mHeaders.size()) {
            return -1;
        }
        if (this.mFooters.size() > 0) {
            if (i > (this.mHeaders.size() + getDataItemCount()) - 1) {
                return -1;
            }
        }
        return i - this.mHeaders.size();
    }

    public int getFooterCount() {
        return this.mFooters.size();
    }

    public final int getFooterItemViewType(int i) {
        int size = (this.mFooters.size() - getItemCount()) + i;
        if (this.mFooters.size() == 0 || size < 0) {
            return -1;
        }
        return this.mFooters.get(size).f28532a;
    }

    public int getHeaderCount() {
        return this.mHeaders.size();
    }

    public final int getHeaderItemViewType(int i) {
        if (this.mHeaders.size() == 0 || i > this.mHeaders.size() - 1 || i < 0) {
            return -1;
        }
        return this.mHeaders.get(i).f28532a;
    }

    public T getItem(int i) {
        if (this.mHeaders.size() > 0 && i < this.mHeaders.size()) {
            return null;
        }
        if (this.mFooters.size() > 0) {
            if (i > (this.mHeaders.size() + getDataItemCount()) - 1) {
                return null;
            }
        }
        return this.mItems.get(i - this.mHeaders.size());
    }

    public int getItemCount() {
        return this.mHeaders.size() + this.mFooters.size() + getDataItemCount();
    }

    public final int getItemViewType(int i) {
        if (this.mHeaders.size() > 0 && i < this.mHeaders.size()) {
            return getHeaderItemViewType(i);
        }
        if (this.mFooters.size() > 0) {
            if (i > this.mHeaders.size() + (getDataItemCount() - 1)) {
                return getFooterItemViewType(i);
            }
        }
        return getListItemViewType(i);
    }

    public List<T> getItems() {
        return this.mItems;
    }

    public abstract int getListItemViewType(int i);

    public int getSpanSize(int i, int i2) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 500 || itemViewType == 501) {
            return i2;
        }
        return 1;
    }

    public void onBindFooterViewHolder(RecyclerView.C3084b0 b0Var, int i) {
    }

    public void onBindHeaderViewHolder(RecyclerView.C3084b0 b0Var, int i) {
    }

    public abstract void onBindListItemViewHolder(RecyclerView.C3084b0 b0Var, int i);

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        if (this.mHeaders.size() <= 0 || i >= this.mHeaders.size()) {
            if (this.mFooters.size() > 0) {
                if (i > this.mHeaders.size() + (getDataItemCount() - 1)) {
                    onBindFooterViewHolder(b0Var, i);
                }
            }
            onBindListItemViewHolder(b0Var, i);
        } else {
            onBindHeaderViewHolder(b0Var, i);
        }
        onPostBindViewHolder(i);
    }

    public RecyclerView.C3084b0 onCreateFooterViewHolder(ViewGroup viewGroup, int i) {
        return null;
    }

    public RecyclerView.C3084b0 onCreateHeaderViewHolder(ViewGroup viewGroup, int i) {
        return null;
    }

    public abstract RecyclerView.C3084b0 onCreateListItemViewHolder(ViewGroup viewGroup, int i);

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        for (int i2 = 0; i2 < this.mHeaders.size(); i2++) {
            if (this.mHeaders.get(i2).f28532a == i) {
                return onCreateHeaderViewHolder(viewGroup, i);
            }
        }
        for (int i3 = 0; i3 < this.mFooters.size(); i3++) {
            if (this.mFooters.get(i3).f28532a == i) {
                return onCreateFooterViewHolder(viewGroup, i);
            }
        }
        return onCreateListItemViewHolder(viewGroup, i);
    }

    public void onPostBindViewHolder(int i) {
    }

    public void removeFooter(int i) {
        if (this.mFooters.size() != 0) {
            int size = this.mFooters.size() - 1;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                } else if (this.mFooters.get(size).f28532a == i) {
                    break;
                } else {
                    size--;
                }
            }
            if (size >= 0) {
                this.mFooters.remove(size);
                notifyItemRemoved(this.mHeaders.size() + getDataItemCount() + size);
            }
        }
    }

    public void removeHeader(int i) {
        if (this.mHeaders.size() != 0) {
            int size = this.mHeaders.size() - 1;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                } else if (this.mHeaders.get(size).f28532a == i) {
                    break;
                } else {
                    size--;
                }
            }
            if (size >= 0) {
                this.mHeaders.remove(size);
                notifyItemRemoved(size);
            }
        }
    }

    public void removeItem(int i) {
        this.mItems.remove(i);
        C11830a<T> aVar = this.mItemRemovedListener;
        if (aVar != null) {
            aVar.mo38308a();
        }
        notifyItemRemoved(this.mHeaders.size() + i);
    }

    public void replaceItem(int i, T t) {
        this.mItems.remove(i);
        this.mItems.add(i, t);
        notifyItemChanged(i);
    }

    public void replaceList(Collection<? extends T> collection) {
        this.mItems.clear();
        this.mItems.addAll(collection);
        notifyDataSetChanged();
    }

    public void setItemRemovedListener(C11830a<T> aVar) {
        this.mItemRemovedListener = aVar;
    }

    public void removeItem(T t) {
        int indexOf = this.mItems.indexOf(t);
        if (indexOf != -1) {
            removeItem(indexOf);
        }
    }
}
