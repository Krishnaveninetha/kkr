package basic;

public class Batch1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Student s1 = new Student();
s1.setName("raju");
s1.setRoll(100);
s1.setFees(122);
s1.setCollege("vjit");

Student s2 = new Student();
s2.setName("raju1");
s2.setRoll(1002);
s2.setCollege("vjit");

Student s3 = new Student();
s3.setName("raju1");
s3.setRoll(1020);
s3.setCollege("vjit");

System.out.println(s1.getName());
System.out.println(s1.getRoll());
System.out.println(s1.getFees());
System.out.println(s1.getCollege());

System.out.println(s2.getName());
System.out.println(s2.getRoll());
System.out.println(s2.getFees());
System.out.println(s2.getCollege());

System.out.println(s3.getName());
System.out.println(s3.getRoll());
System.out.println(s3.getFees());
System.out.println(s3.getCollege());


	}

}
