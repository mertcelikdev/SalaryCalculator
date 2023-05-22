package maashesaplama;

public class main {
    public static void main(String[] args) {


        employee worker1 = new employee("Ahmet" , 3000 , 60, 2010);
        employee worker2 = new employee("Mehmet" , 800, 30 ,1980 );

        System.out.println(worker1.toString());
        System.out.println("---------------------------");
        System.out.println(worker2.toString());



    }
}
