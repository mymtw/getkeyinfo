package androidx.compose.foundation.layout;

import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.unit.LayoutDirection;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.foundation.layout.k */
public abstract class C0743k {

    /* renamed from: a */
    public static final /* synthetic */ int f1528a = 0;

    /* renamed from: androidx.compose.foundation.layout.k$a */
    public static final class C0744a extends C0743k {

        /* renamed from: b */
        public static final /* synthetic */ int f1529b = 0;

        static {
            new C0744a();
        }

        /* renamed from: a */
        public final int mo4127a(int i, LayoutDirection layoutDirection, C1686i0 i0Var) {
            C19383o.m32797g(layoutDirection, "layoutDirection");
            return i / 2;
        }
    }

    /* renamed from: androidx.compose.foundation.layout.k$b */
    public static final class C0745b extends C0743k {

        /* renamed from: b */
        public static final /* synthetic */ int f1530b = 0;

        static {
            new C0745b();
        }

        /* renamed from: a */
        public final int mo4127a(int i, LayoutDirection layoutDirection, C1686i0 i0Var) {
            C19383o.m32797g(layoutDirection, "layoutDirection");
            if (layoutDirection == LayoutDirection.Ltr) {
                return i;
            }
            return 0;
        }
    }

    /* renamed from: androidx.compose.foundation.layout.k$c */
    public static final class C0746c extends C0743k {

        /* renamed from: b */
        public final C1428a.C1430b f1531b;

        public C0746c(C1428a.C1430b bVar) {
            C19383o.m32797g(bVar, ResponseConstants.HORIZONTAL);
            this.f1531b = bVar;
        }

        /* renamed from: a */
        public final int mo4127a(int i, LayoutDirection layoutDirection, C1686i0 i0Var) {
            C19383o.m32797g(layoutDirection, "layoutDirection");
            return this.f1531b.mo6134a(0, i, layoutDirection);
        }
    }

    /* renamed from: androidx.compose.foundation.layout.k$d */
    public static final class C0747d extends C0743k {

        /* renamed from: b */
        public static final /* synthetic */ int f1532b = 0;

        static {
            new C0747d();
        }

        /* renamed from: a */
        public final int mo4127a(int i, LayoutDirection layoutDirection, C1686i0 i0Var) {
            C19383o.m32797g(layoutDirection, "layoutDirection");
            if (layoutDirection == LayoutDirection.Ltr) {
                return 0;
            }
            return i;
        }
    }

    /* renamed from: androidx.compose.foundation.layout.k$e */
    public static final class C0748e extends C0743k {

        /* renamed from: b */
        public final C1428a.C1431c f1533b;

        public C0748e(C1428a.C1431c cVar) {
            C19383o.m32797g(cVar, "vertical");
            this.f1533b = cVar;
        }

        /* renamed from: a */
        public final int mo4127a(int i, LayoutDirection layoutDirection, C1686i0 i0Var) {
            C19383o.m32797g(layoutDirection, "layoutDirection");
            return this.f1533b.mo6135a(0, i);
        }
    }

    static {
        int i = C0744a.f1529b;
        int i2 = C0747d.f1532b;
        int i3 = C0745b.f1530b;
    }

    /* renamed from: a */
    public abstract int mo4127a(int i, LayoutDirection layoutDirection, C1686i0 i0Var);
}
