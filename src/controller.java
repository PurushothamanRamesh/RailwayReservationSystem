import java.util.Scanner;

public class controller{
    public static void Main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        boolean loop=true; //Initialization
        while(loop)
        {
            System.out.println("1. Book \n2. Cancel \n3. Available Tickets \n4. Booked Tickets \n5. Exit");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the Passenger Name:");
                    String name=sc.next();
                    System.out.println("Enter the Passenger Age:");
                    int age=sc.nextInt();
                    System.out.println("Enter the Passenger Gender: [M, F]");
                    String gender=sc.next();
                    if(gender.equals("F"))
                    {
                        System.out.println("1. If you have a child, Press 1 \n2. If you haven't a child, press 2");
                        int gchoice=sc.nextInt();
                        if(gchoice == 1)
                        {
                            System.out.println("Enter Your Child Name:");
                            String cname=sc.next();
                            System.out.println("Enter Your Child Age:");
                            int cage=sc.nextInt();
                            System.out.println("Enter the Passenger Berth Preference: [L, M, U]");
                            String bp=sc.next();
                            Passenger p = new Passenger(name, age, gender, cname, cage, bp);
                            Main.bookTicket(p);
                        }
                        else if(gchoice == 2)
                        {
                            System.out.println("Enter the Passenger Berth Preference: [L, M, U]");
                            String bp=sc.next();
                            String cname="null";
                            int cage=0;
                            Passenger p = new Passenger(name, age, gender, cname, cage, bp);
                            Main.bookTicket(p);
                        }
                    }
                    if(gender.equals("M"))
                    {
                        System.out.println("Enter the Passenger Berth Preference: [L, M, U]");
                        String bp=sc.next();
                        String cname="null";
                        int cage=0;
                        Passenger p = new Passenger(name, age, gender, cname, cage, bp);
                        Main.bookTicket(p);
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the Passenger ID:");
                    int id=sc.nextInt();
                    Main.cancelTicket(id);
                    break;
                }

                case 3:
                {
                    TicketBook tb = new TicketBook();
                    tb.availableTickets();
                    break;
                }
                case 4:
                {
                    TicketBook tb=new TicketBook();
                    tb.passengersDetail();
                    break;
                }
                case 5:
                {
                    loop=false;
                    break;
                }
            }
        }
    }
}