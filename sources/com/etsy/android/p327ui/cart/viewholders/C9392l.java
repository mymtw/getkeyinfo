package com.etsy.android.p327ui.cart.viewholders;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.method.MovementMethod;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.CheckoutButtonDescription;
import com.etsy.android.lib.models.apiv3.cart.CheckoutSection;
import com.etsy.android.lib.models.apiv3.cart.InfoModal;
import com.etsy.android.p327ui.cart.C9329o;
import com.etsy.android.p327ui.cart.clicklisteners.C9287l;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import kotlinx.coroutines.C19543e0;
import p145io.reactivex.BackpressureStrategy;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax;
import p145io.reactivex.internal.subscribers.LambdaSubscriber;
import p269vp.C8221a;
import p277w8.C8266d;
import p280x0.C8292f;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.cart.viewholders.l */
public final class C9392l extends C9370c {

    /* renamed from: k */
    public static final /* synthetic */ int f20805k = 0;

    /* renamed from: c */
    public final C9287l f20806c;

    /* renamed from: d */
    public final C9329o f20807d;

    /* renamed from: e */
    public final Button f20808e;

    /* renamed from: f */
    public final Button f20809f;

    /* renamed from: g */
    public final TextView f20810g;

    /* renamed from: h */
    public final TextView f20811h;

    /* renamed from: i */
    public LambdaSubscriber f20812i;

    /* renamed from: j */
    public Button f20813j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9392l(ViewGroup viewGroup, C9287l lVar, C9329o oVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_msco_checkout, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(lVar, "clickListener");
        C19383o.m32797g(oVar, "cartScrollEventDelegate");
        this.f20806c = lVar;
        this.f20807d = oVar;
        View f = mo38986f(R.id.btn_checkout_default);
        C19383o.m32795e(f, "null cannot be cast to non-null type android.widget.Button");
        Button button = (Button) f;
        this.f20808e = button;
        View f2 = mo38986f(R.id.btn_checkout_paypal);
        C19383o.m32795e(f2, "null cannot be cast to non-null type android.widget.Button");
        this.f20809f = (Button) f2;
        View f3 = mo38986f(R.id.description);
        C19383o.m32795e(f3, "null cannot be cast to non-null type android.widget.TextView");
        this.f20810g = (TextView) f3;
        View f4 = mo38986f(R.id.disclaimer_text_view);
        C19383o.m32795e(f4, "null cannot be cast to non-null type android.widget.TextView");
        this.f20811h = (TextView) f4;
        this.f20813j = button;
    }

    /* renamed from: g */
    public final void mo31413g(CartGroupItem cartGroupItem) {
        C19383o.m32797g(cartGroupItem, "item");
        LambdaSubscriber lambdaSubscriber = this.f20812i;
        if (lambdaSubscriber != null) {
            lambdaSubscriber.dispose();
        }
        CheckoutSection checkoutSection = (CheckoutSection) cartGroupItem.getData();
        if (checkoutSection != null) {
            int i = 8;
            this.f20808e.setVisibility(8);
            this.f20809f.setVisibility(8);
            if (C19383o.m32792b(checkoutSection.getButtonType(), "paypal")) {
                Resources resources = this.itemView.getResources();
                String string = resources.getString(R.string.payment_method_label_paypal);
                C19383o.m32796f(string, "res.getString(R.string.p…ment_method_label_paypal)");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(resources.getString(R.string.checkout_button_with_method, new Object[]{string}));
                String spannableStringBuilder2 = spannableStringBuilder.toString();
                C19383o.m32796f(spannableStringBuilder2, "spannableBuilder.toString()");
                int l1 = C19459m.m33043l1(spannableStringBuilder2, string, 0, false, 6);
                spannableStringBuilder.replace(l1, string.length() + l1, "  ");
                Resources resources2 = this.itemView.getResources();
                Resources.Theme theme = this.itemView.getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = C8292f.f18172a;
                Drawable drawable = resources2.getDrawable(R.drawable.paypal_logo_white, theme);
                if (drawable != null) {
                    drawable.mutate();
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    drawable.setTintList(this.f20809f.getTextColors());
                    Context context = this.itemView.getContext();
                    C19383o.m32796f(context, "itemView.context");
                    spannableStringBuilder.setSpan(new PaypalLogoImageSpan(context, drawable), l1 + 1, l1 + 2, 33);
                }
                this.f20809f.setText(spannableStringBuilder);
                this.f20809f.setVisibility(0);
                Button button = this.f20809f;
                this.f20813j = button;
                if (cartGroupItem.isEnabled()) {
                    ViewExtensions.m12866j(button, new CheckoutSectionViewHolder$setUpClickListener$1(this, checkoutSection));
                } else {
                    button.setOnClickListener((View.OnClickListener) null);
                }
            } else {
                this.f20808e.setText(checkoutSection.getButtonText());
                this.f20808e.setVisibility(0);
                Button button2 = this.f20808e;
                this.f20813j = button2;
                if (cartGroupItem.isEnabled()) {
                    ViewExtensions.m12866j(button2, new CheckoutSectionViewHolder$setUpClickListener$1(this, checkoutSection));
                } else {
                    button2.setOnClickListener((View.OnClickListener) null);
                }
            }
            TextView textView = this.f20810g;
            C9287l lVar = this.f20806c;
            CheckoutButtonDescription buttonDescription = checkoutSection.getButtonDescription();
            if ((buttonDescription != null ? buttonDescription.getText() : null) == null) {
                textView.setText("");
                ViewExtensions.m12860d(textView);
                textView.setMovementMethod((MovementMethod) null);
            } else if (buttonDescription.getInfoModal() != null) {
                InfoModal infoModal = buttonDescription.getInfoModal();
                String text = buttonDescription.getText();
                C19383o.m32794d(text);
                C19543e0.m33318k0(textView, text, infoModal, new CheckoutSectionViewHolder$setUpButtonDescription$1(lVar));
                ViewExtensions.m12869m(textView);
            } else {
                textView.setText(buttonDescription.getText());
                ViewExtensions.m12869m(textView);
                textView.setMovementMethod((MovementMethod) null);
            }
            this.f20811h.setText(checkoutSection.getDisclaimer());
            TextView textView2 = this.f20811h;
            if (C18263b.m30839d0(checkoutSection.getDisclaimer())) {
                i = 0;
            }
            textView2.setVisibility(i);
            this.f20812i = (LambdaSubscriber) this.f20807d.f20600a.mo20640k(BackpressureStrategy.DROP).mo20617a(C8221a.m16513a()).mo20618b(new C8266d(this, 4), Functions.f28541e, Functions.f28539c, FlowableInternalHelper$RequestMax.INSTANCE);
        }
    }
}
