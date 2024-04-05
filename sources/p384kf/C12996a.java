package p384kf;

import android.os.Bundle;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.C2751c0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.lib.logger.C8694h;
import p357gf.C12794c;

/* renamed from: kf.a */
public final class C12996a implements C12794c {

    /* renamed from: b */
    public final Fragment f28614b;

    public C12996a(Fragment fragment) {
        this.f28614b = fragment;
    }

    /* renamed from: a */
    public final void mo45794a(Bundle bundle) {
        if (bundle != null ? bundle.getBoolean("HIDDEN") : false) {
            C8694h.f19097a.mo21306a(String.format("Had to manually hide %s (probably on orientation change) - consider replacing this instead of adding it", new Object[]{this.f28614b.getClass().getSimpleName()}));
            FragmentManager fragmentManager = this.f28614b.getFragmentManager();
            C2740a c = C0070b.m182c(fragmentManager, fragmentManager);
            Fragment fragment = this.f28614b;
            FragmentManager fragmentManager2 = fragment.mFragmentManager;
            if (fragmentManager2 == null || fragmentManager2 == c.f6218s) {
                c.mo10528b(new C2751c0.C2752a(fragment, 4));
                c.mo10483d();
                return;
            }
            StringBuilder h = C0072d.m201h("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
            h.append(fragment.toString());
            h.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(h.toString());
        }
    }

    public final boolean handleBackPressed() {
        return false;
    }
}
