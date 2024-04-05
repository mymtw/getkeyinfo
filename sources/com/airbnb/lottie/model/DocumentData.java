package com.airbnb.lottie.model;

import p003a2.C0023f;

public final class DocumentData {

    /* renamed from: a */
    public final String f10905a;

    /* renamed from: b */
    public final String f10906b;

    /* renamed from: c */
    public final double f10907c;

    /* renamed from: d */
    public final Justification f10908d;

    /* renamed from: e */
    public final int f10909e;

    /* renamed from: f */
    public final double f10910f;

    /* renamed from: g */
    public final double f10911g;

    /* renamed from: h */
    public final int f10912h;

    /* renamed from: i */
    public final int f10913i;

    /* renamed from: j */
    public final double f10914j;

    /* renamed from: k */
    public final boolean f10915k;

    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, double d, Justification justification, int i, double d2, double d3, int i2, int i3, double d4, boolean z) {
        this.f10905a = str;
        this.f10906b = str2;
        this.f10907c = d;
        this.f10908d = justification;
        this.f10909e = i;
        this.f10910f = d2;
        this.f10911g = d3;
        this.f10912h = i2;
        this.f10913i = i3;
        this.f10914j = d4;
        this.f10915k = z;
    }

    public final int hashCode() {
        String str = this.f10906b;
        int ordinal = this.f10908d.ordinal();
        long doubleToLongBits = Double.doubleToLongBits(this.f10910f);
        return ((((((ordinal + (((int) (((double) C0023f.m105e(str, this.f10905a.hashCode() * 31, 31)) + this.f10907c)) * 31)) * 31) + this.f10909e) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.f10912h;
    }
}
