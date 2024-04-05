package com.paypal.pyplcheckout.home.view.adapters;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.paypal.pyplcheckout.interfaces.SelectedListener;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class CarouselAdapterViewHolder extends RecyclerView.C3084b0 {
    private final SelectedListener selectedListener;

    private CarouselAdapterViewHolder(View view, SelectedListener selectedListener2) {
        super(view);
        this.selectedListener = selectedListener2;
    }

    public /* synthetic */ CarouselAdapterViewHolder(View view, SelectedListener selectedListener2, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, selectedListener2);
    }

    public final SelectedListener getSelectedListener() {
        return this.selectedListener;
    }
}
