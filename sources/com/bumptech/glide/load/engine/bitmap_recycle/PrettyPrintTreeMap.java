package com.bumptech.glide.load.engine.bitmap_recycle;

import android.support.p013v4.media.C0072d;
import java.util.Map;
import java.util.TreeMap;

class PrettyPrintTreeMap<K, V> extends TreeMap<K, V> {
    public String toString() {
        StringBuilder h = C0072d.m201h("( ");
        for (Map.Entry entry : entrySet()) {
            h.append('{');
            h.append(entry.getKey());
            h.append(':');
            h.append(entry.getValue());
            h.append("}, ");
        }
        if (!isEmpty()) {
            h.replace(h.length() - 2, h.length(), "");
        }
        h.append(" )");
        return h.toString();
    }
}
