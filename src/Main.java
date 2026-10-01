//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your id: ");
    int id = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Enter your Name: ");
    String name = scanner.nextLine();
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Enter your grade: ");
    int grade = scanner.nextInt();

    Student student = new Student(id, name, age, grade);

    while (true) {
        if (student.getAge() <= 0) {
            System.out.print("Enter your age correctly: ");
            int yeniAge = scanner.nextInt();
            student.setAge(yeniAge);
            continue;
        }

        if (student.getGrade() <= 0 || student.getGrade() > 11) {
            System.out.print("Enter your grade correctly: ");
            int yeniGrade = scanner.nextInt();
            student.setGrade(yeniGrade);
            continue;
        }

        System.out.println(student.toString());
        break;
    }




}
