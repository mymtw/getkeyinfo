package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.C4845a;
import p113g3.C6841b;
import p113g3.C6853m;
import p158k3.C7179b;
import p158k3.C7189l;
import p167l3.C7236b;

public final class PolystarShape implements C7236b {

    /* renamed from: a */
    public final String f10922a;

    /* renamed from: b */
    public final Type f10923b;

    /* renamed from: c */
    public final C7179b f10924c;

    /* renamed from: d */
    public final C7189l<PointF, PointF> f10925d;

    /* renamed from: e */
    public final C7179b f10926e;

    /* renamed from: f */
    public final C7179b f10927f;

    /* renamed from: g */
    public final C7179b f10928g;

    /* renamed from: h */
    public final C7179b f10929h;

    /* renamed from: i */
    public final C7179b f10930i;

    /* renamed from: j */
    public final boolean f10931j;

    public enum Type {
        STAR(1),
        POLYGON(2);
        
        private final int value;

        private Type(int i) {
            this.value = i;
        }

        public static Type forValue(int i) {
            for (Type type : values()) {
                if (type.value == i) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, C7179b bVar, C7189l<PointF, PointF> lVar, C7179b bVar2, C7179b bVar3, C7179b bVar4, C7179b bVar5, C7179b bVar6, boolean z) {
        this.f10922a = str;
        this.f10923b = type;
        this.f10924c = bVar;
        this.f10925d = lVar;
        this.f10926e = bVar2;
        this.f10927f = bVar3;
        this.f10928g = bVar4;
        this.f10929h = bVar5;
        this.f10930i = bVar6;
        this.f10931j = z;
    }

    /* renamed from: a */
    public final C6841b mo14595a(LottieDrawable lottieDrawable, C4845a aVar) {
        return new C6853m(lottieDrawable, aVar, this);
    }
}
