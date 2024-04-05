package androidx.compose.foundation.layout;

import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1432b;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.layout.j */
public final class C0742j implements C0739i {

    /* renamed from: a */
    public static final C0742j f1527a = new C0742j();

    /* renamed from: a */
    public final C1436d mo4124a() {
        if (((double) 1.0f) > ShadowDrawableWrapper.COS_45) {
            C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
            return new C0756s(1.0f, false);
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
    }

    /* renamed from: b */
    public final C1436d mo4125b(C1436d dVar) {
        C1432b.C1433a aVar = C1428a.C1429a.f3116l;
        C19383o.m32797g(dVar, "<this>");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new C0752o(aVar));
    }
}
