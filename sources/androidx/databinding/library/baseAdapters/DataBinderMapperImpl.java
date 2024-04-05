package androidx.databinding.library.baseAdapters;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.C2445e;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends C2445e {

    /* renamed from: a */
    public static final SparseIntArray f5715a = new SparseIntArray(0);

    /* renamed from: androidx.databinding.library.baseAdapters.DataBinderMapperImpl$a */
    public static class C2458a {

        /* renamed from: a */
        public static final SparseArray<String> f5716a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f5716a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* renamed from: androidx.databinding.library.baseAdapters.DataBinderMapperImpl$b */
    public static class C2459b {

        /* renamed from: a */
        public static final HashMap<String, Integer> f5717a = new HashMap<>(0);
    }

    public final List<C2445e> collectDependencies() {
        return new ArrayList(0);
    }

    public final String convertBrIdToString(int i) {
        return C2458a.f5716a.get(i);
    }

    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        if (f5715a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public final int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = C2459b.f5717a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f5715a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
