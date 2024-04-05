package com.airbnb.lottie.model.layer;

import android.support.p013v4.media.C0072d;
import com.airbnb.lottie.C4828c;
import com.airbnb.lottie.model.content.Mask;
import java.util.List;
import java.util.Locale;
import p158k3.C7179b;
import p158k3.C7186i;
import p158k3.C7187j;
import p158k3.C7188k;
import p167l3.C7236b;
import p214q3.C7718a;

public final class Layer {

    /* renamed from: a */
    public final List<C7236b> f10962a;

    /* renamed from: b */
    public final C4828c f10963b;

    /* renamed from: c */
    public final String f10964c;

    /* renamed from: d */
    public final long f10965d;

    /* renamed from: e */
    public final LayerType f10966e;

    /* renamed from: f */
    public final long f10967f;

    /* renamed from: g */
    public final String f10968g;

    /* renamed from: h */
    public final List<Mask> f10969h;

    /* renamed from: i */
    public final C7188k f10970i;

    /* renamed from: j */
    public final int f10971j;

    /* renamed from: k */
    public final int f10972k;

    /* renamed from: l */
    public final int f10973l;

    /* renamed from: m */
    public final float f10974m;

    /* renamed from: n */
    public final float f10975n;

    /* renamed from: o */
    public final int f10976o;

    /* renamed from: p */
    public final int f10977p;

    /* renamed from: q */
    public final C7186i f10978q;

    /* renamed from: r */
    public final C7187j f10979r;

    /* renamed from: s */
    public final C7179b f10980s;

    /* renamed from: t */
    public final List<C7718a<Float>> f10981t;

    /* renamed from: u */
    public final MatteType f10982u;

    /* renamed from: v */
    public final boolean f10983v;

    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        UNKNOWN
    }

    public Layer(List<C7236b> list, C4828c cVar, String str, long j, LayerType layerType, long j2, String str2, List<Mask> list2, C7188k kVar, int i, int i2, int i3, float f, float f2, int i4, int i5, C7186i iVar, C7187j jVar, List<C7718a<Float>> list3, MatteType matteType, C7179b bVar, boolean z) {
        this.f10962a = list;
        this.f10963b = cVar;
        this.f10964c = str;
        this.f10965d = j;
        this.f10966e = layerType;
        this.f10967f = j2;
        this.f10968g = str2;
        this.f10969h = list2;
        this.f10970i = kVar;
        this.f10971j = i;
        this.f10972k = i2;
        this.f10973l = i3;
        this.f10974m = f;
        this.f10975n = f2;
        this.f10976o = i4;
        this.f10977p = i5;
        this.f10978q = iVar;
        this.f10979r = jVar;
        this.f10981t = list3;
        this.f10982u = matteType;
        this.f10980s = bVar;
        this.f10983v = z;
    }

    /* renamed from: a */
    public final String mo14600a(String str) {
        StringBuilder h = C0072d.m201h(str);
        h.append(this.f10964c);
        h.append("\n");
        C4828c cVar = this.f10963b;
        Layer layer = (Layer) cVar.f10848h.mo19889f(this.f10967f, (Long) null);
        if (layer != null) {
            h.append("\t\tParents: ");
            h.append(layer.f10964c);
            C4828c cVar2 = this.f10963b;
            Layer layer2 = (Layer) cVar2.f10848h.mo19889f(layer.f10967f, (Long) null);
            while (layer2 != null) {
                h.append("->");
                h.append(layer2.f10964c);
                C4828c cVar3 = this.f10963b;
                layer2 = (Layer) cVar3.f10848h.mo19889f(layer2.f10967f, (Long) null);
            }
            h.append(str);
            h.append("\n");
        }
        if (!this.f10969h.isEmpty()) {
            h.append(str);
            h.append("\tMasks: ");
            h.append(this.f10969h.size());
            h.append("\n");
        }
        if (!(this.f10971j == 0 || this.f10972k == 0)) {
            h.append(str);
            h.append("\tBackground: ");
            h.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(this.f10971j), Integer.valueOf(this.f10972k), Integer.valueOf(this.f10973l)}));
        }
        if (!this.f10962a.isEmpty()) {
            h.append(str);
            h.append("\tShapes:\n");
            for (C7236b next : this.f10962a) {
                h.append(str);
                h.append("\t\t");
                h.append(next);
                h.append("\n");
            }
        }
        return h.toString();
    }

    public final String toString() {
        return mo14600a("");
    }
}
