package com.qualtrics.digital;

import java.util.Calendar;

/* renamed from: com.qualtrics.digital.m */
public final class C17307m {

    /* renamed from: a */
    public String f37830a;

    /* renamed from: b */
    public long f37831b = Calendar.getInstance().getTimeInMillis();

    public C17307m(String str, String str2) {
        this.f37830a = str;
    }

    /* renamed from: a */
    public final void mo68221a() {
        try {
            if (C17308n.f37832g == null) {
                C17308n.f37832g = new C17308n();
            }
            C17308n.f37832g.mo68222a(Calendar.getInstance().getTimeInMillis() - this.f37831b, this.f37830a);
        } catch (Exception e) {
            C17318x.m29067a().mo68224c(e);
        }
    }
}
