package com.lquan.jdk.collection;/**
 * Created by 01370602 on 2020/5/19.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ClassName HashMapTest
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
public class HashMapTest {

    public static void main(String[] args) {


        Map<String,String> map = new HashMap<>();
        map.put("1", "1");
        map.get("");



        Map<String,String> cmap = new ConcurrentHashMap<>();
        cmap.put("","");





    }
}
