package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import com.google.android.play.core.appupdate.C15562d;
import p010a9.C0048b;

/* renamed from: androidx.fragment.app.t */
public final class C2786t implements LayoutInflater.Factory2 {

    /* renamed from: b */
    public final FragmentManager f6343b;

    /* renamed from: androidx.fragment.app.t$a */
    public class C2787a implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final /* synthetic */ C2741a0 f6344b;

        public C2787a(C2741a0 a0Var) {
            this.f6344b = a0Var;
        }

        public final void onViewAttachedToWindow(View view) {
            C2741a0 a0Var = this.f6344b;
            Fragment fragment = a0Var.f6223c;
            a0Var.mo10504k();
            SpecialEffectsController.m6548f((ViewGroup) fragment.mView.getParent(), C2786t.this.f6343b).mo10472e();
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public C2786t(FragmentManager fragmentManager) {
        this.f6343b = fragmentManager;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        C2741a0 a0Var;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f6343b);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15562d.f35025j);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z = Fragment.class.isAssignableFrom(C2781q.m6662b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                if (view != null) {
                    i = view.getId();
                }
                if (i == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                if (resourceId != -1) {
                    fragment = this.f6343b.mo10352B(resourceId);
                }
                if (fragment == null && string != null) {
                    fragment = this.f6343b.mo10353C(string);
                }
                if (fragment == null && i != -1) {
                    fragment = this.f6343b.mo10352B(i);
                }
                if (fragment == null) {
                    fragment = this.f6343b.mo10357G().mo10411a(context.getClassLoader(), attributeValue);
                    fragment.mFromLayout = true;
                    fragment.mFragmentId = resourceId != 0 ? resourceId : i;
                    fragment.mContainerId = i;
                    fragment.mTag = string;
                    fragment.mInLayout = true;
                    FragmentManager fragmentManager = this.f6343b;
                    fragment.mFragmentManager = fragmentManager;
                    C2782r<?> rVar = fragmentManager.f6147q;
                    fragment.mHost = rVar;
                    fragment.onInflate(rVar.f6334c, attributeSet, fragment.mSavedFragmentState);
                    a0Var = this.f6343b.mo10374a(fragment);
                    if (FragmentManager.m6465J(2)) {
                        fragment.toString();
                        Integer.toHexString(resourceId);
                    }
                } else if (!fragment.mInLayout) {
                    fragment.mInLayout = true;
                    FragmentManager fragmentManager2 = this.f6343b;
                    fragment.mFragmentManager = fragmentManager2;
                    C2782r<?> rVar2 = fragmentManager2.f6147q;
                    fragment.mHost = rVar2;
                    fragment.onInflate(rVar2.f6334c, attributeSet, fragment.mSavedFragmentState);
                    a0Var = this.f6343b.mo10384f(fragment);
                    if (FragmentManager.m6465J(2)) {
                        fragment.toString();
                        Integer.toHexString(resourceId);
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + attributeValue);
                }
                ViewGroup viewGroup = (ViewGroup) view;
                FragmentStrictMode.C2785b bVar = FragmentStrictMode.f6339a;
                FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
                FragmentStrictMode.m6674c(fragmentTagUsageViolation);
                FragmentStrictMode.C2785b a = FragmentStrictMode.m6672a(fragment);
                if (a.f6341a.contains(FragmentStrictMode.Flag.DETECT_FRAGMENT_TAG_USAGE) && FragmentStrictMode.m6677f(a, fragment.getClass(), FragmentTagUsageViolation.class)) {
                    FragmentStrictMode.m6673b(a, fragmentTagUsageViolation);
                }
                fragment.mContainer = viewGroup;
                a0Var.mo10504k();
                a0Var.mo10503j();
                View view2 = fragment.mView;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragment.mView.getTag() == null) {
                        fragment.mView.setTag(string);
                    }
                    fragment.mView.addOnAttachStateChangeListener(new C2787a(a0Var));
                    return fragment.mView;
                }
                throw new IllegalStateException(C0048b.m163a("Fragment ", attributeValue, " did not create a view."));
            }
        }
        return null;
    }
}
