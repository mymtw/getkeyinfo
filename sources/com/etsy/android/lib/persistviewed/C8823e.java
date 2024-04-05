package com.etsy.android.lib.persistviewed;

import android.database.Cursor;
import androidx.room.C3226d0;
import androidx.room.C3233g0;
import androidx.room.C3242l;
import androidx.room.RoomDatabase;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import p003a2.C0016c;
import p112g2.C6838e;

/* renamed from: com.etsy.android.lib.persistviewed.e */
public final class C8823e implements C8822d {

    /* renamed from: a */
    public final RoomDatabase f19390a;

    /* renamed from: b */
    public final C8824a f19391b;

    /* renamed from: c */
    public final C8825b f19392c;

    /* renamed from: d */
    public final C8826c f19393d;

    /* renamed from: com.etsy.android.lib.persistviewed.e$a */
    public class C8824a extends C3242l<C8827f> {
        public C8824a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "INSERT OR REPLACE INTO `persistViewed` (`listingId`,`timestamp`) VALUES (?,?)";
        }

        /* renamed from: d */
        public final void mo12037d(C6838e eVar, Object obj) {
            C8827f fVar = (C8827f) obj;
            eVar.mo12013h0(1, fVar.f19394a);
            eVar.mo12013h0(2, fVar.f19395b);
        }
    }

    /* renamed from: com.etsy.android.lib.persistviewed.e$b */
    public class C8825b extends C3233g0 {
        public C8825b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "Delete from persistViewed WHERE timestamp < ?";
        }
    }

    /* renamed from: com.etsy.android.lib.persistviewed.e$c */
    public class C8826c extends C3233g0 {
        public C8826c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "Delete FROM persistViewed";
        }
    }

    public C8823e(RoomDatabase roomDatabase) {
        this.f19390a = roomDatabase;
        this.f19391b = new C8824a(roomDatabase);
        this.f19392c = new C8825b(roomDatabase);
        this.f19393d = new C8826c(roomDatabase);
    }

    /* renamed from: b */
    public final void mo30142b() {
        this.f19390a.mo11973b();
        C6838e a = this.f19393d.mo12028a();
        this.f19390a.mo11974c();
        try {
            a.mo18972s();
            this.f19390a.mo11984m();
        } finally {
            this.f19390a.mo11980i();
            this.f19393d.mo12030c(a);
        }
    }

    /* renamed from: c */
    public final void mo30143c(long j) {
        this.f19390a.mo11973b();
        C6838e a = this.f19392c.mo12028a();
        a.mo12013h0(1, j);
        this.f19390a.mo11974c();
        try {
            a.mo18972s();
            this.f19390a.mo11984m();
        } finally {
            this.f19390a.mo11980i();
            this.f19392c.mo12030c(a);
        }
    }

    /* renamed from: d */
    public final void mo30144d(C8827f fVar) {
        this.f19390a.mo11973b();
        this.f19390a.mo11974c();
        try {
            this.f19391b.mo12038e(fVar);
            this.f19390a.mo11984m();
        } finally {
            this.f19390a.mo11980i();
        }
    }

    public final ArrayList getAll() {
        C3226d0 d = C3226d0.m7877d(0, "Select * from persistViewed");
        this.f19390a.mo11973b();
        Cursor l = this.f19390a.mo11983l(d);
        try {
            int a = C0016c.m97a(l, "listingId");
            int a2 = C0016c.m97a(l, ResponseConstants.TIMESTAMP);
            ArrayList arrayList = new ArrayList(l.getCount());
            while (l.moveToNext()) {
                arrayList.add(new C8827f(l.getLong(a), l.getLong(a2)));
            }
            return arrayList;
        } finally {
            l.close();
            d.release();
        }
    }
}
