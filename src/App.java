import java.net.NoRouteToHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.User;

/**
 * Главный класс приложения.
 */
public class App {
    /**
     * Главный метод main, запускающий приложение.
     * @param args аргументы командной строки.
     * @throws Exception возможные исключения.
     */
    public static void main(String[] args) throws Exception{
        /**
         * Создаем экземпляры класса Student
         */
        // User u1 = new User("Сергей","Иванов",25);
        Student s1 = new Student("Сергей", "Иванов", 19, "Краснодар",(long)102);
        Student s2 = new Student("Андрей", "Сидоров", 19, "Казань", (long)113);
        Student s3 = new Student("Иван", "Петров", 20, "Казань", (long)121);
        Student s4 = new Student("Игорь", "Иванов", 20, "Уфа", (long)111);
        Student s5 = new Student("Даша", "Цветкова", 20, "Назрань", (long)171);
        Student s6 = new Student("Лена", "Незабудкина", 21, "Сочи", (long)104);

        Student s11 = new Student("Виктор", "Петров ", 18, "Оренбург", 211);
        Student s12 = new Student("Аслан", "Бароев ", 20, "Оренбург", 203);
        Student s13 = new Student("Иван", "Ургант ", 20, "Саратов", 206);
        Student s14 = new Student("Роман", "Кучев ", 18, "Уфа", 207);
        Student s15 = new Student("Арман", "Уланов ", 19, "Новосибирск", 209);

        Student s21 = new Student("Ден", "Марков ", 20, "Сочи", 301);
        Student s22 = new Student("Лола", "Куцева ", 19, "Воронеж", 307);
        Student s23 = new Student("Степан", "Чугуев ", 18, "Можайск", 306);
        Student s24 = new Student("Маша", "Летова ", 18, "Одинцово", 309);
        Student s25 = new Student("Аня", "Новикова ", 18, "Сочи", 304);
        Student s26 = new Student("Елена", "Маркова ", 18, "Саратов", 323);
        Student s27 = new Student("Яна", "Цветаева ", 19, "Омск", 312);

        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(s5);
        listStud1.add(s6);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s11);
        listStud2.add(s12);
        listStud2.add(s13);
        listStud2.add(s14);
        listStud2.add(s15);

        List<Student> listStud3 = new ArrayList<Student>();

        listStud3.add(s21);
        listStud3.add(s22);
        listStud3.add(s23);
        listStud3.add(s24);
        listStud3.add(s25);
        listStud3.add(s26);
        listStud3.add(s27);

        /**
         * Создаем экземпляры класса StudentGroup
         */
        StudentGroup group1 = new StudentGroup(1, listStud1);
        StudentGroup group2 = new StudentGroup(2, listStud2);
        StudentGroup group3 = new StudentGroup(3, listStud3);

        /**
         * Создаем и заполняем коллекцию экземплярами класса StudentGroup
         */
        List<StudentGroup> listSteam = new ArrayList<StudentGroup>();
        listSteam.add(group1);
        listSteam.add(group2);
        listSteam.add(group3);

        /**
         * Создаем экземпляр класса StudentSteam
         */
        StudentSteam steam1 = new StudentSteam(1, listSteam);

        /**
         * С помощью цикла построчно выводим группы с не ортсотрированным списком студентов
         */
        for(StudentGroup group: steam1){
            System.out.printf("Группа %d\n", group.getNumOfGroup());
            for(Student stud : group){
                System.out.println(stud);
            }
        }

        System.out.println("---||-||-||-||-||-||-||-||---\n");
        
        /**
         * Сортируем группы студентов
         */
        Collections.sort(steam1.getGroups());
        Collections.sort(group1.getStudents());
        Collections.sort(group2.getStudents());
        Collections.sort(group3.getStudents());

        /**
         * С помощью цикла построчно выводим группы со списком студентов, отсортированые по колличеству студентов в группе
         */
        for(StudentGroup group: steam1){
            System.out.println(group);
        }

       /* StudentGroup group = new StudentGroup(listStud);

        for(Student stud : group)
        {
            System.out.println(stud);
        }

        System.out.println("============= после сортировки =============");
        Collections.sort(group.getStudents());


        for(Student stud : group)
        {
            System.out.println(stud);
        }



        //System.out.println(u1);
        //System.out.println(s1);
        //System.out.println(group);*/

        System.out.println("---||-||-||-||-||-||-||-||---\n");
        System.out.println(steam1);

    }
}