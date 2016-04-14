package com.vogella.maven.quickstart;

import com.google.gson.Gson;

/**
 * Hello world!
 * 
 * @author Paolo Ripamonti <paolo.ripamonti93@gmail.com>
 * Created at: 02 apr 2016
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Gson gson = new Gson();
        System.out.println(gson.toJson("Hello World!"));
    }
}
