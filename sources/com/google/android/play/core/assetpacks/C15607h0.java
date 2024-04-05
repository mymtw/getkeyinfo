package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;
import p003a2.C0023f;

/* renamed from: com.google.android.play.core.assetpacks.h0 */
public final class C15607h0 extends C15590d {

    /* renamed from: a */
    public final long f35167a;

    /* renamed from: b */
    public final Map f35168b;

    public C15607h0(long j, HashMap hashMap) {
        this.f35167a = j;
        this.f35168b = hashMap;
    }

    /* renamed from: a */
    public final Map<String, AssetPackState> mo55389a() {
        return this.f35168b;
    }

    /* renamed from: b */
    public final long mo55390b() {
        return this.f35167a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15590d) {
            C15590d dVar = (C15590d) obj;
            return this.f35167a == dVar.mo55390b() && this.f35168b.equals(dVar.mo55389a());
        }
    }

    public final int hashCode() {
        long j = this.f35167a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f35168b.hashCode();
    }

    public final String toString() {
        long j = this.f35167a;
        String obj = this.f35168b.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(j);
        sb.append(", packStates=");
        return C0023f.m110k(sb, obj, "}");
    }
}
