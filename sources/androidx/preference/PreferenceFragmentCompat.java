package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0114h;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.preference.C3045f;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import p010a9.C0048b;

public abstract class PreferenceFragmentCompat extends Fragment implements C3045f.C3048c, C3045f.C3046a, C3045f.C3047b, DialogPreference.C2994a {
    public static final String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private static final String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    private static final int MSG_BIND_PREFERENCES = 1;
    private static final String PREFERENCES_TAG = "android:preferences";
    private static final String TAG = "PreferenceFragment";
    private final C3024d mDividerDecoration = new C3024d();
    private Handler mHandler = new C3021a();
    private boolean mHavePrefs;
    private boolean mInitDone;
    private int mLayoutResId = R.layout.preference_list_fragment;
    public RecyclerView mList;
    private C3045f mPreferenceManager;
    private final Runnable mRequestFocus = new C3022b();
    private Runnable mSelectPreferenceRunnable;

    /* renamed from: androidx.preference.PreferenceFragmentCompat$a */
    public class C3021a extends Handler {
        public C3021a() {
        }

        public final void handleMessage(Message message) {
            if (message.what == 1) {
                PreferenceFragmentCompat.this.bindPreferences();
            }
        }
    }

    /* renamed from: androidx.preference.PreferenceFragmentCompat$b */
    public class C3022b implements Runnable {
        public C3022b() {
        }

        public final void run() {
            RecyclerView recyclerView = PreferenceFragmentCompat.this.mList;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* renamed from: androidx.preference.PreferenceFragmentCompat$c */
    public class C3023c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Preference f6863b;

        /* renamed from: c */
        public final /* synthetic */ String f6864c;

        public C3023c(Preference preference, String str) {
            this.f6863b = preference;
            this.f6864c = str;
        }

        public final void run() {
            RecyclerView.Adapter adapter = PreferenceFragmentCompat.this.mList.getAdapter();
            if (adapter instanceof PreferenceGroup.C3031b) {
                Preference preference = this.f6863b;
                int c = preference != null ? ((PreferenceGroup.C3031b) adapter).mo11158c(preference) : ((PreferenceGroup.C3031b) adapter).mo11159g(this.f6864c);
                if (c != -1) {
                    PreferenceFragmentCompat.this.mList.scrollToPosition(c);
                } else {
                    adapter.registerAdapterDataObserver(new C3028h(adapter, PreferenceFragmentCompat.this.mList, this.f6863b, this.f6864c));
                }
            } else if (adapter != null) {
                throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
            }
        }
    }

    /* renamed from: androidx.preference.PreferenceFragmentCompat$d */
    public class C3024d extends RecyclerView.C3099n {

        /* renamed from: a */
        public Drawable f6866a;

        /* renamed from: b */
        public int f6867b;

        /* renamed from: c */
        public boolean f6868c = true;

        public C3024d() {
        }

        /* renamed from: f */
        public final boolean mo11143f(View view, RecyclerView recyclerView) {
            RecyclerView.C3084b0 childViewHolder = recyclerView.getChildViewHolder(view);
            boolean z = false;
            if (!((childViewHolder instanceof C3051h) && ((C3051h) childViewHolder).f6953d)) {
                return false;
            }
            boolean z2 = this.f6868c;
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
            if (mo11143f(view, recyclerView)) {
                rect.bottom = this.f6867b;
            }
        }

        public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
            if (this.f6866a != null) {
                int childCount = recyclerView.getChildCount();
                int width = recyclerView.getWidth();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    if (mo11143f(childAt, recyclerView)) {
                        int height = childAt.getHeight() + ((int) childAt.getY());
                        this.f6866a.setBounds(0, height, width, this.f6867b + height);
                        this.f6866a.draw(canvas);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.preference.PreferenceFragmentCompat$e */
    public interface C3025e {
        /* renamed from: a */
        boolean mo11144a();
    }

    /* renamed from: androidx.preference.PreferenceFragmentCompat$f */
    public interface C3026f {
        /* renamed from: a */
        boolean mo11145a();
    }

    /* renamed from: androidx.preference.PreferenceFragmentCompat$g */
    public interface C3027g {
        /* renamed from: a */
        boolean mo11146a();
    }

    /* renamed from: androidx.preference.PreferenceFragmentCompat$h */
    public static class C3028h extends RecyclerView.C3091i {

        /* renamed from: a */
        public final RecyclerView.Adapter f6870a;

        /* renamed from: b */
        public final RecyclerView f6871b;

        /* renamed from: c */
        public final Preference f6872c;

        /* renamed from: d */
        public final String f6873d;

        public C3028h(RecyclerView.Adapter adapter, RecyclerView recyclerView, Preference preference, String str) {
            this.f6870a = adapter;
            this.f6871b = recyclerView;
            this.f6872c = preference;
            this.f6873d = str;
        }

        /* renamed from: a */
        public final void mo11115a() {
            mo11147h();
        }

        /* renamed from: b */
        public final void mo11116b() {
            mo11147h();
        }

        /* renamed from: c */
        public final void mo11117c(int i, int i2, Object obj) {
            mo11147h();
        }

        /* renamed from: d */
        public final void mo11118d(int i, int i2) {
            mo11147h();
        }

        /* renamed from: e */
        public final void mo11119e(int i, int i2) {
            mo11147h();
        }

        /* renamed from: f */
        public final void mo11120f(int i, int i2) {
            mo11147h();
        }

        /* renamed from: h */
        public final void mo11147h() {
            this.f6870a.unregisterAdapterDataObserver(this);
            Preference preference = this.f6872c;
            int c = preference != null ? ((PreferenceGroup.C3031b) this.f6870a).mo11158c(preference) : ((PreferenceGroup.C3031b) this.f6870a).mo11159g(this.f6873d);
            if (c != -1) {
                this.f6871b.scrollToPosition(c);
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
        C3023c cVar = new C3023c(preference, str);
        if (this.mList == null) {
            this.mSelectPreferenceRunnable = cVar;
        } else {
            cVar.run();
        }
    }

    private void unbindPreferences() {
        getListView().setAdapter((RecyclerView.Adapter) null);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            preferenceScreen.mo11061p();
        }
        onUnbindPreferences();
    }

    public void addPreferencesFromResource(int i) {
        requirePreferenceManager();
        setPreferenceScreen(this.mPreferenceManager.mo11206c(getContext(), i, getPreferenceScreen()));
    }

    public void bindPreferences() {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            getListView().setAdapter(onCreateAdapter(preferenceScreen));
            preferenceScreen.mo11059l();
        }
        onBindPreferences();
    }

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

    public final RecyclerView getListView() {
        return this.mList;
    }

    public C3045f getPreferenceManager() {
        return this.mPreferenceManager;
    }

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
        getActivity().getTheme().applyStyle(i, false);
        C3045f fVar = new C3045f(getContext());
        this.mPreferenceManager = fVar;
        fVar.f6946k = this;
        onCreatePreferences(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    public RecyclerView.Adapter onCreateAdapter(PreferenceScreen preferenceScreen) {
        return new C3040c(preferenceScreen);
    }

    public RecyclerView.C3100o onCreateLayoutManager() {
        getContext();
        return new LinearLayoutManager();
    }

    public abstract void onCreatePreferences(Bundle bundle, String str);

    public RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (getContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(onCreateLayoutManager());
        recyclerView2.setAccessibilityDelegateCompat(new C3049g(recyclerView2));
        return recyclerView2;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C0114h.f173j, R.attr.preferenceFragmentCompatStyle, 0);
        this.mLayoutResId = obtainStyledAttributes.getResourceId(0, this.mLayoutResId);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(getContext());
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
                this.mDividerDecoration.f6868c = z;
                if (this.mList.getParent() == null) {
                    viewGroup2.addView(this.mList);
                }
                this.mHandler.post(this.mRequestFocus);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
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

    public void onDisplayPreferenceDialog(Preference preference) {
        DialogFragment dialogFragment;
        boolean a = getCallbackFragment() instanceof C3025e ? ((C3025e) getCallbackFragment()).mo11144a() : false;
        if (!a && (getActivity() instanceof C3025e)) {
            a = ((C3025e) getActivity()).mo11144a();
        }
        if (!a && getFragmentManager().mo10353C(DIALOG_FRAGMENT_TAG) == null) {
            if (preference instanceof EditTextPreference) {
                dialogFragment = EditTextPreferenceDialogFragmentCompat.newInstance(preference.f6832m);
            } else if (preference instanceof ListPreference) {
                dialogFragment = ListPreferenceDialogFragmentCompat.newInstance(preference.f6832m);
            } else if (preference instanceof MultiSelectListPreference) {
                dialogFragment = MultiSelectListPreferenceDialogFragmentCompat.newInstance(preference.f6832m);
            } else {
                StringBuilder h = C0072d.m201h("Cannot display dialog for an unknown Preference type: ");
                h.append(preference.getClass().getSimpleName());
                h.append(". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                throw new IllegalArgumentException(h.toString());
            }
            dialogFragment.setTargetFragment(this, 0);
            dialogFragment.show(getFragmentManager(), DIALOG_FRAGMENT_TAG);
        }
    }

    public void onNavigateToScreen(PreferenceScreen preferenceScreen) {
        if (!(getCallbackFragment() instanceof C3027g ? ((C3027g) getCallbackFragment()).mo11146a() : false) && (getActivity() instanceof C3027g)) {
            ((C3027g) getActivity()).mo11146a();
        }
    }

    public boolean onPreferenceTreeClick(Preference preference) {
        if (preference.f6834o == null) {
            return false;
        }
        boolean a = getCallbackFragment() instanceof C3026f ? ((C3026f) getCallbackFragment()).mo11145a() : false;
        if (!a && (getActivity() instanceof C3026f)) {
            a = ((C3026f) getActivity()).mo11145a();
        }
        if (a) {
            return true;
        }
        Log.w(TAG, "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        if (preference.f6835p == null) {
            preference.f6835p = new Bundle();
        }
        Bundle bundle = preference.f6835p;
        Fragment a2 = supportFragmentManager.mo10357G().mo10411a(requireActivity().getClassLoader(), preference.f6834o);
        a2.setArguments(bundle);
        a2.setTargetFragment(this, 0);
        C2740a aVar = new C2740a(supportFragmentManager);
        aVar.mo10531h(((View) getView().getParent()).getId(), a2, (String) null);
        aVar.mo10529c((String) null);
        aVar.mo10483d();
        return true;
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

    public void scrollToPreference(String str) {
        scrollToPreferenceInternal((Preference) null, str);
    }

    public void setDivider(Drawable drawable) {
        C3024d dVar = this.mDividerDecoration;
        if (drawable != null) {
            dVar.getClass();
            dVar.f6867b = drawable.getIntrinsicHeight();
        } else {
            dVar.f6867b = 0;
        }
        dVar.f6866a = drawable;
        PreferenceFragmentCompat.this.mList.invalidateItemDecorations();
    }

    public void setDividerHeight(int i) {
        C3024d dVar = this.mDividerDecoration;
        dVar.f6867b = i;
        PreferenceFragmentCompat.this.mList.invalidateItemDecorations();
    }

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

    public void setPreferencesFromResource(int i, String str) {
        requirePreferenceManager();
        PreferenceScreen c = this.mPreferenceManager.mo11206c(getContext(), i, (PreferenceScreen) null);
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

    public void scrollToPreference(Preference preference) {
        scrollToPreferenceInternal(preference, (String) null);
    }
}
