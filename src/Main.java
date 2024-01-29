public class Main {
    public static void main(String[] args) {


        int ticketPrice = 36_342;
        int milesPerRuble = 20;

        int bonusMiles = ticketPrice / milesPerRuble;
        System.out.println("За покупку билета 'Владивосток' - 'Москва' вам начислено - " + bonusMiles + " - Бонусных миль");
    }
}