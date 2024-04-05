package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.support.p013v4.media.C0072d;
import android.util.Base64;
import android.util.Log;
import androidx.room.C3219b;
import androidx.room.C3225d;
import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.google.android.datatransport.C6493a;
import com.google.android.datatransport.runtime.C6547k;
import com.google.android.datatransport.runtime.C6556p;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.C19388s;
import p030bo.app.C3653e7;
import p041ch.C4802a;
import p085dh.C6673a;
import p108fh.C6818b;
import p120gh.C6898a;
import p132hh.C6963a;
import p144ih.C7008a;
import p306z8.C8475b;
import p306z8.C8481h;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.q */
public final class C6599q implements C6580b, C6898a, C6579a {

    /* renamed from: g */
    public static final C6493a f14568g = new C6493a("proto");

    /* renamed from: b */
    public final C6608x f14569b;

    /* renamed from: c */
    public final C6963a f14570c;

    /* renamed from: d */
    public final C6963a f14571d;

    /* renamed from: e */
    public final C6581c f14572e;

    /* renamed from: f */
    public final C4802a<String> f14573f;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.q$a */
    public interface C6600a<T, U> {
        U apply(T t);
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.q$b */
    public static class C6601b {

        /* renamed from: a */
        public final String f14574a;

        /* renamed from: b */
        public final String f14575b;

        public C6601b(String str, String str2) {
            this.f14574a = str;
            this.f14575b = str2;
        }
    }

    public C6599q(C6963a aVar, C6963a aVar2, C6581c cVar, C6608x xVar, C4802a<String> aVar3) {
        this.f14569b = xVar;
        this.f14570c = aVar;
        this.f14571d = aVar2;
        this.f14572e = cVar;
        this.f14573f = aVar3;
    }

    /* renamed from: g */
    public static Long m12955g(SQLiteDatabase sQLiteDatabase, C6556p pVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{pVar.getBackendName(), String.valueOf(C7008a.m13568a(pVar.getPriority()))}));
        if (pVar.getExtras() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.getExtras(), 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{AnalyticsLogDatabaseHelper.f19040ID}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    /* renamed from: i */
    public static String m12956i(Iterable<C6590h> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<C6590h> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getId());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: j */
    public static <T> T m12957j(Cursor cursor, C6600a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: N */
    public final long mo18779N(C6556p pVar) {
        return ((Long) m12957j(mo18791f().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.getBackendName(), String.valueOf(C7008a.m13568a(pVar.getPriority()))}), new C3219b(3))).longValue();
    }

    /* renamed from: P */
    public final boolean mo18780P(C6556p pVar) {
        return ((Boolean) mo18792h(new C6594l(this, pVar))).booleanValue();
    }

    /* renamed from: T */
    public final void mo18781T(Iterable<C6590h> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder h = C0072d.m201h("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            h.append(m12956i(iterable));
            mo18792h(new C6818b(this, h.toString(), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    /* renamed from: a */
    public final void mo18776a() {
        mo18792h(new C3653e7(this, 7));
    }

    /* renamed from: a0 */
    public final Iterable<C6590h> mo18782a0(C6556p pVar) {
        return (Iterable) mo18792h(new C8475b(this, pVar));
    }

    /* renamed from: b */
    public final C6673a mo18777b() {
        int i = C6673a.f14727e;
        C6673a.C6674a aVar = new C6673a.C6674a();
        HashMap hashMap = new HashMap();
        SQLiteDatabase f = mo18791f();
        f.beginTransaction();
        try {
            C6673a aVar2 = (C6673a) m12957j(f.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C6592j(this, hashMap, aVar, 1));
            f.setTransactionSuccessful();
            return aVar2;
        } finally {
            f.endTransaction();
        }
    }

    /* renamed from: c */
    public final void mo18783c(Iterable<C6590h> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder h = C0072d.m201h("DELETE FROM events WHERE _id in ");
            h.append(m12956i(iterable));
            mo18791f().compileStatement(h.toString()).execute();
        }
    }

    public final int cleanUp() {
        return ((Integer) mo18792h(new C6593k(this, this.f14570c.mo19124a() - this.f14572e.getEventCleanUpAge()))).intValue();
    }

    public final void close() {
        this.f14569b.close();
    }

    /* renamed from: d */
    public final void mo18778d(long j, LogEventDropped.Reason reason, String str) {
        mo18792h(new C6595m(j, reason, str));
    }

    /* renamed from: e */
    public final <T> T mo18790e(C6898a.C6899a<T> aVar) {
        SQLiteDatabase f = mo18791f();
        C3225d dVar = new C3225d(1);
        long a = this.f14571d.mo19124a();
        while (true) {
            try {
                f.beginTransaction();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f14571d.mo19124a() >= ((long) this.f14572e.getCriticalSectionEnterTimeoutMs()) + a) {
                    dVar.apply(e);
                    break;
                }
                SystemClock.sleep(50);
            }
        }
        try {
            T e2 = aVar.mo12018e();
            f.setTransactionSuccessful();
            return e2;
        } finally {
            f.endTransaction();
        }
    }

    /* renamed from: f */
    public final SQLiteDatabase mo18791f() {
        C6608x xVar = this.f14569b;
        Objects.requireNonNull(xVar);
        long a = this.f14571d.mo19124a();
        while (true) {
            try {
                SQLiteDatabase writableDatabase = xVar.getWritableDatabase();
                SQLiteDatabase sQLiteDatabase = writableDatabase;
                return writableDatabase;
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f14571d.mo19124a() < ((long) this.f14572e.getCriticalSectionEnterTimeoutMs()) + a) {
                    SystemClock.sleep(50);
                } else {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
            }
        }
    }

    /* renamed from: h */
    public final <T> T mo18792h(C6600a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase f = mo18791f();
        f.beginTransaction();
        try {
            T apply = aVar.apply(f);
            f.setTransactionSuccessful();
            return apply;
        } finally {
            f.endTransaction();
        }
    }

    /* renamed from: n0 */
    public final void mo18785n0(long j, C6556p pVar) {
        mo18792h(new C6596n(j, pVar));
    }

    /* renamed from: r0 */
    public final C6590h mo18786r0(C6556p pVar, C6547k kVar) {
        Log.d(C19388s.m32864h0("SQLiteEventStore"), String.format("Storing event with priority=%s, name=%s for destination %s", new Object[]{pVar.getPriority(), kVar.getTransportName(), pVar.getBackendName()}));
        long longValue = ((Long) mo18792h(new C6592j(this, kVar, pVar, 0))).longValue();
        if (longValue < 1) {
            return null;
        }
        return C6590h.create(longValue, pVar, kVar);
    }

    /* renamed from: y */
    public final List mo18787y() {
        SQLiteDatabase f = mo18791f();
        f.beginTransaction();
        try {
            List list = (List) m12957j(f.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new C8481h());
            f.setTransactionSuccessful();
            return list;
        } finally {
            f.endTransaction();
        }
    }
}
