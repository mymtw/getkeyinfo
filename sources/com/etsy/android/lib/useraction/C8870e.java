package com.etsy.android.lib.useraction;

import androidx.room.C3226d0;
import androidx.room.C3228e0;
import androidx.room.C3233g0;
import androidx.room.C3242l;
import androidx.room.RoomDatabase;
import p112g2.C6838e;
import p145io.reactivex.internal.operators.single.SingleCreate;

/* renamed from: com.etsy.android.lib.useraction.e */
public final class C8870e implements C8869d {

    /* renamed from: a */
    public final RoomDatabase f19599a;

    /* renamed from: b */
    public final C8871a f19600b;

    /* renamed from: c */
    public final C8872b f19601c;

    /* renamed from: com.etsy.android.lib.useraction.e$a */
    public class C8871a extends C3242l<C8874g> {
        public C8871a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "INSERT OR REPLACE INTO `userActions` (`action`,`subject`,`subjectId`,`timestamp`,`userId`,`userActionId`) VALUES (?,?,?,?,?,nullif(?, 0))";
        }

        /* renamed from: d */
        public final void mo12037d(C6838e eVar, Object obj) {
            C8874g gVar = (C8874g) obj;
            String str = gVar.f19604a;
            if (str == null) {
                eVar.mo12015p0(1);
            } else {
                eVar.mo12011Y(1, str);
            }
            String str2 = gVar.f19605b;
            if (str2 == null) {
                eVar.mo12015p0(2);
            } else {
                eVar.mo12011Y(2, str2);
            }
            String str3 = gVar.f19606c;
            if (str3 == null) {
                eVar.mo12015p0(3);
            } else {
                eVar.mo12011Y(3, str3);
            }
            eVar.mo12013h0(4, gVar.f19607d);
            String str4 = gVar.f19608e;
            if (str4 == null) {
                eVar.mo12015p0(5);
            } else {
                eVar.mo12011Y(5, str4);
            }
            eVar.mo12013h0(6, (long) gVar.f19609f);
        }
    }

    /* renamed from: com.etsy.android.lib.useraction.e$b */
    public class C8872b extends C3233g0 {
        public C8872b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "DELETE FROM userActions WHERE userActionId NOT IN (SELECT userActionId from userActions WHERE userId = ? ORDER BY userActionId DESC LIMIT ?) AND userId == ?";
        }
    }

    public C8870e(RoomDatabase roomDatabase) {
        this.f19599a = roomDatabase;
        this.f19600b = new C8871a(roomDatabase);
        this.f19601c = new C8872b(roomDatabase);
    }

    /* renamed from: a */
    public final SingleCreate mo30442a(String str) {
        C3226d0 d = C3226d0.m7877d(1, "SELECT * FROM userActions WHERE userId = ?");
        if (str == null) {
            d.mo12015p0(1);
        } else {
            d.mo12011Y(1, str);
        }
        return new SingleCreate(new C3228e0(new C8873f(this, d)));
    }

    /* renamed from: b */
    public final void mo30443b(String str) {
        this.f19599a.mo11973b();
        C6838e a = this.f19601c.mo12028a();
        if (str == null) {
            a.mo12015p0(1);
        } else {
            a.mo12011Y(1, str);
        }
        a.mo12013h0(2, (long) 10);
        if (str == null) {
            a.mo12015p0(3);
        } else {
            a.mo12011Y(3, str);
        }
        this.f19599a.mo11974c();
        try {
            a.mo18972s();
            this.f19599a.mo11984m();
        } finally {
            this.f19599a.mo11980i();
            this.f19601c.mo12030c(a);
        }
    }

    /* renamed from: c */
    public final void mo30444c(C8874g gVar) {
        this.f19599a.mo11973b();
        this.f19599a.mo11974c();
        try {
            this.f19600b.mo12038e(gVar);
            this.f19599a.mo11984m();
        } finally {
            this.f19599a.mo11980i();
        }
    }
}
