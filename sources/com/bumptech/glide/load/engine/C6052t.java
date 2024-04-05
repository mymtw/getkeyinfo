package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C5968d;
import com.bumptech.glide.load.engine.C6020g;
import com.bumptech.glide.load.engine.C6030k;
import com.bumptech.glide.load.engine.bitmap_recycle.C5996b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p150j4.C7109b;
import p150j4.C7117h;
import p197o4.C7588n;

/* renamed from: com.bumptech.glide.load.engine.t */
public final class C6052t implements C6020g, C5968d.C5969a<Object> {

    /* renamed from: b */
    public final C6020g.C6021a f13014b;

    /* renamed from: c */
    public final C6022h<?> f13015c;

    /* renamed from: d */
    public int f13016d;

    /* renamed from: e */
    public int f13017e = -1;

    /* renamed from: f */
    public C7109b f13018f;

    /* renamed from: g */
    public List<C7588n<File, ?>> f13019g;

    /* renamed from: h */
    public int f13020h;

    /* renamed from: i */
    public volatile C7588n.C7589a<?> f13021i;

    /* renamed from: j */
    public File f13022j;

    /* renamed from: k */
    public C6053u f13023k;

    public C6052t(C6022h<?> hVar, C6020g.C6021a aVar) {
        this.f13015c = hVar;
        this.f13014b = aVar;
    }

    /* renamed from: a */
    public final boolean mo16953a() {
        ArrayList a = this.f13015c.mo16956a();
        if (a.isEmpty()) {
            return false;
        }
        List<Class<?>> d = this.f13015c.mo16959d();
        if (!d.isEmpty()) {
            while (true) {
                List<C7588n<File, ?>> list = this.f13019g;
                if (list != null) {
                    if (this.f13020h < list.size()) {
                        this.f13021i = null;
                        boolean z = false;
                        while (!z) {
                            if (!(this.f13020h < this.f13019g.size())) {
                                break;
                            }
                            List<C7588n<File, ?>> list2 = this.f13019g;
                            int i = this.f13020h;
                            this.f13020h = i + 1;
                            File file = this.f13022j;
                            C6022h<?> hVar = this.f13015c;
                            this.f13021i = list2.get(i).mo20000a(file, hVar.f12909e, hVar.f12910f, hVar.f12913i);
                            if (this.f13021i != null) {
                                if (this.f13015c.mo16958c(this.f13021i.f16855c.mo16848a()) != null) {
                                    this.f13021i.f16855c.mo16855e(this.f13015c.f12919o, this);
                                    z = true;
                                }
                            }
                        }
                        return z;
                    }
                }
                int i2 = this.f13017e + 1;
                this.f13017e = i2;
                if (i2 >= d.size()) {
                    int i3 = this.f13016d + 1;
                    this.f13016d = i3;
                    if (i3 >= a.size()) {
                        return false;
                    }
                    this.f13017e = 0;
                }
                C7109b bVar = (C7109b) a.get(this.f13016d);
                Class cls = d.get(this.f13017e);
                C7117h<Z> f = this.f13015c.mo16961f(cls);
                C5996b arrayPool = this.f13015c.f12907c.getArrayPool();
                C6022h<?> hVar2 = this.f13015c;
                this.f13023k = new C6053u(arrayPool, bVar, hVar2.f12918n, hVar2.f12909e, hVar2.f12910f, f, cls, hVar2.f12913i);
                File a2 = ((C6030k.C6035c) hVar2.f12912h).mo16975a().mo19514a(this.f13023k);
                this.f13022j = a2;
                if (a2 != null) {
                    this.f13018f = bVar;
                    this.f13019g = this.f13015c.f12907c.getRegistry().mo16765e(a2);
                    this.f13020h = 0;
                }
            }
        } else if (File.class.equals(this.f13015c.f12915k)) {
            return false;
        } else {
            throw new IllegalStateException("Failed to find any load path from " + this.f13015c.f12908d.getClass() + " to " + this.f13015c.f12915k);
        }
    }

    /* renamed from: c */
    public final void mo16862c(Exception exc) {
        this.f13014b.mo16876g(this.f13023k, exc, this.f13021i.f16855c, DataSource.RESOURCE_DISK_CACHE);
    }

    public final void cancel() {
        C7588n.C7589a<?> aVar = this.f13021i;
        if (aVar != null) {
            aVar.f16855c.cancel();
        }
    }

    /* renamed from: f */
    public final void mo16863f(Object obj) {
        this.f13014b.mo16874e(this.f13018f, obj, this.f13021i.f16855c, DataSource.RESOURCE_DISK_CACHE, this.f13023k);
    }
}
