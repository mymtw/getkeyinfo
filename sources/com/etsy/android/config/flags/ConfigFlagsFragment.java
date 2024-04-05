package com.etsy.android.config.flags;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p015ui.platform.ComposeView;
import androidx.compose.p015ui.platform.ViewCompositionStrategy;
import androidx.lifecycle.C2887s;
import com.etsy.android.R;
import com.etsy.android.config.flags.events.C6351d;
import com.etsy.android.config.flags.events.C6361h;
import com.etsy.android.config.flags.events.C6375u;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.stylekit.views.C9056g;
import com.etsy.android.stylekit.views.CollageTextInput;
import com.etsy.android.uikit.p331ui.core.BaseFragment;
import com.etsy.android.util.C12059p;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p409o9.C13125f;
import p440s9.C13366a;
import p628nj.C18263b;

public final class ConfigFlagsFragment extends BaseFragment implements C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C6380i configFlagsViewModelFactory;
    private final C19285c viewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(ConfigFlagsViewModel.class), new ConfigFlagsFragment$special$$inlined$viewModels$default$2(new ConfigFlagsFragment$special$$inlined$viewModels$default$1(this)), new ConfigFlagsFragment$viewModel$2(this));

    /* access modifiers changed from: private */
    public final void handleSideEffect(C12059p<C6351d.C6353b> pVar) {
        C6351d.C6353b a = pVar.mo38935a();
        if (a == null) {
            return;
        }
        if (a instanceof C6351d.C6353b.C6356c) {
            C6351d.C6353b.C6356c cVar = (C6351d.C6353b.C6356c) a;
            showTextInputDialog(cVar.f14152a, cVar.f14153b);
        } else if (a instanceof C6351d.C6353b.C6355b) {
            LinkedHashMap linkedHashMap = C13125f.f28856a;
            C6351d.C6353b.C6355b bVar = (C6351d.C6353b.C6355b) a;
            C13125f.C13126a.m20791b(new Pair(bVar.f14150a, bVar.f14151b));
        } else if (C19383o.m32792b(a, C6351d.C6353b.C6354a.f14149a)) {
            requireActivity().onBackPressed();
        }
    }

    private final void showTextInputDialog(String str, String str2) {
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.dialog_config_flag_text_input, (ViewGroup) null, false);
        View findViewById = inflate.findViewById(R.id.config_flag_text_input);
        C19383o.m32796f(findViewById, "customAlertDialogView.fi…d.config_flag_text_input)");
        CollageTextInput collageTextInput = (CollageTextInput) findViewById;
        collageTextInput.setText(str2);
        Context requireContext = requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        new C9056g(requireContext).setView(inflate).setTitle(str).setPositiveButton(R.string.save, new C6344b(this, str, collageTextInput)).setNegativeButton(R.string.cancel, new C6345c()).mo1240k();
    }

    /* access modifiers changed from: private */
    /* renamed from: showTextInputDialog$lambda-2  reason: not valid java name */
    public static final void m34860showTextInputDialog$lambda2(ConfigFlagsFragment configFlagsFragment, String str, CollageTextInput collageTextInput, DialogInterface dialogInterface, int i) {
        C19383o.m32797g(configFlagsFragment, "this$0");
        C19383o.m32797g(str, "$currentConfigName");
        C19383o.m32797g(collageTextInput, "$textInput");
        ConfigFlagsViewModel viewModel = configFlagsFragment.getViewModel();
        C6375u uVar = new C6375u(str, collageTextInput.getText());
        viewModel.getClass();
        viewModel.f14130c.mo18133a(uVar);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: showTextInputDialog$lambda-3  reason: not valid java name */
    public static final void m34861showTextInputDialog$lambda3(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
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

    public final C6380i getConfigFlagsViewModelFactory() {
        C6380i iVar = this.configFlagsViewModelFactory;
        if (iVar != null) {
            return iVar;
        }
        C19383o.m32805o("configFlagsViewModelFactory");
        throw null;
    }

    public final ConfigFlagsViewModel getViewModel() {
        return (ConfigFlagsViewModel) this.viewModel$delegate.getValue();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        C19383o.m32796f(context, "inflater.context");
        ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C2887s viewLifecycleOwner = getViewLifecycleOwner();
        C19383o.m32796f(viewLifecycleOwner, "viewLifecycleOwner");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.C1789a(viewLifecycleOwner));
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewExtensions.m12860d(requireActivity().findViewById(R.id.app_bar_layout));
        composeView.setContent(C18263b.m30807B(new ConfigFlagsFragment$onCreateView$1$1(this), 1975629886, true));
        getViewModel().f14134g.observe(getViewLifecycleOwner(), new C6346d(this, 0));
        ConfigFlagsViewModel viewModel = getViewModel();
        C6361h hVar = C6361h.f14176a;
        viewModel.getClass();
        viewModel.f14130c.mo18133a(hVar);
        return composeView;
    }

    public void onDestroyView() {
        super.onDestroyView();
        ViewExtensions.m12869m(requireActivity().findViewById(R.id.app_bar_layout));
    }

    public final void setConfigFlagsViewModelFactory(C6380i iVar) {
        C19383o.m32797g(iVar, "<set-?>");
        this.configFlagsViewModelFactory = iVar;
    }
}
