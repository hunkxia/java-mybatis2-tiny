package tiny.mybatis2.models;

import java.io.Serializable;

public class User implements Serializable {
    private int uid;
    private String mobile;
    private String unick;

    @Override
    public String toString(){
        return getClass().getSimpleName() +
            "[" +
            "uid = " + uid +
            ", mobile = " + mobile +
            ", unick = " + unick +
            "]";
    }
}
