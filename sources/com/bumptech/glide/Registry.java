package com.bumptech.glide;

import androidx.activity.C0114h;
import androidx.compose.runtime.C1339j1;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C5970e;
import com.bumptech.glide.load.data.C5972f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p077d1.C6622f;
import p080d5.C6652a;
import p080d5.C6658b;
import p080d5.C6659c;
import p087e0.C6682a;
import p150j4.C7115f;
import p150j4.C7116g;
import p197o4.C7588n;
import p197o4.C7590o;
import p197o4.C7591p;
import p197o4.C7596r;
import p264v4.C8203c;
import p264v4.C8204d;
import p292y4.C8388a;
import p292y4.C8390b;
import p292y4.C8391c;
import p292y4.C8393d;

public final class Registry {

    /* renamed from: a */
    public final C7591p f12725a;

    /* renamed from: b */
    public final C8388a f12726b;

    /* renamed from: c */
    public final C8391c f12727c;

    /* renamed from: d */
    public final C8393d f12728d;

    /* renamed from: e */
    public final C5972f f12729e;

    /* renamed from: f */
    public final C8204d f12730f;

    /* renamed from: g */
    public final C6682a f12731g;

    /* renamed from: h */
    public final C1339j1 f12732h = new C1339j1(1);

    /* renamed from: i */
    public final C8390b f12733i = new C8390b();

    /* renamed from: j */
    public final C6652a.C6655c f12734j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        C6652a.C6655c cVar = new C6652a.C6655c(new C6622f(20), new C6658b(), new C6659c());
        this.f12734j = cVar;
        this.f12725a = new C7591p(cVar);
        this.f12726b = new C8388a();
        this.f12727c = new C8391c();
        this.f12728d = new C8393d();
        this.f12729e = new C5972f();
        this.f12730f = new C8204d();
        this.f12731g = new C6682a();
        List<String> asList = Arrays.asList(new String[]{"Animation", "Bitmap", "BitmapDrawable"});
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String add : asList) {
            arrayList.add(add);
        }
        arrayList.add("legacy_append");
        C8391c cVar2 = this.f12727c;
        synchronized (cVar2) {
            ArrayList arrayList2 = new ArrayList(cVar2.f18395a);
            cVar2.f18395a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cVar2.f18395a.add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (!arrayList.contains(str)) {
                    cVar2.f18395a.add(str);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo16761a(C7115f fVar, Class cls, Class cls2, String str) {
        C8391c cVar = this.f12727c;
        synchronized (cVar) {
            cVar.mo20971a(str).add(new C8391c.C8392a(cls, cls2, fVar));
        }
    }

    /* renamed from: b */
    public final void mo16762b(Class cls, C7116g gVar) {
        C8393d dVar = this.f12728d;
        synchronized (dVar) {
            dVar.f18400a.add(new C8393d.C8394a(cls, gVar));
        }
    }

    /* renamed from: c */
    public final void mo16763c(Class cls, Class cls2, C7590o oVar) {
        C7591p pVar = this.f12725a;
        synchronized (pVar) {
            C7596r rVar = pVar.f16856a;
            synchronized (rVar) {
                C7596r.C7598b bVar = new C7596r.C7598b(cls, cls2, oVar);
                ArrayList arrayList = rVar.f16871a;
                arrayList.add(arrayList.size(), bVar);
            }
            pVar.f16857b.f16858a.clear();
        }
    }

    /* renamed from: d */
    public final List<ImageHeaderParser> mo16764d() {
        List<ImageHeaderParser> list;
        C6682a aVar = this.f12731g;
        synchronized (aVar) {
            list = (List) aVar.f14744b;
        }
        if (!list.isEmpty()) {
            return list;
        }
        throw new NoImageHeaderParserException();
    }

    /* renamed from: e */
    public final <Model> List<C7588n<Model, ?>> mo16765e(Model model) {
        List<C7588n<Model, ?>> list;
        C7591p pVar = this.f12725a;
        pVar.getClass();
        Class<?> cls = model.getClass();
        synchronized (pVar) {
            C7591p.C7592a.C7593a aVar = (C7591p.C7592a.C7593a) pVar.f16857b.f16858a.get(cls);
            list = aVar == null ? null : aVar.f16859a;
            if (list == null) {
                list = Collections.unmodifiableList(pVar.f16856a.mo20028a(cls));
                pVar.f16857b.mo20025a(cls, list);
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List<C7588n<Model, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                C7588n nVar = list.get(i);
                if (nVar.mo20001b(model)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new NoModelLoaderAvailableException(model, list);
        }
        throw new NoModelLoaderAvailableException(model);
    }

    /* renamed from: f */
    public final <X> C5970e<X> mo16766f(X x) {
        C5970e<X> b;
        C5972f fVar = this.f12729e;
        synchronized (fVar) {
            C0114h.m281L(x);
            C5970e.C5971a aVar = (C5970e.C5971a) fVar.f12782a.get(x.getClass());
            if (aVar == null) {
                Iterator it = fVar.f12782a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C5970e.C5971a aVar2 = (C5970e.C5971a) it.next();
                    if (aVar2.mo16846a().isAssignableFrom(x.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = C5972f.f12781b;
            }
            b = aVar.mo16847b(x);
        }
        return b;
    }

    /* renamed from: g */
    public final void mo16767g(C5970e.C5971a aVar) {
        C5972f fVar = this.f12729e;
        synchronized (fVar) {
            fVar.f12782a.put(aVar.mo16846a(), aVar);
        }
    }

    /* renamed from: h */
    public final void mo16768h(Class cls, Class cls2, C8203c cVar) {
        C8204d dVar = this.f12730f;
        synchronized (dVar) {
            dVar.f18000a.add(new C8204d.C8205a(cls, cls2, cVar));
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public NoModelLoaderAvailableException(java.lang.Object r2) {
            /*
                r1 = this;
                java.lang.String r0 = "Failed to find any ModelLoaders registered for model class: "
                java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
                java.lang.Class r2 = r2.getClass()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Registry.NoModelLoaderAvailableException.<init>(java.lang.Object):void");
        }

        public <M> NoModelLoaderAvailableException(M m, List<C7588n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }
}
