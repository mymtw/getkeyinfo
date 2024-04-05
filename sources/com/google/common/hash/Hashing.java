package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

public final class Hashing {

    /* renamed from: a */
    public static final int f36344a = ((int) System.currentTimeMillis());

    @Immutable
    public enum ChecksumType implements C16273g<Checksum> {
        CRC_32("Hashing.crc32()") {
            public Checksum get() {
                return new CRC32();
            }
        },
        ADLER_32("Hashing.adler32()") {
            public Checksum get() {
                return new Adler32();
            }
        };
        
        public final C16271e hashFunction;

        private ChecksumType(String str) {
            this.hashFunction = new ChecksumHashFunction(this, 32, str);
        }
    }
}
