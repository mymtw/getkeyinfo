package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.data.C5968d;
import com.bumptech.glide.load.engine.C6020g;
import p150j4.C7109b;
import p197o4.C7588n;

/* renamed from: com.bumptech.glide.load.engine.w */
public final class C6056w implements C5968d.C5969a<Object> {

    /* renamed from: b */
    public final /* synthetic */ C7588n.C7589a f13035b;

    /* renamed from: c */
    public final /* synthetic */ C6057x f13036c;

    public C6056w(C6057x xVar, C7588n.C7589a aVar) {
        this.f13036c = xVar;
        this.f13035b = aVar;
    }

    /* renamed from: c */
    public final void mo16862c(Exception exc) {
        C6057x xVar = this.f13036c;
        C7588n.C7589a<?> aVar = this.f13035b;
        C7588n.C7589a<?> aVar2 = xVar.f13042g;
        if (aVar2 != null && aVar2 == aVar) {
            C6057x xVar2 = this.f13036c;
            C7588n.C7589a aVar3 = this.f13035b;
            C6020g.C6021a aVar4 = xVar2.f13038c;
            C6018e eVar = xVar2.f13043h;
            C5968d<Data> dVar = aVar3.f16855c;
            aVar4.mo16876g(eVar, exc, dVar, dVar.mo16854d());
        }
    }

    /* renamed from: f */
    public final void mo16863f(Object obj) {
        C6057x xVar = this.f13036c;
        C7588n.C7589a<?> aVar = this.f13035b;
        C7588n.C7589a<?> aVar2 = xVar.f13042g;
        if (aVar2 != null && aVar2 == aVar) {
            C6057x xVar2 = this.f13036c;
            C7588n.C7589a aVar3 = this.f13035b;
            C6024j jVar = xVar2.f13037b.f12920p;
            if (obj == null || !jVar.mo16967c(aVar3.f16855c.mo16854d())) {
                C6020g.C6021a aVar4 = xVar2.f13038c;
                C7109b bVar = aVar3.f16853a;
                C5968d<Data> dVar = aVar3.f16855c;
                aVar4.mo16874e(bVar, obj, dVar, dVar.mo16854d(), xVar2.f13043h);
                return;
            }
            xVar2.f13041f = obj;
            xVar2.f13038c.mo16875f();
        }
    }
}
