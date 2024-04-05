package com.etsy.android.p327ui.conversation.details;

import android.content.Context;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.uikit.util.EtsyLinkify;
import com.etsy.android.uikit.view.AttachmentThumbnailsView;
import java.util.Iterator;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import kotlinx.coroutines.C19543e0;
import p354gc.C12767e;
import p354gc.C12772f;
import p354gc.C12773g;
import p354gc.C12774h;
import p354gc.C12775i;
import p455u9.C13448b;
import p568fn.C17782b;
import p628nj.C18263b;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.conversation.details.MessageViewHolder */
public abstract class MessageViewHolder extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final C9558n f20976b;

    /* renamed from: c */
    public final C9564q f20977c;

    /* renamed from: d */
    public final View f20978d;

    /* renamed from: e */
    public final TextView f20979e;

    /* renamed from: f */
    public final LinearLayout f20980f;

    /* renamed from: g */
    public final AttachmentThumbnailsView f20981g;

    /* renamed from: h */
    public ConstraintLayout f20982h;

    /* renamed from: i */
    public ImageView f20983i;

    /* renamed from: j */
    public TextView f20984j;

    /* renamed from: k */
    public TextView f20985k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageViewHolder(ViewGroup viewGroup, int i, C9558n nVar, C9564q qVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
        C19383o.m32797g(viewGroup, "parentView");
        C19383o.m32797g(nVar, "imageClickListener");
        C19383o.m32797g(qVar, "linkCardClickListener");
        this.f20976b = nVar;
        this.f20977c = qVar;
        View findViewById = this.itemView.findViewById(R.id.background);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.background)");
        this.f20978d = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.message_text);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.message_text)");
        this.f20979e = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.link_cards_layout);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.link_cards_layout)");
        this.f20980f = (LinearLayout) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.image_thumbnails_layout);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.….image_thumbnails_layout)");
        this.f20981g = (AttachmentThumbnailsView) findViewById4;
    }

    /* renamed from: e */
    public final void mo31958e(C12767e eVar, List<C12774h> list) {
        Object obj;
        String str;
        boolean z;
        ConstraintLayout constraintLayout;
        C19383o.m32797g(eVar, "groupedMessageItem");
        C19383o.m32797g(list, "images");
        if (eVar.mo45523a().f28244a.length() == 0) {
            ViewExtensions.m12860d(this.f20979e);
        } else {
            this.f20979e.setText(Html.fromHtml(C19457k.m33023a1(eVar.mo45523a().f28244a, "\n", "<br>", false), 63));
            String str2 = eVar.mo45523a().f28244a;
            Context context = this.itemView.getContext();
            C19383o.m32796f(context, "itemView.context");
            TextView textView = this.f20979e;
            C19383o.m32797g(str2, "text");
            C19383o.m32797g(textView, "textview");
            if (C18263b.m30810E(str2)) {
                textView.setAutoLinkMask(0);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                EtsyLinkify.m19611e(context, textView, true, 1, (C19846a<C19394m>) null);
            }
            ViewExtensions.m12869m(this.f20979e);
        }
        this.f20980f.removeAllViews();
        this.f20980f.setVisibility(C19543e0.m33306Y(eVar.mo45523a().f28256m) ? 0 : 8);
        List<C12775i> list2 = eVar.mo45523a().f28256m;
        if (list2 != null) {
            for (C12775i iVar : list2) {
                View inflate = LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.conversation_link_card, this.f20980f, false);
                ConstraintLayout constraintLayout2 = inflate instanceof ConstraintLayout ? (ConstraintLayout) inflate : null;
                this.f20982h = constraintLayout2;
                this.f20983i = constraintLayout2 != null ? (ImageView) constraintLayout2.findViewById(R.id.image) : null;
                ConstraintLayout constraintLayout3 = this.f20982h;
                this.f20984j = constraintLayout3 != null ? (TextView) constraintLayout3.findViewById(R.id.title) : null;
                ConstraintLayout constraintLayout4 = this.f20982h;
                this.f20985k = constraintLayout4 != null ? (TextView) constraintLayout4.findViewById(R.id.subtitle) : null;
                if (iVar.f28231d.length() == 0) {
                    ImageView imageView = this.f20983i;
                    if (imageView != null) {
                        imageView.setImageResource(R.drawable.clg_icon_core_help_v1);
                    }
                } else {
                    C13448b d0 = C0114h.m272C0(this.itemView).load(iVar.f28231d).mo46136d0();
                    ImageView imageView2 = this.f20983i;
                    C19383o.m32794d(imageView2);
                    d0.mo16816M(imageView2);
                }
                TextView textView2 = this.f20984j;
                if (textView2 != null) {
                    textView2.setText(iVar.f28229b);
                }
                TextView textView3 = this.f20985k;
                if (textView3 != null) {
                    textView3.setText(iVar.f28230c);
                }
                TextView textView4 = this.f20985k;
                if (textView4 != null) {
                    textView4.setVisibility(iVar.f28230c.length() > 0 ? 0 : 8);
                }
                if (C18263b.m30839d0(iVar.f28232e) && (constraintLayout = this.f20982h) != null) {
                    ViewExtensions.m12866j(constraintLayout, new MessageViewHolder$bind$1$1(this, iVar));
                }
                ConstraintLayout constraintLayout5 = this.f20982h;
                if (constraintLayout5 != null) {
                    constraintLayout5.setBackgroundResource(mo31959f());
                }
                this.f20980f.addView(this.f20982h);
            }
        }
        this.f20981g.clear();
        if (list.isEmpty()) {
            ViewExtensions.m12860d(this.f20981g);
        } else {
            ViewExtensions.m12869m(this.f20981g);
            int dimensionPixelSize = this.itemView.getResources().getDimensionPixelSize(R.dimen.attachment_thumbnail_size);
            int i = 0;
            for (T next : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    C12774h hVar = (C12774h) next;
                    Iterator it = C19327t.m32656l1(hVar.f28227a, new C12773g()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        C12772f fVar = (C12772f) obj;
                        if (dimensionPixelSize > fVar.f28225b || dimensionPixelSize > fVar.f28224a) {
                            z = false;
                            continue;
                        } else {
                            z = true;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                    C12772f fVar2 = (C12772f) obj;
                    if (fVar2 == null || (str = fVar2.f28226c) == null) {
                        str = hVar.mo45540a();
                    }
                    this.f20981g.addImage(str, (View.OnClickListener) new MessageViewHolder$bind$2$1(this, i, list));
                    i = i2;
                } else {
                    C17782b.m29877o0();
                    throw null;
                }
            }
        }
        mo31960g(eVar);
    }

    /* renamed from: f */
    public abstract int mo31959f();

    /* renamed from: g */
    public abstract void mo31960g(C12767e eVar);
}
