package com.airbnb.lottie.model.content;

import android.support.p013v4.media.C0072d;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.C4845a;
import p003a2.C0015b;
import p113g3.C6841b;
import p113g3.C6859r;
import p158k3.C7179b;
import p167l3.C7236b;

public final class ShapeTrimPath implements C7236b {

    /* renamed from: a */
    public final Type f10944a;

    /* renamed from: b */
    public final C7179b f10945b;

    /* renamed from: c */
    public final C7179b f10946c;

    /* renamed from: d */
    public final C7179b f10947d;

    /* renamed from: e */
    public final boolean f10948e;

    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type forId(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException(C0015b.m88g("Unknown trim path type ", i));
        }
    }

    public ShapeTrimPath(String str, Type type, C7179b bVar, C7179b bVar2, C7179b bVar3, boolean z) {
        this.f10944a = type;
        this.f10945b = bVar;
        this.f10946c = bVar2;
        this.f10947d = bVar3;
        this.f10948e = z;
    }

    /* renamed from: a */
    public final C6841b mo14595a(LottieDrawable lottieDrawable, C4845a aVar) {
        return new C6859r(aVar, this);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Trim Path: {start: ");
        h.append(this.f10945b);
        h.append(", end: ");
        h.append(this.f10946c);
        h.append(", offset: ");
        h.append(this.f10947d);
        h.append("}");
        return h.toString();
    }
}
