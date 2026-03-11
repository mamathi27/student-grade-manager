
void main() {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> marks = new ArrayList<>();
    int sum = 0;

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    System.out.println("please enter your name:");
    String name = scan.nextLine();
    System.out.println("WELCOME " + name + "!!");
while(true) {

    System.out.println("please select a option --");
    System.out.println("1.Add Student marks\n\n2.Show all marks\n\n3.Calculate average marks\n\n4.Find highest mark\n\n5.Find Lowest marks\n\n6.Exit");
    int choice = scan.nextInt();



    switch (choice) {
        case 1:
            System.out.println("enter the student mark:");

            marks.add(scan.nextInt());
            break;
        case 2:
            System.out.println(marks);
            break;
        case 3:
            for (int i : marks) {
                sum += i;

            }
            double avg = (double) sum / marks.size();
            System.out.println("average of marks:" + avg);
            break;
        case 4:
            for (int i : marks) {
                if (i > max) {
                    max = i;
                }
            }
            System.out.println("maximum mark:" + max);
            break;
        case 5:
            for (int i : marks) {
                if (i < min) {
                    min = i;
                }
            }
            System.out.println("minimum mark:" + min);
            break;
        case 6:
            System.out.println("thank you !!");
            return;
        default:
            System.out.println("invalid option!!");
            break;
    }
}

}
