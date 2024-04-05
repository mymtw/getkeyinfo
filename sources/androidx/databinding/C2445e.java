package androidx.databinding;

import android.view.View;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.databinding.e */
public abstract class C2445e {
    public List<C2445e> collectDependencies() {
        return Collections.emptyList();
    }

    public abstract String convertBrIdToString(int i);

    public abstract ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i);

    public abstract ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i);

    public abstract int getLayoutId(String str);
}
