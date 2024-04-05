package com.github.scribejava.core.model;

import com.github.scribejava.core.exceptions.OAuthException;
import com.github.scribejava.core.oauth2.OAuth2Error;
import java.net.URI;

public class OAuth2AccessTokenErrorResponse extends OAuthException {
    private static final long serialVersionUID = 2309424849700276816L;
    private final OAuth2Error error;
    private final String errorDescription;
    private final URI errorUri;
    private final String rawResponse;

    public OAuth2AccessTokenErrorResponse(OAuth2Error oAuth2Error, String str, URI uri, String str2) {
        super(str2);
        this.error = oAuth2Error;
        this.errorDescription = str;
        this.errorUri = uri;
        this.rawResponse = str2;
    }

    public OAuth2Error getError() {
        return this.error;
    }

    public String getErrorDescription() {
        return this.errorDescription;
    }

    public URI getErrorUri() {
        return this.errorUri;
    }

    public String getRawResponse() {
        return this.rawResponse;
    }
}
