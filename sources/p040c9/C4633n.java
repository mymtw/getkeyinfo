package p040c9;

import com.etsy.android.p327ui.favorites.C9853h;
import dagger.internal.C17555d;
import p434ra.C13338f;
import p514bk.C14088a;
import p560en.C17726a;
import p568fn.C17782b;
import p575gm.C17793c;

/* renamed from: c9.n */
public final class C4633n implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f10430a;

    /* renamed from: b */
    public final Object f10431b;

    public /* synthetic */ C4633n(Object obj, int i) {
        this.f10430a = i;
        this.f10431b = obj;
    }

    public final Object get() {
        switch (this.f10430a) {
            case 0:
                ((C4479c) this.f10431b).getClass();
                return new C13338f();
            case 1:
                ((C14088a) this.f10431b).getClass();
                return new C9853h();
            default:
                C17793c cVar = ((C17726a) this.f10431b).f38527a;
                C17782b.m29838E(cVar);
                return cVar;
        }
    }
}
