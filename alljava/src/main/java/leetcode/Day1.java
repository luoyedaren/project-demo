package leetcode;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * project alljava
 *
 * @author chenghai on 2020/12/15 0015. - 星期二
 * nickName louyedaren
 */
public class Day1 {
    public static void main(String[] args) {
//        t1();
        firstMissingPositive();
    }

    //未排序的整数数组，请你找出其中没有出现的最小的正整数 [3,4,-1,1] 2
    private static void firstMissingPositive() {
        //出现的最小正整数，累加，看是否存在

    }

    //异位字母 归类
    private static void t1() {
        List<String> strs = Lists.newArrayList("are", "bat", "ear", "tab", "era");
        Map<String,List<String>> map = Maps.newHashMap();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> orDefault = map.getOrDefault(key, Lists.newArrayList());
            orDefault.add(str);
            map.put(key, orDefault);
        }
        System.out.println(map);
    }
}
