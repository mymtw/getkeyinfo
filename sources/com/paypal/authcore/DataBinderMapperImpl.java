package com.paypal.authcore;

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
    public static final SparseIntArray f37453a = new SparseIntArray(0);

    /* renamed from: com.paypal.authcore.DataBinderMapperImpl$a */
    public static class C17124a {

        /* renamed from: a */
        public static final SparseArray<String> f37454a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f37454a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* renamed from: com.paypal.authcore.DataBinderMapperImpl$b */
    public static class C17125b {

        /* renamed from: a */
        public static final HashMap<String, Integer> f37455a = new HashMap<>(0);
    }

    public final List<C2445e> collectDependencies() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.paypal.android.platform.authsdk.DataBinderMapperImpl());
        return arrayList;
    }

    public final String convertBrIdToString(int i) {
        return C17124a.f37454a.get(i);
    }

    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        if (f37453a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f37453a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public final int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = C17125b.f37455a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
