package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.b */
public final class C14581b {

    /* renamed from: a */
    public String f32751a;

    /* renamed from: b */
    public final long f32752b;

    /* renamed from: c */
    public final HashMap f32753c;

    public C14581b(String str, long j, HashMap hashMap) {
        this.f32751a = str;
        this.f32752b = j;
        HashMap hashMap2 = new HashMap();
        this.f32753c = hashMap2;
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
    }

    /* renamed from: a */
    public final C14581b clone() {
        return new C14581b(this.f32751a, this.f32752b, new HashMap(this.f32753c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14581b)) {
            return false;
        }
        C14581b bVar = (C14581b) obj;
        if (this.f32752b == bVar.f32752b && this.f32751a.equals(bVar.f32751a)) {
            return this.f32753c.equals(bVar.f32753c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f32751a.hashCode();
        long j = this.f32752b;
        return this.f32753c.hashCode() + (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f32751a;
        long j = this.f32752b;
        String obj = this.f32753c.toString();
        StringBuilder sb = new StringBuilder(obj.length() + String.valueOf(str).length() + 55);
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
}
