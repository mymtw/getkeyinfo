package com.cardinalcommerce.emvco.p063a.p064e;

import android.support.p013v4.media.C0072d;
import com.cardinalcommerce.shared.p065cs.p067b.C6266a;
import com.cardinalcommerce.shared.p065cs.p068d.C6270a;
import org.json.JSONException;
import p172l8.C7278a;
import p192n8.C7492a;
import p247t8.C8047e;

/* renamed from: com.cardinalcommerce.emvco.a.e.e */
public class C6264e extends C6270a {

    /* renamed from: a */
    private final C7492a f13742a = C7492a.m14431g();

    public C6264e(C8047e eVar, String str) {
        try {
            C7278a a = C7278a.m13942a();
            if (str != null) {
                super.mo17766a(str, eVar.mo20606b().toString(), 8000);
            } else {
                a.getClass();
                throw null;
            }
        } catch (JSONException e) {
            C7492a aVar = this.f13742a;
            StringBuilder h = C0072d.m201h("Exception while executing task \n");
            h.append(e.getLocalizedMessage());
            String sb = h.toString();
            aVar.getClass();
            aVar.mo19849i(String.valueOf(11421), sb);
        }
    }

    /* renamed from: a */
    public void mo17212a(Exception exc, C6266a aVar) {
        C7492a aVar2 = this.f13742a;
        StringBuilder h = C0072d.m201h("Exception while executing task \n");
        h.append(exc.getLocalizedMessage());
        String sb = h.toString();
        aVar2.getClass();
        aVar2.mo19849i(String.valueOf(11421), sb);
    }

    /* renamed from: a */
    public void mo17213a(String str) {
        this.f13742a.mo19848h("Error Task Ended");
    }

    /* renamed from: a */
    public void mo17214a(String str, int i) {
        super.mo17214a(str, i);
        C7492a aVar = this.f13742a;
        aVar.getClass();
        aVar.mo19849i(String.valueOf(11421), "Exception while executing task \n" + str);
    }
}
