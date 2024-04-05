package com.bugsnag.android;

import android.support.p013v4.media.C0072d;
import java.util.Map;

/* renamed from: com.bugsnag.android.z0 */
public final class C5939z0 implements Map.Entry<String, String> {

    /* renamed from: b */
    public final String f12718b;

    /* renamed from: c */
    public final String f12719c;

    public C5939z0(String str, String str2) {
        if (str != null) {
            this.f12718b = str;
            this.f12719c = str2;
            return;
        }
        throw new NullPointerException("FeatureFlags cannot have null name");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f12718b.equals(entry.getKey())) {
            String str = this.f12719c;
            Object value = entry.getValue();
            if (str == null) {
                if (value == null) {
                    return true;
                }
            } else if (str.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public final Object getKey() {
        return this.f12718b;
    }

    public final Object getValue() {
        return this.f12719c;
    }

    public final int hashCode() {
        int hashCode = this.f12718b.hashCode();
        String str = this.f12719c;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final Object setValue(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException("FeatureFlag is immutable");
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("FeatureFlag{name='");
        h.append(this.f12718b);
        h.append('\'');
        h.append(", variant='");
        h.append(this.f12719c);
        h.append('\'');
        h.append('}');
        return h.toString();
    }
}
