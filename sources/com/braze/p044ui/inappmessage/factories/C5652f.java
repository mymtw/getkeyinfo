package com.braze.p044ui.inappmessage.factories;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.appboy.p043ui.C4940R;
import com.braze.Braze;
import com.braze.enums.BrazeViewBounds;
import com.braze.images.C5442a;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.models.inappmessage.C5483a;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.p044ui.inappmessage.views.InAppMessageBaseView;
import com.braze.p044ui.inappmessage.views.InAppMessageSlideupView;
import com.braze.p044ui.support.ViewUtils;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.C19383o;
import p114g4.C6876n;

/* renamed from: com.braze.ui.inappmessage.factories.f */
public final class C5652f implements C6876n {
    /* renamed from: a */
    public final View mo1126a(Activity activity, C5483a aVar) {
        C19383o.m32797g(activity, "activity");
        C19383o.m32797g(aVar, "inAppMessage");
        View inflate = activity.getLayoutInflater().inflate(C4940R.C4943layout.com_braze_inappmessage_slideup, (ViewGroup) null);
        if (inflate != null) {
            InAppMessageSlideupView inAppMessageSlideupView = (InAppMessageSlideupView) inflate;
            String str = ViewUtils.f12100a;
            boolean z = true;
            if (!inAppMessageSlideupView.isInTouchMode()) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, DefaultInAppMessageSlideupViewFactory$createInAppMessageView$1.INSTANCE, 6);
                return null;
            }
            InAppMessageSlideup inAppMessageSlideup = (InAppMessageSlideup) aVar;
            Context applicationContext = activity.getApplicationContext();
            inAppMessageSlideupView.applyInAppMessageParameters(aVar);
            String appropriateImageUrl = InAppMessageBaseView.getAppropriateImageUrl(inAppMessageSlideup);
            if (!(appropriateImageUrl == null || appropriateImageUrl.length() == 0)) {
                z = false;
            }
            if (!z) {
                Braze.Companion companion = Braze.f11170m;
                C19383o.m32796f(applicationContext, "applicationContext");
                C5442a n = companion.mo15515f(applicationContext).mo15499n();
                C19383o.m32796f(appropriateImageUrl, "imageUrl");
                ImageView messageImageView = inAppMessageSlideupView.getMessageImageView();
                C19383o.m32796f(messageImageView, "view.messageImageView");
                ((DefaultBrazeImageLoader) n).mo15925f(applicationContext, messageImageView, BrazeViewBounds.IN_APP_MESSAGE_SLIDEUP, appropriateImageUrl);
            }
            inAppMessageSlideupView.setMessageBackgroundColor(inAppMessageSlideup.f11767r);
            inAppMessageSlideupView.setMessage(inAppMessageSlideup.f11753d);
            inAppMessageSlideupView.setMessageTextColor(inAppMessageSlideup.f11766q);
            inAppMessageSlideupView.setMessageTextAlign(inAppMessageSlideup.f11763n);
            inAppMessageSlideupView.setMessageIcon(inAppMessageSlideup.f11754e, inAppMessageSlideup.f11768s, inAppMessageSlideup.f11765p);
            inAppMessageSlideupView.setMessageChevron(inAppMessageSlideup.f11825E, inAppMessageSlideup.f11751b);
            inAppMessageSlideupView.resetMessageMargins(inAppMessageSlideup.f11844A);
            return inAppMessageSlideupView;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageSlideupView");
    }
}
