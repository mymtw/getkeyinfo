package com.appboy.models.cards;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.appboy.enums.CardKey;
import com.appboy.enums.CardType;
import kotlin.jvm.internal.C19383o;
import org.json.JSONObject;
import p024b4.C3475a;
import p030bo.app.C4274x1;
import p030bo.app.C4318z1;

public final class ControlCard extends Card {
    private final CardType cardType = CardType.CONTROL;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ControlCard(JSONObject jSONObject, CardKey.Provider provider, C4274x1 x1Var, C3475a<?> aVar, C4318z1 z1Var) {
        super(jSONObject, provider, x1Var, aVar, z1Var);
        C19383o.m32797g(jSONObject, "jsonObject");
        C19383o.m32797g(provider, "cardKeysProvider");
    }

    public CardType getCardType() {
        return this.cardType;
    }

    public String toString() {
        return C0391c.m1057c(C0072d.m201h("ControlCard{"), super.toString(), '}');
    }
}
