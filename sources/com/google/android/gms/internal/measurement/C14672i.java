package com.google.android.gms.internal.measurement;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.i */
public final class C14672i implements C14763p {

    /* renamed from: b */
    public final Double f32874b;

    public C14672i(Double d) {
        if (d == null) {
            this.f32874b = Double.valueOf(Double.NaN);
        } else {
            this.f32874b = d;
        }
    }

    /* renamed from: a */
    public final Iterator<C14763p> mo50482a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14672i)) {
            return false;
        }
        return this.f32874b.equals(((C14672i) obj).f32874b);
    }

    /* renamed from: g */
    public final C14763p mo50486g(String str, C14598c3 c3Var, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new C14813t(zzi());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{zzi(), str}));
    }

    public final int hashCode() {
        return this.f32874b.hashCode();
    }

    public final String toString() {
        return zzi();
    }

    public final C14763p zzd() {
        return new C14672i(this.f32874b);
    }

    public final Boolean zzg() {
        boolean z = false;
        if (!Double.isNaN(this.f32874b.doubleValue()) && this.f32874b.doubleValue() != ShadowDrawableWrapper.COS_45) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final Double zzh() {
        return this.f32874b;
    }

    public final String zzi() {
        if (Double.isNaN(this.f32874b.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f32874b.doubleValue())) {
            return this.f32874b.doubleValue() > ShadowDrawableWrapper.COS_45 ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f32874b.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((stripTrailingZeros.scale() > 0 ? stripTrailingZeros.precision() : stripTrailingZeros.scale()) - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : stripTrailingZeros.toPlainString();
    }
}
