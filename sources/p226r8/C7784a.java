package p226r8;

import android.os.Bundle;
import com.cardinalcommerce.shared.p065cs.p070f.C6285g;
import com.google.android.play.core.assetpacks.C15589c2;
import com.google.android.play.core.assetpacks.C15669w2;
import com.google.android.play.core.internal.C15686c0;
import java.util.ArrayList;
import java.util.List;
import p125h3.C6928a;
import p125h3.C6937i;
import p125h3.C6938j;
import p158k3.C7189l;
import p214q3.C7718a;

/* renamed from: r8.a */
public final class C7784a implements C7189l, C15686c0 {

    /* renamed from: c */
    public static C6285g f17219c;

    /* renamed from: d */
    public static C7784a f17220d;

    /* renamed from: b */
    public Object f17221b;

    public C7784a(int i) {
        if (i == 1) {
            this.f17221b = new ArrayList();
        } else if (i == 6) {
            this.f17221b = new Bundle();
        }
    }

    /* renamed from: d */
    public static synchronized C7784a m15038d() {
        C7784a aVar;
        synchronized (C7784a.class) {
            if (f17220d == null) {
                f17220d = new C7784a(0);
                f17219c = new C6285g();
            }
            aVar = f17220d;
        }
        return aVar;
    }

    /* renamed from: a */
    public final C6928a mo19485a() {
        return ((C7718a) ((List) this.f17221b).get(0)).mo20191c() ? new C6938j((List) this.f17221b) : new C6937i((List) this.f17221b);
    }

    /* renamed from: b */
    public final List mo19486b() {
        return (List) this.f17221b;
    }

    /* renamed from: c */
    public final boolean mo19487c() {
        return ((List) this.f17221b).size() == 1 && ((C7718a) ((List) this.f17221b).get(0)).mo20191c();
    }

    /* renamed from: e */
    public final Object mo20335e() {
        Object obj = this.f17221b;
        return ((ArrayList) obj).remove(((ArrayList) obj).size() - 1);
    }

    /* renamed from: f */
    public final void mo20336f(Object obj) {
        ((ArrayList) this.f17221b).add(obj);
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        return new C15589c2(((C15669w2) ((C15686c0) this.f17221b)).mo55501a());
    }

    public /* synthetic */ C7784a(Object obj) {
        this.f17221b = obj;
    }
}
