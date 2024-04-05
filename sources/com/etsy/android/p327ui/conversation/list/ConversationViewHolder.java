package com.etsy.android.p327ui.conversation.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.compose.animation.C0388a;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.datatypes.EtsyId;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p280x0.C8292f;
import p354gc.C12763b;
import p354gc.C12784m;
import p435rb.C13350a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.list.ConversationViewHolder */
public final class ConversationViewHolder extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final C19857l<EtsyId, C19394m> f21222b;

    /* renamed from: c */
    public final C19857l<C12763b, C19394m> f21223c;

    /* renamed from: d */
    public final View f21224d = this.itemView.findViewById(R.id.new_message_indicator);

    /* renamed from: e */
    public final TextView f21225e = ((TextView) this.itemView.findViewById(R.id.timestamp));

    /* renamed from: f */
    public final ImageView f21226f = ((ImageView) this.itemView.findViewById(R.id.user_avatar));

    /* renamed from: g */
    public final TextView f21227g = ((TextView) this.itemView.findViewById(R.id.user_name));

    /* renamed from: h */
    public final TextView f21228h = ((TextView) this.itemView.findViewById(R.id.message_preview));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationViewHolder(ViewGroup viewGroup, C19857l<? super EtsyId, C19394m> lVar, C19857l<? super C12763b, C19394m> lVar2) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_conversation, viewGroup, false));
        C19383o.m32797g(viewGroup, "parentView");
        C19383o.m32797g(lVar, "onUserClicked");
        C19383o.m32797g(lVar2, "onConversationClicked");
        this.f21222b = lVar;
        this.f21223c = lVar2;
    }

    /* renamed from: e */
    public final void mo32178e(C12763b bVar) {
        String str;
        C19383o.m32797g(bVar, "conversation");
        this.f21225e.setText(bVar.f28210d);
        C0114h.m270B0(this.itemView.getContext()).load(bVar.f28208b.f28260b).mo46137e0().mo16816M(this.f21226f);
        this.f21226f.setContentDescription(this.itemView.getContext().getString(R.string.convo_user_img_desc, new Object[]{bVar.f28208b.f28259a}));
        ImageView imageView = this.f21226f;
        C19383o.m32796f(imageView, "userAvatar");
        ViewExtensions.m12866j(imageView, new ConversationViewHolder$bind$1(this, bVar));
        TextView textView = this.f21227g;
        C12784m mVar = bVar.f28208b;
        if (mVar.f28263e) {
            str = C0388a.m1049e(new Object[]{mVar.f28259a, this.itemView.getContext().getString(R.string.guest)}, 2, "%s (%s)", "format(format, *args)");
        } else {
            str = mVar.f28259a;
        }
        textView.setText(str);
        this.f21228h.setText(bVar.f28211e);
        if (bVar.f28212f) {
            ViewExtensions.m12863g(this.f21224d);
            TextView textView2 = this.f21227g;
            C19383o.m32796f(textView2, "userName");
            textView2.setTypeface(C8292f.m16582a(textView2.getContext(), R.font.clg_typeface_normal));
            Context context = this.itemView.getContext();
            C19383o.m32796f(context, "itemView.context");
            this.f21227g.setTextColor(C13350a.m21013d(context, R.attr.clg_color_text_secondary));
        } else {
            ViewExtensions.m12869m(this.f21224d);
            TextView textView3 = this.f21227g;
            C19383o.m32796f(textView3, "userName");
            textView3.setTypeface(C8292f.m16582a(textView3.getContext(), R.font.clg_typeface_bold));
            Context context2 = this.itemView.getContext();
            C19383o.m32796f(context2, "itemView.context");
            this.f21227g.setTextColor(C13350a.m21013d(context2, R.attr.clg_color_text_primary));
        }
        View view = this.itemView;
        C19383o.m32796f(view, "itemView");
        ViewExtensions.m12866j(view, new ConversationViewHolder$bind$2(this, bVar));
    }
}
