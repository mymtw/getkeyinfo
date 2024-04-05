package com.etsy.android.uikit.webview;

import android.app.Activity;
import android.net.Uri;
import android.webkit.ValueCallback;
import com.etsy.android.R;
import com.etsy.android.lib.util.C8891f;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class EtsyChromeClient$onShowFileChooser$2 extends Lambda implements C19857l<C8891f, C19394m> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ ValueCallback<Uri[]> $filePathCallback;
    public final /* synthetic */ EtsyChromeClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EtsyChromeClient$onShowFileChooser$2(EtsyChromeClient etsyChromeClient, Activity activity, ValueCallback<Uri[]> valueCallback) {
        super(1);
        this.this$0 = etsyChromeClient;
        this.$activity = activity;
        this.$filePathCallback = valueCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8891f) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8891f fVar) {
        if (fVar instanceof C8891f.C8894c) {
            this.this$0.showErrorAlert(this.$activity, R.string.error_no_image_chooser_app_found);
        } else if (fVar instanceof C8891f.C8893b) {
            ValueCallback<Uri[]> valueCallback = this.$filePathCallback;
            Uri fromFile = Uri.fromFile(((C8891f.C8893b) fVar).f19653c);
            C19383o.m32796f(fromFile, "fromFile(result.file)");
            valueCallback.onReceiveValue(new Uri[]{fromFile});
        } else if (fVar instanceof C8891f.C8892a) {
            this.this$0.showErrorAlert(this.$activity, R.string.image_save_fail);
        } else if (fVar instanceof C8891f.C8895d) {
            this.this$0.startImagePicker();
        } else if (!(fVar instanceof C8891f.C8896e)) {
            boolean z = fVar instanceof C8891f.C8897f;
        }
    }
}
