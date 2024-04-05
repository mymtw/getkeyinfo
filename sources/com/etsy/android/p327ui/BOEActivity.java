package com.etsy.android.p327ui;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.C0120c;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0472h;
import androidx.compose.p015ui.text.font.C1948d;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.C2300f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import com.etsy.android.BOEApplication;
import com.etsy.android.C6332c;
import com.etsy.android.C6487g;
import com.etsy.android.R;
import com.etsy.android.checkout.C6335b;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.config.bucketing.C8617e;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8692f;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Alert;
import com.etsy.android.lib.models.apiv3.inappnotifications.IANTooltip;
import com.etsy.android.lib.network.oauth2.C8766p;
import com.etsy.android.lib.util.C8884d;
import com.etsy.android.lib.util.C8905i;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.p327ui.BottomNavigationBehavior;
import com.etsy.android.p327ui.C9113c0;
import com.etsy.android.p327ui.C9905g0;
import com.etsy.android.p327ui.addtocartanimation.AddToCartAnimation$animate$2;
import com.etsy.android.p327ui.cart.CartBadgeCountRepo;
import com.etsy.android.p327ui.core.C9613a;
import com.etsy.android.p327ui.home.tabs.HomePagerFragment;
import com.etsy.android.p327ui.navigation.bottom.BottomNavStateRepo;
import com.etsy.android.p327ui.navigation.bottom.C10679a;
import com.etsy.android.p327ui.navigation.bottom.C10683e;
import com.etsy.android.p327ui.navigation.bottom.C10684f;
import com.etsy.android.p327ui.navigation.bottom.C10690g;
import com.etsy.android.p327ui.navigation.exceptions.UnsupportedNavigationException;
import com.etsy.android.p327ui.navigation.keys.DeeplinkNavigationKey;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HomePagerKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchContainerKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.UpdatesKey;
import com.etsy.android.p327ui.navigation.specs.SearchRedirectSpec;
import com.etsy.android.p327ui.navigation.specs.SearchSpec;
import com.etsy.android.p327ui.singleactivity.C11316a;
import com.etsy.android.p327ui.singleactivity.C11317b;
import com.etsy.android.p327ui.singleactivity.C11318c;
import com.etsy.android.p327ui.singleactivity.C11320d;
import com.etsy.android.p327ui.singleactivity.C11323g;
import com.etsy.android.p327ui.singleactivity.CartKey;
import com.etsy.android.p327ui.singleactivity.FavoritesKey;
import com.etsy.android.p327ui.singleactivity.HomeKey;
import com.etsy.android.p327ui.singleactivity.InAppNotificationsKey;
import com.etsy.android.p327ui.singleactivity.MultistackFragmentKey;
import com.etsy.android.p327ui.singleactivity.YouKey;
import com.etsy.android.p327ui.user.inappnotifications.C11541a0;
import com.etsy.android.p327ui.user.inappnotifications.UpdatesEligibility;
import com.etsy.android.p327ui.user.inappnotifications.tooltips.IANTooltipDismissType;
import com.etsy.android.push.onboarding.C8946b;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.uikit.AppBarHelper;
import com.etsy.android.uikit.nav.TrackingBaseActivity;
import com.etsy.android.uikit.util.C11897c;
import com.etsy.android.uikit.util.C11906j;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import com.etsy.android.util.BOEOptionsMenuItemHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.play.core.appupdate.C15559a;
import com.google.android.play.core.appupdate.C15560b;
import com.google.android.play.core.install.InstallState;
import com.zhuinden.simplestack.C17518a;
import com.zhuinden.simplestack.C17532i;
import com.zhuinden.statebundle.StateBundle;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p019b.C3447d;
import p040c9.C4579j1;
import p119g9.C6896a;
import p119g9.C6897b;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.operators.observable.C19172m;
import p145io.reactivex.internal.operators.observable.ObservableObserveOn;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.subjects.C19254a;
import p145io.reactivex.subjects.PublishSubject;
import p310ae.C8510a;
import p323ce.C8582a;
import p346fa.C12703a;
import p356ge.C12788a;
import p357gf.C12794c;
import p363he.C12822e;
import p377jf.C12979a;
import p418pa.C13197c;
import p425q9.C13265p;
import p440s9.C13366a;
import p456ua.C13461f;
import p457ub.C13464a;
import p457ub.C13465b;
import p461uf.C13511h;
import p465vb.C13557a;
import p475we.C13832h;
import p491ye.C13915a;
import p491ye.C13916b;
import p491ye.C13921e;
import p568fn.C17782b;
import p622ml.C18244a;

/* renamed from: com.etsy.android.ui.BOEActivity */
public class BOEActivity extends TrackingBaseActivity implements C10707p, C6897b, C13366a, C11897c, C8582a {
    private static final String SELECTED_BOTTOM_NAV_POSITION = "selected_bottom_nav_position";
    private static final String SIGN_IN_ACTION = "sign_in_action";
    public C15560b appUpdateManager;
    public C10679a badgeBinder;
    /* access modifiers changed from: private */
    public C10677n boeViewModel;
    public C10683e bottomNavBinder;
    public BottomNavStateRepo bottomNavStateRepo;
    public BottomNavigationView bottomNavigation;
    public C10708q bottomNavigationMonitor;
    private View cartAnimatedFlyingBadge;
    public CartBadgeCountRepo cartBadgeCountRepo;
    private C7091a compositeDisposable = new C7091a();
    public C8618c etsyConfigMap;
    public C6896a favoriteHandler;
    public C12703a grafana;
    public C2300f ianGestureDetector;
    private C13915a ianTooltipAlert;
    private boolean mIsRestarted = false;
    private boolean mIsRetaining;
    private FrameLayout mNavContentView;
    private EtsyAction mSignInAction;
    public C11320d multistackPrefs;
    public C8946b pushPermissionPrompter;
    private final C0120c<String> requestPermissionLauncher = registerForActivityResult(new C3447d(), new C9110b(this, 0));
    public C13461f rxSchedulers;
    public C13461f schedulers;
    private ExtendedFloatingActionButton searchFAB;
    private final int selectedBottomNavPosition = -1;
    public C13265p session;
    private C11323g singleActivityDelegate;
    public int singleActivityNavId = -1;
    private Disposable tooltipDisposable = null;
    public C13921e tooltipPrefs;
    public UpdatesEligibility updatesEligibility;
    public C11541a0 updatesNativeEligibility;
    private Disposable upgradePromptDisposable = null;
    public C8656o viewModelFactory;

    /* renamed from: com.etsy.android.ui.BOEActivity$a */
    public class C9077a implements C18244a {
        public C9077a() {
        }

        /* renamed from: a */
        public final void mo31232a(Object obj) {
            if (((InstallState) obj).mo55513c() == 11) {
                C10677n access$000 = BOEActivity.this.boeViewModel;
                access$000.f23532v = null;
                access$000.f23531u.onNext(C9905g0.C9906a.f21854a);
            }
            BOEActivity.this.appUpdateManager.mo55334a(this);
        }
    }

    /* renamed from: com.etsy.android.ui.BOEActivity$b */
    public class C9078b extends TrackingOnClickListener {

        /* renamed from: b */
        public final /* synthetic */ C9113c0.C9114a f19964b;

        public C9078b(C9113c0.C9114a aVar) {
            this.f19964b = aVar;
        }

        public final void onViewClick(View view) {
            this.f19964b.mo31308a();
        }
    }

    /* renamed from: com.etsy.android.ui.BOEActivity$c */
    public class C9079c extends TrackingOnClickListener {

        /* renamed from: b */
        public final /* synthetic */ String f19965b;

        public C9079c(String str) {
            this.f19965b = str;
        }

        public final void onViewClick(View view) {
            BOEActivity.this.getAnalyticsContext().mo21333d("search_fab_clicked", (Map<? extends AnalyticsProperty, Object>) null);
            C12788a.m20424c(BOEActivity.this, new SearchContainerKey(this.f19965b, (SearchSpec) null, (SearchRedirectSpec) null, (Bundle) null));
        }
    }

    /* renamed from: com.etsy.android.ui.BOEActivity$d */
    public static /* synthetic */ class C9080d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19967a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.etsy.android.lib.deeplinks.EtsyAction[] r0 = com.etsy.android.lib.deeplinks.EtsyAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19967a = r0
                com.etsy.android.lib.deeplinks.EtsyAction r1 = com.etsy.android.lib.deeplinks.EtsyAction.CONTACT_USER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19967a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.etsy.android.lib.deeplinks.EtsyAction r1 = com.etsy.android.lib.deeplinks.EtsyAction.MANAGE_ITEM_COLLECTIONS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f19967a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.etsy.android.lib.deeplinks.EtsyAction r1 = com.etsy.android.lib.deeplinks.EtsyAction.REPORT_LISTING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f19967a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.etsy.android.lib.deeplinks.EtsyAction r1 = com.etsy.android.lib.deeplinks.EtsyAction.ADD_TO_CART     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.BOEActivity.C9080d.<clinit>():void");
        }
    }

    private void completeUpgrade() {
        C12979a a = C12979a.C12980a.m20683a(this);
        a.mo45781a(CollageAlert.AlertType.SUCCESS);
        a.f28590d = true;
        a.f28591e = 6000;
        a.mo45785e(getString(R.string.upgrade_prompt_install_description));
        a.mo45784d(new C10079k(this, 0));
        a.mo45786f();
    }

    private void goToSearch() {
        C12788a.m20424c(this, new SearchContainerKey(C19421p.m32935c0(this), (SearchSpec) null, (SearchRedirectSpec) null, (Bundle) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: handleBottomNavState */
    public void lambda$onCreate$1(C10690g gVar) {
        String str;
        C10690g gVar2 = gVar;
        C10683e eVar = this.bottomNavBinder;
        BottomNavigationView bottomNavigationView = this.bottomNavigation;
        eVar.getClass();
        C19383o.m32797g(bottomNavigationView, "bottomNavigation");
        C19383o.m32797g(gVar2, "state");
        int size = bottomNavigationView.getMenu().size();
        int size2 = gVar2.f23573c.size();
        boolean z = size2 == 4;
        boolean z2 = bottomNavigationView.getMenu().size() == 0;
        boolean z3 = size == 4 && size2 == 5;
        boolean z4 = size == 5 && size2 == 4;
        TrackingBaseActivity trackingBaseActivity = eVar.f23558b.get();
        String str2 = null;
        Resources resources = trackingBaseActivity != null ? trackingBaseActivity.getResources() : null;
        if (z2 || z3) {
            bottomNavigationView.getMenu().clear();
            int i = 0;
            for (T next : gVar2.f23573c) {
                int i2 = i + 1;
                if (i >= 0) {
                    C10684f fVar = (C10684f) next;
                    MenuItem icon = bottomNavigationView.getMenu().add(0, fVar.f23561a, i, fVar.f23563c).setIcon(fVar.f23562b);
                    C19383o.m32796f(icon, "bottomNavigation.menu.ad…etIcon(data.iconSelector)");
                    if (resources != null) {
                        str = resources.getString(z ? fVar.f23564d : fVar.f23565e);
                    } else {
                        str = null;
                    }
                    if (icon instanceof SupportMenuItem) {
                        ((SupportMenuItem) icon).setContentDescription((CharSequence) str);
                    } else {
                        icon.setContentDescription(str);
                    }
                    i = i2;
                } else {
                    C17782b.m29877o0();
                    throw null;
                }
            }
        } else if (z4) {
            bottomNavigationView.getMenu().removeItem(R.id.menu_bottom_nav_updates);
        }
        bottomNavigationView.setOnNavigationItemSelectedListener((BottomNavigationView.C15214c) null);
        bottomNavigationView.setOnNavigationItemReselectedListener((BottomNavigationView.C15213b) null);
        bottomNavigationView.setSelectedItemId(gVar2.f23571a);
        bottomNavigationView.setOnNavigationItemSelectedListener(eVar.f23559c);
        bottomNavigationView.setOnNavigationItemReselectedListener(eVar.f23560d);
        C11320d dVar = this.multistackPrefs;
        dVar.getClass();
        if (dVar.f24983b.mo21132b(C8592b.f18798i0)) {
            dVar.f24984c.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append("NAV_INFO: ");
            sb.append(currentTimeMillis);
            sb.append(" bottom nav ");
            switch (gVar2.f23571a) {
                case R.id.menu_bottom_nav_cart:
                    str2 = "bottom_nav_cart";
                    break;
                case R.id.menu_bottom_nav_favorites:
                    str2 = "bottom_nav_favorites";
                    break;
                case R.id.menu_bottom_nav_home:
                    str2 = "bottom_nav_home";
                    break;
                case R.id.menu_bottom_nav_updates:
                    str2 = "bottom_nav_updates";
                    break;
                case R.id.menu_bottom_nav_you:
                    str2 = "bottom_nav_you";
                    break;
            }
            sb.append(str2);
            sb.append(' ');
            sb.append(gVar2);
            String sb2 = sb.toString();
            LogCatKt.m17045a().mo21310e(sb2);
            dVar.mo37062a(sb2);
        }
        C13915a aVar = this.ianTooltipAlert;
        boolean z5 = aVar != null && aVar.f30575a.isShowing();
        boolean z6 = gVar2.f23571a == R.id.menu_bottom_nav_updates;
        if (z5 && z6) {
            this.ianTooltipAlert.f30575a.dismiss();
            this.tooltipPrefs.mo46731b();
        }
    }

    private void handleDismiss(String str, IANTooltipDismissType iANTooltipDismissType) {
        HashMap hashMap = new HashMap();
        hashMap.put(PredefinedAnalyticsProperty.TYPE, str);
        C13915a aVar = this.ianTooltipAlert;
        if (aVar != null) {
            aVar.f30575a.dismiss();
            this.ianTooltipAlert = null;
        }
        if (iANTooltipDismissType == IANTooltipDismissType.EXPLICIT_DISMISS) {
            this.mAnalyticsTracker.mo21333d("updates_tooltip_dismiss", hashMap);
        } else {
            this.mAnalyticsTracker.mo21333d("updates_tooltip_tap_outside_dismiss", hashMap);
        }
    }

    /* access modifiers changed from: private */
    public C19394m handleTooltipEvents(C13916b bVar) {
        if (bVar instanceof C13916b.C13918b) {
            handleTooltipTap(((C13916b.C13918b) bVar).f30581a);
            return null;
        } else if (!(bVar instanceof C13916b.C13917a)) {
            return null;
        } else {
            C13916b.C13917a aVar = (C13916b.C13917a) bVar;
            handleDismiss(aVar.f30579a, aVar.f30580b);
            return null;
        }
    }

    private void handleTooltipTap(String str) {
        C13915a aVar = this.ianTooltipAlert;
        if (aVar != null) {
            aVar.f30575a.dismiss();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(PredefinedAnalyticsProperty.TYPE, str);
        this.mAnalyticsTracker.mo21333d("updates_tooltip_tapped", hashMap);
        this.tooltipPrefs.mo46731b();
        C12788a.m20424c(this, new UpdatesKey(C19421p.m32935c0(this), (Bundle) null));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ WindowInsets lambda$allowBottomNavBarToHide$7(View view, WindowInsets windowInsets) {
        return windowInsets;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C19394m lambda$completeUpgrade$6(View view) {
        this.appUpdateManager.mo55337d();
        return C19394m.f43287a;
    }

    /* access modifiers changed from: private */
    public void lambda$new$0(Boolean bool) {
        C8946b bVar = this.pushPermissionPrompter;
        if (bool.booleanValue()) {
            bVar.f19737b.mo21333d("push_prompt_permission_granted", (Map<? extends AnalyticsProperty, Object>) null);
        } else {
            bVar.f19737b.mo21333d("push_prompt_permission_denied", (Map<? extends AnalyticsProperty, Object>) null);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void lambda$onCreate$2(com.etsy.android.p327ui.navigation.bottom.C10682d r9) {
        /*
            r8 = this;
            com.etsy.android.ui.navigation.bottom.a r0 = r8.badgeBinder
            com.google.android.material.bottomnavigation.BottomNavigationView r1 = r8.bottomNavigation
            r0.getClass()
            java.lang.String r2 = "bottomNavigation"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            java.lang.String r2 = "state"
            kotlin.jvm.internal.C19383o.m32797g(r9, r2)
            r2 = 33997722(0x206c39a, float:9.9009E-38)
            java.lang.Object r3 = r1.getTag(r2)
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r3, r9)
            if (r4 != 0) goto L_0x0141
            r1.setTag(r2, r9)
            boolean r2 = r3 instanceof com.etsy.android.p327ui.navigation.bottom.C10682d
            r4 = 0
            if (r2 == 0) goto L_0x0029
            com.etsy.android.ui.navigation.bottom.d r3 = (com.etsy.android.p327ui.navigation.bottom.C10682d) r3
            goto L_0x002a
        L_0x0029:
            r3 = r4
        L_0x002a:
            r2 = 0
            r5 = 1
            if (r3 != 0) goto L_0x003b
            com.etsy.android.ui.navigation.bottom.b r6 = r9.f23554a
            com.etsy.android.ui.you.a r6 = r6.f23549b
            com.etsy.android.ui.you.a$d r7 = com.etsy.android.p327ui.you.C11800a.C11804d.f26281a
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r6, r7)
            if (r6 == 0) goto L_0x003b
            goto L_0x004b
        L_0x003b:
            if (r3 == 0) goto L_0x0040
            com.etsy.android.ui.navigation.bottom.b r3 = r3.f23554a
            goto L_0x0041
        L_0x0040:
            r3 = r4
        L_0x0041:
            com.etsy.android.ui.navigation.bottom.b r6 = r9.f23554a
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r6)
            if (r3 != 0) goto L_0x004b
            r3 = r5
            goto L_0x004c
        L_0x004b:
            r3 = r2
        L_0x004c:
            com.etsy.android.ui.user.inappnotifications.a0 r6 = r0.f23547b
            boolean r6 = r6.mo37551a()
            if (r6 == 0) goto L_0x0071
            if (r3 == 0) goto L_0x0071
            com.etsy.android.ui.navigation.bottom.b r3 = r9.f23554a
            com.etsy.android.ui.you.a r3 = r3.f23549b
            com.etsy.android.ui.you.a$d r6 = com.etsy.android.p327ui.you.C11800a.C11804d.f26281a
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r6)
            if (r3 == 0) goto L_0x006a
            com.etsy.android.lib.logger.b r0 = r0.f23546a
            java.lang.String r3 = "favorites_bnTab_badge_cleared"
            r0.mo21333d(r3, r4)
            goto L_0x0071
        L_0x006a:
            com.etsy.android.lib.logger.b r0 = r0.f23546a
            java.lang.String r3 = "favorites_bnTab_badged"
            r0.mo21333d(r3, r4)
        L_0x0071:
            r0 = 3
            com.etsy.android.ui.navigation.bottom.b[] r0 = new com.etsy.android.p327ui.navigation.bottom.C10680b[r0]
            com.etsy.android.ui.navigation.bottom.b r3 = r9.f23556c
            r0[r2] = r3
            com.etsy.android.ui.navigation.bottom.b r2 = r9.f23554a
            r0[r5] = r2
            r2 = 2
            com.etsy.android.ui.navigation.bottom.b r9 = r9.f23555b
            r0[r2] = r9
            java.util.List r9 = p568fn.C17782b.m29865e0(r0)
            java.util.Iterator r9 = r9.iterator()
        L_0x0089:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0141
            java.lang.Object r0 = r9.next()
            com.etsy.android.ui.navigation.bottom.b r0 = (com.etsy.android.p327ui.navigation.bottom.C10680b) r0
            com.etsy.android.ui.you.a r2 = r0.f23549b
            boolean r3 = r2 instanceof com.etsy.android.p327ui.you.C11800a.C11804d
            if (r3 == 0) goto L_0x00a1
            int r0 = r0.f23548a
            r1.removeBadge(r0)
            goto L_0x0089
        L_0x00a1:
            boolean r3 = r2 instanceof com.etsy.android.p327ui.you.C11800a.C11802b
            if (r3 == 0) goto L_0x00aa
            int r3 = r0.f23548a
            r1.removeBadge(r3)
        L_0x00aa:
            android.view.Menu r3 = r1.getMenu()
            int r4 = r0.f23548a
            android.view.MenuItem r3 = r3.findItem(r4)
            if (r3 != 0) goto L_0x00cd
            com.etsy.android.lib.logger.h r2 = com.etsy.android.lib.logger.LogCatKt.m17045a()
            java.lang.String r3 = "trying to show a badge for an item that isn't currently there. ID: "
            java.lang.StringBuilder r3 = android.support.p013v4.media.C0072d.m201h(r3)
            int r0 = r0.f23548a
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.mo21313g(r0)
            goto L_0x0089
        L_0x00cd:
            int r3 = r0.f23548a
            com.google.android.material.badge.BadgeDrawable r3 = r1.getOrCreateBadge(r3)
            java.lang.String r4 = "bottomNavigation.getOrCreateBadge(badgeData.id)"
            kotlin.jvm.internal.C19383o.m32796f(r3, r4)
            r3.setVisible(r5)
            android.content.Context r4 = r1.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131165394(0x7f0700d2, float:1.7945004E38)
            int r4 = r4.getDimensionPixelSize(r6)
            r3.setVerticalOffset(r4)
            android.content.Context r4 = r1.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131165388(0x7f0700cc, float:1.7944992E38)
            int r4 = r4.getDimensionPixelSize(r6)
            r3.setHorizontalOffset(r4)
            android.content.Context r4 = r1.getContext()
            java.lang.String r6 = "bottomNavigation.context"
            kotlin.jvm.internal.C19383o.m32796f(r4, r6)
            r7 = 2130968867(0x7f040123, float:1.75464E38)
            android.content.res.ColorStateList r4 = kotlin.jvm.internal.C19382n.m32782y0(r4, r7)
            int r4 = r4.getDefaultColor()
            r3.setBackgroundColor(r4)
            android.content.Context r4 = r1.getContext()
            kotlin.jvm.internal.C19383o.m32796f(r4, r6)
            r6 = 2130968872(0x7f040128, float:1.754641E38)
            android.content.res.ColorStateList r4 = kotlin.jvm.internal.C19382n.m32782y0(r4, r6)
            int r4 = r4.getDefaultColor()
            r3.setBadgeTextColor(r4)
            boolean r4 = r2 instanceof com.etsy.android.p327ui.you.C11800a.C11801a
            if (r4 == 0) goto L_0x0089
            com.etsy.android.ui.you.a$a r2 = (com.etsy.android.p327ui.you.C11800a.C11801a) r2
            int r2 = r2.f26278a
            if (r2 > 0) goto L_0x013c
            int r0 = r0.f23548a
            r1.removeBadge(r0)
            goto L_0x0089
        L_0x013c:
            r3.setNumber(r2)
            goto L_0x0089
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.BOEActivity.lambda$onCreate$2(com.etsy.android.ui.navigation.bottom.d):void");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCreate$3(Throwable th) throws Exception {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCreate$4(Throwable th) throws Exception {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$requestPushOptInPermissions$5(Boolean bool) {
        if (bool.booleanValue()) {
            this.pushPermissionPrompter.mo30559a(new WeakReference(this), this.requestPermissionLauncher);
        }
    }

    /* access modifiers changed from: private */
    public void lambda$resumeUpgradePrompt$8(C15559a aVar) {
        if (aVar.f35007a == 3) {
            try {
                this.appUpdateManager.mo55336c(aVar, 1, this);
            } catch (IntentSender.SendIntentException e) {
                this.boeViewModel.f23516f.mo46666a(e);
            }
        } else if (aVar.f35008b == 11) {
            C10677n nVar = this.boeViewModel;
            nVar.f23532v = null;
            nVar.f23531u.onNext(C9905g0.C9906a.f21854a);
        }
    }

    /* access modifiers changed from: private */
    public void observeUpgradePrompt(C9905g0 g0Var) {
        if (g0Var instanceof C9905g0.C9907b) {
            triggerUpgrade(((C9905g0.C9907b) g0Var).f21855a);
        } else if (g0Var instanceof C9905g0.C9906a) {
            completeUpgrade();
        }
    }

    private void requestPushOptInPermissions() {
        if (C19382n.m32706E0()) {
            if (this.session.mo45960e()) {
                this.pushPermissionPrompter.mo30559a(new WeakReference(this), this.requestPermissionLauncher);
            } else {
                this.boeViewModel.f23528r.observe(this, new C10077j(this, 0));
            }
        }
    }

    private void resumeUpgradePrompt() {
        this.appUpdateManager.mo55338e().mo70117d(new C9735f(this));
    }

    /* access modifiers changed from: private */
    public void runAddToCartAnimation(C9613a aVar) {
        C9613a aVar2 = aVar;
        C13465b bVar = new C13465b(this.cartAnimatedFlyingBadge, ((ViewGroup) this.bottomNavigation.findViewById(R.id.menu_bottom_nav_cart)).findViewById(R.id.navigation_bar_item_icon_view), (float) C1948d.m4272d(this), getTheme());
        C19383o.m32797g(aVar2, "addToCartAnimEvent");
        bVar.f29484a.setX((float) aVar2.f21304a);
        bVar.f29484a.setY((float) aVar2.f21305b);
        bVar.f29484a.bringToFront();
        bVar.f29484a.setVisibility(0);
        int[] iArr = new int[2];
        bVar.f29485b.getLocationOnScreen(iArr);
        float width = (float) ((bVar.f29485b.getWidth() / 2) + iArr[0]);
        float height = (float) ((bVar.f29485b.getHeight() / 2) + iArr[1]);
        float f = (float) aVar2.f21304a;
        float f2 = (float) aVar2.f21305b;
        float f3 = (((height - f2) - 0.0f) / (bVar.f29486c - 0.0f)) + ((float) 1);
        float f4 = ((width - f) / ((float) 2)) + f;
        float f5 = f2 - ((400.0f * f3) + 500.0f);
        double d = (double) (210.0f * f3);
        if (!Double.isNaN(d)) {
            long round = Math.round(d);
            double d2 = (double) (f3 * 320.0f);
            if (!Double.isNaN(d2)) {
                long round2 = Math.round(d2);
                Path path = new Path();
                path.moveTo(f, f2);
                path.quadTo(f4, f5, width, height);
                TypedValue typedValue = new TypedValue();
                bVar.f29487d.resolveAttribute(R.attr.clg_color_interaction_button, typedValue, true);
                TypedValue typedValue2 = new TypedValue();
                bVar.f29487d.resolveAttribute(R.attr.clg_color_notification, typedValue2, true);
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(typedValue.data), Integer.valueOf(typedValue2.data)});
                ofObject.addUpdateListener(new C13464a(bVar));
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bVar.f29484a, View.X, View.Y, path);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bVar.f29484a, View.SCALE_X, new float[]{1.0f, 0.8f});
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(bVar.f29484a, View.SCALE_Y, new float[]{1.0f, 0.8f});
                ofFloat2.setDuration(round);
                ofFloat3.setDuration(round);
                ofObject.setDuration(round);
                ofFloat.setDuration(round2);
                ofFloat.setInterpolator(new PathInterpolator(0.04f, 0.18f, 0.0f, -0.14f));
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(bVar.f29485b, View.SCALE_X, new float[]{1.0f, 1.5f});
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(bVar.f29485b, View.SCALE_Y, new float[]{1.0f, 1.5f});
                ofFloat4.setDuration(120);
                ofFloat5.setDuration(120);
                ofFloat4.setInterpolator(new AccelerateInterpolator());
                ofFloat5.setInterpolator(new AccelerateInterpolator());
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(bVar.f29485b, View.SCALE_X, new float[]{1.5f, 1.0f});
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(bVar.f29485b, View.SCALE_Y, new float[]{1.5f, 1.0f});
                ofFloat7.setInterpolator(new DecelerateInterpolator());
                ofFloat6.setInterpolator(new DecelerateInterpolator());
                ofFloat6.setDuration(200);
                ofFloat7.setDuration(200);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(ofFloat2).with(ofFloat3).with(ofFloat).with(ofObject);
                animatorSet.play(ofFloat5).with(ofFloat4).after(ofFloat);
                animatorSet.play(ofFloat7).with(ofFloat6).after(ofFloat5);
                animatorSet.addListener(new AddToCartAnimation$animate$2(bVar, animatorSet, ofObject));
                animatorSet.start();
                return;
            }
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    private void setUpFullScreenSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(1280);
        if (!C8914m.m17346d(this)) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
        }
    }

    /* access modifiers changed from: private */
    public void showAlert(Alert alert) {
        C12979a a = C12979a.C12980a.m20683a(this);
        a.mo45783c(getResources().getIdentifier(alert.getIconId(), "drawable", getPackageName()));
        a.mo45785e(alert.getTitle());
        a.mo45782b(alert.getBody(), (Drawable) null);
        a.mo45781a(alert.getCollageType());
        a.f28588b.showDismissButton(alert.getShowDisclosureIndicator());
        a.f28591e = 6000;
        a.mo45786f();
        a.f28588b.showDismissButton(true);
        if (alert.getAnalyticsName() != null) {
            C8703p analyticsContext = getAnalyticsContext();
            analyticsContext.mo21333d(alert.getAnalyticsName() + "_viewed", (Map<? extends AnalyticsProperty, Object>) null);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d3, code lost:
        if (r0.equals("in_app_notifications_favorite_listing_sale") == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00dc, code lost:
        if (r0.equals("in_app_notifications_shop_coupon") == false) goto L_0x00de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void showTooltip(com.etsy.android.lib.models.apiv3.inappnotifications.IANTooltip r10) {
        /*
            r9 = this;
            boolean r0 = r9.isBottomNavBarHidden()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001c
            boolean r0 = com.google.android.play.core.assetpacks.C15588c1.m25344r0(r9)
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x001c
            com.google.android.material.bottomnavigation.BottomNavigationView r0 = r9.bottomNavigation
            int r0 = r0.getSelectedItemId()
            r3 = 2131428963(0x7f0b0663, float:1.8479585E38)
            if (r0 == r3) goto L_0x001c
            r0 = r1
            goto L_0x001d
        L_0x001c:
            r0 = r2
        L_0x001d:
            if (r0 != 0) goto L_0x0020
            return
        L_0x0020:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r3 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.TYPE
            java.lang.String r4 = r10.getTooltipType()
            r0.put(r3, r4)
            com.etsy.android.lib.logger.p r3 = r9.mAnalyticsTracker
            java.lang.String r4 = "updates_tooltip_displays"
            r3.mo21333d(r4, r0)
            ye.e r0 = r9.tooltipPrefs
            java.lang.String r3 = r10.getTooltipType()
            r0.getClass()
            java.lang.String r4 = "tooltip"
            kotlin.jvm.internal.C19383o.m32797g(r3, r4)
            java.util.ArrayList r4 = r0.mo46730a()
            if (r4 == 0) goto L_0x0052
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r5 = r2
            goto L_0x0053
        L_0x0052:
            r5 = r1
        L_0x0053:
            if (r5 == 0) goto L_0x005d
            java.lang.String[] r4 = new java.lang.String[r1]
            r4[r2] = r3
            java.util.ArrayList r4 = p568fn.C17782b.m29888u(r4)
        L_0x005d:
            r4.add(r3)
            za.a r5 = r0.f30588a
            android.content.SharedPreferences r5 = r5.mo46761a()
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.util.Set r4 = kotlin.collections.C19327t.m32664t1(r4)
            java.lang.String r6 = "tooltip_types"
            android.content.SharedPreferences$Editor r4 = r5.putStringSet(r6, r4)
            r4.apply()
            za.a r4 = r0.f30588a
            android.content.SharedPreferences r4 = r4.mo46761a()
            android.content.SharedPreferences$Editor r4 = r4.edit()
            com.etsy.android.lib.util.e0 r5 = r0.f30589b
            r5.getClass()
            long r5 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r3 = r4.putLong(r3, r5)
            com.etsy.android.lib.util.e0 r0 = r0.f30589b
            r0.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "tooltip_displayed"
            android.content.SharedPreferences$Editor r0 = r3.putLong(r0, r4)
            r0.apply()
            java.lang.String r0 = r10.getTooltipType()
            java.lang.String r3 = "toolTipType"
            kotlin.jvm.internal.C19383o.m32797g(r0, r3)
            int r3 = r0.hashCode()
            r4 = 124885632(0x7719a80, float:1.8176228E-34)
            r5 = 2131231495(0x7f080307, float:1.8079073E38)
            if (r3 == r4) goto L_0x00d6
            r4 = 547870358(0x20a7d696, float:2.8432902E-19)
            if (r3 == r4) goto L_0x00cd
            r4 = 554270944(0x210980e0, float:4.658797E-19)
            if (r3 == r4) goto L_0x00c0
            goto L_0x00de
        L_0x00c0:
            java.lang.String r3 = "in_app_notifications_favorite_back_in_stock"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x00c9
            goto L_0x00de
        L_0x00c9:
            r5 = 2131231449(0x7f0802d9, float:1.807898E38)
            goto L_0x00e1
        L_0x00cd:
            java.lang.String r3 = "in_app_notifications_favorite_listing_sale"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x00e1
            goto L_0x00de
        L_0x00d6:
            java.lang.String r3 = "in_app_notifications_shop_coupon"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x00e1
        L_0x00de:
            r5 = 2131231337(0x7f080269, float:1.8078752E38)
        L_0x00e1:
            com.google.android.material.bottomnavigation.BottomNavigationView r0 = r9.bottomNavigation
            java.lang.String r3 = "anchorView"
            kotlin.jvm.internal.C19383o.m32797g(r0, r3)
            android.view.LayoutInflater r3 = r9.getLayoutInflater()
            r4 = 2131624775(0x7f0e0347, float:1.887674E38)
            r6 = 0
            android.view.View r3 = r3.inflate(r4, r6, r2)
            java.lang.String r4 = "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageAlert"
            kotlin.jvm.internal.C19383o.m32795e(r3, r4)
            com.etsy.android.stylekit.views.CollageAlert r3 = (com.etsy.android.stylekit.views.CollageAlert) r3
            r3.showDismissButton(r1)
            android.widget.PopupWindow r4 = new android.widget.PopupWindow
            r6 = -1
            r7 = -2
            r4.<init>(r3, r6, r7, r2)
            r6 = 2132017817(0x7f140299, float:1.9673923E38)
            r4.setAnimationStyle(r6)
            ye.a r6 = new ye.a
            r6.<init>(r4, r3, r0, r9)
            java.lang.String r7 = r10.getText()
            java.lang.String r8 = "text"
            kotlin.jvm.internal.C19383o.m32797g(r7, r8)
            r3.setTitleText(r7)
            java.lang.Object r7 = p260v0.C8184a.f17966a
            android.graphics.drawable.Drawable r5 = p260v0.C8184a.C8187c.m16466b(r9, r5)
            r3.setIconDrawable(r5)
            com.etsy.android.ui.d r5 = new com.etsy.android.ui.d
            r5.<init>(r9, r2)
            java.lang.String r7 = r10.getTooltipType()
            r6.f30577c = r5
            r6.f30578d = r7
            com.etsy.android.stylekit.views.r r7 = new com.etsy.android.stylekit.views.r
            r7.<init>(r1, r5, r6)
            r3.setOnClickListener(r7)
            r9.ianTooltipAlert = r6
            android.content.res.Resources r1 = r9.getResources()
            java.lang.String r3 = "navigation_bar_height"
            java.lang.String r5 = "dimen"
            java.lang.String r7 = "android"
            int r1 = r1.getIdentifier(r3, r5, r7)
            if (r1 <= 0) goto L_0x0155
            android.content.res.Resources r3 = r9.getResources()
            int r1 = r3.getDimensionPixelSize(r1)
            goto L_0x0156
        L_0x0155:
            r1 = r2
        L_0x0156:
            r3 = 80
            int r5 = r0.getHeight()
            int r5 = r5 + r1
            r4.showAtLocation(r0, r3, r2, r5)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            androidx.compose.ui.platform.o r1 = new androidx.compose.ui.platform.o
            r2 = 4
            r1.<init>(r6, r2)
            r2 = 8000(0x1f40, double:3.9525E-320)
            r0.postDelayed(r1, r2)
            androidx.core.view.f r0 = new androidx.core.view.f
            com.etsy.android.ui.user.inappnotifications.tooltips.IANGestureListener r1 = new com.etsy.android.ui.user.inappnotifications.tooltips.IANGestureListener
            com.etsy.android.ui.e r2 = new com.etsy.android.ui.e
            r2.<init>(r9)
            java.lang.String r10 = r10.getTooltipType()
            r1.<init>(r2, r10)
            r0.<init>(r9, r1)
            r9.ianGestureDetector = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.BOEActivity.showTooltip(com.etsy.android.lib.models.apiv3.inappnotifications.IANTooltip):void");
    }

    private void triggerHardUpgrade(C15559a aVar) {
        try {
            this.appUpdateManager.mo55336c(aVar, 1, this);
        } catch (IntentSender.SendIntentException e) {
            this.boeViewModel.f23516f.mo46666a(e);
        }
    }

    private void triggerSoftUpgrade(C15559a aVar) {
        try {
            this.appUpdateManager.mo55335b(new C9077a());
            this.appUpdateManager.mo55336c(aVar, 0, this);
        } catch (IntentSender.SendIntentException e) {
            this.boeViewModel.f23516f.mo46666a(e);
        }
    }

    private void triggerUpgrade(C13832h hVar) {
        getAnalyticsContext().mo21333d(hVar.mo46668a(), (Map<? extends AnalyticsProperty, Object>) null);
        if (hVar instanceof C13832h.C13833a) {
            triggerHardUpgrade(((C13832h.C13833a) hVar).f30450a);
        } else if (hVar instanceof C13832h.C13835c) {
            triggerSoftUpgrade(((C13832h.C13835c) hVar).f30452a);
        }
    }

    public void allowBottomNavBarToHide(boolean z, C10711s sVar) {
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) this.bottomNavigation.getLayoutParams();
        if (!z) {
            layoutParams.setBehavior((CoordinatorLayout.C2245c) null);
            this.bottomNavigation.animate().translationY(0.0f).start();
            this.mNavContentView.setPadding(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_height));
        } else if (!(layoutParams.getBehavior() instanceof BottomNavigationBehavior)) {
            layoutParams.setBehavior(new BottomNavigationBehavior());
            this.mNavContentView.setPadding(0, 0, 0, 0);
        } else if (sVar != null && (layoutParams.getBehavior() instanceof BottomNavigationBehavior)) {
            BottomNavigationBehavior bottomNavigationBehavior = (BottomNavigationBehavior) layoutParams.getBehavior();
            bottomNavigationBehavior.getClass();
            bottomNavigationBehavior.getClass();
        }
        this.bottomNavigation.setOnApplyWindowInsetsListener(new C9112c());
    }

    public boolean allowHidingBottomBar() {
        return false;
    }

    public boolean allowUpArrow() {
        return true;
    }

    public void clearActionBarCustomView() {
        getAppBarHelper().removeCustomView();
        getAppBarHelper().resetNavigationIcon();
    }

    public void disableUpArrow() {
        getAppBarHelper().setHomeAsUpEnabled(false);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C2300f fVar = this.ianGestureDetector;
        if (!(fVar == null || this.ianTooltipAlert == null)) {
            fVar.mo8896a(motionEvent);
        }
        this.singleActivityDelegate.getClass();
        return super.dispatchTouchEvent(motionEvent);
    }

    public void enableUpArrow() {
        getAppBarHelper().setHomeAsUpEnabled(true);
    }

    public void extendSearchFAB() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.searchFAB;
        if (extendedFloatingActionButton != null) {
            extendedFloatingActionButton.extend();
        }
    }

    public C6896a getFavoriteHandler() {
        return this.favoriteHandler;
    }

    public TrackingBaseActivity getFragmentActivity() {
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getSystemService(java.lang.String r3) {
        /*
            r2 = this;
            com.etsy.android.ui.singleactivity.g r0 = r2.singleActivityDelegate
            if (r0 == 0) goto L_0x002b
            com.etsy.android.ui.singleactivity.a r0 = (com.etsy.android.p327ui.singleactivity.C11316a) r0
            java.lang.String r1 = "name"
            kotlin.jvm.internal.C19383o.m32797g(r3, r1)
            com.etsy.android.ui.singleactivity.b r1 = r0.f24971i
            if (r1 == 0) goto L_0x002b
            com.etsy.android.ui.singleactivity.b r1 = r0.mo37051d()
            java.util.LinkedHashMap<java.lang.String, com.zhuinden.simplestack.a> r1 = r1.f24974a
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L_0x002b
            com.etsy.android.ui.singleactivity.b r0 = r0.mo37051d()
            java.util.LinkedHashMap<java.lang.String, com.zhuinden.simplestack.a> r0 = r0.f24974a
            java.lang.Object r0 = r0.get(r3)
            kotlin.jvm.internal.C19383o.m32794d(r0)
            com.zhuinden.simplestack.a r0 = (com.zhuinden.simplestack.C17518a) r0
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            if (r0 == 0) goto L_0x002f
            return r0
        L_0x002f:
            java.lang.Object r3 = super.getSystemService(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.BOEActivity.getSystemService(java.lang.String):java.lang.Object");
    }

    public boolean hideOnScrollBottomNavIsVisible() {
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) this.bottomNavigation.getLayoutParams();
        if (layoutParams.getBehavior() instanceof BottomNavigationBehavior) {
            return !((BottomNavigationBehavior) layoutParams.getBehavior()).f19969a;
        }
        return true;
    }

    public void hideSearchFAB() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.searchFAB;
        if (extendedFloatingActionButton != null) {
            extendedFloatingActionButton.setVisibility(8);
        }
    }

    public boolean isBottomNavBarHidden() {
        return this.mNavContentView.getPaddingBottom() == 0 && this.mNavContentView.getPaddingTop() == 0 && this.mNavContentView.getPaddingStart() == 0 && this.mNavContentView.getPaddingEnd() == 0;
    }

    public Boolean isFullScreen() {
        return Boolean.valueOf(getAppBarHelper().isFullScreen(this));
    }

    public void navigate(C12822e eVar) {
        C11323g gVar = this.singleActivityDelegate;
        if (gVar instanceof C11316a) {
            C11316a aVar = (C11316a) gVar;
            aVar.getClass();
            C19383o.m32797g(eVar, "key");
            if (eVar instanceof DeeplinkNavigationKey) {
                C11320d dVar = aVar.f24969g;
                DeeplinkNavigationKey deeplinkNavigationKey = (DeeplinkNavigationKey) eVar;
                dVar.getClass();
                if (dVar.f24983b.mo21132b(C8592b.f18798i0)) {
                    dVar.f24984c.getClass();
                    String str = "NAV_INFO: " + System.currentTimeMillis() + " deep link nav key " + deeplinkNavigationKey;
                    LogCatKt.m17045a().mo21310e(str);
                    dVar.mo37062a(str);
                }
                aVar.mo37052e(deeplinkNavigationKey);
            } else if (eVar instanceof FragmentNavigationKey) {
                C11320d dVar2 = aVar.f24969g;
                FragmentNavigationKey fragmentNavigationKey = (FragmentNavigationKey) eVar;
                dVar2.getClass();
                if (dVar2.f24983b.mo21132b(C8592b.f18798i0)) {
                    dVar2.f24984c.getClass();
                    String str2 = "NAV_INFO: " + System.currentTimeMillis() + " fragment nav key " + fragmentNavigationKey;
                    LogCatKt.m17045a().mo21310e(str2);
                    dVar2.mo37062a(str2);
                }
                aVar.mo37053f(fragmentNavigationKey);
            } else {
                throw new UnsupportedNavigationException("Key " + eVar + " is not supported!");
            }
        }
    }

    public boolean navigateUpAsBack() {
        if (((C11316a) this.singleActivityDelegate).mo37051d().mo37058d().mo68704i()) {
            return true;
        }
        C12788a.m20424c(this, new HomePagerKey(C19421p.m32935c0(this), (Bundle) null, false));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r25, int r26, android.content.Intent r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = 300(0x12c, float:4.2E-43)
            r5 = 1
            r6 = 311(0x137, float:4.36E-43)
            r7 = 0
            r8 = 0
            if (r1 == r4) goto L_0x005f
            r4 = 301(0x12d, float:4.22E-43)
            if (r1 == r4) goto L_0x0051
            r4 = 501(0x1f5, float:7.02E-43)
            if (r1 == r4) goto L_0x001e
            super.onActivityResult(r25, r26, r27)
            goto L_0x0125
        L_0x001e:
            if (r2 != 0) goto L_0x004c
            com.etsy.android.ui.n r4 = r0.boeViewModel
            we.h r6 = r4.f23532v
            if (r6 != 0) goto L_0x0028
            we.h$b r6 = p475we.C13832h.C13834b.f30451a
        L_0x0028:
            we.c r4 = r4.f23516f
            r4.getClass()
            java.lang.String r8 = "upgradePromptType"
            kotlin.jvm.internal.C19383o.m32797g(r6, r8)
            fa.a r4 = r4.f30439a
            java.lang.String r8 = "UpgradePrompt.cancelled."
            java.lang.StringBuilder r8 = android.support.p013v4.media.C0072d.m201h(r8)
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r4.mo45474a(r6)
        L_0x004c:
            super.onActivityResult(r25, r26, r27)
            goto L_0x0125
        L_0x0051:
            if (r2 != r6) goto L_0x005b
            com.etsy.android.lib.deeplinks.EtsyAction r4 = r0.mSignInAction
            r0.onUserSignedInForAction(r4)
            r0.mSignInAction = r8
            goto L_0x005f
        L_0x005b:
            r24.finish()
            return
        L_0x005f:
            if (r2 != r6) goto L_0x0125
            java.lang.String r4 = r27.getAction()
            com.etsy.android.lib.deeplinks.EtsyAction r4 = com.etsy.android.lib.deeplinks.EtsyAction.fromIntentAction(r4)
            if (r4 != 0) goto L_0x006d
            goto L_0x0125
        L_0x006d:
            java.lang.String r6 = r4.getType()
            android.os.Bundle r6 = r3.getBundleExtra(r6)
            int[] r9 = com.etsy.android.p327ui.BOEActivity.C9080d.f19967a
            int r4 = r4.ordinal()
            r4 = r9[r4]
            if (r4 == r5) goto L_0x00d9
            r9 = 2
            if (r4 == r9) goto L_0x00ae
            r9 = 3
            if (r4 == r9) goto L_0x008a
            r0.setIntent(r8)
            goto L_0x0125
        L_0x008a:
            java.lang.String r4 = kotlin.reflect.C19421p.m32935c0(r24)
            java.lang.String r8 = "listing_id"
            java.lang.String r8 = r6.getString(r8)
            java.lang.String r9 = "listingId"
            kotlin.jvm.internal.C19383o.m32797g(r8, r9)
            java.lang.String r9 = "url"
            java.lang.String r6 = r6.getString(r9)
            java.lang.String r9 = "listingUrl"
            kotlin.jvm.internal.C19383o.m32797g(r6, r9)
            com.etsy.android.ui.navigation.keys.fragmentkeys.ReportListingKey r9 = new com.etsy.android.ui.navigation.keys.fragmentkeys.ReportListingKey
            r9.<init>(r4, r8, r6)
            p356ge.C12788a.m20424c(r0, r9)
            goto L_0x0125
        L_0x00ae:
            java.lang.String r4 = "transaction-data"
            int r4 = r6.getInt(r4, r7)
            kotlin.c<com.etsy.android.uikit.nav.transactions.TransactionDataRepository> r6 = com.etsy.android.uikit.nav.transactions.TransactionDataRepository.f26402b
            com.etsy.android.uikit.nav.transactions.TransactionDataRepository r6 = com.etsy.android.uikit.nav.transactions.TransactionDataRepository.C11867a.m19552a()
            java.lang.Object r4 = r6.mo38342a(r4)
            com.etsy.android.uikit.nav.transactions.a r4 = (com.etsy.android.uikit.nav.transactions.C11869a) r4
            if (r4 == 0) goto L_0x0125
            java.lang.String r6 = "listing"
            java.lang.Object r4 = r4.mo38345b(r6)
            com.etsy.android.lib.models.interfaces.ListingLike r4 = (com.etsy.android.lib.models.interfaces.ListingLike) r4
            if (r4 == 0) goto L_0x0125
            java.lang.String r6 = kotlin.reflect.C19421p.m32935c0(r24)
            com.etsy.android.ui.navigation.keys.bottomsheetkeys.AddToListBottomSheetKey r8 = new com.etsy.android.ui.navigation.keys.bottomsheetkeys.AddToListBottomSheetKey
            r8.<init>(r6, r4, r7)
            p356ge.C12788a.m20424c(r0, r8)
            goto L_0x0125
        L_0x00d9:
            r9 = 0
            if (r6 == 0) goto L_0x0104
            java.lang.String r4 = "username"
            java.lang.String r8 = r6.getString(r4)
            java.lang.String r4 = "message"
            java.lang.String r4 = r6.getString(r4)
            java.lang.String r9 = "subject"
            java.lang.String r9 = r6.getString(r9)
            java.lang.String r10 = "USER_ID"
            long r10 = r6.getLong(r10)
            java.lang.String r12 = "DISPLAY_NAME"
            java.lang.String r6 = r6.getString(r12)
            r19 = r4
            r16 = r6
            r15 = r8
            r18 = r9
            r9 = r10
            goto L_0x010b
        L_0x0104:
            r15 = r8
            r16 = r15
            r18 = r16
            r19 = r18
        L_0x010b:
            java.lang.String r13 = kotlin.reflect.C19421p.m32935c0(r24)
            java.lang.Long r17 = java.lang.Long.valueOf(r9)
            r21 = 0
            r20 = 0
            com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationComposeNavigationKey r4 = new com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationComposeNavigationKey
            r14 = 0
            r22 = 2
            r23 = 0
            r12 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            p356ge.C12788a.m20424c(r0, r4)
        L_0x0125:
            r4 = 45056(0xb000, float:6.3137E-41)
            if (r1 != r4) goto L_0x012b
            goto L_0x012c
        L_0x012b:
            r5 = r7
        L_0x012c:
            if (r5 == 0) goto L_0x014a
            if (r3 == 0) goto L_0x014a
            com.etsy.android.lib.deeplinks.EtsyAction r4 = com.etsy.android.lib.deeplinks.EtsyAction.GOOGLE_PAY_RESULT
            java.lang.String r4 = r4.getIntentAction()
            r3.setAction(r4)
            java.lang.String r4 = "REQUEST_CODE"
            r3.putExtra(r4, r1)
            java.lang.String r1 = "RESULT_CODE"
            r3.putExtra(r1, r2)
            u1.a r1 = p251u1.C8115a.m16322a(r24)
            r1.mo20709c(r3)
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.BOEActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        C11316a aVar = (C11316a) this.singleActivityDelegate;
        Object k = aVar.mo37051d().mo37058d().mo68706k();
        C19383o.m32796f(k, "multistack.getSelectedSt…<MultistackFragmentKey>()");
        Fragment C = aVar.f24964b.getSupportFragmentManager().mo10353C(((MultistackFragmentKey) k).getFragmentTag());
        boolean z = true;
        C12794c cVar = null;
        if (!(C != null && C.isAdded() && C.getView() != null && !C.isDetached() && !C.isHidden())) {
            C = null;
        }
        if (C instanceof C12794c) {
            cVar = (C12794c) C;
        }
        if (cVar == null || !cVar.handleBackPressed()) {
            z = false;
        }
        if (!z) {
            aVar.popBackstack();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        invalidateOptionsMenu();
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        setTheme(2132018133);
        if (getApplication() instanceof BOEApplication) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C4579j1 j1Var = (C4579j1) BOEApplication.getAppComponent();
            j1Var.getClass();
            supportFragmentManager.f6151u = new C11793w(j1Var.f10301q3, j1Var.f10306r3, j1Var.f10321u3);
            super.onCreate(bundle);
            C10677n nVar = (C10677n) new C2870k0((C2880m0) this, (C2870k0.C2872b) this.viewModelFactory).mo10829a(C10677n.class);
            this.boeViewModel = nVar;
            nVar.f23524n.observe(this, new C9904g(this, 0));
            this.boeViewModel.f23526p.observe(this, new C9918h(this));
            PublishSubject<C9905g0> publishSubject = this.boeViewModel.f23531u;
            C19172m c = C0472h.m1242c(publishSubject, publishSubject);
            this.rxSchedulers.getClass();
            ObservableObserveOn e = c.mo20635e(C13461f.m21236c());
            C6332c cVar = new C6332c(this, 3);
            C8884d dVar = new C8884d(1);
            Functions.C12958c cVar2 = Functions.f28539c;
            Functions.C12959d dVar2 = Functions.f28540d;
            this.upgradePromptDisposable = e.mo20636f(cVar, dVar, cVar2, dVar2);
            PublishSubject<IANTooltip> publishSubject2 = this.boeViewModel.f23529s;
            C19172m c2 = C0472h.m1242c(publishSubject2, publishSubject2);
            this.rxSchedulers.getClass();
            this.tooltipDisposable = c2.mo20635e(C13461f.m21236c()).mo20636f(new C8766p(this, 2), new C10075i(0), cVar2, dVar2);
            if (this.updatesNativeEligibility.mo37551a()) {
                super.setContentView((int) R.layout.activity_nav_bottom_tab_merged_updates_n_favs);
            } else {
                super.setContentView((int) R.layout.activity_navigation_bottom_tab);
            }
            BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
            this.bottomNavigation = bottomNavigationView;
            C19383o.m32797g(bottomNavigationView, ResponseConstants.PARENT);
            if (C0326j.m869n(BuildTarget.Companion)) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 51;
                layoutParams.leftMargin = (int) bottomNavigationView.getResources().getDimension(R.dimen.build_version_margin);
                TextView textView = new TextView(bottomNavigationView.getContext());
                Resources resources = bottomNavigationView.getResources();
                C19383o.m32796f(resources, "parent.getResources()");
                SharedPreferences sharedPreferences = bottomNavigationView.getContext().getSharedPreferences(resources.getString(R.string.config_preferences_file_name), 0);
                String string = sharedPreferences.getString(resources.getString(R.string.config_prefs_environment), resources.getString(R.string.config_prefs_prod_value));
                if (C19383o.m32792b(string, resources.getString(R.string.config_prefs_dev_value)) && sharedPreferences.getBoolean(resources.getString(R.string.config_prefs_dev_proxy), false)) {
                    string = C0326j.m864i(string, "_dev_proxy");
                }
                textView.setText("6.17.0 rv:61700036 br:unknown-branch @ " + string);
                textView.setTextSize(bottomNavigationView.getResources().getDimension(R.dimen.build_version_text_size));
                bottomNavigationView.addView(textView, layoutParams);
            }
            this.mNavContentView = (FrameLayout) findViewById(R.id.nav_content_frame);
            this.cartAnimatedFlyingBadge = findViewById(R.id.animated_cart_count);
            this.searchFAB = (ExtendedFloatingActionButton) findViewById(R.id.search_fab);
            PublishSubject<C9613a> publishSubject3 = this.boeViewModel.f23521k.f21476a;
            this.schedulers.getClass();
            this.compositeDisposable.mo19403b(publishSubject3.mo20639i(C13461f.m21236c()).mo20637g(new C6487g(this, 4)));
            getAppBarHelper().setHomeAsUpEnabled(allowUpArrow());
            if (allowHidingBottomBar()) {
                ((CoordinatorLayout.LayoutParams) this.bottomNavigation.getLayoutParams()).setBehavior(new BottomNavigationBehavior());
                this.mNavContentView.setPadding(0, 0, 0, 0);
            } else {
                this.mNavContentView.setPadding(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_height));
            }
            setUpFullScreenSystemUI();
            showTransparentStatusBar(true);
            boolean z = bundle2 != null;
            this.mIsRestarted = z;
            if (z && bundle2.containsKey(SIGN_IN_ACTION)) {
                this.mSignInAction = EtsyAction.values()[bundle2.getInt(SIGN_IN_ACTION)];
            }
            this.singleActivityDelegate = new C11316a(this, this.schedulers, this.bottomNavStateRepo, new C8510a(), this.etsyConfigMap, this.grafana, this.multistackPrefs, this.updatesNativeEligibility);
            getAppBarHelper().setTabMode(2);
            C11323g gVar = this.singleActivityDelegate;
            Intent intent = getIntent();
            C11316a aVar = (C11316a) gVar;
            aVar.getClass();
            C19383o.m32797g(intent, "intent");
            C11317b bVar = new C11317b();
            bVar.mo37057c(new HomeKey(intent.getExtras(), (String) null, 2, (DefaultConstructorMarker) null));
            bVar.mo37057c(new FavoritesKey((String) null, 1, (DefaultConstructorMarker) null));
            if (!aVar.f24970h.mo37551a()) {
                bVar.mo37057c(new InAppNotificationsKey((String) null, 1, (DefaultConstructorMarker) null));
            }
            bVar.mo37057c(new YouKey((String) null, 1, (DefaultConstructorMarker) null));
            bVar.mo37057c(new CartKey((String) null, 1, (DefaultConstructorMarker) null));
            if (bundle2 != null) {
                bVar.mo37056b((StateBundle) bundle2.getParcelable("multistack"));
            }
            C11317b bVar2 = (C11317b) aVar.f24964b.getLastCustomNonConfigurationInstance();
            if (bVar2 != null) {
                bVar = bVar2;
            }
            aVar.f24971i = bVar;
            FragmentManager supportFragmentManager2 = aVar.f24964b.getSupportFragmentManager();
            C19383o.m32796f(supportFragmentManager2, "activity.supportFragmentManager");
            aVar.f24973k = new C11318c(supportFragmentManager2, aVar, aVar.f24968f);
            C11317b d = aVar.mo37051d();
            C11318c cVar3 = aVar.f24973k;
            if (cVar3 != null) {
                d.mo37059e(cVar3);
                FragmentManager supportFragmentManager3 = aVar.f24964b.getSupportFragmentManager();
                C19383o.m32796f(supportFragmentManager3, "activity.supportFragmentManager");
                for (FragmentManager.C2723k S : C19382n.m32704D0(new C11324t(aVar.f24964b), new C9090a(), new C10674m0(), new C9731e0(), new C9718d0(), new C9736f0(), new C11787v(), new C10082l0(), new C9113c0())) {
                    supportFragmentManager3.mo10366S(S, false);
                }
                BottomNavStateRepo bottomNavStateRepo2 = aVar.f24966d;
                bottomNavStateRepo2.mo34417d();
                C19254a<C10690g> aVar2 = bottomNavStateRepo2.f23544k;
                C19172m b = C0472h.m1241b(aVar2, aVar2);
                aVar.f24965c.getClass();
                Disposable f = b.mo20635e(C13461f.m21236c()).mo20636f(new C13197c(aVar, 2), new C6335b(2), Functions.f28539c, Functions.f28540d);
                C7091a aVar3 = aVar.f24972j;
                C19383o.m32798h(aVar3, "compositeDisposable");
                aVar3.mo19403b(f);
                if (bundle2 == null) {
                    Intent intent2 = aVar.f24964b.getIntent();
                    C19383o.m32796f(intent2, "activity.intent");
                    aVar.mo37054g(intent2, false);
                }
            } else {
                C19383o.m32805o("multistackFragmentStateChanger");
                throw null;
            }
        }
        PublishSubject<Alert> publishSubject4 = C13557a.f29643a;
        C19172m c3 = C0472h.m1242c(publishSubject4, publishSubject4);
        this.rxSchedulers.getClass();
        ObservableSubscribeOn i = c3.mo20639i(C13461f.m21235b());
        this.rxSchedulers.getClass();
        this.compositeDisposable.mo19403b(i.mo20635e(C13461f.m21236c()).mo20637g(new C8905i(this, 2)));
        requestPushOptInPermissions();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        boolean onCreateOptionsMenuWithIcons = onCreateOptionsMenuWithIcons(menu);
        BOEOptionsMenuItemHelper.m19853a(menu);
        return onCreateOptionsMenuWithIcons;
    }

    public boolean onCreateOptionsMenuWithIcons(Menu menu) {
        getMenuInflater().inflate(R.menu.explore_action_bar, menu);
        if (menu == null) {
            return true;
        }
        if (menu.findItem(R.id.menu_share) != null) {
            menu.findItem(R.id.menu_share).setVisible(false);
        }
        if (menu.findItem(R.id.menu_search) == null) {
            return true;
        }
        menu.findItem(R.id.menu_search).setVisible(false);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        r0 = getSupportFragmentManager();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r3 = this;
            com.etsy.android.ui.singleactivity.g r0 = r3.singleActivityDelegate
            com.etsy.android.ui.singleactivity.a r0 = (com.etsy.android.p327ui.singleactivity.C11316a) r0
            io.reactivex.disposables.a r1 = r0.f24972j
            r1.mo19405d()
            com.etsy.android.ui.singleactivity.b r1 = r0.mo37051d()
            java.util.LinkedHashMap<java.lang.String, com.zhuinden.simplestack.a> r1 = r1.f24974a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0017:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            com.zhuinden.simplestack.a r2 = (com.zhuinden.simplestack.C17518a) r2
            r2.mo68701f()
            goto L_0x0017
        L_0x002d:
            com.etsy.android.ui.BOEActivity r1 = r0.f24964b
            boolean r1 = r1.isFinishing()
            if (r1 == 0) goto L_0x003c
            com.etsy.android.ui.singleactivity.b r0 = r0.mo37051d()
            r0.finalize()
        L_0x003c:
            boolean r0 = r3.mIsRetaining
            if (r0 != 0) goto L_0x0077
            androidx.fragment.app.FragmentManager r0 = r3.getSupportFragmentManager()
            java.util.List r1 = r0.mo10358H()
            if (r1 == 0) goto L_0x0077
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x0077
            androidx.fragment.app.a r2 = new androidx.fragment.app.a     // Catch:{ Exception -> 0x006f }
            r2.<init>(r0)     // Catch:{ Exception -> 0x006f }
            java.util.Iterator r0 = r1.iterator()     // Catch:{ Exception -> 0x006f }
        L_0x0059:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x006f }
            if (r1 == 0) goto L_0x006b
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x006f }
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1     // Catch:{ Exception -> 0x006f }
            if (r1 == 0) goto L_0x0059
            r2.mo10484f(r1)     // Catch:{ Exception -> 0x006f }
            goto L_0x0059
        L_0x006b:
            r2.mo10487k()     // Catch:{ Exception -> 0x006f }
            goto L_0x0077
        L_0x006f:
            r0 = move-exception
            com.etsy.android.lib.logger.h r1 = com.etsy.android.lib.logger.C8694h.f19097a
            java.lang.String r2 = "cleanUpNonRetainedFragments error"
            r1.mo21309d(r2, r0)
        L_0x0077:
            io.reactivex.disposables.Disposable r0 = r3.upgradePromptDisposable
            if (r0 == 0) goto L_0x007e
            r0.dispose()
        L_0x007e:
            androidx.core.view.f r0 = r3.ianGestureDetector
            r1 = 0
            if (r0 == 0) goto L_0x0085
            r3.ianGestureDetector = r1
        L_0x0085:
            ye.a r0 = r3.ianTooltipAlert
            if (r0 == 0) goto L_0x008b
            r3.ianTooltipAlert = r1
        L_0x008b:
            io.reactivex.disposables.Disposable r0 = r3.tooltipDisposable
            if (r0 == 0) goto L_0x0092
            r0.dispose()
        L_0x0092:
            io.reactivex.disposables.a r0 = r3.compositeDisposable
            r0.mo19405d()
            super.onDestroy()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.BOEActivity.onDestroy():void");
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C11316a aVar = (C11316a) this.singleActivityDelegate;
        aVar.getClass();
        C19383o.m32797g(intent, "intent");
        aVar.mo37054g(intent, true);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C11316a aVar = (C11316a) this.singleActivityDelegate;
        aVar.getClass();
        C19383o.m32797g(menuItem, "item");
        Object k = aVar.mo37051d().mo37058d().mo68706k();
        C19383o.m32796f(k, "multistack.getSelectedSt…<MultistackFragmentKey>()");
        Fragment C = aVar.f24964b.getSupportFragmentManager().mo10353C(((MultistackFragmentKey) k).getFragmentTag());
        boolean z = false;
        if (C != null && C.isAdded() && C.getView() != null && !C.isDetached() && !C.isHidden()) {
            C19383o.m32794d(C);
            if (C.onOptionsItemSelected(menuItem)) {
                z = true;
            }
        }
        if (z) {
            return true;
        }
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (!(C11906j.m19625a(getSupportFragmentManager()) instanceof HomePagerFragment)) {
            return navigateUpAsBack();
        }
        C12788a.m20424c(this, new SearchContainerKey(C19421p.m32935c0(this), (SearchSpec) null, (SearchRedirectSpec) null, (Bundle) null));
        return true;
    }

    public void onPause() {
        for (Map.Entry<String, C17518a> value : ((C11316a) this.singleActivityDelegate).mo37051d().f24974a.entrySet()) {
            ((C17518a) value.getValue()).mo68700e();
        }
        super.onPause();
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getAppBarHelper().addExtraUpPadding(this);
    }

    public void onPostResume() {
        super.onPostResume();
        C11317b d = ((C11316a) this.singleActivityDelegate).mo37051d();
        for (Map.Entry next : d.f24974a.entrySet()) {
            C17518a aVar = (C17518a) next.getValue();
            if (!C19383o.m32792b((String) next.getKey(), d.f24975b)) {
                aVar.mo68700e();
            } else {
                aVar.mo68699d("You must call `setup()` before calling `reattachStateChanger()`.");
                C17532i iVar = aVar.f38326h;
                iVar.mo68747a();
                if (!(iVar.f38347f != null)) {
                    aVar.f38330l = true;
                    aVar.f38326h.mo68752f(aVar.f38321c, 1);
                }
            }
        }
    }

    public void onRestart() {
        super.onRestart();
        this.mIsRestarted = true;
    }

    public void onResume() {
        super.onResume();
        Application application = getApplication();
        C8692f fVar = C8692f.f19096a;
        C19383o.m32797g(application, "application");
        C8692f.f19096a.getClass();
        if (C8692f.m17099a()) {
            C13511h.f29567i.getClass();
            C13511h.C13512a.m21284b(application, (String) null);
        }
        invalidateOptionsMenu();
        C10677n nVar = this.boeViewModel;
        nVar.f23514d.mo34416c();
        nVar.f23513c.mo31436a();
        resumeUpgradePrompt();
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return ((C11316a) this.singleActivityDelegate).mo37051d();
    }

    public void onSaveInstanceState(Bundle bundle) {
        EtsyAction etsyAction = this.mSignInAction;
        if (etsyAction != null) {
            bundle.putInt(SIGN_IN_ACTION, etsyAction.ordinal());
        }
        bundle.putInt(SELECTED_BOTTOM_NAV_POSITION, -1);
        super.onSaveInstanceState(bundle);
        C11316a aVar = (C11316a) this.singleActivityDelegate;
        aVar.getClass();
        bundle.putParcelable("multistack", aVar.mo37051d().mo37055a());
    }

    public boolean onSearchRequested() {
        goToSearch();
        return false;
    }

    public void onStart() {
        super.onStart();
        this.mIsRestarted = false;
    }

    public void onStop() {
        this.mIsRetaining = false;
        super.onStop();
    }

    public void onUserSignedInForAction(EtsyAction etsyAction) {
    }

    public void popBackstack() {
        ((C11316a) this.singleActivityDelegate).popBackstack();
    }

    public void popOrGoBack() {
        C12788a.m20426e(this);
    }

    public void removeToolbarOverlay() {
        getAppBarHelper().showAppBar();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mNavContentView.getLayoutParams();
        layoutParams.addRule(3, getAppBarHelper().getAppBarLayout().getId());
        getAppBarHelper().getAppBarLayout().bringToFront();
        this.mNavContentView.setLayoutParams(layoutParams);
    }

    public void setContentView(int i) {
        getLayoutInflater().inflate(i, this.mNavContentView);
    }

    public void setTitle(int i) {
        setTitle(getString(i));
    }

    public void setToolbarOverlay() {
        getAppBarHelper().showAppBar();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mNavContentView.getLayoutParams();
        layoutParams.removeRule(3);
        getAppBarHelper().getAppBarLayout().bringToFront();
        this.mNavContentView.setLayoutParams(layoutParams);
    }

    public void showBottomNav(boolean z) {
        if (z) {
            this.bottomNavigation.setVisibility(0);
        } else {
            this.bottomNavigation.setVisibility(8);
        }
    }

    public void showHideOnScrollBottomNav(boolean z) {
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) this.bottomNavigation.getLayoutParams();
        if (layoutParams.getBehavior() instanceof BottomNavigationBehavior) {
            BottomNavigationBehavior bottomNavigationBehavior = (BottomNavigationBehavior) layoutParams.getBehavior();
            BottomNavigationView bottomNavigationView = this.bottomNavigation;
            bottomNavigationBehavior.getClass();
            C19383o.m32797g(bottomNavigationView, "child");
            if (z) {
                if (bottomNavigationBehavior.f19969a) {
                    bottomNavigationBehavior.mo31236b(bottomNavigationView, BottomNavigationBehavior.ScrollDirection.DOWN);
                }
            } else if (!bottomNavigationBehavior.f19969a) {
                bottomNavigationBehavior.mo31236b(bottomNavigationView, BottomNavigationBehavior.ScrollDirection.UP);
            }
        }
    }

    public void showSearchFAB(C9113c0.C9114a aVar, String str) {
        if (this.searchFAB != null && getAnalyticsContext().mo21331a(C8617e.f18937f).f18927b) {
            this.searchFAB.setVisibility(0);
            if (aVar != null) {
                this.searchFAB.setOnClickListener(new C9078b(aVar));
            } else {
                this.searchFAB.setOnClickListener(new C9079c(str));
            }
            ((CoordinatorLayout.LayoutParams) this.searchFAB.getLayoutParams()).setBehavior(new SearchFABScrollBehavior(getResources()));
        }
    }

    public void showTransparentStatusBar(boolean z) {
        AppBarHelper appBarHelper = getAppBarHelper();
        if (z) {
            appBarHelper.changeStatusBarColor(0, this);
        } else {
            appBarHelper.resetStatusBarColor(this);
        }
    }

    public void setContentView(View view) {
        this.mNavContentView.addView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.mNavContentView.addView(view, layoutParams);
    }
}
