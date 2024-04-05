package com.etsy.android.lib.useraction;

import android.database.Cursor;
import androidx.room.C3226d0;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p003a2.C0016c;

/* renamed from: com.etsy.android.lib.useraction.f */
public final class C8873f implements Callable<List<C8874g>> {

    /* renamed from: b */
    public final /* synthetic */ C3226d0 f19602b;

    /* renamed from: c */
    public final /* synthetic */ C8870e f19603c;

    public C8873f(C8870e eVar, C3226d0 d0Var) {
        this.f19603c = eVar;
        this.f19602b = d0Var;
    }

    public final Object call() throws Exception {
        Cursor l = this.f19603c.f19599a.mo11983l(this.f19602b);
        try {
            int a = C0016c.m97a(l, ResponseConstants.ACTION);
            int a2 = C0016c.m97a(l, ResponseConstants.SUBJECT);
            int a3 = C0016c.m97a(l, "subjectId");
            int a4 = C0016c.m97a(l, ResponseConstants.TIMESTAMP);
            int a5 = C0016c.m97a(l, "userId");
            int a6 = C0016c.m97a(l, "userActionId");
            ArrayList arrayList = new ArrayList(l.getCount());
            while (l.moveToNext()) {
                String str = null;
                String string = l.isNull(a) ? null : l.getString(a);
                String string2 = l.isNull(a2) ? null : l.getString(a2);
                String string3 = l.isNull(a3) ? null : l.getString(a3);
                long j = l.getLong(a4);
                if (!l.isNull(a5)) {
                    str = l.getString(a5);
                }
                arrayList.add(new C8874g(string, string2, string3, j, str, l.getInt(a6)));
            }
            return arrayList;
        } finally {
            l.close();
        }
    }

    public final void finalize() {
        this.f19602b.release();
    }
}
