package com.etsy.android.p327ui.conversation.details;

import android.database.Cursor;
import androidx.room.C3226d0;
import androidx.room.C3233g0;
import androidx.room.C3234h;
import androidx.room.C3242l;
import androidx.room.RoomDatabase;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.p327ui.conversation.details.ConversationDatabase;
import com.etsy.android.p327ui.conversation.details.models.ImageDatabaseModel;
import com.etsy.android.p327ui.conversation.details.models.ListingPartialDatabaseModel;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17414y;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.flow.C19665q1;
import p003a2.C0016c;
import p112g2.C6838e;
import p348fc.C12715a;
import p348fc.C12716b;

/* renamed from: com.etsy.android.ui.conversation.details.e */
public final class C9514e implements C9477c {

    /* renamed from: a */
    public final RoomDatabase f21091a;

    /* renamed from: b */
    public final C9515a f21092b;

    /* renamed from: c */
    public final C9516b f21093c;

    /* renamed from: d */
    public final ConversationDatabase.C9470k f21094d = new ConversationDatabase.C9470k();

    /* renamed from: e */
    public final C9517c f21095e;

    /* renamed from: f */
    public final C9518d f21096f;

    /* renamed from: g */
    public final C9519e f21097g;

    /* renamed from: h */
    public final C9520f f21098h;

    /* renamed from: i */
    public final C9521g f21099i;

    /* renamed from: j */
    public final C9522h f21100j;

    /* renamed from: com.etsy.android.ui.conversation.details.e$a */
    public class C9515a extends C3242l<C12715a> {
        public C9515a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "INSERT OR REPLACE INTO `conversations` (`conversationId`,`messageCount`,`isRead`,`hasAttachment`,`title`,`lastMessage`,`lastUpdated`,`otherUserId`,`otherUserUsername`,`otherUserNameFull`,`otherUserAvatarUrl`,`otherUserIsGuest`,`isCustomShop`,`isCcm`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: d */
        public final void mo12037d(C6838e eVar, Object obj) {
            C12715a aVar = (C12715a) obj;
            eVar.mo12013h0(1, aVar.f28009a);
            eVar.mo12013h0(2, (long) aVar.f28010b);
            eVar.mo12013h0(3, aVar.f28011c ? 1 : 0);
            eVar.mo12013h0(4, aVar.f28012d ? 1 : 0);
            String str = aVar.f28013e;
            if (str == null) {
                eVar.mo12015p0(5);
            } else {
                eVar.mo12011Y(5, str);
            }
            String str2 = aVar.f28014f;
            if (str2 == null) {
                eVar.mo12015p0(6);
            } else {
                eVar.mo12011Y(6, str2);
            }
            eVar.mo12013h0(7, aVar.f28015g);
            eVar.mo12013h0(8, aVar.f28016h);
            String str3 = aVar.f28017i;
            if (str3 == null) {
                eVar.mo12015p0(9);
            } else {
                eVar.mo12011Y(9, str3);
            }
            String str4 = aVar.f28018j;
            if (str4 == null) {
                eVar.mo12015p0(10);
            } else {
                eVar.mo12011Y(10, str4);
            }
            String str5 = aVar.f28019k;
            if (str5 == null) {
                eVar.mo12015p0(11);
            } else {
                eVar.mo12011Y(11, str5);
            }
            eVar.mo12013h0(12, aVar.f28020l ? 1 : 0);
            eVar.mo12013h0(13, aVar.f28021m ? 1 : 0);
            eVar.mo12013h0(14, aVar.f28022n ? 1 : 0);
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.e$b */
    public class C9516b extends C3242l<C12716b> {
        public C9516b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "INSERT OR REPLACE INTO `messages` (`messageId`,`conversationId`,`createDate`,`sortKey`,`text`,`translatedText`,`hasTranslationError`,`senderUserId`,`listings`,`images`,`language`,`messageType`,`messageSource`,`helpWithOrderRequestUrl`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: d */
        public final void mo12037d(C6838e eVar, Object obj) {
            C12716b bVar = (C12716b) obj;
            eVar.mo12013h0(1, bVar.f28023a);
            eVar.mo12013h0(2, bVar.f28024b);
            eVar.mo12013h0(3, bVar.f28025c);
            eVar.mo12013h0(4, bVar.f28026d);
            String str = bVar.f28027e;
            if (str == null) {
                eVar.mo12015p0(5);
            } else {
                eVar.mo12011Y(5, str);
            }
            String str2 = bVar.f28028f;
            if (str2 == null) {
                eVar.mo12015p0(6);
            } else {
                eVar.mo12011Y(6, str2);
            }
            eVar.mo12013h0(7, bVar.f28029g ? 1 : 0);
            eVar.mo12013h0(8, bVar.f28030h);
            ConversationDatabase.C9470k kVar = C9514e.this.f21094d;
            List<ListingPartialDatabaseModel> list = bVar.f28031i;
            kVar.getClass();
            C19383o.m32797g(list, ListingCard.LISTING_CARD_ITEM_TYPE);
            C17414y yVar = ConversationDatabase.f20963m;
            if (yVar != null) {
                String json = yVar.mo68557b(C17387a0.m29126d(List.class, ListingPartialDatabaseModel.class)).toJson(list);
                C19383o.m32796f(json, "moshi.adapter<List<Listi…     .toJson(listingCard)");
                eVar.mo12011Y(9, json);
                ConversationDatabase.C9470k kVar2 = C9514e.this.f21094d;
                List<ImageDatabaseModel> list2 = bVar.f28032j;
                kVar2.getClass();
                C19383o.m32797g(list2, "imageInfo");
                C17414y yVar2 = ConversationDatabase.f20963m;
                if (yVar2 != null) {
                    String json2 = yVar2.mo68557b(C17387a0.m29126d(List.class, ImageDatabaseModel.class)).toJson(list2);
                    C19383o.m32796f(json2, "moshi.adapter<List<Image…       .toJson(imageInfo)");
                    eVar.mo12011Y(10, json2);
                    String str3 = bVar.f28033k;
                    if (str3 == null) {
                        eVar.mo12015p0(11);
                    } else {
                        eVar.mo12011Y(11, str3);
                    }
                    eVar.mo12013h0(12, (long) bVar.f28034l);
                    String str4 = bVar.f28035m;
                    if (str4 == null) {
                        eVar.mo12015p0(13);
                    } else {
                        eVar.mo12011Y(13, str4);
                    }
                    String str5 = bVar.f28036n;
                    if (str5 == null) {
                        eVar.mo12015p0(14);
                    } else {
                        eVar.mo12011Y(14, str5);
                    }
                } else {
                    C19383o.m32805o("moshi");
                    throw null;
                }
            } else {
                C19383o.m32805o("moshi");
                throw null;
            }
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.e$c */
    public class C9517c extends C3233g0 {
        public C9517c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "UPDATE messages SET translatedText = ?, hasTranslationError = ? WHERE messageId = ?";
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.e$d */
    public class C9518d extends C3233g0 {
        public C9518d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "UPDATE conversations SET isRead = ? WHERE conversationId = ?";
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.e$e */
    public class C9519e extends C3233g0 {
        public C9519e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "UPDATE conversations SET lastMessage = ?, lastUpdated = ? WHERE conversationId = ?";
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.e$f */
    public class C9520f extends C3233g0 {
        public C9520f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "DELETE FROM conversations WHERE conversationId = ?";
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.e$g */
    public class C9521g extends C3233g0 {
        public C9521g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "DELETE FROM conversations";
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.e$h */
    public class C9522h extends C3233g0 {
        public C9522h(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "DELETE FROM messages";
        }
    }

    public C9514e(RoomDatabase roomDatabase) {
        this.f21091a = roomDatabase;
        this.f21092b = new C9515a(roomDatabase);
        this.f21093c = new C9516b(roomDatabase);
        this.f21095e = new C9517c(roomDatabase);
        this.f21096f = new C9518d(roomDatabase);
        this.f21097g = new C9519e(roomDatabase);
        this.f21098h = new C9520f(roomDatabase);
        this.f21099i = new C9521g(roomDatabase);
        this.f21100j = new C9522h(roomDatabase);
    }

    /* renamed from: a */
    public final int mo31969a(long j, boolean z) {
        this.f21091a.mo11973b();
        C6838e a = this.f21096f.mo12028a();
        a.mo12013h0(1, z ? 1 : 0);
        a.mo12013h0(2, j);
        this.f21091a.mo11974c();
        try {
            int s = a.mo18972s();
            this.f21091a.mo11984m();
            return s;
        } finally {
            this.f21091a.mo11980i();
            this.f21096f.mo12030c(a);
        }
    }

    /* renamed from: b */
    public final int mo31970b(long j) {
        this.f21091a.mo11973b();
        C6838e a = this.f21098h.mo12028a();
        a.mo12013h0(1, j);
        this.f21091a.mo11974c();
        try {
            int s = a.mo18972s();
            this.f21091a.mo11984m();
            return s;
        } finally {
            this.f21091a.mo11980i();
            this.f21098h.mo12030c(a);
        }
    }

    /* renamed from: c */
    public final C19665q1 mo31971c(long j, boolean z) {
        C3226d0 d = C3226d0.m7877d(2, "SELECT * FROM conversations JOIN messages ON conversations.conversationId = messages.conversationId WHERE conversations.otherUserId = ? AND isCcm = ? ORDER BY sortKey DESC");
        d.mo12013h0(1, j);
        d.mo12013h0(2, z ? 1 : 0);
        return C3234h.m7895a(this.f21091a, new String[]{"conversations", ResponseConstants.MESSAGES}, new C9513d(this, d));
    }

    /* renamed from: d */
    public final void mo31972d() {
        this.f21091a.mo11974c();
        try {
            mo32042l();
            mo32043m();
            this.f21091a.mo11984m();
        } finally {
            this.f21091a.mo11980i();
        }
    }

    /* renamed from: e */
    public final void mo31973e(long j, String str, boolean z) {
        this.f21091a.mo11973b();
        C6838e a = this.f21095e.mo12028a();
        if (str == null) {
            a.mo12015p0(1);
        } else {
            a.mo12011Y(1, str);
        }
        a.mo12013h0(2, z ? 1 : 0);
        a.mo12013h0(3, j);
        this.f21091a.mo11974c();
        try {
            a.mo18972s();
            this.f21091a.mo11984m();
        } finally {
            this.f21091a.mo11980i();
            this.f21095e.mo12030c(a);
        }
    }

    /* renamed from: f */
    public final void mo31974f(C12716b bVar, long j, String str, long j2) {
        this.f21091a.mo11974c();
        try {
            C19383o.m32797g(str, "messageText");
            mo32044n(bVar);
            mo32046p(j, j2, str);
            this.f21091a.mo11984m();
        } finally {
            this.f21091a.mo11980i();
        }
    }

    /* renamed from: g */
    public final void mo31975g(C12715a aVar) {
        this.f21091a.mo11973b();
        this.f21091a.mo11974c();
        try {
            this.f21092b.mo12038e(aVar);
            this.f21091a.mo11984m();
        } finally {
            this.f21091a.mo11980i();
        }
    }

    /* renamed from: h */
    public final ArrayList mo31976h(boolean z) {
        C3226d0 d0Var;
        C3226d0 d = C3226d0.m7877d(1, "SELECT * FROM conversations WHERE isCcm = ? ORDER BY lastUpdated DESC");
        d.mo12013h0(1, z ? 1 : 0);
        this.f21091a.mo11973b();
        Cursor l = this.f21091a.mo11983l(d);
        try {
            int a = C0016c.m97a(l, "conversationId");
            int a2 = C0016c.m97a(l, "messageCount");
            int a3 = C0016c.m97a(l, "isRead");
            int a4 = C0016c.m97a(l, "hasAttachment");
            int a5 = C0016c.m97a(l, "title");
            int a6 = C0016c.m97a(l, "lastMessage");
            int a7 = C0016c.m97a(l, "lastUpdated");
            int a8 = C0016c.m97a(l, "otherUserId");
            int a9 = C0016c.m97a(l, "otherUserUsername");
            int a10 = C0016c.m97a(l, "otherUserNameFull");
            int a11 = C0016c.m97a(l, "otherUserAvatarUrl");
            int a12 = C0016c.m97a(l, "otherUserIsGuest");
            int a13 = C0016c.m97a(l, "isCustomShop");
            d0Var = d;
            try {
                int a14 = C0016c.m97a(l, "isCcm");
                ArrayList arrayList = new ArrayList(l.getCount());
                while (l.moveToNext()) {
                    long j = l.getLong(a);
                    int i = l.getInt(a2);
                    boolean z2 = l.getInt(a3) != 0;
                    boolean z3 = l.getInt(a4) != 0;
                    String str = null;
                    String string = l.isNull(a5) ? null : l.getString(a5);
                    String string2 = l.isNull(a6) ? null : l.getString(a6);
                    long j2 = l.getLong(a7);
                    long j3 = l.getLong(a8);
                    String string3 = l.isNull(a9) ? null : l.getString(a9);
                    String string4 = l.isNull(a10) ? null : l.getString(a10);
                    if (!l.isNull(a11)) {
                        str = l.getString(a11);
                    }
                    String str2 = str;
                    boolean z4 = l.getInt(a12) != 0;
                    boolean z5 = l.getInt(a13) != 0;
                    int i2 = a13;
                    int i3 = a14;
                    int i4 = i2;
                    int i5 = i3;
                    arrayList.add(new C12715a(j, i, z2, z3, string, string2, j2, j3, string3, string4, str2, z4, z5, l.getInt(i3) != 0));
                    a13 = i4;
                    a14 = i5;
                }
                l.close();
                d0Var.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                l.close();
                d0Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d0Var = d;
            l.close();
            d0Var.release();
            throw th;
        }
    }

    /* renamed from: i */
    public final void mo31977i(C12715a aVar, ArrayList arrayList) {
        this.f21091a.mo11974c();
        try {
            mo31975g(aVar);
            mo32045o(arrayList);
            this.f21091a.mo11984m();
        } finally {
            this.f21091a.mo11980i();
        }
    }

    /* renamed from: j */
    public final C19665q1 mo31978j() {
        C3226d0 d = C3226d0.m7877d(1, "SELECT * FROM conversations WHERE isCcm = ? ORDER BY lastUpdated DESC");
        d.mo12013h0(1, (long) 1);
        return C3234h.m7895a(this.f21091a, new String[]{"conversations"}, new C9523f(this, d));
    }

    /* renamed from: k */
    public final void mo31979k(ArrayList arrayList) {
        this.f21091a.mo11973b();
        this.f21091a.mo11974c();
        try {
            this.f21092b.mo12039f(arrayList);
            this.f21091a.mo11984m();
        } finally {
            this.f21091a.mo11980i();
        }
    }

    /* renamed from: l */
    public final void mo32042l() {
        this.f21091a.mo11973b();
        C6838e a = this.f21099i.mo12028a();
        this.f21091a.mo11974c();
        try {
            a.mo18972s();
            this.f21091a.mo11984m();
        } finally {
            this.f21091a.mo11980i();
            this.f21099i.mo12030c(a);
        }
    }

    /* renamed from: m */
    public final void mo32043m() {
        this.f21091a.mo11973b();
        C6838e a = this.f21100j.mo12028a();
        this.f21091a.mo11974c();
        try {
            a.mo18972s();
            this.f21091a.mo11984m();
        } finally {
            this.f21091a.mo11980i();
            this.f21100j.mo12030c(a);
        }
    }

    /* renamed from: n */
    public final void mo32044n(C12716b bVar) {
        this.f21091a.mo11973b();
        this.f21091a.mo11974c();
        try {
            this.f21093c.mo12038e(bVar);
            this.f21091a.mo11984m();
        } finally {
            this.f21091a.mo11980i();
        }
    }

    /* renamed from: o */
    public final void mo32045o(ArrayList arrayList) {
        this.f21091a.mo11973b();
        this.f21091a.mo11974c();
        try {
            this.f21093c.mo12039f(arrayList);
            this.f21091a.mo11984m();
        } finally {
            this.f21091a.mo11980i();
        }
    }

    /* renamed from: p */
    public final void mo32046p(long j, long j2, String str) {
        this.f21091a.mo11973b();
        C6838e a = this.f21097g.mo12028a();
        if (str == null) {
            a.mo12015p0(1);
        } else {
            a.mo12011Y(1, str);
        }
        a.mo12013h0(2, j2);
        a.mo12013h0(3, j);
        this.f21091a.mo11974c();
        try {
            a.mo18972s();
            this.f21091a.mo11984m();
        } finally {
            this.f21091a.mo11980i();
            this.f21097g.mo12030c(a);
        }
    }
}
