import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhengQinfeng
 * @Date 2020/11/29 22:12
 * @dec
 */
public class Test01 {
    @Test
    public void testMap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        // putIfAbsent: 如果不存在，就添加
        map.putIfAbsent("A", 1);
        map.putIfAbsent("A", 2);
        System.out.println(map);

        // computeIfAbsent: 后面的k就是"B"这个字符串
        map.computeIfAbsent("B", k -> k + "123");
        System.out.println(map);

        map.computeIfAbsent("C", key -> new String(key) + " 哈哈");
        String c = (String) map.computeIfAbsent("C", key -> new String(key) + " 哈哈123");
        System.out.println(map);
        System.out.println(c);
    }
}
