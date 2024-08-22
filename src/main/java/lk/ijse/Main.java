package lk.ijse;

import lk.ijse.Entity.Animal;
import lk.ijse.Entity.Student;
import lk.ijse.confit.FactoryConfiguration;
import lk.ijse.embded.FullName;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Student student = new Student();
        Animal animal = new Animal();

        FullName name = new FullName("aki","chan");
        student.setId(1);
        student.setName(name);
        student.setAge(20);
        student.setAddress("kegalle");

        //Transaction
        Transaction transaction = session.beginTransaction();

        //save
//        session.save(student);
//
//        //update
//        session.update(student);
//
//        //delete
//        session.delete(student);

        //get
        Student student1 = session.get(Student.class, 1);
        System.out.println(student1.getId() + ",    " + student1.getName().getFirstName() + " " + student1.getName().getLastName() + ",    " + student1.getAge() + ",    " + student1.getAddress());




        animal.setId(1);
        animal.setName("dog");

        //save
//        session.save(animal);
//
//        //update
//        session.update(animal);
//
//        //delete
//        session.delete(animal);


        //get
        Animal animal1 = session.get(Animal.class, 1);
        System.out.println(animal1.getId() +"  "+ animal1.getName());

        transaction.commit();
        session.close();



    }
}