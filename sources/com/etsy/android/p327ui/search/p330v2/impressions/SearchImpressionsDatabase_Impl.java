package com.etsy.android.p327ui.search.p330v2.impressions;

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
import p299z1.C8420a;
import p299z1.C8421b;
import p422pe.C13219a;
import p422pe.C13220b;

/* renamed from: com.etsy.android.ui.search.v2.impressions.SearchImpressionsDatabase_Impl */
public final class SearchImpressionsDatabase_Impl extends SearchImpressionsDatabase {

    /* renamed from: m */
    public volatile C13220b f24449m;

    /* renamed from: com.etsy.android.ui.search.v2.impressions.SearchImpressionsDatabase_Impl$a */
    public class C11029a extends C3222c0.C3223a {
        public C11029a() {
            super(1);
        }

        /* renamed from: a */
        public final void mo12004a(C6920a aVar) {
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `searchImpressions` (`displayLocation` TEXT NOT NULL, `loggingKey` TEXT NOT NULL, `data` TEXT NOT NULL, PRIMARY KEY(`displayLocation`, `loggingKey`, `data`))");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.mo18966q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c78824230b168d99da44ed132890d304')");
        }

        /* renamed from: b */
        public final void mo12005b(C6920a aVar) {
            aVar.mo18966q("DROP TABLE IF EXISTS `searchImpressions`");
            List<RoomDatabase.C3214b> list = SearchImpressionsDatabase_Impl.this.f7466g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    SearchImpressionsDatabase_Impl.this.f7466g.get(i).getClass();
                }
            }
        }

        /* renamed from: c */
        public final void mo12006c() {
            List<RoomDatabase.C3214b> list = SearchImpressionsDatabase_Impl.this.f7466g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    SearchImpressionsDatabase_Impl.this.f7466g.get(i).getClass();
                }
            }
        }

        /* renamed from: d */
        public final void mo12007d(C6920a aVar) {
            SearchImpressionsDatabase_Impl.this.f7460a = aVar;
            SearchImpressionsDatabase_Impl.this.mo11981j(aVar);
            List<RoomDatabase.C3214b> list = SearchImpressionsDatabase_Impl.this.f7466g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    SearchImpressionsDatabase_Impl.this.f7466g.get(i).mo11988a(aVar);
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
            HashMap hashMap = new HashMap(3);
            hashMap.put("displayLocation", new C0018e.C0019a(1, "displayLocation", "TEXT", (String) null, true, 1));
            hashMap.put("loggingKey", new C0018e.C0019a(2, "loggingKey", "TEXT", (String) null, true, 1));
            hashMap.put("data", new C0018e.C0019a(3, "data", "TEXT", (String) null, true, 1));
            C0018e eVar = new C0018e("searchImpressions", hashMap, new HashSet(0), new HashSet(0));
            C0018e a = C0018e.m99a(aVar, "searchImpressions");
            if (eVar.equals(a)) {
                return new C3222c0.C3224b(true, (String) null);
            }
            return new C3222c0.C3224b(false, "searchImpressions(com.etsy.android.ui.search.v2.impressions.SearchImpressionDbModel).\n Expected:\n" + eVar + "\n Found:\n" + a);
        }
    }

    /* renamed from: d */
    public final C3244n mo11975d() {
        return new C3244n(this, new HashMap(0), new HashMap(0), "searchImpressions");
    }

    /* renamed from: e */
    public final C6832b mo11976e(C3237i iVar) {
        C3222c0 c0Var = new C3222c0(iVar, new C11029a(), "c78824230b168d99da44ed132890d304", "5e0fcb72fb07d68be996df3a00624800");
        Context context = iVar.f7521b;
        String str = iVar.f7522c;
        if (context != null) {
            return iVar.f7520a.mo18970a(new C6832b.C6834b(context, str, c0Var, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    /* renamed from: f */
    public final List mo11977f() {
        return Arrays.asList(new C8421b[0]);
    }

    /* renamed from: g */
    public final Set<Class<? extends C8420a>> mo11978g() {
        return new HashSet();
    }

    /* renamed from: h */
    public final Map<Class<?>, List<Class<?>>> mo11979h() {
        HashMap hashMap = new HashMap();
        hashMap.put(C13219a.class, Collections.emptyList());
        return hashMap;
    }

    /* renamed from: o */
    public final C13219a mo36600o() {
        C13220b bVar;
        if (this.f24449m != null) {
            return this.f24449m;
        }
        synchronized (this) {
            if (this.f24449m == null) {
                this.f24449m = new C13220b(this);
            }
            bVar = this.f24449m;
        }
        return bVar;
    }
}
