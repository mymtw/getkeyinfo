package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.ThreadBound;
import com.facebook.stetho.common.UncheckedCallable;
import com.facebook.stetho.common.Util;
import java.util.HashMap;
import java.util.Map;

public abstract class Descriptor<E> implements NodeDescriptor<E> {
    private Host mHost;

    public interface Host extends ThreadBound {
        Descriptor<?> getDescriptor(Object obj);

        void onAttributeModified(Object obj, String str, String str2);

        void onAttributeRemoved(Object obj, String str);
    }

    public static Map<String, String> parseSetAttributesAsTextArg(String str) {
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        int length = str.length();
        String str2 = "";
        String str3 = str2;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '=') {
                str2 = sb.toString();
                sb.setLength(0);
            } else if (charAt == '\"') {
                if (z) {
                    str3 = sb.toString();
                    sb.setLength(0);
                }
                z = !z;
            } else if (charAt != ' ' || z) {
                sb.append(charAt);
            } else {
                hashMap.put(str2, str3);
            }
        }
        if (!str2.isEmpty() && !str3.isEmpty()) {
            hashMap.put(str2, str3);
        }
        return hashMap;
    }

    public final boolean checkThreadAccess() {
        return getHost().checkThreadAccess();
    }

    public final Host getHost() {
        return this.mHost;
    }

    public final void initialize(Host host) {
        Util.throwIfNull(host);
        Util.throwIfNotNull(this.mHost);
        this.mHost = host;
    }

    public final boolean isInitialized() {
        return this.mHost != null;
    }

    public final <V> V postAndWait(UncheckedCallable<V> uncheckedCallable) {
        return getHost().postAndWait(uncheckedCallable);
    }

    public final void postDelayed(Runnable runnable, long j) {
        getHost().postDelayed(runnable, j);
    }

    public final void removeCallbacks(Runnable runnable) {
        getHost().removeCallbacks(runnable);
    }

    public final void verifyThreadAccess() {
        getHost().verifyThreadAccess();
    }

    public final void postAndWait(Runnable runnable) {
        getHost().postAndWait(runnable);
    }
}
