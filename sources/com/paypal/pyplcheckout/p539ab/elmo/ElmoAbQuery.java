package com.paypal.pyplcheckout.p539ab.elmo;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19453g;

/* renamed from: com.paypal.pyplcheckout.ab.elmo.ElmoAbQuery */
public final class ElmoAbQuery {
    public static final ElmoAbQuery INSTANCE = new ElmoAbQuery();

    private ElmoAbQuery() {
    }

    public final String get(String str, String str2) {
        C19383o.m32797g(str, "country");
        C19383o.m32797g(str2, ResponseConstants.VERSION);
        return C19453g.m33013Q0("\n            query RETRIEVE_ELMO_FEATURE_FLAG (  \n                $app: String  \n                $filters: [ElmoFilterInput] = [ \n                      { \n                        key: \"Country\", \n                        value: \"" + str + "\"\n                      }, { \n                        key: \"Platform\", \n                        value: \"Android\" \n                      }, {\n                        key: \"sdk_version\",\n                        value: \"" + str2 + "\"\n                      }\n                    ] \n                $res: String!  \n                $uid: String  \n            ) {  \n                elmoExperiment ( \n                    app: $app, \n                    filters: $filters, \n                    res: $res, \n                    uid: $uid, \n                ) { \n                    treatments {  \n                        experimentId  \n                        experimentName  \n                        treatmentId  \n                        treatmentName  \n                        version  \n                            factors {  \n                                key  \n                                value \n                            } \n                        } \n                    } \n                }\n        ");
    }
}
