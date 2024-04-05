package com.etsy.android.p327ui.cart.viewholders;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.C6331b;
import com.etsy.android.R;
import com.etsy.android.checkout.C6335b;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.GiftOptions;
import com.etsy.android.lib.models.apiv3.cart.ShopHeader;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.lib.util.C8884d;
import com.etsy.android.p327ui.cart.clicklisteners.C9288m;
import com.google.android.gms.common.api.Api;
import com.jakewharton.rxbinding2.widget.C17030q;
import com.jakewharton.rxbinding2.widget.C17033s;
import com.jakewharton.rxbinding2.widget.C17035t;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import p028b9.C3506b;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.C19146a0;
import p145io.reactivex.internal.operators.observable.ObservableObserveOn;
import p260v0.C8184a;
import p269vp.C8221a;
import p280x0.C8292f;
import p415of.C13186o;
import p553do.C17700a;

/* renamed from: com.etsy.android.ui.cart.viewholders.s */
public final class C9405s extends C9370c {

    /* renamed from: n */
    public static final /* synthetic */ int f20842n = 0;

    /* renamed from: c */
    public C9288m f20843c;

    /* renamed from: d */
    public CheckBox f20844d = ((CheckBox) mo38986f(R.id.gift_options_gift_checkbox));

    /* renamed from: e */
    public CheckBox f20845e = ((CheckBox) mo38986f(R.id.gift_options_gift_message_checkbox));

    /* renamed from: f */
    public TextView f20846f;

    /* renamed from: g */
    public View f20847g = mo38986f(R.id.gift_options_gift_wrap_container);

    /* renamed from: h */
    public CheckBox f20848h = ((CheckBox) mo38986f(R.id.gift_options_gift_wrap_checkbox));

    /* renamed from: i */
    public View f20849i = mo38986f(R.id.gift_options_gift_wrap_details);

    /* renamed from: j */
    public EditText f20850j;

    /* renamed from: k */
    public final ObservableObserveOn f20851k;

    /* renamed from: l */
    public LambdaObserver f20852l;

    /* renamed from: m */
    public ShopHeader f20853m;

    public C9405s(ViewGroup viewGroup, C9288m mVar) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_gift_options, viewGroup, false));
        this.f20843c = mVar;
        TextView textView = (TextView) mo38986f(R.id.gift_options_gift_message_error);
        this.f20846f = textView;
        textView.setText(viewGroup.getContext().getString(R.string.gift_options_gift_message_too_long, new Object[]{150}));
        EditText editText = (EditText) mo38986f(R.id.gift_options_gift_message);
        this.f20850j = editText;
        editText.setHorizontallyScrolling(false);
        this.f20850j.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        CheckBox checkBox = this.f20844d;
        C19383o.m32797g(checkBox, "<this>");
        checkBox.setTypeface(C8292f.m16582a(checkBox.getContext(), R.font.clg_typeface_normal));
        CheckBox checkBox2 = this.f20845e;
        C19383o.m32797g(checkBox2, "<this>");
        checkBox2.setTypeface(C8292f.m16582a(checkBox2.getContext(), R.font.clg_typeface_normal));
        CheckBox checkBox3 = this.f20848h;
        C19383o.m32797g(checkBox3, "<this>");
        checkBox3.setTypeface(C8292f.m16582a(checkBox3.getContext(), R.font.clg_typeface_normal));
        EditText editText2 = this.f20850j;
        if (editText2 != null) {
            this.f20851k = new C19146a0(new C17033s(editText2)).mo20633c(TimeUnit.MILLISECONDS).mo20635e(C8221a.m16513a());
            EditText editText3 = this.f20850j;
            if (editText3 != null) {
                ObservableObserveOn e = new C17035t(editText3).mo20635e(C8221a.m16513a());
                C6331b bVar = new C6331b(this, 4);
                C9404r rVar = new C9404r();
                Functions.C12958c cVar = Functions.f28539c;
                Functions.C12959d dVar = Functions.f28540d;
                e.mo20636f(bVar, rVar, cVar, dVar);
                EditText editText4 = this.f20850j;
                if (editText4 != null) {
                    C17700a.C17701a aVar = C17700a.f38506a;
                    new C17030q(editText4).mo20635e(C8221a.m16513a()).mo20636f(new C8884d(2), new C6335b(1), cVar, dVar);
                    return;
                }
                throw new NullPointerException("view == null");
            }
            throw new NullPointerException("view == null");
        }
        throw new NullPointerException("view == null");
    }

    /* renamed from: j */
    public static SpannableStringBuilder m17761j(Context context, boolean z) {
        if (!z) {
            return new SpannableStringBuilder(context.getString(R.string.gift_options_gift_message));
        }
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.clg_color_text_secondary, typedValue, true);
        int i = typedValue.resourceId;
        String string = context.getString(R.string.gift_options_gift_message);
        C19383o.m32797g(string, "text");
        String string2 = context.getString(R.string.gift_options_gift_message_reminder);
        C19383o.m32797g(string2, "text");
        Object obj = C8184a.f17966a;
        int a = C8184a.C8188d.m16468a(context, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(string);
        spannableStringBuilder.append("\n");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(string2);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new ForegroundColorSpan(a), length, length2, 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.8f), length, length2, 33);
        return spannableStringBuilder;
    }

    /* renamed from: e */
    public final void mo31843e(C13186o oVar) {
        this.f20853m = (ShopHeader) ((CartGroupItem) oVar).getData();
    }

    /* renamed from: g */
    public final void mo31413g(CartGroupItem cartGroupItem) {
        Context context = this.itemView.getContext();
        GiftOptions giftOptions = (GiftOptions) cartGroupItem.getData();
        this.f20844d.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        this.f20845e.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        this.f20848h.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        CheckBox checkBox = this.f20844d;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.clg_color_text_secondary, typedValue, true);
        int i = typedValue.resourceId;
        String string = context.getString(R.string.gift_options_marked_gift);
        C19383o.m32797g(string, "text");
        String string2 = context.getString(R.string.gift_options_gift_price_hidden);
        C19383o.m32797g(string2, "text");
        Object obj = C8184a.f17966a;
        int a = C8184a.C8188d.m16468a(context, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(string);
        spannableStringBuilder.append("\n");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(string2);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new ForegroundColorSpan(a), length, length2, 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.8f), length, length2, 33);
        checkBox.setText(spannableStringBuilder);
        ShopHeader shopHeader = this.f20853m;
        if (shopHeader != null) {
            this.f20844d.setContentDescription(context.getString(R.string.gift_options_marked_gift_desc, new Object[]{shopHeader.getShopName()}));
            this.f20850j.setHint(context.getString(R.string.gift_options_gift_message_hint_with_a11y, new Object[]{this.f20853m.getShopName()}));
        }
        this.f20844d.setChecked(giftOptions.isGift());
        if (giftOptions.isGift()) {
            mo31845k(giftOptions);
        }
        this.f20844d.setOnCheckedChangeListener(new C9398m(this, cartGroupItem));
        if (!TextUtils.isEmpty(giftOptions.getGiftMessage())) {
            this.f20845e.setChecked(true);
            this.f20850j.setText(giftOptions.getGiftMessage());
        } else {
            this.f20845e.setChecked(false);
        }
        CheckBox checkBox2 = this.f20845e;
        checkBox2.setText(m17761j(context, checkBox2.isChecked()));
        if (this.f20853m != null) {
            CheckBox checkBox3 = this.f20845e;
            checkBox3.setContentDescription(mo31844i(context, Boolean.valueOf(checkBox3.isChecked())));
        }
        this.f20845e.setOnCheckedChangeListener(new C9400n(this, context, cartGroupItem));
        LambdaObserver lambdaObserver = this.f20852l;
        if (lambdaObserver != null) {
            lambdaObserver.dispose();
        }
        this.f20852l = (LambdaObserver) this.f20851k.mo20636f(new C9401o(this, cartGroupItem), new C3506b(2), Functions.f28539c, Functions.f28540d);
        if (giftOptions.getGiftWrap() != null) {
            this.f20848h.setChecked(giftOptions.getGiftWrap().isSelected());
            this.f20848h.setText(context.getString(R.string.gift_options_gift_wrap, new Object[]{giftOptions.getGiftWrap().getPrice().getCurrencyFormattedShort()}));
            this.f20848h.setOnCheckedChangeListener(new C9402p(this, cartGroupItem));
            this.f20849i.setOnClickListener(new C9403q(0, this, giftOptions));
        }
        if (giftOptions.isGift()) {
            mo31845k(giftOptions);
            return;
        }
        this.f20845e.setVisibility(8);
        this.f20850j.setVisibility(8);
        this.f20847g.setVisibility(8);
    }

    /* renamed from: i */
    public final String mo31844i(Context context, Boolean bool) {
        String string = context.getString(R.string.gift_options_gift_message_desc, new Object[]{this.f20853m.getShopName()});
        if (!bool.booleanValue()) {
            return string;
        }
        StringBuilder h = C0072d.m201h(string);
        h.append(context.getString(R.string.gift_options_gift_message_reminder));
        return h.toString();
    }

    /* renamed from: k */
    public final void mo31845k(GiftOptions giftOptions) {
        int i = 8;
        this.f20845e.setVisibility(giftOptions.offersGiftMessage() ? 0 : 8);
        this.f20850j.setVisibility(giftOptions.offersGiftMessage() && !TextUtils.isEmpty(giftOptions.getGiftMessage()) ? 0 : 8);
        View view = this.f20847g;
        if (giftOptions.getGiftWrap() != null) {
            i = 0;
        }
        view.setVisibility(i);
    }

    /* renamed from: l */
    public final void mo31846l(CartGroupItem cartGroupItem, String str) {
        ((GiftOptions) cartGroupItem.getData()).setGiftMessage(str);
        ServerDrivenAction action = cartGroupItem.getAction("gift_message");
        if (action != null) {
            action.addParam("value", str);
            this.f20843c.mo45936d(this.itemView, action);
        }
    }
}
