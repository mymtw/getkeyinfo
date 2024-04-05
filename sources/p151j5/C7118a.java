package p151j5;

import com.cardinalcommerce.cardinalmobilesdk.enums.CardinalEnvironment;
import com.cardinalcommerce.cardinalmobilesdk.enums.CardinalRenderType;
import com.cardinalcommerce.cardinalmobilesdk.enums.CardinalUiType;
import com.cardinalcommerce.shared.userinterfaces.UiCustomization;
import org.json.JSONArray;
import p139i5.C6993a;

/* renamed from: j5.a */
public final class C7118a {

    /* renamed from: a */
    public int f15821a = 8000;

    /* renamed from: b */
    public CardinalUiType f15822b = CardinalUiType.BOTH;

    /* renamed from: c */
    public JSONArray f15823c;

    /* renamed from: d */
    public CardinalEnvironment f15824d = CardinalEnvironment.PRODUCTION;

    /* renamed from: e */
    public String f15825e = "";

    /* renamed from: f */
    public UiCustomization f15826f = new UiCustomization();

    /* renamed from: g */
    public boolean f15827g = true;

    /* renamed from: h */
    public final C6993a f15828h = C6993a.m13555g();

    /* renamed from: i */
    public boolean f15829i = true;

    public C7118a() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(CardinalRenderType.OTP);
        jSONArray.put(CardinalRenderType.SINGLE_SELECT);
        jSONArray.put(CardinalRenderType.MULTI_SELECT);
        jSONArray.put(CardinalRenderType.OOB);
        jSONArray.put(CardinalRenderType.HTML);
        this.f15823c = jSONArray;
    }
}
