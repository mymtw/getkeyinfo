package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.C4845a;
import java.util.ArrayList;
import java.util.List;
import p113g3.C6841b;
import p113g3.C6847h;
import p158k3.C7179b;
import p158k3.C7180c;
import p158k3.C7181d;
import p158k3.C7182e;
import p167l3.C7236b;

/* renamed from: com.airbnb.lottie.model.content.a */
public final class C4844a implements C7236b {

    /* renamed from: a */
    public final String f10949a;

    /* renamed from: b */
    public final GradientType f10950b;

    /* renamed from: c */
    public final C7180c f10951c;

    /* renamed from: d */
    public final C7181d f10952d;

    /* renamed from: e */
    public final C7182e f10953e;

    /* renamed from: f */
    public final C7182e f10954f;

    /* renamed from: g */
    public final C7179b f10955g;

    /* renamed from: h */
    public final ShapeStroke.LineCapType f10956h;

    /* renamed from: i */
    public final ShapeStroke.LineJoinType f10957i;

    /* renamed from: j */
    public final float f10958j;

    /* renamed from: k */
    public final List<C7179b> f10959k;

    /* renamed from: l */
    public final C7179b f10960l;

    /* renamed from: m */
    public final boolean f10961m;

    public C4844a(String str, GradientType gradientType, C7180c cVar, C7181d dVar, C7182e eVar, C7182e eVar2, C7179b bVar, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f, ArrayList arrayList, C7179b bVar2, boolean z) {
        this.f10949a = str;
        this.f10950b = gradientType;
        this.f10951c = cVar;
        this.f10952d = dVar;
        this.f10953e = eVar;
        this.f10954f = eVar2;
        this.f10955g = bVar;
        this.f10956h = lineCapType;
        this.f10957i = lineJoinType;
        this.f10958j = f;
        this.f10959k = arrayList;
        this.f10960l = bVar2;
        this.f10961m = z;
    }

    /* renamed from: a */
    public final C6841b mo14595a(LottieDrawable lottieDrawable, C4845a aVar) {
        return new C6847h(lottieDrawable, aVar, this);
    }
}
