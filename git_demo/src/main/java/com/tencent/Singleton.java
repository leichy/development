package com.tencent;

/**
 * @author leichy
 **/
public class Singleton {

    private Singleton(){

    }
	
	//private static Singleton singleton = new Singleton();
	//private static Singleton singleton = new Singleton();

    private static volatile Singleton singleton = null;

    public static Singleton getSingleton(){

        if (singleton == null){
            singleton = new Singleton();
        }

        return singleton;
    }
}
