package p040c9;

import com.etsy.android.p327ui.search.toplevelcategories.C10959d;
import com.etsy.android.p327ui.search.toplevelcategories.C10960e;
import com.google.android.play.core.appupdate.C15562d;
import dagger.internal.C17555d;
import kotlin.collections.EmptyList;
import p486y9.C13886b;

/* renamed from: c9.g */
public final class C4535g implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f9993a;

    /* renamed from: b */
    public final Object f9994b;

    public /* synthetic */ C4535g(Object obj, int i) {
        this.f9993a = i;
        this.f9994b = obj;
    }

    public final Object get() {
        switch (this.f9993a) {
            case 0:
                ((C4479c) this.f9994b).getClass();
                return new C13886b();
            default:
                ((C15562d) this.f9994b).getClass();
                return new C10959d(C10960e.C10963c.f24310a, EmptyList.INSTANCE);
        }
    }
}
