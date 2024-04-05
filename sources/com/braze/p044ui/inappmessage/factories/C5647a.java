package com.braze.p044ui.inappmessage.factories;

import android.content.res.Resources;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.braze.enums.inappmessage.SlideFrom;
import com.braze.models.inappmessage.C5483a;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.p044ui.support.C5702a;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.braze.ui.inappmessage.factories.a */
public final class C5647a {

    /* renamed from: a */
    public final long f12062a = ((long) Resources.getSystem().getInteger(17694720));

    /* renamed from: a */
    public final Animation mo16266a(C5483a aVar) {
        C19383o.m32797g(aVar, "inAppMessage");
        if (aVar instanceof InAppMessageSlideup) {
            return ((InAppMessageSlideup) aVar).f11824D == SlideFrom.TOP ? C5702a.m11486a(0.0f, -1.0f, this.f12062a) : C5702a.m11486a(0.0f, 1.0f, this.f12062a);
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        C5702a.m11487b(alphaAnimation, this.f12062a, false);
        return alphaAnimation;
    }

    /* renamed from: b */
    public final Animation mo16267b(C5483a aVar) {
        C19383o.m32797g(aVar, "inAppMessage");
        if (aVar instanceof InAppMessageSlideup) {
            return ((InAppMessageSlideup) aVar).f11824D == SlideFrom.TOP ? C5702a.m11486a(-1.0f, 0.0f, this.f12062a) : C5702a.m11486a(1.0f, 0.0f, this.f12062a);
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        C5702a.m11487b(alphaAnimation, this.f12062a, true);
        return alphaAnimation;
    }
}
