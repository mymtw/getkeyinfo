package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.cfg.PackageVersion;

public abstract class NopAnnotationIntrospector extends AnnotationIntrospector {
    public static final NopAnnotationIntrospector instance = new NopAnnotationIntrospector() {
        private static final long serialVersionUID = 1;

        public Version version() {
            return PackageVersion.VERSION;
        }
    };
    private static final long serialVersionUID = 1;

    public Version version() {
        return Version.unknownVersion();
    }
}
