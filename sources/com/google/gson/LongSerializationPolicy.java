package com.google.gson;

public enum LongSerializationPolicy {
    DEFAULT {
        public C16800n serialize(Long l) {
            return new C16803q((Number) l);
        }
    },
    STRING {
        public C16800n serialize(Long l) {
            return new C16803q(String.valueOf(l));
        }
    };

    public abstract C16800n serialize(Long l);
}
