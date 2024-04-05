package com.google.common.p529io;

import com.google.common.base.C15795m;
import java.io.File;

/* renamed from: com.google.common.io.Files$FilePredicate */
enum Files$FilePredicate implements C15795m<File> {
    IS_DIRECTORY {
        public String toString() {
            return "Files.isDirectory()";
        }

        public boolean apply(File file) {
            return file.isDirectory();
        }
    },
    IS_FILE {
        public String toString() {
            return "Files.isFile()";
        }

        public boolean apply(File file) {
            return file.isFile();
        }
    }
}
