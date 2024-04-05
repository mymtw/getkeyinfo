package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2878l0;
import androidx.navigation.C2955e;
import androidx.navigation.C2969k;
import androidx.navigation.C2989o;
import androidx.navigation.C2990p;
import androidx.navigation.C2992q;
import androidx.navigation.NavController;
import androidx.navigation.fragment.C2961a;
import com.etsy.android.R;
import kotlin.jvm.internal.C19388s;
import kotlin.reflect.C19421p;
import p003a2.C0015b;

public class NavHostFragment extends Fragment {
    private static final String KEY_DEFAULT_NAV_HOST = "android-support-nav:fragment:defaultHost";
    private static final String KEY_GRAPH_ID = "android-support-nav:fragment:graphId";
    private static final String KEY_NAV_CONTROLLER_STATE = "android-support-nav:fragment:navControllerState";
    private static final String KEY_START_DESTINATION_ARGS = "android-support-nav:fragment:startDestinationArgs";
    private boolean mDefaultNavHost;
    private int mGraphId;
    private Boolean mIsPrimaryBeforeOnCreate = null;
    private C2969k mNavController;
    private View mViewParent;

    public static NavHostFragment create(int i) {
        return create(i, (Bundle) null);
    }

    public static NavController findNavController(Fragment fragment) {
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getParentFragment()) {
            if (fragment2 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment2).getNavController();
            }
            Fragment fragment3 = fragment2.getParentFragmentManager().f6150t;
            if (fragment3 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment3).getNavController();
            }
        }
        View view = fragment.getView();
        if (view != null) {
            return C2989o.m6995a(view);
        }
        Dialog dialog = fragment instanceof DialogFragment ? ((DialogFragment) fragment).getDialog() : null;
        if (dialog != null && dialog.getWindow() != null) {
            return C2989o.m6995a(dialog.getWindow().getDecorView());
        }
        throw new IllegalStateException(C0015b.m89h("Fragment ", fragment, " does not have a NavController set"));
    }

    private int getContainerId() {
        int id = getId();
        return (id == 0 || id == -1) ? R.id.nav_host_fragment_container : id;
    }

    @Deprecated
    public C2990p<? extends C2961a.C2962a> createFragmentNavigator() {
        return new C2961a(requireContext(), getChildFragmentManager(), getContainerId());
    }

    public final NavController getNavController() {
        C2969k kVar = this.mNavController;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.mDefaultNavHost) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            C2740a aVar = new C2740a(parentFragmentManager);
            aVar.mo10492p(this);
            aVar.mo10483d();
        }
    }

    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        C2992q qVar = this.mNavController.f6673k;
        qVar.getClass();
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) qVar.mo10998c(C2992q.m7001b(DialogFragmentNavigator.class));
        if (dialogFragmentNavigator.f6715d.remove(fragment.getTag())) {
            fragment.getLifecycle().mo10733a(dialogFragmentNavigator.f6716e);
        }
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        Class cls = C2955e.class;
        C2969k kVar = new C2969k(requireContext());
        this.mNavController = kVar;
        if (this != kVar.f6671i) {
            kVar.f6671i = this;
            getLifecycle().mo10733a(kVar.f6675m);
        }
        C2969k kVar2 = this.mNavController;
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        if (kVar2.f6671i != null) {
            kVar2.f6676n.mo1125b();
            onBackPressedDispatcher.mo1104a(kVar2.f6671i, kVar2.f6676n);
            kVar2.f6671i.getLifecycle().mo10735c(kVar2.f6675m);
            kVar2.f6671i.getLifecycle().mo10733a(kVar2.f6675m);
            C2969k kVar3 = this.mNavController;
            Boolean bool = this.mIsPrimaryBeforeOnCreate;
            int i = 0;
            kVar3.f6677o = bool != null && bool.booleanValue();
            kVar3.mo10949i();
            Bundle bundle3 = null;
            this.mIsPrimaryBeforeOnCreate = null;
            C2969k kVar4 = this.mNavController;
            C2878l0 viewModelStore = getViewModelStore();
            C2955e eVar = kVar4.f6672j;
            C2955e.C2956a aVar = C2955e.f6699c;
            if (eVar != ((C2955e) new C2870k0(viewModelStore, (C2870k0.C2872b) aVar).mo10829a(cls))) {
                if (kVar4.f6670h.isEmpty()) {
                    kVar4.f6672j = (C2955e) new C2870k0(viewModelStore, (C2870k0.C2872b) aVar).mo10829a(cls);
                } else {
                    throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                }
            }
            onCreateNavController(this.mNavController);
            if (bundle != null) {
                bundle2 = bundle.getBundle(KEY_NAV_CONTROLLER_STATE);
                if (bundle.getBoolean(KEY_DEFAULT_NAV_HOST, false)) {
                    this.mDefaultNavHost = true;
                    FragmentManager parentFragmentManager = getParentFragmentManager();
                    parentFragmentManager.getClass();
                    C2740a aVar2 = new C2740a(parentFragmentManager);
                    aVar2.mo10492p(this);
                    aVar2.mo10483d();
                }
                this.mGraphId = bundle.getInt(KEY_GRAPH_ID);
            } else {
                bundle2 = null;
            }
            if (bundle2 != null) {
                C2969k kVar5 = this.mNavController;
                bundle2.setClassLoader(kVar5.f6663a.getClassLoader());
                kVar5.f6667e = bundle2.getBundle("android-support-nav:controller:navigatorState");
                kVar5.f6668f = bundle2.getParcelableArray("android-support-nav:controller:backStack");
                kVar5.f6669g = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled");
            }
            int i2 = this.mGraphId;
            if (i2 != 0) {
                this.mNavController.mo10948h(i2, (Bundle) null);
            } else {
                Bundle arguments = getArguments();
                if (arguments != null) {
                    i = arguments.getInt(KEY_GRAPH_ID);
                }
                if (arguments != null) {
                    bundle3 = arguments.getBundle(KEY_START_DESTINATION_ARGS);
                }
                if (i != 0) {
                    this.mNavController.mo10948h(i, bundle3);
                }
            }
            super.onCreate(bundle);
            return;
        }
        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
    }

    public void onCreateNavController(NavController navController) {
        navController.f6673k.mo10997a(new DialogFragmentNavigator(requireContext(), getChildFragmentManager()));
        navController.f6673k.mo10997a(createFragmentNavigator());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView.setId(getContainerId());
        return fragmentContainerView;
    }

    public void onDestroyView() {
        super.onDestroyView();
        View view = this.mViewParent;
        if (view != null && C2989o.m6995a(view) == this.mNavController) {
            this.mViewParent.setTag(R.id.nav_controller_view_tag, (Object) null);
        }
        this.mViewParent = null;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19388s.f43273d);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.mGraphId = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C19421p.f43314d);
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.mDefaultNavHost = true;
        }
        obtainStyledAttributes2.recycle();
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
        C2969k kVar = this.mNavController;
        if (kVar != null) {
            kVar.f6677o = z;
            kVar.mo10949i();
            return;
        }
        this.mIsPrimaryBeforeOnCreate = Boolean.valueOf(z);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle g = this.mNavController.mo10947g();
        if (g != null) {
            bundle.putBundle(KEY_NAV_CONTROLLER_STATE, g);
        }
        if (this.mDefaultNavHost) {
            bundle.putBoolean(KEY_DEFAULT_NAV_HOST, true);
        }
        int i = this.mGraphId;
        if (i != 0) {
            bundle.putInt(KEY_GRAPH_ID, i);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (view instanceof ViewGroup) {
            view.setTag(R.id.nav_controller_view_tag, this.mNavController);
            if (view.getParent() != null) {
                View view2 = (View) view.getParent();
                this.mViewParent = view2;
                if (view2.getId() == getId()) {
                    this.mViewParent.setTag(R.id.nav_controller_view_tag, this.mNavController);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
    }

    public static NavHostFragment create(int i, Bundle bundle) {
        Bundle bundle2;
        if (i != 0) {
            bundle2 = new Bundle();
            bundle2.putInt(KEY_GRAPH_ID, i);
        } else {
            bundle2 = null;
        }
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBundle(KEY_START_DESTINATION_ARGS, bundle);
        }
        NavHostFragment navHostFragment = new NavHostFragment();
        if (bundle2 != null) {
            navHostFragment.setArguments(bundle2);
        }
        return navHostFragment;
    }
}
