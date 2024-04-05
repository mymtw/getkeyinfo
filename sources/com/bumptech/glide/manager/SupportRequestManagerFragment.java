package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p273w4.C8231a;
import p273w4.C8242k;

public class SupportRequestManagerFragment extends Fragment {
    private static final String TAG = "SupportRMFragment";
    private final Set<SupportRequestManagerFragment> childRequestManagerFragments;
    private final C8231a lifecycle;
    private Fragment parentFragmentHint;
    private RequestManager requestManager;
    private final C8242k requestManagerTreeNode;
    private SupportRequestManagerFragment rootRequestManagerFragment;

    /* renamed from: com.bumptech.glide.manager.SupportRequestManagerFragment$a */
    public class C6120a implements C8242k {
        public C6120a() {
        }

        /* renamed from: b */
        public final Set<RequestManager> mo17095b() {
            Set<SupportRequestManagerFragment> descendantRequestManagerFragments = SupportRequestManagerFragment.this.getDescendantRequestManagerFragments();
            HashSet hashSet = new HashSet(descendantRequestManagerFragments.size());
            for (SupportRequestManagerFragment next : descendantRequestManagerFragments) {
                if (next.getRequestManager() != null) {
                    hashSet.add(next.getRequestManager());
                }
            }
            return hashSet;
        }

        public final String toString() {
            return super.toString() + "{fragment=" + SupportRequestManagerFragment.this + "}";
        }
    }

    public SupportRequestManagerFragment() {
        this(new C8231a());
    }

    private void addChildRequestManagerFragment(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.childRequestManagerFragments.add(supportRequestManagerFragment);
    }

    private Fragment getParentFragmentUsingHint() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.parentFragmentHint;
    }

    private static FragmentManager getRootFragmentManager(Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    private boolean isDescendant(Fragment fragment) {
        Fragment parentFragmentUsingHint = getParentFragmentUsingHint();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(parentFragmentUsingHint)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void registerFragmentWithRoot(Context context, FragmentManager fragmentManager) {
        unregisterFragmentWithRoot();
        SupportRequestManagerFragment supportRequestManagerFragment = Glide.get(context).getRequestManagerRetriever().getSupportRequestManagerFragment(fragmentManager);
        this.rootRequestManagerFragment = supportRequestManagerFragment;
        if (!equals(supportRequestManagerFragment)) {
            this.rootRequestManagerFragment.addChildRequestManagerFragment(this);
        }
    }

    private void removeChildRequestManagerFragment(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.childRequestManagerFragments.remove(supportRequestManagerFragment);
    }

    private void unregisterFragmentWithRoot() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.rootRequestManagerFragment;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.removeChildRequestManagerFragment(this);
            this.rootRequestManagerFragment = null;
        }
    }

    public Set<SupportRequestManagerFragment> getDescendantRequestManagerFragments() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.rootRequestManagerFragment;
        if (supportRequestManagerFragment == null) {
            return Collections.emptySet();
        }
        if (equals(supportRequestManagerFragment)) {
            return Collections.unmodifiableSet(this.childRequestManagerFragments);
        }
        HashSet hashSet = new HashSet();
        for (SupportRequestManagerFragment next : this.rootRequestManagerFragment.getDescendantRequestManagerFragments()) {
            if (isDescendant(next.getParentFragmentUsingHint())) {
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

    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager rootFragmentManager = getRootFragmentManager(this);
        if (rootFragmentManager != null) {
            try {
                registerFragmentWithRoot(getContext(), rootFragmentManager);
            } catch (IllegalStateException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "Unable to register fragment with root", e);
                }
            }
        } else if (Log.isLoggable(TAG, 5)) {
            Log.w(TAG, "Unable to register fragment with root, ancestor detached");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.lifecycle.mo20842b();
        unregisterFragmentWithRoot();
    }

    public void onDetach() {
        super.onDetach();
        this.parentFragmentHint = null;
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
        FragmentManager rootFragmentManager;
        this.parentFragmentHint = fragment;
        if (fragment != null && fragment.getContext() != null && (rootFragmentManager = getRootFragmentManager(fragment)) != null) {
            registerFragmentWithRoot(fragment.getContext(), rootFragmentManager);
        }
    }

    public void setRequestManager(RequestManager requestManager2) {
        this.requestManager = requestManager2;
    }

    public String toString() {
        return super.toString() + "{parent=" + getParentFragmentUsingHint() + "}";
    }

    @SuppressLint({"ValidFragment"})
    public SupportRequestManagerFragment(C8231a aVar) {
        this.requestManagerTreeNode = new C6120a();
        this.childRequestManagerFragments = new HashSet();
        this.lifecycle = aVar;
    }
}
