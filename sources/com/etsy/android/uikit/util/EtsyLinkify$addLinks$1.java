package com.etsy.android.uikit.util;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import com.etsy.android.R;
import com.etsy.android.lib.util.C8915n;
import com.etsy.android.uikit.util.EtsyLinkify;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

public final class EtsyLinkify$addLinks$1 extends EtsyLinkify.UnderlineURLSpan {
    public final /* synthetic */ AlertDialog.C0133a $alertDialogBuilder;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C19846a<C19394m> $doOnClick;
    public final /* synthetic */ String $urlString;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EtsyLinkify$addLinks$1(String str, boolean z, C19846a<C19394m> aVar, Context context, AlertDialog.C0133a aVar2) {
        super(str, z);
        this.$urlString = str;
        this.$doOnClick = aVar;
        this.$context = context;
        this.$alertDialogBuilder = aVar2;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        C19846a<C19394m> aVar = this.$doOnClick;
        if (aVar != null) {
            aVar.invoke();
        }
        try {
            URL url = new URL(this.$urlString);
            if (C8915n.m17353e(url.getHost())) {
                Context context = this.$context;
                String a = C8915n.m17349a(url);
                C19383o.m32796f(a, "checkForShopRedirectUrl(urlLink)");
                EtsyLinkify.m19618l(context, a);
                return;
            }
            Context context2 = this.$context;
            String str = this.$urlString;
            C19383o.m32796f(str, "urlString");
            AlertDialog.C0133a aVar2 = this.$alertDialogBuilder;
            aVar2.setPositiveButton(R.string.convo_external_link_warning_open_button, new C11902f(context2, str));
            AlertDialog create = aVar2.create();
            C19383o.m32796f(create, "alertDialogBuilder.create()");
            create.show();
        } catch (MalformedURLException unused) {
            super.onClick(view);
        }
    }
}
