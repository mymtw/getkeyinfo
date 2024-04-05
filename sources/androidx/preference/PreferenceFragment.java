package androidx.preference;

import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0114h;
import androidx.preference.C3045f;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import p010a9.C0048b;
import p280x0.C8299j;

@Deprecated
public abstract class PreferenceFragment extends Fragment implements C3045f.C3048c, C3045f.C3046a, C3045f.C3047b, DialogPreference.C2994a {
    @Deprecated
    public static final String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private static final String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    private static final int MSG_BIND_PREFERENCES = 1;
    private static final String PREFERENCES_TAG = "android:preferences";
    private final C3016d mDividerDecoration = new C3016d();
    private final Handler mHandler = new C3013a();
    private boolean mHavePrefs;
    private boolean mInitDone;
    private int mLayoutResId = R.layout.preference_list_fragment;
    public RecyclerView mList;
    private C3045f mPreferenceManager;
    private final Runnable mRequestFocus = new C3014b();
    private Runnable mSelectPreferenceRunnable;
    private Context mStyledContext;

    /* renamed from: androidx.preference.PreferenceFragment$a */
    public class C3013a extends Handler {
        public C3013a() {
        }

        public final void handleMessage(Message message) {
            if (message.what == 1) {
                PreferenceFragment.this.bindPreferences();
            }
        }
    }

    /* renamed from: androidx.preference.PreferenceFragment$b */
    public class C3014b implements Runnable {
        public C3014b() {
        }

        public final void run() {
            RecyclerView recyclerView = PreferenceFragment.this.mList;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* renamed from: androidx.preference.PreferenceFragment$c */
    public class C3015c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Preference f6850b;

        /* renamed from: c */
        public final /* synthetic */ String f6851c;

        public C3015c(Preference preference, String str) {
            this.f6850b = preference;
            this.f6851c = str;
        }

        public final void run() {
            RecyclerView.Adapter adapter = PreferenceFragment.this.mList.getAdapter();
            if (adapter instanceof PreferenceGroup.C3031b) {
                Preference preference = this.f6850b;
                int c = preference != null ? ((PreferenceGroup.C3031b) adapter).mo11158c(preference) : ((PreferenceGroup.C3031b) adapter).mo11159g(this.f6851c);
                if (c != -1) {
                    PreferenceFragment.this.mList.scrollToPosition(c);
                } else {
                    adapter.registerAdapterDataObserver(new C3020h(adapter, PreferenceFragment.this.mList, this.f6850b, this.f6851c));
                }
            } else if (adapter != null) {
                throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
            }
        }
    }

    /* renamed from: androidx.preference.PreferenceFragment$d */
    public class C3016d extends RecyclerView.C3099n {

        /* renamed from: a */
        public Drawable f6853a;

        /* renamed from: b */
        public int f6854b;

        /* renamed from: c */
        public boolean f6855c = true;

        public C3016d() {
        }

        /* renamed from: f */
        public final boolean mo11109f(View view, RecyclerView recyclerView) {
            RecyclerView.C3084b0 childViewHolder = recyclerView.getChildViewHolder(view);
            boolean z = false;
            if (!((childViewHolder instanceof C3051h) && ((C3051h) childViewHolder).f6953d)) {
                return false;
            }
            boolean z2 = this.f6855c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild >= recyclerView.getChildCount() - 1) {
                return z2;
            }
            RecyclerView.C3084b0 childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(indexOfChild + 1));
            if ((childViewHolder2 instanceof C3051h) && ((C3051h) childViewHolder2).f6952c) {
                z = true;
            }
            return z;
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
            if (mo11109f(view, recyclerView)) {
                rect.bottom = this.f6854b;
            }
        }

        public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
            if (this.f6853a != null) {
                int childCount = recyclerView.getChildCount();
                int width = recyclerView.getWidth();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    if (mo11109f(childAt, recyclerView)) {
                        int height = childAt.getHeight() + ((int) childAt.getY());
                        this.f6853a.setBounds(0, height, width, this.f6854b + height);
                        this.f6853a.draw(canvas);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.preference.PreferenceFragment$e */
    public interface C3017e {
        /* renamed from: a */
        boolean mo11112a();
    }

    /* renamed from: androidx.preference.PreferenceFragment$f */
    public interface C3018f {
        /* renamed from: a */
        boolean mo11113a();
    }

    /* renamed from: androidx.preference.PreferenceFragment$g */
    public interface C3019g {
        /* renamed from: a */
        boolean mo11114a();
    }

    /* renamed from: androidx.preference.PreferenceFragment$h */
    public static class C3020h extends RecyclerView.C3091i {

        /* renamed from: a */
        public final RecyclerView.Adapter f6857a;

        /* renamed from: b */
        public final RecyclerView f6858b;

        /* renamed from: c */
        public final Preference f6859c;

        /* renamed from: d */
        public final String f6860d;

        public C3020h(RecyclerView.Adapter adapter, RecyclerView recyclerView, Preference preference, String str) {
            this.f6857a = adapter;
            this.f6858b = recyclerView;
            this.f6859c = preference;
            this.f6860d = str;
        }

        /* renamed from: a */
        public final void mo11115a() {
            mo11121h();
        }

        /* renamed from: b */
        public final void mo11116b() {
            mo11121h();
        }

        /* renamed from: c */
        public final void mo11117c(int i, int i2, Object obj) {
            mo11121h();
        }

        /* renamed from: d */
        public final void mo11118d(int i, int i2) {
            mo11121h();
        }

        /* renamed from: e */
        public final void mo11119e(int i, int i2) {
            mo11121h();
        }

        /* renamed from: f */
        public final void mo11120f(int i, int i2) {
            mo11121h();
        }

        /* renamed from: h */
        public final void mo11121h() {
            this.f6857a.unregisterAdapterDataObserver(this);
            Preference preference = this.f6859c;
            int c = preference != null ? ((PreferenceGroup.C3031b) this.f6857a).mo11158c(preference) : ((PreferenceGroup.C3031b) this.f6857a).mo11159g(this.f6860d);
            if (c != -1) {
                this.f6858b.scrollToPosition(c);
            }
        }
    }

    private void postBindPreferences() {
        if (!this.mHandler.hasMessages(1)) {
            this.mHandler.obtainMessage(1).sendToTarget();
        }
    }

    private void requirePreferenceManager() {
        if (this.mPreferenceManager == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    private void scrollToPreferenceInternal(Preference preference, String str) {
        C3015c cVar = new C3015c(preference, str);
        if (this.mList == null) {
            this.mSelectPreferenceRunnable = cVar;
        } else {
            cVar.run();
        }
    }

    private void unbindPreferences() {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            preferenceScreen.mo11061p();
        }
        onUnbindPreferences();
    }

    @Deprecated
    public void addPreferencesFromResource(int i) {
        requirePreferenceManager();
        setPreferenceScreen(this.mPreferenceManager.mo11206c(this.mStyledContext, i, getPreferenceScreen()));
    }

    public void bindPreferences() {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            getListView().setAdapter(onCreateAdapter(preferenceScreen));
            preferenceScreen.mo11059l();
        }
        onBindPreferences();
    }

    @Deprecated
    public <T extends Preference> T findPreference(CharSequence charSequence) {
        PreferenceScreen preferenceScreen;
        C3045f fVar = this.mPreferenceManager;
        if (fVar == null || (preferenceScreen = fVar.f6943h) == null) {
            return null;
        }
        return preferenceScreen.mo11149M(charSequence);
    }

    public Fragment getCallbackFragment() {
        return null;
    }

    @Deprecated
    public final RecyclerView getListView() {
        return this.mList;
    }

    @Deprecated
    public C3045f getPreferenceManager() {
        return this.mPreferenceManager;
    }

    @Deprecated
    public PreferenceScreen getPreferenceScreen() {
        return this.mPreferenceManager.f6943h;
    }

    public void onBindPreferences() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), i);
        this.mStyledContext = contextThemeWrapper;
        C3045f fVar = new C3045f(contextThemeWrapper);
        this.mPreferenceManager = fVar;
        fVar.f6946k = this;
        onCreatePreferences(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Deprecated
    public RecyclerView.Adapter onCreateAdapter(PreferenceScreen preferenceScreen) {
        return new C3040c(preferenceScreen);
    }

    @Deprecated
    public RecyclerView.C3100o onCreateLayoutManager() {
        getActivity();
        return new LinearLayoutManager();
    }

    @Deprecated
    public abstract void onCreatePreferences(Bundle bundle, String str);

    @Deprecated
    public RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (this.mStyledContext.getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(onCreateLayoutManager());
        recyclerView2.setAccessibilityDelegateCompat(new C3049g(recyclerView2));
        return recyclerView2;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = this.mStyledContext;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C0114h.f172i, C8299j.m16588a(R.attr.preferenceFragmentStyle, context, 16844038), 0);
        this.mLayoutResId = obtainStyledAttributes.getResourceId(0, this.mLayoutResId);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(this.mStyledContext);
        View inflate = cloneInContext.inflate(this.mLayoutResId, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView onCreateRecyclerView = onCreateRecyclerView(cloneInContext, viewGroup2, bundle);
            if (onCreateRecyclerView != null) {
                this.mList = onCreateRecyclerView;
                onCreateRecyclerView.addItemDecoration(this.mDividerDecoration);
                setDivider(drawable);
                if (dimensionPixelSize != -1) {
                    setDividerHeight(dimensionPixelSize);
                }
                this.mDividerDecoration.f6855c = z;
                if (this.mList.getParent() == null) {
                    viewGroup2.addView(this.mList);
                }
                this.mHandler.post(this.mRequestFocus);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    public void onDestroyView() {
        this.mHandler.removeCallbacks(this.mRequestFocus);
        this.mHandler.removeMessages(1);
        if (this.mHavePrefs) {
            unbindPreferences();
        }
        this.mList = null;
        super.onDestroyView();
    }

    @Deprecated
    public void onDisplayPreferenceDialog(Preference preference) {
        DialogFragment dialogFragment;
        boolean a = getCallbackFragment() instanceof C3017e ? ((C3017e) getCallbackFragment()).mo11112a() : false;
        if (!a && (getActivity() instanceof C3017e)) {
            a = ((C3017e) getActivity()).mo11112a();
        }
        if (!a && getFragmentManager().findFragmentByTag(DIALOG_FRAGMENT_TAG) == null) {
            if (preference instanceof EditTextPreference) {
                dialogFragment = EditTextPreferenceDialogFragment.newInstance(preference.f6832m);
            } else if (preference instanceof ListPreference) {
                dialogFragment = ListPreferenceDialogFragment.newInstance(preference.f6832m);
            } else if (preference instanceof MultiSelectListPreference) {
                dialogFragment = MultiSelectListPreferenceDialogFragment.newInstance(preference.f6832m);
            } else {
                throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
            }
            dialogFragment.setTargetFragment(this, 0);
            dialogFragment.show(getFragmentManager(), DIALOG_FRAGMENT_TAG);
        }
    }

    @Deprecated
    public void onNavigateToScreen(PreferenceScreen preferenceScreen) {
        if (!(getCallbackFragment() instanceof C3019g ? ((C3019g) getCallbackFragment()).mo11114a() : false) && (getActivity() instanceof C3019g)) {
            ((C3019g) getActivity()).mo11114a();
        }
    }

    @Deprecated
    public boolean onPreferenceTreeClick(Preference preference) {
        boolean z = false;
        if (preference.f6834o == null) {
            return false;
        }
        if (getCallbackFragment() instanceof C3018f) {
            z = ((C3018f) getCallbackFragment()).mo11113a();
        }
        return (z || !(getActivity() instanceof C3018f)) ? z : ((C3018f) getActivity()).mo11113a();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.mo11054e(bundle2);
            bundle.putBundle(PREFERENCES_TAG, bundle2);
        }
    }

    public void onStart() {
        super.onStart();
        C3045f fVar = this.mPreferenceManager;
        fVar.f6944i = this;
        fVar.f6945j = this;
    }

    public void onStop() {
        super.onStop();
        C3045f fVar = this.mPreferenceManager;
        fVar.f6944i = null;
        fVar.f6945j = null;
    }

    public void onUnbindPreferences() {
    }

    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreen;
        super.onViewCreated(view, bundle);
        if (!(bundle == null || (bundle2 = bundle.getBundle(PREFERENCES_TAG)) == null || (preferenceScreen = getPreferenceScreen()) == null)) {
            preferenceScreen.mo11052c(bundle2);
        }
        if (this.mHavePrefs) {
            bindPreferences();
            Runnable runnable = this.mSelectPreferenceRunnable;
            if (runnable != null) {
                runnable.run();
                this.mSelectPreferenceRunnable = null;
            }
        }
        this.mInitDone = true;
    }

    @Deprecated
    public void scrollToPreference(String str) {
        scrollToPreferenceInternal((Preference) null, str);
    }

    @Deprecated
    public void setDivider(Drawable drawable) {
        C3016d dVar = this.mDividerDecoration;
        if (drawable != null) {
            dVar.getClass();
            dVar.f6854b = drawable.getIntrinsicHeight();
        } else {
            dVar.f6854b = 0;
        }
        dVar.f6853a = drawable;
        PreferenceFragment.this.mList.invalidateItemDecorations();
    }

    @Deprecated
    public void setDividerHeight(int i) {
        C3016d dVar = this.mDividerDecoration;
        dVar.f6854b = i;
        PreferenceFragment.this.mList.invalidateItemDecorations();
    }

    @Deprecated
    public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
        boolean z;
        C3045f fVar = this.mPreferenceManager;
        PreferenceScreen preferenceScreen2 = fVar.f6943h;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.mo11061p();
            }
            fVar.f6943h = preferenceScreen;
            z = true;
        } else {
            z = false;
        }
        if (z && preferenceScreen != null) {
            onUnbindPreferences();
            this.mHavePrefs = true;
            if (this.mInitDone) {
                postBindPreferences();
            }
        }
    }

    @Deprecated
    public void setPreferencesFromResource(int i, String str) {
        requirePreferenceManager();
        PreferenceScreen c = this.mPreferenceManager.mo11206c(this.mStyledContext, i, (PreferenceScreen) null);
        Object obj = c;
        if (str != null) {
            Object M = c.mo11149M(str);
            boolean z = M instanceof PreferenceScreen;
            obj = M;
            if (!z) {
                throw new IllegalArgumentException(C0048b.m163a("Preference object with key ", str, " is not a PreferenceScreen"));
            }
        }
        setPreferenceScreen((PreferenceScreen) obj);
    }

    @Deprecated
    public void scrollToPreference(Preference preference) {
        scrollToPreferenceInternal(preference, (String) null);
    }
}
