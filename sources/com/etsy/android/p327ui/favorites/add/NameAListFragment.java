package com.etsy.android.p327ui.favorites.add;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.appboy.p043ui.C4954i;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.p327ui.view.AlertData;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.stylekit.views.CollageSwitch;
import com.etsy.android.stylekit.views.CollageTextInput;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$ObjectRef;
import p260v0.C8184a;
import p377jf.C12979a;
import p440s9.C13366a;
import p456ua.C13461f;
import p496za.C13943a;

/* renamed from: com.etsy.android.ui.favorites.add.NameAListFragment */
public final class NameAListFragment extends TrackingBaseFragment implements C13366a {
    public static final int $stable = 8;
    public static final C9747a Companion = new C9747a();
    public static final String TAG = "NameAListFragment";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private Handler inAnimSequenceHandler;
    private Handler outAnimSequenceHandler;
    public C13943a preferencesProvider;
    public NameAListPresenter presenter;
    public C13461f rxSchedulers;

    /* renamed from: com.etsy.android.ui.favorites.add.NameAListFragment$a */
    public static final class C9747a {
    }

    /* access modifiers changed from: private */
    /* renamed from: back$lambda-10  reason: not valid java name */
    public static final void m34973back$lambda10(NameAListFragment nameAListFragment, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
        Handler handler;
        Handler handler2;
        C19383o.m32797g(nameAListFragment, "this$0");
        C19383o.m32797g(ref$ObjectRef, "$peekHeightRunnable");
        C19383o.m32797g(ref$ObjectRef2, "$goBackRunnable");
        if (nameAListFragment.getView() == null || !nameAListFragment.isResumed()) {
            Handler handler3 = nameAListFragment.inAnimSequenceHandler;
            if (handler3 != null) {
                handler3.removeCallbacksAndMessages((Object) null);
                return;
            }
            return;
        }
        Fragment parentFragment = nameAListFragment.getParentFragment();
        BottomSheetDialogFragment bottomSheetDialogFragment = parentFragment instanceof BottomSheetDialogFragment ? (BottomSheetDialogFragment) parentFragment : null;
        Dialog dialog = bottomSheetDialogFragment != null ? bottomSheetDialogFragment.getDialog() : null;
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        BottomSheetBehavior<FrameLayout> behavior = bottomSheetDialog != null ? bottomSheetDialog.getBehavior() : null;
        Bundle arguments = nameAListFragment.getArguments();
        int i = -1;
        int i2 = arguments != null ? arguments.getInt(AddToListContainerFragment.BOTTOM_SHEET_PEEK_HEIGHT) : -1;
        Bundle arguments2 = nameAListFragment.getArguments();
        int i3 = arguments2 != null ? arguments2.getInt(AddToListContainerFragment.BOTTOM_SHEET_STATE) : -1;
        if (behavior != null) {
            i = behavior.getState();
        }
        boolean z = false;
        boolean z2 = i == 4;
        if (i3 == 4) {
            z = true;
        }
        if (!z2 || !z) {
            Fragment parentFragment2 = nameAListFragment.getParentFragment();
            AddToListContainerFragment addToListContainerFragment = parentFragment2 instanceof AddToListContainerFragment ? (AddToListContainerFragment) parentFragment2 : null;
            if (addToListContainerFragment != null) {
                addToListContainerFragment.back();
            }
            Runnable runnable = (Runnable) ref$ObjectRef.element;
            if (!(runnable == null || (handler = nameAListFragment.outAnimSequenceHandler) == null)) {
                handler.removeCallbacks(runnable);
            }
            Handler handler4 = nameAListFragment.outAnimSequenceHandler;
            if (handler4 != null) {
                handler4.removeCallbacksAndMessages((Object) null);
            }
            nameAListFragment.outAnimSequenceHandler = null;
            return;
        }
        Runnable runnable2 = (Runnable) ref$ObjectRef.element;
        if (!(runnable2 == null || (handler2 = nameAListFragment.outAnimSequenceHandler) == null)) {
            handler2.removeCallbacks(runnable2);
        }
        Handler handler5 = nameAListFragment.outAnimSequenceHandler;
        if (handler5 != null) {
            handler5.removeCallbacksAndMessages((Object) null);
        }
        if (behavior != null) {
            behavior.setPeekHeight(i2, true);
        }
        Handler handler6 = nameAListFragment.outAnimSequenceHandler;
        if (handler6 != null) {
            handler6.postDelayed((Runnable) ref$ObjectRef2.element, 250);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: back$lambda-7  reason: not valid java name */
    public static final void m34974back$lambda7(NameAListFragment nameAListFragment, Ref$ObjectRef ref$ObjectRef) {
        Handler handler;
        C19383o.m32797g(nameAListFragment, "this$0");
        C19383o.m32797g(ref$ObjectRef, "$goBackRunnable");
        Fragment parentFragment = nameAListFragment.getParentFragment();
        AddToListContainerFragment addToListContainerFragment = parentFragment instanceof AddToListContainerFragment ? (AddToListContainerFragment) parentFragment : null;
        if (addToListContainerFragment != null) {
            addToListContainerFragment.back();
        }
        Runnable runnable = (Runnable) ref$ObjectRef.element;
        if (!(runnable == null || (handler = nameAListFragment.outAnimSequenceHandler) == null)) {
            handler.removeCallbacks(runnable);
        }
        Handler handler2 = nameAListFragment.outAnimSequenceHandler;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages((Object) null);
        }
        nameAListFragment.outAnimSequenceHandler = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: onStart$lambda-1  reason: not valid java name */
    public static final void m34975onStart$lambda1(NameAListFragment nameAListFragment, Ref$ObjectRef ref$ObjectRef) {
        Handler handler;
        CollageTextInput collageTextInput;
        C19383o.m32797g(nameAListFragment, "this$0");
        C19383o.m32797g(ref$ObjectRef, "$requestFocusRunnable");
        View view = nameAListFragment.getView();
        if (!(view == null || (collageTextInput = (CollageTextInput) view.findViewById(R.id.name_input)) == null)) {
            collageTextInput.requestFocus();
        }
        Runnable runnable = (Runnable) ref$ObjectRef.element;
        if (!(runnable == null || (handler = nameAListFragment.inAnimSequenceHandler) == null)) {
            handler.removeCallbacks(runnable);
        }
        Handler handler2 = nameAListFragment.inAnimSequenceHandler;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages((Object) null);
        }
        nameAListFragment.inAnimSequenceHandler = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: onStart$lambda-3  reason: not valid java name */
    public static final void m34976onStart$lambda3(NameAListFragment nameAListFragment, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
        Handler handler;
        CollageSwitch collageSwitch;
        CollageSwitch collageSwitch2;
        C19383o.m32797g(nameAListFragment, "this$0");
        C19383o.m32797g(ref$ObjectRef, "$peekHeightRunnable");
        C19383o.m32797g(ref$ObjectRef2, "$requestFocusRunnable");
        if (nameAListFragment.getView() == null || !nameAListFragment.isResumed()) {
            Handler handler2 = nameAListFragment.inAnimSequenceHandler;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages((Object) null);
                return;
            }
            return;
        }
        Fragment parentFragment = nameAListFragment.getParentFragment();
        BottomSheetDialogFragment bottomSheetDialogFragment = parentFragment instanceof BottomSheetDialogFragment ? (BottomSheetDialogFragment) parentFragment : null;
        Dialog dialog = bottomSheetDialogFragment != null ? bottomSheetDialogFragment.getDialog() : null;
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        BottomSheetBehavior<FrameLayout> behavior = bottomSheetDialog != null ? bottomSheetDialog.getBehavior() : null;
        View view = nameAListFragment.getView();
        int i = 0;
        int i2 = view != null ? ViewExtensions.m12857a(view).heightPixels : 0;
        Rect rect = new Rect();
        View view2 = nameAListFragment.getView();
        if (view2 != null) {
            view2.getWindowVisibleDisplayFrame(rect);
        }
        int i3 = i2 - rect.bottom;
        View view3 = nameAListFragment.getView();
        int bottom = (view3 == null || (collageSwitch2 = (CollageSwitch) view3.findViewById(R.id.privacy_switch)) == null) ? 0 : collageSwitch2.getBottom();
        View view4 = nameAListFragment.getView();
        if (!(view4 == null || (collageSwitch = (CollageSwitch) view4.findViewById(R.id.privacy_switch)) == null)) {
            i = collageSwitch.getHeight();
        }
        int i4 = ((i2 - bottom) - i) + i3;
        if (behavior != null) {
            behavior.setPeekHeight(i4, true);
        }
        Runnable runnable = (Runnable) ref$ObjectRef.element;
        if (!(runnable == null || (handler = nameAListFragment.inAnimSequenceHandler) == null)) {
            handler.removeCallbacks(runnable);
        }
        Handler handler3 = nameAListFragment.inAnimSequenceHandler;
        if (handler3 != null) {
            handler3.removeCallbacksAndMessages((Object) null);
        }
        Handler handler4 = nameAListFragment.inAnimSequenceHandler;
        if (handler4 != null) {
            handler4.postDelayed((Runnable) ref$ObjectRef2.element, 250);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onStart$lambda-5  reason: not valid java name */
    public static final void m34977onStart$lambda5(NameAListFragment nameAListFragment, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
        Handler handler;
        C19383o.m32797g(nameAListFragment, "this$0");
        C19383o.m32797g(ref$ObjectRef, "$showKeyboardRunnable");
        C19383o.m32797g(ref$ObjectRef2, "$peekHeightRunnable");
        if (nameAListFragment.getView() == null || !nameAListFragment.isResumed()) {
            Handler handler2 = nameAListFragment.inAnimSequenceHandler;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages((Object) null);
                return;
            }
            return;
        }
        View view = nameAListFragment.getView();
        if (view != null) {
            Object systemService = view.getContext().getSystemService("input_method");
            C19383o.m32795e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).toggleSoftInput(2, 0);
        }
        Runnable runnable = (Runnable) ref$ObjectRef.element;
        if (!(runnable == null || (handler = nameAListFragment.inAnimSequenceHandler) == null)) {
            handler.removeCallbacks(runnable);
        }
        Handler handler3 = nameAListFragment.inAnimSequenceHandler;
        if (handler3 != null) {
            handler3.removeCallbacksAndMessages((Object) null);
        }
        Handler handler4 = nameAListFragment.inAnimSequenceHandler;
        if (handler4 != null) {
            handler4.postDelayed((Runnable) ref$ObjectRef2.element, 300);
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void back() {
        this.outAnimSequenceHandler = new Handler();
        View view = getView();
        if (view != null) {
            ViewExtensions.m12862f(view);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new C9787v(0, this, ref$ObjectRef);
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        T iVar = new C4954i(this, 1, ref$ObjectRef2, ref$ObjectRef);
        ref$ObjectRef2.element = iVar;
        Handler handler = this.outAnimSequenceHandler;
        if (handler != null) {
            handler.postDelayed((Runnable) iVar, 250);
        }
    }

    public final void done() {
        View view = getView();
        if (view != null) {
            ViewExtensions.m12862f(view);
        }
        Fragment parentFragment = getParentFragment();
        AddToListContainerFragment addToListContainerFragment = parentFragment instanceof AddToListContainerFragment ? (AddToListContainerFragment) parentFragment : null;
        if (addToListContainerFragment != null) {
            addToListContainerFragment.dismiss();
        }
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C13943a getPreferencesProvider() {
        C13943a aVar = this.preferencesProvider;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("preferencesProvider");
        throw null;
    }

    public final NameAListPresenter getPresenter() {
        NameAListPresenter nameAListPresenter = this.presenter;
        if (nameAListPresenter != null) {
            return nameAListPresenter;
        }
        C19383o.m32805o("presenter");
        throw null;
    }

    public final C13461f getRxSchedulers() {
        C13461f fVar = this.rxSchedulers;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("rxSchedulers");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_name_a_list_add, viewGroup, false);
        C19383o.m32796f(inflate, "inflater.inflate(R.layou…st_add, container, false)");
        return inflate;
    }

    public void onDestroyView() {
        NameAListPresenter presenter2 = getPresenter();
        presenter2.f21572e.mo19405d();
        presenter2.f21573f.mo19405d();
        ((CollageTextInput) presenter2.f21568a._$_findCachedViewById(R.id.name_input)).setTextChangeListener((TextWatcher) null);
        Handler handler = this.inAnimSequenceHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        Handler handler2 = this.outAnimSequenceHandler;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages((Object) null);
        }
        this.inAnimSequenceHandler = null;
        this.outAnimSequenceHandler = null;
        super.onDestroyView();
    }

    public void onStart() {
        super.onStart();
        this.inAnimSequenceHandler = new Handler();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new C9784s(0, this, ref$ObjectRef);
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ref$ObjectRef2.element = new C9785t(this, ref$ObjectRef2, ref$ObjectRef);
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        T uVar = new C9786u(this, ref$ObjectRef3, ref$ObjectRef2);
        ref$ObjectRef3.element = uVar;
        Handler handler = this.inAnimSequenceHandler;
        if (handler != null) {
            handler.postDelayed((Runnable) uVar, 150);
        }
    }

    /* JADX WARNING: type inference failed for: r1v12, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            super.onViewCreated(r7, r8)
            androidx.fragment.app.Fragment r7 = r6.getParentFragment()
            boolean r8 = r7 instanceof com.etsy.android.p327ui.favorites.add.AddToListContainerFragment
            r0 = 0
            if (r8 == 0) goto L_0x0014
            com.etsy.android.ui.favorites.add.AddToListContainerFragment r7 = (com.etsy.android.p327ui.favorites.add.AddToListContainerFragment) r7
            goto L_0x0015
        L_0x0014:
            r7 = r0
        L_0x0015:
            if (r7 == 0) goto L_0x001c
            com.etsy.android.lib.models.interfaces.ListingLike r7 = r7.getListing()
            goto L_0x001d
        L_0x001c:
            r7 = r0
        L_0x001d:
            if (r7 == 0) goto L_0x013f
            com.etsy.android.ui.favorites.add.NameAListPresenter r8 = r6.getPresenter()
            r8.getClass()
            r8.f21571d = r7
            com.etsy.android.ui.favorites.add.NameAListFragment r1 = r8.f21568a
            android.view.View r1 = r1.getView()
            if (r1 == 0) goto L_0x0043
            r2 = 2131429050(0x7f0b06ba, float:1.8479762E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            if (r1 == 0) goto L_0x0043
            com.etsy.android.ui.favorites.add.NameAListPresenter$setListeners$1 r2 = new com.etsy.android.ui.favorites.add.NameAListPresenter$setListeners$1
            r2.<init>(r8)
            com.etsy.android.extensions.ViewExtensions.m12866j(r1, r2)
        L_0x0043:
            com.etsy.android.ui.favorites.add.NameAListFragment r1 = r8.f21568a
            android.view.View r1 = r1.getView()
            r2 = 2131428098(0x7f0b0302, float:1.847783E38)
            if (r1 == 0) goto L_0x005e
            android.view.View r1 = r1.findViewById(r2)
            android.widget.Button r1 = (android.widget.Button) r1
            if (r1 == 0) goto L_0x005e
            com.etsy.android.ui.favorites.add.NameAListPresenter$setListeners$2 r3 = new com.etsy.android.ui.favorites.add.NameAListPresenter$setListeners$2
            r3.<init>(r8)
            com.etsy.android.extensions.ViewExtensions.m12866j(r1, r3)
        L_0x005e:
            com.etsy.android.ui.favorites.add.NameAListFragment r1 = r8.f21568a
            android.view.View r1 = r1.getView()
            r3 = 2131429306(0x7f0b07ba, float:1.848028E38)
            if (r1 == 0) goto L_0x0076
            android.view.View r1 = r1.findViewById(r3)
            com.etsy.android.stylekit.views.CollageSwitch r1 = (com.etsy.android.stylekit.views.CollageSwitch) r1
            if (r1 == 0) goto L_0x0076
            com.etsy.android.ui.favorites.add.w r4 = r8.f21575h
            r1.setOnCheckedChangeListener((android.widget.CompoundButton.OnCheckedChangeListener) r4)
        L_0x0076:
            com.etsy.android.ui.favorites.add.NameAListFragment r1 = r8.f21568a
            android.view.View r1 = r1.getView()
            r4 = 2131429305(0x7f0b07b9, float:1.8480279E38)
            if (r1 == 0) goto L_0x0088
            android.view.View r1 = r1.findViewById(r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L_0x0089
        L_0x0088:
            r1 = r0
        L_0x0089:
            if (r1 != 0) goto L_0x008c
            goto L_0x0093
        L_0x008c:
            android.text.method.MovementMethod r5 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r5)
        L_0x0093:
            com.etsy.android.ui.favorites.add.NameAListFragment r1 = r8.f21568a
            android.view.View r1 = r1.getView()
            if (r1 == 0) goto L_0x00ac
            android.view.View r1 = r1.findViewById(r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x00ac
            com.etsy.android.ui.favorites.add.x r4 = new com.etsy.android.ui.favorites.add.x
            r5 = 0
            r4.<init>(r8, r5)
            r1.setOnClickListener(r4)
        L_0x00ac:
            com.etsy.android.ui.favorites.add.NameAListFragment r1 = r8.f21568a
            android.view.View r1 = r1.getView()
            boolean r4 = r1 instanceof com.etsy.android.p327ui.favorites.add.NameAListView
            if (r4 == 0) goto L_0x00b9
            r0 = r1
            com.etsy.android.ui.favorites.add.NameAListView r0 = (com.etsy.android.p327ui.favorites.add.NameAListView) r0
        L_0x00b9:
            if (r0 == 0) goto L_0x00c2
            com.etsy.android.lib.models.apiv3.listing.ListingImage r7 = r7.getListingImage()
            r0.setListImage(r7)
        L_0x00c2:
            r7 = 2131429049(0x7f0b06b9, float:1.847976E38)
            if (r0 == 0) goto L_0x00d4
            android.view.View r0 = r0._$_findCachedViewById(r7)
            com.etsy.android.stylekit.views.CollageTextInput r0 = (com.etsy.android.stylekit.views.CollageTextInput) r0
            if (r0 == 0) goto L_0x00d4
            com.etsy.android.ui.favorites.add.NameAListPresenter$textWatcher$1 r1 = r8.f21576i
            r0.setTextChangeListener(r1)
        L_0x00d4:
            com.etsy.android.ui.favorites.add.NameAListFragment r0 = r8.f21568a
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L_0x00f0
            android.view.View r7 = r0.findViewById(r7)
            com.etsy.android.stylekit.views.CollageTextInput r7 = (com.etsy.android.stylekit.views.CollageTextInput) r7
            if (r7 == 0) goto L_0x00f0
            com.etsy.android.ui.favorites.add.NameAListFragment r0 = r8.f21568a
            r1 = 2131952048(0x7f1301b0, float:1.9540528E38)
            java.lang.String r0 = r0.getString(r1)
            r7.setLabelText(r0)
        L_0x00f0:
            com.etsy.android.ui.favorites.add.NameAListFragment r7 = r8.f21568a
            android.view.View r7 = r7.getView()
            if (r7 == 0) goto L_0x010c
            android.view.View r7 = r7.findViewById(r3)
            com.etsy.android.stylekit.views.CollageSwitch r7 = (com.etsy.android.stylekit.views.CollageSwitch) r7
            if (r7 == 0) goto L_0x010c
            com.etsy.android.ui.favorites.add.NameAListFragment r0 = r8.f21568a
            r1 = 2131952053(0x7f1301b5, float:1.9540538E38)
            java.lang.String r0 = r0.getString(r1)
            r7.setTitle(r0)
        L_0x010c:
            com.etsy.android.ui.favorites.add.NameAListFragment r7 = r8.f21568a
            android.view.View r7 = r7.getView()
            if (r7 == 0) goto L_0x0128
            android.view.View r7 = r7.findViewById(r3)
            com.etsy.android.stylekit.views.CollageSwitch r7 = (com.etsy.android.stylekit.views.CollageSwitch) r7
            if (r7 == 0) goto L_0x0128
            com.etsy.android.ui.favorites.add.NameAListFragment r0 = r8.f21568a
            r1 = 2131952051(0x7f1301b3, float:1.9540534E38)
            java.lang.String r0 = r0.getString(r1)
            r7.setDescription((java.lang.String) r0)
        L_0x0128:
            com.etsy.android.ui.favorites.add.NameAListFragment r7 = r8.f21568a
            android.view.View r7 = r7.getView()
            if (r7 == 0) goto L_0x0142
            android.view.View r7 = r7.findViewById(r2)
            android.widget.Button r7 = (android.widget.Button) r7
            if (r7 == 0) goto L_0x0142
            r8 = 2131952043(0x7f1301ab, float:1.9540518E38)
            r7.setText(r8)
            goto L_0x0142
        L_0x013f:
            r6.back()
        L_0x0142:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.favorites.add.NameAListFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void setPreferencesProvider(C13943a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.preferencesProvider = aVar;
    }

    public final void setPresenter(NameAListPresenter nameAListPresenter) {
        C19383o.m32797g(nameAListPresenter, "<set-?>");
        this.presenter = nameAListPresenter;
    }

    public final void setRxSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.rxSchedulers = fVar;
    }

    public final void showAlert(AlertData alertData) {
        C19383o.m32797g(alertData, "data");
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        C12979a a = C12979a.C12980a.m20683a(requireActivity);
        a.mo45783c(alertData.getIcon());
        a.mo45785e(alertData.getTitle());
        if (alertData.getBodyIcon() != null) {
            String body = alertData.getBody();
            Context requireContext = requireContext();
            int intValue = alertData.getBodyIcon().intValue();
            Object obj = C8184a.f17966a;
            a.mo45782b(body, C8184a.C8187c.m16466b(requireContext, intValue));
        } else {
            a.f28588b.setBodyText(alertData.getBody(), (Drawable) null);
        }
        a.f28591e = alertData.getDuration();
        a.mo45781a(alertData.getAlertType());
        a.mo45784d(alertData.getOnClickListener());
        a.mo45786f();
    }

    public final void stopRunnables() {
        Handler handler = this.inAnimSequenceHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        Handler handler2 = this.outAnimSequenceHandler;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages((Object) null);
        }
    }

    public final void success(Collection collection) {
        C19383o.m32797g(collection, Collection.TYPE_COLLECTION);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            WeakReference weakReference = new WeakReference(getActivity());
            String string = activity.getString(R.string.add_single_listing_to_collection_alert, new Object[]{collection.getName()});
            C19383o.m32796f(string, "it.getString(R.string.ad…n_alert, collection.name)");
            FragmentActivity requireActivity = requireActivity();
            C19383o.m32796f(requireActivity, "requireActivity()");
            C12979a a = C12979a.C12980a.m20683a(requireActivity);
            a.mo45785e(string);
            a.mo45783c(R.drawable.clg_icon_core_heart_fill_v1);
            a.mo45784d(new NameAListFragment$success$1$1$1(weakReference));
            a.mo45781a(CollageAlert.AlertType.SUCCESS);
            a.mo45786f();
        }
    }
}
