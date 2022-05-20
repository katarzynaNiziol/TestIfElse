package FirstPackage;

public class Test_If_Else {
    public static void main(String[] args) {
        boolean areYouSleepy = true;
        int a = 6;
        int b = 16;
        if(!areYouSleepy){
            System.out.println("aaa");
        }
        else if(a + 10 < b) {
            System.out.println("go to sleep");
        }
        else{
            System.out.println("Koniec progamu. Do widzenia");
        }

    }
}
