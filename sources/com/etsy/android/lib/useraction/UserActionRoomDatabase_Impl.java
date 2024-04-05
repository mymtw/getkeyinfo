package com.etsy.android.lib.useraction;

import android.content.Context;
import androidx.room.C3222c0;
import androidx.room.C3237i;
import androidx.room.C3244n;
import androidx.room.RoomDatabase;
import com.etsy.android.lib.models.ResponseConstants;
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

public final class UserActionRoomDatabase_Impl extends UserActionRoomDatabase {

    /* renamed from: m */
    public volatile C8870e f19591m;

    /* renamed from: com.etsy.android.lib.useraction.UserActionRoomDatabase_Impl$a */
    public class C8865a extends C3222c0.C3223a {
        public C8865a() {
            super(1);
        }

        /* renamed from: a */
        public final void mo12004a(C6920a aVar) {
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `userActions` (`action` TEXT NOT NULL, `subject` TEXT NOT NULL, `subjectId` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `userId` TEXT NOT NULL, `userActionId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.mo18966q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6bf069d7963f75dc0647bfc77c2aea57')");
        }

        /* renamed from: b */
        public final void mo12005b(C6920a aVar) {
            aVar.mo18966q("DROP TABLE IF EXISTS `userActions`");
            List<RoomDatabase.C3214b> list = UserActionRoomDatabase_Impl.this.f7466g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    UserActionRoomDatabase_Impl.this.f7466g.get(i).getClass();
                }
            }
        }

        /* renamed from: c */
        public final void mo12006c() {
            List<RoomDatabase.C3214b> list = UserActionRoomDatabase_Impl.this.f7466g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    UserActionRoomDatabase_Impl.this.f7466g.get(i).getClass();
                }
            }
        }

        /* renamed from: d */
        public final void mo12007d(C6920a aVar) {
            UserActionRoomDatabase_Impl.this.f7460a = aVar;
            UserActionRoomDatabase_Impl.this.mo11981j(aVar);
            List<RoomDatabase.C3214b> list = UserActionRoomDatabase_Impl.this.f7466g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    UserActionRoomDatabase_Impl.this.f7466g.get(i).mo11988a(aVar);
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
            HashMap hashMap = new HashMap(6);
            hashMap.put(ResponseConstants.ACTION, new C0018e.C0019a(0, ResponseConstants.ACTION, "TEXT", (String) null, true, 1));
            hashMap.put(ResponseConstants.SUBJECT, new C0018e.C0019a(0, ResponseConstants.SUBJECT, "TEXT", (String) null, true, 1));
            hashMap.put("subjectId", new C0018e.C0019a(0, "subjectId", "TEXT", (String) null, true, 1));
            hashMap.put(ResponseConstants.TIMESTAMP, new C0018e.C0019a(0, ResponseConstants.TIMESTAMP, "INTEGER", (String) null, true, 1));
            hashMap.put("userId", new C0018e.C0019a(0, "userId", "TEXT", (String) null, true, 1));
            hashMap.put("userActionId", new C0018e.C0019a(1, "userActionId", "INTEGER", (String) null, true, 1));
            C0018e eVar = new C0018e("userActions", hashMap, new HashSet(0), new HashSet(0));
            C0018e a = C0018e.m99a(aVar, "userActions");
            if (eVar.equals(a)) {
                return new C3222c0.C3224b(true, (String) null);
            }
            return new C3222c0.C3224b(false, "userActions(com.etsy.android.lib.useraction.UserActionDbModel).\n Expected:\n" + eVar + "\n Found:\n" + a);
        }
    }

    /* renamed from: d */
    public final C3244n mo11975d() {
        return new C3244n(this, new HashMap(0), new HashMap(0), "userActions");
    }

    /* renamed from: e */
    public final C6832b mo11976e(C3237i iVar) {
        C3222c0 c0Var = new C3222c0(iVar, new C8865a(), "6bf069d7963f75dc0647bfc77c2aea57", "92ce9777c8cf84a3d5bc82544eae497b");
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
        hashMap.put(C8869d.class, Collections.emptyList());
        return hashMap;
    }

    /* renamed from: o */
    public final C8869d mo30439o() {
        C8870e eVar;
        if (this.f19591m != null) {
            return this.f19591m;
        }
        synchronized (this) {
            if (this.f19591m == null) {
                this.f19591m = new C8870e(this);
            }
            eVar = this.f19591m;
        }
        return eVar;
    }
}
