package application;

/*
Sabemos que existe uma plataforma muito famosa (respondeAí), que busca ajudar as pessoas estudantes que estão com
dificuldade em algumas matérias. Pensando em algo que possa representar essa plataforma, escreva pelo menos 2 classes
com propriedades e métodos que possa representar o modelo da plataforma! Atenção, use da melhor maneira a composição,
encapsulamento e as boas práticas que aprendeu em aula.
 */

import entities.Course;
import entities.RespondeAi;
import entities.Student;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Course> respondeAiCourses = new ArrayList<>();

        List<String> teachers = new ArrayList<>();
        teachers.add("Frank Rocha");

        List<Student> students = new ArrayList<>();
        List<Student> students2 = new ArrayList<>();

        List<Course> fulanoCourses = new ArrayList<>();
        List<Course> cicranoCourses = new ArrayList<>();
        List<Course> beltranoCourses = new ArrayList<>();
        List<Course> alexCourses = new ArrayList<>();

        students.add(new Student(1, "Fulano de tal", fulanoCourses));
        students.add(new Student(2, "Cicrano", cicranoCourses));
        students.add(new Student(3, "Beltrano", beltranoCourses));
        students2.add(new Student(4, "Alex", alexCourses));

        Course java = new Course(1, "Java Web", teachers, students);
        Course reactForLife = new Course(2, "Front-end com java", teachers, students2);

        fulanoCourses.add(java);
        cicranoCourses.add(java);
        beltranoCourses.add(java);
        alexCourses.add(reactForLife);
        respondeAiCourses.add(java);
        respondeAiCourses.add(reactForLife);

        RespondeAi platform = new RespondeAi(respondeAiCourses);

        System.out.println(platform);

        for(Course c : platform.getCourses()) {
            System.out.println(c);
        }
    }
}
