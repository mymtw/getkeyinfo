package com.etsy.android.p072ad;

import android.content.Context;
import androidx.room.C3222c0;
import androidx.room.C3237i;
import androidx.room.C3244n;
import androidx.room.RoomDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p003a2.C0017d;
import p003a2.C0018e;
import p112g2.C6832b;
import p124h2.C6920a;
import p277w8.C8272j;
import p286x8.C8328b;
import p286x8.C8329c;
import p296y8.C8401b;
import p296y8.C8402c;
import p299z1.C8420a;
import p299z1.C8421b;

/* renamed from: com.etsy.android.ad.AdImpressionsDatabase_Impl */
public final class AdImpressionsDatabase_Impl extends AdImpressionsDatabase {

    /* renamed from: m */
    public volatile C8402c f14100m;

    /* renamed from: n */
    public volatile C8329c f14101n;

    /* renamed from: com.etsy.android.ad.AdImpressionsDatabase_Impl$a */
    public class C6330a extends C3222c0.C3223a {
        public C6330a() {
            super(2);
        }

        /* renamed from: a */
        public final void mo12004a(C6920a aVar) {
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `adImpressions` (`displayLocation` TEXT NOT NULL, `loggingKey` TEXT NOT NULL, PRIMARY KEY(`displayLocation`, `loggingKey`))");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `adClicks` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `loggingKey` TEXT NOT NULL)");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.mo18966q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '95b0d77ef8af781a5306fc4fdc3b46cd')");
        }

        /* renamed from: b */
        public final void mo12005b(C6920a aVar) {
            aVar.mo18966q("DROP TABLE IF EXISTS `adImpressions`");
            aVar.mo18966q("DROP TABLE IF EXISTS `adClicks`");
            List<RoomDatabase.C3214b> list = AdImpressionsDatabase_Impl.this.f7466g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    AdImpressionsDatabase_Impl.this.f7466g.get(i).getClass();
                }
            }
        }

        /* renamed from: c */
        public final void mo12006c() {
            List<RoomDatabase.C3214b> list = AdImpressionsDatabase_Impl.this.f7466g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    AdImpressionsDatabase_Impl.this.f7466g.get(i).getClass();
                }
            }
        }

        /* renamed from: d */
        public final void mo12007d(C6920a aVar) {
            AdImpressionsDatabase_Impl.this.f7460a = aVar;
            AdImpressionsDatabase_Impl.this.mo11981j(aVar);
            List<RoomDatabase.C3214b> list = AdImpressionsDatabase_Impl.this.f7466g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    AdImpressionsDatabase_Impl.this.f7466g.get(i).mo11988a(aVar);
                }
            }
        }

        /* renamed from: e */
        public final void mo12008e() {
        }

        /* renamed from: f */
        public final void mo12009f(C6920a aVar) {
            C0017d.m98a(aVar);
        }

        /* renamed from: g */
        public final C3222c0.C3224b mo12010g(C6920a aVar) {
            C6920a aVar2 = aVar;
            HashMap hashMap = new HashMap(2);
            hashMap.put("displayLocation", new C0018e.C0019a(1, "displayLocation", "TEXT", (String) null, true, 1));
            hashMap.put("loggingKey", new C0018e.C0019a(2, "loggingKey", "TEXT", (String) null, true, 1));
            C0018e eVar = new C0018e("adImpressions", hashMap, new HashSet(0), new HashSet(0));
            C0018e a = C0018e.m99a(aVar2, "adImpressions");
            if (!eVar.equals(a)) {
                return new C3222c0.C3224b(false, "adImpressions(com.etsy.android.ad.impressions.AdImpression).\n Expected:\n" + eVar + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("id", new C0018e.C0019a(1, "id", "INTEGER", (String) null, true, 1));
            hashMap2.put("loggingKey", new C0018e.C0019a(0, "loggingKey", "TEXT", (String) null, true, 1));
            C0018e eVar2 = new C0018e("adClicks", hashMap2, new HashSet(0), new HashSet(0));
            C0018e a2 = C0018e.m99a(aVar2, "adClicks");
            if (eVar2.equals(a2)) {
                return new C3222c0.C3224b(true, (String) null);
            }
            return new C3222c0.C3224b(false, "adClicks(com.etsy.android.ad.clicks.AdClick).\n Expected:\n" + eVar2 + "\n Found:\n" + a2);
        }
    }

    /* renamed from: d */
    public final C3244n mo11975d() {
        return new C3244n(this, new HashMap(0), new HashMap(0), "adImpressions", "adClicks");
    }

    /* renamed from: e */
    public final C6832b mo11976e(C3237i iVar) {
        C3222c0 c0Var = new C3222c0(iVar, new C6330a(), "95b0d77ef8af781a5306fc4fdc3b46cd", "9555dcb010a63669a8d4719890126dcc");
        Context context = iVar.f7521b;
        String str = iVar.f7522c;
        if (context != null) {
            return iVar.f7520a.mo18970a(new C6832b.C6834b(context, str, c0Var, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    /* renamed from: f */
    public final List mo11977f() {
        return Arrays.asList(new C8421b[]{new C8272j()});
    }

    /* renamed from: g */
    public final Set<Class<? extends C8420a>> mo11978g() {
        return new HashSet();
    }

    /* renamed from: h */
    public final Map<Class<?>, List<Class<?>>> mo11979h() {
        HashMap hashMap = new HashMap();
        hashMap.put(C8401b.class, Collections.emptyList());
        hashMap.put(C8328b.class, Collections.emptyList());
        return hashMap;
    }

    /* renamed from: o */
    public final C8328b mo18062o() {
        C8329c cVar;
        if (this.f14101n != null) {
            return this.f14101n;
        }
        synchronized (this) {
            if (this.f14101n == null) {
                this.f14101n = new C8329c(this);
            }
            cVar = this.f14101n;
        }
        return cVar;
    }

    /* renamed from: p */
    public final C8401b mo18063p() {
        C8402c cVar;
        if (this.f14100m != null) {
            return this.f14100m;
        }
        synchronized (this) {
            if (this.f14100m == null) {
                this.f14100m = new C8402c(this);
            }
            cVar = this.f14100m;
        }
        return cVar;
    }
}
