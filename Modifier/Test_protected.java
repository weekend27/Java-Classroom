/*
被声明为protected的变量、方法和构造器能被同一个包中的任何其他类访问，也能够被不同包中的子类访问。
Protected访问修饰符不能修饰类和接口，方法和成员变量能够声明为protected，但是接口的成员变量和成员方法不能声明为protected。
子类能访问Protected修饰符声明的方法和变量，这样就能保护不相关的类使用这些方法和变量。
*/
class Speaker{
  // nothing
}

class AudioPlayer{
  protected boolean openSpeaker(Speaker sp){
    // 实现细节
    return true;
  }
}

class StreamingAudioPlayer{
  boolean openSpeaker(Speaker sp){
    // 实现细节
    return false;
  }
}
