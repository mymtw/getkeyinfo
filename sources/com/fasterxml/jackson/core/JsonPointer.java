package com.fasterxml.jackson.core;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.p333io.NumberInput;
import p010a9.C0048b;

public class JsonPointer {
    public static final JsonPointer EMPTY = new JsonPointer();
    public static final char SEPARATOR = '/';
    public final String _asString;
    public volatile JsonPointer _head;
    public final int _matchingElementIndex;
    public final String _matchingPropertyName;
    public final JsonPointer _nextSegment;

    public JsonPointer() {
        this._nextSegment = null;
        this._matchingPropertyName = "";
        this._matchingElementIndex = -1;
        this._asString = "";
    }

    private static void _appendEscape(StringBuilder sb, char c) {
        if (c == '0') {
            c = '~';
        } else if (c == '1') {
            c = SEPARATOR;
        } else {
            sb.append('~');
        }
        sb.append(c);
    }

    private static void _appendEscaped(StringBuilder sb, String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '/') {
                sb.append("~1");
            } else if (charAt == '~') {
                sb.append("~0");
            } else {
                sb.append(charAt);
            }
        }
    }

    private static String _fullPath(JsonPointer jsonPointer, String str) {
        if (jsonPointer == null) {
            StringBuilder sb = new StringBuilder(str.length() + 1);
            sb.append(SEPARATOR);
            _appendEscaped(sb, str);
            return sb.toString();
        }
        String str2 = jsonPointer._asString;
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length() + 1);
        sb2.append(SEPARATOR);
        _appendEscaped(sb2, str);
        sb2.append(str2);
        return sb2.toString();
    }

    private static final int _parseIndex(String str) {
        int length = str.length();
        if (length == 0 || length > 10) {
            return -1;
        }
        char charAt = str.charAt(0);
        if (charAt <= '0') {
            return (length == 1 && charAt == '0') ? 0 : -1;
        }
        if (charAt > '9') {
            return -1;
        }
        for (int i = 1; i < length; i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 > '9' || charAt2 < '0') {
                return -1;
            }
        }
        if (length != 10 || NumberInput.parseLong(str) <= ParserMinimalBase.MAX_INT_L) {
            return NumberInput.parseInt(str);
        }
        return -1;
    }

    public static JsonPointer _parseQuotedTail(String str, int i) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(Math.max(16, length));
        if (i > 2) {
            sb.append(str, 1, i - 1);
        }
        int i2 = i + 1;
        _appendEscape(sb, str.charAt(i));
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt == '/') {
                return new JsonPointer(str, sb.toString(), _parseTail(str.substring(i2)));
            }
            i2++;
            if (charAt != '~' || i2 >= length) {
                sb.append(charAt);
            } else {
                _appendEscape(sb, str.charAt(i2));
                i2++;
            }
        }
        return new JsonPointer(str, sb.toString(), EMPTY);
    }

    public static JsonPointer _parseTail(String str) {
        int length = str.length();
        int i = 1;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '/') {
                return new JsonPointer(str, str.substring(1, i), _parseTail(str.substring(i)));
            }
            i++;
            if (charAt == '~' && i < length) {
                return _parseQuotedTail(str, i);
            }
        }
        return new JsonPointer(str, str.substring(1), EMPTY);
    }

    public static JsonPointer compile(String str) throws IllegalArgumentException {
        if (str == null || str.length() == 0) {
            return EMPTY;
        }
        if (str.charAt(0) == '/') {
            return _parseTail(str);
        }
        throw new IllegalArgumentException(C0048b.m163a("Invalid input: JSON Pointer expression must start with '/': \"", str, "\""));
    }

    public static JsonPointer empty() {
        return EMPTY;
    }

    public static JsonPointer forPath(JsonStreamContext jsonStreamContext, boolean z) {
        if (jsonStreamContext == null) {
            return EMPTY;
        }
        if (!jsonStreamContext.hasPathSegment() && (!z || !jsonStreamContext.inRoot() || !jsonStreamContext.hasCurrentIndex())) {
            jsonStreamContext = jsonStreamContext.getParent();
        }
        JsonPointer jsonPointer = null;
        while (jsonStreamContext != null) {
            if (jsonStreamContext.inObject()) {
                String currentName = jsonStreamContext.getCurrentName();
                if (currentName == null) {
                    currentName = "";
                }
                jsonPointer = new JsonPointer(_fullPath(jsonPointer, currentName), currentName, jsonPointer);
            } else if (jsonStreamContext.inArray() || z) {
                int currentIndex = jsonStreamContext.getCurrentIndex();
                String valueOf = String.valueOf(currentIndex);
                jsonPointer = new JsonPointer(_fullPath(jsonPointer, valueOf), valueOf, currentIndex, jsonPointer);
            }
            jsonStreamContext = jsonStreamContext.getParent();
        }
        return jsonPointer == null ? EMPTY : jsonPointer;
    }

    public static JsonPointer valueOf(String str) {
        return compile(str);
    }

    public JsonPointer _constructHead() {
        JsonPointer last = last();
        if (last == this) {
            return EMPTY;
        }
        int length = last._asString.length();
        JsonPointer jsonPointer = this._nextSegment;
        String str = this._asString;
        return new JsonPointer(str.substring(0, str.length() - length), this._matchingPropertyName, this._matchingElementIndex, jsonPointer._constructHead(length, last));
    }

    public JsonPointer append(JsonPointer jsonPointer) {
        JsonPointer jsonPointer2 = EMPTY;
        if (this == jsonPointer2) {
            return jsonPointer;
        }
        if (jsonPointer == jsonPointer2) {
            return this;
        }
        String str = this._asString;
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        StringBuilder h = C0072d.m201h(str);
        h.append(jsonPointer._asString);
        return compile(h.toString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof JsonPointer)) {
            return this._asString.equals(((JsonPointer) obj)._asString);
        }
        return false;
    }

    public int getMatchingIndex() {
        return this._matchingElementIndex;
    }

    public String getMatchingProperty() {
        return this._matchingPropertyName;
    }

    public int hashCode() {
        return this._asString.hashCode();
    }

    public JsonPointer head() {
        JsonPointer jsonPointer = this._head;
        if (jsonPointer == null) {
            if (this != EMPTY) {
                jsonPointer = _constructHead();
            }
            this._head = jsonPointer;
        }
        return jsonPointer;
    }

    public JsonPointer last() {
        if (this == EMPTY) {
            return null;
        }
        JsonPointer jsonPointer = this;
        while (true) {
            JsonPointer jsonPointer2 = jsonPointer._nextSegment;
            if (jsonPointer2 == EMPTY) {
                return jsonPointer;
            }
            jsonPointer = jsonPointer2;
        }
    }

    public JsonPointer matchElement(int i) {
        if (i != this._matchingElementIndex || i < 0) {
            return null;
        }
        return this._nextSegment;
    }

    public JsonPointer matchProperty(String str) {
        if (this._nextSegment == null || !this._matchingPropertyName.equals(str)) {
            return null;
        }
        return this._nextSegment;
    }

    public boolean matches() {
        return this._nextSegment == null;
    }

    public boolean matchesElement(int i) {
        return i == this._matchingElementIndex && i >= 0;
    }

    public boolean matchesProperty(String str) {
        return this._nextSegment != null && this._matchingPropertyName.equals(str);
    }

    public boolean mayMatchElement() {
        return this._matchingElementIndex >= 0;
    }

    public boolean mayMatchProperty() {
        return this._matchingPropertyName != null;
    }

    public JsonPointer tail() {
        return this._nextSegment;
    }

    public String toString() {
        return this._asString;
    }

    public JsonPointer(String str, String str2, JsonPointer jsonPointer) {
        this._asString = str;
        this._nextSegment = jsonPointer;
        this._matchingPropertyName = str2;
        this._matchingElementIndex = _parseIndex(str2);
    }

    public JsonPointer _constructHead(int i, JsonPointer jsonPointer) {
        if (this == jsonPointer) {
            return EMPTY;
        }
        JsonPointer jsonPointer2 = this._nextSegment;
        String str = this._asString;
        return new JsonPointer(str.substring(0, str.length() - i), this._matchingPropertyName, this._matchingElementIndex, jsonPointer2._constructHead(i, jsonPointer));
    }

    public JsonPointer(String str, String str2, int i, JsonPointer jsonPointer) {
        this._asString = str;
        this._nextSegment = jsonPointer;
        this._matchingPropertyName = str2;
        this._matchingElementIndex = i;
    }
}
