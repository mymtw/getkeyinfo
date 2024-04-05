package com.bumptech.glide.load.engine;

import android.support.p013v4.media.C0072d;
import androidx.activity.C0114h;
import com.bumptech.glide.load.data.C5970e;
import com.bumptech.glide.load.engine.DecodeJob;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p077d1.C6620d;
import p080d5.C6652a;
import p150j4.C7114e;

/* renamed from: com.bumptech.glide.load.engine.q */
public final class C6048q<Data, ResourceType, Transcode> {

    /* renamed from: a */
    public final C6620d<List<Throwable>> f13006a;

    /* renamed from: b */
    public final List<? extends C6023i<Data, ResourceType, Transcode>> f13007b;

    /* renamed from: c */
    public final String f13008c;

    public C6048q(Class cls, Class cls2, Class cls3, List list, C6652a.C6655c cVar) {
        this.f13006a = cVar;
        if (!list.isEmpty()) {
            this.f13007b = list;
            StringBuilder h = C0072d.m201h("Failed LoadPath{");
            h.append(cls.getSimpleName());
            h.append("->");
            h.append(cls2.getSimpleName());
            h.append("->");
            h.append(cls3.getSimpleName());
            h.append("}");
            this.f13008c = h.toString();
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    /* renamed from: a */
    public final C6051s mo16997a(int i, int i2, C7114e eVar, C5970e eVar2, DecodeJob.C5987c cVar) throws GlideException {
        C6051s sVar;
        List<Throwable> b = this.f13006a.mo18807b();
        C0114h.m281L(b);
        List list = b;
        try {
            int size = this.f13007b.size();
            sVar = null;
            for (int i3 = 0; i3 < size; i3++) {
                sVar = ((C6023i) this.f13007b.get(i3)).mo16962a(i, i2, eVar, eVar2, cVar);
                if (sVar != null) {
                    break;
                }
            }
        } catch (GlideException e) {
            list.add(e);
        } catch (Throwable th) {
            this.f13006a.mo18806a(list);
            throw th;
        }
        if (sVar != null) {
            this.f13006a.mo18806a(list);
            return sVar;
        }
        throw new GlideException(this.f13008c, (List<Throwable>) new ArrayList(list));
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("LoadPath{decodePaths=");
        h.append(Arrays.toString(this.f13007b.toArray()));
        h.append('}');
        return h.toString();
    }
}
