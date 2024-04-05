package com.etsy.android.p327ui.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.SearchView;
import androidx.cursoradapter.widget.CursorAdapter;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.conversation.list.ccm.C9581e;
import com.etsy.android.stylekit.views.C9053d;
import com.etsy.android.stylekit.views.CollageImageView;
import com.etsy.android.stylekit.views.ratings.C9072a;
import com.etsy.android.uikit.AppBarHelper;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;
import p280x0.C8292f;
import p430qe.C13300a;

/* renamed from: com.etsy.android.ui.search.i */
public final class C10866i {

    /* renamed from: a */
    public final FragmentActivity f24097a;

    /* renamed from: b */
    public AppBarHelper f24098b;

    /* renamed from: c */
    public SearchView.C0283l f24099c;

    /* renamed from: d */
    public final View.OnClickListener f24100d;

    /* renamed from: e */
    public final View.OnClickListener f24101e;

    /* renamed from: f */
    public final View.OnClickListener f24102f;

    /* renamed from: g */
    public final SearchView f24103g;

    /* renamed from: h */
    public final RelativeLayout f24104h;

    /* renamed from: i */
    public CollageImageView f24105i;

    /* renamed from: j */
    public CollageImageView f24106j;

    /* renamed from: k */
    public C10867a f24107k;

    /* renamed from: l */
    public C13300a f24108l;

    /* renamed from: m */
    public final C8618c f24109m;

    /* renamed from: n */
    public ImageView f24110n;

    /* renamed from: o */
    public boolean f24111o;

    /* renamed from: p */
    public boolean f24112p;

    /* renamed from: com.etsy.android.ui.search.i$a */
    public final class C10867a implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View.OnFocusChangeListener f24113b;

        public C10867a(View.OnFocusChangeListener onFocusChangeListener) {
            this.f24113b = onFocusChangeListener;
        }

        public final void onFocusChange(View view, boolean z) {
            C19383o.m32797g(view, "view");
            if (z) {
                ImageView imageView = C10866i.this.f24110n;
                if (imageView != null) {
                    ViewExtensions.m12869m(imageView);
                    ViewExtensions.m12860d(C10866i.this.f24105i);
                } else {
                    C19383o.m32805o("clearButton");
                    throw null;
                }
            } else {
                C10866i iVar = C10866i.this;
                if (iVar.f24108l != null && iVar.mo36069a()) {
                    ViewExtensions.m12869m(C10866i.this.f24105i);
                    ImageView imageView2 = C10866i.this.f24110n;
                    if (imageView2 != null) {
                        ViewExtensions.m12863g(imageView2);
                    } else {
                        C19383o.m32805o("clearButton");
                        throw null;
                    }
                } else if (C10866i.this.mo36071c() != null) {
                    if (String.valueOf(C10866i.this.mo36071c()).length() > 0) {
                        ImageView imageView3 = C10866i.this.f24110n;
                        if (imageView3 != null) {
                            ViewExtensions.m12869m(imageView3);
                        } else {
                            C19383o.m32805o("clearButton");
                            throw null;
                        }
                    }
                }
            }
            View.OnFocusChangeListener onFocusChangeListener = this.f24113b;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z);
            }
        }
    }

    /* renamed from: com.etsy.android.ui.search.i$b */
    public interface C10868b {
        C10866i getSearchViewHelper();
    }

    public C10866i(FragmentActivity fragmentActivity, C8703p pVar, String str, AppBarHelper appBarHelper, View.OnFocusChangeListener onFocusChangeListener, SearchView.C0283l lVar, C9581e eVar, C9072a aVar, C9053d dVar, int i) {
        String str2;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        C8703p pVar2 = pVar;
        int i2 = i;
        if ((i2 & 4) != 0) {
            str2 = fragmentActivity2.getString(R.string.search_etsy_hint);
            C19383o.m32796f(str2, "activity.getString(R.string.search_etsy_hint)");
        } else {
            str2 = str;
        }
        boolean z = (i2 & 8) != 0;
        AppBarHelper appBarHelper2 = (i2 & 16) != 0 ? null : appBarHelper;
        View.OnFocusChangeListener onFocusChangeListener2 = (i2 & 32) != 0 ? null : onFocusChangeListener;
        SearchView.C0283l lVar2 = (i2 & 64) != 0 ? null : lVar;
        C9581e eVar2 = (i2 & 128) != 0 ? null : eVar;
        C9072a aVar2 = (i2 & 256) != 0 ? null : aVar;
        C9053d dVar2 = (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? null : dVar;
        C19383o.m32797g(pVar2, "analyticsTracker");
        C19383o.m32797g(str2, ResponseConstants.HINT);
        this.f24097a = fragmentActivity2;
        this.f24098b = appBarHelper2;
        this.f24099c = lVar2;
        this.f24100d = eVar2;
        this.f24101e = aVar2;
        this.f24102f = dVar2;
        SearchView searchView = new SearchView(fragmentActivity2);
        this.f24103g = searchView;
        RelativeLayout relativeLayout = new RelativeLayout(fragmentActivity2);
        this.f24104h = relativeLayout;
        FragmentActivity fragmentActivity3 = fragmentActivity;
        this.f24105i = new CollageImageView(fragmentActivity3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        this.f24106j = new CollageImageView(fragmentActivity3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C8623e eVar3 = pVar2.f19116n;
        C19383o.m32796f(eVar3, "analyticsTracker.configMap");
        this.f24109m = eVar3;
        this.f24107k = new C10867a(onFocusChangeListener2);
        searchView.setIconifiedByDefault(false);
        searchView.setQueryHint(str2);
        searchView.setSubmitButtonEnabled(false);
        searchView.setFocusable(false);
        searchView.setSuggestionsAdapter((CursorAdapter) null);
        searchView.setInputType(32769);
        searchView.setId(999);
        C10867a aVar3 = this.f24107k;
        if (aVar3 != null) {
            searchView.setOnQueryTextFocusChangeListener(aVar3);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(9);
        searchView.setLayoutParams(layoutParams);
        CollageImageView collageImageView = this.f24105i;
        collageImageView.setId(-1153746766);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(11);
        layoutParams2.addRule(15);
        collageImageView.setLayoutParams(layoutParams2);
        collageImageView.setImageResource(R.drawable.clg_icon_unfavorited);
        collageImageView.setContentDescription(fragmentActivity2.getString(R.string.save_search));
        int dimensionPixelOffset = fragmentActivity.getResources().getDimensionPixelOffset(R.dimen.clg_space_12);
        collageImageView.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        ViewExtensions.m12860d(collageImageView);
        ViewExtensions.m12866j(collageImageView, new SearchViewHelper$createSearchView$2$1(this));
        CollageImageView collageImageView2 = this.f24106j;
        collageImageView2.setId(291520288);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.rightMargin = collageImageView2.getResources().getDimensionPixelOffset(R.dimen.clg_space_4);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        collageImageView2.setLayoutParams(layoutParams3);
        collageImageView2.setImageResource(R.drawable.clg_icon_core_camera_v1);
        collageImageView2.setContentDescription(fragmentActivity2.getString(R.string.etsy_lens_button_content_description));
        TypedValue typedValue = new TypedValue();
        fragmentActivity.getTheme().resolveAttribute(16843676, typedValue, true);
        int i3 = typedValue.resourceId;
        Object obj = C8184a.f17966a;
        collageImageView2.setBackground(C8184a.C8187c.m16466b(fragmentActivity2, i3));
        int dimensionPixelOffset2 = fragmentActivity.getResources().getDimensionPixelOffset(R.dimen.clg_space_12);
        collageImageView2.setPadding(dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2);
        ViewExtensions.m12860d(collageImageView2);
        ViewExtensions.m12866j(collageImageView2, new SearchViewHelper$createSearchView$3$1(this));
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        relativeLayout.addView(searchView);
        relativeLayout.addView(this.f24105i);
        relativeLayout.addView(this.f24106j);
        searchView.setOnQueryTextListener(new C10884j(this));
        View findViewById = searchView.findViewById(R.id.search_close_btn);
        C19383o.m32796f(findViewById, "searchView.findViewById(R.id.search_close_btn)");
        ImageView imageView = (ImageView) findViewById;
        this.f24110n = imageView;
        ViewExtensions.m12866j(imageView, new SearchViewHelper$wrapAndSetClearButtonOnClickListener$1(this, (SearchView.SearchAutoComplete) searchView.findViewById(R.id.search_src_text)));
        SearchView.SearchAutoComplete searchAutoComplete = (SearchView.SearchAutoComplete) searchView.findViewById(R.id.search_src_text);
        if (searchAutoComplete != null) {
            searchAutoComplete.setDropDownVerticalOffset(searchView.getResources().getDimensionPixelOffset(R.dimen.search_view_vertical_offset));
        }
        Context context = searchView.getContext();
        int dimensionPixelSize = fragmentActivity.getResources().getDimensionPixelSize(R.dimen.search_search_view_button_size);
        int dimensionPixelSize2 = fragmentActivity.getResources().getDimensionPixelSize(R.dimen.search_search_view_button_padding);
        ViewGroup viewGroup = (ViewGroup) searchView.findViewById(R.id.search_edit_frame);
        ImageView imageView2 = (ImageView) searchView.findViewById(R.id.search_mag_icon);
        SearchView.SearchAutoComplete searchAutoComplete2 = (SearchView.SearchAutoComplete) searchView.findViewById(R.id.search_src_text);
        ImageView imageView3 = (ImageView) searchView.findViewById(R.id.search_close_btn);
        ImageView imageView4 = (ImageView) searchView.findViewById(R.id.search_voice_btn);
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams4 = viewGroup.getLayoutParams();
            if (layoutParams4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams.setMargins(0, 0, 0, 0);
                viewGroup.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        if (imageView2 != null) {
            ViewGroup.LayoutParams layoutParams5 = imageView2.getLayoutParams();
            if (layoutParams5 != null) {
                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                layoutParams6.width = 0;
                layoutParams6.height = 0;
                layoutParams6.setMargins(0, 0, 0, 0);
                imageView2.setLayoutParams(layoutParams6);
                imageView2.setImageDrawable(C8184a.C8187c.m16466b(fragmentActivity2, R.drawable.clg_icon_core_search_v1));
                imageView2.setImportantForAccessibility(2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
        if (searchAutoComplete2 != null) {
            searchAutoComplete2.setPadding(0, searchAutoComplete2.getPaddingTop(), searchAutoComplete2.getPaddingRight(), searchAutoComplete2.getPaddingBottom());
            Context context2 = searchView.getContext();
            C19383o.m32796f(context2, "searchView.context");
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(new int[]{R.attr.clg_color_text_search_hint});
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttributes(styledAttrs)");
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
            if (colorStateList != null) {
                obtainStyledAttributes.recycle();
                searchAutoComplete2.setHintTextColor(colorStateList.getDefaultColor());
                searchAutoComplete2.setTextSize(0, (float) fragmentActivity.getResources().getDimensionPixelSize(R.dimen.text_large));
                searchAutoComplete2.setTypeface(C8292f.m16582a(searchAutoComplete2.getContext(), R.font.clg_typeface_normal));
            } else {
                throw new IllegalStateException();
            }
        }
        if (imageView3 != null) {
            ViewGroup.LayoutParams layoutParams7 = imageView3.getLayoutParams();
            if (layoutParams7 != null) {
                LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
                layoutParams8.width = dimensionPixelSize;
                layoutParams8.height = dimensionPixelSize;
                layoutParams8.gravity = 16;
                layoutParams8.setMargins(0, 0, 0, 0);
                imageView3.setLayoutParams(layoutParams8);
                imageView3.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                imageView3.setImageDrawable(C8184a.C8187c.m16466b(context, R.drawable.clg_icon_core_close_v1));
                imageView3.setBackground(C8184a.C8187c.m16466b(context, R.drawable.clg_touch_feedback));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
        if (imageView4 != null) {
            ViewExtensions.m12869m(imageView4);
            ViewGroup.LayoutParams layoutParams9 = imageView4.getLayoutParams();
            if (layoutParams9 != null) {
                LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) layoutParams9;
                layoutParams10.gravity = 16;
                layoutParams10.width = dimensionPixelSize;
                layoutParams10.height = dimensionPixelSize;
                layoutParams10.setMargins(0, 0, 0, 0);
                imageView4.setLayoutParams(layoutParams10);
                imageView4.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                imageView4.setImageDrawable(C8184a.C8187c.m16466b(context, R.drawable.clg_icon_core_microphone_v1));
                imageView4.setBackground(C8184a.C8187c.m16466b(context, R.drawable.clg_touch_feedback));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
        AppBarHelper appBarHelper3 = this.f24098b;
        if (appBarHelper3 != null) {
            relativeLayout.setPadding(0, 0, 0, 0);
            appBarHelper3.showCustomView(relativeLayout);
            if (z) {
                appBarHelper3.setNavigationIcon(C8184a.C8187c.m16466b(fragmentActivity2, R.drawable.clg_icon_core_search_v1));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo36069a() {
        return mo36071c() != null && !this.f24109m.mo21132b(C8592b.C8598f.f18875e) && String.valueOf(mo36071c()).length() > 0;
    }

    /* renamed from: b */
    public final void mo36070b() {
        this.f24103g.clearFocus();
    }

    /* renamed from: c */
    public final CharSequence mo36071c() {
        return this.f24103g.getQuery();
    }

    /* renamed from: d */
    public final void mo36072d() {
        SearchView.SearchAutoComplete searchAutoComplete = (SearchView.SearchAutoComplete) this.f24103g.findViewById(R.id.search_src_text);
        if (searchAutoComplete != null) {
            searchAutoComplete.requestFocus();
            Object systemService = searchAutoComplete.getContext().getSystemService("input_method");
            C19383o.m32795e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(searchAutoComplete, 0);
        }
    }

    /* renamed from: e */
    public final void mo36073e(String str, boolean z, boolean z2) {
        if (!C19383o.m32792b(this.f24103g.getQuery(), str)) {
            if (this.f24103g.isIconified()) {
                this.f24103g.setIconified(false);
            }
            this.f24112p = z2;
            this.f24103g.setQuery(str, false);
            if (!z) {
                this.f24103g.clearFocus();
                if (mo36069a()) {
                    ImageView imageView = this.f24110n;
                    if (imageView != null) {
                        ViewExtensions.m12863g(imageView);
                    } else {
                        C19383o.m32805o("clearButton");
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo36074f(String str) {
        C19383o.m32797g(str, "searchQuery");
        mo36073e(str, false, true);
    }

    /* renamed from: g */
    public final void mo36075g(C13300a aVar) {
        this.f24108l = aVar;
        if (aVar == null) {
            ViewExtensions.m12860d(this.f24105i);
            if (mo36071c() != null) {
                if (String.valueOf(mo36071c()).length() > 0) {
                    ImageView imageView = this.f24110n;
                    if (imageView != null) {
                        ViewExtensions.m12869m(imageView);
                    } else {
                        C19383o.m32805o("clearButton");
                        throw null;
                    }
                }
            }
        } else if (mo36069a()) {
            ViewExtensions.m12869m(this.f24105i);
            ImageView imageView2 = this.f24110n;
            if (imageView2 != null) {
                ViewExtensions.m12863g(imageView2);
            } else {
                C19383o.m32805o("clearButton");
                throw null;
            }
        }
    }

    /* renamed from: h */
    public final void mo36076h(boolean z) {
        this.f24111o = z;
        if (z) {
            this.f24105i.setImageResource(R.drawable.clg_icon_favorited);
            this.f24105i.setContentDescription(this.f24097a.getString(R.string.unsave_search));
            return;
        }
        this.f24105i.setImageResource(R.drawable.clg_icon_unfavorited);
        this.f24105i.setContentDescription(this.f24097a.getString(R.string.save_search));
    }
}
