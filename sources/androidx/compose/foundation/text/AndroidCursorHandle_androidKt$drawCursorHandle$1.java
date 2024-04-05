package androidx.compose.foundation.text;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.C1026t;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.draw.C1440b;
import androidx.compose.p015ui.draw.C1445g;
import androidx.compose.p015ui.draw.DrawModifierKt;
import androidx.compose.p015ui.graphics.C1489a;
import androidx.compose.p015ui.graphics.C1529k;
import androidx.compose.p015ui.graphics.C1546t;
import androidx.compose.p015ui.graphics.C1604x;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p288y.C8343c;
import p288y.C8347f;
import p297z.C8406a;
import p297z.C8409b;
import p297z.C8410c;
import p297z.C8412e;
import p628nj.C18263b;
import p753kq.C19857l;
import p753kq.C19862q;

final class AndroidCursorHandle_androidKt$drawCursorHandle$1 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public static final AndroidCursorHandle_androidKt$drawCursorHandle$1 INSTANCE = new AndroidCursorHandle_androidKt$drawCursorHandle$1();

    public AndroidCursorHandle_androidKt$drawCursorHandle$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(-2126899193);
        final long j = ((C1026t) dVar2.mo5410J(TextSelectionColorsKt.f2103a)).f2154a;
        C1436d i0 = dVar.mo6148i0(DrawModifierKt.m3071b(new C19857l<C1440b, C1445g>() {
            public final C1445g invoke(C1440b bVar) {
                ColorFilter colorFilter;
                C19383o.m32797g(bVar, "$this$drawWithCache");
                final float d = C8347f.m16656d(bVar.mo6168b()) / 2.0f;
                final C1604x d2 = AndroidSelectionHandles_androidKt.m2009d(bVar, d);
                long j = j;
                if (Build.VERSION.SDK_INT >= 29) {
                    colorFilter = C1529k.f3326a.mo6367a(j, 5);
                } else {
                    colorFilter = new PorterDuffColorFilter(C18263b.m30859o0(j), C1489a.m3160b(5));
                }
                final C1546t tVar = new C1546t(colorFilter);
                return bVar.mo6169c(new C19857l<C8410c, C19394m>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((C8410c) obj);
                        return C19394m.f43287a;
                    }

                    public final void invoke(C8410c cVar) {
                        C19383o.m32797g(cVar, "$this$onDrawWithContent");
                        cVar.mo6911O0();
                        float f = d;
                        C1604x xVar = d2;
                        C1546t tVar = tVar;
                        C8406a.C8408b C0 = cVar.mo6900C0();
                        long b = C0.mo20992b();
                        C0.mo20991a().mo6264r();
                        C8409b bVar = C0.f18430a;
                        bVar.mo21000g(f, 0.0f);
                        bVar.mo20997d(C8343c.f18295b);
                        C8412e.m16789n0(cVar, xVar, tVar);
                        C0.mo20991a().mo6261m();
                        C0.mo20993c(b);
                    }
                });
            }
        }));
        dVar2.mo5406H();
        return i0;
    }
}
