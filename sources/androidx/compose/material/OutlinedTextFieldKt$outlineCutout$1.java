package androidx.compose.material;

import androidx.compose.foundation.layout.C0759v;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p288y.C8347f;
import p297z.C8406a;
import p297z.C8410c;
import p753kq.C19857l;

final class OutlinedTextFieldKt$outlineCutout$1 extends Lambda implements C19857l<C8410c, C19394m> {
    public final /* synthetic */ long $labelSize;
    public final /* synthetic */ C0759v $paddingValues;

    /* renamed from: androidx.compose.material.OutlinedTextFieldKt$outlineCutout$1$a */
    public /* synthetic */ class C1108a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2245a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Rtl.ordinal()] = 1;
            f2245a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$outlineCutout$1(long j, C0759v vVar) {
        super(1);
        this.$labelSize = j;
        this.$paddingValues = vVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8410c) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8410c cVar) {
        C19383o.m32797g(cVar, "$this$drawWithContent");
        float d = C8347f.m16656d(this.$labelSize);
        float f = 0.0f;
        if (d > 0.0f) {
            float B0 = cVar.mo3789B0(OutlinedTextFieldKt.f2243a);
            float B02 = cVar.mo3789B0(this.$paddingValues.mo4151b(cVar.getLayoutDirection())) - B0;
            float f2 = (float) 2;
            float f3 = (B0 * f2) + d + B02;
            LayoutDirection layoutDirection = cVar.getLayoutDirection();
            int[] iArr = C1108a.f2245a;
            float d2 = iArr[layoutDirection.ordinal()] == 1 ? C8347f.m16656d(cVar.mo6913b()) - f3 : B02 < 0.0f ? 0.0f : B02;
            if (iArr[cVar.getLayoutDirection().ordinal()] == 1) {
                float d3 = C8347f.m16656d(cVar.mo6913b());
                if (B02 >= 0.0f) {
                    f = B02;
                }
                f3 = d3 - f;
            }
            float b = C8347f.m16654b(this.$labelSize);
            float f4 = (-b) / f2;
            float f5 = b / f2;
            C8406a.C8408b C0 = cVar.mo6900C0();
            long b2 = C0.mo20992b();
            C0.mo20991a().mo6264r();
            C0.f18430a.mo20995b(d2, f4, f3, f5, 0);
            cVar.mo6911O0();
            C0.mo20991a().mo6261m();
            C0.mo20993c(b2);
            return;
        }
        cVar.mo6911O0();
    }
}
