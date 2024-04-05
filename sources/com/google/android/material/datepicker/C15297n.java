package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.material.datepicker.n */
public abstract class C15297n<S> extends Fragment {
    public final LinkedHashSet<C15296m<S>> onSelectionChangedListeners = new LinkedHashSet<>();

    public boolean addOnSelectionChangedListener(C15296m<S> mVar) {
        return this.onSelectionChangedListeners.add(mVar);
    }

    public void clearOnSelectionChangedListeners() {
        this.onSelectionChangedListeners.clear();
    }

    public abstract DateSelector<S> getDateSelector();

    public boolean removeOnSelectionChangedListener(C15296m<S> mVar) {
        return this.onSelectionChangedListeners.remove(mVar);
    }
}
