package com.lquan.jdk.collection;/**
 * Created by 01370602 on 2020/5/19.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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


        Map<String,String> map = new HashMap<>(8,0.75f);
        map.put(null, "1");
        map.get("");
        List list = new ArrayList();
        list.add(1);


        Map cm = new ConcurrentHashMap<>();
        cm.put("","");

        int i = Integer.highestOneBit(15 << 1);
        System.out.println("******************"+i);


        List ls = new ArrayList<>();


    }
}
