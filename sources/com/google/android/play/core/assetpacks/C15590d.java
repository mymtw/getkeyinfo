package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.d */
public abstract class C15590d {
    /* renamed from: c */
    public static C15607h0 m25369c(Bundle bundle, C15671x0 x0Var, C15581a2 a2Var, List list, C15579a0 a0Var) {
        Bundle bundle2 = bundle;
        ArrayList<String> stringArrayList = bundle2.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            hashMap.put(str, AssetPackState.m25235i(bundle2, str, x0Var, a2Var, a0Var));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            hashMap.put(str2, AssetPackState.m25234h(str2, 4, 0, 0, 0, ShadowDrawableWrapper.COS_45, 1, "", ""));
        }
        return new C15607h0(bundle2.getLong("total_bytes_to_download"), hashMap);
    }

    /* renamed from: a */
    public abstract Map<String, AssetPackState> mo55389a();

    /* renamed from: b */
    public abstract long mo55390b();
}
