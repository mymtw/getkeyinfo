package p108fh;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.C6493a;
import com.google.android.datatransport.runtime.C6547k;
import com.google.android.datatransport.runtime.C6556p;
import com.google.android.datatransport.runtime.scheduling.persistence.C6599q;
import p120gh.C6898a;
import p316be.C8549a;

/* renamed from: fh.b */
public final /* synthetic */ class C6818b implements C6898a.C6899a, C6599q.C6600a {

    /* renamed from: b */
    public final /* synthetic */ Object f15007b;

    /* renamed from: c */
    public final /* synthetic */ Object f15008c;

    /* renamed from: d */
    public final /* synthetic */ Object f15009d;

    public /* synthetic */ C6818b(Object obj, Object obj2, Object obj3) {
        this.f15007b = obj;
        this.f15008c = obj2;
        this.f15009d = obj3;
    }

    public final Object apply(Object obj) {
        C6599q qVar = (C6599q) this.f15007b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C6493a aVar = C6599q.f14568g;
        qVar.getClass();
        sQLiteDatabase.compileStatement((String) this.f15008c).execute();
        C6599q.m12957j(sQLiteDatabase.rawQuery((String) this.f15009d, (String[]) null), new C8549a(qVar));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* renamed from: e */
    public final Object mo12018e() {
        C6819c cVar = (C6819c) this.f15007b;
        C6556p pVar = (C6556p) this.f15008c;
        cVar.f15014d.mo18786r0(pVar, (C6547k) this.f15009d);
        cVar.f15011a.mo18752a(pVar, 1);
        return null;
    }
}
