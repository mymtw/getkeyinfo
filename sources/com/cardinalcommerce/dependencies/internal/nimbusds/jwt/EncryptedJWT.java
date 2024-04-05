package com.cardinalcommerce.dependencies.internal.nimbusds.jwt;

import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.Payload;

public class EncryptedJWT extends JWEObject implements C6258a {
    public EncryptedJWT(JWEHeader jWEHeader, JWTClaimsSet jWTClaimsSet) {
        super(jWEHeader, new Payload(jWTClaimsSet.mo17756b()));
    }
}
