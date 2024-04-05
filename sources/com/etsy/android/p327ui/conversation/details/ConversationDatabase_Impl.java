package com.etsy.android.p327ui.conversation.details;

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

/* renamed from: com.etsy.android.ui.conversation.details.ConversationDatabase_Impl */
public final class ConversationDatabase_Impl extends ConversationDatabase {

    /* renamed from: x */
    public volatile C9514e f20974x;

    /* renamed from: com.etsy.android.ui.conversation.details.ConversationDatabase_Impl$a */
    public class C9471a extends C3222c0.C3223a {
        public C9471a() {
            super(11);
        }

        /* renamed from: a */
        public final void mo12004a(C6920a aVar) {
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `conversations` (`conversationId` INTEGER NOT NULL, `messageCount` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `hasAttachment` INTEGER NOT NULL, `title` TEXT, `lastMessage` TEXT NOT NULL, `lastUpdated` INTEGER NOT NULL, `otherUserId` INTEGER NOT NULL, `otherUserUsername` TEXT NOT NULL, `otherUserNameFull` TEXT NOT NULL, `otherUserAvatarUrl` TEXT NOT NULL, `otherUserIsGuest` INTEGER NOT NULL, `isCustomShop` INTEGER NOT NULL, `isCcm` INTEGER NOT NULL, PRIMARY KEY(`conversationId`))");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `messages` (`messageId` INTEGER NOT NULL, `conversationId` INTEGER NOT NULL, `createDate` INTEGER NOT NULL, `sortKey` INTEGER NOT NULL, `text` TEXT NOT NULL, `translatedText` TEXT, `hasTranslationError` INTEGER NOT NULL, `senderUserId` INTEGER NOT NULL, `listings` TEXT NOT NULL, `images` TEXT NOT NULL, `language` TEXT NOT NULL, `messageType` INTEGER NOT NULL, `messageSource` TEXT, `helpWithOrderRequestUrl` TEXT, PRIMARY KEY(`messageId`))");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.mo18966q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2a2afc22b5cd9e885b759ee4154e1ddb')");
        }

        /* renamed from: b */
        public final void mo12005b(C6920a aVar) {
            aVar.mo18966q("DROP TABLE IF EXISTS `conversations`");
            aVar.mo18966q("DROP TABLE IF EXISTS `messages`");
            List<RoomDatabase.C3214b> list = ConversationDatabase_Impl.this.f7466g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ConversationDatabase_Impl.this.f7466g.get(i).getClass();
                }
            }
        }

        /* renamed from: c */
        public final void mo12006c() {
            List<RoomDatabase.C3214b> list = ConversationDatabase_Impl.this.f7466g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ConversationDatabase_Impl.this.f7466g.get(i).getClass();
                }
            }
        }

        /* renamed from: d */
        public final void mo12007d(C6920a aVar) {
            ConversationDatabase_Impl.this.f7460a = aVar;
            ConversationDatabase_Impl.this.mo11981j(aVar);
            List<RoomDatabase.C3214b> list = ConversationDatabase_Impl.this.f7466g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ConversationDatabase_Impl.this.f7466g.get(i).mo11988a(aVar);
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
            HashMap hashMap = new HashMap(14);
            hashMap.put("conversationId", new C0018e.C0019a(1, "conversationId", "INTEGER", (String) null, true, 1));
            hashMap.put("messageCount", new C0018e.C0019a(0, "messageCount", "INTEGER", (String) null, true, 1));
            hashMap.put("isRead", new C0018e.C0019a(0, "isRead", "INTEGER", (String) null, true, 1));
            hashMap.put("hasAttachment", new C0018e.C0019a(0, "hasAttachment", "INTEGER", (String) null, true, 1));
            hashMap.put("title", new C0018e.C0019a(0, "title", "TEXT", (String) null, false, 1));
            hashMap.put("lastMessage", new C0018e.C0019a(0, "lastMessage", "TEXT", (String) null, true, 1));
            hashMap.put("lastUpdated", new C0018e.C0019a(0, "lastUpdated", "INTEGER", (String) null, true, 1));
            hashMap.put("otherUserId", new C0018e.C0019a(0, "otherUserId", "INTEGER", (String) null, true, 1));
            hashMap.put("otherUserUsername", new C0018e.C0019a(0, "otherUserUsername", "TEXT", (String) null, true, 1));
            hashMap.put("otherUserNameFull", new C0018e.C0019a(0, "otherUserNameFull", "TEXT", (String) null, true, 1));
            hashMap.put("otherUserAvatarUrl", new C0018e.C0019a(0, "otherUserAvatarUrl", "TEXT", (String) null, true, 1));
            hashMap.put("otherUserIsGuest", new C0018e.C0019a(0, "otherUserIsGuest", "INTEGER", (String) null, true, 1));
            hashMap.put("isCustomShop", new C0018e.C0019a(0, "isCustomShop", "INTEGER", (String) null, true, 1));
            hashMap.put("isCcm", new C0018e.C0019a(0, "isCcm", "INTEGER", (String) null, true, 1));
            C0018e eVar = new C0018e("conversations", hashMap, new HashSet(0), new HashSet(0));
            C0018e a = C0018e.m99a(aVar2, "conversations");
            if (!eVar.equals(a)) {
                return new C3222c0.C3224b(false, "conversations(com.etsy.android.ui.conversation.details.models.ConversationDatabaseModel).\n Expected:\n" + eVar + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(14);
            hashMap2.put("messageId", new C0018e.C0019a(1, "messageId", "INTEGER", (String) null, true, 1));
            hashMap2.put("conversationId", new C0018e.C0019a(0, "conversationId", "INTEGER", (String) null, true, 1));
            hashMap2.put("createDate", new C0018e.C0019a(0, "createDate", "INTEGER", (String) null, true, 1));
            hashMap2.put("sortKey", new C0018e.C0019a(0, "sortKey", "INTEGER", (String) null, true, 1));
            hashMap2.put("text", new C0018e.C0019a(0, "text", "TEXT", (String) null, true, 1));
            hashMap2.put("translatedText", new C0018e.C0019a(0, "translatedText", "TEXT", (String) null, false, 1));
            hashMap2.put("hasTranslationError", new C0018e.C0019a(0, "hasTranslationError", "INTEGER", (String) null, true, 1));
            hashMap2.put("senderUserId", new C0018e.C0019a(0, "senderUserId", "INTEGER", (String) null, true, 1));
            hashMap2.put("listings", new C0018e.C0019a(0, "listings", "TEXT", (String) null, true, 1));
            hashMap2.put("images", new C0018e.C0019a(0, "images", "TEXT", (String) null, true, 1));
            hashMap2.put("language", new C0018e.C0019a(0, "language", "TEXT", (String) null, true, 1));
            hashMap2.put("messageType", new C0018e.C0019a(0, "messageType", "INTEGER", (String) null, true, 1));
            hashMap2.put("messageSource", new C0018e.C0019a(0, "messageSource", "TEXT", (String) null, false, 1));
            hashMap2.put("helpWithOrderRequestUrl", new C0018e.C0019a(0, "helpWithOrderRequestUrl", "TEXT", (String) null, false, 1));
            C0018e eVar2 = new C0018e(ResponseConstants.MESSAGES, hashMap2, new HashSet(0), new HashSet(0));
            C0018e a2 = C0018e.m99a(aVar2, ResponseConstants.MESSAGES);
            if (eVar2.equals(a2)) {
                return new C3222c0.C3224b(true, (String) null);
            }
            return new C3222c0.C3224b(false, "messages(com.etsy.android.ui.conversation.details.models.MessageDatabaseModel).\n Expected:\n" + eVar2 + "\n Found:\n" + a2);
        }
    }

    /* renamed from: d */
    public final C3244n mo11975d() {
        return new C3244n(this, new HashMap(0), new HashMap(0), "conversations", ResponseConstants.MESSAGES);
    }

    /* renamed from: e */
    public final C6832b mo11976e(C3237i iVar) {
        C3222c0 c0Var = new C3222c0(iVar, new C9471a(), "2a2afc22b5cd9e885b759ee4154e1ddb", "97ba0719600ba80695fdb225e8ad4f31");
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
        hashMap.put(C9477c.class, Collections.emptyList());
        return hashMap;
    }

    /* renamed from: o */
    public final C9477c mo31954o() {
        C9514e eVar;
        if (this.f20974x != null) {
            return this.f20974x;
        }
        synchronized (this) {
            if (this.f20974x == null) {
                this.f20974x = new C9514e(this);
            }
            eVar = this.f20974x;
        }
        return eVar;
    }
}
