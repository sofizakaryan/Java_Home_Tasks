void main() {
    Person p1 = new Person("Aram", 25);
    Person p2 = new Person("Bob", 55);

    System.out.println("Person 1:");
    System.out.println(p1.name + " " + p1.age);
    System.out.println("Person 2:");
    System.out.println(p2.name + " " + p2.age);

    MakingChanges.changeIdentities(p1, p2);

    System.out.println("Person 1 version 2:");
    System.out.println(p1.name + " " + p1.age);
    System.out.println("Person 2 version 2:");
    System.out.println(p2.name + " " + p2.age);
}
