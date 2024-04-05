package com.etsy.collagecompose;

import androidx.compose.p015ui.graphics.C1521g;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1606z;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;
import p288y.C8347f;
import p628nj.C18263b;

/* renamed from: com.etsy.collagecompose.o */
public final class C12171o implements C1530k0 {

    /* renamed from: a */
    public final AnchorDirection f27208a;

    /* renamed from: b */
    public final float f27209b;

    /* renamed from: c */
    public final float f27210c;

    /* renamed from: d */
    public final float f27211d;

    /* renamed from: e */
    public final float f27212e;

    public C12171o(AnchorDirection anchorDirection, float f, float f2, float f3, float f4) {
        C19383o.m32797g(anchorDirection, "anchorDirection");
        this.f27208a = anchorDirection;
        this.f27209b = f;
        this.f27210c = f2;
        this.f27211d = f3;
        this.f27212e = f4;
    }

    /* renamed from: a */
    public final C1606z mo3864a(long j, LayoutDirection layoutDirection, C7282b bVar) {
        float f;
        LayoutDirection layoutDirection2 = layoutDirection;
        C19383o.m32797g(layoutDirection2, "layoutDirection");
        C19383o.m32797g(bVar, "density");
        float f2 = (float) 2;
        float f3 = this.f27210c / f2;
        float f4 = this.f27212e;
        AnchorDirection anchorDirection = this.f27208a;
        float f5 = this.f27209b;
        boolean z = true;
        if (anchorDirection == AnchorDirection.None) {
            f = 0.0f;
        } else {
            boolean z2 = anchorDirection == AnchorDirection.Start || anchorDirection == AnchorDirection.End;
            if (f4 == 0.0f) {
                f = (z2 ? C8347f.m16654b(j) : C8347f.m16656d(j)) / f2;
            } else {
                float f6 = f5 + f3;
                f = z2 ? Float.max(f6, Float.min(f4, C8347f.m16654b(j) - f6)) : Float.max(f6, Float.min(f4, C8347f.m16656d(j) - f6));
            }
        }
        AnchorDirection anchorDirection2 = this.f27208a;
        AnchorDirection anchorDirection3 = AnchorDirection.Start;
        boolean z3 = anchorDirection2 == anchorDirection3 && layoutDirection2 == LayoutDirection.Ltr;
        AnchorDirection anchorDirection4 = AnchorDirection.End;
        boolean z4 = anchorDirection2 == anchorDirection4 && layoutDirection2 == LayoutDirection.Rtl;
        boolean z5 = anchorDirection2 == anchorDirection4 && layoutDirection2 == LayoutDirection.Ltr;
        boolean z6 = anchorDirection2 == anchorDirection3 && layoutDirection2 == LayoutDirection.Rtl;
        boolean z7 = z3 || z4;
        boolean z8 = z5 || z6;
        AnchorDirection anchorDirection5 = AnchorDirection.Top;
        boolean z9 = anchorDirection2 == anchorDirection5;
        AnchorDirection anchorDirection6 = AnchorDirection.Bottom;
        if (anchorDirection2 != anchorDirection6) {
            z = false;
        }
        float f7 = z9 ? this.f27211d : 0.0f;
        float f8 = z7 ? this.f27211d : 0.0f;
        float d = z8 ? C8347f.m16656d(j) - this.f27211d : C8347f.m16656d(j);
        float b = z ? C8347f.m16654b(j) - this.f27211d : C8347f.m16654b(j);
        C1521g d2 = C18263b.m30838d();
        d2.reset();
        float f9 = this.f27209b * f2;
        d2.f3297b.set(f8, f7, f9 + f8, f9 + f7);
        boolean z10 = z7;
        AnchorDirection anchorDirection7 = anchorDirection6;
        d2.f3296a.arcTo(d2.f3297b, 180.0f, 90.0f, false);
        if (this.f27208a == anchorDirection5) {
            float f10 = f8 + f;
            d2.mo6286m(f10 - f3, f7);
            d2.mo6286m(f10, f7 - this.f27211d);
            d2.mo6286m(f10 + f3, f7);
            d2.mo6286m(d - (this.f27209b * f2), f7);
        } else {
            d2.mo6286m(d - (this.f27209b * f2), f7);
        }
        float f11 = this.f27209b * f2;
        d2.f3297b.set(d - f11, f7, d, f11 + f7);
        d2.f3296a.arcTo(d2.f3297b, 270.0f, 90.0f, false);
        if (z8) {
            float f12 = f7 + f;
            d2.mo6286m(d, f12 - f3);
            d2.mo6286m(this.f27211d + d, f12);
            d2.mo6286m(d, f12 + f3);
            d2.mo6286m(d, b - this.f27209b);
        } else {
            d2.mo6286m(d, b - this.f27209b);
        }
        float f13 = this.f27209b * f2;
        d2.f3297b.set(d - f13, b - f13, d, b);
        d2.f3296a.arcTo(d2.f3297b, 0.0f, 90.0f, false);
        if (this.f27208a == anchorDirection7) {
            float f14 = f8 + f;
            d2.mo6286m(f14 + f3, b);
            d2.mo6286m(f14, this.f27211d + b);
            d2.mo6286m(f14 - f3, b);
            d2.mo6286m((this.f27209b * f2) + f8, b);
        } else {
            d2.mo6286m((this.f27209b * f2) + f8, b);
        }
        float f15 = this.f27209b * f2;
        d2.f3297b.set(f8, b - f15, f15 + f8, b);
        d2.f3296a.arcTo(d2.f3297b, 90.0f, 90.0f, false);
        if (z10) {
            float f16 = f + f7;
            d2.mo6286m(f8, f16 + f3);
            d2.mo6286m(f8 - this.f27211d, f16);
            d2.mo6286m(f8, f16 - f3);
            d2.mo6286m(f8, f7 + this.f27209b);
        } else {
            d2.mo6286m(f8, f7 + this.f27209b);
        }
        d2.close();
        return new C1606z.C1607a(d2);
    }
}
