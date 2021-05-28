package B12_JavaCollection_Framework.ThucHanh.bai2;

import java.util.*;

public class AgeComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 o1, Student1 o2) {
        if (o1.getAge() > o2.getAge()){
            return 1;
        }
        else if (o1.getAge() == o2.getAge()){
            return 0;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Student1 student = new Student1("Kien", 30, "HT");
        Student1 student1 = new Student1("Nam", 26, "HN");
        Student1 student2 = new Student1("Anh", 38, "HT" );
        Student1 student3 = new Student1("Tung", 38, "HT" );

        List<Student1> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for (Student1 st : list){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list, ageComparator);
        System.out.println("So Sanh Theo Tuoi");

        for (Student1 st : list){
            System.out.println(st.toString());
        }
    }
}
