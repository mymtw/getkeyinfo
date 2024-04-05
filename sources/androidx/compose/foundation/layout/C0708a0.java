package androidx.compose.foundation.layout;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.layout.a0 */
public final class C0708a0 implements C0763z {

    /* renamed from: a */
    public static final C0708a0 f1463a = new C0708a0();

    /* renamed from: a */
    public final C1436d mo4073a(C1436d dVar, boolean z) {
        C19383o.m32797g(dVar, "<this>");
        if (((double) 1.0f) > ShadowDrawableWrapper.COS_45) {
            C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
            return dVar.mo6148i0(new C0756s(1.0f, z));
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
    }

    /* renamed from: b */
    public final C1436d mo4074b(C1436d dVar) {
        C19383o.m32797g(dVar, "<this>");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new C0734f0());
    }
}
