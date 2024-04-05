package com.etsy.android.p327ui.cardview.viewholders;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.cardviewelement.IPageLink;
import com.etsy.android.lib.models.interfaces.IServerDrivenAction;
import com.etsy.android.p327ui.cardview.clickhandlers.C9121f;
import com.etsy.android.stylekit.accessibility.views.AccessibilityClassNames;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import com.etsy.android.vespa.IVespaListSectionHeader;
import com.etsy.android.vespa.viewholders.C12086e;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p260v0.C8184a;
import p396mb.C13046k;
import p404nb.C13100a;
import p435rb.C13351b;

/* renamed from: com.etsy.android.ui.cardview.viewholders.d0 */
public final class C9168d0 extends C12086e<IVespaListSectionHeader> {

    /* renamed from: c */
    public final C9121f f20181c;

    /* renamed from: d */
    public TextView f20182d;

    /* renamed from: e */
    public TextView f20183e;

    /* renamed from: f */
    public ImageView f20184f;

    /* renamed from: g */
    public Button f20185g;

    /* renamed from: h */
    public C13046k f20186h;

    /* renamed from: com.etsy.android.ui.cardview.viewholders.d0$a */
    public /* synthetic */ class C9169a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20187a;

        static {
            int[] iArr = new int[IVespaListSectionHeader.Style.values().length];
            iArr[IVespaListSectionHeader.Style.EXTRA_PADDING.ordinal()] = 1;
            f20187a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9168d0(ViewGroup viewGroup, C9121f fVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.section_header_with_arrow, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(fVar, "clickHandler");
        this.f20181c = fVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        IVespaListSectionHeader iVespaListSectionHeader = (IVespaListSectionHeader) obj;
        C19383o.m32797g(iVespaListSectionHeader, "basicSectionHeader");
        View view = this.itemView;
        View findViewById = view.findViewById(R.id.headerSubtitle);
        C19383o.m32796f(findViewById, "findViewById(R.id.headerSubtitle)");
        this.f20182d = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.headerTitle);
        C19383o.m32796f(findViewById2, "findViewById(R.id.headerTitle)");
        this.f20183e = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.helpIcon);
        C19383o.m32796f(findViewById3, "findViewById(R.id.helpIcon)");
        this.f20184f = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.actionButton);
        C19383o.m32796f(findViewById4, "findViewById(R.id.actionButton)");
        this.f20185g = (Button) findViewById4;
        List<IVespaListSectionHeader.Style> viewStyles = iVespaListSectionHeader.getViewStyles();
        if (viewStyles != null) {
            for (IVespaListSectionHeader.Style style : viewStyles) {
                if (style != null && C9169a.f20187a[style.ordinal()] == 1) {
                    View view2 = this.itemView;
                    C19383o.m32796f(view2, "itemView");
                    view2.setPadding(this.itemView.getResources().getDimensionPixelSize(R.dimen.clg_space_8), this.itemView.getResources().getDimensionPixelSize(R.dimen.clg_space_4), this.itemView.getResources().getDimensionPixelSize(R.dimen.clg_space_8), this.itemView.getResources().getDimensionPixelSize(R.dimen.clg_space_8));
                }
            }
        }
        TextView textView = this.f20183e;
        if (textView != null) {
            textView.setText(iVespaListSectionHeader.getTitle());
            if (iVespaListSectionHeader.getPageLink() != null) {
                TextView textView2 = this.f20183e;
                if (textView2 != null) {
                    C13351b.m21017a(textView2, (Integer) null);
                } else {
                    C19383o.m32805o("headerTitle");
                    throw null;
                }
            }
            if (iVespaListSectionHeader.getSubtitle() != null) {
                TextView textView3 = this.f20182d;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                    TextView textView4 = this.f20182d;
                    if (textView4 != null) {
                        textView4.setText(iVespaListSectionHeader.getSubtitle());
                        View view3 = this.itemView;
                        StringBuilder sb = new StringBuilder();
                        TextView textView5 = this.f20183e;
                        if (textView5 != null) {
                            sb.append(textView5.getText());
                            sb.append(", ");
                            TextView textView6 = this.f20182d;
                            if (textView6 != null) {
                                sb.append(textView6.getText());
                                view3.setContentDescription(sb.toString());
                            } else {
                                C19383o.m32805o("headerSubtitle");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("headerTitle");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("headerSubtitle");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("headerSubtitle");
                    throw null;
                }
            } else {
                TextView textView7 = this.f20182d;
                if (textView7 != null) {
                    textView7.setVisibility(8);
                    View view4 = this.itemView;
                    TextView textView8 = this.f20183e;
                    if (textView8 != null) {
                        view4.setContentDescription(textView8.getText());
                    } else {
                        C19383o.m32805o("headerTitle");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("headerSubtitle");
                    throw null;
                }
            }
            IServerDrivenAction action = iVespaListSectionHeader.getAction();
            IPageLink pageLink = iVespaListSectionHeader.getPageLink();
            if (action != null) {
                if (C19383o.m32792b(action.getIcon(), "help")) {
                    ImageView imageView = this.f20184f;
                    if (imageView != null) {
                        ViewExtensions.m12869m(imageView);
                        View view5 = this.itemView;
                        Context context = view5.getContext();
                        Object obj2 = C8184a.f17966a;
                        view5.setBackground(C8184a.C8187c.m16466b(context, R.drawable.clg_touch_feedback));
                        View view6 = this.itemView;
                        C19383o.m32796f(view6, "itemView");
                        ViewExtensions.m12866j(view6, new HeaderWithArrowViewHolder$setClickHandler$1(this, action));
                        View view7 = this.itemView;
                        C19383o.m32796f(view7, "itemView");
                        ViewsExtensionsKt.m17423b(view7, AccessibilityClassNames.BUTTON);
                        C13046k kVar = new C13046k(action.getDisplayName());
                        this.f20186h = kVar;
                        View view8 = this.itemView;
                        C19383o.m32796f(view8, "itemView");
                        C13100a.m20770a(view8, kVar);
                        return;
                    }
                    C19383o.m32805o("helpIcon");
                    throw null;
                }
                Button button = this.f20185g;
                if (button != null) {
                    button.setText(action.getDisplayName());
                    button.setContentDescription(action.getDisplayName() + ' ' + iVespaListSectionHeader.getTitle());
                    Button button2 = this.f20185g;
                    if (button2 != null) {
                        ViewExtensions.m12869m(button2);
                        Button button3 = this.f20185g;
                        if (button3 != null) {
                            ViewExtensions.m12866j(button3, new HeaderWithArrowViewHolder$setClickHandler$4(this, action));
                        } else {
                            C19383o.m32805o("actionButton");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("actionButton");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("actionButton");
                    throw null;
                }
            } else if (pageLink != null) {
                View view9 = this.itemView;
                Context context2 = view9.getContext();
                Object obj3 = C8184a.f17966a;
                view9.setBackground(C8184a.C8187c.m16466b(context2, R.drawable.clg_touch_feedback));
                View view10 = this.itemView;
                C19383o.m32796f(view10, "itemView");
                ViewExtensions.m12866j(view10, new HeaderWithArrowViewHolder$setClickHandler$5(this, pageLink));
                View view11 = this.itemView;
                C19383o.m32796f(view11, "itemView");
                ViewsExtensionsKt.m17423b(view11, AccessibilityClassNames.BUTTON);
                C13046k kVar2 = new C13046k(pageLink.getLinkTitle());
                this.f20186h = kVar2;
                View view12 = this.itemView;
                C19383o.m32796f(view12, "itemView");
                C13100a.m20770a(view12, kVar2);
            }
        } else {
            C19383o.m32805o("headerTitle");
            throw null;
        }
    }

    /* renamed from: b */
    public final void mo31374b() {
        View view = this.itemView;
        C19383o.m32796f(view, "");
        view.setPadding(0, 0, 0, 0);
        view.setBackground((Drawable) null);
        view.setOnClickListener((View.OnClickListener) null);
        ViewsExtensionsKt.m17423b(view, AccessibilityClassNames.TEXT_VIEW);
        ImageView imageView = this.f20184f;
        if (imageView != null) {
            ViewExtensions.m12860d(imageView);
            Button button = this.f20185g;
            if (button != null) {
                ViewExtensions.m12860d(button);
                Button button2 = this.f20185g;
                if (button2 != null) {
                    button2.setOnClickListener((View.OnClickListener) null);
                    C13046k kVar = this.f20186h;
                    if (kVar != null) {
                        View view2 = this.itemView;
                        C19383o.m32796f(view2, "itemView");
                        C13100a.m20772c(view2, kVar);
                        return;
                    }
                    return;
                }
                C19383o.m32805o("actionButton");
                throw null;
            }
            C19383o.m32805o("actionButton");
            throw null;
        }
        C19383o.m32805o("helpIcon");
        throw null;
    }
}
