package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.C6051s;
import com.bumptech.glide.load.engine.bitmap_recycle.C5998d;
import com.google.android.gms.internal.measurement.C14582b0;
import com.google.android.gms.internal.measurement.C14598c3;
import com.google.android.gms.internal.measurement.C14608d0;
import com.google.android.gms.internal.measurement.C14621e0;
import com.google.android.gms.internal.measurement.C14634f0;
import com.google.android.gms.internal.measurement.C14647g0;
import com.google.android.gms.internal.measurement.C14763p;
import com.google.android.gms.internal.measurement.C14776q;
import com.google.android.gms.internal.measurement.C14837v;
import com.google.android.gms.internal.measurement.C14849w;
import com.google.android.gms.internal.measurement.C14861x;
import com.google.android.gms.internal.measurement.C14873y;
import com.google.android.gms.internal.measurement.zzbl;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C19388s;
import p150j4.C7114e;
import p150j4.C7116g;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b */
public final class C6077b implements C7116g {

    /* renamed from: b */
    public final Object f13072b;

    /* renamed from: c */
    public final Object f13073c;

    public /* synthetic */ C6077b() {
        this.f13072b = new HashMap();
        this.f13073c = new C14634f0();
        mo17029d(new C14837v());
        mo17029d(new C14861x());
        mo17029d(new C14873y());
        mo17029d(new C14582b0());
        mo17029d(new C14608d0());
        mo17029d(new C14621e0());
        mo17029d(new C14647g0());
    }

    /* renamed from: a */
    public final boolean mo5754a(Object obj, File file, C7114e eVar) {
        return ((C7116g) this.f13073c).mo5754a(new C6081e(((BitmapDrawable) ((C6051s) obj).get()).getBitmap(), (C5998d) this.f13072b), file, eVar);
    }

    /* renamed from: b */
    public final EncodeStrategy mo17027b(C7114e eVar) {
        return ((C7116g) this.f13073c).mo17027b(eVar);
    }

    /* renamed from: c */
    public final C14763p mo17028c(C14598c3 c3Var, C14763p pVar) {
        C19388s.m32830K0(c3Var);
        if (!(pVar instanceof C14776q)) {
            return pVar;
        }
        C14776q qVar = (C14776q) pVar;
        ArrayList<C14763p> arrayList = qVar.f33050c;
        String str = qVar.f33049b;
        return (((Map) this.f13072b).containsKey(str) ? (C14849w) ((Map) this.f13072b).get(str) : (C14634f0) this.f13073c).mo50377a(str, c3Var, arrayList);
    }

    /* renamed from: d */
    public final void mo17029d(C14849w wVar) {
        Iterator it = wVar.f33140a.iterator();
        while (it.hasNext()) {
            ((Map) this.f13072b).put(((zzbl) it.next()).zzb().toString(), wVar);
        }
    }

    public /* synthetic */ C6077b(C5998d dVar, C6079c cVar) {
        this.f13072b = dVar;
        this.f13073c = cVar;
    }
}
