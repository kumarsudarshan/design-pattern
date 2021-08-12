package creational.pattern.prototype;


class PrototypeDemo {
    public static void main(String[] args) {
        int eid = 111;
        String ename = "Kumar";
        String edesignation = "Developer";
        String eaddress = "Bangalore";
        double esalary = 2600;

        EmployeeRecord e1 = new EmployeeRecord(eid, ename, edesignation, esalary, eaddress);

        e1.showRecord();
        System.out.println("\n");
        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
        e2.showRecord();
    }
}