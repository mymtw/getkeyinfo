package com.etsy.android;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.currency.C8637h;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.Country;
import com.etsy.android.lib.models.EtsyLocale;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.Shop;
import com.etsy.android.lib.models.User;
import com.etsy.android.lib.models.UserAddress;
import com.etsy.android.lib.models.UserProfile;
import com.etsy.android.lib.models.apiv3.ShopIcon;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.requests.LocaleResult;
import com.etsy.android.lib.selfuser.C8852c;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.lib.util.SharedPreferencesUtility;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.measurement.C14726m1;
import com.google.android.gms.internal.measurement.C14751o0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p251u1.C8115a;
import p359ha.C12799a;
import p486y9.C13888d;
import p628nj.C18263b;
import p753kq.C19857l;

public final class BoeUserInfoFetcher$fetch$3 extends Lambda implements C19857l<Pair<? extends C8852c, ? extends LocaleResult>, C19394m> {
    public final /* synthetic */ BoeUserInfoFetcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoeUserInfoFetcher$fetch$3(BoeUserInfoFetcher boeUserInfoFetcher) {
        super(1);
        this.this$0 = boeUserInfoFetcher;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Pair<? extends C8852c, ? extends LocaleResult>) (Pair) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Pair<? extends C8852c, ? extends LocaleResult> pair) {
        boolean z;
        C8852c cVar = (C8852c) pair.component1();
        LocaleResult localeResult = (LocaleResult) pair.component2();
        BoeUserInfoFetcher boeUserInfoFetcher = this.this$0;
        C19383o.m32796f(cVar, "userResult");
        boeUserInfoFetcher.getClass();
        if (cVar instanceof C8852c.C8854b) {
            Context context = boeUserInfoFetcher.f14090b;
            C8852c.C8854b bVar = (C8852c.C8854b) cVar;
            User user = bVar.f19529a;
            SharedPreferencesUtility.WriteMode writeMode = SharedPreferencesUtility.WriteMode.OVERWRITE;
            boolean z2 = false;
            SharedPreferences.Editor edit = context.getSharedPreferences("EtsyUserPrefs", 0).edit();
            UserProfile profile = user.getProfile();
            HashMap hashMap = new HashMap();
            if (profile != null) {
                hashMap.put("etsyUserAvatar", profile.getImageUrl75x75());
                hashMap.put("etsyUserLocation", C8885d0.m17319c(profile));
                Country country = profile.getCountry();
                if (country != null) {
                    hashMap.put("etsyUserCountryId", Integer.valueOf(country.getCountryId()));
                }
            } else {
                C8694h.f19097a.mo21313g("Got a null User Profile");
            }
            hashMap.put("etsyUserName", C8885d0.m17320d(user));
            hashMap.put("etsyUserFirstName", user.getFirstName());
            hashMap.put("etsyUserLogin", user.getLoginName());
            hashMap.put("etsyUserEmail", user.getEmail());
            hashMap.put("etsyUserIdString", user.getUserId().getId());
            hashMap.put("etsyUserAwaitingFeedback", Integer.valueOf(user.getAwaitingFeedbackCount()));
            List<UserAddress> userAddresses = user.getUserAddresses();
            if (userAddresses.size() > 0) {
                Iterator<UserAddress> it = userAddresses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    UserAddress next = it.next();
                    if (next.isDefaultShipping() && "209".equalsIgnoreCase(next.getCountryId().getId())) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            hashMap.put("etsyUserHasUsDefaultShipping", Boolean.valueOf(z));
            if (writeMode == SharedPreferencesUtility.WriteMode.MERGE) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (entry.getValue() instanceof String) {
                        if (!TextUtils.isEmpty((String) entry.getValue())) {
                            edit.putString((String) entry.getKey(), (String) entry.getValue());
                        }
                    } else if (entry.getValue() instanceof Integer) {
                        edit.putInt((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                    } else if (entry.getValue() instanceof Boolean) {
                        edit.putBoolean((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                    }
                }
            } else {
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    if (entry2.getValue() instanceof String) {
                        edit.putString((String) entry2.getKey(), (String) entry2.getValue());
                    } else if (entry2.getValue() instanceof Integer) {
                        edit.putInt((String) entry2.getKey(), ((Integer) entry2.getValue()).intValue());
                    } else if (entry2.getValue() instanceof Boolean) {
                        edit.putBoolean((String) entry2.getKey(), ((Boolean) entry2.getValue()).booleanValue());
                    }
                }
            }
            if (user.getMainShop() != null) {
                edit.putString("etsyShopIdString", user.getMainShop().getShopId().getId());
                edit.putString("etsyShopName", user.getMainShop().getShopName());
                edit.putString("etsyShopIcon", user.getMainShop().getIconUrl(ShopIcon.IMG_SIZE_75.getFirst().intValue()));
                edit.putInt(ResponseConstants.CUSTOM_SHOPS_STATE, (user.getMainShop().getCustomShopsState() != null ? user.getMainShop().getCustomShopsState() : Shop.CustomShopsState.DISABLED).getStateInt());
            }
            edit.apply();
            C8115a.m16322a(context).mo20709c(new Intent("com.etsy.android.lib.action.PREFS_UPDATED"));
            boeUserInfoFetcher.f14089a.f29140f = bVar.f19529a.getUserId();
            C12799a aVar = boeUserInfoFetcher.f14096h;
            EtsyId userId = bVar.f19529a.getUserId();
            C19383o.m32796f(userId, "result.user.userId");
            aVar.getClass();
            FirebaseAnalytics firebaseAnalytics = aVar.f28272a;
            String id = userId.getId();
            C14726m1 m1Var = firebaseAnalytics.f36720a;
            m1Var.getClass();
            m1Var.mo50666b(new C14751o0(m1Var, id));
            C12799a aVar2 = boeUserInfoFetcher.f14096h;
            UserProfile profile2 = bVar.f19529a.getProfile();
            if (profile2 != null) {
                z2 = profile2.isSeller();
            }
            FirebaseAnalytics firebaseAnalytics2 = aVar2.f28272a;
            String str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            firebaseAnalytics2.mo58990a(ResponseConstants.IS_SELLER, z2 ? str : "0");
            C12799a aVar3 = boeUserInfoFetcher.f14096h;
            List<String> list = C8591a.f18700r;
            boolean z3 = C18263b.f40056T.f18706f.f18942b;
            FirebaseAnalytics firebaseAnalytics3 = aVar3.f28272a;
            if (!z3) {
                str = "0";
            }
            firebaseAnalytics3.mo58990a(ResponseConstants.IS_ADMIN, str);
            C12799a aVar4 = boeUserInfoFetcher.f14096h;
            C13888d dVar = boeUserInfoFetcher.f14097i;
            aVar4.getClass();
            C19383o.m32797g(dVar, "currentLocale");
            aVar4.f28272a.mo58990a("language_ep", dVar.mo46717a());
            C12799a aVar5 = boeUserInfoFetcher.f14096h;
            Locale c = boeUserInfoFetcher.f14097i.mo46719c();
            aVar5.getClass();
            C19383o.m32797g(c, "locale");
            aVar5.f28272a.mo58990a("detected_region", c.getCountry());
        } else if (cVar instanceof C8852c.C8853a) {
            boeUserInfoFetcher.f14092d.mo45474a("session.BoeUserInfoFetcher.failure.empty_batch");
        }
        BoeUserInfoFetcher boeUserInfoFetcher2 = this.this$0;
        C19383o.m32796f(localeResult, "localeResult");
        boeUserInfoFetcher2.getClass();
        if (localeResult instanceof LocaleResult.Success) {
            EtsyLocale locale = ((LocaleResult.Success) localeResult).getLocale();
            C8637h hVar = boeUserInfoFetcher2.f14091c;
            String code = locale.getCurrency().getCode();
            C19383o.m32796f(code, "locale.currency.code");
            hVar.mo21254c(code);
            C12799a aVar6 = boeUserInfoFetcher2.f14096h;
            String code2 = locale.getCurrency().getCode();
            C19383o.m32796f(code2, "locale.currency.code");
            aVar6.f28272a.mo58990a("currency", code2);
            return;
        }
        boolean z4 = localeResult instanceof LocaleResult.Error;
    }
}
