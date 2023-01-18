package entities;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private Integer id;
    private String name;

    private List<Course> registeredCourses = new ArrayList<>();

    public Student(Integer id, String name, List<Course> courses) {
        this.id = id;
        this.name = name;
        this.registeredCourses = courses;
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

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public void addCourse(Course course) {
        registeredCourses.add(course);
    }

    public void removeCourse(String removeByName, Course course) {
        for (Course c : registeredCourses) {
            if(c.getName() == removeByName) {
                registeredCourses.remove(registeredCourses.indexOf(removeByName));
                course.getStudents().remove(this);
            }
        }
    }
}
