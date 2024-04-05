package p306z8;

import android.database.sqlite.SQLiteDatabase;
import androidx.preference.Preference;
import com.etsy.android.config.ConfigPreferencesHelper;
import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.datatransport.C6493a;
import com.google.android.datatransport.runtime.C6547k;
import com.google.android.datatransport.runtime.C6556p;
import com.google.android.datatransport.runtime.scheduling.persistence.C6590h;
import com.google.android.datatransport.runtime.scheduling.persistence.C6597o;
import com.google.android.datatransport.runtime.scheduling.persistence.C6599q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;
import p030bo.app.C4237u6;

/* renamed from: z8.b */
public final /* synthetic */ class C8475b implements Preference.C3010d, C6599q.C6600a {

    /* renamed from: b */
    public final /* synthetic */ Object f18499b;

    /* renamed from: c */
    public final /* synthetic */ Object f18500c;

    public /* synthetic */ C8475b(Object obj, Object obj2) {
        this.f18499b = obj;
        this.f18500c = obj2;
    }

    public final Object apply(Object obj) {
        C6599q qVar = (C6599q) this.f18499b;
        C6556p pVar = (C6556p) this.f18500c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C6493a aVar = C6599q.f14568g;
        qVar.getClass();
        ArrayList arrayList = new ArrayList();
        Long g = C6599q.m12955g(sQLiteDatabase, pVar);
        if (g != null) {
            C6599q.m12957j(sQLiteDatabase.query("events", new String[]{AnalyticsLogDatabaseHelper.f19040ID, "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", ResponseConstants.CODE, "inline"}, "context_id = ?", new String[]{g.toString()}, (String) null, (String) null, (String) null, String.valueOf(qVar.f14572e.getLoadBatchSize())), new C6597o(qVar, arrayList, pVar));
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(((C6590h) arrayList.get(i)).getId());
            if (i < arrayList.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        C6599q.m12957j(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), new C4237u6(hashMap, 5));
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            C6590h hVar = (C6590h) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(hVar.getId()))) {
                C6547k.C6548a builder = hVar.getEvent().toBuilder();
                for (C6599q.C6601b bVar : (Set) hashMap.get(Long.valueOf(hVar.getId()))) {
                    builder.addMetadata(bVar.f14574a, bVar.f14575b);
                }
                listIterator.set(C6590h.create(hVar.getId(), hVar.getTransportContext(), builder.build()));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public final boolean mo412g(Preference preference) {
        return ConfigPreferencesHelper.m34837setUpClearLocalePreference$lambda15((ConfigPreferencesHelper) this.f18499b, (Preference) this.f18500c, preference);
    }
}
