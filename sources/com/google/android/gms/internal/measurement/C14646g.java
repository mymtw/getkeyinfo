package com.google.android.gms.internal.measurement;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.g */
public final class C14646g implements C14763p {

    /* renamed from: b */
    public final boolean f32844b;

    public C14646g(Boolean bool) {
        this.f32844b = bool == null ? false : bool.booleanValue();
    }

    /* renamed from: a */
    public final Iterator<C14763p> mo50482a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14646g) && this.f32844b == ((C14646g) obj).f32844b;
    }

    /* renamed from: g */
    public final C14763p mo50486g(String str, C14598c3 c3Var, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new C14813t(Boolean.toString(this.f32844b));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{Boolean.toString(this.f32844b), str}));
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f32844b).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f32844b);
    }

    public final C14763p zzd() {
        return new C14646g(Boolean.valueOf(this.f32844b));
    }

    public final Boolean zzg() {
        return Boolean.valueOf(this.f32844b);
    }

    public final Double zzh() {
        return Double.valueOf(true != this.f32844b ? ShadowDrawableWrapper.COS_45 : 1.0d);
    }

    public final String zzi() {
        return Boolean.toString(this.f32844b);
    }
}
