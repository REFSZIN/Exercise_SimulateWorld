package entities;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private Integer id;
    private String name;
    private List<String> teachers = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public Course(Integer id, String name, List<String> teachers, List<Student> students) {
        this.id = id;
        this.name = name;
        this.teachers = teachers;
        this.students = students;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTeachers() {
        return teachers;
    }


    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Integer id) {
        for (Student s : students) {
            if(s.getId() == id) {
                students.remove(students.indexOf(s));
            }
        }
    }

    public void addTeacher(String name) {
        teachers.add(name);
    }

    public void removeTeacher(String removeByName) {
        for (String name : teachers) {
            if(name == removeByName) {
               teachers.remove(teachers.indexOf(removeByName));
            }
        }
    }

    public String teachersName(List<String> teachers) {
        String names = "";

        for(String s : teachers) {
            names += s + " ";
        }

        return names;
    }

    public String studentsName(List<Student> students) {
        String names = "";

        for(Student s : students) {
            names += s.getName() + " ";
        }

        return names;
    }

    @Override
    public String toString() {
        return getName() + "\n" +
                "Teachers: " + teachersName(teachers) + "\n" +
                "Students: " + studentsName(students) + "\n";
    }
}
