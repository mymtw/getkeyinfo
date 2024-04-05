package com.etsy.android.uikit.adapter;

import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.models.BaseModel;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public abstract class BaseModelArrayAdapter<T extends BaseModel> extends ArrayAdapter<T> {
    private Reference<FragmentActivity> mActivity;
    private int mLayoutId;

    public BaseModelArrayAdapter(FragmentActivity fragmentActivity, int i) {
        super(fragmentActivity.getApplicationContext(), i);
        this.mActivity = new WeakReference(fragmentActivity);
        this.mLayoutId = i;
    }

    public FragmentActivity getActivityContext() {
        return this.mActivity.get();
    }

    public int getLayoutId() {
        return this.mLayoutId;
    }

    public LayoutInflater getLayoutInflater() {
        return LayoutInflater.from(this.mActivity.get());
    }

    public int getRealCount() {
        return getCount();
    }

    public boolean isValidPosition(int i) {
        return i >= 0 && i < getCount() && getItem(i) != null;
    }

    public void refreshActivity(FragmentActivity fragmentActivity) {
        this.mActivity = new WeakReference(fragmentActivity);
    }

    public T getItem(int i) {
        return (BaseModel) super.getItem(i);
    }
}
