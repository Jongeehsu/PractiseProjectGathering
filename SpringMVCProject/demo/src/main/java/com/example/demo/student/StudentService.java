package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Service
public class StudentService {

    public static List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "xx447xu@uwaterloo.ca",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21

                )
        );
    }
}
