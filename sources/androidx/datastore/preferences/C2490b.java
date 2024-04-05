package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.core.C2475c;
import androidx.datastore.core.C2478e;
import androidx.datastore.preferences.core.C2492a;
import androidx.datastore.preferences.core.C2493b;
import androidx.datastore.preferences.core.PreferenceDataStore;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19410j;
import kotlinx.coroutines.C19525d0;
import p753kq.C19857l;
import p759nq.C19920b;

/* renamed from: androidx.datastore.preferences.b */
public final class C2490b implements C19920b<Context, C2478e<C2493b>> {

    /* renamed from: b */
    public final String f5755b = CartGroupItem.ELEMENT_PAYMENT_CHECKOUT;

    /* renamed from: c */
    public final C19857l<Context, List<C2475c<C2493b>>> f5756c;

    /* renamed from: d */
    public final C19525d0 f5757d;

    /* renamed from: e */
    public final Object f5758e;

    /* renamed from: f */
    public volatile PreferenceDataStore f5759f;

    public C2490b(C19857l lVar, C19525d0 d0Var) {
        this.f5756c = lVar;
        this.f5757d = d0Var;
        this.f5758e = new Object();
    }

    public final Object getValue(Object obj, C19410j jVar) {
        PreferenceDataStore preferenceDataStore;
        Context context = (Context) obj;
        C19383o.m32797g(context, "thisRef");
        C19383o.m32797g(jVar, "property");
        PreferenceDataStore preferenceDataStore2 = this.f5759f;
        if (preferenceDataStore2 != null) {
            return preferenceDataStore2;
        }
        synchronized (this.f5758e) {
            if (this.f5759f == null) {
                Context applicationContext = context.getApplicationContext();
                C19857l<Context, List<C2475c<C2493b>>> lVar = this.f5756c;
                C19383o.m32796f(applicationContext, "applicationContext");
                this.f5759f = C2492a.m5474a(lVar.invoke(applicationContext), this.f5757d, new PreferenceDataStoreSingletonDelegate$getValue$1$1(applicationContext, this));
            }
            preferenceDataStore = this.f5759f;
            C19383o.m32794d(preferenceDataStore);
        }
        return preferenceDataStore;
    }
}
