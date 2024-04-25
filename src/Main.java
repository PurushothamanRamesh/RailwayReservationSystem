public class Main {
    public static void bookTicket(Passenger p) {
        TicketBook tb = new TicketBook();
//-----------------------------------------------------------------
        if (TicketBook.aWL == 0) {
            System.out.println("No Tickets Available");
            return;
        } else if (p.age > 60 && TicketBook.aLB > 0) {
            System.out.println("You're a Senior Citizen, so we arrange a Lower Berth");
            tb.bookTicket(p, (TicketBook.lBP.get(0)), "L");
            TicketBook.lBP.remove(0);
            TicketBook.aLB--;
        } else if (p.cname != ("null") && TicketBook.aLB > 0) {
            System.out.println("You Have a child, so we arrange the Lower Berth");
            tb.bookTicket(p, (TicketBook.lBP.get(0)), "L");
            TicketBook.lBP.remove(0);
            TicketBook.aLB--;
        }
//-------------------------BERTHS------------------------------------
        else if ((p.bp.equals("L") && TicketBook.aLB > 0) || (p.bp.equals("M") && TicketBook.aMB > 0) || (p.bp.equals("U") && TicketBook.aUB > 0)) {
            if (p.bp.equals("L")) {
                System.out.println("Lower Berth Given");
                tb.bookTicket(p, (TicketBook.lBP.get(0)), "L");
                TicketBook.lBP.remove(0);
                TicketBook.aLB--;
            } else if (p.bp.equals("M")) {
                System.out.println("Middle Berth Given");
                tb.bookTicket(p, (TicketBook.mBP.get(0)), "M");
                TicketBook.mBP.remove(0);
                TicketBook.aMB--;
            } else if (p.bp.equals("U")) {
                System.out.println("Upper Berth Given");
                tb.bookTicket(p, (TicketBook.uBP.get(0)), "U");
                TicketBook.uBP.remove(0);
                TicketBook.aUB--;
            }
        }
//---------------------------Available Tickets Given----------------
        else if (TicketBook.aLB > 0) {
            System.out.println("Lower Berth Given");
            tb.bookTicket(p, (TicketBook.lBP.get(0)), "L");
            TicketBook.lBP.remove(0);
            TicketBook.aLB--;
        } else if (TicketBook.aMB > 0) {
            System.out.println("Middle Berth Given");
            tb.bookTicket(p, (TicketBook.mBP.get(0)), "M");
            TicketBook.mBP.remove(0);
            TicketBook.aMB--;
        } else if (TicketBook.aUB > 0) {
            System.out.println("Upper Berth Given");
            tb.bookTicket(p, (TicketBook.uBP.get(0)), "U");
            TicketBook.uBP.remove(0);
            TicketBook.aUB--;
        } else if (TicketBook.aRAC > 0) {
            System.out.println("RAc Given");
            tb.racTicket(p, (TicketBook.racP.get(0)), "RAC");
            TicketBook.racP.remove(0);
            TicketBook.aRAC--;
        } else if (TicketBook.aWL > 0) {
            System.out.println("Waiting List Given");
            tb.wlTicket(p, (TicketBook.wlP.get(0)), "WL");
            TicketBook.wlP.remove(0);
            TicketBook.aWL--;
        }
    }
    //===================CANCEL TICKET========================================
    public static void cancelTicket(int id) {
        TicketBook tb = new TicketBook();
        if (!tb.passenger_stored_data.containsKey(id)) {
            System.out.println("Passenger ID is not found!");
        } else {
            tb.cancelTicket(id);

        }
    }
}