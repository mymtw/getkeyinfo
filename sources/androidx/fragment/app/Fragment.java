package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.C0118a;
import androidx.activity.result.C0120c;
import androidx.activity.result.C0123f;
import androidx.activity.result.C0126g;
import androidx.activity.result.IntentSenderRequest;
import androidx.appcompat.widget.C0326j;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.lifecycle.C2861g0;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2878l0;
import androidx.lifecycle.C2880m0;
import androidx.lifecycle.C2881n;
import androidx.lifecycle.C2885q;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.C2888t;
import androidx.lifecycle.C2895z;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.savedstate.C3265b;
import androidx.savedstate.C3268c;
import androidx.savedstate.C3269d;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.etsy.android.R;
import com.etsy.android.lib.conversation.MessageDraft;
import com.google.android.play.core.assetpacks.C15588c1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p003a2.C0015b;
import p010a9.C0048b;
import p019b.C3443a;
import p146j.C7096a;
import p230s1.C7796a;
import p230s1.C7798b;
import p250u0.C8077a;
import p250u0.C8112w;
import p260v0.C8184a;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, C2887s, C2880m0, C2881n, C3269d {
    public static final int ACTIVITY_CREATED = 4;
    public static final int ATTACHED = 0;
    public static final int AWAITING_ENTER_EFFECTS = 6;
    public static final int AWAITING_EXIT_EFFECTS = 3;
    public static final int CREATED = 1;
    public static final int INITIALIZING = -1;
    public static final int RESUMED = 7;
    public static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public C2708i mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mBeingSaved;
    private boolean mCalled;
    public FragmentManager mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    private int mContentLayoutId;
    public C2870k0.C2872b mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public FragmentManager mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public C2782r<?> mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public C2888t mLifecycleRegistry;
    public Lifecycle.State mMaxState;
    public boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<C2709j> mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public Runnable mPostponedDurationRunnable;
    public String mPreviousWho;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public C3268c mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    public C2771k0 mViewLifecycleOwner;
    public C2895z<C2887s> mViewLifecycleOwnerLiveData;
    public String mWho;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$a */
    public class C2700a implements Runnable {
        public C2700a() {
        }

        public final void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    public class C2701b implements Runnable {
        public C2701b() {
        }

        public final void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    public class C2702c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ SpecialEffectsController f6089b;

        public C2702c(SpecialEffectsController specialEffectsController) {
            this.f6089b = specialEffectsController;
        }

        public final void run() {
            this.f6089b.mo10470c();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    public class C2703d extends C2779o {
        public C2703d() {
        }

        /* renamed from: b */
        public final View mo10129b(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            StringBuilder h = C0072d.m201h("Fragment ");
            h.append(Fragment.this);
            h.append(" does not have a view");
            throw new IllegalStateException(h.toString());
        }

        /* renamed from: c */
        public final boolean mo10130c() {
            return Fragment.this.mView != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    public class C2704e implements C7096a<Void, C0123f> {
        public C2704e() {
        }

        public final Object apply(Object obj) {
            Void voidR = (Void) obj;
            Fragment fragment = Fragment.this;
            C2782r<?> rVar = fragment.mHost;
            return rVar instanceof C0126g ? ((C0126g) rVar).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    public class C2705f implements C7096a<Void, C0123f> {

        /* renamed from: b */
        public final /* synthetic */ C0123f f6092b;

        public C2705f(C0123f fVar) {
            this.f6092b = fVar;
        }

        public final Object apply(Object obj) {
            Void voidR = (Void) obj;
            return this.f6092b;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$g */
    public class C2706g extends C2709j {

        /* renamed from: a */
        public final /* synthetic */ C7096a f6093a;

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f6094b;

        /* renamed from: c */
        public final /* synthetic */ C3443a f6095c;

        /* renamed from: d */
        public final /* synthetic */ C0118a f6096d;

        public C2706g(C7096a aVar, AtomicReference atomicReference, C3443a aVar2, C0118a aVar3) {
            this.f6093a = aVar;
            this.f6094b = atomicReference;
            this.f6095c = aVar2;
            this.f6096d = aVar3;
        }

        /* renamed from: a */
        public final void mo10300a() {
            this.f6094b.set(((C0123f) this.f6093a.apply(null)).mo1160c(Fragment.this.generateActivityResultKey(), Fragment.this, this.f6095c, this.f6096d));
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$h */
    public class C2707h extends C0120c<I> {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f6098a;

        /* renamed from: b */
        public final /* synthetic */ C3443a f6099b;

        public C2707h(AtomicReference atomicReference, C3443a aVar) {
            this.f6098a = atomicReference;
            this.f6099b = aVar;
        }

        /* renamed from: a */
        public final C3443a<I, ?> mo1156a() {
            return this.f6099b;
        }

        /* renamed from: b */
        public final void mo1157b(Object obj) {
            C0120c cVar = (C0120c) this.f6098a.get();
            if (cVar != null) {
                cVar.mo1157b(obj);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        /* renamed from: c */
        public final void mo1158c() {
            C0120c cVar = (C0120c) this.f6098a.getAndSet((Object) null);
            if (cVar != null) {
                cVar.mo1158c();
            }
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$i */
    public static class C2708i {

        /* renamed from: a */
        public boolean f6100a;

        /* renamed from: b */
        public int f6101b;

        /* renamed from: c */
        public int f6102c;

        /* renamed from: d */
        public int f6103d;

        /* renamed from: e */
        public int f6104e;

        /* renamed from: f */
        public int f6105f;

        /* renamed from: g */
        public ArrayList<String> f6106g;

        /* renamed from: h */
        public ArrayList<String> f6107h;

        /* renamed from: i */
        public Object f6108i = null;

        /* renamed from: j */
        public Object f6109j;

        /* renamed from: k */
        public Object f6110k;

        /* renamed from: l */
        public Object f6111l;

        /* renamed from: m */
        public Object f6112m;

        /* renamed from: n */
        public Object f6113n;

        /* renamed from: o */
        public Boolean f6114o;

        /* renamed from: p */
        public Boolean f6115p;

        /* renamed from: q */
        public float f6116q;

        /* renamed from: r */
        public View f6117r;

        /* renamed from: s */
        public boolean f6118s;

        public C2708i() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f6109j = obj;
            this.f6110k = null;
            this.f6111l = obj;
            this.f6112m = null;
            this.f6113n = obj;
            this.f6116q = 1.0f;
            this.f6117r = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$j */
    public static abstract class C2709j {
        /* renamed from: a */
        public abstract void mo10300a();
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C2796v();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new C2700a();
        this.mMaxState = Lifecycle.State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new C2895z<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        initLifecycle();
    }

    private C2708i ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C2708i();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        Lifecycle.State state = this.mMaxState;
        return (state == Lifecycle.State.INITIALIZED || this.mParentFragment == null) ? state.ordinal() : Math.min(state.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C2888t(this, true);
        this.mSavedStateRegistryController = new C3268c(this);
        this.mDefaultFactory = null;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, (Bundle) null);
    }

    private <I, O> C0120c<I> prepareCallInternal(C3443a<I, O> aVar, C7096a<Void, C0123f> aVar2, C0118a<O> aVar3) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new C2706g(aVar2, atomicReference, aVar, aVar3));
            return new C2707h(atomicReference, aVar);
        }
        throw new IllegalStateException(C0015b.m89h("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    private void registerOnPreAttachListener(C2709j jVar) {
        if (this.mState >= 0) {
            jVar.mo10300a();
        } else {
            this.mOnPreAttachedListeners.add(jVar);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        C2708i iVar = this.mAnimationInfo;
        if (iVar != null) {
            iVar.f6118s = false;
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && (fragmentManager = this.mFragmentManager) != null) {
            SpecialEffectsController g = SpecialEffectsController.m6549g(viewGroup, fragmentManager.mo10359I());
            g.mo10473h();
            if (z) {
                this.mHost.f6335d.post(new C2702c(g));
            } else {
                g.mo10470c();
            }
        }
    }

    public C2779o createFragmentContainer() {
        return new C2703d();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            C7796a.m15058a(this).mo20341b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + MessageDraft.IMAGE_DELIMITER);
        this.mChildFragmentManager.mo10401u(C0326j.m864i(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f6133c.mo10520c(str);
    }

    public String generateActivityResultKey() {
        StringBuilder h = C0072d.m201h("fragment_");
        h.append(this.mWho);
        h.append("_rq#");
        h.append(this.mNextLocalRequestCode.getAndIncrement());
        return h.toString();
    }

    public final FragmentActivity getActivity() {
        C2782r<?> rVar = this.mHost;
        if (rVar == null) {
            return null;
        }
        return (FragmentActivity) rVar.f6333b;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C2708i iVar = this.mAnimationInfo;
        if (iVar == null || (bool = iVar.f6115p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C2708i iVar = this.mAnimationInfo;
        if (iVar == null || (bool = iVar.f6114o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        C2708i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        iVar.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(C0015b.m89h("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        C2782r<?> rVar = this.mHost;
        if (rVar == null) {
            return null;
        }
        return rVar.f6334c;
    }

    public C2870k0.C2872b getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Application application = null;
                Context context = requireContext().getApplicationContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Application) {
                        application = (Application) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (application == null && FragmentManager.m6465J(3)) {
                    StringBuilder h = C0072d.m201h("Could not find Application instance from Context ");
                    h.append(requireContext().getApplicationContext());
                    h.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                    Log.d("FragmentManager", h.toString());
                }
                this.mDefaultFactory = new C2861g0(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public int getEnterAnim() {
        C2708i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f6101b;
    }

    public Object getEnterTransition() {
        C2708i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f6108i;
    }

    public C8112w getEnterTransitionCallback() {
        C2708i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        iVar.getClass();
        return null;
    }

    public int getExitAnim() {
        C2708i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f6102c;
    }

    public Object getExitTransition() {
        C2708i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f6110k;
    }

    public C8112w getExitTransitionCallback() {
        C2708i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        iVar.getClass();
        return null;
    }

    public View getFocusedView() {
        C2708i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f6117r;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        C2782r<?> rVar = this.mHost;
        if (rVar == null) {
            return null;
        }
        return rVar.mo10330d();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater((Bundle) null) : layoutInflater;
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public C7796a getLoaderManager() {
        return C7796a.m15058a(this);
    }

    public int getNextTransition() {
        C2708i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f6105f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException(C0015b.m89h("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        C2708i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.f6100a;
    }

    public int getPopEnterAnim() {
        C2708i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f6103d;
    }

    public int getPopExitAnim() {
        C2708i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f6104e;
    }

    public float getPostOnViewCreatedAlpha() {
        C2708i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 1.0f;
        }
        return iVar.f6116q;
    }

    public Object getReenterTransition() {
        C2708i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f6111l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        FragmentStrictMode.C2785b bVar = FragmentStrictMode.f6339a;
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(this);
        FragmentStrictMode.m6674c(getRetainInstanceUsageViolation);
        FragmentStrictMode.C2785b a = FragmentStrictMode.m6672a(this);
        if (a.f6341a.contains(FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE) && FragmentStrictMode.m6677f(a, getClass(), GetRetainInstanceUsageViolation.class)) {
            FragmentStrictMode.m6673b(a, getRetainInstanceUsageViolation);
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        C2708i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f6109j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    public final C3265b getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f7591b;
    }

    public Object getSharedElementEnterTransition() {
        C2708i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f6112m;
    }

    public Object getSharedElementReturnTransition() {
        C2708i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f6113n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f6106g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.String> getSharedElementSourceNames() {
        /*
            r1 = this;
            androidx.fragment.app.Fragment$i r0 = r1.mAnimationInfo
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList<java.lang.String> r0 = r0.f6106g
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.getSharedElementSourceNames():java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f6107h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.String> getSharedElementTargetNames() {
        /*
            r1 = this;
            androidx.fragment.app.Fragment$i r0 = r1.mAnimationInfo
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList<java.lang.String> r0 = r0.f6107h
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.getSharedElementTargetNames():java.util.ArrayList");
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        FragmentStrictMode.C2785b bVar = FragmentStrictMode.f6339a;
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(this);
        FragmentStrictMode.m6674c(getTargetFragmentRequestCodeUsageViolation);
        FragmentStrictMode.C2785b a = FragmentStrictMode.m6672a(this);
        if (a.f6341a.contains(FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE) && FragmentStrictMode.m6677f(a, getClass(), GetTargetFragmentRequestCodeUsageViolation.class)) {
            FragmentStrictMode.m6673b(a, getTargetFragmentRequestCodeUsageViolation);
        }
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public C2887s getViewLifecycleOwner() {
        C2771k0 k0Var = this.mViewLifecycleOwner;
        if (k0Var != null) {
            return k0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<C2887s> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public C2878l0 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (getMinimumMaxLifecycleState() != Lifecycle.State.INITIALIZED.ordinal()) {
            C2797w wVar = this.mFragmentManager.f6129J;
            C2878l0 l0Var = wVar.f6354d.get(this.mWho);
            if (l0Var != null) {
                return l0Var;
            }
            C2878l0 l0Var2 = new C2878l0();
            wVar.f6354d.put(this.mWho, l0Var2);
            return l0Var2;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C2796v();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (!this.mHidden) {
            FragmentManager fragmentManager = this.mFragmentManager;
            if (fragmentManager == null) {
                return false;
            }
            Fragment fragment = this.mParentFragment;
            fragmentManager.getClass();
            return fragment == null ? false : fragment.isHidden();
        }
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (this.mMenuVisible) {
            if (this.mFragmentManager == null) {
                return true;
            }
            Fragment fragment = this.mParentFragment;
            if (fragment == null ? true : fragment.isMenuVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isPostponed() {
        C2708i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.f6118s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.mo10360M();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.mView;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isVisible() {
        /*
            r1 = this;
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.isHidden()
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L_0x0020
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x0020
            android.view.View r0 = r1.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.isVisible():boolean");
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.mo10362O();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (FragmentManager.m6465J(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void onAttach(Context context) {
        Activity activity;
        this.mCalled = true;
        C2782r<?> rVar = this.mHost;
        if (rVar == null) {
            activity = null;
        } else {
            activity = rVar.f6333b;
        }
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (!(fragmentManager.f6146p >= 1)) {
            fragmentManager.f6122C = false;
            fragmentManager.f6123D = false;
            fragmentManager.f6129J.f6357g = false;
            fragmentManager.mo10399t(1);
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        Activity activity;
        this.mCalled = true;
        C2782r<?> rVar = this.mHost;
        if (rVar == null) {
            activity = null;
        } else {
            activity = rVar.f6333b;
        }
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.mo10362O();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.f6122C = false;
            fragmentManager.f6123D = false;
            fragmentManager.f6129J.f6357g = false;
            fragmentManager.mo10399t(4);
            return;
        }
        throw new SuperNotCalledException(C0015b.m89h("Fragment ", this, " did not call through to super.onActivityCreated()"));
    }

    public void performAttach() {
        Iterator<C2709j> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo10300a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.mo10376b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f6334c);
        if (this.mCalled) {
            Iterator<C2799x> it2 = this.mFragmentManager.f6145o.iterator();
            while (it2.hasNext()) {
                it2.next().mo10329a(this);
            }
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.f6122C = false;
            fragmentManager.f6123D = false;
            fragmentManager.f6129J.f6357g = false;
            fragmentManager.mo10399t(0);
            return;
        }
        throw new SuperNotCalledException(C0015b.m89h("Fragment ", this, " did not call through to super.onAttach()"));
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.mo10387h(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.mo10388i(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.mo10362O();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo10733a(new C2885q() {
            public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
                View view;
                if (event == Lifecycle.Event.ON_STOP && (view = Fragment.this.mView) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
        this.mSavedStateRegistryController.mo12063a(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.mo10837f(Lifecycle.Event.ON_CREATE);
            return;
        }
        throw new SuperNotCalledException(C0015b.m89h("Fragment ", this, " did not call through to super.onCreate()"));
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z | this.mChildFragmentManager.mo10389j(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.mo10362O();
        boolean z = true;
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C2771k0(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.mo10577b();
            C15588c1.m25297O0(this.mView, this.mViewLifecycleOwner);
            this.mView.setTag(R.id.view_tree_view_model_store_owner, this.mViewLifecycleOwner);
            ViewTreeSavedStateRegistryOwner.m7917b(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
            return;
        }
        if (this.mViewLifecycleOwner.f6318e == null) {
            z = false;
        }
        if (!z) {
            this.mViewLifecycleOwner = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public void performDestroy() {
        this.mChildFragmentManager.mo10390k();
        this.mLifecycleRegistry.mo10837f(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0015b.m89h("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.mo10399t(1);
        if (this.mView != null) {
            C2771k0 k0Var = this.mViewLifecycleOwner;
            k0Var.mo10577b();
            if (k0Var.f6318e.f6517c.isAtLeast(Lifecycle.State.CREATED)) {
                this.mViewLifecycleOwner.mo10576a(Lifecycle.Event.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            C7798b.C7801c cVar = C7796a.m15058a(this).f17238b;
            int i = cVar.f17248b.mo19995i();
            for (int i2 = 0; i2 < i; i2++) {
                cVar.f17248b.mo19996j(i2).mo20343a();
            }
            this.mPerformedCreateView = false;
            return;
        }
        throw new SuperNotCalledException(C0015b.m89h("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            FragmentManager fragmentManager = this.mChildFragmentManager;
            if (!fragmentManager.f6124E) {
                fragmentManager.mo10390k();
                this.mChildFragmentManager = new C2796v();
                return;
            }
            return;
        }
        throw new SuperNotCalledException(C0015b.m89h("Fragment ", this, " did not call through to super.onDetach()"));
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.mo10391l();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.mo10392m(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (!this.mHasMenu || !this.mMenuVisible || !onOptionsItemSelected(menuItem)) {
            return this.mChildFragmentManager.mo10394o(menuItem);
        }
        return true;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.mo10395p(menu);
        }
    }

    public void performPause() {
        this.mChildFragmentManager.mo10399t(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo10576a(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.mo10837f(Lifecycle.Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0015b.m89h("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.mo10397r(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        return z | this.mChildFragmentManager.mo10398s(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean L = FragmentManager.m6467L(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != L) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(L);
            onPrimaryNavigationFragmentChanged(L);
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.mo10385f0();
            fragmentManager.mo10396q(fragmentManager.f6150t);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.mo10362O();
        this.mChildFragmentManager.mo10404x(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            C2888t tVar = this.mLifecycleRegistry;
            Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
            tVar.mo10837f(event);
            if (this.mView != null) {
                this.mViewLifecycleOwner.mo10576a(event);
            }
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.f6122C = false;
            fragmentManager.f6123D = false;
            fragmentManager.f6129J.f6357g = false;
            fragmentManager.mo10399t(7);
            return;
        }
        throw new SuperNotCalledException(C0015b.m89h("Fragment ", this, " did not call through to super.onResume()"));
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.mo12064b(bundle);
        Parcelable W = this.mChildFragmentManager.mo10370W();
        if (W != null) {
            bundle.putParcelable("android:support:fragments", W);
        }
    }

    public void performStart() {
        this.mChildFragmentManager.mo10362O();
        this.mChildFragmentManager.mo10404x(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            C2888t tVar = this.mLifecycleRegistry;
            Lifecycle.Event event = Lifecycle.Event.ON_START;
            tVar.mo10837f(event);
            if (this.mView != null) {
                this.mViewLifecycleOwner.mo10576a(event);
            }
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.f6122C = false;
            fragmentManager.f6123D = false;
            fragmentManager.f6129J.f6357g = false;
            fragmentManager.mo10399t(5);
            return;
        }
        throw new SuperNotCalledException(C0015b.m89h("Fragment ", this, " did not call through to super.onStart()"));
    }

    public void performStop() {
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f6123D = true;
        fragmentManager.f6129J.f6357g = true;
        fragmentManager.mo10399t(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo10576a(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.mo10837f(Lifecycle.Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0015b.m89h("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.mo10399t(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f6118s = true;
    }

    public final <I, O> C0120c<I> registerForActivityResult(C3443a<I, O> aVar, C0118a<O> aVar2) {
        return prepareCallInternal(aVar, new C2704e(), aVar2);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost != null) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.f6156z != null) {
                parentFragmentManager.f6120A.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i));
                parentFragmentManager.f6156z.mo1157b(strArr);
                return;
            }
            parentFragmentManager.f6147q.getClass();
            return;
        }
        throw new IllegalStateException(C0015b.m89h("Fragment ", this, " not attached to Activity"));
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(C0015b.m89h("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(C0015b.m89h("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(C0015b.m89h("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(C0015b.m89h("Fragment ", this, " not attached to a host."));
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(C0015b.m89h("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(C0015b.m89h("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.mChildFragmentManager.mo10369V(parcelable);
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.f6122C = false;
            fragmentManager.f6123D = false;
            fragmentManager.f6129J.f6357g = false;
            fragmentManager.mo10399t(1);
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            C2771k0 k0Var = this.mViewLifecycleOwner;
            k0Var.f6319f.mo12063a(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0015b.m89h("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.mo10576a(Lifecycle.Event.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f6115p = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f6114o = Boolean.valueOf(z);
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            ensureAnimationInfo().f6101b = i;
            ensureAnimationInfo().f6102c = i2;
            ensureAnimationInfo().f6103d = i3;
            ensureAnimationInfo().f6104e = i4;
        }
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void setEnterSharedElementCallback(C8112w wVar) {
        ensureAnimationInfo().getClass();
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f6108i = obj;
    }

    public void setExitSharedElementCallback(C8112w wVar) {
        ensureAnimationInfo().getClass();
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f6110k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f6117r = view;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.mo10333g();
            }
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (savedState == null || (bundle = savedState.mState) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo10333g();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo();
            this.mAnimationInfo.f6105f = i;
        }
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo != null) {
            ensureAnimationInfo().f6100a = z;
        }
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().f6116q = f;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f6111l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        FragmentStrictMode.C2785b bVar = FragmentStrictMode.f6339a;
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(this);
        FragmentStrictMode.m6674c(setRetainInstanceUsageViolation);
        FragmentStrictMode.C2785b a = FragmentStrictMode.m6672a(this);
        if (a.f6341a.contains(FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE) && FragmentStrictMode.m6677f(a, getClass(), SetRetainInstanceUsageViolation.class)) {
            FragmentStrictMode.m6673b(a, setRetainInstanceUsageViolation);
        }
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.f6129J.mo10616b(this);
        } else {
            fragmentManager.f6129J.mo10619e(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f6109j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f6112m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        C2708i iVar = this.mAnimationInfo;
        iVar.f6106g = arrayList;
        iVar.f6107h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f6113n = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i) {
        if (fragment != null) {
            FragmentStrictMode.C2785b bVar = FragmentStrictMode.f6339a;
            SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(this, fragment, i);
            FragmentStrictMode.m6674c(setTargetFragmentUsageViolation);
            FragmentStrictMode.C2785b a = FragmentStrictMode.m6672a(this);
            if (a.f6341a.contains(FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE) && FragmentStrictMode.m6677f(a, getClass(), SetTargetFragmentUsageViolation.class)) {
                FragmentStrictMode.m6673b(a, setTargetFragmentUsageViolation);
            }
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager == null || fragmentManager2 == null || fragmentManager == fragmentManager2) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (!fragment2.equals(this)) {
                    fragment2 = fragment2.getTargetFragment(false);
                } else {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (fragment == null) {
                this.mTargetWho = null;
                this.mTarget = null;
            } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
            } else {
                this.mTargetWho = fragment.mWho;
                this.mTarget = null;
            }
            this.mTargetRequestCode = i;
            return;
        }
        throw new IllegalArgumentException(C0015b.m89h("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        FragmentStrictMode.C2785b bVar = FragmentStrictMode.f6339a;
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(this, z);
        FragmentStrictMode.m6674c(setUserVisibleHintViolation);
        FragmentStrictMode.C2785b a = FragmentStrictMode.m6672a(this);
        if (a.f6341a.contains(FragmentStrictMode.Flag.DETECT_SET_USER_VISIBLE_HINT) && FragmentStrictMode.m6677f(a, getClass(), SetUserVisibleHintViolation.class)) {
            FragmentStrictMode.m6673b(a, setUserVisibleHintViolation);
        }
        boolean z2 = true;
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            C2741a0 f = fragmentManager.mo10384f(this);
            Fragment fragment = f.f6223c;
            if (fragment.mDeferStart) {
                if (fragmentManager.f6132b) {
                    fragmentManager.f6125F = true;
                } else {
                    fragment.mDeferStart = false;
                    f.mo10504k();
                }
            }
        }
        this.mUserVisibleHint = z;
        if (this.mState >= 5 || z) {
            z2 = false;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        C2782r<?> rVar = this.mHost;
        if (rVar != null) {
            return rVar.mo10332f(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, (Bundle) null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityForResult(intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        int i5 = i;
        Bundle bundle2 = bundle;
        if (this.mHost != null) {
            if (FragmentManager.m6465J(2)) {
                toString();
                Objects.toString(intentSender);
                Objects.toString(intent);
                Objects.toString(bundle);
            }
            FragmentManager parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.f6155y != null) {
                if (bundle2 != null) {
                    if (intent == null) {
                        intent2 = new Intent();
                        intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                    } else {
                        intent2 = intent;
                    }
                    if (FragmentManager.m6465J(2)) {
                        bundle.toString();
                        intent2.toString();
                        Objects.toString(this);
                    }
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle2);
                } else {
                    intent2 = intent;
                }
                IntentSender intentSender2 = intentSender;
                int i6 = i2;
                int i7 = i3;
                IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, intent2, i2, i3);
                parentFragmentManager.f6120A.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i));
                if (FragmentManager.m6465J(2)) {
                    toString();
                }
                parentFragmentManager.f6155y.mo1157b(intentSenderRequest);
                return;
            }
            IntentSender intentSender3 = intentSender;
            int i8 = i2;
            int i9 = i3;
            C2782r<?> rVar = parentFragmentManager.f6147q;
            if (i5 == -1) {
                Activity activity = rVar.f6333b;
                int i10 = C8077a.f17593c;
                activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
                return;
            }
            rVar.getClass();
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException(C0015b.m89h("Fragment ", this, " not attached to Activity"));
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && ensureAnimationInfo().f6118s) {
            if (this.mHost == null) {
                ensureAnimationInfo().f6118s = false;
            } else if (Looper.myLooper() != this.mHost.f6335d.getLooper()) {
                this.mHost.f6335d.postAtFrontOfQueue(new C2701b());
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2699a();
        public final Bundle mState;

        /* renamed from: androidx.fragment.app.Fragment$SavedState$a */
        public class C2699a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Bundle bundle) {
            this.mState = bundle;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.mState);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.mState = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }
    }

    private Fragment getTargetFragment(boolean z) {
        String str;
        if (z) {
            FragmentStrictMode.C2785b bVar = FragmentStrictMode.f6339a;
            GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(this);
            FragmentStrictMode.m6674c(getTargetFragmentUsageViolation);
            FragmentStrictMode.C2785b a = FragmentStrictMode.m6672a(this);
            if (a.f6341a.contains(FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE) && FragmentStrictMode.m6677f(a, getClass(), GetTargetFragmentUsageViolation.class)) {
                FragmentStrictMode.m6673b(a, getTargetFragmentUsageViolation);
            }
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.mo10351A(str);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C2781q.m6663c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            throw new InstantiationException(C0048b.m163a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (IllegalAccessException e2) {
            throw new InstantiationException(C0048b.m163a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new InstantiationException(C0048b.m163a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new InstantiationException(C0048b.m163a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().f6118s = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            handler = fragmentManager.f6147q.f6335d;
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final <I, O> C0120c<I> registerForActivityResult(C3443a<I, O> aVar, C0123f fVar, C0118a<O> aVar2) {
        return prepareCallInternal(aVar, new C2705f(fVar), aVar2);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        C2782r<?> rVar = this.mHost;
        if (rVar != null) {
            Context context = rVar.f6334c;
            Object obj = C8184a.f17966a;
            C8184a.C8185a.m16461b(context, intent, bundle);
            return;
        }
        throw new IllegalStateException(C0015b.m89h("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.mHost != null) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.f6154x != null) {
                parentFragmentManager.f6120A.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i));
                if (!(intent == null || bundle == null)) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                parentFragmentManager.f6154x.mo1157b(intent);
                return;
            }
            C2782r<?> rVar = parentFragmentManager.f6147q;
            if (i == -1) {
                Context context = rVar.f6334c;
                Object obj = C8184a.f17966a;
                C8184a.C8185a.m16461b(context, intent, bundle);
                return;
            }
            rVar.getClass();
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException(C0015b.m89h("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        C2782r<?> rVar = this.mHost;
        if (rVar != null) {
            LayoutInflater e = rVar.mo10331e();
            e.setFactory2(this.mChildFragmentManager.f6136f);
            return e;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }

    private void restoreViewState() {
        if (FragmentManager.m6465J(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }
}
