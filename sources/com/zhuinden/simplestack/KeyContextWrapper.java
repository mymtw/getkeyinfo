package com.zhuinden.simplestack;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

public class KeyContextWrapper extends ContextWrapper {
    public static final String TAG = "Backstack.KEY";
    public final Object key;
    public LayoutInflater layoutInflater;

    public KeyContextWrapper(Context context, Object obj) {
        super(context);
        if (obj != null) {
            this.key = obj;
            return;
        }
        throw new IllegalArgumentException("Key cannot be null!");
    }

    @SuppressLint({"WrongConstant"})
    public static <T> T getKey(Context context) {
        T systemService = context.getSystemService(TAG);
        if (systemService != null) {
            return systemService;
        }
        throw new IllegalStateException("The context is supposed to contain a key, but it does not!");
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return TAG.equals(str) ? this.key : super.getSystemService(str);
        }
        if (this.layoutInflater == null) {
            this.layoutInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.layoutInflater;
    }
}
