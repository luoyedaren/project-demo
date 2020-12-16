package lang;

import com.google.common.hash.Hashing;
import org.assertj.core.util.Lists;
import sun.security.provider.MD5;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * project alljava
 *
 * @author chenghai on 2020/12/15 0015. - 星期二
 * nickName louyedaren
 */
public class HashTest {
    public static void main(String[] args) {
        ArrayList<Object> objects = Lists.newArrayList();
        for (int i = 0; i < 100; i++) {
            String s = time33("1123"+i);
            int r = Integer.valueOf(s)%10;
            objects.add(r);
        }
        System.out.println(objects);
    }

    //hash
    public static String time33(String skey) {
        if (skey == null) return null;
        int hash = 5381;
        for (int i = 0, len = skey.length(); i < len; ++i) {
            int cc = skey.charAt(i);
            hash += (hash << 5) + cc;
        }
        hash &= 0x7fffffff;
        return String.valueOf(hash);
    }

}
