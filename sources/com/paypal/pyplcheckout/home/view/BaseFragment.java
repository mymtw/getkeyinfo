package com.paypal.pyplcheckout.home.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C2870k0;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.LifeCycleInfo;
import com.paypal.pyplcheckout.events.model.LifecycleName;
import com.paypal.pyplcheckout.flavornavigation.ContentRouter;
import com.paypal.pyplcheckout.home.view.activities.PYPLHomeActivity;
import com.paypal.pyplcheckout.home.view.customviews.alertview.AlertToast;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.ContainerViewTypeDescriptor;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.IContentPage;
import com.paypal.pyplcheckout.navigation.interfaces.Identifiable;
import com.paypal.pyplcheckout.p543di.SdkComponentKt;
import com.paypal.pyplcheckout.utils.CheckoutCrashLogger;
import com.paypal.pyplcheckout.utils.CrashLogger;
import com.paypal.pyplcheckout.viewmodels.CancelViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p753kq.C19846a;

public class BaseFragment extends Fragment implements Identifiable {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String TAG = "BaseFragment";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    /* access modifiers changed from: private */
    public CancelViewModel cancelViewModel;
    public Events events;
    private final C19846a<C19394m> onOutsidePaysheetClick = new BaseFragment$onOutsidePaysheetClick$1(this);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<BaseFragment> cls = BaseFragment.class;
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

    public final void addBreadcrumb(String str) {
        C19383o.m32797g(str, "text");
        CheckoutCrashLogger instance = CrashLogger.getInstance();
        if (instance != null) {
            instance.addBreadcrumb(str);
        }
    }

    public final void attachContentViewsToContainer(List<? extends ContentView> list, ViewGroup viewGroup) {
        C19383o.m32797g(list, "contentViewList");
        C19383o.m32797g(viewGroup, "container");
        for (ContentView view : list) {
            ViewParent viewParent = null;
            View view2 = view.getView((GenericViewData) null);
            if (view2 != null) {
                viewParent = view2.getParent();
            }
            if (viewParent != null) {
                ((ViewGroup) viewParent).removeAllViews();
            }
            viewGroup.removeView(view2);
            viewGroup.addView(view2);
        }
    }

    public final void finishFragment(String str, Fragment fragment) {
        C19383o.m32797g(str, "id");
        C19383o.m32797g(fragment, "fragment");
        ContentRouter.INSTANCE.finishFragment(str, fragment);
    }

    public final Events getEvents() {
        Events events2 = this.events;
        if (events2 != null) {
            return events2;
        }
        C19383o.m32805o("events");
        throw null;
    }

    public final C19846a<C19394m> getOnOutsidePaysheetClick() {
        return this.onOutsidePaysheetClick;
    }

    public String getViewId() {
        Class<BaseFragment> cls = BaseFragment.class;
        return "BaseFragment";
    }

    public final void hideKeyboard(View view) {
        C19383o.m32797g(view, "view");
        Context context = getContext();
        Object systemService = context == null ? null : context.getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getEvents().fire(PayPalEventTypes.NATIVE_CHECKOUT_PAY_SHEET_LIFE_CYCLE, new Success(new LifeCycleInfo(getViewId(), new LifecycleName(LifecycleName.State.ON_ACTIVITY_CREATED))));
        this.cancelViewModel = (CancelViewModel) new C2870k0(requireActivity()).mo10829a(CancelViewModel.class);
    }

    public void onAttach(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        super.onAttach(context);
        SdkComponentKt.inject(this);
        getEvents().fire(PayPalEventTypes.NATIVE_CHECKOUT_PAY_SHEET_LIFE_CYCLE, new Success(new LifeCycleInfo(getViewId(), new LifecycleName(LifecycleName.State.ON_ATTACH))));
        PLog.impression$default(PEnums.TransitionName.NXO_FRAGMENT_ATTACHED, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.NONE, getClass().getSimpleName(), (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 480, (Object) null);
        String simpleName = getClass().getSimpleName();
        addBreadcrumb(simpleName + " - lifecycle - onAttach");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getEvents().fire(PayPalEventTypes.NATIVE_CHECKOUT_PAY_SHEET_LIFE_CYCLE, new Success(new LifeCycleInfo(getViewId(), new LifecycleName(LifecycleName.State.ON_CREATE))));
        String simpleName = getClass().getSimpleName();
        addBreadcrumb(simpleName + " - lifecycle - onCreate");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        getEvents().fire(PayPalEventTypes.NATIVE_CHECKOUT_PAY_SHEET_LIFE_CYCLE, new Success(new LifeCycleInfo(getViewId(), new LifecycleName(LifecycleName.State.ON_CREATE_VIEW))));
        return onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        getEvents().fire(PayPalEventTypes.NATIVE_CHECKOUT_PAY_SHEET_LIFE_CYCLE, new Success(new LifeCycleInfo(getViewId(), new LifecycleName(LifecycleName.State.ON_DESTROY))));
        String simpleName = getClass().getSimpleName();
        addBreadcrumb(simpleName + " - lifecycle - onDestroy");
    }

    public void onDestroyView() {
        super.onDestroyView();
        getEvents().fire(PayPalEventTypes.NATIVE_CHECKOUT_PAY_SHEET_LIFE_CYCLE, new Success(new LifeCycleInfo(getViewId(), new LifecycleName(LifecycleName.State.ON_DESTROY_VIEW))));
        _$_clearFindViewByIdCache();
    }

    public void onDetach() {
        super.onDetach();
        getEvents().fire(PayPalEventTypes.NATIVE_CHECKOUT_PAY_SHEET_LIFE_CYCLE, new Success(new LifeCycleInfo(getViewId(), new LifecycleName(LifecycleName.State.ON_DETACH))));
        String simpleName = getClass().getSimpleName();
        addBreadcrumb(simpleName + " - lifecycle - onDetach");
    }

    public void onPause() {
        super.onPause();
        getEvents().fire(PayPalEventTypes.NATIVE_CHECKOUT_PAY_SHEET_LIFE_CYCLE, new Success(new LifeCycleInfo(getViewId(), new LifecycleName(LifecycleName.State.ON_PAUSE))));
        String simpleName = getClass().getSimpleName();
        addBreadcrumb(simpleName + " - lifecycle - onPause");
    }

    public void onResume() {
        super.onResume();
        getEvents().fire(PayPalEventTypes.NATIVE_CHECKOUT_PAY_SHEET_LIFE_CYCLE, new Success(new LifeCycleInfo(getViewId(), new LifecycleName(LifecycleName.State.ON_RESUME))));
        String simpleName = getClass().getSimpleName();
        addBreadcrumb(simpleName + " - lifecycle - onResume");
    }

    public void onStart() {
        super.onStart();
        getEvents().fire(PayPalEventTypes.NATIVE_CHECKOUT_PAY_SHEET_LIFE_CYCLE, new Success(new LifeCycleInfo(getViewId(), new LifecycleName(LifecycleName.State.ON_START))));
        String simpleName = getClass().getSimpleName();
        addBreadcrumb(simpleName + " - lifecycle - onStart");
        PLog.impression$default(PEnums.TransitionName.NXO_FRAGMENT_SHOWN, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.UTILS, getClass().getSimpleName(), (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 480, (Object) null);
    }

    public void onStop() {
        super.onStop();
        getEvents().fire(PayPalEventTypes.NATIVE_CHECKOUT_PAY_SHEET_LIFE_CYCLE, new Success(new LifeCycleInfo(getViewId(), new LifecycleName(LifecycleName.State.ON_STOP))));
        String simpleName = getClass().getSimpleName();
        addBreadcrumb(simpleName + " - lifecycle - onStop");
    }

    public final void setEvents(Events events2) {
        C19383o.m32797g(events2, "<set-?>");
        this.events = events2;
    }

    public final void showAlertToast(AlertToast alertToast) {
        C19383o.m32797g(alertToast, "alertToast");
        FragmentActivity activity = getActivity();
        PYPLHomeActivity pYPLHomeActivity = activity instanceof PYPLHomeActivity ? (PYPLHomeActivity) activity : null;
        if (pYPLHomeActivity != null) {
            pYPLHomeActivity.showAlertToast(alertToast);
        }
    }

    public final void showKeyboard(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        Object systemService = context.getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).toggleSoftInput(2, 0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    public final void startFragment(AppCompatActivity appCompatActivity, int i, Fragment fragment, String str) {
        C19383o.m32797g(appCompatActivity, "activity");
        C19383o.m32797g(fragment, "fragment");
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        C2740a aVar = new C2740a(supportFragmentManager);
        aVar.mo10532i(C17165R.anim.slide_in_up, C17165R.anim.slide_stay, 0, 0);
        aVar.mo10531h(i, fragment, (String) null);
        aVar.mo10529c(str);
        aVar.mo10483d();
    }

    public final void updateInflatedContentViewsToSpecificIndex(IContentPage iContentPage, List<ContentView> list, ContentView contentView, ViewGroup viewGroup, ContainerViewTypeDescriptor containerViewTypeDescriptor, int i) {
        C19383o.m32797g(iContentPage, "contentPage");
        C19383o.m32797g(list, "contentViewList");
        C19383o.m32797g(contentView, "contentView");
        C19383o.m32797g(viewGroup, "container");
        C19383o.m32797g(containerViewTypeDescriptor, "containerViewTypeDescriptor");
        list.add(contentView);
        if (containerViewTypeDescriptor.getContainerViewType() == ContainerViewTypeDescriptor.ViewType.HEADER) {
            iContentPage.removeViewsFromContainer(contentView, viewGroup);
            iContentPage.addViewsToContainer(contentView, viewGroup, i);
        } else if (containerViewTypeDescriptor.getContainerViewType() == ContainerViewTypeDescriptor.ViewType.BODY) {
            iContentPage.removeViewsFromContainer(contentView, viewGroup);
            iContentPage.addViewsToContainer(contentView, viewGroup, i);
        } else if (containerViewTypeDescriptor.getContainerViewType() == ContainerViewTypeDescriptor.ViewType.FOOTER) {
            iContentPage.removeViewsFromContainer(contentView, viewGroup);
            iContentPage.addViewsToContainer(contentView, viewGroup, i);
        }
    }

    public final void hideKeyboard() {
        View view = getView();
        if (view != null) {
            hideKeyboard(view);
        }
    }
}
