package com.etsy.android.p327ui.user.circles;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C2800y;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.etsy.android.R;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.logger.referrers.Referrer;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.C11819z;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.stylekit.views.CollageTabLayout;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.uikit.view.C11952g;
import com.google.android.material.tabs.TabLayout;
import com.google.android.play.core.appupdate.C15562d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p213q2.C7717a;
import p357gf.C12792a;
import p425q9.C13265p;
import p440s9.C13366a;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.user.circles.CirclesTabContainerFragment */
public final class CirclesTabContainerFragment extends TrackingBaseFragment implements C9731e0.C9732a, ViewPager.C3334i, C13366a, C11819z {
    public static final int $stable = 8;
    public static final C11499a Companion = new C11499a();
    public static final String SELECT_INITIAL_TAB = "select_initial_tab";
    public static final int TAB_COUNT = 2;
    public static final int TAB_FOLLOWERS = 1;
    public static final int TAB_FOLLOWING = 0;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private C2800y fragmentPagerAdapter;
    private int initialCircleType;
    private boolean selectInitialTab = true;
    public C13265p session;
    private CollageTabLayout tabLayout;
    private String userDisplayName;
    /* access modifiers changed from: private */
    public EtsyId userId = new EtsyId((String) null, 1, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public String userLoginName;
    private ViewPager viewPager;

    /* renamed from: com.etsy.android.ui.user.circles.CirclesTabContainerFragment$a */
    public static final class C11499a {
    }

    /* renamed from: com.etsy.android.ui.user.circles.CirclesTabContainerFragment$b */
    public static final class C11500b extends C11952g {

        /* renamed from: k */
        public final /* synthetic */ CirclesTabContainerFragment f25374k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11500b(CirclesTabContainerFragment circlesTabContainerFragment, String str, FragmentManager fragmentManager) {
            super(str, fragmentManager);
            this.f25374k = circlesTabContainerFragment;
            C19383o.m32796f(fragmentManager, "childFragmentManager");
        }

        /* renamed from: j */
        public final int mo20184j() {
            return 2;
        }

        /* renamed from: l */
        public final CharSequence mo20186l(int i) {
            if (i == 0) {
                String string = this.f25374k.getString(R.string.following);
                C19383o.m32796f(string, "getString(R.string.following)");
                return string;
            } else if (i != 1) {
                return "";
            } else {
                String string2 = this.f25374k.getString(R.string.followers);
                C19383o.m32796f(string2, "getString(R.string.followers)");
                return string2;
            }
        }

        /* renamed from: w */
        public final Fragment mo31711w(int i) {
            CirclesFragment circlesFragment = new CirclesFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f25374k.userId.getIdAsLong());
            bundle.putString(ResponseConstants.USERNAME, this.f25374k.userLoginName);
            boolean z = !this.f25374k.userId.hasId() || C19383o.m32792b(this.f25374k.getSession().mo45959d(), this.f25374k.userId);
            if (i == 1) {
                if (z) {
                    bundle.putString("TRACKING_NAME", "your_circles_followers");
                } else {
                    bundle.putString("TRACKING_NAME", "people_circles_followers");
                }
                bundle.putBoolean("CIRCLE_FOLLOWING", false);
            } else {
                if (z) {
                    bundle.putString("TRACKING_NAME", "your_circles_following");
                } else {
                    bundle.putString("TRACKING_NAME", "people_circles_following");
                }
                bundle.putBoolean("CIRCLE_FOLLOWING", true);
            }
            circlesFragment.setArguments(bundle);
            return circlesFragment;
        }
    }

    private final C2800y createPagerAdapter() {
        C19285c<String> cVar = Referrer.f19131c;
        return new C11500b(this, Referrer.C8712a.m17143c(getArguments()), getChildFragmentManager());
    }

    private final void selectTab(int i) {
        ViewPager viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(i, false);
        }
    }

    private final void setupTabs() {
        CollageTabLayout collageTabLayout;
        ViewPager viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            C2800y yVar = this.fragmentPagerAdapter;
            if (yVar != null) {
                viewPager2.setAdapter(yVar);
            } else {
                C19383o.m32805o("fragmentPagerAdapter");
                throw null;
            }
        }
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32795e(requireActivity, "null cannot be cast to non-null type com.etsy.android.uikit.AppBarHelperAssistant");
        CollageTabLayout tabLayout2 = ((C12792a) requireActivity).getTabLayout();
        this.tabLayout = tabLayout2;
        if (tabLayout2 != null) {
            tabLayout2.setTabMode(1);
        }
        ViewPager viewPager3 = this.viewPager;
        if (!(viewPager3 == null || (collageTabLayout = this.tabLayout) == null)) {
            collageTabLayout.setupWithViewPager(viewPager3);
        }
        CollageTabLayout collageTabLayout2 = this.tabLayout;
        if (collageTabLayout2 != null) {
            collageTabLayout2.setTabGravity(0);
        }
        CollageTabLayout collageTabLayout3 = this.tabLayout;
        if (collageTabLayout3 != null) {
            collageTabLayout3.setTabMode(0);
        }
        updateTabContentDescription();
        ViewPager viewPager4 = this.viewPager;
        if (viewPager4 != null) {
            viewPager4.addOnPageChangeListener(this);
        }
    }

    private final void updateTabContentDescription() {
        if (this.tabLayout != null) {
            C2800y yVar = this.fragmentPagerAdapter;
            if (yVar != null) {
                int j = yVar.mo20184j();
                int i = 0;
                while (i < j) {
                    CollageTabLayout collageTabLayout = this.tabLayout;
                    if ((collageTabLayout != null ? collageTabLayout.getTabAt(i) : null) != null) {
                        C2800y yVar2 = this.fragmentPagerAdapter;
                        if (yVar2 != null) {
                            String string = getResources().getString(R.string.item_tabs, new Object[]{String.valueOf(yVar2.mo20186l(i)), Integer.valueOf(i + 1), Integer.valueOf(j)});
                            C19383o.m32796f(string, "resources.getString(R.st…abs, title, i + 1, count)");
                            CollageTabLayout collageTabLayout2 = this.tabLayout;
                            TabLayout.C15453g tabAt = collageTabLayout2 != null ? collageTabLayout2.getTabAt(i) : null;
                            if (tabAt != null) {
                                tabAt.f34702d = string;
                                TabLayout.TabView tabView = tabAt.f34707i;
                                if (tabView != null) {
                                    tabView.update();
                                }
                            }
                            CollageTabLayout collageTabLayout3 = this.tabLayout;
                            if (collageTabLayout3 != null && collageTabLayout3.getSelectedTabPosition() == i) {
                                CollageTabLayout collageTabLayout4 = this.tabLayout;
                                TabLayout.C15453g tabAt2 = collageTabLayout4 != null ? collageTabLayout4.getTabAt(i) : null;
                                if (tabAt2 != null) {
                                    tabAt2.f34702d = getResources().getString(R.string.item_selected, new Object[]{string});
                                    TabLayout.TabView tabView2 = tabAt2.f34707i;
                                    if (tabView2 != null) {
                                        tabView2.update();
                                    }
                                }
                            }
                        } else {
                            C19383o.m32805o("fragmentPagerAdapter");
                            throw null;
                        }
                    }
                    i++;
                }
                return;
            }
            C19383o.m32805o("fragmentPagerAdapter");
            throw null;
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public boolean displayTabs() {
        return true;
    }

    public String getFragmentTitleString() {
        return C18263b.m30839d0(this.userDisplayName) ? this.userDisplayName : getResources().getString(R.string.people);
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C13265p getSession() {
        C13265p pVar = this.session;
        if (pVar != null) {
            return pVar;
        }
        C19383o.m32805o("session");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Long M = C15562d.m25175M(arguments, "user_id");
            this.userId = M != null ? new EtsyId(M.longValue()) : new EtsyId((String) null, 1, (DefaultConstructorMarker) null);
            this.userLoginName = arguments.getString(ResponseConstants.USERNAME, "");
            this.userDisplayName = arguments.getString("DISPLAY_NAME", "");
            this.initialCircleType = arguments.getInt("type", 0);
        }
        this.fragmentPagerAdapter = createPagerAdapter();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_circles_tabs, viewGroup, false);
        this.viewPager = (ViewPager) inflate.findViewById(R.id.view_pager);
        return inflate;
    }

    public void onDestroyView() {
        ViewPager viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.setAdapter((C7717a) null);
        }
        this.viewPager = null;
        this.tabLayout = null;
        super.onDestroyView();
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        updateTabContentDescription();
    }

    public void onSaveInstanceState(Bundle bundle) {
        C19383o.m32797g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(SELECT_INITIAL_TAB, this.selectInitialTab);
    }

    public void onStart() {
        super.onStart();
        setupTabs();
        if (this.selectInitialTab) {
            this.selectInitialTab = false;
            selectTab(this.initialCircleType);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.selectInitialTab = bundle.getBoolean(SELECT_INITIAL_TAB, true);
        }
    }

    public final void setSession(C13265p pVar) {
        C19383o.m32797g(pVar, "<set-?>");
        this.session = pVar;
    }
}
