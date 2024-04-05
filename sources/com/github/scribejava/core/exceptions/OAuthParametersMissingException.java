package com.github.scribejava.core.exceptions;

import p493yg.C13939a;

public class OAuthParametersMissingException extends OAuthException {
    private static final long serialVersionUID = 1745308760111976671L;

    public OAuthParametersMissingException(C13939a aVar) {
        super(String.format("Could not find oauth parameters in request: %s. OAuth parameters must be specified with the addOAuthParameter() method", new Object[]{aVar}));
    }
}
