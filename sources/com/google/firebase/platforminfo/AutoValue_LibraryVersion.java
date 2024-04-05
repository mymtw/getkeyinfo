package com.google.firebase.platforminfo;

import android.support.p013v4.media.C0072d;
import p003a2.C0023f;

final class AutoValue_LibraryVersion extends C16683c {
    private final String libraryName;
    private final String version;

    public AutoValue_LibraryVersion(String str, String str2) {
        if (str != null) {
            this.libraryName = str;
            if (str2 != null) {
                this.version = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16683c)) {
            return false;
        }
        C16683c cVar = (C16683c) obj;
        return this.libraryName.equals(cVar.getLibraryName()) && this.version.equals(cVar.getVersion());
    }

    public String getLibraryName() {
        return this.libraryName;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return ((this.libraryName.hashCode() ^ 1000003) * 1000003) ^ this.version.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("LibraryVersion{libraryName=");
        h.append(this.libraryName);
        h.append(", version=");
        return C0023f.m110k(h, this.version, "}");
    }
}
