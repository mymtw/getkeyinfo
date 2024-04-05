package com.bumptech.glide.manager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.activity.C0114h;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C5951c;
import com.bumptech.glide.C5957d;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.bitmap.C6096q;
import com.google.android.gms.measurement.internal.C15123x;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19388s;
import p036c5.C4426l;
import p193o.C7494b;
import p273w4.C8237f;
import p273w4.C8238g;
import p273w4.C8239h;
import p273w4.C8242k;
import p383ke.C12995a;
import p453tf.C13423m;

public class RequestManagerRetriever implements Handler.Callback {
    private static final C6119b DEFAULT_FACTORY = new C6118a();
    private static final String FRAGMENT_INDEX_KEY = "key";
    public static final String FRAGMENT_TAG = "com.bumptech.glide.manager";
    private static final int HAS_ATTEMPTED_TO_ADD_FRAGMENT_TWICE = 1;
    private static final int ID_REMOVE_FRAGMENT_MANAGER = 1;
    private static final int ID_REMOVE_SUPPORT_FRAGMENT_MANAGER = 2;
    private static final String TAG = "RMRetriever";
    private volatile RequestManager applicationManager;
    private final C6119b factory;
    private final C8238g frameWaiter;
    private final Handler handler;
    public final Map<FragmentManager, RequestManagerFragment> pendingRequestManagerFragments = new HashMap();
    public final Map<androidx.fragment.app.FragmentManager, SupportRequestManagerFragment> pendingSupportRequestManagerFragments = new HashMap();
    private final Bundle tempBundle = new Bundle();
    private final C7494b<View, Fragment> tempViewToFragment = new C7494b<>();
    private final C7494b<View, androidx.fragment.app.Fragment> tempViewToSupportFragment = new C7494b<>();

    /* renamed from: com.bumptech.glide.manager.RequestManagerRetriever$a */
    public class C6118a implements C6119b {
        /* renamed from: a */
        public final RequestManager mo16811a(Glide glide, C8239h hVar, C8242k kVar, Context context) {
            return new RequestManager(glide, hVar, kVar, context);
        }
    }

    /* renamed from: com.bumptech.glide.manager.RequestManagerRetriever$b */
    public interface C6119b {
        /* renamed from: a */
        RequestManager mo16811a(Glide glide, C8239h hVar, C8242k kVar, Context context);
    }

    public RequestManagerRetriever(C6119b bVar, C5957d dVar) {
        this.factory = bVar == null ? DEFAULT_FACTORY : bVar;
        this.handler = new Handler(Looper.getMainLooper(), this);
        this.frameWaiter = buildFrameWaiter(dVar);
    }

    @TargetApi(17)
    private static void assertNotDestroyed(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static C8238g buildFrameWaiter(C5957d dVar) {
        if (!C6096q.f13104h || !C6096q.f13103g) {
            return new C12995a();
        }
        return dVar.f12754a.containsKey(C5951c.C5956e.class) ? new C8237f() : new C15123x();
    }

    private static Activity findActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return findActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @TargetApi(26)
    @Deprecated
    private void findAllFragmentsWithViews(FragmentManager fragmentManager, C7494b<View, Fragment> bVar) {
        for (Fragment next : fragmentManager.getFragments()) {
            if (next.getView() != null) {
                bVar.put(next.getView(), next);
                findAllFragmentsWithViews(next.getChildFragmentManager(), bVar);
            }
        }
    }

    @Deprecated
    private void findAllFragmentsWithViewsPreO(FragmentManager fragmentManager, C7494b<View, Fragment> bVar) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.tempBundle.putInt("key", i);
            Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.tempBundle, "key");
            } catch (Exception unused) {
            }
            if (fragment != null) {
                if (fragment.getView() != null) {
                    bVar.put(fragment.getView(), fragment);
                    findAllFragmentsWithViews(fragment.getChildFragmentManager(), bVar);
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    private static void findAllSupportFragmentsWithViews(Collection<androidx.fragment.app.Fragment> collection, Map<View, androidx.fragment.app.Fragment> map) {
        if (collection != null) {
            for (androidx.fragment.app.Fragment next : collection) {
                if (!(next == null || next.getView() == null)) {
                    map.put(next.getView(), next);
                    findAllSupportFragmentsWithViews(next.getChildFragmentManager().mo10358H(), map);
                }
            }
        }
    }

    @Deprecated
    private Fragment findFragment(View view, Activity activity) {
        this.tempViewToFragment.clear();
        findAllFragmentsWithViews(activity.getFragmentManager(), this.tempViewToFragment);
        View findViewById = activity.findViewById(16908290);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.tempViewToFragment.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.tempViewToFragment.clear();
        return fragment;
    }

    private androidx.fragment.app.Fragment findSupportFragment(View view, FragmentActivity fragmentActivity) {
        this.tempViewToSupportFragment.clear();
        findAllSupportFragmentsWithViews(fragmentActivity.getSupportFragmentManager().mo10358H(), this.tempViewToSupportFragment);
        View findViewById = fragmentActivity.findViewById(16908290);
        androidx.fragment.app.Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.tempViewToSupportFragment.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.tempViewToSupportFragment.clear();
        return fragment;
    }

    @Deprecated
    private RequestManager fragmentGet(Context context, FragmentManager fragmentManager, Fragment fragment, boolean z) {
        RequestManagerFragment requestManagerFragment = getRequestManagerFragment(fragmentManager, fragment);
        RequestManager requestManager = requestManagerFragment.getRequestManager();
        if (requestManager == null) {
            requestManager = this.factory.mo16811a(Glide.get(context), requestManagerFragment.getGlideLifecycle(), requestManagerFragment.getRequestManagerTreeNode(), context);
            if (z) {
                requestManager.onStart();
            }
            requestManagerFragment.setRequestManager(requestManager);
        }
        return requestManager;
    }

    private RequestManager getApplicationManager(Context context) {
        if (this.applicationManager == null) {
            synchronized (this) {
                if (this.applicationManager == null) {
                    this.applicationManager = this.factory.mo16811a(Glide.get(context.getApplicationContext()), new C19388s(), new C13423m(), context.getApplicationContext());
                }
            }
        }
        return this.applicationManager;
    }

    private static boolean isActivityVisible(Context context) {
        Activity findActivity = findActivity(context);
        return findActivity == null || !findActivity.isFinishing();
    }

    private RequestManager supportFragmentGet(Context context, androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, boolean z) {
        SupportRequestManagerFragment supportRequestManagerFragment = getSupportRequestManagerFragment(fragmentManager, fragment);
        RequestManager requestManager = supportRequestManagerFragment.getRequestManager();
        if (requestManager == null) {
            requestManager = this.factory.mo16811a(Glide.get(context), supportRequestManagerFragment.getGlideLifecycle(), supportRequestManagerFragment.getRequestManagerTreeNode(), context);
            if (z) {
                requestManager.onStart();
            }
            supportRequestManagerFragment.setRequestManager(requestManager);
        }
        return requestManager;
    }

    private boolean verifyOurFragmentWasAddedOrCantBeAdded(FragmentManager fragmentManager, boolean z) {
        RequestManagerFragment requestManagerFragment = this.pendingRequestManagerFragments.get(fragmentManager);
        RequestManagerFragment requestManagerFragment2 = (RequestManagerFragment) fragmentManager.findFragmentByTag(FRAGMENT_TAG);
        if (requestManagerFragment2 == requestManagerFragment) {
            return true;
        }
        if (requestManagerFragment2 != null && requestManagerFragment2.getRequestManager() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + requestManagerFragment2 + " New: " + requestManagerFragment);
        } else if (z || fragmentManager.isDestroyed()) {
            if (Log.isLoggable(TAG, 5)) {
                if (fragmentManager.isDestroyed()) {
                    Log.w(TAG, "Parent was destroyed before our Fragment could be added");
                } else {
                    Log.w(TAG, "Tried adding Fragment twice and failed twice, giving up!");
                }
            }
            requestManagerFragment.getGlideLifecycle().mo20842b();
            return true;
        } else {
            FragmentTransaction add = fragmentManager.beginTransaction().add(requestManagerFragment, FRAGMENT_TAG);
            if (requestManagerFragment2 != null) {
                add.remove(requestManagerFragment2);
            }
            add.commitAllowingStateLoss();
            this.handler.obtainMessage(1, 1, 0, fragmentManager).sendToTarget();
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "We failed to add our Fragment the first time around, trying again...");
            }
            return false;
        }
    }

    private boolean verifyOurSupportFragmentWasAddedOrCantBeAdded(androidx.fragment.app.FragmentManager fragmentManager, boolean z) {
        SupportRequestManagerFragment supportRequestManagerFragment = this.pendingSupportRequestManagerFragments.get(fragmentManager);
        SupportRequestManagerFragment supportRequestManagerFragment2 = (SupportRequestManagerFragment) fragmentManager.mo10353C(FRAGMENT_TAG);
        if (supportRequestManagerFragment2 == supportRequestManagerFragment) {
            return true;
        }
        if (supportRequestManagerFragment2 != null && supportRequestManagerFragment2.getRequestManager() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + supportRequestManagerFragment2 + " New: " + supportRequestManagerFragment);
        } else if (z || fragmentManager.f6124E) {
            if (fragmentManager.f6124E) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled");
                }
            } else if (Log.isLoggable(TAG, 6)) {
                Log.e(TAG, "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you're starting loads in a unit test with an Activity that you haven't created and never create. If you're using Robolectric, create the Activity as part of your test setup");
            }
            supportRequestManagerFragment.getGlideLifecycle().mo20842b();
            return true;
        } else {
            C2740a aVar = new C2740a(fragmentManager);
            aVar.mo10485g(0, supportRequestManagerFragment, FRAGMENT_TAG, 1);
            if (supportRequestManagerFragment2 != null) {
                aVar.mo10490n(supportRequestManagerFragment2);
            }
            if (!aVar.f6252i) {
                aVar.f6253j = false;
                aVar.f6218s.mo10405y(aVar, true);
                this.handler.obtainMessage(2, 1, 0, fragmentManager).sendToTarget();
                if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "We failed to add our Fragment the first time around, trying again...");
                }
                return false;
            }
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
    }

    public RequestManager get(Context context) {
        if (context != null) {
            char[] cArr = C4426l.f9710a;
            if ((Looper.myLooper() == Looper.getMainLooper()) && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return get((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return get((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return get(contextWrapper.getBaseContext());
                    }
                }
            }
            return getApplicationManager(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    @Deprecated
    public RequestManagerFragment getRequestManagerFragment(Activity activity) {
        return getRequestManagerFragment(activity.getFragmentManager(), (Fragment) null);
    }

    public SupportRequestManagerFragment getSupportRequestManagerFragment(androidx.fragment.app.FragmentManager fragmentManager) {
        return getSupportRequestManagerFragment(fragmentManager, (androidx.fragment.app.Fragment) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: android.app.FragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: androidx.fragment.app.FragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: android.app.FragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: android.app.FragmentManager} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r7) {
        /*
            r6 = this;
            int r0 = r7.arg1
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0008
            r0 = r2
            goto L_0x0009
        L_0x0008:
            r0 = r1
        L_0x0009:
            int r3 = r7.what
            r4 = 0
            if (r3 == r2) goto L_0x0024
            r5 = 2
            if (r3 == r5) goto L_0x0013
            r2 = r1
            goto L_0x0036
        L_0x0013:
            java.lang.Object r7 = r7.obj
            androidx.fragment.app.FragmentManager r7 = (androidx.fragment.app.FragmentManager) r7
            boolean r0 = r6.verifyOurSupportFragmentWasAddedOrCantBeAdded(r7, r0)
            if (r0 == 0) goto L_0x0036
            java.util.Map<androidx.fragment.app.FragmentManager, com.bumptech.glide.manager.SupportRequestManagerFragment> r0 = r6.pendingSupportRequestManagerFragments
            java.lang.Object r4 = r0.remove(r7)
            goto L_0x0034
        L_0x0024:
            java.lang.Object r7 = r7.obj
            android.app.FragmentManager r7 = (android.app.FragmentManager) r7
            boolean r0 = r6.verifyOurFragmentWasAddedOrCantBeAdded(r7, r0)
            if (r0 == 0) goto L_0x0036
            java.util.Map<android.app.FragmentManager, com.bumptech.glide.manager.RequestManagerFragment> r0 = r6.pendingRequestManagerFragments
            java.lang.Object r4 = r0.remove(r7)
        L_0x0034:
            r1 = r2
            goto L_0x0037
        L_0x0036:
            r7 = r4
        L_0x0037:
            r0 = 5
            java.lang.String r3 = "RMRetriever"
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L_0x0058
            if (r1 == 0) goto L_0x0058
            if (r4 != 0) goto L_0x0058
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to remove expected request manager fragment, manager: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            android.util.Log.w(r3, r7)
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.manager.RequestManagerRetriever.handleMessage(android.os.Message):boolean");
    }

    private RequestManagerFragment getRequestManagerFragment(FragmentManager fragmentManager, Fragment fragment) {
        RequestManagerFragment requestManagerFragment = this.pendingRequestManagerFragments.get(fragmentManager);
        if (requestManagerFragment != null) {
            return requestManagerFragment;
        }
        RequestManagerFragment requestManagerFragment2 = (RequestManagerFragment) fragmentManager.findFragmentByTag(FRAGMENT_TAG);
        if (requestManagerFragment2 == null) {
            requestManagerFragment2 = new RequestManagerFragment();
            requestManagerFragment2.setParentFragmentHint(fragment);
            this.pendingRequestManagerFragments.put(fragmentManager, requestManagerFragment2);
            fragmentManager.beginTransaction().add(requestManagerFragment2, FRAGMENT_TAG).commitAllowingStateLoss();
            this.handler.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return requestManagerFragment2;
    }

    private SupportRequestManagerFragment getSupportRequestManagerFragment(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        SupportRequestManagerFragment supportRequestManagerFragment = this.pendingSupportRequestManagerFragments.get(fragmentManager);
        if (supportRequestManagerFragment != null) {
            return supportRequestManagerFragment;
        }
        SupportRequestManagerFragment supportRequestManagerFragment2 = (SupportRequestManagerFragment) fragmentManager.mo10353C(FRAGMENT_TAG);
        if (supportRequestManagerFragment2 == null) {
            supportRequestManagerFragment2 = new SupportRequestManagerFragment();
            supportRequestManagerFragment2.setParentFragmentHint(fragment);
            this.pendingSupportRequestManagerFragments.put(fragmentManager, supportRequestManagerFragment2);
            C2740a aVar = new C2740a(fragmentManager);
            aVar.mo10485g(0, supportRequestManagerFragment2, FRAGMENT_TAG, 1);
            aVar.mo10487k();
            this.handler.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return supportRequestManagerFragment2;
    }

    public RequestManager get(FragmentActivity fragmentActivity) {
        if (C4426l.m10134h()) {
            return get(fragmentActivity.getApplicationContext());
        }
        assertNotDestroyed(fragmentActivity);
        this.frameWaiter.mo20846b();
        return supportFragmentGet(fragmentActivity, fragmentActivity.getSupportFragmentManager(), (androidx.fragment.app.Fragment) null, isActivityVisible(fragmentActivity));
    }

    public RequestManager get(androidx.fragment.app.Fragment fragment) {
        if (fragment.getContext() == null) {
            throw new NullPointerException("You cannot start a load on a fragment before it is attached or after it is destroyed");
        } else if (C4426l.m10134h()) {
            return get(fragment.getContext().getApplicationContext());
        } else {
            if (fragment.getActivity() != null) {
                C8238g gVar = this.frameWaiter;
                fragment.getActivity();
                gVar.mo20846b();
            }
            return supportFragmentGet(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        }
    }

    public RequestManager get(Activity activity) {
        if (C4426l.m10134h()) {
            return get(activity.getApplicationContext());
        }
        if (activity instanceof FragmentActivity) {
            return get((FragmentActivity) activity);
        }
        assertNotDestroyed(activity);
        this.frameWaiter.mo20846b();
        return fragmentGet(activity, activity.getFragmentManager(), (Fragment) null, isActivityVisible(activity));
    }

    public RequestManager get(View view) {
        if (C4426l.m10134h()) {
            return get(view.getContext().getApplicationContext());
        }
        C0114h.m281L(view);
        if (view.getContext() != null) {
            Activity findActivity = findActivity(view.getContext());
            if (findActivity == null) {
                return get(view.getContext().getApplicationContext());
            }
            if (findActivity instanceof FragmentActivity) {
                FragmentActivity fragmentActivity = (FragmentActivity) findActivity;
                androidx.fragment.app.Fragment findSupportFragment = findSupportFragment(view, fragmentActivity);
                return findSupportFragment != null ? get(findSupportFragment) : get(fragmentActivity);
            }
            Fragment findFragment = findFragment(view, findActivity);
            if (findFragment == null) {
                return get(findActivity);
            }
            return get(findFragment);
        }
        throw new NullPointerException("Unable to obtain a request manager for a view without a Context");
    }

    @TargetApi(17)
    @Deprecated
    public RequestManager get(Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        } else if (C4426l.m10134h()) {
            return get(fragment.getActivity().getApplicationContext());
        } else {
            if (fragment.getActivity() != null) {
                C8238g gVar = this.frameWaiter;
                fragment.getActivity();
                gVar.mo20846b();
            }
            return fragmentGet(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        }
    }
}
