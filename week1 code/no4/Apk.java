package pro4;

import pro4.Apk;

public class Apk{
 public Apk(){
   
 }
 

  public static void main(String[] args) {
  
  Apk myApk = new Apk();
  myApk.hyperMethod();
//private int return;//= ultraMethod ();

//System.out.println(return);
 
  myApk.superMethod();
  
  ultraMethod();


}

 static void superMethod(){
System.out.println("This is super Methods....");
// return "Hyper Methods";
}

  static  void hyperMethod() {
 System.out.println("This is hyper Methods....");
}
 static void ultraMethod() {
System.out.println("This is ultra Methods....");
//return 234;
}

}


