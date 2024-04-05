package com.google.common.collect;

import com.google.common.base.C15791j;
import java.util.Map;

/* renamed from: com.google.common.collect.z1 */
public final class C16245z1 extends C16243z<Object, Object> {

    /* renamed from: b */
    public final /* synthetic */ Map.Entry f36338b;

    public C16245z1(Map.Entry entry) {
        this.f36338b = entry;
    }

    public final Object delegate() {
        return this.f36338b;
    }

    /* renamed from: e */
    public final Map.Entry<Object, Object> mo56041e() {
        return this.f36338b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return C15791j.m25606a(getKey(), entry.getKey()) && C15791j.m25606a(getValue(), entry.getValue());
    }

    public final Object setValue(Object obj) {
        obj.getClass();
        return super.setValue(obj);
    }
}
