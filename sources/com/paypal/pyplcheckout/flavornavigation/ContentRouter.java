package com.paypal.pyplcheckout.flavornavigation;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addressbook.view.fragments.PYPLAddressBookFragment;
import com.paypal.pyplcheckout.addressbook.view.fragments.PYPLAddressRecommendationFragment;
import com.paypal.pyplcheckout.addressbook.view.fragments.PYPLNewShippingAddressFragment;
import com.paypal.pyplcheckout.addressbook.view.fragments.PYPLNewShippingAddressReviewFragment;
import com.paypal.pyplcheckout.animation.base.FragmentAnimation;
import com.paypal.pyplcheckout.auth.p541ui.NativeAuthParentFragment;
import com.paypal.pyplcheckout.auth.p541ui.NativeAuthScreen;
import com.paypal.pyplcheckout.billingagreements.view.fragment.PYPLBillingAgreementsTermsFragment;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.conversionrate.view.fragments.PYPLConversionRateFragment;
import com.paypal.pyplcheckout.conversionrateprotection.view.fragments.PYPLRateProtectionFragment;
import com.paypal.pyplcheckout.crypto.view.fragments.PYPLCryptoConsentFragment;
import com.paypal.pyplcheckout.home.view.BaseFragment;
import com.paypal.pyplcheckout.home.view.fragments.HomeFragment;
import com.paypal.pyplcheckout.info.view.PYPLTransactionDetailsFragment;
import com.paypal.pyplcheckout.navigation.interfaces.IContentRouter;
import com.paypal.pyplcheckout.shippingmethods.view.fragments.PYPLShippingMethodFragment;
import com.paypal.pyplcheckout.userprofile.view.fragments.PYPLUserProfileFragment;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;

public final class ContentRouter implements IContentRouter {
    public static final ContentRouter INSTANCE;
    private static final String TAG = "ContentRouter";
    private static WeakReference<AppCompatActivity> checkoutActivity;
    private static Fragment currentFragment = HomeFragment.Companion.newInstance();
    private static Map<String, Fragment> registeredFragmentMap = new LinkedHashMap();

    static {
        ContentRouter contentRouter = new ContentRouter();
        INSTANCE = contentRouter;
        contentRouter.initDefaultFragments();
    }

    private ContentRouter() {
    }

    private final Fragment getCurrentFragment(AppCompatActivity appCompatActivity) {
        try {
            FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
            C19383o.m32796f(supportFragmentManager, "activity.supportFragmentManager");
            FragmentManager.C2721i iVar = supportFragmentManager.f6134d.get(supportFragmentManager.mo10355E() - 1);
            C19383o.m32796f(iVar, "fragmentManager.getBackS…kEntryCount - 1\n        )");
            return supportFragmentManager.mo10353C(iVar.getName());
        } catch (Throwable th) {
            Throwable th2 = th;
            PLog.error$default(PEnums.ErrorType.WARNING, PEnums.EventCode.E000, C0048b.m163a(th2.getClass().getSimpleName(), ": ", th2.getMessage()), th2.getMessage(), th2, PEnums.TransitionName.CONTENT_ROUTER_GET_CURRENT_FRAGMENT, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1984, (Object) null);
            return null;
        }
    }

    private final void initDefaultFragments() {
        registeredFragmentMap.put(HomeFragment.TAG, HomeFragment.Companion.newInstance());
        registeredFragmentMap.put(PYPLUserProfileFragment.TAG, PYPLUserProfileFragment.Companion.newInstance());
        registeredFragmentMap.put(PYPLConversionRateFragment.TAG, PYPLConversionRateFragment.Companion.newInstance());
        registeredFragmentMap.put(PYPLRateProtectionFragment.TAG, PYPLRateProtectionFragment.Companion.newInstance());
        registeredFragmentMap.put(PYPLAddressBookFragment.TAG, PYPLAddressBookFragment.Companion.newInstance());
        registeredFragmentMap.put(PYPLShippingMethodFragment.TAG, PYPLShippingMethodFragment.Companion.newInstance());
        registeredFragmentMap.put(PYPLTransactionDetailsFragment.TAG, PYPLTransactionDetailsFragment.Companion.newInstance());
        registeredFragmentMap.put(PYPLNewShippingAddressFragment.TAG, PYPLNewShippingAddressFragment.Companion.newInstance());
        registeredFragmentMap.put(PYPLNewShippingAddressReviewFragment.TAG, PYPLNewShippingAddressReviewFragment.Companion.newInstance());
        registeredFragmentMap.put(PYPLCryptoConsentFragment.TAG, PYPLCryptoConsentFragment.Companion.newInstance());
        Map<String, Fragment> map = registeredFragmentMap;
        PYPLBillingAgreementsTermsFragment.Companion companion = PYPLBillingAgreementsTermsFragment.Companion;
        String tag = companion.getTAG();
        C19383o.m32796f(tag, "PYPLBillingAgreementsTermsFragment.TAG");
        map.put(tag, companion.newInstance());
        registeredFragmentMap.put(NativeAuthParentFragment.Companion.getTAG(), new NativeAuthParentFragment());
        registeredFragmentMap.put(PYPLAddressRecommendationFragment.TAG, PYPLAddressRecommendationFragment.Companion.newInstance());
    }

    private final boolean isValidFragmentId(String str) {
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        String str2 = TAG;
        C19383o.m32796f(str2, "TAG");
        PLog.eR$default(str2, "ThirdPartyContentRouter: The fragment id is invalid", (Exception) null, 4, (Object) null);
        return false;
    }

    private final void logBackButtonTap() {
        PLog.click$default(PEnums.TransitionName.SYSTEM_BACK_BUTTON_TAPPED, PEnums.Outcome.CLICKED, PEnums.EventCode.E639, (PEnums.StateName) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 496, (Object) null);
    }

    public void addFragment(String str, Fragment fragment) {
        C19383o.m32797g(str, "id");
        C19383o.m32797g(fragment, "fragment");
        String str2 = TAG;
        C19383o.m32796f(str2, "TAG");
        PLog.m28733eR(str2, "ThirdPartyContentRouter: Add operation is not supported for 3rd party integration", new Exception("ThirdPartyContentRouter: Add operation is not supported for 3rd party integration"));
        throw new UnsupportedOperationException("ThirdPartyContentRouter: Add operation is not supported for 3rd party integration");
    }

    public void clear() {
        currentFragment = null;
        setCheckoutActivity((WeakReference<AppCompatActivity>) null);
        registeredFragmentMap.clear();
    }

    public final void closeNativeAuthFlow$pyplcheckout_externalThreedsRelease(AppCompatActivity appCompatActivity) {
        C19383o.m32797g(appCompatActivity, "activity");
        if (getCurrentFragment(appCompatActivity) instanceof NativeAuthParentFragment) {
            Map<String, Fragment> map = registeredFragmentMap;
            NativeAuthParentFragment.Companion companion = NativeAuthParentFragment.Companion;
            if (map.containsKey(companion.getTAG())) {
                PLog.transition$default(PEnums.TransitionName.LOGIN_SCREEN_CANCEL_CLICKED, PEnums.Outcome.CLOSE_BUTTON, PEnums.EventCode.E101, PEnums.StateName.PAYLOAD_SENT, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16368, (Object) null);
                String tag = companion.getTAG();
                Fragment fragment = registeredFragmentMap.get(companion.getTAG());
                if (fragment != null) {
                    finishFragment(tag, (NativeAuthParentFragment) fragment);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.paypal.pyplcheckout.auth.ui.NativeAuthParentFragment");
            }
        }
    }

    public final void dismissNativeAuthFragment$pyplcheckout_externalThreedsRelease(AppCompatActivity appCompatActivity, Fragment fragment, boolean z) {
        C19383o.m32797g(appCompatActivity, "activity");
        if (getCurrentFragment(appCompatActivity) instanceof NativeAuthParentFragment) {
            Map<String, Fragment> map = registeredFragmentMap;
            NativeAuthParentFragment.Companion companion = NativeAuthParentFragment.Companion;
            Fragment fragment2 = map.get(companion.getTAG());
            if (fragment2 != null) {
                NativeAuthParentFragment nativeAuthParentFragment = (NativeAuthParentFragment) fragment2;
                if (z) {
                    finishFragment(companion.getTAG(), nativeAuthParentFragment);
                } else if (fragment != null) {
                    nativeAuthParentFragment.removeChildAuthFragment(fragment);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.paypal.pyplcheckout.auth.ui.NativeAuthParentFragment");
            }
        }
    }

    public boolean doesFragmentExistOrNull(String str, Fragment fragment) {
        C19383o.m32797g(str, "id");
        C19383o.m32797g(fragment, "fragment");
        if (isValidFragmentId(str) || !registeredFragmentMap.containsKey(str)) {
            return false;
        }
        String str2 = TAG;
        C19383o.m32796f(str2, "TAG");
        String format = String.format("ThirdPartyContentRouter: A fragment with id %s has already been added or registered please change the id or call update.", Arrays.copyOf(new Object[]{str}, 1));
        C19383o.m32796f(format, "format(format, *args)");
        PLog.eR$default(str2, format, (Exception) null, 4, (Object) null);
        return true;
    }

    public boolean doesFragmentNotExistOrNull(String str, Fragment fragment) {
        C19383o.m32797g(str, "id");
        if (isValidFragmentId(str) || registeredFragmentMap.containsKey(str)) {
            return false;
        }
        String str2 = TAG;
        C19383o.m32796f(str2, "TAG");
        String format = String.format("ThirdPartyContentRouter: A fragment with id %s has not been added or registered please change the id or call register for new fragment.", Arrays.copyOf(new Object[]{str}, 1));
        C19383o.m32796f(format, "format(format, *args)");
        PLog.eR$default(str2, format, (Exception) null, 4, (Object) null);
        return true;
    }

    public void finishActivityAndShowPaySheet(AppCompatActivity appCompatActivity) {
        C19383o.m32797g(appCompatActivity, "activity");
        String str = TAG;
        C19383o.m32796f(str, "TAG");
        PLog.m28733eR(str, "ThirdPartyContentRouter: Finish activity and show pay sheet operation is not supported for 3rd party integration", new Exception("ThirdPartyContentRouter: Finish activity and show pay sheet operation is not supported for 3rd party integration"));
        throw new UnsupportedOperationException("ThirdPartyContentRouter: Finish activity and show pay sheet operation is not supported for 3rd party integration");
    }

    public void finishFragment(String str, Fragment fragment) {
        C19383o.m32797g(str, "id");
        C19383o.m32797g(fragment, "fragment");
        if (!doesFragmentNotExistOrNull(str, fragment)) {
            String str2 = TAG;
            C19383o.m32796f(str2, "TAG");
            String format = String.format("ThirdPartyContentRouter: A fragment with id %s has been finished.", Arrays.copyOf(new Object[]{str}, 1));
            C19383o.m32796f(format, "format(format, *args)");
            PLog.d$default(str2, format, 0, 4, (Object) null);
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            C19383o.m32796f(parentFragmentManager, "fragment.parentFragmentManager");
            if (parentFragmentManager.mo10355E() > 0) {
                parentFragmentManager.mo10402v(new FragmentManager.C2727o(str, -1, 1), false);
            }
        }
    }

    public WeakReference<AppCompatActivity> getCheckoutActivity() {
        return checkoutActivity;
    }

    public Fragment getFragment(String str) {
        C19383o.m32797g(str, "id");
        if (doesFragmentNotExistOrNull(str, new BaseFragment())) {
            return null;
        }
        String str2 = TAG;
        C19383o.m32796f(str2, "TAG");
        String format = String.format("ThirdPartyContentRouter: A fragment with id %s has been retrieved.", Arrays.copyOf(new Object[]{str}, 1));
        C19383o.m32796f(format, "format(format, *args)");
        PLog.d$default(str2, format, 0, 4, (Object) null);
        return registeredFragmentMap.get(str);
    }

    public void gotoFragment(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "id");
        if (!doesFragmentNotExistOrNull(str, currentFragment)) {
            String str2 = TAG;
            C19383o.m32796f(str2, "TAG");
            String format = String.format("ThirdPartyContentRouter: A fragment with id %s has been started.", Arrays.copyOf(new Object[]{str}, 1));
            C19383o.m32796f(format, "format(format, *args)");
            PLog.d$default(str2, format, 0, 4, (Object) null);
            if (registeredFragmentMap.isEmpty()) {
                initDefaultFragments();
            }
            currentFragment = registeredFragmentMap.get(str);
            AppCompatActivity appCompatActivity = (AppCompatActivity) context;
            int i = C17165R.C17167id.bottom_sheet_container;
            Fragment fragment = registeredFragmentMap.get(str);
            if (fragment != null) {
                startFragment(appCompatActivity, i, fragment, str);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
        }
    }

    public final void loadNativeAuthFragment$pyplcheckout_externalThreedsRelease(AppCompatActivity appCompatActivity, NativeAuthScreen nativeAuthScreen) {
        C19383o.m32797g(appCompatActivity, "activity");
        C19383o.m32797g(nativeAuthScreen, "nativeAuthScreen");
        Map<String, Fragment> map = registeredFragmentMap;
        NativeAuthParentFragment.Companion companion = NativeAuthParentFragment.Companion;
        Fragment fragment = map.get(companion.getTAG());
        if (fragment != null) {
            NativeAuthParentFragment nativeAuthParentFragment = (NativeAuthParentFragment) fragment;
            if (!(getCurrentFragment(appCompatActivity) instanceof NativeAuthParentFragment)) {
                gotoFragment(appCompatActivity, companion.getTAG());
                nativeAuthParentFragment.setChildFragmentToLoad(nativeAuthScreen);
                return;
            }
            nativeAuthParentFragment.loadChildAuthFragment(nativeAuthScreen);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.pyplcheckout.auth.ui.NativeAuthParentFragment");
    }

    public final void navigateBackInAuthFlow$pyplcheckout_externalThreedsRelease() {
        PLog.transition$default(PEnums.TransitionName.LOGIN_SCREEN_BACK_BUTTON_CLICKED, PEnums.Outcome.BACK_BUTTON, PEnums.EventCode.E101, PEnums.StateName.PAYLOAD_SENT, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16368, (Object) null);
        Map<String, Fragment> map = registeredFragmentMap;
        NativeAuthParentFragment.Companion companion = NativeAuthParentFragment.Companion;
        Fragment fragment = map.get(companion.getTAG());
        if (fragment != null) {
            NativeAuthParentFragment nativeAuthParentFragment = (NativeAuthParentFragment) fragment;
            if (nativeAuthParentFragment.getFragmentCount() <= 1) {
                finishFragment(companion.getTAG(), nativeAuthParentFragment);
                return;
            }
            nativeAuthParentFragment.onBackPressed();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.pyplcheckout.auth.ui.NativeAuthParentFragment");
    }

    public boolean onBackPressed(AppCompatActivity appCompatActivity) {
        C19383o.m32797g(appCompatActivity, "activity");
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        C19383o.m32796f(supportFragmentManager, "activity.supportFragmentManager");
        logBackButtonTap();
        List<Fragment> H = supportFragmentManager.mo10358H();
        C19383o.m32796f(H, "fragmentManager.fragments");
        Fragment fragment = (Fragment) C19327t.m32640V0(H);
        if (fragment == null || supportFragmentManager.mo10355E() <= 1) {
            return false;
        }
        if (fragment instanceof NativeAuthParentFragment) {
            INSTANCE.navigateBackInAuthFlow$pyplcheckout_externalThreedsRelease();
        } else {
            INSTANCE.finishFragment(fragment.getClass().getSimpleName(), fragment);
        }
        return true;
    }

    public void removeFragment(String str) {
        C19383o.m32797g(str, "id");
        String str2 = TAG;
        C19383o.m32796f(str2, "TAG");
        PLog.m28733eR(str2, "ThirdPartyContentRouter: Remove operation is not supported for 3rd party integration", new Exception("ThirdPartyContentRouter: Remove operation is not supported for 3rd party integration"));
        throw new UnsupportedOperationException("ThirdPartyContentRouter: Remove operation is not supported for 3rd party integration");
    }

    public void reset() {
        String str = TAG;
        C19383o.m32796f(str, "TAG");
        PLog.m28733eR(str, "ThirdPartyContentRouter: Reset operation is not supported for 3rd party integration", new Exception("ThirdPartyContentRouter: Reset operation is not supported for 3rd party integration"));
        throw new UnsupportedOperationException("ThirdPartyContentRouter: Reset operation is not supported for 3rd party integration");
    }

    public void setCheckoutActivity(WeakReference<AppCompatActivity> weakReference) {
        checkoutActivity = weakReference;
    }

    public void setUpFragmentAnimation(FragmentAnimation fragmentAnimation) {
        C19383o.m32797g(fragmentAnimation, ResponseConstants.ANIMATION);
        String str = TAG;
        C19383o.m32796f(str, "TAG");
        PLog.m28733eR(str, "ThirdPartyContentRouter: Set up fragment animation operation is not supported for 3rd party integration", new Exception("ThirdPartyContentRouter: Set up fragment animation operation is not supported for 3rd party integration"));
        throw new UnsupportedOperationException("ThirdPartyContentRouter: Set up fragment animation operation is not supported for 3rd party integration");
    }

    public void showCurrentFragment(AppCompatActivity appCompatActivity) {
        C19383o.m32797g(appCompatActivity, "activity");
        String str = TAG;
        C19383o.m32796f(str, "TAG");
        PLog.m28733eR(str, "ThirdPartyContentRouter: Show current fragment operation is not supported for 3rd party integration", new Exception("ThirdPartyContentRouter: Show current fragment operation is not supported for 3rd party integration"));
        throw new UnsupportedOperationException("ThirdPartyContentRouter: Show current fragment operation is not supported for 3rd party integration");
    }

    public void startActivityAndHidePaySheet(AppCompatActivity appCompatActivity, Intent intent) {
        C19383o.m32797g(appCompatActivity, "activity");
        C19383o.m32797g(intent, "intent");
        String str = TAG;
        C19383o.m32796f(str, "TAG");
        PLog.m28733eR(str, "ThirdPartyContentRouter: Start activity and hide pay sheet  operation is not supported for 3rd party integration", new Exception("ThirdPartyContentRouter: Start activity and hide pay sheet  operation is not supported for 3rd party integration"));
        throw new UnsupportedOperationException("ThirdPartyContentRouter: Start activity and hide pay sheet  operation is not supported for 3rd party integration");
    }

    public void startFragment(AppCompatActivity appCompatActivity, int i, Fragment fragment, String str) {
        C19383o.m32797g(appCompatActivity, "activity");
        C19383o.m32797g(fragment, "fragment");
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        C2740a aVar = new C2740a(supportFragmentManager);
        aVar.mo10532i(C17165R.anim.slide_in_up, C17165R.anim.slide_stay, 0, 0);
        aVar.mo10531h(i, fragment, str);
        aVar.mo10529c(str);
        aVar.mo10483d();
    }

    public void updateFragment(String str, Fragment fragment) {
        C19383o.m32797g(str, "id");
        C19383o.m32797g(fragment, "fragment");
        String str2 = TAG;
        C19383o.m32796f(str2, "TAG");
        PLog.m28733eR(str2, "ThirdPartyContentRouter: Update operation is not supported for 3rd party integration", new Exception("ThirdPartyContentRouter: Update operation is not supported for 3rd party integration"));
        throw new UnsupportedOperationException("ThirdPartyContentRouter: Update operation is not supported for 3rd party integration");
    }
}
