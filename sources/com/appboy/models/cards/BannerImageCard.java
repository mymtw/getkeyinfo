package com.appboy.models.cards;

import android.support.p013v4.media.C0072d;
import com.appboy.enums.CardKey;
import com.appboy.enums.CardType;
import com.braze.support.JsonUtils;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19453g;
import org.json.JSONObject;
import p024b4.C3475a;
import p030bo.app.C4274x1;
import p030bo.app.C4318z1;

public final class BannerImageCard extends Card {
    private final float aspectRatio;
    private final CardType cardType;
    private final String domain;
    private final String imageUrl;
    private final String url;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BannerImageCard(JSONObject jSONObject, CardKey.Provider provider) {
        this(jSONObject, provider, (C4274x1) null, (C3475a) null, (C4318z1) null, 28, (DefaultConstructorMarker) null);
        C19383o.m32797g(jSONObject, "jsonObject");
        C19383o.m32797g(provider, "cardKeyProvider");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BannerImageCard(JSONObject jSONObject, CardKey.Provider provider, C4274x1 x1Var) {
        this(jSONObject, provider, x1Var, (C3475a) null, (C4318z1) null, 24, (DefaultConstructorMarker) null);
        C19383o.m32797g(jSONObject, "jsonObject");
        C19383o.m32797g(provider, "cardKeyProvider");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BannerImageCard(JSONObject jSONObject, CardKey.Provider provider, C4274x1 x1Var, C3475a<?> aVar) {
        this(jSONObject, provider, x1Var, aVar, (C4318z1) null, 16, (DefaultConstructorMarker) null);
        C19383o.m32797g(jSONObject, "jsonObject");
        C19383o.m32797g(provider, "cardKeyProvider");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BannerImageCard(JSONObject jSONObject, CardKey.Provider provider, C4274x1 x1Var, C3475a aVar, C4318z1 z1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, provider, (i & 4) != 0 ? null : x1Var, (i & 8) != 0 ? null : aVar, (i & 16) != 0 ? null : z1Var);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public CardType getCardType() {
        return this.cardType;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("\n            BannerImageCard{imageUrl='");
        h.append(this.imageUrl);
        h.append("'\n            url='");
        h.append(getUrl());
        h.append("'\n            domain='");
        h.append(this.domain);
        h.append("'\n            aspectRatio=");
        h.append(this.aspectRatio);
        h.append("\n            ");
        h.append(super.toString());
        h.append("}\n            \n        ");
        return C19453g.m33013Q0(h.toString());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerImageCard(JSONObject jSONObject, CardKey.Provider provider, C4274x1 x1Var, C3475a<?> aVar, C4318z1 z1Var) {
        super(jSONObject, provider, x1Var, aVar, z1Var);
        C19383o.m32797g(jSONObject, "jsonObject");
        C19383o.m32797g(provider, "cardKeyProvider");
        String string = jSONObject.getString(provider.getKey(CardKey.BANNER_IMAGE_IMAGE));
        C19383o.m32796f(string, "jsonObject.getString(car…dKey.BANNER_IMAGE_IMAGE))");
        this.imageUrl = string;
        this.url = JsonUtils.m11314e(provider.getKey(CardKey.BANNER_IMAGE_URL), jSONObject);
        this.domain = JsonUtils.m11314e(provider.getKey(CardKey.BANNER_IMAGE_DOMAIN), jSONObject);
        this.aspectRatio = (float) jSONObject.optDouble(provider.getKey(CardKey.BANNER_IMAGE_ASPECT_RATIO), ShadowDrawableWrapper.COS_45);
        this.cardType = CardType.BANNER;
    }
}
