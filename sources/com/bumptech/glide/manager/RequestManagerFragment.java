package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p273w4.C8231a;
import p273w4.C8242k;

@Deprecated
public class RequestManagerFragment extends Fragment {
    private static final String TAG = "RMFragment";
    private final Set<RequestManagerFragment> childRequestManagerFragments;
    private final C8231a lifecycle;
    private Fragment parentFragmentHint;
    private RequestManager requestManager;
    private final C8242k requestManagerTreeNode;
    private RequestManagerFragment rootRequestManagerFragment;

    /* renamed from: com.bumptech.glide.manager.RequestManagerFragment$a */
    public class C6117a implements C8242k {
        public C6117a() {
        }

        /* renamed from: b */
        public final Set<RequestManager> mo17095b() {
            Set<RequestManagerFragment> descendantRequestManagerFragments = RequestManagerFragment.this.getDescendantRequestManagerFragments();
            HashSet hashSet = new HashSet(descendantRequestManagerFragments.size());
            for (RequestManagerFragment next : descendantRequestManagerFragments) {
                if (next.getRequestManager() != null) {
                    hashSet.add(next.getRequestManager());
                }
            }
            return hashSet;
        }

        public final String toString() {
            return super.toString() + "{fragment=" + RequestManagerFragment.this + "}";
        }
    }

    public RequestManagerFragment() {
        this(new C8231a());
    }

    private void addChildRequestManagerFragment(RequestManagerFragment requestManagerFragment) {
        this.childRequestManagerFragments.add(requestManagerFragment);
    }

    @TargetApi(17)
    private Fragment getParentFragmentUsingHint() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.parentFragmentHint;
    }

    @TargetApi(17)
    private boolean isDescendant(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void registerFragmentWithRoot(Activity activity) {
        unregisterFragmentWithRoot();
        RequestManagerFragment requestManagerFragment = Glide.get(activity).getRequestManagerRetriever().getRequestManagerFragment(activity);
        this.rootRequestManagerFragment = requestManagerFragment;
        if (!equals(requestManagerFragment)) {
            this.rootRequestManagerFragment.addChildRequestManagerFragment(this);
        }
    }

    private void removeChildRequestManagerFragment(RequestManagerFragment requestManagerFragment) {
        this.childRequestManagerFragments.remove(requestManagerFragment);
    }

    private void unregisterFragmentWithRoot() {
        RequestManagerFragment requestManagerFragment = this.rootRequestManagerFragment;
        if (requestManagerFragment != null) {
            requestManagerFragment.removeChildRequestManagerFragment(this);
            this.rootRequestManagerFragment = null;
        }
    }

    @TargetApi(17)
    public Set<RequestManagerFragment> getDescendantRequestManagerFragments() {
        if (equals(this.rootRequestManagerFragment)) {
            return Collections.unmodifiableSet(this.childRequestManagerFragments);
        }
        if (this.rootRequestManagerFragment == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (RequestManagerFragment next : this.rootRequestManagerFragment.getDescendantRequestManagerFragments()) {
            if (isDescendant(next.getParentFragment())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public C8231a getGlideLifecycle() {
        return this.lifecycle;
    }

    public RequestManager getRequestManager() {
        return this.requestManager;
    }

    public C8242k getRequestManagerTreeNode() {
        return this.requestManagerTreeNode;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            registerFragmentWithRoot(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "Unable to register fragment with root", e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.lifecycle.mo20842b();
        unregisterFragmentWithRoot();
    }

    public void onDetach() {
        super.onDetach();
        unregisterFragmentWithRoot();
    }

    public void onStart() {
        super.onStart();
        this.lifecycle.mo20844d();
    }

    public void onStop() {
        super.onStop();
        this.lifecycle.mo20845e();
    }

    public void setParentFragmentHint(Fragment fragment) {
        this.parentFragmentHint = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            registerFragmentWithRoot(fragment.getActivity());
        }
    }

    public void setRequestManager(RequestManager requestManager2) {
        this.requestManager = requestManager2;
    }

    public String toString() {
        return super.toString() + "{parent=" + getParentFragmentUsingHint() + "}";
    }

    @SuppressLint({"ValidFragment"})
    public RequestManagerFragment(C8231a aVar) {
        this.requestManagerTreeNode = new C6117a();
        this.childRequestManagerFragments = new HashSet();
        this.lifecycle = aVar;
    }
}
