package com.etsy.android.p327ui.user;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.p327ui.C11795y;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.AddressListKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CurrencySelectKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.DarkModeKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.EtsyWebKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.LanguageSelectKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.NotificationSettingsKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.PhabletsKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.PrivacyKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.VespaDemoKey;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.C19387r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C19410j;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.C7091a;
import p356ge.C12788a;
import p370ie.C12943c;
import p410oa.C13143c;
import p440s9.C13366a;
import p456ua.C13461f;
import p759nq.C19920b;

/* renamed from: com.etsy.android.ui.user.SettingsFragment */
public final class SettingsFragment extends TrackingBaseFragment implements C9731e0.C9733b, C13366a {
    public static final /* synthetic */ C19410j<Object>[] $$delegatedProperties;
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final C7091a disposable = new C7091a();
    private final C19285c menuAdapter$delegate = C19350d.m32677b(new SettingsFragment$menuAdapter$2(this));
    public C13461f rxSchedulers;
    private final C19920b settingsList$delegate = C11795y.m19487a(this, R.id.settings_list);
    public C11518d0 settingsViewModel;
    private final C19920b signOutButton$delegate = C11795y.m19487a(this, R.id.sign_out_button);

    /* renamed from: com.etsy.android.ui.user.SettingsFragment$a */
    public /* synthetic */ class C11345a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25016a;

        static {
            int[] iArr = new int[SettingType.values().length];
            iArr[SettingType.SelectCurrency.ordinal()] = 1;
            iArr[SettingType.SelectLanguage.ordinal()] = 2;
            iArr[SettingType.Privacy.ordinal()] = 3;
            iArr[SettingType.ManageAddresses.ordinal()] = 4;
            iArr[SettingType.About.ordinal()] = 5;
            iArr[SettingType.Phablets.ordinal()] = 6;
            iArr[SettingType.DarkMode.ordinal()] = 7;
            iArr[SettingType.VespaDemo.ordinal()] = 8;
            iArr[SettingType.VespaExploreDemo.ordinal()] = 9;
            iArr[SettingType.CustomViewDemo.ordinal()] = 10;
            iArr[SettingType.PushNotifications.ordinal()] = 11;
            iArr[SettingType.PushNotificationFixer.ordinal()] = 12;
            f25016a = iArr;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SettingsFragment.class, "settingsList", "getSettingsList()Landroidx/recyclerview/widget/RecyclerView;", 0);
        C19387r rVar = C19386q.f43269a;
        rVar.getClass();
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(SettingsFragment.class, "signOutButton", "getSignOutButton()Landroid/widget/Button;", 0);
        rVar.getClass();
        $$delegatedProperties = new C19410j[]{propertyReference1Impl, propertyReference1Impl2};
    }

    private final C11491c0 getMenuAdapter() {
        return (C11491c0) this.menuAdapter$delegate.getValue();
    }

    private final RecyclerView getSettingsList() {
        return (RecyclerView) this.settingsList$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final Button getSignOutButton() {
        return (Button) this.signOutButton$delegate.getValue(this, $$delegatedProperties[1]);
    }

    /* access modifiers changed from: private */
    public final void onClick(C11489b0 b0Var) {
        switch (C11345a.f25016a[b0Var.f25344b.ordinal()]) {
            case 1:
                C12788a.m20424c(getActivity(), new CurrencySelectKey(C19421p.m32935c0(getActivity())));
                return;
            case 2:
                showLanguageSelect();
                return;
            case 3:
                C12788a.m20424c(getActivity(), new PrivacyKey(C19421p.m32935c0(getActivity())));
                return;
            case 4:
                getAnalyticsContext().mo21333d("manage_addresses_tapped", (Map<? extends AnalyticsProperty, Object>) null);
                C12788a.m20424c(getActivity(), new AddressListKey(C19421p.m32935c0(getActivity())));
                return;
            case 5:
                C12788a.m20424c(getActivity(), new EtsyWebKey(C19421p.m32935c0(getActivity()), 0, (String) null, (String) null, 12, (DefaultConstructorMarker) null));
                return;
            case 6:
                C12788a.m20424c(getActivity(), new PhabletsKey(C19421p.m32935c0(getActivity())));
                return;
            case 7:
                C12788a.m20424c(getActivity(), new DarkModeKey(C19421p.m32935c0(getActivity())));
                return;
            case 8:
                C12788a.m20424c(getActivity(), new VespaDemoKey(C19421p.m32935c0(getActivity()), (String) null, (Bundle) null, 6, (DefaultConstructorMarker) null));
                return;
            case 9:
                C12788a.m20424c(getActivity(), new VespaDemoKey(C19421p.m32935c0(getActivity()), "explore_demo_page", (Bundle) null, 4, (DefaultConstructorMarker) null));
                return;
            case 10:
                C12788a.m20424c(getActivity(), new C12943c(C19421p.m32935c0(getActivity())));
                return;
            case 11:
                C12788a.m20424c(getActivity(), new NotificationSettingsKey(C19421p.m32935c0(getActivity()), (Bundle) null, 2, (DefaultConstructorMarker) null));
                return;
            case 12:
                C13143c.m20811b(getActivity());
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m35054onViewCreated$lambda0(SettingsFragment settingsFragment, List list) {
        C19383o.m32797g(settingsFragment, "this$0");
        C11491c0 menuAdapter = settingsFragment.getMenuAdapter();
        C19383o.m32796f(list, "settingsItems");
        menuAdapter.getClass();
        menuAdapter.f25360c = list;
        settingsFragment.getMenuAdapter().notifyDataSetChanged();
    }

    private final void showLanguageSelect() {
        C12788a.m20424c(getActivity(), new LanguageSelectKey(C19421p.m32935c0(getActivity())));
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

    public int getFragmentTitle() {
        return R.string.settings;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C13461f getRxSchedulers() {
        C13461f fVar = this.rxSchedulers;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("rxSchedulers");
        throw null;
    }

    public final C11518d0 getSettingsViewModel() {
        C11518d0 d0Var = this.settingsViewModel;
        if (d0Var != null) {
            return d0Var;
        }
        C19383o.m32805o("settingsViewModel");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_settings, viewGroup, false);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.disposable.mo19405d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x01a9, code lost:
        if (p410oa.C13143c.m20810a(r12.f25410e.f28907a) != false) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x01ba, code lost:
        if (r12.f25409d.mo30207a() != false) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01bd, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01d2, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01d3, code lost:
        if (r4 == false) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01d5, code lost:
        r1.add(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            r11 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            super.onViewCreated(r12, r13)
            com.etsy.android.ui.user.d0 r13 = r11.getSettingsViewModel()
            q9.p r13 = r13.f25407b
            boolean r13 = r13.mo45960e()
            if (r13 == 0) goto L_0x0028
            android.widget.Button r13 = r11.getSignOutButton()
            com.etsy.android.extensions.ViewExtensions.m12869m(r13)
            android.widget.Button r13 = r11.getSignOutButton()
            com.etsy.android.ui.user.SettingsFragment$onViewCreated$1 r0 = new com.etsy.android.ui.user.SettingsFragment$onViewCreated$1
            r0.<init>(r11)
            com.etsy.android.extensions.ViewExtensions.m12866j(r13, r0)
            goto L_0x002f
        L_0x0028:
            android.widget.Button r13 = r11.getSignOutButton()
            com.etsy.android.extensions.ViewExtensions.m12860d(r13)
        L_0x002f:
            androidx.recyclerview.widget.RecyclerView r13 = r11.getSettingsList()
            com.etsy.android.ui.user.c0 r0 = r11.getMenuAdapter()
            r13.setAdapter(r0)
            androidx.recyclerview.widget.RecyclerView r13 = r11.getSettingsList()
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r12.getContext()
            r0.<init>()
            r13.setLayoutManager(r0)
            com.etsy.android.ui.user.d0 r12 = r11.getSettingsViewModel()
            io.reactivex.subjects.a<java.util.List<com.etsy.android.ui.user.b0>> r12 = r12.f25412g
            io.reactivex.internal.operators.observable.m r12 = androidx.compose.animation.C0472h.m1241b(r12, r12)
            ua.f r13 = r11.getRxSchedulers()
            r13.getClass()
            tp.r r13 = p456ua.C13461f.m21235b()
            io.reactivex.internal.operators.observable.ObservableSubscribeOn r12 = r12.mo20639i(r13)
            ua.f r13 = r11.getRxSchedulers()
            r13.getClass()
            tp.r r13 = p456ua.C13461f.m21236c()
            io.reactivex.internal.operators.observable.ObservableObserveOn r12 = r12.mo20635e(r13)
            n9.j r13 = new n9.j
            r0 = 7
            r13.<init>(r11, r0)
            io.reactivex.internal.observers.LambdaObserver r12 = r12.mo20637g(r13)
            io.reactivex.disposables.a r13 = r11.disposable
            java.lang.String r1 = "compositeDisposable"
            kotlin.jvm.internal.C19383o.m32798h(r13, r1)
            r13.mo19403b(r12)
            com.etsy.android.ui.user.d0 r12 = r11.getSettingsViewModel()
            io.reactivex.subjects.a<java.util.List<com.etsy.android.ui.user.b0>> r13 = r12.f25412g
            r1 = 12
            com.etsy.android.ui.user.b0[] r1 = new com.etsy.android.p327ui.user.C11489b0[r1]
            com.etsy.android.ui.user.SettingType r2 = com.etsy.android.p327ui.user.SettingType.SelectCurrency
            com.etsy.android.ui.user.b0 r3 = new com.etsy.android.ui.user.b0
            r4 = 2131953245(0x7f13065d, float:1.9542956E38)
            r5 = 0
            r6 = 60
            r3.<init>(r4, r2, r5, r6)
            r1[r5] = r3
            com.etsy.android.ui.user.SettingType r2 = com.etsy.android.p327ui.user.SettingType.SelectLanguage
            com.etsy.android.ui.user.b0 r3 = new com.etsy.android.ui.user.b0
            r4 = 2131953246(0x7f13065e, float:1.9542958E38)
            r3.<init>(r4, r2, r5, r6)
            r2 = 1
            r1[r2] = r3
            r3 = 2
            com.etsy.android.ui.user.SettingType r4 = com.etsy.android.p327ui.user.SettingType.Privacy
            com.etsy.android.ui.user.b0 r7 = new com.etsy.android.ui.user.b0
            r8 = 2131953249(0x7f130661, float:1.9542964E38)
            r7.<init>(r8, r4, r5, r6)
            r1[r3] = r7
            r3 = 3
            com.etsy.android.ui.user.SettingType r4 = com.etsy.android.p327ui.user.SettingType.ManageAddresses
            com.etsy.android.ui.user.b0 r7 = new com.etsy.android.ui.user.b0
            r8 = 2131952527(0x7f13038f, float:1.95415E38)
            r7.<init>(r8, r4, r5, r6)
            r1[r3] = r7
            r3 = 4
            com.etsy.android.ui.user.SettingType r4 = com.etsy.android.p327ui.user.SettingType.About
            com.etsy.android.ui.user.b0 r7 = new com.etsy.android.ui.user.b0
            r8 = 2131951651(0x7f130023, float:1.9539723E38)
            r7.<init>(r8, r4, r5, r6)
            r1[r3] = r7
            r3 = 5
            com.etsy.android.ui.user.SettingType r4 = com.etsy.android.p327ui.user.SettingType.Phablets
            com.etsy.android.ui.user.b0 r7 = new com.etsy.android.ui.user.b0
            r8 = 2131953226(0x7f13064a, float:1.9542917E38)
            r7.<init>(r8, r4, r5, r6)
            r1[r3] = r7
            r3 = 6
            com.etsy.android.ui.user.SettingType r4 = com.etsy.android.p327ui.user.SettingType.DarkMode
            com.etsy.android.ui.user.o r7 = r12.f25411f
            boolean r8 = kotlin.jvm.internal.C19382n.m32778w0()
            java.lang.String r9 = "dark_mode_preference"
            if (r8 == 0) goto L_0x00fc
            za.a r8 = r7.f25715a
            android.content.SharedPreferences r8 = r8.mo46761a()
            boolean r8 = r8.contains(r9)
            if (r8 != 0) goto L_0x00fc
            r7 = 2131952077(0x7f1301cd, float:1.9540587E38)
            goto L_0x010f
        L_0x00fc:
            za.a r7 = r7.f25715a
            android.content.SharedPreferences r7 = r7.mo46761a()
            boolean r7 = r7.getBoolean(r9, r5)
            if (r7 == 0) goto L_0x010c
            r7 = 2131952079(0x7f1301cf, float:1.954059E38)
            goto L_0x010f
        L_0x010c:
            r7 = 2131952078(0x7f1301ce, float:1.9540589E38)
        L_0x010f:
            com.etsy.android.ui.user.b0 r8 = new com.etsy.android.ui.user.b0
            r9 = 2131952074(0x7f1301ca, float:1.954058E38)
            r10 = 28
            r8.<init>(r9, r4, r7, r10)
            r1[r3] = r8
            com.etsy.android.ui.user.SettingType r3 = com.etsy.android.p327ui.user.SettingType.VespaDemo
            com.etsy.android.ui.user.b0 r4 = new com.etsy.android.ui.user.b0
            r7 = 2131953717(0x7f130835, float:1.9543913E38)
            r4.<init>(r7, r3, r5, r6)
            r1[r0] = r4
            r0 = 8
            com.etsy.android.ui.user.SettingType r3 = com.etsy.android.p327ui.user.SettingType.VespaExploreDemo
            com.etsy.android.ui.user.b0 r4 = new com.etsy.android.ui.user.b0
            r7 = 2131953718(0x7f130836, float:1.9543915E38)
            r4.<init>(r7, r3, r5, r6)
            r1[r0] = r4
            r0 = 9
            com.etsy.android.ui.user.SettingType r3 = com.etsy.android.p327ui.user.SettingType.CustomViewDemo
            com.etsy.android.ui.user.b0 r4 = new com.etsy.android.ui.user.b0
            r7 = 2131952073(0x7f1301c9, float:1.9540578E38)
            r4.<init>(r7, r3, r5, r6)
            r1[r0] = r4
            r0 = 10
            com.etsy.android.ui.user.SettingType r3 = com.etsy.android.p327ui.user.SettingType.PushNotifications
            com.etsy.android.ui.user.b0 r4 = new com.etsy.android.ui.user.b0
            r7 = 2131953277(0x7f13067d, float:1.954302E38)
            r4.<init>(r7, r3, r5, r6)
            r1[r0] = r4
            r0 = 11
            com.etsy.android.ui.user.SettingType r3 = com.etsy.android.p327ui.user.SettingType.PushNotificationFixer
            com.etsy.android.ui.user.b0 r4 = new com.etsy.android.ui.user.b0
            r7 = 2131952294(0x7f1302a6, float:1.9541027E38)
            r4.<init>(r7, r3, r5, r6)
            r1[r0] = r4
            java.util.List r0 = p568fn.C17782b.m29865e0(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x016c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x01d9
            java.lang.Object r3 = r0.next()
            r4 = r3
            com.etsy.android.ui.user.b0 r4 = (com.etsy.android.p327ui.user.C11489b0) r4
            java.lang.String r6 = "settingsItem"
            kotlin.jvm.internal.C19383o.m32797g(r4, r6)
            com.etsy.android.ui.user.SettingType r4 = r4.f25344b
            int[] r6 = com.etsy.android.p327ui.user.C11518d0.C11519a.f25414a
            int r4 = r4.ordinal()
            r4 = r6[r4]
            switch(r4) {
                case 1: goto L_0x01d2;
                case 2: goto L_0x01d2;
                case 3: goto L_0x01d2;
                case 4: goto L_0x01cb;
                case 5: goto L_0x01cb;
                case 6: goto L_0x01cb;
                case 7: goto L_0x01c6;
                case 8: goto L_0x01bf;
                case 9: goto L_0x01bf;
                case 10: goto L_0x01bf;
                case 11: goto L_0x01ac;
                case 12: goto L_0x0191;
                default: goto L_0x018b;
            }
        L_0x018b:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L_0x0191:
            q9.p r4 = r12.f25407b
            boolean r4 = r4.mo45960e()
            if (r4 == 0) goto L_0x01bd
            com.etsy.android.lib.push.registration.j r4 = r12.f25409d
            boolean r4 = r4.mo30207a()
            if (r4 != 0) goto L_0x01bd
            oa.d r4 = r12.f25410e
            android.content.Context r4 = r4.f28907a
            boolean r4 = p410oa.C13143c.m20810a(r4)
            if (r4 == 0) goto L_0x01bd
            goto L_0x01d2
        L_0x01ac:
            q9.p r4 = r12.f25407b
            boolean r4 = r4.mo45960e()
            if (r4 == 0) goto L_0x01bd
            com.etsy.android.lib.push.registration.j r4 = r12.f25409d
            boolean r4 = r4.mo30207a()
            if (r4 == 0) goto L_0x01bd
            goto L_0x01d2
        L_0x01bd:
            r4 = r5
            goto L_0x01d3
        L_0x01bf:
            com.etsy.android.lib.config.BuildTarget$a r4 = com.etsy.android.lib.config.BuildTarget.Companion
            boolean r4 = androidx.appcompat.widget.C0326j.m869n(r4)
            goto L_0x01d3
        L_0x01c6:
            com.etsy.android.lib.config.c r4 = r12.f25408c
            boolean r4 = r4.f18942b
            goto L_0x01d3
        L_0x01cb:
            q9.p r4 = r12.f25407b
            boolean r4 = r4.mo45960e()
            goto L_0x01d3
        L_0x01d2:
            r4 = r2
        L_0x01d3:
            if (r4 == 0) goto L_0x016c
            r1.add(r3)
            goto L_0x016c
        L_0x01d9:
            r13.onNext(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.SettingsFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void setRxSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.rxSchedulers = fVar;
    }

    public final void setSettingsViewModel(C11518d0 d0Var) {
        C19383o.m32797g(d0Var, "<set-?>");
        this.settingsViewModel = d0Var;
    }
}
