package com.etsy.android.onboarding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.lifecycle.C2869k;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import com.etsy.android.R;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.uikit.p331ui.core.TrackingDialogFragment;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C19662p1;
import kotlinx.coroutines.flow.C19669s;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import p347fb.C12709e;
import p347fb.C12711f;
import p360hb.C12804a;
import p360hb.C12808b;
import p440s9.C13366a;
import p490yd.C13914b;

public final class OnboardingCategoryQuizFragment extends TrackingDialogFragment implements C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public CoroutineDispatcher mainDispatcher;
    public C13914b toaster;
    public CategoryQuizViewModel viewModel;

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    /* access modifiers changed from: private */
    public final void handleSideEffect(C12709e eVar) {
        Object value;
        C12808b bVar;
        if (eVar instanceof C12709e.C12710a) {
            C13914b toaster2 = getToaster();
            String str = ((C12709e.C12710a) eVar).f28007a;
            toaster2.getClass();
            C19383o.m32797g(str, "text");
            Toast.makeText(toaster2.f30574a, str, 1).show();
        }
        CategoryQuizViewModel viewModel2 = getViewModel();
        viewModel2.getClass();
        C19383o.m32797g(eVar, "effect");
        StateFlowImpl stateFlowImpl = viewModel2.f19699d;
        do {
            value = stateFlowImpl.getValue();
            bVar = (C12808b) value;
            bVar.getClass();
        } while (!stateFlowImpl.mo72337i(value, C12808b.m20447a(bVar, (C12804a) null, C19327t.m32649e1(eVar, bVar.f28294b), 1)));
    }

    /* access modifiers changed from: private */
    public final void handleViewState(C12804a aVar) {
        if (C19383o.m32792b(aVar, C12804a.C12805a.f28290a)) {
            onError();
        } else if (!C19383o.m32792b(aVar, C12804a.C12806b.f28291a) && C19383o.m32792b(aVar, C12804a.C12807c.f28292a)) {
            CategoryQuizViewModel viewModel2 = getViewModel();
            viewModel2.f19698c.mo38013a(new C12709e.C12710a());
        }
    }

    private final void onError() {
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

    public final CoroutineDispatcher getMainDispatcher() {
        CoroutineDispatcher coroutineDispatcher = this.mainDispatcher;
        if (coroutineDispatcher != null) {
            return coroutineDispatcher;
        }
        C19383o.m32805o("mainDispatcher");
        throw null;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C13914b getToaster() {
        C13914b bVar = this.toaster;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("toaster");
        throw null;
    }

    public final CategoryQuizViewModel getViewModel() {
        CategoryQuizViewModel categoryQuizViewModel = this.viewModel;
        if (categoryQuizViewModel != null) {
            return categoryQuizViewModel;
        }
        C19383o.m32805o("viewModel");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, 16974383);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_onboarding_category_quiz, viewGroup);
        C19383o.m32796f(inflate, "inflater.inflate(R.layou…category_quiz, container)");
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        C19662p1 p1Var = getViewModel().f19700e;
        Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        C19383o.m32796f(lifecycle, "viewLifecycleOwner.lifecycle");
        Lifecycle.State state = Lifecycle.State.STARTED;
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(C2869k.m6799a(p1Var, lifecycle, state), new OnboardingCategoryQuizFragment$onViewCreated$1(this, (C19340c<? super OnboardingCategoryQuizFragment$onViewCreated$1>) null));
        C2887s viewLifecycleOwner = getViewLifecycleOwner();
        C19383o.m32796f(viewLifecycleOwner, "viewLifecycleOwner");
        C19669s.m33429a(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, C15588c1.m25329i0(viewLifecycleOwner));
        C19662p1 p1Var2 = getViewModel().f19701f;
        Lifecycle lifecycle2 = getViewLifecycleOwner().getLifecycle();
        C19383o.m32796f(lifecycle2, "viewLifecycleOwner.lifecycle");
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$12 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(C2869k.m6799a(p1Var2, lifecycle2, state), new OnboardingCategoryQuizFragment$onViewCreated$2(this, (C19340c<? super OnboardingCategoryQuizFragment$onViewCreated$2>) null));
        C2887s viewLifecycleOwner2 = getViewLifecycleOwner();
        C19383o.m32796f(viewLifecycleOwner2, "viewLifecycleOwner");
        C19669s.m33429a(flowKt__TransformKt$onEach$$inlined$unsafeTransform$12, C15588c1.m25329i0(viewLifecycleOwner2));
        CategoryQuizViewModel viewModel2 = getViewModel();
        viewModel2.f19698c.mo38013a(C12711f.C12713b.f28008a);
    }

    public final void setMainDispatcher(CoroutineDispatcher coroutineDispatcher) {
        C19383o.m32797g(coroutineDispatcher, "<set-?>");
        this.mainDispatcher = coroutineDispatcher;
    }

    public final void setToaster(C13914b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.toaster = bVar;
    }

    public final void setViewModel(CategoryQuizViewModel categoryQuizViewModel) {
        C19383o.m32797g(categoryQuizViewModel, "<set-?>");
        this.viewModel = categoryQuizViewModel;
    }
}
