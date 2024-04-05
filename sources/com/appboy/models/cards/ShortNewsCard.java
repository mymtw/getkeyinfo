package com.appboy.models.cards;

import android.support.p013v4.media.C0072d;
import com.appboy.enums.CardKey;
import com.appboy.enums.CardType;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19453g;
import org.json.JSONObject;
import p024b4.C3475a;
import p030bo.app.C4274x1;
import p030bo.app.C4318z1;

public final class ShortNewsCard extends Card {
    private final CardType cardType;
    private final String description;
    private final String domain;
    private final String imageUrl;
    private final String title;
    private final String url;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShortNewsCard(JSONObject jSONObject, CardKey.Provider provider) {
        this(jSONObject, provider, (C4274x1) null, (C3475a) null, (C4318z1) null, 28, (DefaultConstructorMarker) null);
        C19383o.m32797g(jSONObject, "jsonObject");
        C19383o.m32797g(provider, "cardKeyProvider");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShortNewsCard(JSONObject jSONObject, CardKey.Provider provider, C4274x1 x1Var) {
        this(jSONObject, provider, x1Var, (C3475a) null, (C4318z1) null, 24, (DefaultConstructorMarker) null);
        C19383o.m32797g(jSONObject, "jsonObject");
        C19383o.m32797g(provider, "cardKeyProvider");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShortNewsCard(JSONObject jSONObject, CardKey.Provider provider, C4274x1 x1Var, C3475a<?> aVar) {
        this(jSONObject, provider, x1Var, aVar, (C4318z1) null, 16, (DefaultConstructorMarker) null);
        C19383o.m32797g(jSONObject, "jsonObject");
        C19383o.m32797g(provider, "cardKeyProvider");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShortNewsCard(JSONObject jSONObject, CardKey.Provider provider, C4274x1 x1Var, C3475a aVar, C4318z1 z1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, provider, (i & 4) != 0 ? null : x1Var, (i & 8) != 0 ? null : aVar, (i & 16) != 0 ? null : z1Var);
    }

    public CardType getCardType() {
        return this.cardType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("\n            ShortNewsCard{description='");
        h.append(this.description);
        h.append("'\n            imageUrl='");
        h.append(this.imageUrl);
        h.append("'\n            title='");
        h.append(this.title);
        h.append("'\n            url='");
        h.append(getUrl());
        h.append("'\n            domain='");
        h.append(this.domain);
        h.append("\n            ");
        h.append(super.toString());
        h.append("}\n\n        ");
        return C19453g.m33013Q0(h.toString());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShortNewsCard(JSONObject jSONObject, CardKey.Provider provider, C4274x1 x1Var, C3475a<?> aVar, C4318z1 z1Var) {
        super(jSONObject, provider, x1Var, aVar, z1Var);
        C19383o.m32797g(jSONObject, "jsonObject");
        C19383o.m32797g(provider, "cardKeyProvider");
        String string = jSONObject.getString(provider.getKey(CardKey.SHORT_NEWS_DESCRIPTION));
        C19383o.m32796f(string, "jsonObject.getString(car….SHORT_NEWS_DESCRIPTION))");
        this.description = string;
        String string2 = jSONObject.getString(provider.getKey(CardKey.SHORT_NEWS_IMAGE));
        C19383o.m32796f(string2, "jsonObject.getString(car…ardKey.SHORT_NEWS_IMAGE))");
        this.imageUrl = string2;
        this.title = JsonUtils.m11314e(provider.getKey(CardKey.SHORT_NEWS_TITLE), jSONObject);
        this.url = JsonUtils.m11314e(provider.getKey(CardKey.SHORT_NEWS_URL), jSONObject);
        this.domain = JsonUtils.m11314e(provider.getKey(CardKey.SHORT_NEWS_DOMAIN), jSONObject);
        this.cardType = CardType.SHORT_NEWS;
    }
}
