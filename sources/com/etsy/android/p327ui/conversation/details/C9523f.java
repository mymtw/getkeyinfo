package com.etsy.android.p327ui.conversation.details;

import android.database.Cursor;
import androidx.room.C3226d0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p003a2.C0016c;
import p348fc.C12715a;

/* renamed from: com.etsy.android.ui.conversation.details.f */
public final class C9523f implements Callable<List<C12715a>> {

    /* renamed from: b */
    public final /* synthetic */ C3226d0 f21102b;

    /* renamed from: c */
    public final /* synthetic */ C9514e f21103c;

    public C9523f(C9514e eVar, C3226d0 d0Var) {
        this.f21103c = eVar;
        this.f21102b = d0Var;
    }

    public final Object call() throws Exception {
        Cursor l = this.f21103c.f21091a.mo11983l(this.f21102b);
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
            int a14 = C0016c.m97a(l, "isCcm");
            ArrayList arrayList = new ArrayList(l.getCount());
            while (l.moveToNext()) {
                long j = l.getLong(a);
                int i = l.getInt(a2);
                boolean z = l.getInt(a3) != 0;
                boolean z2 = l.getInt(a4) != 0;
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
                int i2 = a;
                int i3 = a14;
                int i4 = i3;
                arrayList.add(new C12715a(j, i, z, z2, string, string2, j2, j3, string3, string4, str, l.getInt(a12) != 0, l.getInt(a13) != 0, l.getInt(i3) != 0));
                a = i2;
                a14 = i4;
            }
            return arrayList;
        } finally {
            l.close();
        }
    }

    public final void finalize() {
        this.f21102b.release();
    }
}
