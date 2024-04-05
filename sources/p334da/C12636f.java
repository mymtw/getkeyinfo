package p334da;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.network.Connectivity;
import com.etsy.android.lib.requests.apiv3.GzippedRequestBody;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19322o;
import kotlin.collections.C19324q;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19453g;
import okhttp3.C20002r;
import okhttp3.C20016y;
import p340ea.C12673n;
import p409o9.C13138q;
import p568fn.C17782b;
import p753kq.C19857l;
import retrofit2.C20145v;

/* renamed from: da.f */
public final class C12636f {

    /* renamed from: a */
    public final C8694h f27869a;

    /* renamed from: b */
    public final C12673n f27870b;

    /* renamed from: c */
    public final C8618c f27871c;

    /* renamed from: d */
    public final AnalyticsLogDatabaseHelper f27872d;

    /* renamed from: e */
    public final C12632c f27873e;

    /* renamed from: f */
    public final C13138q f27874f;

    /* renamed from: g */
    public final Connectivity f27875g;

    /* renamed from: da.f$a */
    public static final class C12637a {

        /* renamed from: a */
        public final int f27876a;

        /* renamed from: b */
        public final String f27877b;

        public C12637a(int i, String str) {
            this.f27876a = i;
            this.f27877b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12637a)) {
                return false;
            }
            C12637a aVar = (C12637a) obj;
            return this.f27876a == aVar.f27876a && C19383o.m32792b(this.f27877b, aVar.f27877b);
        }

        public final int hashCode() {
            return this.f27877b.hashCode() + (Integer.hashCode(this.f27876a) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("AnalyticsEvent(id=");
            h.append(this.f27876a);
            h.append(", json=");
            return C0391c.m1057c(h, this.f27877b, ')');
        }
    }

    public C12636f(C8694h hVar, C12673n nVar, C8618c cVar, AnalyticsLogDatabaseHelper analyticsLogDatabaseHelper, C12632c cVar2, C13138q qVar, Connectivity connectivity) {
        C19383o.m32797g(hVar, "logCat");
        C19383o.m32797g(nVar, "elkLogger");
        C19383o.m32797g(analyticsLogDatabaseHelper, "analyticsDbHelper");
        C19383o.m32797g(qVar, "installInfo");
        C19383o.m32797g(connectivity, "connectivity");
        this.f27869a = hVar;
        this.f27870b = nVar;
        this.f27871c = cVar;
        this.f27872d = analyticsLogDatabaseHelper;
        this.f27873e = cVar2;
        this.f27874f = qVar;
        this.f27875g = connectivity;
    }

    /* renamed from: a */
    public final boolean mo45418a(boolean z) {
        boolean z2 = false;
        if (!this.f27875g.mo29933a()) {
            this.f27869a.mo21308c();
            return false;
        }
        SQLiteDatabase readableDatabase = this.f27872d.getReadableDatabase();
        C19383o.m32796f(readableDatabase, "analyticsDbHelper.readableDatabase");
        if (DatabaseUtils.queryNumEntries(readableDatabase, AnalyticsLogDatabaseHelper.TABLE) == 0) {
            this.f27869a.mo21308c();
            return true;
        } else if (z) {
            this.f27869a.mo21308c();
            do {
                SQLiteDatabase readableDatabase2 = this.f27872d.getReadableDatabase();
                C19383o.m32796f(readableDatabase2, "analyticsDbHelper.readableDatabase");
                if (DatabaseUtils.queryNumEntries(readableDatabase2, AnalyticsLogDatabaseHelper.TABLE) <= 0) {
                    return z2;
                }
                z2 = mo45419b();
            } while (z2);
            return z2;
        } else {
            this.f27869a.mo21308c();
            return mo45419b();
        }
    }

    /* renamed from: b */
    public final boolean mo45419b() {
        long e = this.f27871c.mo21135e(C8592b.f18741K);
        ArrayList arrayList = new ArrayList();
        Cursor query = this.f27872d.getReadableDatabase().query(AnalyticsLogDatabaseHelper.TABLE, new String[]{AnalyticsLogDatabaseHelper.f19040ID, AnalyticsLogDatabaseHelper.LOG}, (String) null, (String[]) null, (String) null, (String) null, (String) null, String.valueOf(e));
        while (query.moveToNext()) {
            int i = query.getInt(query.getColumnIndex(AnalyticsLogDatabaseHelper.f19040ID));
            String string = query.getString(query.getColumnIndex(AnalyticsLogDatabaseHelper.LOG));
            C19383o.m32796f(string, "c.getString(c.getColumnI…csLogDatabaseHelper.LOG))");
            arrayList.add(new C12637a(i, string));
        }
        query.close();
        C8694h hVar = this.f27869a;
        arrayList.size();
        hVar.mo21308c();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C19324q.m32628J0(C17782b.m29864d0(((C12637a) it.next()).f27877b), arrayList2);
        }
        Object[] array = arrayList2.toArray(new String[0]);
        C19383o.m32795e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String R0 = C19453g.m33014R0("\n            |{\n            |  \"shared\": {},\n            |  \"events\": " + Arrays.toString((String[]) array) + "\n            |}\n            ");
        GzippedRequestBody.Companion companion = GzippedRequestBody.Companion;
        C20002r.f44260f.getClass();
        C20016y create = companion.create(C20002r.C20003a.m34244b("application/gzip"), R0);
        C12632c cVar = this.f27873e;
        C13138q qVar = this.f27874f;
        qVar.getClass();
        C20145v<Void> e2 = cVar.mo45416a(create, C19294b0.m32561r0(new Pair("Content-Encoding", "gzip"), new Pair("User-agent", qVar.mo45852b(System.getProperty("http.agent"))), new Pair("X-Etsy-Device", this.f27874f.f28895a))).mo74365e();
        if (e2.mo74384a()) {
            this.f27869a.mo21308c();
            SQLiteDatabase writableDatabase = this.f27872d.getWritableDatabase();
            StringBuilder h = C0072d.m201h("_id IN (");
            int size = arrayList.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList3.add("?");
            }
            String c = C0391c.m1057c(h, C19327t.m32644Z0(arrayList3, ",", (String) null, (String) null, (C19857l) null, 62), ')');
            ArrayList arrayList4 = new ArrayList(C19322o.m32624F0(arrayList));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList4.add(String.valueOf(((C12637a) it2.next()).f27876a));
            }
            Object[] array2 = arrayList4.toArray(new String[0]);
            C19383o.m32795e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            writableDatabase.delete(AnalyticsLogDatabaseHelper.TABLE, c, (String[]) array2);
            this.f27869a.mo21308c();
            return true;
        }
        C12673n nVar = this.f27870b;
        StringBuilder h2 = C0072d.m201h("failed to upload ");
        h2.append(arrayList.size());
        h2.append(" events: ");
        h2.append(e2.f44614a.f44365f);
        nVar.mo45449a(h2.toString());
        return false;
    }
}
