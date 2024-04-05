package com.etsy.android.p327ui.user.language;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.user.language.C11606h;
import com.etsy.android.stylekit.views.CollageTextView;
import com.etsy.android.uikit.adapter.C11829a;
import java.util.Locale;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p260v0.C8184a;
import p280x0.C8292f;
import p435rb.C13351b;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.language.a */
public final class C11593a extends C11829a<C11609i> {

    /* renamed from: b */
    public final C19846a<Boolean> f25678b;

    /* renamed from: c */
    public final C19857l<C11609i, C19394m> f25679c;

    /* renamed from: com.etsy.android.ui.user.language.a$a */
    public static final class C11594a extends RecyclerView.C3084b0 {

        /* renamed from: c */
        public static final /* synthetic */ int f25680c = 0;

        /* renamed from: b */
        public final TextView f25681b;

        public C11594a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.language_header);
            C19383o.m32796f(findViewById, "view.findViewById(R.id.language_header)");
            this.f25681b = (TextView) findViewById;
        }
    }

    public C11593a(FragmentActivity fragmentActivity, C19846a<Boolean> aVar, C19857l<? super C11609i, C19394m> lVar) {
        super(fragmentActivity);
        this.f25678b = aVar;
        this.f25679c = lVar;
    }

    public final int getListItemViewType(int i) {
        return 0;
    }

    public final void onBindHeaderViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C19383o.m32795e(b0Var, "null cannot be cast to non-null type com.etsy.android.ui.user.language.LanguageAdapter.LanguageHeaderViewHolder");
        TextView textView = ((C11594a) b0Var).f25681b;
        FragmentActivity fragmentActivity = this.mContext;
        Locale locale = Resources.getSystem().getConfiguration().locale;
        String displayLanguage = locale.getDisplayLanguage(locale);
        C19383o.m32796f(displayLanguage, "deviceLocale.getDisplayLanguage(deviceLocale)");
        textView.setText(fragmentActivity.getString(R.string.language_device_notsupported, new Object[]{displayLanguage}));
    }

    public final void onBindListItemViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        if (b0Var != null && (b0Var instanceof C11596c)) {
            C11596c cVar = (C11596c) b0Var;
            T t = this.mItems.get(i - getHeaderCount());
            C19383o.m32796f(t, "mItems[position - headerCount]");
            C11609i iVar = (C11609i) t;
            cVar.f25685d.setText(iVar.f25707d);
            if ((!cVar.f25683b.invoke().booleanValue() || !C19383o.m32792b(iVar.f25708e, C11606h.C11607a.f25702a)) && !iVar.f25709f) {
                CollageTextView collageTextView = cVar.f25685d;
                C19383o.m32797g(collageTextView, "<this>");
                collageTextView.setTypeface(C8292f.m16582a(collageTextView.getContext(), R.font.clg_typeface_normal));
                cVar.f25685d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                CollageTextView collageTextView2 = cVar.f25685d;
                C19383o.m32797g(collageTextView2, "<this>");
                collageTextView2.setTypeface(C8292f.m16582a(collageTextView2.getContext(), R.font.clg_typeface_bold));
                Context context = cVar.itemView.getContext();
                Object obj = C8184a.f17966a;
                Drawable b = C8184a.C8187c.m16466b(context, R.drawable.clg_icon_core_check_v1);
                if (b != null) {
                    b.setBounds(0, 0, cVar.itemView.getResources().getDimensionPixelSize(R.dimen.clg_icon_size_smaller), cVar.itemView.getResources().getDimensionPixelSize(R.dimen.clg_icon_size_smaller));
                }
                C13351b.m21020d(cVar.f25685d, (Drawable) null, b, 11);
            }
            ViewExtensions.m12866j(cVar.f25685d, new LanguageItemViewHolder$bind$1(cVar, iVar));
        }
    }

    public final RecyclerView.C3084b0 onCreateHeaderViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        int i2 = C11594a.f25680c;
        return new C11594a(C0114h.m305j0(viewGroup, R.layout.list_item_language_header, false));
    }

    public final RecyclerView.C3084b0 onCreateListItemViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        int i2 = C11596c.f25682e;
        return new C11596c(C0114h.m305j0(viewGroup, R.layout.list_item_language, false), this.f25678b, this.f25679c);
    }
}
