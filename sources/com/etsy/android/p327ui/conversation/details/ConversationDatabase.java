package com.etsy.android.p327ui.conversation.details;

import androidx.room.RoomDatabase;
import com.etsy.android.p327ui.conversation.details.models.ImageDatabaseModel;
import com.etsy.android.p327ui.conversation.details.models.ListingPartialDatabaseModel;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17414y;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p124h2.C6920a;
import p299z1.C8421b;

/* renamed from: com.etsy.android.ui.conversation.details.ConversationDatabase */
public abstract class ConversationDatabase extends RoomDatabase {

    /* renamed from: m */
    public static C17414y f20963m;

    /* renamed from: n */
    public static final C9461b f20964n = new C9461b();

    /* renamed from: o */
    public static final C9462c f20965o = new C9462c();

    /* renamed from: p */
    public static final C9463d f20966p = new C9463d();

    /* renamed from: q */
    public static final C9464e f20967q = new C9464e();

    /* renamed from: r */
    public static final C9465f f20968r = new C9465f();

    /* renamed from: s */
    public static final C9466g f20969s = new C9466g();

    /* renamed from: t */
    public static final C9467h f20970t = new C9467h();

    /* renamed from: u */
    public static final C9468i f20971u = new C9468i();

    /* renamed from: v */
    public static final C9469j f20972v = new C9469j();

    /* renamed from: w */
    public static final C9460a f20973w = new C9460a();

    /* renamed from: com.etsy.android.ui.conversation.details.ConversationDatabase$a */
    public static final class C9460a extends C8421b {
        public C9460a() {
            super(10, 11);
        }

        /* renamed from: a */
        public final void mo12859a(C6920a aVar) {
            C19383o.m32797g(aVar, "database");
            aVar.mo18966q("DROP TABLE messages");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `messages` (`messageId` INTEGER NOT NULL, `conversationId` INTEGER NOT NULL, `createDate` INTEGER NOT NULL, `sortKey` INTEGER NOT NULL, `text` TEXT NOT NULL, `translatedText` TEXT, `hasTranslationError` INTEGER NOT NULL, `senderUserId` INTEGER NOT NULL, `listings` TEXT NOT NULL, `images` TEXT NOT NULL, `language` TEXT NOT NULL, `messageSource` TEXT, `helpWithOrderRequestUrl` TEXT, `messageType` INTEGER NOT NULL, PRIMARY KEY(`messageId`))");
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.ConversationDatabase$b */
    public static final class C9461b extends C8421b {
        public C9461b() {
            super(1, 2);
        }

        /* renamed from: a */
        public final void mo12859a(C6920a aVar) {
            C19383o.m32797g(aVar, "database");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `convos` (`conversationId` INTEGER NOT NULL, `messageCount` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `hasAttachment` INTEGER NOT NULL, `title` TEXT NOT NULL, `lastMessage` TEXT NOT NULL, `lastUpdated` INTEGER NOT NULL, `otherUserId` INTEGER NOT NULL, `otherUserNameUser` TEXT NOT NULL, `otherUserNameFull` TEXT NOT NULL, `otherUserAvatarUrl` TEXT NOT NULL, `otherUserIsGuest` INTEGER NOT NULL, `isCustomShop` INTEGER NOT NULL, PRIMARY KEY(`conversationId`))");
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.ConversationDatabase$c */
    public static final class C9462c extends C8421b {
        public C9462c() {
            super(2, 3);
        }

        /* renamed from: a */
        public final void mo12859a(C6920a aVar) {
            C19383o.m32797g(aVar, "database");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `convo_drafts` (`id` INTEGER NOT NULL, `message` TEXT NOT NULL, `subject` TEXT NOT NULL, `userName` TEXT NOT NULL, `selectionStart` INTEGER NOT NULL, `selectionEnd` INTEGER NOT NULL, `imageFilePaths` TEXT NOT NULL, `status` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.ConversationDatabase$d */
    public static final class C9463d extends C8421b {
        public C9463d() {
            super(3, 4);
        }

        /* renamed from: a */
        public final void mo12859a(C6920a aVar) {
            C19383o.m32797g(aVar, "database");
            aVar.mo18966q("DROP TABLE convos");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `convos` (`conversationId` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `messageCount` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `hasAttachment` INTEGER NOT NULL, `title` TEXT NOT NULL, `lastMessage` TEXT NOT NULL, `lastUpdated` INTEGER NOT NULL, `otherUserId` INTEGER NOT NULL, `otherUserNameUser` TEXT NOT NULL, `otherUserNameFull` TEXT NOT NULL, `otherUserAvatarUrl` TEXT NOT NULL, `otherUserIsGuest` INTEGER NOT NULL, `isCustomShop` INTEGER NOT NULL, PRIMARY KEY(`conversationId`))");
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.ConversationDatabase$e */
    public static final class C9464e extends C8421b {
        public C9464e() {
            super(4, 5);
        }

        /* renamed from: a */
        public final void mo12859a(C6920a aVar) {
            C19383o.m32797g(aVar, "database");
            aVar.mo18966q("DROP TABLE convo_drafts");
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.ConversationDatabase$f */
    public static final class C9465f extends C8421b {
        public C9465f() {
            super(5, 6);
        }

        /* renamed from: a */
        public final void mo12859a(C6920a aVar) {
            C19383o.m32797g(aVar, "database");
            aVar.mo18966q("DROP TABLE convos");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `conversations` (`conversationId` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `messageCount` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `hasAttachment` INTEGER NOT NULL, `title` TEXT NOT NULL, `lastMessage` TEXT NOT NULL, `lastUpdated` INTEGER NOT NULL, `otherUserId` INTEGER NOT NULL, `otherUserNameUser` TEXT NOT NULL, `otherUserNameFull` TEXT NOT NULL, `otherUserAvatarUrl` TEXT NOT NULL, `otherUserIsGuest` INTEGER NOT NULL, `isCustomShop` INTEGER NOT NULL, `isCcm` INTEGER NOT NULL, PRIMARY KEY(`conversationId`))");
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.ConversationDatabase$g */
    public static final class C9466g extends C8421b {
        public C9466g() {
            super(6, 7);
        }

        /* renamed from: a */
        public final void mo12859a(C6920a aVar) {
            C19383o.m32797g(aVar, "database");
            aVar.mo18966q("DROP TABLE conversations");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `conversations` (`conversationId` INTEGER NOT NULL, `messageCount` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `hasAttachment` INTEGER NOT NULL, `title` TEXT, `lastMessage` TEXT NOT NULL, `lastUpdated` INTEGER NOT NULL, `otherUserId` INTEGER NOT NULL, `otherUserUsername` TEXT NOT NULL, `otherUserNameFull` TEXT NOT NULL, `otherUserAvatarUrl` TEXT NOT NULL, `otherUserIsGuest` INTEGER NOT NULL, `isCustomShop` INTEGER NOT NULL, `isCcm` INTEGER NOT NULL, PRIMARY KEY(`conversationId`))");
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.ConversationDatabase$h */
    public static final class C9467h extends C8421b {
        public C9467h() {
            super(7, 8);
        }

        /* renamed from: a */
        public final void mo12859a(C6920a aVar) {
            C19383o.m32797g(aVar, "database");
            aVar.mo18966q("DROP TABLE conversations");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `conversations` (`conversationId` INTEGER NOT NULL, `messageCount` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `hasAttachment` INTEGER NOT NULL, `title` TEXT, `lastMessage` TEXT NOT NULL, `lastUpdated` INTEGER NOT NULL, `otherUserId` INTEGER NOT NULL, `otherUserUsername` TEXT NOT NULL, `otherUserNameFull` TEXT NOT NULL, `otherUserAvatarUrl` TEXT NOT NULL, `otherUserIsGuest` INTEGER NOT NULL, `isCustomShop` INTEGER NOT NULL, `isCcm` INTEGER NOT NULL, PRIMARY KEY(`conversationId`))");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `messages` (`messageId` INTEGER NOT NULL, `conversationId` INTEGER NOT NULL, `createDate` INTEGER NOT NULL, `updateDate` INTEGER NOT NULL, `text` TEXT NOT NULL, `translatedText` TEXT, `hasTranslationError` INTEGER NOT NULL, `senderUserId` INTEGER NOT NULL, `listings` TEXT NOT NULL, `images` TEXT NOT NULL, `language` TEXT NOT NULL, PRIMARY KEY(`messageId`))");
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.ConversationDatabase$i */
    public static final class C9468i extends C8421b {
        public C9468i() {
            super(8, 9);
        }

        /* renamed from: a */
        public final void mo12859a(C6920a aVar) {
            C19383o.m32797g(aVar, "database");
            aVar.mo18966q("DROP TABLE messages");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `messages` (`messageId` INTEGER NOT NULL, `conversationId` INTEGER NOT NULL, `createDate` INTEGER NOT NULL, `text` TEXT NOT NULL, `translatedText` TEXT, `hasTranslationError` INTEGER NOT NULL, `senderUserId` INTEGER NOT NULL, `listings` TEXT NOT NULL, `images` TEXT NOT NULL, `language` TEXT NOT NULL, PRIMARY KEY(`messageId`))");
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.ConversationDatabase$j */
    public static final class C9469j extends C8421b {
        public C9469j() {
            super(9, 10);
        }

        /* renamed from: a */
        public final void mo12859a(C6920a aVar) {
            C19383o.m32797g(aVar, "database");
            aVar.mo18966q("DROP TABLE messages");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `messages` (`messageId` INTEGER NOT NULL, `conversationId` INTEGER NOT NULL, `createDate` INTEGER NOT NULL, `sortKey` INTEGER NOT NULL, `text` TEXT NOT NULL, `translatedText` TEXT, `hasTranslationError` INTEGER NOT NULL, `senderUserId` INTEGER NOT NULL, `listings` TEXT NOT NULL, `images` TEXT NOT NULL, `language` TEXT NOT NULL, PRIMARY KEY(`messageId`))");
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.ConversationDatabase$k */
    public static final class C9470k {
        /* renamed from: a */
        public static List m17813a(String str) {
            C19383o.m32797g(str, "json");
            C17414y yVar = ConversationDatabase.f20963m;
            if (yVar != null) {
                List list = (List) yVar.mo68557b(C17387a0.m29126d(List.class, ImageDatabaseModel.class)).fromJson(str);
                return list == null ? EmptyList.INSTANCE : list;
            }
            C19383o.m32805o("moshi");
            throw null;
        }

        /* renamed from: b */
        public static List m17814b(String str) {
            C19383o.m32797g(str, "json");
            C17414y yVar = ConversationDatabase.f20963m;
            if (yVar != null) {
                List list = (List) yVar.mo68557b(C17387a0.m29126d(List.class, ListingPartialDatabaseModel.class)).fromJson(str);
                return list == null ? EmptyList.INSTANCE : list;
            }
            C19383o.m32805o("moshi");
            throw null;
        }
    }

    /* renamed from: o */
    public abstract C9477c mo31954o();
}
