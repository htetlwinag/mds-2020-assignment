package prj;

public class array {

  public static void main(String[] args) {
 String[] studentNames = new String[10];
studentNames [0] = "Mi Thike Non";
studentNames [1] = "Ma Hnin Nandar aung";
studentNames [2] = "Nang May Mi Zhue";
studentNames [3] = "Ma Thae Nu San";
studentNames [4] = "Ma Phyo Ei San";
studentNames [5] = "Ma Khin Thu Thu Ko";
studentNames [6] = "Ma Phyo Zin Mar";
studentNames [7] = "Ma Hnin Ye Aye";
studentNames [8] = "Ma Lwin Nandar Oo";
studentNames [9] = "Mg Htet Lwin Aung";//complete yourself to assign 10 students name 
for(int i = 0; i < studentNames.length;i++) {
if(studentNames[i] == "Mg Htet Lwin Aung") {
System.out.println();
System.out.println("I'm"+studentNames[i]);
System.out.println();
System.out.println("and my  Index Number is : " + i);

}
}
}
}
  


