package com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6236a;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import com.google.android.play.core.appupdate.C15562d;
import java.math.BigInteger;
import java.net.URI;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.C19382n;
import p001a0.C0005b;

public final class ECKey extends JWK {

    /* renamed from: a */
    public static final Set<Curve> f13678a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Curve[]{Curve.f13666a, Curve.f13667b, Curve.f13669d, Curve.f13670e})));

    /* renamed from: b */
    private final Curve f13679b;

    /* renamed from: c */
    private final Base64URL f13680c;

    /* renamed from: d */
    private final Base64URL f13681d;

    /* renamed from: e */
    private final Base64URL f13682e;

    /* renamed from: f */
    private final PrivateKey f13683f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, C6248e eVar, Set<C6246c> set, C6236a aVar, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, KeyStore keyStore) {
        super(C6247d.f13695a, eVar, set, aVar, str, uri, base64URL3, base64URL4, list, keyStore);
        Curve curve2 = curve;
        Base64URL base64URL5 = base64URL;
        Base64URL base64URL6 = base64URL2;
        if (curve2 != null) {
            this.f13679b = curve2;
            if (base64URL5 != null) {
                this.f13680c = base64URL5;
                if (base64URL6 != null) {
                    this.f13681d = base64URL6;
                    m12515f(curve, base64URL, base64URL2);
                    mo17732g(mo17734e());
                    this.f13682e = null;
                    this.f13683f = null;
                    return;
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, C6248e eVar, Set<C6246c> set, C6236a aVar, String str, URI uri, Base64URL base64URL4, Base64URL base64URL5, List<Base64> list, KeyStore keyStore) {
        super(C6247d.f13695a, eVar, set, aVar, str, uri, base64URL4, base64URL5, list, keyStore);
        Curve curve2 = curve;
        Base64URL base64URL6 = base64URL;
        Base64URL base64URL7 = base64URL2;
        Base64URL base64URL8 = base64URL3;
        if (curve2 != null) {
            this.f13679b = curve2;
            if (base64URL6 != null) {
                this.f13680c = base64URL6;
                if (base64URL7 != null) {
                    this.f13681d = base64URL7;
                    m12515f(curve, base64URL, base64URL2);
                    mo17732g(mo17734e());
                    if (base64URL8 != null) {
                        this.f13682e = base64URL8;
                        this.f13683f = null;
                        return;
                    }
                    throw new IllegalArgumentException("The 'd' coordinate must not be null");
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, PrivateKey privateKey, C6248e eVar, Set<C6246c> set, C6236a aVar, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, KeyStore keyStore) {
        super(C6247d.f13695a, eVar, set, aVar, str, uri, base64URL3, base64URL4, list, keyStore);
        Curve curve2 = curve;
        Base64URL base64URL5 = base64URL;
        Base64URL base64URL6 = base64URL2;
        if (curve2 != null) {
            this.f13679b = curve2;
            if (base64URL5 != null) {
                this.f13680c = base64URL5;
                if (base64URL6 != null) {
                    this.f13681d = base64URL6;
                    m12515f(curve, base64URL, base64URL2);
                    mo17732g(mo17734e());
                    this.f13682e = null;
                    this.f13683f = privateKey;
                    return;
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    /* renamed from: a */
    public static ECKey m12512a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (C6247d.f13695a.equals(C15562d.m25189a(jSONObject))) {
            try {
                Curve a = Curve.m12507a((String) C19382n.m32756l(jSONObject2, "crv", String.class));
                Base64URL r0 = C19382n.m32768r0(jSONObject2, EtsyDialogFragment.OPT_X_BUTTON);
                Base64URL r02 = C19382n.m32768r0(jSONObject2, "y");
                Base64URL r03 = C19382n.m32768r0(jSONObject2, "d");
                if (r03 == null) {
                    try {
                        C6248e l = C15562d.m25198l(jSONObject);
                        Set q = C15562d.m25201q(jSONObject);
                        C6236a A = C15562d.m25163A(jSONObject);
                        String D = C15562d.m25166D(jSONObject);
                        URI Y = C19382n.m32737Y(jSONObject2, "x5u");
                        Base64URL r04 = C19382n.m32768r0(jSONObject2, "x5t");
                        return new ECKey(a, r0, r02, l, q, A, D, Y, r04, C19382n.m32768r0(jSONObject2, "x5t#S256"), C15562d.m25176N(jSONObject), (KeyStore) null);
                    } catch (IllegalArgumentException e) {
                        throw new ParseException(e.getMessage(), 0);
                    }
                } else {
                    C6248e l2 = C15562d.m25198l(jSONObject);
                    Set q2 = C15562d.m25201q(jSONObject);
                    C6236a A2 = C15562d.m25163A(jSONObject);
                    String D2 = C15562d.m25166D(jSONObject);
                    URI Y2 = C19382n.m32737Y(jSONObject2, "x5u");
                    Base64URL r05 = C19382n.m32768r0(jSONObject2, "x5t");
                    return new ECKey(a, r0, r02, r03, l2, (Set<C6246c>) q2, A2, D2, Y2, r05, C19382n.m32768r0(jSONObject2, "x5t#S256"), (List<Base64>) C15562d.m25176N(jSONObject), (KeyStore) null);
                }
            } catch (IllegalArgumentException e2) {
                throw new ParseException(e2.getMessage(), 0);
            }
        } else {
            throw new ParseException("The key type \"kty\" must be EC", 0);
        }
    }

    /* renamed from: a */
    public static ECKey m12513a(String str) {
        return m12512a(C19382n.m32751i(str));
    }

    /* renamed from: f */
    public static void m12515f(Curve curve, Base64URL base64URL, Base64URL base64URL2) {
        if (!f13678a.contains(curve)) {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + curve);
        } else if (!C0005b.m55q(base64URL.mo17748b(), base64URL2.mo17748b(), curve.mo17723b())) {
            throw new IllegalArgumentException("Invalid EC JWK: The 'x' and 'y' public coordinates are not on the " + curve + " curve");
        }
    }

    /* renamed from: a */
    public Base64URL mo17726a() {
        return this.f13680c;
    }

    /* renamed from: a */
    public boolean mo17727a(X509Certificate x509Certificate) {
        try {
            ECPublicKey eCPublicKey = (ECPublicKey) mo17734e().get(0).getPublicKey();
            return mo17726a().mo17748b().equals(eCPublicKey.getW().getAffineX()) && mo17728b().mo17748b().equals(eCPublicKey.getW().getAffineY());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public Base64URL mo17728b() {
        return this.f13681d;
    }

    /* renamed from: c */
    public boolean mo17729c() {
        return (this.f13682e == null && this.f13683f == null) ? false : true;
    }

    /* renamed from: d */
    public JSONObject mo17730d() {
        JSONObject d = super.mo17730d();
        d.put("crv", this.f13679b.toString());
        d.put(EtsyDialogFragment.OPT_X_BUTTON, this.f13680c.toString());
        d.put("y", this.f13681d.toString());
        Base64URL base64URL = this.f13682e;
        if (base64URL != null) {
            d.put("d", base64URL.toString());
        }
        return d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECKey) || !super.equals(obj)) {
            return false;
        }
        ECKey eCKey = (ECKey) obj;
        return Objects.equals(this.f13679b, eCKey.f13679b) && Objects.equals(this.f13680c, eCKey.f13680c) && Objects.equals(this.f13681d, eCKey.f13681d) && Objects.equals(this.f13682e, eCKey.f13682e) && Objects.equals(this.f13683f, eCKey.f13683f);
    }

    /* renamed from: g */
    public final void mo17732g(List<X509Certificate> list) {
        if (list != null && !mo17727a(list.get(0))) {
            throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f13679b, this.f13680c, this.f13681d, this.f13682e, this.f13683f});
    }

    /* renamed from: a */
    public static Base64URL m12514a(int i, BigInteger bigInteger) {
        int bitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i2 = 1;
        if (bigInteger.bitLength() % 8 == 0 || (bigInteger.bitLength() / 8) + 1 != bitLength / 8) {
            int length = byteArray.length;
            if (bigInteger.bitLength() % 8 == 0) {
                length--;
            } else {
                i2 = 0;
            }
            int i3 = bitLength / 8;
            int i4 = i3 - length;
            byte[] bArr = new byte[i3];
            System.arraycopy(byteArray, i2, bArr, i4, length);
            byteArray = bArr;
        }
        int i5 = (i + 7) / 8;
        if (byteArray.length >= i5) {
            return Base64URL.m12549a(byteArray);
        }
        byte[] bArr2 = new byte[i5];
        System.arraycopy(byteArray, 0, bArr2, i5 - byteArray.length, byteArray.length);
        return Base64URL.m12549a(bArr2);
    }
}
