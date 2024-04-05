package com.etsy.android.lib.toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextViewStyleApplier;
import com.etsy.android.R;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.uikit.AppBarHelper;
import com.etsy.android.uikit.BaseActivity;
import com.etsy.android.uikit.nav.transactions.TransactionDataRepository;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import p242t3.C7955e;
import p479xa.C13862a;

public class AdminToolbarActivity extends BaseActivity {
    private static final String ANALYTICS_TYPE_EVENT = "Event";
    private static final String ANALYTICS_TYPE_PAGEVIEW = "PageView";
    private int mMargin;
    private int mOrangeColor;
    private int mRedColor;

    private Spannable coloredAnalyticsSpan(String str) {
        SpannableString spannableString = new SpannableString(str);
        int indexOf = str.indexOf(ANALYTICS_TYPE_EVENT);
        if (indexOf >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(this.mOrangeColor), indexOf, indexOf + 5, 33);
        }
        int indexOf2 = str.indexOf(ANALYTICS_TYPE_PAGEVIEW);
        if (indexOf2 >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(this.mRedColor), indexOf2, indexOf2 + 8, 33);
        }
        return spannableString;
    }

    private Button getJSONResponseButton(AdminToolbarNetworkResponse adminToolbarNetworkResponse) {
        Button button = new Button(this);
        button.setText(adminToolbarNetworkResponse.getUrl());
        new TextViewStyleApplier(button).mo14737a(new C7955e(R.style.clg_button_secondary_alt_small));
        button.setOnClickListener(new C13862a(0, this, adminToolbarNetworkResponse));
        return button;
    }

    /* access modifiers changed from: private */
    public void lambda$getJSONResponseButton$0(AdminToolbarNetworkResponse adminToolbarNetworkResponse, View view) {
        Intent intent = new Intent(this, AdminToolbarJSONActivity.class);
        C19383o.m32797g(adminToolbarNetworkResponse, "value");
        C19285c<TransactionDataRepository> cVar = TransactionDataRepository.f26402b;
        intent.putExtra("transaction-data", TransactionDataRepository.C11867a.m19552a().mo38343b(adminToolbarNetworkResponse));
        startActivity(intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_admin_toolbar);
        this.mOrangeColor = getResources().getColor(R.color.sk_orange_30);
        this.mRedColor = getResources().getColor(R.color.clg_color_brick);
        this.mMargin = getResources().getDimensionPixelOffset(R.dimen.margin_small);
        AppBarHelper appBarHelper = getAppBarHelper();
        C8860a aVar = C8860a.f19558o;
        String str = "";
        appBarHelper.setTitle((CharSequence) aVar != null ? aVar.f19561b : str);
        TextView textView = (TextView) findViewById(R.id.fragment);
        C8860a aVar2 = C8860a.f19558o;
        String str2 = "Error: Admin Toolbar instance not initialized";
        textView.setText(aVar2 != null ? aVar2.f19564e : str2);
        TextView textView2 = (TextView) findViewById(R.id.activity);
        C8860a aVar3 = C8860a.f19558o;
        if (aVar3 != null) {
            str2 = aVar3.f19565f;
        }
        textView2.setText(str2);
        Locale locale = Locale.ROOT;
        ((TextView) findViewById(R.id.analytics_title)).setText(String.format(locale, "Last %d Analytics Events:", new Object[]{5}));
        ((TextView) findViewById(R.id.responses_title)).setText(String.format(locale, "JSON for Last %d Network Responses:", new Object[]{3}));
        ((TextView) findViewById(R.id.requests_title)).setText(String.format(locale, "Last %d Network Requests:", new Object[]{5}));
        TextView textView3 = (TextView) findViewById(R.id.web_url);
        C8860a aVar4 = C8860a.f19558o;
        if (C8885d0.m17324h(aVar4 != null ? aVar4.f19566g : str)) {
            textView3.setVisibility(0);
            StringBuilder sb = new StringBuilder();
            sb.append("Last Web Link:\n");
            C8860a aVar5 = C8860a.f19558o;
            if (aVar5 != null) {
                str = aVar5.f19566g;
            }
            sb.append(str);
            textView3.setText(sb.toString());
            Linkify.addLinks(textView3, 15);
        } else {
            textView3.setVisibility(8);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C8860a aVar6 = C8860a.f19558o;
        Iterator<String> descendingIterator = (aVar6 != null ? aVar6.f19568i : new ArrayDeque<>()).descendingIterator();
        while (descendingIterator.hasNext()) {
            spannableStringBuilder.append(coloredAnalyticsSpan(descendingIterator.next()));
            spannableStringBuilder.append("\n");
        }
        ((TextView) findViewById(R.id.analytics)).setText(spannableStringBuilder);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.responses_layout);
        C8860a aVar7 = C8860a.f19558o;
        Iterator<AdminToolbarNetworkResponse> descendingIterator2 = (aVar7 != null ? aVar7.f19570k : new ArrayDeque<>()).descendingIterator();
        while (descendingIterator2.hasNext()) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int i = this.mMargin;
            layoutParams.setMargins(0, i, 0, i);
            linearLayout.addView(getJSONResponseButton(descendingIterator2.next()), layoutParams);
        }
        TextView textView4 = (TextView) findViewById(R.id.requests);
        C8860a aVar8 = C8860a.f19558o;
        Iterator<String> descendingIterator3 = (aVar8 != null ? aVar8.f19571l : new ArrayDeque<>()).descendingIterator();
        while (descendingIterator3.hasNext()) {
            textView4.append(descendingIterator3.next() + "\n\n");
        }
        Linkify.addLinks(textView4, 15);
        TextView textView5 = (TextView) findViewById(R.id.ab_tests);
        C8860a aVar9 = C8860a.f19558o;
        Iterator<String> it = (aVar9 != null ? aVar9.f19569j : new HashSet<>()).iterator();
        while (it.hasNext()) {
            textView5.append(it.next() + "\n\n");
        }
    }
}
