package p356ge;

import android.support.p013v4.media.C0070b;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.R;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.exceptions.UnsupportedNavigationException;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchContainerDestinationKey;
import com.etsy.android.p327ui.search.container.SearchContainerFragment;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p363he.C12822e;
import p370ie.C12946f;

/* renamed from: ge.b */
public final class C12790b {

    /* renamed from: ge.b$a */
    public /* synthetic */ class C12791a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28267a;

        static {
            int[] iArr = new int[FragmentAnimationMode.values().length];
            iArr[FragmentAnimationMode.SLIDING.ordinal()] = 1;
            iArr[FragmentAnimationMode.SLIDE_BOTTOM.ordinal()] = 2;
            iArr[FragmentAnimationMode.SLIDE_BOTTOM_ONTOP.ordinal()] = 3;
            iArr[FragmentAnimationMode.SLIDE_BOTTOM_ONTOP_MULTIBACKSTACK.ordinal()] = 4;
            iArr[FragmentAnimationMode.FADE.ordinal()] = 5;
            iArr[FragmentAnimationMode.ZOOM_IN_OUT.ordinal()] = 6;
            iArr[FragmentAnimationMode.OVERLAY.ordinal()] = 7;
            iArr[FragmentAnimationMode.NONE.ordinal()] = 8;
            f28267a = iArr;
        }
    }

    /* renamed from: a */
    public static final void m20429a(C2740a aVar, FragmentAnimationMode fragmentAnimationMode) {
        C19383o.m32797g(fragmentAnimationMode, "animationMode");
        switch (C12791a.f28267a[fragmentAnimationMode.ordinal()]) {
            case 1:
                aVar.mo10532i(R.anim.nav_frag_right_enter, R.anim.nav_frag_right_exit, R.anim.nav_frag_right_pop_enter, R.anim.nav_frag_right_pop_exit);
                return;
            case 2:
                aVar.mo10532i(R.anim.nav_frag_bottom_enter, R.anim.nav_frag_bottom_exit, R.anim.nav_frag_bottom_pop_enter, R.anim.nav_frag_bottom_pop_exit);
                return;
            case 3:
                aVar.mo10532i(R.anim.nav_frag_bottom_enter, R.anim.nav_frag_bottom_over_none, R.anim.nav_frag_bottom_over_none, R.anim.nav_frag_bottom_pop_exit);
                return;
            case 4:
                aVar.mo10532i(R.anim.nav_frag_bottom_enter, R.anim.nav_frag_bottom_pop_exit, R.anim.nav_frag_bottom_over_none, R.anim.nav_frag_bottom_over_none);
                return;
            case 5:
                aVar.mo10532i(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out);
                return;
            case 6:
                aVar.mo10532i(R.anim.nav_top_zoom_enter, R.anim.nav_bottom_zoom_exit, R.anim.nav_top_zoom_enter, R.anim.nav_bottom_zoom_exit);
                return;
            case 7:
                aVar.mo10532i(R.anim.nav_fade_in, R.anim.nav_none, R.anim.nav_none, R.anim.nav_frag_bottom_pop_exit);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public static final void m20430b(Fragment fragment, C12822e eVar) {
        C19383o.m32797g(eVar, "key");
        C12788a.m20424c(fragment != null ? fragment.getActivity() : null, eVar);
    }

    /* renamed from: c */
    public static final void m20431c(Fragment fragment, C12946f fVar) throws UnsupportedNavigationException {
        C12788a.m20425d(fragment != null ? fragment.getActivity() : null, fVar);
    }

    /* renamed from: d */
    public static final String m20432d(Fragment fragment) {
        return C19421p.m32935c0(fragment != null ? fragment.getActivity() : null);
    }

    /* renamed from: e */
    public static final void m20433e(SearchContainerFragment searchContainerFragment, SearchContainerDestinationKey searchContainerDestinationKey, boolean z) {
        C19383o.m32797g(searchContainerDestinationKey, "key");
        if (searchContainerFragment != null) {
            Fragment fragment = searchContainerDestinationKey.getFragment();
            fragment.setArguments(searchContainerDestinationKey.getNavigationParams().mo45608a());
            String str = fragment.getClass().getSimpleName() + searchContainerFragment.hashCode();
            FragmentManager childFragmentManager = searchContainerFragment.getChildFragmentManager();
            C2740a c = C0070b.m182c(childFragmentManager, childFragmentManager);
            m20429a(c, searchContainerDestinationKey.getAnimationType());
            c.mo10531h(R.id.search_container, fragment, str);
            if (z) {
                c.mo10529c(str);
            }
            c.mo10487k();
        }
    }
}
