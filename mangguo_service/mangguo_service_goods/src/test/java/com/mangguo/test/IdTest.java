package com.mangguo.test;

import com.mangguo.util.IdWorker;

public class IdTest {

    public static void main(String[] args) {
        IdWorker idWorker = new IdWorker(10,11);

        for(int i=0;i<1000;i++){
            long id = idWorker.nextId();
            System.out.println(id);
        }

    }
}
