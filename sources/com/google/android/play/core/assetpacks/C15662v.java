package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.C15032m3;
import com.google.android.play.core.internal.C15697i;
import com.google.android.play.core.internal.C15710v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p568fn.C17782b;
import p689ul.C18614l;
import p689ul.C18617o;

/* renamed from: com.google.android.play.core.assetpacks.v */
public final class C15662v implements C15677y2 {

    /* renamed from: g */
    public static final C15032m3 f35359g = new C15032m3("AssetPackServiceImpl");

    /* renamed from: h */
    public static final Intent f35360h = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    public final String f35361a;

    /* renamed from: b */
    public final C15671x0 f35362b;

    /* renamed from: c */
    public final C15581a2 f35363c;

    /* renamed from: d */
    public C15697i f35364d;

    /* renamed from: e */
    public C15697i f35365e;

    /* renamed from: f */
    public final AtomicBoolean f35366f = new AtomicBoolean();

    public C15662v(Context context, C15671x0 x0Var, C15581a2 a2Var) {
        this.f35361a = context.getPackageName();
        this.f35362b = x0Var;
        this.f35363c = a2Var;
        if (C15710v.m25542b(context)) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = applicationContext != null ? applicationContext : context;
            C15032m3 m3Var = f35359g;
            Intent intent = f35360h;
            C17782b bVar = C17782b.f38642m;
            this.f35364d = new C15697i(context2, m3Var, "AssetPackService", intent, bVar);
            Context applicationContext2 = context.getApplicationContext();
            this.f35365e = new C15697i(applicationContext2 != null ? applicationContext2 : context, m3Var, "AssetPackService-keepAlive", intent, bVar);
        }
        f35359g.mo52242b("AssetPackService initiated.", new Object[0]);
    }

    /* renamed from: h */
    public static Bundle m25468h() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11003);
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(1);
        arrayList2.add(2);
        bundle.putIntegerArrayList("supported_patch_formats", arrayList2);
        return bundle;
    }

    /* renamed from: i */
    public static C18617o m25469i() {
        f35359g.mo52243c("onError(%d)", -11);
        AssetPackException assetPackException = new AssetPackException(-11);
        C18617o oVar = new C18617o();
        synchronized (oVar.f41106a) {
            if (!oVar.f41108c) {
                oVar.f41108c = true;
                oVar.f41110e = assetPackException;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        oVar.f41107b.mo70124b(oVar);
        return oVar;
    }

    /* renamed from: k */
    public static /* bridge */ /* synthetic */ Bundle m25470k(Map map) {
        Bundle h = m25468h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        h.putParcelableArrayList("installed_asset_module", arrayList);
        return h;
    }

    /* renamed from: l */
    public static /* bridge */ /* synthetic */ ArrayList m25471l(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo55464a(int i, String str) {
        mo55492j(i, 10, str);
    }

    /* renamed from: b */
    public final void mo55465b(int i) {
        if (this.f35364d != null) {
            f35359g.mo52245e("notifySessionFailed", new Object[0]);
            C18614l lVar = new C18614l();
            this.f35364d.mo55523b(new C15614j(this, lVar, i, lVar), lVar);
            return;
        }
        throw new zzck("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: c */
    public final void mo55466c(String str, int i, int i2, String str2) {
        if (this.f35364d != null) {
            f35359g.mo52245e("notifyChunkTransferred", new Object[0]);
            C18614l lVar = new C18614l();
            this.f35364d.mo55523b(new C15606h(this, lVar, i, str, str2, i2, lVar), lVar);
            return;
        }
        throw new zzck("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: d */
    public final C18617o mo55467d(List list, C15676y1 y1Var, HashMap hashMap) {
        if (this.f35364d == null) {
            return m25469i();
        }
        f35359g.mo52245e("getPackStates(%s)", list);
        C18614l lVar = new C18614l();
        this.f35364d.mo55523b(new C15602g(this, lVar, list, hashMap, lVar, y1Var), lVar);
        return lVar.f41104a;
    }

    /* renamed from: e */
    public final void mo55468e(List list) {
        if (this.f35364d != null) {
            f35359g.mo52245e("cancelDownloads(%s)", list);
            C18614l lVar = new C18614l();
            this.f35364d.mo55523b(new C15594e(this, lVar, list, lVar), lVar);
        }
    }

    /* renamed from: f */
    public final C18617o mo55469f(HashMap hashMap) {
        if (this.f35364d == null) {
            return m25469i();
        }
        f35359g.mo52245e("syncPacks", new Object[0]);
        C18614l lVar = new C18614l();
        this.f35364d.mo55523b(new C15598f(this, lVar, hashMap, lVar), lVar);
        return lVar.f41104a;
    }

    /* renamed from: g */
    public final C18617o mo55470g(String str, int i, int i2, String str2) {
        if (this.f35364d == null) {
            return m25469i();
        }
        f35359g.mo52245e("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        C18614l lVar = new C18614l();
        this.f35364d.mo55523b(new C15618k(this, lVar, i, str, str2, i2, lVar), lVar);
        return lVar.f41104a;
    }

    /* renamed from: j */
    public final void mo55492j(int i, int i2, String str) {
        if (this.f35364d != null) {
            f35359g.mo52245e("notifyModuleCompleted", new Object[0]);
            C18614l lVar = new C18614l();
            this.f35364d.mo55523b(new C15610i(this, lVar, i, str, lVar, i2), lVar);
            return;
        }
        throw new zzck("The Play Store app is not installed or is an unofficial version.", i);
    }

    public final synchronized void zzf() {
        if (this.f35365e == null) {
            f35359g.mo52246f("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        C15032m3 m3Var = f35359g;
        m3Var.mo52245e("keepAlive", new Object[0]);
        if (!this.f35366f.compareAndSet(false, true)) {
            m3Var.mo52245e("Service is already kept alive.", new Object[0]);
            return;
        }
        C18614l lVar = new C18614l();
        this.f35365e.mo55523b(new C15622l(this, lVar, lVar), lVar);
    }
}
