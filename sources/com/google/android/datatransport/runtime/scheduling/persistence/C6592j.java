package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.datatransport.runtime.C6547k;
import com.google.android.datatransport.runtime.C6556p;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.persistence.C6599q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19388s;
import p085dh.C6673a;
import p085dh.C6675b;
import p085dh.C6676c;
import p085dh.C6677d;
import p085dh.C6678e;
import p144ih.C7008a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.j */
public final /* synthetic */ class C6592j implements C6599q.C6600a {

    /* renamed from: b */
    public final /* synthetic */ int f14551b;

    /* renamed from: c */
    public final /* synthetic */ C6599q f14552c;

    /* renamed from: d */
    public final /* synthetic */ Object f14553d;

    /* renamed from: e */
    public final /* synthetic */ Object f14554e;

    public /* synthetic */ C6592j(C6599q qVar, Object obj, Object obj2, int i) {
        this.f14551b = i;
        this.f14552c = qVar;
        this.f14553d = obj;
        this.f14554e = obj2;
    }

    /* JADX INFO: finally extract failed */
    public final Object apply(Object obj) {
        long j;
        switch (this.f14551b) {
            case 0:
                C6599q qVar = this.f14552c;
                C6547k kVar = (C6547k) this.f14553d;
                C6556p pVar = (C6556p) this.f14554e;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                if (qVar.mo18791f().compileStatement("PRAGMA page_size").simpleQueryForLong() * qVar.mo18791f().compileStatement("PRAGMA page_count").simpleQueryForLong() >= qVar.f14572e.getMaxStorageSizeInBytes()) {
                    qVar.mo18778d(1, LogEventDropped.Reason.CACHE_FULL, kVar.getTransportName());
                    return -1L;
                }
                Long g = C6599q.m12955g(sQLiteDatabase, pVar);
                if (g != null) {
                    j = g.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", pVar.getBackendName());
                    contentValues.put("priority", Integer.valueOf(C7008a.m13568a(pVar.getPriority())));
                    contentValues.put("next_request_ms", 0);
                    if (pVar.getExtras() != null) {
                        contentValues.put("extras", Base64.encodeToString(pVar.getExtras(), 0));
                    }
                    j = sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
                }
                int maxBlobByteSizePerRow = qVar.f14572e.getMaxBlobByteSizePerRow();
                byte[] bArr = kVar.getEncodedPayload().f14483b;
                boolean z = bArr.length <= maxBlobByteSizePerRow;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(ResponseConstants.CONTEXT_ID, Long.valueOf(j));
                contentValues2.put("transport_name", kVar.getTransportName());
                contentValues2.put("timestamp_ms", Long.valueOf(kVar.getEventMillis()));
                contentValues2.put("uptime_ms", Long.valueOf(kVar.getUptimeMillis()));
                contentValues2.put("payload_encoding", kVar.getEncodedPayload().f14482a.f14398a);
                contentValues2.put(ResponseConstants.CODE, kVar.getCode());
                contentValues2.put("num_attempts", 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr : new byte[0]);
                long insert = sQLiteDatabase.insert("events", (String) null, contentValues2);
                if (!z) {
                    int ceil = (int) Math.ceil(((double) bArr.length) / ((double) maxBlobByteSizePerRow));
                    for (int i = 1; i <= ceil; i++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, (i - 1) * maxBlobByteSizePerRow, Math.min(i * maxBlobByteSizePerRow, bArr.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert));
                        contentValues3.put("sequence_num", Integer.valueOf(i));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", (String) null, contentValues3);
                    }
                }
                for (Map.Entry next : kVar.getMetadata().entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert));
                    contentValues4.put("name", (String) next.getKey());
                    contentValues4.put("value", (String) next.getValue());
                    sQLiteDatabase.insert("event_metadata", (String) null, contentValues4);
                }
                return Long.valueOf(insert);
            default:
                C6599q qVar2 = this.f14552c;
                Map map = (Map) this.f14553d;
                C6673a.C6674a aVar = (C6673a.C6674a) this.f14554e;
                Cursor cursor = (Cursor) obj;
                qVar2.getClass();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(0);
                    int i2 = cursor.getInt(1);
                    LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
                    if (i2 != reason.getNumber()) {
                        LogEventDropped.Reason reason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
                        if (i2 != reason2.getNumber()) {
                            reason2 = LogEventDropped.Reason.CACHE_FULL;
                            if (i2 != reason2.getNumber()) {
                                reason2 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
                                if (i2 != reason2.getNumber()) {
                                    reason2 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
                                    if (i2 != reason2.getNumber()) {
                                        reason2 = LogEventDropped.Reason.INVALID_PAYLOD;
                                        if (i2 != reason2.getNumber()) {
                                            reason2 = LogEventDropped.Reason.SERVER_ERROR;
                                            if (i2 != reason2.getNumber()) {
                                                C19388s.m32845S(Integer.valueOf(i2), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        reason = reason2;
                    }
                    long j2 = cursor.getLong(2);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList());
                    }
                    ((List) map.get(string)).add(new LogEventDropped(j2, reason));
                }
                for (Map.Entry entry : map.entrySet()) {
                    int i3 = C6676c.f14737c;
                    new ArrayList();
                    aVar.f14733b.add(new C6676c((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
                }
                long a = qVar2.f14570c.mo19124a();
                SQLiteDatabase f = qVar2.mo18791f();
                f.beginTransaction();
                try {
                    C6678e eVar = (C6678e) C6599q.m12957j(f.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new C6598p(a));
                    f.setTransactionSuccessful();
                    f.endTransaction();
                    aVar.f14732a = eVar;
                    aVar.f14734c = new C6675b(new C6677d(qVar2.mo18791f().compileStatement("PRAGMA page_size").simpleQueryForLong() * qVar2.mo18791f().compileStatement("PRAGMA page_count").simpleQueryForLong(), C6581c.DEFAULT.getMaxStorageSizeInBytes()));
                    aVar.f14735d = qVar2.f14573f.get();
                    return new C6673a(aVar.f14732a, Collections.unmodifiableList(aVar.f14733b), aVar.f14734c, aVar.f14735d);
                } catch (Throwable th) {
                    f.endTransaction();
                    throw th;
                }
        }
    }
}
