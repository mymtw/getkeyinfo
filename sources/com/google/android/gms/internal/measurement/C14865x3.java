package com.google.android.gms.internal.measurement;

import android.database.Cursor;
import com.google.android.gms.measurement.internal.C14973f7;
import com.google.android.gms.measurement.internal.C15067q2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p193o.C7494b;

/* renamed from: com.google.android.gms.internal.measurement.x3 */
public final /* synthetic */ class C14865x3 implements C15067q2 {

    /* renamed from: b */
    public final /* synthetic */ Object f33154b;

    public /* synthetic */ C14865x3(Object obj) {
        this.f33154b = obj;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Object mo50970a() {
        C14889z3 z3Var = (C14889z3) this.f33154b;
        Cursor query = z3Var.f33186a.query(z3Var.f33187b, C14889z3.f33185h, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                Map emptyMap = Collections.emptyMap();
                query.close();
                return emptyMap;
            }
            Map bVar = count <= 256 ? new C7494b(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                bVar.put(query.getString(0), query.getString(1));
            }
            query.close();
            return bVar;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo18935b(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((C14973f7) this.f33154b).mo52026l(str, i, th, bArr, map);
    }
}
