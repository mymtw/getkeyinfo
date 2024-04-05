package com.google.zxing.qrcode.decoder;

import p699vn.C18667b;

enum DataMask {
    DATA_MASK_000 {
        public boolean isMasked(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    },
    DATA_MASK_001 {
        public boolean isMasked(int i, int i2) {
            return (i & 1) == 0;
        }
    },
    DATA_MASK_010 {
        public boolean isMasked(int i, int i2) {
            return i2 % 3 == 0;
        }
    },
    DATA_MASK_011 {
        public boolean isMasked(int i, int i2) {
            return (i + i2) % 3 == 0;
        }
    },
    DATA_MASK_100 {
        public boolean isMasked(int i, int i2) {
            return (((i2 / 3) + (i / 2)) & 1) == 0;
        }
    },
    DATA_MASK_101 {
        public boolean isMasked(int i, int i2) {
            return (i * i2) % 6 == 0;
        }
    },
    DATA_MASK_110 {
        public boolean isMasked(int i, int i2) {
            return (i * i2) % 6 < 3;
        }
    },
    DATA_MASK_111 {
        public boolean isMasked(int i, int i2) {
            return ((((i * i2) % 3) + (i + i2)) & 1) == 0;
        }
    };

    public abstract boolean isMasked(int i, int i2);

    public final void unmaskBitMatrix(C18667b bVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (isMasked(i2, i3)) {
                    int i4 = (i3 / 32) + (bVar.f41280d * i2);
                    int[] iArr = bVar.f41281e;
                    iArr[i4] = iArr[i4] ^ (1 << (i3 & 31));
                }
            }
        }
    }
}
