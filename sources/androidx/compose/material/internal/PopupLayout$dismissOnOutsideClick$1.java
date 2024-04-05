package androidx.compose.material.internal;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7289h;
import p288y.C8343c;
import p753kq.C19861p;

public final class PopupLayout$dismissOnOutsideClick$1 extends Lambda implements C19861p<C8343c, C7289h, Boolean> {
    public static final PopupLayout$dismissOnOutsideClick$1 INSTANCE = new PopupLayout$dismissOnOutsideClick$1();

    public PopupLayout$dismissOnOutsideClick$1() {
        super(2);
    }

    /* renamed from: invoke-KMgbckE  reason: not valid java name */
    public final Boolean invoke(C8343c cVar, C7289h hVar) {
        C19383o.m32797g(hVar, "bounds");
        boolean z = false;
        if (cVar != null && (C8343c.m16642c(cVar.f18299a) < ((float) hVar.f16167a) || C8343c.m16642c(cVar.f18299a) > ((float) hVar.f16169c) || C8343c.m16643d(cVar.f18299a) < ((float) hVar.f16168b) || C8343c.m16643d(cVar.f18299a) > ((float) hVar.f16170d))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
