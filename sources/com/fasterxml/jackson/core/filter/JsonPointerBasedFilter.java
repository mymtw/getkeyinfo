package com.fasterxml.jackson.core.filter;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.core.JsonPointer;

public class JsonPointerBasedFilter extends TokenFilter {
    public final JsonPointer _pathToMatch;

    public JsonPointerBasedFilter(String str) {
        this(JsonPointer.compile(str));
    }

    public boolean _includeScalar() {
        return this._pathToMatch.matches();
    }

    public TokenFilter filterStartArray() {
        return this;
    }

    public TokenFilter filterStartObject() {
        return this;
    }

    public TokenFilter includeElement(int i) {
        JsonPointer matchElement = this._pathToMatch.matchElement(i);
        if (matchElement == null) {
            return null;
        }
        return matchElement.matches() ? TokenFilter.INCLUDE_ALL : new JsonPointerBasedFilter(matchElement);
    }

    public TokenFilter includeProperty(String str) {
        JsonPointer matchProperty = this._pathToMatch.matchProperty(str);
        if (matchProperty == null) {
            return null;
        }
        return matchProperty.matches() ? TokenFilter.INCLUDE_ALL : new JsonPointerBasedFilter(matchProperty);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("[JsonPointerFilter at: ");
        h.append(this._pathToMatch);
        h.append("]");
        return h.toString();
    }

    public JsonPointerBasedFilter(JsonPointer jsonPointer) {
        this._pathToMatch = jsonPointer;
    }
}
