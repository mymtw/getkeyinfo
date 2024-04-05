package com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6236a;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import com.google.android.play.core.appupdate.C15562d;
import java.net.URI;
import java.security.KeyStore;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.C19382n;

/* renamed from: com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.g */
public class C6249g extends JWK {

    /* renamed from: a */
    public static final Set<Curve> f13704a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Curve[]{Curve.f13671f, Curve.f13672g, Curve.f13673h, Curve.f13674i})));

    /* renamed from: b */
    private final Curve f13705b;

    /* renamed from: c */
    private final Base64URL f13706c;

    /* renamed from: d */
    private final byte[] f13707d;

    /* renamed from: e */
    private final Base64URL f13708e;

    /* renamed from: f */
    private final byte[] f13709f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6249g(Curve curve, Base64URL base64URL, C6248e eVar, Set<C6246c> set, C6236a aVar, String str, URI uri, Base64URL base64URL2, Base64URL base64URL3, List<Base64> list, KeyStore keyStore) {
        super(C6247d.f13698d, eVar, set, aVar, str, uri, base64URL2, base64URL3, list, keyStore);
        Curve curve2 = curve;
        Base64URL base64URL4 = base64URL;
        if (curve2 == null) {
            throw new IllegalArgumentException("The curve must not be null");
        } else if (f13704a.contains(curve)) {
            this.f13705b = curve2;
            if (base64URL4 != null) {
                this.f13706c = base64URL4;
                this.f13707d = base64URL.mo17747a();
                this.f13708e = null;
                this.f13709f = null;
                return;
            }
            throw new IllegalArgumentException("The 'x' parameter must not be null");
        } else {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + curve);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6249g(Curve curve, Base64URL base64URL, Base64URL base64URL2, C6248e eVar, Set<C6246c> set, C6236a aVar, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, KeyStore keyStore) {
        super(C6247d.f13698d, eVar, set, aVar, str, uri, base64URL3, base64URL4, list, keyStore);
        Curve curve2 = curve;
        Base64URL base64URL5 = base64URL;
        Base64URL base64URL6 = base64URL2;
        if (curve2 == null) {
            throw new IllegalArgumentException("The curve must not be null");
        } else if (f13704a.contains(curve2)) {
            this.f13705b = curve2;
            if (base64URL5 != null) {
                this.f13706c = base64URL5;
                this.f13707d = base64URL.mo17747a();
                if (base64URL6 != null) {
                    this.f13708e = base64URL6;
                    this.f13709f = base64URL2.mo17747a();
                    return;
                }
                throw new IllegalArgumentException("The 'd' parameter must not be null");
            }
            throw new IllegalArgumentException("The 'x' parameter must not be null");
        } else {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + curve2);
        }
    }

    /* renamed from: a */
    public static C6249g m12532a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (C6247d.f13698d.equals(C15562d.m25189a(jSONObject))) {
            try {
                Curve a = Curve.m12507a((String) C19382n.m32756l(jSONObject2, "crv", String.class));
                Base64URL r0 = C19382n.m32768r0(jSONObject2, EtsyDialogFragment.OPT_X_BUTTON);
                Base64URL r02 = C19382n.m32768r0(jSONObject2, "d");
                if (r02 == null) {
                    try {
                        C6248e l = C15562d.m25198l(jSONObject);
                        Set q = C15562d.m25201q(jSONObject);
                        C6236a A = C15562d.m25163A(jSONObject);
                        String D = C15562d.m25166D(jSONObject);
                        URI Y = C19382n.m32737Y(jSONObject2, "x5u");
                        Base64URL r03 = C19382n.m32768r0(jSONObject2, "x5t");
                        return new C6249g(a, r0, l, q, A, D, Y, r03, C19382n.m32768r0(jSONObject2, "x5t#S256"), C15562d.m25176N(jSONObject), (KeyStore) null);
                    } catch (IllegalArgumentException e) {
                        throw new ParseException(e.getMessage(), 0);
                    }
                } else {
                    C6248e l2 = C15562d.m25198l(jSONObject);
                    Set q2 = C15562d.m25201q(jSONObject);
                    C6236a A2 = C15562d.m25163A(jSONObject);
                    String D2 = C15562d.m25166D(jSONObject);
                    URI Y2 = C19382n.m32737Y(jSONObject2, "x5u");
                    Base64URL r04 = C19382n.m32768r0(jSONObject2, "x5t");
                    return new C6249g(a, r0, r02, l2, q2, A2, D2, Y2, r04, C19382n.m32768r0(jSONObject2, "x5t#S256"), C15562d.m25176N(jSONObject), (KeyStore) null);
                }
            } catch (IllegalArgumentException e2) {
                throw new ParseException(e2.getMessage(), 0);
            }
        } else {
            throw new ParseException("The key type \"kty\" must be OKP", 0);
        }
    }

    /* renamed from: c */
    public boolean mo17729c() {
        return this.f13708e != null;
    }

    /* renamed from: d */
    public JSONObject mo17730d() {
        JSONObject d = super.mo17730d();
        d.put("crv", this.f13705b.toString());
        d.put(EtsyDialogFragment.OPT_X_BUTTON, this.f13706c.toString());
        Base64URL base64URL = this.f13708e;
        if (base64URL != null) {
            d.put("d", base64URL.toString());
        }
        return d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6249g) || !super.equals(obj)) {
            return false;
        }
        C6249g gVar = (C6249g) obj;
        return Objects.equals(this.f13705b, gVar.f13705b) && Objects.equals(this.f13706c, gVar.f13706c) && Arrays.equals(this.f13707d, gVar.f13707d) && Objects.equals(this.f13708e, gVar.f13708e) && Arrays.equals(this.f13709f, gVar.f13709f);
    }

    public int hashCode() {
        Object[] objArr = {Integer.valueOf(super.hashCode()), this.f13705b, this.f13706c, this.f13708e};
        int hashCode = Arrays.hashCode(this.f13707d);
        return Arrays.hashCode(this.f13709f) + ((hashCode + (Objects.hash(objArr) * 31)) * 31);
    }
}
