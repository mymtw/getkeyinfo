package com.bugsnag.android;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.util.HashMap;

/* renamed from: com.bugsnag.android.l2 */
public final class C5804l2 {
    @SuppressLint({"UseSparseArrays"})

    /* renamed from: a */
    public static final HashMap f12414a;

    static {
        HashMap hashMap = new HashMap();
        f12414a = hashMap;
        hashMap.put(1, "DiskWrite");
        hashMap.put(2, "DiskRead");
        hashMap.put(4, "NetworkOperation");
        hashMap.put(8, "CustomSlowCall");
        hashMap.put(16, "ResourceMismatch");
        hashMap.put(256, "CursorLeak");
        hashMap.put(Integer.valueOf(RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN), "CloseableLeak");
        hashMap.put(Integer.valueOf(RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE), "ActivityLeak");
        hashMap.put(Integer.valueOf(RecyclerView.C3084b0.FLAG_MOVED), "InstanceLeak");
        hashMap.put(Integer.valueOf(RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT), "RegistrationLeak");
        hashMap.put(8192, "FileUriLeak");
        hashMap.put(Integer.valueOf(PrimitiveArrayBuilder.SMALL_CHUNK_SIZE), "CleartextNetwork");
    }

    /* renamed from: a */
    public static String m11580a(String str) {
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf("violation=");
            if (lastIndexOf == -1) {
                return null;
            }
            String replace = str.substring(lastIndexOf).replace("violation=", "");
            if (!TextUtils.isDigitsOnly(replace)) {
                return null;
            }
            return (String) f12414a.get(Integer.valueOf(replace));
        }
        throw new IllegalArgumentException();
    }
}
