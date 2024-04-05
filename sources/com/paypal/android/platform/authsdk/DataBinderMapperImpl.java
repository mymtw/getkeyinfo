package com.paypal.android.platform.authsdk;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.C2445e;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.paypal.android.platform.authsdk.databinding.FragmentOtpErrorBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends C2445e {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP;
    private static final int LAYOUT_FRAGMENTOTPERROR = 1;

    public static class InnerBrLookup {
        public static final SparseArray<String> sKeys;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            sKeys = sparseArray;
            sparseArray.put(0, "_all");
        }

        private InnerBrLookup() {
        }
    }

    public static class InnerLayoutIdLookup {
        public static final HashMap<String, Integer> sKeys;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(1);
            sKeys = hashMap;
            hashMap.put("layout/fragment_otp_error_0", Integer.valueOf(C17049R.C17053layout.fragment_otp_error));
        }

        private InnerLayoutIdLookup() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray;
        sparseIntArray.put(C17049R.C17053layout.fragment_otp_error, 1);
    }

    public List<C2445e> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    public String convertBrIdToString(int i) {
        return InnerBrLookup.sKeys.get(i);
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        } else if (i2 != 1) {
            return null;
        } else {
            if ("layout/fragment_otp_error_0".equals(tag)) {
                return new FragmentOtpErrorBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for fragment_otp_error is invalid. Received: " + tag);
        }
    }

    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = InnerLayoutIdLookup.sKeys.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
