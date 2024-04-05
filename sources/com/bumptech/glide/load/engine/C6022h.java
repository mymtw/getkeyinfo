package com.bumptech.glide.load.engine;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1339j1;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.DecodeJob;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p036c5.C4425k;
import p150j4.C7108a;
import p150j4.C7109b;
import p150j4.C7114e;
import p150j4.C7117h;
import p193o.C7494b;
import p197o4.C7588n;
import p197o4.C7591p;
import p215q4.C7723a;
import p264v4.C8203c;
import p264v4.C8204d;
import p292y4.C8388a;
import p292y4.C8390b;
import p292y4.C8391c;

/* renamed from: com.bumptech.glide.load.engine.h */
public final class C6022h<Transcode> {

    /* renamed from: a */
    public final ArrayList f12905a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f12906b = new ArrayList();

    /* renamed from: c */
    public GlideContext f12907c;

    /* renamed from: d */
    public Object f12908d;

    /* renamed from: e */
    public int f12909e;

    /* renamed from: f */
    public int f12910f;

    /* renamed from: g */
    public Class<?> f12911g;

    /* renamed from: h */
    public DecodeJob.C5989e f12912h;

    /* renamed from: i */
    public C7114e f12913i;

    /* renamed from: j */
    public Map<Class<?>, C7117h<?>> f12914j;

    /* renamed from: k */
    public Class<Transcode> f12915k;

    /* renamed from: l */
    public boolean f12916l;

    /* renamed from: m */
    public boolean f12917m;

    /* renamed from: n */
    public C7109b f12918n;

    /* renamed from: o */
    public Priority f12919o;

    /* renamed from: p */
    public C6024j f12920p;

    /* renamed from: q */
    public boolean f12921q;

    /* renamed from: r */
    public boolean f12922r;

    /* renamed from: a */
    public final ArrayList mo16956a() {
        if (!this.f12917m) {
            this.f12917m = true;
            this.f12906b.clear();
            ArrayList b = mo16957b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                C7588n.C7589a aVar = (C7588n.C7589a) b.get(i);
                if (!this.f12906b.contains(aVar.f16853a)) {
                    this.f12906b.add(aVar.f16853a);
                }
                for (int i2 = 0; i2 < aVar.f16854b.size(); i2++) {
                    if (!this.f12906b.contains(aVar.f16854b.get(i2))) {
                        this.f12906b.add(aVar.f16854b.get(i2));
                    }
                }
            }
        }
        return this.f12906b;
    }

    /* renamed from: b */
    public final ArrayList mo16957b() {
        if (!this.f12916l) {
            this.f12916l = true;
            this.f12905a.clear();
            List e = this.f12907c.getRegistry().mo16765e(this.f12908d);
            int size = e.size();
            for (int i = 0; i < size; i++) {
                C7588n.C7589a a = ((C7588n) e.get(i)).mo20000a(this.f12908d, this.f12909e, this.f12910f, this.f12913i);
                if (a != null) {
                    this.f12905a.add(a);
                }
            }
        }
        return this.f12905a;
    }

    /* renamed from: c */
    public final <Data> C6048q<Data, ?, Transcode> mo16958c(Class<Data> cls) {
        C6048q<Data, ?, Transcode> orDefault;
        ArrayList arrayList;
        boolean z;
        C8203c cVar;
        Class<Data> cls2 = cls;
        Registry registry = this.f12907c.getRegistry();
        Class<?> cls3 = this.f12911g;
        Class<Transcode> cls4 = this.f12915k;
        C8390b bVar = registry.f12733i;
        C4425k andSet = bVar.f18394b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new C4425k();
        }
        andSet.f9707a = cls2;
        andSet.f9708b = cls3;
        andSet.f9709c = cls4;
        synchronized (bVar.f18393a) {
            orDefault = bVar.f18393a.getOrDefault(andSet, null);
        }
        bVar.f18394b.set(andSet);
        registry.f12733i.getClass();
        if (C8390b.f18392c.equals(orDefault)) {
            return null;
        }
        if (orDefault != null) {
            return orDefault;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = registry.f12727c.mo20972b(cls2, cls3).iterator();
        while (it.hasNext()) {
            Class cls5 = (Class) it.next();
            Iterator it2 = registry.f12730f.mo20830a(cls5, cls4).iterator();
            while (true) {
                if (it2.hasNext()) {
                    Class cls6 = (Class) it2.next();
                    C8391c cVar2 = registry.f12727c;
                    synchronized (cVar2) {
                        arrayList = new ArrayList();
                        Iterator it3 = cVar2.f18395a.iterator();
                        while (it3.hasNext()) {
                            List<C8391c.C8392a> list = (List) cVar2.f18396b.get((String) it3.next());
                            if (list != null) {
                                for (C8391c.C8392a aVar : list) {
                                    if (aVar.f18397a.isAssignableFrom(cls2) && cls5.isAssignableFrom(aVar.f18398b)) {
                                        arrayList.add(aVar.f18399c);
                                    }
                                }
                            }
                        }
                    }
                    C8204d dVar = registry.f12730f;
                    synchronized (dVar) {
                        if (cls6.isAssignableFrom(cls5)) {
                            cVar = C0761x.f1567k;
                        } else {
                            Iterator it4 = dVar.f18000a.iterator();
                            while (it4.hasNext()) {
                                C8204d.C8205a aVar2 = (C8204d.C8205a) it4.next();
                                if (!aVar2.f18001a.isAssignableFrom(cls5) || !cls6.isAssignableFrom(aVar2.f18002b)) {
                                    z = false;
                                    continue;
                                } else {
                                    z = true;
                                    continue;
                                }
                                if (z) {
                                    cVar = aVar2.f18003c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls5 + " to " + cls6);
                        }
                    }
                    C6023i iVar = r2;
                    C6023i iVar2 = new C6023i(cls, cls5, cls6, arrayList, cVar, registry.f12734j);
                    arrayList2.add(iVar);
                }
            }
        }
        C6048q<Data, ?, Transcode> qVar = arrayList2.isEmpty() ? null : new C6048q<>(cls, cls3, cls4, arrayList2, registry.f12734j);
        C8390b bVar2 = registry.f12733i;
        synchronized (bVar2.f18393a) {
            bVar2.f18393a.put(new C4425k(cls2, cls3, cls4), qVar != null ? qVar : C8390b.f18392c);
        }
        return qVar;
    }

    /* renamed from: d */
    public final List<Class<?>> mo16959d() {
        List<Class<?>> list;
        ArrayList d;
        Registry registry = this.f12907c.getRegistry();
        Class<?> cls = this.f12908d.getClass();
        Class<?> cls2 = this.f12911g;
        Class<Transcode> cls3 = this.f12915k;
        C1339j1 j1Var = registry.f12732h;
        C4425k kVar = (C4425k) ((AtomicReference) j1Var.f2932b).getAndSet((Object) null);
        if (kVar == null) {
            kVar = new C4425k(cls, cls2, cls3);
        } else {
            kVar.f9707a = cls;
            kVar.f9708b = cls2;
            kVar.f9709c = cls3;
        }
        synchronized (((C7494b) j1Var.f2933c)) {
            list = (List) ((C7494b) j1Var.f2933c).getOrDefault(kVar, null);
        }
        ((AtomicReference) j1Var.f2932b).set(kVar);
        ArrayList arrayList = list;
        if (list == null) {
            ArrayList arrayList2 = new ArrayList();
            C7591p pVar = registry.f12725a;
            synchronized (pVar) {
                d = pVar.f16856a.mo20031d(cls);
            }
            Iterator it = d.iterator();
            while (it.hasNext()) {
                Iterator it2 = registry.f12727c.mo20972b((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!registry.f12730f.mo20830a(cls4, cls3).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            C1339j1 j1Var2 = registry.f12732h;
            List unmodifiableList = Collections.unmodifiableList(arrayList2);
            synchronized (((C7494b) j1Var2.f2933c)) {
                ((C7494b) j1Var2.f2933c).put(new C4425k(cls, cls2, cls3), unmodifiableList);
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    /* renamed from: e */
    public final <X> C7108a<X> mo16960e(X x) throws Registry.NoSourceEncoderAvailableException {
        C7108a<T> aVar;
        C8388a aVar2 = this.f12907c.getRegistry().f12726b;
        Class<?> cls = x.getClass();
        synchronized (aVar2) {
            Iterator it = aVar2.f18389a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                C8388a.C8389a aVar3 = (C8388a.C8389a) it.next();
                if (aVar3.f18390a.isAssignableFrom(cls)) {
                    aVar = aVar3.f18391b;
                    break;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        throw new Registry.NoSourceEncoderAvailableException(x.getClass());
    }

    /* renamed from: f */
    public final <Z> C7117h<Z> mo16961f(Class<Z> cls) {
        C7117h<Z> hVar = this.f12914j.get(cls);
        if (hVar == null) {
            Iterator<Map.Entry<Class<?>, C7117h<?>>> it = this.f12914j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    hVar = (C7117h) next.getValue();
                    break;
                }
            }
        }
        if (hVar != null) {
            return hVar;
        }
        if (!this.f12914j.isEmpty() || !this.f12921q) {
            return C7723a.f17133b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
