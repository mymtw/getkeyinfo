package com.bumptech.glide.request;

import com.bumptech.glide.load.engine.C6024j;
import com.bumptech.glide.load.resource.bitmap.C6087k;
import com.bumptech.glide.load.resource.bitmap.C6105w;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

/* renamed from: com.bumptech.glide.request.g */
public class C6128g extends C6121a<C6128g> {

    /* renamed from: B */
    public static C6128g f13235B;

    /* renamed from: C */
    public static C6128g f13236C;

    /* renamed from: I */
    public static C6128g m12231I(C6105w wVar) {
        return (C6128g) new C6128g().mo17140C(wVar, true);
    }

    /* renamed from: J */
    public static C6128g m12232J() {
        if (f13236C == null) {
            f13236C = (C6128g) ((C6128g) new C6128g().mo17138A(DownsampleStrategy.f13050b, new C6087k())).mo17145b();
        }
        return f13236C;
    }

    /* renamed from: K */
    public static C6128g m12233K(C6024j jVar) {
        return (C6128g) new C6128g().mo17148f(jVar);
    }

    /* renamed from: L */
    public static C6128g m12234L() {
        if (f13235B == null) {
            f13235B = (C6128g) ((C6128g) new C6128g().mo17166z(true)).mo17145b();
        }
        return f13235B;
    }
}
