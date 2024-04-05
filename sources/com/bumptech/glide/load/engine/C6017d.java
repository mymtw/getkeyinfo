package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C5968d;
import com.bumptech.glide.load.engine.C6020g;
import com.bumptech.glide.load.engine.C6030k;
import java.io.File;
import java.util.List;
import p150j4.C7109b;
import p197o4.C7588n;

/* renamed from: com.bumptech.glide.load.engine.d */
public final class C6017d implements C6020g, C5968d.C5969a<Object> {

    /* renamed from: b */
    public final List<C7109b> f12891b;

    /* renamed from: c */
    public final C6022h<?> f12892c;

    /* renamed from: d */
    public final C6020g.C6021a f12893d;

    /* renamed from: e */
    public int f12894e = -1;

    /* renamed from: f */
    public C7109b f12895f;

    /* renamed from: g */
    public List<C7588n<File, ?>> f12896g;

    /* renamed from: h */
    public int f12897h;

    /* renamed from: i */
    public volatile C7588n.C7589a<?> f12898i;

    /* renamed from: j */
    public File f12899j;

    public C6017d(List<C7109b> list, C6022h<?> hVar, C6020g.C6021a aVar) {
        this.f12891b = list;
        this.f12892c = hVar;
        this.f12893d = aVar;
    }

    /* renamed from: a */
    public final boolean mo16953a() {
        while (true) {
            List<C7588n<File, ?>> list = this.f12896g;
            if (list != null) {
                if (this.f12897h < list.size()) {
                    this.f12898i = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.f12897h < this.f12896g.size())) {
                            break;
                        }
                        List<C7588n<File, ?>> list2 = this.f12896g;
                        int i = this.f12897h;
                        this.f12897h = i + 1;
                        File file = this.f12899j;
                        C6022h<?> hVar = this.f12892c;
                        this.f12898i = list2.get(i).mo20000a(file, hVar.f12909e, hVar.f12910f, hVar.f12913i);
                        if (this.f12898i != null) {
                            if (this.f12892c.mo16958c(this.f12898i.f16855c.mo16848a()) != null) {
                                this.f12898i.f16855c.mo16855e(this.f12892c.f12919o, this);
                                z = true;
                            }
                        }
                    }
                    return z;
                }
            }
            int i2 = this.f12894e + 1;
            this.f12894e = i2;
            if (i2 >= this.f12891b.size()) {
                return false;
            }
            C7109b bVar = this.f12891b.get(this.f12894e);
            C6022h<?> hVar2 = this.f12892c;
            File a = ((C6030k.C6035c) hVar2.f12912h).mo16975a().mo19514a(new C6018e(bVar, hVar2.f12918n));
            this.f12899j = a;
            if (a != null) {
                this.f12895f = bVar;
                this.f12896g = this.f12892c.f12907c.getRegistry().mo16765e(a);
                this.f12897h = 0;
            }
        }
    }

    /* renamed from: c */
    public final void mo16862c(Exception exc) {
        this.f12893d.mo16876g(this.f12895f, exc, this.f12898i.f16855c, DataSource.DATA_DISK_CACHE);
    }

    public final void cancel() {
        C7588n.C7589a<?> aVar = this.f12898i;
        if (aVar != null) {
            aVar.f16855c.cancel();
        }
    }

    /* renamed from: f */
    public final void mo16863f(Object obj) {
        this.f12893d.mo16874e(this.f12895f, obj, this.f12898i.f16855c, DataSource.DATA_DISK_CACHE, this.f12895f);
    }
}
