package p040c9;

import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.favorites.editlist.C9850f;
import com.etsy.android.p327ui.favorites.editlist.EditCollectionBottomSheetFragment;
import com.etsy.android.p327ui.favorites.editlist.EditCollectionViewModel;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import dagger.internal.C17553b;
import kotlin.jvm.internal.C19382n;
import p084d9.C6672b;
import p277w8.C8269g;
import p277w8.C8274l;
import p470w9.C13795c;
import p628nj.C18263b;

/* renamed from: c9.i6 */
public final class C4570i6 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10053b;

    /* renamed from: c */
    public C9850f f10054c;

    public C4570i6(C4579j1 j1Var, C19382n nVar, C1993m mVar, C18263b bVar) {
        this.f10053b = j1Var;
        C17553b bVar2 = j1Var.f10091D0;
        this.f10054c = new C9850f(nVar, new C6672b(new C8274l(mVar, bVar2, 5), 3), new C13795c(new C8269g(bVar, bVar2, 6), 2), j1Var.f10172T1);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        C4579j1 j1Var = this.f10053b;
        ((EditCollectionBottomSheetFragment) obj).viewModelFactory = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, EditCollectionViewModel.class, this.f10054c));
    }
}
