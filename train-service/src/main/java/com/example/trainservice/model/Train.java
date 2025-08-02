package com.example.trainservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trains")
public class Train {

  @Id
  private Long id;

  private String name;

  private int totalSeats;

  public Train() {}

  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }

  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  public int getTotalSeats() { return totalSeats; }
  public void setTotalSeats(int totalSeats) { this.totalSeats = totalSeats; }
}