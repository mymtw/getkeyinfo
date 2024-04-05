package com.etsy.android.p327ui.cardview.clickhandlers;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.apiv3.DeepLink;
import com.etsy.android.lib.models.apiv3.vespa.Topic;
import com.etsy.android.lib.models.homescreen.LandingPageLink;
import com.etsy.android.lib.models.interfaces.IFormattedTopic;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.LandingPageKey;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p356ge.C12790b;
import p363he.C12821d;
import p415of.C13171a;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.z */
public final class C9145z extends C13171a<IFormattedTopic> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9145z(Fragment fragment, C8703p pVar) {
        super(fragment, pVar);
        C19383o.m32797g(pVar, "viewTracker");
    }

    /* renamed from: d */
    public final void mo31328c(IFormattedTopic iFormattedTopic) {
        C19383o.m32797g(iFormattedTopic, "data");
        for (Pair pair : iFormattedTopic.extractOnTappedEventParameters()) {
            this.f28980b.mo21333d((String) pair.getFirst(), (Map) pair.getSecond());
        }
        Topic topic = iFormattedTopic.getTopic();
        LandingPageLink landingPageLink = null;
        if ((topic != null ? topic.getDeepLink() : null) != null) {
            Fragment a = mo45889a();
            Topic topic2 = iFormattedTopic.getTopic();
            C19383o.m32794d(topic2);
            DeepLink deepLink = topic2.getDeepLink();
            C19383o.m32794d(deepLink);
            String url = deepLink.getUrl();
            C19383o.m32794d(url);
            C12790b.m20430b(a, new C12821d(url));
            return;
        }
        Topic topic3 = iFormattedTopic.getTopic();
        if (topic3 != null) {
            landingPageLink = topic3.getPageLink();
        }
        if (landingPageLink != null) {
            Fragment a2 = mo45889a();
            String d = C12790b.m20432d(mo45889a());
            Topic topic4 = iFormattedTopic.getTopic();
            C19383o.m32794d(topic4);
            LandingPageLink pageLink = topic4.getPageLink();
            C19383o.m32794d(pageLink);
            C12790b.m20430b(a2, new LandingPageKey(d, pageLink, (Bundle) null, 4, (DefaultConstructorMarker) null));
        }
    }
}
