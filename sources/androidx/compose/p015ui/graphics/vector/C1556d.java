package androidx.compose.p015ui.graphics.vector;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: androidx.compose.ui.graphics.vector.d */
public abstract class C1556d {

    /* renamed from: a */
    public final boolean f3458a;

    /* renamed from: b */
    public final boolean f3459b;

    /* renamed from: androidx.compose.ui.graphics.vector.d$a */
    public static final class C1557a extends C1556d {

        /* renamed from: c */
        public final float f3460c;

        /* renamed from: d */
        public final float f3461d;

        /* renamed from: e */
        public final float f3462e;

        /* renamed from: f */
        public final boolean f3463f;

        /* renamed from: g */
        public final boolean f3464g;

        /* renamed from: h */
        public final float f3465h;

        /* renamed from: i */
        public final float f3466i;

        public C1557a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3);
            this.f3460c = f;
            this.f3461d = f2;
            this.f3462e = f3;
            this.f3463f = z;
            this.f3464g = z2;
            this.f3465h = f4;
            this.f3466i = f5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1557a)) {
                return false;
            }
            C1557a aVar = (C1557a) obj;
            return C19383o.m32792b(Float.valueOf(this.f3460c), Float.valueOf(aVar.f3460c)) && C19383o.m32792b(Float.valueOf(this.f3461d), Float.valueOf(aVar.f3461d)) && C19383o.m32792b(Float.valueOf(this.f3462e), Float.valueOf(aVar.f3462e)) && this.f3463f == aVar.f3463f && this.f3464g == aVar.f3464g && C19383o.m32792b(Float.valueOf(this.f3465h), Float.valueOf(aVar.f3465h)) && C19383o.m32792b(Float.valueOf(this.f3466i), Float.valueOf(aVar.f3466i));
        }

        public final int hashCode() {
            int c = C0023f.m104c(this.f3462e, C0023f.m104c(this.f3461d, Float.hashCode(this.f3460c) * 31, 31), 31);
            boolean z = this.f3463f;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (c + (z ? 1 : 0)) * 31;
            boolean z3 = this.f3464g;
            if (!z3) {
                z2 = z3;
            }
            return Float.hashCode(this.f3466i) + C0023f.m104c(this.f3465h, (i + (z2 ? 1 : 0)) * 31, 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ArcTo(horizontalEllipseRadius=");
            h.append(this.f3460c);
            h.append(", verticalEllipseRadius=");
            h.append(this.f3461d);
            h.append(", theta=");
            h.append(this.f3462e);
            h.append(", isMoreThanHalf=");
            h.append(this.f3463f);
            h.append(", isPositiveArc=");
            h.append(this.f3464g);
            h.append(", arcStartX=");
            h.append(this.f3465h);
            h.append(", arcStartY=");
            return C0388a.m1048d(h, this.f3466i, ')');
        }
    }

    /* renamed from: androidx.compose.ui.graphics.vector.d$b */
    public static final class C1558b extends C1556d {

        /* renamed from: c */
        public static final C1558b f3467c = new C1558b();

        public C1558b() {
            super(false, false, 3);
        }
    }

    /* renamed from: androidx.compose.ui.graphics.vector.d$c */
    public static final class C1559c extends C1556d {

        /* renamed from: c */
        public final float f3468c;

        /* renamed from: d */
        public final float f3469d;

        /* renamed from: e */
        public final float f3470e;

        /* renamed from: f */
        public final float f3471f;

        /* renamed from: g */
        public final float f3472g;

        /* renamed from: h */
        public final float f3473h;

        public C1559c(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2);
            this.f3468c = f;
            this.f3469d = f2;
            this.f3470e = f3;
            this.f3471f = f4;
            this.f3472g = f5;
            this.f3473h = f6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1559c)) {
                return false;
            }
            C1559c cVar = (C1559c) obj;
            return C19383o.m32792b(Float.valueOf(this.f3468c), Float.valueOf(cVar.f3468c)) && C19383o.m32792b(Float.valueOf(this.f3469d), Float.valueOf(cVar.f3469d)) && C19383o.m32792b(Float.valueOf(this.f3470e), Float.valueOf(cVar.f3470e)) && C19383o.m32792b(Float.valueOf(this.f3471f), Float.valueOf(cVar.f3471f)) && C19383o.m32792b(Float.valueOf(this.f3472g), Float.valueOf(cVar.f3472g)) && C19383o.m32792b(Float.valueOf(this.f3473h), Float.valueOf(cVar.f3473h));
        }

        public final int hashCode() {
            return Float.hashCode(this.f3473h) + C0023f.m104c(this.f3472g, C0023f.m104c(this.f3471f, C0023f.m104c(this.f3470e, C0023f.m104c(this.f3469d, Float.hashCode(this.f3468c) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("CurveTo(x1=");
            h.append(this.f3468c);
            h.append(", y1=");
            h.append(this.f3469d);
            h.append(", x2=");
            h.append(this.f3470e);
            h.append(", y2=");
            h.append(this.f3471f);
            h.append(", x3=");
            h.append(this.f3472g);
            h.append(", y3=");
            return C0388a.m1048d(h, this.f3473h, ')');
        }
    }

    /* renamed from: androidx.compose.ui.graphics.vector.d$d */
    public static final class C1560d extends C1556d {

        /* renamed from: c */
        public final float f3474c;

        public C1560d(float f) {
            super(false, false, 3);
            this.f3474c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1560d) && C19383o.m32792b(Float.valueOf(this.f3474c), Float.valueOf(((C1560d) obj).f3474c));
        }

        public final int hashCode() {
            return Float.hashCode(this.f3474c);
        }

        public final String toString() {
            return C0388a.m1048d(C0072d.m201h("HorizontalTo(x="), this.f3474c, ')');
        }
    }

    /* renamed from: androidx.compose.ui.graphics.vector.d$e */
    public static final class C1561e extends C1556d {

        /* renamed from: c */
        public final float f3475c;

        /* renamed from: d */
        public final float f3476d;

        public C1561e(float f, float f2) {
            super(false, false, 3);
            this.f3475c = f;
            this.f3476d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1561e)) {
                return false;
            }
            C1561e eVar = (C1561e) obj;
            return C19383o.m32792b(Float.valueOf(this.f3475c), Float.valueOf(eVar.f3475c)) && C19383o.m32792b(Float.valueOf(this.f3476d), Float.valueOf(eVar.f3476d));
        }

        public final int hashCode() {
            return Float.hashCode(this.f3476d) + (Float.hashCode(this.f3475c) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("LineTo(x=");
            h.append(this.f3475c);
            h.append(", y=");
            return C0388a.m1048d(h, this.f3476d, ')');
        }
    }

    /* renamed from: androidx.compose.ui.graphics.vector.d$f */
    public static final class C1562f extends C1556d {

        /* renamed from: c */
        public final float f3477c;

        /* renamed from: d */
        public final float f3478d;

        public C1562f(float f, float f2) {
            super(false, false, 3);
            this.f3477c = f;
            this.f3478d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1562f)) {
                return false;
            }
            C1562f fVar = (C1562f) obj;
            return C19383o.m32792b(Float.valueOf(this.f3477c), Float.valueOf(fVar.f3477c)) && C19383o.m32792b(Float.valueOf(this.f3478d), Float.valueOf(fVar.f3478d));
        }

        public final int hashCode() {
            return Float.hashCode(this.f3478d) + (Float.hashCode(this.f3477c) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("MoveTo(x=");
            h.append(this.f3477c);
            h.append(", y=");
            return C0388a.m1048d(h, this.f3478d, ')');
        }
    }

    /* renamed from: androidx.compose.ui.graphics.vector.d$g */
    public static final class C1563g extends C1556d {

        /* renamed from: c */
        public final float f3479c;

        /* renamed from: d */
        public final float f3480d;

        /* renamed from: e */
        public final float f3481e;

        /* renamed from: f */
        public final float f3482f;

        public C1563g(float f, float f2, float f3, float f4) {
            super(false, true, 1);
            this.f3479c = f;
            this.f3480d = f2;
            this.f3481e = f3;
            this.f3482f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1563g)) {
                return false;
            }
            C1563g gVar = (C1563g) obj;
            return C19383o.m32792b(Float.valueOf(this.f3479c), Float.valueOf(gVar.f3479c)) && C19383o.m32792b(Float.valueOf(this.f3480d), Float.valueOf(gVar.f3480d)) && C19383o.m32792b(Float.valueOf(this.f3481e), Float.valueOf(gVar.f3481e)) && C19383o.m32792b(Float.valueOf(this.f3482f), Float.valueOf(gVar.f3482f));
        }

        public final int hashCode() {
            return Float.hashCode(this.f3482f) + C0023f.m104c(this.f3481e, C0023f.m104c(this.f3480d, Float.hashCode(this.f3479c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("QuadTo(x1=");
            h.append(this.f3479c);
            h.append(", y1=");
            h.append(this.f3480d);
            h.append(", x2=");
            h.append(this.f3481e);
            h.append(", y2=");
            return C0388a.m1048d(h, this.f3482f, ')');
        }
    }

    /* renamed from: androidx.compose.ui.graphics.vector.d$h */
    public static final class C1564h extends C1556d {

        /* renamed from: c */
        public final float f3483c;

        /* renamed from: d */
        public final float f3484d;

        /* renamed from: e */
        public final float f3485e;

        /* renamed from: f */
        public final float f3486f;

        public C1564h(float f, float f2, float f3, float f4) {
            super(true, false, 2);
            this.f3483c = f;
            this.f3484d = f2;
            this.f3485e = f3;
            this.f3486f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1564h)) {
                return false;
            }
            C1564h hVar = (C1564h) obj;
            return C19383o.m32792b(Float.valueOf(this.f3483c), Float.valueOf(hVar.f3483c)) && C19383o.m32792b(Float.valueOf(this.f3484d), Float.valueOf(hVar.f3484d)) && C19383o.m32792b(Float.valueOf(this.f3485e), Float.valueOf(hVar.f3485e)) && C19383o.m32792b(Float.valueOf(this.f3486f), Float.valueOf(hVar.f3486f));
        }

        public final int hashCode() {
            return Float.hashCode(this.f3486f) + C0023f.m104c(this.f3485e, C0023f.m104c(this.f3484d, Float.hashCode(this.f3483c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ReflectiveCurveTo(x1=");
            h.append(this.f3483c);
            h.append(", y1=");
            h.append(this.f3484d);
            h.append(", x2=");
            h.append(this.f3485e);
            h.append(", y2=");
            return C0388a.m1048d(h, this.f3486f, ')');
        }
    }

    /* renamed from: androidx.compose.ui.graphics.vector.d$i */
    public static final class C1565i extends C1556d {

        /* renamed from: c */
        public final float f3487c;

        /* renamed from: d */
        public final float f3488d;

        public C1565i(float f, float f2) {
            super(false, true, 1);
            this.f3487c = f;
            this.f3488d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1565i)) {
                return false;
            }
            C1565i iVar = (C1565i) obj;
            return C19383o.m32792b(Float.valueOf(this.f3487c), Float.valueOf(iVar.f3487c)) && C19383o.m32792b(Float.valueOf(this.f3488d), Float.valueOf(iVar.f3488d));
        }

        public final int hashCode() {
            return Float.hashCode(this.f3488d) + (Float.hashCode(this.f3487c) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ReflectiveQuadTo(x=");
            h.append(this.f3487c);
            h.append(", y=");
            return C0388a.m1048d(h, this.f3488d, ')');
        }
    }

    /* renamed from: androidx.compose.ui.graphics.vector.d$j */
    public static final class C1566j extends C1556d {

        /* renamed from: c */
        public final float f3489c;

        /* renamed from: d */
        public final float f3490d;

        /* renamed from: e */
        public final float f3491e;

        /* renamed from: f */
        public final boolean f3492f;

        /* renamed from: g */
        public final boolean f3493g;

        /* renamed from: h */
        public final float f3494h;

        /* renamed from: i */
        public final float f3495i;

        public C1566j(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3);
            this.f3489c = f;
            this.f3490d = f2;
            this.f3491e = f3;
            this.f3492f = z;
            this.f3493g = z2;
            this.f3494h = f4;
            this.f3495i = f5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1566j)) {
                return false;
            }
            C1566j jVar = (C1566j) obj;
            return C19383o.m32792b(Float.valueOf(this.f3489c), Float.valueOf(jVar.f3489c)) && C19383o.m32792b(Float.valueOf(this.f3490d), Float.valueOf(jVar.f3490d)) && C19383o.m32792b(Float.valueOf(this.f3491e), Float.valueOf(jVar.f3491e)) && this.f3492f == jVar.f3492f && this.f3493g == jVar.f3493g && C19383o.m32792b(Float.valueOf(this.f3494h), Float.valueOf(jVar.f3494h)) && C19383o.m32792b(Float.valueOf(this.f3495i), Float.valueOf(jVar.f3495i));
        }

        public final int hashCode() {
            int c = C0023f.m104c(this.f3491e, C0023f.m104c(this.f3490d, Float.hashCode(this.f3489c) * 31, 31), 31);
            boolean z = this.f3492f;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (c + (z ? 1 : 0)) * 31;
            boolean z3 = this.f3493g;
            if (!z3) {
                z2 = z3;
            }
            return Float.hashCode(this.f3495i) + C0023f.m104c(this.f3494h, (i + (z2 ? 1 : 0)) * 31, 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("RelativeArcTo(horizontalEllipseRadius=");
            h.append(this.f3489c);
            h.append(", verticalEllipseRadius=");
            h.append(this.f3490d);
            h.append(", theta=");
            h.append(this.f3491e);
            h.append(", isMoreThanHalf=");
            h.append(this.f3492f);
            h.append(", isPositiveArc=");
            h.append(this.f3493g);
            h.append(", arcStartDx=");
            h.append(this.f3494h);
            h.append(", arcStartDy=");
            return C0388a.m1048d(h, this.f3495i, ')');
        }
    }

    /* renamed from: androidx.compose.ui.graphics.vector.d$k */
    public static final class C1567k extends C1556d {

        /* renamed from: c */
        public final float f3496c;

        /* renamed from: d */
        public final float f3497d;

        /* renamed from: e */
        public final float f3498e;

        /* renamed from: f */
        public final float f3499f;

        /* renamed from: g */
        public final float f3500g;

        /* renamed from: h */
        public final float f3501h;

        public C1567k(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2);
            this.f3496c = f;
            this.f3497d = f2;
            this.f3498e = f3;
            this.f3499f = f4;
            this.f3500g = f5;
            this.f3501h = f6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1567k)) {
                return false;
            }
            C1567k kVar = (C1567k) obj;
            return C19383o.m32792b(Float.valueOf(this.f3496c), Float.valueOf(kVar.f3496c)) && C19383o.m32792b(Float.valueOf(this.f3497d), Float.valueOf(kVar.f3497d)) && C19383o.m32792b(Float.valueOf(this.f3498e), Float.valueOf(kVar.f3498e)) && C19383o.m32792b(Float.valueOf(this.f3499f), Float.valueOf(kVar.f3499f)) && C19383o.m32792b(Float.valueOf(this.f3500g), Float.valueOf(kVar.f3500g)) && C19383o.m32792b(Float.valueOf(this.f3501h), Float.valueOf(kVar.f3501h));
        }

        public final int hashCode() {
            return Float.hashCode(this.f3501h) + C0023f.m104c(this.f3500g, C0023f.m104c(this.f3499f, C0023f.m104c(this.f3498e, C0023f.m104c(this.f3497d, Float.hashCode(this.f3496c) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("RelativeCurveTo(dx1=");
            h.append(this.f3496c);
            h.append(", dy1=");
            h.append(this.f3497d);
            h.append(", dx2=");
            h.append(this.f3498e);
            h.append(", dy2=");
            h.append(this.f3499f);
            h.append(", dx3=");
            h.append(this.f3500g);
            h.append(", dy3=");
            return C0388a.m1048d(h, this.f3501h, ')');
        }
    }

    /* renamed from: androidx.compose.ui.graphics.vector.d$l */
    public static final class C1568l extends C1556d {

        /* renamed from: c */
        public final float f3502c;

        public C1568l(float f) {
            super(false, false, 3);
            this.f3502c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1568l) && C19383o.m32792b(Float.valueOf(this.f3502c), Float.valueOf(((C1568l) obj).f3502c));
        }

        public final int hashCode() {
            return Float.hashCode(this.f3502c);
        }

        public final String toString() {
            return C0388a.m1048d(C0072d.m201h("RelativeHorizontalTo(dx="), this.f3502c, ')');
        }
    }

    /* renamed from: androidx.compose.ui.graphics.vector.d$m */
    public static final class C1569m extends C1556d {

        /* renamed from: c */
        public final float f3503c;

        /* renamed from: d */
        public final float f3504d;

        public C1569m(float f, float f2) {
            super(false, false, 3);
            this.f3503c = f;
            this.f3504d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1569m)) {
                return false;
            }
            C1569m mVar = (C1569m) obj;
            return C19383o.m32792b(Float.valueOf(this.f3503c), Float.valueOf(mVar.f3503c)) && C19383o.m32792b(Float.valueOf(this.f3504d), Float.valueOf(mVar.f3504d));
        }

        public final int hashCode() {
            return Float.hashCode(this.f3504d) + (Float.hashCode(this.f3503c) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("RelativeLineTo(dx=");
            h.append(this.f3503c);
            h.append(", dy=");
            return C0388a.m1048d(h, this.f3504d, ')');
        }
    }

    /* renamed from: androidx.compose.ui.graphics.vector.d$n */
    public static final class C1570n extends C1556d {

        /* renamed from: c */
        public final float f3505c;

        /* renamed from: d */
        public final float f3506d;

        public C1570n(float f, float f2) {
            super(false, false, 3);
            this.f3505c = f;
            this.f3506d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1570n)) {
                return false;
            }
            C1570n nVar = (C1570n) obj;
            return C19383o.m32792b(Float.valueOf(this.f3505c), Float.valueOf(nVar.f3505c)) && C19383o.m32792b(Float.valueOf(this.f3506d), Float.valueOf(nVar.f3506d));
        }

        public final int hashCode() {
            return Float.hashCode(this.f3506d) + (Float.hashCode(this.f3505c) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("RelativeMoveTo(dx=");
            h.append(this.f3505c);
            h.append(", dy=");
            return C0388a.m1048d(h, this.f3506d, ')');
        }
    }

    /* renamed from: androidx.compose.ui.graphics.vector.d$o */
    public static final class C1571o extends C1556d {

        /* renamed from: c */
        public final float f3507c;

        /* renamed from: d */
        public final float f3508d;

        /* renamed from: e */
        public final float f3509e;

        /* renamed from: f */
        public final float f3510f;

        public C1571o(float f, float f2, float f3, float f4) {
            super(false, true, 1);
            this.f3507c = f;
            this.f3508d = f2;
            this.f3509e = f3;
            this.f3510f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1571o)) {
                return false;
            }
            C1571o oVar = (C1571o) obj;
            return C19383o.m32792b(Float.valueOf(this.f3507c), Float.valueOf(oVar.f3507c)) && C19383o.m32792b(Float.valueOf(this.f3508d), Float.valueOf(oVar.f3508d)) && C19383o.m32792b(Float.valueOf(this.f3509e), Float.valueOf(oVar.f3509e)) && C19383o.m32792b(Float.valueOf(this.f3510f), Float.valueOf(oVar.f3510f));
        }

        public final int hashCode() {
            return Float.hashCode(this.f3510f) + C0023f.m104c(this.f3509e, C0023f.m104c(this.f3508d, Float.hashCode(this.f3507c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("RelativeQuadTo(dx1=");
            h.append(this.f3507c);
            h.append(", dy1=");
            h.append(this.f3508d);
            h.append(", dx2=");
            h.append(this.f3509e);
            h.append(", dy2=");
            return C0388a.m1048d(h, this.f3510f, ')');
        }
    }

    /* renamed from: androidx.compose.ui.graphics.vector.d$p */
    public static final class C1572p extends C1556d {

        /* renamed from: c */
        public final float f3511c;

        /* renamed from: d */
        public final float f3512d;

        /* renamed from: e */
        public final float f3513e;

        /* renamed from: f */
        public final float f3514f;

        public C1572p(float f, float f2, float f3, float f4) {
            super(true, false, 2);
            this.f3511c = f;
            this.f3512d = f2;
            this.f3513e = f3;
            this.f3514f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1572p)) {
                return false;
            }
            C1572p pVar = (C1572p) obj;
            return C19383o.m32792b(Float.valueOf(this.f3511c), Float.valueOf(pVar.f3511c)) && C19383o.m32792b(Float.valueOf(this.f3512d), Float.valueOf(pVar.f3512d)) && C19383o.m32792b(Float.valueOf(this.f3513e), Float.valueOf(pVar.f3513e)) && C19383o.m32792b(Float.valueOf(this.f3514f), Float.valueOf(pVar.f3514f));
        }

        public final int hashCode() {
            return Float.hashCode(this.f3514f) + C0023f.m104c(this.f3513e, C0023f.m104c(this.f3512d, Float.hashCode(this.f3511c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("RelativeReflectiveCurveTo(dx1=");
            h.append(this.f3511c);
            h.append(", dy1=");
            h.append(this.f3512d);
            h.append(", dx2=");
            h.append(this.f3513e);
            h.append(", dy2=");
            return C0388a.m1048d(h, this.f3514f, ')');
        }
    }

    /* renamed from: androidx.compose.ui.graphics.vector.d$q */
    public static final class C1573q extends C1556d {

        /* renamed from: c */
        public final float f3515c;

        /* renamed from: d */
        public final float f3516d;

        public C1573q(float f, float f2) {
            super(false, true, 1);
            this.f3515c = f;
            this.f3516d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1573q)) {
                return false;
            }
            C1573q qVar = (C1573q) obj;
            return C19383o.m32792b(Float.valueOf(this.f3515c), Float.valueOf(qVar.f3515c)) && C19383o.m32792b(Float.valueOf(this.f3516d), Float.valueOf(qVar.f3516d));
        }

        public final int hashCode() {
            return Float.hashCode(this.f3516d) + (Float.hashCode(this.f3515c) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("RelativeReflectiveQuadTo(dx=");
            h.append(this.f3515c);
            h.append(", dy=");
            return C0388a.m1048d(h, this.f3516d, ')');
        }
    }

    /* renamed from: androidx.compose.ui.graphics.vector.d$r */
    public static final class C1574r extends C1556d {

        /* renamed from: c */
        public final float f3517c;

        public C1574r(float f) {
            super(false, false, 3);
            this.f3517c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1574r) && C19383o.m32792b(Float.valueOf(this.f3517c), Float.valueOf(((C1574r) obj).f3517c));
        }

        public final int hashCode() {
            return Float.hashCode(this.f3517c);
        }

        public final String toString() {
            return C0388a.m1048d(C0072d.m201h("RelativeVerticalTo(dy="), this.f3517c, ')');
        }
    }

    /* renamed from: androidx.compose.ui.graphics.vector.d$s */
    public static final class C1575s extends C1556d {

        /* renamed from: c */
        public final float f3518c;

        public C1575s(float f) {
            super(false, false, 3);
            this.f3518c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1575s) && C19383o.m32792b(Float.valueOf(this.f3518c), Float.valueOf(((C1575s) obj).f3518c));
        }

        public final int hashCode() {
            return Float.hashCode(this.f3518c);
        }

        public final String toString() {
            return C0388a.m1048d(C0072d.m201h("VerticalTo(y="), this.f3518c, ')');
        }
    }

    public C1556d(boolean z, boolean z2, int i) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        this.f3458a = z;
        this.f3459b = z2;
    }
}
