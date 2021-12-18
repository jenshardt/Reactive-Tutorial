package de.derSatan.tutorial.reactive.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = {"id", "dateOfBirth"})
@Document
public class Person {

  @Id 
  private String id;
  private String firstName;
  private String secondName;
  private LocalDateTime dateOfBirth;
  private String profession;
  private int salary;

  public Person(
      final String firstName,
      final String secondName,
      final LocalDateTime dateOfBirth,
      final String profession,
      final int salary) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.dateOfBirth = dateOfBirth;
    this.profession = profession;
    this.salary = salary;
  }
}