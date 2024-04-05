package com.airbnb.lottie.model.content;

import p158k3.C7181d;
import p158k3.C7184g;

public final class Mask {

    /* renamed from: a */
    public final MaskMode f10916a;

    /* renamed from: b */
    public final C7184g f10917b;

    /* renamed from: c */
    public final C7181d f10918c;

    /* renamed from: d */
    public final boolean f10919d;

    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT
    }

    public Mask(MaskMode maskMode, C7184g gVar, C7181d dVar, boolean z) {
        this.f10916a = maskMode;
        this.f10917b = gVar;
        this.f10918c = dVar;
        this.f10919d = z;
    }
}
