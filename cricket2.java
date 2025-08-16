import java.util.*;

class CricketPlayer {
    String name;
    int no_of_innings;
    int no_of_times_notout;
    int total_runs;
    double bat_avg;

    
    CricketPlayer(String name, int no_of_innings, int no_of_times_notout, int total_runs) {
        this.name = name;
        this.no_of_innings = no_of_innings;
        this.no_of_times_notout = no_of_times_notout;
        this.total_runs = total_runs;
        this.bat_avg = avg(this); // calculate at object creation
    }


    public static double avg(CricketPlayer p) {
        int dismissals = p.no_of_innings - p.no_of_times_notout;
        if (dismissals == 0) return p.total_runs;  // Avoid divide by zero
        return (double) p.total_runs / dismissals;
    }

    
    public static void sort(CricketPlayer[] players) {
        Arrays.sort(players, (a, b) -> Double.compare(b.bat_avg, a.bat_avg));
    }

    // Display player details
    public void display() {
        System.out.printf("%-15s %5d %10d %10d %10.2f\n",
                name, no_of_innings, no_of_times_notout, total_runs, bat_avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        CricketPlayer[] players = new CricketPlayer[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine(); 
            System.out.println("\nEnter details of player " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Number of innings: ");
            int innings = sc.nextInt();
            System.out.print("Number of times not out: ");
            int notout = sc.nextInt();
            System.out.print("Total runs: ");
            int runs = sc.nextInt();

            players[i] = new CricketPlayer(name, innings, notout, runs);
        }

        
        CricketPlayer.sort(players);

        
        System.out.println("\nPlayer Details (sorted by batting average):");
        System.out.printf("%-15s %5s %10s %10s %10s\n", "Name", "Inngs", "NotOut", "Runs", "Average");
        for (CricketPlayer p : players) {
            p.display();
        }

        sc.close();
    }
}
