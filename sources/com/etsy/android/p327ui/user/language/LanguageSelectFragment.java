package com.etsy.android.p327ui.user.language;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import com.etsy.android.R;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.logger.PlatformAnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.conversation.details.legacy.C9543c;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HomePagerKey;
import com.etsy.android.p327ui.user.language.C11597d;
import com.etsy.android.p327ui.user.language.C11606h;
import com.etsy.android.stylekit.views.C9056g;
import com.etsy.android.uikit.BaseRecyclerViewListFragment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import kotlin.text.C19457k;
import p001a0.C0005b;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.C19254a;
import p356ge.C12788a;
import p359ha.C12799a;
import p370ie.C12941a;
import p440s9.C13366a;
import p456ua.C13461f;
import p486y9.C13888d;
import p486y9.C13890f;

/* renamed from: com.etsy.android.ui.user.language.LanguageSelectFragment */
public final class LanguageSelectFragment extends BaseRecyclerViewListFragment<C11609i> implements C13366a, C9731e0.C9733b {
    public static final int $stable = 8;
    public static final C11592a Companion = new C11592a();
    private static final String MATCH_DEVICE_DEFAULT_ID = "match_device_default";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final C7091a disposable = new C7091a();
    public C13461f rxSchedulers;
    public C11605g viewModel;
    public C8656o viewModelFactory;

    /* renamed from: com.etsy.android.ui.user.language.LanguageSelectFragment$a */
    public static final class C11592a {
    }

    private final void applyLanguage(String str, C11609i iVar) {
        List<T> items = this.adapter.getItems();
        C19383o.m32796f(items, "adapter.items");
        for (T t : items) {
            t.f25709f = C19383o.m32792b(t, iVar);
        }
        this.adapter.notifyDataSetChanged();
        trackEvent("set_language_preference", str, iVar);
        C11605g viewModel2 = getViewModel();
        viewModel2.getClass();
        C19383o.m32797g(iVar, "selectedLanguage");
        C11606h hVar = iVar.f25708e;
        boolean z = true;
        if (hVar instanceof C11606h.C11608b) {
            Application application = viewModel2.f25694b;
            String str2 = iVar.f25704a;
            C19383o.m32797g(application, ResponseConstants.CONTEXT);
            SharedPreferences sharedPreferences = C0005b.f9g;
            if (sharedPreferences == null) {
                sharedPreferences = application.getSharedPreferences("EtsyUserPrefs", 0);
                C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…ODE_PRIVATE\n            )");
                C0005b.f9g = sharedPreferences;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            C19383o.m32796f(edit, "editor");
            edit.putString("preferred_language_id", str2);
            edit.putBoolean("match_device_locale", false);
            edit.apply();
        } else if (hVar instanceof C11606h.C11607a) {
            Application application2 = viewModel2.f25694b;
            C19383o.m32797g(application2, ResponseConstants.CONTEXT);
            SharedPreferences sharedPreferences2 = C0005b.f9g;
            if (sharedPreferences2 == null) {
                sharedPreferences2 = application2.getSharedPreferences("EtsyUserPrefs", 0);
                C19383o.m32796f(sharedPreferences2, "context.getSharedPrefere…ODE_PRIVATE\n            )");
                C0005b.f9g = sharedPreferences2;
            }
            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
            C19383o.m32796f(edit2, "editor");
            edit2.putBoolean("match_device_locale", true);
            edit2.putString("preferred_language_id", (String) null);
            edit2.apply();
        }
        String str3 = iVar.f25705b;
        if (str3 != null) {
            C13888d dVar = viewModel2.f25696d;
            Locale forLanguageTag = Locale.forLanguageTag(str3);
            C19383o.m32796f(forLanguageTag, "forLanguageTag(selectedLanguage.languageTag)");
            dVar.getClass();
            C13890f fVar = dVar.f30556b;
            Context context = dVar.f30555a;
            fVar.getClass();
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            Locale.Builder locale = new Locale.Builder().setLocale(forLanguageTag);
            String country = forLanguageTag.getCountry();
            C19383o.m32796f(country, "locale.country");
            if (country.length() != 0) {
                z = false;
            }
            if (z) {
                locale.setRegion(fVar.f30559a.mo46712a().getCountry());
            }
            Locale.setDefault(forLanguageTag);
            Locale build = locale.build();
            C19383o.m32796f(build, "localeBuilder.build()");
            SharedPreferences sharedPreferences3 = C0005b.f9g;
            if (sharedPreferences3 == null) {
                sharedPreferences3 = context.getSharedPreferences("EtsyUserPrefs", 0);
                C19383o.m32796f(sharedPreferences3, "context.getSharedPrefere…ODE_PRIVATE\n            )");
                C0005b.f9g = sharedPreferences3;
            }
            SharedPreferences.Editor edit3 = sharedPreferences3.edit();
            C19383o.m32796f(edit3, "editor");
            edit3.putString("preferred_language", build.toLanguageTag());
            edit3.apply();
            C12799a aVar = viewModel2.f25698f;
            C13888d dVar2 = viewModel2.f25696d;
            aVar.getClass();
            C19383o.m32797g(dVar2, "currentLocale");
            aVar.f28272a.mo58990a("language_ep", dVar2.mo46717a());
        }
        viewModel2.f25699g.onNext(C11597d.C11600c.f25688a);
    }

    private final C11609i getDeviceDefaultLanguage() {
        boolean z;
        Locale deviceLocale = getDeviceLocale();
        String language = deviceLocale.getLanguage();
        String string = getString(R.string.match_device_default);
        C11606h.C11607a aVar = C11606h.C11607a.f25702a;
        String country = deviceLocale.getCountry();
        Iterator<T> it = getViewModel().f25701i.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C11609i iVar = (C11609i) it.next();
            String language2 = deviceLocale.getLanguage();
            String str = null;
            String language3 = language2 != null ? Locale.forLanguageTag(language2).getLanguage() : null;
            String str2 = iVar.f25705b;
            if (str2 != null) {
                str = Locale.forLanguageTag(str2).getLanguage();
            }
            if (C19457k.m33019W0(language3, str, true)) {
                z = true;
                break;
            }
        }
        return new C11609i(MATCH_DEVICE_DEFAULT_ID, language, country, string, aVar, z, 32);
    }

    private final Locale getDeviceLocale() {
        Locale locale = Resources.getSystem().getConfiguration().locale;
        C19383o.m32796f(locale, "getSystem().configuration.locale");
        return locale;
    }

    private final String getLanguageName(C11609i iVar) {
        C11606h hVar = iVar.f25708e;
        if (hVar instanceof C11606h.C11607a) {
            String displayLanguage = getDeviceLocale().getDisplayLanguage(getDeviceLocale());
            C19383o.m32796f(displayLanguage, "getDeviceLocale().getDis…nguage(getDeviceLocale())");
            return displayLanguage;
        } else if (hVar instanceof C11606h.C11608b) {
            return String.valueOf(iVar.f25707d);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void initViewStates() {
        C19254a<C11597d> aVar = getViewModel().f25699g;
        LambdaObserver f = SubscribersKt.m32501f(C0472h.m1241b(aVar, aVar), new LanguageSelectFragment$initViewStates$1(LogCatKt.m17045a()), new LanguageSelectFragment$initViewStates$2(this), 2);
        C7091a aVar2 = this.disposable;
        C19383o.m32798h(aVar2, "compositeDisposable");
        aVar2.mo19403b(f);
    }

    /* access modifiers changed from: private */
    public final void onLanguageSelected(C11609i iVar) {
        String str;
        T t;
        this.adapter.removeHeader(1);
        trackEvent("language_tapped", getViewModel().f25696d.mo46717a(), iVar);
        if (iVar.f25710g) {
            String languageName = getLanguageName(iVar);
            C11605g viewModel2 = getViewModel();
            Iterator<T> it = viewModel2.f25701i.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C11609i) t).f25709f) {
                    break;
                }
            }
            C11609i iVar2 = (C11609i) t;
            if (iVar2 != null) {
                str = iVar2.f25707d;
            }
            if (str == null) {
                str = viewModel2.f25696d.mo46718b().getDisplayLanguage().toString();
            }
            showConfirmationDialog(str, languageName, iVar);
            return;
        }
        showUnsupportedHeader();
    }

    private final void showConfirmationDialog(String str, String str2, C11609i iVar) {
        String string = getString(R.string.confirm_language_message, str, str2);
        C19383o.m32796f(string, "getString(\n            R…tedLanguageName\n        )");
        Context requireContext = requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        C9056g gVar = new C9056g(requireContext);
        gVar.mo70029r(R.string.confirm_language_title);
        gVar.f286a.f264f = string;
        gVar.setPositiveButton(R.string.okay, new C11604f(this, iVar)).setNegativeButton(R.string.cancel, new C9543c(1)).create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: showConfirmationDialog$lambda-0  reason: not valid java name */
    public static final void m35064showConfirmationDialog$lambda0(LanguageSelectFragment languageSelectFragment, C11609i iVar, DialogInterface dialogInterface, int i) {
        C19383o.m32797g(languageSelectFragment, "this$0");
        C19383o.m32797g(iVar, "$selectedLanguage");
        C19383o.m32797g(dialogInterface, "dialog");
        dialogInterface.dismiss();
        languageSelectFragment.applyLanguage(languageSelectFragment.getViewModel().f25696d.mo46717a(), iVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: showConfirmationDialog$lambda-1  reason: not valid java name */
    public static final void m35065showConfirmationDialog$lambda1(DialogInterface dialogInterface, int i) {
        C19383o.m32797g(dialogInterface, "dialog");
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    public final void showLanguages(List<C11609i> list) {
        this.adapter.clear();
        this.adapter.addItemAtPosition(0, getDeviceDefaultLanguage());
        this.adapter.addItems(list);
        showListView();
        if (getViewModel().mo37639c() && !getDeviceDefaultLanguage().f25710g) {
            showUnsupportedHeader();
        }
    }

    private final void showUnsupportedHeader() {
        this.adapter.addHeader(1);
        this.recyclerView.smoothScrollToPosition(0);
    }

    /* access modifiers changed from: private */
    public final void toHome() {
        C12788a.m20424c(getActivity(), new C12941a(C19421p.m32935c0(getActivity()), (FragmentNavigationKey) new HomePagerKey(C19421p.m32935c0(getActivity()), (Bundle) null, true, 2, (DefaultConstructorMarker) null), true, 4));
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.recreate();
        }
    }

    private final void trackEvent(String str, String str2, C11609i iVar) {
        getAnalyticsContext().mo21333d(str, C19294b0.m32562s0(new Pair(PredefinedAnalyticsProperty.LANGUAGE_ID, iVar.f25704a), new Pair(PredefinedAnalyticsProperty.LANGUAGE, iVar.f25705b), new Pair(PlatformAnalyticsProperty.REGION, iVar.f25706c), new Pair(PredefinedAnalyticsProperty.LANGUAGE_NAME, iVar.f25707d), new Pair(PredefinedAnalyticsProperty.PREVIOUS_LANGUAGE, str2)));
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
        return R.string.prefs_language_title;
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

    public String getTrackingName() {
        return "view_language_preferences";
    }

    public final C11605g getViewModel() {
        C11605g gVar = this.viewModel;
        if (gVar != null) {
            return gVar;
        }
        C19383o.m32805o("viewModel");
        throw null;
    }

    public final C8656o getViewModelFactory() {
        C8656o oVar = this.viewModelFactory;
        if (oVar != null) {
            return oVar;
        }
        C19383o.m32805o("viewModelFactory");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        this.adapter = new C11593a(requireActivity, new LanguageSelectFragment$onCreate$languageAdapter$1(this), new LanguageSelectFragment$onCreate$languageAdapter$2(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19383o.m32796f(onCreateView, "super.onCreateView(infla…iner, savedInstanceState)");
        setViewModel((C11605g) new C2870k0((C2880m0) this, (C2870k0.C2872b) getViewModelFactory()).mo10829a(C11605g.class));
        this.swipeRefreshLayout.setEnabled(false);
        this.emptyText.setText(getString(R.string.prefs_languages_empty));
        return onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.disposable.mo19405d();
    }

    public void onLoadContent() {
        String country = Resources.getSystem().getConfiguration().locale.getCountry();
        C11605g viewModel2 = getViewModel();
        C19383o.m32796f(country, "regionCode");
        viewModel2.getClass();
        viewModel2.f25699g.onNext(C11597d.C11601d.f25689a);
        ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(viewModel2.f25697e, C0072d.m199f(viewModel2.f25697e, viewModel2.f25695c.f25691a.mo37633a())), new LanguageSelectViewModel$loadContent$1(viewModel2), new LanguageSelectViewModel$loadContent$2(viewModel2, country));
        C7091a aVar = viewModel2.f25700h;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(e);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        loadContent();
        initViewStates();
    }

    public final void setRxSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.rxSchedulers = fVar;
    }

    public final void setViewModel(C11605g gVar) {
        C19383o.m32797g(gVar, "<set-?>");
        this.viewModel = gVar;
    }

    public final void setViewModelFactory(C8656o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.viewModelFactory = oVar;
    }
}
