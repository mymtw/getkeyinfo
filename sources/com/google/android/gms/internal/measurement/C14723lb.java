package com.google.android.gms.internal.measurement;

import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.google.android.gms.measurement.internal.C15032m3;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.lb */
public final class C14723lb extends C14685j {

    /* renamed from: d */
    public final C15032m3 f32938d;

    public C14723lb(C15032m3 m3Var) {
        super("internal.logger");
        this.f32938d = m3Var;
        this.f32891c.put(AnalyticsLogDatabaseHelper.LOG, new C14710kb(this, false, true));
        this.f32891c.put("silent", new C14657ga());
        ((C14685j) this.f32891c.get("silent")).mo50484e(AnalyticsLogDatabaseHelper.LOG, new C14710kb(this, true, true));
        this.f32891c.put("unmonitored", new C14671hb());
        ((C14685j) this.f32891c.get("unmonitored")).mo50484e(AnalyticsLogDatabaseHelper.LOG, new C14710kb(this, false, false));
    }

    /* renamed from: b */
    public final C14763p mo50553b(C14598c3 c3Var, List<C14763p> list) {
        return C14763p.f33033g0;
    }
}
