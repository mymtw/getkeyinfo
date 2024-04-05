package androidx.legacy.app;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.appcompat.widget.C0326j;
import java.util.ArrayList;
import p003a2.C0023f;

@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {
    private boolean mAttached;
    private int mContainerId;
    private Context mContext;
    private FragmentManager mFragmentManager;
    private C2822b mLastTab;
    private TabHost.OnTabChangeListener mOnTabChangeListener;
    private FrameLayout mRealTabContent;
    private final ArrayList<C2822b> mTabs = new ArrayList<>();

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2820a();

        /* renamed from: b */
        public String f6412b;

        /* renamed from: androidx.legacy.app.FragmentTabHost$SavedState$a */
        public static class C2820a implements Parcelable.Creator<SavedState> {
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
            return C0023f.m110k(h, this.f6412b, "}");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f6412b);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f6412b = parcel.readString();
        }
    }

    /* renamed from: androidx.legacy.app.FragmentTabHost$a */
    public static class C2821a implements TabHost.TabContentFactory {

        /* renamed from: a */
        public final Context f6413a;

        public C2821a(Context context) {
            this.f6413a = context;
        }

        public final View createTabContent(String str) {
            View view = new View(this.f6413a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    /* renamed from: androidx.legacy.app.FragmentTabHost$b */
    public static final class C2822b {

        /* renamed from: a */
        public final String f6414a;

        /* renamed from: b */
        public final Class<?> f6415b;

        /* renamed from: c */
        public final Bundle f6416c;

        /* renamed from: d */
        public Fragment f6417d;

        public C2822b(Bundle bundle, Class cls, String str) {
            this.f6414a = str;
            this.f6415b = cls;
            this.f6416c = bundle;
        }
    }

    @Deprecated
    public FragmentTabHost(Context context) {
        super(context, (AttributeSet) null);
        initFragmentTabHost(context, (AttributeSet) null);
    }

    private FragmentTransaction doTabChanged(String str, FragmentTransaction fragmentTransaction) {
        Fragment fragment;
        C2822b bVar = null;
        for (int i = 0; i < this.mTabs.size(); i++) {
            C2822b bVar2 = this.mTabs.get(i);
            if (bVar2.f6414a.equals(str)) {
                bVar = bVar2;
            }
        }
        if (bVar != null) {
            if (this.mLastTab != bVar) {
                if (fragmentTransaction == null) {
                    fragmentTransaction = this.mFragmentManager.beginTransaction();
                }
                C2822b bVar3 = this.mLastTab;
                if (!(bVar3 == null || (fragment = bVar3.f6417d) == null)) {
                    fragmentTransaction.detach(fragment);
                }
                Fragment fragment2 = bVar.f6417d;
                if (fragment2 == null) {
                    Fragment instantiate = Fragment.instantiate(this.mContext, bVar.f6415b.getName(), bVar.f6416c);
                    bVar.f6417d = instantiate;
                    fragmentTransaction.add(this.mContainerId, instantiate, bVar.f6414a);
                } else {
                    fragmentTransaction.attach(fragment2);
                }
                this.mLastTab = bVar;
            }
            return fragmentTransaction;
        }
        throw new IllegalStateException(C0326j.m864i("No tab known for tag ", str));
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

    private void initFragmentTabHost(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.mContainerId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public void addTab(TabHost.TabSpec tabSpec, Class<?> cls, Bundle bundle) {
        tabSpec.setContent(new C2821a(this.mContext));
        String tag = tabSpec.getTag();
        C2822b bVar = new C2822b(bundle, cls, tag);
        if (this.mAttached) {
            Fragment findFragmentByTag = this.mFragmentManager.findFragmentByTag(tag);
            bVar.f6417d = findFragmentByTag;
            if (findFragmentByTag != null && !findFragmentByTag.isDetached()) {
                FragmentTransaction beginTransaction = this.mFragmentManager.beginTransaction();
                beginTransaction.detach(bVar.f6417d);
                beginTransaction.commit();
            }
        }
        this.mTabs.add(bVar);
        addTab(tabSpec);
    }

    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        FragmentTransaction fragmentTransaction = null;
        for (int i = 0; i < this.mTabs.size(); i++) {
            C2822b bVar = this.mTabs.get(i);
            Fragment findFragmentByTag = this.mFragmentManager.findFragmentByTag(bVar.f6414a);
            bVar.f6417d = findFragmentByTag;
            if (findFragmentByTag != null && !findFragmentByTag.isDetached()) {
                if (bVar.f6414a.equals(currentTabTag)) {
                    this.mLastTab = bVar;
                } else {
                    if (fragmentTransaction == null) {
                        fragmentTransaction = this.mFragmentManager.beginTransaction();
                    }
                    fragmentTransaction.detach(bVar.f6417d);
                }
            }
        }
        this.mAttached = true;
        FragmentTransaction doTabChanged = doTabChanged(currentTabTag, fragmentTransaction);
        if (doTabChanged != null) {
            doTabChanged.commit();
            this.mFragmentManager.executePendingTransactions();
        }
    }

    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mAttached = false;
    }

    @Deprecated
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f6412b);
    }

    @Deprecated
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6412b = getCurrentTabTag();
        return savedState;
    }

    @Deprecated
    public void onTabChanged(String str) {
        FragmentTransaction doTabChanged;
        if (this.mAttached && (doTabChanged = doTabChanged(str, (FragmentTransaction) null)) != null) {
            doTabChanged.commit();
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
