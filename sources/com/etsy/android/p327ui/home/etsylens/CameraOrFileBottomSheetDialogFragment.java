package com.etsy.android.p327ui.home.etsylens;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p015ui.platform.ComposeView;
import androidx.compose.p015ui.platform.ViewCompositionStrategy;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p628nj.C18263b;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.home.etsylens.CameraOrFileBottomSheetDialogFragment */
public final class CameraOrFileBottomSheetDialogFragment extends TrackingBottomSheetDialogFragment {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private C19846a<C19394m> onSelectFileClicked = CameraOrFileBottomSheetDialogFragment$onSelectFileClicked$1.INSTANCE;
    private C19846a<C19394m> onTakePictureClicked = CameraOrFileBottomSheetDialogFragment$onTakePictureClicked$1.INSTANCE;

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

    public final C19846a<C19394m> getOnSelectFileClicked() {
        return this.onSelectFileClicked;
    }

    public final C19846a<C19394m> getOnTakePictureClicked() {
        return this.onTakePictureClicked;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        Context requireContext = requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f4049a);
        composeView.setContent(C18263b.m30807B(new CameraOrFileBottomSheetDialogFragment$onCreateView$1$1(this), 1634364459, true));
        return composeView;
    }

    public final void setOnSelectFileClicked(C19846a<C19394m> aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.onSelectFileClicked = aVar;
    }

    public final void setOnTakePictureClicked(C19846a<C19394m> aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.onTakePictureClicked = aVar;
    }
}
