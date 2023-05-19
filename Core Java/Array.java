public class Array {
    public static void main(String[] args) {
        int a[]={1,23,4,5,6};
        System.out.println(a[0]);
        System.out.println(a[4]);
        
        String cars[][]={{"BMW","Ferrari"},{"Maruti","Suzuki"}};
        System.out.println(cars[0][1]);
        System.out.println(cars[0][0]);
        
        try{
            //Maruti
            System.out.println(cars[1][0]);
            // AIOOB
            System.out.println(cars[3][0]);
        }
        catch(Exception e){
            System.out.println("ArrayIndexOutOfBound");
        }

    }
}
