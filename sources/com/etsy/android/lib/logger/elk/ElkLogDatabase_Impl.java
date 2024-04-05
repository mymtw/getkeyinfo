package com.etsy.android.lib.logger.elk;

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
import p340ea.C12658b;
import p340ea.C12659c;

public final class ElkLogDatabase_Impl extends ElkLogDatabase {

    /* renamed from: m */
    public volatile C12659c f19064m;

    /* renamed from: com.etsy.android.lib.logger.elk.ElkLogDatabase_Impl$a */
    public class C8679a extends C3222c0.C3223a {
        public C8679a() {
            super(1);
        }

        /* renamed from: a */
        public final void mo12004a(C6920a aVar) {
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `logs` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `logAsJson` TEXT NOT NULL)");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.mo18966q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'abdce39207bb42fddbeeee62bc4be0db')");
        }

        /* renamed from: b */
        public final void mo12005b(C6920a aVar) {
            aVar.mo18966q("DROP TABLE IF EXISTS `logs`");
            List<RoomDatabase.C3214b> list = ElkLogDatabase_Impl.this.f7466g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ElkLogDatabase_Impl.this.f7466g.get(i).getClass();
                }
            }
        }

        /* renamed from: c */
        public final void mo12006c() {
            List<RoomDatabase.C3214b> list = ElkLogDatabase_Impl.this.f7466g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ElkLogDatabase_Impl.this.f7466g.get(i).getClass();
                }
            }
        }

        /* renamed from: d */
        public final void mo12007d(C6920a aVar) {
            ElkLogDatabase_Impl.this.f7460a = aVar;
            ElkLogDatabase_Impl.this.mo11981j(aVar);
            List<RoomDatabase.C3214b> list = ElkLogDatabase_Impl.this.f7466g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ElkLogDatabase_Impl.this.f7466g.get(i).mo11988a(aVar);
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
            HashMap hashMap = new HashMap(2);
            hashMap.put("id", new C0018e.C0019a(1, "id", "INTEGER", (String) null, true, 1));
            hashMap.put("logAsJson", new C0018e.C0019a(0, "logAsJson", "TEXT", (String) null, true, 1));
            C0018e eVar = new C0018e("logs", hashMap, new HashSet(0), new HashSet(0));
            C0018e a = C0018e.m99a(aVar, "logs");
            if (eVar.equals(a)) {
                return new C3222c0.C3224b(true, (String) null);
            }
            return new C3222c0.C3224b(false, "logs(com.etsy.android.lib.logger.elk.ElkLogDbModel).\n Expected:\n" + eVar + "\n Found:\n" + a);
        }
    }

    /* renamed from: d */
    public final C3244n mo11975d() {
        return new C3244n(this, new HashMap(0), new HashMap(0), "logs");
    }

    /* renamed from: e */
    public final C6832b mo11976e(C3237i iVar) {
        C3222c0 c0Var = new C3222c0(iVar, new C8679a(), "abdce39207bb42fddbeeee62bc4be0db", "4a03eba019dd43b815744ecf031cb9c3");
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
        hashMap.put(C12658b.class, Collections.emptyList());
        return hashMap;
    }

    /* renamed from: o */
    public final C12658b mo21336o() {
        C12659c cVar;
        if (this.f19064m != null) {
            return this.f19064m;
        }
        synchronized (this) {
            if (this.f19064m == null) {
                this.f19064m = new C12659c(this);
            }
            cVar = this.f19064m;
        }
        return cVar;
    }
}
