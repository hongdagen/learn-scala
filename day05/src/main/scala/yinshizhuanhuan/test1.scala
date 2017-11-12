package yinshizhuanhuan

import java.io.File


// 1. 隐式转换发生的时机:当一个对象去调用某个方法时，这个对象并不具备这个方法
//    这个时候就发生了隐式转换
//    他就会找一个隐士方法(能把这个对象转换为具备想调用这个方法的对象）
//    Int想去调用to方法，但是Int不具备to方法。触发隐士转换
//    Int想去找一个隐士转换的方法(这个方法就是把Int转化为RichInt)
//例:  Int->RichInt

