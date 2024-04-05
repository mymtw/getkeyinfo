package com.etsy.android.p327ui.user.privacy;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.views.CollageSwitch;
import com.etsy.android.uikit.adapter.C11829a;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import p418pa.C13198d;
import p418pa.C13207f;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.user.privacy.a */
public final class C11618a extends C11829a<C13207f> {

    /* renamed from: b */
    public final C8672b f25717b;

    /* renamed from: c */
    public final C19861p<String, Boolean, C19394m> f25718c;

    /* renamed from: com.etsy.android.ui.user.privacy.a$a */
    public static final class C11619a extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public final C8672b f25719b;

        /* renamed from: c */
        public final TextView f25720c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11619a(View view, C8672b bVar) {
            super(view);
            C19383o.m32797g(bVar, "analyticsTracker");
            this.f25719b = bVar;
            View findViewById = view.findViewById(R.id.privacysetting_disclaimer_text);
            C19383o.m32796f(findViewById, "view.findViewById(R.id.p…ysetting_disclaimer_text)");
            this.f25720c = (TextView) findViewById;
        }
    }

    /* renamed from: com.etsy.android.ui.user.privacy.a$b */
    public static final class C11620b extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public final TextView f25721b;

        /* renamed from: c */
        public final TextView f25722c;

        public C11620b(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.privacysetting_info_title);
            C19383o.m32796f(findViewById, "view.findViewById(R.id.privacysetting_info_title)");
            this.f25721b = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.privacysetting_info_value);
            C19383o.m32796f(findViewById2, "view.findViewById(R.id.privacysetting_info_value)");
            this.f25722c = (TextView) findViewById2;
        }
    }

    /* renamed from: com.etsy.android.ui.user.privacy.a$c */
    public static final class C11621c extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public final CollageSwitch f25723b;

        static {
            int i = CollageSwitch.$stable;
        }

        public C11621c(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.privacysetting_toggle_root);
            C19383o.m32796f(findViewById, "view.findViewById(R.id.privacysetting_toggle_root)");
            this.f25723b = (CollageSwitch) findViewById;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11618a(FragmentActivity fragmentActivity, C8672b bVar, C19861p<? super String, ? super Boolean, C19394m> pVar) {
        super(fragmentActivity);
        C19383o.m32797g(bVar, "viewTracker");
        this.f25717b = bVar;
        this.f25718c = pVar;
    }

    public final void clear() {
        this.mItems.clear();
    }

    public final int getListItemViewType(int i) {
        C13207f fVar = (C13207f) getItem(i);
        if (fVar instanceof C13207f.C13210c) {
            return R.layout.item_privacysetting_toggle;
        }
        if (fVar instanceof C13207f.C13209b) {
            return R.layout.item_privacysetting_info;
        }
        if (fVar instanceof C13207f.C13208a) {
            return R.layout.item_privacysetting_disclaimer;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void onBindListItemViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        RecyclerView.C3084b0 b0Var2 = b0Var;
        C13207f fVar = (C13207f) getItem(i);
        int i2 = 0;
        if (fVar instanceof C13207f.C13210c) {
            C19383o.m32795e(b0Var2, "null cannot be cast to non-null type com.etsy.android.ui.user.privacy.PrivacyListAdapter.ToggleViewHolder");
            C11621c cVar = (C11621c) b0Var2;
            C19861p<String, Boolean, C19394m> pVar = this.f25718c;
            C19383o.m32797g(fVar, "item");
            C19383o.m32797g(pVar, "callback");
            C13207f.C13210c cVar2 = (C13207f.C13210c) fVar;
            Integer num = C13198d.f29029f.get(cVar2.f29045a);
            int intValue = num != null ? num.intValue() : 0;
            Integer num2 = C13198d.f29030g.get(cVar2.f29045a);
            if (num2 != null) {
                i2 = num2.intValue();
            }
            cVar.f25723b.setTitle("");
            cVar.f25723b.setDescription("");
            if (intValue != 0) {
                CollageSwitch collageSwitch = cVar.f25723b;
                collageSwitch.setTitle(collageSwitch.getContext().getString(intValue));
            }
            if (i2 != 0) {
                CollageSwitch collageSwitch2 = cVar.f25723b;
                collageSwitch2.setDescription(collageSwitch2.getContext().getString(i2));
            }
            cVar.f25723b.setOnCheckedChangeListener((C19861p<? super View, ? super Boolean, C19394m>) PrivacyListAdapter$ToggleViewHolder$bind$1.INSTANCE);
            cVar.f25723b.setChecked(cVar2.f29046b);
            cVar.f25723b.setEnabled(true);
            cVar.f25723b.setOnCheckedChangeListener((C19861p<? super View, ? super Boolean, C19394m>) new PrivacyListAdapter$ToggleViewHolder$bind$2(pVar, fVar, cVar));
        } else if (fVar instanceof C13207f.C13209b) {
            C19383o.m32795e(b0Var2, "null cannot be cast to non-null type com.etsy.android.ui.user.privacy.PrivacyListAdapter.InfoViewHolder");
            C11620b bVar = (C11620b) b0Var2;
            C19383o.m32797g(fVar, "item");
            C13207f.C13209b bVar2 = (C13207f.C13209b) fVar;
            bVar.f25721b.setText(bVar2.f29043a);
            bVar.f25722c.setText(bVar2.f29044b);
        } else if (fVar instanceof C13207f.C13208a) {
            C19383o.m32795e(b0Var2, "null cannot be cast to non-null type com.etsy.android.ui.user.privacy.PrivacyListAdapter.DisclaimerViewHolder");
            C11619a aVar = (C11619a) b0Var2;
            C19383o.m32797g(fVar, "item");
            C13207f.C13208a aVar2 = (C13207f.C13208a) fVar;
            String obj = aVar.f25720c.getContext().getText(R.string.privacy_disclaimer).toString();
            String obj2 = aVar.f25720c.getContext().getText(R.string.privacy_disclaimer_california_disclaimer).toString();
            String obj3 = aVar.f25720c.getContext().getText(R.string.privacy_disclaimer_advertising).toString();
            String obj4 = aVar.f25720c.getContext().getText(R.string.privacy_disclaimer_advertising_learn_more).toString();
            String obj5 = aVar.itemView.getContext().getText(R.string.privacy_disclaimer_privacy_policy_link_replace).toString();
            String obj6 = aVar.itemView.getContext().getText(R.string.privacy_disclaimer_legal_link_replace).toString();
            String obj7 = aVar.itemView.getContext().getText(R.string.privacy_disclaimer_here_replace).toString();
            C11616xd8710c2 privacyListAdapter$DisclaimerViewHolder$bind$privacyPolicyClickResult$1 = new C11616xd8710c2(aVar);
            PrivacyListAdapter$DisclaimerViewHolder$bind$cookieClickResult$1 privacyListAdapter$DisclaimerViewHolder$bind$cookieClickResult$1 = new PrivacyListAdapter$DisclaimerViewHolder$bind$cookieClickResult$1(aVar);
            C11617x83ed20f1 privacyListAdapter$DisclaimerViewHolder$bind$privacySettingsClickResult$1 = new C11617x83ed20f1(aVar);
            C11615x82e0398 privacyListAdapter$DisclaimerViewHolder$bind$personalAdvertisingClickResult$1 = new C11615x82e0398(aVar);
            int l1 = C19459m.m33043l1(obj, obj5, 0, false, 6);
            int length = obj5.length() + C19459m.m33043l1(obj, obj5, 0, false, 6);
            int l12 = C19459m.m33043l1(obj, obj6, 0, false, 6);
            int length2 = obj6.length() + C19459m.m33043l1(obj, obj6, 0, false, 6);
            C11619a aVar3 = aVar;
            int l13 = C19459m.m33043l1(obj, obj7, 0, false, 6);
            C11615x82e0398 privacyListAdapter$DisclaimerViewHolder$bind$personalAdvertisingClickResult$12 = privacyListAdapter$DisclaimerViewHolder$bind$personalAdvertisingClickResult$1;
            int length3 = obj7.length() + C19459m.m33043l1(obj, obj7, 0, false, 6);
            String str = obj3;
            int l14 = C19459m.m33043l1(obj4, obj7, 0, false, 6);
            int length4 = obj7.length() + C19459m.m33043l1(obj4, obj7, 0, false, 6);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(obj);
            if (l1 != -1) {
                spannableStringBuilder.setSpan(privacyListAdapter$DisclaimerViewHolder$bind$privacyPolicyClickResult$1, l1, length, 0);
            }
            if (l12 != -1) {
                spannableStringBuilder.setSpan(privacyListAdapter$DisclaimerViewHolder$bind$cookieClickResult$1, l12, length2, 0);
            }
            if (l13 != -1) {
                spannableStringBuilder.setSpan(privacyListAdapter$DisclaimerViewHolder$bind$privacySettingsClickResult$1, l13, length3, 0);
            }
            spannableStringBuilder.append(obj2, new StyleSpan(1), 33);
            spannableStringBuilder.append(str);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(obj4);
            if (l14 != -1) {
                spannableStringBuilder2.setSpan(privacyListAdapter$DisclaimerViewHolder$bind$personalAdvertisingClickResult$12, l14, length4, 0);
            }
            spannableStringBuilder.append(spannableStringBuilder2);
            C11619a aVar4 = aVar3;
            aVar4.f25720c.setLinksClickable(true);
            aVar4.f25720c.setClickable(true);
            aVar4.f25720c.setMovementMethod(LinkMovementMethod.getInstance());
            aVar4.f25720c.setText(spannableStringBuilder);
        }
    }

    public final RecyclerView.C3084b0 onCreateListItemViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        View j0 = C0114h.m305j0(viewGroup, i, false);
        switch (i) {
            case R.layout.item_privacysetting_disclaimer:
                return new C11619a(j0, this.f25717b);
            case R.layout.item_privacysetting_info:
                return new C11620b(j0);
            case R.layout.item_privacysetting_toggle:
                return new C11621c(j0);
            default:
                throw new IllegalArgumentException("Unrecognized view type!");
        }
    }
}
