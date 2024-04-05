package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.fragment.app.C2751c0;
import java.util.ArrayList;
import p003a2.C0023f;

@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {
    private boolean mAttached;
    private int mContainerId;
    private Context mContext;
    private FragmentManager mFragmentManager;
    private C2732b mLastTab;
    private TabHost.OnTabChangeListener mOnTabChangeListener;
    private FrameLayout mRealTabContent;
    private final ArrayList<C2732b> mTabs = new ArrayList<>();

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2730a();

        /* renamed from: b */
        public String f6190b;

        /* renamed from: androidx.fragment.app.FragmentTabHost$SavedState$a */
        public class C2730a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("FragmentTabHost.SavedState{");
            h.append(Integer.toHexString(System.identityHashCode(this)));
            h.append(" curTab=");
            return C0023f.m110k(h, this.f6190b, "}");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f6190b);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f6190b = parcel.readString();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentTabHost$a */
    public static class C2731a implements TabHost.TabContentFactory {

        /* renamed from: a */
        public final Context f6191a;

        public C2731a(Context context) {
            this.f6191a = context;
        }

        public final View createTabContent(String str) {
            View view = new View(this.f6191a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentTabHost$b */
    public static final class C2732b {

        /* renamed from: a */
        public final String f6192a;

        /* renamed from: b */
        public final Class<?> f6193b;

        /* renamed from: c */
        public final Bundle f6194c;

        /* renamed from: d */
        public Fragment f6195d;

        public C2732b(Bundle bundle, Class cls, String str) {
            this.f6192a = str;
            this.f6193b = cls;
            this.f6194c = bundle;
        }
    }

    @Deprecated
    public FragmentTabHost(Context context) {
        super(context, (AttributeSet) null);
        initFragmentTabHost(context, (AttributeSet) null);
    }

    private C2751c0 doTabChanged(String str, C2751c0 c0Var) {
        Fragment fragment;
        C2732b tabInfoForTag = getTabInfoForTag(str);
        if (this.mLastTab != tabInfoForTag) {
            if (c0Var == null) {
                FragmentManager fragmentManager = this.mFragmentManager;
                c0Var = C0070b.m182c(fragmentManager, fragmentManager);
            }
            C2732b bVar = this.mLastTab;
            if (!(bVar == null || (fragment = bVar.f6195d) == null)) {
                c0Var.mo10484f(fragment);
            }
            if (tabInfoForTag != null) {
                Fragment fragment2 = tabInfoForTag.f6195d;
                if (fragment2 == null) {
                    Fragment a = this.mFragmentManager.mo10357G().mo10411a(this.mContext.getClassLoader(), tabInfoForTag.f6193b.getName());
                    tabInfoForTag.f6195d = a;
                    a.setArguments(tabInfoForTag.f6194c);
                    c0Var.mo10485g(this.mContainerId, tabInfoForTag.f6195d, tabInfoForTag.f6192a, 1);
                } else {
                    c0Var.mo10528b(new C2751c0.C2752a(fragment2, 7));
                }
            }
            this.mLastTab = tabInfoForTag;
        }
        return c0Var;
    }

    private void ensureContent() {
        if (this.mRealTabContent == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.mContainerId);
            this.mRealTabContent = frameLayout;
            if (frameLayout == null) {
                StringBuilder h = C0072d.m201h("No tab content FrameLayout found for id ");
                h.append(this.mContainerId);
                throw new IllegalStateException(h.toString());
            }
        }
    }

    private void ensureHierarchy(Context context) {
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.mRealTabContent = frameLayout2;
            frameLayout2.setId(this.mContainerId);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    private C2732b getTabInfoForTag(String str) {
        int size = this.mTabs.size();
        for (int i = 0; i < size; i++) {
            C2732b bVar = this.mTabs.get(i);
            if (bVar.f6192a.equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    private void initFragmentTabHost(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.mContainerId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public void addTab(TabHost.TabSpec tabSpec, Class<?> cls, Bundle bundle) {
        tabSpec.setContent(new C2731a(this.mContext));
        String tag = tabSpec.getTag();
        C2732b bVar = new C2732b(bundle, cls, tag);
        if (this.mAttached) {
            Fragment C = this.mFragmentManager.mo10353C(tag);
            bVar.f6195d = C;
            if (C != null && !C.isDetached()) {
                FragmentManager fragmentManager = this.mFragmentManager;
                C2740a c = C0070b.m182c(fragmentManager, fragmentManager);
                c.mo10484f(bVar.f6195d);
                c.mo10483d();
            }
        }
        this.mTabs.add(bVar);
        addTab(tabSpec);
    }

    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.mTabs.size();
        C2740a aVar = null;
        for (int i = 0; i < size; i++) {
            C2732b bVar = this.mTabs.get(i);
            Fragment C = this.mFragmentManager.mo10353C(bVar.f6192a);
            bVar.f6195d = C;
            if (C != null && !C.isDetached()) {
                if (bVar.f6192a.equals(currentTabTag)) {
                    this.mLastTab = bVar;
                } else {
                    if (aVar == null) {
                        FragmentManager fragmentManager = this.mFragmentManager;
                        aVar = C0070b.m182c(fragmentManager, fragmentManager);
                    }
                    aVar.mo10484f(bVar.f6195d);
                }
            }
        }
        this.mAttached = true;
        C2751c0 doTabChanged = doTabChanged(currentTabTag, aVar);
        if (doTabChanged != null) {
            doTabChanged.mo10483d();
            FragmentManager fragmentManager2 = this.mFragmentManager;
            fragmentManager2.mo10404x(true);
            fragmentManager2.mo10354D();
        }
    }

    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mAttached = false;
    }

    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f6190b);
    }

    @Deprecated
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6190b = getCurrentTabTag();
        return savedState;
    }

    @Deprecated
    public void onTabChanged(String str) {
        C2751c0 doTabChanged;
        if (this.mAttached && (doTabChanged = doTabChanged(str, (C2751c0) null)) != null) {
            doTabChanged.mo10483d();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.mOnTabChangeListener;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.mOnTabChangeListener = onTabChangeListener;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public void setup(Context context, FragmentManager fragmentManager) {
        ensureHierarchy(context);
        super.setup();
        this.mContext = context;
        this.mFragmentManager = fragmentManager;
        ensureContent();
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initFragmentTabHost(context, attributeSet);
    }

    @Deprecated
    public void setup(Context context, FragmentManager fragmentManager, int i) {
        ensureHierarchy(context);
        super.setup();
        this.mContext = context;
        this.mFragmentManager = fragmentManager;
        this.mContainerId = i;
        ensureContent();
        this.mRealTabContent.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
    }
}
