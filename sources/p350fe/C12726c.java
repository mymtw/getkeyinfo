package p350fe;

import android.os.Bundle;
import androidx.appcompat.widget.C0326j;
import com.braze.support.JsonUtils;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8906j;
import com.etsy.android.lib.util.CrashUtil;
import com.etsy.android.p327ui.navigation.deeplinks.DeepLinkHandlerException;
import com.etsy.android.p327ui.navigation.deeplinks.DeepLinkHandlerExceptionLegacy;
import com.google.android.play.core.appupdate.C15562d;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: fe.c */
public final class C12726c {
    /* renamed from: a */
    public static void m20394a(DeepLinkHandlerException deepLinkHandlerException, C12725b bVar) {
        JSONObject jSONObject = bVar.f28044a;
        if (jSONObject != null) {
            CrashUtil.m17307a().mo30460e(new C8906j.C8907a(ResponseConstants.PARAMS, JsonUtils.m11311b(jSONObject)));
        }
        Bundle bundle = bVar.f28045b;
        if (bundle != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C15562d.m25165C(bundle, "", linkedHashMap);
            CrashUtil.m17307a().mo30460e(new C8906j.C8907a("intent_extras", linkedHashMap));
        }
        Bundle bundle2 = bVar.f28046c;
        if (bundle2 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            C15562d.m25165C(bundle2, "", linkedHashMap2);
            CrashUtil.m17307a().mo30460e(new C8906j.C8907a("referral_args", linkedHashMap2));
        }
        if (C0326j.m869n(BuildTarget.Companion)) {
            CrashUtil.m17307a().mo30457b(deepLinkHandlerException);
        } else {
            CrashUtil.m17307a().mo30458c(deepLinkHandlerException, deepLinkHandlerException instanceof DeepLinkHandlerExceptionLegacy ? C8592b.C8599g.f18881a : C8592b.C8599g.f18882b);
        }
    }
}
