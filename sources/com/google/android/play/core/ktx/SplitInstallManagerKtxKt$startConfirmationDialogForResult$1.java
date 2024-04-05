package com.google.android.play.core.ktx;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.C19394m;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.C19401d;
import p753kq.C19866u;

final /* synthetic */ class SplitInstallManagerKtxKt$startConfirmationDialogForResult$1 extends FunctionReference implements C19866u<IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle, C19394m> {
    public SplitInstallManagerKtxKt$startConfirmationDialogForResult$1(Fragment fragment) {
        super(7, fragment);
    }

    public final String getName() {
        return "startIntentSenderForResult";
    }

    public final C19401d getOwner() {
        return C19386q.m32807a(Fragment.class);
    }

    public final String getSignature() {
        return "startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V";
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        invoke((IntentSender) obj, ((Number) obj2).intValue(), (Intent) obj3, ((Number) obj4).intValue(), ((Number) obj5).intValue(), ((Number) obj6).intValue(), (Bundle) obj7);
        return C19394m.f43287a;
    }

    public final void invoke(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        ((Fragment) this.receiver).startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
