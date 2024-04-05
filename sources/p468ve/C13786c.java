package p468ve;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageViewStyleApplier;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextViewStyleApplier;
import androidx.activity.C0114h;
import androidx.constraintlayout.widget.C2236a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C2322o0;
import com.appboy.p043ui.widget.C4956b;
import com.appboy.p043ui.widget.C4957c;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.models.MessageModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.StyledBannerModel;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.lib.models.cardviewelement.ListSection;
import com.etsy.android.p327ui.cardview.clickhandlers.C9144y;
import com.etsy.android.p327ui.cardview.viewholders.C9184i0;
import com.etsy.android.p327ui.util.ImageLoaderOnPreDrawListener;
import com.etsy.android.stylekit.views.CollageButton;
import com.etsy.android.stylekit.views.CollageEdge;
import com.etsy.android.stylekit.views.CollageHeadingTextView;
import com.etsy.android.vespa.viewholders.C12086e;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.reflect.C19421p;
import kotlin.text.C19459m;
import kotlinx.coroutines.C19543e0;
import p242t3.C7955e;
import p260v0.C8184a;
import p435rb.C13350a;
import p439rf.C13363b;
import p568fn.C17782b;
import p628nj.C18263b;

/* renamed from: ve.c */
public final class C13786c extends C12086e<StyledBannerModel> {

    /* renamed from: y */
    public static final /* synthetic */ int f30322y = 0;

    /* renamed from: c */
    public final ViewGroup f30323c;

    /* renamed from: d */
    public final boolean f30324d;

    /* renamed from: e */
    public final C9144y f30325e;

    /* renamed from: f */
    public final C13784a f30326f;

    /* renamed from: g */
    public final C9184i0 f30327g;

    /* renamed from: h */
    public final C8703p f30328h;

    /* renamed from: i */
    public final ConstraintLayout f30329i = ((ConstraintLayout) this.itemView.findViewById(R.id.root));

    /* renamed from: j */
    public final ImageView f30330j = ((ImageView) this.itemView.findViewById(R.id.background_image));

    /* renamed from: k */
    public final ImageView f30331k = ((ImageView) this.itemView.findViewById(R.id.foreground_image));

    /* renamed from: l */
    public final View f30332l = this.itemView.findViewById(R.id.background_fill_color);

    /* renamed from: m */
    public final CollageEdge f30333m = ((CollageEdge) this.itemView.findViewById(R.id.background_tear));

    /* renamed from: n */
    public final MaterialCardView f30334n = ((MaterialCardView) this.itemView.findViewById(R.id.card_view));

    /* renamed from: o */
    public final ConstraintLayout f30335o = ((ConstraintLayout) this.itemView.findViewById(R.id.card_view_root_layout));

    /* renamed from: p */
    public final LinearLayout f30336p = ((LinearLayout) this.itemView.findViewById(R.id.title_text_layout));

    /* renamed from: q */
    public final LinearLayout f30337q = ((LinearLayout) this.itemView.findViewById(R.id.body_text_layout));

    /* renamed from: r */
    public final ImageView f30338r = ((ImageView) this.itemView.findViewById(R.id.icon));

    /* renamed from: s */
    public final CollageHeadingTextView f30339s = ((CollageHeadingTextView) this.itemView.findViewById(R.id.badge));

    /* renamed from: t */
    public final Button f30340t = ((Button) this.itemView.findViewById(R.id.dismiss_button));

    /* renamed from: u */
    public final Button f30341u = ((Button) this.itemView.findViewById(R.id.button));

    /* renamed from: v */
    public final ImageView f30342v = ((ImageView) this.itemView.findViewById(R.id.illustration));

    /* renamed from: w */
    public boolean f30343w;

    /* renamed from: x */
    public boolean f30344x;

    /* renamed from: ve.c$a */
    public /* synthetic */ class C13787a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30345a;

        static {
            int[] iArr = new int[StyledBannerModel.Layout.values().length];
            iArr[StyledBannerModel.Layout.FLAG.ordinal()] = 1;
            iArr[StyledBannerModel.Layout.CAMPAIGN.ordinal()] = 2;
            iArr[StyledBannerModel.Layout.EDITORIAL.ordinal()] = 3;
            iArr[StyledBannerModel.Layout.PERSONALIZED.ordinal()] = 4;
            iArr[StyledBannerModel.Layout.MESSAGE_STACK.ordinal()] = 5;
            iArr[StyledBannerModel.Layout.ICON_MESSAGE_BUTTON_STACK.ordinal()] = 6;
            f30345a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13786c(ViewGroup viewGroup, boolean z, C13363b bVar, C9144y yVar, C13784a aVar, C9184i0 i0Var, C8703p pVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_styled_banner, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(yVar, "clickHandler");
        C19383o.m32797g(pVar, "analyticsTracker");
        this.f30323c = viewGroup;
        this.f30324d = z;
        this.f30325e = yVar;
        this.f30326f = aVar;
        this.f30327g = i0Var;
        this.f30328h = pVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        Drawable mutate;
        StyledBannerModel styledBannerModel = (StyledBannerModel) obj;
        C19383o.m32797g(styledBannerModel, "model");
        boolean z = styledBannerModel.getListSection() != null;
        this.f30344x = z;
        this.f30343w = !z && styledBannerModel.getForegroundImage() != null;
        if (styledBannerModel.getBackgroundImage() != null) {
            ViewExtensions.m12869m(this.f30330j);
            mo46646g(this.f30330j, styledBannerModel.getBackgroundImage());
            String backgroundImageColorLight = styledBannerModel.getBackgroundImageColorLight();
            String backgroundImageColorDark = styledBannerModel.getBackgroundImageColorDark();
            this.f30330j.setColorFilter((ColorFilter) null);
            ImageView imageView = this.f30330j;
            Context context = this.itemView.getContext();
            C19383o.m32796f(context, "itemView.context");
            int d = C13350a.m21013d(context, R.attr.clg_color_bg_edge);
            Configuration configuration = this.itemView.getContext().getResources().getConfiguration();
            C19383o.m32796f(configuration, "itemView.context.resources.configuration");
            boolean o0 = C19382n.m32762o0(configuration);
            C19383o.m32797g(backgroundImageColorLight, "backgroundColorLight");
            C19383o.m32797g(backgroundImageColorDark, "backgroundColorDark");
            if (o0 && C18263b.m30839d0(backgroundImageColorDark)) {
                backgroundImageColorLight = backgroundImageColorDark;
            }
            try {
                if (C18263b.m30839d0(backgroundImageColorLight)) {
                    d = Color.parseColor(backgroundImageColorLight);
                }
            } catch (IllegalArgumentException unused) {
            }
            imageView.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_ATOP));
        } else {
            ViewGroup.LayoutParams layoutParams = this.f30334n.getLayoutParams();
            C19383o.m32795e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(0, 0, 0, marginLayoutParams.bottomMargin);
            ViewExtensions.m12860d(this.f30330j);
        }
        if (styledBannerModel.getForegroundImage() == null || !this.f30343w || !(styledBannerModel.getLayout() == StyledBannerModel.Layout.EDITORIAL || styledBannerModel.getLayout() == StyledBannerModel.Layout.PERSONALIZED)) {
            ViewExtensions.m12860d(this.f30331k);
        } else {
            ViewExtensions.m12869m(this.f30331k);
            mo46646g(this.f30331k, styledBannerModel.getForegroundImage());
        }
        if ((styledBannerModel.getDeepLink().length() > 0) || styledBannerModel.getInfoModal() != null) {
            this.f30334n.setClickable(true);
            MaterialCardView materialCardView = this.f30334n;
            Context context2 = this.itemView.getContext();
            Object obj2 = C8184a.f17966a;
            materialCardView.setForeground(C8184a.C8187c.m16466b(context2, R.drawable.clg_touch_feedback));
            this.f30334n.setOnClickListener(new C4956b(1, this, styledBannerModel));
        } else {
            this.f30334n.setClickable(false);
        }
        switch (C13787a.f30345a[styledBannerModel.getLayout().ordinal()]) {
            case 1:
                String icon = styledBannerModel.getIcon();
                int i = C19383o.m32792b(icon, StyledBannerModel.FAVORITED) ? R.drawable.clg_icon_core_heart_fill_v1 : C19383o.m32792b(icon, StyledBannerModel.STAR) ? R.drawable.clg_icon_core_star_fill_v1 : 0;
                if (i > 0) {
                    Context context3 = this.f30338r.getContext();
                    ViewExtensions.m12869m(this.f30338r);
                    C19383o.m32796f(context3, ResponseConstants.CONTEXT);
                    Object obj3 = C8184a.f17966a;
                    Drawable b = C8184a.C8187c.m16466b(context3, i);
                    if (!(b == null || (mutate = b.mutate()) == null)) {
                        mutate.setColorFilter(new PorterDuffColorFilter(C13350a.m21013d(context3, R.attr.clg_color_alert_icon), PorterDuff.Mode.SRC_IN));
                        this.f30338r.setImageDrawable(mutate);
                    }
                } else {
                    this.f30338r.setImageDrawable((Drawable) null);
                    ViewExtensions.m12860d(this.f30338r);
                }
                mo46648i(styledBannerModel.getBackgroundColorLight(), styledBannerModel.getBackgroundColorDark());
                this.f30334n.setCardElevation(0.0f);
                this.f30330j.getLayoutParams().height = this.itemView.getResources().getDimensionPixelSize(R.dimen.styled_banner_background_height_small);
                mo46647h(8388611, styledBannerModel.getMessages());
                LinearLayout linearLayout = this.f30337q;
                C19383o.m32796f(linearLayout, "");
                Iterator<View> it = C19543e0.m33298O(linearLayout).iterator();
                while (true) {
                    C2322o0 o0Var = (C2322o0) it;
                    if (!o0Var.hasNext()) {
                        int dimensionPixelSize = linearLayout.getResources().getDimensionPixelSize(R.dimen.clg_space_16);
                        linearLayout.setPadding(linearLayout.getPaddingLeft(), dimensionPixelSize, linearLayout.getPaddingRight(), dimensionPixelSize);
                        linearLayout.setPadding(linearLayout.getResources().getDimensionPixelSize(R.dimen.clg_space_4), linearLayout.getPaddingTop(), linearLayout.getResources().getDimensionPixelSize(R.dimen.clg_space_8), linearLayout.getPaddingBottom());
                        break;
                    } else {
                        View view = (View) o0Var.next();
                        view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), 0);
                    }
                }
            case 2:
                View view2 = this.itemView;
                this.f30334n.setCardElevation(view2.getResources().getDimension(R.dimen.clg_space_4));
                mo46648i(styledBannerModel.getBackgroundColorLight(), styledBannerModel.getBackgroundColorDark());
                this.f30330j.getLayoutParams().height = view2.getResources().getDimensionPixelSize(R.dimen.styled_banner_background_height_small);
                int dimensionPixelSize2 = view2.getResources().getDimensionPixelSize(R.dimen.clg_space_16);
                int dimensionPixelSize3 = view2.getResources().getDimensionPixelSize(R.dimen.clg_space_8);
                ViewGroup.LayoutParams layoutParams2 = this.f30334n.getLayoutParams();
                C19383o.m32795e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams2).setMargins(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize3);
                String str = C19459m.m33036e1(styledBannerModel.getAnalyticsName(), "cyber_sales_event_early_access_2022", false) ? "https://etsysiteassets.s3.amazonaws.com/boe/homescreen/banners/banners-cyber-earlyAccess-icon.png" : (!C19459m.m33036e1(styledBannerModel.getAnalyticsName(), "cyber_sales_event_2022", false) || !this.f30328h.f19116n.mo21132b(C8592b.C8595c.f18864h)) ? null : "https://etsysiteassets.s3.amazonaws.com/boe/homescreen/banners/banners-cyber-general-icon.png";
                if (str != null) {
                    C0114h.m270B0(this.itemView.getContext()).load(str).mo16816M(this.f30342v);
                    ViewGroup.LayoutParams layoutParams3 = this.f30337q.getLayoutParams();
                    C19383o.m32795e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, 0, marginLayoutParams2.bottomMargin);
                    ViewExtensions.m12869m(this.f30342v);
                }
                if (this.f30324d) {
                    Resources resources = this.itemView.getContext().getResources();
                    int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.clg_space_8);
                    int dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.clg_space_12);
                    Resources resources2 = view2.getContext().getResources();
                    DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                    view2.getLayoutParams().width = ((((resources2.getConfiguration().orientation == 1 ? displayMetrics.widthPixels : displayMetrics.heightPixels) - dimensionPixelSize5) - dimensionPixelSize4) / 1) - dimensionPixelSize4;
                    this.f30329i.getLayoutParams().height = -1;
                    this.f30334n.getLayoutParams().height = -1;
                }
                int i2 = 0;
                for (T next : styledBannerModel.getMessages()) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        MessageModel messageModel = (MessageModel) next;
                        if (i2 == 0) {
                            this.f30336p.addView(this.f30326f.mo46644a(messageModel, 8388611));
                        } else {
                            this.f30337q.addView(this.f30326f.mo46644a(messageModel, 8388611));
                        }
                        i2 = i3;
                    } else {
                        C17782b.m29877o0();
                        throw null;
                    }
                }
                ViewExtensions.m12869m(this.f30336p);
                LinearLayout linearLayout2 = this.f30337q;
                C19383o.m32796f(linearLayout2, "bodyTextLayout");
                linearLayout2.setPadding(linearLayout2.getPaddingLeft(), 0, linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
                ViewGroup.LayoutParams layoutParams4 = this.f30337q.getLayoutParams();
                C19383o.m32795e(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
                int marginStart = marginLayoutParams3.getMarginStart();
                int marginEnd = marginLayoutParams3.getMarginEnd();
                int i4 = marginLayoutParams3.bottomMargin;
                marginLayoutParams3.setMarginStart(marginStart);
                marginLayoutParams3.topMargin = 0;
                marginLayoutParams3.setMarginEnd(marginEnd);
                marginLayoutParams3.bottomMargin = i4;
                LinearLayout linearLayout3 = this.f30336p;
                C19383o.m32796f(linearLayout3, "titleTextLayout");
                mo46650k(styledBannerModel, C19543e0.m33298O(linearLayout3));
                LinearLayout linearLayout4 = this.f30337q;
                C19383o.m32796f(linearLayout4, "bodyTextLayout");
                mo46650k(styledBannerModel, C19543e0.m33298O(linearLayout4));
                break;
            case 3:
                mo46649j(styledBannerModel, false);
                break;
            case 4:
                mo46649j(styledBannerModel, true);
                break;
            case 5:
                mo46647h(8388611, styledBannerModel.getMessages());
                LinearLayout linearLayout5 = this.f30337q;
                C19383o.m32796f(linearLayout5, "");
                Iterator<View> it2 = C19543e0.m33298O(linearLayout5).iterator();
                while (true) {
                    C2322o0 o0Var2 = (C2322o0) it2;
                    if (!o0Var2.hasNext()) {
                        ViewExtensions.m12869m(this.f30332l);
                        ViewExtensions.m12869m(this.f30333m);
                        View view3 = this.f30332l;
                        Context context4 = this.itemView.getContext();
                        Object obj4 = C8184a.f17966a;
                        view3.setBackgroundColor(C8184a.C8188d.m16468a(context4, R.color.message_stack_banner_background_color));
                        this.f30333m.setColorFilter(C8184a.C8188d.m16468a(this.itemView.getContext(), R.color.message_stack_banner_background_color));
                        LinearLayout linearLayout6 = this.f30337q;
                        C19383o.m32796f(linearLayout6, "bodyTextLayout");
                        linearLayout6.setPadding(linearLayout6.getPaddingLeft(), linearLayout6.getPaddingTop(), linearLayout6.getPaddingRight(), this.itemView.getResources().getDimensionPixelSize(R.dimen.clg_space_48) + this.itemView.getPaddingBottom());
                        this.f30334n.setCardBackgroundColor(0);
                        this.f30334n.setCardElevation(0.0f);
                        break;
                    } else {
                        View view4 = (View) o0Var2.next();
                        int dimensionPixelSize6 = view4.getResources().getDimensionPixelSize(R.dimen.clg_space_8);
                        view4.setPadding(dimensionPixelSize6, dimensionPixelSize6, dimensionPixelSize6, dimensionPixelSize6);
                        TextView textView = (TextView) view4.findViewById(R.id.styled_banner_message);
                        if (textView != null) {
                            textView.setTextAlignment(4);
                        }
                    }
                }
            case 6:
                mo46648i(styledBannerModel.getBackgroundColorLight(), styledBannerModel.getBackgroundColorDark());
                this.f30334n.setCardElevation(0.0f);
                ConstraintLayout constraintLayout = this.f30335o;
                C19383o.m32796f(constraintLayout, "cardViewRootLayout");
                constraintLayout.setPadding(constraintLayout.getPaddingLeft(), this.itemView.getResources().getDimensionPixelSize(R.dimen.clg_space_16), constraintLayout.getPaddingRight(), this.itemView.getResources().getDimensionPixelSize(R.dimen.clg_space_16));
                C2236a aVar = new C2236a();
                aVar.mo8487e(this.f30335o);
                aVar.mo8488f(this.f30338r.getId(), 7, this.f30335o.getId(), 7);
                aVar.mo8486d(this.f30338r.getId(), 4);
                aVar.mo8488f(this.f30339s.getId(), 3, this.f30338r.getId(), 4);
                aVar.mo8488f(this.f30339s.getId(), 6, this.f30335o.getId(), 6);
                aVar.mo8488f(this.f30337q.getId(), 3, this.f30338r.getId(), 4);
                aVar.mo8488f(this.f30337q.getId(), 6, this.f30335o.getId(), 6);
                aVar.mo8488f(this.f30337q.getId(), 7, this.f30335o.getId(), 7);
                aVar.mo8488f(this.f30337q.getId(), 4, this.f30341u.getId(), 3);
                aVar.mo8488f(this.f30341u.getId(), 3, this.f30337q.getId(), 4);
                aVar.mo8488f(this.f30341u.getId(), 6, this.f30335o.getId(), 6);
                aVar.mo8488f(this.f30341u.getId(), 7, this.f30335o.getId(), 7);
                aVar.mo8484b(this.f30335o);
                try {
                    this.f30338r.setImageResource(this.itemView.getResources().getIdentifier(styledBannerModel.getIcon(), "drawable", this.itemView.getContext().getPackageName()));
                    ViewGroup.LayoutParams layoutParams5 = this.f30338r.getLayoutParams();
                    C19383o.m32795e(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams5;
                    marginLayoutParams4.setMarginStart(0);
                    this.f30338r.setLayoutParams(marginLayoutParams4);
                    ImageView imageView2 = this.f30338r;
                    C19383o.m32796f(imageView2, ResponseConstants.ICON);
                    new ImageViewStyleApplier(imageView2).mo14737a(new C7955e(R.style.clg_brand_icon_marketing01_smallest));
                    ViewExtensions.m12869m(this.f30338r);
                } catch (Resources.NotFoundException e) {
                    LogCatKt.m17045a().mo21306a(e.toString());
                    ViewExtensions.m12860d(this.f30338r);
                }
                this.f30337q.setGravity(17);
                mo46647h(17, styledBannerModel.getMessages());
                break;
        }
        View view5 = this.itemView;
        C19383o.m32796f(view5, "itemView");
        for (String str2 : styledBannerModel.getStyles()) {
            switch (str2.hashCode()) {
                case -2071388656:
                    if (str2.equals("clg_flush_to_gutters")) {
                        int dimensionPixelSize7 = view5.getResources().getDimensionPixelSize(R.dimen.clg_space_16);
                        ViewGroup.LayoutParams layoutParams6 = this.f30334n.getLayoutParams();
                        C19383o.m32795e(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams6;
                        marginLayoutParams5.setMargins(dimensionPixelSize7, marginLayoutParams5.topMargin, dimensionPixelSize7, marginLayoutParams5.bottomMargin);
                        break;
                    } else {
                        break;
                    }
                case -1875772152:
                    if (str2.equals("full-width")) {
                        MaterialCardView materialCardView2 = this.f30334n;
                        ViewGroup.LayoutParams layoutParams7 = materialCardView2.getLayoutParams();
                        C19383o.m32795e(layoutParams7, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams7;
                        marginLayoutParams6.setMargins(0, marginLayoutParams6.topMargin, 0, marginLayoutParams6.bottomMargin);
                        materialCardView2.setRadius(0.0f);
                        break;
                    } else {
                        break;
                    }
                case -368034558:
                    if (str2.equals("clg_bg_color_slime_dark")) {
                        MaterialCardView materialCardView3 = this.f30334n;
                        Context context5 = view5.getContext();
                        Object obj5 = C8184a.f17966a;
                        materialCardView3.setCardBackgroundColor(C8184a.C8188d.m16468a(context5, R.color.clg_color_slime_dark));
                        break;
                    } else {
                        break;
                    }
                case 758045783:
                    if (str2.equals("no_padding_bottom")) {
                        ViewGroup.LayoutParams layoutParams8 = this.f30334n.getLayoutParams();
                        C19383o.m32795e(layoutParams8, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams8;
                        marginLayoutParams7.setMargins(marginLayoutParams7.leftMargin, marginLayoutParams7.topMargin, marginLayoutParams7.rightMargin, 0);
                        ViewExtensions.m12860d(this.f30330j);
                        break;
                    } else {
                        break;
                    }
            }
        }
        View view6 = this.itemView;
        C19383o.m32796f(view6, "itemView");
        List<com.etsy.android.lib.models.apiv3.Button> buttons = styledBannerModel.getButtons();
        String analyticsName = styledBannerModel.getAnalyticsName();
        if (!buttons.isEmpty()) {
            com.etsy.android.lib.models.apiv3.Button button = (com.etsy.android.lib.models.apiv3.Button) C19327t.m32638T0(buttons);
            this.f30341u.setText(button.getText());
            Button button2 = this.f30341u;
            C19383o.m32796f(button2, "button");
            new TextViewStyleApplier(button2).mo14737a(new C7955e(button.getStyle()));
            ViewExtensions.m12869m(this.f30341u);
            this.f30341u.setOnClickListener(new C13785b(button, this, view6, analyticsName));
        }
        if (styledBannerModel.getDismissAction() != null) {
            LinearLayout linearLayout7 = this.f30336p;
            C19383o.m32796f(linearLayout7, "titleTextLayout");
            C19421p.m32937e0(0, linearLayout7);
            LinearLayout linearLayout8 = this.f30337q;
            C19383o.m32796f(linearLayout8, "bodyTextLayout");
            C19421p.m32937e0(0, linearLayout8);
            ViewGroup.LayoutParams layoutParams9 = this.f30336p.getLayoutParams();
            C19383o.m32795e(layoutParams9, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams9;
            int marginStart2 = marginLayoutParams8.getMarginStart();
            int i5 = marginLayoutParams8.topMargin;
            int i6 = marginLayoutParams8.bottomMargin;
            marginLayoutParams8.setMarginStart(marginStart2);
            marginLayoutParams8.topMargin = i5;
            marginLayoutParams8.setMarginEnd(0);
            marginLayoutParams8.bottomMargin = i6;
            ViewGroup.LayoutParams layoutParams10 = this.f30337q.getLayoutParams();
            C19383o.m32795e(layoutParams10, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams9 = (ViewGroup.MarginLayoutParams) layoutParams10;
            int marginStart3 = marginLayoutParams9.getMarginStart();
            int i7 = marginLayoutParams9.topMargin;
            int i8 = marginLayoutParams9.bottomMargin;
            marginLayoutParams9.setMarginStart(marginStart3);
            marginLayoutParams9.topMargin = i7;
            marginLayoutParams9.setMarginEnd(0);
            marginLayoutParams9.bottomMargin = i8;
            if (!styledBannerModel.getMessages().isEmpty()) {
                for (String b2 : styledBannerModel.getMessages().get(0).getStyles()) {
                    C13784a aVar2 = this.f30326f;
                    Context context6 = this.itemView.getContext();
                    C19383o.m32796f(context6, "itemView.context");
                    aVar2.getClass();
                    Integer b3 = C13784a.m21328b(context6, b2);
                    if (b3 != null) {
                        int intValue = b3.intValue();
                        Button button3 = this.f30340t;
                        C19383o.m32795e(button3, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageButton");
                        ((CollageButton) button3).setIconTint(ColorStateList.valueOf(intValue));
                    }
                }
            }
            this.f30340t.setOnClickListener(new C4957c(1, this, styledBannerModel));
            ViewExtensions.m12869m(this.f30340t);
        } else {
            ViewExtensions.m12860d(this.f30340t);
        }
        ViewGroup.LayoutParams layoutParams11 = this.f30329i.getLayoutParams();
        C19383o.m32795e(layoutParams11, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams10 = (ViewGroup.MarginLayoutParams) layoutParams11;
        marginLayoutParams10.setMargins(this.f30323c.getPaddingLeft() * -1, marginLayoutParams10.topMargin, this.f30323c.getPaddingRight() * -1, marginLayoutParams10.bottomMargin);
        if (!this.f30324d) {
            this.f30328h.mo21333d(C19388s.m32863g0(styledBannerModel) + "_viewed", C19388s.m32882r0(styledBannerModel));
        }
    }

    /* renamed from: g */
    public final void mo46646g(ImageView imageView, Image image) {
        if (imageView != null && image != null) {
            ViewTreeObserver viewTreeObserver = this.itemView.getViewTreeObserver();
            View view = this.itemView;
            C19383o.m32796f(view, "itemView");
            viewTreeObserver.addOnPreDrawListener(new ImageLoaderOnPreDrawListener(image, view, imageView, (C13363b) null));
        }
    }

    /* renamed from: h */
    public final void mo46647h(int i, List list) {
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f30337q.addView(this.f30326f.mo46644a((MessageModel) it.next(), i));
            arrayList.add(C19394m.f43287a);
        }
    }

    /* renamed from: i */
    public final void mo46648i(String str, String str2) {
        MaterialCardView materialCardView = this.f30334n;
        Context context = this.itemView.getContext();
        C19383o.m32796f(context, "itemView.context");
        int d = C13350a.m21013d(context, R.attr.clg_color_bg_primary);
        Configuration configuration = this.itemView.getContext().getResources().getConfiguration();
        C19383o.m32796f(configuration, "itemView.context.resources.configuration");
        boolean o0 = C19382n.m32762o0(configuration);
        C19383o.m32797g(str, "backgroundColorLight");
        C19383o.m32797g(str2, "backgroundColorDark");
        if (o0 && C18263b.m30839d0(str2)) {
            str = str2;
        }
        try {
            if (C18263b.m30839d0(str)) {
                d = Color.parseColor(str);
            }
        } catch (IllegalArgumentException unused) {
        }
        materialCardView.setCardBackgroundColor(d);
    }

    /* renamed from: j */
    public final void mo46649j(StyledBannerModel styledBannerModel, boolean z) {
        boolean z2 = !z && (styledBannerModel.getMessages().isEmpty() ^ true) && this.f30343w;
        boolean z3 = styledBannerModel.getMessages().size() > 1 && this.f30344x;
        this.f30334n.setCardElevation(this.itemView.getResources().getDimension(R.dimen.clg_space_4));
        mo46648i(styledBannerModel.getBackgroundColorLight(), styledBannerModel.getBackgroundColorDark());
        this.f30330j.getLayoutParams().height = this.itemView.getResources().getDimensionPixelSize(R.dimen.styled_banner_background_height_large);
        if (z2) {
            ViewExtensions.m12869m(this.f30339s);
            this.f30339s.setFocusable(false);
            this.f30339s.setText(styledBannerModel.getMessages().get(0).getMessage());
        }
        this.f30341u.setFocusable(false);
        if (z2) {
            if (z3) {
                mo46647h(8388611, styledBannerModel.getMessages().subList(1, styledBannerModel.getMessages().size() - 1));
            } else {
                mo46647h(8388611, styledBannerModel.getMessages().subList(1, styledBannerModel.getMessages().size()));
            }
        } else if (z3) {
            mo46647h(8388611, styledBannerModel.getMessages().subList(0, styledBannerModel.getMessages().size() - 1));
        } else {
            mo46647h(8388611, styledBannerModel.getMessages());
        }
        if (!this.f30344x) {
            mo46651l(true);
            LinearLayout linearLayout = this.f30337q;
            C19383o.m32796f(linearLayout, "");
            Iterator<View> it = C19543e0.m33298O(linearLayout).iterator();
            while (true) {
                C2322o0 o0Var = (C2322o0) it;
                if (!o0Var.hasNext()) {
                    break;
                }
                ((View) o0Var.next()).setFocusable(false);
            }
        } else {
            mo46651l(false);
            this.f30337q.addView(this.f30327g.itemView);
            C9184i0 i0Var = this.f30327g;
            i0Var.f26987c.setClipToPadding(false);
            i0Var.f26987c.setClipChildren(false);
            ListSection listSection = styledBannerModel.getListSection();
            if (listSection != null) {
                i0Var.mo19450a(listSection);
            }
            ViewGroup.LayoutParams layoutParams = i0Var.itemView.getLayoutParams();
            C19383o.m32795e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            int dimensionPixelSize = i0Var.itemView.getResources().getDimensionPixelSize(R.dimen.neg_banner_carousel_margins);
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(dimensionPixelSize, i0Var.itemView.getResources().getDimensionPixelSize(R.dimen.clg_space_4), dimensionPixelSize, 0);
        }
        if (z3) {
            this.f30337q.addView(this.f30326f.mo46644a((MessageModel) C19327t.m32645a1(styledBannerModel.getMessages()), 8388611));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.CharSequence} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo46650k(com.etsy.android.lib.models.StyledBannerModel r20, androidx.core.view.C2320n0 r21) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            java.util.List r0 = r20.getMessages()
            java.util.ArrayList r8 = new java.util.ArrayList
            int r1 = kotlin.collections.C19322o.m32624F0(r0)
            r8.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0015:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0029
            java.lang.Object r1 = r0.next()
            com.etsy.android.lib.models.MessageModel r1 = (com.etsy.android.lib.models.MessageModel) r1
            java.lang.String r1 = r1.getMessage()
            r8.add(r1)
            goto L_0x0015
        L_0x0029:
            java.util.Iterator r9 = r21.iterator()
        L_0x002d:
            r0 = r9
            androidx.core.view.o0 r0 = (androidx.core.view.C2322o0) r0
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0104
            java.lang.Object r0 = r0.next()
            android.view.View r0 = (android.view.View) r0
            r1 = 2131429922(0x7f0b0a22, float:1.848153E38)
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            java.util.Iterator r0 = r8.iterator()
        L_0x004a:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0073
            java.lang.Object r1 = r0.next()
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            r4 = 63
            android.text.Spanned r3 = android.text.Html.fromHtml(r3, r4)
            java.lang.String r3 = r3.toString()
            if (r10 == 0) goto L_0x0068
            java.lang.CharSequence r2 = r10.getText()
        L_0x0068:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r3, r2)
            if (r2 == 0) goto L_0x004a
            r2 = r1
        L_0x0073:
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0079
            goto L_0x002d
        L_0x0079:
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            android.text.Spanned r0 = p628nj.C18263b.m30867s0(r1)
            r11.<init>(r0)
            int r0 = r1.length()
            java.lang.Class<android.text.style.URLSpan> r2 = android.text.style.URLSpan.class
            r12 = 0
            java.lang.Object[] r0 = r11.getSpans(r12, r0, r2)
            android.text.style.URLSpan[] r0 = (android.text.style.URLSpan[]) r0
            java.lang.String r2 = "urlSpans"
            kotlin.jvm.internal.C19383o.m32796f(r0, r2)
            int r2 = r0.length
            r13 = 1
            if (r2 != 0) goto L_0x009a
            r2 = r13
            goto L_0x009b
        L_0x009a:
            r2 = r12
        L_0x009b:
            if (r2 == 0) goto L_0x009e
            goto L_0x002d
        L_0x009e:
            if (r10 == 0) goto L_0x002d
            java.lang.Object r0 = kotlin.collections.C19318k.m32612d1(r0)
            r14 = r0
            android.text.style.URLSpan r14 = (android.text.style.URLSpan) r14
            int r15 = r11.getSpanStart(r14)
            int r5 = r11.getSpanEnd(r14)
            java.lang.String r16 = r14.getURL()
            com.etsy.android.ui.styledbanner.StyledBannerViewHolder$processMessageLinks$1$clickableLinkSpan$1 r4 = new com.etsy.android.ui.styledbanner.StyledBannerViewHolder$processMessageLinks$1$clickableLinkSpan$1
            r0 = r4
            r2 = r19
            r3 = r20
            r17 = r4
            r4 = r10
            r18 = r5
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 17
            if (r15 <= r13) goto L_0x00d6
            int r1 = r10.getCurrentTextColor()
            com.etsy.android.ui.styledbanner.StyledBannerViewHolder$createClickableBannerSpan$1 r2 = new com.etsy.android.ui.styledbanner.StyledBannerViewHolder$createClickableBannerSpan$1
            r2.<init>(r6, r7, r1)
            int r1 = r15 + -1
            r11.setSpan(r2, r12, r1, r0)
        L_0x00d6:
            r11.removeSpan(r14)
            r2 = r17
            r1 = r18
            r11.setSpan(r2, r15, r1, r0)
            int r0 = r11.length()
            if (r1 >= r0) goto L_0x00f8
            int r0 = r10.getCurrentTextColor()
            com.etsy.android.ui.styledbanner.StyledBannerViewHolder$createClickableBannerSpan$1 r2 = new com.etsy.android.ui.styledbanner.StyledBannerViewHolder$createClickableBannerSpan$1
            r2.<init>(r6, r7, r0)
            int r0 = r11.length()
            r3 = 18
            r11.setSpan(r2, r1, r0, r3)
        L_0x00f8:
            r10.setText(r11)
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r10.setMovementMethod(r0)
            goto L_0x002d
        L_0x0104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p468ve.C13786c.mo46650k(com.etsy.android.lib.models.StyledBannerModel, androidx.core.view.n0):void");
    }

    /* renamed from: l */
    public final void mo46651l(boolean z) {
        this.f30334n.setClipToOutline(z);
        this.f30334n.setClipChildren(z);
        this.f30334n.setClipToPadding(z);
        this.f30335o.setClipChildren(z);
        this.f30335o.setClipToPadding(z);
        this.f30337q.setClipChildren(z);
        this.f30337q.setClipToPadding(z);
        this.f30329i.setClipChildren(z);
        this.f30329i.setClipToPadding(z);
    }
}
