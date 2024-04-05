package com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk;

import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm;
import java.io.Serializable;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p118g8.C6894a;

public final class Curve implements Serializable {

    /* renamed from: a */
    public static final Curve f13666a = new Curve("P-256", "secp256r1", "1.2.840.10045.3.1.7");

    /* renamed from: b */
    public static final Curve f13667b = new Curve("secp256k1", "secp256k1", "1.3.132.0.10");
    @Deprecated

    /* renamed from: c */
    public static final Curve f13668c = new Curve("P-256K", "secp256k1", "1.3.132.0.10");

    /* renamed from: d */
    public static final Curve f13669d = new Curve("P-384", "secp384r1", "1.3.132.0.34");

    /* renamed from: e */
    public static final Curve f13670e = new Curve("P-521", "secp521r1", "1.3.132.0.35");

    /* renamed from: f */
    public static final Curve f13671f = new Curve("Ed25519", "Ed25519", (String) null);

    /* renamed from: g */
    public static final Curve f13672g = new Curve("Ed448", "Ed448", (String) null);

    /* renamed from: h */
    public static final Curve f13673h = new Curve("X25519", "X25519", (String) null);

    /* renamed from: i */
    public static final Curve f13674i = new Curve("X448", "X448", (String) null);

    /* renamed from: j */
    private final String f13675j;

    /* renamed from: k */
    private final String f13676k;

    /* renamed from: l */
    private final String f13677l;

    public Curve(String str) {
        this(str, (String) null, (String) null);
    }

    public Curve(String str, String str2, String str3) {
        if (str != null) {
            this.f13675j = str;
            this.f13676k = str2;
            this.f13677l = str3;
            return;
        }
        throw new IllegalArgumentException("The JOSE cryptographic curve name must not be null");
    }

    /* renamed from: a */
    public static Curve m12507a(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("The cryptographic curve string must not be null or empty");
        }
        Curve curve = f13666a;
        if (str.equals(curve.mo17722a())) {
            return curve;
        }
        Curve curve2 = f13668c;
        if (str.equals(curve2.mo17722a())) {
            return curve2;
        }
        Curve curve3 = f13667b;
        if (str.equals(curve3.mo17722a())) {
            return curve3;
        }
        Curve curve4 = f13669d;
        if (str.equals(curve4.mo17722a())) {
            return curve4;
        }
        Curve curve5 = f13670e;
        if (str.equals(curve5.mo17722a())) {
            return curve5;
        }
        Curve curve6 = f13671f;
        if (str.equals(curve6.mo17722a())) {
            return curve6;
        }
        Curve curve7 = f13672g;
        if (str.equals(curve7.mo17722a())) {
            return curve7;
        }
        Curve curve8 = f13673h;
        if (str.equals(curve8.mo17722a())) {
            return curve8;
        }
        Curve curve9 = f13674i;
        return str.equals(curve9.mo17722a()) ? curve9 : new Curve(str);
    }

    /* renamed from: a */
    public static Curve m12508a(ECParameterSpec eCParameterSpec) {
        ECParameterSpec eCParameterSpec2 = C6894a.f15271a;
        if (eCParameterSpec == null) {
            return null;
        }
        int fieldSize = eCParameterSpec.getCurve().getField().getFieldSize();
        ECParameterSpec eCParameterSpec3 = C6894a.f15271a;
        if (fieldSize == eCParameterSpec3.getCurve().getField().getFieldSize() && eCParameterSpec.getCurve().getA().equals(eCParameterSpec3.getCurve().getA()) && eCParameterSpec.getCurve().getB().equals(eCParameterSpec3.getCurve().getB()) && eCParameterSpec.getGenerator().getAffineX().equals(eCParameterSpec3.getGenerator().getAffineX()) && eCParameterSpec.getGenerator().getAffineY().equals(eCParameterSpec3.getGenerator().getAffineY()) && eCParameterSpec.getOrder().equals(eCParameterSpec3.getOrder()) && eCParameterSpec.getCofactor() == eCParameterSpec3.getCofactor()) {
            return f13666a;
        }
        int fieldSize2 = eCParameterSpec.getCurve().getField().getFieldSize();
        ECParameterSpec eCParameterSpec4 = C6894a.f15272b;
        if (fieldSize2 == eCParameterSpec4.getCurve().getField().getFieldSize() && eCParameterSpec.getCurve().getA().equals(eCParameterSpec4.getCurve().getA()) && eCParameterSpec.getCurve().getB().equals(eCParameterSpec4.getCurve().getB()) && eCParameterSpec.getGenerator().getAffineX().equals(eCParameterSpec4.getGenerator().getAffineX()) && eCParameterSpec.getGenerator().getAffineY().equals(eCParameterSpec4.getGenerator().getAffineY()) && eCParameterSpec.getOrder().equals(eCParameterSpec4.getOrder()) && eCParameterSpec.getCofactor() == eCParameterSpec4.getCofactor()) {
            return f13667b;
        }
        int fieldSize3 = eCParameterSpec.getCurve().getField().getFieldSize();
        ECParameterSpec eCParameterSpec5 = C6894a.f15273c;
        if (fieldSize3 == eCParameterSpec5.getCurve().getField().getFieldSize() && eCParameterSpec.getCurve().getA().equals(eCParameterSpec5.getCurve().getA()) && eCParameterSpec.getCurve().getB().equals(eCParameterSpec5.getCurve().getB()) && eCParameterSpec.getGenerator().getAffineX().equals(eCParameterSpec5.getGenerator().getAffineX()) && eCParameterSpec.getGenerator().getAffineY().equals(eCParameterSpec5.getGenerator().getAffineY()) && eCParameterSpec.getOrder().equals(eCParameterSpec5.getOrder()) && eCParameterSpec.getCofactor() == eCParameterSpec5.getCofactor()) {
            return f13669d;
        }
        int fieldSize4 = eCParameterSpec.getCurve().getField().getFieldSize();
        ECParameterSpec eCParameterSpec6 = C6894a.f15274d;
        if (fieldSize4 != eCParameterSpec6.getCurve().getField().getFieldSize() || !eCParameterSpec.getCurve().getA().equals(eCParameterSpec6.getCurve().getA()) || !eCParameterSpec.getCurve().getB().equals(eCParameterSpec6.getCurve().getB()) || !eCParameterSpec.getGenerator().getAffineX().equals(eCParameterSpec6.getGenerator().getAffineX()) || !eCParameterSpec.getGenerator().getAffineY().equals(eCParameterSpec6.getGenerator().getAffineY()) || !eCParameterSpec.getOrder().equals(eCParameterSpec6.getOrder()) || eCParameterSpec.getCofactor() != eCParameterSpec6.getCofactor()) {
            return null;
        }
        return f13670e;
    }

    /* renamed from: a */
    public static Set<Curve> m12509a(JWSAlgorithm jWSAlgorithm) {
        if (JWSAlgorithm.f13614h.equals(jWSAlgorithm)) {
            return Collections.singleton(f13666a);
        }
        if (JWSAlgorithm.f13615i.equals(jWSAlgorithm)) {
            return Collections.singleton(f13667b);
        }
        if (JWSAlgorithm.f13616j.equals(jWSAlgorithm)) {
            return Collections.singleton(f13669d);
        }
        if (JWSAlgorithm.f13617k.equals(jWSAlgorithm)) {
            return Collections.singleton(f13670e);
        }
        if (!JWSAlgorithm.f13621o.equals(jWSAlgorithm)) {
            return null;
        }
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(new Curve[]{f13671f, f13672g})));
    }

    /* renamed from: a */
    public String mo17722a() {
        return this.f13675j;
    }

    /* renamed from: b */
    public ECParameterSpec mo17723b() {
        ECParameterSpec eCParameterSpec = C6894a.f15271a;
        if (f13666a.equals(this)) {
            return C6894a.f15271a;
        }
        if (f13667b.equals(this)) {
            return C6894a.f15272b;
        }
        if (f13669d.equals(this)) {
            return C6894a.f15273c;
        }
        if (f13670e.equals(this)) {
            return C6894a.f15274d;
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Curve) && toString().equals(obj.toString());
    }

    public String toString() {
        return mo17722a();
    }
}
