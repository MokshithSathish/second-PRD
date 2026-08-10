
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int again;

        do {
            System.out.println("\n========== CAMPUS TRACK ==========");

            // Student details
            System.out.print("Student ID: ");
            String id = sc.next();

            sc.nextLine();
            System.out.print("Full Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            while (age < 15 || age > 35) {
                System.out.print("Invalid. Enter age 15-35: ");
                age = sc.nextInt();
            }

            System.out.print("Email: ");
            String email = sc.next();

            // Course
            int choice;
            String course = "";
            double fee = 0;

            do {
                System.out.println("\n1.BCA  2.B.Sc CS  3.B.E/B.Tech  4.MCA  5.Other");
                System.out.print("Course choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        course = "BCA";
                        fee = 35000;
                        break;
                    case 2:
                        course = "B.Sc Computer Science";
                        fee = 30000;
                        break;
                    case 3:
                        course = "B.E/B.Tech";
                        fee = 50000;
                        break;
                    case 4:
                        course = "MCA";
                        fee = 45000;
                        break;
                    case 5:
                        course = "Other";
                        fee = 25000;
                        break;
                    default:
                        System.out.println("Invalid course.");
                }
            } while (choice < 1 || choice > 5);

            System.out.print("Semester (1-8): ");
            int semester = sc.nextInt();
            while (semester < 1 || semester > 8) {
                System.out.print("Invalid. Enter 1-8: ");
                semester = sc.nextInt();
            }

            sc.nextLine();
            System.out.print("Career Goal: ");
            String goal = sc.nextLine();

            // Marks
            System.out.println("\n----- MARKS -----");

            System.out.print("Java: ");
            int javaMarks = sc.nextInt();
            while (javaMarks < 0 || javaMarks > 100) {
                System.out.print("Invalid. Enter 0-100: ");
                javaMarks = sc.nextInt();
            }

            System.out.print("SQL: ");
            int sql = sc.nextInt();
            while (sql < 0 || sql > 100) {
                System.out.print("Invalid. Enter 0-100: ");
                sql = sc.nextInt();
            }

            System.out.print("Web Technology: ");
            int web = sc.nextInt();
            while (web < 0 || web > 100) {
                System.out.print("Invalid. Enter 0-100: ");
                web = sc.nextInt();
            }

            System.out.print("Aptitude: ");
            int aptitude = sc.nextInt();
            while (aptitude < 0 || aptitude > 100) {
                System.out.print("Invalid. Enter 0-100: ");
                aptitude = sc.nextInt();
            }

            System.out.print("Communication: ");
            int communication = sc.nextInt();
            while (communication < 0 || communication > 100) {
                System.out.print("Invalid. Enter 0-100: ");
                communication = sc.nextInt();
            }

            // Academic result
            int total = javaMarks + sql + web + aptitude + communication;
            double percentage = (double) total / 500 * 100;

            boolean academic
                    = javaMarks >= 35
                    && sql >= 35
                    && web >= 35
                    && aptitude >= 35
                    && communication >= 35
                    && percentage >= 40;

            String result = academic ? "PASSED" : "FAILED";
            String grade;

            if (!academic) {
                grade = "F";
            } else if (percentage >= 85) {
                grade = "A+";
            } else if (percentage >= 75) {
                grade = "A";
            } else if (percentage >= 65) {
                grade = "B";
            } else if (percentage >= 50) {
                grade = "C";
            } else {
                grade = "D";
            }

            // Attendance
            System.out.print("\nTotal classes: ");
            int classes = sc.nextInt();

            while (classes < 1 || classes > 300) {
                System.out.print("Invalid. Enter 1-300: ");
                classes = sc.nextInt();
            }

            System.out.print("Classes attended: ");
            int attended = sc.nextInt();

            while (attended < 0 || attended > classes) {
                System.out.print("Invalid. Enter 0-" + classes + ": ");
                attended = sc.nextInt();
            }

            double attendance = (double) attended / classes * 100;
            String attendanceStatus
                    = attendance >= 75 ? "REGULAR" : "SHORTAGE";

            // Assignments
            System.out.print("\nNumber of assignments (1-10): ");
            int n = sc.nextInt();

            while (n < 1 || n > 10) {
                System.out.print("Invalid. Enter 1-10: ");
                n = sc.nextInt();
            }

            int assignmentTotal = 0;
            int valid = 0;

            for (int i = 1; i <= n; i++) {

                System.out.print("Assignment " + i + " (-1 to finish): ");
                int score = sc.nextInt();

                if (score == -1) {
                    break;
                }

                if (score < 0 || score > 10) {
                    System.out.println("Invalid. Skipped.");
                    continue;
                }

                assignmentTotal += score;
                valid++;
            }

            double average = valid == 0
                    ? 0
                    : (double) assignmentTotal / valid;

            boolean assignment = valid > 0 && average >= 5;

            String assignmentStatus
                    = assignment ? "SATISFACTORY" : "NEEDS IMPROVEMENT";

            // Scholarship
            double scholarship;

            if (academic && percentage >= 85 && attendance >= 85) {
                scholarship = 10;
            } else if (academic && percentage >= 75 && attendance >= 75) {
                scholarship = 5;
            } else {
                scholarship = 0;
            }

            double scholarshipAmount = fee * scholarship / 100;
            double payable = fee - scholarshipAmount;

            // Fee
            System.out.printf("\nFinal payable fee: ₹%.2f%n", payable);

            System.out.print("Amount paid: ");
            double paid = sc.nextDouble();

            while (paid < 0 || paid > payable) {
                System.out.print("Invalid. Enter amount 0-" + payable + ": ");
                paid = sc.nextDouble();
            }

            double balance = payable - paid;
            String feeStatus = Math.abs(balance) < 0.01 ? "PAID" : "PENDING";

            // Final clearance
            boolean cleared
                    = academic
                    && attendance >= 75
                    && assignment
                    && Math.abs(balance) < 0.01;

            String finalStatus
                    = cleared
                            ? "CLEARED FOR NEXT SEMESTER"
                            : "ACTION REQUIRED";

            // Report
            System.out.println("\n========== STUDENT REPORT ==========");

            System.out.println("ID              : " + id);
            System.out.println("Name            : " + name);
            System.out.println("Age             : " + age);
            System.out.println("Email           : " + email);
            System.out.println("Course          : " + course);
            System.out.println("Semester        : " + semester);
            System.out.println("Career Goal     : " + goal);

            System.out.println("\n----- ACADEMIC -----");
            System.out.println("Java            : " + javaMarks);
            System.out.println("SQL             : " + sql);
            System.out.println("Web Technology  : " + web);
            System.out.println("Aptitude        : " + aptitude);
            System.out.println("Communication   : " + communication);
            System.out.println("Total           : " + total + "/500");
            System.out.printf("Percentage      : %.2f%%%n", percentage);
            System.out.println("Result          : " + result);
            System.out.println("Grade           : " + grade);

            System.out.println("\n----- ATTENDANCE -----");
            System.out.println("Attendance      : " + attended + "/" + classes);
            System.out.printf("Percentage      : %.2f%%%n", attendance);
            System.out.println("Status          : " + attendanceStatus);

            System.out.println("\n----- ASSIGNMENTS -----");
            System.out.println("Valid           : " + valid);
            System.out.println("Total           : " + assignmentTotal);
            System.out.printf("Average         : %.2f%n", average);
            System.out.println("Status          : " + assignmentStatus);

            System.out.println("\n----- FEES -----");
            System.out.printf("Base Fee        : ₹%.2f%n", fee);
            System.out.printf("Scholarship     : %.0f%%%n", scholarship);
            System.out.printf("Discount        : ₹%.2f%n", scholarshipAmount);
            System.out.printf("Payable         : ₹%.2f%n", payable);
            System.out.printf("Paid            : ₹%.2f%n", paid);
            System.out.printf("Balance         : ₹%.2f%n", balance);
            System.out.println("Fee Status      : " + feeStatus);

            System.out.println("\n----- FINAL STATUS -----");
            System.out.println("Clearance       : " + finalStatus);

            // Failed conditions
            System.out.println("\n----- FAILED CONDITIONS -----");

            boolean failure = false;

            if (javaMarks < 35) {
                System.out.println("- Java marks below 35");
                failure = true;
            }

            if (sql < 35) {
                System.out.println("- SQL marks below 35");
                failure = true;
            }

            if (web < 35) {
                System.out.println("- Web Technology marks below 35");
                failure = true;
            }

            if (aptitude < 35) {
                System.out.println("- Aptitude marks below 35");
                failure = true;
            }

            if (communication < 35) {
                System.out.println("- Communication marks below 35");
                failure = true;
            }

            if (percentage < 40) {
                System.out.println("- Percentage below 40%");
                failure = true;
            }

            if (attendance < 75) {
                System.out.println("- Attendance below 75%");
                failure = true;
            }

            if (valid == 0) {
                System.out.println("- No valid assignment");
                failure = true;
            } else if (average < 5) {
                System.out.println("- Assignment average below 5");
                failure = true;
            }

            if (balance > 0.01) {
                System.out.println("- Fee pending");
                failure = true;
            }

            if (!failure) {
                System.out.println("None");
            }

            // Recommendations
            System.out.println("\n----- RECOMMENDATIONS -----");

            if (javaMarks < 35 || sql < 35 || web < 35
                    || aptitude < 35 || communication < 35) {
                System.out.println("- Practice the failed subjects.");
            }

            if (percentage < 40) {
                System.out.println("- Improve overall academic performance.");
            }

            if (attendance < 75) {
                System.out.println("- Improve attendance.");
            }

            if (!assignment) {
                System.out.println("- Complete assignments regularly.");
            }

            if (balance > 0.01) {
                System.out.println("- Pay the pending fee.");
            }

            if (!failure) {
                System.out.println("- Maintain your current performance.");
            }

            // Another student
            System.out.println("\nProcess another student?");
            System.out.println("1. Yes");
            System.out.println("0. No");

            System.out.print("Choice: ");
            again = sc.nextInt();

            while (again != 0 && again != 1) {
                System.out.print("Enter only 1 or 0: ");
                again = sc.nextInt();
            }

        } while (again == 1);

        System.out.println("\nThank you for using CampusTrack.");

        sc.close();
    }
}
