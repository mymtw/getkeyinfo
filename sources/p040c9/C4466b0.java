package p040c9;

import com.etsy.android.p327ui.favorites.add.AddToListContainerFragment;
import com.etsy.android.p327ui.favorites.add.C9752b;
import dagger.android.C17550a;

/* renamed from: c9.b0 */
public final class C4466b0 implements C17550a {

    /* renamed from: b */
    public final AddToListContainerFragment f9764b;

    /* renamed from: c */
    public final C4579j1 f9765c;

    public C4466b0(C4579j1 j1Var, AddToListContainerFragment addToListContainerFragment) {
        this.f9765c = j1Var;
        this.f9764b = addToListContainerFragment;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        ((AddToListContainerFragment) obj).presenter = new C9752b(this.f9764b, this.f9765c.f10198Y2.get());
    }
}
